package com.xy.a.w;

import com.xy.a.Class48;
import com.xy.formula.SkillUtil;
import com.xy.q.Class49;
import com.xy.readbean.Skill;
import com.xy.readbean.TYCModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import javax.swing.JLabel;

class Class2 extends com.xy.w.Class18 implements MouseListener {
   private boolean bv;
   private boolean _do;
   // $VF: synthetic field
   final Class20 dp;
   private TYCModel dq;
   private boolean dr;
   private int ds;
   private JLabel di;
   private int ah;

   // $VF: synthetic method
   static int cu(Class2 var0) {
      return var0.ds;
   }

   public void c() {
      JLabel var10001 = this.di;
      StringBuilder var10002 = new StringBuilder(String.valueOf(this.ah));
      String var10003 = "H}";
      var10001.setText(var10002.append("/5").toString());
      if (!this.bv && this.ah == 0) {
         this.di.setVisible(false);
         this.t();
      } else {
         Class2 var10000;
         if (this.bv) {
            this.di.setForeground(this.ah == this.ds ? Color.yellow : Color.green);
            var10000 = this;
         } else {
            this.di.setForeground(this.ah == 5 ? Color.yellow : Color.red);
            var10000 = this;
         }

         String var1 = "# \u007f \u007frep";
         var10000.dq("sc/c/153");
         this.di.setVisible(true);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.f();
      if (this.bv || this.ah > 0) {
         this._do = Boolean.TRUE;
      }
   }

   public void e() {
      this.l();
      this.t();
   }

   // $VF: synthetic method
   static void cv(Class2 var0, boolean var1) {
      var0.bv = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.be(Boolean.FALSE);
      this._do = Boolean.FALSE;
      this.dp.zc().f(46);
   }

   public void cw(MouseEvent var1) {
      if (var1.getButton() == 1) {
         if (this.ah < 5) {
            this.dp.cv(this, true);
            return;
         }
      } else if (var1.getButton() == 3 && this.ah > 0) {
         this.dp.cv(this, false);
      }
   }

   // $VF: synthetic method
   static void cx(Class2 var0, int var1) {
      var0.ds = var1;
   }

   // $VF: synthetic method
   static int cy(Class2 var0) {
      return var0.ah;
   }

   public void be(boolean var1) {
      if (this.dr != var1) {
         this.dr = var1;
         this.setBounds(this.getX() + (var1 ? 1 : -1), this.getY() + (var1 ? 1 : -1), this.getWidth(), this.getHeight());
      }
   }

   public void n(int var1) {
      this.ah = var1;
   }

   public Class2(Class20 var1) {
      this.dp = var1;
      this.di = new JLabel();
      this.di.setOpaque(true);
      this.di.setBackground(Color.BLACK);
      this.di.setFont(Class49.bm);
      this.di.setHorizontalAlignment(0);
      this.di.setBounds(1, 24, 24, 13);
      this.add(this.di);
      this.addMouseListener(this);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.bv || this.ah > 0) {
         this.be(Boolean.TRUE);
         if (this._do) {
            this.cw(var1);
         }
      }
   }

   // $VF: synthetic method
   static TYCModel cz(Class2 var0) {
      return var0.dq;
   }

   public void f() {
      Skill var1 = this.dq.getSkill(this.dp.yt());
      StringBuffer var2 = new StringBuffer();
      if (var1 != null) {
         String var10001 = "D\u001fぷ笁绀す";
         var2.append("#W【等级】");
         var2.append(this.ah);
         String var10004 = "\u007fvs1\u3040壀甜げ";
         var2.append("/5#r【境界】");
         var2.append(this.dq.getLvl());
         String var10006 = "D:ぷ礖儤す";
         var2.append("#r【神元】");
         Class2 var10000;
         if (this.dq.getType() == 0) {
            var10000 = this;
            String var10002 = "遊畫";
            var2.append("通用");
         } else if (this.dq.getType() == 1) {
            var10000 = this;
            String var7 = "乴杁";
            var2.append("专有");
         } else {
            if (this.dq.getType() == 2) {
               var10001 = "蟝呋";
               var2.append("融合");
            }

            var10000 = this;
         }

         if (var10000.ah > 0) {
            this.db(this.ah, var1, var2);
         }

         if (this.ah < 5) {
            var10001 = "D:D\u001f乬么笮绯";
            var2.append("#r#W下一等级");
            this.db(this.ah + 1, var1, var2);
            if (!this.bv) {
               this.dc(var2);
            }
         }
      }

      Class48 var3 = (Class48)this.dp.zc().j(46);
      String var6;
      StringBuffer var8;
      if (var1 != null) {
         var6 = var1.getSkillname();
         var8 = var2;
      } else {
         var6 = "";
         var8 = var2;
      }

      var3.es(var6, var8.toString());
   }

