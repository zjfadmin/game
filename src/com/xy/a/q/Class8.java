package com.xy.a.q;

import com.xy.bean.ChongjipackBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class8 extends com.xy.q.Class30 {
   private JLabel ad;
   private JComponent jq;
   private com.xy.w.Class18[] j;
   private JScrollPane ba;
   private List<ChongjipackBean> jr;

   public void h() {
      this.fm(this.jr);
   }

   public void gw(Object var1) {
      Class10 var2;
      if ((var2 = (Class10)var1) != null && Class10.gx(var2) != null) {
         if (this.yx().getGoodPackSum(-1L, new BigDecimal(-1), Class10.gz(var2)) < Class10.gz(var2)) {
            String var10001 = "佮盝胂卜七奆";
            this.afx._do("你的背包不够");
         } else {
            String var10003 = "\\";
            String var4 = Agreement.getSendTextAES("Paydaygradesure", "v" + Class10.gx(var2).getPackgradetype());
            this.za().k(var4);
         }
      }
   }

   public Class8(GameView var1) {
      super(100, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "\u0018IDND\u001bEZ\u0005M";
      this.yy(-1, 0, 684, 406, com.xy.q.Class30.agh);
      com.xy.w.Class9 var10 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10009 = "毁於克健";
      this.yu(var10, "每日充值");
      String var10011 = "HI-l-l-l";
      this.ad = com.xy.q.Class1.f(56, 155, 594, 21, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
      String var10005 = "颈厏奘勨";
      this.ad.setText("领取奖励");
      this.add(this.ad);
      this.jq = new Class116(this);
      this.ba = com.xy.q.Class1.g(56, 176, 594, 208, this.jq, 20);
      this.add(this.ba);
      this.j = new com.xy.w.Class18[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.j.length; var10000 = var2) {
         this.j[var2] = new com.xy.w.Class18();
         Class8 var3;
         if (var2 == 0) {
            var3 = this;
            com.xy.w.Class18 var10002 = this.j[var2];
            String var10003 = "Y\b\u0005\u000f\u0005\\\u001aEZ\u0005M";
            var10002.dp("sc/d/70.png");
            this.j[var2].setBounds(59, 27, 583, 110);
         } else if (var2 == 1) {
            var3 = this;
            com.xy.w.Class18 var4 = this.j[var2];
            String var8 = "*mvjv=o )`>";
            var4.mt(com.xy.w.Class16.m("sc/d/36.png", 15, 15, 15, 15, false));
            this.j[var2].setBounds(55, 23, 591, 118);
         } else if (var2 == 2) {
            var3 = this;
            com.xy.w.Class18 var5 = this.j[var2];
            String var9 = "Y\b\u0005\u000f\u0005Y\u001fEZ\u0005M";
            var5.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(56, 155, 594, 21);
         } else {
            if (var2 == 3) {
               com.xy.w.Class18 var10001 = this.j[var2];
               String var6 = "*mvjv<m )`>";
               var10001.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.j[var2].setBounds(56, 155, 594, 229);
            }

            var3 = this;
         }

         var3.add(this.j[var2++]);
      }
   }

   public void fm(List<ChongjipackBean> var1) {
      int var2;
      int var3;
      for (int var10000 = var2 = 0; var10000 < var1.size() - 1; var10000 = ++var2) {
         for (int var15 = var3 = var2 + 1; var15 < var1.size(); var15 = ++var3) {
            ChongjipackBean var4 = var1.get(var2);
            ChongjipackBean var5 = var1.get(var3);
            if (var4.getCanpaymoney() > var5.getCanpaymoney()) {
               var1.set(var2, var5);
               var1.set(var3, var4);
            }
         }
      }

      this.jr = var1;
      String var11 = this.yx().getLoginResult().getVipget();
      String[] var12 = null;
      if (var11 != null) {
         String var10001 = "M\f";
         var12 = var11.split("&&");
      }

      int var13 = this.jq.getComponentCount();
      int var6 = 0;
      int var7 = var1.size();

      for (int var16 = var6; var16 < var7; var16 = var6) {
         ChongjipackBean var8 = var1.get(var6);
         if (var13 < var1.size()) {
            Class10 var9 = new Class10(this);
            var9.setBounds(4, 2 + 62 * var6, 570, 60);
            var13++;
            this.jq.add(var9);
         }

         Class10 var17 = (Class10)this.jq.getComponent(var6);
         boolean var10 = Class71.aba(var12, 2, var8.getPackgradetype());
         var6++;
         var17.gy(var8, var10);
      }

      for (int var18 = var6 = var1.size(); var18 < var13; var18 = var6) {
         Class10 var19 = (Class10)this.jq.getComponent(var6);
         var6++;
         var19.gy(null, false);
      }

      this.jq.setPreferredSize(new Dimension(this.jq.getWidth(), var1.size() * 62));
      this.zc().b(this.lj());
   }
}
