package com.xy;

import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class289 extends Class345 {
   private RichLabel bp;
   private Class693 bq;
   private int br;
   private JLabel bs;
   private RichLabel bt;
   private JLabel[] ai;
   private RichLabel aj;
   private Class693 bu;
   private RichLabel bv;
   private RichLabel bw;
   private Class322 aw;
   private JLabel ax;

   public void d() {
      String var1 = this.vd().getLoginResult().getPassword();
      String var2;
      String var3;
      String var4;
      if (this.br == 0 && Class394.o(var1)) {
         var2 = this.bq.getText().trim();
         var3 = this.bu.getText().trim();
         if (Class394.o(var2)) {
            this.ux().f("请输入密码");
         } else if (!Class394.r(var2, var3)) {
            this.ux().f("2次密码输入不一致");
         } else if (!Class394.u(var3)) {
            this.ux().f("密码最少6位字符且包含数字和字母");
         } else {
            this.vd().getLoginResult().setPassword(var2);
            var4 = Agreement.getSendTextAES("rolechange", "1" + var2);
            this.uw().d(var4);
            this.ve().n(this.ae());
            this.ux().f("密码设置成功!!!");
         }
      } else if (this.br == --1 && !Class394.o(var1)) {
         var2 = this.bq.getText().trim();
         var3 = this.bu.getText().trim();
         if (!Class394.r(var2, var1)) {
            this.ux().f("原密码不正确");
         } else if (Class394.o(var3)) {
            this.ux().f("请输入新密码");
         } else if (!Class394.u(var3)) {
            this.ux().f("密码最少6位字符且包含数字和字母");
         } else {
            this.vd().getLoginResult().setPassword(var3);
            var4 = Agreement.getSendTextAES("rolechange", "1" + var3);
            this.uw().d(var4);
            this.ve().n(this.ae());
            this.ux().f("密码设置成功!!!");
         }
      } else {
         if (this.br == 5 >> 1 && !Class394.o(var1)) {
            if (!Class394.r(this.bq.getText().trim(), var1)) {
               this.ux().f("密码不正确");
               return;
            }

            this.vd().setLockPack();
            this.ve().n(this.ae());
            this.ux().f("背包解锁成功");
         }

      }
   }

   public Class289(GameView var1) {
      int var10001 = --2;
      int var10005 = -4 >> 2;
      super(104 & 55, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 3 ^ 3, 25967 & 7163, 25983 & 7102, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 124 & 71, 124 & 71, 124 & 71, 124 & 71, (boolean)(2 & 5)), "设置密码");
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.ai = var3;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.ai.length; var10000 = var2) {
         this.ai[var2] = Class133.b(89 & 102, (115 & 46) + (117 & 75) * var2, 5549 & 27518, 94 & 51, Color.black, Class681.ak);
         this.ai[var2].setText(var2 == 0 ? "请设置您的加锁密码" : (var2 == (3 & 5) ? "温馨提示：" : ""));
         this.add(this.ai[var2++]);
      }

      int var4 = 83 & 110;
      this.ax = Class133.b(99 & 94, 99 & 94, 125 & 62, 79 & 62, Class681.c("#c000000"), Class681.ce);
      this.bs = Class133.b(var4, 93 & 123, 127 & 60, 94 & 47, Class681.c("#c000000"), Class681.ce);
      this.add(this.ax);
      this.add(this.bs);
      this.bq = Class133.k(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)), Class681.ce, Color.white);
      this.bu = Class133.k(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)), Class681.ce, Color.white);
      this.bq.setBounds(128, 64, 195, 19);
      this.bu.setBounds(128, 87, 195, 19);
      this.add(this.bq);
      this.add(this.bu);
      this.bv = new RichLabel("#c0000001、加锁后的物品将#cFF0000不能执行以下操作：合", Class681.ce, 260);
      this.add(this.bv);
      this.bw = new RichLabel("#cFF0000成、打造、寄售、出售、交易、给予。", Class681.ce, 260);
      this.add(this.bw);
      this.bp = new RichLabel("#c0000002、请给您的贵重物品加上物品锁，并牢", Class681.ce, 260);
      this.add(this.bp);
      this.aj = new RichLabel("#c000000记您的密码，请勿告诉他人您的物品锁密", Class681.ce, 260);
      this.add(this.aj);
      this.bt = new RichLabel("#c000000码。", Class681.ce, 260);
      this.add(this.bt);
      this.aw = new Class322("sc/e/26.png", --1, 112, Class681.ak, Class681.c, "设置密码", this);
      this.add(this.aw);
   }

   public void as(int var1) {
      this.br = var1;
      this.bq.setText((String)null);
      this.bu.setText((String)null);
      Class289 var10000;
      int var10010;
      if (var1 == 0) {
         var10000 = this;
         var10010 = 95 & 55;
         this.fw("设置密码");
         this.y(var10010);
         this.ai[2 & 5].setText("请设置您的加锁密码");
         this.ax.setText("输入密码");
         this.bs.setText("确认密码");
         this.ax.setVisible((boolean)(3 >> 1));
         this.bs.setVisible((boolean)(--1));
         this.bq.setVisible((boolean)(3 >> 1));
         this.bu.setVisible((boolean)(3 & 5));
         this.aw.setText("设置密码");
      } else if (var1 == (3 & 5)) {
         var10000 = this;
         var10010 = 87 & 63;
         this.fw("修改密码");
         this.y(var10010);
         this.ai[3 >> 2].setText("正在修改你的物品锁密码");
         this.ax.setText("原 密 码");
         this.bs.setText("新 密 码");
         this.ax.setVisible((boolean)(--1));
         this.bs.setVisible((boolean)(4 ^ 5));
         this.bq.setVisible((boolean)(2 ^ 3));
         this.bu.setVisible((boolean)(--1));
         this.aw.setText("修改密码");
      } else {
         if (var1 == (1 ^ 3)) {
            int var10008 = 3 >> 2;
            this.fw("解锁密码");
            this.y(var10008);
            this.ai[3 ^ 3].setText("请输入你的物品锁密码");
            this.ax.setText("密 码");
            this.ax.setVisible((boolean)(--1));
            this.bs.setVisible((boolean)(5 >> 3));
            this.bq.setVisible((boolean)(5 >> 2));
            this.bu.setVisible((boolean)(3 >> 2));
            this.aw.setText("解　锁");
         }

         var10000 = this;
      }

      var10000.ve().a(this.ae());
   }

   public void y(int var1) {
      this.ai[4 ^ 5].setBounds(115 & 76, (119 & 107) + var1, 6399 & 26568, 27 & 118);
      this.bv.setBounds(127 & 63, (122 & 127) + var1, this.bv.getWidth(), this.bv.getHeight());
      this.bw.setBounds(63 & 127, (26076 & 6831) + var1, this.bw.getWidth(), this.bw.getHeight());
      this.bp.setBounds(63 & 127, (8615 & 24317) + var1, this.bp.getWidth(), this.bp.getHeight());
      this.aj.setBounds(127 & 63, (30135 & 2815) + var1, this.aj.getWidth(), this.aj.getHeight());
      this.bt.setBounds(63 & 127, (15311 & 17656) + var1, this.bt.getWidth(), this.bt.getHeight());
      this.aw.setBounds(19407 & 13503, (19694 & 13311) + var1, 99, 25);
   }
}
