package com.xy.a.q;

import com.xy.entity.TeamRole;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Class11 extends com.xy.q.Class30 {
   private int gv;
   private int gw;
   private StringBuffer jz;
   private com.xy.w.Class1 ka;
   private int gz;
   private com.xy.i.Class19 kb;
   private int aa;
   private String ao;
   private Image g;
   private int ae;
   private com.xy.i.Class19 kc;
   private List<Class25> iv;
   private long kd;

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      this.ka.j(com.xy.v.Class22.l(), 0);
      int var2 = 0;
      int var3 = this.iv.size();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         if (this.aa == 0) {
            if (Class25.ni(this.iv.get(var2)) != null) {
               this.ka.ab(var1, 67 + var2 % 5 * 96, 57 + var2 / 5 * 157);
            }
         } else if (Class25.nh(this.iv.get(var2)) == 1) {
            this.ka.ab(var1, 67 + var2 % 5 * 96, 57 + var2 / 5 * 157);
         }
      }
   }

   public void ha(String var1, int var2, int var3) {
      this.gw = var2;
      this.ao = var1;
      this.aa = var3;
      if (var3 != 0) {
         this.kd = com.xy.v.Class22.l();
      }
   }

   public void hb(List<TeamRole> var1, int var2) {
      int var8;
      label45: {
         int var3 = var2 * 5;
         if (var1 != null && var1.size() != 0) {
            int var4 = var1.size();
            int var5 = 0;
            int var6 = this.iv.size();

            for (int var10000 = var5; var10000 < var6; var10000 = ++var5) {
               if (var5 >= 5) {
                  var8 = var2;
                  break label45;
               }

               if (var5 < var4) {
                  TeamRole var7 = var1.get(var5);
                  if (var5 < 5) {
                     this.iv.get(var5 + var3).ng(var7, var2);
                  }
               } else {
                  this.iv.get(var5 + var3).ng(null, var2);
               }
            }
         }

         var8 = var2;
      }

      if (var8 == 1) {
         String var10003 = "偈诼斬";
         this.ha("倒计时", 30, 1);
         this.ae = var1 != null ? var1.size() : 0;
      } else {
         if (var2 == 0) {
            this.g(1);
            this.ha(null, 0, 0);
         }
      }
   }

   public Class11(GameView var1) {
      super(108, 2, com.xy.q.Class30.afz, var1);
      int var10000 = 0;
      String var10003 = ")>u?u\u000ekdks*3=";
      String var10007 = "@@\u001cN\\V@F\u001cWVB^bAF]BqBPH\u001dWPS";
      this.aa = 1;
      this.gz = 287;
      this.gv = 0;
      this.ae = 0;
      this.jz = new StringBuffer();
      this.ka = com.xy.w.Class11.f("sc/mouse/teamArenaBack.tcp", null);
      this.yy(-1, 0, 591, 406, com.xy.q.Class30.agf);
      this._do("sc/b/S191.png");
      this.iv = new ArrayList<>();

      for (int var2 = 0; var10000 < 10; var10000 = var2) {
         Class25 var3 = new Class25(this);
         var3.setBounds(50 + var2 % 5 * 96, 59 + var2 / 5 * 157, 93, 110);
         this.add(var3);
         var2++;
         this.iv.add(var3);
      }

      String var10008 = "@@\u001cF\u001c\u0014\u001dS]D";
      String var10013 = "卤鄗";
      this.kc = new com.xy.i.Class19("sc/e/7.png", 1, 63, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "匹配", this);
      var10007 = "@@\u001cF\u001c\u0014\u001dS]D";
      String var10012 = "抏纇";
      this.kb = new com.xy.i.Class19("sc/e/7.png", 1, 64, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "拒绝", this);
      this.kc.setBounds(82, 177, 59, 26);
      this.kb.setBounds(447, 177, 59, 26);
      this.add(this.kc);
      this.add(this.kb);
   }

   public void i(BigDecimal var1) {
      int var10000 = 0;
      this.gv++;

      for (int var2 = 0; var10000 < this.iv.size(); var10000 = ++var2) {
         Class25 var3;
         if (Class25.ni(var3 = this.iv.get(var2)) != null && Class25.ni(var3).compareTo(var1) == 0) {
            Class25.nf(var3, 1);
         }
      }

      if (this.gv == this.ae) {
         this.ha(null, 0, 1);
      }
   }

   public void e() {
      this.jz.setLength(0);
      this.jz.append(this.ao);
      String var10003 = "m`";
      this.jz.append("0:");
      Class11 var10000;
      if (this.gw > 9) {
         var10000 = this;
         this.jz.append(this.gw);
      } else {
         var10000 = this;
         this.jz.append("0");
         this.jz.append(this.gw);
      }

      if (var10000.gw > 0) {
         this.gw--;
      }
   }

   // $VF: synthetic method
   private void dn(Graphics var1) {
      var1.setColor(Color.white);
      var1.setFont(com.xy.q.Class49.aw);
      if (this.jz.length() != 0) {
         var1.drawString(this.jz.toString(), this.gz, 199);
      }

      if (com.xy.v.Class22.l() - this.kd >= 1000L) {
         Graphics var10000;
         if (this.ao == null) {
            var10000 = var1;
            this.h();
         } else {
            this.e();
            var10000 = var1;
         }

         int var2 = var10000.getFontMetrics().stringWidth(this.jz.toString());
         this.gz = 287 - var2 / 2;
         this.kd += 1000L;
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aa == 0) {
         if (this.g == null) {
            String var10001 = "PP\fQ\f`\u0012\n\u0011\u001dS]D";
            this.g = com.xy.w.Class16.c("sc/b/S192.png");
         }

         var1.drawImage(this.g, 258, 169, null);
      } else {
         this.dn(var1);
      }
   }

   public void g(int var1) {
      if (var1 == 0) {
         String var10004 = "拡绾";
         this.kb.setText("拒绝");
         String var10003 = "卤鄗";
         this.kc.setText("匹配");
         this.kb.setVisible(true);
         this.kc.setVisible(true);
      } else if (var1 == 1) {
         this.kb.setVisible(false);
         this.kc.setVisible(false);
      } else {
         if (var1 == 2) {
            this.kb.setVisible(true);
            String var10002 = "句涫";
            this.kb.setText("取消");
            this.kc.setVisible(false);
         }
      }
   }

   public void f() {
      int var10000 = this.gv = 0;
      this.jz.setLength(0);
      this.zc().f(this.lj());

      for (int var1 = 0; var10000 < this.iv.size(); var10000 = var1) {
         Class25 var2 = this.iv.get(var1);
         var1++;
         var2.ng(null, 0);
      }
   }

   public void h() {
      this.gw++;
      int var1 = this.gw / 60;
      int var2 = this.gw % 60;
      this.jz.setLength(0);
      Class11 var10000;
      if (var1 > 0) {
         var10000 = this;
         this.jz.append(var1);
      } else {
         var10000 = this;
         this.jz.append("0");
      }

      String var10001 = "\u0019";
      var10000.jz.append(":");
      if (var2 > 9) {
         this.jz.append(var2);
      } else {
         this.jz.append("0");
         this.jz.append(var2);
      }
   }
}
