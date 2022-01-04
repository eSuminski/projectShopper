package entities;

import java.util.Objects;

public class ShopperLogin {
    private String username;
    private String password;
    private int shopperId;
    private int loginId;

    public ShopperLogin(){};

    public ShopperLogin(String username, String password, int shopperId, int loginId) {
        this.username = username;
        this.password = password;
        this.shopperId = shopperId;
        this.loginId = loginId;
    }

    @Override
    public String toString() {
        return "ShopperLogin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", shopperId=" + shopperId +
                ", loginId=" + loginId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopperLogin that = (ShopperLogin) o;
        return shopperId == that.shopperId && loginId == that.loginId && Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, shopperId, loginId);
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

    public int getShopperId() {
        return shopperId;
    }

    public void setShopperId(int shopperId) {
        this.shopperId = shopperId;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }
}
