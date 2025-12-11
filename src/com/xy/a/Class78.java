package com.xy.a;

import com.xy.bean.BeauBean;
import com.xy.bean.Role_bean;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class78 extends com.xy.q.Class30 {
   private com.xy.i.Class12[] ago;
   private JScrollPane is;
   private RichLabel h;
   private Role_bean agp;
   private JLabel[] gj;
   private com.xy.w.Class18 dm;
   private com.xy.q.Class36[] agq;

   public void h() {
      String var1 = null;
      String var2;
      if (null == null && !com.xy.v.Class12.h(var2 = this.agq[0].getText().trim())) {
         var1 = Agreement.getSendTextAES("searcahChatRoleId", var2);
      }

      if (var1 == null && !com.xy.v.Class12.h(var2 = this.agq[1].getText().trim())) {
         var1 = Agreement.getSendTextAES("searcahChatRoleName", var2);
      }

      if (var1 == null) {
         String var10001 = "话込兏搳紈李仜";
         this.afx._do("请输入搜索条件");
      } else {
         this.zf(null);
         this.za().k(var1);
      }
   }

   public Class78(GameView var1) {
      super(75, 2, com.xy.q.Class30.afz, var1);
      String var10003 = ".9r>rks*3=";
      this.yy(-1, 0, 406, 329, com.xy.q.Class30.agh);
      com.xy.w.Class9 var15 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "柊扔淔劊";
      this.yu(var15, "查找添加");
      this.gj = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.gj.length; var10000 = var2) {
         this.gj[var2] = com.xy.q.Class1.k(60, 41 + var2 * 30, 56, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var5 = this.gj[var2];
         String var10;
         if (var2 == 0) {
            var10 = "攭嬍\u0014\u001e";
            var10 = "数字ID";
         } else if (var2 == 1) {
            var10 = "昚秚";
            var10 = "昵称";
         } else {
            var10 = "";
         }

         var5.setText(var10);
         this.add(this.gj[var2++]);
      }

      this.agq = new com.xy.q.Class36[2];

      for (int var6 = var2 = 0; var6 < this.agq.length; var6 = var2) {
         String var10005 = ")>u9ulms*3=";
         this.agq[var2] = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.bz, Color.white);
         this.agq[var2].setBounds(117, 41 + var2 * 30, 134, 19);
         this.add(this.agq[var2++]);
      }

      this.ago = new com.xy.i.Class12[3];

      for (int var7 = var2 = 0; var7 < this.ago.length; var7 = var2) {
         com.xy.i.Class12[] var8 = this.ago;
         if (var2 >= 1 && var2 <= 2) {
            var10004 = "YL\u0005J\u0005\u001d\u001c\u0001ZAM";
            var10004 = "sc/e/26.png";
         } else {
            var10004 = ".9r?rms*3=";
            var10004 = "sc/e/7.png";
         }

         int var10006 = 101 + var2;
         String var20;
         Class78 var10010;
         if (var2 == 0) {
            var20 = "搳紈";
            var20 = "搜索";
            var10010 = this;
         } else if (var2 == 1) {
            var20 = "勽习夠厑";
            var20 = "加为好友";
            var10010 = this;
         } else if (var2 == 2) {
            var20 = "甜话兊阵";
            var20 = "申请入队";
            var10010 = this;
         } else {
            var20 = "";
            var10010 = this;
         }

         com.xy.i.Class12 var12 = new com.xy.i.Class12(var10004, 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var20, var10010);
         var8[var2] = var12;
         Class78 var9;
         if (var2 == 0) {
            this.ago[var2].setBounds(275, 54, 59, 25);
            var9 = this;
         } else {
            this.ago[var2].setBounds(-104 + 179 * var2, 271, 99, 25);
            var9 = this;
         }

         var9.add(this.ago[var2++]);
      }

      this.h = com.xy.v.Class27.j("", com.xy.q.Class49.w, 95);
      this.is = com.xy.q.Class1.g(71, 121, 286, 126, this.h, 20);
      this.add(this.is);
      this.dm = new com.xy.w.Class18();
      String var19 = ")>u9uons*3=";
      this.dm.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.dm.setBounds(69, 119, 290, 130);
      this.add(this.dm);
   }

   public void zf(Role_bean var1) {
      if ((this.agp = var1) == null) {
         this.h.setTextSize(null, 270);
      } else {
         StringBuffer var2;
         StringBuffer var10000 = var2 = new StringBuffer();
         String var10001 = "呗嬊`";
         var10000.append("名字:");
         var2.append(var1.getRolename());
         String var10003 = "\t]CK\u0010";
         var2.append("#rid:");
         BeauBean var3 = var1.getBeauBean();
         if (var3 == null) {
            var10000 = var2;
            String var10004 = "~\r";
            var2.append("#W" + var1.getRole_id());
         } else if (var3.a()) {
            var10003 = "\f|mon\u007f";
            StringBuilder var5 = new StringBuilder("#VBEAU").append(var3.toString());
            String var10002 = "~\u0016";
            var2.append(var5.append("#L").toString());
            var10000 = var2;
         } else {
            var10003 = "\fIil\u001f\u001ail";
            var2.append("#cFF00FF" + var3.getBeau());
            var10000 = var2;
         }

         var10001 = "y\ny/禗斒`";
         var10000.append("#W#r种族:");
         var2.append(var1.getRace_name());
         var10003 = "\t]怍刄\u0010";
         var2.append("#r性别:");
         String var10 = "乐慥遒靨";
         var2.append("不愿透露");
         String var10005 = "\t]筣纈\u0010";
         var2.append("#r等级:");
         var2.append(com.xy.v.Class4.h(var1.getGrade()));
         this.h.setTextSize(var2.toString(), 270);
      }
   }

   public Role_bean zg() {
      return this.agp;
   }
}
