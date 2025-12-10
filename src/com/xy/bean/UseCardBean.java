/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 *  com.xy.formula.BaseQl
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiIiiiiIiii
 */
package com.xy.bean;

import com.xy.bean.BeauBean;
import com.xy.formula.BaseQl;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiIiiiiIiii;
import java.util.ArrayList;
import java.util.List;

public class UseCardBean {
    private String name;
    private String value;
    private transient List<iiIiIiiiiIiii> keys;
    private long time;
    private String skin;
    private String type;
    private transient BaseQl[] qls;
    private String lCard;
    private transient BeauBean beauBean;

    public void setValue(String value) {
        this.value = value;
        this.qls = null;
        this.keys = null;
    }

    public Double getQlKey(String key) {
        this.getQls();
        if (this.qls == null) {
            return null;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.qls.length) {
            if (this.qls[IiiiiiiiIIIII] != null && this.qls[IiiiiiiiIIIII].getKey().equals(key)) {
                return this.qls[IiiiiiiiIIIII].getValue();
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public UseCardBean() {
    }

    public void setlCard(String lCard) {
        this.lCard = lCard;
    }

    public long getTime() {
        return this.time;
    }

    public String getValue() {
        if (this.value != null) return this.value;
        return "";
    }

    public void setName(String name) {
        this.name = name;
        this.beauBean = null;
    }

    public List<iiIiIiiiiIiii> getKeysByActivity() {
        if (this.keys != null) return this.keys;
        this.keys = new ArrayList<iiIiIiiiiIiii>(1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)this.value));
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII3 < this.value.length()) {
            IiiiiiiiIIIII3 = this.value.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = this.value.length();
            }
            if ((IiiiiiiiIIIII4 = this.value.indexOf("=", IiiiiiiiIIIII2 + 1)) != -1 && IiiiiiiiIIIII4 <= IiiiiiiiIIIII3) {
                iiIiIiiiiIiii IiiiiiiiIIIII5 = new iiIiIiiiiIiii(this.value.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII4), IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.value, (int)(IiiiiiiiIIIII4 + 1), (int)IiiiiiiiIIIII3));
                if (IiiiiiiiIIIII5.ALLATORIxDEMO < 100000000L) {
                    IiiiiiiiIIIII5.ALLATORIxDEMO *= 60000L;
                } else if (IiiiiiiiIIIII5.ALLATORIxDEMO < 2000000000L) {
                    IiiiiiiiIIIII5.ALLATORIxDEMO *= 1000L;
                }
                this.keys.add(IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
        return this.keys;
    }

    public UseCardBean(String name, String type, String skin, long time, String value) {
        this.name = name;
        this.type = type;
        this.skin = skin;
        this.time = time;
        this.value = value;
    }

    public int getUseTime() {
        return UseCardBean.getUseTime(this.time);
    }

    public BeauBean ALLATORIxDEMO() {
        if (this.beauBean != null) return this.beauBean;
        this.beauBean = new BeauBean(this.name, 0, this.name.length());
        return this.beauBean;
    }

    public String getName() {
        return this.name;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public BaseQl[] getQls() {
        if (this.qls != null) return this.qls;
        if (this.value == null) return this.qls;
        if (this.value.equals("")) return this.qls;
        String[] IiiiiiiiIIIII = this.value.split("\\|");
        this.qls = new BaseQl[IiiiiiiiIIIII.length];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII3;
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII2].indexOf("=");
            if (IiiiiiiiIIIII4 != -1 && !(IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(0, IiiiiiiiIIIII4)).equals("\u7b49\u7ea7\u8981\u6c42") && !IiiiiiiiIIIII3.equals("\u79cd\u65cf")) {
                try {
                    this.qls[IiiiiiiiIIIII2] = new BaseQl(IiiiiiiiIIIII3, Double.parseDouble(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(IiiiiiiiIIIII4 + 1)));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            ++IiiiiiiiIIIII2;
        }
        return this.qls;
    }

    public boolean ALLATORIxDEMO(long timeNow) {
        if (this.time == 0L) return false;
        if (timeNow < this.time) return false;
        return true;
    }

    public String getSkin() {
        return this.skin;
    }

    public String getlCard() {
        return this.lCard;
    }

    public String getType() {
        return this.type;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String msg, int wei) {
        block9: {
            IiiiiiiiIIIII = msg.indexOf("=");
            IiiiiiiiIIIII = msg.substring(0, IiiiiiiiIIIII);
            IiiiiiiiIIIII = Double.parseDouble(msg.substring(IiiiiiiiIIIII + 1));
            if (this.value == null || this.value.equals("")) {
                this.setValue(String.valueOf(IiiiiiiiIIIII) + "=" + (IiiiiiiiIIIII != (double)((int)IiiiiiiiIIIII) ? IiiiiiiiIIIII : (double)((int)IiiiiiiiIIIII)));
                return;
            }
            IiiiiiiiIIIII = this.qls == null || this.qls.length >= wei ? null : this.qls[wei];
            IiiiiiiiIIIII = new StringBuffer();
            if (IiiiiiiiIIIII == null) break block9;
            IiiiiiiiIIIII.setKey(IiiiiiiiIIIII);
            IiiiiiiiIIIII.setValue(IiiiiiiiIIIII);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl31
        }
        IiiiiiiiIIIII = this.value.split("\\|");
        IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII) + "=" + (IiiiiiiiIIIII != (double)((int)IiiiiiiiIIIII) ? IiiiiiiiIIIII : (double)((int)IiiiiiiiIIIII));
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl46
        do {
            IiiiiiiiIIIII = this.qls[IiiiiiiiIIIII];
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getKey());
            IiiiiiiiIIIII.append("=");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getValue() != (double)((int)IiiiiiiiIIIII.getValue()) ? IiiiiiiiIIIII.getValue() : (double)((int)IiiiiiiiIIIII.getValue()));
            ++IiiiiiiiIIIII;
lbl31:
            // 2 sources

        } while (IiiiiiiiIIIII < this.qls.length);
        this.value = IiiiiiiiIIIII.toString();
        return;
        do {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            if (IiiiiiiiIIIII != wei) {
                IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII]);
            } else {
                IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                IiiiiiiiIIIII = null;
            }
            ++IiiiiiiiIIIII;
lbl46:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        if (IiiiiiiiIIIII != null) {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
        }
        this.setValue(IiiiiiiiIIIII.toString());
    }

    public static int getUseTime(long time) {
        if (time == 0L) return 0;
        return (int)((time - iIiIIiiiIiiiI.iIiIiiiiIIiii()) / 60000L);
    }
}
