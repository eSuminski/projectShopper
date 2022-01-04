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
        CustomerLogin customerLogin = customerLoginServices.getCustomerLoginServices("tester", "abc123");
        Assert.assertEquals(customerLogin.getUsername(), "tester");
        Assert.assertEquals(customerLogin.getPassword(),"abc123");

    }

}
