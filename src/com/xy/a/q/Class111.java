package com.xy.a.q;

import com.xy.readbean.Skill;
import com.xy.scene.DNTGScene;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Class111 extends com.xy.q.Class30 {
   private Class32[] axm;
   private com.xy.w.Class18 af;
   private com.xy.q.Class52 kt;
   private JLabel im;

   public void e() {
      com.xy.v.Class8 var1 = this.yt();

      int var2;
      for (int var10000 = var2 = 0; var10000 < 8; var10000 = var2) {
         Skill var3 = var1.ac("" + (10001 + var2));
         this.axm[var2++].rd(var3);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.f();
      }
   }

   public void f() {
      long var1 = 0L;
      if (this.afx.scene != null && this.afx.scene.getSceneId() == 1011) {
         var1 = ((DNTGScene)this.afx.scene).getDN_JB().longValue();
      }

      this.kt.ef(var1);
   }

   public void ci(String var1) {
      this.h();
      if (var1 != null && !"".equals(var1)) {
         String var10001 = "\u0018";
         String[] var2 = var1.split("&");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            String var6 = var2[var3];
            var10001 = "\u000b1";
            String[] var4 = var6.split("\\$");

            int var5;
            for (int var7 = var5 = 0; var7 < this.axm.length; var7 = ++var5) {
               if (Class32.re(this.axm[var5]) != null && var4[0].equals(Class32.re(this.axm[var5]).getSkillid())) {
                  this.axm[var5].n(Integer.parseInt(var4[1]));
               }
            }
         }
      }

      this.f();
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.axm.length; var10000 = var1) {
         this.axm[var1++].n(0);
      }
   }

   public Class111(GameView var1) {
      super(98, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "$vxqx$ye9r";
      this.yy(-1, 0, 546, 395, com.xy.q.Class30.agh);
      com.xy.w.Class9 var3 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "祃劥劽挿";
      this.yu(var3, "神力加持");
      this.axm = new Class32[8];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.axm.length; var10000 = var2) {
         this.axm[var2] = new Class32(this);
         this.axm[var2].setBounds(50 + 235 * (var2 % 2), 63 + 75 * (var2 / 2), 224, 68);
         this.add(this.axm[var2++]);
      }

      this.im = com.xy.q.Class1.k(42, 26, 72, 19, Color.black, com.xy.q.Class49.ch);
      var10003 = "扆皑醆帔";
      this.im.setText("我的金币");
      this.add(this.im);
      this.kt = com.xy.q.Class1.m(115, 26, 106, 19, 10, Color.white, com.xy.q.Class49.w, null, var1);
      this.kt.n(2);
      String var10005 = "M~\u0011y\u0011,\t3NsY";
      this.kt.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.kt.setText("0");
      this.add(this.kt);
      String var10008 = "f4:3:d#ye9r";
      this.af = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      this.af.setBounds(41, 53, 478, 317);
      this.add(this.af);
      this.e();
   }

   public void gw(Object var1) {
      Class32 var2 = (Class32)var1;
      if (this.afx.scene != null && this.afx.scene.getSceneId() == 1011) {
         int var4 = ((DNTGScene)this.afx.scene).getDN_JB().intValue();
         if ((Class32.rg(var2) + 1) * Class32.rf(var2) > var4) {
            String var10001 = "釯帜丳趮Ｒ旽泫博纙";
            this.afx._do("金币不足，无法升级");
            return;
         }

         String var10003 = "f%f$+Y";
         String var6 = Agreement.getSendTextAES("scene", "1011|L" + Class32.re(var2).getSkillid());
         this.za().k(var6);
      }
   }
}
