package com.xy.a;

import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Class58 extends com.xy.w.Class18 implements MouseListener {
   private List<RichLabel> wq;
   private RichLabel cj;
   // $VF: synthetic field
   final Class100 aam;
   private InputBean aan;

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.aan != null) {
         this.aan.setM(false);
         if (!Class100.adp(this.aam).isVisible()) {
            return;
         }

         MapModel var2;
         if ((var2 = this.aam.yt().g(this.aan.getId().toString())) == null) {
            return;
         }

         ((Class121)this.aam.zc().j(22)).mc(var2);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.isMetaDown()) {
         Class100.adp(this.aam).setVisible(false);
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

   public Class58(Class100 var1) {
      super(com.xy.w.Class16.m("sc/b/S0.png", 6, 6, 6, 6, false));
      String var10004 = "g\u001e;\u001f;.$Sd\u0013s";
      this.aam = var1;
      String var10006 = "FZ厊扐彥仦乮圳嚛9";
      this.cj = new RichLabel("#Y可打开以下地图:", com.xy.q.Class49.ac, 180);
      this.cj.setBounds(7, 11, this.cj.getWidth(), this.cj.getHeight());
      this.add(this.cj);
      this.addMouseListener(this);
      this.wq = new ArrayList<>();
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public void n(int var1) {
      this.aan = null;
      com.xy.v.Class8 var2 = this.aam.yt();
      int var3 = 0;
      short var4 = 0;
      short var5 = 0;
      short var10000;
      if (var1 == -1) {
         var4 = 1282;
         var5 = 1288;
         var10000 = var4;
      } else if (var1 == -2) {
         var4 = 1289;
         var5 = 1295;
         var10000 = var4;
      } else if (var1 == -3) {
         var4 = 1268;
         var5 = 1271;
         var10000 = var4;
      } else if (var1 == -4) {
         var4 = 1221;
         var5 = 1227;
         var10000 = var4;
      } else {
         if (var1 == -5) {
            var4 = 1273;
            var5 = 1276;
         }

         var10000 = var4;
      }

      int var6 = var10000;

      for (int var17 = var6; var17 <= var5; var17 = ++var6) {
         int var7 = var6;
         if (var1 == -4 && var6 == 1227) {
            var7 = 3311;
         }

         MapModel var8;
         if ((var8 = var2.g(String.valueOf(var7))) != null) {
            RichLabel var9 = var3 < this.wq.size() ? this.wq.get(var3) : null;
            if (var9 == null) {
               var9 = new RichLabel("", com.xy.q.Class49.ac);
               this.wq.add(var9);
               this.add(var9);
            }

            InputBean var10 = new InputBean(14);
            var10.setId(new BigDecimal(var8.getMapId()));
            String var10001;
            if (var8 != null) {
               var10001 = var8.getMapName();
            } else {
               var10001 = "杗矱坍囪";
               var10001 = "未知地图";
            }

            var10.setName(var10001);
            StringBuffer var11;
            StringBuffer var18 = var11 = new StringBuffer();
            var10001 = "FZ";
            var18.append("#Y");
            String var10002 = "^B";
            var11.append("#V");
            var11.append(com.xy.v.Class31.a().toJson(var10));
            String var10004 = "FO";
            var11.append("#L");
            var9.setTextSize(var11.toString(), 180);
            int var10008 = 32 + var3 * 22;
            int var10009 = var9.getWidth();
            var3++;
            var9.setBounds(7, var10008, var10009, 22);
            var9.setVisible(true);
         }
      }

      for (int var19 = var6 = var3; var19 < this.wq.size(); var19 = var6) {
         Object var20 = this.wq.get(var6);
         var6++;
         ((RichLabel)var20).setVisible(false);
      }

      this.setBounds(0, 0, 185, Math.max(90, 46 + var3 * 22));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }
}
