package com.xy.a.v;

import com.xy.a.q.Class71;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.LoginResult;
import com.xy.bean.UseCardBean;
import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.ActivityRole;
import com.xy.richtext.RichLabel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class51 extends com.xy.q.Class50 {
   private com.xy.q.Class30 amh;
   private com.xy.v.Class26 aye;
   private ActivityMenuSet2 rg;
   private JScrollPane cp;
   private com.xy.w.Class18[] ar;
   private com.xy.i.Class22[] ayf;
   private JComponent qe;
   private JLabel[] au;

   public void l() {
      JScrollBar var1 = this.cp.getVerticalScrollBar();
      var1.setMaximum(this.qe.getHeight());
      var1.setValue(0);
   }

   public Class48 anr(int var1) {
      if (var1 < this.qe.getComponentCount()) {
         return (Class48)this.qe.getComponent(var1);
      } else {
         Class48 var2 = new Class48(this.amh);
         this.qe.add(var2);
         return var2;
      }
   }

   public void mj(Activity var1, ActivityMenuSet2 var2) {
      int var3 = 0;
      byte var4 = 0;
      int var5 = 0;
      this.aye = null;
      this.rg = var2;
      ArrayList var6 = null;
      com.xy.v.Class8 var7 = this.amh.yt();
      RoleData var8;
      ActivityRole var9 = (var8 = this.amh.yx()).getActivity(var1.getId());
      int var48;
      if (var2.getId() == 1) {
         JLabel var10003 = this.au[0];
         String var10004 = "祗十";
         var10003.setText("礼包");
         JLabel var10002 = this.au[1];
         String var63 = "颾觜";
         var10002.setText("预览");
         JLabel var10001 = this.au[2];
         String var60 = "啅亳";
         var10001.setText("售价");
         FormulaNum[] var13;
         int var12 = (var13 = var2.getBases()).length;

         int var11;
         for (int var10000 = var11 = 0; var10000 < var12; var10000 = ++var11) {
            FormulaNum var10 = var13[var11];
            int var14 = 0;
            int var15 = var10.getSize();

            for (int var45 = var14; var45 < var15; var45 = ++var14) {
               int var16 = (int)var10.getZhi(var14);
               ActivityFC var17;
               if ((var17 = var7.ba(var16)) != null && var17.getType() == 1) {
                  ActivityFCBuy var18 = (ActivityFCBuy)var17.getData();
                  int var19 = var9 != null ? (int)var9.getValueByKey(var16) : 0;
                  if (var18.getBuyMax() > 0 && var18.getBuyMax() <= var19) {
                     if (var6 == null) {
                        var6 = new ArrayList();
                     }

                     var6.add(var17);
                  } else {
                     Class48 var20 = this.anr(var3);
                     var20.ajf(2, var1, var17, false, var19);
                     int var10005 = var3 * 74;
                     var3++;
                     var20.setBounds(0, var10005, 477, 70);
                     var20.setVisible(true);
                     var5 = var20.getY() + var20.getHeight();
                  }
               }
            }
         }

         int var22 = 0;
         var11 = var6 != null ? var6.size() : 0;

         for (var48 = var22; var48 < var11; var48 = var22) {
            ActivityFC var29;
            ActivityFCBuy var32 = (ActivityFCBuy)(var29 = (ActivityFC)var6.get(var22)).getData();
            Class48 var35 = this.anr(var3);
            var35.ajf(2, var1, var29, true, var32.getBuyMax());
            int var65 = var3 * 74;
            var3++;
            var35.setBounds(0, var65, 477, 70);
            var35.setVisible(true);
            var48 = var35.getY();
            var22++;
            var5 = var48 + var35.getHeight();
         }

         var48 = var3;
      } else {
         if (var2.getId() == 3 || var2.getId() == 4) {
            JLabel var61 = this.au[0];
            String var64 = "杛仢";
            var61.setText("条件");
            JLabel var56 = this.au[1];
            String var62 = "飯覌";
            var56.setText("预览");
            JLabel var49 = this.au[2];
            String var57 = "家戄犌怕";
            var49.setText("完成状态");
            FormulaNum[] var33;
            int var30 = (var33 = var2.getBases()).length;

            int var27;
            for (int var50 = var27 = 0; var50 < var30; var50 = ++var27) {
               FormulaNum var23 = var33[var27];
               int var36 = 0;
               int var38 = var23.getSize();

               for (int var51 = var36; var51 < var38; var51 = ++var36) {
                  int var39 = (int)var23.getZhi(var36);
                  ActivityFC var40;
                  if ((var40 = var7.ba(var39)) != null && var40.getType() == 2) {
                     long var41 = var9 != null ? var9.getValueByKey(var39) : 0L;
                     if (var41 > 0L) {
                        if (var6 == null) {
                           var6 = new ArrayList();
                        }

                        var6.add(var40);
                     } else {
                        ActivityFCTarget var44;
                        ActivityFCTarget var52;
                        if ((var44 = (ActivityFCTarget)var40.getData()).getTarget().getType() == 1) {
                           var41 = var9 != null ? var9.getValueByKey(var44.getTarget().getId()) : 0L;
                           var52 = var44;
                        } else if (var44.getTarget().getType() == 2) {
                           RoleTaskData var58 = var8.getTaskSystem();
                           var52 = var44;
                           var41 = var58.f(var44.getTarget().getId(), 2);
                        } else {
                           var41 = 0L;
                           var52 = var44;
                        }

                        var41 = Math.min(var52.getTarget().getNum(), var41);
                        Class48 var21 = this.anr(var3);
                        var21.ajf(3, var1, var40, false, var41);
                        int var66 = var3 * 74;
                        var3++;
                        var21.setBounds(0, var66, 477, 70);
                        var21.setVisible(true);
                        var5 = var21.getY() + var21.getHeight();
                     }
                  }
               }
            }

            int var24 = 0;
            var27 = var6 != null ? var6.size() : 0;

            for (var48 = var24; var48 < var27; var48 = var24) {
               ActivityFC var31;
               ActivityFCTarget var34 = (ActivityFCTarget)(var31 = (ActivityFC)var6.get(var24)).getData();
               Class48 var37 = this.anr(var3);
               var37.ajf(3, var1, var31, true, var34.getTarget().getNum());
               int var67 = var3 * 74;
               var3++;
               var37.setBounds(0, var67, 477, 70);
               var37.setVisible(true);
               var48 = var37.getY();
               var24++;
               var5 = var48 + var37.getHeight();
            }
         }

         var48 = var3;
      }

      int var25 = var48;

      for (int var55 = var25; var55 < this.qe.getComponentCount(); var55 = var25) {
         this.qe.getComponent(var25++).setVisible(false);
      }

      this.qe.setPreferredSize(new Dimension(var4, var5));
      this.l();
   }

   public void n(int var1) {
      int var2 = 0;
      byte var3 = 0;
      int var4 = 0;
      this.aye = null;
      this.rg = null;
      int var43;
      if (var1 == 21) {
         JLabel var10003 = this.au[0];
         String var10004 = "皅桃笢绣";
         var10003.setText("目标等级");
         JLabel var10002 = this.au[1];
         String var58 = "颾觜";
         var10002.setText("预览");
         JLabel var10001 = this.au[2];
         String var55 = "寧扔狝恅";
         var10001.setText("完成状态");
         if (this.amh instanceof Class44) {
            ((Class44)this.amh).aha().setTextSize("", 498);
         }

         LoginResult var5 = this.amh.yx().getLoginResult();
         String[] var6 = null;
         if (var5.getVipget() != null) {
            String var10000 = var5.getVipget();
            String var51 = "\u001c2";
            var6 = var10000.split("&&");
         }

         ArrayList var7 = null;
         List var8 = this.amh.yt().ar(1);
         int var9 = 0;
         int var10 = var8 != null ? var8.size() : 0;

         for (int var40 = var9; var40 < var10; var40 = ++var9) {
            ChongjipackBean var11 = (ChongjipackBean)var8.get(var9);
            boolean var12;
            boolean var13 = (var12 = com.xy.v.Class4.b(var5.getGrade(), var11.getPackgrade())) && Class71.aba(var6, 4, var11.getPackgradetype());
            if (var13) {
               if (var7 == null) {
                  var7 = new ArrayList();
               }

               var7.add(var11);
            } else {
               Class48 var14 = this.anr(var2);
               var14.aje(1, var11, var12, var13, 0);
               int var10005 = var2 * 61;
               var2++;
               var14.setBounds(0, var10005, 477, 57);
               var14.setVisible(true);
               var4 = var14.getY() + var14.getHeight();
            }
         }

         var9 = 0;
         var10 = var7 != null ? var7.size() : 0;

         for (var43 = var9; var43 < var10; var43 = var9) {
            ChongjipackBean var28 = (ChongjipackBean)var7.get(var9);
            Class48 var31 = this.anr(var2);
            var31.aje(1, var28, true, true, 0);
            int var62 = var2 * 61;
            var2++;
            var31.setBounds(0, var62, 477, 57);
            var31.setVisible(true);
            var43 = var31.getY();
            var9++;
            var4 = var43 + var31.getHeight();
         }

         var43 = var2;
      } else {
         JLabel var59 = this.au[0];
         String var61 = "祗十";
         var59.setText("礼包");
         JLabel var56 = this.au[1];
         String var60 = "颾觜";
         var56.setText("预览");
         JLabel var52 = this.au[2];
         String var57 = "啅亳";
         var52.setText("售价");
         com.xy.v.Class26 var20 = this.amh.yt().ch(var1);
         com.xy.v.Class26 var21 = null;
         if (var20 != null) {
            UseCardBean var22;
            List var24 = (var22 = this.amh.yx().getLimit("限时礼包")) != null ? var22.getKeysByActivity() : null;
            int var26 = 0;
            int var29 = var24 != null ? var24.size() : 0;
            var43 = var26;

            Class51 var45;
            while (true) {
               if (var43 >= var29) {
                  var45 = this;
                  break;
               }

               com.xy.v.Class26 var32;
               if (com.xy.v.Class12.am((var32 = (com.xy.v.Class26)var24.get(var26)).a, var20.a)) {
                  var21 = var32;
                  var45 = this;
                  break;
               }

               var43 = ++var26;
            }

            LoginResult var27 = var45.amh.yx().getLoginResult();
            String[] var30 = null;
            if (var27.getVipget() != null) {
               String var46 = var27.getVipget();
               String var53 = "\u001c2";
               var30 = var46.split("&&");
            }

            ArrayList var33 = null;
            List var34 = this.amh.yt().z(11, var20.a);
            int var35 = 0;
            int var15 = var34 != null ? var34.size() : 0;

            for (int var47 = var35; var47 < var15; var47 = ++var35) {
               ChongjipackBean var16 = (ChongjipackBean)var34.get(var35);
               int var17;
               if ((var17 = Class71.abb(var30, 7, var16.getPackgradetype())) >= var16.getPointLvl().y) {
                  if (var33 == null) {
                     var33 = new ArrayList();
                  }

                  var33.add(var16);
               } else {
                  Class48 var18 = this.anr(var2);
                  var18.aje(2, var16, true, true, var17);
                  int var63 = var2 * 74;
                  var2++;
                  var18.setBounds(0, var63, 477, 70);
                  var18.setVisible(true);
                  var4 = var18.getY() + var18.getHeight();
               }
            }

            var35 = 0;
            var15 = var33 != null ? var33.size() : 0;

            for (var43 = var35; var43 < var15; var43 = var35) {
               ChongjipackBean var38 = (ChongjipackBean)var33.get(var35);
               Class48 var39 = this.anr(var2);
               var39.aje(2, var38, true, true, var38.getPointLvl().y);
               int var64 = var2 * 74;
               var2++;
               var39.setBounds(0, var64, 477, 70);
               var39.setVisible(true);
               var43 = var39.getY();
               var35++;
               var4 = var43 + var39.getHeight();
            }
         }

         if (var21 != null) {
            this.aye = var21;
            var43 = var2;
            this.t();
         } else {
            if (this.amh instanceof Class44) {
               ((Class44)this.amh).aha().setTextSize("", 498);
            }

            var43 = var2;
         }
      }

      int var19 = var43;

      for (int var50 = var19; var50 < this.qe.getComponentCount(); var50 = var19) {
         this.qe.getComponent(var19++).setVisible(false);
      }

      this.qe.setPreferredSize(new Dimension(var3, var4));
      this.l();
   }

   public void t() {
      if (this.aye != null) {
         int var1 = UseCardBean.getUseTime(this.aye.b);
         StringBuffer var2 = new StringBuffer();
         String var10002 = "7`7m洯劒既闎．仿剽";
         var2.append("#Z#W活动时间：仅剩");
         if (var1 > 1440) {
            String var10001 = "H\u001d";
            var2.append("#Y");
            var2.append(var1 / 1440);
            String var10003 = "7m夽";
            var2.append("#W天");
            var1 %= 1440;
         }

         if (var1 > 60) {
            String var4 = "H\u001d";
            var2.append("#Y");
            var2.append(var1 / 60);
            String var6 = "\u0019C尵既";
            var2.append("#W小时");
            var1 %= 60;
         }

         String var5 = "H\u001d";
         var2.append("#Y");
         var2.append(var1);
         String var7 = "\u0019C刼钋";
         var2.append("#W分钟");
         if (this.amh instanceof Class44 && ((Class44)this.amh).aha().isTextSize(var2.toString(), 498)) {
            RichLabel var3 = ((Class44)this.amh).aha();
            var3.setBounds(204 + (498 - var3.getWidth()) / 2, 120, var3.getWidth(), var3.getHeight());
         }
      }
   }

   public Class51(com.xy.q.Class30 var1) {
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.setBounds(0, 0, 745, 452);
      this.amh = var1;
      this.ayf = new com.xy.i.Class22[1];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ayf.length; var10000 = var2) {
         String var10007 = "\u0018'D!Du^|E4\u0005#";
         this.ayf[var2] = new com.xy.i.Class22("sc/e/158.png", 1, 3, var1);
         this.ayf[var2].setBounds(670, 57, 25, 25);
         this.add(this.ayf[var2++]);
      }

      this.au = new JLabel[3];

      for (int var5 = var2 = 0; var5 < this.au.length; var5 = var2) {
         String var13 = "\u0019w\u000f&\t \b!";
         this.au[var2] = com.xy.q.Class1.k(209, 156, 122, 22, com.xy.q.Class49.c("#c523425"), com.xy.q.Class49.ch);
         this.au[var2].setHorizontalAlignment(0);
         Class51 var6;
         if (var2 == 1) {
            var6 = this;
            this.au[var2].setBounds(331, 156, 252, 22);
         } else {
            if (var2 == 2) {
               this.au[var2].setBounds(583, 156, 99, 22);
            }

            var6 = this;
         }

         var6.add(this.au[var2++]);
      }

      this.qe = new Class47(this);
      this.cp = com.xy.q.Class1.g(208, 186, 487, 240, this.qe, 20);
      JScrollBar var10004 = this.cp.getVerticalScrollBar();
      String var14 = "\u0018'D Du[rE4\u0005#";
      var10004.setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/106.png", 3, 3, 3, 3, false), 8));
      this.add(this.cp);
      this.ar = new com.xy.w.Class18[2];

      for (int var7 = var2 = 0; var7 < this.ar.length; var7 = var2) {
         this.ar[var2] = new com.xy.w.Class18();
         Class51 var8;
         if (var2 == 0) {
            var8 = this;
            com.xy.w.Class18 var10 = this.ar[var2];
            String var10003 = "gY;^;\u0003 \u0014dTs";
            var10.dp("sc/d/94.png");
            this.ar[var2].setBounds(207, 155, 477, 28);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var10001 = this.ar[var2];
               String var11 = "\u0018'D Du[qE4\u0005#";
               var10001.mt(com.xy.w.Class16.m("sc/d/105.png", 2, 2, 2, 2, false));
               this.ar[var2].setBounds(688, 186, 6, 240);
            }

            var8 = this;
         }

         var8.add(this.ar[var2++]);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.amh.afx.dh()) {
         this.t();
      }

      super.paintComponent(var1);
   }
}
