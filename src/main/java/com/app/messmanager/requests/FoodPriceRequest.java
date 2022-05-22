package com.app.messmanager.requests;

import com.app.messmanager.response.FoodPriceResponse;

import java.util.Map;

/**
 * Request to update food price.
 */
public class FoodPriceRequest {
    /**
     * Map of food Type and price.
     */
    private Map<FoodType, Integer> foodTypePriceMap;

    public FoodPriceRequest(){

    }

    public FoodPriceRequest(Map<FoodType, Integer> foodTypePriceMap) {
        this.foodTypePriceMap = foodTypePriceMap;
    }

    public Map<FoodType, Integer> getFoodTypePriceMap() {
        return foodTypePriceMap;
    }

    public void setFoodTypePriceMap(Map<FoodType, Integer> foodTypePriceMap) {
        this.foodTypePriceMap = foodTypePriceMap;
    }

    @Override
    public String toString() {
        return "FoodPriceRequest{" +
                "foodTypePriceMap=" + foodTypePriceMap +
                '}';
    }
}
