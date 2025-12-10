/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Skill
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.entity;

import com.xy.readbean.Skill;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIiIi;
import java.math.BigDecimal;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Lingbao {
    private String skills;
    private BigDecimal lingbaoexe;
    private String baoreply;
    private String fushis;
    private String baoname;
    private int skillsum;
    private String baoap;
    private String baotype;
    private int fusum;
    private String assistance;
    private String baoquality;
    private String kangxing;
    private String baoshot;
    private BigDecimal lingbaolvl;
    private int equipment;
    private String baospeed;
    private String skin;
    private BigDecimal roleid;
    private String operation;
    private long lingbaoqihe;
    private Integer baoactive;
    private String gethard;
    private BigDecimal baoid;
    private String goodskill;
    private String resistshot;
    private String tianfuskill;

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public int iIiIiiiiIIiii(int path) {
        if (this.skillsum > path) return -1;
        return this.skillsum + 1;
    }

    public void setBaoname(String baoname) {
        this.baoname = baoname;
    }

    public void setLingbaoexe(BigDecimal lingbaoexe) {
        this.lingbaoexe = lingbaoexe;
    }

    public void setFushis(String fushis) {
        this.fushis = fushis;
    }

    public int getFusum() {
        return this.fusum;
    }

    public int getEquipment() {
        return this.equipment;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setSkillsum(int skillsum) {
        this.skillsum = skillsum;
    }

    public void setLingbaoqihe(long lingbaoqihe) {
        this.lingbaoqihe = lingbaoqihe;
    }

    public String getBaoname() {
        return this.baoname;
    }

    public void setAssistance(String assistance) {
        this.assistance = assistance;
    }

    public String getGoodskill() {
        return this.goodskill;
    }

    public void setResistshop(String resistshop) {
        this.resistshot = resistshop;
    }

    public int ALLATORIxDEMO(int path) {
        if (this.fusum > path) return -1;
        return this.fusum + 1;
    }

    /*
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(Skill skill, GameView gameView) {
        block6: {
            IiiiiiiiIIIII = Integer.parseInt(skill.getSkilltype());
            if (IiiiiiiiIIIII == 0 && !this.baotype.equals("\u653b\u51fb")) {
                gameView.iiiIiiiiiiIIi("\u5b66\u4e60\u6280\u80fd\u5931\u8d25,\u65e0\u6cd5\u5b66\u4e60\u8be5\u7c7b\u578b\u7684\u6280\u80fd");
                return false;
            }
            if (IiiiiiiiIIIII == 1 && !this.baotype.equals("\u8f85\u52a9")) {
                gameView.iiiIiiiiiiIIi("\u5b66\u4e60\u6280\u80fd\u5931\u8d25,\u65e0\u6cd5\u5b66\u4e60\u8be5\u7c7b\u578b\u7684\u6280\u80fd");
                return false;
            }
            if (IiiiiiiiIIIII == 2 && !this.baotype.equals("\u843d\u5b9d")) {
                gameView.iiiIiiiiiiIIi("\u5b66\u4e60\u6280\u80fd\u5931\u8d25,\u65e0\u6cd5\u5b66\u4e60\u8be5\u7c7b\u578b\u7684\u6280\u80fd");
                return false;
            }
            IiiiiiiiIIIII = skill.getSkillname();
            IiiiiiiiIIIII = skill.getSkilllevel();
            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.substring(0, 1));
            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.substring(1, 2));
            if ((this.skills == null || this.skills.equals("")) && this.skillsum > 0) {
                this.skills = String.valueOf(IiiiiiiiIIIII) + "=" + (IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII - IiiiiiiiIIIII + 1) + IiiiiiiiIIIII);
                return true;
            }
            if (this.skills == null || this.skills.equals("") || this.skillsum <= this.skills.split("\\|").length) break block6;
            IiiiiiiiIIIII = this.skills.split("\\|");
            IiiiiiiiIIIII = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII - IiiiiiiiIIIII + 1) + IiiiiiiiIIIII;
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII) + "=" + IiiiiiiiIIIII;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl32
        }
        gameView.iiiIiiiiiiIIi("\u5b66\u4e60\u6280\u80fd\u5931\u8d25,\u6280\u80fd\u683c\u5b50\u5df2\u6ee1");
        return false;
        do {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII].equals(IiiiiiiiIIIII)) {
                gameView.iiiIiiiiiiIIi("\u5b66\u4e60\u6280\u80fd\u5931\u8d25,\u6280\u80fd\u91cd\u590d");
                return false;
            }
            ++IiiiiiiiIIIII;
lbl32:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        this.skills = String.valueOf(this.skills) + "|" + IiiiiiiiIIIII;
        return true;
    }

    public String getBaospeed() {
        return this.baospeed;
    }

    public String getTianfuskill() {
        return this.tianfuskill;
    }

    public BigDecimal getLingbaoexe() {
        return this.lingbaoexe;
    }

    public String getBaoreply() {
        return this.baoreply;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setGoodskill(String goodskill) {
        this.goodskill = goodskill;
    }

    public void ALLATORIxDEMO(boolean type) {
        if (type) {
            ++this.fusum;
            return;
        }
        ++this.skillsum;
    }

    public String getBaoquality() {
        return this.baoquality;
    }

    public BigDecimal ALLATORIxDEMO(int path) {
        if (this.fushis == null) return null;
        if (this.fushis.equals("")) return null;
        String[] IiiiiiiiIIIII = this.fushis.split("\\|");
        if (IiiiiiiiIIIII.length <= path) return null;
        return new BigDecimal(IiiiiiiiIIIII[path]);
    }

    public String iIiIiiiiIIiii(int path) {
        if (this.skills == null) return null;
        if (this.skills.equals("")) return null;
        String[] IiiiiiiiIIIII = this.skills.split("\\|");
        if (IiiiiiiiIIIII.length <= path) return null;
        return IiiiiiiiIIIII[path];
    }

    public void setGethard(String gethard) {
        this.gethard = gethard;
    }

    public BigDecimal getLingbaolvl() {
        return this.lingbaolvl;
    }

    public void setBaoap(String baoap) {
        this.baoap = baoap;
    }

    public void ALLATORIxDEMO(String id) {
        int IiiiiiiiIIIII;
        String[] IiiiiiiiIIIII2;
        ArrayList<String> IiiiiiiiIIIII3 = new ArrayList<String>();
        boolean IiiiiiiiIIIII4 = true;
        if (this.fushis != null && !this.fushis.equals("")) {
            IiiiiiiiIIIII2 = this.fushis.split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII2.length) {
                if (!IiiiiiiiIIIII2[IiiiiiiiIIIII].equals(id)) {
                    IiiiiiiiIIIII3.add(IiiiiiiiIIIII2[IiiiiiiiIIIII]);
                } else {
                    IiiiiiiiIIIII4 = false;
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (IiiiiiiiIIIII4) {
            IiiiiiiiIIIII3.add(id);
        }
        IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII3.size()) {
            if (!IiiiiiiiIIIII2.toString().equals("")) {
                IiiiiiiiIIIII2.append("|" + (String)IiiiiiiiIIIII3.get(IiiiiiiiIIIII));
            } else {
                IiiiiiiiIIIII2.append((String)IiiiiiiiIIIII3.get(IiiiiiiiIIIII));
            }
            ++IiiiiiiiIIIII;
        }
        this.fushis = IiiiiiiiIIIII2.toString();
    }

    public String getBaoap() {
        return this.baoap;
    }

    public void setBaoactive(Integer baoactive) {
        this.baoactive = baoactive;
    }

    public void setBaoid(BigDecimal baoid) {
        this.baoid = baoid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public int getSkillsum() {
        return this.skillsum;
    }

    public void setLingbaolvl(BigDecimal lingbaolvl) {
        this.lingbaolvl = lingbaolvl;
    }

    public String getBaotype() {
        return this.baotype;
    }

    public void setKangxing(String kangxing) {
        this.kangxing = kangxing;
    }

    public void setBaoshot(String baoshot) {
        this.baoshot = baoshot;
    }

    public double getBaoshot() {
        return Double.parseDouble(this.baoshot);
    }

    public void setBaoquality(String baoquality) {
        this.baoquality = baoquality;
    }

    public BigDecimal getBaoid() {
        return this.baoid;
    }

    public String getOperation() {
        return this.operation;
    }

    public String getGethard() {
        return this.gethard;
    }

    public String ALLATORIxDEMO(int path) {
        if (this.skills == null) return null;
        if (this.skills.equals("")) return null;
        String[] IiiiiiiiIIIII = this.skills.split("\\|");
        if (IiiiiiiiIIIII.length <= path) return null;
        return IiiiiiiiIIIII[path];
    }

    public double getAssistance() {
        return Double.parseDouble(this.assistance);
    }

    public long getLingbaoqihe() {
        return this.lingbaoqihe;
    }

    public String getFushis() {
        return this.fushis;
    }

    public void setFusum(int fusum) {
        this.fusum = fusum;
    }

    public boolean ALLATORIxDEMO(String v) {
        if (this.goodskill == null) return false;
        if (this.goodskill.equals("")) {
            return false;
        }
        String[] IiiiiiiiIIIII = this.goodskill.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].equals(v)) {
                return true;
            }
            ++IiiiiiiiIIIII2;
        }
        return false;
    }

    public String getKangxing() {
        return this.kangxing;
    }

    public double getResistshop() {
        return Double.parseDouble(this.resistshot);
    }

    public void setBaospeed(String baospeed) {
        this.baospeed = baospeed;
    }

    public Integer getBaoactive() {
        return this.baoactive;
    }

    public void setEquipment(int equipment) {
        this.equipment = equipment;
    }

    public String getSkin() {
        return this.skin;
    }

    public String getSkills() {
        return this.skills;
    }

    public void setBaotype(String baotype) {
        this.baotype = baotype;
    }

    public void setTianfuskill(String tianfuskill) {
        this.tianfuskill = tianfuskill;
    }

    public void setBaoreply(String baoreply) {
        this.baoreply = baoreply;
    }
}
