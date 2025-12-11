package com.xy.a.q;

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

public class Class47 extends com.xy.q.Class30 {
   private com.xy.q.Class54 jw;
   private String aq;
   private String aaq;
   private com.xy.w.Class18 af;
   private com.xy.i.Class19 te;
   private com.xy.w.Class18 dn;

   public Class47(GameView var1) {
      super(102, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "\u007f\u0015#\u0012#G\"\u0006b\u0011";
      this.yy(-1, 0, 298, 316, com.xy.q.Class30.agh);
      com.xy.w.Class9 var2 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10008 = "殊斢爼悧";
      this.yu(var2, "每日特惠");
      this.rm(false);
      this.wp(new com.xy.v.Class32(14, 0, 0, 34));
      String var10006 = "\u007f\u0015#\u0014#%=D\"\u0006b\u0011";
      this.af = new com.xy.w.Class18("sc/b/S12.png");
      this.af.setBounds(48, 20, 230, 77);
      this.add(this.af);
      this.jw = new com.xy.q.Class54(this);
      this.jw.setBounds(107, 108, 100, 100);
      this.add(this.jw);
      var10008 = "6$j#jsk7+ ";
      this.dn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/4.png", 6, 6, 6, 6, false));
      this.dn.setBounds(100, 111, 115, 115);
      this.add(this.dn);
      String var10009 = "\u007f\u0015#\u0013#A\"\u0006b\u0011";
      String var10014 = "赨丷";
      this.te = new com.xy.i.Class19("sc/e/7.png", 1, 122, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "购买", this);
      this.te.setBounds(173, 244, 59, 25);
      this.add(this.te);
   }

   public void ux(ChongjipackBean var1) {
      if (var1 != null) {
         long var2 = com.xy.v.Class22.f();
         String var10002 = "u\u000fu\u000f!;A[h\u0012";
         String var5 = new SimpleDateFormat("yyyy-MM-dd").format(var2);
         if (!com.xy.v.Class12.am(var1.getHuitime(), var5)) {
            var1 = null;
         }
      }

      if (var1 == null) {
         String var10001 = "曇斧殊斢爼悧";
         this.afx._do("暂无每日特惠");
      } else {
         List var6 = ChongjipackBean.getGoods(var1.getPackgoods());
         Goodstable var3;
         Goodstable var7 = var3 = this.yt().ay(((XXGDBean)var6.get(0)).getId());
         this.jw.gs(1, var3);
         this.aq = var7.getGoodsname();
         StringBuilder var8 = new StringBuilder().append(var1.getCanpaymoney());
         String var10003 = "仕珿";
         this.aaq = var8.append("仙玉").toString();
         this.zc().b(this.lj());
      }
   }

   public void h() {
      if (this.yx().getGoodPackSum(-1L, new BigDecimal(-1), 1) < 1) {
         String var10001 = "伥盃肉卂么奘";
         this.afx._do("你的背包不够");
      } else {
         String var2 = Agreement.getSendTextAES("Dayforonesure", null);
         this.za().k(var2);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aq != null) {
         var1.setFont(com.xy.q.Class49.ac);
         var1.drawString(this.aq, 100, 238);
      }

      if (this.aaq != null) {
         var1.setFont(com.xy.q.Class49.ac);
         var1.setColor(Color.red);
         var1.drawString(this.aaq, 100, 258);
      }
   }
}
