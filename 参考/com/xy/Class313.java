package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Class313 extends Class345 {
   private int dp;
   private int br;
   private Class436 eq;
   private JScrollPane eb;
   private Class245 rd;
   private JList<null> yp;
   private JLabel bd;
   private Class70[] db;
   private int bn;
   private Class70[] ach;
   private int m;

   public void as(int var1) {
      this.dp = (this.br = var1) == 5 >> 1 ? 95 & 122 : 30;
      this.db[5 >> 3].setKeep((boolean)(var1 == 3 >> 1 ? 5 >> 2 : 0));
      this.db[--1].setKeep((boolean)(var1 == (1 ^ 3) ? 3 & 5 : 0));
      this.d();
   }

   public void d() {
      LoginResult var5 = this.vd().getLoginResult();
      this.m = 3 & 4;
      int var10000;
      int var1;
      int var2;
      int var3;
      int var4;
      String[] var6;
      if (this.br == 3 >> 1) {
         var6 = var5.getResistance("X");
         var3 = var5.getExtraPointInt("X");
         var10000 = 5 >> 3;
         this.bn = var3;
         var4 = var10000;

         for(var10000 = var1 = 5 >> 3; var10000 < 13; var10000 = var1) {
            if (!this.uw().n(1 ^ 3, --3) || var1 != 0 && var1 != 3 >> 1 && var1 != 5 >> 1) {
               if ((var2 = this.yp.getComponentCount()) >= (63 & 77)) {
                  ((<undefinedtype>)this.yp.getComponent(var4)).adm(var1, var6, this);
               } else {
                  JPanel var9 = new JPanel() {
                     private JLabel lj;
                     private Class436 vk;
                     private int gv;
                     private JLabel ik;
                     private JLabel as;
                     private int ay;
                     private Class70 gz;
                     private Class70 acg;
                     private Class436 bl;
                     private JLabel ax;

                     public String nn() {
                        double var1 = 0.0D;
                        String var3;
                        double var4;
                        int var10000 = (var4 = ((var3 = this.as.getText()).equals("抗三尸虫") ? (var1 = (double)this.gv * 100.0D) : (var3.equals("物理躲闪") ? (var1 = (double)this.gv * 1.0D) : (!var3.endsWith("躲闪") && !var3.endsWith("减免") ? (var1 = (double)this.gv * 1.5D) : (var1 = (double)this.gv * 0.4D)))) - (double)((int)var1)) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
                        StringBuilder var10002 = new StringBuilder;
                        if (var10000 == 0) {
                           var10002.<init>(String.valueOf((int)var1));
                           return var10002.toString();
                        } else {
                           var10002.<init>(String.valueOf(var1));
                           return var10002.toString();
                        }
                     }

                     public void adk(String[] var1, String var2, Class313 var3) {
                        double var4 = 0.0D;
                        this.ay = 3 >> 2;
                        this.gv = this.ay;
                        int var6;
                        if (var1 != null && !"".equals(var1)) {
                           for(int var10000 = var6 = 5 >> 3; var10000 < var1.length; var10000 = var6) {
                              if (var1[var6].startsWith(var2)) {
                                 String[] var7;
                                 <undefinedtype> var8;
                                 if ((var7 = var1[var6].split("="))[5 >> 3].equals("抗三尸虫")) {
                                    var8 = this;
                                    this.ay = (int)(Double.parseDouble(var7[3 >> 1]) / 100.0D);
                                    var4 = (double)this.ay * 100.0D;
                                 } else if (var7[2 & 5].equals("物理躲闪")) {
                                    var8 = this;
                                    this.ay = (int)(Double.parseDouble(var7[--1]) / 1.0D);
                                    var4 = (double)this.ay * 1.0D;
                                 } else if (!var7[5 >> 3].endsWith("躲闪") && !var7[3 ^ 3].endsWith("减免")) {
                                    var8 = this;
                                    this.ay = (int)(Double.parseDouble(var7[--1]) / 1.5D);
                                    var4 = (double)this.ay * 1.5D;
                                 } else {
                                    var8 = this;
                                    this.ay = (int)(Double.parseDouble(var7[4 ^ 5]) / 0.4D);
                                    var4 = (double)this.ay * 0.4D;
                                 }

                                 var8.gv = this.ay;
                                 this.lj.setText(var4 + this.so(var7[3 ^ 3]));
                                 this.ax.setText(this.ay + "/" + (var3.br == (4 ^ 5) ? 30 & 117 : 30));
                                 var3.m = var3.m + this.ay;
                                 return;
                              }

                              ++var6;
                           }
                        }

                     }

                     public void adm(int var1, String[] var2, Class313 var3) {
                        int var4 = 3 ^ 3;
                        <undefinedtype> var10000;
                        int var10001;
                        if (var1 == 0) {
                           var10001 = 21567 & 12265;
                           var10000 = this;
                           this.as.setText("抗鬼火");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == 3 >> 1) {
                           var10001 = 31934 & 1903;
                           var10000 = this;
                           this.as.setText("抗三尸虫");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == --2) {
                           var10001 = 19959 & 13883;
                           var10000 = this;
                           this.as.setText("抗遗忘");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == --3) {
                           var10001 = 19743 & 14054;
                           var10000 = this;
                           this.as.setText("抗物理");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == --4) {
                           var10001 = 22525 & 11302;
                           var10000 = this;
                           this.as.setText("抗火");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == --5) {
                           var10001 = 15839 & 17978;
                           var10000 = this;
                           this.as.setText("抗雷");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == (87 & 46)) {
                           var10001 = 9343 & 24479;
                           var10000 = this;
                           this.as.setText("抗水");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == (39 & 95)) {
                           var10001 = 21567 & 12245;
                           var10000 = this;
                           this.as.setText("抗风");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == (41 & 94)) {
                           var10001 = 15356 & 18431;
                           var10000 = this;
                           this.as.setText("抗中毒");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == (123 & 13)) {
                           var10001 = 19442 & 14335;
                           var10000 = this;
                           this.as.setText("抗封印");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = var10001;
                        } else if (var1 == (62 & 75)) {
                           var10001 = 9207 & 24575;
                           var10000 = this;
                           this.as.setText("抗昏睡");
                           this.ax.setText("0/20");
                           this.lj.setText("0");
                           var4 = var10001;
                        } else if (var1 == 11) {
                           var10000 = this;
                           this.as.setText("抗混乱");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = 1005;
                        } else if (var1 == 12) {
                           var10000 = this;
                           this.as.setText("抗震慑");
                           this.ax.setText("0/20");
                           this.lj.setText("0.0%");
                           var4 = 1025;
                        } else if (var1 == 13) {
                           var10000 = this;
                           this.as.setText("物理躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1030;
                        } else if (var1 == 14) {
                           var10000 = this;
                           this.as.setText("震慑躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1025;
                        } else if (var1 == 15) {
                           var10000 = this;
                           this.as.setText("火法躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1060;
                        } else if (var1 == 16) {
                           var10000 = this;
                           this.as.setText("雷法躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1050;
                        } else if (var1 == 17) {
                           var10000 = this;
                           this.as.setText("水法躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1055;
                        } else if (var1 == 18) {
                           var10000 = this;
                           this.as.setText("风法躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1045;
                        } else if (var1 == 19) {
                           var10000 = this;
                           this.as.setText("毒法躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1020;
                        } else if (var1 == 20) {
                           var10000 = this;
                           this.as.setText("封印躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1010;
                        } else if (var1 == 21) {
                           var10000 = this;
                           this.as.setText("昏睡躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1015;
                        } else if (var1 == 22) {
                           var10000 = this;
                           this.as.setText("混乱躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1005;
                        } else if (var1 == 23) {
                           var10000 = this;
                           this.as.setText("遗忘躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1075;
                        } else if (var1 == 24) {
                           var10000 = this;
                           this.as.setText("鬼火躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1065;
                        } else if (var1 == 25) {
                           var10000 = this;
                           this.as.setText("三尸虫躲闪");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1070;
                        } else if (var1 == 26) {
                           var10000 = this;
                           this.as.setText("水法伤害减免");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1055;
                        } else if (var1 == 27) {
                           var10000 = this;
                           this.as.setText("火法伤害减免");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1060;
                        } else if (var1 == 28) {
                           var10000 = this;
                           this.as.setText("鬼火伤害减免");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1065;
                        } else if (var1 == 29) {
                           var10000 = this;
                           this.as.setText("风法伤害减免");
                           this.ax.setText("0/30");
                           this.lj.setText("0.0%");
                           var4 = 1045;
                        } else {
                           if (var1 == 30) {
                              this.as.setText("雷法伤害减免");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1050;
                           }

                           var10000 = this;
                        }

                        var10000.bl.fw("sc/masterDoor/" + var4 + ".png");
                        this.lj.setForeground(Color.white);
                        this.ax.setForeground(Color.WHITE);
                        this.adk(var2, this.as.getText(), var3);
                     }

                     public String so(String var1) {
                        return "抗三尸虫".equals(var1) ? "" : "%";
                     }

                     public void q() {
                        int var4 = ((Class313)Class313.this.gk()).br;
                        double var2 = 0.0D;
                        <undefinedtype> var10000;
                        String var1;
                        if ((var1 = this.as.getText()).equals("抗三尸虫")) {
                           var10000 = this;
                           var2 = (double)this.gv * 100.0D;
                        } else if (var1.equals("物理躲闪")) {
                           var10000 = this;
                           var2 = (double)this.gv * 1.0D;
                        } else if (!var1.endsWith("躲闪") && !var1.endsWith("减免")) {
                           var10000 = this;
                           var2 = (double)this.gv * 1.5D;
                        } else {
                           var10000 = this;
                           var2 = (double)this.gv * 0.4D;
                        }

                        var10000.lj.setText(var2 + this.so(var1));
                        this.ax.setText(this.gv + "/" + (var4 == (3 & 5) ? 125 & 22 : 30));
                     }

                     public {
                        int var10007 = 2 & 5;
                        int var10010 = 2 & 5;
                        int var10012 = 2 & 5;
                        this.ay = var10012;
                        this.gv = var10010;
                        this.setPreferredSize(new Dimension(10734 & 22357, 98 & 63));
                        this.setOpaque((boolean)var10007);
                        this.setLayout((LayoutManager)null);
                        this.bl = new Class436();
                        this.bl.setBounds(--5, 1 ^ 3, 63 & 94, 63 & 94);
                        this.add(this.bl);
                        int var10004 = 31220 & 1791;
                        int var10006 = 26029 & 6898;
                        this.as = Class133.b(119 & 45, 7 & 127, 91 & 126, 21 & 126, Color.white, Class681.ce);
                        this.lj = Class133.b(var10006, 7 & 127, 58 & 119, 21 & 126, Color.white, Class681.ce);
                        this.ax = Class133.b(var10004, 87 & 46, 62 & 125, 22 & 127, Color.white, Class681.ce);
                        this.add(this.lj);
                        this.add(this.ax);
                        this.add(this.as);
                        this.acg = new Class70("sc/e/32.png", 2 ^ 3, 29563 & 3551, Class313.this.gk());
                        this.acg.setBounds(297, 9, 11, 15);
                        this.acg.bq(this);
                        this.add(this.acg);
                        this.gz = new Class70("sc/e/34.png", --1, 348, Class313.this.gk());
                        this.gz.setBounds(312, 9, 11, 15);
                        this.gz.bq(this);
                        this.add(this.gz);
                        this.vk = new Class436("sc/b/S173.png");
                        this.vk.setBounds(242, 6, 87, 22);
                        this.add(this.vk);
                     }
                  };
                  var9.setBounds(3 & 4, var2 * (43 & 118), 26589 & 6562, 102 & 59);
                  this.yp.add(var9);
               }

               ++var4;
            }

            ++var1;
         }

         this.yp.setPreferredSize(new Dimension(2453 & 30698, (107 & 54) * var4));
         this.m = var3 - this.m;
         this.rd.setText(var3 + "/30");
      } else {
         if (this.br == --2) {
            var6 = var5.getResistance("D");
            var3 = var5.getExtraPointInt("D");
            var10000 = 5 >> 3;
            this.bn = var3;
            var4 = var10000;

            for(var10000 = var1 = 5 >> 3; var10000 < 18; var10000 = var1) {
               var2 = var1 + (45 & 95);
               if (!this.uw().n(5 >> 1, --3) || var2 != (31 & 119) && var2 != (93 & 58) && var2 != (61 & 91) && var2 != (124 & 31)) {
                  int var7;
                  if ((var7 = this.yp.getComponentCount()) >= (114 & 31)) {
                     ((<undefinedtype>)this.yp.getComponent(var4)).adm(var1 + (13 & 127), var6, this);
                  } else {
                     JPanel var8 = new JPanel() {
                        private JLabel lj;
                        private Class436 vk;
                        private int gv;
                        private JLabel ik;
                        private JLabel as;
                        private int ay;
                        private Class70 gz;
                        private Class70 acg;
                        private Class436 bl;
                        private JLabel ax;

                        public String nn() {
                           double var1 = 0.0D;
                           String var3;
                           double var4;
                           int var10000 = (var4 = ((var3 = this.as.getText()).equals("抗三尸虫") ? (var1 = (double)this.gv * 100.0D) : (var3.equals("物理躲闪") ? (var1 = (double)this.gv * 1.0D) : (!var3.endsWith("躲闪") && !var3.endsWith("减免") ? (var1 = (double)this.gv * 1.5D) : (var1 = (double)this.gv * 0.4D)))) - (double)((int)var1)) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
                           StringBuilder var10002 = new StringBuilder;
                           if (var10000 == 0) {
                              var10002.<init>(String.valueOf((int)var1));
                              return var10002.toString();
                           } else {
                              var10002.<init>(String.valueOf(var1));
                              return var10002.toString();
                           }
                        }

                        public void adk(String[] var1, String var2, Class313 var3) {
                           double var4 = 0.0D;
                           this.ay = 3 >> 2;
                           this.gv = this.ay;
                           int var6;
                           if (var1 != null && !"".equals(var1)) {
                              for(int var10000 = var6 = 5 >> 3; var10000 < var1.length; var10000 = var6) {
                                 if (var1[var6].startsWith(var2)) {
                                    String[] var7;
                                    <undefinedtype> var8;
                                    if ((var7 = var1[var6].split("="))[5 >> 3].equals("抗三尸虫")) {
                                       var8 = this;
                                       this.ay = (int)(Double.parseDouble(var7[3 >> 1]) / 100.0D);
                                       var4 = (double)this.ay * 100.0D;
                                    } else if (var7[2 & 5].equals("物理躲闪")) {
                                       var8 = this;
                                       this.ay = (int)(Double.parseDouble(var7[--1]) / 1.0D);
                                       var4 = (double)this.ay * 1.0D;
                                    } else if (!var7[5 >> 3].endsWith("躲闪") && !var7[3 ^ 3].endsWith("减免")) {
                                       var8 = this;
                                       this.ay = (int)(Double.parseDouble(var7[--1]) / 1.5D);
                                       var4 = (double)this.ay * 1.5D;
                                    } else {
                                       var8 = this;
                                       this.ay = (int)(Double.parseDouble(var7[4 ^ 5]) / 0.4D);
                                       var4 = (double)this.ay * 0.4D;
                                    }

                                    var8.gv = this.ay;
                                    this.lj.setText(var4 + this.so(var7[3 ^ 3]));
                                    this.ax.setText(this.ay + "/" + (var3.br == (4 ^ 5) ? 30 & 117 : 30));
                                    var3.m = var3.m + this.ay;
                                    return;
                                 }

                                 ++var6;
                              }
                           }

                        }

                        public void adm(int var1, String[] var2, Class313 var3) {
                           int var4 = 3 ^ 3;
                           <undefinedtype> var10000;
                           int var10001;
                           if (var1 == 0) {
                              var10001 = 21567 & 12265;
                              var10000 = this;
                              this.as.setText("抗鬼火");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == 3 >> 1) {
                              var10001 = 31934 & 1903;
                              var10000 = this;
                              this.as.setText("抗三尸虫");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == --2) {
                              var10001 = 19959 & 13883;
                              var10000 = this;
                              this.as.setText("抗遗忘");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == --3) {
                              var10001 = 19743 & 14054;
                              var10000 = this;
                              this.as.setText("抗物理");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == --4) {
                              var10001 = 22525 & 11302;
                              var10000 = this;
                              this.as.setText("抗火");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == --5) {
                              var10001 = 15839 & 17978;
                              var10000 = this;
                              this.as.setText("抗雷");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == (87 & 46)) {
                              var10001 = 9343 & 24479;
                              var10000 = this;
                              this.as.setText("抗水");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == (39 & 95)) {
                              var10001 = 21567 & 12245;
                              var10000 = this;
                              this.as.setText("抗风");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == (41 & 94)) {
                              var10001 = 15356 & 18431;
                              var10000 = this;
                              this.as.setText("抗中毒");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == (123 & 13)) {
                              var10001 = 19442 & 14335;
                              var10000 = this;
                              this.as.setText("抗封印");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = var10001;
                           } else if (var1 == (62 & 75)) {
                              var10001 = 9207 & 24575;
                              var10000 = this;
                              this.as.setText("抗昏睡");
                              this.ax.setText("0/20");
                              this.lj.setText("0");
                              var4 = var10001;
                           } else if (var1 == 11) {
                              var10000 = this;
                              this.as.setText("抗混乱");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = 1005;
                           } else if (var1 == 12) {
                              var10000 = this;
                              this.as.setText("抗震慑");
                              this.ax.setText("0/20");
                              this.lj.setText("0.0%");
                              var4 = 1025;
                           } else if (var1 == 13) {
                              var10000 = this;
                              this.as.setText("物理躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1030;
                           } else if (var1 == 14) {
                              var10000 = this;
                              this.as.setText("震慑躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1025;
                           } else if (var1 == 15) {
                              var10000 = this;
                              this.as.setText("火法躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1060;
                           } else if (var1 == 16) {
                              var10000 = this;
                              this.as.setText("雷法躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1050;
                           } else if (var1 == 17) {
                              var10000 = this;
                              this.as.setText("水法躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1055;
                           } else if (var1 == 18) {
                              var10000 = this;
                              this.as.setText("风法躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1045;
                           } else if (var1 == 19) {
                              var10000 = this;
                              this.as.setText("毒法躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1020;
                           } else if (var1 == 20) {
                              var10000 = this;
                              this.as.setText("封印躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1010;
                           } else if (var1 == 21) {
                              var10000 = this;
                              this.as.setText("昏睡躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1015;
                           } else if (var1 == 22) {
                              var10000 = this;
                              this.as.setText("混乱躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1005;
                           } else if (var1 == 23) {
                              var10000 = this;
                              this.as.setText("遗忘躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1075;
                           } else if (var1 == 24) {
                              var10000 = this;
                              this.as.setText("鬼火躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1065;
                           } else if (var1 == 25) {
                              var10000 = this;
                              this.as.setText("三尸虫躲闪");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1070;
                           } else if (var1 == 26) {
                              var10000 = this;
                              this.as.setText("水法伤害减免");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1055;
                           } else if (var1 == 27) {
                              var10000 = this;
                              this.as.setText("火法伤害减免");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1060;
                           } else if (var1 == 28) {
                              var10000 = this;
                              this.as.setText("鬼火伤害减免");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1065;
                           } else if (var1 == 29) {
                              var10000 = this;
                              this.as.setText("风法伤害减免");
                              this.ax.setText("0/30");
                              this.lj.setText("0.0%");
                              var4 = 1045;
                           } else {
                              if (var1 == 30) {
                                 this.as.setText("雷法伤害减免");
                                 this.ax.setText("0/30");
                                 this.lj.setText("0.0%");
                                 var4 = 1050;
                              }

                              var10000 = this;
                           }

                           var10000.bl.fw("sc/masterDoor/" + var4 + ".png");
                           this.lj.setForeground(Color.white);
                           this.ax.setForeground(Color.WHITE);
                           this.adk(var2, this.as.getText(), var3);
                        }

                        public String so(String var1) {
                           return "抗三尸虫".equals(var1) ? "" : "%";
                        }

                        public void q() {
                           int var4 = ((Class313)Class313.this.gk()).br;
                           double var2 = 0.0D;
                           <undefinedtype> var10000;
                           String var1;
                           if ((var1 = this.as.getText()).equals("抗三尸虫")) {
                              var10000 = this;
                              var2 = (double)this.gv * 100.0D;
                           } else if (var1.equals("物理躲闪")) {
                              var10000 = this;
                              var2 = (double)this.gv * 1.0D;
                           } else if (!var1.endsWith("躲闪") && !var1.endsWith("减免")) {
                              var10000 = this;
                              var2 = (double)this.gv * 1.5D;
                           } else {
                              var10000 = this;
                              var2 = (double)this.gv * 0.4D;
                           }

                           var10000.lj.setText(var2 + this.so(var1));
                           this.ax.setText(this.gv + "/" + (var4 == (3 & 5) ? 125 & 22 : 30));
                        }

                        public {
                           int var10007 = 2 & 5;
                           int var10010 = 2 & 5;
                           int var10012 = 2 & 5;
                           this.ay = var10012;
                           this.gv = var10010;
                           this.setPreferredSize(new Dimension(10734 & 22357, 98 & 63));
                           this.setOpaque((boolean)var10007);
                           this.setLayout((LayoutManager)null);
                           this.bl = new Class436();
                           this.bl.setBounds(--5, 1 ^ 3, 63 & 94, 63 & 94);
                           this.add(this.bl);
                           int var10004 = 31220 & 1791;
                           int var10006 = 26029 & 6898;
                           this.as = Class133.b(119 & 45, 7 & 127, 91 & 126, 21 & 126, Color.white, Class681.ce);
                           this.lj = Class133.b(var10006, 7 & 127, 58 & 119, 21 & 126, Color.white, Class681.ce);
                           this.ax = Class133.b(var10004, 87 & 46, 62 & 125, 22 & 127, Color.white, Class681.ce);
                           this.add(this.lj);
                           this.add(this.ax);
                           this.add(this.as);
                           this.acg = new Class70("sc/e/32.png", 2 ^ 3, 29563 & 3551, Class313.this.gk());
                           this.acg.setBounds(297, 9, 11, 15);
                           this.acg.bq(this);
                           this.add(this.acg);
                           this.gz = new Class70("sc/e/34.png", --1, 348, Class313.this.gk());
                           this.gz.setBounds(312, 9, 11, 15);
                           this.gz.bq(this);
                           this.add(this.gz);
                           this.vk = new Class436("sc/b/S173.png");
                           this.vk.setBounds(242, 6, 87, 22);
                           this.add(this.vk);
                        }
                     };
                     var8.setBounds(3 >> 2, var7 * (103 & 58), 15280 & 17871, 55 & 106);
                     this.yp.add(var8);
                  }

                  ++var4;
               }

               ++var1;
            }

            this.m = var3 - this.m;
            this.rd.setText(var3 + "/90");
            this.yp.setPreferredSize(new Dimension(384, 34 * var4));
         }

      }
   }

   public Class313(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      int var10007 = 3 & 4;
      int var10009 = 30 & 127;
      int var10011 = 2 & 5;
      super(55 & 126, --2, Class345.aef, var1);
      this.br = var10011;
      this.dp = var10009;
      this.bn = var10007;
      this.va(var10005, 5 >> 3, 8702 & 24497, 14763 & 18399, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 71 & 124, 71 & 124, 71 & 124, 71 & 124, (boolean)(5 >> 3)), "帮派守护神");
      Class70[] var5 = new Class70[var10001];
      boolean var10003 = true;
      this.db = var5;

      int var3;
      Class70[] var4;
      Font var9;
      String var10;
      int var10000;
      int var10006;
      Class313 var10010;
      for(var10000 = var3 = 5 >> 3; var10000 < this.db.length; var10000 = var3) {
         var4 = this.db;
         Class70 var10002 = new Class70;
         var10005 = 1 ^ 3;
         var10006 = (8191 & 24917) + var3;
         var9 = Class681.cw;
         if (var3 == 0) {
            var10 = "小成修炼";
            var10010 = this;
         } else if (var3 == --1) {
            var10 = "大成修炼";
            var10010 = this;
         } else {
            var10 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/53.png", var10005, var10006, var9, (Color[])null, var10, var10010);
         var4[var3] = var10002;
         this.db[var3].setOffsetTexts(Class681.cl);
         this.db[var3].setBounds((55 & 125) + (127 & 111) * var3, 47 & 115, 127 & 109, 124 & 27);
         this.add(this.db[var3++]);
      }

      var10000 = 3 >> 2;
      this.yp = new JList();
      this.yp.setOpaque((boolean)(3 ^ 3));
      this.yp.removeAll();

      for(var3 = var10000; var10000 < 18; var10000 = var3) {
         JPanel var2 = new JPanel() {
            private JLabel lj;
            private Class436 vk;
            private int gv;
            private JLabel ik;
            private JLabel as;
            private int ay;
            private Class70 gz;
            private Class70 acg;
            private Class436 bl;
            private JLabel ax;

            public String nn() {
               double var1 = 0.0D;
               String var3;
               double var4;
               int var10000 = (var4 = ((var3 = this.as.getText()).equals("抗三尸虫") ? (var1 = (double)this.gv * 100.0D) : (var3.equals("物理躲闪") ? (var1 = (double)this.gv * 1.0D) : (!var3.endsWith("躲闪") && !var3.endsWith("减免") ? (var1 = (double)this.gv * 1.5D) : (var1 = (double)this.gv * 0.4D)))) - (double)((int)var1)) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
               StringBuilder var10002 = new StringBuilder;
               if (var10000 == 0) {
                  var10002.<init>(String.valueOf((int)var1));
                  return var10002.toString();
               } else {
                  var10002.<init>(String.valueOf(var1));
                  return var10002.toString();
               }
            }

            public void adk(String[] var1, String var2, Class313 var3) {
               double var4 = 0.0D;
               this.ay = 3 >> 2;
               this.gv = this.ay;
               int var6;
               if (var1 != null && !"".equals(var1)) {
                  for(int var10000 = var6 = 5 >> 3; var10000 < var1.length; var10000 = var6) {
                     if (var1[var6].startsWith(var2)) {
                        String[] var7;
                        <undefinedtype> var8;
                        if ((var7 = var1[var6].split("="))[5 >> 3].equals("抗三尸虫")) {
                           var8 = this;
                           this.ay = (int)(Double.parseDouble(var7[3 >> 1]) / 100.0D);
                           var4 = (double)this.ay * 100.0D;
                        } else if (var7[2 & 5].equals("物理躲闪")) {
                           var8 = this;
                           this.ay = (int)(Double.parseDouble(var7[--1]) / 1.0D);
                           var4 = (double)this.ay * 1.0D;
                        } else if (!var7[5 >> 3].endsWith("躲闪") && !var7[3 ^ 3].endsWith("减免")) {
                           var8 = this;
                           this.ay = (int)(Double.parseDouble(var7[--1]) / 1.5D);
                           var4 = (double)this.ay * 1.5D;
                        } else {
                           var8 = this;
                           this.ay = (int)(Double.parseDouble(var7[4 ^ 5]) / 0.4D);
                           var4 = (double)this.ay * 0.4D;
                        }

                        var8.gv = this.ay;
                        this.lj.setText(var4 + this.so(var7[3 ^ 3]));
                        this.ax.setText(this.ay + "/" + (var3.br == (4 ^ 5) ? 30 & 117 : 30));
                        var3.m = var3.m + this.ay;
                        return;
                     }

                     ++var6;
                  }
               }

            }

            public void adm(int var1, String[] var2, Class313 var3) {
               int var4 = 3 ^ 3;
               <undefinedtype> var10000;
               int var10001;
               if (var1 == 0) {
                  var10001 = 21567 & 12265;
                  var10000 = this;
                  this.as.setText("抗鬼火");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == 3 >> 1) {
                  var10001 = 31934 & 1903;
                  var10000 = this;
                  this.as.setText("抗三尸虫");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == --2) {
                  var10001 = 19959 & 13883;
                  var10000 = this;
                  this.as.setText("抗遗忘");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == --3) {
                  var10001 = 19743 & 14054;
                  var10000 = this;
                  this.as.setText("抗物理");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == --4) {
                  var10001 = 22525 & 11302;
                  var10000 = this;
                  this.as.setText("抗火");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == --5) {
                  var10001 = 15839 & 17978;
                  var10000 = this;
                  this.as.setText("抗雷");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == (87 & 46)) {
                  var10001 = 9343 & 24479;
                  var10000 = this;
                  this.as.setText("抗水");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == (39 & 95)) {
                  var10001 = 21567 & 12245;
                  var10000 = this;
                  this.as.setText("抗风");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == (41 & 94)) {
                  var10001 = 15356 & 18431;
                  var10000 = this;
                  this.as.setText("抗中毒");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == (123 & 13)) {
                  var10001 = 19442 & 14335;
                  var10000 = this;
                  this.as.setText("抗封印");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = var10001;
               } else if (var1 == (62 & 75)) {
                  var10001 = 9207 & 24575;
                  var10000 = this;
                  this.as.setText("抗昏睡");
                  this.ax.setText("0/20");
                  this.lj.setText("0");
                  var4 = var10001;
               } else if (var1 == 11) {
                  var10000 = this;
                  this.as.setText("抗混乱");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = 1005;
               } else if (var1 == 12) {
                  var10000 = this;
                  this.as.setText("抗震慑");
                  this.ax.setText("0/20");
                  this.lj.setText("0.0%");
                  var4 = 1025;
               } else if (var1 == 13) {
                  var10000 = this;
                  this.as.setText("物理躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1030;
               } else if (var1 == 14) {
                  var10000 = this;
                  this.as.setText("震慑躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1025;
               } else if (var1 == 15) {
                  var10000 = this;
                  this.as.setText("火法躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1060;
               } else if (var1 == 16) {
                  var10000 = this;
                  this.as.setText("雷法躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1050;
               } else if (var1 == 17) {
                  var10000 = this;
                  this.as.setText("水法躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1055;
               } else if (var1 == 18) {
                  var10000 = this;
                  this.as.setText("风法躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1045;
               } else if (var1 == 19) {
                  var10000 = this;
                  this.as.setText("毒法躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1020;
               } else if (var1 == 20) {
                  var10000 = this;
                  this.as.setText("封印躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1010;
               } else if (var1 == 21) {
                  var10000 = this;
                  this.as.setText("昏睡躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1015;
               } else if (var1 == 22) {
                  var10000 = this;
                  this.as.setText("混乱躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1005;
               } else if (var1 == 23) {
                  var10000 = this;
                  this.as.setText("遗忘躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1075;
               } else if (var1 == 24) {
                  var10000 = this;
                  this.as.setText("鬼火躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1065;
               } else if (var1 == 25) {
                  var10000 = this;
                  this.as.setText("三尸虫躲闪");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1070;
               } else if (var1 == 26) {
                  var10000 = this;
                  this.as.setText("水法伤害减免");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1055;
               } else if (var1 == 27) {
                  var10000 = this;
                  this.as.setText("火法伤害减免");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1060;
               } else if (var1 == 28) {
                  var10000 = this;
                  this.as.setText("鬼火伤害减免");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1065;
               } else if (var1 == 29) {
                  var10000 = this;
                  this.as.setText("风法伤害减免");
                  this.ax.setText("0/30");
                  this.lj.setText("0.0%");
                  var4 = 1045;
               } else {
                  if (var1 == 30) {
                     this.as.setText("雷法伤害减免");
                     this.ax.setText("0/30");
                     this.lj.setText("0.0%");
                     var4 = 1050;
                  }

                  var10000 = this;
               }

               var10000.bl.fw("sc/masterDoor/" + var4 + ".png");
               this.lj.setForeground(Color.white);
               this.ax.setForeground(Color.WHITE);
               this.adk(var2, this.as.getText(), var3);
            }

            public String so(String var1) {
               return "抗三尸虫".equals(var1) ? "" : "%";
            }

            public void q() {
               int var4 = ((Class313)Class313.this.gk()).br;
               double var2 = 0.0D;
               <undefinedtype> var10000;
               String var1;
               if ((var1 = this.as.getText()).equals("抗三尸虫")) {
                  var10000 = this;
                  var2 = (double)this.gv * 100.0D;
               } else if (var1.equals("物理躲闪")) {
                  var10000 = this;
                  var2 = (double)this.gv * 1.0D;
               } else if (!var1.endsWith("躲闪") && !var1.endsWith("减免")) {
                  var10000 = this;
                  var2 = (double)this.gv * 1.5D;
               } else {
                  var10000 = this;
                  var2 = (double)this.gv * 0.4D;
               }

               var10000.lj.setText(var2 + this.so(var1));
               this.ax.setText(this.gv + "/" + (var4 == (3 & 5) ? 125 & 22 : 30));
            }

            public {
               int var10007 = 2 & 5;
               int var10010 = 2 & 5;
               int var10012 = 2 & 5;
               this.ay = var10012;
               this.gv = var10010;
               this.setPreferredSize(new Dimension(10734 & 22357, 98 & 63));
               this.setOpaque((boolean)var10007);
               this.setLayout((LayoutManager)null);
               this.bl = new Class436();
               this.bl.setBounds(--5, 1 ^ 3, 63 & 94, 63 & 94);
               this.add(this.bl);
               int var10004 = 31220 & 1791;
               int var10006 = 26029 & 6898;
               this.as = Class133.b(119 & 45, 7 & 127, 91 & 126, 21 & 126, Color.white, Class681.ce);
               this.lj = Class133.b(var10006, 7 & 127, 58 & 119, 21 & 126, Color.white, Class681.ce);
               this.ax = Class133.b(var10004, 87 & 46, 62 & 125, 22 & 127, Color.white, Class681.ce);
               this.add(this.lj);
               this.add(this.ax);
               this.add(this.as);
               this.acg = new Class70("sc/e/32.png", 2 ^ 3, 29563 & 3551, Class313.this.gk());
               this.acg.setBounds(297, 9, 11, 15);
               this.acg.bq(this);
               this.add(this.acg);
               this.gz = new Class70("sc/e/34.png", --1, 348, Class313.this.gk());
               this.gz.setBounds(312, 9, 11, 15);
               this.gz.bq(this);
               this.add(this.gz);
               this.vk = new Class436("sc/b/S173.png");
               this.vk.setBounds(242, 6, 87, 22);
               this.add(this.vk);
            }
         };
         var2.setBounds(3 & 4, var3 * (106 & 55), 16863 & 16288, 63 & 98);
         ++var3;
         this.yp.add(var2);
      }

      var10001 = --4;
      var10005 = 127 & 53;
      this.yp.setPreferredSize(new Dimension(4554 & 28597, 680));
      this.eb = Class133.f(var10005, 60, 350, 278, this.yp, 30);
      this.add(this.eb);
      var5 = new Class70[var10001];
      var10003 = true;
      this.ach = var5;

      for(var10000 = var3 = 3 & 4; var10000 < this.ach.length; var10000 = var3) {
         var4 = this.ach;
         Class70 var7 = new Class70;
         String var10004 = var3 == --3 ? "sc/e/7.png" : "sc/e/6.png";
         var10006 = 343 + var3;
         var9 = var3 == --3 ? Class681.ak : Class681.bm;
         if (var3 == 0) {
            var10 = "修炼";
            var10010 = this;
         } else if (var3 == --1) {
            var10 = "洗点";
            var10010 = this;
         } else if (var3 == 5 >> 1) {
            var10 = "兑换";
            var10010 = this;
         } else if (var3 == --3) {
            var10 = "确定";
            var10010 = this;
         } else {
            var10 = "";
            var10010 = this;
         }

         var7.<init>(var10004, 1, var10006, var9, (Color[])null, var10, var10010);
         var4[var3] = var7;
         Class313 var8;
         if (var3 == --3) {
            var8 = this;
            this.ach[var3].setBounds(342, 348, 59, 25);
            this.ach[var3].setForeground(Color.black);
         } else {
            var8 = this;
            this.ach[var3].setBounds(171 + 40 * var3, 351, 34, 18);
         }

         var8.add(this.ach[var3++]);
      }

      this.rd = Class133.a(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, 3 & 4, Color.white, Class681.ab);
      this.rd.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.rd.setHorizontalAlignment(10);
      this.rd.setBounds(122, 352, 83, 17);
      this.add(this.rd);
      this.bd = Class133.c(53, 352, 70, 17, 10, Class681.c("#c000000"), Class681.ak);
      this.bd.setText("修炼等级");
      this.add(this.bd);
      this.eq = new Class436();
      this.eq.eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(2 & 5)));
      this.eq.setBounds(53, 59, 350, 280);
      this.add(this.eq);
   }

   public void aoy(boolean var1, Object var2) {
      <undefinedtype> var4 = (<undefinedtype>)var2;
      if (var1) {
         if (this.m <= 0) {
            this.aej.f("剩余点数不足");
            return;
         }

         int var3 = this.br == --2 ? 126 & 31 : 20;
         if (var4.gv >= var3) {
            this.aej.f("不可以再增加点数了");
            return;
         }

         var4.gv = var4.gv + (3 >> 1);
         var4.q();
         this.m -= 4 ^ 5;
         if (var4.gv > var4.ay) {
            var4.lj.setForeground(Color.GREEN);
            var4.ax.setForeground(Color.GREEN);
            return;
         }
      } else {
         if (var4.gv <= var4.ay) {
            this.aej.f("不可以再减少点数了");
            return;
         }

         var4.gv = var4.gv - (2 ^ 3);
         var4.q();
         this.m += 2 ^ 3;
         if (var4.gv <= var4.ay) {
            var4.lj.setForeground(Color.WHITE);
            var4.ax.setForeground(Color.WHITE);
         }
      }

   }

   public void y(int var1) {
      if (var1 == (22999 & 10111)) {
         ((Class544)this.ve().e(123 & 110)).y(this.br);
         this.ve().a(127 & 106);
      } else if (var1 == (26591 & 6520)) {
         if (this.vd().getLoginResult().getResistance(this.br == --1 ? "X" : "D") == null) {
            this.aej.f("你还没加点怎么洗点");
         } else {
            this.aej.aal(new ConfirmBean(54 & 89, (55 & 79) + (this.br == (3 & 5) ? "X" : "D"), "#W确定要花50W银两重置#G" + (this.br == (3 & 5) ? "小成修炼" : "大成修炼") + "？"));
         }
      } else {
         if (var1 != (26073 & 7039) && var1 == (3035 & 30078)) {
            StringBuffer var2 = new StringBuffer();
            var2.append(103 & 31);
            var2.append(this.br == (3 & 5) ? "X" : "D");
            int var5 = 2 ^ 3;
            var1 = 3 & 4;
            int var4 = this.br == --1 ? (this.uw().n(1 ^ 3, --3) ? 91 & 46 : 13) : (this.uw().n(5 >> 1, --3) ? 14 & 127 : 18);

            for(int var10000 = var1; var10000 < var4; var10000 = var1) {
               <undefinedtype> var3;
               if ((var3 = (<undefinedtype>)this.yp.getComponent(var1)).gv != 0) {
                  if (var3.ay != var3.gv) {
                     var5 = 3 & 4;
                  }

                  if (var2.length() > (1 ^ 3)) {
                     var2.append("#");
                  }

                  var2.append(var3.as.getText());
                  var2.append("=");
                  var2.append(var3.nn());
               }

               ++var1;
            }

            if (var5 != 0) {
               this.aej.f("你还未修改");
               return;
            }

            String var6 = Agreement.getSendTextAES("rolechange", var2.toString());
            this.uw().d(var6);
         }

      }
   }
}
