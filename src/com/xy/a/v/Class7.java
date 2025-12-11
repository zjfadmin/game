package com.xy.a.v;

import com.xy.bean.RoleShow;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import java.awt.Font;

public class Class7 extends com.xy.q.Class30 {
   private Class29[] kk;
   private int ae;
   private com.xy.w.Class1 kl;
   private com.xy.i.Class7 km;
   private com.xy.w.Class18 dn;

   // $VF: synthetic method
   static void hh(Class7 var0, com.xy.w.Class1 var1) {
      var0.kl = var1;
   }

   // $VF: synthetic method
   static com.xy.w.Class1 hi(Class7 var0) {
      return var0.kl;
   }

   // $VF: synthetic method
   private void hj(BWDHTeam var1) {
      this.ae = var1 != null ? var1.getId() : 0;
      if (var1 == null) {
         int var5;
         for (int var9 = var5 = 0; var9 < this.kk.length; var9 = var5) {
            this.kk[var5++].kt(null);
         }

         com.xy.i.Class7 var10 = this.km;
         String[] var13 = new String[4];
         String var10004 = "陮";
         var13[0] = "队";
         var10004 = "会";
         var13[1] = "伍";
         var10004 = "呼";
         var13[2] = "名";
         var10004 = "秧";
         var13[3] = "称";
         var10.tg(var13);
      } else {
         RoleShow[] var2 = var1.getRoleShows();

         int var3;
         for (int var10000 = var3 = 0; var10000 < this.kk.length; var10000 = var3) {
            RoleShow var4 = var3 < var2.length ? var2[var3] : null;
            this.kk[var3++].kt(var4);
         }

         String[] var6 = new String[var1.getName().length()];

         int var7;
         for (int var8 = var7 = 0; var8 < var6.length; var8 = var7) {
            String var10002 = var1.getName();
            int var11 = var7;
            var10002 = var10002.substring(var7, var7 + 1);
            var7++;
            var6[var11] = var10002;
         }

         this.km.tg(var6);
      }
   }

   public Class7(GameView var1) {
      super(179, 2, com.xy.q.Class30.afz, var1);
      String var10004 = "V\u0012\n\u0015\n@\u0011D\u000b\u0001K\u0016";
      this.ae = 0;
      this.kl = null;
      this.yy(-1, 0, 632, 234, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/145.png", 60, 60, 200, 100, false), null);
      String var10003 = "\u001etBrB&[%Cg\u0003p";
      this.agi.setImage("sc/e/162.png");
      this.agi.setBounds(590, 10, 27, 27);
      Font var10006 = com.xy.q.Class49.ao;
      String[] var10008 = new String[4];
      String var10011 = "陮";
      var10008[0] = "队";
      var10011 = "会";
      var10008[1] = "伍";
      var10011 = "呼";
      var10008[2] = "名";
      var10011 = "秧";
      var10008[3] = "称";
      this.km = new com.xy.i.Class7(null, -1, 0, var10006, null, var10008, this.eg());
      String var10007 = "\u0006\u0012\u00125\u0013@\u0017A";
      this.km.setForeground(com.xy.q.Class49.c("#c7D6120"));
      this.km.setBounds(25, 59, 20, 120);
      this.km.wp(new com.xy.v.Class32(1, 20, 0, 0));
      this.add(this.km);
      this.kk = new Class29[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.kk.length; var10000 = var2) {
         this.kk[var2] = new Class29(this);
         this.kk[var2].setBounds(39 + 108 * var2, 11, 135, 200);
         this.kk[var2].setVisible(false);
         this.add(this.kk[var2++]);
      }

      String var3 = "\u001etBsB&^$Cg\u0003p";
      this.dn = new com.xy.w.Class18("sc/d/133.png");
      this.dn.setBounds(21, 30, 29, 164);
      this.add(this.dn);
   }

   public void hk(BWDHTeam var1) {
      this.hj(var1);
      this.zc().b(this.lj());
   }

   @Override
   public boolean ah() {
      this.hj(null);
      return super.ah();
   }
}
