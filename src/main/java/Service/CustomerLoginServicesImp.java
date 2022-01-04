package Service;

import DAO.CustomerLoginDAO;
import customException.InvalidLogin;
import entities.CustomerLogin;

public class CustomerLoginServicesImp implements CustomerLoginServices {
    CustomerLoginDAO customerLoginDAO;

    public CustomerLoginServicesImp(CustomerLoginDAO customerLoginDAO){
        this.customerLoginDAO = customerLoginDAO;
    }

    @Override
    public CustomerLogin getCustomerLoginServices(String username, String password) {
        try{
            return this.customerLoginDAO.getLoginByCredentials(username, password);
        }catch(InvalidLogin e){
            throw new InvalidLogin("Sorry credential invalid");
        }
    }

    // make a failed login test
}
