package DAO;
import connectingtodatabase.ConnectionLink;
import entities.ShopperLogin;

import java.sql.*;

public class ShopperLoginDAOImp implements ShopperLoginDAO{

    @Override
    public ShopperLogin getShopperLoginByCredentials(String username, String password) {
        try(Connection connection = ConnectionLink.createConnection()){
            String sql = "select * from shopperlogin where username= ? and password= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            ShopperLogin shopperLogin = new ShopperLogin();
            shopperLogin.setLoginId(resultSet.getInt("login_id"));
            shopperLogin.setUsername(resultSet.getString("username"));
            shopperLogin.setPassword(resultSet.getString("password"));
            shopperLogin.setShopperId(resultSet.getInt("shopper_id"));
            return shopperLogin;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
