package com.xy.a.i;

import com.xy.q.Class49;
import com.xy.readbean.LaborShop;
import com.xy.readbean.Shop;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

class Class32 extends com.xy.i.Class1 {
   private JLabel sy;
   private JLabel bd;
   private LaborShop alb;
   private int cb;
   // $VF: synthetic field
   final Class28 alc;
   private JLabel fs;
   private com.xy.w.Class18 dm;
   private RichLabel bj;

   @Override
   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.cb == 2) {
         Shop var2;
         Shop var10001 = var2 = new Shop();
         var2.setShopname(this.alb.getName());
         var2.setShopskin(this.alb.getSkin());
         var10001.setShoptext(this.alb.getText());
         ((com.xy.a.Class48)this.alc.zc().j(46)).ov(var2);
      }
   }

   public void a() {
      String var10019 = "_R\u0003S\u0003s\u0018\u0004\u001e\u001f\\_K";
      this.setImage("sc/b/B452.png");
      this.fs.setText(this.alb.getName());
      String var10020 = "|h";
      this.bj.setTextSize("#K" + this.alb.getText(), 125);
      this.dm.gt(com.xy.w.Class15.d(this.alb.getSkin()));
      this.bd.setText(this.alb.getXGString((int)this.alc.yx().getPackRecord().getLabortype(this.alb.getId())));
      this.sy.setText(this.alb.getMoneyString(1.0));
      this.fs.setFont(Class49.ck);
      String var10013 = "\u0012O\u0007\u001f\u0005\u0018\u0003\u0018";
      this.fs.setForeground(Class49.c("#c634424"));
      this.bd.setFont(Class49.aw);
      String var10011 = "|@i\u0010k\u0017m\u0017";
      this.bd.setForeground(Class49.c("#c634424"));
      this.sy.setFont(Class49.aw);
      String var10009 = "\u0012O\u0007\u001f\u0005\u0018\u0003\u0018";
      this.sy.setForeground(Class49.c("#c634424"));
      this.fs.setHorizontalAlignment(0);
      this.bd.setHorizontalAlignment(10);
      this.sy.setHorizontalAlignment(10);
      this.fs.setBounds(0, 12, 155, 25);
      this.bj.setBounds(15, 36, this.bj.getWidth(), this.bj.getHeight());
      this.dm.setBounds(22, 73, 110, 110);
      this.bd.setBounds(15, 188, 140, 20);
      this.sy.setBounds(15, 207, 140, 20);
   }

   public void c() {
      String var10014 = "P<\f=\f\u001d\u0017j\u0010qS1D";
      this.setImage("sc/b/B453.png");
      this.fs.setText(this.alb.getName());
      String var10015 = "\u0012g";
      this.bj.setTextSize("#K" + this.alb.getText(), 125);
      this.dm.gt(com.xy.w.Class15.d(this.alb.getSkin()));
      this.sy.setText(this.alb.getMoneyString(1.0));
      this.fs.setFont(Class49.ck);
      String var10009 = "|@i\u0010k\u0017m\u0017";
      this.fs.setForeground(Class49.c("#c634424"));
      this.sy.setFont(Class49.aw);
      String var10007 = "\u0012O\u0007\u001f\u0005\u0018\u0003\u0018";
      this.sy.setForeground(Class49.c("#c634424"));
      this.fs.setHorizontalAlignment(10);
      this.sy.setHorizontalAlignment(0);
      this.fs.setBounds(90, 25, 155, 25);
      this.bj.setBounds(90, 50, this.bj.getWidth(), this.bj.getHeight());
      this.dm.setBounds(5, 5, 80, 80);
      this.sy.setBounds(0, 100, 213, 20);
   }

   public void e() {
      this.fs.setVisible(this.cb == 0 || this.cb == 1 || this.cb == 2 || this.cb == 3);
      this.bj.setVisible(this.cb == 0 || this.cb == 1 || this.cb == 3);
      this.dm.setVisible(this.cb == 0 || this.cb == 1 || this.cb == 2 || this.cb == 3);
      this.bd.setVisible(this.cb == 0 || this.cb == 2);
      this.sy.setVisible(this.cb == 0 || this.cb == 1 || this.cb == 2 || this.cb == 3);
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.alb != null) {
         if (this.alb.getGoods().length == 1) {
            ((Class47)this.form.zc().j(144)).hg(this.alb);
         } else {
            ((Class9)this.form.zc().j(143)).hg(this.alb);
         }
      }
   }

   public Class32(Class28 var1) {
      super(null, 1, null, var1.eg());
      this.alc = var1;
      this.fs = com.xy.q.Class1.f(0, 0, 0, 0, 0, Color.white, Class49.cp);
      this.bj = new RichLabel();
      this.dm = new com.xy.w.Class18();
      this.bd = com.xy.q.Class1.f(0, 0, 0, 0, 0, Color.white, Class49.cp);
      this.sy = com.xy.q.Class1.f(0, 0, 0, 0, 0, Color.white, Class49.cp);
      this.add(this.fs);
      this.add(this.bj);
      this.add(this.dm);
      this.add(this.bd);
      this.add(this.sy);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.cb == 2) {
         this.alc.zc().f(46);
      }
   }

   public void f() {
      String var10004 = "P<\f=\f\u001d\u0017j\u0017qS1D";
      this.setImage("sc/b/B454.png");
      this.fs.setText(this.alb.getName());
      this.dm.gt(com.xy.w.Class15.d(this.alb.getSkin()));
      this.bd.setText(this.alb.getZKMoneyString(0, 1.0));
      Class32 var10000;
      if (this.alb.getZk() != null) {
         var10000 = this;
         this.sy.setText(this.alb.getZKMoneyString(1, this.alc.aas()));
      } else {
         var10000 = this;
         this.sy.setText(null);
      }

      var10000.fs.setFont(Class49.k);
      String var10012 = "\u0012O\u0007\u001f\u0005\u0018\u0003\u0018";
      this.fs.setForeground(Class49.c("#c634424"));
      this.bd.setFont(Class49.cp);
      String var10010 = "|@i\u0010k\u0017m\u0017";
      this.bd.setForeground(Class49.c("#c634424"));
      this.sy.setFont(Class49.cp);
      this.sy.setForeground(Color.red);
      this.fs.setHorizontalAlignment(10);
      this.bd.setHorizontalAlignment(10);
      this.sy.setHorizontalAlignment(10);
      this.fs.setBounds(12, 18, 120, 25);
      this.dm.setBounds(132, 3, 75, 80);
      this.bd.setBounds(12, 40, 150, 20);
      this.sy.setBounds(12, 58, 150, 20);
   }

   public void h() {
      String var10014 = "_R\u0003S\u0003s\u0018\u0004\u0019\u001f\\_K";
      this.setImage("sc/b/B455.png");
      this.fs.setText(this.alb.getName());
      String var10015 = "|h";
      this.bj.setTextSize("#K" + this.alb.getText(), 125);
      this.dm.gt(com.xy.w.Class15.d(this.alb.getSkin()));
      this.sy.setText(this.alb.getMoneyString(1.0));
      this.fs.setFont(Class49.ck);
      String var10009 = "\u0012O\u0007\u001f\u0005\u0018\u0003\u0018";
      this.fs.setForeground(Class49.c("#c634424"));
      this.sy.setFont(Class49.aw);
      String var10007 = "|@i\u0010k\u0017m\u0017";
      this.sy.setForeground(Class49.c("#c634424"));
      this.fs.setHorizontalAlignment(0);
      this.sy.setHorizontalAlignment(10);
      this.fs.setBounds(0, 12, 155, 25);
      this.bj.setBounds(15, 36, this.bj.getWidth(), this.bj.getHeight());
      this.dm.setBounds(22, 73, 110, 110);
      this.sy.setBounds(15, 188, 140, 20);
   }

   public void adh(int var1, LaborShop var2) {
      this.cb = var1;
      this.alb = var2;
      if (var2 != null) {
         Class32 var10000;
         if (var1 == 0) {
            var10000 = this;
            this.a();
         } else if (var1 == 1) {
            var10000 = this;
            this.c();
         } else if (var1 == 2) {
            var10000 = this;
            this.f();
         } else {
            if (var1 == 3) {
               this.h();
            }

            var10000 = this;
         }

         var10000.e();
      }
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }
}
