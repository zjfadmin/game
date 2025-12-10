package com.xy.bean;

import com.xy.W;
import com.xy.bk;
import com.xy.cX;
import java.math.BigDecimal;

public class LoginResult {
   private String resistance;
   private String Kill;
   private BigDecimal Daygetorno;
   private Long x;
   private Integer speed;
   private BigDecimal codecard;
   private Long mapid;
   private String Score;
   private String serverMeString;
   private String userPwd;
   private BigDecimal Daypaysum;
   private BigDecimal user_id;
   private BigDecimal booth_id;
   private Integer havebaby;
   private String sex;
   private BigDecimal gang_id;
   private BigDecimal Paysum;
   private String extraPoint;
   private String Vipget;
   private BigDecimal babyId;
   private String title;
   private int lowOrHihtpack;
   private BigDecimal gold;
   private Integer skill_id;
   private Integer money;
   private BigDecimal experience;
   private BigDecimal achievement;
   private String teamInfo;
   private String gangpost;
   private String skin;
   private Long y;
   private String uptime;
   private BigDecimal pkrecord;
   private BigDecimal hp;
   private String rolename;
   private Integer bangScore;
   private Integer fighting;
   private int Dayfirstinorno;
   private BigDecimal troop_id;
   private String marryObject;
   private Integer spir;
   private String babyState;
   private BigDecimal savegold;
   private Integer bone;
   private String taskDaily;
   private String password;
   private String localname;
   private BigDecimal summoning_id;
   private BigDecimal mp;
   private BigDecimal prestige;
   private String matchTeam;
   private Integer mount_id;
   private String meridians;
   private BigDecimal role_id;
   private BigDecimal race_id;
   private String race_name;
   private Integer grade;
   private String userName;
   private BigDecimal Dayandpayorno;
   private BigDecimal contribution;
   private Integer power;
   private int TurnAround;
   private String gangname;
   private Integer calm;
   private BigDecimal species_id;
   private Integer xiuwei;
   private String pals;

   public String getPassword() {
      return this.password;
   }

   public String getLocalname() {
      return this.localname;
   }

   public TTWarRecord getTTWarRecord(int var1) {
      String var2;
      return (var2 = this.getKillTypeHead("T", var1)) != null ? new TTWarRecord(var2) : null;
   }

   public void setCodecard(BigDecimal var1) {
      this.codecard = new BigDecimal(bk.a(var1.longValue()));
   }

   public void setSpeed(Integer var1) {
      this.speed = (int)bk.a(var1.longValue());
   }

   public void setContribution(BigDecimal var1) {
      this.contribution = var1;
   }

   public void setRace_name(String var1) {
      this.race_name = var1;
   }

   public void setX(Long var1) {
      this.x = var1;
   }

   public void setUserName(String var1) {
      this.userName = var1;
   }

   public void setHavebaby(Integer var1) {
      this.havebaby = var1;
   }

   public String getExtraPoint() {
      return this.extraPoint;
   }

   public String getKillTypeHead(String var1, int var2) {
      if (this.Kill != null && !this.Kill.equals("")) {
         var1 = var1 + var2 + "=";
         if ((var2 = this.Kill.indexOf(var1)) == -4 >> 2) {
            return null;
         } else {
            int var3;
            return (var3 = this.Kill.indexOf("|", var2 + var1.length())) == -4 >> 2 ? this.Kill.substring(var2 + (5 >> 2)) : this.Kill.substring(var2 + --1, var3);
         }
      } else {
         return null;
      }
   }

   public BigDecimal getMp() {
      return this.mp;
   }

   public String getPals() {
      return this.pals;
   }

   public void setExperience(BigDecimal var1) {
      this.experience = new BigDecimal(bk.a(var1.longValue()));
   }

   public String getMeridians() {
      return this.meridians;
   }

   public void setRole_id(BigDecimal var1) {
      this.role_id = var1;
   }

   public void setMatchTeam(String var1) {
      this.matchTeam = var1;
   }

