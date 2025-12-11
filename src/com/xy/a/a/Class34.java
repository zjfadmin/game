package com.xy.a.a;

import com.xy.entity.Mount;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.PropertyUtil;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class34 extends com.xy.q.Class30 {
   private RichLabel[] aje;
   private JScrollPane ps;
   private int sc;
   private int gs;
   private BigDecimal ajf;
   private DefaultListModel<String> pk;
   private com.xy.i.Class4[] ajg;
   private JLabel[] ew;
   private int ia;
   private com.xy.w.Class18[] zv;
   private com.xy.q.Class44 ajh;
   private JScrollPane wy;
   private int aa;
   private DefaultListModel<String> aji;
   private int ha;
   private JList<String> pq;
   private com.xy.q.Class14[] s;
   private JList<String> ro;
   private int eg;
   private int ah;

   // $VF: synthetic method
   static JList acc(Class34 var0) {
      return var0.pq;
   }

   public void acd(Mount var1) {
      this.ajf = var1.getMid();
      this.gs = var1.getMountid();
      this.s[0].setText(var1.getMountname());
      this.b(var1);
      this.aa = 4;
      this.s[1].setText(String.valueOf(this.aa));
      this.s[2].setText(String.valueOf(this.aa == 1 ? 2 : (this.aa == 2 ? 6 : (this.aa == 3 ? 12 : 20))));
      this.ajh.td().removeAllElements();
      if (var1.getMountid() == 1) {
         this.ajh.dq("加根骨，减力量");
         this.ajh.dq("加灵性，减力量");
      } else if (var1.getMountid() == 2) {
         this.ajh.dq("加力量，减根骨");
      } else if (var1.getMountid() == 3) {
         this.ajh.dq("加根骨，减灵性");
         this.ajh.dq("加力量，减灵性");
      } else if (var1.getMountid() == 4) {
         this.ajh.dq("加根骨，减力量");
      } else {
         if (var1.getMountid() == 5) {
            this.ajh.dq("加力量，减根骨");
            this.ajh.dq("加灵性，减根骨");
         }
      }

      this.zc().b(this.lj());
   }

   public void cp(int var1, String var2) {
      RichLabel var3 = var1 == 0 ? this.aje[6] : this.aje[7];
      if (com.xy.v.Class12.h(var2)) {
         var2 = this.pk.getElementAt(0);
      }

      BaseMountSkill var4;
      if ((var4 = PropertyUtil.getBaseMountSkill(var2)) == null) {
         var3.setTextSize(null, 205);
      } else {
         int var5 = this.ia;
         int var6 = this.ah;
         int var7 = this.ha;
         int var8 = var1 == 0 ? this.sc : this.eg;
         int var9;
         int var10;
         if ((var9 = var8 >> 6) > 0) {
            for (int var10000 = var10 = 0; var10000 < 3; var10000 = ++var10) {
               if ((var8 >> 2 * var10 & 1) != 0) {
                  boolean var11 = (var8 >> 2 * var10 + 1 & 1) == 1;
                  if (var10 == 0) {
                     var5 += var11 ? var9 : -var9;
                  } else if (var10 == 1) {
                     var6 += var11 ? var9 : -var9;
                  } else if (var10 == 2) {
                     var7 += var11 ? var9 : -var9;
                  }
               }
            }
         }

         String var13 = var4.getText(var5, var6, var7, 100000, this.gs);
         String var10001 = "IUぺ熸纩庁ほ\u0016Z\u0017Z\u0017Z\b[\u0017Z\u0017Z\u0017";
         String var12 = var13.replace("#r【熟练度】100000/100000", "");
         var3.setTextSize(var12, 205);
      }
   }

   public void h() {
      int var1 = this.eg >> 6;
      StringBuffer var2 = new StringBuffer();

      int var3;
      for (int var10000 = var3 = 0; var10000 < 3; var10000 = var3) {
         String var10003 = "Ip";
         var2.setLength(0);
         var2.append("#W");
         var2.append(var3 == 0 ? this.ia : (var3 == 1 ? this.ah : this.ha));
         if (var1 > 0 && (this.eg >> 2 * var3 & 1) != 0) {
            boolean var4 = (this.eg >> 2 * var3 + 1 & 1) == 1;
            var10003 = "L1";
            var2.append("#R");
            String var6;
            if (var4) {
               var6 = "\f";
               var6 = "+";
            } else {
               var6 = "N";
               var6 = "-";
            }

            var2.append(var6);
            var2.append(var1);
         }

         this.aje[var3 + 3].setTextSize(var2.toString(), 150);
         RichLabel var5 = this.aje[var3 + 3];
         int var8 = this.aje[var3 + 3].getX();
         int var10002 = this.aje[var3 + 3].getY();
         var3++;
         var5.setBounds(var8, var10002, 155, 19);
      }

      this.cp(1, this.ro.getSelectedValue());
   }

   // $VF: synthetic method
   static JList ace(Class34 var0) {
      return var0.ro;
   }

   public void g(int var1) {
      if (var1 == 151) {
         if (this.sc == 0) {
            GameView var14 = this.ze();
            var14._do("坐骑没有重塑方案");
         } else {
            StringBuilder var19 = new StringBuilder("CZ|").append(this.ajf);
            String var7 = Agreement.getSendTextAES("usermount", var19.append("|0").toString());
            this.za().k(var7);
         }
      } else if (var1 != 152 && var1 != 153) {
         if (var1 != 154 && var1 == 155) {
            int var6 = this.aa == 1 ? 2 : (this.aa == 2 ? 6 : (this.aa == 3 ? 12 : 20));
            Goodstable var9;
            if ((var9 = this.yx().au(721L)) == null || var9.getUsetime() < var6) {
               GameView var13 = this.ze();
               var13._do(new StringBuilder("物品数量不足").append(var6).append("个").toString());
               return;
            }

            StringBuilder var16 = new StringBuilder("CZ|").append(this.ajf);
            String var4 = Agreement.getSendTextAES("usermount", var16.append("|").append(this.eg).append("|").append(var9.getRgid()).toString());
            this.za().k(var4);
         }
      } else {
         Class34 var10000;
         if (var1 == 152) {
            if (this.aa <= 1) {
               this.ze()._do("重塑等级最低为1");
               return;
            }

            var10000 = this;
            this.aa--;
         } else {
            if (this.aa >= 4) {
               this.ze()._do("重塑等级最高为4");
               return;
            }

            var10000 = this;
            this.aa++;
         }

         var10000.s[1].setText(String.valueOf(this.aa));
         this.s[2].setText(String.valueOf(this.aa == 1 ? 2 : (this.aa == 2 ? 6 : (this.aa == 3 ? 12 : 20))));
         int var2 = this.eg & 63;
         int var3 = 0;
         int var11;
         if (this.gs != 2 && this.gs != 4) {
            var3 = this.aa == 1 ? 15 : (this.aa == 2 ? 30 : (this.aa == 3 ? 40 : 50));
            var11 = var2;
         } else {
            var3 = this.aa == 1 ? 2 : (this.aa == 2 ? 4 : (this.aa == 3 ? 6 : 8));
            var11 = var2;
         }

         var2 = var11 | var3 << 6;
         this.eg = var2;
         this.h();
      }
   }

   public Class34(GameView var1) {
      super(171, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 542, 514, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "坐骑重塑");
      this.ajh = new com.xy.q.Class44(0, 100, this);
      this.ajh.rm(true);
      this.ajh.zb(336, 28, 165, 20);
      this.add(this.ajh);
      this.ajg = new com.xy.i.Class4[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ajg.length; var10000 = var2) {
         Class34 var11;
         if (var2 == 0) {
            var11 = this;
            this.ajg[var2] = new com.xy.i.Class4("sc/e/6.png", 1, 151 + var2, com.xy.q.Class49.bz, null, "恢复", this);
            this.ajg[var2].setBounds(216, 29, 34, 18);
         } else if (var2 == 1) {
            var11 = this;
            this.ajg[var2] = new com.xy.i.Class4("sc/e/32.png", 1, 151 + var2, this);
            this.ajg[var2].setBounds(224, 57, 11, 15);
         } else if (var2 == 2) {
            var11 = this;
            this.ajg[var2] = new com.xy.i.Class4("sc/e/34.png", 1, 151 + var2, this);
            this.ajg[var2].setBounds(235, 57, 11, 15);
         } else if (var2 == 3) {
            var11 = this;
            this.ajg[var2] = new com.xy.i.Class4("sc/e/40.png", 1, 151 + var2, com.xy.q.Class49.bz, null, "？", this);
            this.ajg[var2].setBounds(502, 56, 18, 18);
         } else {
            if (var2 == 4) {
               this.ajg[var2] = new com.xy.i.Class4("sc/e/7.png", 1, 151 + var2, com.xy.q.Class49.ch, null, "确认", this);
               this.ajg[var2].setBounds(254, 472, 59, 25);
               this.ajg[var2].setForeground(Color.black);
            }

            var11 = this;
         }

         var11.add(this.ajg[var2++]);
      }

      this.ew = new JLabel[14];

      for (int var12 = var2 = 0; var12 < this.ew.length; var12 = var2) {
         this.ew[var2] = com.xy.q.Class1.k(46 + 215 * (var2 % 2), 28 + 28 * (var2 / 2), 120, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var13 = this.ew[var2];
         String var33;
         if (var2 == 0) {
            var33 = "待重塑坐骑";
         } else if (var2 == 1) {
            var33 = "重塑方向";
         } else if (var2 == 2) {
            var33 = "重塑等级";
         } else if (var2 == 3) {
            var33 = "需要筋骨提气丸";
         } else if (var2 == 4 || var2 == 5) {
            var33 = "灵性";
         } else if (var2 == 6 || var2 == 7) {
            var33 = "力量";
         } else if (var2 == 8 || var2 == 9) {
            var33 = "根骨";
         } else if (var2 == 10 || var2 == 11) {
            var33 = "技能预览";
         } else if (var2 == 12) {
            var33 = "重塑前坐骑";
         } else if (var2 == 13) {
            var33 = "重塑后坐骑";
         } else {
            var33 = "";
         }

         this.ew[var2].setText(var33);
         this.ew[var2].setHorizontalAlignment(10);
         Class34 var14;
         if (var2 >= 4 && var2 <= 9) {
            var14 = this;
            this.ew[var2].setBounds(59 + 242 * ((var2 - 4) % 2), 129 + 25 * ((var2 - 4) / 2), 36, 19);
         } else if (var2 >= 10 && var2 <= 11) {
            var14 = this;
            this.ew[var2].setForeground(Color.white);
            this.ew[var2].setHorizontalAlignment(0);
            this.ew[var2].setBounds(56 + 242 * (var2 - 10), 203, 211, 21);
         } else {
            label306: {
               if (var2 >= 12 && var2 <= 13) {
                  this.ew[var2].setFont(com.xy.q.Class49.by);
                  this.ew[var2].setBounds(70 + (var2 - 12) * 242, 95, 100, 23);
                  if (var2 == 12) {
                     var14 = this;
                     this.ew[var2].setForeground(Color.white);
                     break label306;
                  }

                  if (var2 == 13) {
                     this.ew[var2].setForeground(Color.green);
                  }
               }

               var14 = this;
            }
         }

         var14.add(this.ew[var2++]);
      }

      this.aje = new RichLabel[8];

      for (int var15 = var2 = 0; var15 < this.aje.length; var15 = var2) {
         this.aje[var2] = new RichLabel("", var2 != 6 && var2 != 7 ? com.xy.q.Class49.w : com.xy.q.Class49.ac);
         Class34 var16;
         if (var2 >= 0 && var2 <= 2) {
            var16 = this;
            this.aje[var2].setBounds(101, 126 + 25 * var2, 155, 19);
         } else if (var2 >= 3 && var2 <= 5) {
            var16 = this;
            this.aje[var2].setBounds(343, 126 + 25 * (var2 - 3), 155, 19);
         } else if (var2 == 6) {
            var16 = this;
            this.aje[var2].setBounds(60, 323, this.aje[var2].getWidth(), this.aje[var2].getHeight());
         } else {
            if (var2 == 7) {
               this.aje[var2].setBounds(301, 323, this.aje[var2].getWidth(), this.aje[var2].getHeight());
            }

            var16 = this;
         }

         var16.add(this.aje[var2++]);
      }

      this.s = new com.xy.q.Class14[9];

      for (int var17 = var2 = 0; var17 < this.s.length; var17 = var2) {
         this.s[var2] = com.xy.q.Class1.i(136, 28, 114, 19, 10, Color.white, com.xy.q.Class49.w);
         Class34 var18;
         if (var2 == 1) {
            var18 = this;
            this.s[var2].setBounds(136, 55, 112, 19);
         } else if (var2 == 2) {
            var18 = this;
            this.s[var2].setBounds(385, 55, 114, 19);
         } else if (var2 >= 3 && var2 <= 5) {
            var18 = this;
            this.s[var2].setBounds(99, 129 + 25 * (var2 - 3), 155, 19);
         } else {
            if (var2 >= 6 && var2 <= 8) {
               this.s[var2].setBounds(341, 129 + 25 * (var2 - 6), 155, 19);
            }

            var18 = this;
         }

         com.xy.q.Class14 var19 = var18.s[var2];
         String var43 = "\u0010\fL\u000bL^TA\u0013\u0001\u0004";
         var19.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.s[var2++]);
      }

      int var20 = 0;
      this.pk = new DefaultListModel<>();
      this.aji = new DefaultListModel<>();
      this.pq = new JList<>();
      this.ro = new JList<>();

      for (int var7 = 0; var20 < 2; var20 = ++var7) {
         JList var3 = var7 == 0 ? this.pq : this.ro;
         var3.setOpaque(false);
         var3.setSelectionBackground(new Color(33, 42, 52));
         var3.setSelectionForeground(Color.GREEN);
         var3.setForeground(Color.GREEN);
         var3.setFont(com.xy.q.Class49.w);
         var3.setBackground(com.xy.q.Class49.bk);
         var3.setModel(var7 == 0 ? this.pk : this.aji);
      }

      var20 = 0;
      this.pq.addListSelectionListener(new Class29(this));
      this.ro.addListSelectionListener(new Class26(this));

      for (int var8 = 0; var20 < 9; var20 = var8) {
         String var10;
         if (var8 == 0) {
            var10 = "夺命追魂";
         } else if (var8 == 1) {
            var10 = "破釜沉舟";
         } else if (var8 == 2) {
            var10 = "后发制人";
         } else if (var8 == 3) {
            var10 = "天雷怒火";
         } else if (var8 == 4) {
            var10 = "兴风作浪";
         } else if (var8 == 5) {
            var10 = "万劫不复";
         } else if (var8 == 6) {
            var10 = "金身不坏";
         } else if (var8 == 7) {
            var10 = "天神护体";
         } else {
            var10 = "心如止水";
         }
         this.pk.addElement(var10);
         var8++;
         this.aji.addElement(var10);
      }

      this.ps = com.xy.q.Class1.g(57, 224, 210, 96, this.pq, -1);
      this.wy = com.xy.q.Class1.g(298, 224, 210, 96, this.ro, -1);
      this.add(this.ps);
      this.add(this.wy);
      this.zv = new com.xy.w.Class18[10];

      for (int var32 = var2 = 0; var32 < this.zv.length; var32 = ++var2) {
         this.zv[var2] = new com.xy.w.Class18();
         this.add(this.zv[var2]);
         if (var2 >= 0 && var2 <= 1) {
            com.xy.w.Class18 var48 = this.zv[var2];
            String var56 = "\u0010\fL\u000bL\\WA\u0013\u0001\u0004";
            var48.dp("sc/d/34.png");
            this.zv[var2].setBounds(49 + 242 * var2, 95, 205, 23);
         } else if (var2 >= 2 && var2 <= 3) {
            com.xy.w.Class18 var47 = this.zv[var2];
            String var55 = "T\t\b\u000e\bX\u0012DW\u0004@";
            var47.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.zv[var2].setBounds(56 + 241 * (var2 - 2), 203, 211, 21);
         } else if (var2 >= 4 && var2 <= 5) {
            com.xy.w.Class18 var46 = this.zv[var2];
            String var54 = "\u0010\fL\u000bL]WA\u0013\u0001\u0004";
            var46.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.zv[var2].setBounds(56 + 241 * (var2 - 4), 203, 211, 120);
         } else if (var2 >= 6 && var2 <= 7) {
            com.xy.w.Class18 var45 = this.zv[var2];
            String var53 = "T\t\b\u000e\bX\u0013DW\u0004@";
            var45.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.zv[var2].setBounds(56 + 241 * (var2 - 6), 322, 211, 130);
         } else if (var2 >= 8 && var2 <= 9) {
            com.xy.w.Class18 var44 = this.zv[var2];
            String var52 = "\u0010\fL\u000bL\\UA\u0013\u0001\u0004";
            var44.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.zv[var2].setBounds(47 + 241 * (var2 - 8), 83, 231, 380);
         }
      }
   }

   public void ci(String var1) {
      int var2 = 0;
      if (var1.equals("加根骨，减力量")) {
         var2 = 52;
      } else if (var1.equals("加灵性，减力量")) {
         var2 = 7;
      } else if (var1.equals("加力量，减根骨")) {
         var2 = 28;
      } else if (var1.equals("加根骨，减灵性")) {
         var2 = 49;
      } else if (var1.equals("加力量，减灵性")) {
         var2 = 13;
      } else if (var1.equals("加灵性，减根骨")) {
         var2 = 19;
      }

      int var3 = 0;
      byte var10000;
      if (this.gs != 2 && this.gs != 4) {
         var3 = this.aa == 1 ? 15 : (this.aa == 2 ? 30 : (this.aa == 3 ? 40 : 50));
         var10000 = (byte)var2;
      } else {
         var3 = this.aa == 1 ? 2 : (this.aa == 2 ? 4 : (this.aa == 3 ? 6 : 8));
         var10000 = (byte)var2;
      }

      var2 = var10000 | var3 << 6;
      this.eg = var2;
      this.h();
   }

   public void b(Mount var1) {
      if (this.gs == var1.getMountid()) {
         this.gs = var1.getMountid();
         int var2;
         if ((var2 = var1.getMountlvl()) > 100) {
            var2 -= 100;
         }

         this.ia = (int)Math.floor(var1.getSpri().intValue() + var2 / 10.0F * var1.getSpri().intValue() / 2.0F);
         this.ah = (int)Math.floor(var1.getPower().intValue() + var2 / 10.0F * var1.getPower().intValue() / 2.0F);
         this.ha = (int)Math.floor(var1.getBone().intValue() + var2 / 10.0F * var1.getBone().intValue() / 2.0F);
         this.sc = var1.getMountCZ();
         int var3 = this.sc >> 6;
         StringBuffer var4 = new StringBuffer();

         int var5;
         for (int var10000 = var5 = 0; var10000 < 3; var10000 = var5) {
            String var10003 = "Ip";
            var4.setLength(0);
            var4.append("#W");
            var4.append(var5 == 0 ? this.ia : (var5 == 1 ? this.ah : this.ha));
            if (var3 > 0 && (this.sc >> 2 * var5 & 1) != 0) {
               boolean var6 = (this.sc >> 2 * var5 + 1 & 1) == 1;
               var10003 = "L1";
               var4.append("#R");
               String var8;
               if (var6) {
                  var8 = "\f";
                  var8 = "+";
               } else {
                  var8 = "N";
                  var8 = "-";
               }

               var4.append(var8);
               var4.append(var3);
            }

            this.aje[var5].setTextSize(var4.toString(), 150);
            RichLabel var7 = this.aje[var5];
            int var10 = this.aje[var5].getX();
            int var10002 = this.aje[var5].getY();
            var5++;
            var7.setBounds(var10, var10002, 155, 19);
         }

         this.cp(0, this.pq.getSelectedValue());
      }
   }
}
