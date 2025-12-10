/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.QuackGameBean
 *  com.xy.bean.UseCardBean
 *  com.xy.entity.Baby
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.Pal
 *  com.xy.entity.PartJade
 *  com.xy.entity.RoleSummoning
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IiIiIiiiiiIiI
 */
package com.xy.bean;

import com.xy.bean.QuackGameBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.Pal;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.v.IiIiIiiiiiIiI;
import java.util.List;

public class AssetUpdate {
    private String data;
    public static int INTEGRATION;
    private List<PartJade> jades;
    public static int USERGOOD;
    public static int MALL;
    private long I;
    private String sceneMsg;
    private String task;
    private String resistance;
    public static int GIVE;
    private QuackGameBean gameBean;
    private String msg;
    private List<Mount> mounts;
    public static int STALLBUY;
    public static int STALLGET;
    private List<Pal> pals;
    private List<RoleSummoning> pets;
    private String activity;
    private String vip;
    private List<Lingbao> lingbaos;
    private List<Goodstable> goods;
    public static int DEAL;
    public static int STALLRET;
    private int type;
    private List<Baby> babys;
    public static int NPC;
    private UseCardBean useCard;

    public String getData() {
        return this.data;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getSceneMsg() {
        return this.sceneMsg;
    }

    public String getResistance() {
        return this.resistance;
    }

    public void setLingbaos(List<Lingbao> lingbaos) {
        this.lingbaos = lingbaos;
    }

    public String ALLATORIxDEMO() {
        StringBuffer IiiiiiiiIIIII = null;
        switch (this.type) {
            case 0: 
            case 1: 
            case 2: {
                if (this.msg == null) return null;
                if (this.msg.length() == 0) {
                    return null;
                }
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("\u83b7\u5f97\u4e86");
                IiiiiiiiIIIII.append(this.msg);
                return IiiiiiiiIIIII.toString();
            }
            case 3: {
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("\u4f60\u6536\u5230\u522b\u4eba\u9001\u7ed9\u4f60\u7684");
                if (this.msg != null) {
                    IiiiiiiiIIIII.append(this.msg);
                }
                if (this.data == null) return IiiiiiiiIIIII.toString();
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append(",");
                }
                String[] IiiiiiiiIIIII2 = this.data.split("\\|");
                int IiiiiiiiIIIII3 = 0;
                while (true) {
                    if (IiiiiiiiIIIII3 >= IiiiiiiiIIIII2.length) {
                        return IiiiiiiiIIIII.toString();
                    }
                    if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].startsWith("D")) {
                        IiiiiiiiIIIII.append("\u91d1\u94b1");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                    }
                    ++IiiiiiiiIIIII3;
                }
            }
            case 5: {
                if (this.data == null) {
                    return null;
                }
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("\u82b1\u8d39\u4e86");
                String[] IiiiiiiiIIIII4 = this.data.split("\\|");
                int IiiiiiiiIIIII5 = 0;
                while (true) {
                    if (IiiiiiiiIIIII5 >= IiiiiiiiIIIII4.length) {
                        IiiiiiiiIIIII.append("\u8d2d\u4e70\u4e86");
                        IiiiiiiiIIIII.append(this.msg);
                        return IiiiiiiiIIIII.toString();
                    }
                    if (IiiiiiiiIIIII4[IiiiiiiiIIIII5].startsWith("D")) {
                        IiiiiiiiIIIII4[IiiiiiiiIIIII5] = IiiiiiiiIIIII4[IiiiiiiiIIIII5].split("=")[1];
                        IiiiiiiiIIIII.append("#G");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII4[IiiiiiiiIIIII5].startsWith("-") ? IiiiiiiiIIIII4[IiiiiiiiIIIII5].substring(1) : IiiiiiiiIIIII4[IiiiiiiiIIIII5]);
                        IiiiiiiiIIIII.append("#Y\u91d1\u94b1");
                    }
                    ++IiiiiiiiIIIII5;
                }
            }
            case 6: {
                if (this.data == null) {
                    return null;
                }
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("\u4f60\u552e\u51fa");
                IiiiiiiiIIIII.append(this.msg);
                IiiiiiiiIIIII.append("\u83b7\u5f97\u4e86");
                String[] IiiiiiiiIIIII6 = this.data.split("\\|");
                int IiiiiiiiIIIII7 = 0;
                while (true) {
                    if (IiiiiiiiIIIII7 >= IiiiiiiiIIIII6.length) {
                        return IiiiiiiiIIIII.toString();
                    }
                    if (IiiiiiiiIIIII6[IiiiiiiiIIIII7].startsWith("D")) {
                        IiiiiiiiIIIII6[IiiiiiiiIIIII7] = IiiiiiiiIIIII6[IiiiiiiiIIIII7].split("=")[1];
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII6[IiiiiiiiIIIII7].startsWith("-") ? IiiiiiiiIIIII6[IiiiiiiiIIIII7].substring(1) : IiiiiiiiIIIII6[IiiiiiiiIIIII7]);
                        IiiiiiiiIIIII.append("\u91d1\u94b1");
                    }
                    ++IiiiiiiiIIIII7;
                }
            }
            case 8: {
                if (this.data == null) {
                    return null;
                }
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("\u83b7\u5f97\u4e86");
                String[] IiiiiiiiIIIII8 = this.data.split("\\|");
                int IiiiiiiiIIIII9 = 0;
                while (true) {
                    if (IiiiiiiiIIIII9 >= IiiiiiiiIIIII8.length) {
                        return IiiiiiiiIIIII.toString();
                    }
                    if (IiiiiiiiIIIII8[IiiiiiiiIIIII9].startsWith("D=")) {
                        IiiiiiiiIIIII.append("#G");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(2));
                        IiiiiiiiIIIII.append("#Y\u91d1\u94b1");
                    } else if (IiiiiiiiIIIII8[IiiiiiiiIIIII9].startsWith("X=")) {
                        IiiiiiiiIIIII.append("#G");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(2));
                        IiiiiiiiIIIII.append("#Y\u4ed9\u7389");
                    } else if (IiiiiiiiIIIII8[IiiiiiiiIIIII9].startsWith("S=")) {
                        IiiiiiiiIIIII.append("#G");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(2));
                        IiiiiiiiIIIII.append("#Y\u7ed1\u7389");
                    } else if (IiiiiiiiIIIII8[IiiiiiiiIIIII9].startsWith("C=")) {
                        IiiiiiiiIIIII.append("#G");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(2));
                        IiiiiiiiIIIII.append("#Y\u5145\u503c\u79ef\u5206");
                    } else if (IiiiiiiiIIIII8[IiiiiiiiIIIII9].startsWith("B=")) {
                        IiiiiiiiIIIII.append("#G");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(2));
                        IiiiiiiiIIIII.append("\u5e2e\u8d21");
                    }
                    ++IiiiiiiiIIIII9;
                }
            }
            case 11: {
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("\u4f60\u53d6\u56de\u4e86");
                IiiiiiiiIIIII.append(this.msg);
                return IiiiiiiiIIIII.toString();
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                return this.msg;
            }
        }
        return null;
    }

    public String getVip() {
        return this.vip;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setSceneMsg(String sceneMsg) {
        this.sceneMsg = sceneMsg;
    }

    public List<Lingbao> getLingbaos() {
        return this.lingbaos;
    }

    public String getActivity() {
        return this.activity;
    }

    public void setGoods(List<Goodstable> goods) {
        this.goods = goods;
    }

    public List<Goodstable> getGoods() {
        return this.goods;
    }

    public void setData(String data) {
        this.data = data;
    }

    public QuackGameBean getGameBean() {
        return this.gameBean;
    }

    public void setBabys(List<Baby> babys) {
        this.babys = babys;
    }

    public void setJades(List<PartJade> jades) {
        this.jades = jades;
    }

    static {
        NPC = 0;
        MALL = 1;
        INTEGRATION = 2;
        GIVE = 3;
        DEAL = 4;
        STALLBUY = 5;
        STALLGET = 6;
        STALLRET = 7;
        USERGOOD = 8;
    }

    public List<RoleSummoning> getPets() {
        return this.pets;
    }

    public void setI(long i) {
        this.I = IiIiIiiiiiIiI.ALLATORIxDEMO((long)i);
    }

    public List<Baby> getBabys() {
        return this.babys;
    }

    public UseCardBean getUseCard() {
        return this.useCard;
    }

    public List<Mount> getMounts() {
        return this.mounts;
    }

    public long getI() {
        return IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.I);
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }

    public void setUseCard(UseCardBean useCard) {
        this.useCard = useCard;
    }

    public List<PartJade> getJades() {
        return this.jades;
    }

    public String getTask() {
        return this.task;
    }

    public void setPets(List<RoleSummoning> pets) {
        this.pets = pets;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public List<Pal> getPals() {
        return this.pals;
    }

    public void setGameBean(QuackGameBean gameBean) {
        this.gameBean = gameBean;
    }

    public void setPals(List<Pal> pals) {
        this.pals = pals;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public int getType() {
        return this.type;
    }
}
