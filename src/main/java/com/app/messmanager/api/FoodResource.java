package com.app.messmanager.api;

import com.app.messmanager.requests.FoodPriceRequest;
import com.app.messmanager.requests.FoodType;
import com.app.messmanager.response.FoodPriceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Contains API end points related to the food details.
 */

public interface FoodResource {

    public void  updateFoodPrice(FoodPriceRequest foodType);

    public FoodPriceResponse getFoodPrice();
}
