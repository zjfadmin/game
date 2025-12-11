package com.xy.a;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class56 extends com.xy.q.Class30 {
   private JScrollPane is;
   private com.xy.w.Class18[] fd;
   private com.xy.i.Class18[] ts;
   private JComponent cr;
   private com.xy.q.Class36 zp;
   private JLabel[] au;

   public String ua(int var1) {
      return ((Class90)this.cr.getComponent(var1)).jg();
   }

   public Class56(GameView var1) {
      super(160, 2, com.xy.q.Class30.afz, var1);
      String var10004 = "\u0019DECE\u0016DW\u0004@";
      this.yy(-1, 0, 272, 353, com.xy.q.Class30.agh);
      com.xy.w.Class9 var23 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10005 = "兕镒诫摠約";
      this.yu(var23, "关键词搜索");
      this.wp(new com.xy.v.Class32(14, 0, 0, 18));
      this.au = new JLabel[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         this.au[var2] = com.xy.q.Class1.k(47, 37, 87, 17, Color.white, com.xy.q.Class49.ch);
         JLabel var5 = this.au[var2];
         String var12;
         if (var2 == 0) {
            var12 = "淜勊兔镄诪";
            var12 = "添加关键词";
         } else if (var2 == 1) {
            var12 = "携絞下相兕镒诫";
            var12 = "搜索中的关键词";
         } else if (var2 == 2) {
            var12 = "耠夎飻遴晔礝摶紅例恈";
            var12 = "聊天频道显示搜索信息";
         } else {
            var12 = "";
         }

         var5.setText(var12);
         this.au[var2].setHorizontalAlignment(10);
         Class56 var6;
         if (var2 == 0) {
            var6 = this;
            this.au[var2].setForeground(Color.black);
         } else if (var2 == 1) {
            var6 = this;
            this.au[var2].setBounds(50, 57, 190, 21);
            this.au[var2].setHorizontalAlignment(0);
         } else {
            if (var2 == 2) {
               this.au[var2].setBounds(67, 260, 173, 17);
               this.au[var2].setFont(com.xy.q.Class49.k);
               this.au[var2].setForeground(Color.black);
            }

            var6 = this;
         }

         var6.add(this.au[var2++]);
      }

      this.ts = new com.xy.i.Class18[2];

      for (int var7 = var2 = 0; var7 < this.ts.length; var7 = var2) {
         com.xy.i.Class18[] var8 = this.ts;
         if (var2 == 0) {
            var10004 = "U\u001f\t\u0019\tN\u0010RV\u0012A";
            var10004 = "sc/e/26.png";
         } else {
            var10004 = "\u0019DEBE\u0011DW\u0004@";
            var10004 = "sc/e/6.png";
         }

         int var10006 = 341 + var2;
         Font var10007 = var2 == 0 ? com.xy.q.Class49.ch : com.xy.q.Class49.bz;
         String var28;
         Class56 var10010;
         if (var2 == 0) {
            var28 = "砒宼摠約";
            var28 = "确定搜索";
            var10010 = this;
         } else if (var2 == 1) {
            var28 = "涑劇";
            var28 = "添加";
            var10010 = this;
         } else {
            var28 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var15 = new com.xy.i.Class18(var10004, 1, var10006, var10007, null, var28, var10010);
         var8[var2] = var15;
         Class56 var9;
         if (var2 == 0) {
            var9 = this;
            this.ts[var2].setForeground(Color.black);
            this.ts[var2].setBounds(92, 287, 99, 25);
         } else {
            if (var2 == 1) {
               this.ts[var2].setBounds(212, 37, 34, 18);
            }

            var9 = this;
         }

         var9.add(this.ts[var2++]);
      }

      String var27 = "U\u001f\t\u0018\tM\u0011RV\u0012A";
      this.zp = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.zp.setHorizontalAlignment(10);
      this.zp.setBounds(134, 37, 105, 17);
      this.add(this.zp);
      this.cr = new Class45(this);
      this.is = com.xy.q.Class1.g(50, 78, 190, 178, this.cr, 20);
      this.add(this.is);
      this.fd = new com.xy.w.Class18[3];

      for (int var10 = var2 = 0; var10 < this.fd.length; var10 = var2) {
         this.fd[var2] = new com.xy.w.Class18();
         Class56 var11;
         if (var2 == 0) {
            var11 = this;
            com.xy.w.Class18 var18 = this.fd[var2];
            String var10003 = "T\t\b\u000e\bX\u0012DW\u0004@";
            var18.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.fd[var2].setBounds(50, 57, 190, 21);
         } else if (var2 == 1) {
            var11 = this;
            com.xy.w.Class18 var19 = this.fd[var2];
            String var22 = "U\u001f\t\u0018\tN\u0012RV\u0012A";
            var19.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fd[var2].setBounds(50, 57, 190, 200);
         } else {
            if (var2 == 2) {
               com.xy.w.Class18 var16 = this.fd[var2];
               String var20 = "T\t\b\u000f\bX\u001eDW\u0004@";
               var16.dp("sc/e/29.png");
               this.fd[var2].setBounds(49, 260, 17, 17);
            }

            var11 = this;
         }

         var11.add(this.fd[var2++]);
      }
   }

   public void gs(int var1, Object var2) {
      if (var1 == 341) {
         if (this.cr.getComponentCount() == 0) {
            String var17 = "彵刱沇杵讘缒兕镒诫";
            this.afx._do("当前没有设置关键词");
         } else {
            ((Class51)this.afx.getFormManagement().j(159)).lm(8);
         }
      } else if (var1 == 342) {
         String var7;
         if (com.xy.v.Class12.h(var7 = this.zp.getText().trim())) {
            String var16 = "讝辴儏兔镄诪";
            this.afx._do("请输入关键词");
         } else {
            int var8 = this.cr.getComponentCount();

            int var10;
            for (int var13 = var10 = 0; var13 < var8; var13 = ++var10) {
               Class90 var6 = (Class90)this.cr.getComponent(var10);
               if (com.xy.v.Class12.am(var7, var6.jg())) {
                  String var10001 = "丫肁淝勜盞呰兕镒诫";
                  this.afx._do("不能添加相同关键词");
                  return;
               }
            }

            var8++;
            this.cr.add(new Class90(this, var7));
            var10 = 0;

            for (int var14 = var10; var14 < var8; var14 = var10) {
               Component var15 = this.cr.getComponent(var10);
               int var18 = 20 * var10;
               var10++;
               var15.setBounds(0, var18, 175, 20);
            }

            this.zp.setText("");
            this.cr.setPreferredSize(new Dimension(175, var8 * 20));
            this.is.updateUI();
         }
      } else {
         if (var1 == 343) {
            Class90 var3 = (Class90)var2;
            this.cr.remove(var3);
            int var4 = this.cr.getComponentCount();

            int var5;
            for (int var10000 = var5 = 0; var10000 < var4; var10000 = var5) {
               Component var12 = this.cr.getComponent(var5);
               int var10002 = 20 * var5;
               var5++;
               var12.setBounds(0, var10002, 175, 20);
            }

            this.cr.setPreferredSize(new Dimension(175, var4 * 20));
            this.is.updateUI();
         }
      }
   }

   public int dx() {
      return this.cr.getComponentCount();
   }
}
