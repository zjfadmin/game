package com.xy.d;

import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.readbean.Robots;
import com.xy.text.GameReadBar;
import com.xy.text.GameView;
import com.xy.v.Class12;
import com.xy.v.Class22;
import java.awt.Graphics;

public class Class0 extends Class4 {
   public Task a;
   public TaskProgress b;

   public void a(Task var1, TaskProgress var2, com.xy.v.Class8 var3) {
      try {
         this.a = var1;
         this.b = var2;
         this.ae = var2.getX();
         this.v = var2.getY();
         this.al = 0;
         Robots var4 = var3.bo(String.valueOf(var2.getDId()));
         this.w = var2.getDName();
         Class0 var10000;
         if (var4 != null) {
            this.ag = !Class12.h(var4.getRobottitle()) ? var4.getRobottitle() : null;
            var10000 = this;
         } else {
            var10000 = this;
            this.ag = null;
         }

         var10000.af(var4 != null ? var4.getRobotskin() : "100", null);
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void b(GameView var1) {
      if (this.b.getType() == 1 || this.b.getType() == 0) {
         Robots var2;
         String var7;
         if ((var2 = var1.getObjectArea().bo(String.valueOf(this.b.getDId()))) != null) {
            var7 = var2.getOther();
            String var10001 = "讗朹Q";
            String var10002 = "M";
            var7 = Class12.ai(var7, "读条=", "|");
         } else {
            var7 = null;
         }

         String var3 = var7;
         if (!Class12.h(var3)) {
            String var10003 = "O";
            int var4 = var3.indexOf("#");
            long var5 = Class12.s(var3, 0, var4) * 1000L;
            GameReadBar var8 = var1.getGameReadBar();
            int var9 = this.a.getTaskId();
            var10003 = var3.substring(var4 + 1);
            double var10004 = var5;
            long var10005 = Class22.l();
            StringBuilder var10006 = new StringBuilder("M").append(this.a.getTaskId());
            String var10007 = "M";
            var8.setReadBar(var9, 5, var10003, var10004, var10005, var10006.append("|").append(this.b.getDId()).toString());
            return;
         }

         ((com.xy.a.Class6)var1.getFormManagement().j(27)).bm(this);
      }
   }

   @Override
   public int c(Class4 var1) {
      return var1.ab > this.ab ? 1 : -1;
   }

   @Override
   public void d(Graphics var1) {
   }

   public Class0(Task var1, TaskProgress var2, com.xy.v.Class8 var3) {
      this.aa = 6;
      this.a(var1, var2, var3);
   }
}
