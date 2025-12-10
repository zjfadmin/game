package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.formula.MsgUntil;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class274 extends Class456 {
   private JLabel[] fb;
   private Class195 awr;
   private <undefinedtype>[] aws;
   private JScrollPane mv;
   private Class436[] pv;
   private int j;
   private RichLabel bw;
   private RichLabel acv;
   private JScrollPane af;

   public Class274(Class195 var1) {
      int var10001 = --2;
      super();
      this.awr = var1;
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.fb = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 < this.fb.length; var10000 = var2) {
         this.fb[var2] = Class133.b((27979 & 5116) + (15613 & 17383) * var2, 25861 & 7166, 76 & 127, 51 & 95, Class681.c("#cCCC09F"), Class681.cm);
         this.fb[var2].setText(var2 == 0 ? "等级属性" : (var2 == 5 >> 2 ? "加成总览" : ""));
         this.fb[var2].setHorizontalAlignment(2 & 5);
         this.add(this.fb[var2++]);
      }

      var10001 = 1 ^ 3;
      int var10007 = 7167 & 26100;
      int var10009 = 17358 & 15679;
      this.bw = new RichLabel("", Class681.q);
      this.acv = new RichLabel("", Class681.q);
      this.af = Class133.f(var10009, 31001 & 2047, 2525 & 30447, 7667 & 25228, this.bw, -4 >> 2);
      this.mv = Class133.f(var10007, 7545 & 25503, 18941 & 14031, 27377 & 5518, this.acv, -4 >> 2);
      this.af.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/168.png", --3, --3, --3, --3, (boolean)(3 ^ 3)), 22 & 111));
      this.mv.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/168.png", --3, --3, --3, --3, (boolean)(5 >> 3)), 79 & 54));
      this.add(this.af);
      this.add(this.mv);
      <undefinedtype>[] var5 = new <undefinedtype>[var10001];
      var10003 = true;
      this.aws = var5;

      Class274 var3;
      for(var10000 = var2 = 2 & 5; var10000 < this.aws.length; var10000 = var2) {
         this.aws[var2] = new Class456(var2) {
            private Class436 et;
            private Class436 uc;
            private Class436 r;
            private JLabel ir;
            private Class44 ae;
            private int m;

            public {
               int var10005 = 3 ^ 3;
               this.m = var2;
               this.ae = new Class44(Class274.this.awr) {
                  public void af(MouseEvent var1) {
                     af(var1);
                  }
               };
               this.ae.ad(Class44.arr);
               this.ae.setBounds(31 & 124, 3 & 4, 62 & 125, 62 & 125);
               this.ir = Class133.b(var10005, 127 & 60, 123 & 119, 55 & 94, Color.white, Class681.q);
               this.ir.setHorizontalAlignment(3 & 4);
               this.uc = new Class436("sc/d/163.png");
               this.uc.setBounds(27 & 110, 127 & 60, 127 & 95, 62 & 87);
               this.et = new Class436(var2 == 0 ? "sc/d/170.png" : "sc/d/171.png");
               this.et.setBounds(126 & 47, 121 & 87, 93 & 63, 33 & 126);
               this.add(this.ae);
               this.add(this.ir);
               this.add(this.uc);
               this.add(this.et);
               this.r = new Class436();
               if (var2 == 0) {
                  this.r.setBounds(27967 & 5087, 86 & 111, 30131 & 2796, 30131 & 2796);
               } else {
                  this.r.setBounds(508, 70, 160, 160);
               }
            }

            public void af(MouseEvent var1) {
               RoleData var5;
               BaseMountSH var2 = (var5 = Class274.this.awr.vd()).getMountSHByindex(Class274.this.j);
               if (this.m < var2.getUnlock()) {
                  int var6 = this.m == 0 ? var2.getPoint().x : var2.getPoint().y;
                  if (var6 > 0) {
                     Class274.this.awr.aej.aal(new ConfirmBean(39 & 120, "SHGZ0|" + Class274.this.j + "|" + this.m, "#W确定将该坐骑移出守护槽？"));
                  } else {
                     ((Class99)Class274.this.awr.ve().e(25517 & 7423)).cf(Class274.this.j, this.m);
                  }
               } else {
                  Goodstable var3;
                  if ((var3 = var5.az(107L)) == null) {
                     Class274.this.awr.aej.f("没有足够的灵元晶");
                  } else {
                     String var4 = Agreement.getSendTextAES("usermount", "SHUN" + Class274.this.j + "|" + var3.getRgid());
                     var5.getGameView().getClient().d(var4);
                  }
               }
            }

            public void lc(boolean var1, BaseMountSH var2, RoleData var3) {
               if (var1) {
                  int var4 = this.m == 0 ? var2.getPoint().x : var2.getPoint().y;
                  this.r.fw("sc/d/172.png");
                  this.ae.fw("sc/d/160.png");
                  if (var4 > 0) {
                     Mount var5 = var3.getMount(var4);
                     this.ae.ach(Class222.d(var3.getLoginResult().getRace_id().intValue(), var4));
                     this.ir.setForeground(Class681.c("#cCEB987"));
                     this.ir.setText(var5 != null ? var5.getMountname() : MsgUntil.b(var4) + "坐骑");
                  } else {
                     this.ae.cc();
                     this.ir.setText((String)null);
                  }
               } else {
                  this.r.fw("sc/d/173.png");
                  this.ae.fw("sc/d/161.png");
                  this.ae.cc();
                  this.ir.setForeground(Class681.c("#c959595"));
                  this.ir.setText("16级可解锁");
               }
            }
         };
         if (var2 == 0) {
            var3 = this;
            this.aws[var2].setBounds(28159 & 4918, 121, 115, 115);
         } else {
            if (var2 == (2 ^ 3)) {
               this.aws[var2].setBounds(531, 121, 115, 115);
            }

            var3 = this;
         }

         var3.add(this.aws[var2]);
         this.add(this.aws[var2++].r);
      }

      Class436[] var6 = new Class436[--4];
      var10003 = true;
      this.pv = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.pv.length; var10000 = var2) {
         this.pv[var2] = new Class436();
         if (var2 >= 0 && var2 <= --1) {
            var3 = this;
            this.pv[var2].fw("sc/d/167.png");
            this.pv[var2].setBounds(264 + var2 * 229, 267, 195, --5);
         } else {
            if (var2 >= --2 && var2 <= --3) {
               this.pv[var2].fw("sc/d/164.png");
               this.pv[var2].setBounds(259 + 229 * (var2 - --2), 255, 220, 172);
            }

            var3 = this;
         }

         var3.add(this.pv[var2++]);
      }

      this.setBounds(2 & 5, 2 & 5, 743, 519);
   }

   public void aly(int var1, RoleData var2) {
      this.j = var1;
      StringBuffer var3 = new StringBuffer();
      PropertyUtil.getMountSHSXString(var1, var2, var3, (boolean)(5 >> 3));
      this.bw.setTextSize(var3.toString(), 7898 & 25069);
      this.af.getVerticalScrollBar().setMaximum(this.bw.getHeight());
      this.af.getVerticalScrollBar().setValue((5 >> 1) + (51 & 94) * Math.max(3 >> 2, var2.getMountSHByindex(var1).getLvl() - --1));
      var3.setLength(5 >> 3);
      PropertyUtil.getMountSHSXString(var1, var2, var3, (boolean)(5 >> 2));
      this.acv.setTextSize(var3.toString(), 31992 & 975);
      this.mv.getVerticalScrollBar().setMaximum(this.acv.getHeight());
      this.mv.getVerticalScrollBar().setValue(5 >> 3);
      BaseMountSH var4 = var2.getMountSHByindex(var1);

      int var5;
      for(int var10000 = var5 = 3 & 4; var10000 < this.aws.length; var10000 = var5) {
         <undefinedtype> var6 = this.aws[var5];
         int var10001;
         BaseMountSH var10002;
         if (var5 < var4.getUnlock()) {
            var10001 = 3 & 5;
            var10002 = var4;
         } else {
            var10001 = 0;
            var10002 = var4;
         }

         ++var5;
         var6.lc((boolean)var10001, var10002, var2);
      }

   }
}
