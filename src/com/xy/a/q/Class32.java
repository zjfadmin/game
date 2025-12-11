package com.xy.a.q;

import com.xy.formula.BaseSkillData;
import com.xy.readbean.Skill;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class32 extends com.xy.w.Class18 {
   private JLabel db;
   private int gy;
   private com.xy.w.Class18 kh;
   private com.xy.i.Class19 kb;
   // $VF: synthetic field
   final Class111 vm;
   private BaseSkillData vn;
   private Skill ul;
   private com.xy.w.Class18 nn;
   private com.xy.q.Class54 vo;
   private JLabel fs;
   private JLabel di;
   private int ah;

   public Class32(Class111 var1) {
      super(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
      String var10005 = "' {'{wmm$-3";
      this.vm = var1;
      String var10007 = "ti(o(<)zim";
      String var10012 = "匄绳";
      this.kb = new com.xy.i.Class19("sc/e/6.png", 1, 205, com.xy.q.Class49.bz, null, "升级", var1.eg());
      this.kb.gw(this);
      this.kb.setBounds(179, 42, 34, 18);
      this.add(this.kb);
      this.vo = new com.xy.q.Class54(var1.eg());
      String var10006 = "ti(n(>)zim";
      this.vo.dq("sc/d/4.png");
      this.vo.wp(com.xy.q.Class54.auw);
      this.vo.setBounds(6, 5, 59, 57);
      this.add(this.vo);
      this.di = com.xy.q.Class1.f(73, 19, 90, 16, 10, Color.white, com.xy.q.Class49.w);
      this.db = com.xy.q.Class1.f(143, 19, 70, 16, 4, Color.white, com.xy.q.Class49.n);
      this.fs = com.xy.q.Class1.f(73, 43, 102, 16, 0, Color.white, com.xy.q.Class49.bz);
      this.add(this.di);
      this.add(this.db);
      this.add(this.fs);
      String var10013 = "' {'{ucm$-3";
      this.nn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/67.png", 6, 6, 6, 6, false));
      var10012 = "yd%c%6=)zim";
      this.kh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.nn.setBounds(74, 44, 100, 14);
      this.kh.setBounds(73, 43, 102, 16);
      this.add(this.nn);
      this.add(this.kh);
      this.vn = new BaseSkillData(null);
   }

   public void n(int var1) {
      if (this.ul != null) {
         this.gy = var1;
         this.vn.setSld(var1);
         JLabel var10002 = this.fs;
         StringBuilder var10003 = new StringBuilder(String.valueOf(var1));
         String var10004 = "{";
         var10002.setText(var10003.append("/").append(this.ul.getSkilllevel()).toString());
         JLabel var10001 = this.db;
         StringBuilder var3 = new StringBuilder(String.valueOf((var1 + 1) * this.ah));
         String var4 = "釖帋";
         var10001.setText(var3.append("金币").toString());
         int var2 = new BigDecimal(var1).divide(new BigDecimal(this.ul.getSkilllevel()), 3, 1).multiply(new BigDecimal(100)).intValue();
         this.nn.setBounds(74, 44, var2 > 100 ? 100 : var2, 14);
      }
   }

   public void rd(Skill var1) {
      Skill var10000 = this.ul = var1;
      this.vn.setSkill(var1);
      if (var10000 == null) {
         this.setVisible(false);
      } else {
         this.vo.gs(12, this.vn);
         this.ah = (int)Double.parseDouble(var1.getDielectric());
         this.di.setText(var1.getSkillname());
         this.n(0);
         this.setVisible(true);
      }
   }

   // $VF: synthetic method
   static Skill re(Class32 var0) {
      return var0.ul;
   }

   // $VF: synthetic method
   static int rf(Class32 var0) {
      return var0.ah;
   }

   // $VF: synthetic method
   static int rg(Class32 var0) {
      return var0.gy;
   }
}
