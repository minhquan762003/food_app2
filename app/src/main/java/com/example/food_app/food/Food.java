package com.example.food_app.food;

public class Food {
    private int resoureId;
    private String name;
    private String price;

    public Food(int resoureId, String name, String price) {
        this.resoureId = resoureId;
        this.name = name;
        this.price = price;
    }


    public int getResoureId() {
        return resoureId;
    }

    public void setResoureId(int resoureId) {
        this.resoureId = resoureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
