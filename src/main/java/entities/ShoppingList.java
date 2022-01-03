package entities;

import java.util.Objects;

public class ShoppingList {
    private int shoppingListId;
    private String shoppingListName;
    private String consumerComment;
    private String shopperComment;
    private String listStatus;
    private int customerId;
    private int shopperId;

    public ShoppingList(){}

    public ShoppingList(int shoppingListId, String shoppingListName, String consumerComment, String shopperComment,
                        String listStatus, int customerId, int shopperId) {
        this.shoppingListId = shoppingListId;
        this.shoppingListName = shoppingListName;
        this.consumerComment = consumerComment;
        this.shopperComment = shopperComment;
        this.listStatus = listStatus;
        this.customerId = customerId;
        this.shopperId = shopperId;
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "shoppingListId=" + shoppingListId +
                ", shoppingListName='" + shoppingListName + '\'' +
                ", consumerComment='" + consumerComment + '\'' +
                ", shopperComment='" + shopperComment + '\'' +
                ", listStatus='" + listStatus + '\'' +
                ", customerId=" + customerId +
                ", shopperId=" + shopperId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingList that = (ShoppingList) o;
        return shoppingListId == that.shoppingListId && customerId == that.customerId && shopperId == that.shopperId && Objects.equals(shoppingListName, that.shoppingListName) && Objects.equals(consumerComment, that.consumerComment) && Objects.equals(shopperComment, that.shopperComment) && Objects.equals(listStatus, that.listStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoppingListId, shoppingListName, consumerComment, shopperComment, listStatus, customerId, shopperId);
    }

    public int getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(int shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getShoppingListName() {
        return shoppingListName;
    }

    public void setShoppingListName(String shoppingListName) {
        this.shoppingListName = shoppingListName;
    }

    public String getConsumerComment() {
        return consumerComment;
    }

    public void setConsumerComment(String consumerComment) {
        this.consumerComment = consumerComment;
    }

    public String getShopperComment() {
        return shopperComment;
    }

    public void setShopperComment(String shopperComment) {
        this.shopperComment = shopperComment;
    }

    public String getListStatus() {
        return listStatus;
    }

    public void setListStatus(String listStatus) {
        this.listStatus = listStatus;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getShopperId() {
        return shopperId;
    }

    public void setShopperId(int shopperId) {
        this.shopperId = shopperId;
    }
}
