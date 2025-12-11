package com.xy.a.q;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.formula.GoodType;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class61 extends com.xy.w.Class18 {
   private com.xy.i.Class19 kv;
   private JLabel df;
   private List<JLabel> tr;
   // $VF: synthetic field
   final Class39 agm;
   private ChongjipackBean agn;
   private int eg;
   private List<com.xy.q.Class54> jr;

   public void h() {
      if (this.agn != null) {
         if (this.agm.yx().getGoodPackSum(-1L, new BigDecimal(-1), this.eg) < this.eg) {
            String var3 = "伩皞肅匟乄夅";
            this.agm.afx._do("你的背包不够");
         } else {
            StringBuilder var10001 = new StringBuilder().append(this.agn.getPacktype());
            String var10002 = "\u001f";
            String var2 = Agreement.getSendTextAES("Chongjipacksure", var10001.append("|").append(this.agn.getPackgradetype()).toString());
            this.agm.za().k(var2);
         }
      }
   }

   public void ux(ChongjipackBean var1) {
      if ((this.agn = var1) == null) {
         int var7;
         for (int var12 = var7 = 0; var12 < this.jr.size(); var12 = var7) {
            this.jr.get(var7).gs(0, null);
            Object var13 = this.tr.get(var7);
            var7++;
            ((JLabel)var13).setVisible(false);
         }

         this.setVisible(false);
      } else {
         this.df.setText(var1.getPackgrade());
         List var2 = ChongjipackBean.getGoodsImpactGrade(var1.getPackgoods());
         this.eg = 0;

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.size(); var10000 = ++var3) {
            com.xy.q.Class54 var4 = var3 < this.jr.size() ? this.jr.get(var3) : null;
            if (var4 == null) {
               JLabel var5 = com.xy.q.Class1.f(0, 0, 0, 0, 0, Color.white, com.xy.q.Class49.bz);
               var4 = new com.xy.q.Class54(this.agm.eg());
               String var10003 = "\u0010\fL\u000bL[UA\u0013\u0001\u0004";
               var4.dq("sc/d/46.png");
               var4.wp(com.xy.q.Class54.aut);
               this.tr.add(var5);
               this.jr.add(var4);
               this.add(var5);
               this.add(var4);
            }

            XXGDBean var9;
            Goodstable var6 = (var9 = (XXGDBean)var2.get(var3)) != null ? this.agm.yt().ay(var9.getId()) : null;
            if (var6 != null) {
               this.eg = this.eg + (GoodType.z(var6.getType()) ? 1 : var9.getSum());
            }

            byte var10001;
            Goodstable var10002;
            if (var6 != null) {
               var10001 = 1;
               var10002 = var6;
            } else {
               var10001 = 0;
               var10002 = var6;
            }

            var4.gs(var10001, var10002);
            var4.setBounds(110 + 45 * var3, 8, 35, 35);
            this.tr.get(var3).setText(String.valueOf(var9.getSum()));
            this.tr.get(var3).setBounds(113 + 45 * var3, 8, 14, 14);
            this.tr.get(var3).setVisible(var6 != null);
         }

         for (int var10 = var3 = var2.size(); var10 < this.jr.size(); var10 = var3) {
            this.jr.get(var3).gs(0, null);
            Object var11 = this.tr.get(var3);
            var3++;
            ((JLabel)var11).setVisible(false);
         }

         this.setVisible(true);
      }
   }

   public Class61(Class39 var1) {
      super(com.xy.w.Class16.m("sc/d/36.png", 15, 15, 15, 15, false));
      String var10005 = "i*5-5z,gj'}";
      this.agm = var1;
      this.df = com.xy.q.Class1.k(10, 14, 100, 24, com.xy.q.Class49.ap[0], com.xy.q.Class49.bx);
      this.add(this.df);
      String var10007 = "\u0010\fL\nL\\RA\u0013\u0001\u0004";
      String var10012 = "颜i双";
      this.kv = new com.xy.i.Class19("sc/e/31.png", 1, 190, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "领 取", var1.eg());
      this.kv.gw(this);
      this.kv.setBounds(330, 12, 79, 25);
      this.add(this.kv);
      this.jr = new ArrayList<>();
      this.tr = new ArrayList<>();
   }

   public void tg(String[] var1) {
      if (this.agn != null) {
         if (Class71.aba(var1, 10, this.agn.getPackgradetype())) {
            String var2 = "i*5,5|\"gj'}";
            this.kv.setBtn(-1, "sc/e/58.png");
         } else {
            String var10002 = "\u0010\fL\nL\\RA\u0013\u0001\u0004";
            this.kv.setBtn(1, "sc/e/31.png");
         }
      }
   }
}
