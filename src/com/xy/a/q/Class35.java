package com.xy.a.q;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleTable;
import com.xy.formula.SkillUtil;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Class35 extends com.xy.q.Class30 {
   private JLabel xb;
   private com.xy.i.Class19 pv;
   private com.xy.i.Class19 xc;
   private com.xy.i.Class19 ev;
   private JTextField xd;
   private com.xy.w.Class18 xe;
   private com.xy.w.Class18 xf;
   private JLabel xg;
   private List<Class71> lo;
   private JLabel sy;
   private com.xy.i.Class19 kv;
   private List<ChongjipackBean> rk;
   private JLabel ad;
   private JScrollPane i;
   private com.xy.w.Class18 af;
   private int eg;
   private com.xy.w.Class18 dn;

   public void c() {
      this.ad.setVisible(false);
      this.xb.setVisible(false);
      this.sy.setVisible(false);
      this.xg.setVisible(false);
      this.xd.setVisible(false);
      this.kv.setVisible(false);
   }

   public void rv(RoleTable var1, List<RoleTable> var2) {
      this.c();
      LoginResult var4 = this.yx().getLoginResult();
      if (var2 != null) {
         this.ad.setText(var4.getRolename());
         JLabel var10010 = this.xb;
         StringBuilder var10011 = new StringBuilder(String.valueOf(com.xy.v.Class4.h(var4.getGrade())));
         String var10012 = "纔";
         var10010.setText(var10011.append("级").toString());
         this.xg.setText(SkillUtil.getSepciesN(var4.getSpecies_id()));
         this.xg.setText(var4.getRole_id().toString());
         this.ad.setVisible(true);
         this.xb.setVisible(true);
         this.sy.setVisible(true);
         this.xg.setVisible(true);
         this.xd.setText(String.valueOf(var2.size()));
         this.xd.setEditable(false);
         this.xd.setBounds(355, 132, 70, 15);
         this.xd.setVisible(true);
      } else if (var1 != null) {
         this.ad.setText(var1.getRolename());
         JLabel var10007 = this.xb;
         StringBuilder var10008 = new StringBuilder(String.valueOf(com.xy.v.Class4.h(var1.getGrade())));
         String var10009 = "纝";
         var10007.setText(var10008.append("级").toString());
         this.xg.setText(SkillUtil.getSepciesN(var1.getSpecies_id()));
         this.xg.setText(var1.getRole_id().toString());
         this.ad.setVisible(true);
         this.xb.setVisible(true);
         this.sy.setVisible(true);
         this.xg.setVisible(true);
         String var10001 = "@E\u001cD\u001cd\u0001\u0013\u000b\bCHT";
         this.af.dp("sc/b/B258.png");
      } else {
         this.xd.setText("");
         this.xd.setEditable(true);
         this.xd.setBounds(323, 120, 70, 15);
         this.xd.setVisible(true);
         this.kv.setVisible(true);
         if (this.afx.isVisible() && this.afx.gameFrame.isFocused()) {
            this.xd.requestFocus();
         }
      }
   }

   public void rw(List<Shop> var1) {
      JPanel var2 = (JPanel)this.i.getViewport().getView();
      var2.removeAll();
      if (var1 != null && var1.size() != 0) {
         int var3;
         for (int var10000 = var3 = 0; var10000 < var1.size(); var10000 = var3) {
            Shop var4 = var1.get(var3);
            int var5 = var3 / 2;
            int var6 = var3 % 2;
            Class29 var7 = new Class29(this, var4);
            int var10003 = var6 * 235 - 15;
            int var10004 = var5 * 65;
            var3++;
            var7.setBounds(var10003, var10004, 250, 65);
            var2.add(var7);
         }

         var2.setPreferredSize(new Dimension(479, 65 * (var1.size() % 2 == 0 ? var1.size() / 2 : var1.size() / 2 + 1)));
      }

      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   public void e() {
      this.fm(this.rk);
   }

   public void g(int var1) {
      if (var1 == -1) {
         var1 = 1;
      }

      this.eg = var1;

      try {
         this.ev.setKeep(this.eg == 1);
         this.xc.setKeep(this.eg == 2);
         this.pv.setKeep(this.eg == 3);
         this.i.getVerticalScrollBar().setValue(0);
         String var6;
         if (this.eg == 1) {
            var6 = "UP\tQ\t`\u0017\u0007\bCHT";
            var6 = "sc/b/S14.png";
         } else if (this.eg == 2) {
            var6 = "I\n\u0015\u000b\u0015+\b\\\rGJ\u0007]";
            var6 = "sc/b/B257.png";
         } else {
            var6 = "@E\u001cD\u001cd\u0001\u0013\n\bCHT";
            var6 = "sc/b/B259.png";
         }

         this.af.dp(var6);
         this.c();
         if (this.eg == 1 || this.eg == 2) {
            String var2 = Agreement.getSendTextAES("chongjipackget", String.valueOf(this.eg));
            this.za().k(var2);
         }

         if (this.eg == 2) {
            String var5 = Agreement.getSendTextAES("TG01", null);
            this.za().k(var5);
            return;
         }

         if (this.eg == 3) {
            String var4 = Agreement.getSendTextAES("TG00", null);
            this.za().k(var4);
            Map var9 = this.yt().bg().getNpcShopMap();
            String var10002 = "X\u000bY\n";
            this.rw((List<Shop>)var9.get("1100"));
            return;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void fm(List<ChongjipackBean> var1) {
      if (var1 == null) {
         var1 = new ArrayList();
      }

      this.rk = var1;

      int var2;
      for (int var10000 = var2 = this.lo.size(); var10000 < var1.size(); var10000 = var2) {
         var2++;
         this.lo.add(new Class71(this));
      }

      for (int var4 = var2 = 0; var4 < this.lo.size(); var4 = ++var2) {
         if (var2 < var1.size()) {
            this.lo.get(var2).aaz(var1.get(var2), this.eg);
         } else {
            this.lo.get(var2).aaz(null, this.eg);
         }
      }

      this.f();
   }

   public void f() {
      JPanel var1 = (JPanel)this.i.getViewport().getView();
      var1.removeAll();
      int var2 = 0;

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.lo.size(); var10000 = ++var3) {
         Class71 var4;
         if ((var4 = this.lo.get(var3)).aay() != null) {
            var4.setBounds(10, var2 * 62, 463, 61);
            var2++;
            var1.add(var4);
         }
      }

      var1.setPreferredSize(new Dimension(479, 62 * var2));
      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   public Class35(GameView var1) {
      super(103, 2, com.xy.q.Class30.afz, var1);
      String var10013 = "UP\tW\t\u0002\bCHT";
      this.eg = -1;
      this.yy(-1, 0, 562, 520, com.xy.q.Class30.agh);
      com.xy.w.Class9 var3 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10014 = "凛纝祕匿";
      this.yu(var3, "冲级礼包");
      this.lo = new ArrayList<>();
      var10014 = "@E\u001cC\u001c\u0015\u000b\bCHT";
      String var10019 = "批镅祕匿";
      this.ev = new com.xy.i.Class19("sc/e/38.png", 2, 21, com.xy.q.Class49.bx, com.xy.q.Class49.bv, "成长礼包", this);
      var10013 = "@E\u001cC\u001c\u0015\u000b\bCHT";
      String var10018 = "扸皾揁幅";
      this.xc = new com.xy.i.Class19("sc/e/38.png", 2, 22, com.xy.q.Class49.bx, com.xy.q.Class49.bv, "我的推广", this);
      String var10012 = "@E\u001cC\u001c\u0015\u000b\bCHT";
      String var10017 = "揁幅祕匿";
      this.pv = new com.xy.i.Class19("sc/e/38.png", 2, 23, com.xy.q.Class49.bx, com.xy.q.Class49.bv, "推广礼包", this);
      this.ev.setOffsetTexts(com.xy.q.Class49.d);
      this.xc.setOffsetTexts(com.xy.q.Class49.d);
      this.pv.setOffsetTexts(com.xy.q.Class49.d);
      this.ev.setBounds(57, 16, 130, 33);
      this.xc.setBounds(189, 16, 130, 33);
      this.pv.setBounds(321, 16, 130, 33);
      this.add(this.ev);
      this.add(this.xc);
      this.add(this.pv);
      this.ad = new JLabel();
      this.xb = new JLabel();
      this.sy = new JLabel();
      this.xg = new JLabel();
      this.ad.setBounds(315, 88, 70, 15);
      this.xb.setBounds(448, 88, 70, 15);
      this.sy.setBounds(315, 109, 70, 15);
      this.xg.setBounds(448, 109, 70, 15);
      this.ad.setForeground(Color.WHITE);
      this.xb.setForeground(Color.WHITE);
      this.sy.setForeground(Color.WHITE);
      this.xg.setForeground(Color.WHITE);
      this.ad.setFont(com.xy.q.Class49.bz);
      this.xb.setFont(com.xy.q.Class49.bz);
      this.sy.setFont(com.xy.q.Class49.bz);
      this.xg.setFont(com.xy.q.Class49.bz);
      this.xd = com.xy.q.Class1.n(com.xy.q.Class49.bz, Color.WHITE);
      this.xd.setEditable(false);
      this.xd.setBounds(355, 132, 70, 15);
      this.xd.setBounds(323, 120, 70, 15);
      String var10009 = "欇敃";
      this.xd.setText("次数");
      String var10010 = "\u001aYF_F\rGJ\u0007]";
      String var10015 = "绷宩";
      this.kv = new com.xy.i.Class19("sc/e/7.png", 1, 24, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "绑定", this);
      this.kv.setBounds(430, 115, 68, 26);
      this.add(this.ad);
      this.add(this.xb);
      this.add(this.sy);
      this.add(this.xg);
      this.add(this.xd);
      this.add(this.kv);
      JPanel var2 = new JPanel();
      var2.setBackground(null);
      var2.setOpaque(false);
      var2.setBorder(null);
      var2.setLayout(null);
      this.i = com.xy.q.Class1.g(47, 180, 479, 310, var2, 20);
      this.add(this.i);
      var10017 = "I\n\u0015\r\u0015Z\u000fGJ\u0007]";
      this.dn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.dn.setBounds(38, 30, 491, 20);
      this.add(this.dn);
      String var10020 = "@E\u001cB\u001c\u0014\u0006\bCHT";
      this.xf = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
      var10019 = "I\n\u0015\r\u0015[\u000eGJ\u0007]";
      this.xe = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.xf.setBounds(45, 160, 478, 21);
      this.xe.setBounds(45, 160, 478, 330);
      this.add(this.xf);
      this.add(this.xe);
      this.af = new com.xy.w.Class18();
      this.af.setBounds(45, 51, 479, 100);
      this.add(this.af);
      if (this.za().l(2, 11)) {
         this.xc.setVisible(false);
         this.pv.setVisible(false);
      }
   }

   public void h() {
      String var1;
      if (!(var1 = this.xd.getText()).equals("") && com.xy.v.Class12.u(var1)) {
         String var2 = Agreement.getSendTextAES("TG02", var1);
         this.za().k(var2);
      } else {
         String var10001 = "讞辩儌歙砇皾 ~";
         this.afx._do("请输入正确的ID");
      }
   }
}
