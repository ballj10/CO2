package com.example.co2;

public class MenuItem {
    private String mMenuName;
    private int mHomeImage;

    public MenuItem(String MenuName, int HomeImage) {
        mMenuName = MenuName;
        mHomeImage = HomeImage;
    }

    public String getMenuName() {
        return mMenuName;
    }


    public int getHomeImage() {
        return mHomeImage;
    }
}
