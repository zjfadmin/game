package com.xy.a.q;

import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Buff;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class81 extends com.xy.q.Class30 {
   private Class69 ald;
   private com.xy.w.Class18[] bb;
   private JLabel sy;
   private RichLabel ed;
   private JScrollPane is;
   private List<Class54> tr;
   private Class107[] ale;
   private JComponent cr;
   private int eg;
   private static com.xy.w.Class9 rm;

   public void adi(Class107 var1, int var2) {
      if (Class107.amw(var1)[0].il() == 21) {
         if (this.ald == null) {
            this.ald = new Class69(this);
            this.add(this.ald, 0);
         }

         Class69.aan(this.ald, Class107.amw(var1)[0].ee());
         Class69.aak(this.ald, var2);
         Map var3 = this.yt().cc().getBuffMap();
         int var4 = 0;
         Iterator var6;
         Iterator var10000 = var6 = var3.values().iterator();

         int var9;
         while (true) {
            if (!var10000.hasNext()) {
               var9 = var4;
               break;
            }

            Buff var5;
            if ((var5 = (Buff)var6.next()).getbType() != 2) {
               var10000 = var6;
            } else {
               Class69.aao(this.ald)[var4++].ade(var5);
               if (var4 == 25) {
                  var9 = var4;
                  break;
               }

               var10000 = var6;
            }
         }

         int var7 = var9;

         for (int var10 = var7; var10 < Class69.aao(this.ald).length; var10 = var7) {
            Class69.aao(this.ald)[var7++].ade(null);
         }

         Class69.aal(this.ald)[1].setText(String.valueOf(Class107.amv(var1) + 1));
         this.ald.setVisible(true);
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class9 acz() {
      return rm;
   }

   // $VF: synthetic method
   static void mt(com.xy.w.Class9 var0) {
      rm = var0;
   }

   // $VF: synthetic method
   static int adj(Class81 var0) {
      return var0.eg;
   }

   public void adk(Class54 var1, boolean var2) {
      RoleData var3;
      RolePet var4;
      if ((var4 = (var3 = this.yx()).getRolePet(Class54.wr(var1).ee())) != null) {
         RoleData var10000;
         if (var2) {
            if (var4.getBb() > 0) {
               return;
            }

            int var5;
            if ((var5 = var3.getBBRolePet()) == 0) {
               return;
            }

            var4.c(var5);
            var10000 = var3;
         } else {
            if (var4.getBb() == 0) {
               return;
            }

            var4.c(0);
            var10000 = var3;
         }

         var10000.bl();
         this.g(this.eg);
         Class19 var6;
         if ((var6 = (Class19)this.zc().l(135)) != null) {
            var6.f();
         }
      }
   }

   public void adl(RolePet var1, int var2) {
      Class54 var3 = var2 < this.tr.size() ? this.tr.get(var2) : null;
      if (var3 == null) {
         var3 = new Class54(this);
         this.cr.add(var3);
         this.tr.add(var3);
      }

      var3.lc(var1);
      var3.setBounds(0, 45 * var2, 320, 45);
      var3.setVisible(true);
   }

   public Class81(GameView var1) {
      super(136, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "\u001a;F<FiG(\u0007?";
      this.yy(-1, 0, 592, 437, com.xy.q.Class30.agh);
      com.xy.w.Class9 var11 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10009 = "讨罩叔戟";
      this.yu(var11, "设置参战");
      this.sy = com.xy.q.Class1.f(214, 29, 340, 21, 0, Color.white, com.xy.q.Class49.ch);
      String var10005 = "详缇厚扱厴啍儥";
      this.sy.setText("设置参战召唤兽");
      this.add(this.sy);
      this.ed = new RichLabel("", com.xy.q.Class49.n);
      String var10007 = "5dPA&7&7巰锩5d&7&7&7炯凼凬圽：$uAP7&7&叴锸$u7&7&7&炾凭发涞函圬＜叹逎'中叺唣八佛丬攨揢不阣々";
      this.ed.setTextSize("#cFF0000左键#c000000点击出场，#cFF0000右键#c000000点击取消出场；可选1个召唤兽作为支援上阵。", 500);
      this.ed.setBounds(50, 386, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      this.ale = new Class107[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ale.length; var10000 = var2) {
         this.ale[var2] = new Class107(this, var2);
         this.ale[var2].setBounds(56, 42 + 85 * var2, 145, 76);
         this.add(this.ale[var2++]);
      }

      this.tr = new ArrayList<>();
      this.cr = new Class65(this);
      this.is = com.xy.q.Class1.g(215, 49, 338, 335, this.cr, -1);
      this.add(this.is);
      this.bb = new com.xy.w.Class18[3];

      for (int var4 = var2 = 0; var4 < this.bb.length; var4 = var2) {
         this.bb[var2] = new com.xy.w.Class18();
         Class81 var5;
         if (var2 == 0) {
            var5 = this;
            com.xy.w.Class18 var6 = this.bb[var2];
            String var10003 = "+\nw\rwZnG(\u0007?";
            var6.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.bb[var2].setBounds(47, 29, 166, 356);
         } else if (var2 == 1) {
            var5 = this;
            com.xy.w.Class18 var7 = this.bb[var2];
            String var10 = "tu(r($28wx`";
            var7.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.bb[var2].setBounds(214, 29, 340, 21);
         } else {
            if (var2 == 2) {
               com.xy.w.Class18 var10001 = this.bb[var2];
               String var8 = "+\nw\rw[lG(\u0007?";
               var10001.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.bb[var2].setBounds(214, 29, 340, 356);
            }

            var5 = this;
         }

         var5.add(this.bb[var2++]);
      }
   }

   public void g(int var1) {
      this.eg = var1;
      RoleData var2;
      List var3 = (var2 = this.yx()).pets;
      int var4 = 0;

      int var5;
      for (int var10000 = var5 = 0; var10000 < this.ale.length; var10000 = ++var5) {
         RolePet var6 = var2.getBBRolePet(var5 + 1);
         this.ale[var5].lc(var6);
         if (var6 != null) {
            this.adl(var6, var4++);
         }
      }

      for (int var11 = var5 = 0; var11 < var3.size(); var11 = ++var5) {
         RolePet var9;
         if ((var9 = (RolePet)var3.get(var5)).getBb() == 0) {
            this.adl(var9, var4++);
         }
      }

      for (int var12 = var5 = var4; var12 < this.tr.size(); var12 = var5) {
         Class54 var10 = this.tr.get(var5);
         var5++;
         var10.lc(null);
         var10.setVisible(false);
      }

      this.cr.setPreferredSize(new Dimension(340, 45 * var4));
      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   // $VF: synthetic method
   static Class69 adm(Class81 var0) {
      return var0.ald;
   }
}
