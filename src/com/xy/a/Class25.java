package com.xy.a;

import com.xy.bean.TeamBean;
import com.xy.entity.TeamRole;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLabel;

public class Class25 extends com.xy.q.Class30 {
   private JLabel ge;
   private com.xy.w.Class9 of;
   private Image kr;
   private Image g;
   private Class34[] og;
   private int ae;
   private com.xy.w.Class9 oh;
   private int eg;
   private com.xy.i.Class10[] oi;

   // $VF: synthetic method
   static Image ko(Class25 var0) {
      return var0.g;
   }

   @Override
   public void l() {
      if (this.afx.roleData.teamBean != null) {
         this.h();
         super.l();
      }
   }

   public void bi(int var1) {
      this.ae = var1;
   }

   public int dx() {
      return this.ae;
   }

   public void h() {
      TeamBean var1 = this.afx.roleData.teamBean;
      if (this.afx.roleData.teamBean != null) {
         long var2 = this.afx.roleData.getRoleId();
         TeamRole var4 = null;
         boolean var5 = var1.getTeams().get(0).getRoleId().longValue() == var2;
         int var6 = 0;
         int var7 = var1.getTeams().size();

         for (int var10000 = var6; var10000 < this.og.length; var10000 = ++var6) {
            TeamRole var8 = var6 < var7 ? var1.getTeams().get(var6) : null;
            com.xy.d.Class8 var9 = var8 != null ? this.afx.mapScene.j(var8.getName()) : null;
            if (var9 != null) {
               var8.setGrade(var9.ap.getGrade());
            }

            this.og[var6].mv(var8);
            if (var8 != null && var8.getRoleId().longValue() == var2) {
               var4 = var8;
            }
         }

         Class25 var10;
         if (var5) {
            var10 = this;
            com.xy.i.Class10 var10015 = this.oi[0];
            String var10016 = "禚仐陾锋";
            var10015.setText("移交队长");
            this.oi[0].n(1);
            this.oi[0].setVisible(true);
            com.xy.i.Class10 var10012 = this.oi[1];
            String var10013 = "畼诠剘衿";
            var10012.setText("申请列表");
            this.oi[1].n(2);
            this.oi[1].setVisible(true);
            com.xy.i.Class10 var10009 = this.oi[2];
            String var10010 = "覂攗陾佹";
            var10009.setText("解散队伍");
            this.oi[2].n(3);
            this.oi[2].setVisible(true);
            com.xy.i.Class10 var10006 = this.oi[3];
            String var10007 = "许禬限会";
            var10006.setText("请离队伍");
            this.oi[3].n(4);
            this.oi[3].setVisible(true);
            com.xy.i.Class10 var10003 = this.oi[4];
            String var10004 = "勁乎夜县";
            var10003.setText("加为好友");
            this.oi[4].n(5);
            this.oi[4].setVisible(true);
         } else if (var4.getState() >= 0) {
            com.xy.i.Class10 var11 = this.oi[0];
            String var10001 = "曍禬限会";
            var11.setText("暂离队伍");
            var10 = this;
            this.oi[0].n(7);
            this.oi[0].setVisible(true);
            this.oi[1].setVisible(false);
            this.oi[2].setVisible(false);
            com.xy.i.Class10 var18 = this.oi[3];
            String var20 = "秚彴陾佹";
            var18.setText("离开队伍");
            this.oi[3].n(6);
            this.oi[3].setVisible(true);
            com.xy.i.Class10 var14 = this.oi[4];
            String var16 = "勯中夲叜";
            var14.setText("加为好友");
            this.oi[4].n(5);
            this.oi[4].setVisible(true);
         } else {
            com.xy.i.Class10 var12 = this.oi[0];
            String var13 = "嚿弦陾佹";
            var12.setText("回归队伍");
            var10 = this;
            this.oi[0].n(8);
            this.oi[0].setVisible(true);
            this.oi[1].setVisible(false);
            this.oi[2].setVisible(false);
            com.xy.i.Class10 var19 = this.oi[3];
            String var21 = "秴弗限会";
            var19.setText("离开队伍");
            this.oi[3].n(6);
            this.oi[3].setVisible(true);
            com.xy.i.Class10 var15 = this.oi[4];
            String var17 = "勁乎夜县";
            var15.setText("加为好友");
            this.oi[4].n(5);
            this.oi[4].setVisible(true);
         }

         var10.y(-1);
         this.bi(-1);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      long var2 = com.xy.v.Class22.l();
      com.xy.w.Class1 var4;
      if ((var4 = com.xy.w.Class15.k()) != null) {
         var4.j(var2, 0);
         var4.ab(var1, 92, 42);
      }

      int var5;
      for (int var10000 = var5 = 0; var10000 < this.og.length; var10000 = var5) {
         var1.translate(this.og[var5].getX(), this.og[var5].getY());
         this.oh.g(var1, 80, 170);
         var1.drawImage(this.kr, 2, 118, 76, 1, null);
         var1.drawImage(this.kr, 2, 141, 76, 1, null);
         if (this.og[var5].isVisible()) {
            if (var5 == this.ae || var5 == this.eg) {
               this.of.g(var1, 84, 174);
            }

            if (Class34.mu(this.og[var5]) != null) {
               Class34.mu(this.og[var5]).r(var1, 40, 108, 4, var2);
            }
         }

         int var10001 = -this.og[var5].getX();
         Class34 var10002 = this.og[var5];
         var5++;
         var1.translate(var10001, -var10002.getY());
      }
   }

   public TeamRole kp() {
      return this.ae == -1 ? null : Class34.mw(this.og[this.ae]);
   }

   public void y(int var1) {
      this.eg = var1;
   }

   public Class25(GameView var1) {
      super(13, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "<t`s`&ag!p";
      String var10013 = "\u0007\u0002[\u0005[RDO\u0004\u000f\u0013";
      String var10015 = "d,8+8~!ag!p";
      String var10017 = "\u0007\u0002[\u0005[SMO\u0004\u000f\u0013";
      this.ae = -1;
      this.eg = -1;
      this.of = com.xy.w.Class16.m("sc/d/29.png", 2, 2, 2, 2, false);
      this.oh = com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false);
      this.kr = com.xy.w.Class16.c("sc/d/30.png");
      this.yy(-1, 0, 542, 287, com.xy.q.Class30.agh);
      com.xy.w.Class9 var7 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "陫A佹";
      this.yu(var7, "队 伍");
      this.wp(new com.xy.v.Class32(14, 0, 0, 2));
      String var10011 = "lt\u007f'\u007f'\u007f'";
      this.ge = com.xy.q.Class1.f(43, 21, 40, 18, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
      String var10005 = "陾桳";
      this.ge.setText("队标");
      this.add(this.ge);
      this.og = new Class34[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.og.length; var10000 = var2) {
         this.og[var2] = new Class34(this, var2);
         this.og[var2].setBounds(53 + var2 * 95, 51, 80, 170);
         this.add(this.og[var2++]);
      }

      this.oi = new com.xy.i.Class10[5];

      for (int var4 = var2 = 0; var4 < this.oi.length; var4 = var2) {
         String var10004 = "d,8*8}!ag!p";
         this.oi[var2] = new com.xy.i.Class10("sc/e/26.png", 1, 0, com.xy.q.Class49.ch, com.xy.q.Class49.bv, null, this);
         Class25 var5;
         if (var2 == 0) {
            this.oi[var2].setBounds(410, 20, 89, 25);
            var5 = this;
         } else {
            this.oi[var2].setBounds(53 + (var2 - 1) * 114, 237, 99, 25);
            var5 = this;
         }

         var5.add(this.oi[var2++]);
      }
   }

   public void g(int var1) {
      if (var1 == 1) {
         TeamRole var7;
         if ((var7 = this.kp()) == null) {
            String var14 = "伯沶杆逞乢皓珦审";
            this.afx._do("你没有选中的玩家");
         } else if (var7.getRoleId().compareTo(this.yx().getLoginResult().getRole_id()) == 0) {
            String var13 = "乹肜遽乌伔膋嶅";
            this.afx._do("不能选中你自己");
         } else {
            String var15 = "D";
            String var8 = Agreement.getSendTextAES("team5", "S" + var7.getRoleId());
            this.za().k(var8);
            this.bi(-1);
         }
      } else if (var1 == 2) {
         String var6 = Agreement.getSendTextAES("team6", null);
         this.za().k(var6);
      } else if (var1 == 3 || var1 == 6) {
         String var12 = "0";
         String var5 = Agreement.getSendTextAES("team5", "D");
         this.za().k(var5);
         this.zc().f(this.lj());
      } else if (var1 == 4) {
         TeamRole var4;
         if ((var4 = this.kp()) == null) {
            String var11 = "伯沶杆逞乢皓珦审";
            this.afx._do("你没有选中的玩家");
         } else if (var4.getRoleId().compareTo(this.yx().getLoginResult().getRole_id()) == 0) {
            String var10 = "乹肜遽乌伔膋嶅";
            this.afx._do("不能选中你自己");
         } else {
            String var10003 = "\\";
            String var3 = Agreement.getSendTextAES("team5", "K" + var4.getRoleId());
            this.za().k(var3);
            this.bi(-1);
         }
      } else {
         if (var1 == 5) {
            TeamRole var2;
            if ((var2 = this.kp()) == null) {
               String var9 = "企法杨遽乌盰珈寂";
               this.afx._do("你没有选中的玩家");
               return;
            }

            if (var2.getRoleId().compareTo(this.yx().getLoginResult().getRole_id()) == 0) {
               String var10001 = "业育逞乢佷膥左";
               this.afx._do("不能选中你自己");
               return;
            }

            com.xy.d.Class8.bq(var2.getRoleId(), var2.getName(), this.afx);
         }
      }
   }

   // $VF: synthetic method
   static void kq(Class25 var0, Image var1) {
      var0.g = var1;
   }
}
