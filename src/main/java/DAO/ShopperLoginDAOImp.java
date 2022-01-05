package DAO;
import connectingtodatabase.ConnectionLink;
import entities.ShopperLogin;

import java.sql.*;

public class ShopperLoginDAOImp implements ShopperLoginDAO{

    @Override
    public ShopperLogin getShopperLoginByCredentials(String username, String password) {
        try(Connection connection = ConnectionLink.createConnection()){
            String sql = "select * from shoppers where shopper_username= ? and shopper_password= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            ShopperLogin shopperLogin = new ShopperLogin();
            shopperLogin.setShopperZipCode(resultSet.getInt("shopper_zipcode"));
            shopperLogin.setShopperName(resultSet.getString("shopper_name"));
            shopperLogin.setShopperUsername(resultSet.getString("shopper_username"));
            shopperLogin.setShopperPassword(resultSet.getString("shopper_password"));
            shopperLogin.setShopperId(resultSet.getInt("shopper_id"));
            return shopperLogin;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
