package com.xy.richtext;

import com.xy.em;
import com.xy.ev;
import com.xy.lz;
import com.xy.z;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

public class SystemBoxNew1 {
   private long time;
   private boolean draw;
   private String text;
   private int width;
   private LinkedList<String> list;
   private GameView gameView;
   private int height;
   private RichLabel label;
   private String skin;

   public void setLabel(RichLabel var1) {
      this.label = var1;
   }

   public void isTime(long var1) {
      synchronized(this) {
         if (this.draw && (var1 - this.time) / 7L > (long)this.width) {
            this.loadText((String)null);
         }

      }
   }

   public int getHeight() {
      return this.height;
   }

   public void paint(Graphics var1) {
      if (this.draw) {
         var1 = var1.create(this.gameView.getX(), 12477 & 20462, this.gameView.screenData.Screen_x, 91 & 62);
         long var2 = ev.l();
         Graphics2D var10000 = (Graphics2D)var1;
         Graphics2D var10002 = (Graphics2D)var1;
         Composite var4 = ((Graphics2D)var1).getComposite();
         var10000.setComposite(z.m);
         var10002.setColor(Color.BLACK);
         var10000.fillRect(5 >> 3, 5 >> 3, this.gameView.screenData.Screen_x, 95 & 58);
         var10002.setComposite(var4);
         var1.translate(this.gameView.screenData.Screen_x - (int)((var2 - this.time) / 7L), this.height);
         this.label.paint(var1);
         var1.dispose();
      }

   }

   public void setHeight(int var1) {
      this.height = var1;
   }

   public void setWidth(int var1) {
      this.width = var1;
   }

   public int getWidth() {
      return this.width;
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
            if (this.list.size() > (42 & 95)) {
               this.list.removeFirst();
            }

         }
      }
   }

   public SystemBoxNew1(String var1, String var2, GameView var3) {
      this.gameView = var3;
      this.skin = var2;
      this.loadText(var1);
   }

   public void loadText(String var1) {
      synchronized(this) {
         if (var1 == null && this.list != null && this.list.size() > 0) {
            var1 = (String)this.list.removeFirst();
         }

         int var10002;
         if (var1 == null) {
            var10002 = 3 & 4;
            this.text = null;
            this.draw = (boolean)var10002;
         } else {
            var1 = "#Z" + var1;
            this.text = var1;
            SystemBoxNew1 var10000;
            if (this.label == null) {
               this.label = em.l(var1, lz.ao, 29120 & 7743);
               var10000 = this;
            } else {
               this.label.setTextSize(var1, 30164 & 6699);
               var10000 = this;
            }

            var10000.width = this.gameView.screenData.Screen_x + this.label.getWidth();
            var10002 = 3 >> 1;
            this.height = (89 & 63) - this.label.getHeight();
            this.time = ev.l();
            this.draw = (boolean)var10002;
         }
      }
   }

   public void clear() {
      em.b(this.label);
   }

   public RichLabel getLabel() {
      return this.label;
   }
}
