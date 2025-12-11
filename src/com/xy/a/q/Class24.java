package com.xy.a.q;

import com.xy.formula.ExpUtil;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

class Class24 extends com.xy.w.Class18 {
   private JLabel[] ay;
   // $VF: synthetic field
   final Class97 rd;
   private com.xy.w.Class18 dm;
   private com.xy.w.Class18 dn;

   public void h() {
      int var10000 = 1;
      this.dm.setVisible(false);
      this.dn.setVisible(false);

      for (int var1 = 1; var10000 < this.ay.length; var10000 = var1) {
         this.ay[var1++].setVisible(false);
      }

      Goodstable var15;
      if ((var15 = (Goodstable)Class97.aik(this.rd)[0].ep().jx()) == null) {
         this.ay[0].setForeground(Color.gray);
         JLabel var25 = this.ay[0];
         String var28 = "说攎兦巂朊觹醑抰皇裵处";
         var25.setText("请放入已有觉醒技的装备");
         this.ay[0].setBounds(0, 0, 165, 56);
      } else {
         String var16 = var15.getValue();
         String var19 = "N~";
         String[] var17 = var16.split("\\|");
         var19 = "觊醢抃";
         String var3;
         if ((var3 = MsgUntil.getValuesMessage(var17, "觉醒技")) == null) {
            this.ay[0].setForeground(Color.red);
            JLabel var24 = this.ay[0];
            String var27 = "诧裗夅迊沣望觋醀抂";
            var24.setText("该装备还没有觉醒技");
            this.ay[0].setBounds(0, 0, 165, 56);
         } else {
            var19 = "%";
            String[] var4;
            long var5;
            long var7 = ExpUtil.d(var5 = Long.parseLong((var4 = var3.split("&"))[3]));
            long var9 = ExpUtil.getPetSkillNowExp(var5);
            long var11 = ExpUtil.getPetSkillMaxExp(var7);
            JLabel var10003 = this.ay[1];
            String var10006 = "觛醐抒8";
            var10003.setText("觉醒技:" + var4[0]);
            JLabel var10002 = this.ay[2];
            String var10005 = "筊\u0010#纗9";
            var10002.setText("等  级:" + var7);
            JLabel var22 = this.ay[3];
            String var26 = "绍2\"骞8";
            var22.setText("经  验:");
            int var13 = new BigDecimal(var9).multiply(new BigDecimal(104)).divide(new BigDecimal(var11), 2, 4).intValue();
            this.dm.setBounds(55, 39, var13 == 0 ? 1 : var13, 12);
            var10000 = 1;
            this.ay[0].setForeground(Color.white);
            JLabel var10004 = this.ay[0];
            StringBuilder var29 = new StringBuilder(String.valueOf(var9));
            var10006 = ",";
            var10004.setText(var29.append("/").append(var11).toString());
            this.ay[0].setBounds(52, 36, 110, 18);
            this.dm.setVisible(true);
            this.dn.setVisible(true);

            for (int var14 = 1; var10000 < this.ay.length; var10000 = var14) {
               this.ay[var14++].setVisible(true);
            }
         }
      }
   }

   public Class24(Class97 var1) {
      super(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      String var10003 = "qq-v-#5<r|e";
      this.rd = var1;
      this.ay = new JLabel[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ay.length; var10000 = var2) {
         this.ay[var2] = com.xy.q.Class1.f(0, 0, 0, 0, var2 == 0 ? 0 : 10, Color.white, com.xy.q.Class49.bz);
         this.add(this.ay[var2++]);
      }

      this.ay[1].setBounds(11, 3, 151, 16);
      this.ay[2].setBounds(11, 19, 151, 16);
      this.ay[3].setBounds(11, 36, 151, 16);
      String var10007 = "pS,T,\u00064\u001es^d";
      this.dm = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/67.png", 3, 3, 3, 3, false));
      String var10006 = "qq-v-#5<r|e";
      this.dn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.dn.setBounds(52, 36, 110, 18);
      this.add(this.dm);
      this.add(this.dn);
   }
}
