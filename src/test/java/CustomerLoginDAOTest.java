import DAO.CustomerLoginDAO;
import DAO.CustomerLoginDAOImp;
import entities.CustomerLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerLoginDAOTest {

    CustomerLoginDAO customerLoginDAO = new CustomerLoginDAOImp();

    @Test
    void validateCustomerLogin(){
        CustomerLogin customerLogin = customerLoginDAO.getLoginByCredentials("username", "password");
        Assert.assertEquals(customerLogin.getUsername(), "username");
        Assert.assertEquals(customerLogin.getPassword(),"password");
    }
}
