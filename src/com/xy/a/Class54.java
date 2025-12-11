package com.xy.a;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class54 extends JComponent {
   private JLabel sy;
   private com.xy.w.Class18 gf;
   private JLabel df;
   private com.xy.i.Class18 yr;
   private long lx;
   private JLabel fs;
   private JLabel di;
   // $VF: synthetic field
   final Class93 ys;

   public Class54(Class93 var1) {
      super();
      Class93 var10000 = this.ys = var1;
      this.setPreferredSize(new Dimension(402, 36));
      Class54 var2;
      if (var10000.za().l(2, 11)) {
         var2 = this;
         String var10004 = "u\n9X<";
         this.gf = new com.xy.w.Class18(com.xy.w.Class15.d("yb500"));
      } else {
         var2 = this;
         String var3 = "gSc";
         this.gf = new com.xy.w.Class18(com.xy.w.Class15.d("236"));
      }

      var2.gf.setBounds(5, 3, 30, 30);
      this.add(this.gf);
      this.sy = new JLabel("0");
      this.sy.setBounds(35, 10, 60, 16);
      this.sy.setFont(com.xy.q.Class49.bm);
      this.sy.setForeground(Color.white);
      this.add(this.sy);
      this.df = new JLabel("0");
      this.df.setFont(com.xy.q.Class49.bm);
      this.add(this.df);
      this.fs = new JLabel("0");
      this.fs.setFont(com.xy.q.Class49.bm);
      this.add(this.fs);
      this.di = new JLabel("0");
      this.di.setBounds(310, 10, 60, 16);
      this.di.setForeground(Color.white);
      this.di.setFont(com.xy.q.Class49.bm);
      this.add(this.di);
      String var10012 = "\u001boGiG:F|\u0006k";
      String var10015 = "乫柣";
      this.yr = new com.xy.i.Class18("sc/e/6.png", 1, 190, "下架", var1.eg());
      this.yr.gw(this);
      this.yr.setOffsetTexts(com.xy.q.Class49.ag);
      this.yr.setBounds(365, 9, 34, 17);
      this.add(this.yr);
   }

   // $VF: synthetic method
   static long ti(Class54 var0) {
      return var0.lx;
   }

   public void tg(String[] var1) {
      this.lx = Long.parseLong(var1[0]);
      this.sy.setText(var1[1]);
      com.xy.q.Class49.b(this.df, Long.parseLong(var1[3]));
      com.xy.q.Class49.b(this.fs, Long.parseLong(var1[1]) * Long.parseLong(var1[3]));
      this.di.setText(String.valueOf(Long.parseLong(var1[1]) - Long.parseLong(var1[2])));
      Class54 var10000;
      if (var1[4].equals("1")) {
         var10000 = this;
         this.yr.setForeground(Color.white);
         this.yr.setBtn(1);
         String var10002 = "乣枺";
         this.yr.setText("下架");
      } else {
         String var2 = var1[4];
         String var10001 = "f";
         if (var2.equals("3")) {
            var10000 = this;
            this.yr.setForeground(Color.gray);
            this.yr.setBtn(0);
            String var3 = "倴唢";
            this.yr.setText("停售");
         } else {
            var10000 = this;
            this.yr.setForeground(Color.gray);
            this.yr.setBtn(0);
            String var4 = "啎缑";
            this.yr.setText("售罄");
         }
      }

      var10000.df.setBounds(105, 10, 85, 16);
      this.fs.setBounds(195, 10, 110, 16);
      this.di.setVisible(true);
      this.yr.setVisible(true);
   }

   public void t() {
      this.yr.setForeground(Color.gray);
      this.yr.setBtn(0);
      String var10001 = "倴唢";
      this.yr.setText("停售");
   }

   public void tj(long var1, long var3) {
      this.lx = 0L;
      this.sy.setText(String.valueOf(var3));
      com.xy.q.Class49.b(this.df, var1);
      com.xy.q.Class49.b(this.fs, var1 * var3);
      this.df.setBounds(150, 10, 85, 16);
      this.fs.setBounds(300, 10, 110, 16);
      this.di.setVisible(false);
      this.yr.setVisible(false);
   }
}
