package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

class Class39 extends com.xy.q.Class50 {
   // $VF: synthetic field
   final Class3 akp;
   private com.xy.q.Class54 jw;
   private com.xy.w.Class18 nn;
   private com.xy.w.Class18 gh;
   private int ds;
   private JLabel di;
   private com.xy.w.Class18 dn;

   // $VF: synthetic method
   static com.xy.w.Class18 acw(Class39 var0) {
      return var0.dn;
   }

   public void cw(MouseEvent var1) {
      RoleData var2;
      BaseMountSH var3 = (var2 = Class3.ac(this.akp).yx()).getMountSHByindex(Class3.ad(this.akp));
      if (this.ds < var3.getUnlock()) {
         int var6 = this.ds == 0 ? var3.getPoint().x : var3.getPoint().y;
         if (var6 > 0) {
            GameView var10000 = Class3.ac(this.akp).afx;
            String var10006 = "8S,A[g";
            StringBuilder var10004 = new StringBuilder("SHGZ0|").append(Class3.ad(this.akp));
            String var10005 = "Q";
            String var8 = var10004.append("|").append(this.ds).toString();
            var10005 = "HL砅宁屭课圻骊禐凡寣抿榖＄";
            var10000.dm(new ConfirmBean(32, var8, "#W确定将该坐骑移出守护槽？"));
         } else {
            ((Class18)Class3.ac(this.akp).zc().j(173)).cc(Class3.ad(this.akp), this.ds);
         }
      } else {
         Goodstable var4;
         if ((var4 = var2.au(107L)) == null) {
            String var7 = "泏朤距夲盪灘儭晛";
            Class3.ac(this.akp).afx._do("没有足够的灵元晶");
         } else {
            String var10003 = "8S>U";
            StringBuilder var10001 = new StringBuilder("SHUN").append(Class3.ad(this.akp));
            String var10002 = "Q";
            String var5 = Agreement.getSendTextAES("usermount", var10001.append("|").append(var4.getRgid()).toString());
            var2.getGameView().getClient().k(var5);
         }
      }
   }

   public Class39(Class3 var1, int var2) {
      this.akp = var1;
      this.ds = var2;
      this.jw = new Class52(this, Class3.ac(var1));
      this.jw.wp(com.xy.q.Class54.agb);
      this.jw.setBounds(28, 0, 60, 60);
      this.di = com.xy.q.Class1.k(0, 60, 115, 22, Color.white, com.xy.q.Class49.w);
      this.di.setHorizontalAlignment(0);
      String var10005 = "\u001dNAIA\u001cX\u001e@]\u0000J";
      this.gh = new com.xy.w.Class18("sc/d/163.png");
      this.gh.setBounds(10, 60, 95, 22);
      String var3;
      if (var2 == 0) {
         var3 = "\u0018xD\u007fD*\\+Ek\u0005|";
         var3 = "sc/d/170.png";
      } else {
         var3 = "\u001dNAIA\u001cY\u001c@]\u0000J";
         var3 = "sc/d/171.png";
      }

      com.xy.w.Class18 var10001 = new com.xy.w.Class18(var3);
      this.nn = var10001;
      this.nn.setBounds(46, 81, 29, 32);
      this.add(this.jw);
      this.add(this.di);
      this.add(this.gh);
      this.add(this.nn);
      this.dn = new com.xy.w.Class18();
      if (var2 == 0) {
         this.dn.setBounds(287, 70, 160, 160);
      } else {
         this.dn.setBounds(508, 70, 160, 160);
      }
   }

   public void acx(boolean var1, BaseMountSH var2, RoleData var3) {
      if (var1) {
         int var4 = this.ds == 0 ? var2.getPoint().x : var2.getPoint().y;
         String var10003 = "\u0018xD\u007fD*\\)Ek\u0005|";
         this.dn.dp("sc/d/172.png");
         String var8 = "\u001dNAIA\u001cX\u001d@]\u0000J";
         this.jw.dq("sc/d/160.png");
         if (var4 > 0) {
            Mount var5 = var3.getMount(var4);
            this.jw.gt(com.xy.w.Class15.r(var3.getLoginResult().getRace_id().intValue(), var4));
            var8 = "Hx(^)\"S,";
            this.di.setForeground(com.xy.q.Class49.c("#cCEB987"));
            JLabel var10000 = this.di;
            String var6;
            if (var5 != null) {
               var6 = var5.getMountname();
            } else {
               StringBuilder var7 = new StringBuilder(String.valueOf(MsgUntil.h(var4)));
               var8 = "圾骼";
               var6 = var7.append("坐骑").toString();
            }

            var10000.setText(var6);
         } else {
            this.jw.l();
            this.di.setText(null);
         }
      } else {
         String var10005 = "\u0018xD\u007fD*\\(Ek\u0005|";
         this.dn.dp("sc/d/173.png");
         String var10004 = "\u001dNAIA\u001cX\u001c@]\u0000J";
         this.jw.dq("sc/d/161.png");
         this.jw.l();
         String var10002 = "HxR.R.R.";
         this.di.setForeground(com.xy.q.Class49.c("#c959595"));
         String var10001 = "_\u001b绉参覍锬";
         this.di.setText("16级可解锁");
      }
   }
}
