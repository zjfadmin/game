package com.xy.entity;

import com.xy.bk;
import com.xy.cX;
import com.xy.dx;
import com.xy.hd;
import com.xy.lg;
import com.xy.o;
import com.xy.formula.BaseValue;
import com.xy.readbean.ColorScheme;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RoleSummoning {
   private String summoningname;
   private String summoningid;
   private String skillData;
   private String wood;
   private String skill;
   private Integer grade;
   private Integer calm;
   private Integer speed;
   private String beastSkills;
   private int revealNum;
   private String growlevel;
   private Integer openSeal;
   private String ColorScheme;
   private String water;
   private BigDecimal exp;
   private String lyk;
   private BigDecimal roleid;
   private int petlock;
   private Integer power;
   private BigDecimal sid;
   private int draC;
   private String resistance;
   private String soil;
   private int flyupNum;
   private String petSkills;
   private int basismp;
   private String stye;
   private String gold;
   private String fire;
   private int alchemynum;
   private String fourattributes;
   private int dragon;
   private String summoningskin;
   private int ap;
   private int sp;
   private int growUpDanNum;
   private String innerGoods;
   private Integer faithful;
   private String zqk;
   private int basishp;
   private Integer spir;
   private Integer bone;
   private int trainNum;
   private Long friendliness;
   private int hp;
   private int mp;
   private String ssn;

   public int getBasismp() {
      return this.basismp;
   }

   public void setCalm(Integer var1) {
      this.calm = (int)bk.a((long)var1);
   }

   public int getBasishp(int var1) {
      return this.basishp == 0 ? var1 : this.basishp;
   }

   public int getGrowUpDanNum() {
      return this.growUpDanNum;
   }

   public void setWood(String var1) {
      this.wood = var1;
   }

   public String getSsn() {
      return this.ssn;
   }

   public String getGrowlevel() {
      return this.growlevel;
   }

   public void setSkillData(String var1) {
      this.skillData = var1;
   }

   public void setLxValue(int var1) {
      RoleSummoning var10000;
      String var2;
      if ((var2 = this.getSkillValue("L")) == null) {
         var2 = "9=" + var1;
         var10000 = this;
      } else {
         StringBuffer var4;
         StringBuffer var5 = var4 = new StringBuffer();
         int var3 = var2.indexOf("=");
         var5.append(var2.substring(3 & 4, var3 + (5 >> 2)));
         var2 = var2.substring(var3 + (4 ^ 5));
         var3 = var2.indexOf("=");
         var4.append(var1);
         if (var3 != -4 >> 2) {
            var4.append("=");
            var4.append(var2.substring(var3 + (3 >> 1)));
         }

         var2 = var4.toString();
         var10000 = this;
      }

      var10000.setSkillValue("L", var2);
   }

   public void setPetSkills(String var1) {
      this.petSkills = var1;
   }

   public void setWater(String var1) {
      this.water = var1;
   }

   public Integer getGrade() {
      return (int)bk.b((long)this.grade);
   }

   public void setBeastSkills(String var1) {
      this.beastSkills = var1;
   }

   public String getLyk() {
      return this.lyk;
   }

   public int getLxGZ() {
      String var1;
      if ((var1 = this.getSkillValue("L")) == null) {
         return 31 & 105;
      } else {
         int var2;
         return (var2 = var1.indexOf("=")) == -4 >> 2 ? 47 & 89 : Integer.parseInt(var1.substring(5 >> 3, var2));
      }
   }

   public void setSoil(String var1) {
      this.soil = var1;
   }

   public void setLxGZ(int var1) {
      RoleSummoning var10000;
      String var2;
      if ((var2 = this.getSkillValue("L")) == null) {
         var2 = var1 + "=" + (3 >> 2);
         var10000 = this;
      } else {
         StringBuffer var3;
         StringBuffer var5 = var3 = new StringBuffer();
         int var4 = var2.indexOf("=");
         var5.append(var1);
         var3.append(var2.substring(var4));
         var2 = var3.toString();
         var10000 = this;
      }

      var10000.setSkillValue("L", var2);
   }

   public void setTrainNum(int var1) {
      this.trainNum = var1;
   }

   public int getDraC() {
      return this.draC;
   }

   public int getRevealNum() {
      return this.revealNum;
   }

   public void setSummoningid(String var1) {
      this.summoningid = var1;
   }

   public void setSummoningskin(String var1) {
      this.summoningskin = var1;
   }

   public void a(Integer var1) {
      if (var1 == null) {
         this.faithful = 3 & 4;
      }

      this.faithful = this.faithful + var1;
      if (this.faithful < 0) {
         this.faithful = 3 & 4;
      }

      if (this.faithful > (127 & 100)) {
         this.faithful = 101 & 126;
      }

   }

   public int getAlchemynum() {
      return this.alchemynum;
   }

   public String getSkill() {
      return this.skill;
   }

   public void setPetlock(int var1) {
      this.petlock = var1;
   }

   public Integer getSpir() {
      return (int)bk.b((long)this.spir);
   }

   public void setAlchemynum(int var1) {
      this.alchemynum = var1;
   }

   public void setGrowUpDanNum(int var1) {
      this.growUpDanNum = var1;
   }

   public Integer getZSpeed(GameView var1) {
      return this.getSpeed() + this.getExtra("敏捷", var1);
   }

   public void setAp(int var1) {
      this.ap = (int)bk.a((long)var1);
   }

   public Integer getSpeed() {
      return (int)bk.b((long)this.speed);
   }

   public String getSummoningname() {
      return this.summoningname;
   }

   public BigDecimal b(Goodstable var1, int var2, GameView var3) {
      if ((this.stye == null || this.stye.length() <= --1) && var1 == null) {
         return null;
      } else {
         BigDecimal var4 = null;
         String var5 = String.valueOf(var2);
         String[] var6 = this.stye.split("\\|");
         StringBuffer var7;
         (var7 = new StringBuffer()).append(var6[3 >> 2]);
         int var8 = 3 >> 1;

         int var10000;
         for(var10000 = var8; var10000 < var6.length; var10000 = var8) {
            String[] var9 = var6[var8].split("-");
            if (var5.equals(var9[3 & 4])) {
               var4 = new BigDecimal(var9[5 >> 2]);
            } else {
               var7.append("|");
               var7.append(var6[var8]);
            }

            ++var8;
         }

         if (var1 != null) {
            var7.append("|");
            var7.append(var2);
            var7.append("-");
            var7.append(var1.getRgid());
            String var13 = null;
            String var14 = null;
            if (var2 == --3) {
               String[] var10 = var1.getValue().split("\\|");

               for(var10000 = var2 = 3 >> 2; var10000 < var10.length; var10000 = var2) {
                  int var11;
                  if ((var11 = var10[var2].indexOf("=")) != -4 >> 2) {
                     String var12;
                     if ((var12 = var10[var2].substring(3 >> 2, var11)).equals("皮肤")) {
                        var13 = var10[var2].substring(var11 + (3 & 5));
                     } else if (var12.equals("颜色")) {
                        var14 = var10[var2].substring(var11 + (3 & 5));
                     } else if (var13 == null && var12.equals("品质") && var3.getClient().gameType == 5 >> 1) {
                        var13 = var10[var2].substring(var11 + --1).equals("3924") ? "FULL" : null;
                     }
                  }

                  ++var2;
               }

               if (var13 != null) {
                  var7.append("-");
                  var7.append(var13);
                  if (var14 != null) {
                     var7.append("-");
                     var7.append(var14);
                  }
               }
            }
         }

         this.stye = var7.toString();
         return var4;
      }
   }

   public int getBasismp(int var1) {
      return this.basismp == 0 ? var1 : this.basismp;
   }

   public void setColorScheme(String var1) {
      this.ColorScheme = var1;
   }

   public int getDragon() {
      return this.dragon;
   }

   public void setZPower(Integer var1, GameView var2) {
      this.setPower(var1 - this.getExtra("力量", var2));
   }

   public int getTrainNum() {
      return this.trainNum;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }

   public String getSoil() {
      if (this.soil == null || this.soil.equals("")) {
         this.soil = "0";
      }

      return this.soil;
   }

   public Integer getZPower(GameView var1) {
      return this.getPower() + this.getExtra("力量", var1);
   }

   public void setRevealNum(int var1) {
      this.revealNum = var1;
   }

   public String getFire() {
      if (this.fire == null || this.fire.equals("")) {
         this.fire = "0";
      }

      return this.fire;
   }

   public String getAdornPart(lg var1) {
      if (this.stye != null && !this.stye.equals("")) {
         String[] var4 = this.stye.split("\\|");

         int var3;
         for(int var10000 = var3 = 3 >> 1; var10000 < var4.length; var10000 = var3) {
            if (var4[var3].startsWith("3-")) {
               String[] var2;
               if ((var2 = var4[var3].split("-")).length <= --2) {
                  return null;
               }

               String var5 = var2[1 ^ 3];
               ColorScheme var6;
               if (var2.length > --3 && (var6 = var1.ae(var2[--3])) != null && var6.getValue() != null && !var6.getValue().equals("")) {
                  var5 = var5 + "|" + var6.getValue();
               }

               return var5;
            }

            ++var3;
         }

         return null;
      } else {
         return null;
      }
   }

   public void setLyk(String var1) {
      this.lyk = var1;
   }

   public String getPetSkills() {
      return this.petSkills;
   }

   public void setFriendliness(Long var1) {
      if (var1 > 20000000L) {
         var1 = 20000000L;
      }

      this.friendliness = bk.a(var1);
   }

   public String getWater() {
      if (this.water == null || this.water.equals("")) {
         this.water = "0";
      }

      return this.water;
   }

   public int getPetlock() {
      return this.petlock;
   }

   public void setSkillValue(String var1, String var2) {
      if (this.petSkills != null && !this.petSkills.equals("")) {
         int var3;
         if (this.petSkills.startsWith(var1)) {
            if ((var3 = this.petSkills.indexOf("|")) == -4 >> 2) {
               this.petSkills = var1 + var2;
            } else {
               this.petSkills = var1 + var2 + this.petSkills.substring(var3);
            }
         } else if ((var3 = this.petSkills.indexOf("|" + var1)) == -4 >> 2) {
            this.petSkills = this.petSkills + "|" + var1 + var2;
         } else {
            String var4 = this.petSkills.substring(2 & 5, var3);
            String var5;
            if ((var3 = (var5 = this.petSkills.substring(var3 + (1 ^ 3))).indexOf("|")) == -4 >> 2) {
               this.petSkills = var4 + "|" + var1 + var2;
            } else {
               this.petSkills = var4 + "|" + var5.substring(var3 + (3 & 5)) + "|" + var1 + var2;
            }
         }
      } else {
         this.petSkills = var1 + var2;
      }
   }

   public void setSpeed(Integer var1) {
      this.speed = (int)bk.a((long)var1);
   }

   public void setFaithful(Integer var1) {
      this.faithful = var1;
   }

   public void setGrowlevel(String var1) {
      this.growlevel = var1;
   }

   public void setGrade(Integer var1) {
      this.grade = (int)bk.a((long)var1);
   }

   public void setSpir(Integer var1) {
      this.spir = (int)bk.a((long)var1);
   }

   public void setFire(String var1) {
      this.fire = var1;
   }

   public void setSkill(String var1) {
      this.skill = var1;
   }

   public o getPart(GameView var1) {
      String var10000;
      String var4;
      String var5;
      String var6;
      label34: {
         String var2 = this.summoningskin;
         var5 = this.ColorScheme;
         var6 = this.getAdornPart(var1.getObjectArea());
         var4 = null;
         if (var6 != null) {
            int var3;
            if ((var3 = var6.indexOf("|")) != -4 >> 2) {
               var4 = var6.substring(var3 + --1);
               var6 = var6.substring(3 & 4, var3);
            }

            if (var6.equals("FULL")) {
               var6 = null;
               var4 = null;
               if (var2.equals("500014")) {
                  var2 = "11022";
                  var5 = null;
                  var10000 = var2;
                  break label34;
               }

               if (var2.equals("400506")) {
                  var2 = "11023";
                  var5 = null;
                  var10000 = var2;
                  break label34;
               }

               if (var2.equals("400171")) {
                  var2 = "11024";
                  var5 = null;
                  var10000 = var2;
                  break label34;
               }

               if (var2.equals("400315")) {
                  var2 = "11025";
                  var5 = null;
               }
            }
         }

         var10000 = var2;
      }

      o var7 = dx.f(var10000, 9, 4 ^ 5, var5);
      if (var6 != null) {
         var7 = var7.d(dx.f(var6, 95 & 41, 3 & 5, var4));
      }

      return var7;
   }

   public boolean c(String var1) {
      if (this.skill != null && !this.skill.equals("")) {
         if (this.skill.equals(var1)) {
            return (boolean)(--1);
         } else if (this.skill.startsWith(var1 + "|")) {
            return (boolean)(--1);
         } else if (this.skill.endsWith("|" + var1)) {
            return (boolean)(3 & 5);
         } else {
            return (boolean)(this.skill.indexOf("|" + var1 + "|") != -4 >> 2 ? 2 ^ 3 : 0);
         }
      } else {
         return false;
      }
   }

   public int getQLNum() {
      String var1;
      return (var1 = this.getSkillValue("Q")) == null ? 5 >> 3 : Integer.parseInt(var1);
   }

   public String getBeastSkills() {
      return this.beastSkills;
   }

   public String getWood() {
      if (this.wood == null || this.wood.equals("")) {
         this.wood = "0";
      }

      return this.wood;
   }

   public int getMp() {
      return (int)bk.b((long)this.mp);
   }

   public void setSid(BigDecimal var1) {
      this.sid = var1;
   }

   public BigDecimal getSid() {
      return this.sid;
   }

   public void setZSpir(Integer var1, GameView var2) {
      this.setSpir(var1 - this.getExtra("灵性", var2));
   }

   public void setMp(int var1) {
      this.mp = (int)bk.a((long)var1);
   }

   public Integer getOpenSeal() {
      return this.openSeal;
   }

   public void setExp(BigDecimal var1) {
      this.exp = new BigDecimal(bk.a(var1.longValue()));
   }

   public int getSp() {
      return (int)bk.b((long)this.sp);
   }

   public BigDecimal getExp() {
      return new BigDecimal(bk.b(this.exp.longValue()));
   }

   public int getExtra(String var1, GameView var2) {
      if (this.stye != null && this.stye.length() > 3 >> 1) {
         var1 = var1 + "=";
         int var6 = 3 & 4;
         String[] var4 = this.stye.split("\\|");

         int var5;
         for(int var10000 = var5 = 3 & 5; var10000 < var4.length; var10000 = var5) {
            String[] var3;
            Goodstable var9;
            if ((var3 = var4[var5].split("-")).length >= 5 >> 1 && (var9 = var2.roleData.getGood(new BigDecimal(var3[--1]))) != null) {
               var3 = var9.getValue().split("\\|");

               int var7;
               for(var10000 = var7 = 5 >> 3; var10000 < var3.length; var10000 = var7) {
                  if (var3[var7].startsWith(var1)) {
                     String[] var8 = var3[var7].split("=");
                     var6 += Integer.parseInt(var8[3 >> 1]);
                  }

                  ++var7;
               }
            }

            ++var5;
         }

         return var6;
      } else {
         return 0;
      }
   }

   public void setOpenSeal(Integer var1) {
      this.openSeal = var1;
   }

   public int getHp() {
      return (int)bk.b((long)this.hp);
   }

   public String getLx() {
      return this.getSkillValue("L");
   }

   public List<BigDecimal> getGoods() {
      if (this.innerGoods != null && !this.innerGoods.equals("") || this.stye != null && this.stye.length() > 3 >> 1) {
         ArrayList var1 = new ArrayList();
         int var10000;
         String[] var2;
         int var3;
         if (this.innerGoods != null && this.innerGoods.equals("")) {
            var2 = this.innerGoods.split("\\|");

            for(var10000 = var3 = 3 & 4; var10000 < var2.length; var10000 = var3) {
               if (!var2[var3].equals("")) {
                  var1.add(new BigDecimal(var2[var3]));
               }

               ++var3;
            }
         }

         if (this.stye != null && this.stye.length() > (2 ^ 3)) {
            var2 = this.stye.split("\\|");

            for(var10000 = var3 = 3 >> 1; var10000 < var2.length; var10000 = var3) {
               String[] var4;
               if ((var4 = var2[var3].split("-")).length >= (1 ^ 3)) {
                  var1.add(new BigDecimal(var4[--1]));
               }

               ++var3;
            }
         }

         return var1.size() == 0 ? null : var1;
      } else {
         return null;
      }
   }

   public String getGold() {
      if (this.gold == null || this.gold.equals("")) {
         this.gold = "0";
      }

      return this.gold;
   }

   public void setSummoningname(String var1) {
      this.summoningname = var1;
   }

   public void setResistance(String var1) {
      this.resistance = var1;
   }

   public Integer getZCalm(GameView var1) {
      return this.getCalm() + this.getExtra("定力", var1);
   }

   public void setDragon(int var1) {
      this.dragon = var1;
   }

   public String getZqk() {
      return this.zqk;
   }

   public void setTFNum(int var1) {
      this.setSkillValue("T", String.valueOf(var1));
   }

   public void setStye(String var1) {
      this.stye = var1;
   }

   public int getBasishp() {
      return this.basishp;
   }

   public void setInnerGoods(String var1) {
      this.innerGoods = var1;
   }

   public void getSI(int[] var1, int var2, int var3, lg var4) {
      if (!hd.o(this.skillData)) {
         int var5 = 0;

         int var6;
         for(int var10000 = var6 = 3 & 4; var10000 < this.skillData.length(); var10000 = var6) {
            if ((var6 = this.skillData.indexOf("|", var5 + --1)) == -4 >> 2) {
               var6 = this.skillData.length();
            }

            if (this.skillData.charAt(var5 + --2) != (61 & 127)) {
               var10000 = var6;
            } else {
               label72: {
                  if (this.skillData.charAt(var5 + (3 & 5)) == (125 & 82)) {
                     if (this.skillData.charAt(var5) == (79 & 120)) {
                        var10000 = var6;
                        var1[3 ^ 3] = (int)((double)var1[3 ^ 3] + Double.parseDouble(this.skillData.substring(var5 + --3, var6)));
                        break label72;
                     }

                     if (this.skillData.charAt(var5) == (95 & 109)) {
                        var10000 = var6;
                        var1[--1] = (int)((double)var1[--1] + Double.parseDouble(this.skillData.substring(var5 + --3, var6)));
                        break label72;
                     }

                     if (this.skillData.charAt(var5) == (123 & 69)) {
                        var10000 = var6;
                        var1[5 >> 1] = (int)((double)var1[5 >> 1] + Double.parseDouble(this.skillData.substring(var5 + --3, var6)));
                        break label72;
                     }

                     if (this.skillData.charAt(var5) == (115 & 95)) {
                        var10000 = var6;
                        var1[--3] = (int)((double)var1[--3] + Double.parseDouble(this.skillData.substring(var5 + --3, var6)));
                        break label72;
                     }
                  } else if (this.skillData.charAt(var5 + (3 >> 1)) == (127 & 83)) {
                     Skill var7;
                     if ((var7 = var4.bf(this.skillData.substring(var5 + --3, var6))) == null) {
                        var10000 = var6;
                        break label72;
                     }

                     double var8 = Double.parseDouble(var7.getValue());
                     double var10 = Double.parseDouble(var7.getGrow());
                     if (this.skillData.charAt(var5) == (75 & 124)) {
                        var10000 = var6;
                        var1[5 >> 3] = (int)((double)var1[5 >> 3] + BaseValue.g(var8, var10, this.getFriendliness(), var2, var3));
                        break label72;
                     }

                     if (this.skillData.charAt(var5) == (127 & 77)) {
                        var10000 = var6;
                        var1[2 ^ 3] = (int)((double)var1[2 ^ 3] + BaseValue.g(var8, var10, this.getFriendliness(), var2, var3));
                        break label72;
                     }

                     if (this.skillData.charAt(var5) == (77 & 115)) {
                        var10000 = var6;
                        var1[--2] = (int)((double)var1[--2] + BaseValue.g(var8, var10, this.getFriendliness(), var2, var3));
                        break label72;
                     }

                     if (this.skillData.charAt(var5) == (127 & 83)) {
                        var1[--3] = (int)((double)var1[--3] + BaseValue.g(var8, var10, this.getFriendliness(), var2, var3));
                     }
                  }

                  var10000 = var6;
               }
            }

            var5 = var10000 + 1;
         }

      }
   }

   public void setPower(Integer var1) {
      this.power = (int)bk.a((long)var1);
   }

   public void setZCalm(Integer var1, GameView var2) {
      this.setCalm(var1 - this.getExtra("定力", var2));
   }

   public int getXYLvl() {
      String var1;
      int var2;
      return (var1 = this.getSkillValue("X")) == null ? 5 >> 3 : Integer.parseInt((var2 = var1.indexOf("=")) != -4 >> 2 ? var1.substring(5 >> 3, var2) : var1);
   }

   public void setBone(Integer var1) {
      this.bone = (int)bk.a((long)var1);
   }

   public String getSummoningskin() {
      return this.summoningskin;
   }

   public void setQLNum(int var1) {
      this.setSkillValue("Q", String.valueOf(var1));
   }

   public int getAp() {
      return (int)bk.b((long)this.ap);
   }

   public String getFourattributes() {
      return this.fourattributes;
   }

   public void setHp(int var1) {
      this.hp = (int)bk.a((long)var1);
   }

   public int getCanpoint() {
      int var1;
      int var2 = cX.n(var1 = this.getGrade());
      int var3 = (var1 = cX.p(var1)) * (56 & 79);
      if (var2 >= --4) {
         var3 += var1;
      }

      return var3 + var2 * (95 & 62) - this.getBone() - this.getSpir() - this.getPower() - this.getSpeed() - this.getCalm();
   }

   public void setSsn(String var1) {
      this.ssn = var1;
   }

   public String getInnerGoods() {
      return this.innerGoods;
   }

   public Integer getCalm() {
      if (this.calm == null) {
         this.setCalm(3 >> 2);
      }

      return (int)bk.b((long)this.calm);
   }

   public Integer getPower() {
      return (int)bk.b((long)this.power);
   }

   public Long getFriendliness() {
      if (this.friendliness == null) {
         this.setFriendliness(0L);
      }

      return bk.b(this.friendliness);
   }

   public BigDecimal getGoodId(int var1) {
      if (this.stye != null && this.stye.length() > (2 ^ 3)) {
         String var5 = String.valueOf(var1);
         String[] var2 = this.stye.split("\\|");

         int var3;
         for(int var10000 = var3 = --1; var10000 < var2.length; var10000 = var3) {
            String[] var4 = var2[var3].split("-");
            if (var5.equals(var4[3 >> 2])) {
               return new BigDecimal(var4[--1]);
            }

            ++var3;
         }

         return null;
      } else {
         return null;
      }
   }

   public void setZqk(String var1) {
      this.zqk = var1;
   }

   public String getXy() {
      return this.getSkillValue("X");
   }

   public Integer getZBone(GameView var1) {
      return this.getBone() + this.getExtra("根骨", var1);
   }

   public void setSp(int var1) {
      this.sp = (int)bk.a((long)var1);
   }

   public void setBasishp(int var1) {
      this.basishp = var1 <= 0 ? --1 : var1;
   }

   public BigDecimal getRoleid() {
      return this.roleid;
   }

   public void setGold(String var1) {
      this.gold = var1;
   }

   public Integer getBone() {
      return (int)bk.b((long)this.bone);
   }

   public void setDraC(int var1) {
      this.draC = var1;
   }

   public String getStye() {
      return this.stye;
   }

   public int getTurnRount() {
      return cX.n(this.getGrade());
   }

   public String getSkillData() {
      return this.skillData;
   }

   public int getFlyupNum() {
      return this.flyupNum;
   }

   public void setFlyupNum(int var1) {
      this.flyupNum = var1;
   }

   public String getSkillValue(String var1) {
      if (this.petSkills != null && !this.petSkills.equals("")) {
         int var2;
         if (this.petSkills.startsWith(var1)) {
            return (var2 = this.petSkills.indexOf("|")) == -4 >> 2 ? this.petSkills.substring(--1) : this.petSkills.substring(3 >> 1, var2);
         } else if ((var2 = this.petSkills.indexOf("|" + var1)) == -4 >> 2) {
            return null;
         } else {
            return (var2 = (var1 = this.petSkills.substring(var2 + (5 >> 1))).indexOf("|")) == -4 >> 2 ? var1 : var1.substring(2 & 5, var2);
         }
      } else {
         return null;
      }
   }

   public String getColorScheme() {
      return this.ColorScheme;
   }

   public int getOpenSealByType(int var1) {
      if (var1 == 0) {
         return this.openSeal & 127 & 63;
      } else if (var1 == --1) {
         return this.openSeal >> (102 & 31) & 63 & 127;
      } else {
         return var1 == (1 ^ 3) ? this.openSeal >> (61 & 78) & 23551 & 9471 : this.openSeal & 63 & 127;
      }
   }

   public String getResistance() {
      return this.resistance;
   }

   public int getLxValue() {
      String var1;
      if ((var1 = this.getSkillValue("L")) == null) {
         return 3 >> 2;
      } else {
         int var2;
         if ((var2 = var1.indexOf("=")) == -4 >> 2) {
            return 5 >> 3;
         } else {
            return (var2 = (var1 = var1.substring(var2 + (4 ^ 5))).indexOf("=")) == -4 >> 2 ? Integer.parseInt(var1) : Integer.parseInt(var1.substring(3 >> 2, var2));
         }
      }
   }

   public void setBasismp(int var1) {
      this.basismp = var1;
   }

   public Integer getZSpir(GameView var1) {
      return this.getSpir() + this.getExtra("灵性", var1);
   }

   public void setZBone(Integer var1, GameView var2) {
      this.setBone(var1 - this.getExtra("根骨", var2));
   }

   public Integer getFaithful() {
      return this.faithful;
   }

   public void setZSpeed(Integer var1, GameView var2) {
      this.setSpeed(var1 - this.getExtra("敏捷", var2));
   }

   public int getTFNum() {
      String var1;
      return (var1 = this.getSkillValue("T")) == null ? 5 >> 3 : Integer.parseInt(var1);
   }

   public void setFourattributes(String var1) {
      this.fourattributes = var1;
   }

   public String getSummoningid() {
      return this.summoningid;
   }
}
