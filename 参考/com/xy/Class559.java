package com.xy;

import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;

public class Class559 extends Class345 {
   private Class556 aim;
   private Class529 dq;
   private BigDecimal[] auu;
   private JLabel ik;
   private Class151 auv;
   private Class151 auw;
   private JLabel bd;
   private Class529 aaz;
   private JLabel ir;
   private Class529[] le;
   private Class529 qs;

   public Class559(GameView var1) {
      int var10000 = --4;
      int var10005 = -4 >> 2;
      super(112 & 127, --2, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 24570 & 8893, 24063 & 9150, Class345.aeo);
      this.fx("sc/b/S256.png");
      this.aea.setBounds(19326 & 14079, 78 & 63, 125 & 27, 125 & 27);
      String[] var4 = new String[var10000];
      boolean var10002 = true;
      var4[5 >> 3] = "不加持";
      var4[3 & 5] = "1点";
      var4[--2] = "8点";
      var4[--3] = "20点";
      String[] var2 = var4;
      var10000 = --3;
      this.auw = new Class151(127 & 78, 95 & 112, "sc/c/157", var2);
      this.auw.setBounds(32503 & 424, 12735 & 20351, 79 & 126, 95 & 112);
      this.auw.setVisible((boolean)(5 >> 3));
      this.add(this.auw);
      this.auw.oz().addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent var1) {
            if (Class559.this.auw.oz().getSelectedIndex() != -4 >> 2) {
               String var2 = (String)Class559.this.auw.oz().getSelectedValue();
               Class559.this.ir.setText(var2);
               Class559.this.auw.setVisible((boolean)(2 & 5));
            }
         }
      });
      this.ir = new JLabel("不加持");
      this.ir.setFont(Class681.bx);
      this.ir.setBounds(8686 & 24243, 31158 & 2009, 61 & 126, 58 & 87);
      this.ir.setForeground(Color.WHITE);
      this.add(this.ir);
      this.dq = new Class529("sc/c/5", 5 >> 2, 31, this);
      this.dq.setBounds(225, 400, 18, 18);
      this.add(this.dq);
      var4 = new String[var10000];
      var10002 = true;
      var4[3 >> 2] = "单抽";
      var4[--1] = "五连抽";
      var4[--2] = "二十连抽";
      var2 = var4;
      int var10001 = --3;
      this.auv = new Class151(78, 80, "sc/c/157", var2);
      this.auv.setBounds(342, 319, 78, 80);
      this.auv.setVisible((boolean)(3 >> 2));
      this.add(this.auv);
      this.auv.oz().addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent var1) {
            if (Class559.this.auv.oz().getSelectedIndex() != -4 >> 2) {
               String var2 = (String)Class559.this.auv.oz().getSelectedValue();
               Class559.this.ik.setText(var2);
               Class559.this.auv.setVisible((boolean)(3 ^ 3));
            }
         }
      });
      this.ik = new JLabel("单抽");
      this.ik.setFont(Class681.bx);
      this.ik.setBounds(344, 400, 80, 18);
      this.ik.setForeground(Color.WHITE);
      this.add(this.ik);
      this.qs = new Class529("sc/c/5", 5 >> 2, 32, this);
      this.qs.setBounds(407, 400, 17, 17);
      this.add(this.qs);
      Class529[] var5 = new Class529[var10001];
      boolean var10003 = true;
      this.le = var5;

      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < this.le.length; var10000 = var3) {
         this.le[var3] = new Class529("sc/b/" + (var3 == 0 ? "B350" : (var3 == (3 & 5) ? "B351" : "B352")) + ".png", 3 & 5, 33 + var3, this);
         this.le[var3].setBounds(var3 == 0 ? 63 : (var3 == (3 & 5) ? 252 : 440), -7, 200, 400);
         this.add(this.le[var3++]);
      }

      this.bd = new JLabel("祈福积分:0", --4);
      this.bd.setBounds(290, 420, 260, 17);
      this.bd.setFont(Class681.bm);
      this.bd.setOpaque((boolean)(2 & 5));
      this.bd.setForeground(Color.black);
      this.add(this.bd);
      this.aim = Class133.i(10, Color.white, Class681.q, (MoneyType)null, var1);
      this.aim.setBounds(506, 399, 80, 19);
      this.aim.setText("0");
      this.add(this.aim);
      this.aaz = new Class529("sc/e/27.png", 3 >> 1, 36, Class681.bm, (Color[])null, "积分兑换", this);
      this.aaz.setBounds(573, 420, 51, 17);
      this.aaz.setOpaque((boolean)(3 & 4));
      this.add(this.aaz);
   }

   public void ajv(BigDecimal[] var1) {
      this.auu = var1;
      this.d();
      this.ve().a(112 & 127);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public void d() {
      LoginResult var1 = this.vd().getLoginResult();
      this.aim.gh(var1.getScoretype("祈愿积分").longValue());
      this.bd.setText("祈福积分:" + var1.getScoretype("祈福积分"));
   }

   public void y(int var1) {
      if (var1 == (63 & 95)) {
         this.auw.setVisible((boolean)(2 ^ 3));
      } else if (var1 == (110 & 49)) {
         this.auv.setVisible((boolean)(3 >> 1));
      } else if (var1 != (109 & 51) && var1 != (46 & 115) && var1 != (47 & 115)) {
         if (var1 == (126 & 37)) {
            if (this.aej.t()) {
               return;
            }

            List var8;
            if ((var8 = (List)this.vc().bz().getNpcShopMap().get("3000")) == null) {
               return;
            }

            Class423 var10 = (Class423)this.ve().e(123 & 92);
            var10.arm(var8, "祈福积分");
            this.ve().a(94 & 121);
         }

      } else if (this.auu != null) {
         RoleData var2 = this.vd();
         String var7;
         int var4 = (var7 = this.ir.getText()).equals("不加持") ? 3 >> 2 : (var7.equals("1点") ? 5 >> 2 : (var7.equals("8点") ? 95 & 40 : 20));
         String var5;
         int var6 = (var5 = this.ik.getText()).equals("五连抽") ? --5 : (var5.equals("二十连抽") ? 119 & 28 : 1);
         if (var2.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), (3 >> 1) + var6) <= 0) {
            this.aej.f("背包空间不足");
         } else {
            BigDecimal var9 = this.auu[var1 - (107 & 53)];
            Goodstable var3;
            if ((var3 = var2.bc(var9)) != null && var6 <= var3.getUsetime()) {
               if (var4 != 0 && (long)(var4 * var6) > var2.getLoginResult().getScoretype("祈愿积分").longValue()) {
                  this.aej.f("你祈愿积分不足");
               } else {
                  this.aej.gameTXMask.a("DWQY", 2 ^ 3, "Q" + (var1 - (34 & 125)) + "|" + var3.getRgid() + "|" + var4 + "|" + var6);
               }
            } else {
               var3 = this.vc().n(var9);
               this.aej.f(var3 != null ? "背包没有" + var3.getGoodsname() : "物品不足");
            }
         }
      }
   }
}
