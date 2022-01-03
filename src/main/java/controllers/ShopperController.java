package controllers;

import Service.ShopperServices;
import com.google.gson.Gson;
import entities.Shopper;
import io.javalin.http.Handler;

public class ShopperController {
    ShopperServices shopperServices;

    public ShopperController(ShopperServices shopperServices){
        this.shopperServices = shopperServices;
    }

    public Handler createShopper = ctx ->{
        Gson gson = new Gson();
        Shopper newShopper = gson.fromJson(ctx.body(), Shopper.class);
        Shopper createdShopper = this.shopperServices.createShopper(newShopper);
        String createdShopperJson = gson.toJson(createdShopper);
        ctx.result(createdShopperJson);
        ctx.status(201);
    };
}
