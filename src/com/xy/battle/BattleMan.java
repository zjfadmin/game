/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleBuff
 *  com.xy.battle.TypeState
 *  com.xy.text.SystemData
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.battle;

import com.xy.battle.BattleBuff;
import com.xy.battle.TypeState;
import com.xy.text.SystemData;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BattleMan {
    private transient int nd;
    private int hp_Current;
    private int hp_Total;
    public transient BigDecimal[] lingIds;
    private int type;
    private String State_1;
    private Integer campId;
    private int man;
    private int Camp;
    private Integer W;
    private int mp_Total;
    private int yqz;
    private String msg;
    private transient List<BattleBuff> stateList = new ArrayList<BattleBuff>();
    private int bap;
    public transient BigDecimal[] petIds;
    private transient boolean skill1244;
    private transient boolean SR;
    private String States;
    private int nqz;
    private String manname;
    static String[] fbs = new String[]{"1337", "fbYsjl", "fbJjl", "fbDsc", "fbQbllt", "fbHlz", "fbYmgs", "fbDsy", "fbJqb", "fbQw", "fbBld", "fbJge", "fbFty", "fbJljs", "fbBgz", "fbHd", "bbss", "6018", "6019", "6022", "6024", "6025", "6027", "6028", "7002", "7008", "7015", "7026", "7033", "7034", "7035", "9389", "\u6ca7\u6ce2", "\u6276\u6447", "\u7518\u9716", "1231", "1232", "1866", "1869", "1873", "1238", "1882", "1883", "20003", "30010", "11010", "\u6218\u610f", "\u7834\u7532", "11052", "11047", "11055", "11063", "11029", "LBFD", "LBFD2", "12001", "12002", "12003", "12005", "12007", "12008", "12010", "12011", "12012", "12013", "12014", "12015", "12016", "12017", "12018", "12501", "12502", "12503", "12508", "12510", "12513", "12514", "12515", "12516", "1242", "3026", "3036", "1267A", "1267B", "1267C", "1895", "1214", "7027", "1223", "7038"};
    private int mp_Current;
    static List<String> drawDown = new ArrayList<String>();
    private int zs;
    private int bsp;
    private float alpha = 1.0f;
    private int id;
    private Integer die;
    private String model = "img/\u89d2\u8272/\u9b3c\u65cf/\u796d\u5251\u9b42";

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setW(Integer w) {
        this.W = w;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMp_Current(int mp_Current) {
        this.mp_Current = mp_Current;
    }

    public Integer getDie() {
        return this.die;
    }

    public boolean ALLATORIxDEMO(Graphics g, long time, int x, int y, int round) {
        boolean IiiiiiiiIIIII = false;
        BattleBuff IiiiiiiiIIIII2 = null;
        int IiiiiiiiIIIII3 = this.nd != 0 ? round % this.nd : 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.stateList.size()) {
            BattleBuff IiiiiiiiIIIII5 = this.stateList.get(IiiiiiiiIIIII4);
            if (IiiiiiiiIIIII5.getCamp() == 1) {
                IiiiiiiiIIIII = true;
            } else if (IiiiiiiiIIIII5.getCamp() == 2) {
                if (IiiiiiiiIIIII2 == null || IiiiiiiiIIIII5.getXy() == IiiiiiiiIIIII3) {
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII5;
                }
            } else {
                IiiiiiiiIIIII5.ALLATORIxDEMO(g, time, x, y);
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII2 == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII2.ALLATORIxDEMO(g, time, x, y);
        return IiiiiiiiIIIII;
    }

    public int getNqz() {
        return this.nqz;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public void setNqz(int nqz) {
        this.nqz = nqz;
    }

    public boolean ALLATORIxDEMO(int hp, int mp, int yq, int nq) {
        boolean IiiiiiiiIIIII = false;
        if (hp != 0) {
            this.hp_Current = BattleMan.ALLATORIxDEMO(this.hp_Total, this.hp_Current, hp);
            IiiiiiiiIIIII = true;
        }
        if (mp != 0) {
            this.mp_Current = BattleMan.ALLATORIxDEMO(this.mp_Total, this.mp_Current, mp);
            IiiiiiiiIIIII = true;
        }
        if (yq != 0) {
            this.yqz += yq;
            IiiiiiiiIIIII = true;
        }
        if (nq == 0) return IiiiiiiiIIIII;
        this.nqz += nq;
        IiiiiiiiIIIII = true;
        return IiiiiiiiIIIII;
    }

    public int getHp_Current() {
        return this.hp_Current;
    }

    public void iIiIiiiiIIiii(String typess) {
        if (typess == null) {
            return;
        }
        String[] IiiiiiiiIIIII = typess.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2];
            String IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII4.indexOf("#");
            if (IiiiiiiiIIIII5 != -1) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII3.substring(IiiiiiiiIIIII5 + 1);
                IiiiiiiiIIIII3 = IiiiiiiiIIIII3.substring(0, IiiiiiiiIIIII5);
            }
            if (IiiiiiiiIIIII4.equals("1337")) {
                IiiiiiiiIIIII4 = "\u5c01\u5370";
            }
            if (IiiiiiiiIIIII3.equals("\u9690\u8eab")) {
                this.alpha = 0.3f;
            } else if (IiiiiiiiIIIII3.equals("3029")) {
                this.SR = true;
            } else if (!this.iIiIiiiiIIiii(IiiiiiiiIIIII3) && this.ALLATORIxDEMO(IiiiiiiiIIIII3)) {
                this.stateList.add(new BattleBuff(IiiiiiiiIIIII3, IiiiiiiiIIIII4, drawDown.contains(IiiiiiiiIIIII3) ? 0 : 1));
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public void setZs(int zs) {
        this.zs = zs;
    }

    public int getType() {
        return this.type;
    }

    public int getZs() {
        return this.zs;
    }

    public boolean iIiIiiiiIIiii(String type) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.stateList.size()) {
            if (this.stateList.get(IiiiiiiiIIIII).getType().equals(type)) {
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public List<BattleBuff> getStateList() {
        return this.stateList;
    }

    public void ALLATORIxDEMO(String typess) {
        if (typess == null) {
            return;
        }
        String[] IiiiiiiiIIIII = typess.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2];
            if (IiiiiiiiIIIII3.equals("\u6e05\u9664\u72b6\u6001")) {
                String[] IiiiiiiiIIIII4 = new String[]{"\u51cf\u4eba\u4ed9", "\u51cf\u9b54\u9b3c", "\u5e87\u62a4", "\u9057\u5fd8", "\u5c01\u5370", "\u4e2d\u6bd2", "\u660f\u7761", "\u6df7\u4e71", "\u91d1", "\u6728", "\u6c34", "\u706b", "\u571f", "1876", "\u529b\u91cf", "\u6297\u6027", "\u52a0\u901f", "smmh", "\u51cf\u901f"};
                this.ALLATORIxDEMO(IiiiiiiiIIIII4);
            } else if (IiiiiiiiIIIII3.equals("\u6e05\u9664\u5f02\u5e38\u72b6\u6001")) {
                String[] IiiiiiiiIIIII5 = new String[]{"\u51cf\u901f", "\u9057\u5fd8", "\u5c01\u5370", "\u4e2d\u6bd2", "\u660f\u7761", "\u6df7\u4e71", "mh", "bbss", "fbJge", "fbQw", "fbYsjl", "1232", "1869"};
                this.ALLATORIxDEMO(IiiiiiiiIIIII5);
            } else if (IiiiiiiiIIIII3.equals("\u6e05\u9664\u4e94\u884c")) {
                String[] IiiiiiiiIIIII6 = new String[]{"\u91d1", "\u6728", "\u6c34", "\u706b", "\u571f", "1605", "1876"};
                this.ALLATORIxDEMO(IiiiiiiiIIIII6);
            } else if (IiiiiiiiIIIII3.equals("\u975e\u63a7\u5236\u51cf\u76ca")) {
                String[] IiiiiiiiIIIII7 = new String[]{"\u51cf\u901f", "\u51cf\u4eba\u4ed9", "\u51cf\u9b54\u9b3c", "\u4e2d\u6bd2"};
                this.ALLATORIxDEMO(IiiiiiiiIIIII7);
            } else if (IiiiiiiiIIIII3.equals("\u9690\u8eab")) {
                this.alpha = 1.0f;
            } else if (IiiiiiiiIIIII3.equals("3029")) {
                this.SR = false;
            } else {
                int IiiiiiiiIIIII8 = this.stateList.size() - 1;
                while (IiiiiiiiIIIII8 >= 0) {
                    if (IiiiiiiiIIIII3.equals(this.stateList.get(IiiiiiiiIIIII8).getType())) {
                        this.stateList.remove(IiiiiiiiIIIII8);
                        break;
                    }
                    --IiiiiiiiIIIII8;
                }
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public int getMan() {
        return this.man;
    }

    public void setState_1(String state_1) {
        this.State_1 = state_1;
    }

    public void setMp_Total(int mp_Total) {
        this.mp_Total = mp_Total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setManname(String manname) {
        this.manname = manname;
    }

    public Integer getCampId() {
        return this.campId;
    }

    public void setMan(int man) {
        this.man = man;
    }

    public int getBsp() {
        return this.bsp;
    }

    public String getModel() {
        return this.model;
    }

    public void ALLATORIxDEMO(Graphics g, long time, int x, int y) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.stateList.size()) {
            BattleBuff IiiiiiiiIIIII2 = this.stateList.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getCamp() == 1) {
                IiiiiiiiIIIII2.ALLATORIxDEMO(g, time, x, y);
            }
            ++IiiiiiiiIIIII;
        }
        if (!this.skill1244) return;
        if (this.alpha != 0.3f) return;
        IIIIIiiiIiIii IiiiiiiiIIIII2 = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiIi((String)"1244"));
        if (IiiiiiiiIIIII2 == null) return;
        IiiiiiiiIIIII2.ALLATORIxDEMO(time, 0);
        IiiiiiiiIIIII2.ALLATORIxDEMO(g, x, y);
    }

    public int getId() {
        return this.id;
    }

    public void setStates(String states) {
        this.States = states;
    }

    public void ALLATORIxDEMO(String[] values) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < values.length) {
            int IiiiiiiiIIIII2 = this.stateList.size() - 1;
            while (IiiiiiiiIIIII2 >= 0) {
                if (values[IiiiiiiiIIIII].equals(this.stateList.get(IiiiiiiiIIIII2).getType())) {
                    this.stateList.remove(IiiiiiiiIIIII2);
                    break;
                }
                --IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public float getAlpha() {
        return this.alpha;
    }

    public String getStates() {
        return this.States;
    }

    public void setBsp(int bsp) {
        this.bsp = bsp;
    }

    public void setHp_Current(int hp_Current) {
        this.hp_Current = hp_Current;
    }

    public boolean ALLATORIxDEMO() {
        return this.SR;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setYqz(int yqz) {
        this.yqz = yqz;
    }

    public String getState_1() {
        return this.State_1;
    }

    public void ALLATORIxDEMO() {
        String[] IiiiiiiiIIIII;
        String[] stringArray = IiiiiiiiIIIII = this.States != null ? this.States.split("\\|") : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.stateList.clear();
        this.nd = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2];
            String IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII4.indexOf("#");
            if (IiiiiiiiIIIII5 != -1) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII3.substring(IiiiiiiiIIIII5 + 1);
                IiiiiiiiIIIII3 = IiiiiiiiIIIII3.substring(0, IiiiiiiiIIIII5);
            }
            if (IiiiiiiiIIIII4.equals("1337")) {
                IiiiiiiiIIIII4 = "\u5c01\u5370";
            } else if (IiiiiiiiIIIII4.equals("1223")) {
                IiiiiiiiIIIII4 = "7026";
            }
            if (IiiiiiiiIIIII3.startsWith("tj") || IiiiiiiiIIIII3.startsWith("mj") || IiiiiiiiIIIII3.startsWith("xl") || IiiiiiiiIIIII3.startsWith("rj")) {
                BattleBuff IiiiiiiiIIIII6 = new BattleBuff(IiiiiiiiIIIII3, IiiiiiiiIIIII4, 2);
                IiiiiiiiIIIII6.setXy(this.nd++);
                this.stateList.add(IiiiiiiiIIIII6);
            } else if (IiiiiiiiIIIII3.equals("1244")) {
                this.skill1244 = true;
            } else if (IiiiiiiiIIIII3.equals("\u9690\u8eab")) {
                this.alpha = 0.3f;
            } else if (IiiiiiiiIIIII3.equals("3029")) {
                this.SR = true;
            } else if (!this.iIiIiiiiIIiii(IiiiiiiiIIIII3) && this.ALLATORIxDEMO(IiiiiiiiIIIII3)) {
                this.stateList.add(new BattleBuff(IiiiiiiiIIIII3, IiiiiiiiIIIII4, drawDown.contains(IiiiiiiiIIIII3) ? 0 : 1));
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public int getMp_Total() {
        return this.mp_Total;
    }

    public void setSR(boolean sR) {
        this.SR = sR;
    }

    /*
     * WARNING - void declaration
     */
    public List<TypeState> ALLATORIxDEMO(String type) {
        ArrayList<TypeState> IiiiiiiiIIIII = new ArrayList<TypeState>();
        String[] IiiiiiiiIIIII2 = this.State_1.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=");
            if (IiiiiiiiIIIII4[0].equals(type)) {
                String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4[1].split("\\_");
                int IiiiiiiiIIIII6 = 0;
                while (IiiiiiiiIIIII6 < IiiiiiiiIIIII5.length) {
                    void IiiiiiiiIIIII7;
                    String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII5[IiiiiiiiIIIII6].split("\\-");
                    TypeState typeState = new TypeState();
                    IiiiiiiiIIIII7.setType(IiiiiiiiIIIII8[0]);
                    ++IiiiiiiiIIIII6;
                    typeState.setState(Integer.parseInt(IiiiiiiiIIIII8[1]));
                    IiiiiiiiIIIII.add((TypeState)IiiiiiiiIIIII7);
                }
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public static int ALLATORIxDEMO(int z, int d, int c) {
        if (d + c > z) {
            return z;
        }
        if (d + c >= 0) return d + c;
        return 0;
    }

    public int getMp_Current() {
        return this.mp_Current;
    }

    public boolean ALLATORIxDEMO(String type) {
        if (type.equals("\u91d1") || type.equals("\u6728") || type.equals("\u6c34") || type.equals("\u571f") || type.equals("\u706b") || type.equals("1876") || type.equals("1605")) {
            this.ALLATORIxDEMO("\u6e05\u9664\u4e94\u884c");
            return true;
        }
        if (type.equals("\u9057\u5fd8") || type.equals("\u5c01\u5370") || type.equals("\u660f\u7761") || type.equals("\u6df7\u4e71") || type.equals("bbss")) {
            if (type.equals("\u5c01\u5370")) {
                this.ALLATORIxDEMO("\u4e2d\u6bd2");
            }
            this.ALLATORIxDEMO("\u5c01\u5370");
            this.ALLATORIxDEMO("\u660f\u7761");
            this.ALLATORIxDEMO("\u6df7\u4e71");
            this.ALLATORIxDEMO("\u9057\u5fd8");
            this.ALLATORIxDEMO("bbss");
            return true;
        }
        if (type.equals("\u9aa8\u76fe")) return true;
        if (type.equals("\u51cf\u4eba\u4ed9")) return true;
        if (type.equals("\u51cf\u9b54\u9b3c")) return true;
        if (type.equals("\u5e87\u62a4")) return true;
        if (type.equals("\u4e2d\u6bd2")) return true;
        if (type.equals("\u529b\u91cf")) return true;
        if (type.equals("\u6297\u6027")) return true;
        if (type.equals("\u52a0\u901f")) return true;
        if (type.equals("\u5f52\u589f")) return true;
        if (type.equals("\u6bd2\u9488\u8f7b\u523a")) return true;
        if (type.equals("\u56de\u9b42\u5492")) return true;
        if (type.equals("\u5316\u7fbd")) return true;
        if (type.equals("\u9634\u9633\u9006\u8f6c")) return true;
        if (type.equals("mh")) return true;
        if (type.equals("smmh")) return true;
        if (type.equals("\u51cf\u901f")) {
            return true;
        }
        if (type.equals("\u98ce\u6c34") || type.equals("\u96f7\u706b") || type.equals("\u9b3c\u529b") || type.equals("\u7389\u51c0\u6563")) {
            this.ALLATORIxDEMO("\u98ce\u6c34");
            this.ALLATORIxDEMO("\u96f7\u706b");
            this.ALLATORIxDEMO("\u9b3c\u529b");
            this.ALLATORIxDEMO("\u7389\u51c0\u6563");
            return true;
        }
        if (type.equals("6029")) {
            String[] IiiiiiiiIIIII = new String[]{"6029", "\u9057\u5fd8", "\u5c01\u5370", "\u4e2d\u6bd2", "\u660f\u7761", "\u6df7\u4e71", "fbJge", "fbQw", "bbss"};
            this.ALLATORIxDEMO(IiiiiiiiIIIII);
            return true;
        }
        if (type.equals("7009")) {
            this.ALLATORIxDEMO("\u660f\u7761");
            this.ALLATORIxDEMO("\u6df7\u4e71");
            this.ALLATORIxDEMO("\u9057\u5fd8");
            this.ALLATORIxDEMO("7009");
            this.ALLATORIxDEMO("bbss");
            return true;
        }
        if (type.equals("1237") || type.equals("1237A") || type.equals("1237B")) {
            String[] IiiiiiiiIIIII = new String[]{"1237", "1237A", "1237B"};
            this.ALLATORIxDEMO(IiiiiiiiIIIII);
            return true;
        }
        if (type.equals("1267A") || type.equals("1267B") || type.equals("1267C")) {
            String[] IiiiiiiiIIIII = new String[]{"1267A", "1267B", "1267C"};
            this.ALLATORIxDEMO(IiiiiiiiIIIII);
            return true;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < fbs.length) {
            if (fbs[IiiiiiiiIIIII].equals(type)) {
                this.ALLATORIxDEMO(type);
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public void setHp_Total(int hp_Total) {
        this.hp_Total = hp_Total;
    }

    public void setBap(int bap) {
        this.bap = bap;
    }

    public int getBap() {
        return this.bap;
    }

    public IiiiIiiiiIiIi getPart() {
        String[] IiiiiiiiIIIII = this.model.split("\\&");
        IiiiIiiiiIiIi IiiiiiiiIIIII2 = null;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith("W")) {
                this.W = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII3].substring(1));
            } else {
                String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3].split("\\_");
                String IiiiiiiiIIIII5 = IiiiiiiiIIIII4[0];
                int IiiiiiiiIIIII6 = 0;
                int IiiiiiiiIIIII7 = -2;
                String IiiiiiiiIIIII8 = null;
                if (IiiiiiiiIIIII4.length == 1) {
                    IiiiiiiiIIIII6 = 1;
                    IiiiiiiiIIIII7 = 7;
                } else {
                    if (IiiiiiiiIIIII4.length > 1) {
                        IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII4[1]);
                    }
                    if (IiiiiiiiIIIII4.length > 2) {
                        IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII4[2]);
                    }
                    if (IiiiiiiiIIIII4.length > 3) {
                        IiiiiiiiIIIII8 = IiiiiiiiIIIII4[3];
                    }
                }
                if (IiiiiiiiIIIII6 != 5 && IiiiiiiiIIIII6 != -5 || !SystemData.isWing) {
                    IiiiIiiiiIiIi IiiiiiiiIIIII9 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII7, (int)IiiiiiiiIIIII6, IiiiiiiiIIIII8);
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII2 == null ? IiiiiiiiIIIII9 : IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII9);
                }
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII2;
    }

    public Integer getW() {
        return this.W;
    }

    public void setCamp(int camp) {
        this.Camp = camp;
    }

    public void setCampId(Integer campId) {
        this.campId = campId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYqz() {
        return this.yqz;
    }

    public int getCamp() {
        return this.Camp;
    }

    static {
        drawDown.add("\u91d1");
        drawDown.add("\u6728");
        drawDown.add("\u571f");
        drawDown.add("\u6c34");
        drawDown.add("\u706b");
        drawDown.add("1605");
        drawDown.add("1869");
        drawDown.add("1876");
        drawDown.add("1876");
    }

    public String getManname() {
        return this.manname;
    }

    public int getHp_Total() {
        return this.hp_Total;
    }

    public void setStateList(List<BattleBuff> stateList) {
        this.stateList = stateList;
    }
}
