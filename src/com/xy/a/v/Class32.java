package com.xy.a.v;

import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHRuleBattleRecord;
import java.awt.Color;
import javax.swing.JLabel;

class Class32 extends com.xy.w.Class18 {
   private com.xy.i.Class22 gp;
   private com.xy.w.Class18 gh;
   private com.xy.i.Class22 rc;
   // $VF: synthetic field
   final Class23 afk;
   private JLabel[] au;

   public Class32(Class23 var1) {
      super(com.xy.w.Class16.m("sc/d/142.png", 20, 10, 20, 10, false));
      this.afk = var1;
      String var10006 = "x{$|$)?*%he\u007f";
      this.gh = new com.xy.w.Class18();
      this.add(this.gh);
      this.au = new JLabel[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         this.au[var2] = com.xy.q.Class1.k(12, 10, 130, 20, Color.black, com.xy.q.Class49.w);
         Class32 var3;
         if (var2 == 1) {
            var3 = this;
            this.au[var2].setHorizontalAlignment(4);
            this.au[var2].setBounds(147, 10, 100, 20);
         } else if (var2 == 2) {
            var3 = this;
            JLabel var10002 = this.au[var2];
            String var10003 = "@T";
            var10002.setText("VS");
            this.au[var2].setBounds(257, 10, 18, 20);
         } else {
            if (var2 == 3) {
               this.au[var2].setHorizontalAlignment(10);
               this.au[var2].setBounds(285, 10, 100, 20);
            }

            var3 = this;
         }

         var3.add(this.au[var2++]);
      }

      String var10008 = "x{$}$)=/%he\u007f";
      String var10013 = "柳県";
      this.gp = new com.xy.i.Class22("sc/e/167.png", 1, 161, com.xy.q.Class49.n, null, "查看", var1.eg());
      this.gp.setBounds(417, 12, 61, 18);
      var10006 = "x{$}$)=/%he\u007f";
      String var10011 = "札弖姌";
      this.rc = new com.xy.i.Class22("sc/e/167.png", 1, 162, com.xy.q.Class49.n, null, "未开始", var1.eg());
      this.rc.setBounds(505, 12, 61, 18);
      this.add(this.gp);
      this.add(this.rc);
   }

   public void yf(BWDHRuleBattleRecord var1) {
      BWDHRuleBattle var2;
      Class32 var10000;
      if ((var2 = var1.getBwdhRuleBattle()).getType() == 0) {
         var10000 = this;
         JLabel var10001 = this.au[0];
         String var10004 = ")=弢抩何赐笴";
         StringBuilder var10002 = new StringBuilder("16强抢位赛第").append(var1.getIndex());
         String var10003 = "轩";
         var10001.setText(var10002.append("轮").toString());
      } else if (var2.getType() == 1) {
         var10000 = this;
         JLabel var5 = this.au[0];
         String var29 = "3弢抩何赐笴";
         StringBuilder var12 = new StringBuilder("8强抢位赛第").append(var1.getIndex());
         String var24 = "轩";
         var5.setText(var12.append("轮").toString());
      } else if (var2.getType() == 2) {
         var10000 = this;
         JLabel var6 = this.au[0];
         String var30 = "?弢抩何赐笴";
         StringBuilder var13 = new StringBuilder("4强抢位赛第").append(var1.getIndex());
         String var25 = "轩";
         var6.setText(var13.append("轮").toString());
      } else if (var2.getType() == 3) {
         var10000 = this;
         JLabel var7 = this.au[0];
         String var31 = "十冫赐笴";
         StringBuilder var14 = new StringBuilder("半决赛第").append(var1.getIndex());
         String var26 = "轩";
         var7.setText(var14.append("轮").toString());
      } else if (var2.getType() == 4) {
         var10000 = this;
         JLabel var8 = this.au[0];
         String var32 = "孨殧亂夢赐笴";
         StringBuilder var15 = new StringBuilder("季殿争夺赛第").append(var1.getIndex());
         String var27 = "轩";
         var8.setText(var15.append("轮").toString());
      } else {
         if (var2.getType() == 5) {
            JLabel var3 = this.au[0];
            String var28 = "冫亂亂夢赐笴";
            StringBuilder var9 = new StringBuilder("冠亚争夺赛第").append(var1.getIndex());
            String var16 = "轩";
            var3.setText(var9.append("轮").toString());
         }

         var10000 = this;
      }

      var10000.au[1].setText(var2.getBwdhTeam1().getName());
      this.au[3].setText(var2.getBwdhTeam2().getName());
      this.gp.setName(String.valueOf(var1.getId()));
      this.rc.setName(String.valueOf(var1.getId()));
      BWDHRuleBattleRecord var4;
      if (var1.getType() == 0) {
         var4 = var1;
         String var17 = "朲弋姓";
         this.rc.setText("未开始");
      } else if (var1.getType() == 1) {
         var4 = var1;
         String var18 = "盢撪";
         this.rc.setText("直播");
      } else if (var1.getWin() == 1 || var1.getWin() == 2) {
         String var11 = "彞僗";
         this.rc.setText("录像");
         var4 = var1;
      } else if (var1.getWin() == 5) {
         var4 = var1;
         String var19 = "时敏";
         this.rc.setText("无效");
      } else {
         String var10 = "巪绘杇";
         this.rc.setText("已结束");
         var4 = var1;
      }

      if (var4.getType() == 2) {
         if (var1.getWin() == 1) {
            String var23 = "ed9c96\"38wx`";
            this.gh.dp("sc/d/144.png");
            this.gh.setBounds(136, 5, 27, 24);
            return;
         }

         if (var1.getWin() == 2) {
            String var22 = "x{$|$)?,%he\u007f";
            this.gh.dp("sc/d/144.png");
            this.gh.setBounds(367, 5, 27, 24);
            return;
         }

         if (var1.getWin() == 3) {
            String var21 = "ed9c96/28wx`";
            this.gh.dp("sc/d/195.png");
            this.gh.setBounds(136, 5, 27, 24);
            return;
         }

         if (var1.getWin() == 4) {
            String var20 = "x{$|$)2-%he\u007f";
            this.gh.dp("sc/d/195.png");
            this.gh.setBounds(367, 5, 27, 24);
         }
      }
   }
}
