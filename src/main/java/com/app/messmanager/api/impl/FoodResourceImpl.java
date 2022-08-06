package com.app.messmanager.api.impl;

import com.app.messmanager.api.FoodCountResource;
import com.app.messmanager.api.FoodResource;
import com.app.messmanager.requests.FoodPriceRequest;
import com.app.messmanager.requests.FoodType;
import com.app.messmanager.response.FoodPriceResponse;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of food resource APIs.
 */
@RestController
@RequestMapping("/food")
public class FoodResourceImpl implements FoodResource {
    /**
     * Update the price of the food type.
     * @param foodType food  type
     */
    @PostMapping("/price")
    @Override
    public void updateFoodPrice(@RequestBody FoodPriceRequest foodType) {
        System.out.println("Food Price update request initiated" + foodType.getFoodTypePriceMap().toString());
    }

    /**
     * Get the price of the food.
     * @return the price for the food type.
     */
    @GetMapping("/price")
    @Override
    public FoodPriceResponse getFoodPrice() {
        System.out.println("Food Price get request initiated");
        Map sampleResponse = new HashMap<FoodType, Integer>();
        sampleResponse.put(FoodType.LUNCH,54);
       FoodPriceResponse response = new FoodPriceResponse(sampleResponse);
       response.setStatusMessage("Price retrieved successfully");
        return response;
    }
}
