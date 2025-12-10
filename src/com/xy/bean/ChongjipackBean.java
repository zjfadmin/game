/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.XXGDBean
 */
package com.xy.bean;

import com.xy.bean.XXGDBean;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChongjipackBean {
    private String huitime;
    private Integer canpaymoney;
    private Integer getnumber;
    private String datetime;
    private String packgoods;
    private Integer id;
    private Point pointLvl;
    private Integer packgradetype;
    private String packname;
    private static final long serialVersionUID = 203745024714917095L;
    private String packgrade;
    private Integer packtype;

    public void setPointLvl(Point pointLvl) {
        this.pointLvl = pointLvl;
    }

    public Integer getCanpaymoney() {
        return this.canpaymoney;
    }

    public Integer getPackgradetype() {
        return this.packgradetype;
    }

    public void setPackgoods(String packgoods) {
        this.packgoods = packgoods;
    }

    public Integer getGetnumber() {
        return this.getnumber;
    }

    public static List<XXGDBean> getGoods(String goodses) {
        String[] IiiiiiiiIIIII = goodses.split("\\|");
        ArrayList<XXGDBean> IiiiiiiiIIIII2 = new ArrayList<XXGDBean>();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            XXGDBean IiiiiiiiIIIII4;
            String[] IiiiiiiiIIIII5;
            String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII[IiiiiiiiIIIII3].split("=")[1].split("&");
            if (IiiiiiiiIIIII6[0].equals("0")) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII6[1].split("\\$");
                XXGDBean xXGDBean = new XXGDBean();
                IiiiiiiiIIIII4.setId(new BigDecimal(IiiiiiiiIIIII5[0]));
                IiiiiiiiIIIII4.setSum(Integer.parseInt(IiiiiiiiIIIII5[1]));
                xXGDBean.setTag(Long.parseLong(IiiiiiiiIIIII5[2]));
                IiiiiiiiIIIII2.add(IiiiiiiiIIIII4);
            } else {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII6[1].split("\\$");
                IiiiiiiiIIIII4 = new XXGDBean();
                IiiiiiiiIIIII4.setId(new BigDecimal(IiiiiiiiIIIII5[0]));
                IiiiiiiiIIIII4.setSum(Integer.parseInt(IiiiiiiiIIIII5[1]));
                IiiiiiiiIIIII2.add(IiiiiiiiIIIII4);
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII2;
    }

    public String getPackgrade() {
        return this.packgrade;
    }

    public void setCanpaymoney(Integer canpaymoney) {
        this.canpaymoney = canpaymoney;
    }

    public Integer getId() {
        return this.id;
    }

    public void setHuitime(String huitime) {
        this.huitime = huitime;
    }

    public void setPackgradetype(Integer packgradetype) {
        this.packgradetype = packgradetype;
    }

    public void setPackname(String packname) {
        this.packname = packname;
    }

    public void setGetnumber(Integer getnumber) {
        this.getnumber = getnumber;
    }

    /*
     * WARNING - void declaration
     */
    public static List<XXGDBean> getGoodsImpactGrade(String goodses) {
        String[] IiiiiiiiIIIII = goodses.split("=");
        ArrayList<XXGDBean> IiiiiiiiIIIII2 = new ArrayList<XXGDBean>();
        String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[1].split("&");
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            void IiiiiiiiIIIII5;
            String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII3[IiiiiiiiIIIII4].split("\\$");
            XXGDBean xXGDBean = new XXGDBean();
            IiiiiiiiIIIII5.setId(new BigDecimal(IiiiiiiiIIIII6[0]));
            ++IiiiiiiiIIIII4;
            xXGDBean.setSum(Integer.parseInt(IiiiiiiiIIIII6[1]));
            IiiiiiiiIIIII2.add((XXGDBean)IiiiiiiiIIIII5);
        }
        return IiiiiiiiIIIII2;
    }

    public String toString() {
        return "ChongjipackBean [id=" + this.id + ", packtype=" + this.packtype + ", packgradetype=" + this.packgradetype + ", packgrade=" + this.packgrade + ", packgoods=" + this.packgoods + ", getnumber=" + this.getnumber + ", datetime=" + this.datetime + ", canpaymoney=" + this.canpaymoney + ", huitime=" + this.huitime + "]";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackgoods() {
        return this.packgoods;
    }

    public Integer getPacktype() {
        return this.packtype;
    }

    public void setPacktype(Integer packtype) {
        this.packtype = packtype;
    }

    public String getHuitime() {
        return this.huitime;
    }

    public void setPackgrade(String packgrade) {
        this.packgrade = packgrade;
    }

    public String getPackname() {
        return this.packname;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDatetime() {
        return this.datetime;
    }

    public Point getPointLvl() {
        return this.pointLvl;
    }
}
