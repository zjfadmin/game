/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseSkillData
 *  com.xy.formula.GoodType
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.RoleTxBean
 *  com.xy.readbean.Shop
 *  com.xy.readbean.Skill
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.w;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseSkillData;
import com.xy.formula.GoodType;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.Shop;
import com.xy.readbean.Skill;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Image;
import java.math.BigDecimal;

public class IiIiIiiiiIIiI {
    public static final byte iIiiIiiiIiIIi = 12;
    public Object iiiiIiiiIIiii;
    public String iIIiIiiiiiiIi;
    public static final byte IIIIiiiiiiiII = 8;
    public BigDecimal iiIIIiiiiiiiI;
    public static final byte IiIiiiiiIIIII = 2;
    public static final byte iiIiIiiiiIIIi = 4;
    public static final byte iiiiIiiiIiiII = 6;
    public static final byte iiiIiiiiiiiIi = 3;
    public static final byte iIiiIiiiiiiII = 7;
    public static final byte IIiiIiiiIIiIi = 11;
    public byte iIiIiiiiIiIii;
    public static final byte IiIIIiiiiIiiI = 5;
    public static final byte iiIiiiiiiiIii = 0;
    public static final byte IiiiiiiiIIIII = 1;
    public Image ALLATORIxDEMO;

    public void ALLATORIxDEMO(Goodstable goodTable, IiiiiiiiiIIII objectArea) {
        if (goodTable == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIiIii = 1;
        this.iiIIIiiiiiiiI = goodTable.getRgid();
        this.ALLATORIxDEMO = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)goodTable.getBaseFly().getSkinGood(objectArea));
        this.iIIiIiiiiiiIi = GoodType.ALLATORIxDEMO((Long)goodTable.getType()) ? "" + goodTable.getUsetime() : null;
    }

    public void ALLATORIxDEMO(Shop shop) {
        if (shop == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIiIii = (byte)3;
        this.iiIIIiiiiiiiI = new BigDecimal(shop.getShopid());
        this.ALLATORIxDEMO = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)shop.getShopskin());
        this.iiiiIiiiIIiii = shop;
    }

    public void ALLATORIxDEMO(byte type, Skill skill, int state) {
        if (skill == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIiIii = type;
        this.iiIIIiiiiiiiI = new BigDecimal(skill.getSkillid());
        this.ALLATORIxDEMO = IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)skill.getSkillid());
        this.iiiiIiiiIIiii = state;
    }

    public void ALLATORIxDEMO(RoleTxBean roleTxBean) {
        if (roleTxBean == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIiIii = (byte)7;
        this.iiIIIiiiiiiiI = new BigDecimal(roleTxBean.getGid());
        this.ALLATORIxDEMO = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)("tx" + roleTxBean.getRdId()));
    }

    public void ALLATORIxDEMO() {
        this.iIiIiiiiIiIii = 0;
        this.iiIIIiiiiiiiI = null;
        this.ALLATORIxDEMO = null;
        this.iIIiIiiiiiiIi = null;
        this.iiiiIiiiIIiii = null;
    }

    public void ALLATORIxDEMO(BaseSkillData skillData) {
        if (skillData == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIiIii = (byte)2;
        this.iiIIIiiiiiiiI = new BigDecimal(skillData.getSkill().getSkillid());
        if (this.iiIIIiiiiiiiI.longValue() > 12000L && this.iiIIIiiiiiiiI.longValue() <= 13000L) {
            this.ALLATORIxDEMO = IIiIiiiiIiiIi.iIiIiiiiIIiIi((int)this.iiIIIiiiiiiiI.intValue());
            return;
        }
        this.ALLATORIxDEMO = IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)skillData.getSkill().getSkillid());
    }

    public void ALLATORIxDEMO(Goodstable goodTable) {
        this.ALLATORIxDEMO((byte)1, goodTable, (int)goodTable.getUsetime());
    }

    public void ALLATORIxDEMO(byte type, Goodstable goodTable, int num) {
        if (goodTable == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIiIii = type;
        this.iiIIIiiiiiiiI = goodTable.getRgid();
        this.ALLATORIxDEMO = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)goodTable.getSkin());
        this.iIIiIiiiiiiIi = GoodType.ALLATORIxDEMO((Long)goodTable.getType()) ? String.valueOf(num) : null;
    }

    public void ALLATORIxDEMO(RoleSummoning pet) {
        if (pet == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIiIii = (byte)8;
        this.iiIIIiiiiiiiI = pet.getSid();
        this.ALLATORIxDEMO = IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)("p" + pet.getSummoningskin()));
    }

    public void ALLATORIxDEMO(Lingbao lingbao) {
        if (lingbao == null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIiIii = (byte)(lingbao.getBaotype().equals("\u6cd5\u5b9d") ? 6 : 5);
        this.iiIIIiiiiiiiI = lingbao.getBaoid();
        this.ALLATORIxDEMO = IIiIiiiiIiiIi.IIIIIiiiiIIii((String)lingbao.getSkin());
    }
}
