package serviceTest;

import DAO.CustomerLoginDAO;
import DAO.CustomerLoginDAOImp;
import Service.CustomerLoginServices;
import Service.CustomerLoginServicesImp;
import customException.InvalidLogin;
import entities.CustomerLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerLoginServiceTest {
    static CustomerLoginDAO customerLoginDAO = new CustomerLoginDAOImp();
    static CustomerLoginServices customerLoginServices = new CustomerLoginServicesImp(customerLoginDAO);

    @Test
    void validateCustomerLogin(){
        CustomerLogin customerLogin = customerLoginServices.getCustomerLoginServices("javaris85", "password");
        Assert.assertEquals(customerLogin.getCustomerUsername(), "javaris85");
        Assert.assertEquals(customerLogin.getCustomerPassword(),"password");

    }

}
