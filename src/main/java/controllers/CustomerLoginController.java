package controllers;

import Service.CustomerLoginServices;
import com.google.gson.Gson;
import customException.InvalidLogin;
import entities.CustomerLogin;
import io.javalin.http.Handler;
import java.util.Map;

public class CustomerLoginController {
    CustomerLoginServices customerLoginServices;

    public CustomerLoginController(CustomerLoginServices customerLoginServices){
        this.customerLoginServices = customerLoginServices;
    }

    public Handler getCustomerLoginByCredentials = ctx ->{

        try{
            Gson gson = new Gson();
            Map <String, String> credentials = gson.fromJson(ctx.body(), Map.class);
            CustomerLogin validateLogin = this.customerLoginServices.getCustomerLoginServices(credentials.get("username"), credentials.get("password"));
            String validateLoginJson = gson.toJson(validateLogin);
            ctx.result(validateLoginJson);
            ctx.status(200);

        } catch (InvalidLogin e){
            ctx.result(e.getMessage());
            ctx.status(404);
        }
    };
}
