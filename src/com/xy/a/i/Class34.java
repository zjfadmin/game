package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.q.Class54;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class34 extends com.xy.q.Class30 {
   private Class2 amb;
   private com.xy.q.Class14[] vi;
   private JLabel[] ir;
   private Class54 hr;
   private com.xy.w.Class18 gf;
   private com.xy.w.Class18[] aw;
   private MoneyType on;
   private com.xy.q.Class14 iu;
   private BigDecimal bn = new BigDecimal(this.za().l(2, 12) ? 500000 : 5000000);
   private com.xy.i.Class11 np;
   private Class52 oq;

   public void e() {
      this.hr.gs(0, null);
      this.h();
      this.oq.l();
      this.amb.h();
   }

   public Class54 ep() {
      return this.hr;
   }

   public Class34(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(46, 74, 490, 428, com.xy.q.Class30.agf);
      this.gf = new com.xy.w.Class18();
      this.gf.setBounds(10, 229, 17, 17);
      this.add(this.gf);
      String var10009 = "Y\b\u0005\u000e\u0005X\u001bEZ\u0005M";
      String var10014 = "匴u绔";
      this.np = new com.xy.i.Class11("sc/e/31.png", 1, 4, Class49.ch, Class49.bv, "升 级", this);
      this.np.setBounds(315, 358, 79, 25);
      this.add(this.np);
      this.amb = new Class2(this, this.gf);
      this.amb.cl().setBounds(12, 30, 152, 195);
      this.add(this.amb.cl());
      this.amb.cn().setBounds(174, 30, 305, 198);
      this.add(this.amb.cn());
      this.ir = new JLabel[9];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ir.length; var10000 = var2) {
         String var10008 = "HI-l-l-l";
         this.ir[var2] = com.xy.q.Class1.f(55, 83, 155, 21, 0, Class49.c("#cFFFFFF"), Class49.ch);
         JLabel var5 = this.ir[var2];
         String var11;
         if (var2 == 0) {
            var11 = "夂袶剂蠛";
            var11 = "套装列表";
         } else if (var2 == 1) {
            var11 = "遢拃珢笌";
            var11 = "选择玉符";
         } else if (var2 == 2) {
            var11 = "厙晫祉嶧杺珜筕";
            var11 = "只显示已有玉符";
         } else if (var2 == 3) {
            var11 = "咪贂";
            var11 = "品质";
         } else if (var2 == 4) {
            var11 = "乿攃";
            var11 = "个数";
         } else if (var2 == 5) {
            var11 = "淣耽醺钛";
            var11 = "消耗金钱";
         } else if (var2 == 6) {
            var11 = "抰杺醄铂";
            var11 = "拥有金钱";
         } else if (var2 == 7) {
            var11 = "辳霪觪\nK一珢笌";
            var11 = "还需要  个玉符";
         } else if (var2 == 8) {
            var11 = "cE";
            var11 = "66";
         } else {
            var11 = "";
         }

         var5.setText(var11);
         Class34 var6;
         if (var2 == 1) {
            var6 = this;
            this.ir[var2].setBounds(218, 83, 307, 21);
         } else if (var2 == 2) {
            var6 = this;
            this.ir[var2].setFont(Class49.k);
            JLabel var10003 = this.ir[var2];
            String var10004 = "HI[\u001a[\u001a[\u001a";
            var10003.setForeground(Class49.c("#c000000"));
            this.ir[var2].setHorizontalAlignment(10);
            this.ir[var2].setBounds(74, 303, 136, 17);
         } else if (var2 >= 3 && var2 <= 4) {
            var6 = this;
            JLabel var23 = this.ir[var2];
            String var36 = "v\u0010eCeCeC";
            var23.setForeground(Class49.c("#c000000"));
            this.ir[var2].setBounds(239, 352 + (var2 - 3) * 26, 37, 19);
         } else if (var2 >= 5 && var2 <= 6) {
            var6 = this;
            JLabel var22 = this.ir[var2];
            String var35 = "HI[\u001a[\u001a[\u001a";
            var22.setForeground(Class49.c("#c000000"));
            this.ir[var2].setBounds(160, 422 + (var2 - 5) * 26, 72, 19);
         } else {
            if (var2 >= 7 && var2 <= 8) {
               this.ir[var2].setFont(Class49.n);
               JLabel var10002 = this.ir[var2];
               String var34 = "v\u0010eCeCeC";
               var10002.setForeground(Class49.c("#c000000"));
               this.ir[var2].setBounds(349, 380, 99, 15);
               if (var2 == 8) {
                  JLabel var7 = this.ir[var2];
                  var11 = "HI-l[\u001a[\u001a";
                  var7.setForeground(Class49.c("#cFF0000"));
               }
            }

            var6 = this;
         }

         var6.ir[var2].setBounds(this.ir[var2].getX() - 46, this.ir[var2].getY() - 74, this.ir[var2].getWidth(), this.ir[var2].getHeight());
         this.add(this.ir[var2++]);
      }

      this.vi = new com.xy.q.Class14[2];

      for (int var8 = var2 = 0; var8 < this.vi.length; var8 = var2) {
         this.vi[var2] = com.xy.q.Class1.i(233, 352 + 26 * var2 - 74, 64, 19, 10, Color.white, Class49.w);
         com.xy.q.Class14 var25 = this.vi[var2];
         String var37 = "\u00006\\1\\dD{\u0003;\u0014";
         var25.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         this.add(this.vi[var2++]);
      }

      this.on = new MoneyType();
      String var10013 = "玚K釻";
      this.on.setIdAndKey(1, "现 金");
      this.oq = com.xy.q.Class1.m(189, 374, 108, 19, 10, Color.white, Class49.w, this.on, var1);
      var10009 = "\u00006\\1\\dD{\u0003;\u0014";
      this.oq.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.oq.n(2);
      this.iu = com.xy.q.Class1.i(189, 348, 108, 19, 10, Color.white, Class49.w);
      String var10005 = "Y\b\u0005\u000f\u0005Z\u001dEZ\u0005M";
      this.iu.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.iu);
      this.add(this.oq);
      this.hr = new Class54(this);
      this.hr.setBounds(125, 276, 50, 50);
      this.add(this.hr);
      this.aw = new com.xy.w.Class18[6];

      for (int var9 = var2 = 0; var9 < this.aw.length; var9 = var2) {
         this.aw[var2] = new com.xy.w.Class18();
         Class34 var10;
         if (var2 == 0) {
            var10 = this;
            com.xy.w.Class18 var27 = this.aw[var2];
            String var38 = "\u00006\\1\\gF{\u0003;\u0014";
            var27.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(55, 83, 155, 21);
         } else if (var2 == 1) {
            var10 = this;
            com.xy.w.Class18 var28 = this.aw[var2];
            String var39 = "Y\b\u0005\u000f\u0005Y\u001eEZ\u0005M";
            var28.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(55, 83, 155, 218);
         } else if (var2 == 2) {
            var10 = this;
            com.xy.w.Class18 var29 = this.aw[var2];
            String var40 = "\u00006\\1\\gF{\u0003;\u0014";
            var29.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(218, 83, 307, 21);
         } else if (var2 == 3) {
            var10 = this;
            com.xy.w.Class18 var30 = this.aw[var2];
            String var41 = "Y\b\u0005\u000f\u0005Y\u001eEZ\u0005M";
            var30.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(218, 83, 307, 219);
         } else if (var2 == 4) {
            var10 = this;
            com.xy.w.Class18 var31 = this.aw[var2];
            String var42 = "&\u0010z\u0017zG{\u0003;\u0014";
            var31.dp("sc/d/4.png");
            this.aw[var2].setBounds(167, 346, 59, 57);
         } else {
            if (var2 == 5) {
               com.xy.w.Class18 var21 = this.aw[var2];
               String var32 = "Y\b\u0005\u000f\u0005X\u0019EZ\u0005M";
               var21.mt(com.xy.w.Class16.m("sc/d/33.png", 30, 30, 30, 30, false));
               this.aw[var2].setBounds(57, 327, 467, 158);
            }

            var10 = this;
         }

         var10.aw[var2].setBounds(this.aw[var2].getX() - 46, this.aw[var2].getY() - 74, this.aw[var2].getWidth(), this.aw[var2].getHeight());
         this.add(this.aw[var2++]);
      }

      Class49.b(this.iu, this.bn.longValue());
   }

   public void f() {
      PartJade var1;
      if ((var1 = (PartJade)this.hr.jx()) == null) {
         String var11 = "订遺押伓觔匴绲盷珜筕{]";
         this.afx.dp("请选择你要升级的玉符..");
      } else {
         RoleData var2 = this.yx();
         int var3 = (int)this.hr.ee();
         if (this.bn.compareTo(var2.getLoginResult().getGold()) > 0) {
            String var10 = "醺師书趙E\u0004";
            this.afx.dp("金币不足..");
         } else {
            int var4;
            if ((var4 = MsgUntil.m(var3)) > var1.getJade(var3)) {
               String var9 = "伵戳靕盷珜筕攥醼乘跀{]";
               this.afx.dp("你所需的玉符数量不足..");
            } else {
               SuitOperBean var5 = new SuitOperBean();
               PartJade var6 = new PartJade(var1.getSuitid(), var1.getPartId());
               var6.setJade(var3, var4);
               var5.setType(4);
               var5.setJade(var6);
               String var7 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var5));
               this.za().k(var7);
               var1.b(var3, 1);
               var2.getLoginResult().setGold(var2.getLoginResult().getGold().subtract(this.bn));
               this.hr.gs(0, null);
               this.h();
               GameView var10001 = this.afx;
               String var10004 = "涢聼京";
               StringBuilder var10002 = new StringBuilder("消耗了").append(var4);
               String var10003 = "乙";
               var10002 = var10002.append("个").append(MsgUntil.j(var3));
               var10003 = "珢笌E\u0004";
               var10001.dp(var10002.append("玉符..").toString());
               GameView var10000 = this.afx;
               var10003 = "添聂仵";
               StringBuilder var8 = new StringBuilder("消耗了").append(this.bn.longValue() / 10000L);
               String var13 = "}醺師E\u0004";
               var10000.dp(var8.append("W金币..").toString());
            }
         }
      }
   }

   public void h() {
      PartJade var1;
      if ((var1 = (PartJade)this.hr.jx()) != null) {
         int var3;
         int var5;
         int var4 = MsgUntil.m(var3 = var1.getJade(var5 = (int)this.hr.ee()));
         this.vi[0].setText(MsgUntil.j(var5));
         this.vi[1].setText(String.valueOf(var3));
         this.ir[8].setText(var3 >= var4 ? "0" : String.valueOf(var4 - var3));
      } else {
         int var2;
         for (int var10000 = var2 = 0; var10000 < this.vi.length; var10000 = var2) {
            this.vi[var2++].setText(null);
         }

         this.ir[8].setText("");
      }
   }

   public Class2 eq() {
      return this.amb;
   }
}
