package com.xy.a.a;

import com.xy.bean.SuitOperBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class25 extends com.xy.q.Class30 {
   private com.xy.w.Class18 nn;
   private List<BigDecimal> wq;
   private com.xy.i.Class4[] ly;
   private JLabel[] o;
   private com.xy.q.Class58 wr;

   public Class25(GameView var1) {
      super(96, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 390, 365, com.xy.q.Class30.agh);
      com.xy.w.Class9 var13 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10005 = "鬤彁";
      this.yu(var13, "魂归");
      this.wq = new ArrayList<>();
      this.ly = new com.xy.i.Class4[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ly.length; var10000 = var2) {
         String var10006 = ")>u8uols*3=";
         this.ly[var2] = new com.xy.i.Class4("sc/e/26.png", 1, 116, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "", this);
         this.ly[var2].setBounds(80 + var2 * 151, 303, 99, 25);
         com.xy.i.Class4 var4 = this.ly[var2];
         String var7;
         if (var2 == 0) {
            var7 = "硽F讷";
            var7 = "确 认";
         } else if (var2 == 1) {
            var7 = "厌}淒";
            var7 = "取 消";
         } else {
            var7 = "";
         }

         var4.setText(var7);
         this.add(this.ly[var2++]);
      }

      this.o = new JLabel[2];

      for (int var5 = var2 = 0; var5 < this.o.length; var5 = var2) {
         this.o[var2] = com.xy.q.Class1.k(58, 25 + var2 * 18, 309, 18, Color.red, com.xy.q.Class49.ch);
         JLabel var6 = this.o[var2];
         String var10;
         if (var2 == 0) {
            var10 = "渺駎揃祜）厉巵镈通之変乌迈蠪魑弴？";
            var10 = "温馨提示：可左键选中多个进行魂归，";
         } else if (var2 == 1) {
            var10 = "厮镴厲亿压淒";
            var10 = "右键可以取消";
         } else {
            var10 = "";
         }

         var6.setText(var10);
         this.add(this.o[var2++]);
      }

      this.nn = new com.xy.w.Class18();
      String var10004 = "`\u0005<\u0002<W*Hc\bt";
      this.nn.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.nn.setBounds(50, 68, 309, 207);
      this.add(this.nn);
      this.wr = new com.xy.q.Class58(this, 6, 4, 51, 51, 0, 0, 51, 70);
      var10004 = ")>u9ulbs*3=";
      this.wr.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.add(this.wr);
   }

   @Override
   public void l() {
      this.wq.clear();
      super.l();
   }

   public void g(int var1) {
      if (var1 == 116) {
         if (this.wq.size() == 0) {
            String var10001 = "诤遯拺膕専书丹觧魑弴皗晹卲";
            this.afx.dp("请选择至少一个要魂归的星卡");
         } else {
            SuitOperBean var2 = new SuitOperBean();
            var2.setGoods(this.wq);
            var2.setType(57);
            String var3 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var2));
            this.za().k(var3);
         }
      } else {
         if (var1 == 117) {
            this.zc().f(this.lj());
         }
      }
   }

   public List<BigDecimal> rs() {
      return this.wq;
   }

   public void i(BigDecimal var1) {
      if (!this.wq.remove(var1)) {
         this.wq.add(var1);
      }
   }
}
