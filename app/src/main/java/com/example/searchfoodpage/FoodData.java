package com.example.searchfoodpage;

import java.util.ArrayList;

public class FoodData {
    private String food_writer="";
    private String food_title="";
    private String food_kind="";
    private String food_description="";
    private String food_image="";
    private String food_upload_date="";


    public FoodData(){};
    //private ArrayList<String> food_ingredient;
    //private ArrayList<String> food_making;

    public String getFood_writer() {
        return food_writer;
    }

    public void setFood_writer(String food_writer) {
        this.food_writer = food_writer;
    }

    public String getFood_title() {
        return food_title;
    }

    public void setFood_title(String food_title) {
        this.food_title = food_title;
    }

    public String getFood_kind() {
        return food_kind;
    }

    public void setFood_kind(String food_kind) {
        this.food_kind = food_kind;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    public String getFood_image() {
        return food_image;
    }

    public void setFood_image(String food_image) {
        this.food_image = food_image;
    }

    public String getFood_upload_data() {
        return food_upload_date;
    }

    public void setFood_upload_data(String food_upload_data) {
        this.food_upload_date = food_upload_data;
    }



    /*

    public ArrayList<String> getFood_ingredient() {
        return food_ingredient;
    }

    public void setFood_ingredient(ArrayList<String> food_ingredient) {
        this.food_ingredient = food_ingredient;
    }
    /*
    public ArrayList<String> getFood_making() {
        return food_making;
    }

    public void setFood_making(ArrayList<String> food_making) {
        this.food_making = food_making;
    }*/



}
