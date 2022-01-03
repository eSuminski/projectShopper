import DAO.CustomerDAOImp;
import DAO.CustomerDAO;
import entities.Customer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerDAOTest {

    CustomerDAO customerDAO = new CustomerDAOImp();

    @Test
    void createCustomer(){
        Customer newCustomer = new Customer("Dearce",
                "javaris85", "password", 30018,0);
        Customer returnedCustomer = customerDAO.createCustomer(newCustomer);
        Assert.assertTrue(returnedCustomer.getCustomerId() != 0);
    }
}
