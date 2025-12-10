/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.PartJade
 *  com.xy.formula.BaseMountSH
 *  com.xy.readbean.RoleTxBean
 *  com.xy.v.IIIIIiiiIiIii
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.entity;

import com.xy.entity.PartJade;
import com.xy.formula.BaseMountSH;
import com.xy.readbean.RoleTxBean;
import com.xy.v.IIIIIiiiIiIii;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class PackRecord {
    private String suit4;
    private String helpLing;
    private String equip;
    private String starSoul;
    private String suit6;
    private String suit8;
    private String suit10;
    private String collect;
    private String suit9;
    private String lCard;
    private String labor;
    private String suit5;
    private String suit2;
    private BigDecimal roleId;
    private String record;
    private String suit7;
    private String suit3;
    private String suit11;
    private String tx;
    private String suit1;
    private int suitNum;
    private String helpBb;

    public String getStarSoul() {
        return this.starSoul;
    }

    public String getSuit5() {
        return this.suit5;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public BigDecimal getRoleId() {
        return this.roleId;
    }

    public BigDecimal[] getBaseValue(int size, String head) {
        BigDecimal[] IiiiiiiiIIIII = new BigDecimal[size];
        String IiiiiiiiIIIII2 = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.equip, (String)head, (String)"|");
        if (IiiiiiiiIIIII2 == null) return IiiiiiiiIIIII;
        if (IiiiiiiiIIIII2.equals("")) return IiiiiiiiIIIII;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (true) {
            long IiiiiiiiIIIII6;
            if ((IiiiiiiiIIIII6 = Long.parseLong(IiiiiiiiIIIII2.substring(IiiiiiiiIIIII4, (IiiiiiiiIIIII5 = IiiiiiiiIIIII2.indexOf("=", IiiiiiiiIIIII4)) != -1 ? IiiiiiiiIIIII5 : IiiiiiiiIIIII2.length()))) != 0L) {
                IiiiiiiiIIIII[IiiiiiiiIIIII3] = new BigDecimal(IiiiiiiiIIIII6);
            }
            if (IiiiiiiiIIIII5 == -1) return IiiiiiiiIIIII;
            if (++IiiiiiiiIIIII3 >= IiiiiiiiIIIII.length) {
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII4 = IiiiiiiiIIIII5 + 1;
        }
    }

    public BigDecimal[] setEquipType(int path) {
        if (this.getEquipType() == path) {
            return null;
        }
        this.equip = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.equip, (String)"EO", (String)"|", (String)("EO" + path));
        return this.getEquipType("E");
    }

    public String iIiIiiiiIIiii(String id) {
        if (this.tx == null) return this.tx;
        if (this.tx.equals("")) {
            return this.tx;
        }
        String[] IiiiiiiiIIIII = this.tx.split("\\|");
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3];
            if (IiiiiiiiIIIII4.endsWith("#")) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII4.substring(0, IiiiiiiiIIIII4.length() - 1);
            }
            if (!id.equals(IiiiiiiiIIIII4)) {
                if (IiiiiiiiIIIII2.length() != 0) {
                    IiiiiiiiIIIII2.append("|");
                }
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII[IiiiiiiiIIIII3]);
            }
            ++IiiiiiiiIIIII3;
        }
        this.tx = IiiiiiiiIIIII2.toString();
        return this.tx;
    }

    public void setSuit5(String suit5) {
        this.suit5 = suit5;
    }

    public String getSuit6() {
        return this.suit6;
    }

    public String getShortCutSkills() {
        return IIiiIiiiiIIiI.iIiIiiiiIIiii((String)this.equip, (String)"JN", (String)"|");
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getHelpBb() {
        return this.helpBb;
    }

    public void setSuit6(String suit6) {
        this.suit6 = suit6;
    }

    public void setSuit(int id, String suit) {
        if (id <= 0) return;
        if (id > 110) {
            return;
        }
        id = (id - 1) / 10;
        switch (id) {
            case 0: {
                this.suit1 = suit;
                return;
            }
            case 1: {
                this.suit2 = suit;
                return;
            }
            case 2: {
                this.suit3 = suit;
                return;
            }
            case 3: {
                this.suit4 = suit;
                return;
            }
            case 4: {
                this.suit5 = suit;
                return;
            }
            case 5: {
                this.suit6 = suit;
                return;
            }
            case 6: {
                this.suit7 = suit;
                return;
            }
            case 7: {
                this.suit8 = suit;
                return;
            }
            case 8: {
                this.suit9 = suit;
                return;
            }
            case 9: {
                this.suit10 = suit;
                return;
            }
            case 10: {
                this.suit11 = suit;
                break;
            }
        }
    }

    public List<String> getPutTX() {
        if (this.tx == null) return null;
        if (this.tx.equals("")) {
            return null;
        }
        ArrayList<String> IiiiiiiiIIIII = null;
        String[] IiiiiiiiIIIII2 = this.tx.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].endsWith("#")) {
                if (IiiiiiiiIIIII == null) {
                    IiiiiiiiIIIII = new ArrayList<String>();
                }
                IiiiiiiiIIIII.add(IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(0, IiiiiiiiIIIII2[IiiiiiiiIIIII3].length() - 1));
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public String getLabor() {
        return this.labor;
    }

    public BaseMountSH getMountSH(int id) {
        BaseMountSH IiiiiiiiIIIII = new BaseMountSH(id, this.getOtherValue(BaseMountSH.SH_HEAD_DATA[id]));
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = id == 0 ? IiiiiiiiIIIII.getUnlock() : 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII3) {
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2, this.getOtherValue(BaseMountSH.SH_HEAD_SHS[IiiiiiiiIIIII2++]));
        }
        return IiiiiiiiIIIII;
    }

    public List<RoleTxBean> getTX(int txType, IiiiiiiiiIIII objectArea) {
        ArrayList<RoleTxBean> IiiiiiiiIIIII = new ArrayList<RoleTxBean>();
        String IiiiiiiiIIIII2 = this.getTx();
        if (IiiiiiiiIIIII2 == null) return IiiiiiiiIIIII;
        if (IiiiiiiiIIIII2.equals("")) {
            return IiiiiiiiIIIII;
        }
        String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII2.split("\\|");
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            RoleTxBean IiiiiiiiIIIII5;
            if (IiiiiiiiIIIII3[IiiiiiiiIIIII4].endsWith("#")) {
                IiiiiiiiIIIII3[IiiiiiiiIIIII4] = IiiiiiiiIIIII3[IiiiiiiiIIIII4].substring(0, IiiiiiiiIIIII3[IiiiiiiiIIIII4].length() - 1);
            }
            if ((IiiiiiiiIIIII5 = objectArea.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII3[IiiiiiiiIIIII4]))) != null && txType == IiiiiiiiIIIII5.getRdType()) {
                IiiiiiiiIIIII.add(IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII4;
        }
        return IiiiiiiiIIIII;
    }

    public void setEquip(BigDecimal[] ids) {
        int IiiiiiiiIIIII = this.getEquipType();
        String IiiiiiiiIIIII2 = null;
        IiiiiiiiIIIII2 = IiiiiiiiIIIII == 1 ? "EB" : (IiiiiiiiIIIII == 2 ? "EC" : "EA");
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        IiiiiiiiIIIII3.append(IiiiiiiiIIIII2);
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < ids.length) {
            if (IiiiiiiiIIIII4 != 0) {
                IiiiiiiiIIIII3.append("=");
            }
            IiiiiiiiIIIII3.append(ids[IiiiiiiiIIIII4] != null ? ids[IiiiiiiiIIIII4] : Integer.valueOf(0));
            ++IiiiiiiiIIIII4;
        }
        this.equip = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.equip, (String)IiiiiiiiIIIII2, (String)"|", (String)IiiiiiiiIIIII3.toString());
    }

    public String ALLATORIxDEMO(int id, long value) {
        this.setStarSoulType(id, value += this.getStarSoulType(id));
        return String.valueOf(id) + "=" + value;
    }

    public void setLabortype(int id, long value) {
        this.labor = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.labor, (String)(String.valueOf(id) + "="), (String)"|", (String)(String.valueOf(id) + "=" + value));
    }

    public String getOtherValue(String head) {
        return IIiiIiiiiIIiI.iIiIiiiiIIiii((String)this.lCard, (String)head, (String)"|");
    }

    public List<Integer> ALLATORIxDEMO() {
        if (this.collect == null) return null;
        if (this.collect.equals("")) {
            return null;
        }
        ArrayList<Integer> IiiiiiiiIIIII = new ArrayList<Integer>();
        String[] IiiiiiiiIIIII2 = this.collect.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("-")[0]);
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII.add(IiiiiiiiIIIII4);
        }
        return IiiiiiiiIIIII;
    }

    public BigDecimal[] getEquipType(String type) {
        String IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.equip, (String)(String.valueOf(type) + "O"), (String)"|");
        int IiiiiiiiIIIII2 = 15;
        int IiiiiiiiIIIII3 = 0;
        if (IiiiiiiiIIIII != null && !IiiiiiiiIIIII.equals("")) {
            IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII);
        }
        type = IiiiiiiiIIIII3 == 1 ? String.valueOf(type) + "B" : (IiiiiiiiIIIII3 == 2 ? String.valueOf(type) + "C" : String.valueOf(type) + "A");
        return this.getBaseValue(IiiiiiiiIIIII2, type);
    }

    public int getFZType() {
        String IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.equip, (String)"FZ", (String)"|");
        if (IiiiiiiiIIIII == null) return 0;
        if (IiiiiiiiIIIII.equals("")) return 0;
        return Integer.parseInt(IiiiiiiiIIIII);
    }

    public void setSuit9(String suit9) {
        this.suit9 = suit9;
    }

    public void setSuitNum(int suitNum) {
        this.suitNum = suitNum;
    }

    /*
     * Unable to fully structure code
     */
    public String[] getCollect(int suitid) {
        if (this.collect == null) return null;
        if (this.collect.equals("")) {
            return null;
        }
        IiiiiiiiIIIII = this.collect.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
            if (suitid != IiiiiiiiIIIII) {
                ++IiiiiiiiIIIII;
                continue;
            }
            IiiiiiiiIIIII = new String[IiiiiiiiIIIII.length - 1];
            IiiiiiiiIIIII = 1;
            if (true) ** GOTO lbl21
        }
        return null;
        do {
            v0 = IiiiiiiiIIIII - 1;
            v1 = IiiiiiiiIIIII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII[v0] = v1;
lbl21:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        return IiiiiiiiIIIII;
    }

    public void setCollect(String collect) {
        this.collect = collect;
    }

    public String getSuit2() {
        return this.suit2;
    }

    public String getSuit(int id) {
        if (id <= 0) return null;
        if (id > 110) {
            return null;
        }
        id = (id - 1) / 10;
        switch (id) {
            case 0: {
                return this.suit1;
            }
            case 1: {
                return this.suit2;
            }
            case 2: {
                return this.suit3;
            }
            case 3: {
                return this.suit4;
            }
            case 4: {
                return this.suit5;
            }
            case 5: {
                return this.suit6;
            }
            case 6: {
                return this.suit7;
            }
            case 7: {
                return this.suit8;
            }
            case 8: {
                return this.suit9;
            }
            case 9: {
                return this.suit10;
            }
            case 10: {
                return this.suit11;
            }
        }
        return null;
    }

    public void setSuit3(String suit3) {
        this.suit3 = suit3;
    }

    public String getSuit1() {
        return this.suit1;
    }

    public String getTx() {
        return this.tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public void setSuit7(String suit7) {
        this.suit7 = suit7;
    }

    public String getlCard() {
        return this.lCard;
    }

    /*
     * Unable to fully structure code
     */
    public void setPartJade(int suitid, int partId, int pz, int sum) {
        block16: {
            IiiiiiiiIIIII = this.getSuit(suitid);
            if (IiiiiiiiIIIII != null && !IiiiiiiiIIIII.equals("")) break block16;
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII.append(suitid);
            IiiiiiiiIIIII.append("-");
            IiiiiiiiIIIII.append(partId);
            IiiiiiiiIIIII = 1;
            if (true) ** GOTO lbl29
        }
        IiiiiiiiIIIII = new PartJade((long)suitid, partId);
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII = IiiiiiiiIIIII.split("\\|");
        IiiiiiiiIIIII = true;
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl75
        do {
            IiiiiiiiIIIII.append("_");
            if (IiiiiiiiIIIII == pz) {
                IiiiiiiiIIIII.append(sum);
            } else {
                IiiiiiiiIIIII.append(0);
            }
            ++IiiiiiiiIIIII;
lbl29:
            // 2 sources

        } while (IiiiiiiiIIIII < 6);
        this.setSuit(suitid, IiiiiiiiIIIII.toString());
        return;
        do {
            if (suitid != (IiiiiiiiIIIII = Integer.parseInt((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-"))[0]))) {
                if (IiiiiiiiIIIII != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII]);
            } else {
                if (IiiiiiiiIIIII != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII = false;
                IiiiiiiiIIIII = true;
                IiiiiiiiIIIII.append(IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII = 1;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("_");
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                    if (partId != IiiiiiiiIIIII) {
                        IiiiiiiiIIIII.append("-");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                    } else {
                        IiiiiiiiIIIII = false;
                        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                        IiiiiiiiIIIII.setJade(pz, sum);
                        if (!IiiiiiiiIIIII.ALLATORIxDEMO()) {
                            IiiiiiiiIIIII.append("-");
                            IiiiiiiiIIIII.append(IiiiiiiiIIIII.toString());
                        }
                    }
                    ++IiiiiiiiIIIII;
                }
                if (IiiiiiiiIIIII) {
                    IiiiiiiiIIIII.setJade(pz, sum);
                    if (!IiiiiiiiIIIII.ALLATORIxDEMO()) {
                        IiiiiiiiIIIII.append("-");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.toString());
                    }
                }
            }
            ++IiiiiiiiIIIII;
lbl75:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        if (IiiiiiiiIIIII) {
            IiiiiiiiIIIII.append("|");
            IiiiiiiiIIIII.append(suitid);
            IiiiiiiiIIIII.setJade(pz, sum);
            if (!IiiiiiiiIIIII.ALLATORIxDEMO()) {
                IiiiiiiiIIIII.append("-");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.toString());
            }
        }
        this.setSuit(suitid, IiiiiiiiIIIII.toString());
    }

    public void setSuit2(String suit2) {
        this.suit2 = suit2;
    }

    public String getSuit7() {
        return this.suit7;
    }

    public String getSuit3() {
        return this.suit3;
    }

    public String getSuit11() {
        return this.suit11;
    }

    public void setLabortype(String data) {
        int IiiiiiiiIIIII = data.indexOf("=");
        this.labor = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.labor, (String)data.substring(0, IiiiiiiiIIIII), (String)"|", (String)data);
    }

    public void setlCard(String lCard) {
        this.lCard = lCard;
    }

    public void setSuit11(String suit11) {
        this.suit11 = suit11;
    }

    /*
     * Unable to fully structure code
     */
    public void setPartJade(PartJade partJade) {
        block13: {
            IiiiiiiiIIIII = this.getSuit((int)partJade.getSuitid());
            if (IiiiiiiiIIIII != null && !IiiiiiiiIIIII.equals("")) break block13;
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII.append(partJade.getSuitid());
            IiiiiiiiIIIII.append("-");
            IiiiiiiiIIIII.append(partJade.getPartId());
            IiiiiiiiIIIII = 1;
            if (true) ** GOTO lbl23
        }
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII = IiiiiiiiIIIII.split("\\|");
        IiiiiiiiIIIII = true;
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl66
        do {
            IiiiiiiiIIIII.append("_");
            IiiiiiiiIIIII.append(partJade.getJade(IiiiiiiiIIIII++));
lbl23:
            // 2 sources

        } while (IiiiiiiiIIIII < 6);
        this.setSuit((int)partJade.getSuitid(), IiiiiiiiIIIII.toString());
        return;
        do {
            var7_9 = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
            IiiiiiiiIIIII = Integer.parseInt((String)IiiiiiiiIIIII[0]);
            if (partJade.getSuitid() != (long)IiiiiiiiIIIII) {
                if (IiiiiiiiIIIII != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII]);
            } else {
                if (IiiiiiiiIIIII != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII = false;
                IiiiiiiiIIIII = true;
                IiiiiiiiIIIII.append((String)IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII = 1;
                while (IiiiiiiiIIIII < ((void)IiiiiiiiIIIII).length) {
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].split("_")[0]);
                    if (partJade.getPartId() != IiiiiiiiIIIII) {
                        IiiiiiiiIIIII.append("-");
                        IiiiiiiiIIIII.append((String)IiiiiiiiIIIII[IiiiiiiiIIIII]);
                    } else {
                        IiiiiiiiIIIII = false;
                        if (!partJade.ALLATORIxDEMO()) {
                            IiiiiiiiIIIII.append("-");
                            IiiiiiiiIIIII.append(partJade.toString());
                        }
                    }
                    ++IiiiiiiiIIIII;
                }
                if (IiiiiiiiIIIII && !partJade.ALLATORIxDEMO()) {
                    IiiiiiiiIIIII.append("-");
                    IiiiiiiiIIIII.append(partJade.toString());
                }
            }
            ++IiiiiiiiIIIII;
lbl66:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        if (IiiiiiiiIIIII) {
            IiiiiiiiIIIII.append("|");
            IiiiiiiiIIIII.append(partJade.getSuitid());
            if (!partJade.ALLATORIxDEMO()) {
                IiiiiiiiIIIII.append("-");
                IiiiiiiiIIIII.append(partJade.toString());
            }
        }
        this.setSuit((int)partJade.getSuitid(), IiiiiiiiIIIII.toString());
    }

    public long getStarSoulType(int id) {
        String IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.starSoul, (String)(String.valueOf(id) + "="), (String)"|");
        if (IiiiiiiiIIIII == null) return 0L;
        if (IiiiiiiiIIIII.equals("")) return 0L;
        return Long.parseLong(IiiiiiiiIIIII);
    }

    public void setStarSoulType(int id, long value) {
        this.starSoul = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.starSoul, (String)(String.valueOf(id) + "="), (String)"|", (String)(String.valueOf(id) + "=" + value));
    }

    public void setSuit8(String suit8) {
        this.suit8 = suit8;
    }

    public long getLabortype(int id) {
        String IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.labor, (String)(String.valueOf(id) + "="), (String)"|");
        if (IiiiiiiiIIIII == null) return 0L;
        if (IiiiiiiiIIIII.equals("")) return 0L;
        return Long.parseLong(IiiiiiiiIIIII);
    }

    public void setSuit4(String suit4) {
        this.suit4 = suit4;
    }

    public String ALLATORIxDEMO(String id) {
        if (this.ALLATORIxDEMO(id)) {
            return this.tx;
        }
        this.tx = this.tx == null || this.tx.equals("") ? id : String.valueOf(this.tx) + "|" + id;
        return this.tx;
    }

    public String getSuit4() {
        return this.suit4;
    }

    public String getSuit9() {
        return this.suit9;
    }

    public void setOtherValue(String head, String value) {
        this.lCard = IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.lCard, (String)head, (String)"|", (String)value);
    }

    public void setSuit1(String suit1) {
        this.suit1 = suit1;
    }

    public void setStarSoulType(String data) {
        int IiiiiiiiIIIII = data.indexOf("=");
        this.starSoul = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.starSoul, (String)data.substring(0, IiiiiiiiIIIII), (String)"|", (String)data);
    }

    public void setSuit10(String suit10) {
        this.suit10 = suit10;
    }

    public String getCollect() {
        return this.collect;
    }

    /*
     * Unable to fully structure code
     */
    public String ALLATORIxDEMO(int suitId, int partId) {
        if (this.collect == null) return null;
        if (this.collect.equals("")) {
            return null;
        }
        IiiiiiiiIIIII = this.collect.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
            if (suitId != IiiiiiiiIIIII) {
                ++IiiiiiiiIIIII;
                continue;
            }
            IiiiiiiiIIIII = 1;
            if (true) ** GOTO lbl20
        }
        if (this.suitNum > IiiiiiiiIIIII.length) return null;
        return "\u8fbe\u5230\u6700\u5927\u6536\u5f55\u6570";
        do {
            if (Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII]) == partId) {
                return "\u4e0d\u80fd\u91cd\u590d\u6536\u5f55";
            }
            ++IiiiiiiiIIIII;
