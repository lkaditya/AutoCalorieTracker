package sg.edu.iss.app.model;

public class FoodInfo {
    private String foodImage;
    private String foodName;
    private String foodCalories;

    public FoodInfo(String foodImage, String foodName, String foodCalories) {
        this.foodImage = foodImage;
        this.foodName = foodName;
        this.foodCalories = foodCalories;
    }


    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodCalories() {
        return foodCalories;
    }

    public void setFoodCalories(String foodCalories) {
        this.foodCalories = foodCalories;
    }


    public FoodInfo() {
    }
}
