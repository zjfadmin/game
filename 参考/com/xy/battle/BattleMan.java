package com.xy.battle;

import com.xy.cY;
import com.xy.dx;
import com.xy.o;
import com.xy.z;
import com.xy.text.SystemData;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BattleMan {
   private int hp_Current;
   private int bsp;
   static List<String> drawDown;
   private int bap;
   private transient int nd;
   private float alpha = 1.0F;
   private int type;
   public transient BigDecimal[] lingIds;
   private int Camp;
   private String States;
   private String msg;
   private int nqz;
   private int xyz;
   private int zs;
   private int yqz;
   private int man;
   private String State_1;
   private int id;
   private transient boolean skill1244;
   static String[] fbs;
   private int mp_Total;
   private transient boolean SR;
   public transient BigDecimal[] petIds;
   private Integer W;
   private transient boolean skill9307;
   private int mp_Current;
   private Integer die;
   private transient List<BattleBuff> stateList = new ArrayList();
   private Integer campId;
   private String manname;
   private int hp_Total;
   private String model = "img/角色/鬼族/祭剑魂";

   public int getMp_Total() {
      return this.mp_Total;
   }

   public int getMan() {
      return this.man;
   }

   public void setHp_Total(int var1) {
      this.hp_Total = var1;
   }

   public void setManname(String var1) {
      this.manname = var1;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = 3 >> 2;
      int var10000;
      if (var1 != 0) {
         var10000 = 5 >> 2;
         this.hp_Current = k(this.hp_Total, this.hp_Current, var1);
         var6 = var10000;
      }

      if (var2 != 0) {
         var10000 = 5 >> 2;
         this.mp_Current = k(this.mp_Total, this.mp_Current, var2);
         var6 = var10000;
      }

      if (var3 != 0) {
         var10000 = 5 >> 2;
         this.yqz += var3;
         var6 = var10000;
      }

      if (var4 != 0) {
         var10000 = --1;
         this.nqz += var4;
         var6 = var10000;
      }

      if (var5 != 0) {
         var10000 = --1;
         this.xyz += var5;
         var6 = var10000;
      }

      return (boolean)var6;
   }

   public boolean b(String var1) {
      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.stateList.size(); var10000 = var2) {
         if (((BattleBuff)this.stateList.get(var2)).getType().equals(var1)) {
            return (boolean)(4 ^ 5);
         }

         ++var2;
      }

      return (boolean)(2 & 5);
   }

   public void setMp_Total(int var1) {
      this.mp_Total = var1;
   }

   public int getType() {
      return this.type;
   }

   public void c(Graphics var1, long var2, int var4, int var5) {
      int var6;
      for(int var10000 = var6 = 3 >> 2; var10000 < this.stateList.size(); var10000 = var6) {
         BattleBuff var7;
         if ((var7 = (BattleBuff)this.stateList.get(var6)).getCamp() == 3 >> 1) {
            var7.c(var1, var2, var4, var5);
         }

         ++var6;
      }

      z var8;
      if (this.skill1244 && this.alpha == 0.3F && (var8 = dx.q(cY.f("1244"))) != null) {
         var8.d(var2, 5 >> 3);
         var8.aa(var1, var4, var5);
      }

   }

   public void d(String var1) {
      if (var1 != null) {
         String[] var5 = var1.split("\\|");

         int var4;
         for(int var10000 = var4 = 3 >> 2; var10000 < var5.length; var10000 = var4) {
            boolean var10002;
            String var3;
            String[] var6;
            String[] var7;
            if ((var3 = var5[var4]).equals("清除状态")) {
               var7 = new String[95 & 55];
               var10002 = true;
               var7[2 & 5] = "减人仙";
               var7[3 & 5] = "减魔鬼";
               var7[5 >> 1] = "庇护";
               var7[--3] = "遗忘";
               var7[--4] = "封印";
               var7[--5] = "中毒";
               var7[63 & 70] = "昏睡";
               var7[71 & 63] = "混乱";
               var7[73 & 62] = "mh";
               var7[79 & 57] = "金";
               var7[11 & 126] = "木";
               var7[43 & 95] = "水";
               var7[15 & 124] = "火";
               var7[95 & 45] = "土";
               var7[62 & 79] = "1876";
               var7[127 & 15] = "力量";
               var7[89 & 54] = "抗性";
               var7[123 & 21] = "加速";
               var7[122 & 23] = "smmh";
               var7[59 & 87] = "减速";
               var7[52 & 95] = "bbss";
               var7[21] = "fbJge";
               var7[22] = "fbQw";
               var6 = var7;
               this.e(var6);
            } else if (var3.equals("清除异常状态")) {
               var7 = new String[13];
               var10002 = true;
               var7[5 >> 3] = "减速";
               var7[--1] = "遗忘";
               var7[5 >> 1] = "封印";
               var7[--3] = "中毒";
               var7[--4] = "昏睡";
               var7[--5] = "混乱";
               var7[6] = "mh";
               var7[7] = "bbss";
               var7[8] = "fbJge";
               var7[9] = "fbQw";
               var7[10] = "fbYsjl";
               var7[11] = "1232";
               var7[12] = "1869";
               var6 = var7;
               this.e(var6);
            } else if (var3.equals("清除五行")) {
               var7 = new String[7];
               var10002 = true;
               var7[3 & 4] = "金";
               var7[5 >> 2] = "木";
               var7[1 ^ 3] = "水";
               var7[--3] = "火";
               var7[--4] = "土";
               var7[--5] = "1605";
               var7[6] = "1876";
               var6 = var7;
               this.e(var6);
            } else if (var3.equals("非控制减益")) {
               var7 = new String[--4];
               var10002 = true;
               var7[3 >> 2] = "减速";
               var7[5 >> 2] = "减人仙";
               var7[--2] = "减魔鬼";
               var7[--3] = "中毒";
               var6 = var7;
               this.e(var6);
            } else if (var3.equals("隐身")) {
               this.alpha = 1.0F;
            } else if (var3.equals("3029")) {
               this.SR = (boolean)(3 ^ 3);
            } else {
               int var2;
               if (var3.equals("9307S")) {
                  this.skill9307 = (boolean)(3 >> 2);
               } else {
                  for(var10000 = var2 = this.stateList.size() - (4 ^ 5); var10000 >= 0; var10000 = var2) {
                     if (var3.equals(((BattleBuff)this.stateList.get(var2)).getType())) {
                        this.stateList.remove(var2);
                        break;
                     }

                     --var2;
                  }
               }
            }

            ++var4;
         }

      }
   }

   public void setMsg(String var1) {
      this.msg = var1;
   }

   public String getStates() {
      return this.States;
   }

   public void e(String[] var1) {
      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < var1.length; var10000 = var2) {
         int var3;
         for(var10000 = var3 = this.stateList.size() - (5 >> 2); var10000 >= 0; var10000 = var3) {
            if (var1[var2].equals(((BattleBuff)this.stateList.get(var3)).getType())) {
               this.stateList.remove(var3);
               break;
            }

            --var3;
         }

         ++var2;
      }

   }

   public boolean f() {
      return this.SR;
   }

   public void setMan(int var1) {
      this.man = var1;
   }

   public int getNqz() {
      return this.nqz;
   }

   public void setAlpha(float var1) {
      this.alpha = var1;
   }

   public List<TypeState> g(String var1) {
      ArrayList var5 = new ArrayList();
      String[] var3 = this.State_1.split("\\|");

      int var4;
      for(int var10000 = var4 = 5 >> 3; var10000 < var3.length; var10000 = var4) {
         String[] var2;
         if ((var2 = var3[var4].split("="))[5 >> 3].equals(var1)) {
            var2 = var2[3 & 5].split("\\_");

            int var6;
            for(var10000 = var6 = 5 >> 3; var10000 < var2.length; var10000 = var6) {
               String[] var7 = var2[var6].split("\\-");
               TypeState var8 = new TypeState();
               int var10004 = 3 >> 1;
               var8.setType(var7[5 >> 3]);
               String var10003 = var7[var10004];
               ++var6;
               var8.setState(Integer.parseInt(var10003));
               var5.add(var8);
            }
         }

         ++var4;
      }

      return var5;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public List<BattleBuff> getStateList() {
      return this.stateList;
   }

   public int getHp_Current() {
      return this.hp_Current;
   }

   public void setMp_Current(int var1) {
      this.mp_Current = var1;
   }

   public int getBap() {
      return this.bap;
   }

   public void setStateList(List<BattleBuff> var1) {
      this.stateList = var1;
   }

   static {
      String[] var10000 = new String[123 & 95];
      boolean var10002 = true;
      var10000[3 & 4] = "1337";
      var10000[4 ^ 5] = "fbYsjl";
      var10000[--2] = "fbJjl";
      var10000[--3] = "fbDsc";
      var10000[--4] = "fbQbllt";
      var10000[--5] = "fbHlz";
      var10000[62 & 71] = "fbYmgs";
      var10000[111 & 23] = "fbDsy";
      var10000[94 & 41] = "fbJqb";
      var10000[77 & 59] = "fbQw";
      var10000[95 & 42] = "fbBld";
      var10000[31 & 107] = "fbJge";
      var10000[109 & 30] = "fbFty";
      var10000[45 & 95] = "fbJljs";
      var10000[94 & 47] = "fbBgz";
      var10000[79 & 63] = "fbHd";
      var10000[88 & 55] = "bbss";
      var10000[127 & 17] = "6018";
      var10000[115 & 30] = "6019";
      var10000[31 & 115] = "6022";
      var10000[86 & 61] = "6024";
      var10000[21] = "6025";
      var10000[22] = "6027";
      var10000[23] = "6028";
      var10000[24] = "7002";
      var10000[25] = "7008";
      var10000[26] = "7015";
      var10000[27] = "7026";
      var10000[28] = "7033";
      var10000[29] = "7034";
      var10000[30] = "7035";
      var10000[31] = "9389";
      var10000[32] = "沧波";
      var10000[33] = "扶摇";
      var10000[34] = "甘霖";
      var10000[35] = "1231";
      var10000[36] = "1232";
      var10000[37] = "1866";
      var10000[38] = "1869";
      var10000[39] = "1873";
      var10000[40] = "1238";
      var10000[41] = "1882";
      var10000[42] = "1883";
      var10000[43] = "20003";
      var10000[44] = "30010";
      var10000[45] = "11010";
      var10000[46] = "战意";
      var10000[47] = "破甲";
      var10000[48] = "11052";
      var10000[49] = "11047";
      var10000[50] = "11055";
      var10000[51] = "11063";
      var10000[52] = "11029";
      var10000[53] = "LBFD";
      var10000[54] = "LBFD2";
      var10000[55] = "12001";
      var10000[56] = "12002";
      var10000[57] = "12003";
      var10000[58] = "12005";
      var10000[59] = "12007";
      var10000[60] = "12008";
      var10000[61] = "12010";
      var10000[62] = "12011";
      var10000[63] = "12012";
      var10000[64] = "12013";
      var10000[65] = "12014";
      var10000[66] = "12015";
      var10000[67] = "12016";
      var10000[68] = "12017";
      var10000[69] = "12018";
      var10000[70] = "12501";
      var10000[71] = "12502";
      var10000[72] = "12503";
      var10000[73] = "12508";
      var10000[74] = "12510";
      var10000[75] = "12513";
      var10000[76] = "12514";
      var10000[77] = "12515";
      var10000[78] = "12516";
      var10000[79] = "1242";
      var10000[80] = "3026";
      var10000[81] = "3036";
      var10000[82] = "1267A";
      var10000[83] = "1267B";
      var10000[84] = "1267C";
      var10000[85] = "1895";
      var10000[86] = "1214";
      var10000[87] = "7027";
      var10000[88] = "1223";
      var10000[89] = "7038";
      var10000[90] = "驻足";
      fbs = var10000;
      drawDown = new ArrayList();
      drawDown.add("金");
      drawDown.add("木");
      drawDown.add("土");
      drawDown.add("水");
      drawDown.add("火");
      drawDown.add("1605");
      drawDown.add("1869");
      drawDown.add("1876");
      drawDown.add("1876");
   }

   public Integer getCampId() {
      return this.campId;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setState_1(String var1) {
      this.State_1 = var1;
   }

   public float getAlpha() {
      return this.alpha;
   }

   public void setW(Integer var1) {
      this.W = var1;
   }

   public void setCampId(Integer var1) {
      this.campId = var1;
   }

   public void setStates(String var1) {
      this.States = var1;
   }

   public void setModel(String var1) {
      this.model = var1;
   }

   public void h(String var1) {
      if (var1 != null) {
         String[] var6 = var1.split("\\|");

         int var4;
         for(int var10000 = var4 = 3 ^ 3; var10000 < var6.length; var10000 = var4) {
            String var2;
            String var3;
            int var5;
            if ((var5 = (var2 = var3 = var6[var4]).indexOf("#")) != -4 >> 2) {
               var2 = var3.substring(var5 + --1);
               var3 = var3.substring(3 >> 2, var5);
            }

            if (var2.equals("1337")) {
               var2 = "封印";
            }

            if (var3.equals("隐身")) {
               this.alpha = 0.3F;
            } else if (var3.equals("3029")) {
               this.SR = (boolean)(2 ^ 3);
            } else if (var3.equals("9307S")) {
               this.skill9307 = (boolean)(3 & 5);
            } else if (this.j(var3) && !this.b(var3)) {
               this.stateList.add(new BattleBuff(var3, var2, drawDown.contains(var3) ? 3 ^ 3 : 1));
            }

            ++var4;
         }

      }
   }

   public Integer getDie() {
      return this.die;
   }

   public String getManname() {
      return this.manname;
   }

   public void i() {
      String[] var4 = this.States != null ? this.States.split("\\|") : null;
      if (var4 != null) {
         int var10001 = 3 ^ 3;
         this.stateList.clear();
         this.nd = var10001;

         int var5;
         for(int var10000 = var5 = 3 >> 2; var10000 < var4.length; var10000 = var5) {
            String var1;
            int var2;
            String var3;
            if ((var2 = (var1 = var3 = var4[var5]).indexOf("#")) != -4 >> 2) {
               var1 = var3.substring(var2 + (5 >> 2));
               var3 = var3.substring(3 >> 2, var2);
            }

            String var7;
            if (var1.equals("1337")) {
               var1 = "封印";
               var7 = var3;
            } else {
               if (var1.equals("1223")) {
                  var1 = "7026";
               }

               var7 = var3;
            }

            if (!var7.startsWith("tj") && !var3.startsWith("mj") && !var3.startsWith("xl") && !var3.startsWith("rj")) {
               if (var3.equals("1244")) {
                  this.skill1244 = (boolean)(3 >> 1);
               } else if (var3.equals("隐身")) {
                  this.alpha = 0.3F;
               } else if (var3.equals("3029")) {
                  this.SR = (boolean)(5 >> 2);
               } else if (var3.equals("9307S")) {
                  this.skill9307 = (boolean)(--1);
               } else if (this.j(var3) && !this.b(var3)) {
                  this.stateList.add(new BattleBuff(var3, var1, drawDown.contains(var3) ? 3 & 4 : 1));
               }
            } else {
               BattleBuff var6;
               BattleBuff var8 = var6 = new BattleBuff(var3, var1, 5 >> 1);
               int var10003 = this.nd;
               this.nd = var10003 + --1;
               var8.setXy(var10003);
               this.stateList.add(var6);
            }

            ++var5;
         }

      }
   }

   public void setBap(int var1) {
      this.bap = var1;
   }

   public int getYqz() {
      return this.yqz;
   }

   public void setZs(int var1) {
      this.zs = var1;
   }

   public void setHp_Current(int var1) {
      this.hp_Current = var1;
   }

   public int getXyz() {
      return this.xyz;
   }

   public boolean j(String var1) {
      if (!var1.equals("金") && !var1.equals("木") && !var1.equals("水") && !var1.equals("土") && !var1.equals("火") && !var1.equals("1876") && !var1.equals("1605")) {
         if (!var1.equals("遗忘") && !var1.equals("封印") && !var1.equals("昏睡") && !var1.equals("混乱") && !var1.equals("bbss")) {
            if (!var1.equals("骨盾") && !var1.equals("减人仙") && !var1.equals("减魔鬼") && !var1.equals("庇护") && !var1.equals("中毒") && !var1.equals("力量") && !var1.equals("抗性") && !var1.equals("加速") && !var1.equals("归墟") && !var1.equals("毒针轻刺") && !var1.equals("回魂咒") && !var1.equals("化羽") && !var1.equals("阴阳逆转") && !var1.equals("mh") && !var1.equals("smmh") && !var1.equals("减速")) {
               if (!var1.equals("风水") && !var1.equals("雷火") && !var1.equals("鬼力") && !var1.equals("玉净散")) {
                  String[] var10000;
                  boolean var10002;
                  String[] var2;
                  int var4;
                  if (var1.equals("6029")) {
                     var10000 = new String[95 & 41];
                     var10002 = true;
                     var10000[5 >> 3] = "6029";
                     var10000[3 >> 1] = "遗忘";
                     var10000[1 ^ 3] = "封印";
                     var10000[--3] = "中毒";
                     var10000[--4] = "昏睡";
                     var10000[--5] = "混乱";
                     var10000[110 & 23] = "fbJge";
                     var10000[7 & 127] = "fbQw";
                     var10000[110 & 25] = "bbss";
                     var2 = var10000;
                     var4 = 3 >> 1;
                     this.e(var2);
                     return (boolean)var4;
                  } else if (var1.equals("7009")) {
                     var4 = 2 ^ 3;
                     this.d("昏睡");
                     this.d("混乱");
                     this.d("遗忘");
                     this.d("7009");
                     this.d("bbss");
                     return (boolean)var4;
                  } else if (!var1.equals("1237") && !var1.equals("1237A") && !var1.equals("1237B")) {
                     if (!var1.equals("1267A") && !var1.equals("1267B") && !var1.equals("1267C")) {
                        int var3;
                        for(var4 = var3 = 0; var4 < fbs.length; var4 = var3) {
                           if (fbs[var3].equals(var1)) {
                              var4 = 4 ^ 5;
                              this.d(var1);
                              return (boolean)var4;
                           }

                           ++var3;
                        }

                        return (boolean)(5 >> 3);
                     } else {
                        var10000 = new String[3];
                        var10002 = true;
                        var10000[3 ^ 3] = "1267A";
                        var10000[4 ^ 5] = "1267B";
                        var10000[5 >> 1] = "1267C";
                        var2 = var10000;
                        var4 = --1;
                        this.e(var2);
                        return (boolean)var4;
                     }
                  } else {
                     var10000 = new String[3];
                     var10002 = true;
                     var10000[3 >> 2] = "1237";
                     var10000[3 >> 1] = "1237A";
                     var10000[--2] = "1237B";
                     var2 = var10000;
                     var4 = 4 ^ 5;
                     this.e(var2);
                     return (boolean)var4;
                  }
               } else {
                  this.d("风水");
                  this.d("雷火");
                  this.d("鬼力");
                  this.d("玉净散");
                  return (boolean)(--1);
               }
            } else {
               return true;
            }
         } else {
            if (var1.equals("封印")) {
               this.d("中毒");
            }

            this.d("封印");
            this.d("昏睡");
            this.d("混乱");
            this.d("遗忘");
            this.d("bbss");
            return (boolean)(4 ^ 5);
         }
      } else {
         this.d("清除五行");
         return (boolean)(2 ^ 3);
      }
   }

   public void setCamp(int var1) {
      this.Camp = var1;
   }

   public Integer getW() {
      return this.W;
   }

   public void setSkill9307(boolean var1) {
      this.skill9307 = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setNqz(int var1) {
      this.nqz = var1;
   }

   public static int k(int var0, int var1, int var2) {
      if (var1 + var2 > var0) {
         return var0;
      } else {
         return var1 + var2 < 0 ? 3 ^ 3 : var1 + var2;
      }
   }

   public int getCamp() {
      return this.Camp;
   }

   public int getBsp() {
      return this.bsp;
   }

   public boolean l(Graphics var1, long var2, int var4, int var5, int var6) {
      int var7 = 5 >> 3;
      BattleBuff var8 = null;
      int var9 = this.nd != 0 ? var6 % this.nd : 0;

      for(int var10000 = var6 = 3 >> 2; var10000 < this.stateList.size(); var10000 = var6) {
         BattleBuff var10;
         if ((var10 = (BattleBuff)this.stateList.get(var6)).getCamp() == 3 >> 1) {
            var7 = 3 & 5;
         } else if (var10.getCamp() == 5 >> 1) {
            if (var8 == null || var10.getXy() == var9) {
               var8 = var10;
            }
         } else {
            var10.c(var1, var2, var4, var5);
         }

         ++var6;
      }

      if (var8 != null) {
         var8.c(var1, var2, var4, var5);
      }

      return (boolean)var7;
   }

   public String getModel() {
      return this.model;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setBsp(int var1) {
      this.bsp = var1;
   }

   public o getPart() {
      String[] var4 = this.model.split("\\&");
      o var6 = null;

      int var3;
      for(int var10000 = var3 = 5 >> 3; var10000 < var4.length; var10000 = var3) {
         if (var4[var3].startsWith("W")) {
            this.W = Integer.parseInt(var4[var3].substring(2 ^ 3));
         } else {
            String[] var1;
            String[] var10 = var1 = var4[var3].split("\\_");
            String var5 = var10[2 & 5];
            int var2 = 2 & 5;
            int var7 = -1 & -2;
            String var8 = null;
            if (var10.length == --1) {
               var2 = 2 ^ 3;
               var7 = 111 & 23;
               var10000 = var2;
            } else {
               if (var1.length > 3 >> 1) {
                  var2 = Integer.parseInt(var1[5 >> 2]);
               }

               if (var1.length > (1 ^ 3)) {
                  var7 = Integer.parseInt(var1[--2]);
               }

               if (var1.length > --3) {
                  var8 = var1[--3];
               }

               var10000 = var2;
            }

            if (var10000 != 5 && var2 != (-5 & -1) || !SystemData.isWing) {
               o var9 = dx.f(var5, var7, var2, var8);
               if (var6 == null) {
                  var6 = var9;
               } else {
                  var6 = var6.d(var9);
               }
            }
         }

         ++var3;
      }

      return var6;
   }

   public int getHp_Total() {
      return this.hp_Total;
   }

   public void setSR(boolean var1) {
      this.SR = var1;
   }

   public void setXyz(int var1) {
      this.xyz = var1;
   }

   public String getState_1() {
      return this.State_1;
   }

   public boolean m() {
      return this.skill9307;
   }

   public int getMp_Current() {
      return this.mp_Current;
   }

   public int getZs() {
      return this.zs;
   }

   public void setYqz(int var1) {
      this.yqz = var1;
   }
}
