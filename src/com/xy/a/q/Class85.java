package com.xy.a.q;

import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class85 extends com.xy.q.Class30 {
   private RichLabel to;
   private com.xy.w.Class18[] iq;
   private com.xy.i.Class19[] hi;
   private com.xy.q.Class52 qp;
   private com.xy.q.Class18 ami;
   private BigDecimal ee;
   private JLabel[] r;
   private com.xy.q.Class18 amj;
   private JScrollPane jo;
   private JScrollPane ba;
   private com.xy.q.Class14 p;

   public void ey(RoleSummoning var1, int var2) {
      List var3 = this.amj.rs();
      Class85 var10000;
      if (var2 == 1) {
         var10000 = this;
         var3.add(var1);
      } else {
         label27: {
            int var4;
            for (int var5 = var4 = 0; var5 < var3.size(); var5 = ++var4) {
               if (com.xy.v.Class12.x(var1.getSid(), ((RoleSummoning)var3.get(var4)).getSid())) {
                  var3.remove(var4);
                  var10000 = this;
                  break label27;
               }
            }

            var10000 = this;
         }
      }

      var10000.ami.t();
      this.amj.t();
      this.qp.l();
   }

   public void fm(List<RoleSummoning> var1) {
      this.amj.fm(var1 != null ? var1 : new ArrayList<>());
      this.zc().b(this.lj());
   }

   public void g(int var1) {
      RoleData var2 = this.yx();
      if (var1 == 106) {
         RolePet var6;
         RoleSummoning var7 = (var6 = var2.getRolePet(this.ami.ee())) != null ? var6.getPet() : null;
         if (var7 == null) {
            String var12 = "诎儍逰乨叕啡兄";
            this.afx._do("请先选中召唤兽");
         } else if (var7.getGoods() != null) {
            String var11 = "询叶唣內搽帼睇裟夀戌冂丣";
            this.afx.dp("该召唤兽携带着装备或内丹");
         } else if (var2.getPetMount(var7.getSid()) != null) {
            String var10 = "迠厯叕啡兄裮箘剳且ｉ临厪攇畚ＸｄＸ";
            this.afx._do("这只召唤兽被管制中，不可放生！！！");
         } else if (com.xy.v.Class12.x(var2.getLoginResult().getSummoning_id(), var7.getSid())) {
            String var9 = "迃叭叶唣內巵圲叅戂个；＆；";
            this.afx._do("这只召唤兽已在参战中！！！");
         } else {
            String var13 = "i";
            String var5 = Agreement.getSendTextAES("pawnpet", "P" + var7.getSid());
            this.za().k(var5);
         }
      } else {
         if (var1 == 107) {
            if (var2.pets.size() >= 21) {
               String var8 = "悯皞叫唾兺叵搽帼皃敪釈巨滦；＆；";
               this.afx._do("您的召唤兽可携带的数量已满！！！");
               return;
            }

            RoleSummoning var3;
            if ((var3 = this.amj.jm()) == null) {
               String var10001 = "诎儍逰乨叕啡兄";
               this.afx._do("请先选中召唤兽");
               return;
            }

            String var10003 = "H";
            String var4 = Agreement.getSendTextAES("pawnpet", "R" + var3.getSid());
            this.za().k(var4);
         }
      }
   }

   public Class85(GameView var1) {
      super(131, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "6Zj]j\bkI+^";
      this.ee = new BigDecimal(1000000);
      this.yy(-1, 0, 542, 375, com.xy.q.Class30.agh);
      com.xy.w.Class9 var30 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "叶唣內寃孂";
      this.yu(var30, "召唤兽寄存");
      this.ami = new com.xy.q.Class18(this);
      this.ami.setBounds(0, 0, 180, 20);
      this.ba = com.xy.q.Class1.g(67, 151, 180, 149, this.ami, 20);
      this.add(this.ba);
      this.amj = new com.xy.q.Class18(this);
      this.amj.setBounds(0, 0, 180, 20);
      this.jo = com.xy.q.Class1.g(318, 151, 180, 149, this.amj, 20);
      this.add(this.jo);
      this.to = new RichLabel("", com.xy.q.Class49.n);
      String var10008 = "fZu\tu\tu\t湬馑掕礃｟\bい巟厶刮蠭吽遌\b厯叕啡兄厪仜仡捛伈罗～\u001a7\u0019e\u0019e\u0019e\u0019e\u0019w〸宁孡ｍ亝挧Ｐ赼甑之叕啡兄剒衑戅逰厩唝儸纞剮朰儶〻";
      this.to.setTextSize("#c000000温馨提示：1、左右列表各选1只召唤兽可以交换位置；#r         2、寄存（交换）费用与召唤兽列表所选召唤兽级别有关。", 408);
      this.to.setBounds(95, 41, this.to.getWidth(), this.to.getHeight());
      this.add(this.to);
      this.hi = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.hi.length; var10000 = var2) {
         com.xy.i.Class19[] var6 = this.hi;
         String var10004 = "id5b55,)ji}";
         int var10006 = 106 + var2;
         Class85 var34;
         if (var2 == 0) {
            var10009 = "寽e孡";
            var10009 = "寄 存";
            var34 = this;
         } else if (var2 == 1) {
            var10009 = "双'囄";
            var10009 = "取 回";
            var34 = this;
         } else {
            var10009 = "";
            var34 = this;
         }

         Class19 var10002 = new Class19("sc/e/26.png", 1, var10006, Class49.ch, Class49.bv, var10009, var34);

         var6[var2] = var10002;
         this.hi[var2].setBounds(109 + 245 * var2, 308, 99, 25);
         this.add(this.hi[var2++]);
      }

      this.p = com.xy.q.Class1.i(166, 94, 104, 19, 10, Color.white, com.xy.q.Class49.w);
      String var27 = "J&\u0016!\u0016t\u000ekI+^";
      this.p.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.p);
      com.xy.q.Class49.b(this.p, this.ee.longValue());
      this.qp = com.xy.q.Class1.m(364, 94, 104, 19, 10, Color.white, com.xy.q.Class49.w, null, var1);
      var10008 = "id5c56-)ji}";
      this.qp.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.qp.n(2);
      this.qp.setText("0");
      MoneyType var4;
      MoneyType var10005 = var4 = new MoneyType();
      String var10007 = "珵釨";
      var10005.setIdAndKey(1, "现金");
      this.qp.alj(var4);
      this.add(this.qp);
      this.r = new JLabel[4];

      int var3;
      for (int var7 = var3 = 0; var7 < this.r.length; var7 = ++var3) {
         int var10003 = 92 + 198 * var3;
         var10008 = "$y7*7*7*";
         this.r[var3] = com.xy.q.Class1.f(var10003, 94, 72, 19, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var8 = this.r[var3];
         String var12;
         if (var3 == 0) {
            var12 = "淍耮醔针";
            var12 = "消耗金钱";
         } else if (var3 == 1) {
            var12 = "拢朓玷釋";
            var12 = "拥有现金";
         } else if (var3 == 2) {
            var12 = "叕啡兄剒衑";
            var12 = "召唤兽列表";
         } else if (var3 == 3) {
            var12 = "寃孂刐衲";
            var12 = "寄存列表";
         } else {
            var12 = "";
         }

         var8.setText(var12);
         this.add(this.r[var3]);
         if (var3 >= 2 && var3 <= 3) {
            JLabel var16 = this.r[var3];
            String var23 = "fZ\u0003\u007f\u0003\u007f\u0003\u007f";
            var16.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
            this.r[var3].setBounds(67 + 251 * (var3 - 2), 130, 180, 21);
         }
      }

      this.iq = new com.xy.w.Class18[7];

      for (int var9 = var3 = 0; var9 < this.iq.length; var9 = ++var3) {
         this.iq[var3] = new com.xy.w.Class18();
         this.add(this.iq[var3]);
         if (var3 >= 0 && var3 <= 1) {
            com.xy.w.Class18 var17 = this.iq[var3];
            String var24 = "id5c55/)ji}";
            var17.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var3].setBounds(67 + 251 * var3, 130, 180, 21);
         }

         if (var3 >= 2 && var3 <= 3) {
            com.xy.w.Class18 var18 = this.iq[var3];
            String var25 = "J&\u0016!\u0016w\rkI+^";
            var18.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.iq[var3].setBounds(67 + 251 * (var3 - 2), 130, 180, 170);
         }

         if (var3 >= 4 && var3 <= 5) {
            this.iq[var3].setBounds(251 + 33 * (var3 - 4), 166, 30, 56);
            if (var3 == 4) {
               com.xy.w.Class18 var10 = this.iq[var3];
               String var19 = "id5c51\")ji}";
               var10.dp("sc/d/68.png");
            }

            if (var3 == 5) {
               com.xy.w.Class18 var11 = this.iq[var3];
               String var20 = "J&\u0016!\u0016s\u0000kI+^";
               var11.dp("sc/d/69.png");
            }
         }

         if (var3 == 6) {
            com.xy.w.Class18 var21 = this.iq[var3];
            String var26 = "id5c54,)ji}";
            var21.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.iq[var3].setBounds(54, 28, 460, 320);
         }
      }
   }

   @Override
   public void l() {
      this.ami.t();
      this.qp.l();
      super.l();
   }
}