lbl20:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        return null;
    }

    public String getHelpLing() {
        return this.helpLing;
    }

    public void setShortCutSkills(String data) {
        this.equip = IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.equip, (String)"JN", (String)"|", (String)data);
    }

    public String getSuit8() {
        return this.suit8;
    }

    public boolean ALLATORIxDEMO(String id) {
        if (this.tx == null) return false;
        if (this.tx.equals("")) {
            return false;
        }
        String[] IiiiiiiiIIIII = this.tx.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].endsWith("#")) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2] = IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(0, IiiiiiiiIIIII[IiiiiiiiIIIII2].length() - 1);
            }
            if (id.equals(IiiiiiiiIIIII[IiiiiiiiIIIII2])) {
                return true;
            }
            ++IiiiiiiiIIIII2;
        }
        return false;
    }

    public String getRecord() {
        return this.record;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public void setEquip(String type, String data) {
        this.equip = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.equip, (String)type, (String)"|", (String)data);
    }

    public void setHelpBb(String helpBb) {
        this.helpBb = helpBb;
    }

    public void setHelpLing(String helpLing) {
        this.helpLing = helpLing;
    }

    public String ALLATORIxDEMO(String ... ps) {
        if (this.tx == null) return this.tx;
        if (this.tx.equals("")) {
            return this.tx;
        }
        String[] IiiiiiiiIIIII = this.tx.split("\\|");
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3];
            if (IiiiiiiiIIIII4.endsWith("#")) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII4.substring(0, IiiiiiiiIIIII4.length() - 1);
            }
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < ps.length) {
                if (IiiiiiiiIIIII4.equals(ps[IiiiiiiiIIIII5])) {
                    IiiiiiiiIIIII4 = String.valueOf(IiiiiiiiIIIII4) + "#";
                    break;
                }
                ++IiiiiiiiIIIII5;
            }
            if (IiiiiiiiIIIII2.length() != 0) {
                IiiiiiiiIIIII2.append("|");
            }
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII4);
        }
        this.tx = IiiiiiiiIIIII2.toString();
        return this.tx;
    }

    public int getCollectionNum(PartJade partJade, IiiiiiiiiIIII objectArea) {
        int[] IiiiiiiiIIIII = objectArea.ALLATORIxDEMO((int)partJade.getSuitid()).getParts();
        String[] IiiiiiiiIIIII2 = this.getCollect((int)partJade.getSuitid());
        if (IiiiiiiiIIIII2 == null) {
            return 0;
        }
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.length) {
            String IiiiiiiiIIIII5 = String.valueOf(IiiiiiiiIIIII[IiiiiiiiIIIII4]);
            int IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII6 < IiiiiiiiIIIII2.length) {
                if (!IiiiiiiiIIIII2[IiiiiiiiIIIII6].equals(IiiiiiiiIIIII5)) {
                    ++IiiiiiiiIIIII6;
                    continue;
                }
                ++IiiiiiiiIIIII3;
                break;
            }
            ++IiiiiiiiIIIII4;
        }
        return IiiiiiiiIIIII3;
    }

    public void setStarSoul(String starSoul) {
        this.starSoul = starSoul;
    }

    public void setCollect(int suitid, int partId) {
        if (this.collect == null || this.collect.equals("")) {
            this.collect = String.valueOf(suitid) + "-" + partId;
            return;
        }
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        String[] IiiiiiiiIIIII2 = this.collect.split("\\|");
        boolean IiiiiiiiIIIII3 = true;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.length) {
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII4].split("-");
            int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII5[0]);
            if (suitid != IiiiiiiiIIIII6) {
                if (IiiiiiiiIIIII4 != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII2[IiiiiiiiIIIII4]);
            } else {
                if (IiiiiiiiIIIII4 != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII3 = false;
                boolean IiiiiiiiIIIII7 = true;
                IiiiiiiiIIIII.append(IiiiiiiiIIIII5[0]);
                int IiiiiiiiIIIII8 = 1;
                while (IiiiiiiiIIIII8 < IiiiiiiiIIIII5.length) {
                    int IiiiiiiiIIIII9 = Integer.parseInt(IiiiiiiiIIIII5[IiiiiiiiIIIII8]);
                    if (partId != IiiiiiiiIIIII9) {
                        IiiiiiiiIIIII.append("-");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII5[IiiiiiiiIIIII8]);
                    } else {
                        IiiiiiiiIIIII7 = false;
                    }
                    ++IiiiiiiiIIIII8;
                }
                if (IiiiiiiiIIIII7) {
                    IiiiiiiiIIIII.append("-");
                    IiiiiiiiIIIII.append(partId);
                }
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII3) {
            IiiiiiiiIIIII.append("|");
            IiiiiiiiIIIII.append(suitid);
            IiiiiiiiIIIII.append("-");
            IiiiiiiiIIIII.append(partId);
        }
        this.collect = IiiiiiiiIIIII.toString();
    }

    public String getSuit10() {
        return this.suit10;
    }

    public int getEquipType() {
        String IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((String)this.equip, (String)"EO", (String)"|");
        if (IiiiiiiiIIIII == null) return 0;
        if (IiiiiiiiIIIII.equals("")) return 0;
        return Integer.parseInt(IiiiiiiiIIIII);
    }

    public int getSuitNum() {
        return this.suitNum;
    }

    public PartJade getPartJade(int suitid, int partId) {
        PartJade IiiiiiiiIIIII = new PartJade((long)suitid, partId);
        String IiiiiiiiIIIII2 = this.getSuit(suitid);
        if (IiiiiiiiIIIII2 == null) return IiiiiiiiIIIII;
        if (IiiiiiiiIIIII2.equals("")) {
            return IiiiiiiiIIIII;
        }
        String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII2.split("\\|");
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII3[IiiiiiiiIIIII4].split("-");
            int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII5[0]);
            if (suitid == IiiiiiiiIIIII6) {
                int IiiiiiiiIIIII7 = 1;
                while (IiiiiiiiIIIII7 < IiiiiiiiIIIII5.length) {
                    String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII5[IiiiiiiiIIIII7].split("_");
                    int IiiiiiiiIIIII9 = Integer.parseInt(IiiiiiiiIIIII8[0]);
                    if (partId == IiiiiiiiIIIII9) {
                        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII8);
                        return IiiiiiiiIIIII;
                    }
                    ++IiiiiiiiIIIII7;
                }
            }
            ++IiiiiiiiIIIII4;
        }
        return IiiiiiiiIIIII;
    }
}
