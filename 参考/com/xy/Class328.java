package com.xy;

import com.xy.bean.RoleSystem;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import com.xy.text.GameMain;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class Class328 extends Class345 {
   private <undefinedtype>[] rz;
   private Class322 aw;
   private Class322 sa;

   public void q() {
      if (this.vd() != null) {
         this.d();
         super.q();
      }
   }

   public void s() {
      long var1 = (long)this.rz[3 & 4].qg.ae() | (long)(this.rz[3 >> 1].qg.ae() << --4) | (long)(this.rz[--2].m << (58 & 77)) | (long)(this.rz[--3].m << (109 & 27)) | (long)(this.rz[15 & 122].m << (90 & 47)) | (long)(this.rz[91 & 47].m << (31 & 107)) | (long)(this.rz[60 & 79].m << (31 & 110));
      if (this.uw().n(1 ^ 3, 95 & 44)) {
         var1 |= (long)(this.rz[13 & 127].m << (56 & 87));
      }

      if (this.aej.systemData.setSystemValue(var1)) {
         this.aej.screenData.a(this.aej.systemData.getShowView());
         this.aej.gameFrame.d();
      }

      GameMain.gameRunnable.setFPS(this.aej.systemData.getFPS());
      this.aej.p();
      RoleSystem var3 = this.vd().getRoleSystem();
      int var4 = 3 >> 2;
      int var10000;
      if (!Class394.z(var3.getIsPk(), this.rz[--4].m)) {
         var10000 = 3 >> 1;
         var3.setIsPk(this.rz[--4].m);
         var4 = var10000;
      }

      if (!Class394.z(var3.getIsNews(), this.rz[--5].m)) {
         var10000 = --1;
         var3.setIsNews(this.rz[--5].m);
         var4 = var10000;
      }

      if (!Class394.z(var3.getIsMail(), this.rz[86 & 47].m)) {
         var10000 = 3 >> 1;
         var3.setIsMail(this.rz[62 & 71].m);
         var4 = var10000;
      }

      if (!Class394.z(var3.getIsFriend(), this.rz[47 & 87].m)) {
         var10000 = 3 >> 1;
         var3.setIsFriend(this.rz[7 & 127].m);
         var4 = var10000;
      }

      if (!Class394.z(var3.getIsGood(), this.rz[72 & 63].m)) {
         var10000 = 3 >> 1;
         var3.setIsGood(this.rz[8].m);
         var4 = var10000;
      }

      if (!Class394.z(var3.getIsTeam(), this.rz[9].m)) {
         var10000 = --1;
         var3.setIsTeam(this.rz[9].m);
         var4 = var10000;
      }

      if (var4 != 0) {
         String var5 = Agreement.getSendTextAES("roleSystem", Class695.b().toJson(var3));
         this.uw().d(var5);
      }

   }

   public Class328(GameView var1) {
      int var10010 = -4 >> 2;
      super(123 & 54, 5 >> 1, Class345.aef, var1);
      this.va(var10010, 3 >> 2, 22378 & 10941, 30687 & 2414, Class345.aei);
      this.uv(Class511.q("sc/d/1.png", 111 & 84, 111 & 84, 111 & 84, 111 & 84, (boolean)(3 ^ 3)), "游戏设置");
      this.sa = new Class322("sc/e/26.png", 4 ^ 5, 119 & 121, Class681.ak, Class681.c, "保存设置", this);
      this.aw = new Class322("sc/e/26.png", --1, 114 & 127, Class681.ak, Class681.c, "退出游戏", this);
      this.sa.setBounds(119 & 107, 8155 & 24892, 119 & 107, 91 & 61);
      this.aw.setBounds(19450 & 13685, 1978 & 31069, 119 & 107, 25 & 127);
      this.add(this.sa);
      this.add(this.aw);
      <undefinedtype>[] var10001 = new <undefinedtype>[this.uw().n(1 ^ 3, 61 & 78) ? 126 & 15 : 13];
      boolean var10003 = true;
      this.rz = var10001;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.rz.length; var10000 = var2) {
         this.rz[var2] = new MouseListener(var2, this) {
            private int fk;
            private Class659 qg;
            private Class436 av;
            private JLabel rk;
            private int m;

            public {
               int var10001 = 3 >> 2;
               this.rk = Class133.c(var10001, 2 & 5, 2 & 5, 2 & 5, var2 < --2 ? 1 ^ 3 : (var2 % --2 == 0 ? --4 : 2), Color.black, Class681.ak);
               var3.add(this.rk);
               if (var2 == 0) {
                  this.qg = new Class659();
                  this.qg.gb((boolean)(3 & 5));
                  this.qg.fx("800*600");
                  this.qg.fx("1024*768");
                  this.qg.fx("1280*960");
                  this.qg.fx("1366*768");
                  var3.add(this.qg);
               } else if (var2 == (4 ^ 5)) {
                  this.qg = new Class659();
                  this.qg.gb((boolean)(3 >> 1));
                  this.qg.fx("30 FPS");
                  this.qg.fx("40 FPS");
                  this.qg.fx("50 FPS");
                  this.qg.fx("60 FPS");
                  var3.add(this.qg);
               } else {
                  this.av = new Class436();
                  this.av.addMouseListener(this);
                  var3.add(this.av);
               }
            }

            public void mouseClicked(MouseEvent var1) {
               this.m = this.m == 0 ? 3 & 5 : 0;
               this.av.fw(this.m == 0 ? "sc/e/29.png" : "sc/e/30.png");
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void cf(int var1, int var2) {
               if (var1 > (109 & 31)) {
                  var1 = -4 >> 2;
               }

               this.fk = var1;
               this.m = var2;
               if (var1 == -4 >> 2) {
                  this.rk.setVisible((boolean)(3 >> 2));
                  this.av.setVisible((boolean)(3 & 4));
                  if (this.qg != null) {
                     this.qg.setVisible((boolean)(3 >> 2));
                  }

               } else {
                  this.rk.setText(var1 == 0 ? "显示设置" : (var1 == --1 ? "频率上限" : (var1 == --2 ? "音乐" : (var1 == --3 ? "音效" : (var1 == --4 ? "切磋开关" : (var1 == --5 ? "拒绝陌生人消息" : (var1 == (95 & 38) ? "信件接收" : (var1 == (63 & 71) ? "加入好友" : (var1 == (61 & 74) ? "接受物品" : (var1 == (77 & 59) ? "接受组队" : (var1 == (122 & 15) ? "老版角色" : (var1 == (31 & 107) ? "关闭飞行特效" : (var1 == (29 & 110) ? "默认小地图右键飞行" : (var1 == (29 & 111) ? "默认寻路使用任我行" : ""))))))))))))));
                  if (var1 == 0) {
                     this.rk.setBounds(127 & 52, 41 & 126, 80 & 127, 94 & 53);
                     this.qg.vf(20469 & 12430, 110 & 57, 116 & 111, 20);
                     this.qg.y(var2);
                     this.rk.setVisible((boolean)(5 >> 2));
                     this.qg.setVisible((boolean)(--1));
                  } else if (var1 == 3 >> 1) {
                     this.rk.setBounds(306, 40, 80, 20);
                     this.qg.vf(386, 40, 100, 20);
                     this.qg.y(var2);
                     this.rk.setVisible((boolean)(3 >> 1));
                     this.qg.setVisible((boolean)(3 & 5));
                  } else {
                     this.rk.setBounds(40 + var1 % (5 >> 1) * 290, 41 + var1 / (5 >> 1) * 35, 170, 20);
                     this.av.setBounds(215 + var1 % (5 >> 1) * 95, 43 + var1 / --2 * 35, 17, 17);
                     this.rk.setVisible((boolean)(5 >> 2));
                     this.av.fw(var2 == 0 ? "sc/e/29.png" : "sc/e/30.png");
                     this.av.setVisible((boolean)(--1));
                     if (this.qg != null) {
                        this.qg.setVisible((boolean)(2 & 5));
                     }

                  }
               }
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }
         };
         this.rz[var2].cf(var2++, 2 & 5);
      }

   }

   public void d() {
      RoleData var1;
      if ((var1 = this.vd()) != null) {
         this.rz[3 ^ 3].cf(2 & 5, this.aej.systemData.getShowView());
         this.rz[--1].cf(3 & 5, this.aej.systemData.getFPSMax());
         this.rz[5 >> 1].cf(--2, this.aej.systemData.h() ? 3 & 5 : 0);
         this.rz[--3].cf(--3, this.aej.systemData.k() ? --1 : 0);
         this.rz[--4].cf(--4, var1.getRoleSystem().getIsPk() == (4 ^ 5) ? 2 ^ 3 : 0);
         this.rz[--5].cf(--5, var1.getRoleSystem().getIsNews() == (2 ^ 3) ? 5 >> 2 : 0);
         this.rz[14 & 119].cf(63 & 70, var1.getRoleSystem().getIsMail() == --1 ? --1 : 0);
         this.rz[87 & 47].cf(31 & 103, var1.getRoleSystem().getIsFriend() == --1 ? 3 >> 1 : 0);
         this.rz[108 & 27].cf(88 & 47, var1.getRoleSystem().getIsGood() == (4 ^ 5) ? 4 ^ 5 : 0);
         this.rz[105 & 31].cf(93 & 43, var1.getRoleSystem().getIsTeam() == 5 >> 2 ? 3 >> 1 : 0);
         this.rz[90 & 47].cf(62 & 75, this.aej.systemData.c() ? --1 : 0);
         this.rz[43 & 95].cf(43 & 95, this.aej.systemData.d() ? 3 & 5 : 0);
         this.rz[15 & 124].cf(93 & 46, this.aej.systemData.l() ? 1 : 0);
         if (this.uw().n(5 >> 1, 31 & 108)) {
            this.rz[29 & 111].cf(13, this.aej.systemData.a() ? 1 : 0);
         }

      }
   }
}
