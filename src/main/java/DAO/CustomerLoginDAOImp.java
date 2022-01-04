package DAO;

import connectingtodatabase.ConnectionLink;
import entities.CustomerLogin;

import java.sql.*;

public class CustomerLoginDAOImp implements CustomerLoginDAO {

    @Override
    public CustomerLogin getLoginByCredentials(String username, String password) {
        try (Connection connection = ConnectionLink.createConnection()){
            String sql = "select * from customerlogin where username= ? and password= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            CustomerLogin customerLogin= new CustomerLogin();
            customerLogin.setLoginId(resultSet.getInt("login_id"));
            customerLogin.setUsername(resultSet.getString("username"));
            customerLogin.setPassword(resultSet.getString("password"));
            customerLogin.setCustomerId(resultSet.getInt("customer_id"));
            return customerLogin;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
