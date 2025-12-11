package com.xy.d;

import com.xy.bean.MonsterBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.Class32;
import com.xy.w.Class16;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;

public class Class9 extends Class4 {
   public MonsterBean au;
   public static Image[] av = new Image[4];

   @Override
   public void aj(long var1, com.xy.n.Class0 var3) {
      this.z += var1;
      if (this.ai != null) {
         this.ai.b(var1);
      }

      if (this.au.getFollow() != null) {
         Class8 var4;
         if ((var4 = var3.j(this.au.getFollow())) != null) {
            this.bm(var4.bo(), var4.av());
            return;
         }
      } else if (this.ad != null) {
         if (this.au.getType() == 0 && this.ad.d(var1, this)) {
            this.s(1);
            return;
         }

         this.s(2);
      }
   }

   public Class9(MonsterBean var1) {
      this.aa = 5;
      this.bu(var1);
   }

   @Override
   public int c(Class4 var1) {
      return var1.ab > this.ab ? 1 : -1;
   }

   @Override
   public void d(Graphics var1) {
   }

   public void bu(MonsterBean var1) {
      try {
         this.ae = (this.au = var1).getX();
         this.v = var1.getY();
         this.al = 0;
         this.w = var1.getRobotname();
         this.ag = var1.getRobottitle();
         this.af(var1.getRobotskin(), null);
         if (var1.getMovePath() != null) {
            this.z(0, var1.getMovePath().getTime(), var1.getMovePath().toString());
            return;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   @Override
   public void b(GameView var1) {
      if (this.au.getRobottype() == 3) {
         Class8.bn(this, var1);
      } else if (this.au.getRobottype() == 1) {
         if (var1.roleData.getGoodPackSum(-1L, new BigDecimal(-1), 999) <= 0) {
            String var5 = "胡卫巟溏ＬｯＬ";
            var1.dp("背包已满！！！");
         } else {
            String var3 = Agreement.getSendTextAES("clickmonsters", "" + this.au.getI());
            var1.getClient().k(var3);
         }
      } else if (this.au.getRobottype() < 100 || this.au.getRobottype() > 199) {
         ((com.xy.a.Class6)var1.getFormManagement().j(27)).bx(this);
      } else if (this.au.getRobottype() != 120 && this.au.getRobottype() != 121) {
         if (this.au.getRobottype() == 132) {
            ((com.xy.a.Class6)var1.getFormManagement().j(27)).bx(this);
         } else {
            String var4 = Agreement.getSendTextAES("gangmonitor", "M" + this.au.getI());
            var1.getClient().k(var4);
         }
      } else {
         if (var1.getMouseIndex() == com.xy.v.Class3.d) {
            StringBuilder var10001 = new StringBuilder("M").append(this.au.getI());
            String var10002 = "k整凬";
            String var2 = Agreement.getSendTextAES("gangbattle", var10001.append("|攻击").toString());
            var1.getClient().k(var2);
            var1.setMouseIndex(com.xy.v.Class3.k);
         }
      }
   }

   public void bm(Class32 var1, int var2) {
      this.ae = var1.d + 5;
      this.v = var1.a + 5;
      this.ak = var1.b;
      this.s(var2);
   }

   static {
      String var10002 = "^\r\u0002\f\u0002Y\u00181]\u0000J@U\u0017\u001f\u001bD\u0007@\t\u0003\u001dH\u0003]\u001aT@]\u0000J";
      av[0] = Class16.c("sc/b/75_png.xy2uiimg.sempty.png");
      var10002 = "d,8-8yH?y(97n}b&~\"pa\u007f?dag!p";
      av[1] = Class16.c("sc/b/6_png.xy2uiimg.hps.png");
      var10002 = "^\r\u0002\f\u0002\\r\u001eC\t\u0003\u0016T\\X\u0007D\u0003J@@\u001e^@]\u0000J";
      av[2] = Class16.c("sc/b/2_png.xy2uiimg.mps.png");
      var10002 = "d,8-88v&cag!p";
      av[3] = Class16.c("sc/b/wait.png");
   }

   @Override
   public void aw(Graphics var1) {
      if (this.au.getHP() != null) {
         int var2;
         Graphics var10000;
         if ((var2 = (int)(75.0 * this.au.getHP().getX() / this.au.getHP().getY())) > 75) {
            var2 = 75;
            var10000 = var1;
         } else {
            if (var2 < 0) {
               var2 = 0;
            }

            var10000 = var1;
         }

         var10000.drawImage(av[0], this.x - 35, this.y - 125, 75, 5, null);
         var1.drawImage(av[1], this.x - 35, this.y - 125, var2, 5, null);
      }
   }
}