   public void da(TYCModel var1) {
      this.ds = 0;
      this.dq = var1;
      Class2 var10000;
      if (var1 != null) {
         var10000 = this;
         this.h();
      } else {
         var10000 = this;
         this.e();
      }

      var10000.setVisible(var1 != null);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.bv || this.ah > 0) {
         this.be(Boolean.FALSE);
      }
   }

   public void db(int var1, Skill var2, StringBuffer var3) {
      String var10001 = "s1s\u0004";
      var3.append("#r#G");
      SkillUtil.e(var3, var2.getRemark(), var2, var1);
   }

   public void h() {
      this.ah = 0;
      this.bv = this.dq.getType() == 0 && this.ah != 5;
      this.gt(com.xy.w.Class15.i(this.dq.getSkillId()));
      this.c();
   }

   public void dc(StringBuffer var1) {
      if (this.dq.getType() == 1) {
         int var2 = this.dq.getLvl() == 1 ? 20 : 5;
         int var3;
         if ((var3 = this.dp.ur(0, this.dq.getKey(), this.dq.getLvl() - 1, null)) < var2) {
            String var10002 = "k\u0015k5刅缉卲垸`";
            var1.append("#r#R前置区域(");
            StringBuffer var10000;
            if (this.dq.getLvl() != 1) {
               var1.append(SkillUtil.getSmKey(this.dq.getKey()));
               var10000 = var1;
               String var10003 = "粸壓甏";
               var1.append("系境界");
            } else {
               var10000 = var1;
               var10002 = "遽畠壤甄";
               var1.append("通用境界");
            }

            var10000.append(this.dq.getLvl() - 1);
            var10002 = "j九跰";
            var1.append(")不足");
            var1.append(var2);
            String var10004 = "烱";
            var1.append("点");
         }

         if (this.dq.getLvl() == 5) {
            var2 = this.ah == 0 ? 20 : (this.ah == 0 ? 25 : (this.ah == 0 ? 30 : (this.ah == 0 ? 35 : 39)));
            if ((var3 = this.dp.ur(1, this.dq.getKey(), 0, null)) < var2) {
               String var10001 = "s1s\u0011靐观";
               var1.append("#r#R需要");
               var1.append(SkillUtil.getSmKey(this.dq.getKey()));
               String var28 = "粳";
               var1.append("系");
               var1.append(var2);
               String var10005 = "烩恸烩攳";
               var1.append("点总点数");
            }
         }

         if (this.dq.getLvl() == 5 && var3 >= var2 || this.dq.getLvl() == 6) {
            var2 = this.dq.getLvl() == 5 ? (this.dp.ur(0, this.dq.getKey() == this.dp.aa ? this.dp.zz : this.dp.aa, 5, null) > 0 ? 119 : 0) : 80;
            if (this.dp.ur(2, 0, 0, null) < var2) {
               String var20 = "D:D\u001a靧觉";
               var1.append("#r#R需要");
               var1.append(var2);
               String var29 = "烩恸烩攳";
               var1.append("点总点数");
            }
         }

         if (this.dq.getLvl() == 5) {
            Iterator var5;
            Iterator var16 = var5 = Class20.um(this.dp).iterator();

            while (var16.hasNext()) {
               Class2 var4;
               if ((var4 = (Class2)var5.next()).dq != null && var4 != this) {
                  if (!this.dq.a(var4.dq)) {
                     var16 = var5;
                     continue;
                  }

                  String var21 = "k\u0015k5乆D\u0011";
                  var1.append("#r#R与#Y");
                  var1.append(var4.dq.getSkillName(this.dp.yt()));
                  String var30 = "s\u0011仂旦";
                  var1.append("#R互斥");
               }

               var16 = var5;
            }
         }

         if (this.dq.getLvl() == 6) {
            byte var8 = 5;
            Class2 var11 = null;
            Iterator var6;
            Iterator var17 = var6 = Class20.um(this.dp).iterator();

            Class2 var18;
            while (true) {
               if (!var17.hasNext()) {
                  var18 = var11;
                  break;
               }

               Class2 var13;
               if ((var13 = (Class2)var6.next()).dq == null) {
                  var17 = var6;
               } else if (var13.dq.getType() != this.dq.getType()) {
                  var17 = var6;
               } else if (var13.dq.getKey() != this.dq.getKey()) {
                  var17 = var6;
               } else if (var13.dq.getLvl() + 1 != this.dq.getLvl()) {
                  var17 = var6;
               } else {
                  if (var13.dq.getIndex() == this.dq.getIndex()) {
                     var18 = var11 = var13;
                     break;
                  }

                  var17 = var6;
               }
            }

            if (var18 != null && var11.ah < var8) {
               String var22 = "D:D\u001a靧觉";
               var1.append("#r#R需要");
               var1.append(var8);
               String var31 = "烺s\u001a";
               var1.append("点#Y");
               var1.append(var11.dq.getSkillName(this.dp.yt()));
               return;
            }
         }
      } else if (this.dq.getType() == 2) {
         byte var9 = 5;
         int var10 = this.dp.ur(0, this.dp.aa, this.dq.getLvl(), null);
         int var12 = this.dp.ur(0, this.dp.zz, this.dq.getLvl(), null);
         if (var10 < var9 || var12 < var9) {
            String var32 = "k\u0015k5刅缉卲垸`";
            var1.append("#r#R前置区域(");
            var1.append(SkillUtil.getSmKey(var10 < var9 ? this.dp.aa : this.dp.zz));
            String var27 = "粸壓甏";
            var1.append("系境界");
            var1.append(this.dq.getLvl());
            if (var10 < var9 && var12 < var9) {
               String var23 = "哄";
               var1.append("和");
               var1.append(SkillUtil.getSmKey(this.dp.zz));
               var32 = "粸壓甏";
               var1.append("系境界");
               var1.append(this.dq.getLvl());
               String var35 = "a乪跻";
               var1.append(")不足");
               var1.append(var9);
               String var10007 = "烺";
               var1.append("点");
            }
         }

         Iterator var15;
         Iterator var19 = var15 = Class20.um(this.dp).iterator();

         while (var19.hasNext()) {
            Class2 var14;
            if ((var14 = (Class2)var15.next()).dq != null && var14 != this) {
               if (!this.dq.a(var14.dq)) {
                  var19 = var15;
                  continue;
               }

               String var24 = "k\u0015k5乆D\u0011";
               var1.append("#r#R与#Y");
               var1.append(var14.dq.getSkillName(this.dp.yt()));
               String var34 = "s\u0011仂旦";
               var1.append("#R互斥");
            }

            var19 = var15;
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      var1.setColor(Color.BLACK);
      var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      super.paintComponent(var1);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}
