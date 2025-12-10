package com.xy;

import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameAWTEventListener;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class682 extends Class345 {
   private Class436 tu;
   private JLabel[] ai;
   private Class319[] any;
   private Class217[] anz;
   private RichLabel bv;
   private Class70 acg;
   private Class72 aoa;
   private JScrollPane af;

   public Class682(GameView var1) {
      int var10001 = --4;
      int var10008 = -4 >> 2;
      super(15357 & 17591, 5 >> 1, Class345.aef, var1);
      this.va(var10008, 3 ^ 3, 21999 & 11132, 31581 & 1526, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 111 & 84, 111 & 84, 111 & 84, 111 & 84, (boolean)(3 ^ 3)), "货郎喊话");
      this.acg = new Class70("sc/e/26.png", --1, 11125 & 22015, Class681.ak, Class681.c, "开始执行", this);
      this.acg.setBounds(12287 & 20625, 29687 & 3375, 107 & 119, 57 & 95);
      this.add(this.acg);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.ai = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ai.length; var10000 = var2) {
         this.ai[var2] = Class133.b(123 & 53, 127 & 27, 125 & 102, 87 & 59, Color.black, Class681.ak);
         this.ai[var2].setText(var2 == 0 ? "喊话设置" : (var2 == (3 & 5) ? "间隔分钟" : (var2 == (1 ^ 3) ? "喊话次数" : (var2 == --3 ? "喊话内容" : ""))));
         this.ai[var2].setHorizontalAlignment(63 & 74);
         this.add(this.ai[var2]);
         if (var2 == 0) {
            this.ai[var2].setFont(Class681.cf);
         } else if (var2 >= (4 ^ 5) && var2 <= --3) {
            this.ai[var2].setBounds(95 & 102, (103 & 93) + (var2 - (4 ^ 5)) * 25, 72, 19);
         }

         ++var2;
      }

      var10001 = --2;
      this.bv = new RichLabel("", Class681.ab);
      this.bv.setTextSize("#c000000自动喊话：#r系统每隔一段时间后自动喊话。#r每次喊话扣除#cFF0000200#c000000万两大话币。", 280);
      this.bv.setBounds(55, 232, this.bv.getWidth(), this.bv.getHeight());
      this.add(this.bv);
      Class217[] var4 = new Class217[var10001];
      var10003 = true;
      this.anz = var4;
      Class319[] var5 = new Class319[5 >> 1];
      var10003 = true;
      this.any = var5;

      for(var10000 = var2 = 3 & 4; var10000 < this.anz.length; var10000 = var2) {
         this.anz[var2] = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)), Class681.q, Color.white);
         this.anz[var2].setBounds(144, 69 + 25 * var2, 115, 19);
         this.any[var2] = new Class319(3 >> 2, this.anz[var2], this);
         this.add(this.anz[var2++]);
      }

      this.aoa = Class133.g(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)), Class681.ce, Color.white);
      this.aoa.setLineWrap((boolean)(--1));
      this.aoa.setWrapStyleWord((boolean)(3 & 5));
      this.af = Class133.f(74, 140, 250, 77, this.aoa, 20);
      this.add(this.af);
      this.tu = new Class436();
      this.tu.eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 >> 2)));
      this.tu.setBounds(54, 52, 281, 176);
      this.add(this.tu);
   }

   public void q() {
      this.anz[5 >> 3].setText("5");
      this.anz[3 & 5].setText("10");
      this.aoa.setText((String)null);
      super.q();
   }

   public void y(int var1) {
      if (var1 == (5501 & 27639)) {
         var1 = (int)this.any[5 >> 3].gl();
         int var4 = (int)this.any[5 >> 2].gl();
         if (var1 <= 0) {
            this.aej.f("时间间隔不能为0");
            return;
         }

         if (var4 <= 0) {
            this.aej.f("喊话次数不能为0");
            return;
         }

         String var3;
         if (Class394.o(var3 = this.aoa.getText().trim().replace("\n", ""))) {
            this.aej.f("喊话内容不能为空");
            return;
         }

         if (var3.length() > (127 & 100)) {
            this.aej.fw("最大字符限制100个");
            return;
         }

         if (GameAWTEventListener.ee(var3)) {
            this.aej.fw("发送内容带有敏感词");
            return;
         }

         StringBuffer var2;
         (var2 = new StringBuffer()).append("AUTOMSG");
         var2.append(var1);
         var2.append("|");
         var2.append(var4);
         var2.append("|");
         var2.append(var3);
         String var5 = Agreement.getSendTextAES("stall", var2.toString());
         this.uw().d(var5);
         this.ve().n(this.ae());
      }

   }
}
