package com.xy.a;

import com.xy.formula.FormulaNum;
import com.xy.readbean.Door;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Class125 extends com.xy.w.Class18 implements MouseListener {
   private List<RichLabel> wq;
   // $VF: synthetic field
   final Class121 atb;
   private RichLabel ck;
   private InputBean aan;

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.aan != null) {
         this.aan.setM(false);
         Door var2;
         MapModel var3 = (var2 = this.atb.yt().c(this.aan.getId().toString())) != null ? this.atb.yt().g(var2.getDoormap()) : null;
         if (var3 == null) {
            return;
         }

         if (!this.atb.akm(var3)) {
            return;
         }

         String var10002 = var2.getDoorpoint();
         String var10003 = "\u0001";
         int var4 = var10002.indexOf("|");
         int var5 = com.xy.v.Class12.ad(var2.getDoorpoint(), 0, var4);
         int var6 = com.xy.v.Class12.ad(var2.getDoorpoint(), var4 + 1, var2.getDoorpoint().length());
         var5 = (int)(var5 / Class121.akp(this.atb) - 13.0);
         var6 = (int)(var6 / Class121.akp(this.atb) - 6.0);
         var5 += Class121.ajy(this.atb)[2].getX();
         var6 += Class121.ajy(this.atb)[2].getY();
         Class121.akb(this.atb, var5);
         Class121.ake(this.atb, var6);
         Class121.akg(this.atb, true);
      }
   }

   public Class125(Class121 var1) {
      super(com.xy.w.Class16.m("sc/b/S0.png", 6, 6, 6, 6, false));
      String var10004 = "9gefeWz*:j-";
      this.atb = var1;
      String var10006 = "^g厒伞遼刎亘丵坍炇G";
      this.ck = new RichLabel("#Y可传送到以下地点:", com.xy.q.Class49.ac, 180);
      this.ck.setBounds(7, 11, this.ck.getWidth(), this.ck.getHeight());
      this.add(this.ck);
      this.addMouseListener(this);
      this.wq = new ArrayList<>();
   }

   public void akz(NpcInfoBean var1) {
      this.aan = null;
      com.xy.v.Class8 var2 = this.atb.yt();
      List<Door> var3;
      if ((var3 = var1.getDoors()) == null && !com.xy.v.Class12.h(var1.getNpctable().getNpcway())) {
         var3 = new ArrayList();
         String var4 = var1.getNpctable().getNpcway();
         int var5 = 0;
         int var6;
         int var10000 = var6 = 0;

         while (var10000 != var4.length()) {
            String var10001 = "6";
            if ((var6 = var4.indexOf("|", var5 + 1)) == -1) {
               var6 = var4.length();
            }

            FormulaNum var7 = new FormulaNum(var4.substring(var5, var6));
            int var8 = 0;
            int var9 = var7.getSize();

            for (int var22 = var8; var22 < var9; var22 = ++var8) {
               long var10 = var7.getZhi(var8);
               Door var12;
               if ((var12 = var2.c(String.valueOf(var10))) != null) {
                  var3.add(var12);
               }
            }

            var5 = var6 + 1;
            var10000 = var6;
         }

         var1.setDoors(var3);
      }

      int var13 = var3 != null ? var3.size() : 0;

      int var14;
      for (int var23 = var14 = 0; var23 < var13; var23 = var14) {
         Door var17 = var3.get(var14);
         RichLabel var18 = var14 < this.wq.size() ? this.wq.get(var14) : null;
         if (var18 == null) {
            var18 = new RichLabel("", com.xy.q.Class49.ac);
            this.wq.add(var18);
            this.add(var18);
         }

         MapModel var19 = var2.g(var17.getDoormap());
         InputBean var20 = new InputBean(13);
         var20.setId(new BigDecimal(var17.getDoorid()));
         String var27;
         if (var19 != null) {
            var27 = var19.getMapName();
         } else {
            var27 = "朔瞘圎嚃";
            var27 = "未知地图";
         }

         var20.setName(var27);
         StringBuffer var21;
         StringBuffer var24 = var21 = new StringBuffer();
         var27 = "'\u0013";
         var24.append("#Y");
         String var10002 = "\u001d+";
         var21.append("#V");
         var21.append(com.xy.v.Class31.a().toJson(var20));
         String var10004 = "'\u0006";
         var21.append("#L");
         var18.setTextSize(var21.toString(), 180);
         int var10008 = 32 + var14 * 22;
         int var10009 = var18.getWidth();
         var14++;
         var18.setBounds(7, var10008, var10009, 22);
         var18.setVisible(true);
      }

      for (int var25 = var14 = var13; var25 < this.wq.size(); var25 = var14) {
         Object var26 = this.wq.get(var14);
         var14++;
         ((RichLabel)var26).setVisible(false);
      }

      this.setBounds(0, 0, 185, Math.max(90, 46 + var13 * 22));
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.isMetaDown()) {
         Class121.ako(this.atb).setVisible(false);
      } else {
         int var2;
         for (int var10000 = var2 = 0; var10000 < this.wq.size(); var10000 = ++var2) {
            RichLabel var3;
            if (!(var3 = this.wq.get(var2)).isVisible()) {
               return;
            }

            this.aan = var3.isMonitor(var1.getX() - var3.getX(), var1.getY() - var3.getY());
            if (this.aan != null) {
               this.aan.setM(true);
               return;
            }
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}
