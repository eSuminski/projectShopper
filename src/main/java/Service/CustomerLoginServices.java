package Service;

import entities.CustomerLogin;

public interface CustomerLoginServices {
    CustomerLogin getCustomerLoginServices(String username, String password);
}
