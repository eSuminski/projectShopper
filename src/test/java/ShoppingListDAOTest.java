import DAO.ShoppingListDAO;
import DAO.ShoppingListDAOImp;
import entities.ShoppingList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingListDAOTest {
    ShoppingListDAO shoppingListDAO = new ShoppingListDAOImp();

    @Test
    void createShoppingList(){
        ShoppingList newShoppingList = new ShoppingList(0,"Super Bowl Party", "I must have wings from Kroger","Ok",
                "In Process",1,1);
        ShoppingList returnedShoppingList = shoppingListDAO.createShoppingList(newShoppingList);
        Assert.assertTrue(returnedShoppingList.getShoppingListId() != 0);
    }
}
