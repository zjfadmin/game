package com.xy;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleTable;
import com.xy.formula.SkillUtil;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Class420 extends Class345 {
   private Class436 gq;
   private JLabel azw;
   private Class436 atz;
   private Class436 azx;
   private Class529 ags;
   private JLabel li;
   private JLabel lj;
   private Class436 vk;
   private Class529 xg;
   private Class529 ala;
   private List<ChongjipackBean> mb;
   private JLabel at;
   private JScrollPane fl;
   private int j;
   private List<Class74> ie;
   private JTextField qz;
   private Class529 qs;

   public Class420(GameView var1) {
      int var10015 = -4 >> 2;
      int var10017 = -4 >> 2;
      super(127 & 103, 5 >> 1, Class345.aef, var1);
      this.j = var10017;
      this.va(var10015, 3 & 4, 29375 & 3954, 26203 & 7084, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 77 & 118, 77 & 118, 77 & 118, 77 & 118, (boolean)(3 >> 2)), "冲级礼包");
      this.ie = new ArrayList();
      this.ags = new Class529("sc/e/38.png", 1 ^ 3, 87 & 61, Class681.cf, Class681.c, "成长礼包", this);
      this.xg = new Class529("sc/e/38.png", --2, 127 & 22, Class681.cf, Class681.c, "我的推广", this);
      this.ala = new Class529("sc/e/38.png", 5 >> 1, 23 & 127, Class681.cf, Class681.c, "推广礼包", this);
      this.ags.setOffsetTexts(Class681.bv);
      this.xg.setOffsetTexts(Class681.bv);
      this.ala.setOffsetTexts(Class681.bv);
      this.ags.setBounds(63 & 121, 125 & 18, 22475 & 10422, 105 & 55);
      this.xg.setBounds(14271 & 18685, 22 & 121, 2303 & 30594, 51 & 109);
      this.ala.setBounds(13293 & 19795, 16, 130, 33);
      this.add(this.ags);
      this.add(this.xg);
      this.add(this.ala);
      this.lj = new JLabel();
      this.at = new JLabel();
      this.azw = new JLabel();
      this.li = new JLabel();
      this.lj.setBounds(315, 88, 70, 15);
      this.at.setBounds(448, 88, 70, 15);
      this.azw.setBounds(315, 109, 70, 15);
      this.li.setBounds(448, 109, 70, 15);
      this.lj.setForeground(Color.WHITE);
      this.at.setForeground(Color.WHITE);
      this.azw.setForeground(Color.WHITE);
      this.li.setForeground(Color.WHITE);
      this.lj.setFont(Class681.bm);
      this.at.setFont(Class681.bm);
      this.azw.setFont(Class681.bm);
      this.li.setFont(Class681.bm);
      this.qz = Class133.l(Class681.bm, Color.WHITE);
      this.qz.setEditable((boolean)(2 & 5));
      this.qz.setBounds(355, 132, 70, 15);
      this.qz.setBounds(323, 120, 70, 15);
      this.qz.setText("次数");
      this.qs = new Class529("sc/e/7.png", 3 & 5, 24, Class681.ak, Class681.c, "绑定", this);
      this.qs.setBounds(430, 115, 68, 26);
      this.add(this.lj);
      this.add(this.at);
      this.add(this.azw);
      this.add(this.li);
      this.add(this.qz);
      this.add(this.qs);
      JPanel var2 = new JPanel();
      int var10016 = 3 >> 2;
      var2.setBackground((Color)null);
      var2.setOpaque((boolean)var10016);
      var2.setBorder((Border)null);
      var2.setLayout((LayoutManager)null);
      this.fl = Class133.f(47, 180, 479, 310, var2, 20);
      this.add(this.fl);
      this.gq = new Class436(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(5 >> 3)));
      this.gq.setBounds(38, 30, 491, 20);
      this.add(this.gq);
      this.azx = new Class436(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 >> 2)));
      this.atz = new Class436(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
      this.azx.setBounds(45, 160, 478, 21);
      this.atz.setBounds(45, 160, 478, 330);
      this.add(this.azx);
      this.add(this.atz);
      this.vk = new Class436();
      this.vk.setBounds(45, 51, 479, 100);
      this.add(this.vk);
      if (this.uw().n(5 >> 1, 11)) {
         this.xg.setVisible((boolean)(3 >> 2));
         this.ala.setVisible((boolean)(3 ^ 3));
      }

   }

   public void o() {
      JPanel var1 = (JPanel)this.fl.getViewport().getView();
      int var10000 = 3 ^ 3;
      var1.removeAll();
      int var2 = var10000;

      int var3;
      for(var10000 = var3 = 3 ^ 3; var10000 < this.ie.size(); var10000 = var3) {
         Class74 var4;
         if ((var4 = (Class74)this.ie.get(var3)).hz() != null) {
            var4.setBounds(11 & 126, var2 * (63 & 126), 7663 & 25567, 125 & 63);
            ++var2;
            var1.add(var4);
         }

         ++var3;
      }

      var1.setPreferredSize(new Dimension(3583 & 29663, (126 & 63) * var2));
      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public void p() {
      String var1;
      if (!(var1 = this.qz.getText()).equals("") && Class394.i(var1)) {
         var1 = Agreement.getSendTextAES("TG02", var1);
         this.uw().d(var1);
      } else {
         this.aej.f("请输入正确的ID");
      }
   }

   public void s() {
      this.lj.setVisible((boolean)(3 >> 2));
      this.at.setVisible((boolean)(3 & 4));
      this.azw.setVisible((boolean)(2 & 5));
      this.li.setVisible((boolean)(5 >> 3));
      this.qz.setVisible((boolean)(2 & 5));
      this.qs.setVisible((boolean)(2 & 5));
   }

   public void y(int var1) {
      if (var1 == -4 >> 2) {
         var1 = --1;
      }

      this.j = var1;

      try {
         this.ags.setKeep((boolean)(this.j == --1 ? 3 >> 1 : 0));
         this.xg.setKeep((boolean)(this.j == --2 ? --1 : 0));
         this.ala.setKeep((boolean)(this.j == --3 ? --1 : 0));
         this.fl.getVerticalScrollBar().setValue(3 & 4);
         this.vk.fw(this.j == (3 & 5) ? "sc/b/S14.png" : (this.j == (1 ^ 3) ? "sc/b/B257.png" : "sc/b/B259.png"));
         this.s();
         String var3;
         if (this.j == (4 ^ 5) || this.j == (1 ^ 3)) {
            var3 = Agreement.getSendTextAES("chongjipackget", String.valueOf(this.j));
            this.uw().d(var3);
         }

         if (this.j == (1 ^ 3)) {
            var3 = Agreement.getSendTextAES("TG01", (String)null);
            this.uw().d(var3);
            return;
         }

         if (this.j == --3) {
            var3 = Agreement.getSendTextAES("TG00", (String)null);
            this.uw().d(var3);
            this.ck((List)this.vc().bz().getNpcShopMap().get("1100"));
            return;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public void aqg(List<ChongjipackBean> var1) {
      if (var1 == null) {
         var1 = new ArrayList();
      }

      this.mb = (List)var1;

      int var10000;
      int var2;
      for(var10000 = var2 = this.ie.size(); var10000 < ((List)var1).size(); var10000 = var2) {
         ++var2;
         this.ie.add(new Class74(this));
      }

      for(var10000 = var2 = 3 ^ 3; var10000 < this.ie.size(); var10000 = var2) {
         if (var2 < ((List)var1).size()) {
            ((Class74)this.ie.get(var2)).ic((ChongjipackBean)((List)var1).get(var2), this.j);
         } else {
            ((Class74)this.ie.get(var2)).ic((ChongjipackBean)null, this.j);
         }

         ++var2;
      }

      this.o();
   }

   public void aqh(RoleTable var1, List<RoleTable> var2) {
      this.s();
      LoginResult var3 = this.vd().getLoginResult();
      if (var2 != null) {
         this.lj.setText(var3.getRolename());
         this.at.setText(Class224.r(var3.getGrade()) + "级");
         this.li.setText(SkillUtil.getSepciesN(var3.getSpecies_id()));
         this.li.setText(var3.getRole_id().toString());
         this.lj.setVisible((boolean)(2 ^ 3));
         this.at.setVisible((boolean)(3 >> 1));
         this.azw.setVisible((boolean)(5 >> 2));
         this.li.setVisible((boolean)(5 >> 2));
         this.qz.setText(String.valueOf(var2.size()));
         this.qz.setEditable((boolean)(2 & 5));
         this.qz.setBounds(23539 & 9583, 14748 & 18151, 79 & 118, 15 & 127);
         this.qz.setVisible((boolean)(--1));
      } else if (var1 != null) {
         this.lj.setText(var1.getRolename());
         this.at.setText(Class224.r(var1.getGrade()) + "级");
         this.li.setText(SkillUtil.getSepciesN(var1.getSpecies_id()));
         this.li.setText(var1.getRole_id().toString());
         this.lj.setVisible((boolean)(4 ^ 5));
         this.at.setVisible((boolean)(3 >> 1));
         this.azw.setVisible((boolean)(2 ^ 3));
         this.li.setVisible((boolean)(--1));
         this.vk.fw("sc/b/B258.png");
      } else {
         this.qz.setText("");
         this.qz.setEditable((boolean)(4 ^ 5));
         this.qz.setBounds(5451 & 27639, 123 & 124, 86 & 111, 111 & 31);
         this.qz.setVisible((boolean)(4 ^ 5));
         this.qs.setVisible((boolean)(3 & 5));
         if (this.aej.isVisible() && this.aej.gameFrame.isFocused()) {
            this.qz.requestFocus();
         }

      }
   }

   public void ck(List<Shop> var1) {
      JPanel var2 = (JPanel)this.fl.getViewport().getView();
      var2.removeAll();
      if (var1 != null && var1.size() != 0) {
         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < var1.size(); var10000 = var3) {
            Shop var4 = (Shop)var1.get(var3);
            int var5 = var3 / --2;
            int var6 = var3 % (5 >> 1);
            Class293 var7 = new Class293(this, var4);
            int var10003 = var6 * (11247 & 21755) - (47 & 95);
            int var10004 = var5 * (103 & 89);
            int var10005 = 31482 & 1535;
            ++var3;
            var7.setBounds(var10003, var10004, var10005, 77 & 115);
            var2.add(var7);
         }

         var2.setPreferredSize(new Dimension(20959 & 12287, (109 & 83) * (var1.size() % (1 ^ 3) == 0 ? var1.size() / --2 : var1.size() / (5 >> 1) + (3 & 5))));
      }

      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public void d() {
      this.aqg(this.mb);
   }
}