   public double getKilltype(String var1) {
      if (this.Kill != null && !this.Kill.equals("")) {
         String[] var2 = this.Kill.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            String[] var4;
            if ((var4 = var2[var3].split("="))[3 & 4].equals(var1)) {
               return Double.parseDouble(var4[4 ^ 5]);
            }

            ++var3;
         }

         return 0.0D;
      } else {
         return 0.0D;
      }
   }

   public void setGrade(Integer var1) {
      this.grade = (int)bk.a(var1.longValue());
   }

   public void setHp(BigDecimal var1) {
      this.hp = var1;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public void setSpir(Integer var1) {
      this.spir = (int)bk.a(var1.longValue());
   }

   public void setSpecies_id(BigDecimal var1) {
      this.species_id = var1;
   }

   public void setTaskDaily(String var1) {
      this.taskDaily = var1;
   }

   public void setLocalname(String var1) {
      this.localname = var1;
   }

   public void setRace_id(BigDecimal var1) {
      this.race_id = var1;
   }

   public String getVipget() {
      return this.Vipget;
   }

   public Integer getSpeed() {
      return (int)bk.b(this.speed.longValue());
   }

   public BigDecimal getBooth_id() {
      return this.booth_id;
   }

   public void setPals(String var1) {
      this.pals = var1;
   }

   public BigDecimal getSummoning_id() {
      return this.summoning_id;
   }

   public void setBangScore(Integer var1) {
      this.bangScore = var1;
   }

   public BigDecimal getPaysum() {
      return this.Paysum;
   }

   public void setMapid(Long var1) {
      this.mapid = var1;
   }

   public void setSkill_id(Integer var1) {
      this.skill_id = var1;
   }

   public void setPkrecord(BigDecimal var1) {
      this.pkrecord = var1;
   }

   public void setUptime(String var1) {
      this.uptime = var1;
   }

   public String getGangname() {
      return this.gangname;
   }

   public BigDecimal getGang_id() {
      return this.gang_id;
   }

   public BigDecimal getTroop_id() {
      return this.troop_id;
   }

   public void setSavegold(BigDecimal var1) {
      this.savegold = var1;
   }

   public void setVipget(String var1) {
      this.Vipget = var1;
   }

   public String getKill() {
      return this.Kill;
   }

   public int getExtraPointInt(String var1) {
      if (this.extraPoint != null && !this.extraPoint.equals("")) {
         String[] var2 = this.extraPoint.split("\\|");

         int var3;
         for(int var10000 = var3 = 3 >> 2; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].startsWith(var1)) {
               return Integer.parseInt(var2[var3].substring(4 ^ 5));
            }

            ++var3;
         }

         return 2 & 5;
      } else {
         return 0;
      }
   }

   public Integer getPower() {
      return (int)bk.b(this.power.longValue());
   }

   public int getExtraPointInt() {
      if (this.extraPoint != null && !this.extraPoint.equals("")) {
         String[] var1 = this.extraPoint.split("\\|");
         int var2 = 5 >> 3;

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < var1.length; var10000 = var3) {
            if (var1[var3].startsWith("F")) {
               var2 += Integer.parseInt(var1[var3].substring(3 >> 1));
            }

            ++var3;
         }

         return var2;
      } else {
         return 0;
      }
   }

   public void setGold(BigDecimal var1) {
      if (var1.compareTo(W.f) > 0) {
         var1 = W.f;
      }

      this.gold = new BigDecimal(bk.a(var1.longValue()));
   }

   public BigDecimal getDayandpayorno() {
      return this.Dayandpayorno;
   }

   public int getTurnAround() {
      return this.TurnAround;
   }

   public BigDecimal getSpecies_id() {
      return this.species_id;
   }

   public BigDecimal getContribution() {
      return this.contribution;
   }

   public void setDayandpayorno(BigDecimal var1) {
      this.Dayandpayorno = var1;
   }

   public void setResistance(String var1) {
      this.resistance = var1;
   }

   public Long getX() {
      return this.x;
   }

   public void setBabyId(BigDecimal var1) {
      this.babyId = var1;
   }

   public Integer getBone() {
      return (int)bk.b(this.bone.longValue());
   }

   public void setScore(String var1) {
      this.Score = var1;
   }

   public String[] getResistance(String var1) {
      if (this.resistance != null && !this.resistance.equals("")) {
         String[] var2 = this.resistance.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].startsWith(var1)) {
               String[] var4 = var2[var3].split("#");
               var4[2 & 5] = var4[3 ^ 3].substring(--1);
               return var4;
            }

            ++var3;
         }

         return null;
      } else {
         return null;
      }
   }

   public Integer getGrade() {
      return this.grade == null ? this.grade : (int)bk.b(this.grade.longValue());
   }

   public Integer getCalm() {
      return this.calm == null ? 5 >> 3 : (int)bk.b(this.calm.longValue());
   }

   public void setPower(Integer var1) {
      this.power = (int)bk.a(var1.longValue());
   }

   public void setPassword(String var1) {
      this.password = var1;
   }

   public void setTurnAround(int var1) {
      this.TurnAround = var1;
   }

   public BigDecimal getBabyId() {
      return this.babyId;
   }

   public void setDayfirstinorno(int var1) {
      this.Dayfirstinorno = var1;
   }

   public void setMp(BigDecimal var1) {
      this.mp = var1;
   }

   public String getSkin() {
      return this.skin;
   }

   public BigDecimal getCodecard() {
      return this.codecard == null ? this.codecard : new BigDecimal(bk.b(this.codecard.longValue()));
   }

   public void setMeridians(String var1) {
      this.meridians = var1;
   }

   public void setXiuwei(Integer var1) {
      this.xiuwei = (int)bk.a(var1.longValue());
   }

   public String getTeamInfo() {
      return this.teamInfo;
   }

   public BigDecimal getRole_id() {
      return this.role_id;
   }

   public void setBabyState(String var1) {
      this.babyState = var1;
   }

   public String setKillTypeHead(String var1, int var2, String var3) {
      if (this.Kill != null && !this.Kill.equals("")) {
         String var4 = var1 + var2 + "=";
         var1 = var1 + var2 + "=" + var3;
         if (var3 == null || var3.equals("")) {
            var1 = "";
         }

         if ((var2 = this.Kill.indexOf(var4)) == -4 >> 2) {
            this.Kill = this.Kill + "|" + var1;
            return var1;
         } else {
            int var5;
            if ((var5 = this.Kill.indexOf("|", var2 + var4.length())) == -4 >> 2) {
               this.Kill = this.Kill.substring(2 & 5, var2) + var1;
               return var1;
            } else {
               this.Kill = this.Kill.substring(3 >> 2, var2) + var1 + this.Kill.substring(var5);
               return var1;
            }
         }
      } else if (var3 != null && !var3.equals("")) {
         this.Kill = var1 + var2 + "=" + var3;
         return this.Kill;
      } else {
         return this.Kill;
      }
   }

   public void setExtraPoint(String var1, int var2) {
      var1 = var1.substring(2 & 5, 3 >> 1);
      if (this.extraPoint == null || this.extraPoint.equals("")) {
         this.extraPoint = var1 + var2;
      }

      String[] var4 = this.extraPoint.split("\\|");

      int var10000;
      int var3;
      for(var10000 = var3 = 3 & 4; var10000 < var4.length; var10000 = var3) {
         if (var4[var3].startsWith(var1)) {
            var4[var3] = var1 + (Integer.parseInt(var4[var3].substring(3 >> 1)) + var2);
            StringBuffer var5 = new StringBuffer();

            int var6;
            for(var10000 = var6 = 3 & 4; var10000 < var4.length; var10000 = var6) {
               if (var5.length() != 0) {
                  var5.append("|");
               }

               var5.append(var4[var6++]);
            }

            this.extraPoint = var5.toString();
            return;
         }

         ++var3;
      }

      StringBuffer var7 = new StringBuffer();

      int var8;
      for(var10000 = var8 = 3 & 4; var10000 < var4.length; var10000 = var8) {
         if (var7.length() != 0) {
            var7.append("|");
         }

         var7.append(var4[var8++]);
      }

      if (var7.length() != 0) {
         var7.append("|");
      }

      var7.append(var1);
      var7.append(var2);
      this.extraPoint = var7.toString();
   }

   public void setSummoning_id(BigDecimal var1) {
      this.summoning_id = var1;
   }

   public Integer getMoney() {
      return this.money;
   }

   public void setKillTypeTwo(String var1) {
      if (this.Kill != null && !this.Kill.equals("")) {
         int var2 = var1.indexOf("=");
         String var5 = var1.substring(3 ^ 3, var2);
         int var3;
         int var4 = (var3 = this.Kill.indexOf(var5)) != -4 >> 2 ? this.Kill.indexOf("|", var3 + var5.length()) : -1;
         if (var3 == -4 >> 2) {
            this.Kill = this.Kill + "|" + var1;
         } else if (var4 == -4 >> 2) {
            this.Kill = this.Kill.substring(3 ^ 3, var3) + var1;
         } else {
            this.Kill = this.Kill.substring(3 ^ 3, var3) + var1 + this.Kill.substring(var4);
         }
      } else {
         this.Kill = var1;
      }
   }

   public String getTeam() {
      return this.teamInfo != null && !this.teamInfo.equals("") && !this.teamInfo.equals("|") ? this.teamInfo : this.rolename;
   }

   public String getUserPwd() {
      return this.userPwd;
   }

   public String getGangpost() {
      return this.gangpost;
   }

   public void setServerMeString(String var1) {
      this.serverMeString = var1;
   }

   public BigDecimal getExperience() {
      return this.experience == null ? this.experience : new BigDecimal(bk.b(this.experience.longValue()));
   }

   public void setSex(String var1) {
      this.sex = var1;
   }

   public void setTeamInfo(String var1) {
      this.teamInfo = var1;
   }

   public String getBabyState() {
      return this.babyState;
   }

   public BigDecimal getPkrecord() {
      return this.pkrecord;
   }

   public void setMarryObject(String var1) {
      this.marryObject = var1;
   }

   public void setCalm(Integer var1) {
      this.calm = (int)bk.a(var1.longValue());
   }

   public String getRace_name() {
      return this.race_name;
   }

   public Long getY() {
      return this.y;
   }

   public String getRolename() {
      return this.rolename;
   }

   public BigDecimal getGold() {
      return this.gold == null ? this.gold : new BigDecimal(bk.b(this.gold.longValue()));
   }

   public String getServerMeString() {
      return this.serverMeString;
   }

   public void setRolename(String var1) {
      this.rolename = var1 == null ? null : var1.trim();
   }

   public BigDecimal getRace_id() {
      return this.race_id;
   }

   public void setExtraPoint(String var1) {
      this.extraPoint = var1;
   }

   public void setTroop_id(BigDecimal var1) {
      this.troop_id = var1;
   }

   public BigDecimal getAchievement() {
      return this.achievement;
   }

   public String getUserName() {
      return this.userName;
   }

   public void setLowOrHihtpack(int var1) {
      this.lowOrHihtpack = var1;
   }

   public BigDecimal getSavegold() {
      return this.savegold;
   }

   public String getScore() {
      return this.Score;
   }

   public Integer getHavebaby() {
      return this.havebaby;
   }

   public void setPaysum(BigDecimal var1) {
      this.Paysum = var1;
   }

   public void setBooth_id(BigDecimal var1) {
      this.booth_id = var1;
   }

   public String getMatchTeam() {
      return this.matchTeam;
   }

   public String getResistance() {
      if (this.resistance == null || this.resistance.equals("")) {
         this.resistance = "主-|副-";
      }

      return this.resistance;
   }

   public Long getMapid() {
      return this.mapid;
   }

   public Integer getXiuwei() {
      return this.xiuwei == null ? 3 & 4 : (int)bk.b(this.xiuwei.longValue());
   }

   public String getSex() {
      return this.sex;
   }

   public BigDecimal getScoretype(String var1) {
      if (this.Score != null && !this.Score.equals("")) {
         int var2;
         if (this.Score.startsWith(var1 + "=")) {
            var2 = this.Score.indexOf("|");
            return new BigDecimal(var2 == -4 >> 2 ? this.Score.substring(var1.length() + (3 >> 1)) : this.Score.substring(var1.length() + (4 ^ 5), var2));
         } else if ((var2 = this.Score.indexOf("|" + var1 + "=")) == -4 >> 2) {
            return new BigDecimal(5 >> 3);
         } else {
            int var3 = this.Score.indexOf("|", var2 + (5 >> 2));
            return new BigDecimal(var3 == -4 >> 2 ? this.Score.substring(var2 + var1.length() + (1 ^ 3)) : this.Score.substring(var2 + var1.length() + (1 ^ 3), var3));
         }
      } else {
         return new BigDecimal(3 >> 2);
      }
   }

   public void setGang_id(BigDecimal var1) {
      this.gang_id = var1;
   }

   public void setGangname(String var1) {
      this.gangname = var1;
   }

   public void setUserPwd(String var1) {
      this.userPwd = var1;
   }

   public void setUser_id(BigDecimal var1) {
      this.user_id = var1;
   }

   public LoginResult() {
      int var10001 = 2 & 5;
      int var10003 = 3 & 4;
      int var10006 = 3 & 4;
      super();
      this.resistance = "主-|副-";
      this.TurnAround = var10006;
      this.savegold = new BigDecimal(3 ^ 3);
      this.havebaby = var10003;
      this.money = var10001;
   }

   public Integer getMount_id() {
      if (this.mount_id == null) {
         this.mount_id = 3 >> 2;
      }

      return this.mount_id;
   }

   public void setPrestige(BigDecimal var1) {
      this.prestige = var1;
   }

   public String getUptime() {
      return this.uptime;
   }

   public void setDaypaysum(BigDecimal var1) {
      this.Daypaysum = var1;
   }

   public BigDecimal getUser_id() {
      return this.user_id;
   }

   public void setKill(String var1) {
      this.Kill = var1;
   }

   public void setDaygetorno(BigDecimal var1) {
      this.Daygetorno = var1;
   }

   public void setFGExtraPoint(String var1, int var2) {
      var1 = var1.substring(2 & 5, --1);
      if (this.extraPoint == null || this.extraPoint.equals("")) {
         this.extraPoint = var1 + var2;
      }

      String[] var4 = this.extraPoint.split("\\|");

      int var10000;
      int var3;
      for(var10000 = var3 = 3 ^ 3; var10000 < var4.length; var10000 = var3) {
         if (var4[var3].startsWith(var1)) {
            var4[var3] = var1 + var2;
            StringBuffer var5 = new StringBuffer();

            int var6;
            for(var10000 = var6 = 2 & 5; var10000 < var4.length; var10000 = var6) {
               if (var5.length() != 0) {
                  var5.append("|");
               }

               var5.append(var4[var6++]);
            }

            this.extraPoint = var5.toString();
            return;
         }

         ++var3;
      }

      StringBuffer var7 = new StringBuffer();

      int var8;
      for(var10000 = var8 = 5 >> 3; var10000 < var4.length; var10000 = var8) {
         if (var7.length() != 0) {
            var7.append("|");
         }

         var7.append(var4[var8++]);
      }

      if (var7.length() != 0) {
         var7.append("|");
      }

      var7.append(var1);
      var7.append(var2);
      this.extraPoint = var7.toString();
   }

   public void setFighting(Integer var1) {
      this.fighting = var1;
   }

   public void setAchievement(BigDecimal var1) {
      this.achievement = var1;
   }

   public BigDecimal getDaypaysum() {
      return this.Daypaysum;
   }

   public int getLowOrHihtpack() {
      return this.lowOrHihtpack;
   }

   public BigDecimal getHp() {
      return this.hp;
   }

   public void setY(Long var1) {
      this.y = var1;
   }

   public void setMoney(Integer var1) {
      this.money = var1;
   }

   public BigDecimal getDaygetorno() {
      return this.Daygetorno;
   }

   public int getDayfirstinorno() {
      return this.Dayfirstinorno;
   }

   public Integer getFighting() {
      if (this.fighting == null) {
         this.fighting = 3 ^ 3;
      }

      return this.fighting;
   }

   public Integer getBangScore() {
      return this.bangScore;
   }

   public void setMount_id(Integer var1) {
      this.mount_id = var1;
   }

   public void setTitle(String var1) {
      this.title = var1 == null ? null : var1.trim();
   }

   public Integer getCanpoint() {
      int var4;
      int var2 = cX.g(var4 = this.getGrade());
      int var3 = (var4 = cX.d(var4)) * (29 & 106) + this.getExtraPointInt();
      LoginResult var10000;
      if (var2 < --4) {
         var3 += var2 * (61 & 126);
         var10000 = this;
      } else {
         var3 += (7414 & 25533) + var4;
         var10000 = this;
      }

      int var1 = var10000.getBone();
      var3 -= var1;
      if (var1 < var4) {
         bk.c();
      }

      var1 = this.getSpir();
      var3 -= var1;
      if (var1 < var4) {
         bk.c();
      }

      var1 = this.getPower();
      var3 -= var1;
      if (var1 < var4) {
         bk.c();
      }

      var1 = this.getSpeed();
      var3 -= var1;
      if (var1 < var4) {
         bk.c();
      }

      var1 = this.getCalm();
      var3 -= var1;
      if (var1 < 0 || var2 >= --4 && var1 < var4) {
         bk.c();
      }

      if (var3 < 0) {
         bk.c();
      }

      return var3;
   }

   public Integer getSkill_id() {
      return this.skill_id;
   }

   public void setGangpost(String var1) {
      this.gangpost = var1;
   }

   public Integer getSpir() {
      return (int)bk.b(this.spir.longValue());
   }

   public BigDecimal getPrestige() {
      return this.prestige;
   }

   public void setBone(Integer var1) {
      this.bone = (int)bk.a(var1.longValue());
   }

   public String getTaskDaily() {
      return this.taskDaily;
   }

   public String getTitle() {
      return this.title;
   }

   public String getMarryObject() {
      return this.marryObject;
   }
}
