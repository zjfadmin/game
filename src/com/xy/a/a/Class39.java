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
            String var8 = new StringBuilder("SHGZ0|").append(Class3.ad(this.akp)).append("|").append(this.ds).toString();
            var10000.dm(new ConfirmBean(32, var8, "#W确定将该坐骑移出守护槽？"));
         } else {
            ((Class18)Class3.ac(this.akp).zc().j(173)).cc(Class3.ad(this.akp), this.ds);
         }
      } else {
         Goodstable var4;
         if ((var4 = var2.au(107L)) == null) {
            Class3.ac(this.akp).afx._do("没有足够的灵元晶");
         } else {
            String var5 = Agreement.getSendTextAES("usermount", new StringBuilder("SHUN").append(Class3.ad(this.akp)).append("|").append(var4.getRgid()).toString());
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
      this.gh = new com.xy.w.Class18("sc/d/163.png");
      this.gh.setBounds(10, 60, 95, 22);
      com.xy.w.Class18 var10001;
      if (var2 == 0) {
         var10001 = new com.xy.w.Class18("sc/d/170.png");
      } else {
         var10001 = new com.xy.w.Class18("sc/d/171.png");
      }

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
         this.dn.dp("sc/d/172.png");
         this.jw.dq("sc/d/160.png");
         if (var4 > 0) {
            Mount var5 = var3.getMount(var4);
            this.jw.gt(com.xy.w.Class15.r(var3.getLoginResult().getRace_id().intValue(), var4));
            this.di.setForeground(com.xy.q.Class49.c("#cCEB987"));
            JLabel var10000 = this.di;
            String var6;
            if (var5 != null) {
               var6 = var5.getMountname();
            } else {
               var6 = new StringBuilder(String.valueOf(MsgUntil.h(var4))).append("坐骑").toString();
            }

            var10000.setText(var6);
         } else {
            this.jw.l();
            this.di.setText(null);
         }
      } else {
         this.dn.dp("sc/d/173.png");
         this.jw.dq("sc/d/161.png");
         this.jw.l();
         this.di.setForeground(com.xy.q.Class49.c("#c959595"));
         this.di.setText("16级可解锁");
      }
   }
}
