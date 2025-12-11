package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.readbean.Skill;
import com.xy.readbean.TYC;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class23 extends com.xy.w.Class18 implements MouseListener {
   private int aa;
   private boolean _do;
   private Skill ul;
   private int cb;
   private int ae;
   private TYC um;
   private int eg;
   // $VF: synthetic field
   final Class42 un;

   // $VF: synthetic method
   static int on(Class23 var0) {
      return var0.aa;
   }

   public void n(int var1) {
      this.aa = this.ae = var1;
      this._do = true;
      this.h();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.un.zc().f(46);
   }

   public void f() {
      this.aa = this.ae = 0;
      this._do = false;
      this.h();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   // $VF: synthetic method
   static int oo(Class23 var0) {
      return var0.eg;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this._do) {
         int var2;
         if ((var2 = this.ae + (var1.isMetaDown() ? -1 : 1)) <= 0 || !Class42.aef(this.un).getText().equals("0")) {
            if (var2 >= this.aa) {
               if (var2 <= this.cb) {
                  this.ae = var2;
                  this.h();
                  this.un.e();
               }
            }
         }
      }
   }

   public void be(boolean var1) {
      this._do = var1;
      this.h();
   }

   public Class23(Class42 var1, TYC var2) {
      this.un = var1;
      this.eg = var2.getV2();
      this.um = var2;
      this.ul = var1.yt().ac(String.valueOf(this.eg));
      this._do = false;
      this.aa = this.ae = 0;
      this.cb = 1;
      this.addMouseListener(this);
   }

   // $VF: synthetic method
   static TYC op(Class23 var0) {
      return var0.um;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public void h() {
      if (this.ae > 0) {
         String var1 = "ty(y(+1+";
         this.dp("sc/c/161");
      } else if (this._do) {
         String var10001 = "\u000ewRwR%K&";
         this.dp("sc/c/162");
      } else {
         this.l();
      }
   }

   // $VF: synthetic method
   static int oq(Class23 var0) {
      return var0.ae;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      RoleSummoning var2;
      if ((var2 = this.un.jm()) != null) {
         String var3 = Class9.gc(var2, this.um.getV2(), 1, this.ul, this.un.za());
         ((com.xy.a.Class48)this.un.zc().j(46)).es(this.ul.getSkillname(), var3);
      }
   }
}
