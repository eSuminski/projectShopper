package controllers;

import Service.CustomerServices;
import com.google.gson.Gson;
import entities.Customer;
import io.javalin.http.Handler;

public class CustomerController {
    CustomerServices customerServices;

    public  CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    public Handler createCustomer = ctx ->{
        Gson gson = new Gson();
        Customer newCustomer = gson.fromJson(ctx.body(), Customer.class);
        Customer createdCustomer = this.customerServices.createCustomer(newCustomer);
        String createdCustomerJson = gson.toJson(createdCustomer);
        ctx.result(createdCustomerJson);
        ctx.status(201);
    };
}
