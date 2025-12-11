package com.xy.a.q;

import com.xy.a.Class142;
import com.xy.bean.QualityClBean;
import com.xy.bean.UseCardBean;
import com.xy.formula.BaseEquip;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class30 extends com.xy.q.Class30 {
   private com.xy.i.Class19[] ux;
   public QualityClBean bu;
   private com.xy.w.Class18[] de;
   private com.xy.q.Class44 uy;
   private JLabel[] ap;
   private com.xy.q.Class52 hl;
   private MoneyType uz;
   private List<Class4> eq;
   public int eg;
   private BigDecimal hh;

   public String ow(boolean var1) {
      this.uy.be(false);
      this.uy.setVisible(var1);
      return var1 ? this.ox(false) : null;
   }

   public Class30(GameView var1) {
      super(11, 3, com.xy.q.Class30.afz, var1);
      String var10006 = "\u00173K4KaJ \n7";
      this.yy(-1, 0, 470, 328, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), null);
      this.rm(true);
      this.eq = new ArrayList<>();
      this.ux = new com.xy.i.Class19[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ux.length; var10000 = var2) {
         com.xy.i.Class19[] var5 = this.ux;
         String var10004 = "Qw\rq\r \u0014:RzE";
         int var27 = 224 + var2;
         String var31;
         Class30 var10010;
         if (var2 == 0) {
            var31 = "侍甽叏尺恷";
            var31 = "保留原属性";
            var10010 = this;
         } else if (var2 == 1) {
            var31 = "曝捶斒届怅";
            var31 = "替换新属性";
            var10010 = this;
         } else if (var2 == 2) {
            var31 = "凩歱烘卆";
            var31 = "再次炼化";
            var10010 = this;
         } else {
            var31 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/46.png", 1, var27, Class49.ch, null, var31, var10010);
         var5[var2] = var10002;
         Class30 var6;
         if (var2 != 0 && var2 != 1) {
            if (var2 == 2) {
               this.ux[var2].setFont(com.xy.q.Class49.bz);
               com.xy.i.Class19 var10001 = this.ux[var2];
               String var18 = "Qw\rq\r&\u001a:RzE";
               var10001.setImage("sc/e/28.png");
               this.ux[var2].setBounds(365, 28, 68, 18);
            }

            var6 = this;
         } else {
            var6 = this;
            this.ux[var2].setForeground(Color.black);
            this.ux[var2].setBounds(69 + 207 * var2, 279, 119, 25);
         }

         var6.add(this.ux[var2++]);
      }

      this.uy = new com.xy.q.Class44();
      this.uy.rm(true);
      String var10012 = "剹嬶丩纓";
      this.uy.dq("初学乍练");
      String var10011 = "刉窇闼徦";
      this.uy.dq("初窥门径");
      String var35 = "甁杙屫所";
      this.uy.dq("略有小成");
      String var34 = "螙伸贻逸";
      this.uy.dq("融会贯通");
      String var10008 = "徧飖示佊";
      this.uy.dq("心领神会");
      String var10007 = "炝灉纻靰";
      this.uy.dq("炉火纯青");
      this.uy.zb(68, 28, 99, 19);
      this.uy.setVisible(false);
      this.add(this.uy);
      this.uz = new MoneyType();
      var10011 = "亽珙";
      this.uz.setIdAndKey(3, "仙玉");
      this.hl = com.xy.q.Class1.m(68, 28, 99, 19, 10, Color.white, com.xy.q.Class49.w, this.uz, var1);
      this.hl.n(2);
      var10006 = "Qw\rp\r%\u0015:RzE";
      this.hl.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.hl);
      this.ap = new JLabel[5];

      for (int var7 = var2 = 0; var7 < this.ap.length; var7 = var2) {
         int var20 = 57 + 210 * var2;
         Color var29;
         int var30;
         if (var2 == 0) {
            var29 = Color.white;
            var30 = var2;
         } else if (var2 == 1) {
            var29 = Color.green;
            var30 = var2;
         } else {
            var29 = Color.black;
            var30 = var2;
         }

         this.ap[var2] = com.xy.q.Class1.k(
            var20, 59, 183, 23, var29, var30 == 4 ? com.xy.q.Class49.ac : (var2 != 2 && var2 != 3 ? com.xy.q.Class49.by : com.xy.q.Class49.ch)
         );
         this.ap[var2].setHorizontalAlignment(10);
         JLabel var8 = this.ap[var2];
         String var13;
         if (var2 == 0) {
            var13 = "叏烘卆尺恷";
            var13 = "原炼化属性";
         } else if (var2 == 1) {
            var13 = "斒炨匴届怅";
            var13 = "新炼化属性";
         } else if (var2 == 2) {
            var13 = "亽珙";
            var13 = "仙玉";
         } else if (var2 == 3) {
            var13 = "迩劂牭抢";
            var13 = "追加特技";
         } else {
            var13 = "";
         }

         var8.setText(var13);
         Class30 var9;
         if (var2 == 2) {
            var9 = this;
            this.ap[var2].setBounds(28, 28, 36, 19);
         } else if (var2 == 3) {
            var9 = this;
            this.ap[var2].setBounds(293, 29, 68, 17);
         } else {
            if (var2 == 4) {
               this.ap[var2].setBounds(30, 10, 450, 17);
            }

            var9 = this;
         }

         var9.add(this.ap[var2++]);
      }

      this.de = new com.xy.w.Class18[5];

      for (int var10 = var2 = 0; var10 < this.de.length; var10 = var2) {
         this.de[var2] = new com.xy.w.Class18();
         Class30 var11;
         if (var2 == 0) {
            var11 = this;
            com.xy.w.Class18 var22 = this.de[var2];
            String var10003 = "#\u0007\u007f\u0001\u007fViJ \n7";
            var22.dp("sc/e/29.png");
            this.de[var2].setBounds(276, 28, 17, 17);
         } else if (var2 != 1 && var2 != 2) {
            if (var2 == 3 || var2 == 4) {
               com.xy.w.Class18 var17 = this.de[var2];
               String var24 = "#\u0007\u007f\u0000\u007fWfJ \n7";
               var17.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.de[var2].setBounds(26 + (var2 - 3) * 210, 50, 208, 218);
            }

            var11 = this;
         } else {
            var11 = this;
            com.xy.w.Class18 var23 = this.de[var2];
            String var26 = "Qw\rp\r'\u0016:RzE";
            var23.dp("sc/d/34.png");
            this.de[var2].setBounds(36 + (var2 - 1) * 210, 59, 183, 23);
         }

         var11.add(this.de[var2++]);
      }

      if (this.za().l(2, 7)) {
         this.de[0].setVisible(false);
         this.ap[3].setVisible(false);
      } else {
         if (this.za().gameType == 2) {
            this.de[0].setVisible(false);
            this.ap[3].setVisible(false);
            this.ap[2].setVisible(false);
            this.hl.setVisible(false);
         }
      }
   }

   public String ox(boolean var1) {
      int var2;
      if ((var2 = this.uy.il()) == -1) {
         return null;
      } else {
         RoleData var10000 = this.yx();
         String var10001 = "包仞窎拤坪";
         UseCardBean var3;
         if ((var3 = var10000.getLimit("单人竞技场")) == null) {
            if (var1) {
               var10001 = "佂迌月莣徵秤叕";
               this.afx._do("你还未获得称号");
            }

            return null;
         } else {
            String var6 = var3.getValue();
            var10001 = "8,";
            String[] var4 = var6.split("\\|");
            com.xy.q.Class60 var5 = this.uy.afs();
            if (var4.length < var2 + 1) {
               if (var1) {
                  GameView var7 = this.afx;
                  String var10003 = "佂迌月莣徵";
                  StringBuilder var9 = new StringBuilder("你还未获得").append(var5.b());
                  String var10002 = "禔厧";
                  var7._do(var9.append("称号").toString());
               }

               return null;
            } else {
               this.uy.en().setText(var5.b());
               return var4[var2];
            }
         }
      }
   }

   public void oy(String var1, int var2, boolean var3) {
      if (this.za().l(2, 7)) {
         if (this.eg != 0) {
            var3 = false;
         }
      } else if (this.za().gameType == 2) {
         var3 = false;
      }

      boolean var4 = true;
      String var49;
      if (var2 == 0) {
         int var5;
         for (int var10000 = var5 = 0; var10000 < this.eq.size(); var10000 = ++var5) {
            Class4 var6;
            if (Class4.eu(var6 = this.eq.get(var5))) {
               Class4.ev(var6).setVisible(false);
            }
         }

         if (this.eg == 0) {
            this.ap[4].setText(null);
         }

         this.bu = null;

         for (int var47 = var5 = 0; var47 < this.eq.size(); var47 = var5) {
            Class4 class4 = this.eq.get(var5);
            var5++;
            class4.setVisible(false);
         }

         var4 = true;
         var49 = var1;
      } else {
         if (var2 == 1) {
            int var19;
            for (int var50 = var19 = 0; var50 < this.eq.size(); var50 = ++var19) {
               Class4 var21;
               if (!Class4.eu(var21 = this.eq.get(var19))) {
                  var21.setVisible(false);
               }
            }

            var4 = false;
         }

         var49 = var1;
      }

      if (var49 != null && !var1.equals("")) {
         String var84;
         if (this.eg == 7) {
            var84 = "8,";
            var84 = "\\|";
         } else {
            var84 = "\u0004";
            var84 = "&";
         }

         String[] var20 = var1.split(var84);
         int var22 = 0;
         if (this.eg != 0 && this.eg != 1 && this.eg != 8) {
            int var27;
            if (this.eg == 2 || this.eg == 3) {
               for (int var75 = var27 = 1; var75 < var20.length; var75 = ++var27) {
                  var49 = var20[var27];
                  var84 = "m";
                  String[] var32;
                  var49 = (var32 = var49.split("="))[0];
                  var84 = "昽阡\u0002";
                  if (!var49.equals("星阵 ")) {
                     Class4 var78 = this.pb(var4, var22, var3);
                     var84 = var32[0];
                     StringBuilder var110 = new StringBuilder(String.valueOf(var32[1]));
                     String var115 = com.xy.a.Class48.qb(var32[0]);
                     var22++;
                     var78.es(var84, var110.append(var115).toString());
                  } else {
                     Class4 var79 = this.pb(var4, var22, var3);
                     var84 = var32[1];
                     var22++;
                     var79.es(var84, var32[2]);
                  }
               }
            } else if (this.eg == 4) {
               for (int var58 = var27 = 0; var58 < var20.length; var58 = ++var27) {
                  var49 = var20[var27];
                  var84 = "m";
                  String[] var30 = var49.split("=");
                  Class4 var60 = this.pb(var4, var22, var3);
                  var84 = var30[0];
                  StringBuilder var106 = new StringBuilder(String.valueOf(var30[1]));
                  String var112 = com.xy.a.Class48.qb(var30[0]);
                  var22++;
                  var60.es(var84, var106.append(var112).toString());
               }
            } else if (this.eg == 5 || this.eg == 6) {
               double var26 = 1.0;
               int var35;
               int var38 = (var35 = Integer.parseInt(var20[1])) >> 5 & 31;
               int var11 = var35 & 31;
               if (var2 == 0 && this.eg == 6) {
                  JLabel var64 = this.ap[4];
                  String var113 = "粭炞霔覣涜耵";
                  StringBuilder var94 = new StringBuilder("粹炼需要消耗").append(1 + var38 / 8 + var11 / 8);
                  String var107 = "亭朴旉";
                  var64.setText(var94.append("份材料").toString());
               }

               Class4 var65 = this.pb(var4, var22, var3);
               var84 = "怯炛粭倞";
               String var10004 = String.valueOf(var38 + var11);
               var22++;
               var65.es("总点粹值", var10004);

               int var13;
               for (int var66 = var13 = 4; var66 < var20.length; var66 = ++var13) {
                  var49 = var20[var13];
                  var84 = "爩拤m";
                  Skill var14;
                  if (var49.startsWith("特技=") && (var14 = this.yt().ac(var20[var13].substring(3))) != null) {
                     int var15;
                     if ((var15 = Integer.parseInt(var14.getSkillid())) == 8121) {
                        var26 += 0.15;
                     } else if (var15 == 8122) {
                        var26 += 0.25;
                     }
                  }
               }

               for (int var68 = var13 = 2; var68 < 4 && var13 < var20.length; var68 = ++var13) {
                  var49 = var20[var13];
                  var84 = "牛抔\u001f";
                  if (!var49.startsWith("特技=")) {
                     var49 = var20[var13];
                     var84 = "m";
                     int var43;
                     if ((var43 = var49.indexOf("=")) != -1) {
                        String var46 = var20[var13].substring(0, var43);
                        var84 = var20[var13];
                        String var108 = "\u0001";
                        var43 = var84.indexOf("#", var46.length() + 1);
                        double var16 = BaseEquip.getDouble(var20[var13].substring(var46.length() + 1, var43)) * (var13 == 2 ? var38 : var11)
                           + BaseEquip.getDouble(var20[var13].substring(var43 + 1));
                        if (var26 != 1.0) {
                           var16 *= var26;
                        }

                        Class4 var71 = this.pb(var4, var22, var3);
                        StringBuilder var109 = new StringBuilder(String.valueOf(com.xy.v.Class5.d(var16)));
                        String var114 = com.xy.a.Class48.qb(var46);
                        var22++;
                        var71.es(var46, var109.append(var114).toString());
                     }
                  }
               }

               for (int var72 = var13 = 4; var72 < var20.length; var72 = ++var13) {
                  var49 = var20[var13];
                  var84 = "爩拤m";
                  Skill var45;
                  if (var49.startsWith("特技=") && (var45 = this.yt().ac(var20[var13].substring(3))) != null) {
                     Class4 var74 = this.pb(var4, var22, var3);
                     var84 = "牭抢";
                     var22++;
                     var74.es("特技", var45.getSkillname());
                  }
               }
            } else if (this.eg == 7) {
               for (int var61 = var27 = 0; var61 < var20.length; var61 = ++var27) {
                  var49 = var20[var27];
                  var84 = "m";
                  String[] var31 = var49.split("=");
                  Class4 var63 = this.pb(var4, var22, var3);
                  var84 = var31[0];
                  var22++;
                  var63.es(var84, var31[1]);
               }
            }
         } else {
            int var7 = this.eg == 0 ? 1 : 2;

            for (int var52 = var7; var52 < var20.length; var52 = ++var7) {
               var49 = var20[var7];
               var84 = "m";
               String[] var8;
               var49 = (var8 = var49.split("="))[0];
               var84 = "牭抢";
               int var9;
               if (!var49.equals("特技")) {
                  Class4 var57 = this.pb(var4, var22, var3);
                  var84 = var8[0];
                  StringBuilder var10002 = new StringBuilder(String.valueOf(var8[1]));
                  String var10003 = com.xy.a.Class48.qb(var8[0]);
                  var22++;
                  var57.es(var84, var10002.append(var10003).toString());
               } else {
                  for (int var55 = var9 = 1; var55 < var8.length; var55 = ++var9) {
                     Skill var10;
                     if ((var10 = this.yt().ac(var8[var9])) != null) {
                        Class4 var56 = this.pb(var4, var22, var3);
                        var84 = var8[0];
                        var22++;
                        var56.es(var84, var10.getSkillname());
                     }
                  }
               }
            }
         }

         boolean var81;
         label200: {
            boolean var28 = false;
            if (var2 == 0) {
               if (this.eg == 1) {
                  int var33 = 0;
                  int var36 = 0;

                  int var39;
                  for (int var80 = var39 = 0; var80 < this.eq.size(); var80 = ++var39) {
                     Class4 var40;
                     if (Class4.eu(var40 = this.eq.get(var39))) {
                        if (var40.isVisible()) {
                           var33++;
                        }

                        if (Class4.eu(var40) && Class4.et(var40)) {
                           var36++;
                        }
                     }
                  }

                  if (var36 > var33) {
                     var81 = var28 = true;
                     String var111 = "试釙斒锕宸";
                     this.afx._do("请重新锁定");
                     break label200;
                  }
               } else {
                  var28 = true;
               }
            }

            var81 = var28;
         }

         int var34;
         if (var81) {
            for (int var82 = var34 = 0; var82 < this.eq.size(); var82 = ++var34) {
               Class4 var37;
               if (Class4.eu(var37 = this.eq.get(var34))) {
                  var37.be(false);
               }
            }
         }
      } else {
         if (var2 == 0 && this.eg == 6) {
            JLabel var51 = this.ap[4];
            String var10001 = "粭炞霔覣涜耵%仟杄斻";
            var51.setText("粹炼需要消耗1份材料");
         }
      }
   }

   public void oz(BigDecimal var1, String var2, int var3, boolean var4) {
      int var5;
      for (int var10000 = var5 = 0; var10000 < this.eq.size(); var10000 = ++var5) {
         Class4 var6;
         if (Class4.eu(var6 = this.eq.get(var5))) {
            var6.be(false);
            Class4.ev(var6).setVisible(false);
         }
      }

      this.ap[4].setText(null);
      this.eg = var3;
      this.hh = var1;
      String var7 = this.ow(var3 == 4);
      if (var3 == 4) {
         var2 = var7;
      }

      this.oy(var2, 0, var4);
      this.zc().b(this.lj());
   }

   public int id() {
      byte var1 = 0;
      byte var2 = 0;
      return var1 * 10 + var2;
   }

   public void g(int var1) {
      if (var1 == 224) {
         this.zc().f(this.lj());
      } else if (var1 == 225) {
         if (this.bu != null) {
            String var2 = Agreement.getSendTextAES("extrattroper", com.xy.v.Class31.a().toJson(this.bu));
            this.za().k(var2);
            this.pc(this.bu);
         } else {
            this.zc().f(this.lj());
         }
      } else {
         if (var1 == 226) {
            this.h();
         }
      }
   }

   public int dx() {
      return 0;
   }

   public boolean pa(int var1, BigDecimal var2) {
      return this.eg == var1 && com.xy.v.Class12.x(this.hh, var2);
   }

   public Class4 pb(boolean var1, int var2, boolean var3) {
      int var4;
      for (int var10000 = var4 = 0; var10000 < this.eq.size(); var10000 = ++var4) {
         Class4 var5;
         if (Class4.eu(var5 = this.eq.get(var4)) == var1 && Class4.er(var5) == var2) {
            var5.es(null, null);
            if (Class4.ev(var5) != null) {
               Class4.ev(var5).setVisible(var3);
            }

            var5.setVisible(true);
            return var5;
         }
      }

      Class4 var6;
      (var6 = new Class4(this, var1, var2)).setBounds(var1 ? 34 : 244, 85 + 30 * var2, 220, 28);
      this.eq.add(var6);
      this.add(var6, 5);
      if (Class4.ev(var6) != null) {
         Class4.ev(var6).setVisible(var3);
      }

      var6.setVisible(true);
      return var6;
   }

   public void h() {
      if (this.eg == 0) {
         Class64 var11;
         label110: {
            Class57 var8;
            var11 = (var8 = (Class57)this.afx.getFormManagement().j(61)).dx() == 0 ? var8.xu() : null;
            String var14 = var11 != null ? var11.jg() : null;
            if (var14 != null) {
               String var19 = "炨匴裑夥";
               if (var14.equals("炼化装备")) {
                  break label110;
               }

               var19 = "烘卆亽嘸";
               if (var14.equals("炼化仙器")) {
                  break label110;
               }

               var19 = "炨匴祊兗";
               if (var14.equals("炼化神兵")) {
                  break label110;
               }
            }

            String var22 = "讧遭抹朴旉";
            this.afx._do("请选择材料");
            return;
         }

         var11.yd(false);
      } else if (this.eg == 1) {
         Class57 var7;
         Class64 var10 = (var7 = (Class57)this.afx.getFormManagement().j(61)).dx() == 2 ? var7.xu() : null;
         String var13 = var10 != null ? var10.jg() : null;
         if (var13 != null && var13.equals("炼器")) {
            var10.yd(false);
         } else {
            String var18 = "试逝拋杄斻";
            this.afx._do("请选择材料");
         }
      } else if (this.eg != 2 && this.eg != 3) {
         if (this.eg != 4) {
            if (this.eg == 5) {
               Class57 var6;
               Class64 var9 = (var6 = (Class57)this.afx.getFormManagement().j(61)).dx() == 1 ? var6.xu() : null;
               String var12 = var9 != null ? var9.jg() : null;
               if (var12 != null) {
                  String var16 = "鄩餠烝糩";
                  if (var12.equals("配饰点粹")) {
                     var9.yd(false);
                     return;
                  }
               }

               String var17 = "试逝拋杄斻";
               this.afx._do("请选择材料");
               return;
            }

            if (this.eg == 6) {
               Class57 var5;
               Class64 var2 = (var5 = (Class57)this.afx.getFormManagement().j(61)).dx() == 1 ? var5.xu() : null;
               String var3 = var2 != null ? var2.jg() : null;
               if (var3 != null) {
                  String var10001 = "鄩餠糝烬";
                  if (var3.equals("配饰粹炼")) {
                     var2.yd(false);
                     return;
                  }
               }

               String var15 = "试逝拋杄斻";
               this.afx._do("请选择材料");
               return;
            }

            if (this.eg == 7) {
               com.xy.a.i.Class11 var1;
               if ((var1 = (com.xy.a.i.Class11)this.afx.getFormManagement().j(166)).dx() == 1) {
                  var1.dh();
                  return;
               }
            } else {
               com.xy.a.i.Class11 var4;
               if (this.eg == 8 && (var4 = (com.xy.a.i.Class11)this.afx.getFormManagement().j(166)).dx() == 0) {
                  var4.dh();
               }
            }
         }
      } else {
         ((com.xy.a.a.Class19)this.afx.getFormManagement().j(95)).dh();
      }
   }

   public void pc(QualityClBean var1) {
      Class30 var10000;
      if (var1.getType() >= 71 && var1.getType() <= 76) {
         var10000 = this;
         this.eg = 4;
         this.oy(var1.getNewAttr(), 0, false);
      } else {
         label109: {
            Goodstable var2;
            if ((var2 = this.yx().getGood(var1.getRgid())) != null) {
               if (var1.getType() == 2 || var1.getType() == -2) {
                  var10000 = this;
                  this.eg = 1;
                  String var30 = var2.getValue();
                  String var35 = "H^";
                  var2.setValue(GoodType.e(var30.split("\\|"), 1, var1.getNewAttr()));
                  this.oy(var1.getNewAttr(), 0, true);
                  break label109;
               }

               if (var1.getType() == 1) {
                  var10000 = this;
                  this.eg = 0;
                  String var29 = var2.getValue();
                  String var34 = "8,";
                  var2.setValue(GoodType.e(var29.split("\\|"), 0, var1.getNewAttr()));
                  this.oy(var1.getNewAttr(), 0, true);
                  break label109;
               }

               if (var1.getType() == 53) {
                  var10000 = this;
                  this.eg = 2;
                  String var28 = var2.getValue();
                  String var33 = "H^";
                  var2.setValue(GoodType.e(var28.split("\\|"), 0, var1.getNewAttr()));
                  this.oy(var1.getNewAttr(), 0, false);
                  break label109;
               }

               if (var1.getType() == 54) {
                  var10000 = this;
                  this.eg = 3;
                  String var27 = var2.getValue();
                  String var32 = "8,";
                  var2.setValue(GoodType.e(var27.split("\\|"), 6, var1.getNewAttr()));
                  this.oy(var1.getNewAttr(), 0, false);
                  break label109;
               }

               if (var1.getType() == -81 || var1.getType() == -82 || var1.getType() == 82) {
                  this.eg = var1.getType() == -81 ? 5 : 6;
                  var10000 = this;
                  String var23 = var2.getValue();
                  String var26 = "H^";
                  var2.setValue(GoodType.e(var23.split("\\|"), 8, var1.getNewAttr()));
                  this.oy(var1.getNewAttr(), 0, false);
                  break label109;
               }

               if (var1.getType() == 133) {
                  this.eg = 7;
                  String var10003 = var2.getValue();
                  String var24 = "笙练m";
                  String var31 = "^";
                  String var3 = com.xy.v.Class12.ai(var10003, "等级=", "|");
                  String var10002 = var2.getValue();
                  var10003 = "袕奣簫埯m";
                  var24 = "^";
                  String var4 = com.xy.v.Class12.ai(var10002, "装备类型=", "|");
                  String var10001 = var2.getValue();
                  var10002 = "恷剏觑氦m";
                  var10003 = "^";
                  String var5 = com.xy.v.Class12.ai(var10001, "性别要求=", "|");
                  String var8 = var2.getValue();
                  var10001 = "烬嘌導恃v";
                  var10002 = "^";
                  String var6 = com.xy.v.Class12.ai(var8, "炼器属性&", "|");
                  StringBuffer var7 = new StringBuffer();
                  var10003 = "笙练m";
                  var7.append("等级=");
                  var7.append(var3 != null ? var3 : "0");
                  var10002 = "h裧夓籙垟\u001f";
                  var7.append("|装备类型=");
                  if (var4 != null) {
                     var10001 = var4;
                  } else {
                     var10001 = "李瞵";
                     var10001 = "未知";
                  }

                  var7.append(var10001);
                  label60:
                  if (var5 != null) {
                     var10001 = "甕";
                     if (!var5.equals("男")) {
                        var10001 = "夣";
                        if (!var5.equals("女")) {
                           break label60;
                        }
                     }

                     var10001 = "h怅刿覣汖\u001f";
                     var7.append("|性别要求=");
                     var7.append(var5);
                  }

                  if (!com.xy.v.Class12.h(var1.getNewAttr())) {
                     var10001 = ",";
                     var7.append("|");
                     var7.append(var1.getNewAttr());
                  }

                  if (!com.xy.v.Class12.h(var6)) {
                     var10001 = "h炞噼屼怳\u0004";
                     var7.append("|炼器属性&");
                     var7.append(var6);
                  }

                  var2.setValue(var7.toString());
                  var10000 = this;
                  this.oy(var1.getNewAttr(), 0, true);
                  break label109;
               }

               if (var1.getType() == 135) {
                  var10000 = this;
                  this.eg = 8;
                  String var10004 = var2.getValue();
                  String var10005 = "8,";
                  var2.setValue(GoodType.e(var10004.split("\\|"), 1, var1.getNewAttr()));
                  this.oy(var1.getNewAttr(), 0, true);
                  break label109;
               }
            } else {
               this.oy(null, 0, false);
            }

            var10000 = this;
         }
      }

      var10000.bu = null;
   }

   public void ba(QualityClBean var1) {
      if (var1.getType() == -2) {
         this.pc(var1);
         Class142 var2;
         if ((var2 = (Class142)this.afx.getFormManagement().l(121)) != null) {
            var2.apb(var1.getNewAttr());
            return;
         }
      } else if (var1.getType() == 1) {
         this.bu = var1;
         this.oy(var1.getNewAttr(), 1, false);
         Class142 var17;
         if ((var17 = (Class142)this.afx.getFormManagement().l(121)) != null) {
            var17.aow(var1.getNewAttr());
            return;
         }
      } else if (var1.getType() == 53) {
         this.bu = var1;
         this.oy(var1.getNewAttr(), 1, false);
         Class142 var18;
         if ((var18 = (Class142)this.afx.getFormManagement().l(121)) != null) {
            var18.apa(var1.getNewAttr());
            return;
         }
      } else if (var1.getType() == 54) {
         this.bu = var1;
         String var19 = var1.getNewAttr();
         double var3 = 0.0;
         BigDecimal var6;
         Goodstable var7 = (var6 = ((com.xy.a.a.Class19)this.afx.getFormManagement().j(95)).em()) != null ? this.yx().getGood(var6) : null;
         String var31;
         if (var7 != null) {
            var31 = var7.getValue();
            String var10001 = "炨匴届怅";
            var31 = GoodType.getExtra(var31, "炼化属性");
         } else {
            var31 = null;
         }

         String var8 = var31;
         String[] var32;
         if (var8 != null) {
            String var44 = "v";
            var32 = var8.split("&");
         } else {
            var32 = null;
         }

         String[] var9 = var32;
         String[] var10 = null;
         int var11;
         int var33 = var11 = 1;

         while (true) {
            if (var33 >= (var9 != null ? var9.length : 0)) {
               break;
            }

            var31 = var9[var11];
            String var45 = "\u001f";
            int var12;
            if ((var12 = var31.indexOf("=")) != -1) {
               var31 = var9[var11].substring(0, var12);
               var45 = "晻陥尺恷";
               if (var31.equals("星阵属性")) {
                  var31 = var9[var11];
                  var45 = "\u001f";
                  var10 = var31.split("=");
                  break;
               }
            }

            var33 = ++var11;
         }

         String[] var38;
         if (var10 != null) {
            String var48 = "v";
            var38 = var19.split("&");
         } else {
            var38 = null;
         }

         var9 = var38;
         boolean var25 = false;

         int var26;
         for (int var39 = var26 = 0; var39 < this.eq.size(); var39 = ++var26) {
            Class4 var13;
            if (!Class4.eu(var13 = this.eq.get(var26))) {
               var13.setVisible(false);
            }
         }

         var26 = 0;

         int var29;
         for (int var40 = var29 = 1; var40 < (var9 != null ? var9.length : 0); var40 = ++var29) {
            var31 = var9[var29];
            String var49 = "\u001f";
            int var14;
            if ((var14 = var31.indexOf("=")) != -1) {
               String var15 = var9[var29].substring(0, var14);
               String var16 = var9[var29].substring(var14 + 1);
               var3 += MsgUntil.i(var10[2], var15, var16);
               Class4 var42 = this.pb(var25, var26, false);
               var26++;
               var42.es(var15, var16);
            }
         }

         Class4 var43 = this.pb(var25, var26, false);
         String var50 = "仰蠜勄所";
         String var10004 = "1\f%D";
         StringBuilder var10002 = new StringBuilder(String.valueOf(String.format("%.1f", var3)));
         String var10003 = "u";
         var26++;
         var43.es("五行加成", var10002.append("%").toString());
         Class142 var30;
         if ((var30 = (Class142)this.afx.getFormManagement().l(121)) != null) {
            var30.apc(var1.getNewAttr(), var10 == null ? -1.0 : var3);
            return;
         }
      } else {
         if (var1.getType() >= 71 && var1.getType() <= 76) {
            this.bu = var1;
            this.oy(var1.getNewAttr(), 1, false);
            return;
         }

         if (var1.getType() == -81 || var1.getType() == -82) {
            this.pc(var1);
            Class142 var23;
            if ((var23 = (Class142)this.afx.getFormManagement().l(121)) != null) {
               var23.aoy(var1.getNewAttr(), var1.getType() == -81);
               return;
            }
         } else if (var1.getType() == 82) {
            this.bu = var1;
            this.oy(var1.getNewAttr(), 1, false);
            Class142 var20;
            if ((var20 = (Class142)this.afx.getFormManagement().l(121)) != null) {
               var20.aoy(var1.getNewAttr(), false);
               return;
            }
         } else if (var1.getType() == 133) {
            this.bu = var1;
            this.oy(var1.getNewAttr(), 1, false);
            Class142 var21;
            if ((var21 = (Class142)this.afx.getFormManagement().l(121)) != null) {
               var21.aox(var1.getNewAttr());
               return;
            }
         } else if (var1.getType() == 135) {
            this.bu = var1;
            this.oy(var1.getNewAttr(), 1, false);
            Class142 var22;
            if ((var22 = (Class142)this.afx.getFormManagement().l(121)) != null) {
               var22.bq(var1.getNewAttr());
            }
         }
      }
   }
}
