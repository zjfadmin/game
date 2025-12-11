package com.xy.a;

import com.xy.game.GameUtil;
import com.xy.game.Task;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.scene.DLDScene;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.List;

public class Class57 extends com.xy.q.Class30 {
   private int cb;
   private com.xy.i.Class18 fn;
   private int ds;
   private InputBean zt;
   private int ah;

   @Override
   public void mouseReleased(MouseEvent var1) {
      super.mouseReleased(var1);
      if (this.zt != null) {
         GameUtil.b(this.zt, this.afx);
         this.zt = null;
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.ds != 1 && this.yx().getTaskSystem() != null) {
         int var2 = 0;
         if (this.afx.scene != null && this.afx.scene instanceof DLDScene) {
            if (var2 == 0) {
               var2 = 20;
               var1.translate(5, var2);
            }

            DLDScene var3;
            RichLabel var4;
            if ((var4 = (var3 = (DLDScene)this.afx.scene).getRichLabel()) != null) {
               var4.paint(var1);
               var2 += var4.getHeight();
               var1.translate(0, var4.getHeight());
            }
         }

         List var7;
         if ((var7 = this.yx().getTaskSystem().getTaskList()) != null && var7.size() != 0) {
            if (var2 == 0) {
               var2 = 20;
               var1.translate(5, var2);
            }

            int var8;
            for (int var10000 = var8 = 0; var10000 < var7.size(); var10000 = ++var8) {
               RichLabel var5;
               if ((var5 = ((Task)var7.get(var8)).getRichLabel()) != null) {
                  var5.paint(var1);
                  var2 += var5.getHeight();
                  var1.translate(0, var5.getHeight());
               }
            }
         }

         if (var2 > 0) {
            var1.translate(-5, -var2);
            if ((var2 = Math.max(100, var2 + 20)) != this.cb) {
               this.setBounds(this.getX(), this.getY(), this.getWidth(), this.cb = var2);
               return;
            }
         } else if (this.cb != 214) {
            this.setBounds(this.getX(), this.getY(), this.getWidth(), this.cb = 214);
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      if (this.ds != 1 && this.yx().getTaskSystem() != null) {
         List var2;
         if ((var2 = this.yx().getTaskSystem().getTaskList()) != null && var2.size() != 0) {
            int var3 = var1.getX();
            int var4 = var1.getY();
            int var5 = 20;

            int var6;
            for (int var10000 = var6 = 0; var10000 < var2.size(); var10000 = ++var6) {
               RichLabel var7;
               if ((var7 = ((Task)var2.get(var6)).getRichLabel()) != null) {
                  InputBean var8;
                  if ((var8 = var7.isMonitor(var3 - 5, var4 - var5)) != null) {
                     this.zt = var8;
                     this.zt.setM(true);
                     return;
                  }

                  var5 += var7.getHeight();
               }
            }
         }
      }
   }

   @Override
   public void t() {
      if (this.ds == 0) {
         this.setBounds(0, 200, 189, this.cb);
      } else {
         this.setBounds(0, 200, 17, 17);
      }
   }

   public void h() {
      Class57 var10000;
      if (this.ds == 0) {
         var10000 = this;
         this.ds = 1;
         String var10003 = "V}\n}\n+\u0014";
         this.fn.setImage("sc/c/51");
         this.fn.setBounds(0, 0, 17, 17);
      } else {
         var10000 = this;
         this.ds = 0;
         String var1 = "qq-q-&;";
         this.fn.setImage("sc/c/49");
         this.fn.setBounds(0, 0, 189, 23);
      }

      var10000.t();
   }

   public void g(int var1) {
      if (this.ah != var1) {
         this.ah = var1;
      }
   }

   public Class57(GameView var1) {
      super(-1, -1, com.xy.q.Class30.afz, var1);
      String var10004 = "V}\n}\n+\u0015";
      this.cb = 214;
      this.yy(0, 200, 189, this.cb, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/c/50", 50, 50, 50, 50, false), null);
      String var10006 = "qq-q-&;";
      this.fn = new com.xy.i.Class18("sc/c/49", 1, 90, this);
      this.fn.setBounds(0, 0, 189, 23);
      this.add(this.fn);
   }
}
