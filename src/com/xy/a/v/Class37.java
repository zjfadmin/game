package com.xy.a.v;

import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.Class54;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.ActivityRole;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Dimension;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class37 extends com.xy.q.Class50 {
   private RichLabel ahj;
   private com.xy.q.Class30 ahk;
   private com.xy.i.Class22[] ahl;
   private Class54[] ahm;
   private JScrollPane wy;
   private JComponent ahn;
   private JLabel[] ch;
   private ActivityMenuSet2 rg;
   private Activity aho;
   private int ae;
   private com.xy.w.Class18[] j;
   private ActivityFC ahp;
   private int ah;

   public void y(int var1) {
      ActivityRole var2 = this.ahk.yx().getActivity(this.aho.getId());
      com.xy.v.Class8 var3 = this.ahk.yt();
      this.ah = Math.max(0, Math.min(var1, this.ae));
      int var4 = -var1;
      FormulaNum[] var8;
      int var7 = (var8 = this.rg.getBases()).length;

      int var6;
      for (int var10000 = var6 = 0; var10000 < var7; var10000 = ++var6) {
         FormulaNum var5;
         int var9 = (var5 = var8[var6]).getSize();
         if (var4 + var9 < 0) {
            var4 += var9;
         } else {
            int var10;
            for (int var19 = var10 = 0; var19 < var9 && var4 < this.ahm.length; var4++) {
               if (var4 >= 0) {
                  int var11 = (int)var5.getZhi(var10);
                  ActivityFCTarget var13 = (ActivityFCTarget)var3.ba(var11).getData();
                  long var14 = var2 != null ? var2.getValueByKey(var11) : 0L;
                  this.ahm[var4].gs(22, var3.aj(var13.getT2()));
                  this.ahm[var4].ef(var11);
                  Class54 var20 = this.ahm[var4];
                  String var23;
                  if (var14 > 0L) {
                     var23 = "C`\u001fg\u001f2\u00014\u001es^d";
                     var23 = "sc/d/117.png";
                  } else {
                     var23 = "\u0004\u0018X\u001fXJFMY\u000b\u0019\u001c";
                     var23 = "sc/d/116.png";
                  }

                  var20.dp(var23);
                  String var16;
                  String var21 = var16 = var3.aj(var13.getT1());
                  var23 = "\u007f";
                  int var17;
                  if ((var17 = var21.indexOf("|")) == -1) {
                     this.ch[var4].setText(var16);
                     this.ch[var4 + 6].setText("");
                  } else {
                     this.ch[var4].setText(var16.substring(0, var17));
                     this.ch[var4 + 6].setText(var16.substring(var17 + 1));
                  }
               }

               var19 = ++var10;
            }
         }
      }

      int var18;
      for (int var22 = var18 = Math.max(0, var4); var22 < this.ahm.length; var22 = var18) {
         this.ahm[var18].h();
         this.ch[var18].setText("");
         int var26 = var18 + 6;
         var18++;
         this.ch[var26].setText("");
      }

      this.ahl[1].setVisible(this.ae > 0);
      this.ahl[2].setVisible(this.ae > 0);
   }

   public Class37(com.xy.q.Class30 var1) {
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.setBounds(0, 0, 483, 526);
      this.ahk = var1;
      this.ahl = new com.xy.i.Class22[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ahl.length; var10000 = var2) {
         Class37 var6;
         if (var2 == 0) {
            var6 = this;
            String var10006 = "\b\u0014T\u0012TDJY\u000b\u0019\u001c";
            String var10011 = "颶叕";
            this.ahl[var2] = new com.xy.i.Class22("sc/e/31.png", 1, 121, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "领取", var1, this);
            this.ahl[var2].setBounds(357, 260, 79, 25);
         } else if (var2 == 1) {
            var6 = this;
            String var33 = "\u0004\u0018X\u001eXJBMY\u000b\u0019\u001c";
            this.ahl[var2] = new com.xy.i.Class22("sc/e/156.png", 1, 122, var1, this);
            this.ahl[var2].setBounds(58, 172, 18, 25);
         } else {
            if (var2 == 2) {
               String var10005 = "C`\u001ff\u001f2\u00056\u001es^d";
               this.ahl[var2] = new com.xy.i.Class22("sc/e/155.png", 1, 123, var1, this);
               this.ahl[var2].setBounds(434, 172, 18, 25);
            }

            var6 = this;
         }

         var6.add(this.ahl[var2++]);
      }

      this.ahm = new Class54[6];

      for (int var7 = var2 = 0; var7 < this.ahm.length; var7 = var2) {
         this.ahm[var2] = new Class54(var1);
         this.ahm[var2].setBounds(70 + var2 * 62, 135, 55, 53);
         this.add(this.ahm[var2++]);
      }

      this.ahj = new RichLabel("", com.xy.q.Class49.n);
      this.add(this.ahj);
      this.ch = new JLabel[18];

      for (int var8 = var2 = 0; var8 < this.ch.length; var8 = var2) {
         Class37 var9;
         if (var2 >= 0 && var2 <= 5) {
            var9 = this;
            this.ch[var2] = com.xy.q.Class1.k(70 + 62 * var2, 185, 58, 14, Color.black, com.xy.q.Class49.n);
            this.ch[var2].setHorizontalAlignment(0);
         } else if (var2 >= 6 && var2 <= 11) {
            var9 = this;
            this.ch[var2] = com.xy.q.Class1.k(70 + 62 * (var2 - 6), 199, 58, 14, Color.black, com.xy.q.Class49.n);
            this.ch[var2].setHorizontalAlignment(0);
         } else if (var2 == 12) {
            var9 = this;
            this.ch[var2] = com.xy.q.Class1.k(71, 229, 70, 19, Color.black, com.xy.q.Class49.ch);
            JLabel var10001 = this.ch[var2];
            String var16 = "皙桼辬廝";
            var10001.setText("目标进度");
         } else if (var2 >= 13 && var2 <= 14) {
            var9 = this;
            this.ch[var2] = com.xy.q.Class1.k(71 + (var2 - 13) * 140, 261, 70, 19, Color.black, com.xy.q.Class49.n);
         } else if (var2 >= 15 && var2 <= 16) {
            var9 = this;
            this.ch[var2] = com.xy.q.Class1.k(133 + (var2 - 15) * 140, 261, 70, 19, Color.black, com.xy.q.Class49.co);
         } else {
            if (var2 == 17) {
               this.ch[var2] = com.xy.q.Class1.k(68, 300, 373, 21, Color.white, com.xy.q.Class49.ch);
               this.ch[var2].setHorizontalAlignment(0);
               JLabel var10 = this.ch[var2];
               String var13 = "盞栄辎戓奦劲";
               var10.setText("目标达成奖励");
            }

            var9 = this;
         }

         var9.add(this.ch[var2++]);
      }

      JLabel var10008 = this.ch[13];
      String var10009 = "弤制辬廝";
      var10008.setText("当前进度");
      JLabel var10007 = this.ch[14];
      String var34 = "盞栄迫庥";
      var10007.setText("目标进度");
      this.ahn = new Class42(this);
      this.wy = com.xy.q.Class1.g(68, 320, 373, 161, this.ahn, 20);
      this.add(this.wy);
      this.j = new com.xy.w.Class18[16];

      for (int var11 = var2 = 0; var11 < this.j.length; var11 = var2) {
         this.j[var2] = new com.xy.w.Class18();
         Class37 var12;
         if (var2 == 0) {
            var12 = this;
            com.xy.w.Class18 var18 = this.j[var2];
            String var10003 = "\b\u0014T\u0013TAKY\u000b\u0019\u001c";
            var18.mt(com.xy.w.Class16.m("sc/d/60.png", 80, 1, 80, 1, false));
            this.j[var2].setBounds(67, 126, 377, 7);
         } else if (var2 >= 1 && var2 <= 5) {
            var12 = this;
            com.xy.w.Class18 var25 = this.j[var2];
            String var32 = "C`\u001fg\u001f2\u00023\u001es^d";
            var25.dp("sc/d/120.png");
            this.j[var2].setBounds(131 + (var2 - 1) * 62, 139, 1, 47);
         } else if (var2 >= 6 && var2 <= 10) {
            var12 = this;
            com.xy.w.Class18 var24 = this.j[var2];
            String var31 = "\u0004\u0018X\u001fXJFBY\u000b\u0019\u001c";
            var24.dp("sc/d/119.png");
            this.j[var2].setBounds(126 + (var2 - 6) * 62, 192, 12, 14);
         } else if (var2 == 11) {
            var12 = this;
            com.xy.w.Class18 var19 = this.j[var2];
            String var27 = "C`\u001fg\u001f2\u00022\u001es^d";
            var19.dp("sc/d/121.png");
            this.j[var2].setBounds(145, 233, 290, 11);
         } else if (var2 == 12) {
            var12 = this;
            com.xy.w.Class18 var20 = this.j[var2];
            String var28 = "\b\u0014T\u0013TFLY\u000b\u0019\u001c";
            var20.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
            this.j[var2].setBounds(144, 232, 292, 13);
         } else if (var2 == 13) {
            var12 = this;
            com.xy.w.Class18 var21 = this.j[var2];
            String var29 = "pS,T,\u00026\u001es^d";
            var21.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(68, 300, 373, 21);
         } else if (var2 == 14) {
            var12 = this;
            com.xy.w.Class18 var22 = this.j[var2];
            String var30 = "\b\u0014T\u0013TEOY\u000b\u0019\u001c";
            var22.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(68, 300, 373, 183);
         } else {
            if (var2 == 15) {
               com.xy.w.Class18 var14 = this.j[var2];
               String var23 = "pS,T,\u00035\u001es^d";
               var14.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.j[var2].setBounds(55, 66, 400, 434);
            }

            var12 = this;
         }

         var12.add(this.j[var2++]);
      }
   }

   public void mj(Activity var1, ActivityMenuSet2 var2) {
      this.aho = var1;
      this.rg = var2;
      ActivityRole var3 = this.ahk.yx().getActivity(var1.getId());
      String var5 = this.ahk.yt().aj(var2.getT1());
      this.ahj.setTextSize(var5, 380);
      this.ahj.setBounds(68, 71, this.ahj.getWidth(), this.ahj.getHeight());
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      FormulaNum[] var12;
      int var11 = (var12 = var2.getBases()).length;

      int var10;
      for (int var10000 = var10 = 0; var10000 < var11; var10000 = var10) {
         FormulaNum var9;
         int var13 = (var9 = var12[var10]).getSize();

         int var14;
         for (int var18 = var14 = 0; var18 < var13; var18 = ++var14) {
            int var15 = (int)var9.getZhi(var14);
            long var16 = var3 != null ? var3.getValueByKey(var15) : 0L;
            if (var6 == 0 || var16 == 0L && var6 == 0) {
               var7 = var8 + var14;
               var6 = var15;
            }
         }

         var10++;
         var8 += var13;
      }

      this.ae = var8 > this.ahm.length ? var8 - this.ahm.length : 0;
      this.y(Math.min(this.ae, var7));
      this.n(var6);
   }

   public void g(int var1) {
      if (var1 != 121) {
         if (var1 == 122) {
            if (this.ah > 0) {
               this.y(this.ah - 1);
            }
         } else {
            if (var1 == 123) {
               if (this.ah >= this.ae) {
                  return;
               }

               this.y(this.ah + 1);
            }
         }
      } else if (this.ahp != null) {
         RoleData var2 = this.ahk.yx();
         int var3 = 0;
         com.xy.v.Class8 var4 = this.ahk.yt();
         ActivityFCBase[] var5 = ((ActivityFCTarget)this.ahp.getData()).getGains();

         int var6;
         for (int var10000 = var6 = 0; var10000 < var5.length; var10000 = ++var6) {
            ActivityFCBase var7;
            if ((var7 = var5[var6]).getType() != 1) {
               if (var7.getType() == 2) {
                  Goodstable var8 = var4.ay(new BigDecimal(var7.getId()));
                  var3 = (int)(var3 + (var8 != null && GoodType.z(var8.getType()) ? 1L : var7.getNum()));
               } else if (var7.getType() == 3) {
                  var3++;
               } else {
                  var7.getType();
               }
            }
         }

         if (var2.getGoodPackSum(-1L, new BigDecimal(-1), var3) < var3) {
            String var10 = "众盿肻卾乺奤";
            this.ahk.afx._do("你的背包不够");
         } else {
            StringBuilder var10001 = new StringBuilder(String.valueOf(this.aho.getId()));
            String var10002 = "\u007f";
            String var9 = Agreement.getSendTextAES("activity", var10001.append("|").append(this.ahp.getId()).toString());
            this.ahk.za().k(var9);
         }
      }
   }

   public void n(int var1) {
      if (var1 != 0) {
         com.xy.v.Class8 var2 = this.ahk.yt();
         ActivityRole var3 = this.ahk.yx().getActivity(this.aho.getId());
         this.ahp = var2.ba(var1);
         ActivityFCTarget var4 = (ActivityFCTarget)this.ahp.getData();
         long var5 = 0L;
         Class37 var10000;
         if (var4.getTarget().getType() == 1) {
            var5 = var3 != null ? var3.getValueByKey(var4.getTarget().getId()) : 0L;
            var10000 = this;
         } else if (var4.getTarget().getType() == 2) {
            var10000 = this;
            var5 = this.ahk.yx().getTaskSystem().f(var4.getTarget().getId(), 2);
         } else {
            var5 = 0L;
            var10000 = this;
         }

         var10000.ch[15].setText(String.valueOf(var5));
         this.ch[16].setText(String.valueOf(var4.getTarget().getNum()));
         double var7 = (double)var5 / var4.getTarget().getNum();
         long var9 = var3 != null ? var3.getValueByKey(var1) : 0L;
         double var25;
         if (var9 > 0L) {
            var25 = var7;
            this.ahl[0].setBtn(0);
            com.xy.i.Class22 var10001 = this.ahl[0];
            String var10002 = "嶉飱厭";
            var10001.setText("已领取");
         } else if (var5 >= var4.getTarget().getNum()) {
            this.ahl[0].setBtn(1);
            var25 = var7;
            com.xy.i.Class22 var29 = this.ahl[0];
            String var33 = "颶叕";
            var29.setText("领取");
         } else {
            this.ahl[0].setBtn(0);
            var25 = var7;
            com.xy.i.Class22 var30 = this.ahl[0];
            String var34 = "村迉扫";
            var30.setText("未达成");
         }

         var7 = var25 * 290.0;
         var7 = Math.min(290.0, var7);
         var7 = Math.max(0.0, var7);
         this.j[11].setBounds(145, 233, (int)var7, 11);
         int var11 = 0;
         short var12 = 360;
         int var13 = 0;
         ActivityFCBase[] var14 = var4.getGains();

         int var15;
         for (int var26 = var15 = 0; var26 < var14.length; var26 = ++var15) {
            Class35 var16 = this.aae(var11);
            ActivityFCBase var17;
            Class35 var27;
            if ((var17 = var14[var15]).getType() == 1) {
               com.xy.v.Class26 var18 = this.aho.getPointKey(var17.getId());
               StringBuilder var35 = new StringBuilder(String.valueOf(var17.getNum()));
               String var10003;
               if (var18 != null) {
                  var10003 = var18.a;
               } else {
                  var10003 = "朚矦租刅";
                  var10003 = "未知积分";
               }

               var16.gs(22, var35.append(var10003).toString());
               var27 = var16;
               String var10004 = "BGH";
               var16.gt(com.xy.w.Class15.d("903"));
               var16._do("");
            } else if (var17.getType() == 2) {
               Goodstable var24;
               if ((var24 = var2.ay(new BigDecimal(var17.getId()))) == null) {
                  continue;
               }

               var27 = var16;
               var16.gs(1, var24);
               var16._do(String.valueOf(var17.getNum()));
            } else if (var17.getType() == 3) {
               var27 = var16;
               String var37 = "BGH";
               String var10007 = "隿朹奦劲";
               var16.gs(22, "随机奖励");
               var16.gt(com.xy.w.Class15.d("903"));
               var16._do("");
            } else {
               if (var17.getType() != 4) {
                  continue;
               }

               var27 = var16;
               String var38 = ":\u00000";
               var16.gs(22, var17.getNum() + var17.getKey());
               var16.gt(com.xy.w.Class15.d("903"));
               var16._do("");
            }

            var27.setBounds(15 + var11 % 6 * 56, 20 + var11 / 6 * 56, 50, 50);
            int var31 = var11 / 6;
            var11++;
            var13 = 90 + var31 * 56;
         }

         for (int var28 = var15 = var11; var28 < this.ahn.getComponentCount(); var28 = var15) {
            this.ahn.getComponent(var15++).setVisible(false);
         }

         this.ahn.setPreferredSize(new Dimension(var12, var13));
         this.t();
      }
   }

   public Class35 aae(int var1) {
      if (var1 < this.ahn.getComponentCount()) {
         return (Class35)this.ahn.getComponent(var1);
      } else {
         Class35 var2 = new Class35(this, this.ahk);
         String var10002 = "\u0004\u0018X\u001fXOY\u000b\u0019\u001c";
         var2.wp(Class54.auu);
         var2.mt(com.xy.w.Class16.m("sc/d/4.png", 6, 6, 6, 6, false));
         this.ahn.add(var2);
         return var2;
      }
   }

   public void t() {
      JScrollBar var1 = this.wy.getVerticalScrollBar();
      var1.setMaximum(this.ahn.getHeight());
      var1.setValue(0);
   }
}
