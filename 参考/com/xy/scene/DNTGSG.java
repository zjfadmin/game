package com.xy.scene;

import com.xy.ev;
import com.xy.ho;
import com.xy.lz;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class DNTGSG {
   private String msg0;
   private int value1;
   private String msg1;
   private int value0;
   private int max;
   private String msg;
   private long time;
   private int length0;
   private Image image;
   private Image image2;
   private int length1;
   private long endTime;

   public DNTGSG() {
      int var10007 = 3 ^ 3;
      int var10009 = 3 ^ 3;
      super();
      this.image = ho.a("sc/c/78");
      this.image2 = ho.a("sc/c/79");
      this.endTime = System.currentTimeMillis() + 1800000L;
      this.length0 = var10009;
      this.length1 = var10007;
      this.msg = "";
      this.msg0 = "";
      this.msg1 = "";
   }

   public void a(int var1, int var2) {
      if (var1 == 0) {
         this.value0 = var2;
         this.length0 = this.image2.getWidth((ImageObserver)null) * var2 / this.max;
         this.msg0 = var2 + "/" + this.max;
      } else {
         this.value1 = var2;
         this.length1 = this.image2.getWidth((ImageObserver)null) * var2 / this.max;
         this.msg1 = var2 + "/" + this.max;
      }
   }

   public void b(Graphics var1, GameView var2) {
      long var3;
      if ((var3 = this.endTime - ev.l()) > 0L) {
         int var5 = (var2.screenData.Screen_x - this.image.getWidth((ImageObserver)null)) / (1 ^ 3);
         var1.drawImage(this.image, var5, 114 & 63, (ImageObserver)null);
         var3 /= 1000L;
         if (this.time != var3) {
            this.time = var3;
            this.msg = var3 / 60L + ":" + var3 % 60L;
         }

         var1.setColor(Color.RED);
         var1.setFont(lz.aw);
         var1.drawString(this.msg, var5 + --5, 83 & 124);
         var1.setColor(Color.white);
         var1.setFont(lz.bm);
         var1.drawString(this.msg0, var5 + (31420 & 1507), 108 & 87);
         var1.drawImage(this.image2, var5 + (118 & 109), 70 & 125, this.length0, 1 ^ 3, (ImageObserver)null);
         var1.drawString(this.msg1, var5 + (14259 & 18668), 87 & 127);
         var1.drawImage(this.image2, var5 + (124 & 103), 119 & 95, this.length1, --2, (ImageObserver)null);
      }

   }

   public void c(String var1) {
      String[] var2 = var1.split("&");
      int var10000 = 5 >> 3;
      int var10003 = 5 >> 2;
      this.endTime = Long.parseLong(var2[2 & 5]);
      this.max = Integer.parseInt(var2[var10003]);
      this.a(var10000, this.value0);
      this.a(var10003, this.value1);
   }
}
