package com.xy;

import com.xy.bean.TeamBean;
import com.xy.entity.TeamRole;
import com.xy.formula.SkillUtil;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import javax.swing.JLabel;

public class Class520 extends Class345 {
   private Image ll;
   private Class604 axy;
   private JLabel as;
   private int fk;
   private int ay;
   private Image bx;
   private Class604 axm;
   private <undefinedtype>[] axz;
   private Class554[] bz;

   public void q() {
      if (this.aej.roleData.teamBean != null) {
         this.d();
         super.q();
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      long var2 = Class280.l();
      Class8 var4;
      if ((var4 = Class222.o()) != null) {
         int var10002 = 95 & 124;
         var4.d(var2, 3 & 4);
         var4.aa(var1, var10002, 62 & 107);
      }

      int var5;
      for(int var10000 = var5 = 0; var10000 < this.axz.length; var10000 = var5) {
         var1.translate(this.axz[var5].getX(), this.axz[var5].getY());
         this.axy.g(var1, 121 & 86, 9194 & 23743);
         var1.drawImage(this.bx, --2, 118 & 127, 126 & 77, --1, (ImageObserver)null);
         var1.drawImage(this.bx, 5 >> 1, 26815 & 6093, 94 & 109, 4 ^ 5, (ImageObserver)null);
         if (this.axz[var5].isVisible()) {
            if (var5 == this.ay || var5 == this.fk) {
               this.axm.g(var1, 84 & 127, 23791 & 9150);
            }

            if (this.axz[var5].xj != null) {
               this.axz[var5].xj.a(var1, 40 & 127, 127 & 108, --4, var2);
            }
         }

         int var10001 = -this.axz[var5].getX();
         <undefinedtype> var6 = this.axz[var5];
         ++var5;
         var1.translate(var10001, -var6.getY());
      }

   }

   public TeamRole ane() {
      return this.ay == -4 >> 2 ? null : this.axz[this.ay].add;
   }

   public void dp(int var1) {
      this.ay = var1;
   }

   public void as(int var1) {
      int var10001;
      String var3;
      TeamRole var4;
      if (var1 == 5 >> 2) {
         if ((var4 = this.ane()) == null) {
            this.aej.f("你没有选中的玩家");
         } else if (var4.getRoleId().compareTo(this.vd().getLoginResult().getRole_id()) == 0) {
            this.aej.f("不能选中你自己");
         } else {
            var3 = Agreement.getSendTextAES("team5", "S" + var4.getRoleId());
            var10001 = -4 >> 2;
            this.uw().d(var3);
            this.dp(var10001);
         }
      } else {
         String var2;
         if (var1 == (1 ^ 3)) {
            var2 = Agreement.getSendTextAES("team6", (String)null);
            this.uw().d(var2);
         } else if (var1 != --3 && var1 != (23 & 110)) {
            if (var1 == --4) {
               if ((var4 = this.ane()) == null) {
                  this.aej.f("你没有选中的玩家");
               } else if (var4.getRoleId().compareTo(this.vd().getLoginResult().getRole_id()) == 0) {
                  this.aej.f("不能选中你自己");
               } else {
                  var3 = Agreement.getSendTextAES("team5", "K" + var4.getRoleId());
                  var10001 = -4 >> 2;
                  this.uw().d(var3);
                  this.dp(var10001);
               }
            } else {
               if (var1 == --5) {
                  if ((var4 = this.ane()) == null) {
                     this.aej.f("你没有选中的玩家");
                     return;
                  }

                  if (var4.getRoleId().compareTo(this.vd().getLoginResult().getRole_id()) == 0) {
                     this.aej.f("不能选中你自己");
                     return;
                  }

                  Class183.ao(var4.getRoleId(), var4.getName(), this.aej);
               }

            }
         } else {
            var2 = Agreement.getSendTextAES("team5", "D");
            this.uw().d(var2);
            this.ve().n(this.ae());
         }
      }
   }

   public void y(int var1) {
      this.fk = var1;
   }

   public void d() {
      TeamBean var8;
      if ((var8 = this.aej.roleData.teamBean) != null) {
         long var2 = this.aej.roleData.getRoleId();
         TeamRole var4 = null;
         int var5 = ((TeamRole)var8.getTeams().get(2 & 5)).getRoleId().longValue() == var2 ? 3 >> 1 : 0;
         int var6 = 3 & 4;
         int var7 = var8.getTeams().size();

         for(int var10000 = var6; var10000 < this.axz.length; var10000 = var6) {
            TeamRole var1 = var6 < var7 ? (TeamRole)var8.getTeams().get(var6) : null;
            Class183 var9 = var1 != null ? this.aej.mapScene.a(var1.getName()) : null;
            if (var9 != null) {
               var1.setGrade(var9.r.getGrade());
            }

            this.axz[var6].hd(var1);
            if (var1 != null && var1.getRoleId().longValue() == var2) {
               var4 = var1;
            }

            ++var6;
         }

         Class520 var10;
         if (var5 != 0) {
            var10 = this;
            this.bz[3 >> 2].setText("移交队长");
            this.bz[3 ^ 3].ab(4 ^ 5);
            this.bz[3 ^ 3].setVisible((boolean)(3 & 5));
            this.bz[3 >> 1].setText("申请列表");
            this.bz[3 & 5].ab(--2);
            this.bz[4 ^ 5].setVisible((boolean)(3 & 5));
            this.bz[5 >> 1].setText("解散队伍");
            this.bz[1 ^ 3].ab(--3);
            this.bz[1 ^ 3].setVisible((boolean)(2 ^ 3));
            this.bz[--3].setText("请离队伍");
            this.bz[--3].ab(--4);
            this.bz[--3].setVisible((boolean)(--1));
            this.bz[--4].setText("加为好友");
            this.bz[--4].ab(--5);
            this.bz[--4].setVisible((boolean)(3 >> 1));
         } else if (var4.getState() >= 0) {
            this.bz[5 >> 3].setText("暂离队伍");
            var10 = this;
            this.bz[5 >> 3].ab(47 & 87);
            this.bz[2 & 5].setVisible((boolean)(3 & 5));
            this.bz[5 >> 2].setVisible(false);
            this.bz[--2].setVisible(false);
            this.bz[--3].setText("离开队伍");
            this.bz[--3].ab(87 & 46);
            this.bz[3].setVisible(true);
            this.bz[4].setText("加为好友");
            this.bz[4].ab(5);
            this.bz[4].setVisible(true);
         } else {
            this.bz[0].setText("回归队伍");
            var10 = this;
            this.bz[0].ab(105 & 30);
            this.bz[0].setVisible(true);
            this.bz[1].setVisible(false);
            this.bz[2].setVisible(false);
            this.bz[3].setText("离开队伍");
            this.bz[3].ab(119 & 14);
            this.bz[3].setVisible(true);
            this.bz[4].setText("加为好友");
            this.bz[4].ab(5);
            this.bz[4].setVisible(true);
         }

         var10.y(-1);
         this.dp(-1);
      }
   }

   public Class520(GameView var1) {
      int var10001 = --5;
      int var10006 = 47 & 123;
      int var10011 = -4 >> 2;
      int var10019 = -4 >> 2;
      int var10021 = -4 >> 2;
      super(61 & 79, --2, Class345.aef, var1);
      this.ay = var10021;
      this.fk = var10019;
      this.axm = Class511.q("sc/d/29.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(5 >> 3));
      this.axy = Class511.q("sc/d/16.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(2 & 5));
      this.bx = Class511.a("sc/d/30.png");
      this.va(var10011, 2 & 5, 30590 & 2719, 831 & 32223, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 79 & 116, 79 & 116, 79 & 116, 79 & 116, (boolean)(3 >> 2)), "队 伍");
      this.ad(new Class116(63 & 78, 5 >> 3, 5 >> 3, 1 ^ 3));
      this.as = Class133.c(var10006, 95 & 53, 125 & 42, 27 & 118, 3 & 4, Class681.c("#c000000"), Class681.ak);
      this.as.setText("队标");
      this.add(this.as);
      <undefinedtype>[] var4 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.axz = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.axz.length; var10000 = var2) {
         this.axz[var2] = new MouseListener(var2) {
            private Class19 xj;
            private JLabel as;
            private JLabel at;
            private int j;
            private TeamRole add;
            private boolean bb;
            private Class554 ade;

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               if (this.bb) {
                  if (Class520.this.ll == null) {
                     Class520.this.ll = Class511.a("sc/c/67");
                  }

                  var1.drawImage(Class520.this.ll, 2 & 5, 2 & 5, 118 & 93, 8110 & 24831, this);
               }

            }

            public void mouseClicked(MouseEvent var1) {
            }

            public void hd(TeamRole var1) {
               if ((this.add = var1) == null) {
                  boolean var2 = this.bb = (boolean)(5 >> 3);
                  this.xj = null;
                  this.setVisible(var2);
               } else {
                  this.at.setText(var1.getName());
                  this.as.setText(Class224.r(var1.getGrade()));
                  this.ade.setText(SkillUtil.getSepciesN(var1.getSpeciesId()));
                  this.bb = (boolean)(var1.getState() < 0 ? --1 : 0);
                  int var10001 = 4 ^ 5;
                  this.xj = Class330.f(var1.getSpeciesId().toString(), 1 ^ 3, 5 >> 2, (String)null);
                  this.setVisible((boolean)var10001);
               }
            }

            public void mouseEntered(MouseEvent var1) {
               if (this.isVisible()) {
                  Class520.this.y(this.j);
               }

            }

            public void mousePressed(MouseEvent var1) {
               if (this.isVisible()) {
                  Class520.this.dp(this.j);
               }

            }

            public void mouseExited(MouseEvent var1) {
               if (this.isVisible()) {
                  Class520.this.y(-4 >> 2);
               }

            }

            public void mouseReleased(MouseEvent var1) {
            }

            public {
               int var10012 = 2 & 5;
               this.bb = (boolean)var10012;
               this.j = var2;
               this.at = new JLabel("名字", 3 & 4);
               this.as = new JLabel("等级", 3 >> 2);
               this.at.setBounds(-1 & -10, 123 & 124, 100 & 127, 55 & 95);
               this.as.setBounds(3 ^ 3, 7889 & 25022, 120 & 87, 127 & 23);
               this.at.setForeground(Color.white);
               this.as.setForeground(Color.white);
               this.at.setFont(Class681.ce);
               this.as.setFont(Class681.ce);
               this.add(this.at);
               this.add(this.as);
               this.ade = new Class554("sc/e/6.png", 3 & 5, 3 >> 2, Class681.bm, (Color[])null, "鬼族", Class520.this.gk());
               this.ade.setBounds(--2, 124 & 103, 115 & 46, 118 & 27);
               this.add(this.ade);
               this.addMouseListener(this);
            }
         };
         this.axz[var2].setBounds((127 & 53) + var2 * (95 & 127), 127 & 51, 80 & 127, 29867 & 3070);
         this.add(this.axz[var2++]);
      }

      Class554[] var5 = new Class554[--5];
      var10003 = true;
      this.bz = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.bz.length; var10000 = var2) {
         this.bz[var2] = new Class554("sc/e/26.png", --1, 5 >> 3, Class681.ak, Class681.c, (String)null, this);
         Class520 var3;
         if (var2 == 0) {
            this.bz[var2].setBounds(31706 & 1471, 60 & 87, 89, 25);
            var3 = this;
         } else {
            this.bz[var2].setBounds(53 + (var2 - (5 >> 2)) * 114, 237, 99, 25);
            var3 = this;
         }

         var3.add(this.bz[var2++]);
      }

   }

   public int e() {
      return this.ay;
   }
}
