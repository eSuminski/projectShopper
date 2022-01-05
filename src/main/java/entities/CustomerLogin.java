package entities;

import java.util.Objects;

public class CustomerLogin {
    private String customerName;
    private String customerUsername;
    private String customerPassword;
    private int customerZipCode;
    private int customerId;

    public CustomerLogin() {
    }

    public CustomerLogin(String customerName, String customerUsername, String customerPassword, int customerZipCode, int customerId) {
        this.customerName = customerName;
        this.customerUsername = customerUsername;
        this.customerPassword = customerPassword;
        this.customerZipCode = customerZipCode;
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CustomerLogin{" +
                "customerName='" + customerName + '\'' +
                ", customerUsername='" + customerUsername + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerZipCode=" + customerZipCode +
                ", customerId=" + customerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerLogin that = (CustomerLogin) o;
        return customerZipCode == that.customerZipCode && customerId == that.customerId && Objects.equals(customerName, that.customerName) && Objects.equals(customerUsername, that.customerUsername) && Objects.equals(customerPassword, that.customerPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerUsername, customerPassword, customerZipCode, customerId);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public int getCustomerZipCode() {
        return customerZipCode;
    }

    public void setCustomerZipCode(int customerZipCode) {
        this.customerZipCode = customerZipCode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}