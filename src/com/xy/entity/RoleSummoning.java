/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.BaseValue
 *  com.xy.readbean.ColorScheme
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Skill
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiIiIiiiiiIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.entity;

import com.xy.formula.BaseValue;
import com.xy.readbean.ColorScheme;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiIiIiiiiiIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RoleSummoning {
    private BigDecimal roleid;
    private String wood;
    private Integer bone;
    private String fire;
    private int basismp;
    private String resistance;
    private int flyupNum;
    private String gold;
    private String ssn;
    private String lyk;
    private Integer calm;
    private int mp;
    private int basishp;
    private Integer spir;
    private BigDecimal exp;
    private String stye;
    private int dragon;
    private Integer grade;
    private String petSkills;
    private Integer speed;
    private Integer faithful;
    private String soil;
    private String beastSkills;
    private int ap;
    private int trainNum;
    private int revealNum;
    private int growUpDanNum;
    private String zqk;
    private Long friendliness;
    private int sp;
    private int alchemynum;
    private String skill;
    private String growlevel;
    private String skillData;
    private Integer openSeal;
    private String fourattributes;
    private String summoningid;
    private String water;
    private String ColorScheme;
    private Integer power;
    private String summoningskin;
    private BigDecimal sid;
    private String summoningname;
    private String innerGoods;
    private int draC;
    private int petlock;
    private int hp;

    public String getColorScheme() {
        return this.ColorScheme;
    }

    public void setColorScheme(String colorScheme) {
        this.ColorScheme = colorScheme;
    }

    public void setPower(Integer power) {
        this.power = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)power.intValue());
    }

    public void setCalm(Integer calm) {
        this.calm = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)calm.intValue());
    }

    public int getCanpoint() {
        int IiiiiiiiIIIII = this.getGrade();
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.IIIIIiiiiIIii((int)IiiiiiiiIIIII);
        IiiiiiiiIIIII = IiiiIiiiiIIII.iiiiiiiiIIiii((int)IiiiiiiiIIIII);
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII * 8;
        if (IiiiiiiiIIIII2 >= 4) {
            IiiiiiiiIIIII3 += IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII3 += IiiiiiiiIIIII2 * 30;
        IiiiiiiiIIIII3 -= this.getBone().intValue();
        IiiiiiiiIIIII3 -= this.getSpir().intValue();
        IiiiiiiiIIIII3 -= this.getPower().intValue();
        IiiiiiiiIIIII3 -= this.getSpeed().intValue();
        return IiiiiiiiIIIII3 -= this.getCalm().intValue();
    }

    public void setSpeed(Integer speed) {
        this.speed = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)speed.intValue());
    }

    public void setWater(String water) {
        this.water = water;
    }

    public int getExtra(String type, GameView gameView) {
        if (this.stye == null) return 0;
        if (this.stye.length() <= 1) {
            return 0;
        }
        type = String.valueOf(type) + "=";
        int IiiiiiiiIIIII = 0;
        String[] IiiiiiiiIIIII2 = this.stye.split("\\|");
        int IiiiiiiiIIIII3 = 1;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            Goodstable IiiiiiiiIIIII4;
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("-");
            if (IiiiiiiiIIIII5.length >= 2 && (IiiiiiiiIIIII4 = gameView.roleData.getGood(new BigDecimal(IiiiiiiiIIIII5[1]))) != null) {
                String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getValue().split("\\|");
                int IiiiiiiiIIIII7 = 0;
                while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
                    if (IiiiiiiiIIIII6[IiiiiiiiIIIII7].startsWith(type)) {
                        String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII6[IiiiiiiiIIIII7].split("=");
                        IiiiiiiiIIIII += Integer.parseInt(IiiiiiiiIIIII8[1]);
                    }
                    ++IiiiiiiiIIIII7;
                }
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    public int getRevealNum() {
        return this.revealNum;
    }

    public void setInnerGoods(String innerGoods) {
        this.innerGoods = innerGoods;
    }

    public String getSsn() {
        return this.ssn;
    }

    public int getGrowUpDanNum() {
        return this.growUpDanNum;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    /*
     * WARNING - void declaration
     */
    public void setZBone(Integer n, GameView gameView) {
        void gameView2;
        this.setBone(n - this.getExtra("\u6839\u9aa8", (GameView)gameView2));
    }

    public void setFriendliness(Long friendliness) {
        if (friendliness > 20000000L) {
            friendliness = 20000000L;
        }
        this.friendliness = IiIiIiiiiiIiI.ALLATORIxDEMO((long)friendliness);
    }

    public String getWater() {
        if (this.water != null) {
            if (!this.water.equals("")) return this.water;
        }
        this.water = "0";
        return this.water;
    }

    public String getFire() {
        if (this.fire != null) {
            if (!this.fire.equals("")) return this.fire;
        }
        this.fire = "0";
        return this.fire;
    }

    public void setLxGZ(int lxGZ) {
        String IiiiiiiiIIIII = this.getSkillValue("L");
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = String.valueOf(lxGZ) + "=" + 0;
        } else {
            StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.indexOf("=");
            IiiiiiiiIIIII2.append(lxGZ);
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII.substring(IiiiiiiiIIIII3));
            IiiiiiiiIIIII = IiiiiiiiIIIII2.toString();
        }
        this.setSkillValue("L", IiiiiiiiIIIII);
    }

    public int getDraC() {
        return this.draC;
    }

    public void setOpenSeal(Integer openSeal) {
        this.openSeal = openSeal;
    }

    public void setBeastSkills(String beastSkills) {
        this.beastSkills = beastSkills;
    }

    public Integer getOpenSeal() {
        return this.openSeal;
    }

    public boolean ALLATORIxDEMO(String id) {
        if (this.skill == null) return false;
        if (this.skill.equals("")) {
            return false;
        }
        if (this.skill.equals(id)) {
            return true;
        }
        if (this.skill.startsWith(String.valueOf(id) + "|")) {
            return true;
        }
        if (this.skill.endsWith("|" + id)) {
            return true;
        }
        if (this.skill.indexOf("|" + id + "|") == -1) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public void setZSpir(Integer n, GameView gameView) {
        void gameView2;
        this.setSpir(n - this.getExtra("\u7075\u6027", (GameView)gameView2));
    }

    public int getXYLvl() {
        String IiiiiiiiIIIII = this.getSkillValue("X");
        if (IiiiiiiiIIIII != null) int IiiiiiiiIIIII2;
        return Integer.parseInt((IiiiiiiiIIIII2 = IiiiiiiiIIIII.indexOf("=")) != -1 ? IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII2) : IiiiiiiiIIIII);
        return 0;
    }

    public void setPetSkills(String petSkills) {
        this.petSkills = petSkills;
    }

    public void setAp(int ap) {
        this.ap = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)ap);
    }

    public int getDragon() {
        return this.dragon;
    }

    public int getFlyupNum() {
        return this.flyupNum;
    }

    public int getTurnRount() {
        return IiiiIiiiiIIII.IIIIIiiiiIIii((int)this.getGrade());
    }

    public void setHp(int hp) {
        this.hp = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)hp);
    }

    public String getSkill() {
        return this.skill;
    }

    public Integer getSpeed() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.speed.intValue());
    }

    public int getHp() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.hp);
    }

    public String getZqk() {
        return this.zqk;
    }

    public String getGold() {
        if (this.gold != null) {
            if (!this.gold.equals("")) return this.gold;
        }
        this.gold = "0";
        return this.gold;
    }

    public Integer getSpir() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.spir.intValue());
    }

    public void setGrowUpDanNum(int growUpDanNum) {
        this.growUpDanNum = growUpDanNum;
    }

    public Integer getPower() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.power.intValue());
    }

    public Integer getZSpeed(GameView gameView) {
        return this.getSpeed() + this.getExtra("\u654f\u6377", gameView);
    }

    public Integer getZCalm(GameView gameView) {
        return this.getCalm() + this.getExtra("\u5b9a\u529b", gameView);
    }

    public String getWood() {
        if (this.wood != null) {
            if (!this.wood.equals("")) return this.wood;
        }
        this.wood = "0";
        return this.wood;
    }

    public void setDragon(int dragon) {
        this.dragon = dragon;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getInnerGoods() {
        return this.innerGoods;
    }

    public void setStye(String stye) {
        this.stye = stye;
    }

    public Integer getZPower(GameView gameView) {
        return this.getPower() + this.getExtra("\u529b\u91cf", gameView);
    }

    public String getFourattributes() {
        return this.fourattributes;
    }

    public void setAlchemynum(int alchemynum) {
        this.alchemynum = alchemynum;
    }

    public BigDecimal getSid() {
        return this.sid;
    }

    public int getAlchemynum() {
        return this.alchemynum;
    }

    public void setFlyupNum(int flyupNum) {
        this.flyupNum = flyupNum;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public BigDecimal getExp() {
        return new BigDecimal(IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.exp.longValue()));
    }

    public Integer getGrade() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.grade.intValue());
    }

    public BigDecimal ALLATORIxDEMO(Goodstable goodstable, int type, GameView gameView) {
        Object IiiiiiiiIIIII;
        if ((this.stye == null || this.stye.length() <= 1) && goodstable == null) {
            return null;
        }
        BigDecimal IiiiiiiiIIIII2 = null;
        String IiiiiiiiIIIII3 = String.valueOf(type);
        String[] IiiiiiiiIIIII4 = this.stye.split("\\|");
        StringBuffer IiiiiiiiIIIII5 = new StringBuffer();
        IiiiiiiiIIIII5.append(IiiiiiiiIIIII4[0]);
        int IiiiiiiiIIIII6 = 1;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII4[IiiiiiiiIIIII6].split("-");
            if (IiiiiiiiIIIII3.equals(IiiiiiiiIIIII[0])) {
                IiiiiiiiIIIII2 = new BigDecimal(IiiiiiiiIIIII[1]);
            } else {
                IiiiiiiiIIIII5.append("|");
                IiiiiiiiIIIII5.append(IiiiiiiiIIIII4[IiiiiiiiIIIII6]);
            }
            ++IiiiiiiiIIIII6;
        }
        if (goodstable != null) {
            IiiiiiiiIIIII5.append("|");
            IiiiiiiiIIIII5.append(type);
            IiiiiiiiIIIII5.append("-");
            IiiiiiiiIIIII5.append(goodstable.getRgid());
            String IiiiiiiiIIIII7 = null;
            IiiiiiiiIIIII = null;
            if (type == 3) {
                String[] IiiiiiiiIIIII8 = goodstable.getValue().split("\\|");
                int IiiiiiiiIIIII9 = 0;
                while (IiiiiiiiIIIII9 < IiiiiiiiIIIII8.length) {
                    int IiiiiiiiIIIII10 = IiiiiiiiIIIII8[IiiiiiiiIIIII9].indexOf("=");
                    if (IiiiiiiiIIIII10 != -1) {
                        String IiiiiiiiIIIII11 = IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(0, IiiiiiiiIIIII10);
                        if (IiiiiiiiIIIII11.equals("\u76ae\u80a4")) {
                            IiiiiiiiIIIII7 = IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII10 + 1);
                        } else if (IiiiiiiiIIIII11.equals("\u989c\u8272")) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII10 + 1);
                        } else if (IiiiiiiiIIIII7 == null && IiiiiiiiIIIII11.equals("\u54c1\u8d28") && gameView.getClient().gameType == 2) {
                            IiiiiiiiIIIII7 = IiiiiiiiIIIII8[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII10 + 1);
                            IiiiiiiiIIIII7 = IiiiiiiiIIIII7.equals("3924") ? "FULL" : null;
                        }
                    }
                    ++IiiiiiiiIIIII9;
                }
                if (IiiiiiiiIIIII7 != null) {
                    IiiiiiiiIIIII5.append("-");
                    IiiiiiiiIIIII5.append(IiiiiiiiIIIII7);
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII5.append("-");
                        IiiiiiiiIIIII5.append((String)IiiiiiiiIIIII);
                    }
                }
            }
        }
        this.stye = IiiiiiiiIIIII5.toString();
        return IiiiiiiiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public void setZSpeed(Integer n, GameView gameView) {
        void gameView2;
        this.setSpeed(n - this.getExtra("\u654f\u6377", (GameView)gameView2));
    }

    public void setPetlock(int petlock) {
        this.petlock = petlock;
    }

    public int getQLNum() {
        String IiiiiiiiIIIII = this.getSkillValue("Q");
        if (IiiiiiiiIIIII != null) return Integer.parseInt(IiiiiiiiIIIII);
        return 0;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public void setTrainNum(int trainNum) {
        this.trainNum = trainNum;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getBasishp() {
        return this.basishp;
    }

    public String getSoil() {
        if (this.soil != null) {
            if (!this.soil.equals("")) return this.soil;
        }
        this.soil = "0";
        return this.soil;
    }

    public void setGrowlevel(String growlevel) {
        this.growlevel = growlevel;
    }

    public int getTrainNum() {
        return this.trainNum;
    }

    public Integer getZBone(GameView gameView) {
        return this.getBone() + this.getExtra("\u6839\u9aa8", gameView);
    }

    public String getGrowlevel() {
        return this.growlevel;
    }

    public void ALLATORIxDEMO(Integer faithful) {
        if (faithful == null) {
            this.faithful = 0;
        }
        this.faithful = this.faithful + faithful;
        if (this.faithful < 0) {
            this.faithful = 0;
        }
        if (this.faithful <= 100) return;
        this.faithful = 100;
    }

    public void setSpir(Integer spir) {
        this.spir = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)spir.intValue());
    }

    public int getLxValue() {
        String IiiiiiiiIIIII = this.getSkillValue("L");
        if (IiiiiiiiIIIII == null) {
            return 0;
        }
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII.indexOf("=");
        if (IiiiiiiiIIIII2 == -1) {
            return 0;
        }
        if ((IiiiiiiiIIIII2 = (IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII2 + 1)).indexOf("=")) != -1) return Integer.parseInt(IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII2));
        return Integer.parseInt(IiiiiiiiIIIII);
    }

    public void setQLNum(int qlNum) {
        this.setSkillValue("Q", String.valueOf(qlNum));
    }

    public String getLx() {
        return this.getSkillValue("L");
    }

    public String getSummoningid() {
        return this.summoningid;
    }

    public String getSkillData() {
        return this.skillData;
    }

    public void setSp(int sp) {
        this.sp = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)sp);
    }

    public int getMp() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.mp);
    }

    public void setSkillData(String skillData) {
        this.skillData = skillData;
    }

    public int getBasishp(int max) {
        if (this.basishp != 0) return this.basishp;
        return max;
    }

    public void setSummoningname(String summoningname) {
        this.summoningname = summoningname;
    }

    public String getSummoningname() {
        return this.summoningname;
    }

    public void setZqk(String zqk) {
        this.zqk = zqk;
    }

    public void setSkillValue(String head, String value) {
        if (this.petSkills == null || this.petSkills.equals("")) {
            this.petSkills = String.valueOf(head) + value;
            return;
        }
        if (this.petSkills.startsWith(head)) {
            int IiiiiiiiIIIII = this.petSkills.indexOf("|");
            if (IiiiiiiiIIIII == -1) {
                this.petSkills = String.valueOf(head) + value;
                return;
            }
            this.petSkills = String.valueOf(head) + value + this.petSkills.substring(IiiiiiiiIIIII);
            return;
        }
        int IiiiiiiiIIIII = this.petSkills.indexOf("|" + head);
        if (IiiiiiiiIIIII == -1) {
            this.petSkills = String.valueOf(this.petSkills) + "|" + head + value;
            return;
        }
        String IiiiiiiiIIIII2 = this.petSkills.substring(0, IiiiiiiiIIIII);
        String IiiiiiiiIIIII3 = this.petSkills.substring(IiiiiiiiIIIII + 2);
        if ((IiiiiiiiIIIII = IiiiiiiiIIIII3.indexOf("|")) == -1) {
            this.petSkills = String.valueOf(IiiiiiiiIIIII2) + "|" + head + value;
            return;
        }
        this.petSkills = String.valueOf(IiiiiiiiIIIII2) + "|" + IiiiiiiiIIIII3.substring(IiiiiiiiIIIII + 1) + "|" + head + value;
    }

    public Long getFriendliness() {
        if (this.friendliness != null) return IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.friendliness);
        this.setFriendliness(0L);
        return IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.friendliness);
    }

    public Integer getBone() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.bone.intValue());
    }

    public String getSummoningskin() {
        return this.summoningskin;
    }

    public String getStye() {
        return this.stye;
    }

    /*
     * WARNING - void declaration
     */
    public void setExp(BigDecimal bigDecimal) {
        void exp;
        this.exp = new BigDecimal(IiIiIiiiiiIiI.ALLATORIxDEMO((long)exp.longValue()));
    }

    public void setFaithful(Integer faithful) {
        this.faithful = faithful;
    }

    public int getSp() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.sp);
    }

    public int getTFNum() {
        String IiiiiiiiIIIII = this.getSkillValue("T");
        if (IiiiiiiiIIIII != null) return Integer.parseInt(IiiiiiiiIIIII);
        return 0;
    }

    public void setBasismp(int basismp) {
        this.basismp = basismp;
    }

    public void setBasishp(int basishp) {
        this.basishp = basishp <= 0 ? 1 : basishp;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public BigDecimal getGoodId(int type) {
        if (this.stye == null) return null;
        if (this.stye.length() <= 1) {
            return null;
        }
        String IiiiiiiiIIIII = String.valueOf(type);
        String[] IiiiiiiiIIIII2 = this.stye.split("\\|");
        int IiiiiiiiIIIII3 = 1;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("-");
            if (IiiiiiiiIIIII.equals(IiiiiiiiIIIII4[0])) {
                return new BigDecimal(IiiiiiiiIIIII4[1]);
            }
            ++IiiiiiiiIIIII3;
        }
        return null;
    }

    public Integer getCalm() {
        if (this.calm != null) return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.calm.intValue());
        this.setCalm(0);
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.calm.intValue());
    }

    public int getPetlock() {
        return this.petlock;
    }

    public String getXy() {
        return this.getSkillValue("X");
    }

    public String getResistance() {
        return this.resistance;
    }

    public void getSI(int[] pets, int lvl, int zs, IiiiiiiiiIIII objectArea) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.skillData)) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.skillData.length()) {
            IiiiiiiiIIIII2 = this.skillData.indexOf("|", IiiiiiiiIIIII + 1);
            if (IiiiiiiiIIIII2 == -1) {
                IiiiiiiiIIIII2 = this.skillData.length();
            }
            if (this.skillData.charAt(IiiiiiiiIIIII + 2) == '=') {
                Skill IiiiiiiiIIIII3;
                if (this.skillData.charAt(IiiiiiiiIIIII + 1) == 'P') {
                    if (this.skillData.charAt(IiiiiiiiIIIII) == 'H') {
                        pets[0] = (int)((double)pets[0] + Double.parseDouble(this.skillData.substring(IiiiiiiiIIIII + 3, IiiiiiiiIIIII2)));
                    } else if (this.skillData.charAt(IiiiiiiiIIIII) == 'M') {
                        pets[1] = (int)((double)pets[1] + Double.parseDouble(this.skillData.substring(IiiiiiiiIIIII + 3, IiiiiiiiIIIII2)));
                    } else if (this.skillData.charAt(IiiiiiiiIIIII) == 'A') {
                        pets[2] = (int)((double)pets[2] + Double.parseDouble(this.skillData.substring(IiiiiiiiIIIII + 3, IiiiiiiiIIIII2)));
                    } else if (this.skillData.charAt(IiiiiiiiIIIII) == 'S') {
                        pets[3] = (int)((double)pets[3] + Double.parseDouble(this.skillData.substring(IiiiiiiiIIIII + 3, IiiiiiiiIIIII2)));
                    }
                } else if (this.skillData.charAt(IiiiiiiiIIIII + 1) == 'S' && (IiiiiiiiIIIII3 = objectArea.iIiIiiiiIIiii(this.skillData.substring(IiiiiiiiIIIII + 3, IiiiiiiiIIIII2))) != null) {
                    double IiiiiiiiIIIII4 = Double.parseDouble(IiiiiiiiIIIII3.getValue());
                    double IiiiiiiiIIIII5 = Double.parseDouble(IiiiiiiiIIIII3.getGrow());
                    if (this.skillData.charAt(IiiiiiiiIIIII) == 'H') {
                        pets[0] = (int)((double)pets[0] + BaseValue.ALLATORIxDEMO((double)IiiiiiiiIIIII4, (double)IiiiiiiiIIIII5, (long)this.getFriendliness(), (int)lvl, (int)zs));
                    } else if (this.skillData.charAt(IiiiiiiiIIIII) == 'M') {
                        pets[1] = (int)((double)pets[1] + BaseValue.ALLATORIxDEMO((double)IiiiiiiiIIIII4, (double)IiiiiiiiIIIII5, (long)this.getFriendliness(), (int)lvl, (int)zs));
                    } else if (this.skillData.charAt(IiiiiiiiIIIII) == 'A') {
                        pets[2] = (int)((double)pets[2] + BaseValue.ALLATORIxDEMO((double)IiiiiiiiIIIII4, (double)IiiiiiiiIIIII5, (long)this.getFriendliness(), (int)lvl, (int)zs));
                    } else if (this.skillData.charAt(IiiiiiiiIIIII) == 'S') {
                        pets[3] = (int)((double)pets[3] + BaseValue.ALLATORIxDEMO((double)IiiiiiiiIIIII4, (double)IiiiiiiiIIIII5, (long)this.getFriendliness(), (int)lvl, (int)zs));
                    }
                }
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
    }

    public Integer getZSpir(GameView gameView) {
        return this.getSpir() + this.getExtra("\u7075\u6027", gameView);
    }

    public IiiiIiiiiIiIi getPart(GameView gameView) {
        String IiiiiiiiIIIII = this.summoningskin;
        String IiiiiiiiIIIII2 = this.ColorScheme;
        String IiiiiiiiIIIII3 = this.getAdornPart(gameView.getObjectArea());
        String IiiiiiiiIIIII4 = null;
        if (IiiiiiiiIIIII3 != null) {
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII3.indexOf("|");
            if (IiiiiiiiIIIII5 != -1) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII3.substring(IiiiiiiiIIIII5 + 1);
                IiiiiiiiIIIII3 = IiiiiiiiIIIII3.substring(0, IiiiiiiiIIIII5);
            }
            if (IiiiiiiiIIIII3.equals("FULL")) {
                IiiiiiiiIIIII3 = null;
                IiiiiiiiIIIII4 = null;
                if (IiiiiiiiIIIII.equals("500014")) {
                    IiiiiiiiIIIII = "11022";
                    IiiiiiiiIIIII2 = null;
                } else if (IiiiiiiiIIIII.equals("400506")) {
                    IiiiiiiiIIIII = "11023";
                    IiiiiiiiIIIII2 = null;
                } else if (IiiiiiiiIIIII.equals("400171")) {
                    IiiiiiiiIIIII = "11024";
                    IiiiiiiiIIIII2 = null;
                } else if (IiiiiiiiIIIII.equals("400315")) {
                    IiiiiiiiIIIII = "11025";
                    IiiiiiiiIIIII2 = null;
                }
            }
        }
        IiiiIiiiiIiIi IiiiiiiiIIIII6 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)7, (int)1, (String)IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 == null) return IiiiiiiiIIIII6;
        IiiiiiiiIIIII6 = IiiiiiiiIIIII6.ALLATORIxDEMO(iiiiiiiiiiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII3, (int)7, (int)1, (String)IiiiiiiiIIIII4));
        return IiiiiiiiIIIII6;
    }

    public void setSummoningid(String summoningid) {
        this.summoningid = summoningid;
    }

    public void setGrade(Integer grade) {
        this.grade = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)grade.intValue());
    }

    public int getBasismp(int max) {
        if (this.basismp != 0) return this.basismp;
        return max;
    }

    public int getOpenSealByType(int type) {
        if (type == 0) {
            return this.openSeal & 0x3F;
        }
        if (type == 1) {
            return this.openSeal >> 6 & 0x3F;
        }
        if (type != 2) return this.openSeal & 0x3F;
        return this.openSeal >> 12 & 0xFF;
    }

    public int getBasismp() {
        return this.basismp;
    }

    public void setSummoningskin(String summoningskin) {
        this.summoningskin = summoningskin;
    }

    public String getBeastSkills() {
        return this.beastSkills;
    }

    public String getLyk() {
        return this.lyk;
    }

    public void setDraC(int draC) {
        this.draC = draC;
    }

    public Integer getFaithful() {
        return this.faithful;
    }

    /*
     * WARNING - void declaration
     */
    public void setZCalm(Integer n, GameView gameView) {
        void gameView2;
        this.setCalm(n - this.getExtra("\u5b9a\u529b", (GameView)gameView2));
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public String getSkillValue(String head) {
        if (this.petSkills == null) return null;
        if (this.petSkills.equals("")) {
            return null;
        }
        if (this.petSkills.startsWith(head)) {
            int IiiiiiiiIIIII = this.petSkills.indexOf("|");
            if (IiiiiiiiIIIII != -1) return this.petSkills.substring(1, IiiiiiiiIIIII);
            return this.petSkills.substring(1);
        }
        int IiiiiiiiIIIII = this.petSkills.indexOf("|" + head);
        if (IiiiiiiiIIIII == -1) {
            return null;
        }
        String IiiiiiiiIIIII2 = this.petSkills.substring(IiiiiiiiIIIII + 2);
        if ((IiiiiiiiIIIII = IiiiiiiiIIIII2.indexOf("|")) != -1) return IiiiiiiiIIIII2.substring(0, IiiiiiiiIIIII);
        return IiiiiiiiIIIII2;
    }

    public void setRevealNum(int revealNum) {
        this.revealNum = revealNum;
    }

    public void setMp(int mp) {
        this.mp = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)mp);
    }

    public String getAdornPart(IiiiiiiiiIIII objectArea) {
        if (this.stye == null) return null;
        if (this.stye.equals("")) {
            return null;
        }
        String[] IiiiiiiiIIIII = this.stye.split("\\|");
        int IiiiiiiiIIIII2 = 1;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (!IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith("3-")) {
                ++IiiiiiiiIIIII2;
                continue;
            }
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("-");
            if (IiiiiiiiIIIII3.length <= 2) {
                return null;
            }
            String IiiiiiiiIIIII4 = IiiiiiiiIIIII3[2];
            if (IiiiiiiiIIIII3.length <= 3) return IiiiiiiiIIIII4;
            ColorScheme IiiiiiiiIIIII5 = objectArea.ALLATORIxDEMO(IiiiiiiiIIIII3[3]);
            if (IiiiiiiiIIIII5 == null) return IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII5.getValue() == null) return IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII5.getValue().equals("")) return IiiiiiiiIIIII4;
            IiiiiiiiIIIII4 = String.valueOf(IiiiiiiiIIIII4) + "|" + IiiiiiiiIIIII5.getValue();
            return IiiiiiiiIIIII4;
        }
        return null;
    }

    public void setLyk(String lyk) {
        this.lyk = lyk;
    }

    public int getAp() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.ap);
    }

    public void setBone(Integer bone) {
        this.bone = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)bone.intValue());
    }

    public int getLxGZ() {
        String IiiiiiiiIIIII = this.getSkillValue("L");
        if (IiiiiiiiIIIII == null) {
            return 9;
        }
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII.indexOf("=");
        if (IiiiiiiiIIIII2 != -1) return Integer.parseInt(IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII2));
        return 9;
    }

    public String getPetSkills() {
        return this.petSkills;
    }

    public void setTFNum(int tfNum) {
        this.setSkillValue("T", String.valueOf(tfNum));
    }

    public void setLxValue(int lxValue) {
        String IiiiiiiiIIIII = this.getSkillValue("L");
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = "9=" + lxValue;
        } else {
            StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.indexOf("=");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII3 + 1));
            IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII3 + 1);
            IiiiiiiiIIIII3 = IiiiiiiiIIIII.indexOf("=");
            IiiiiiiiIIIII2.append(lxValue);
            if (IiiiiiiiIIIII3 != -1) {
                IiiiiiiiIIIII2.append("=");
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII.substring(IiiiiiiiIIIII3 + 1));
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2.toString();
        }
        this.setSkillValue("L", IiiiiiiiIIIII);
    }

    public void setFourattributes(String fourattributes) {
        this.fourattributes = fourattributes;
    }

    /*
     * WARNING - void declaration
     */
    public void setZPower(Integer n, GameView gameView) {
        void gameView2;
        this.setPower(n - this.getExtra("\u529b\u91cf", (GameView)gameView2));
    }

    public List<BigDecimal> getGoods() {
        int IiiiiiiiIIIII;
        String[] IiiiiiiiIIIII2;
        if (this.innerGoods == null || this.innerGoods.equals("")) {
            if (this.stye == null) return null;
            if (this.stye.length() <= 1) {
                return null;
            }
        }
        ArrayList<BigDecimal> IiiiiiiiIIIII3 = new ArrayList<BigDecimal>();
        if (this.innerGoods != null && this.innerGoods.equals("")) {
            IiiiiiiiIIIII2 = this.innerGoods.split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII2.length) {
                if (!IiiiiiiiIIIII2[IiiiiiiiIIIII].equals("")) {
                    IiiiiiiiIIIII3.add(new BigDecimal(IiiiiiiiIIIII2[IiiiiiiiIIIII]));
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (this.stye != null && this.stye.length() > 1) {
            IiiiiiiiIIIII2 = this.stye.split("\\|");
            IiiiiiiiIIIII = 1;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII2.length) {
                String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII].split("-");
                if (IiiiiiiiIIIII4.length >= 2) {
                    IiiiiiiiIIIII3.add(new BigDecimal(IiiiiiiiIIIII4[1]));
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (IiiiiiiiIIIII3.size() != 0) return IiiiiiiiIIIII3;
        return null;
    }
}
