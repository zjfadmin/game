package com.xy;

import com.xy.bean.BeauBean;
import com.xy.bean.Role_bean;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class83 extends Class345 {
   private JScrollPane o;
   private Class217[] p;
   private RichLabel q;
   private Class436 r;
   private Class464[] s;
   private Role_bean t;
   private JLabel[] u;

   public void m(Role_bean var1) {
      if ((this.t = var1) == null) {
         this.q.setTextSize((String)null, 12191 & 20846);
      } else {
         StringBuffer var2;
         (var2 = new StringBuffer()).append("名字:");
         var2.append(var1.getRolename());
         var2.append("#rid:");
         BeauBean var3 = var1.getBeauBean();
         StringBuffer var10000;
         if (var3 == null) {
            var10000 = var2;
            var2.append("#W" + var1.getRole_id());
         } else if (var3.a()) {
            var2.append("#VBEAU" + var3.toString() + "#L");
            var10000 = var2;
         } else {
            var2.append("#cFF00FF" + var3.getBeau());
            var10000 = var2;
         }

         var10000.append("#W#r种族:");
         var2.append(var1.getRace_name());
         var2.append("#r性别:");
         var2.append("不愿透露");
         var2.append("#r等级:");
         var2.append(Class224.r(var1.getGrade()));
         this.q.setTextSize(var2.toString(), 22975 & 10062);
      }
   }

   public void d() {
      String var1 = null;
      String var2;
      if (null == null && !Class394.o(var2 = this.p[5 >> 3].getText().trim())) {
         var1 = Agreement.getSendTextAES("searcahChatRoleId", var2);
      }

      if (var1 == null && !Class394.o(var2 = this.p[--1].getText().trim())) {
         var1 = Agreement.getSendTextAES("searcahChatRoleName", var2);
      }

      if (var1 == null) {
         this.aej.f("请输入搜索条件");
      } else {
         this.m((Role_bean)null);
         this.uw().d(var1);
      }
   }

   public Role_bean n() {
      return this.t;
   }

   public Class83(GameView var1) {
      int var10001 = --2;
      int var10005 = -4 >> 2;
      super(107 & 95, --2, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 8095 & 25078, 15707 & 17389, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 127 & 68, 127 & 68, 127 & 68, 127 & 68, (boolean)(5 >> 3)), "查找添加");
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.u = var3;

      int var2;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.u.length; var10000 = var2) {
         this.u[var2] = Class133.b(126 & 61, (109 & 59) + var2 * (31 & 126), 120 & 63, 31 & 115, Color.black, Class681.ak);
         this.u[var2].setText(var2 == 0 ? "数字ID" : (var2 == (4 ^ 5) ? "昵称" : ""));
         this.add(this.u[var2++]);
      }

      Class217[] var4 = new Class217[1 ^ 3];
      var10003 = true;
      this.p = var4;

      for(var10000 = var2 = 2 & 5; var10000 < this.p.length; var10000 = var2) {
         this.p[var2] = Class133.n(Class511.q("sc/d/17.png", 78 & 55, 78 & 55, 78 & 55, 78 & 55, (boolean)(3 ^ 3)), Class681.bm, Color.white);
         this.p[var2].setBounds(127 & 117, (127 & 41) + var2 * (62 & 95), 29831 & 3070, 123 & 23);
         this.add(this.p[var2++]);
      }

      Class464[] var6 = new Class464[--3];
      var10003 = true;
      this.s = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.s.length; var10000 = var2) {
         Class464[] var5 = this.s;
         Class464 var8 = new Class464;
         String var10004 = var2 >= 5 >> 2 && var2 <= --2 ? "sc/e/26.png" : "sc/e/7.png";
         int var10006 = (119 & 109) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class83 var10010;
         if (var2 == 0) {
            var10009 = "搜索";
            var10010 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "加为好友";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "申请入队";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var8.<init>(var10004, 1, var10006, var10007, var10008, var10009, var10010);
         var5[var2] = var8;
         Class83 var7;
         if (var2 == 0) {
            this.s[var2].setBounds(275, 54, 59, 25);
            var7 = this;
         } else {
            this.s[var2].setBounds(-104 + 179 * var2, 271, 99, 25);
            var7 = this;
         }

         var7.add(this.s[var2++]);
      }

      this.q = Class271.l("", Class681.q, 95);
      this.o = Class133.f(71, 121, 286, 126, this.q, 20);
      this.add(this.o);
      this.r = new Class436();
      this.r.eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(5 >> 3)));
      this.r.setBounds(69, 119, 290, 130);
      this.add(this.r);
   }
}
