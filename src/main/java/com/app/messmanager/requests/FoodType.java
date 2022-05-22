package com.app.messmanager.requests;

/**
 * Food type.
 */
public enum FoodType {
    BREAKFAST("BreakFast"),
    LUNCH("Lunch"),
    DINNER("Dinner");

    /**
     * Display name of the food type.
     */
    String displayName;

    /**
     * Parametrized constructor.
     * @param displayName display name of the food type.
     */
    FoodType(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gives the display name of the food type.
     * @param foodType type of the food.
     * @return display name of the food type.
     */
    public String getDisplayName(FoodType foodType) {
        return foodType.displayName;
    }
}
