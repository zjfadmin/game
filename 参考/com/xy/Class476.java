package com.xy;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

public class Class476 extends Class345 {
   private Class44 qm;
   private Class436 uc;
   private Class436 r;
   private String rw;
   private String yr;
   private Class529 qs;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.yr != null) {
         var1.setFont(Class681.ce);
         var1.drawString(this.yr, 110 & 117, 4606 & 28399);
      }

      if (this.rw != null) {
         var1.setFont(Class681.ce);
         var1.setColor(Color.red);
         var1.drawString(this.rw, 116 & 111, 12646 & 20379);
      }

   }

   public Class476(GameView var1) {
      int var10005 = 3 ^ 3;
      int var10009 = -4 >> 2;
      super(127 & 102, --2, Class345.aef, var1);
      this.va(var10009, 5 >> 3, 10623 & 22442, 15167 & 17916, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 111 & 84, 111 & 84, 111 & 84, 111 & 84, (boolean)(3 ^ 3)), "每日特惠");
      this.ak((boolean)var10005);
      this.ad(new Class116(47 & 94, 3 >> 2, 3 >> 2, 47 & 114));
      this.r = new Class436("sc/b/S12.png");
      this.r.setBounds(54 & 121, 126 & 21, 22271 & 10726, 125 & 79);
      this.add(this.r);
      this.qm = new Class44(this);
      this.qm.setBounds(107 & 127, 109 & 126, 126 & 101, 126 & 101);
      this.add(this.qm);
      this.uc = new Class436(Class511.q("sc/d/4.png", 95 & 38, 95 & 38, 95 & 38, 95 & 38, (boolean)(3 & 4)));
      this.uc.setBounds(126 & 101, 111 & 127, 115, 115);
      this.add(this.uc);
      this.qs = new Class529("sc/e/7.png", 5 >> 2, 122, Class681.ak, Class681.c, "购买", this);
      this.qs.setBounds(173, 244, 59, 25);
      this.add(this.qs);
   }

   public void d() {
      if (this.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 3 >> 1) < 3 >> 1) {
         this.aej.f("你的背包不够");
      } else {
         String var1 = Agreement.getSendTextAES("Dayforonesure", (String)null);
         this.uw().d(var1);
      }
   }

   public void alu(ChongjipackBean var1) {
      if (var1 != null) {
         long var2 = Class280.f();
         String var4 = (new SimpleDateFormat("yyyy-MM-dd")).format(var2);
         if (!Class394.r(var1.getHuitime(), var4)) {
            var1 = null;
         }
      }

      if (var1 == null) {
         this.aej.f("暂无每日特惠");
      } else {
         List var5 = ChongjipackBean.getGoods(var1.getPackgoods());
         Goodstable var3;
         Goodstable var10001 = var3 = this.vc().n(((XXGDBean)var5.get(2 & 5)).getId());
         this.qm.c(2 ^ 3, var3);
         this.yr = var10001.getGoodsname();
         this.rw = var1.getCanpaymoney() + "仙玉";
         this.ve().a(this.ae());
      }
   }
}
