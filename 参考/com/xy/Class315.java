package com.xy;

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
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class315 extends Class456 {
   private JScrollPane eb;
   private Class379[] aex;
   private JLabel[] iv;
   private JComponent id;
   private ActivityMenuSet2 aey;
   private Class436[] e;
   private Class223 aez;
   private Class345 pr;

   public void cc() {
      JScrollBar var1 = this.eb.getVerticalScrollBar();
      int var10001 = 3 ^ 3;
      var1.setMaximum(this.id.getHeight());
      var1.setValue(var10001);
   }

   public void ab(int var1) {
      int var9 = 2 & 5;
      int var12 = 3 ^ 3;
      int var4 = 3 & 4;
      this.aez = null;
      this.aey = null;
      int var10;
      int var10000;
      int var10005;
      int var10006;
      if (var1 == (85 & 63)) {
         this.iv[3 ^ 3].setText("目标等级");
         this.iv[--1].setText("预览");
         this.iv[5 >> 1].setText("完成状态");
         if (this.pr instanceof Class311) {
            ((Class311)this.pr).anv().setTextSize("", 21503 & 11762);
         }

         LoginResult var5 = this.pr.vd().getLoginResult();
         String[] var6 = null;
         if (var5.getVipget() != null) {
            var6 = var5.getVipget().split("&&");
         }

         ArrayList var7 = null;
         List var8 = this.pr.vc().bt(5 >> 2);
         int var2 = 2 & 5;
         var10 = var8 != null ? var8.size() : 0;

         ChongjipackBean var11;
         int var10002;
         int var10004;
         for(var10000 = var2; var10000 < var10; var10000 = var2) {
            var11 = (ChongjipackBean)var8.get(var2);
            boolean var3;
            int var13 = (var3 = Class224.j(var5.getGrade(), var11.getPackgrade())) && Class74.ib(var6, --4, var11.getPackgradetype()) ? 3 & 5 : 0;
            if (var13 != 0) {
               if (var7 == null) {
                  var7 = new ArrayList();
               }

               var7.add(var11);
            } else {
               Class100 var14 = this.vi(var9);
               var10002 = 2 ^ 3;
               var10004 = 2 & 5;
               var14.qe(2 ^ 3, var11, var3, (boolean)var13, 3 ^ 3);
               var10005 = var9 * (127 & 61);
               var10006 = 29181 & 4063;
               ++var9;
               var14.setBounds(var10004, var10005, var10006, 59 & 125);
               var14.setVisible((boolean)var10002);
               var4 = var14.getY() + var14.getHeight();
            }

            ++var2;
         }

         var2 = 3 ^ 3;
         var10 = var7 != null ? var7.size() : 0;

         for(var10000 = var2; var10000 < var10; var10000 = var2) {
            var11 = (ChongjipackBean)var7.get(var2);
            Class100 var16 = this.vi(var9);
            var10002 = --1;
            var10004 = 3 & 4;
            var16.qe(3 & 5, var11, (boolean)(3 & 5), (boolean)(3 & 5), 5 >> 3);
            var10005 = var9 * (63 & 125);
            var10006 = 9693 & 23551;
            ++var9;
            var16.setBounds(var10004, var10005, var10006, 61 & 123);
            var16.setVisible((boolean)var10002);
            var10000 = var16.getY();
            ++var2;
            var4 = var10000 + var16.getHeight();
         }

         var10000 = var9;
      } else {
         this.iv[5 >> 3].setText("礼包");
         this.iv[4 ^ 5].setText("预览");
         this.iv[5 >> 1].setText("售价");
         Class223 var21 = this.pr.vc().co(var1);
         Class223 var23 = null;
         if (var21 != null) {
            UseCardBean var24;
            List var15 = (var24 = this.pr.vd().getLimit("限时礼包")) != null ? var24.getKeysByActivity() : null;
            var10 = 5 >> 3;
            int var28 = var15 != null ? var15.size() : 0;
            var10000 = var10;

            Class315 var32;
            while(true) {
               if (var10000 >= var28) {
                  var32 = this;
                  break;
               }

               Class223 var17;
               if (Class394.r((var17 = (Class223)var15.get(var10)).a, var21.a)) {
                  var23 = var17;
                  var32 = this;
                  break;
               }

               ++var10;
               var10000 = var10;
            }

            LoginResult var27 = var32.pr.vd().getLoginResult();
            String[] var29 = null;
            if (var27.getVipget() != null) {
               var29 = var27.getVipget().split("&&");
            }

            ArrayList var19 = null;
            List var30 = this.pr.vc().bk(123 & 15, var21.a);
            int var31 = 0;
            var1 = var30 != null ? var30.size() : 0;

            ChongjipackBean var22;
            for(var10000 = var31; var10000 < var1; var10000 = var31) {
               var22 = (ChongjipackBean)var30.get(var31);
               int var25;
               if ((var25 = Class74.ia(var29, 7 & 127, var22.getPackgradetype())) >= var22.getPointLvl().y) {
                  if (var19 == null) {
                     var19 = new ArrayList();
                  }

                  var19.add(var22);
               } else {
                  Class100 var18 = this.vi(var9);
                  var18.qe(--2, var22, true, true, var25);
                  var10005 = var9 * (127 & 74);
                  var10006 = 28125 & 5119;
                  ++var9;
                  var18.setBounds(0, var10005, var10006, 127 & 70);
                  var18.setVisible(true);
                  var4 = var18.getY() + var18.getHeight();
               }

               ++var31;
            }

            var31 = 0;
            var1 = var19 != null ? var19.size() : 0;

            for(var10000 = var31; var10000 < var1; var10000 = var31) {
               var22 = (ChongjipackBean)var19.get(var31);
               Class100 var26 = this.vi(var9);
               var26.qe(1 ^ 3, var22, true, true, var22.getPointLvl().y);
               var10005 = var9 * (79 & 122);
               var10006 = 1023 & 32221;
               ++var9;
               var26.setBounds(0, var10005, var10006, 87 & 110);
               var26.setVisible(true);
               var10000 = var26.getY();
               ++var31;
               var4 = var10000 + var26.getHeight();
            }
         }

         if (var23 != null) {
            this.aez = var23;
            var10000 = var9;
            this.q();
         } else {
            if (this.pr instanceof Class311) {
               ((Class311)this.pr).anv().setTextSize("", 498);
            }

            var10000 = var9;
         }
      }

      int var20 = var10000;

      for(var10000 = var20; var10000 < this.id.getComponentCount(); var10000 = var20) {
         this.id.getComponent(var20++).setVisible(false);
      }

      this.id.setPreferredSize(new Dimension(var12, var4));
      this.cc();
   }

   public void cs(Activity var1, ActivityMenuSet2 var2) {
      int var10 = 3 >> 2;
      int var4 = 5 >> 3;
      int var5 = 2 & 5;
      this.aez = null;
      this.aey = var2;
      ArrayList var6 = null;
      Class603 var7 = this.pr.vc();
      RoleData var8;
      ActivityRole var9 = (var8 = this.pr.vd()).getActivity(var1.getId());
      FormulaNum var3;
      int var11;
      int var12;
      FormulaNum[] var13;
      int var14;
      int var15;
      int var16;
      int var10000;
      ActivityFC var17;
      int var10005;
      int var10006;
      int var22;
      ActivityFC var23;
      Class100 var26;
      if (var2.getId() == 5 >> 2) {
         this.iv[5 >> 3].setText("礼包");
         this.iv[4 ^ 5].setText("预览");
         this.iv[5 >> 1].setText("售价");
         var12 = (var13 = var2.getBases()).length;

         int var10002;
         int var10004;
         for(var10000 = var11 = 3 >> 2; var10000 < var12; var10000 = var11) {
            var3 = var13[var11];
            var14 = 5 >> 3;
            var15 = var3.getSize();

            for(var10000 = var14; var10000 < var15; var10000 = var14) {
               var16 = (int)var3.getZhi(var14);
               if ((var17 = var7.m(var16)) != null && var17.getType() == (4 ^ 5)) {
                  ActivityFCBuy var18 = (ActivityFCBuy)var17.getData();
                  int var19 = var9 != null ? (int)var9.getValueByKey(var16) : 0;
                  if (var18.getBuyMax() > 0 && var18.getBuyMax() <= var19) {
                     if (var6 == null) {
                        var6 = new ArrayList();
                     }

                     var6.add(var17);
                  } else {
                     Class100 var20 = this.vi(var10);
                     var10002 = --1;
                     var10004 = 2 & 5;
                     var20.qd(1 ^ 3, var1, var17, (boolean)(3 >> 2), (long)var19);
                     var10005 = var10 * (90 & 111);
                     var10006 = 991 & 32253;
                     ++var10;
                     var20.setBounds(var10004, var10005, var10006, 79 & 118);
                     var20.setVisible((boolean)var10002);
                     var5 = var20.getY() + var20.getHeight();
                  }
               }

               ++var14;
            }

            ++var11;
         }

         var22 = 3 & 4;
         var11 = var6 != null ? var6.size() : 0;

         for(var10000 = var22; var10000 < var11; var10000 = var22) {
            ActivityFCBuy var24 = (ActivityFCBuy)(var23 = (ActivityFC)var6.get(var22)).getData();
            var26 = this.vi(var10);
            var10002 = 2 ^ 3;
            var10004 = 2 & 5;
            var26.qd(1 ^ 3, var1, var23, (boolean)(5 >> 2), (long)var24.getBuyMax());
            var10005 = var10 * (111 & 90);
            var10006 = 1533 & 31711;
            ++var10;
            var26.setBounds(var10004, var10005, var10006, 110 & 87);
            var26.setVisible((boolean)var10002);
            var10000 = var26.getY();
            ++var22;
            var5 = var10000 + var26.getHeight();
         }

         var10000 = var10;
      } else {
         if (var2.getId() == --3 || var2.getId() == --4) {
            this.iv[2 & 5].setText("条件");
            this.iv[5 >> 2].setText("预览");
            this.iv[1 ^ 3].setText("完成状态");
            var12 = (var13 = var2.getBases()).length;
            var10000 = var11 = 3 & 4;

            label110:
            while(true) {
               if (var10000 >= var12) {
                  var22 = 0;
                  var11 = var6 != null ? var6.size() : 0;
                  var10000 = var22;

                  while(true) {
                     if (var10000 >= var11) {
                        break label110;
                     }

                     ActivityFCTarget var25 = (ActivityFCTarget)(var23 = (ActivityFC)var6.get(var22)).getData();
                     var26 = this.vi(var10);
                     var26.qd(--3, var1, var23, true, var25.getTarget().getNum());
                     var10005 = var10 * (90 & 111);
                     var10006 = 23039 & 10205;
                     ++var10;
                     var26.setBounds(0, var10005, var10006, 95 & 102);
                     var26.setVisible(true);
                     var10000 = var26.getY();
                     ++var22;
                     var5 = var10000 + var26.getHeight();
                     var10000 = var22;
                  }
               }

               var3 = var13[var11];
               var14 = 3 & 4;
               var15 = var3.getSize();

               for(var10000 = var14; var10000 < var15; var10000 = var14) {
                  var16 = (int)var3.getZhi(var14);
                  if ((var17 = var7.m(var16)) != null && var17.getType() == --2) {
                     long var28 = var9 != null ? var9.getValueByKey(var16) : 0L;
                     if (var28 > 0L) {
                        if (var6 == null) {
                           var6 = new ArrayList();
                        }

                        var6.add(var17);
                     } else {
                        ActivityFCTarget var29;
                        ActivityFCTarget var30;
                        if ((var30 = (ActivityFCTarget)var17.getData()).getTarget().getType() == 1) {
                           var28 = var9 != null ? var9.getValueByKey(var30.getTarget().getId()) : 0L;
                           var29 = var30;
                        } else if (var30.getTarget().getType() == 5 >> 1) {
                           RoleTaskData var10001 = var8.getTaskSystem();
                           var29 = var30;
                           var28 = (long)var10001.d(var30.getTarget().getId(), 1 ^ 3);
                        } else {
                           var28 = 0L;
                           var29 = var30;
                        }

                        var28 = Math.min(var29.getTarget().getNum(), var28);
                        Class100 var21 = this.vi(var10);
                        var21.qd(--3, var1, var17, false, var28);
                        var10005 = var10 * (127 & 74);
                        var10006 = 26591 & 6653;
                        ++var10;
                        var21.setBounds(0, var10005, var10006, 70 & 127);
                        var21.setVisible(true);
                        var5 = var21.getY() + var21.getHeight();
                     }
                  }

                  ++var14;
               }

               ++var11;
               var10000 = var11;
            }
         }

         var10000 = var10;
      }

      var22 = var10000;

      for(var10000 = var22; var10000 < this.id.getComponentCount(); var10000 = var22) {
         this.id.getComponent(var22++).setVisible(false);
      }

      this.id.setPreferredSize(new Dimension(var4, var5));
      this.cc();
   }

   public void q() {
      if (this.aez != null) {
         int var1 = UseCardBean.getUseTime(this.aez.b);
         StringBuffer var2 = new StringBuffer();
         var2.append("#Z#W活动时间：仅剩");
         if (var1 > (21949 & 12258)) {
            var2.append("#Y");
            var2.append(var1 / (24051 & 10156));
            var2.append("#W天");
            var1 %= 10169 & 24038;
         }

         if (var1 > (62 & 125)) {
            var2.append("#Y");
            var2.append(var1 / (124 & 63));
            var2.append("#W小时");
            var1 %= 62 & 125;
         }

         var2.append("#Y");
         var2.append(var1);
         var2.append("#W分钟");
         if (this.pr instanceof Class311 && ((Class311)this.pr).anv().isTextSize(var2.toString(), 4086 & 29179)) {
            RichLabel var3 = ((Class311)this.pr).anv();
            var3.setBounds((14029 & 18942) + ((9722 & 23543) - var3.getWidth()) / --2, 124 & 123, var3.getWidth(), var3.getHeight());
         }
      }

   }

   public Class100 vi(int var1) {
      if (var1 < this.id.getComponentCount()) {
         return (Class100)this.id.getComponent(var1);
      } else {
         Class100 var2 = new Class100(this.pr);
         this.id.add(var2);
         return var2;
      }
   }

   public Class315(Class345 var1) {
      int var10001 = --1;
      int var10005 = 5 >> 3;
      super();
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.setBounds(var10005, 3 >> 2, 4093 & 29419, 13807 & 19412);
      this.pr = var1;
      Class379[] var4 = new Class379[var10001];
      boolean var10003 = true;
      this.aex = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.aex.length; var10000 = var2) {
         this.aex[var2] = new Class379("sc/e/158.png", 4 ^ 5, --3, var1);
         this.aex[var2].setBounds(12990 & 20447, 61 & 123, 127 & 25, 127 & 25);
         this.add(this.aex[var2++]);
      }

      JLabel[] var5 = new JLabel[--3];
      var10003 = true;
      this.iv = var5;

      Class315 var3;
      for(var10000 = var2 = 2 & 5; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.b(32763 & 213, 28092 & 4831, 126 & 123, 31 & 118, Class681.c("#c523425"), Class681.ak);
         this.iv[var2].setHorizontalAlignment(5 >> 3);
         if (var2 == --1) {
            var3 = this;
            this.iv[var2].setBounds(9691 & 23407, 14079 & 18844, 26110 & 6909, 31 & 118);
         } else {
            if (var2 == (1 ^ 3)) {
               this.iv[var2].setBounds(14279 & 19071, 3228 & 29695, 99 & 127, 22);
            }

            var3 = this;
         }

         var3.add(this.iv[var2++]);
      }

      var10001 = 5 >> 1;
      this.id = new JComponent() {
      };
      this.eb = Class133.f(208, 186, 487, 240, this.id, 20);
      this.eb.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/106.png", --3, --3, --3, --3, (boolean)(5 >> 3)), 8));
      this.add(this.eb);
      Class436[] var6 = new Class436[var10001];
      var10003 = true;
      this.e = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.e[var2].fw("sc/d/94.png");
            this.e[var2].setBounds(207, 155, 477, 28);
         } else {
            if (var2 == (3 & 5)) {
               this.e[var2].eq(Class511.q("sc/d/105.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
               this.e[var2].setBounds(688, 186, 6, 240);
            }

            var3 = this;
         }

         var3.add(this.e[var2++]);
      }

   }

   protected void paintComponent(Graphics var1) {
      if (this.pr.aej.bl()) {
         this.q();
      }

      super.paintComponent(var1);
   }
}
