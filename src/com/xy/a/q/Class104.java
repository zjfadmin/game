package com.xy.a.q;

import com.xy.socket.Agreement;
import com.xy.text.GameView;

public class Class104 extends com.xy.q.Class30 {
   private Class36[] awb;
   private com.xy.i.Class19 kc;
   private int eg;
   private int ah;

   public Class104(GameView var1) {
      super(124, 2, com.xy.q.Class30.afz, var1);
      String var10004 = "/osns_n5m\",b;";
      this.yy(-1, 0, 631, 387, com.xy.q.Class30.agh);
      this._do("sc/b/S291.png");
      this.agi.setBounds(592, 91, 25, 25);
      this.awb = new Class36[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.awb.length; var10000 = var2) {
         this.awb[var2] = new Class36(this, var2);
         this.awb[var2].setBounds(30, 133 + var2 * 62, 580, 50);
         this.add(this.awb[var2++]);
      }

      String var10006 = "z5&3&d?xy8n";
      String var10011 = "硢密逅抵";
      this.kc = new com.xy.i.Class19("sc/e/26.png", 1, 65, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "确定选择", this);
      this.kc.setBounds(267, 333, 99, 26);
      this.add(this.kc);
   }

   // $VF: synthetic method
   static Class36[] ame(Class104 var0) {
      return var0.awb;
   }

   public void ci(String var1) {
      String var10002 = "K";
      this.eg = var1.startsWith("B") ? 0 : 1;
      var10002 = "P ";
      this.ah = 0;
      String[] var2 = var1.split("\\|");
      var2[0] = var2[0].substring(1);
      Class104 var7;
      if (this.eg == 0) {
         int var3;
         for (int var10000 = var3 = 0; var10000 < 3; var10000 = ++var3) {
            String var4 = var3 < var2.length ? var2[var3] : "";
            this.awb[var3].n(!var4.equals("") ? Integer.parseInt(var4) : 0);
            this.awb[var3].setVisible(Class36.se(this.awb[var3]) != 0);
         }

         var7 = this;
      } else {
         if (this.eg == 1) {
            int var8 = 0;
            this.ah = Integer.parseInt(var2[0]);

            for (int var5 = 0; var8 < 3; var8 = ++var5) {
               String var6 = var5 + 1 < var2.length ? var2[var5 + 1] : "";
               this.awb[var5].n(!var6.equals("") ? Integer.parseInt(var6) : 0);
               this.awb[var5].setVisible(Class36.se(this.awb[var5]) != 0);
            }
         }

         var7 = this;
      }

      var7.zc().b(this.lj());
   }

   public void h() {
      int var1;
      if ((var1 = this.dx()) == -1) {
         String var4 = "佩辎朣遟两\u0014\\\u0010O";
         this.afx._do("你还未选中BUFF");
      } else {
         Class104 var10000;
         if (this.eg == 0) {
            String var10003 = "\u001e";
            String var2 = Agreement.getSendTextAES("teamArena", "B" + var1);
            var10000 = this;
            this.za().k(var2);
         } else {
            if (this.eg == 1) {
               String var5 = "]";
               StringBuilder var10001 = new StringBuilder("T").append(this.ah);
               String var10002 = " ";
               String var3 = Agreement.getSendTextAES("teamArena", var10001.append("|").append(var1).toString());
               this.za().k(var3);
            }

            var10000 = this;
         }

         var10000.zc().f(this.lj());
      }
   }

   public int dx() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.awb.length; var10000 = ++var1) {
         if (this.awb[var1].getBorder() != null) {
            return Class36.se(this.awb[var1]);
         }
      }

      return -1;
   }
}
