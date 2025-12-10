package com.xy;

import com.xy.bean.BeauBean;
import com.xy.bean.FriendBean;
import com.xy.entity.Friend;
import com.xy.formula.UtilSkin;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class304 extends Class345 {
   private Class464[] anr;
   private Class436 ec;
   private Class436 et;
   private Class245[] jc;
   private JLabel[] hj;
   private Class464[] s;
   private RichLabel acv;
   private FriendBean ans;

   public Class304(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10009 = -4 >> 2;
      super(95 & 108, 5 >> 1, Class345.aef, var1);
      this.va(var10009, 3 >> 2, 15209 & 17918, 28543 & 4539, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 100 & 95, 100 & 95, 100 & 95, 100 & 95, (boolean)(2 & 5)), "好友信息");
      this.ad(new Class116(47 & 94, 3 ^ 3, 3 ^ 3, 123 & 55));
      this.et = new Class436();
      this.et.setBounds(51 & 126, 101 & 95, 95 & 107, 101 & 126);
      this.add(this.et);
      this.ec = new Class436("sc/d/27.png");
      this.ec.setBounds(127 & 44, 127 & 63, 119 & 95, 114 & 125);
      this.add(this.ec);
      Class464[] var5 = new Class464[var10001];
      boolean var10003 = true;
      this.s = var5;

      int var2;
      Class464[] var3;
      String var10;
      int var10000;
      int var10006;
      Font var10007;
      Class304 var10010;
      for(var10000 = var2 = 5 >> 3; var10000 < this.s.length; var10000 = var2) {
         var3 = this.s;
         Class464 var6 = new Class464;
         String var10004 = var2 == 0 ? "sc/e/5.png" : "sc/e/28.png";
         var10006 = (9199 & 23869) + var2;
         var10007 = Class681.bm;
         if (var2 == 0) {
            var10 = "断交";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10 = "历史消息";
            var10010 = this;
         } else {
            var10 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10007, (Color[])null, var10, var10010);
         var3[var2] = var6;
         Class304 var4;
         if (var2 == 0) {
            this.s[var2].setBounds(43 & 127, 38, 34, 17);
            var4 = this;
         } else {
            this.s[var2].setBounds(54, 180, 68, 17);
            var4 = this;
         }

         var4.add(this.s[var2++]);
      }

      var5 = new Class464[--3];
      var10003 = true;
      this.anr = var5;

      for(var10000 = var2 = 3 >> 2; var10000 < this.anr.length; var10000 = var2) {
         var3 = this.anr;
         Class464 var8 = new Class464;
         int var10005 = 5 >> 2;
         var10006 = 303 + var2;
         var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         if (var2 == 0) {
            var10 = "发送消息";
            var10010 = this;
         } else if (var2 == --1) {
            var10 = "交易";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var10 = "申请入队";
            var10010 = this;
         } else {
            var10 = "";
            var10010 = this;
         }

         var8.<init>("sc/e/26.png", var10005, var10006, var10007, var10008, var10, var10010);
         var3[var2] = var8;
         this.anr[var2].setBounds(158, 211, 59, 25);
         this.add(this.anr[var2]);
         if (var2 == 0) {
            this.anr[var2].setBounds(49, 211, 99, 25);
         } else if (var2 == --1) {
            this.anr[var2].setBtnPath("sc/e/7.png");
         } else if (var2 == (1 ^ 3)) {
            this.anr[var2].setBounds(227, 211, 99, 25);
         }

         ++var2;
      }

      JLabel[] var7 = new JLabel[7];
      var10003 = true;
      this.hj = var7;

      for(var10000 = var2 = 3 >> 2; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(132, 38 + var2 * 23, 72, 19, 3 ^ 3, Color.black, Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "名  字" : (var2 == --1 ? "称  谓" : (var2 == 5 >> 1 ? "I  D" : (var2 == --3 ? "等  级" : (var2 == --4 ? "种  族" : (var2 == --5 ? "关  系" : (var2 == 6 ? "帮  派" : "")))))));
         this.add(this.hj[var2++]);
      }

      Class245[] var9 = new Class245[7];
      var10003 = true;
      this.jc = var9;

      for(var10000 = var2 = 3 & 4; var10000 < this.jc.length; var10000 = var2) {
         if (var2 == 5 >> 1) {
            this.acv = new RichLabel("", Class681.q);
            this.acv.setBounds(209, 35 + var2 * 23, 124, 19);
            this.add(this.acv);
         }

         this.jc[var2] = Class133.a(207, 38 + var2 * 23, 124, 19, 10, Color.white, Class681.ce);
         this.jc[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
         this.add(this.jc[var2++]);
      }

   }

   public void y(int var1) {
      if (this.ans != null) {
         if (var1 == (29117 & 3951)) {
            FriendBean var3;
            RoleData var5;
            if ((var3 = (var5 = this.vd()).getFriend(this.ans.getFid())) == null || var3.getGroup() == 0) {
               return;
            }

            var3.setFlag((var3.c() ? --1 : 0) << 4);
            Friend var4 = new Friend();
            var4.setRoleid(var5.getLoginResult().getRole_id());
            var4.setFriendid(new BigDecimal(var3.getFid()));
            String var6 = Agreement.getSendTextAES("deletefriend", Class695.b().toJson(var4));
            this.uw().d(var6);
            this.ve().n(this.ae());
            if (this.ve().m(--4) != null) {
               ((Class637)this.aej.getFormManagement().d(--4)).afb(var5.getFriendList(), (boolean)(3 ^ 3));
               return;
            }
         } else {
            if (var1 == (24879 & 8190) || var1 == (32127 & 943)) {
               ((Class494)this.aej.getFormManagement().e(120 & 63)).afc(this.vd().getFriend(this.ans.getFid()));
               return;
            }

            if (var1 == (17341 & 15730)) {
               Class183 var2;
               if ((var2 = this.aej.mapScene.a(this.ans.getRoleName())) == null) {
                  this.aej.f("玩家离你太远了");
                  return;
               }

               Class183.ak(var2, this.aej);
               return;
            }

            if (var1 == (21439 & 11633)) {
               Class183.y(new BigDecimal(this.ans.getFid()), this.aej);
            }
         }

      }
   }

   public void afc(FriendBean var1) {
      this.ans = var1;
      this.et.fw(Class222.l(String.valueOf(var1.getSpeciesId())));
      this.jc[3 ^ 3].setText(var1.getRoleName());
      Class304 var10000;
      BeauBean var2;
      if ((var2 = var1.getBeauBean()) == null) {
         var10000 = this;
         this.acv.setText("#W" + var1.getFid());
      } else if (var2.a()) {
         this.acv.setText("#VBEAU" + var2.toString() + "#L");
         var10000 = this;
      } else {
         this.acv.setText("#cFF00FF" + var2.getBeau());
         var10000 = this;
      }

      var10000.jc[--3].setText(Class224.r(var1.getLvl()));
      this.jc[--4].setText(UtilSkin.getRaceSting(var1.getSpeciesId()));
      this.ve().a(this.ae());
   }
}
