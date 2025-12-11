package com.xy.a.a;

import com.xy.entity.Mount;
import com.xy.entity.MountSkill;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.PropertyUtil;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Class1 extends com.xy.q.Class30 {
   private JList<String> m;
   private RichLabel h;
   private DefaultListModel<String> n;
   private com.xy.w.Class18[] j;
   private JLabel[] o;
   private com.xy.q.Class14 p;

   public void b(Mount var1) {
      this.n.removeAllElements();
      this.p.setText(var1 != null ? var1.getProficiency().toString() : null);
      if (this.za().gameMount) {
         String var7 = null;
         String var10001 = ",]";
         String var8;
         if (!com.xy.v.Class12.h(var8 = var1.getDataValue("JN"))) {
            int var4 = 0;
            int var5;
            int var10 = var5 = 0;

            while (var10 < var8.length()) {
               var10001 = "W";
               if ((var5 = var8.indexOf("#", var4 + 1)) == -1) {
                  var5 = var8.length();
               }

               String var6 = var8.substring(var4, var5);
               this.n.addElement(var6);
               if (com.xy.v.Class12.h(var7)) {
                  var7 = var6;
               }

               var4 = var5 + 1;
               var10 = var5;
            }
         }

         this.m(var1, var7);
      } else if (var1 != null && var1.getMountskill() != null && var1.getMountskill().size() != 0) {
         int var2;
         for (int var10000 = var2 = 0; var10000 < var1.getMountskill().size(); var10000 = var2) {
            MountSkill var3 = var1.getMountskill().get(var2);
            var2++;
            this.n.addElement(var3.getSkillname());
         }

         if (var1.getMountskill().size() != 0) {
            this.m(var1, var1.getMountskill().get(0).getSkillname());
         }
      } else {
         this.m(var1, null);
      }
   }

   // $VF: synthetic method
   static JList k(Class1 var0) {
      return var0.m;
   }

   @Override
   public void l() {
      Mount var2;
      if ((var2 = this.yx().getChoseMount()) != null) {
         this.b(var2);
         super.l();
      }
   }

   public void m(Mount var1, String var2) {
      if (var1 != null && !com.xy.v.Class12.h(var2)) {
         if (this.za().gameMount) {
            BaseMountSkill var9;
            if ((var9 = PropertyUtil.getBaseMountSkill(var2)) == null) {
               this.h.setTextSize(null, 235);
            } else {
               this.h.setTextSize(var9.getText(var1), 235);
            }
         } else {
            String var10000 = PropertyUtil.f(var1, var2);
            String var10001 = ":o";
            String[] var3 = var10000.split("\\|");
            StringBuffer var4 = new StringBuffer();

            int var5;
            for (int var10 = var5 = 0; var10 < var3.length; var10 = ++var5) {
               if (var4.length() != 0) {
                  var10001 = "\u0019\u0006";
                  var4.append("#r");
               }

               var10000 = var3[var5];
               var10001 = ".";
               int var6;
               if ((var6 = var10000.indexOf("=")) != -1) {
                  String var7 = var3[var5].substring(0, var6);
                  String var8 = var3[var5].substring(var6 + 1);
                  var10001 = "拱业属虸";
                  var4.append(var7);
                  String var10004 = "\u001a_";
                  var4.append(" +");
                  if (var7.equals("抗三尸虫")) {
                     var4.append(Integer.parseInt(var8));
                  } else {
                     var4.append((int)(Float.parseFloat(var8) * 100.0F));
                     String var10002 = "Q";
                     var4.append("%");
                  }
               }
            }

            this.h.setTextSize(var4.toString(), 235);
         }
      } else {
         this.h.setTextSize(null, 235);
      }
   }

   public Class1(GameView var1) {
      super(20, 2, com.xy.q.Class30.afz, var1);
      this.yy(-3, 0, 322, 330, com.xy.q.Class30.agh);
      com.xy.w.Class9 var15 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      this.yu(var15, "坐骑技能");
      this.n = new DefaultListModel<>();
      this.m = new JList<>();
      this.m.setOpaque(false);
      this.m.setSelectionBackground(new Color(33, 42, 52));
      this.m.setSelectionForeground(Color.GREEN);
      this.m.setForeground(Color.GREEN);
      this.m.setFont(com.xy.q.Class49.y);
      this.m.setBackground(com.xy.q.Class49.bk);
      this.m.setModel(this.n);
      this.m.addListSelectionListener(new Class46(this));
      this.m.setBounds(49, 52, 247, 70);
      this.add(this.m);
      this.h = new RichLabel("", com.xy.q.Class49.ac);
      this.h.setBounds(49, 124, 235, 183);
      this.add(this.h);
      this.o = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = ++var2) {
         String var10008 = "Ep U U U";
         this.o[var2] = com.xy.q.Class1.f(47, 32, 250, 21, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
         JLabel var4 = this.o[var2];
         String var7;
         if (var2 == 0) {
            var7 = "坪髥抺肉";
            var7 = "坐骑技能";
         } else if (var2 == 1) {
            var7 = "熌纥庵";
            var7 = "熟练度";
         } else {
            var7 = "";
         }

         var4.setText(var7);
         this.add(this.o[var2]);
         if (var2 == 1) {
            this.o[var2].setBounds(47, 290, 57, 19);
            JLabel var5 = this.o[var2];
            var7 = "\u0019\u0017\nD\nD\nD";
            var5.setForeground(com.xy.q.Class49.c("#c000000"));
         }
      }

      this.p = com.xy.q.Class1.i(112, 290, 184, 19, 10, Color.white, com.xy.q.Class49.w);
      String var10005 = "`\u0005<\u0002<W$Hc\bt";
      this.p.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.p);
      this.j = new com.xy.w.Class18[5];

      for (int var6 = var2 = 0; var6 < this.j.length; var6 = ++var2) {
         this.j[var2] = new com.xy.w.Class18();
         this.add(this.j[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var10 = this.j[var2];
            String var10002 = "\u0007Y[^[\bA\u0014\u0004T\u0013";
            var10.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(47, 32, 250, 21);
         } else if (var2 == 1) {
            com.xy.w.Class18 var11 = this.j[var2];
            String var13 = "`\u0005<\u0002<T'Hc\bt";
            var11.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(47, 32, 250, 90);
         } else if (var2 == 2) {
            com.xy.w.Class18 var12 = this.j[var2];
            String var14 = "\u0007Y[^[\b@\u0014\u0004T\u0013";
            var12.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(47, 122, 250, 160);
         }
      }
   }
}
