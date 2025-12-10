package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.SummonPetBean;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Skill;
import com.xy.readbean.petExchange;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class474 extends Class345 {
   private Class436[] dd;
   private Class556 de;
   private RichLabel df;
   private JLabel[] dg;
   private BigDecimal dh;
   private BigDecimal di;
   private petExchange dj;
   private BigDecimal dk;
   private JScrollPane dl;
   private int dm;
   private int dn;
   private int do;
   private int dp;
   private Class529 dq;
   private RichLabel dr;
   private Class245 ds;
   private RichLabel z;
   private Class19 dt;
   private Class512 du;
   private RichLabel bv;
   private Class44[] dv;
   private JScrollPane dw;
   private int m;

   public void y(int var1) {
      if (this.dp != var1) {
         this.dp = var1;
         this.dq.setText(this.dp == 0 ? "合成" : "幻化");
         this.s();
         this.bt(this.vc().cn().getAllPetExchange());
      }

      this.d();
      this.ve().a(this.ae());
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.dt != null) {
         this.dt.a(var1, 14828 & 18239, 5103 & 27865, 5 >> 3, Class280.l());
      }

   }

   public void br(petExchange var1, int var2) {
      Class474 var10000;
      if (!Class394.o((this.dj = var1).getSkin())) {
         this.dt = Class330.f(var1.getSkin(), 111 & 23, 4 ^ 5, (String)null);
         var10000 = this;
      } else {
         this.dt = null;
         var10000 = this;
      }

      var10000.bu(var1);
      this.bv(var1);
      this.bs(var1);
   }

   public void bs(petExchange var1) {
      this.o();
      if (var1 != null) {
         String var6;
         if (!Class394.o(var6 = var1.getConsume())) {
            String[] var7 = var6.split("\\|");
            int var4 = 3 ^ 3;

            int var3;
            for(int var10000 = var3 = 2 & 5; var10000 < var7.length; var10000 = var3) {
               String[] var2;
               if (var7[var3].startsWith("D")) {
                  var2 = var7[var3].split("=");
                  this.dh = new BigDecimal(var2[2 ^ 3]);
                  Class681.j(this.ds, this.dh.longValue());
               } else if (var7[var3].startsWith("G")) {
                  var2 = var7[var3].split("=");
                  BigDecimal var5 = new BigDecimal(var2[--1]);
                  Class474 var9;
                  int var10002;
                  if (var4 == 0) {
                     this.di = var5;
                     var10002 = -4 >> 2;
                     var9 = this;
                     this.do = Integer.parseInt(var2[1 ^ 3]);
                     this.dm = var10002;
                  } else {
                     this.dk = var5;
                     var10002 = -4 >> 2;
                     var9 = this;
                     this.dn = Integer.parseInt(var2[--2]);
                     this.m = var10002;
                  }

                  Goodstable var8 = var9.vc().n(var5);
                  Class44 var10 = this.dv[var4];
                  ++var4;
                  var10.c(3 & 5, var8);
               }

               ++var3;
            }

            this.d();
         }
      }
   }

   public Class474(GameView var1) {
      int var10001 = 15 & 119;
      int var10008 = -4 >> 2;
      int var10010 = -4 >> 2;
      super(102 & 61, 1 ^ 3, Class345.aef, var1);
      this.dp = var10010;
      this.va(var10008, 5 >> 3, 3951 & 29343, 7099 & 26078, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 118 & 77, 118 & 77, 118 & 77, 118 & 77, (boolean)(2 & 5)), "合成");
      this.dq = new Class529("sc/e/7.png", 3 & 5, 103 & 95, Class681.ak, Class681.c, "合成", this);
      this.dq.setBounds(29582 & 3581, 21463 & 11503, 123 & 63, 125 & 27);
      this.add(this.dq);
      this.ds = Class133.a(11707 & 21455, 12286 & 20627, 111 & 117, 59 & 87, 110 & 27, Color.white, Class681.ce);
      this.ds.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.add(this.ds);
      this.de = Class133.i(27 & 110, Color.white, Class681.ce, (MoneyType)null, var1);
      this.de.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
      this.de.ab(5 >> 1);
      this.de.setText("0");
      this.de.setBounds(395, 172, 101, 19);
      this.add(this.de);
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.dg = var4;

      int var10000;
      int var2;
      Class474 var3;
      for(var10000 = var2 = 2 & 5; var10000 < this.dg.length; var10000 = var2) {
         this.dg[var2] = Class133.c(46, 32 + 26 * var2, 36, 19, 3 >> 2, Class681.c("#cFFFFFF"), Class681.ak);
         this.dg[var2].setText(var2 == 0 ? "可合成召唤兽" : (var2 == (4 ^ 5) ? "初值属性" : (var2 == (1 ^ 3) ? "天生技能" : (var2 == --3 ? "携带要求：" : (var2 == --4 ? "0转30级" : (var2 == --5 ? "消耗" : (var2 == 6 ? "现金" : "")))))));
         if (var2 == 0) {
            var3 = this;
            this.dg[var2].setBounds(48, 32, 163, 21);
         } else if (var2 == (2 ^ 3)) {
            var3 = this;
            this.dg[var2].setBounds(220, 246, 137, 21);
         } else if (var2 == --2) {
            var3 = this;
            this.dg[var2].setBounds(365, 246, 137, 21);
         } else if (var2 == --3) {
            var3 = this;
            this.dg[var2].setForeground(Class681.c("#c000000"));
            this.dg[var2].setHorizontalAlignment(10);
            this.dg[var2].setBounds(359, 43, 90, 19);
         } else if (var2 == --4) {
            var3 = this;
            this.dg[var2].setForeground(Class681.c("#c000000"));
            this.dg[var2].setHorizontalAlignment(10);
            this.dg[var2].setFont(Class681.ce);
            this.dg[var2].setBounds(438, 43, 70, 19);
         } else {
            if (var2 >= --5 && var2 <= 6) {
               this.dg[var2].setForeground(Class681.c("#c000000"));
               this.dg[var2].setHorizontalAlignment(10);
               this.dg[var2].setBounds(359, 146 + 26 * (var2 - --5), 72, 19);
            }

            var3 = this;
         }

         var3.add(this.dg[var2++]);
      }

      var10001 = 5 >> 1;
      this.du = new Class512(this, 30);
      this.du.ak((boolean)(--1));
      this.du.setBounds(49, 53, 164, 335);
      this.du.aqd().setFont(Class681.ce);
      this.add(this.du);
      this.du.aqa().removeAllChildren();
      this.du.q();
      this.df = new RichLabel();
      this.z = new RichLabel();
      this.df.setText("#R1000#c228B22/9999");
      this.z.setText("#R1000#c228B22/9999");
      this.df.setBounds(359, 122, 60, 16);
      this.z.setBounds(432, 122, 60, 16);
      this.add(this.df);
      this.add(this.z);
      this.bv = new RichLabel();
      this.dr = new RichLabel();
      this.bv.setTextSize("", 123);
      this.dr.setTextSize("", 123);
      this.dl = Class133.f(221, 265, 138, 119, this.bv, 20);
      this.dw = Class133.f(366, 265, 138, 119, this.dr, 20);
      this.add(this.dl);
      this.add(this.dw);
      Class44[] var5 = new Class44[var10001];
      var10003 = true;
      this.dv = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.dv.length; var10000 = var2) {
         this.dv[var2] = new Class44(this);
         this.dv[var2].ad(Class44.arh);
         this.dv[var2].fw("sc/d/4.png");
         this.dv[var2].setBounds(359 + 73 * var2, 66, 59, 57);
         this.add(this.dv[var2++]);
      }

      Class436[] var6 = new Class436[8];
      var10003 = true;
      this.dd = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.dd.length; var10000 = var2) {
         label143: {
            this.dd[var2] = new Class436();
            if (var2 >= 0 && var2 <= 5 >> 1) {
               this.dd[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
               if (var2 == 0) {
                  var3 = this;
                  this.dd[var2].setBounds(48, 32, 163, 21);
                  break label143;
               }

               if (var2 == (4 ^ 5)) {
                  var3 = this;
                  this.dd[var2].setBounds(220, 246, 137, 21);
                  break label143;
               }

               if (var2 == 2) {
                  var3 = this;
                  this.dd[var2].setBounds(365, 246, 137, 21);
                  break label143;
               }
            } else if (var2 >= 3 && var2 <= 5) {
               this.dd[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
               if (var2 == 3) {
                  var3 = this;
                  this.dd[var2].setBounds(48, 32, 163, 355);
                  break label143;
               }

               if (var2 == 4) {
                  var3 = this;
                  this.dd[var2].setBounds(220, 246, 137, 141);
                  break label143;
               }

               if (var2 == 5) {
                  var3 = this;
                  this.dd[var2].setBounds(365, 246, 137, 141);
                  break label143;
               }
            } else {
               if (var2 == 6) {
                  var3 = this;
                  this.dd[var2].eq(Class511.q("sc/d/16.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
                  this.dd[var2].setBounds(226, 43, 127, 180);
                  break label143;
               }

               if (var2 == 7) {
                  this.dd[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(2 & 5)));
                  this.dd[var2].setBounds(219, 32, 284, 205);
               }
            }

            var3 = this;
         }

         var3.add(this.dd[var2++]);
      }

   }

   public void o() {
      int var1;
      for(int var10000 = var1 = 3 >> 2; var10000 < this.dv.length; var10000 = var1) {
         this.dv[var1].c(2 & 5, (Object)null);
         this.dv[var1++].setVisible((boolean)(--1));
      }

      int var10004 = 2 & 5;
      int var10006 = 2 & 5;
      int var10008 = 3 >> 2;
      int var10010 = 3 >> 2;
      this.df.setText("");
      this.z.setText("");
      this.di = null;
      this.dk = null;
      this.do = var10010;
      this.dm = var10008;
      this.dn = var10006;
      this.m = var10004;
      this.ds.setText((String)null);
      this.dh = null;
   }

   public void p() {
      RoleData var4 = this.vd();
      if (this.dp == 0 && var4.pets.size() >= (87 & 61)) {
         this.aej.f("您的召唤兽可携带的数量已满！！！");
      } else {
         petExchange var5;
         if ((var5 = this.dj) == null) {
            this.aej.f("没有选中召唤兽");
         } else if (this.dh != null && var4.getLoginResult().getGold().compareTo(this.dh) < 0) {
            this.aej.f("金额不足");
         } else {
            String var3;
            if ((var3 = var5.getConsume()) != null && !"".equals(var3)) {
               String[] var1 = var3.split("\\|");

               int var2;
               for(int var10000 = var2 = 2 & 5; var10000 < var1.length; var10000 = var2) {
                  if (var1[var2].startsWith("G")) {
                     String[] var9 = var1[var2].split("=");
                     Goodstable var6 = this.vc().n(new BigDecimal(var9[5 >> 2]));
                     int var10 = Integer.parseInt(var9[5 >> 1]);
                     int var11 = var4.getGoodNum(var6.getGoodsid());
                     if (var10 > var11) {
                        this.aej.f("合成材料不足");
                        return;
                     }
                  }

                  ++var2;
               }
            }

            SummonPetBean var7 = new SummonPetBean();
            var7.setOpertype(--2);
            var7.setPetid(new BigDecimal(var5.geteId()));
            String var8 = Agreement.getSendTextAES("summonpet", Class695.b().toJson(var7));
            this.uw().d(var8);
         }
      }
   }

   public void bt(Map<Integer, petExchange> var1) {
      this.du.aqa().removeAllChildren();
      ArrayList var4 = new ArrayList();
      Iterator var3;
      Iterator var10000 = var3 = var1.entrySet().iterator();

      while(true) {
         int var14;
         label73:
         while(var10000.hasNext()) {
            label86: {
               petExchange var2 = (petExchange)((Entry)var3.next()).getValue();
               if (this.dp != 0 || var2.geteType() != --2 && var2.geteType() != (22 & 127)) {
                  if (this.dp != 5 >> 2 || var2.geteType() < (43 & 94)) {
                     break label86;
                  }

                  if (var2.geteType() > (95 & 47)) {
                     var10000 = var3;
                     continue;
                  }
               }

               int var5;
               for(var14 = var5 = 0; var14 < var4.size(); var14 = var5) {
                  if (((petExchange)var4.get(var5)).geteId() > var2.geteId()) {
                     var10000 = var3;
                     var4.add(var5, var2);
                     continue label73;
                  }

                  ++var5;
               }

               var4.add(var2);
            }

            var10000 = var3;
         }

         int var9;
         for(var14 = var9 = 2 & 5; var14 < var4.size(); var14 = var9) {
            Class625 var10;
            petExchange var11;
            if ((var11 = (petExchange)var4.get(var9)).geteType() == (127 & 22)) {
               var10 = new Class625(var11.getType(), var11);
               var10.k(Color.white);
               var10.f(Class681.ce);
               this.du.aqa().add(new DefaultMutableTreeNode(var10));
            } else {
               label83: {
                  Class625 var15 = var10 = new Class625(var11.getName(), var11);
                  var15.k(Color.white);
                  var15.f(Class681.ce);
                  DefaultMutableTreeNode var12 = new DefaultMutableTreeNode(var10);
                  int var6 = this.du.aqa().getChildCount();

                  int var7;
                  for(var14 = var7 = 3 ^ 3; var14 < var6; var14 = var7) {
                     DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)this.du.aqa().getChildAt(var7);
                     if (var11.getType().equals(var8.toString())) {
                        var8.add(var12);
                        break label83;
                     }

                     ++var7;
                  }

                  DefaultMutableTreeNode var13 = new DefaultMutableTreeNode(var11.getType());
                  var13.add(var12);
                  this.du.aqa().add(var13);
               }
            }

            ++var9;
         }

         this.du.q();
         return;
      }
   }

   public void s() {
      this.dj = null;
      this.dt = null;
      this.bu((petExchange)null);
      this.bv((petExchange)null);
      this.o();
   }

   public void bu(petExchange var1) {
      StringBuffer var2 = new StringBuffer();
      if (var1 != null && this.dp == 0 && var1.geteType() == --2) {
         var2.append("成长率:");
         var2.append(var1.getGrow());
         var2.append("#r");
         var2.append("血初值:");
         var2.append(var1.getHp());
         var2.append("#r");
         var2.append("法初值:");
         var2.append(var1.getMp());
         var2.append("#r");
         var2.append("功初值:");
         var2.append(var1.getAp());
         var2.append("#r");
         var2.append("敏初值:");
         var2.append(var1.getSp());
         var2.append("#r");
         var2.append("五行:");
         var2.append(var1.getFive());
         var2.append("#r");
      }

      this.bv.setTextSize(var2.toString(), 127 & 123);
   }

   public boolean t() {
      this.s();
      return super.t();
   }

   public void d() {
      Class474 var10000;
      RoleData var1;
      int var4;
      label26: {
         LoginResult var2 = (var1 = this.vd()).getLoginResult();
         this.de.gh(var2.getGold().longValue());
         if (this.di != null && (var4 = var1.getGoodNum(this.di)) != this.dm) {
            if (this.do > var4) {
               RichLabel var3 = this.df;
               StringBuilder var10002 = (new StringBuilder("#R")).append(var4).append("#c228B22/");
               RichLabel var10001 = var3;
               var10000 = this;
               var10001.setText(var10002.append(this.do).toString());
               break label26;
            }

            this.df.setText("#c228B22" + var4 + "/" + this.do);
         }

         var10000 = this;
      }

      if (var10000.dk != null && (var4 = var1.getGoodNum(this.dk)) != this.m) {
         if (this.dn > var4) {
            this.z.setText("#R" + var4 + "#c228B22/" + this.dn);
            return;
         }

         this.z.setText("#c228B22" + var4 + "/" + this.dn);
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public void bv(petExchange var1) {
      StringBuffer var2 = new StringBuffer();
      String var5;
      if (var1 != null && this.dp == 0 && var1.geteType() == (1 ^ 3) && (var5 = var1.getSkill()) != null && !"".equals(var5)) {
         String[] var6 = var5.split("\\|");

         int var4;
         for(int var10000 = var4 = 3 >> 2; var10000 < var6.length; var10000 = var4) {
            Skill var3 = this.vc().bf(var6[var4]);
            var2.append(var3.getSkillname());
            var2.append("#r");
            this.dr.setText(var2.toString());
            Dimension var7 = this.dr.computeSize(123 & 127);
            this.dr.setSize(var7);
            ++var4;
            this.dr.setPreferredSize(var7);
         }

      } else {
         this.dr.setTextSize(var2.toString(), 127 & 123);
      }
   }
}
