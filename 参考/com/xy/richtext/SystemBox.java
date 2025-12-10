package com.xy.richtext;

import com.xy.br;
import com.xy.cY;
import com.xy.em;
import com.xy.ev;
import com.xy.lz;
import com.xy.z;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.LinkedList;

public class SystemBox {
   private int height;
   private boolean draw;
   private z tcp;
   private String skin;
   private long time;
   private RichLabel label;
   private LinkedList<String> list;
   private String text;
   private int width;
   private GameView gameView;

   public int getWidth() {
      return this.width;
   }

   public void paint(Graphics var1) {
      if (this.draw) {
         if (this.tcp == null) {
            this.tcp = cY.b(cY.m(this.skin));
            return;
         }

         var1 = var1.create(this.gameView.getX(), this.gameView.getY() + this.gameView.screenData.Screen_y - (94 & 123), this.gameView.screenData.Screen_x, 124 & 63);
         long var2 = ev.l();
         this.tcp.d(var2, 5 >> 3);
         br var4;
         if ((var4 = this.tcp.ac()) != null && var4.g() != null) {
            var1.drawImage(var4.g(), (5 >> 1) - var4.k(), (1 ^ 3) - var4.i(), this.gameView.screenData.Screen_x, var4.f(), (ImageObserver)null);
         }

         var1.translate(this.gameView.screenData.Screen_x - (int)((var2 - this.time) / 10L), this.height);
         this.label.paint(var1);
         var1.dispose();
      }

   }

   public void loadText(String var1) {
      synchronized(this) {
         if (var1 == null && this.list != null && this.list.size() > 0) {
            var1 = (String)this.list.removeFirst();
         }

         int var10002;
         if (var1 == null) {
            var10002 = 3 & 4;
            this.tcp = this.text = null;
            this.draw = (boolean)var10002;
         } else {
            this.text = var1;
            SystemBox var10000;
            if (this.label == null) {
               this.label = em.l(var1, lz.y, 30150 & 6713);
               var10000 = this;
            } else {
               this.label.setTextSize(var1, 31741 & 5122);
               var10000 = this;
            }

            var10000.width = this.gameView.screenData.Screen_x + this.label.getWidth();
            var10002 = --1;
            this.height = (55 & 110) - this.label.getHeight();
            this.time = ev.l();
            this.draw = (boolean)var10002;
         }
      }
   }

   public void setHeight(int var1) {
      this.height = var1;
   }

   public void setWidth(int var1) {
      this.width = var1;
   }

   public void addText(String var1) {
      synchronized(this) {
         if (this.text == null) {
            this.loadText(var1);
         } else {
            if (this.list == null) {
               this.list = new LinkedList();
            }

            this.list.addLast(var1);
            if (this.list.size() > (11 & 126)) {
               this.list.removeFirst();
            }

         }
      }
   }

   public void clear() {
      em.b(this.label);
   }

   public void isTime(long var1) {
      synchronized(this) {
         if (this.draw && (var1 - this.time) / 10L > (long)this.width) {
            this.loadText((String)null);
         }

      }
   }

   public SystemBox(String var1, String var2, GameView var3) {
      this.gameView = var3;
      this.skin = var2;
      this.loadText(var1);
   }

   public int getHeight() {
      return this.height;
   }

   public RichLabel getLabel() {
      return this.label;
   }

   public void setLabel(RichLabel var1) {
      this.label = var1;
   }
}
