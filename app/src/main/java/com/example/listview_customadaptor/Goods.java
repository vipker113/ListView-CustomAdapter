package com.example.listview_customadaptor;

public class Goods {
    private String name;
    private String shopNames;
    private int imageGoods;

    public Goods(String name, String shopNames, int imageGoods) {
        this.name = name;
        this.shopNames = shopNames;
        this.imageGoods = imageGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopNames() {
        return shopNames;
    }

    public void setShopNames(String shopNames) {
        this.shopNames = shopNames;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }
}
