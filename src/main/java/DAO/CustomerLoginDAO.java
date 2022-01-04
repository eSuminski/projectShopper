package DAO;

import entities.CustomerLogin;

public interface CustomerLoginDAO {
    CustomerLogin getLoginByCredentials(String username, String password);
}
