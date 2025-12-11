package com.xy.a;

import com.xy.bean.BeauBean;
import com.xy.bean.FriendBean;
import com.xy.entity.Friend;
import com.xy.formula.UtilSkin;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class65 extends com.xy.q.Class30 {
   private com.xy.i.Class12[] abq;
   private com.xy.q.Class14[] jk;
   private JLabel[] ap;
   private com.xy.i.Class12[] abr;
   private RichLabel bk;
   private FriendBean abs;
   private com.xy.w.Class18 dm;
   private com.xy.w.Class18 dn;

   public void st(FriendBean var1) {
      this.abs = var1;
      this.dn.dp(com.xy.w.Class15.l(String.valueOf(var1.getSpeciesId())));
      this.jk[0].setText(var1.getRoleName());
      BeauBean var2;
      Class65 var10000;
      if ((var2 = var1.getBeauBean()) == null) {
         var10000 = this;
         String var10004 = "-\u000e";
         this.bk.setText("#W" + var1.getFid());
      } else if (var2.a()) {
         var10000 = this;
         RichLabel var10001 = this.bk;
         String var3 = "s\u0015\u0012\u0006\u0011\u0016";
         StringBuilder var10002 = new StringBuilder("#VBEAU").append(var2.toString());
         String var10003 = "-\u0015";
         var10001.setText(var10002.append("#L").toString());
      } else {
         var10000 = this;
         String var4 = "s \u0016\u0005`s\u0016\u0005";
         this.bk.setText("#cFF00FF" + var2.getBeau());
      }

      var10000.jk[3].setText(com.xy.v.Class4.h(var1.getLvl()));
      this.jk[4].setText(UtilSkin.getRaceSting(var1.getSpeciesId()));
      this.zc().b(this.lj());
   }

   public Class65(GameView var1) {
      super(76, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "}:!=!h )`>";
      this.yy(-1, 0, 360, 315, com.xy.q.Class30.agh);
      com.xy.w.Class9 var31 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10008 = "夭厈侱怬";
      this.yu(var31, "好友信息");
      this.wp(new com.xy.v.Class32(14, 0, 0, 51));
      this.dn = new com.xy.w.Class18();
      this.dn.setBounds(50, 69, 75, 100);
      this.add(this.dn);
      String var10009 = "*mvjv<n )`>";
      this.dm = new com.xy.w.Class18("sc/d/27.png");
      this.dm.setBounds(44, 63, 87, 112);
      this.add(this.dm);
      this.abq = new com.xy.i.Class12[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.abq.length; var10000 = var2) {
         com.xy.i.Class12[] var6 = this.abq;
         String var27;
         if (var2 == 0) {
            var27 = "# \u007f&\u007fv~3>$";
            var27 = "sc/e/5.png";
         } else {
            var27 = "*mvkv<a )`>";
            var27 = "sc/e/28.png";
         }

         int var10006 = 301 + var2;
         Class65 var10010;
         if (var2 == 0) {
            var10009 = "旽仧";
            var10009 = "断交";
            var10010 = this;
         } else if (var2 == 1) {
            var10009 = "厈厫涆怶";
            var10009 = "历史消息";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         com.xy.i.Class12 var10001 = new com.xy.i.Class12(var27, 1, var10006, com.xy.q.Class49.bz, null, var10009, var10010);
         var6[var2] = var10001;
         Class65 var7;
         if (var2 == 0) {
            this.abq[var2].setBounds(43, 38, 34, 17);
            var7 = this;
         } else {
            this.abq[var2].setBounds(54, 180, 68, 17);
            var7 = this;
         }

         var7.add(this.abq[var2++]);
      }

      this.abr = new com.xy.i.Class12[3];

      for (int var8 = var2 = 0; var8 < this.abr.length; var8 = ++var2) {
         com.xy.i.Class12[] var9 = this.abr;
         String var29 = "03l5lbu~3>$";
         int var30 = 303 + var2;
         Class65 var39;
         if (var2 == 0) {
            var10009 = "叟遘涆怶";
            var10009 = "发送消息";
            var39 = this;
         } else if (var2 == 1) {
            var10009 = "仴晐";
            var10009 = "交易";
            var39 = this;
         } else if (var2 == 2) {
            var10009 = "甽议八陆";
            var10009 = "申请入队";
            var39 = this;
         } else {
            var10009 = "";
            var39 = this;
         }

         com.xy.i.Class12 var23 = new com.xy.i.Class12("sc/e/26.png", 1, var30, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var10009, var39);
         var9[var2] = var23;
         this.abr[var2].setBounds(158, 211, 59, 25);
         this.add(this.abr[var2]);
         if (var2 == 0) {
            this.abr[var2].setBounds(49, 211, 99, 25);
         } else if (var2 == 1) {
            com.xy.i.Class12 var10 = this.abr[var2];
            String var14 = "# \u007f&\u007ft~3>$";
            var10.setBtnPath("sc/e/7.png");
         } else if (var2 == 2) {
            this.abr[var2].setBounds(227, 211, 99, 25);
         }
      }

      this.ap = new JLabel[7];

      for (int var11 = var2 = 0; var11 < this.ap.length; var11 = var2) {
         this.ap[var2] = com.xy.q.Class1.f(132, 38 + var2 * 23, 72, 19, 0, Color.black, com.xy.q.Class49.ch);
         JLabel var12 = this.ap[var2];
         String var16;
         if (var2 == 0) {
            var16 = "吃y.嬎";
            var16 = "名  字";
         } else if (var2 == 1) {
            var16 = "禠cp豐";
            var16 = "称  谓";
         } else if (var2 == 2) {
            var16 = "Gy.\u001d";
            var16 = "I  D";
         } else if (var2 == 3) {
            var16 = "笙cp绤";
            var16 = "等  级";
         } else if (var2 == 4) {
            var16 = "秃y.斖";
            var16 = "种  族";
         } else if (var2 == 5) {
            var16 = "儣cp粸";
            var16 = "关  系";
         } else if (var2 == 6) {
            var16 = "帠y.浧";
            var16 = "帮  派";
         } else {
            var16 = "";
         }

         var12.setText(var16);
         this.add(this.ap[var2++]);
      }

      this.jk = new com.xy.q.Class14[7];

      for (int var13 = var2 = 0; var13 < this.jk.length; var13 = var2) {
         if (var2 == 2) {
            this.bk = new RichLabel("", com.xy.q.Class49.w);
            this.bk.setBounds(209, 35 + var2 * 23, 124, 19);
            this.add(this.bk);
         }

         this.jk[var2] = com.xy.q.Class1.i(207, 38 + var2 * 23, 124, 19, 10, Color.white, com.xy.q.Class49.ac);
         com.xy.q.Class14 var25 = this.jk[var2];
         String var10003 = "03l4lat~3>$";
         var25.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.jk[var2++]);
      }
   }

   public void g(int var1) {
      if (this.abs != null) {
         if (var1 == 301) {
            RoleData var2;
            FriendBean var3;
            if ((var3 = (var2 = this.yx()).getFriend(this.abs.getFid())) == null || var3.getGroup() == 0) {
               return;
            }

            var3.setFlag((var3.f() ? 1 : 0) << 4);
            Friend var4 = new Friend();
            var4.setRoleid(var2.getLoginResult().getRole_id());
            var4.setFriendid(new BigDecimal(var3.getFid()));
            String var5 = Agreement.getSendTextAES("deletefriend", com.xy.v.Class31.a().toJson(var4));
            this.za().k(var5);
            this.zc().f(this.lj());
            if (this.zc().l(4) != null) {
               ((Class128)this.afx.getFormManagement().n(4)).amg(var2.getFriendList(), false);
               return;
            }
         } else {
            if (var1 == 302 || var1 == 303) {
               ((Class52)this.afx.getFormManagement().j(56)).st(this.yx().getFriend(this.abs.getFid()));
               return;
            }

            if (var1 == 304) {
               com.xy.d.Class8 var6;
               if ((var6 = this.afx.mapScene.j(this.abs.getRoleName())) == null) {
                  String var10001 = "珰宸秢佮女迒仟";
                  this.afx._do("玩家离你太远了");
                  return;
               }

               com.xy.d.Class8.bt(var6, this.afx);
               return;
            }

            if (var1 == 305) {
               com.xy.d.Class8.az(new BigDecimal(this.abs.getFid()), this.afx);
            }
         }
      }
   }
}
