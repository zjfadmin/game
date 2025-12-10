package com.xy.scene;

import com.xy.ev;
import com.xy.ho;
import com.xy.lz;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class CountDown {
   private String msg;
   private int type;
   private String name;
   private int id;
   private Image image;
   private long endTime;
   private long time;

   public int getType() {
      return this.type;
   }

   public void a(StringBuffer var1) {
      var1.append(this.type);
      var1.append("$");
      var1.append(this.endTime);
   }

   public void b(Graphics var1, GameView var2) {
      long var3;
      if ((var3 = this.endTime - ev.l()) > 0L) {
         var1.drawImage(this.image, 3 ^ 3, var2.screenData.Screen_y - (10711 & 22186), (ImageObserver)null);
         var3 /= 1000L;
         if (this.time != var3) {
            this.time = var3;
            this.msg = var3 / 60L + ":" + var3 % 60L;
         }

         var1.setColor(Color.YELLOW);
         var1.setFont(lz.at);
         if (this.name != null) {
            var1.drawString(this.name, 30 & 127, var2.screenData.Screen_y - (124 & 103));
         }

         var1.drawString(this.msg, 30 & 127, var2.screenData.Screen_y - (127 & 65));
      }

   }

   public CountDown(int var1, String var2, long var3) {
      int var10007 = 1 ^ 3;
      super();
      this.id = var1;
      this.name = var2;
      this.type = var10007;
      this.image = ho.a("sc/c/71");
      this.endTime = var3;
      this.msg = "";
   }

   public long getEndTime() {
      return this.endTime;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public CountDown(int var1, long var2) {
      this.type = var1;
      this.endTime = var2;
      CountDown var10000;
      if (var1 == 0) {
         var10000 = this;
         this.image = ho.a("sc/c/69");
      } else {
         if (var1 == --1) {
            this.image = ho.a("sc/c/70");
         }

         var10000 = this;
      }

      var10000.msg = "";
   }

   public void setEndTime(long var1) {
      this.endTime = var1;
   }

   public int getId() {
      return this.id;
   }
}
