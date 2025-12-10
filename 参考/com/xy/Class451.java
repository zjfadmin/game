package com.xy;

import com.xy.bean.BeauBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Class451 extends Class345 {
   private JLabel[] iv;
   private Class245[] jc;
   private Class70[] db;
   private Class436 av;
   private Class556 ys;
   private RichLabel gi;

   public Class451(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      super(28091 & 4861, --2, Class345.aef, var1);
      this.va(var10005, 3 & 4, 30137 & 2910, 28603 & 4462, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 125 & 70, 125 & 70, 125 & 70, 125 & 70, (boolean)(5 >> 3)), (String)null);
      Class70[] var5 = new Class70[var10001];
      boolean var10003 = true;
      this.db = var5;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.db.length; var10000 = var2) {
         Class70[] var4 = this.db;
         Class70 var10002 = new Class70;
         var10005 = --1;
         int var10006 = (1510 & 31643) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class451 var10010;
         if (var2 == 0) {
            var10009 = "确定";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "取消";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/7.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var4[var2] = var10002;
         this.db[var2].setBounds((111 & 81) + (127 & 90) * var2, 15606 & 17403, 127 & 59, 123 & 29);
         this.add(this.db[var2++]);
      }

      JLabel[] var7 = new JLabel[23 & 110];
      var10003 = true;
      this.iv = var7;

      for(var10000 = var2 = 3 & 4; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.b(91 & 127, 126 & 111, 110 & 83, 30 & 111, Color.white, var2 != 0 && var2 != 3 >> 1 ? Class681.ak : Class681.ab);
         this.iv[var2].setText(var2 == 0 ? "剩余时间：" : (var2 == 5 >> 2 ? "10086天" : (var2 == 5 >> 1 ? "延时天数" : (var2 == --3 ? "每月费用" : (var2 == --4 ? "总 费 用" : (var2 == --5 ? "拥有积分" : ""))))));
         this.iv[var2].setHorizontalAlignment(123 & 14);
         Class451 var6;
         if (var2 == (4 ^ 5)) {
            var6 = this;
            this.iv[var2].setBounds(157, 110, 80, 14);
            this.iv[var2].setForeground(Color.red);
         } else {
            label95: {
               if (var2 >= --2 && var2 <= --5) {
                  this.iv[var2].setForeground(Color.black);
                  if (var2 >= 5 >> 1 && var2 <= --4) {
                     var6 = this;
                     this.iv[var2].setBounds(48, 137 + (var2 - --2) * 23, 72, 19);
                     break label95;
                  }

                  if (var2 == --5) {
                     this.iv[var2].setBounds(48, 211, 72, 19);
                  }
               }

               var6 = this;
            }
         }

         var6.add(this.iv[var2++]);
      }

      Class245[] var8 = new Class245[--3];
      var10003 = true;
      this.jc = var8;

      for(var10000 = var2 = 5 >> 3; var10000 < this.jc.length; var10000 = var2) {
         this.jc[var2] = Class133.a(122, 137 + 23 * var2, 104, 19, 10, Color.white, Class681.q);
         this.jc[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
         this.add(this.jc[var2++]);
      }

      this.jc[3 >> 2].setText("30天");
      MoneyType var3 = new MoneyType();
      var3.setIdAndKey(--4, "积分");
      this.ys = Class133.m(122, 211, 104, 19, 10, Color.white, Class681.q, var3, var1);
      this.ys.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
      this.add(this.ys);
      this.gi = new RichLabel("", Class681.q);
      this.add(this.gi);
      this.av = new Class436();
      this.av.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
      this.av.setBounds(29, 28, 220, 100);
      this.add(this.av);
   }

   public void y(int var1) {
      if (var1 == (8187 & 24966)) {
         String var2 = Agreement.getSendTextAES("BEAU", "T");
         this.uw().d(var2);
      } else {
         if (var1 == (10179 & 22975)) {
            this.ve().n(this.ae());
         }

      }
   }

   public void q() {
      if (this.bl()) {
         super.q();
      }
   }

   public boolean bl() {
      RoleData var1;
      if ((var1 = this.vd()) == null) {
         return (boolean)(3 & 4);
      } else {
         UseCardBean var5;
         BeauBean var2 = (var5 = var1.getLimit("靓号")) != null ? var5.a() : null;
         if (var2 == null) {
            return (boolean)(3 & 4);
         } else {
            Class451 var10000;
            if (var2.a()) {
               this.gi.setTextSize("#VBEAU" + var2.toString() + "#L", 22494 & 10493);
               var10000 = this;
            } else {
               this.gi.setTextSize("#cFF00FF" + var2.getBeau(), 16126 & 16861);
               var10000 = this;
            }

            var10000.gi.setBounds((31 & 125) + ((15581 & 17406) - this.gi.getWidth()) / (1 ^ 3), 116 & 79, this.gi.getWidth(), this.gi.getHeight());
            long var3;
            BeauBean var7;
            if ((var3 = (long)Math.max(var5.getUseTime(), 2 & 5)) == 0L) {
               var7 = var2;
               this.iv[3 >> 1].setText("0天");
            } else if (var3 < 60L) {
               var7 = var2;
               this.iv[3 >> 1].setText(var3 + "分钟");
            } else if (var3 < 1440L) {
               this.iv[3 >> 1].setText(var3 / 60L + "小时");
               var7 = var2;
            } else {
               this.iv[2 ^ 3].setText(var3 / 1440L + "天");
               var7 = var2;
            }

            int var6 = var7.getLvl() == (2 ^ 3) ? 126 & 7 : (var2.getLvl() == 5 >> 1 ? 126 & 99 : 198);
            int var10003 = 5 >> 2;
            int var8 = 5 >> 2;
            Class681.j(this.jc[var10003], (long)var6);
            Class681.j(this.jc[1 ^ 3], (long)var6);
            return (boolean)var8;
         }
      }
   }
}
