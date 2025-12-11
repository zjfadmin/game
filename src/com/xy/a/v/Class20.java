package com.xy.a.v;

import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.Activity2Role;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBeau;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;

public class Class20 extends com.xy.q.Class30 {
   private int[] ub;
   private JLabel[] uc;
   private Class4[] ud;
   private com.xy.i.Class22[] ue;
   private RichLabel uf;
   private int gv = 1;
   private Activity ug;
   private List<Integer> uh;
   private int gy = 1;
   private com.xy.w.Class18 kh;
   private int z;
   private com.xy.q.Class14 nk;
   private int cn;
   private Class14[] ui;
   private com.xy.q.Class50 uj;
   private com.xy.w.Class18 gh;
   private com.xy.w.Class18[] j;
   private com.xy.q.Class50 uk;
   private int ah;

   public Class20(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 703, 542, com.xy.q.Class30.agf);
      this.ue = new com.xy.i.Class22[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ue.length; var10000 = var2) {
         if (var2 == 0) {
            var10000 = var2;
            String var10005 = "mF1@1\u0014&\u00130UpB";
            int var10007 = 191 + var2;
            String var10010 = "戟盕竐抜";
            this.ue[var2] = new com.xy.i.Class22("sc/e/186.png", 1, var10007, com.xy.q.Class49.bx, null, "我的竞拍", this);
         } else {
            com.xy.i.Class22[] var8 = this.ue;
            String var30;
            if (var2 == 1) {
               var30 = "mF1@1\u0014+\u00130UpB";
               var30 = "sc/e/156.png";
            } else {
               var30 = "}2!4!`;d !`6";
               var30 = "sc/e/155.png";
            }

            com.xy.i.Class22 var10001 = new com.xy.i.Class22(var30, 1, 191 + var2, this);
            var8[var2] = var10001;
            var10000 = var2;
         }

         Class20 var9;
         if (var10000 == 0) {
            var9 = this;
            this.ue[var2].setBounds(543, 71, 112, 43);
         } else {
            var9 = this;
            this.ue[var2].setBounds(305 + (var2 - 1) * 94, 498, 18, 25);
         }

         var9.add(this.ue[var2++]);
      }

