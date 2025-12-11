package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseQl;
import com.xy.formula.BaseValue;
import com.xy.formula.Ql;
import com.xy.formula.RoleProperty;
import com.xy.game.RoleData;
import com.xy.text.GameView;
import java.awt.Image;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class25 extends com.xy.q.Class30 {
   private BigDecimal nh;
   private Image g;
   private static Map<String, Integer> ais = new HashMap<>();
   private int ds;
   private Class14[] ait;
   private static List<String> jr = new ArrayList<>(40);

   // $VF: synthetic method
   static void abe(Class25 var0, Image var1) {
      var0.g = var1;
   }

   public void abf(int var1, double var2, String var4, String var5) {
      if (var2 != 0.0) {
         if (var1 == 1) {
            this.ait[0].mn(var2, var4, var5);
         } else if (var1 == 2) {
            this.ait[3].mn(var2, var4, var5);
         } else if (var1 == 3) {
            this.ait[1].mn(var2, var4, var5);
         } else if (var1 == 4) {
            this.ait[2].mn(var2, var4, var5);
         } else {
            if (var1 == 5) {
               this.ait[4].mn(var2, var4, var5);
            }
         }
      }
   }

   public void abg(Ql var1) {
      try {
         BaseQl var2 = null;

         int var3;
         for (int var10000 = var3 = 0; var10000 < jr.size(); var10000 = ++var3) {
            Field var4;
            if ((var4 = var1.getClass().getDeclaredField(jr.get(var3))) != null) {
               var4.setAccessible(true);
               double var5;
               if ((var5 = var4.getDouble(var1)) != 0.0 && (var2 = abl(var4.getName(), var2)).getKey() != null) {
                  if (this.za().l(2, 3)) {
                     String var12 = var2.getKey();
                     String var10001 = "个尋虈";
                     if (var12.indexOf("三尸虫") != -1) {
                        continue;
                     }

                     String var13 = var2.getKey();
                     var10001 = "鬒瀦";
                     if (var13.indexOf("鬼火") != -1) {
                        continue;
                     }

                     String var14 = var2.getKey();
                     var10001 = "遤忻";
                     if (var14.indexOf("遗忘") != -1) {
                        continue;
                     }

                     String var15 = var2.getKey();
                     var10001 = "魫悜";
                     if (var15.indexOf("魅惑") != -1) {
                        continue;
                     }
                  }

                  this.abf((int)var2.getValue(), var5, var2.getKey(), var4.getName());
               }
            }
         }

         Field[] var9 = var1.getClass().getDeclaredFields();

         int var10;
         for (int var16 = var10 = 0; var16 < var9.length; var16 = ++var10) {
            Field var11 = var9[var10];
            if (!jr.contains(var11.getName())) {
               var11.setAccessible(true);
               double var6;
               if ((var6 = var11.getDouble(var1)) != 0.0 && (var2 = abl(var11.getName(), var2)).getKey() != null) {
                  if (this.za().l(2, 3)) {
                     String var17 = var2.getKey();
                     String var24 = "个尋虈";
                     if (var17.indexOf("三尸虫") != -1) {
                        continue;
                     }

                     String var18 = var2.getKey();
                     var24 = "鬒瀦";
                     if (var18.indexOf("鬼火") != -1) {
                        continue;
                     }

                     String var19 = var2.getKey();
                     var24 = "遤忻";
                     if (var19.indexOf("遗忘") != -1) {
                        continue;
                     }

                     String var20 = var2.getKey();
                     var24 = "魫悜";
                     if (var20.indexOf("魅惑") != -1) {
                        continue;
                     }
                  }

                  this.abf((int)var2.getValue(), var6, var2.getKey(), var11.getName());
               }
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   static {
      Integer var0 = 3;
      String var10001 = "HDO";
      ais.put("kwl", var0);
      String var10002 = "&H+";
      ais.put("kff", var0);
      String var10003 = "H_E";
      ais.put("klf", var0);
      String var10004 = "&]+";
      ais.put("ksf", var0);
      String var10005 = "H[E";
      ais.put("khf", var0);
      String var10006 = "&F!";
      ais.put("khl", var0);
      String var10007 = "H[P";
      ais.put("khs", var0);
      String var10008 = "&H4";
      ais.put("kfy", var0);
      String var10009 = "HIG";
      ais.put("kzd", var0);
      String var10010 = "&W:";
      ais.put("kyw", var0);
      String var10011 = "HTK";
      ais.put("kgh", var0);
      String var10012 = "(J>";
      ais.put("eds", 1);
      int var1 = 0;

      for (int var10000 = var1; var10000 < 40; var10000 = var1) {
         String var4;
         if (var1 == 0) {
            String var3 = "HUE";
            var4 = "kff";
         } else if (var1 == 1) {
            String var5 = "&F+";
            var4 = "khf";
         } else if (var1 == 2) {
            String var6 = "H@E";
            var4 = "ksf";
         } else if (var1 == 3) {
            String var7 = "&B+";
            var4 = "klf";
         } else if (var1 == 4) {
            String var8 = "HUZ";
            var4 = "kfy";
         } else if (var1 == 5) {
            String var9 = "&F!";
            var4 = "khl";
         } else if (var1 == 6) {
            String var10 = "H[P";
            var4 = "khs";
         } else if (var1 == 7) {
            String var11 = "&W:";
            var4 = "kyw";
         } else if (var1 == 8) {
            String var12 = "HIG";
            var4 = "kzd";
         } else if (var1 == 9) {
            String var13 = "E7J>";
            var4 = "kzds";
         } else if (var1 == 10) {
            String var14 = "HIP";
            var4 = "kzs";
         } else if (var1 == 11) {
            String var15 = "&T>F=";
            var4 = "kzshp";
         } else if (var1 == 12) {
            String var16 = "HIP^S";
            var4 = "kzsmp";
         } else if (var1 == 13) {
            String var17 = "&I%";
            var4 = "kgh";
         } else if (var1 == 14) {
            String var18 = "H@@";
            var4 = "ksc";
         } else if (var1 == 15) {
            String var19 = "<H+";
            var4 = "qff";
         } else if (var1 == 16) {
            String var20 = "R[E";
            var4 = "qhf";
         } else if (var1 == 17) {
            String var21 = "<]+";
            var4 = "qsf";
         } else if (var1 == 18) {
            String var22 = "R_E";
            var4 = "qlf";
         } else if (var1 == 19) {
            String var23 = "<H4";
            var4 = "qfy";
         } else if (var1 == 20) {
            String var24 = "R[O";
            var4 = "qhl";
         } else if (var1 == 21) {
            String var25 = "<F>";
            var4 = "qhs";
         } else if (var1 == 22) {
            String var26 = "RJT";
            var4 = "qyw";
         } else if (var1 == 23) {
            String var27 = "<T)";
            var4 = "qzd";
         } else if (var1 == 24) {
            String var28 = "BYWP";
            var4 = "qzds";
         } else if (var1 == 25) {
            String var29 = "<T>";
            var4 = "qzs";
         } else if (var1 == 26) {
            String var30 = "RTK";
            var4 = "qgh";
         } else if (var1 == 27) {
            String var31 = "<].";
            var4 = "qsc";
         } else if (var1 == 28) {
            String var32 = "R@@[[";
            var4 = "qschx";
         } else if (var1 == 29) {
            String var33 = "%H+";
            var4 = "hff";
         } else if (var1 == 30) {
            String var34 = "K[E";
            var4 = "hhf";
         } else if (var1 == 31) {
            String var35 = "%]+";
            var4 = "hsf";
         } else if (var1 == 32) {
            String var36 = "K_E";
            var4 = "hlf";
         } else if (var1 == 33) {
            String var37 = "%H4";
            var4 = "hfy";
         } else if (var1 == 34) {
            String var38 = "K[O";
            var4 = "hhl";
         } else if (var1 == 35) {
            String var39 = "%F>";
            var4 = "hhs";
         } else if (var1 == 36) {
            String var40 = "KJT";
            var4 = "hyw";
         } else if (var1 == 37) {
            String var41 = "%T)";
            var4 = "hzd";
         } else if (var1 == 38) {
            String var42 = "KIP";
            var4 = "hzs";
         } else if (var1 == 39) {
            String var43 = "%I%";
            var4 = "hgh";
         } else {
            var4 = "";
         }

         String var2 = var4;
         var1++;
         jr.add(var2);
      }
   }

   // $VF: synthetic method
   static int abh(Class25 var0) {
      return var0.ds;
   }

   public void f() {
      int var1 = 0;

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ait.length; var10000 = var2) {
         int var3 = Class14.mo(this.ait[var2]) ? Class14.ms(this.ait[var2]) : 20;
         this.ait[var2].setBounds(0, var1, 299, var3);
         var2++;
         var1 += var3;
      }

      this.yv(this.getX(), this.getY(), 300, var1);
   }

   // $VF: synthetic method
   static Map abi() {
      return ais;
   }

   // $VF: synthetic method
   static Image abj(Class25 var0) {
      return var0.g;
   }

   // $VF: synthetic method
   private static void abk(BaseQl var0) {
      if (var0.getKey() != null) {
         String var1;
         BaseQl var10000;
         switch ((var1 = var0.getKey()).hashCode()) {
            case -1814824587:

               String var50 = "抴刵兪匥归";
               if (var1.equals("抗分光化影")) {
                  var50 = "灆犣丳炚";
                  var0.setKey("灵犀一点");
                  return;
               }

               var10000 = var0;
               break;
            case -1741749902:
               String var48 = "拚备鬙觍伞";
               if (var1.equals("抗天魔解体")) {
                  var48 = "匸蠍戾磪";
                  var0.setKey("化血成碧");
                  return;
               }

               var10000 = var0;
               break;
            case -1732293003:
               String var46 = "抴尼楟夯哎";
               if (var1.equals("抗小楼夜哭")) {
                  var46 = "映玭朧沧";
                  var0.setKey("明珠有泪");
                  return;
               }

               var10000 = var0;
               break;
            case -1608135126:
               String var44 = "拚氚沘独曹";
               if (var1.equals("抗水法狂暴")) {
                  var44 = "拚氚沘独曹凎珊";
                  var0.setKey("抗水法狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case -1597909547:
               String var42 = "抴浚焕歐氷";
               if (var1.equals("抗浩然正气")) {
                  var42 = "丹喧苖気";
                  var0.setKey("上善若水");
                  return;
               }

               var10000 = var0;
               break;
            case -1575990637:
               String var40 = "拚灅沘独曹";
               if (var1.equals("抗火法狂暴")) {
                  var40 = "抴灘泶狱暗凓玤";
                  var0.setKey("抗火法狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case -1289194936:
               String var38 = "抴隧屒夔牸";
               if (var1.equals("抗隔山大牛")) {
                  var38 = "尶垎萓寗";
                  var0.setKey("尘埃落定");
                  return;
               }

               var10000 = var0;
               break;
            case -1282013049:
               String var36 = "拚雙沘独曹";
               if (var1.equals("抗雷法狂暴")) {
                  var36 = "抴雄泶狱暗凓玤";
                  var0.setKey("抗雷法狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case -1268826016:
               String var34 = "抴靡靁獓牺";
               if (var1.equals("抗青面獠牙")) {
                  var34 = "羽亙迬暍";
                  var0.setKey("美人迟暮");
                  return;
               }

               var10000 = var0;
               break;
            case -1267981488:
               String var32 = "拚飠沘独曹";
               if (var1.equals("抗风法狂暴")) {
                  var32 = "拚飠沘独曹凎珊";
                  var0.setKey("抗风法狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case -1248569288:
               String var30 = "抴鬏灈狱暗";
               if (var1.equals("抗鬼火狂暴")) {
                  var30 = "抴鬏灈狱暗凓玤";
                  var0.setKey("抗鬼火狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case -1194311134:
               String var28 = "勭弔乄尖蘦";
               if (var1.equals("加强三尸虫")) {
                  var28 = "弉个尋虈";
                  var0.setKey("强三尸虫");
                  return;
               }

               var10000 = var0;
               break;
            case -791726641:
               String var26 = "劓弙逬庅泦朌敻枿";
               if (var1.equals("加强速度法术效果")) {
                  var26 = "劎彷劎遒泻杢敦柑";
                  var0.setKey("加强加速法术效果");
                  return;
               }

               var10000 = var0;
               break;
            case -307203320:
               String var24 = "劎彷攕冶泻杢敦柑";
               if (var1.equals("加强攻击法术效果")) {
                  var24 = "劓弙劓攘泦朌敻枿";
                  var0.setKey("加强加攻法术效果");
                  return;
               }

               var10000 = var0;
               break;
            case 29076885:
               String var22 = "狡暇玤";
               if (var1.equals("狂暴率")) {
                  var22 = "独曹凎珊";
                  var0.setKey("狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case 32670622:
               String var20 = "膹呓珊";
               if (var1.equals("致命率")) {
                  var20 = "臇呞凓玤";
                  var0.setKey("致命几率");
                  return;
               }

               var10000 = var0;
               break;
            case 852922131:
               String var18 = "氇泶狱暗";
               if (var1.equals("水法狂暴")) {
                  var18 = "氚沘独曹凎珊";
                  var0.setKey("水法狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case 856562674:
               String var16 = "泻杢躜閧";
               if (var1.equals("法术躲闪")) {
                  var16 = "沘朁軿闄珊";
                  var0.setKey("法术躲闪率");
                  return;
               }

               var10000 = var0;
               break;
            case 885066620:
               String var14 = "灘泶狱暗";
               if (var1.equals("火法狂暴")) {
                  var14 = "灘泶狱暗凓玤";
                  var0.setKey("火法狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case 901786491:
               if (var1.equals("物理吸收")) {
                  String var13 = "牊琵君攅玤";
                  var0.setKey("物理吸收率");
                  return;
               }

               var10000 = var0;
               break;
            case 1008733975:
               String var11 = "劎彷阜忬泻杢敦柑";
               if (var1.equals("加强防御法术效果")) {
                  var11 = "劎彷劎陿泻杢敦柑";
                  var0.setKey("加强加防法术效果");
                  return;
               }

               var10000 = var0;
               break;
            case 1179044208:
               String var9 = "雄泶狱暗";
               if (var1.equals("雷法狂暴")) {
                  var9 = "雄泶狱暗凓玤";
                  var0.setKey("雷法狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case 1193075769:
               String var7 = "飠沘独曹";
               if (var1.equals("风法狂暴")) {
                  var7 = "飠沘独曹凎珊";
                  var0.setKey("风法狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case 1212487969:
               String var5 = "鬏灈狱暗";
               if (var1.equals("鬼火狂暴")) {
                  var5 = "鬏灈狱暗凓玤";
                  var0.setKey("鬼火狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            case 2006621742:
               String var10001 = "乄尖蘦独曹";
               if (var1.equals("三尸虫狂暴")) {
                  var10001 = "乄尖蘦独曹凎珊";
                  var0.setKey("三尸虫狂暴几率");
                  return;
               }

               var10000 = var0;
               break;
            default:
               var10000 = var0;
         }

         String var2 = var10000.getKey();
         String var51 = "彷";
         if (var2.startsWith("强")) {
            String var3 = var0.getKey();
            var51 = "弉劸";
            if (var3.startsWith("强力")) {
               return;
            }

            String var10003 = "勭";
            var0.setKey("加" + var0.getKey());
         }
      }
   }

   public Class25(GameView var1) {
      super(8, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "PP\fW\f\u0000\u0012\u001dS]D";
      this.yy(-2, 0, 300, 114, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/31.png", 10, 10, 10, 10, false), null);
      String var10008 = ">MbKb\u001d{\u0000=@*";
      this.agi = new com.xy.i.Class0("sc/e/36.png", 1, this.lj(), this);
      this.agi.setBounds(276, 3, 17, 17);
      this.add(this.agi);
      this.ait = new Class14[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ait.length; var10000 = var2) {
         this.ait[var2] = new Class14(this, var2);
         this.add(this.ait[var2++]);
      }
   }

   public static BaseQl abl(String var0, BaseQl var1) {
      String var10000;
      if (var1 == null) {
         var1 = new BaseQl(null, 0.0);
         var10000 = var0;
      } else {
         var1.setKey(null);
         var1.setValue(0.0);
         var10000 = var0;
      }

      String var2 = var10000;
      BaseQl var3;
      switch (var10000.hashCode()) {
         case -1303848984:

            String var199 = "VK@EIO";
            if (!var2.equals("ehsfzl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var394 = "忓見口靊凎珊";
               var1.setKey("忽视反震几率");
               var1.setValue(5.0);
            }
            break;
         case -1289454661:
            String var198 = "K5H!D!";
            if (!var2.equals("exfljl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var393 = "五泻输凕珊";
               var1.setKey("仙法连击率");
               var1.setValue(2.0);
            }
            break;
         case -1289454654:
            String var197 = "V[UOYP";
            if (!var2.equals("exfljs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var392 = "仪泶迭凘欒敓";
               var1.setKey("仙法连击次数");
               var1.setValue(2.0);
            }
            break;
         case 97442:
            String var196 = "/H+";
            if (!var2.equals("bff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var391 = "飠沘独曹";
               var1.setKey("风法狂暴");
               var1.setValue(2.0);
            }
            break;
         case 97475:
            String var195 = "ATK";
            if (!var2.equals("bgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var390 = "鬒瀦独曹";
               var1.setKey("鬼火狂暴");
               var1.setValue(2.0);
            }
            break;
         case 97504:
            String var194 = "/F+";
            if (!var2.equals("bhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var389 = "灅沘独曹";
               var1.setKey("火法狂暴");
               var1.setValue(2.0);
            }
            break;
         case 97628:
            String var193 = "A_E";
            if (!var2.equals("blf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var388 = "雄泶狱暗";
               var1.setKey("雷法狂暴");
               var1.setValue(2.0);
            }
            break;
         case 97842:
            String var192 = "/].";
            if (!var2.equals("bsc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var387 = "个尋虈狱暗";
               var1.setKey("三尸虫狂暴");
               var1.setValue(2.0);
            }
            break;
         case 97845:
            String var191 = "A@E";
            if (!var2.equals("bsf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var386 = "氇泶狱暗";
               var1.setKey("水法狂暴");
               var1.setValue(2.0);
            }
            break;
         case 99302:
            String var190 = ")J+";
            if (!var2.equals("ddf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var385 = "毼沘躜閧";
               var1.setKey("毒法躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99364:
            String var189 = "GUE";
            if (!var2.equals("dff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var384 = "飠沘躜閧";
               var1.setKey("风法躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99383:
            String var188 = ")H4";
            if (!var2.equals("dfy")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var383 = "尲卓躁闉";
               var1.setKey("封印躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99397:
            String var187 = "GTK";
            if (!var2.equals("dgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var382 = "鬏灈躁闉";
               var1.setKey("鬼火躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99426:
            String var186 = ")F+";
            if (!var2.equals("dhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var381 = "灅沘躜閧";
               var1.setKey("火法躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99432:
            String var185 = "G[O";
            if (!var2.equals("dhl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var380 = "淙丼躜閧";
               var1.setKey("混乱躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99439:
            String var184 = ")F>";
            if (!var2.equals("dhs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var379 = "昼睂躁闉";
               var1.setKey("昏睡躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99550:
            String var183 = "G_E";
            if (!var2.equals("dlf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var378 = "雄泶躁闉";
               var1.setKey("雷法躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99764:
            String var182 = ")].";
            if (!var2.equals("dsc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var377 = "乄尖蘦躜閧";
               var1.setKey("三尸虫躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99767:
            String var181 = "G@E";
            if (!var2.equals("dsf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var376 = "氇泶躁闉";
               var1.setKey("水法躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99970:
            String var180 = ")W:";
            if (!var2.equals("dyw")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var375 = "遹徕躜閧";
               var1.setKey("遗忘躲闪");
               var1.setValue(5.0);
            }
            break;
         case 99997:
            String var179 = "GIP";
            if (!var2.equals("dzs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var374 = "霴慲躁闉";
               var1.setKey("震慑躲闪");
               var1.setValue(5.0);
            }
            break;
         case 100276:
            String var178 = "(J>";
            if (!var2.equals("eds")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var373 = "躑闙玤";
               var1.setKey("躲闪率");
               var1.setValue(3.0);
            }
            break;
         case 100462:
            String var177 = "FYP";
            if (!var2.equals("ejs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var372 = "众宐凼兮";
               var1.setKey("伤害减免");
               var1.setValue(5.0);
            }
            break;
         case 101067:
            String var176 = "+q)";
            if (!var2.equals("f_d")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var371 = "陷毱攈凘";
               var1.setKey("附毒攻击");
               var1.setValue(5.0);
            }
            break;
         case 101069:
            String var175 = "ElE";
            if (!var2.equals("f_f")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var370 = "陷尢攈凘";
               var1.setKey("附封攻击");
               var1.setValue(5.0);
            }
            break;
         case 101071:
            String var174 = "+q%";
            if (!var2.equals("f_h")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var369 = "陪涺攕冶";
               var1.setKey("附混攻击");
               var1.setValue(5.0);
            }
            break;
         case 103159:
            String var173 = "KWP";
            if (!var2.equals("hds")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var368 = "忓見躜閧";
               var1.setKey("忽视躲闪");
               var1.setValue(3.0);
            }
            break;
         case 103208:
            String var172 = "%H+";
            if (!var2.equals("hff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var367 = "忎觥飽泶";
               var1.setKey("忽视风法");
               var1.setValue(2.0);
            }
            break;
         case 103212:
            String var171 = "KUI";
            if (!var2.equals("hfj")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var366 = "忎觥叾凘";
               var1.setKey("忽视反击");
               var1.setValue(3.0);
            }
            break;
         case 103227:
            String var170 = "%H4";
            if (!var2.equals("hfy")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var365 = "忎觥尲卓";
               var1.setKey("忽视封印");
               var1.setValue(2.0);
            }
            break;
         case 103241:
            String var169 = "KTK";
            if (!var2.equals("hgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var364 = "忎觥鬏灈";
               var1.setKey("忽视鬼火");
               var1.setValue(2.0);
            }
            break;
         case 103270:
            String var168 = "%F+";
            if (!var2.equals("hhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var363 = "忓見灅沘";
               var1.setKey("忽视火法");
               var1.setValue(2.0);
            }
            break;
         case 103276:
            String var167 = "K[O";
            if (!var2.equals("hhl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var362 = "忎觥淄乒";
               var1.setKey("忽视混乱");
               var1.setValue(2.0);
            }
            break;
         case 103283:
            String var166 = "%F>";
            if (!var2.equals("hhs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var361 = "忓見昡眬";
               var1.setKey("忽视昏睡");
               var1.setValue(2.0);
            }
            break;
         case 103394:
            String var165 = "K_E";
            if (!var2.equals("hlf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var360 = "忓見雙沘";
               var1.setKey("忽视雷法");
               var1.setValue(2.0);
            }
            break;
         case 103611:
            String var164 = "%]+";
            if (!var2.equals("hsf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var359 = "忎觥氇泶";
               var1.setKey("忽视水法");
               var1.setValue(2.0);
            }
            break;
         case 103814:
            String var163 = "KJT";
            if (!var2.equals("hyw")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var358 = "忓見遹徕";
               var1.setKey("忽视遗忘");
               var1.setValue(2.0);
            }
            break;
         case 103826:
            String var162 = "%T)";
            if (!var2.equals("hzd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var357 = "忓見七殟";
               var1.setKey("忽视中毒");
               var1.setValue(2.0);
            }
            break;
         case 103841:
            String var161 = "KIP";
            if (!var2.equals("hzs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var356 = "徰觨拚霩愜";
               var1.setKey("忽视抗震慑");
               var1.setValue(2.0);
            }
            break;
         case 105130:
            String var160 = "'H+";
            if (!var2.equals("jff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var355 = "飠沘伊対凡儀";
               var1.setKey("风法伤害减免");
               var1.setValue(5.0);
            }
            break;
         case 105163:
            String var159 = "ITK";
            if (!var2.equals("jgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var354 = "鬏灈众宐凼兮";
               var1.setKey("鬼火伤害减免");
               var1.setValue(5.0);
            }
            break;
         case 105192:
            String var158 = "'F+";
            if (!var2.equals("jhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var353 = "灅沘伊対凡儀";
               var1.setKey("火法伤害减免");
               var1.setValue(5.0);
            }
            break;
         case 105312:
            String var157 = "I_A";
            if (!var2.equals("jlb")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var352 = "抴灆宾众宐";
               var1.setKey("抗灵宝伤害");
               var1.setValue(5.0);
            }
            break;
         case 105316:
            String var156 = "'B+";
            if (!var2.equals("jlf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var351 = "雄泶众宐凼兮";
               var1.setKey("雷法伤害减免");
               var1.setValue(5.0);
            }
            break;
         case 105533:
            String var155 = "I@E";
            if (!var2.equals("jsf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var350 = "氇泶众宐凼兮";
               var1.setKey("水法伤害减免");
               var1.setValue(5.0);
            }
            break;
         case 105967:
            String var154 = "&L+";
            if (!var2.equals("kbf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var349 = "拚飠沘独曹";
               var1.setKey("抗风法狂暴");
               var1.setValue(1.0);
            }
            break;
         case 105968:
            String var153 = "HQD";
            if (!var2.equals("kbg")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var348 = "拚鬒瀦独曹";
               var1.setKey("抗鬼火狂暴");
               var1.setValue(1.0);
            }
            break;
         case 105969:
            String var152 = "&L%";
            if (!var2.equals("kbh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var347 = "抴灘泶狱暗";
               var1.setKey("抗火法狂暴");
               var1.setValue(1.0);
            }
            break;
         case 105973:
            String var151 = "HQO";
            if (!var2.equals("kbl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var346 = "抴雄泶狱暗";
               var1.setKey("抗雷法狂暴");
               var1.setValue(1.0);
            }
            break;
         case 105980:
            String var150 = "&L>";
            if (!var2.equals("kbs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var345 = "拚氚沘独曹";
               var1.setKey("抗水法狂暴");
               var1.setValue(1.0);
            }
            break;
         case 106091:
            String var149 = "HUE";
            if (!var2.equals("kff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var344 = "抹颃";
               var1.setKey("抗风");
               var1.setValue(1.0);
            }
            break;
         case 106092:
            String var148 = "&H*";
            if (!var2.equals("kfg")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var343 = "拚刨億匸弼";
               var1.setKey("抗分光化影");
               var1.setValue(5.0);
            }
            break;
         case 106110:
            String var147 = "HUZ";
            if (!var2.equals("kfy")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var342 = "拚尯匽";
               var1.setKey("抗封印");
               var1.setValue(1.0);
            }
            break;
         case 106124:
            String var146 = "&I%";
            if (!var2.equals("kgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var341 = "抴鬏灈";
               var1.setKey("抗鬼火");
               var1.setValue(1.0);
            }
            break;
         case 106135:
            String var145 = "HTP";
            if (!var2.equals("kgs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var340 = "拚隺尼扽爖";
               var1.setKey("抗隔山打牛");
               var1.setValue(5.0);
            }
            break;
         case 106153:
            String var144 = "&F+";
            if (!var2.equals("khf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var339 = "护灈";
               var1.setKey("抗火");
               var1.setValue(1.0);
            }
            break;
         case 106159:
            String var143 = "H[O";
            if (!var2.equals("khl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var338 = "拚淙丼";
               var1.setKey("抗混乱");
               var1.setValue(1.0);
            }
            break;
         case 106165:
            String var142 = "&F?";
            if (!var2.equals("khr")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var337 = "抴浚焕歐氷";
               var1.setKey("抗浩然正气");
               var1.setValue(5.0);
            }
            break;
         case 106166:
            String var141 = "H[P";
            if (!var2.equals("khs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var336 = "抴昼睂";
               var1.setKey("抗昏睡");
               var1.setValue(1.0);
            }
            break;
         case 106273:
            String var140 = "&B/";
            if (!var2.equals("klb")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var335 = "雂朔拚灛寐伊対";
               var1.setKey("随机抗灵宝伤害");
               var1.setValue(5.0);
            }
            break;
         case 106277:
            String var139 = "H_E";
            if (!var2.equals("klf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var334 = "护雔";
               var1.setKey("抗雷");
               var1.setValue(1.0);
            }
            break;
         case 106437:
            String var138 = "&_&";
            if (!var2.equals("kqk")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var333 = "抆徂弉全敻枿";
               var1.setKey("抵御强克效果");
               var1.setValue(4.0);
            }
            break;
         case 106439:
            String var137 = "HBN";
            if (!var2.equals("kqm")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var332 = "抴靡靁獓牺";
               var1.setKey("抗青面獠牙");
               var1.setValue(5.0);
            }
            break;
         case 106449:
            String var136 = "&_:";
            if (!var2.equals("kqw")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var331 = "拚惫缜";
               var1.setKey("抗情网");
               var1.setValue(5.0);
            }
            break;
         case 106491:
            String var135 = "H@@";
            if (!var2.equals("ksc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var330 = "抴为尛";
               var1.setKey("抗三尸");
               var1.setValue(1.0);
            }
            break;
         case 106494:
            String var134 = "&]+";
            if (!var2.equals("ksf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var329 = "抹汹";
               var1.setKey("抗水");
               var1.setValue(1.0);
            }
            break;
         case 106532:
            String var133 = "HGN";
            if (!var2.equals("ktm")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var328 = "拚备鬙觍伞";
               var1.setKey("抗天魔解体");
               var1.setValue(5.0);
            }
            break;
         case 106624:
            String var132 = "&Y!";
            if (!var2.equals("kwl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var327 = "拚片瑋";
               var1.setKey("抗物理");
               var1.setValue(3.0);
            }
            break;
         case 106655:
            String var131 = "HKO";
            if (!var2.equals("kxl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var326 = "抴尼楟夯哎";
               var1.setKey("抗小楼夜哭");
               var1.setValue(5.0);
            }
            break;
         case 106697:
            String var130 = "&W:";
            if (!var2.equals("kyw")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var325 = "拚遹徕";
               var1.setKey("抗遗忘");
               var1.setValue(1.0);
            }
            break;
         case 106709:
            String var129 = "HIG";
            if (!var2.equals("kzd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var324 = "拚七殟";
               var1.setKey("抗中毒");
               var1.setValue(1.0);
            }
            break;
         case 106724:
            String var128 = "&T>";
            if (!var2.equals("kzs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var323 = "抴霴慲";
               var1.setKey("抗震慑");
               var1.setValue(1.0);
            }
            break;
         case 107951:
            String var127 = "NWE";
            if (!var2.equals("mdf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var322 = "毼沘呓习";
               var1.setKey("毒法命中");
               var1.setValue(5.0);
            }
            break;
         case 108013:
            String var126 = " H+";
            if (!var2.equals("mff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var321 = "飠沘呓习";
               var1.setKey("风法命中");
               var1.setValue(5.0);
            }
            break;
         case 108032:
            String var125 = "NUZ";
            if (!var2.equals("mfy")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var320 = "尲卓呎与";
               var1.setKey("封印命中");
               var1.setValue(5.0);
            }
            break;
         case 108046:
            String var124 = " I%";
            if (!var2.equals("mgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var319 = "鬏灈呎与";
               var1.setKey("鬼火命中");
               var1.setValue(5.0);
            }
            break;
         case 108075:
            String var123 = "N[E";
            if (!var2.equals("mhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var318 = "灅沘呓习";
               var1.setKey("火法命中");
               var1.setValue(5.0);
            }
            break;
         case 108081:
            String var122 = " F!";
            if (!var2.equals("mhl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var317 = "淙丼呓习";
               var1.setKey("混乱命中");
               var1.setValue(5.0);
            }
            break;
         case 108088:
            String var121 = "N[P";
            if (!var2.equals("mhs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var316 = "昼睂呎与";
               var1.setKey("昏睡命中");
               var1.setValue(5.0);
            }
            break;
         case 108199:
            String var120 = " B+";
            if (!var2.equals("mlf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var315 = "雄泶呎与";
               var1.setKey("雷法命中");
               var1.setValue(5.0);
            }
            break;
         case 108413:
            String var119 = "N@@";
            if (!var2.equals("msc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var314 = "乄尖蘦呓习";
               var1.setKey("三尸虫命中");
               var1.setValue(5.0);
            }
            break;
         case 108416:
            String var118 = " ]+";
            if (!var2.equals("msf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var313 = "氇泶呎与";
               var1.setKey("水法命中");
               var1.setValue(5.0);
            }
            break;
         case 108619:
            String var117 = "NJT";
            if (!var2.equals("myw")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var312 = "遹徕呓习";
               var1.setKey("遗忘命中");
               var1.setValue(5.0);
            }
            break;
         case 108646:
            String var116 = " T>";
            if (!var2.equals("mzs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var311 = "霴慲呎与";
               var1.setKey("震慑命中");
               var1.setValue(5.0);
            }
            break;
         case 111857:
            String var115 = "RUE";
            if (!var2.equals("qff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var310 = "弙飽泶";
               var1.setKey("强风法");
               var1.setValue(2.0);
            }
            break;
         case 111876:
            String var114 = "<H4";
            if (!var2.equals("qfy")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var309 = "弙尲卓";
               var1.setKey("强封印");
               var1.setValue(2.0);
            }
            break;
         case 111890:
            String var113 = "RTK";
            if (!var2.equals("qgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var308 = "弙鬏灈";
               var1.setKey("强鬼火");
               var1.setValue(2.0);
            }
            break;
         case 111919:
            String var112 = "<F+";
            if (!var2.equals("qhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var307 = "弙灘泶";
               var1.setKey("强火法");
               var1.setValue(2.0);
            }
            break;
         case 111925:
            String var111 = "R[O";
            if (!var2.equals("qhl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var306 = "彷淙丼";
               var1.setKey("强混乱");
               var1.setValue(2.0);
            }
            break;
         case 111932:
            String var110 = "<F>";
            if (!var2.equals("qhs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var305 = "彷昡眬";
               var1.setKey("强昏睡");
               var1.setValue(2.0);
            }
            break;
         case 111982:
            String var109 = "RYD";
            if (!var2.equals("qjg")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var304 = "彷釿節";
               var1.setKey("强金箍");
               var1.setValue(5.0);
            }
            break;
         case 112043:
            String var108 = "<B+";
            if (!var2.equals("qlf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var303 = "弙雄泶";
               var1.setKey("强雷法");
               var1.setValue(2.0);
            }
            break;
         case 112076:
            String var107 = "R^K";
            if (!var2.equals("qmh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var302 = "劓弙魶惲";
               var1.setKey("加强魅惑");
               var1.setValue(2.0);
            }
            break;
         case 112203:
            String var106 = "<_&";
            if (!var2.equals("qqk")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var301 = "墰勭弔儆敦柑";
               var1.setKey("增加强克效果");
               var1.setValue(4.0);
            }
            break;
         case 112215:
            String var105 = "RBT";
            if (!var2.equals("qqw")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var300 = "弙惶署";
               var1.setKey("强情网");
               var1.setValue(5.0);
            }
            break;
         case 112257:
            String var104 = "<].";
            if (!var2.equals("qsc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var299 = "勭弔乄尖蘦";
               var1.setKey("加强三尸虫");
               var1.setValue(2.0);
            }
            break;
         case 112260:
            String var103 = "R@E";
            if (!var2.equals("qsf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var298 = "彷氚沘";
               var1.setKey("强水法");
               var1.setValue(2.0);
            }
            break;
         case 112463:
            String var102 = "<W:";
            if (!var2.equals("qyw")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var297 = "劎彷遹徕";
               var1.setKey("加强遗忘");
               var1.setValue(2.0);
            }
            break;
         case 112475:
            String var101 = "RIG";
            if (!var2.equals("qzd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var296 = "弙丞毱";
               var1.setKey("强中毒");
               var1.setValue(2.0);
            }
            break;
         case 112490:
            String var100 = "<T>";
            if (!var2.equals("qzs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var295 = "彷霩愜";
               var1.setKey("强震慑");
               var1.setValue(2.0);
            }
            break;
         case 113779:
            String var99 = "PUE";
            if (!var2.equals("sff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var294 = "飽泶众宐";
               var1.setKey("风法伤害");
               var1.setValue(2.0);
            }
            break;
         case 113812:
            String var98 = ">I%";
            if (!var2.equals("sgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var293 = "鬒瀦伊対";
               var1.setKey("鬼火伤害");
               var1.setValue(2.0);
            }
            break;
         case 113841:
            String var97 = "P[E";
            if (!var2.equals("shf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var292 = "灅沘伊対";
               var1.setKey("火法伤害");
               var1.setValue(2.0);
            }
            break;
         case 113965:
            String var96 = ">B+";
            if (!var2.equals("slf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var291 = "雙沘伊対";
               var1.setKey("雷法伤害");
               var1.setValue(2.0);
            }
            break;
         case 114179:
            String var95 = "P@@";
            if (!var2.equals("ssc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var290 = "为尛众宐";
               var1.setKey("三尸伤害");
               var1.setValue(2.0);
            }
            break;
         case 114182:
            String var94 = ">]+";
            if (!var2.equals("ssf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var289 = "氇泶众宐";
               var1.setKey("水法伤害");
               var1.setValue(2.0);
            }
            break;
         case 114397:
            String var93 = "PIG";
            if (!var2.equals("szd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var288 = "毱众宐";
               var1.setKey("毒伤害");
               var1.setValue(2.0);
            }
            break;
         case 118183:
            String var92 = ":V%";
            if (!var2.equals("wxh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var287 = "瀦";
               var1.setKey("火");
               var1.setValue(4.0);
            }
            break;
         case 118185:
            String var91 = "TKI";
            if (!var2.equals("wxj")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var286 = "醜";
               var1.setKey("金");
               var1.setValue(4.0);
            }
            break;
         case 118188:
            String var90 = ":V ";
            if (!var2.equals("wxm")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var285 = "朋";
               var1.setKey("木");
               var1.setValue(4.0);
            }
            break;
         case 118194:
            String var89 = "TKP";
            if (!var2.equals("wxs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var284 = "気";
               var1.setKey("水");
               var1.setValue(4.0);
            }
            break;
         case 118195:
            String var88 = ":V9";
            if (!var2.equals("wxt")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var283 = "坒";
               var1.setKey("土");
               var1.setValue(4.0);
            }
            break;
         case 120444:
            String var87 = "YWE";
            if (!var2.equals("zdf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var282 = "毡泶众宐劓淒";
               var1.setKey("毒法伤害加深");
               var1.setValue(5.0);
            }
            break;
         case 120506:
            String var86 = "7H+";
            if (!var2.equals("zff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var281 = "飽泶众宐劓淒";
               var1.setKey("风法伤害加深");
               var1.setValue(5.0);
            }
            break;
         case 120539:
            String var85 = "YTK";
            if (!var2.equals("zgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var280 = "鬒瀦伊対劎涼";
               var1.setKey("鬼火伤害加深");
               var1.setValue(5.0);
            }
            break;
         case 120568:
            String var84 = "7F+";
            if (!var2.equals("zhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var279 = "灘泶众宐劓淒";
               var1.setKey("火法伤害加深");
               var1.setValue(5.0);
            }
            break;
         case 120692:
            String var83 = "Y_E";
            if (!var2.equals("zlf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var278 = "雙沘伊対劎涼";
               var1.setKey("雷法伤害加深");
               var1.setValue(5.0);
            }
            break;
         case 120909:
            String var82 = "7]+";
            if (!var2.equals("zsf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var277 = "氚沘伊対劎涼";
               var1.setKey("水法伤害加深");
               var1.setValue(5.0);
            }
            break;
         case 3024648:
            String var81 = "QIUE";
            if (!var2.equals("bjff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var276 = "飠沘暚冶凎珊";
               var1.setKey("风法暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024667:
            String var80 = "L'H4";
            if (!var2.equals("bjfy")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var275 = "尲卓暇凘凓玤";
               var1.setKey("封印暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024681:
            String var79 = "QITK";
            if (!var2.equals("bjgh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var274 = "鬒瀦暚冶凎珊";
               var1.setKey("鬼火暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024710:
            String var78 = "L'F+";
            if (!var2.equals("bjhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var273 = "灘泶暇凘凓玤";
               var1.setKey("火法暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024716:
            String var77 = "QI[O";
            if (!var2.equals("bjhl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var272 = "淙丼暚冶凎珊";
               var1.setKey("混乱暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024723:
            String var76 = "L'F>";
            if (!var2.equals("bjhs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var271 = "昡眬暚冶凎珊";
               var1.setKey("昏睡暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024772:
            String var75 = "QIYE";
            if (!var2.equals("bjjf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var270 = "劓阑暇凘凓玤";
               var1.setKey("加防暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024773:
            String var74 = "L'D*";
            if (!var2.equals("bjjg")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var269 = "劎敶暚冶凎珊";
               var1.setKey("加攻暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024785:
            String var73 = "QIYP";
            if (!var2.equals("bjjs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var268 = "劓逼暇凘凓玤";
               var1.setKey("加速暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024834:
            String var72 = "L'B+";
            if (!var2.equals("bjlf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var267 = "雄泶暇凘凓玤";
               var1.setKey("雷法暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3024867:
            String var71 = "QI^K";
            if (!var2.equals("bjmh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var266 = "魶惲暇凘凓玤";
               var1.setKey("魅惑暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3025048:
            String var70 = "L'].";
            if (!var2.equals("bjsc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var265 = "丧屵暚冶凎珊";
               var1.setKey("三尸暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3025051:
            String var69 = "QI@E";
            if (!var2.equals("bjsf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var264 = "氚沘暚冶凎珊";
               var1.setKey("水法暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3025254:
            String var68 = "L'W:";
            if (!var2.equals("bjyw")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var263 = "遤忻暇凘凓玤";
               var1.setKey("遗忘暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3025266:
            String var67 = "QIIG";
            if (!var2.equals("bjzd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var262 = "丞毱暇凘凓玤";
               var1.setKey("中毒暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3025281:
            String var66 = "L'T>";
            if (!var2.equals("bjzs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var261 = "霩愜暚冶凎珊";
               var1.setKey("震慑暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 3110307:
            String var65 = "VEYO";
            if (!var2.equals("efjl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var260 = "厀凕珊";
               var1.setKey("反击率");
               var1.setValue(3.0);
            }
            break;
         case 3110317:
            String var64 = "K+D;";
            if (!var2.equals("efjv")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var259 = "叾凘欒敓";
               var1.setKey("反击次数");
               var1.setValue(3.0);
            }
            break;
         case 3110803:
            String var63 = "VEIO";
            if (!var2.equals("efzl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var258 = "厀霩珊";
               var1.setKey("反震率");
               var1.setValue(5.0);
            }
            break;
         case 3114864:
            String var62 = "K&L!";
            if (!var2.equals("ekbl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var257 = "狡暇玤";
               var1.setKey("狂暴率");
               var1.setValue(3.0);
            }
            break;
         case 3116073:
            String var61 = "VOYO";
            if (!var2.equals("eljl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var256 = "输凕珊";
               var1.setKey("连击率");
               var1.setValue(3.0);
            }
            break;
         case 3116083:
            String var60 = "K!D;";
            if (!var2.equals("eljv")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var255 = "迭凘欒敓";
               var1.setKey("连击次数");
               var1.setValue(3.0);
            }
            break;
         case 3117530:
            String var59 = "VNIO";
            if (!var2.equals("emzl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var254 = "吰七珊";
               var1.setKey("命中率");
               var1.setValue(3.0);
            }
            break;
         case 3129620:
            String var58 = "K7C!";
            if (!var2.equals("ezml")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var253 = "膹呓珊";
               var1.setKey("致命率");
               var1.setValue(3.0);
            }
            break;
         case 3133641:
            String var57 = "U|@@";
            if (!var2.equals("f_sc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var252 = "陧为尛攈凘";
               var1.setKey("附三尸攻击");
               var1.setValue(5.0);
            }
            break;
         case 3133799:
            String var56 = "H\u0012V+";
            if (!var2.equals("f_xf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var251 = "陪颃攕冶";
               var1.setKey("附风攻击");
               var1.setValue(5.0);
            }
            break;
         case 3133801:
            String var55 = "U|KK";
            if (!var2.equals("f_xh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var250 = "陷灈攈凘";
               var1.setKey("附火攻击");
               var1.setValue(5.0);
            }
            break;
         case 3133805:
            String var54 = "H\u0012V!";
            if (!var2.equals("f_xl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var249 = "陷雔攈凘";
               var1.setKey("附雷攻击");
               var1.setValue(5.0);
            }
            break;
         case 3133812:
            String var53 = "U|KP";
            if (!var2.equals("f_xs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var248 = "陪汹攕冶";
               var1.setKey("附水攻击");
               var1.setValue(5.0);
            }
            break;
         case 3133874:
            String var52 = "H\u0012T>";
            if (!var2.equals("f_zs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var247 = "阉霩愜攕冶";
               var1.setKey("附震慑攻击");
               var1.setValue(5.0);
            }
            break;
         case 3200145:
            String var51 = "[EJO";
            if (!var2.equals("hfyl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var246 = "忎觥阁徂凓玤";
               var1.setKey("忽视防御几率");
               var1.setValue(3.0);
            }
            break;
         case 3200155:
            String var50 = "F+W;";
            if (!var2.equals("hfyv")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var245 = "忓見阜忬稥廫";
               var1.setKey("忽视防御程度");
               var1.setValue(3.0);
            }
            break;
         case 3292797:
            String var49 = "XITF";
            if (!var2.equals("kjge")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var244 = "抴釢箮";
               var1.setKey("抗金箍");
               var1.setValue(5.0);
            }
            break;
         case 3305681:
            String var48 = "E:]5";
            if (!var2.equals("kwsx")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var243 = "护旃屭怄众宐";
               var1.setKey("抗无属性伤害");
               var1.setValue(5.0);
            }
            break;
         case 3308094:
            String var47 = "XYWP";
            if (!var2.equals("kzds")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var242 = "抴毡伇";
               var1.setKey("抗毒伤");
               var1.setValue(1.0);
            }
            break;
         case 3308366:
            String var46 = "E7C!";
            if (!var2.equals("kzml")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var241 = "护臗呎玤";
               var1.setKey("抗致命率");
               var1.setValue(3.0);
            }
            break;
         case 3468258:
            String var45 = "BEJE";
            if (!var2.equals("qfyf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var240 = "劎彷阜忬泻杢";
               var1.setKey("加强防御法术");
               var1.setValue(2.0);
            }
            break;
         case 3468754:
            String var44 = "_*D+";
            if (!var2.equals("qgjf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var239 = "劓弙攈凘泦朌";
               var1.setKey("加强攻击法术");
               var1.setValue(2.0);
            }
            break;
         case 3473338:
            String var43 = "BOPA";
            if (!var2.equals("qlcb")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var238 = "劎彷沉沯敦柑";
               var1.setKey("加强沧波效果");
               var1.setValue(2.0);
            }
            break;
         case 3473454:
            String var42 = "_!H4";
            if (!var2.equals("qlfy")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var237 = "劓弙扅摤敻枿";
               var1.setKey("加强扶摇效果");
               var1.setValue(2.0);
            }
            break;
         case 3473751:
            String var41 = "BOCO";
            if (!var2.equals("qlpl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var236 = "劎彷霗难敦柑";
               var1.setKey("加强霹雳效果");
               var1.setValue(2.0);
            }
            break;
         case 3480100:
            String var40 = "_>J+";
            if (!var2.equals("qsdf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var235 = "劓弙逬庅泦朌";
               var1.setKey("加强速度法术");
               var1.setValue(2.0);
            }
            break;
         case 3486840:
            String var39 = "BYWP";
            if (!var2.equals("qzds")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var234 = "彷七殟伊対";
               var1.setKey("强中毒伤害");
               var1.setValue(2.0);
            }
            break;
         case 3486964:
            String var38 = "_7F>";
            if (!var2.equals("qzhs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var233 = "寗厡唊儰伊対";
               var1.setKey("对召唤兽伤害");
               var1.setValue(5.0);
            }
            break;
         case 3523606:
            String var37 = "@A_P";
            if (!var2.equals("sbls")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var232 = "函刭杢伊対";
               var1.setKey("冰刃术伤害");
               var1.setValue(2.0);
            }
            break;
         case 3544009:
            String var36 = "]:]5";
            if (!var2.equals("swsx")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var231 = "断屰恪伊対";
               var1.setKey("无属性伤害");
               var1.setValue(5.0);
            }
            break;
         case 3664056:
            String var35 = "D[BK";
            if (!var2.equals("wxqh")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var230 = "弉劸典灈";
               var1.setKey("强力克火");
               var1.setValue(4.0);
            }
            break;
         case 3664058:
            String var34 = "Y5_'";
            if (!var2.equals("wxqj")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var229 = "弉劸典釲";
               var1.setKey("强力克金");
               var1.setValue(4.0);
            }
            break;
         case 3664061:
            String var33 = "D[BN";
            if (!var2.equals("wxqm")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var228 = "弔勖入来";
               var1.setKey("强力克木");
               var1.setValue(4.0);
            }
            break;
         case 3664067:
            String var32 = "Y5_>";
            if (!var2.equals("wxqs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var227 = "弔勖入汹";
               var1.setKey("强力克水");
               var1.setValue(4.0);
            }
            break;
         case 3664068:
            String var31 = "D[BW";
            if (!var2.equals("wxqt")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var226 = "弉劸典圼";
               var1.setKey("强力克土");
               var1.setValue(4.0);
            }
            break;
         case 93644931:
            String var30 = "/H+M)";
            if (!var2.equals("bffcd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var225 = "飠沘独曹稥廫";
               var1.setKey("风法狂暴程度");
               var1.setValue(2.0);
            }
            break;
         case 93676644:
            String var29 = "ATKPG";
            if (!var2.equals("bghcd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var224 = "鬏灈狱暗稸庅";
               var1.setKey("鬼火狂暴程度");
               var1.setValue(2.0);
            }
            break;
         case 93704513:
            String var28 = "/F+M)";
            if (!var2.equals("bhfcd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var223 = "灅沘独曹稥廫";
               var1.setKey("火法狂暴程度");
               var1.setValue(2.0);
            }
            break;
         case 93769859:
            String var27 = "AYOPA";
            if (!var2.equals("bjlcb")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var222 = "沉沯暚冶凎珊";
               var1.setKey("沧波暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 93769975:
            String var26 = "/D!H4";
            if (!var2.equals("bjlfy")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var221 = "扅摤暇凘凓玤";
               var1.setKey("扶摇暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 93769993:
            String var25 = "AYOTO";
            if (!var2.equals("bjlgl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var220 = "甫霵暇凘凓玤";
               var1.setKey("甘霖暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 93770272:
            String var24 = "/D!^!";
            if (!var2.equals("bjlpl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var219 = "霗难暚冶凎珊";
               var1.setKey("霹雳暴击几率");
               var1.setValue(2.0);
            }
            break;
         case 93823677:
            String var23 = "A_EPG";
            if (!var2.equals("blfcd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var218 = "雄泶狱暗稸庅";
               var1.setKey("雷法狂暴程度");
               var1.setValue(2.0);
            }
            break;
         case 94029331:
            String var22 = "/].M)";
            if (!var2.equals("bsccd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var217 = "乄尖蘦独曹稥廫";
               var1.setKey("三尸虫狂暴程度");
               var1.setValue(2.0);
            }
            break;
         case 94032214:
            String var21 = "A@EPG";
            if (!var2.equals("bsfcd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var216 = "氇泶狱暗稸庅";
               var1.setKey("水法狂暴程度");
               var1.setValue(2.0);
            }
            break;
         case 96419433:
            String var20 = "(H'H+";
            if (!var2.equals("efjff")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var215 = "飽泶叾凘";
               var1.setKey("风法反击");
               var1.setValue(3.0);
            }
            break;
         case 96419495:
            String var19 = "FUI[E";
            if (!var2.equals("efjhf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var214 = "灅沘口冶";
               var1.setKey("火法反击");
               var1.setValue(3.0);
            }
            break;
         case 96419570:
            String var18 = "(H'D>";
            if (!var2.equals("efjjs")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var213 = "袅敶凕斻釤敳乐圩倱遒";
               var1.setKey("被攻击时释放乾坤借速");
               var1.setValue(3.0);
            }
            break;
         case 96419606:
            String var17 = "FUIX[";
            if (!var2.equals("efjkx")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var212 = "袘攘凈旕釹攝吘惦脺脪";
               var1.setKey("被攻击时释放含情脉脉");
               var1.setValue(3.0);
            }
            break;
         case 96419619:
            String var16 = "(H'B+";
            if (!var2.equals("efjlf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var211 = "雄泶叾凘";
               var1.setKey("雷法反击");
               var1.setValue(3.0);
            }
            break;
         case 96419625:
            String var15 = "FUI_O";
            if (!var2.equals("efjll")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var210 = "袘攘凈旕釹攝魧祽陷躈";
               var1.setKey("被攻击时释放魔神附身");
               var1.setValue(3.0);
            }
            break;
         case 96419836:
            String var14 = "(H']+";
            if (!var2.equals("efjsf")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var209 = "氚沘口冶";
               var1.setKey("水法反击");
               var1.setValue(3.0);
            }
            break;
         case 96428033:
            String var13 = "FUPWP";
            if (!var2.equals("efsds")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var208 = "泻杢躜閧";
               var1.setKey("法术躲闪");
               var1.setValue(5.0);
            }
            break;
         case 96434714:
            String var12 = "(H7M)";
            if (!var2.equals("efzcd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var207 = "叾霤稸庅";
               var1.setKey("反震程度");
               var1.setValue(5.0);
            }
            break;
         case 99722295:
            String var11 = "KKEPG";
            if (!var2.equals("hxfcd")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var206 = "忎觥仪泶护怄稸庅";
               var1.setKey("忽视仙法抗性程度");
               var1.setValue(2.0);
            }
            break;
         case 99722551:
            String var10 = "%V+E!";
            if (!var2.equals("hxfkl")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var205 = "徰觨五泻拚怉珊";
               var1.setKey("忽视仙法抗性率");
               var1.setValue(2.0);
            }
            break;
         case 102468963:
            String var9 = "HDOTI";
            if (!var2.equals("kwlgj")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var204 = "陿徏偱";
               var1.setKey("防御值");
               var1.setValue(3.0);
            }
            break;
         case 102565100:
            String var8 = "&T>F=";
            if (!var2.equals("kzshp")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var203 = "拚霩愜氺蠍";
               var1.setKey("抗震慑气血");
               var1.setValue(1.0);
            }
            break;
         case 102565255:
            String var7 = "HIP^S";
            if (!var2.equals("kzsmp")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var202 = "抴霴慲魧泶";
               var1.setKey("抗震慑魔法");
               var1.setValue(1.0);
            }
            break;
         case 107677731:
            String var6 = "<B*B.";
            if (!var2.equals("qlglc")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var201 = "甶靛困蠍稥廫";
               var1.setKey("甘霖回血程度");
               var1.setValue(2.0);
            }
            break;
         case 107677750:
            String var5 = "R_D_U";
            if (!var2.equals("qlglv")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var200 = "画霥国衳借";
               var1.setKey("甘霖回血值");
               var1.setValue(2.0);
            }
            break;
         case 107882321:
            String var4 = "<].F5";
            if (!var2.equals("qschx")) {
               var3 = var1;
            } else {
               var3 = var1;
               String var10004 = "弙为尛园衣";
               var1.setKey("强三尸回血");
               var1.setValue(2.0);
            }
            break;
         case 116418070:
            String var10001 = "YIP^S";
            if (!var2.equals("zzsmp")) {
               var3 = var1;
               break;
            } else {
               String var10003 = "霩愜魺沘伊対劎涼";
               var1.setKey("震慑魔法伤害加深");
               var1.setValue(5.0);
            }
         default:
            var3 = var1;
      }

      abk(var3);
      return var1;
   }

   public Double abm(Class9 var1) {
      RoleData var2 = this.yx();
      if (this.ds == 1) {
         RoleSummoning var10;
         return (var10 = var2.getPet(this.nh)) == null ? null : (var2.getMount(var10.getSid()) != null ? 95 : 75) - Class9.ke(var1);
      } else if (this.ds != 0) {
         return null;
      } else {
         RoleProperty var3 = var2.getRoleProperty();
         double var4 = 0.0;
         double var6 = Class9.ke(var1);
         String var10000 = Class9.kd(var1);
         String var10001 = "HDO";
         double var18;
         if (var10000.equals("kwl")) {
            var4 = 75.0 + var3.qhv * 1.5;
            var6 = var3.getEquip("物理吸收");
            var18 = var4;
         } else {
            var10000 = Class9.kd(var1);
            var10001 = "&H+";
            if (var10000.equals("kff")) {
               var4 = 75.0 + var3.qhv * 1.5;
               var10001 = "护飭";
               var6 = var3.getEquip("抗风");
               var18 = var4;
            } else {
               var10000 = Class9.kd(var1);
               var10001 = "&B+";
               if (var10000.equals("klf")) {
                  var4 = 75.0 + var3.qhv * 1.5;
                  var10001 = "护雔";
                  var6 = var3.getEquip("抗雷");
                  var18 = var4;
               } else {
                  var10000 = Class9.kd(var1);
                  var10001 = "&]+";
                  if (var10000.equals("ksf")) {
                     var4 = 75.0 + var3.qhv * 1.5;
                     var10001 = "护気";
                     var6 = var3.getEquip("抗水");
                     var18 = var4;
                  } else {
                     var10000 = Class9.kd(var1);
                     var10001 = "&F+";
                     if (var10000.equals("khf")) {
                        var4 = 75.0 + var3.qhv * 1.5;
                        var10001 = "护灈";
                        var6 = var3.getEquip("抗火");
                        var18 = var4;
                     } else {
                        var10000 = Class9.kd(var1);
                        var10001 = "&I%";
                        if (var10000.equals("kgh")) {
                           var4 = 75.0 + var3.qhv * 1.5;
                           var10001 = "抴鬏灈";
                           var6 = var3.getEquip("抗鬼火");
                           var18 = var4;
                        } else {
                           var10000 = Class9.kd(var1);
                           var10001 = "&F!";
                           if (!var10000.equals("khl")) {
                              var10000 = Class9.kd(var1);
                              var10001 = "H[P";
                              if (!var10000.equals("khs")) {
                                 var10000 = Class9.kd(var1);
                                 var10001 = "&H4";
                                 if (!var10000.equals("kfy")) {
                                    var10000 = Class9.kd(var1);
                                    var10001 = "HJT";
                                    if (!var10000.equals("kyw")) {
                                       var10000 = Class9.kd(var1);
                                       var10001 = "&T)";
                                       if (!var10000.equals("kzd")) {
                                          var10000 = Class9.kd(var1);
                                          var10001 = "FWP";
                                          if (var10000.equals("eds")) {
                                             var4 = 75.0 + var3.qhv * 1.5;
                                             var10001 = "軿闄珊";
                                             double var40 = var3.getEquip("躲闪率");
                                             String var10002 = "躁闉";
                                             double var41 = var40 + var3.getEquip("躲闪");
                                             var10002 = "片瑋躜閧";
                                             var6 = var41 + var3.getEquip("物理躲闪");
                                          }

                                          return var4 - var6;
                                       }
                                    }
                                 }
                              }
                           }

                           var10000 = Class9.kd(var1);
                           var10001 = "H[O";
                           if (var10000.equals("khl")) {
                              var10000 = "拚淙丼";
                              var10000 = "抗混乱";
                           } else {
                              var10000 = Class9.kd(var1);
                              var10001 = "H[P";
                              if (var10000.equals("khs")) {
                                 var10000 = "拚昡眬";
                                 var10000 = "抗昏睡";
                              } else {
                                 var10000 = Class9.kd(var1);
                                 var10001 = "HUZ";
                                 if (var10000.equals("kfy")) {
                                    var10000 = "拚尯匽";
                                    var10000 = "抗封印";
                                 } else {
                                    var10000 = Class9.kd(var1);
                                    var10001 = "HJT";
                                    if (var10000.equals("kyw")) {
                                       var10000 = "拚遹徕";
                                       var10000 = "抗遗忘";
                                    } else {
                                       var10000 = "抴丞毱";
                                       var10000 = "抗中毒";
                                    }
                                 }
                              }
                           }

                           String var8 = var10000;
                           LoginResult var9 = var2.getLoginResult();
                           double var61 = BaseValue.e(var8, var9.getRace_id()) + var3.qhv * 0.4;
                           StringBuilder var10004 = new StringBuilder(String.valueOf(var8));
                           String var10005 = "两阝";
                           var4 = var61 * (1.0 + var3.getValue(var10004.append("上限").toString()) / 100.0);
                           var6 = var3.getGrade(var8) + var3.getEquip(var8) + var3.getBorn(var8);
                           var18 = var4;
                        }
                     }
                  }
               }
            }
         }

         return var18 - var6;
      }
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.ait.length; var10000 = var1) {
         this.ait[var1++].t();
      }
   }

   public void abn(Ql var1, int var2, BigDecimal var3) {
      int var10000 = 0;
      this.ds = var2;
      this.nh = var3;
      this.h();
      this.abg(var1);

      for (int var4 = 0; var10000 < this.ait.length; var10000 = var4) {
         Class14.mm(this.ait[var4], true);
         Class14 var5 = this.ait[var4];
         int var10002 = Class14.mp(this.ait[var4]) * 22;
         int var10003 = Class14.mr(this.ait[var4]) * 22;
         var4++;
         Class14.mk(var5, 20 + Math.max(var10002, var10003));
      }

      this.f();
      this.yv(-1, 0, this.getWidth(), this.getHeight());
      this.zc().b(this.lj());
   }

   public void g(int var1) {
      this.ait[var1 - 120].l();
   }

   public boolean pa(int var1, BigDecimal var2) {
      if (this.ds == var1) {
         if (this.ds == 0) {
            return true;
         }

         if (this.ds == 1) {
            if (this.nh.compareTo(var2) == 0) {
               return true;
            }

            return false;
         }
      }

      return false;
   }
}
