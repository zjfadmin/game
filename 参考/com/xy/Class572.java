package com.xy;

import com.xy.bean.MonsterBean;
import com.xy.bean.RoleShow;
import com.xy.game.HandleOption;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;

public class Class572 extends Class292 {
   public MonsterBean p;
   public static Image[] q;

   public void m(Class116 var1, int var2) {
      this.ab = var1.a + --5;
      this.al = var1.b + --5;
      this.as = var1.d;
      this.az(var2);
   }

   public void n(Graphics var1) {
      if (this.p.getHP() != null) {
         Graphics var10000;
         int var2;
         if ((var2 = (int)(75.0D * (double)this.p.getHP().getX() / (double)this.p.getHP().getY())) > (95 & 107)) {
            var2 = 123 & 79;
            var10000 = var1;
         } else {
            if (var2 < 0) {
               var2 = 3 >> 2;
            }

            var10000 = var1;
         }

         var10000.drawImage(q[3 >> 2], this.am - (39 & 123), this.ak - (125 & 127), 111 & 91, --5, (ImageObserver)null);
         var1.drawImage(q[--1], this.am - (47 & 115), this.ak - (127 & 125), var2, --5, (ImageObserver)null);
      }

   }

   public void a(GameView var1) {
      if (this.p.getRobottype() == --3) {
         Class183.al(this, var1);
      } else if (this.p.getRobottype() == (3 & 5)) {
         if (var1.roleData.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 9215 & 24551) <= 0) {
            var1.fw("背包已满！！！");
         } else {
            String var3 = Agreement.getSendTextAES("clickmonsters", "" + this.p.getI());
            var1.getClient().d(var3);
         }
      } else if (this.p.getRobottype() >= (102 & 125) && this.p.getRobottype() <= (28895 & 4071)) {
         String var4;
         if (this.p.getRobottype() != (126 & 121) && this.p.getRobottype() != (125 & 123)) {
            if (this.p.getRobottype() == (22167 & 10732)) {
               ((Class472)var1.getFormManagement().e(59 & 95)).lu(this);
            } else {
               var4 = Agreement.getSendTextAES("gangmonitor", "M" + this.p.getI());
               var1.getClient().d(var4);
            }
         } else {
            if (var1.getMouseIndex() == Class320.a) {
               var4 = Agreement.getSendTextAES("gangbattle", "M" + this.p.getI() + "|攻击");
               var1.getClient().d(var4);
               var1.setMouseIndex(Class320.l);
            }

         }
      } else {
         Class472 var2 = (Class472)var1.getFormManagement().e(123 & 31);
         if (var1.getMouseIndex() == Class320.a) {
            var1.setMouseIndex(Class320.l);
            if (this.p.getRobottype() != --2 && (this.p.getTaskList() == null || (Integer)this.p.getTaskList().get(3 & 4) == 0)) {
               HandleOption.z(this, var2);
               return;
            }
         }

         var2.lu(this);
      }
   }

   public Class572(MonsterBean var1) {
      int var10003 = --5;
      super();
      this.ac = var10003;
      this.p(var1);
   }

   static {
      Image[] var10000 = new Image[--4];
      boolean var10002 = true;
      q = var10000;
      q[3 & 4] = Class511.a("sc/b/75_png.xy2uiimg.sempty.png");
      q[5 >> 2] = Class511.a("sc/b/6_png.xy2uiimg.hps.png");
      q[--2] = Class511.a("sc/b/2_png.xy2uiimg.mps.png");
      q[--3] = Class511.a("sc/b/wait.png");
   }

   public void o(long var1, Class471 var3) {
      this.an += var1;
      if (this.ao != null) {
         this.ao.d(var1);
      }

      if (this.p.getFollow() != null) {
         Class183 var4;
         if ((var4 = var3.a(this.p.getFollow())) != null) {
            this.m(var4.ai(), var4.be());
            return;
         }
      } else if (this.aq != null) {
         if (this.p.getType() == 0 && this.aq.d(var1, this)) {
            this.az(4 ^ 5);
            return;
         }

         this.az(--2);
      }

   }

   public void p(MonsterBean var1) {
      try {
         int var10007 = 5 >> 3;
         this.ab = (this.p = var1).getX();
         this.al = var1.getY();
         this.ar = var10007;
         this.ad = var1.getRobotname();
         this.ai = var1.getRobottitle();
         this.ba(var1.getRobotskin(), (RoleShow)null);
         if (var1.getMovePath() != null) {
            this.av(3 ^ 3, (long)var1.getMovePath().getTime(), var1.getMovePath().toString());
            return;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public int l(Class292 var1) {
      return var1.ah > this.ah ? --1 : -1;
   }

   public void k(Graphics var1) {
   }
}
