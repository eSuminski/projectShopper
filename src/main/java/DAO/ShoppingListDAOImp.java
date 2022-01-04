package DAO;

import connectingtodatabase.ConnectionLink;
import entities.ShoppingList;

import java.sql.*;

public class ShoppingListDAOImp implements ShoppingListDAO {

    @Override
    public ShoppingList createShoppingList(ShoppingList shoppingList) {
        try (Connection connection = ConnectionLink.createConnection()){
            String sql = "insert into shopping_lists values(default, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, shoppingList.getShoppingListName());
            preparedStatement.setString(2, shoppingList.getConsumerComment());
            preparedStatement.setInt(3, shoppingList.getCustomerId());
            preparedStatement.setInt(4, shoppingList.getShopperId());
            preparedStatement.setString(5, shoppingList.getShopperComment());
            preparedStatement.setString(6, "Incomplete");
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            shoppingList.setShoppingListId(resultSet.getInt("shopping_list_id"));
            return shoppingList;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
