/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.Coordinates
 *  com.xy.richtext.RichBeau
 */
package com.xy.richtext;

import com.xy.bean.Coordinates;
import com.xy.richtext.RichBeau;
import java.awt.Color;
import java.math.BigDecimal;

public class InputBean {
    private transient InputBean inputBean;
    private RichBeau richBeau;
    private transient boolean isM;
    private transient Color color2;
    private String name;
    private transient Integer s_x;
    private transient String text;
    private BigDecimal id;
    private transient Integer e_x;
    private Coordinates zb;
    private transient Integer height;
    private int type;
    private transient Integer s_y;
    private String color;
    private transient Integer index;
    private transient Integer e_y;

    public int getIndex() {
        return this.index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public InputBean(int type) {
        this.type = type;
    }

    public InputBean(int type, BigDecimal id, String name, Coordinates zb) {
        this(null, type, id, name, null, zb);
    }

    public void setInputBean(InputBean inputBean) {
        this.inputBean = inputBean;
    }

    public boolean isMonitor(int x, int y) {
        if (this.height == null) return false;
        if (this.inputBean != null && this.inputBean.height != null) {
            return this.isMonitor(x, y, Math.min(this.s_x, this.inputBean.s_x), Math.min(this.s_y, this.inputBean.s_y), Math.max(this.e_x, this.inputBean.e_x), Math.max(this.e_y, this.inputBean.e_y));
        }
        if (y < this.s_y) return false;
        if (y > this.e_y + this.height) return false;
        if (this.s_y.intValue() == this.e_y.intValue()) {
            if (x < this.s_x) return false;
            if (x > this.e_x) return false;
            return true;
        }
        if (y <= this.s_y + this.height) {
            if (x < this.e_x) return false;
            return true;
        }
        if (y < this.e_y) {
            return true;
        }
        if (x > this.e_x) return false;
        return true;
    }

    public InputBean() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIndex(int offset) {
        if (offset <= this.index) return false;
        if (this.index + this.name.length() <= offset) return false;
        return true;
    }

    public Color getColor2() {
        return this.color2;
    }

    public int getType() {
        return this.type;
    }

    public Integer getE_y() {
        return this.e_y;
    }

    public void setM(boolean isM) {
        this.setMonitor(isM);
        if (this.inputBean != null) {
            this.inputBean.setMonitor(isM);
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.richBeau != null ? this.richBeau.getUnits().length : 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            this.richBeau.getUnits()[IiiiiiiiIIIII++].setM(isM);
        }
    }

    public Integer getS_y() {
        return this.s_y;
    }

    public Coordinates getZb() {
        return this.zb;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public boolean isMonitor(int x, int y, int s_x, int s_y, int e_x, int e_y) {
        if (y < s_y) return false;
        if (y > e_y + this.height) return false;
        if (s_y == e_y) {
            if (x < s_x) return false;
            if (x > e_x) return false;
            return true;
        }
        if (y <= s_y + this.height) {
            if (x < e_x) return false;
            return true;
        }
        if (y < e_y) {
            return true;
        }
        if (x > e_x) return false;
        return true;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public InputBean(int type, BigDecimal id, String name, String color) {
        this(null, type, id, name, color, null);
    }

    public InputBean(int index, int type, BigDecimal id, String name, String color) {
        this(index, type, id, name, color, null);
    }

    public void setRichBeau(RichBeau richBeau) {
        this.richBeau = richBeau;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isM() {
        return this.isM;
    }

    public InputBean(Integer index, int type, BigDecimal id, String name, String color, Coordinates zb) {
        this.index = index;
        this.type = type;
        this.id = id;
        this.name = name;
        this.color = color;
        this.zb = zb;
    }

    public InputBean(int type, String name, Coordinates zb) {
        this(null, type, null, name, null, zb);
    }

    public InputBean getInputBean() {
        return this.inputBean;
    }

    public void setE_x(Integer e_x) {
        this.e_x = e_x;
    }

    public InputBean clone() {
        InputBean IiiiiiiiIIIII = new InputBean();
        IiiiiiiiIIIII.index = this.index;
        IiiiiiiiIIIII.type = this.type;
        IiiiiiiiIIIII.id = this.id;
        IiiiiiiiIIIII.name = this.name;
        IiiiiiiiIIIII.color = this.color;
        IiiiiiiiIIIII.zb = this.zb;
        IiiiiiiiIIIII.color2 = this.color2;
        return IiiiiiiiIIIII;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setS_y(Integer s_y) {
        this.s_y = s_y;
    }

    public void setMonitor(boolean isM) {
        this.isM = isM;
    }

    public Integer getE_x() {
        return this.e_x;
    }

    public String getText() {
        return this.text;
    }

    public String getName() {
        return this.name;
    }

    public void setS_x(Integer s_x) {
        this.s_x = s_x;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setE_y(Integer e_y) {
        this.e_y = e_y;
    }

    public void setZb(Coordinates zb) {
        this.zb = zb;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Integer getS_x() {
        return this.s_x;
    }

    public RichBeau getRichBeau() {
        return this.richBeau;
    }
}
