package com.app.messmanager.response;

import com.app.messmanager.requests.FoodType;

import java.util.Map;

/**
 * Request to update food price.
 */
public class FoodPriceResponse extends Response {
    /**
     * Map of food Type and price.
     */
    private Map<FoodType, Integer> foodTypePriceMap;

    public FoodPriceResponse() {
    }

    public FoodPriceResponse(Map<FoodType, Integer> foodTypePriceMap) {
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
        return "FoodPriceResponse{" +
                "foodTypePriceMap=" + foodTypePriceMap +
                '}';
    }
}
