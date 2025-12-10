/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.BaseFly
 *  com.xy.formula.GoodExchange
 *  com.xy.formula.GoodType
 *  com.xy.readbean.GoodFight
 *  com.xy.v.IiIiIiiiiiIiI
 */
package com.xy.readbean;

import com.xy.formula.BaseFly;
import com.xy.formula.GoodExchange;
import com.xy.formula.GoodType;
import com.xy.readbean.GoodFight;
import com.xy.v.IiIiIiiiiiIiI;
import java.math.BigDecimal;

public class Goodstable
implements Cloneable {
    private Integer qhv;
    private Long quality;
    private Long type;
    private String value;
    private int goodlock;
    private transient GoodFight fight;
    private String author;
    private BigDecimal goodsid;
    private Integer qht;
    private BigDecimal rgid;
    private String instruction;
    private BigDecimal role_id;
    private transient BaseFly baseFly;
    private String skin;
    private Integer usetime;
    private String goodsname;
    private transient GoodExchange[] exchanges;
    private Integer status;

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public GoodFight getFight() {
        if (this.fight != null) return this.fight;
        if (this.type != 2010L && this.type != 2011L) {
            if (this.type != 2012L) return this.fight;
        }
        this.fight = new GoodFight(this.value);
        return this.fight;
    }

    public void setQuality(Long quality) {
        this.quality = quality;
    }

    public void ALLATORIxDEMO(int i) {
        if (i == 0) {
            return;
        }
        this.setUsetime(this.getUsetime() - i);
        if (this.rgid == null) return;
        if (!GoodType.ALLATORIxDEMO((Long)this.getType())) return;
        this.rgid = new BigDecimal(this.rgid.longValue());
    }

    public void setGoodsid(BigDecimal goodsid) {
        this.goodsid = goodsid;
    }

    public void setValue(String value) {
        String string = this.value = value == null ? null : value.trim();
        if (this.fight != null) {
            this.fight = null;
        }
        if (this.baseFly == null) return;
        this.baseFly = null;
    }

    public void ALLATORIxDEMO(Goodstable good) {
        this.rgid = good.rgid;
        this.role_id = good.role_id;
        this.goodsid = good.goodsid;
        this.goodsname = good.goodsname;
        this.skin = good.skin;
        this.type = good.type;
        this.quality = good.quality;
        this.value = good.value;
        this.instruction = good.instruction;
        this.status = good.status;
        this.usetime = good.usetime;
        this.goodlock = good.goodlock;
    }

    public Goodstable(BigDecimal rgid, BigDecimal role_id, BigDecimal goodsid, String goodsname, String skin, Long type, Long quality, String value, String instruction, Integer status, Integer usetime) {
        this.rgid = rgid;
        this.role_id = role_id;
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.skin = skin;
        this.type = type;
        this.quality = quality;
        this.value = value;
        this.instruction = instruction;
        this.status = status;
        this.setUsetime(usetime);
    }

    public Integer getStatus() {
        if (this.status != null) return this.status;
        this.status = 0;
        return this.status;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSkin() {
        return this.skin;
    }

    public BigDecimal getGoodsid() {
        return this.goodsid;
    }

    public void setQht(Integer qht) {
        this.qht = qht;
    }

    public BigDecimal getRole_id() {
        return this.role_id;
    }

    public BigDecimal getRgid() {
        return this.rgid;
    }

    public Integer getQht() {
        return this.qht;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGoodsname() {
        return this.goodsname;
    }

    public String getValue() {
        return this.value;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public int getGoodlock() {
        return this.goodlock;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public Goodstable() {
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setRgid(BigDecimal rgid) {
        this.rgid = rgid;
    }

    public BaseFly getBaseFly() {
        if (this.baseFly != null) return this.baseFly;
        if (this.type != 8901L) return this.baseFly;
        this.baseFly = new BaseFly(this.value);
        return this.baseFly;
    }

    public Integer getQhv() {
        return this.qhv;
    }

    public Object clone() {
        Goodstable IiiiiiiiIIIII = null;
        try {
            IiiiiiiiIIIII = (Goodstable)super.clone();
            return IiiiiiiiIIIII;
        }
        catch (CloneNotSupportedException IiiiiiiiIIIII2) {
            IiiiiiiiIIIII2.printStackTrace();
            return IiiiiiiiIIIII;
        }
    }

    public void setGoodlock(int goodlock) {
        this.goodlock = goodlock;
    }

    public void setRole_id(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public void setQhv(Integer qhv) {
        this.qhv = qhv;
    }

    public GoodExchange[] getExchanges() {
        return this.exchanges;
    }

    public Integer getUsetime() {
        if (this.usetime != null) return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.usetime.intValue());
        this.setUsetime(1);
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.usetime.intValue());
    }

    public Long getQuality() {
        if (this.quality != null) return this.quality;
        this.quality = new Long(0L);
        return this.quality;
    }

    public void setUsetime(Integer usetime) {
        this.usetime = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)usetime.intValue());
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public void setValueTwo(String value) {
        this.value = value == null ? null : value.trim();
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Long getType() {
        if (this.type != null) return this.type;
        this.type = -1L;
        return this.type;
    }

    public void setExchanges(GoodExchange[] exchanges) {
        this.exchanges = exchanges;
    }
}
