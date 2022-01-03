package DAO;

import connectingtodatabase.ConnectionLink;
import entities.Shopper;

import java.sql.*;

public class ShopperDAOImp implements ShopperDAO {
    @Override
    public Shopper createShopper(Shopper shopper) {
        try (Connection connection = ConnectionLink.createConnection()){
            String sql = "insert into shoppers values(default, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, shopper.getShopperName());
            preparedStatement.setString(2, shopper.getShopperUsername());
            preparedStatement.setString(3, shopper.getShopperPassword());
            preparedStatement.setInt(4, shopper.getShopperZipCode());
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            shopper.setShopperId(resultSet.getInt("shopper_id"));
            return shopper;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
