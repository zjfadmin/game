package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JLabel;

class Class49 extends com.xy.q.Class50 {
   private JLabel df;
   private com.xy.q.Class54 yk;
   // $VF: synthetic field
   final Class47 apk;
   private com.xy.q.Class54 fe;
   private com.xy.w.Class18 dm;
   private int ah;

   public Class49(Class47 var1, int var2) {
      this.apk = var1;
      this.ah = var2;
      this.yk = new Class20(this, Class47.agp(var1));
      String var10012 = "].\u0001)\u0001|\u0018|\u0000=@*";
      this.yk.mt(com.xy.w.Class16.m("sc/d/161.png", 10, 10, 10, 10, false));
      this.yk.wp(com.xy.q.Class54.auw);
      this.yk.setBounds(28, 0, 58, 58);
      this.fe = new Class28(this, Class47.agp(var1));
      this.fe.setBounds(66, 38, 32, 32);
      this.df = com.xy.q.Class1.k(0, 70, 115, 22, Color.white, com.xy.q.Class49.w);
      this.df.setHorizontalAlignment(0);
      String var10006 = "\u0016`JgJ2S0Ks\u000bd";
      this.dm = new com.xy.w.Class18("sc/d/163.png");
      this.dm.setBounds(10, 70, 95, 22);
      this.add(this.fe);
      this.add(this.yk);
      this.add(this.df);
      this.add(this.dm);
   }

   public void je(MouseEvent var1) {
      BaseMountSH var3 = Class47.agp(this.apk).yx().getMountSHByindex(0);
      if (this.ah < var3.getUnlock()) {
         if (var3.getMounts()[this.ah].getB2() > 0) {
            String var10006 = "6K=R";
            String var10004 = "SHXQ" + this.ah;
            String var10005 = "ny砣宴苼贗nix\u001e\u001a\r\u001a铘乩尨寅把瞾秕冷宦择槓ｒ";
            Class47.agp(this.apk).afx.dm(new ConfirmBean(32, var10004, "#W确定花费#G50W#W银两将守护石移出守护槽？"));
         } else {
            this.apk.n(this.ah);
         }
      }
   }

   public void fi(MouseEvent var1) {
      RoleData var2;
      BaseMountSH var3 = (var2 = Class47.agp(this.apk).yx()).getMountSHByindex(0);
      if (this.ah < var3.getUnlock()) {
         if (var3.getMounts()[this.ah].getB1() > 0) {
            String var10006 = "6K\"YU\u007fU\u007f";
            String var10004 = "SHGZ0|0|" + this.ah;
            String var10005 = "\r\u001a坾髜秕冷宦择槓呃Ｂ屋够叶\r\n宦择矝勭振nyく";
            Class47.agp(this.apk).afx.dm(new ConfirmBean(32, var10004, "#W坐骑移出守护槽后，将失去#G守护石加持#W。"));
         } else {
            ((Class18)Class47.agp(this.apk).zc().j(173)).cc(0, this.ah);
         }
      } else {
         Goodstable var4;
         if ((var4 = var2.au(107L)) == null) {
            String var10001 = "泄朊跖夜盡灶儦晵";
            Class47.agp(this.apk).afx._do("没有足够的灵元晶");
         } else {
            String var10003 = "}\u0005{\u0003\u001e1";
            String var5 = Agreement.getSendTextAES("usermount", "SHUN0|" + var4.getRgid());
            var2.getGameView().getClient().k(var5);
         }
      }
   }

   public void cw(MouseEvent var1) {
      BaseMountSH var3 = Class47.agp(this.apk).yx().getMountSHByindex(0);
      if (this.ah < var3.getUnlock()) {
         BaseMountSkill var4;
         if ((var4 = var3.getMounts()[this.ah]).getB2() > 0) {
            Goodstable var5;
            if ((var5 = Class47.agp(this.apk).yt().ay(new BigDecimal(25298))) != null && var5.getType() == 108L) {
               var4.c(var5);
               ((com.xy.a.Class48)Class47.agp(this.apk).zc().j(46)).hr(var5, false);
            }
         }
      }
   }

   public void acx(boolean var1, BaseMountSH var2, RoleData var3) {
      if (var1) {
         BaseMountSkill var4;
         BaseMountSkill var6 = var4 = var2.getMounts()[this.ah];
         String var16 = "].\u0001)\u0001|\u0018}\u0000=@*";
         this.yk.mt(com.xy.w.Class16.m("sc/d/160.png", 10, 10, 10, 10, false));
         Class49 var8;
         if (var6.getB1() > 0) {
            Mount var5 = var3.getMount(var4.getB1());
            this.yk.gt(com.xy.w.Class15.r(var3.getLoginResult().getRace_id().intValue(), var4.getB1()));
            var16 = "F`&F':]4";
            this.df.setForeground(com.xy.q.Class49.c("#cCEB987"));
            JLabel var7 = this.df;
            String var10;
            if (var5 != null) {
               var10 = var5.getMountname();
            } else {
               StringBuilder var11 = new StringBuilder(String.valueOf(MsgUntil.h(var4.getB1())));
               var16 = "坾髜";
               var10 = var11.append("坐骑").toString();
            }

            var7.setText(var10);
            var8 = this;
         } else {
            var8 = this;
            this.yk.l();
            this.df.setText(null);
         }

         com.xy.q.Class54 var9 = var8.fe;
         String var13;
         if (var4.getB2() > 0) {
            var13 = "\u0016`JfJ2]1Ks\u000bd";
            var13 = "sc/e/182.png";
         } else {
            var13 = "].\u0001(\u0001|\u0016~\u0000=@*";
            var13 = "sc/e/183.png";
         }

         var9.dp(var13);
         this.fe.setVisible(true);
      } else {
         String var10005 = "\u0016`JgJ2S2Ks\u000bd";
         this.yk.mt(com.xy.w.Class16.m("sc/d/161.png", 10, 10, 10, 10, false));
         this.yk.l();
         this.fe.setVisible(false);
         String var10002 = "\r.\u0017x\u0017x\u0017x";
         this.df.setForeground(com.xy.q.Class49.c("#c959595"));
         JLabel var10000 = this.df;
         String var19;
         if (this.ah == 0) {
            var19 = "0";
            var19 = "3";
         } else if (this.ah == 1) {
            var19 = "{";
            var19 = "6";
         } else if (this.ah == 2) {
            var19 = ":";
            var19 = "9";
         } else if (this.ah == 3) {
            var19 = "\u001f\u007f";
            var19 = "12";
         } else if (this.ah == 4) {
            var19 = "T5";
            var19 = "16";
         } else if (this.ah == 5) {
            var19 = "\u001c}";
            var19 = "20";
         } else if (this.ah == 6) {
            var19 = "W7";
            var19 = "24";
         } else {
            var19 = "";
         }

         StringBuilder var10001 = new StringBuilder(String.valueOf(var19));
         var10002 = "纉厢觍镌";
         var10000.setText(var10001.append("级可解锁").toString());
      }
   }
}
