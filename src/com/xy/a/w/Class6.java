package com.xy.a.w;

import com.xy.bean.BeauBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class20;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class6 extends com.xy.q.Class30 {
   private RichLabel in;
   private JLabel[] r;
   private Class52 em;
   private com.xy.q.Class14[] dv;
   private com.xy.i.Class20[] ag;
   private com.xy.w.Class18 dn;

   public Class6(GameView var1) {
      super(185, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 280, 298, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), null);
      this.ag = new com.xy.i.Class20[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ag.length; var10000 = var2) {
         com.xy.i.Class20[] var6 = this.ag;
         String var10004 = "V\u0012\n\u0014\nF\u000b\u0001K\u0016";
         int var10006 = 386 + var2;
         String var25;
         Class6 var10010;
         if (var2 == 0) {
            var25 = "硸宆";
            var25 = "确定";
            var10010 = this;
         } else if (var2 == 1) {
            var25 = "右淹";
            var25 = "取消";
            var10010 = this;
         } else {
            var25 = "";
            var10010 = this;
         }

         Class20 var10002 = new Class20("sc/e/7.png", 1, var10006, Class49.ch, Class49.bv, var25, var10010);
         var6[var2] = var10002;
         this.ag[var2].setBounds(65 + 90 * var2, 242, 59, 25);
         this.add(this.ag[var2++]);
      }

      this.r = new JLabel[6];

      for (int var7 = var2 = 0; var7 < this.r.length; var7 = var2) {
         this.r[var2] = com.xy.q.Class1.k(91, 110, 66, 14, Color.white, var2 != 0 && var2 != 1 ? Class49.ch : Class49.n);
         JLabel var8 = this.r[var2];
         String var11;
         if (var2 == 0) {
            var11 = "創住旪闢＆";
            var11 = "剩余时间：";
         } else if (var2 == 1) {
            var11 = "\u0014A\u0015I\u0013奘";
            var11 = "10086天";
         } else if (var2 == 2) {
            var11 = "廠旪夿敬";
            var11 = "延时天数";
         } else if (var2 == 3) {
            var11 = "毪杹贜留";
            var11 = "每月费用";
         } else if (var2 == 4) {
            var11 = "性6败6甴";
            var11 = "总 费 用";
         } else if (var2 == 5) {
            var11 = "拀杸秊剷";
            var11 = "拥有积分";
         } else {
            var11 = "";
         }

         var8.setText(var11);
         this.r[var2].setHorizontalAlignment(10);
         Class6 var9;
         if (var2 == 1) {
            var9 = this;
            this.r[var2].setBounds(157, 110, 80, 14);
            this.r[var2].setForeground(Color.red);
         } else {
            label72: {
               if (var2 >= 2 && var2 <= 5) {
                  this.r[var2].setForeground(Color.black);
                  if (var2 >= 2 && var2 <= 4) {
                     var9 = this;
                     this.r[var2].setBounds(48, 137 + (var2 - 2) * 23, 72, 19);
                     break label72;
                  }

                  if (var2 == 5) {
                     this.r[var2].setBounds(48, 211, 72, 19);
                  }
               }

               var9 = this;
            }
         }

         var9.add(this.r[var2++]);
      }

      this.dv = new com.xy.q.Class14[3];

      String var10003;
      for (int var10 = var2 = 0; var10 < this.dv.length; var10 = var2) {
         this.dv[var2] = com.xy.q.Class1.i(122, 137 + 23 * var2, 104, 19, 10, Color.white, Class49.w);
         com.xy.q.Class14 var19 = this.dv[var2];
         var10003 = "ou3r3'+8lx{";
         var19.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.dv[var2++]);
      }

      com.xy.q.Class14 var23 = this.dv[0];
      String var10005 = "B\u0015奘";
      var23.setText("30天");
      MoneyType var5 = new MoneyType();
      String var10007 = "秹刚";
      var5.setIdAndKey(4, "积分");
      this.em = com.xy.q.Class1.m(122, 211, 104, 19, 10, Color.white, Class49.w, var5, var1);
      var10003 = "\u0002F^A^\u0014F\u000b\u0001K\u0016";
      this.em.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.em);
      this.in = new RichLabel("", Class49.w);
      this.add(this.in);
      this.dn = new com.xy.w.Class18();
      String var24 = "ou3r3'+8lx{";
      this.dn.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.dn.setBounds(29, 28, 220, 100);
      this.add(this.dn);
   }

   public void g(int var1) {
      if (var1 == 386) {
         String var10001 = "H";
         String var2 = Agreement.getSendTextAES("BEAU", "T");
         this.za().k(var2);
      } else {
         if (var1 == 387) {
            this.zc().f(this.lj());
         }
      }
   }

   public boolean dh() {
      RoleData var1;
      if ((var1 = this.yx()) == null) {
         return false;
      } else {
         UseCardBean var2;
         BeauBean var3 = (var2 = var1.getLimit("靓号")) != null ? var2.a() : null;
         if (var3 == null) {
            return false;
         } else {
            Class6 var7;
            if (var3.a()) {
               RichLabel var10000 = this.in;
               String var10003 = "\u0006'g4d$";
               StringBuilder var10001 = new StringBuilder("#VBEAU").append(var3.toString());
               String var10002 = "5P";
               var10000.setTextSize(var10001.append("#L").toString(), 220);
               var7 = this;
            } else {
               String var19 = "\u0006\u0012c7\u0015Ac7";
               this.in.setTextSize("#cFF00FF" + var3.getBeau(), 220);
               var7 = this;
            }

            var7.in.setBounds(29 + (220 - this.in.getWidth()) / 2, 68, this.in.getWidth(), this.in.getHeight());
            long var4;
            BeauBean var8;
            if ((var4 = Math.max(var2.getUseTime(), 0)) == 0L) {
               var8 = var3;
               JLabel var11 = this.r[1];
               String var15 = "&夵";
               var11.setText("0天");
            } else if (var4 < 60L) {
               var8 = var3;
               JLabel var12 = this.r[1];
               StringBuilder var16 = new StringBuilder(String.valueOf(var4));
               String var20 = "刣铮";
               var12.setText(var16.append("分钟").toString());
            } else if (var4 < 1440L) {
               JLabel var9 = this.r[1];
               StringBuilder var13 = new StringBuilder(String.valueOf(var4 / 60L));
               String var17 = "尙旪";
               var9.setText(var13.append("小时").toString());
               var8 = var3;
            } else {
               JLabel var10 = this.r[1];
               StringBuilder var14 = new StringBuilder(String.valueOf(var4 / 1440L));
               String var18 = "奘";
               var10.setText(var14.append("天").toString());
               var8 = var3;
            }

            int var6 = var8.getLvl() == 1 ? 6 : (var3.getLvl() == 2 ? 98 : 198);
            Class49.b(this.dv[1], var6);
            Class49.b(this.dv[2], var6);
            return true;
         }
      }
   }

   @Override
   public void l() {
      if (this.dh()) {
         super.l();
      }
   }
}
