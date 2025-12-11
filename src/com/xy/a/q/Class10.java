package com.xy.a.q;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import java.util.List;

class Class10 extends com.xy.w.Class18 {
   private com.xy.i.Class19 jv;
   private RichLabel ed;
   private com.xy.q.Class54 jw;
   // $VF: synthetic field
   final Class8 jx;
   private com.xy.w.Class18 gh;
   private int ds;
   private com.xy.q.Class14 en;
   private ChongjipackBean jy;

   // $VF: synthetic method
   static ChongjipackBean gx(Class10 var0) {
      return var0.jy;
   }

   public void gy(ChongjipackBean var1, boolean var2) {
      if ((this.jy = var1) == null) {
         this.setVisible(false);
      } else {
         RichLabel var10003 = this.ed;
         String var10006 = "5v5g毙旉兓倐滷\u000fD";
         StringBuilder var10004 = new StringBuilder("#Z#K每日充值满#R").append(var1.getCanpaymoney());
         String var10005 = "\u000b\u001f八";
         var10003.setTextSize(var10004.append("#K元").toString(), 400);
         this.ed.setBounds(66, 16, this.ed.getWidth(), this.ed.getHeight());
         this.ds = 0;
         List var3 = ChongjipackBean.getGoods(var1.getPackgoods());

         int var4;
         for (int var10000 = var4 = 0; var10000 < var3.size(); var10000 = var4) {
            int var10001 = this.ds;
            XXGDBean var10002 = (XXGDBean)var3.get(var4);
            var4++;
            this.ds = var10001 + var10002.getSum();
         }

         Goodstable var5 = this.jx.yt().ay(((XXGDBean)var3.get(0)).getId());
         this.jw.gs(1, var5);
         this.en.setText(String.valueOf(((XXGDBean)var3.get(0)).getSum()));
         Class10 var6;
         if (var2) {
            String var7 = "eO9I9\u0019.\u0002fBq";
            this.jv.setBtn(-1, "sc/e/58.png");
            var6 = this;
         } else {
            String var8 = "[7\u00071\u0007g\u0019zX:O";
            this.jv.setBtn(1, "sc/e/31.png");
            var6 = this;
         }

         var6.setVisible(true);
      }
   }

   // $VF: synthetic method
   static int gz(Class10 var0) {
      return var0.ds;
   }

   public Class10(Class8 var1) {
      super(com.xy.w.Class16.m("sc/d/36.png", 15, 15, 15, 15, false));
      this.jx = var1;
      String var10007 = "eO9I9\u001f'\u0002fBq";
      String var10012 = "颮t叾";
      this.jv = new com.xy.i.Class19("sc/e/31.png", 1, 105, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "领 取", var1.eg());
      this.jv.gw(this);
      this.jv.setBounds(473, 18, 79, 25);
      this.add(this.jv);
      this.ed = new RichLabel(null, com.xy.q.Class49.bx);
      this.add(this.ed);
      String var10011 = "\u000fu\u001c&jP\u001c&";
      this.en = com.xy.q.Class1.i(40, 7, 16, 16, 0, com.xy.q.Class49.c("#c00FF00"), com.xy.q.Class49.bz);
      this.en.mt(com.xy.w.Class16.m("sc/b/s24.png", 3, 3, 3, 3, false));
      this.add(this.en);
      this.jw = new com.xy.q.Class54(var1.eg());
      this.jw.wp(com.xy.q.Class54.atu);
      var10007 = "_u\u0003r\u0003\"\u0002fBq";
      this.jw.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
      this.jw.setBounds(7, 7, 49, 47);
      this.add(this.jw);
      this.gh = new com.xy.w.Class18();
      String var10008 = "[7\u00070\u0007g\u0018zX:O";
      this.gh.dp("sc/d/30.png");
      this.gh.setBounds(56, 41, 510, 1);
      this.add(this.gh);
   }
}
