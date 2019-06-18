package com.example.milkworld;

public class DashboardDataModel {

    private int id;
    private int image;
    private String sub_category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSub_category() {
        return sub_category;
    }

    public void setSub_category(String sub_category) {
        this.sub_category = sub_category;
    }

    public DashboardDataModel(int id, int image, String sub_category){
        this.id=id;
        this.image=image;
        this.sub_category=sub_category;
    }

}