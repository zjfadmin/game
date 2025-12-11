package com.xy.a;

import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class113 extends com.xy.q.Class30 {
   private JLabel db;
   private RichLabel to;
   private RichLabel re;
   private RichLabel am;
   private com.xy.q.Class12 apa;
   private RichLabel ed;
   private JLabel[] ap;
   private JLabel ad;
   private RichLabel bk;
   private com.xy.i.Class18 md;
   private int eg;
   private com.xy.q.Class12 apb;

   public void h() {
      String var1 = this.yx().getLoginResult().getPassword();
      if (this.eg == 0 && com.xy.v.Class12.h(var1)) {
         String var5 = this.apb.getText().trim();
         String var6 = this.apa.getText().trim();
         if (com.xy.v.Class12.h(var5)) {
            GameView var16 = this.ze();
            String var25 = "订迳儰宦硔";
            var16._do("请输入密码");
         } else if (!com.xy.v.Class12.am(var5, var6)) {
            GameView var15 = this.ze();
            String var24 = "U歶审硖迴儲乪乗膓";
            var15._do("2次密码输入不一致");
         } else if (!com.xy.v.Class12.ab(var6)) {
            GameView var14 = this.ze();
            String var23 = "宦硔杠屄V优嬷筳乴卐呋攥嬷哙嬷殘";
            var14._do("密码最少6位字符且包含数字和字母");
         } else {
            this.yx().getLoginResult().setPassword(var5);
            String var7 = Agreement.getSendTextAES("rolechange", "1" + var5);
            this.za().k(var7);
            this.zc().f(this.lj());
            GameView var13 = this.ze();
            String var22 = "审硖诙缹扷勈FvF";
            var13._do("密码设置成功!!!");
         }
      } else if (this.eg == 1 && !com.xy.v.Class12.h(var1)) {
         String var2 = this.apb.getText().trim();
         String var3 = this.apa.getText().trim();
         if (!com.xy.v.Class12.am(var2, var1)) {
            GameView var12 = this.ze();
            String var21 = "叿宓硡乘欃砻";
            var12._do("原密码不正确");
         } else if (com.xy.v.Class12.h(var3)) {
            GameView var11 = this.ze();
            String var20 = "讠迴儲旗宑硦";
            var11._do("请输入新密码");
         } else if (!com.xy.v.Class12.ab(var3)) {
            GameView var10 = this.ze();
            String var19 = "宦硔杠屄V优嬷筳乴卐呋攥嬷哙嬷殘";
            var10._do("密码最少6位字符且包含数字和字母");
         } else {
            this.yx().getLoginResult().setPassword(var3);
            String var4 = Agreement.getSendTextAES("rolechange", "1" + var3);
            this.za().k(var4);
            this.zc().f(this.lj());
            GameView var9 = this.ze();
            String var18 = "审硖诙缹扷勈FvF";
            var9._do("密码设置成功!!!");
         }
      } else {
         if (this.eg == 2 && !com.xy.v.Class12.h(var1)) {
            if (!com.xy.v.Class12.am(this.apb.getText().trim(), var1)) {
               GameView var8 = this.ze();
               String var17 = "宓硡乘欃砻";
               var8._do("密码不正确");
               return;
            }

            this.yx().setLockPack();
            this.zc().f(this.lj());
            GameView var10000 = this.ze();
            String var10001 = "肛卢覴镦扇勸";
            var10000._do("背包解锁成功");
         }
      }
   }

   public void y(int var1) {
      this.ap[1].setBounds(64, 99 + var1, 200, 18);
      this.re.setBounds(63, 122 + var1, this.re.getWidth(), this.re.getHeight());
      this.am.setBounds(63, 140 + var1, this.am.getWidth(), this.am.getHeight());
      this.bk.setBounds(63, 165 + var1, this.bk.getWidth(), this.bk.getHeight());
      this.ed.setBounds(63, 183 + var1, this.ed.getWidth(), this.ed.getHeight());
      this.to.setBounds(63, 200 + var1, this.to.getWidth(), this.to.getHeight());
      this.md.setBounds(143, 238 + var1, 99, 25);
   }

   public Class113(GameView var1) {
      super(32, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "$\u0004x\u0003xVy\u00179\u0000";
      this.yy(-1, 0, 363, 318, com.xy.q.Class30.agh);
      com.xy.w.Class9 var6 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "诞缻宦硔";
      this.yu(var6, "设置密码");
      this.ap = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ap.length; var10000 = var2) {
         this.ap[var2] = com.xy.q.Class1.k(64, 34 + 65 * var2, 300, 18, Color.black, com.xy.q.Class49.ch);
         JLabel var3 = this.ap[var2];
         String var4;
         if (var2 == 0) {
            var4 = "讐诩缉惿監勷镦宑硦";
            var4 = "请设置您的加锁密码";
         } else if (var2 == 1) {
            var4 = "湼駈掅祚ｏ";
            var4 = "温馨提示：";
         } else {
            var4 = "";
         }

         var3.setText(var4);
         this.add(this.ap[var2++]);
      }

      String var10009 = "t\u0004gWgWgW";
      this.ad = com.xy.q.Class1.k(66, 66, 60, 14, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ac);
      String var10007 = "C6PePePe";
      this.db = com.xy.q.Class1.k(66, 89, 60, 14, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ac);
      this.add(this.ad);
      this.add(this.db);
      var10007 = "&\u0003z\u0004zQbN%\u000e2";
      var10009 = "\u00144H3HfPy\u00179\u0000";
      this.apb = com.xy.q.Class1.h(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.ac, Color.white);
      this.apa = com.xy.q.Class1.h(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.ac, Color.white);
      this.apb.setBounds(128, 64, 195, 19);
      this.apa.setBounds(128, 87, 195, 19);
      this.add(this.apb);
      this.add(this.apa);
      var10009 = "D4WgWgWgVざ勇镖呩盓爎咖屡t\u0004\u0011!gWgW乚肚戰蠫亲乬撚伻ｍ呯";
      this.re = new RichLabel("#c0000001、加锁后的物品将#cFF0000不能执行以下操作：合", com.xy.q.Class49.ac, 260);
      this.add(this.re);
      String var10010 = "v\u0003\u0013&ePeP扅ち戆遀ご室啻ち冯啎ご仄晆ち續仨し";
      this.am = new RichLabel("#cFF0000成、打造、寄售、出售、交易、给予。", com.xy.q.Class49.ac, 260);
      this.add(this.am);
      String var10011 = "t\u0004gWgWgWeて讠纾惿監赢醪爾咦勷乭爾咦镖ｫ帡爅";
      this.bk = new RichLabel("#c0000002、请给您的贵重物品加上物品锁，并牢", com.xy.q.Class49.ac, 260);
      this.add(this.bk);
      String var10012 = "C6PePePe诐惽盤宓硡ｙ讗努吪讜亶仯惈监爉咔镡宓";
      this.ed = new RichLabel("#c000000记您的密码，请勿告诉他人您的物品锁密", com.xy.q.Class49.ac, 260);
      this.add(this.ed);
      String var10013 = "t\u0004gWgWgW硖づ";
      this.to = new RichLabel("#c000000码。", com.xy.q.Class49.ac, 260);
      this.add(this.to);
      String var10014 = "&\u0003z\u0005zRcN%\u000e2";
      String var10019 = "诩缉宑硦";
      this.md = new com.xy.i.Class18("sc/e/26.png", 1, 112, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "设置密码", this);
      this.add(this.md);
   }

   public void g(int var1) {
      this.eg = var1;
      this.apb.setText(null);
      this.apa.setText(null);
      Class113 var10000;
      if (var1 == 0) {
         var10000 = this;
         String var10012 = "诞缻宦硔";
         this.dq("设置密码");
         this.y(23);
         JLabel var10008 = this.ap[0];
         String var10009 = "讐诩缉惿監勷镦宑硦";
         var10008.setText("请设置您的加锁密码");
         String var6 = "迳儰宦硔";
         this.ad.setText("输入密码");
         String var10007 = "砹诃宑硦";
         this.db.setText("确认密码");
         this.ad.setVisible(true);
         this.db.setVisible(true);
         this.apb.setVisible(true);
         this.apa.setVisible(true);
         String var10002 = "诞缻宦硔";
         this.md.setText("设置密码");
      } else if (var1 == 1) {
         var10000 = this;
         String var10 = "侹敞宑硦";
         this.dq("修改密码");
         this.y(23);
         JLabel var7 = this.ap[0];
         String var9 = "欶坈侻教伵盤爼咡镔宦硔";
         var7.setText("正在修改你的物品锁密码");
         String var8 = "司w审w硦";
         this.ad.setText("原 密 码");
         String var4 = "日@宓@硔";
         this.db.setText("新 密 码");
         this.ad.setVisible(true);
         this.db.setVisible(true);
         this.apb.setVisible(true);
         this.apa.setVisible(true);
         String var2 = "侹敞宑硦";
         this.md.setText("修改密码");
      } else {
         if (var1 == 2) {
            String var10010 = "覃镔宦硔";
            this.dq("解锁密码");
            this.y(0);
            JLabel var10006 = this.ap[0];
            String var5 = "讠迴儲伇盓爎咖镦宑硦";
            var10006.setText("请输入你的物品锁密码");
            String var3 = "宓@硔";
            this.ad.setText("密 码");
            this.ad.setVisible(true);
            this.db.setVisible(false);
            this.apb.setVisible(true);
            this.apa.setVisible(false);
            String var10001 = "覄し镦";
            this.md.setText("解　锁");
         }

         var10000 = this;
      }

      var10000.zc().b(this.lj());
   }
}
