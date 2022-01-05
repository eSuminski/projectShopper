package DAO;

import connectingtodatabase.ConnectionLink;
import entities.CustomerLogin;

import java.sql.*;

public class CustomerLoginDAOImp implements CustomerLoginDAO {

    @Override
    public CustomerLogin getLoginByCredentials(String username, String password) {
        try (Connection connection = ConnectionLink.createConnection()){
            String sql = "select * from customers where customer_username= ? and customer_password= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            CustomerLogin customerLogin= new CustomerLogin();
            customerLogin.setCustomerZipCode(resultSet.getInt("customer_zipcode"));
            customerLogin.setCustomerName(resultSet.getString("customer_name"));
            customerLogin.setCustomerUsername(resultSet.getString("customer_username"));
            customerLogin.setCustomerPassword(resultSet.getString("customer_password"));
            customerLogin.setCustomerId(resultSet.getInt("customer_id"));
            return customerLogin;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
