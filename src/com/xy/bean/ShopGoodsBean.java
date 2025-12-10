/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Shop
 */
package com.xy.bean;

import com.xy.readbean.Shop;
import java.util.List;

public class ShopGoodsBean {
    private List<Shop> shopList;
    private int type;
    private Integer nId;

    public void setType(int type) {
        this.type = type;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public int getType() {
        return this.type;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }

    public Integer getnId() {
        return this.nId;
    }

    public List<Shop> getShopList() {
        return this.shopList;
    }
}
