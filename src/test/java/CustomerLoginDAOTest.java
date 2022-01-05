import DAO.CustomerLoginDAO;
import DAO.CustomerLoginDAOImp;
import entities.CustomerLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerLoginDAOTest {

    CustomerLoginDAO customerLoginDAO = new CustomerLoginDAOImp();

    @Test
    void validateCustomerLogin(){
        CustomerLogin customerLogin = customerLoginDAO.getLoginByCredentials("javaris85", "password");
        Assert.assertEquals(customerLogin.getCustomerUsername(), "javaris85");
        Assert.assertEquals(customerLogin.getCustomerPassword(),"password");
    }
}
