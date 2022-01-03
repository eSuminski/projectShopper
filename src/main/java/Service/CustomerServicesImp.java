package Service;

import DAO.CustomerDAO;
import entities.Customer;

public class CustomerServicesImp implements CustomerServices{

    CustomerDAO customerDAO;
    public CustomerServicesImp(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return this.customerDAO.createCustomer(customer);
    }
}
