/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.TTWarRecord
 *  com.xy.v.IiIiIiiiiiIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.bean;

import com.xy.bean.TTWarRecord;
import com.xy.v.IiIiIiiiiiIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiIiiiiIiIi;
import java.math.BigDecimal;

public class LoginResult {
    private BigDecimal achievement;
    private String userPwd;
    private Long y;
    private BigDecimal race_id;
    private BigDecimal Daygetorno;
    private String meridians;
    private String title;
    private BigDecimal species_id;
    private BigDecimal Paysum;
    private String password;
    private BigDecimal savegold = new BigDecimal(0);
    private String Score;
    private Long mapid;
    private Integer bone;
    private BigDecimal babyId;
    private String Kill;
    private String serverMeString;
    private BigDecimal gold;
    private int lowOrHihtpack;
    private String gangname;
    private BigDecimal Daypaysum;
    private Integer xiuwei;
    private String taskDaily;
    private BigDecimal gang_id;
    private Integer fighting;
    private String skin;
    private BigDecimal experience;
    private Integer grade;
    private BigDecimal troop_id;
    private BigDecimal pkrecord;
    private Integer power;
    private int TurnAround = 0;
    private BigDecimal booth_id;
    private String gangpost;
    private String teamInfo;
    private BigDecimal summoning_id;
    private BigDecimal mp;
    private Integer skill_id;
    private String race_name;
    private BigDecimal contribution;
    private String sex;
    private String pals;
    private String babyState;
    private Integer spir;
    private BigDecimal user_id;
    private BigDecimal prestige;
    private String Vipget;
    private BigDecimal hp;
    private BigDecimal role_id;
    private String extraPoint;
    private String localname;
    private Integer havebaby = 0;
    private Integer calm;
    private int Dayfirstinorno;
    private String userName;
    private String matchTeam;
    private String rolename;
    private Integer speed;
    private String marryObject;
    private Integer bangScore;
    private String uptime;
    private Long x;
    private Integer money = 0;
    private Integer mount_id;
    private BigDecimal codecard;
    private String resistance = "\u4e3b-|\u526f-";
    private BigDecimal Dayandpayorno;

    public Integer getSkill_id() {
        return this.skill_id;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public void setMatchTeam(String matchTeam) {
        this.matchTeam = matchTeam;
    }

    public BigDecimal getSummoning_id() {
        return this.summoning_id;
    }

    public BigDecimal getCodecard() {
        if (this.codecard != null) return new BigDecimal(IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.codecard.longValue()));
        return this.codecard;
    }

    public void setUser_id(BigDecimal user_id) {
        this.user_id = user_id;
    }

