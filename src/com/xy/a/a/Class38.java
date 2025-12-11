package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.AllPal;
import com.xy.readbean.PalData;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class38 extends com.xy.q.Class30 {
   public int gy;
   public Class8 akc;
   public Class13 akd;
   private JScrollPane rf;
   private JLabel bd;
   private static Image g;
   public Class15 ake;
   private int ae;
   private com.xy.i.Class4[] ly;
   private JComponent qe;
   private com.xy.w.Class18[] cl;

   public int ach(BigDecimal var1, String[] var2) {
      if (var1 == null) {
         return -1;
      } else if (var2 == null) {
         return 0;
      } else {
         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            if (var1.toString().equals(var2[var3])) {
               return var3 + 1;
            }
         }

         return 0;
      }
   }

   public void e() {
      String var2 = com.xy.v.Class4.h(this.yx().getLoginResult().getGrade());
      String var3 = new StringBuilder(String.valueOf(var2)).append("级").toString();
      int var4 = this.qe.getComponentCount();
      int var5 = 0;
      int var6 = this.qe.getComponentCount();

      for (int var10000 = var5; var10000 < var6; var10000 = var5) {
         Class45 var7 = (Class45)this.qe.getComponent(var5);
         var5++;
         Class45.afc(var7).setText(var3);
      }

      if (this.gy != 0) {
         Class13.jv(this.akd)[2].setText(var3);
      }
   }

   public void bi(int var1) {
      int var10000 = 0;
      this.ae = var1;

      for (int var2 = 0; var10000 < this.ly.length; var10000 = ++var2) {
         this.ly[var2].setKeep(var2 == this.ae);
      }

      this.akd.setVisible(this.ae == 0);
      this.ake.setVisible(this.ae == 1);
      this.akc.setVisible(this.ae == 2);
   }

   public int aci(BigDecimal var1, String var2) {
      String[] var10002;
      if (var2 != null && !var2.equals("")) {
         String var10003 = "x$";
         var10002 = var2.split("\\|");
      } else {
         var10002 = null;
      }

      return this.ach(var1, var10002);
   }

   public synchronized void f() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         LoginResult var2;
         LoginResult var10000 = var2 = var1.getLoginResult();
         String var3 = com.xy.v.Class4.h(var10000.getGrade());
         String[] var20;
         if (var10000.getPals() != null && !var2.getPals().equals("")) {
            String var21 = var2.getPals();
            String var10001 = "|9";
            var20 = var21.split("\\|");
         } else {
            var20 = null;
         }

         String[] var4 = var20;
         AllPal var5 = this.yt().bf();
         ArrayList var6 = new ArrayList();
         int var7 = 0;
         int var8 = this.qe.getComponentCount();
         Iterator var10;
         Iterator var22 = var10 = var5.getAllPalData().values().iterator();

         label88:
         while (var22.hasNext()) {
            PalData var9 = (PalData)var10.next();
            Object var11 = null;
            Class45 var23;
            if (var7 < var8) {
               var23 = (Class45)(var11 = this.qe.getComponent(var7));
            } else {
               var11 = new Class45(this);
               var23 = (Class45)var11;
               this.qe.add((Component)var11);
            }

            Pal var10002 = var1.getPal(var9.getPalId());
            var7++;
            var23.afa(var9, var10002, var4, var3);

            int var12;
            for (int var24 = var12 = 0; var24 < var6.size(); var24 = ++var12) {
               int var13 = Class45.afb((Class45)var6.get(var12));
               int var14 = Class45.afe((Class45)var6.get(var12));
               if (Class45.afb((Class45)var11) == -1
                  ? var13 == -1 && Class45.afe((Class45)var11) < var14
                  : (
                     Class45.afb((Class45)var11) == 0
                        ? var13 <= 0 && (var13 == -1 || Class45.afe((Class45)var11) < var14)
                        : (var13 <= 0 || Class45.afb((Class45)var11) < var13) && (var13 > 0 || Class45.afb((Class45)var11) > var13)
                  )) {
                  var6.add(var12, var11);
                  var22 = var10;
                  continue label88;
               }
            }

            var22 = var10;
            var6.add(var11);
         }

         int var15;
         for (int var25 = var15 = 0; var25 < var6.size(); var25 = var15) {
            Class45 var17 = (Class45)var6.get(var15);
            int var10004 = var15 * 50;
            var15++;
            var17.setBounds(0, var10004, 137, 50);
            var17.setVisible(true);
         }

         var15 = var6.size();
         int var18 = this.qe.getComponentCount();

         for (int var26 = var15; var26 < var18; var26 = var15) {
            Class45 var27 = (Class45)this.qe.getComponent(var15);
            var15++;
            var27.setVisible(false);
         }

         this.qe.setPreferredSize(new Dimension(137, 50 * var6.size()));
      }
   }

   // $VF: synthetic method
   static Image gu() {
      return g;
   }

   @Override
   public void l() {
      this.f();
      RoleData var1;
      Class38 var10000;
      if ((var1 = this.yx()) != null && var1.getChosePal() != null) {
         var10000 = this;
         this.g(var1.getChosePal().getpId());
      } else {
         if (this.qe.getComponentCount() != 0) {
            Class45 var2 = (Class45)this.qe.getComponent(0);
            this.g(Class45.afe(var2));
         }

         var10000 = this;
      }

      var10000.bi(0);
      super.l();
   }

   @Override
   public boolean ah() {
      this.akd.mw = null;
      return super.ah();
   }

   public void y(int var1) {
      if (var1 == 123) {
         String var19 = Class13.ju(this.akd)[0].getText();
         if (var19.equals("激活")) {
            this.h();
         } else {
            Pal var11;
            if ((var11 = this.yx().getPal(this.gy)) != null) {
               if (!this.akd.ah()) {
                  String var12 = this.yx().getLoginResult().getPals();
                  int var13;
                  if ((var13 = this.aci(var11.getId(), var12)) != -1) {
                     int var14 = 0;

                     int var15;
                     for (int var20 = var15 = 0; var20 < 5; var20 = ++var15) {
                        if (var13 != var15) {
                           if (var15 == 0) {
                              com.xy.i.Class4[] var21 = Class13.ju(this.akd);
                              int var30 = 2 + var14;
                              var14++;
                              var21[var30].setText("休息");
                           } else {
                              com.xy.i.Class4[] var23 = Class13.ju(this.akd);
                              int var32 = 2 + var14;
                              var14++;
                              var23[var32].setText(BaseValue.getPalBtnArrStr(var15 - 1));
                           }
                        }
                     }

                     this.akd.be(true);
                  }
               }
            }
         }
      } else if (var1 == 124) {
         Pal var10;
         if ((var10 = this.yx().getPal(this.gy)) == null) {
            this.afx.dp("你还没有激活当前伙伴");
         } else {
            ((com.xy.a.w.Class25)this.zc().j(8)).abn(PropertyUtil.getPalQl(var10, this.yx()), 2, var10.getId());
         }
      } else if (var1 >= 125 && var1 <= 128) {
         Pal var2;
         if ((var2 = this.yx().getPal(this.gy)) != null) {
            String var3;
            String[] var10000;
            if ((var3 = this.yx().getLoginResult().getPals()) != null && !var3.equals("")) {
               String var10001 = "|9";
               var10000 = var3.split("\\|");
            } else {
               var10000 = null;
            }

            String[] var4 = var10000;
            int var5 = BaseValue.getPalBtnArrStr(Class13.ju(this.akd)[2 + var1 - 125].getText());
            boolean var6 = true;
            int var7 = 1;
            StringBuffer var8 = new StringBuffer();
            int var9;
            if (var4 != null) {
               for (int var17 = var9 = 0; var17 < var4.length; var17 = ++var9) {
                  if (!var4[var9].equals(var2.getId().toString())) {
                     if (var7++ == var5) {
                        var6 = false;
                        if (var8.length() != 0) {
                           var8.append("|");
                        }

                        var8.append(var2.getId());
                        if (var4.length == 4) {
                           continue;
                        }
                     }

                     if (var8.length() != 0) {
                        var8.append("|");
                     }

                     var8.append(var4[var9]);
                  }
               }
            }

            if (var6 && var5 > 0) {
               if (var8.length() != 0) {
                  var8.append("|");
               }

               var8.append(var2.getId());
            }

            this.yx().getLoginResult().setPals(var8.toString());
            StringBuilder var27 = new StringBuilder("P").append(var2.getId());
            String var16 = Agreement.getSendTextAES("userpal", var27.append("|").append(var5 == 0 ? -1 : var5 - 1).toString());
            this.za().k(var16);
            this.akd.ah();
            this.f();
            this.akd.n(var5);
         }
      } else {
         if (var1 == 130) {
            com.xy.i.Class0.ff(2, this.afx);
         }
      }
   }

   // $VF: synthetic method
   static void gt(Image var0) {
      g = var0;
   }

   public void h() {
      PalData var1;
      if ((var1 = this.yt().bj(this.gy)) == null) {
         this.afx.dp("请先选中一个伙伴");
      } else {
         StringBuffer var3;
         Class38 var10000;
         label31: {
            String var2 = var1.getXh();
            var3 = new StringBuffer();
            var3.append("#W确定要激活#G");
            var3.append(var1.getName());
            if (var2 != null && !"".equals(var2)) {
               var3.append("#W吗?消耗:#R");
               var3.append(var2.substring(1, var2.length()));
               if (var2.startsWith("D")) {
                  var10000 = this;
                  var3.append("大话币#W。");
                  break label31;
               }

               if (var2.startsWith("X")) {
                  var10000 = this;
                  var3.append("仙玉#W。");
                  break label31;
               }
            } else {
               var3.append("吗?消耗:#R无消耗#W。");
            }

            var10000 = this;
         }

         var10000.afx.dm(new ConfirmBean(23, String.valueOf(this.gy), var3.toString()));
      }
   }

   public Class38(GameView var1) {
      super(105, 2, com.xy.q.Class30.afz, var1);
      this.gy = -1;
      this.yy(-1, 0, 563, 383, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "伙伴系统");
      this.ly = new com.xy.i.Class4[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ly.length; var10000 = var2) {
         String var16;
         if (var2 == 0) {
            var16 = "队伍";
         } else if (var2 == 1) {
            var16 = "技能";
         } else if (var2 == 2) {
            var16 = "装备";
         } else {
            var16 = "";
         }

         this.ly[var2] = new com.xy.i.Class4("sc/e/38.png", 2, 120 + var2, com.xy.q.Class49.bx, com.xy.q.Class49.bv, var16, this);
         this.ly[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.ly[var2].setBounds(214 + 82 * var2, 25, 79, 33);
         this.add(this.ly[var2++]);
      }

      this.bd = com.xy.q.Class1.k(46, 31, 155, 21, Color.white, com.xy.q.Class49.ch);
      this.bd.setHorizontalAlignment(0);
      this.bd.setText("伙伴列表");
      this.add(this.bd);
      this.qe = new Class21(this);
      this.rf = com.xy.q.Class1.g(49, 51, 153, 310, this.qe, 20);
      this.add(this.rf);
      this.akd = new Class13(this);
      this.ake = new Class15(this);
      this.akc = new Class8(this);
      this.akd.setBounds(0, 0, 563, 383);
      this.ake.setBounds(0, 0, 563, 383);
      this.akc.setBounds(0, 0, 563, 383);
      this.add(this.akd);
      this.add(this.ake);
      this.add(this.akc);
      this.cl = new com.xy.w.Class18[3];

      for (int var5 = var2 = 0; var5 < this.cl.length; var5 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         Class38 var6;
         if (var2 == 0) {
            var6 = this;
            com.xy.w.Class18 var8 = this.cl[var2];
            var10003 = "6CjDj\u0013p\u000e5N\"";
            var8.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
            this.cl[var2].setBounds(188, 39, 359, 20);
         } else if (var2 == 1) {
            var6 = this;
            com.xy.w.Class18 var9 = this.cl[var2];
            var10003 = "+Gw@w\u0016m\n(J?";
            var9.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(46, 31, 155, 21);
         } else {
            if (var2 == 2) {
               com.xy.w.Class18 var10001 = this.cl[var2];
               String var10 = "6CjDj\u0012q\u000e5N\"";
               var10001.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.cl[var2].setBounds(46, 31, 155, 330);
            }

            var6 = this;
         }

         var6.add(this.cl[var2++]);
      }
   }

   public synchronized void g(int var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         this.gy = var1;
         PalData var3 = this.yt().bj(var1);
         Pal var4;
         var2.setChosePalId((var4 = var2.getPal(var1)) != null ? var4.getId() : null);
         this.akd.fn(var4, var3);
         this.ake.fn(var4, var3);
         this.akc.fn(var4, var3);
      }
   }
}
