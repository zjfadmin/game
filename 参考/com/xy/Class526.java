package com.xy;

import com.xy.bean.RoleShow;
import com.xy.game.HandleOption;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.readbean.Robots;
import com.xy.text.GameView;
import java.awt.Graphics;

public class Class526 extends Class292 {
   public TaskProgress y;
   public Task z;

   public void ar(Task var1, TaskProgress var2, Class603 var3) {
      try {
         int var10002 = 3 & 4;
         this.z = var1;
         this.y = var2;
         this.ab = var2.getX();
         this.al = var2.getY();
         this.ar = var10002;
         Robots var5 = var3.at(String.valueOf(var2.getDId()));
         this.ad = var2.getDName();
         Class526 var10000;
         if (var5 != null) {
            this.ai = !Class394.o(var5.getRobottitle()) ? var5.getRobottitle() : null;
            var10000 = this;
         } else {
            var10000 = this;
            this.ai = null;
         }

         var10000.ba(var5 != null ? var5.getRobotskin() : "100", (RoleShow)null);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public void k(Graphics var1) {
   }

   public Class526(Task var1, TaskProgress var2, Class603 var3) {
      int var10004 = 118 & 15;
      super();
      this.ac = var10004;
      this.ar(var1, var2, var3);
   }

   public void a(GameView var1) {
      if (this.y.getType() == (3 & 5) || this.y.getType() == 0) {
         Robots var2;
         String var3 = (var2 = var1.getObjectArea().at(String.valueOf(this.y.getDId()))) != null ? Class394.d(var2.getOther(), "读条=", "|") : null;
         if (!Class394.o(var3)) {
            int var7 = var3.indexOf("#");
            long var4 = Class394.q(var3, 3 >> 2, var7) * 1000L;
            var1.getGameReadBar().setReadBar(this.z.getTaskId(), --5, var3.substring(var7 + (5 >> 2)), (double)var4, Class280.l(), "M" + this.z.getTaskId() + "|" + this.y.getDId());
            return;
         }

         Class472 var6 = (Class472)var1.getFormManagement().e(59 & 95);
         if (var1.getMouseIndex() == Class320.a) {
            int var10000 = 2 & 5;
            var1.setMouseIndex(Class320.l);
            HandleOption.ae(var10000, this, var6);
            return;
         }

         var6.lk(this);
      }

   }

   public int l(Class292 var1) {
      return var1.ah > this.ah ? 3 >> 1 : -1;
   }
}
