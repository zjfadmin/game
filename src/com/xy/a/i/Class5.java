package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.Class11;
import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.q.Class54;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class5 extends com.xy.q.Class30 {
   private Class54 fv;
   private Class2 fw;
   private com.xy.q.Class21 fx;
   private com.xy.w.Class18 fy;
   private com.xy.q.Class36[] fz;
   private com.xy.i.Class3[] ga;
   private com.xy.q.Class14 gb;
   private JLabel[] ay;
   private com.xy.w.Class18[] j;
   private com.xy.i.Class11[] gc;
   private com.xy.q.Class27 gd;

   public com.xy.q.Class36[] eo() {
      return this.fz;
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public Class54 ep() {
      return this.fv;
   }

   public void h() {
      int var1 = 1 + this.yx().goodPacks.length / 24;
      if (this.ga == null || this.ga.length != var1) {
         this.ga = this.zd(this.ga, var1, this.fx.ah());
         short var2 = 523;
         short var3 = 259;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.ga.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.ga[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.fx.vr(this.ga, 0);
      }
   }

   public Class5(GameView var1) {
      super(63, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 559, 495, com.xy.q.Class30.agh);
      com.xy.w.Class9 var41 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "優挕瀎侙假";
      this.yu(var41, "兑换灵修值");
      this.rm(false);
      this.wp(new com.xy.v.Class32(14, 0, 7, 0));
      this.gc = new com.xy.i.Class11[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.gc.length; var10000 = var2) {
         com.xy.i.Class11[] var6 = this.gc;
         String var10004 = "d\u000e8\b8_/Cg\u0003p";
         int var42 = 7 + var2;
         String var43;
         Class5 var10010;
         if (var2 == 0) {
            var43 = "骯络枒讙";
            var43 = "高级查询";
            var10010 = this;
         } else if (var2 == 2) {
            var43 = "儼捵";
            var43 = "兑换";
            var10010 = this;
         } else {
            var43 = "";
            var10010 = this;
         }

         Class11 var10002 = new Class11("sc/e/28.png", 1, var42, Class49.ch, null, var43, var10010);
         var6[var2] = var10002;
         this.gc[var2].setBounds(323, 24, 68, 18);
         Class5 var7;
         if (var2 == 0) {
            var7 = this;
            this.gc[var2].setFont(Class49.bz);
         } else if (var2 == 1) {
            var7 = this;
            var10002 = this.gc[var2];
            String var10003 = "\b\u0014T\u0012TANY\u000b\u0019\u001c";
            var10002.setImage("sc/e/65.png");
            this.gc[var2].setBounds(487, 24, 18, 18);
         } else {
            if (var2 == 2) {
               this.gc[var2].setForeground(Color.black);
               com.xy.i.Class11 var10001 = this.gc[var2];
               String var27 = "\u001etBrB Cg\u0003p";
               var10001.setImage("sc/e/7.png");
               this.gc[var2].setBounds(97, 445, 59, 25);
            }

            var7 = this;
         }

         var7.add(this.gc[var2++]);
      }

      this.fy = new com.xy.w.Class18();
      this.fy.setBounds(45, 255, 17, 17);
      this.add(this.fy);
      this.fw = new Class2(this, this.fy);
      this.fw.cl().setBounds(46, 64, 165, 187);
      this.add(this.fw.cl());
      this.fw.cn().setBounds(216, 44, 306, 210);
      this.add(this.fw.cn());
      this.ay = new JLabel[5];

      for (int var8 = var2 = 0; var8 < this.ay.length; var8 = var2) {
         String var10008 = "T\u0018GKGKGK";
         this.ay[var2] = com.xy.q.Class1.f(46, 43, 165, 21, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var9 = this.ay[var2];
         String var15;
         if (var2 == 0) {
            var15 = "夺裒剺衿";
            var15 = "套装列表";
         } else if (var2 == 1) {
            var15 = "厑晉祁嶅杲現筝";
            var15 = "只显示已有玉符";
         } else if (var2 == 2) {
            var15 = "玞筋戁丰玓亴玞";
            var15 = "玉符或九玄仙玉";
         } else if (var2 == 3) {
            var15 = "儦挙攇醴";
            var15 = "兑换数量";
         } else if (var2 == 4) {
            var15 = "厂莠忺灢侃倫";
            var15 = "可获得灵修值";
         } else {
            var15 = "";
         }

         var9.setText(var15);
         Class5 var10;
         if (var2 == 0) {
            var10 = this;
            JLabel var29 = this.ay[var2];
            String var39 = "T\u00181=1=1=";
            var29.setForeground(Class49.c("#cFFFFFF"));
            this.ay[var2].setHorizontalAlignment(0);
         } else if (var2 == 1) {
            var10 = this;
            this.ay[var2].setFont(Class49.n);
            this.ay[var2].setBounds(63, 256, 100, 14);
         } else if (var2 == 2) {
            var10 = this;
            this.ay[var2].setHorizontalAlignment(0);
            this.ay[var2].setBounds(36, 340, 180, 18);
         } else {
            if (var2 >= 3 && var2 <= 4) {
               this.ay[var2].setBounds(58, 371 + 35 * (var2 - 3), 120, 17);
            }

            var10 = this;
         }

         var10.add(this.ay[var2++]);
      }

      this.fz = new com.xy.q.Class36[2];

      for (int var11 = var2 = 0; var11 < this.fz.length; var11 = var2) {
         String var31 = "d\u000e8\t8\\ Cg\u0003p";
         this.fz[var2] = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), Class49.w, Color.white);
         if (var2 == 0) {
            this.fz[var2].setBounds(396, 23, 110, 20);
            var11 = var2;
         } else {
            this.fz[var2].setBounds(55, 387, 144, 19);
            var11 = var2;
         }

         if (var11 == 1) {
            this.gd = new com.xy.q.Class27(15, this.fz[var2], this);
         }

         this.add(this.fz[var2++]);
      }

      this.gb = com.xy.q.Class1.i(55, 422, 144, 19, 10, Color.white, Class49.w);
      String var10005 = "\b\u0014T\u0013TFLY\u000b\u0019\u001c";
      this.gb.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.gb);
      this.fv = new Class54(this);
      this.fv.setBounds(100, 284, 50, 50);
      this.add(this.fv);
      this.j = new com.xy.w.Class18[6];

      for (int var13 = var2 = 0; var13 < this.j.length; var13 = ++var2) {
         this.j[var2] = new com.xy.w.Class18();
         this.add(this.j[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var20 = this.j[var2];
            String var33 = "d\u000e8\t8_\"Cg\u0003p";
            var20.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(46, 43, 165, 21);
         } else if (var2 == 1) {
            com.xy.w.Class18 var21 = this.j[var2];
            String var34 = "\b\u0014T\u0013TEOY\u000b\u0019\u001c";
            var21.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(46, 43, 165, 210);
         } else if (var2 == 2) {
            com.xy.w.Class18 var22 = this.j[var2];
            String var35 = "d\u000e8\t8_#Cg\u0003p";
            var22.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(214, 44, 308, 210);
         } else if (var2 == 3) {
            com.xy.w.Class18 var23 = this.j[var2];
            String var36 = "\u0004\u0018X\u001fXOY\u000b\u0019\u001c";
            var23.dp("sc/d/4.png");
            this.j[var2].setBounds(96, 280, 59, 57);
         } else if (var2 == 4) {
            com.xy.w.Class18 var24 = this.j[var2];
            String var37 = "d\u000e8\t8^'Cg\u0003p";
            var24.dp("sc/d/30.png");
            this.j[var2].setBounds(97, 337, 58, 1);
         } else if (var2 == 5) {
            com.xy.w.Class18 var25 = this.j[var2];
            String var38 = "\b\u0014T\u0013TFBY\u000b\u0019\u001c";
            var25.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(214, 259, 309, 207);
         }
      }

      this.fx = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 215, 261);
      String var40 = "d\u000e8\t8\\/Cg\u0003p";
      this.fx.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.fx.rm(true);
      this.add(this.fx);
   }

   @Override
   public void l() {
      this.h();
      this.fw.h();
      this.fv.gs(0, null);
      this.fz[1].setText("0");
      super.l();
   }

   public void ds(long var1, JTextField var3) {
      if (var1 <= 0L) {
         Class49.b(this.gb, 0L);
      } else if (this.fv.il() == 1) {
         Class49.b(this.gb, 3L * var1);
      } else if (this.fv.il() == 14) {
         Class49.b(this.gb, MsgUntil.o((int)this.fv.ee()) * var1);
      } else {
         Class49.b(this.gb, 0L);
      }
   }

   public Class2 eq() {
      return this.fw;
   }

   public void g(int var1) {
      if (var1 == 9) {
         RoleData var2;
         Goodstable var3;
         PartJade var4;
         int var5;
         Goodstable var10000;
         label42: {
            var2 = this.yx();
            var3 = null;
            var4 = null;
            var5 = 0;
            if (this.fv.il() == 1) {
               if ((var3 = (Goodstable)this.fv.jx()) != null) {
                  var10000 = var3 = var2.getGood(var3.getRgid());
                  break label42;
               }
            } else if (this.fv.il() == 14) {
               var4 = (PartJade)this.fv.jx();
               var5 = (int)this.fv.ee();
            }

            var10000 = var3;
         }

         if (var10000 == null && var4 == null) {
            String var14 = "讀遲択伛觶優挕盿現筝扡珿現べ";
            this.afx.dp("请选择你要兑换的玉符或玄玉。");
            return;
         }

         int var6;
         if ((var6 = (int)this.gd.ee()) <= 0) {
            String var13 = "诠迾兲伍視儼捵盩玞筋戁珩玞盩敧醢〕";
            this.afx._do("请输入你要兑换的玉符或玄玉的数量。");
            return;
         }

         int var7 = 0;
         SuitOperBean var8 = new SuitOperBean();
         var8.setType(7);
         if (var4 != null) {
            PartJade var9 = new PartJade(var4.getSuitid(), var4.getPartId());
            var9.setJade(var5, var6);
            var7 = MsgUntil.o(var5) * var6;
            var8.setJade(var9);
            var4.b(var5, var6);
         } else if (var3 != null) {
            if (var6 > var3.getUsetime()) {
               String var10001 = "爞咺攇醴乺跈";
               this.afx._do("物品数量不足");
               return;
            }

            PartJade var11;
            (var11 = new PartJade(-1L, -1)).setJade1(var6);
            ArrayList var10;
            (var10 = new ArrayList()).add(var3.getRgid());
            var8.setGoods(var10);
            var8.setJade(var11);
            var7 = var6 * 3;
            var3.n(var6);
            if (var3.getUsetime() <= 0) {
               var2.ag(var3.getRgid());
            }
         }

         String var12 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var8));
         this.za().k(var12);
         GameView var10002 = this.afx;
         String var10005 = "菚往仫7";
         StringBuilder var10003 = new StringBuilder("获得了 ").append(var7);
         String var10004 = "[烎瀎侙假YU";
         var10002.dp(var10003.append(" 点灵修值..").toString());
         this.fv.gs(0, null);
         this.fz[1].setText("0");
      }
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 >= 0L && this.fv.il() != 0) {
         if (this.fv.il() == 1) {
            Goodstable var4 = (Goodstable)this.fv.jx();
            if (var1 > var4.getUsetime().intValue() && var4.getUsetime() <= 999) {
               return var4.getUsetime().longValue();
            }
         } else if (this.fv.il() == 14) {
            PartJade var6 = (PartJade)this.fv.jx();
            int var5 = (int)this.fv.ee();
            if (var1 > var6.getJade(var5) && var6.getJade(var5) <= 999) {
               return (long)var6.getJade(var5);
            }
         }

         return var1 > 999L ? 999L : null;
      } else {
         return 0L;
      }
   }
}
