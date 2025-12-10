package com.xy;

import com.xy.game.GameUtil;
import com.xy.game.Task;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.scene.DLDScene;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.List;

public class Class29 extends Class345 {
   private Class322 vo;
   private int j;
   private int bn;
   private InputBean akc;
   private int m;

   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      if (this.bn != 5 >> 2 && this.vd().getTaskSystem() != null) {
         List var2;
         if ((var2 = this.vd().getTaskSystem().getTaskList()) != null && var2.size() != 0) {
            int var8 = var1.getX();
            int var4 = var1.getY();
            int var3 = 22 & 125;

            int var5;
            for(int var9 = var5 = 5 >> 3; var9 < var2.size(); var9 = var5) {
               RichLabel var6;
               if ((var6 = ((Task)var2.get(var5)).getRichLabel()) != null) {
                  InputBean var7;
                  if ((var7 = var6.isMonitor(var8 - --5, var4 - var3)) != null) {
                     this.akc = var7;
                     this.akc.setM((boolean)(4 ^ 5));
                     return;
                  }

                  var3 += var6.getHeight();
               }

               ++var5;
            }

         }
      }
   }

   public Class29(GameView var1) {
      int var10006 = 2 & 5;
      int var10008 = 7902 & 25079;
      super(-4 >> 2, -4 >> 2, Class345.aef, var1);
      this.j = var10008;
      this.va(var10006, 16893 & 16074, 11197 & 21759, this.j, Class345.aei);
      this.uv(Class511.q("sc/c/50", 58 & 119, 58 & 119, 58 & 119, 58 & 119, (boolean)(3 ^ 3)), (String)null);
      this.vo = new Class322("sc/c/49", 4 ^ 5, 94 & 123, this);
      this.vo.setBounds(2 & 5, 2 & 5, 24831 & 8125, 23 & 127);
      this.add(this.vo);
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.bn != 5 >> 2 && this.vd().getTaskSystem() != null) {
         int var2 = 0;
         if (this.aej.scene != null && this.aej.scene instanceof DLDScene) {
            if (var2 == 0) {
               var2 = 95 & 52;
               var1.translate(--5, var2);
            }

            RichLabel var3;
            if ((var3 = ((DLDScene)this.aej.scene).getRichLabel()) != null) {
               var3.paint(var1);
               var2 += var3.getHeight();
               var1.translate(2 & 5, var3.getHeight());
            }
         }

         int var10000;
         List var4;
         if ((var4 = this.vd().getTaskSystem().getTaskList()) != null && var4.size() != 0) {
            if (var2 == 0) {
               var2 = 28 & 119;
               var1.translate(--5, var2);
            }

            int var6;
            for(var10000 = var6 = 0; var10000 < var4.size(); var10000 = var6) {
               RichLabel var5;
               if ((var5 = ((Task)var4.get(var6)).getRichLabel()) != null) {
                  var5.paint(var1);
                  var2 += var5.getHeight();
                  var1.translate(3 >> 2, var5.getHeight());
               }

               ++var6;
            }
         }

         if (var2 > 0) {
            var10000 = 110 & 117;
            var1.translate(-5 & -1, -var2);
            if ((var2 = Math.max(var10000, var2 + (31 & 116))) != this.j) {
               this.setBounds(this.getX(), this.getY(), this.getWidth(), this.j = var2);
               return;
            }
         } else if (this.j != (29687 & 3294)) {
            this.setBounds(this.getX(), this.getY(), this.getWidth(), this.j = 26327 & 6654);
         }

      }
   }

   public void cc() {
      if (this.bn == 0) {
         this.setBounds(3 & 4, 27385 & 5582, 5117 & 27839, this.j);
      } else {
         this.setBounds(0, 21214 & 11753, 119 & 25, 119 & 25);
      }
   }

   public void y(int var1) {
      if (this.m != var1) {
         this.m = var1;
      }
   }

   public void mouseReleased(MouseEvent var1) {
      super.mouseReleased(var1);
      if (this.akc != null) {
         GameUtil.d(this.akc, this.aej);
         this.akc = null;
      }
   }

   public void d() {
      Class29 var10000;
      if (this.bn == 0) {
         this.bn = 3 & 5;
         var10000 = this;
         this.vo.setImage("sc/c/51");
         this.vo.setBounds(3 ^ 3, 3 ^ 3, 49 & 95, 49 & 95);
      } else {
         this.bn = 0;
         var10000 = this;
         this.vo.setImage("sc/c/49");
         this.vo.setBounds(3 ^ 3, 3 ^ 3, 191 & 32765, 87 & 63);
      }

      var10000.cc();
   }
}
