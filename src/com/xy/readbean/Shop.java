/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

import java.math.BigDecimal;

public class Shop {
    private String shoptext;
    private String shopname;
    private String shopskin;
    private String shopid;
    private int shoptype;
    private long shopprice;
    private Boolean isPrice;
    private BigDecimal shopiid;

    public String getShopskin() {
        return this.shopskin;
    }

    public String getShopname() {
        return this.shopname;
    }

    public void setShopskin(String shopskin) {
        this.shopskin = shopskin;
    }

    public String getShoptext() {
        return this.shoptext;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public BigDecimal getShopiid() {
        return this.shopiid;
    }

    public void setShopiid(BigDecimal shopiid) {
        this.shopiid = shopiid;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public int getShoptype() {
        return this.shoptype;
    }

    public void setShopprice(long shopprice) {
        this.shopprice = shopprice;
    }

    public String getShopid() {
        return this.shopid;
    }

    public Boolean getIsPrice() {
        return this.isPrice;
    }

    public void setShoptext(String shoptext) {
        this.shoptext = shoptext;
    }

    public long getShopprice() {
        return this.shopprice;
    }

    public void setIsPrice(Boolean isPrice) {
        this.isPrice = isPrice;
    }

    public void setShoptype(int shoptype) {
        this.shoptype = shoptype;
    }
}
