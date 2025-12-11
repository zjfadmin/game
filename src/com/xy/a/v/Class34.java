package com.xy.a.v;

import com.xy.richtext.RichLabel;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class34 extends com.xy.q.Class30 {
   private RichLabel in;
   private com.xy.w.Class18[] fd;
   private RichLabel bk;
   private JLabel[] gj;
   private RichLabel ck;
   private JLabel[] au;

   public Class34(GameView var1) {
      super(178, 2, com.xy.q.Class30.afz, var1);
      String var10004 = "\u0004\u001aX\u001dXHO@Y\t\u0019\u001e";
      this.yy(-1, 0, 747, 383, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/189.png", 0, 0, 0, 0, false), null);
      this.wp(new com.xy.v.Class32(0, 0, 25, 0));
      this.au = new JLabel[16];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         String var10007 = "T\u00181=1IO9";
         this.au[var2] = com.xy.q.Class1.k(194, 19, 360, 30, com.xy.q.Class49.c("#cFFF28B"), com.xy.q.Class49.ao);
         JLabel var5 = this.au[var2];
         String var10;
         if (var2 == 0) {
            var10 = "扯旮嚩呱攇｣N@";
            var10 = "战斗回合数：99";
         } else if (var2 == 1) {
            var10 = "除佺呶禇J";
            var10 = "队伍名称1";
         } else if (var2 == 2) {
            var10 = "陦佺呴禇K";
            var10 = "队伍名称2";
         } else if (var2 == 3) {
            var10 = "殯欑奜佭禔剱攋";
            var10 = "比武大会积分数";
         } else if (var2 == 4) {
            var10 = "扯旮纤朦斁嬡浌匬伺攉";
            var10 = "战斗结束时存活单位数";
         } else if (var2 == 5) {
            var10 = "儓坍秀坍厗啓儆";
            var10 = "全场离场召唤兽";
         } else if (var2 == 6) {
            var10 = "扯旮纤朦斁坑坍瀌寪攉";
            var10 = "战斗结束时在场灵宝数";
         } else if (var2 == 7) {
            var10 = "儓坍秀坍瀎寪攋";
            var10 = "全场离场灵宝数";
         } else {
            var10 = "";
         }

         var5.setText(var10);
         this.au[var2].setHorizontalAlignment(0);
         Class34 var6;
         if (var2 != 1 && var2 != 2) {
            if (var2 >= 3 && var2 <= 7) {
               this.au[var2].setFont(com.xy.q.Class49.n);
               this.au[var2].setBounds(211, 186 + (var2 - 3) * 25, 326, 20);
            }

            var6 = this;
         } else {
            var6 = this;
            this.au[var2].setFont(com.xy.q.Class49.ar);
            JLabel var10002 = this.au[var2];
            String var10003 = "T\u001a1?1?1?";
            var10002.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
            this.au[var2].setBounds(148 + (var2 - 1) * 269, 126, 182, 44);
         }

         var6.add(this.au[var2++]);
      }

      String var10010 = "T\u00183J4HCIFKGK_X0PFKGX\u0014?F8DOER";
      this.in = new RichLabel("#cD1C3421000(#G+100#cD1C342)", com.xy.q.Class49.n, 90);
      String var10009 = "T\u001a3H4JCK_Z%TFIGZ\u0014=F:DMEPFIGI";
      this.bk = new RichLabel("#cD1C342(#R-100#cD1C342)1000", com.xy.q.Class49.n, 90);
      this.in.setBounds(240, 185, 90, 20);
      this.bk.setBounds(507 - this.bk.getWidth(), 185, 90, 20);
      this.add(this.in);
      this.add(this.bk);
      this.gj = new JLabel[8];

      for (int var7 = var2 = 0; var7 < this.gj.length; var7 = var2) {
         int var33 = 240 + var2 / 4 * 237;
         int var10005 = 211 + var2 % 4 * 25;
         String var10008 = "T\u00183J4HCI";
         this.gj[var2] = com.xy.q.Class1.k(var33, var10005, 30, 20, com.xy.q.Class49.c("#cD1C342"), com.xy.q.Class49.n);
         this.gj[var2].setText("0");
         this.gj[var2].setHorizontalAlignment(var2 < 4 ? 10 : 4);
         this.add(this.gj[var2++]);
      }

      this.ck = new RichLabel("", com.xy.q.Class49.n, 747);
      this.add(this.ck);
      this.fd = new com.xy.w.Class18[12];

      for (int var8 = var2 = 0; var8 < this.fd.length; var8 = var2) {
         this.fd[var2] = new com.xy.w.Class18();
         Class34 var9;
         if (var2 == 0) {
            var9 = this;
            com.xy.w.Class18 var21 = this.fd[var2];
            String var28 = "\u0004\u001aX\u001dXHNHY\t\u0019\u001e";
            var21.dp("sc/d/191.png");
            this.fd[var2].setBounds(342, 103, 64, 84);
         } else if (var2 == 1) {
            var9 = this;
            com.xy.w.Class18 var22 = this.fd[var2];
            String var29 = "\u0004\u0018X\u001fXJNIY\u000b\u0019\u001c";
            var22.dp("sc/d/192.png");
            this.fd[var2].setBounds(196, 73, 86, 45);
         } else if (var2 == 2) {
            var9 = this;
            com.xy.w.Class18 var23 = this.fd[var2];
            String var30 = "\u0004\u001aX\u001dXHNJY\t\u0019\u001e";
            var23.dp("sc/d/193.png");
            this.fd[var2].setBounds(463, 73, 90, 47);
         } else if (var2 == 3 || var2 == 4) {
            var9 = this;
            com.xy.w.Class18 var26 = this.fd[var2];
            String var32 = "\u0004\u0018X\u001fXJNOY\u000b\u0019\u001c";
            var26.dp("sc/d/194.png");
            this.fd[var2].setBounds(148 + (var2 - 3) * 269, 126, 182, 51);
         } else if (var2 != 5 && var2 != 6) {
            if (var2 >= 7 && var2 <= 11) {
               com.xy.w.Class18 var18 = this.fd[var2];
               String var25 = "\u0004\u0018X\u001fXJDBY\u000b\u0019\u001c";
               var18.dp("sc/d/139.png");
               this.fd[var2].setBounds(211, 186 + (var2 - 7) * 25, 326, 20);
            }

            var9 = this;
         } else {
            var9 = this;
            com.xy.w.Class18 var24 = this.fd[var2];
            String var31 = "\n\u0014V\u0013VAOY\t\u0019\u001e";
            var24.dp("sc/d/66.png");
            this.fd[var2].setBounds(115, 56 + (var2 - 5) * 251, 561, 2);
         }

         var9.add(this.fd[var2++]);
      }
   }

   public void yl(boolean var1, int var2, int var3, BWDHTeam var4, BWDHTeam var5, String var6) {
      JLabel var10002 = this.au[0];
      String var10005 = "扯旮嚩呱攇｣";
      var10002.setText("战斗回合数：" + var3);
      this.au[1].setText(var4.getName());
      this.au[2].setText(var5.getName());
      BWDHTeam var10;
      if (var4.getData2()[1] != 0) {
         RichLabel var10000 = this.in;
         String var10003 = "T\u00183J4HCI";
         StringBuilder var10001 = new StringBuilder("#cD1C342").append(var4.getData2()[0]);
         String var21 = "Q";
         var10001 = var10001.append("(");
         String var23;
         if (var4.getData2()[1] > 0) {
            String var22 = "T<";
            var23 = "#G";
         } else {
            String var24 = "T+";
            var23 = "#R";
         }

         var10001 = var10001.append(var23).append(var4.getData2()[1]);
         String var25 = "X\u0014?F8DOER";
         var10000.setTextSize(var10001.append("#cD1C342)").toString(), 90);
         var10 = var5;
      } else {
         String var30 = "T\u001a3H4JCK";
         this.in.setTextSize("#cD1C342" + var4.getData2()[0], 90);
         var10 = var5;
      }

      Class34 var12;
      if (var10.getData2()[1] != 0) {
         RichLabel var11 = this.bk;
         String var31 = "X\u0014?F8DOES";
         StringBuilder var18 = new StringBuilder("#cD1C342(");
         String var27;
         if (var5.getData2()[1] > 0) {
            String var26 = "T>";
            var27 = "#G";
         } else {
            String var28 = "T)";
            var27 = "#R";
         }

         var18 = var18.append(var27).append(var5.getData2()[1]);
         String var29 = "Z\u0014=F:DMEP";
         var11.setTextSize(var18.append("#cD1C342)").append(var5.getData2()[0]).toString(), 90);
         var12 = this;
      } else {
         var12 = this;
         String var10004 = "T\u00183J4HCI";
         this.bk.setTextSize("#cD1C342" + var5.getData2()[0], 90);
      }

      var12.bk.setBounds(507 - this.bk.getWidth(), 185, 90, 20);

      int var7;
      for (int var13 = var7 = 0; var13 < 2; var13 = var7) {
         int var8 = var7 == 0 ? 0 : 4;
         BWDHTeam var9 = var7 == 0 ? var4 : var5;
         this.gj[var8 + 0].setText(String.valueOf(var9.getData2()[2]));
         this.gj[var8 + 1].setText(String.valueOf(var9.getData2()[3]));
         this.gj[var8 + 2].setText(String.valueOf(var9.getData2()[4]));
         JLabel var14 = this.gj[var8 + 3];
         int[] var20 = var9.getData2();
         var7++;
         var14.setText(String.valueOf(var20[5]));
      }

      Class34 var15;
      if (!com.xy.v.Class12.h(var6)) {
         String var32 = "T.";
         this.ck.setTextSize("#W" + var6, 747);
         var15 = this;
      } else {
         this.ck.setTextSize(null, 747);
         var15 = this;
      }

      var15.ck.setBounds((747 - this.ck.getWidth()) / 2, 326, this.ck.getWidth(), 20);
      this.zc().b(this.lj());
   }
}
