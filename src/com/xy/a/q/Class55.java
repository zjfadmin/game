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

public class Class55 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] fd;
   private JComponent jq;
   private JScrollPane jo;
   private JLabel di;
   private List<ChongjipackBean> jr;

   public void gw(Object var1) {
      Class62 var2;
      if ((var2 = (Class62)var1) != null && Class62.zi(var2) != null) {
         if (this.yx().getGoodPackSum(-1L, new BigDecimal(-1), Class62.zh(var2)) < Class62.zh(var2)) {
            String var10001 = "伷皑肛匐乚夊";
            this.afx._do("你的背包不够");
         } else {
            String var10003 = "E";
            String var4 = Agreement.getSendTextAES("Dayforweekgradesure", "v" + Class62.zi(var2).getPackgradetype());
            this.za().k(var4);
         }
      }
   }

   public void h() {
      this.fm(this.jr);
   }

   public Class55(GameView var1) {
      super(101, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "UP\tW\t\u0002\bCHT";
      this.yy(-1, 0, 684, 406, com.xy.q.Class30.agh);
      com.xy.w.Class9 var10 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10009 = "辉绸儒倩";
      this.yu(var10, "连续充值");
      String var10011 = "\u0005P`u`u`u";
      this.di = com.xy.q.Class1.f(56, 155, 594, 21, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
      String var10005 = "飑參夁劤";
      this.di.setText("领取奖励");
      this.add(this.di);
      this.jq = new Class37(this);
      this.jo = com.xy.q.Class1.g(56, 176, 594, 208, this.jq, 20);
      this.add(this.jo);
      this.fd = new com.xy.w.Class18[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.fd.length; var10000 = var2) {
         this.fd[var2] = new com.xy.w.Class18();
         Class55 var3;
         if (var2 == 0) {
            var3 = this;
            com.xy.w.Class18 var10002 = this.fd[var2];
            String var10003 = "@E\u001cB\u001c\u0011\u0003\bCHT";
            var10002.dp("sc/d/70.png");
            this.fd[var2].setBounds(59, 27, 583, 110);
         } else if (var2 == 1) {
            var3 = this;
            com.xy.w.Class18 var4 = this.fd[var2];
            String var8 = "f4:3:d#ye9r";
            var4.mt(com.xy.w.Class16.m("sc/d/36.png", 15, 15, 15, 15, false));
            this.fd[var2].setBounds(55, 23, 591, 118);
         } else if (var2 == 2) {
            var3 = this;
            com.xy.w.Class18 var5 = this.fd[var2];
            String var9 = "@E\u001cB\u001c\u0014\u0006\bCHT";
            var5.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.fd[var2].setBounds(56, 155, 594, 21);
         } else {
            if (var2 == 3) {
               com.xy.w.Class18 var10001 = this.fd[var2];
               String var6 = "f4:3:e!ye9r";
               var10001.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.fd[var2].setBounds(56, 155, 594, 229);
            }

            var3 = this;
         }

         var3.add(this.fd[var2++]);
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
         String var10001 = "\u0000\u0015";
         var12 = var11.split("&&");
      }

      int var13 = this.jq.getComponentCount();
      int var6 = 0;
      int var7 = var1.size();

      for (int var16 = var6; var16 < var7; var16 = var6) {
         ChongjipackBean var8 = var1.get(var6);
         if (var13 < var1.size()) {
            Class62 var9 = new Class62(this);
            var9.setBounds(4, 2 + 62 * var6, 570, 60);
            var13++;
            this.jq.add(var9);
         }

         Class62 var17 = (Class62)this.jq.getComponent(var6);
         boolean var10 = Class71.aba(var12, 3, var8.getPackgradetype());
         var6++;
         var17.gy(var8, var10);
      }

      for (int var18 = var6 = var1.size(); var18 < var13; var18 = var6) {
         Class62 var19 = (Class62)this.jq.getComponent(var6);
         var6++;
         var19.gy(null, false);
      }

      this.jq.setPreferredSize(new Dimension(this.jq.getWidth(), var1.size() * 62));
      this.zc().b(this.lj());
   }
}
