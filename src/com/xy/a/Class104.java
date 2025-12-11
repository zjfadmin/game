package com.xy.a;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;

class Class104 extends JComponent implements MouseListener {
   private Long alz;
   private String aq;
   // $VF: synthetic field
   final Class61 ama;
   private Image hf;
   private int eg;
   private String mo;

   // $VF: synthetic method
   static Long afg(Class104 var0) {
      return var0.alz;
   }

   // $VF: synthetic method
   static String afh(Class104 var0) {
      return var0.aq;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Class61.vg(this.ama, -1);
      this.ama.zc().f(46);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public void afi(long var1, Goodstable var3) {
      this.alz = var1;
      this.hf = com.xy.w.Class15.d(var3.getSkin());
      this.mo = GoodType.z(var3.getType()) ? String.valueOf(var3.getUsetime()) : null;
   }

   public Class104(Class61 var1, int var2) {
      this.ama = var1;
      this.eg = var2;
      String var10005 = "*";
      this.aq = "F" + (var2 + 1);
      this.addMouseListener(this);
   }

   public void t() {
      this.hf =null;
      this.alz = null;
      this.mo = null;
   }

   public void afj(long var1, Skill var3) {
      this.alz = var1;
      int var4;
      Class104 var10000;
      if ((var4 = Integer.parseInt(var3.getSkillid())) > 12000 && var4 <= 13000) {
         var10000 = this;
         this.hf = com.xy.w.Class15.i(var4);
      } else {
         var10000 = this;
         this.hf = com.xy.w.Class15.h(var3.getSkillid());
      }

      var10000.mo = null;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Class61.vg(this.ama, this.eg);
      RoleData var2;
      long var3;
      if ((var3 = (var2 = this.ama.yx()).getShortCutSkill(this.eg)) > 2147483647L) {
         Goodstable var7;
         if ((var7 = var2.getGood(new BigDecimal(var3 - 2147483647L))) != null) {
            ((Class48)this.ama.zc().j(46)).hr(var7, false);
         }
      } else {
         Skill var5;
         if ((var5 = var2.getShortCutSkillById(var3)) != null) {
            int var6 = com.xy.v.Class4.g(var2.getLoginResult().getGrade());
            ((Class48)this.ama.zc().j(46))
               .qa(var5, var6, com.xy.v.Class4.s(var2.getLoginResult().getGrade()), com.xy.v.Class4.q(var2.getLoginResult().getGrade()));
         }
      }
   }

   // $VF: synthetic method
   static int afk(Class104 var0) {
      return var0.eg;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      RoleData var2 = this.ama.yx();
      com.xy.w.Class14 var3 = this.ama.afx.choseImg;
      if (this.ama.afx.choseImg.l == 2 || var3.l == 12) {
         Long var8;
         if ((var8 = var2.getShortCutSkillByIndex(var3.e.intValue())) != null) {
            var2.az(var8, this.eg);
            var2.al();
            var3.e();
         }
      } else if (var3.l != 1 && var3.l != 11) {
         long var7;
         if ((var7 = var2.getShortCutSkill(this.eg)) > 2147483647L) {
            Goodstable var6;
            if ((var6 = var2.getGood(new BigDecimal(var7 - 2147483647L))) == null) {
               return;
            }

            if (var1.getButton() == 1) {
               var2.az(var7, -1);
               var2.al();
               var3.h((byte)11, var6, var6.getUsetime());
               return;
            }

            if (var1.getButton() == 3) {
               this.ama.vh(this);
               return;
            }
         } else {
            Skill var9;
            if ((var9 = var2.getShortCutSkillById(var7)) == null) {
               return;
            }

            if (var1.getButton() == 1) {
               var2.az(var7, -1);
               var2.al();
               var3.c((byte)12, var9, 0);
               return;
            }

            if (var1.getButton() == 3) {
               this.ama.vh(this);
            }
         }
      } else {
         Goodstable var4;
         if ((var4 = var2.getGood(var3.e)) != null) {
            if (var4.getType() != 0L && var4.getType() != 1L) {
               GameView var10000 = this.ama.ze();
               String var10001 = "诧籩牫哓既泇攼具忩捥栍";
               var10000._do("该类物品无法放入快捷栏");
            } else {
               Long var5;
               if ((var5 = var2.getShortCutGoodByIndex(var3.e)) != null) {
                  var2.az(var5, this.eg);
                  var2.al();
                  var3.e();
               }
            }
         }
      }
   }

   // $VF: synthetic method
   static Image afl(Class104 var0) {
      return var0.hf;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
