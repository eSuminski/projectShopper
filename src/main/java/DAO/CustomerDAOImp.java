package DAO;

import connectingtodatabase.ConnectionLink;
import entities.Customer;

import java.sql.*;

public class CustomerDAOImp implements CustomerDAO{
    @Override
    public Customer createCustomer(Customer customer) {
        try (Connection connection = ConnectionLink.createConnection()){
            String sql = "insert into customers values(default, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerUsername());
            preparedStatement.setString(3, customer.getCustomerPassword());
            preparedStatement.setInt(4, customer.getCustomerZipCode());
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            customer.setCustomerId(resultSet.getInt("customer_id"));
            return customer;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
