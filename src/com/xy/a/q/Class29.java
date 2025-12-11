package com.xy.a.q;

import com.xy.readbean.Shop;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class Class29 extends JPanel {
   private Image g;
   private Color uu;
   private Shop uv;
   private com.xy.q.Class54 fe;
   private com.xy.i.Class16 uw;
   private String mo;

   public Class29(com.xy.q.Class30 var1, Shop var2) {
      this.setPreferredSize(new Dimension(250, 65));
      this.setLayout(null);
      this.setOpaque(false);
      this.setBackground(com.xy.q.Class49.bk);
      this.uv = var2;
      String var10008 = "mF1@1\u00120UpB";
      String var10013 = "兖挊";
      this.uw = new com.xy.i.Class16("sc/e/7.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "兑换", var1);
      this.uw.ajh(this);
      this.uw.setBounds(175, 30, 59, 25);
      this.add(this.uw);
      this.fe = new com.xy.q.Class54(var1);
      this.fe.wp(com.xy.q.Class54.ask);
      String var10006 = "mF1A1\u00110UpB";
      this.fe.dq("sc/d/4.png");
      this.fe.setBounds(19, 6, 46, 46);
      this.add(this.fe);
      Class29 var10000;
      if (var1.za().gameType == 4) {
         var10000 = this;
         String var10002 = "$\u000b7Xa\u000ea\u000e";
         this.uu = com.xy.q.Class49.c("#c00ffff");
      } else {
         var10000 = this;
         this.uu = com.xy.q.Class49.j;
      }

      var10000.fe.gs(13, var2);
      String var10003 = "秊刘\u001f";
      this.mo = "积分:" + var2.getShopprice();
   }

   public Shop ou() {
      return this.uv;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.uv != null) {
         if (this.g == null) {
            String var10001 = "t\u000b(\n(剮創绗X\u001f5Z2DoY)\u0018i\u000f";
            this.g = com.xy.w.Class16.c("sc/b/分割线_w225,h1.png");
         }

         var1.drawImage(this.g, 14, 62, 225, 1, this);
         var1.setFont(com.xy.q.Class49.ac);
         var1.setColor(Color.white);
         var1.drawString(this.uv.getShopname(), 81, 20);
         var1.setColor(this.uu);
         var1.drawString(this.mo, 81, 50);
      }
   }

   public void ov(Shop var1) {
      this.uv = var1;
      this.fe.gs(13, var1);
      String var10003 = "秊刘\u001f";
      this.mo = "积分:" + var1.getShopprice();
   }

   public void t() {
      this.uv = null;
      this.mo = null;
      this.fe.gs(0, null);
   }
}