      this.nk = com.xy.q.Class1.i(327, 500, 68, 19, 0, Color.white, com.xy.q.Class49.w);
      String var32 = "V}\nz\n/\u00120UpB";
      this.nk.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.nk);
      this.uf = new RichLabel("", com.xy.q.Class49.w);
      this.add(this.uf);
      this.j = new com.xy.w.Class18[2];

      for (int var10 = var2 = 0; var10 < this.j.length; var10 = var2) {
         this.j[var2] = new com.xy.w.Class18();
         Class20 var11;
         if (var2 == 0) {
            var11 = this;
            com.xy.w.Class18 var24 = this.j[var2];
            String var10003 = "\"m~j~8g !`6";
            var24.mt(com.xy.w.Class16.m("sc/d/66.png", 100, 1, 100, 1, false));
            this.j[var2].setBounds(47, 131, 629, 2);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var18 = this.j[var2];
               String var25 = "V}\nz\n-\u00130UpB";
               var18.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.j[var2].setBounds(46, 58, 634, 65);
            }

            var11 = this;
         }

         var11.add(this.j[var2++]);
      }

      this.uk = new com.xy.q.Class50();
      this.ud = new Class4[6];

      for (int var12 = var2 = 0; var12 < this.ud.length; var12 = var2) {
         this.ud[var2] = new Class4(this, var2, this);
         this.ud[var2].setBounds(var2 % 2 * 322, var2 / 2 * 120, 312, 110);
         this.uk.add(this.ud[var2++]);
      }

      this.uk.setBounds(45, 141, 634, 350);
      this.add(this.uk);
      this.uj = new com.xy.q.Class50();
      this.uc = new JLabel[4];

      for (int var13 = var2 = 0; var13 < this.uc.length; var13 = var2) {
         String var33 = "-26g9e;\u0012";
         this.uc[var2] = com.xy.q.Class1.k(7, 0, 150, 24, com.xy.q.Class49.c("#c86745C"), com.xy.q.Class49.ch);
         JLabel var14 = this.uc[var2];
         String var20;
         if (var2 == 0) {
            var20 = "枟哤Wa靍叒";
            var20 = "极品ID靓号";
         } else if (var2 == 1) {
            var20 = "窏拃亦";
            var20 = "竞拍价";
         } else if (var2 == 2) {
            var20 = "犨怤";
            var20 = "状态";
         } else if (var2 == 3) {
            var20 = "擃伍";
            var20 = "操作";
         } else {
            var20 = "";
         }

         var14.setText(var20);
         this.uc[var2].setHorizontalAlignment(0);
         Class20 var15;
         if (var2 == 1) {
            var15 = this;
            this.uc[var2].setBounds(170, 0, 150, 24);
         } else if (var2 == 2) {
            var15 = this;
            this.uc[var2].setBounds(326, 0, 150, 24);
         } else {
            if (var2 == 3) {
               this.uc[var2].setBounds(476, 0, 150, 24);
            }

            var15 = this;
         }

         var15.uj.add(this.uc[var2++]);
      }

      this.ui = new Class14[7];

      for (int var17 = var2 = 0; var17 < this.ui.length; var17 = var2) {
         this.ui[var2] = new Class14(this, var2, this);
         this.ui[var2].setBounds(0, 41 + var2 * 40, 635, 24);
         this.uj.add(this.ui[var2++]);
      }

      String var34 = "mF1A1\u0017.\u00160UpB";
      this.kh = new com.xy.w.Class18("sc/d/203.png");
      String var10006 = "}2!5!`>` !`6";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/101.png", 10, 50, 10, 50, false));
      this.kh.setBounds(0, 0, 635, 28);
      this.gh.setBounds(1, 23, 633, 336);
      this.uj.add(this.kh);
      this.uj.add(this.gh);
      this.uj.setBounds(44, 141, 635, 359);
      this.add(this.uj);
   }

   public void h() {
      if (this.ah == 1) {
         this.ah = 0;
         this.cc(191, 0);
      }
   }

   public void g(int var1) {
      this.gv = var1;
      com.xy.q.Class14 var10000 = this.nk;
      StringBuilder var10001 = new StringBuilder(String.valueOf(this.gv));
      String var10002 = "\n";
      var10000.setText(var10001.append("/").append(this.gy).toString());
      if (this.ah == 0) {
         byte var7 = 98;
         int var8 = 2 + (this.gv - 1) * 2 * this.ud.length;

         int var9;
         for (int var12 = var9 = 0; var12 < this.ud.length; var8 += 2) {
            if (var8 < this.ub.length) {
               this.ud[var9].fj(this.ub[var8], this.ub[var8 + 1], var7);
            } else {
               this.ud[var9].fj(0, 0, var7);
            }

            var12 = ++var9;
         }
      } else {
         byte var2 = 98;
         RoleData var3 = this.yx();
         Activity2Role var4 = this.ug != null ? (Activity2Role)var3.getActivity(this.ug.getId()) : null;
         int var5 = (this.gv - 1) * this.ui.length;

         int var6;
         for (int var10 = var6 = 0; var10 < this.ui.length; var5++) {
            if (var5 < this.uh.size()) {
               Class14 var11 = this.ui[var6];
               int var13 = this.uh.get(var6);
               int var14;
               byte var10003;
               if (var4 != null) {
                  var14 = (int)var4.getValueByKey(this.uh.get(var6));
                  var10003 = var2;
               } else {
                  var14 = 0;
                  var10003 = var2;
               }

               var11.fj(var13, var14, var10003);
            } else {
               this.ui[var6].fj(0, 0, var2);
            }

            var10 = ++var6;
         }
      }
   }

   public void ne(int[] var1) {
      this.cn = var1[0];
      this.z = var1[1];
      this.ug = this.yt().bb();
      int var9;
      if (this.ug != null) {
         String var10000 = this.ug.getActivitySet();
         String var10001 = "押靶叩讛罰\u0018";
         String var10002 = "-";
         var9 = com.xy.v.Class12.f(var10000, "抢靓号设置=", "|");
      } else {
         var9 = 0;
      }

      int var2 = var9;
      ActivityFC var3 = var2 > 0 ? this.yt().ba(var2) : null;
      ActivityFCBeau var4 = var3 != null ? (ActivityFCBeau)var3.getData() : null;
      Class20 var10;
      if (var4 != null) {
         long var5 = this.ug.getTimeOpen() + (this.cn - 1) * var4.getCycleTime() * 1000L + var4.getPointTime().x * 1000L;
         var10 = this;
         long var7 = this.ug.getTimeOpen() + (this.cn - 1) * var4.getCycleTime() * 1000L + var4.getPointTime().y * 1000L;
         RichLabel var11 = this.uf;
         String var10004 = "\u0006}\u0011&\u0011-\u0016-竻拓旓闪丟=FXc.\u0015.\u0015>\u0005";
         StringBuilder var12 = new StringBuilder("#c484333竞拍时间为#cFF0000  ").append(com.xy.v.Class22.i(var5));
         String var10003 = "qpq";
         var11.setTextSize(var12.append(" ~ ").append(com.xy.v.Class22.i(var7)).toString(), 500);
      } else {
         this.uf.setTextSize("", 500);
         var10 = this;
      }

      var10.uf.setBounds(90, 75, this.uf.getWidth(), this.uf.getHeight());
      this.ub = var1;
      this.ah = 1;
      this.cc(191, 0);
   }

   // $VF: synthetic method
   static int om(Class20 var0) {
      return var0.z;
   }

   public void cc(int var1, int var2) {
      if (var1 == 191) {
         this.ah = this.ah == 0 ? 1 : 0;
         com.xy.i.Class22 var10000 = this.ue[0];
         String var16;
         if (this.ah == 0) {
            var16 = "戏皡竀拨";
            var16 = "我的竞拍";
         } else {
            var16 = "迚嚏竐抜";
            var16 = "返回竞拍";
         }

         var10000.setText(var16);
         if (this.ah == 0) {
            this.uj.setVisible(false);
            this.uk.setVisible(true);
            this.gy = 1 + ((this.ub.length - 2) / 2 - 1) / this.ud.length;
            this.g(1);
         } else {
            this.uk.setVisible(false);
            this.uj.setVisible(true);
            Class20 var12;
            if (this.uh == null) {
               this.uh = new ArrayList<>();
               var12 = this;
            } else {
               this.uh.clear();
               var12 = this;
            }

            RoleData var11 = var12.yx();
            Activity2Role var4 = this.ug != null ? (Activity2Role)var11.getActivity(this.ug.getId()) : null;
            if (var4 != null) {
               Iterator var6;
               Iterator var13 = var6 = var4.getDataMap().keySet().iterator();

               while (var13.hasNext()) {
                  Integer var5;
                  if ((var5 = (Integer)var6.next()) == 0) {
                     var13 = var6;
                  } else {
                     this.uh.add(var5);
                     var13 = var6;
                  }
               }
            }

            this.gy = 1 + (this.uh.size() - 1) / this.ui.length;
            this.g(1);
         }
      } else if (var1 == 192) {
         if (this.gv <= 1) {
            String var14 = "过昊馈顐";
            this.afx._do("这是首页");
         } else {
            this.g(this.gv - 1);
         }
      } else if (var1 == 193) {
         if (this.gv >= this.gy) {
            String var10001 = "迗晾尰頤";
            this.afx._do("这是尾页");
         } else {
            this.g(this.gv + 1);
         }
      } else if (var1 == 194) {
         if (var2 != 0) {
            StringBuffer var10;
            (var10 = new StringBuffer()).append("[");
            var10.append(this.yx().getLoginResult().getRolename());
            String var10004 = "=s\\`_p,\t";
            var10.append("#VBEAU2,");
            var10.append(var2);
            String var10006 = "rB\f";
            var10.append("#L]");
            ((com.xy.a.Class48)this.zc().j(46)).bk(var10.toString());
         }
      } else if (var1 == 195) {
         if (var2 != 0) {
            String var20 = "\\\u0014";
            String var9 = Agreement.getSendTextAES("BEAU", "B1" + var2);
            this.za().k(var9);
         }
      } else if (var1 == 196) {
         if (var2 != 0) {
            String var19 = "L0";
            String var8 = Agreement.getSendTextAES("BEAU", "Ba" + var2);
            this.za().k(var8);
         }
      } else if (var1 == 197) {
         if (var2 != 0) {
            String var18 = "\\G";
            String var7 = Agreement.getSendTextAES("BEAU", "Bb" + var2);
            this.za().k(var7);
         }
      } else {
         if (var1 == 198) {
            if (var2 == 0) {
               return;
            }

            String var10003 = "L2";
            String var3 = Agreement.getSendTextAES("BEAU", "Bc" + var2);
            this.za().k(var3);
         }
      }
   }
}
