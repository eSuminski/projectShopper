package controllers;

import Service.ShopperLoginServices;
import com.google.gson.Gson;
import customException.InvalidLogin;
import entities.ShopperLogin;
import io.javalin.http.Handler;

import java.util.Map;

public class ShopperLoginController {
    ShopperLoginServices shopperLoginServices;

    public ShopperLoginController(ShopperLoginServices shopperLoginServices){
        this.shopperLoginServices = shopperLoginServices;
    }

    public Handler getShopperLoginByCredentials = ctx ->{

        try{
            Gson gson = new Gson();
            Map<String, String> credentials = gson.fromJson(ctx.body(), Map.class);
            ShopperLogin validateShopperLogin = this.shopperLoginServices.getShopperLoginServices(credentials.get("username"), credentials.get("password"));
            String validateLoginJson = gson.toJson(validateShopperLogin);
            ctx.result(validateLoginJson);
            ctx.status(200);

        } catch (InvalidLogin e){
            ctx.result(e.getMessage());
            ctx.status(404);
        }
    };
}
