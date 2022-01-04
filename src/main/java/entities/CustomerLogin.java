package entities;

import java.util.Objects;

public class CustomerLogin {
    private String username;
    private String password;
    private int loginId;
    private int customerId;

    public CustomerLogin() {}

    public CustomerLogin(String username, String password, int loginId, int customerId) {
        this.username = username;
        this.password = password;
        this.loginId = loginId;
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CustomerLogin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loginId=" + loginId +
                ", customerId=" + customerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerLogin that = (CustomerLogin) o;
        return loginId == that.loginId && customerId == that.customerId && Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, loginId, customerId);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

