package com.xy.a.v;

import com.xy.bean.ConfirmBean;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBeau;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class0 extends com.xy.q.Class30 {
   private RichLabel bk;
   private com.xy.w.Class18[] j;
   private com.xy.i.Class22 bl;
   private JLabel[] au;

   public void h() {
      Activity var1;
      int var9;
      if ((var1 = this.yt().bb()) != null) {
         String var10000 = var1.getActivitySet();
         String var10001 = "霿反侍筵诒罔Q";
         String var10002 = "H";
         var9 = com.xy.v.Class12.f(var10000, "靓号信筏设置=", "|");
      } else {
         var9 = 0;
      }

      int var2 = var9;
      ActivityFC var3 = var2 > 0 ? this.yt().ba(var2) : null;
      ActivityFCBeau var4 = var3 != null ? (ActivityFCBeau)var3.getData() : null;
      Class0 var10;
      if (var4 != null) {
         var10 = this;
         long var5 = var1.getTimeOpen() + var4.getPointTime().x * 1000L;
         long var7 = var1.getTimeOpen() + var4.getPointTime().y * 1000L;
         RichLabel var12 = this.bk;
         String var10004 = "OYX\u0002X\t_\t拹攄斚闎乖\u0019\u000f|*\n\\\n\\\u001aL";
         StringBuilder var14 = new StringBuilder("#c484333投放时间为#cFF0000  ").append(com.xy.v.Class22.i(var5));
         String var10003 = "\u0014\u001e\u0014";
         var12.setTextSize(var14.append(" ~ ").append(com.xy.v.Class22.i(var7)).toString(), 500);
      } else {
         var10 = this;
         this.bk.setTextSize("", 500);
      }

      var10.bk.setBounds(101, 75, this.bk.getWidth(), this.bk.getHeight());
      JLabel var11 = this.au[1];
      String var13 = "\u000bU\u0002L秕剪";
      var11.setText("198 积分");
   }

   public void g(int var1) {
      if (var1 == 201) {
         Activity var2;
         int var5;
         if ((var2 = this.yt().bb()) != null) {
            String var10000 = var2.getActivitySet();
            String var10001 = "靧厗俕笯诀普\t";
            String var10002 = "\u0010";
            var5 = com.xy.v.Class12.f(var10000, "靓号信筏说明=", "|");
         } else {
            var5 = 0;
         }

         int var3 = var5;
         ActivityFC var4 = var3 > 0 ? this.yt().ba(var3) : null;
         GameView var6 = this.afx;
         String var10005;
         if (var4 != null) {
            var10005 = var4.getValue();
         } else {
            var10005 = "辸朞诞罚讔昺旧朘";
            var10005 = "还未设置说明文本";
         }

         ConfirmBean var7 = new ConfirmBean(35, null, var10005);
         var6.dm(var7);
      }
   }

   public Class0(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 703, 542, com.xy.q.Class30.agf);
      String var10008 = "I\u000f\u0015\t\u0015]\u0002[\u0014\u001cT\u000b";
      String var10013 = "赍乄";
      this.bl = new com.xy.i.Class22("sc/e/187.png", 1, 201, com.xy.q.Class49.bx, null, "购买", this);
      this.bl.setBounds(323, 438, 67, 35);
      this.add(this.bl);
      this.au = new JLabel[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         String var10007 = "\u0019\u000f\u0002Z\rX\u000f/";
         this.au[var2] = com.xy.q.Class1.k(306, 105, 100, 24, com.xy.q.Class49.c("#c86745C"), com.xy.q.Class49.as);
         JLabel var4 = this.au[var2];
         String var8;
         if (var2 == 0) {
            var8 = "霳參侁筻";
            var8 = "靓号信筏";
         } else if (var2 == 1) {
            var8 = "\u000bU\u0002L秕剪";
            var8 = "198 积分";
         } else if (var2 == 2) {
            var8 = "贙丐靧厗俕笯Ｘ膊宮丩临纤圫谊釥霳參";
            var8 = "购买靓号信筏，自定义一组土豪金靓号";
         } else {
            var8 = "";
         }

         var4.setText(var8);
         Class0 var5;
         if (var2 == 1) {
            var5 = this;
            this.au[var2].setBounds(280, 361, 153, 28);
            this.au[var2].setFont(com.xy.q.Class49.bx);
            JLabel var11 = this.au[var2];
            String var10002 = "\u0019\u000f~(y[\u0003T";
            var11.setForeground(com.xy.q.Class49.c("#cDDC798"));
         } else {
            if (var2 == 2) {
               this.au[var2].setBounds(182, 401, 349, 20);
               this.au[var2].setFont(com.xy.q.Class49.ck);
            }

            var5 = this;
         }

         var5.au[var2].setHorizontalAlignment(0);
         this.add(this.au[var2++]);
      }

      this.bk = new RichLabel("", com.xy.q.Class49.w);
      String var10006 = "CWT\fT\u0007S\u0007拵攊斖闀乚\u0017\u0003r&\u0004P\u0004P\u0014@\u0006P\u0006P\u0019P\u0005M\u0004Q\u0014R\u0004Z\u0004P\u000eP\u0004@J@\u0006P\u0006P\u0019P\u0005M\u0004S\u0014R\u0004Z\u0004P\u000eP\u0004";
      this.bk.setTextSize("#c484333投放时间为#cFF0000  2020-01-01 20:00:00 ~ 2020-01-03 20:00:00", 500);
      this.bk.setBounds(101, 75, this.bk.getWidth(), this.bk.getHeight());
      this.add(this.bk);
      this.j = new com.xy.w.Class18[4];

      for (int var6 = var2 = 0; var6 < this.j.length; var6 = var2) {
         this.j[var2] = new com.xy.w.Class18();
         Class0 var7;
         if (var2 == 0) {
            var7 = this;
            com.xy.w.Class18 var14 = this.j[var2];
            String var10003 = "I\u000f\u0015\b\u0015^\n\\\u0014\u001cT\u000b";
            var14.dp("sc/d/200.png");
            this.j[var2].setBounds(301, 163, 110, 184);
         } else if (var2 == 1) {
            var7 = this;
            com.xy.w.Class18 var15 = this.j[var2];
            String var19 = "\u0013WOPO\u0005S\rND\u000eS";
            var15.dp("sc/d/139.png");
            this.j[var2].setBounds(280, 361, 153, 28);
         } else if (var2 == 2) {
            var7 = this;
            com.xy.w.Class18 var16 = this.j[var2];
            String var20 = "I\u000f\u0015\b\u0015^\n^\u0014\u001cT\u000b";
            var16.dp("sc/d/202.png");
            this.j[var2].setBounds(93, 39, 608, 407);
         } else {
            if (var2 == 3) {
               com.xy.w.Class18 var12 = this.j[var2];
               String var17 = "\u0013WOPO\u0005S\u0006ND\u000eS";
               var12.mt(com.xy.w.Class16.m("sc/d/132.png", 50, 50, 50, 50, false));
               this.j[var2].setBounds(45, 68, 633, 432);
            }

            var7 = this;
         }

         var7.add(this.j[var2++]);
      }
   }
}
