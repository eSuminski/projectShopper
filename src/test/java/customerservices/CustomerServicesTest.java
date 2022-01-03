package customerservices;

import DAO.CustomerDAO;
import DAO.CustomerDAOImp;
import Service.CustomerServices;
import Service.CustomerServicesImp;

public class CustomerServicesTest {

    static CustomerDAO customerDAO = new CustomerDAOImp();
    static CustomerServices customerServices = new CustomerServicesImp(customerDAO);


}