    public void setBone(Integer bone) {
        this.bone = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)bone.longValue());
    }

    public String getGangpost() {
        return this.gangpost;
    }

    public String getMarryObject() {
        return this.marryObject;
    }

    public BigDecimal getUser_id() {
        return this.user_id;
    }

    public String getPals() {
        return this.pals;
    }

    public BigDecimal getPaysum() {
        return this.Paysum;
    }

    public double getKilltype(String type) {
        if (this.Kill == null) return 0.0;
        if (this.Kill.equals("")) {
            return 0.0;
        }
        String[] IiiiiiiiIIIII = this.Kill.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("=");
            if (IiiiiiiiIIIII3[0].equals(type)) {
                return Double.parseDouble(IiiiiiiiIIIII3[1]);
            }
            ++IiiiiiiiIIIII2;
        }
        return 0.0;
    }

    public void setPrestige(BigDecimal prestige) {
        this.prestige = prestige;
    }

    public BigDecimal getPkrecord() {
        return this.pkrecord;
    }

    public void setCalm(Integer calm) {
        this.calm = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)calm.longValue());
    }

    public void setBabyId(BigDecimal babyId) {
        this.babyId = babyId;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getTeam() {
        if (this.teamInfo == null) return this.rolename;
        if (this.teamInfo.equals("")) return this.rolename;
        if (!this.teamInfo.equals("|")) return this.teamInfo;
        return this.rolename;
    }

    public void setTroop_id(BigDecimal troop_id) {
        this.troop_id = troop_id;
    }

    public void setDaygetorno(BigDecimal daygetorno) {
        this.Daygetorno = daygetorno;
    }

    public void setSummoning_id(BigDecimal summoning_id) {
        this.summoning_id = summoning_id;
    }

    public void setHavebaby(Integer havebaby) {
        this.havebaby = havebaby;
    }

    public void setSpecies_id(BigDecimal species_id) {
        this.species_id = species_id;
    }

    public void setGangname(String gangname) {
        this.gangname = gangname;
    }

    public void setVipget(String vipget) {
        this.Vipget = vipget;
    }

    public void setServerMeString(String serverMeString) {
        this.serverMeString = serverMeString;
    }

    public BigDecimal getContribution() {
        return this.contribution;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSkill_id(Integer skill_id) {
        this.skill_id = skill_id;
    }

    public Long getX() {
        return this.x;
    }

    public void setMount_id(Integer mount_id) {
        this.mount_id = mount_id;
    }

    public void setDayfirstinorno(int dayfirstinorno) {
        this.Dayfirstinorno = dayfirstinorno;
    }

    public TTWarRecord getTTWarRecord(int ttsj) {
        String IiiiiiiiIIIII = this.getKillTypeHead("T", ttsj);
        if (IiiiiiiiIIIII == null) return null;
        return new TTWarRecord(IiiiiiiiIIIII);
    }

    public Integer getSpir() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.spir.longValue());
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public void setTaskDaily(String taskDaily) {
        this.taskDaily = taskDaily;
    }

    public String getBabyState() {
        return this.babyState;
    }

    public BigDecimal getExperience() {
        if (this.experience != null) return new BigDecimal(IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.experience.longValue()));
        return this.experience;
    }

    public void setGrade(Integer grade) {
        this.grade = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)grade.longValue());
    }

    public void setMapid(Long mapid) {
        this.mapid = mapid;
    }

    public void setPkrecord(BigDecimal pkrecord) {
        this.pkrecord = pkrecord;
    }

    public void setXiuwei(Integer xiuwei) {
        this.xiuwei = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)xiuwei.longValue());
    }

    public BigDecimal getDaypaysum() {
        return this.Daypaysum;
    }

    public void setFighting(Integer fighting) {
        this.fighting = fighting;
    }

    public String getUptime() {
        return this.uptime;
    }

    public void setHp(BigDecimal hp) {
        this.hp = hp;
    }

    public BigDecimal getSavegold() {
        return this.savegold;
    }

    public String getRolename() {
        return this.rolename;
    }

    public BigDecimal getTroop_id() {
        return this.troop_id;
    }

    public String getTeamInfo() {
        return this.teamInfo;
    }

    public int getDayfirstinorno() {
        return this.Dayfirstinorno;
    }

    public BigDecimal getGold() {
        if (this.gold != null) return new BigDecimal(IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.gold.longValue()));
        return this.gold;
    }

    public Long getMapid() {
        return this.mapid;
    }

    public String getUserPwd() {
        return this.userPwd;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    public int getTurnAround() {
        return this.TurnAround;
    }

    public Integer getPower() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.power.longValue());
    }

    public BigDecimal getSpecies_id() {
        return this.species_id;
    }

    /*
     * WARNING - void declaration
     */
    public void setCodecard(BigDecimal bigDecimal) {
        void codecard;
        this.codecard = new BigDecimal(IiIiIiiiiiIiI.ALLATORIxDEMO((long)codecard.longValue()));
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getAchievement() {
        return this.achievement;
    }

    public String getExtraPoint() {
        return this.extraPoint;
    }

    public void setKill(String kill) {
        this.Kill = kill;
    }

    public Integer getCalm() {
        if (this.calm != null) return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.calm.longValue());
        return 0;
    }

    public String getPassword() {
        return this.password;
    }

    public Integer getSpeed() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.speed.longValue());
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getFighting() {
        if (this.fighting != null) return this.fighting;
        this.fighting = 0;
        return this.fighting;
    }

    public String getResistance() {
        if (this.resistance != null) {
            if (!this.resistance.equals("")) return this.resistance;
        }
        this.resistance = "\u4e3b-|\u526f-";
        return this.resistance;
    }

    public void setPower(Integer power) {
        this.power = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)power.longValue());
    }

    public void setX(Long x) {
        this.x = x;
    }

    public BigDecimal getDayandpayorno() {
        return this.Dayandpayorno;
    }

    public Integer getMount_id() {
        if (this.mount_id != null) return this.mount_id;
        this.mount_id = 0;
        return this.mount_id;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public void setGold(BigDecimal gold) {
        if (gold.compareTo(IiiiIiiiiIiIi.IiIIIiiiiIiiI) > 0) {
            gold = IiiiIiiiiIiIi.IiIIIiiiiIiiI;
        }
        this.gold = new BigDecimal(IiIiIiiiiiIiI.ALLATORIxDEMO((long)gold.longValue()));
    }

    public void setPaysum(BigDecimal paysum) {
        this.Paysum = paysum;
    }

    public Integer getCanpoint() {
        int IiiiiiiiIIIII = this.getGrade();
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII);
        IiiiiiiiIIIII = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII);
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII * 8;
        IiiiiiiiIIIII3 += this.getExtraPointInt();
        IiiiiiiiIIIII3 = IiiiiiiiIIIII2 < 4 ? (IiiiiiiiIIIII3 += IiiiiiiiIIIII2 * 60) : (IiiiiiiiIIIII3 += 180 + IiiiiiiiIIIII);
        int IiiiiiiiIIIII4 = this.getBone();
        IiiiiiiiIIIII3 -= IiiiiiiiIIIII4;
        if (IiiiiiiiIIIII4 < IiiiiiiiIIIII) {
            IiIiIiiiiiIiI.ALLATORIxDEMO();
        }
        IiiiiiiiIIIII4 = this.getSpir();
        IiiiiiiiIIIII3 -= IiiiiiiiIIIII4;
        if (IiiiiiiiIIIII4 < IiiiiiiiIIIII) {
            IiIiIiiiiiIiI.ALLATORIxDEMO();
        }
        IiiiiiiiIIIII4 = this.getPower();
        IiiiiiiiIIIII3 -= IiiiiiiiIIIII4;
        if (IiiiiiiiIIIII4 < IiiiiiiiIIIII) {
            IiIiIiiiiiIiI.ALLATORIxDEMO();
        }
        IiiiiiiiIIIII4 = this.getSpeed();
        IiiiiiiiIIIII3 -= IiiiiiiiIIIII4;
        if (IiiiiiiiIIIII4 < IiiiiiiiIIIII) {
            IiIiIiiiiiIiI.ALLATORIxDEMO();
        }
        IiiiiiiiIIIII4 = this.getCalm();
        IiiiiiiiIIIII3 -= IiiiiiiiIIIII4;
        if (IiiiiiiiIIIII4 < 0 || IiiiiiiiIIIII2 >= 4 && IiiiiiiiIIIII4 < IiiiiiiiIIIII) {
            IiIiIiiiiiIiI.ALLATORIxDEMO();
        }
        if (IiiiiiiiIIIII3 >= 0) return IiiiiiiiIIIII3;
        IiIiIiiiiiIiI.ALLATORIxDEMO();
        return IiiiiiiiIIIII3;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public int getLowOrHihtpack() {
        return this.lowOrHihtpack;
    }

    public void setSpeed(Integer speed) {
        this.speed = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)speed.longValue());
    }

    public void setRace_name(String race_name) {
        this.race_name = race_name;
    }

    public Integer getHavebaby() {
        return this.havebaby;
    }

    public String getTaskDaily() {
        return this.taskDaily;
    }

    public BigDecimal getHp() {
        return this.hp;
    }

    public String getRace_name() {
        return this.race_name;
    }

    public void setScore(String score) {
        this.Score = score;
    }

    public void setContribution(BigDecimal contribution) {
        this.contribution = contribution;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getGang_id() {
        return this.gang_id;
    }

    public void setRole_id(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public Integer getBone() {
        return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.bone.longValue());
    }

    public void setKillTypeTwo(String draw) {
        int IiiiiiiiIIIII;
        if (this.Kill == null || this.Kill.equals("")) {
            this.Kill = draw;
            return;
        }
        int IiiiiiiiIIIII2 = draw.indexOf("=");
        String IiiiiiiiIIIII3 = draw.substring(0, IiiiiiiiIIIII2);
        int IiiiiiiiIIIII4 = this.Kill.indexOf(IiiiiiiiIIIII3);
        int n = IiiiiiiiIIIII = IiiiiiiiIIIII4 != -1 ? this.Kill.indexOf("|", IiiiiiiiIIIII4 + IiiiiiiiIIIII3.length()) : -1;
        if (IiiiiiiiIIIII4 == -1) {
            this.Kill = String.valueOf(this.Kill) + "|" + draw;
            return;
        }
        if (IiiiiiiiIIIII == -1) {
            this.Kill = String.valueOf(this.Kill.substring(0, IiiiiiiiIIIII4)) + draw;
            return;
        }
        this.Kill = String.valueOf(this.Kill.substring(0, IiiiiiiiIIIII4)) + draw + this.Kill.substring(IiiiiiiiIIIII);
    }

    public void setTurnAround(int turnAround) {
        this.TurnAround = turnAround;
    }

    public BigDecimal getRole_id() {
        return this.role_id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPals(String pals) {
        this.pals = pals;
    }

    public void setGang_id(BigDecimal gang_id) {
        this.gang_id = gang_id;
    }

    public String getVipget() {
        return this.Vipget;
    }

    public void setBabyState(String babyState) {
        this.babyState = babyState;
    }

    public String getScore() {
        return this.Score;
    }

    public String getGangname() {
        return this.gangname;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getBangScore() {
        return this.bangScore;
    }

    public void setGangpost(String gangpost) {
        this.gangpost = gangpost;
    }

    public Long getY() {
        return this.y;
    }

    public BigDecimal getBabyId() {
        return this.babyId;
    }

    public String getLocalname() {
        return this.localname;
    }

    public void setDaypaysum(BigDecimal daypaysum) {
        this.Daypaysum = daypaysum;
    }

    public void setDayandpayorno(BigDecimal dayandpayorno) {
        this.Dayandpayorno = dayandpayorno;
    }

    public String getMatchTeam() {
        return this.matchTeam;
    }

    public String getServerMeString() {
        return this.serverMeString;
    }

    public int getExtraPointInt(String type) {
        if (this.extraPoint == null) return 0;
        if (this.extraPoint.equals("")) {
            return 0;
        }
        String[] IiiiiiiiIIIII = this.extraPoint.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith(type)) {
                return Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(1));
            }
            ++IiiiiiiiIIIII2;
        }
        return 0;
    }

    public BigDecimal getMp() {
        return this.mp;
    }

    public void setBangScore(Integer bangScore) {
        this.bangScore = bangScore;
    }

    public void setY(Long y) {
        this.y = y;
    }

    public String getMeridians() {
        return this.meridians;
    }

    public void setBooth_id(BigDecimal booth_id) {
        this.booth_id = booth_id;
    }

    public void setSavegold(BigDecimal savegold) {
        this.savegold = savegold;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    /*
     * WARNING - void declaration
     */
    public void setExperience(BigDecimal bigDecimal) {
        void experience;
        this.experience = new BigDecimal(IiIiIiiiiiIiI.ALLATORIxDEMO((long)experience.longValue()));
    }

    public String getSex() {
        return this.sex;
    }

    public void setSpir(Integer spir) {
        this.spir = (int)IiIiIiiiiiIiI.ALLATORIxDEMO((long)spir.longValue());
    }

    public String setKillTypeHead(String head, int dType, String dValue) {
        int IiiiiiiiIIIII;
        if (this.Kill == null || this.Kill.equals("")) {
            if (dValue == null) return this.Kill;
            if (dValue.equals("")) {
                return this.Kill;
            }
            this.Kill = String.valueOf(head) + dType + "=" + dValue;
            return this.Kill;
        }
        String IiiiiiiiIIIII2 = String.valueOf(head) + dType + "=";
        String IiiiiiiiIIIII3 = String.valueOf(head) + dType + "=" + dValue;
        if (dValue == null || dValue.equals("")) {
            IiiiiiiiIIIII3 = "";
        }
        if ((IiiiiiiiIIIII = this.Kill.indexOf(IiiiiiiiIIIII2)) == -1) {
            this.Kill = String.valueOf(this.Kill) + "|" + IiiiiiiiIIIII3;
            return IiiiiiiiIIIII3;
        }
        int IiiiiiiiIIIII4 = this.Kill.indexOf("|", IiiiiiiiIIIII + IiiiiiiiIIIII2.length());
        if (IiiiiiiiIIIII4 == -1) {
            this.Kill = String.valueOf(this.Kill.substring(0, IiiiiiiiIIIII)) + IiiiiiiiIIIII3;
            return IiiiiiiiIIIII3;
        }
        this.Kill = String.valueOf(this.Kill.substring(0, IiiiiiiiIIIII)) + IiiiiiiiIIIII3 + this.Kill.substring(IiiiiiiiIIIII4);
        return IiiiiiiiIIIII3;
    }

    public void setMp(BigDecimal mp) {
        this.mp = mp;
    }

    /*
     * Unable to fully structure code
     */
    public void setExtraPoint(String type, int p) {
        type = type.substring(0, 1);
        if (this.extraPoint == null || this.extraPoint.equals("")) {
            this.extraPoint = String.valueOf(type) + p;
        }
        IiiiiiiiIIIII = this.extraPoint.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block7: {
                if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(type)) break block7;
                IiiiiiiiIIIII[IiiiiiiiIIIII] = String.valueOf(type) + (Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1)) + p);
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl24
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl33
        do {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl24:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        this.extraPoint = IiiiiiiiIIIII.toString();
        return;
        do {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl33:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        if (IiiiiiiiIIIII.length() != 0) {
            IiiiiiiiIIIII.append("|");
        }
        IiiiiiiiIIIII.append(type);
        IiiiiiiiIIIII.append(p);
        this.extraPoint = IiiiiiiiIIIII.toString();
    }

    public Integer getXiuwei() {
        if (this.xiuwei != null) return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.xiuwei.longValue());
        return 0;
    }

    public int getExtraPointInt() {
        if (this.extraPoint == null) return 0;
        if (this.extraPoint.equals("")) {
            return 0;
        }
        String[] IiiiiiiiIIIII = this.extraPoint.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith("F")) {
                IiiiiiiiIIIII2 += Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII3].substring(1));
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII2;
    }

    public BigDecimal getBooth_id() {
        return this.booth_id;
    }

    public Integer getGrade() {
        if (this.grade != null) return (int)IiIiIiiiiiIiI.iIiIiiiiIIiii((long)this.grade.longValue());
        return this.grade;
    }

    public String getKill() {
        return this.Kill;
    }

    public void setLowOrHihtpack(int lowOrHihtpack) {
        this.lowOrHihtpack = lowOrHihtpack;
    }

    /*
     * Unable to fully structure code
     */
    public void setFGExtraPoint(String type, int p) {
        type = type.substring(0, 1);
        if (this.extraPoint == null || this.extraPoint.equals("")) {
            this.extraPoint = String.valueOf(type) + p;
        }
        IiiiiiiiIIIII = this.extraPoint.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block7: {
                if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(type)) break block7;
                IiiiiiiiIIIII[IiiiiiiiIIIII] = String.valueOf(type) + p;
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl24
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl33
        do {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl24:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        this.extraPoint = IiiiiiiiIIIII.toString();
        return;
        do {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl33:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        if (IiiiiiiiIIIII.length() != 0) {
            IiiiiiiiIIIII.append("|");
        }
        IiiiiiiiIIIII.append(type);
        IiiiiiiiIIIII.append(p);
        this.extraPoint = IiiiiiiiIIIII.toString();
    }

    public void setMeridians(String meridians) {
        this.meridians = meridians;
    }

    public BigDecimal getDaygetorno() {
        return this.Daygetorno;
    }

    public void setRace_id(BigDecimal race_id) {
        this.race_id = race_id;
    }

    public BigDecimal getScoretype(String type) {
        if (this.Score == null) return new BigDecimal(0);
        if (this.Score.equals("")) {
            return new BigDecimal(0);
        }
        if (this.Score.startsWith(String.valueOf(type) + "=")) {
            int IiiiiiiiIIIII = this.Score.indexOf("|");
            return new BigDecimal(IiiiiiiiIIIII == -1 ? this.Score.substring(type.length() + 1) : this.Score.substring(type.length() + 1, IiiiiiiiIIIII));
        }
        int IiiiiiiiIIIII = this.Score.indexOf("|" + type + "=");
        if (IiiiiiiiIIIII != -1) int IiiiiiiiIIIII2;
        return new BigDecimal((IiiiiiiiIIIII2 = this.Score.indexOf("|", IiiiiiiiIIIII + 1)) == -1 ? this.Score.substring(IiiiiiiiIIIII + type.length() + 2) : this.Score.substring(IiiiiiiiIIIII + type.length() + 2, IiiiiiiiIIIII2));
        return new BigDecimal(0);
    }

    public BigDecimal getRace_id() {
        return this.race_id;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public void setExtraPoint(String extraPoint) {
        this.extraPoint = extraPoint;
    }

    public void setAchievement(BigDecimal achievement) {
        this.achievement = achievement;
    }

    public void setMarryObject(String marryObject) {
        this.marryObject = marryObject;
    }

    public String getSkin() {
        return this.skin;
    }

    public String getKillTypeHead(String head, int dType) {
        if (this.Kill == null) return null;
        if (this.Kill.equals("")) {
            return null;
        }
        String IiiiiiiiIIIII = String.valueOf(head) + dType + "=";
        int IiiiiiiiIIIII2 = this.Kill.indexOf(IiiiiiiiIIIII);
        if (IiiiiiiiIIIII2 == -1) {
            return null;
        }
        int IiiiiiiiIIIII3 = this.Kill.indexOf("|", IiiiiiiiIIIII2 + IiiiiiiiIIIII.length());
        if (IiiiiiiiIIIII3 != -1) return this.Kill.substring(IiiiiiiiIIIII2 + 1, IiiiiiiiIIIII3);
        return this.Kill.substring(IiiiiiiiIIIII2 + 1);
    }

    /*
     * WARNING - void declaration
     */
    public String[] getResistance(String type) {
        if (this.resistance == null) return null;
        if (this.resistance.equals("")) {
            return null;
        }
        String[] IiiiiiiiIIIII = this.resistance.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith(type)) {
                void IiiiiiiiIIIII3;
                String[] stringArray = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("#");
                stringArray[0] = stringArray[0].substring(1);
                return IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    public BigDecimal getPrestige() {
        return this.prestige;
    }
}
