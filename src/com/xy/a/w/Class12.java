package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseMeridians;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.text.GameView;

public class Class12 extends com.xy.q.Class30 {
   private com.xy.i.Class20 qj;
   private com.xy.w.Class9 qk;
   private Class5[] ql;

   public Class12(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 602, 425, com.xy.q.Class30.agf);
      this.ql = new Class5[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ql.length; var10000 = var2) {
         this.ql[var2] = new Class5(this, var2);
         Class5 var10003 = this.ql[var2];
         String var10004 = "yd%c%6=)zim";
         var10003.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         this.ql[var2].setBounds(48 + var2 * 176, 63, 170, 300);
         this.add(this.ql[var2++]);
      }

      String var10007 = "1KmMm\u001elX,O";
      String var10012 = "释罤";
      this.qj = new com.xy.i.Class20("sc/e/6.png", 1, 91, Class49.bz, null, "重置", this);
      this.qj.setOffsetTexts(Class49.ag);
      this.qj.setBounds(535, 376, 34, 18);
      this.add(this.qj);
   }

   public void h() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         LoginResult var2 = var1.getLoginResult();
         BaseMeridians var3;
         int var4 = (var3 = var1.getRoleProperty().getMeridians(0)) != null && var3.getKey() != null ? Integer.parseInt(var3.getKey()) - 1 : -1;
         int var5 = SkillUtil.getSepciesIndex(var2.getSpecies_id());
         int var6 = SkillUtil.getFMMax(var2.getGrade(), this.za());

         int var7;
         for (int var10000 = var7 = 0; var10000 < this.ql.length; var10000 = var7) {
            Class5 var8 = this.ql[var7];
            var7++;
            var8.ge(var4, var5, var6, var3);
         }
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class9 lt(Class12 var0) {
      return var0.qk;
   }

   // $VF: synthetic method
   static void lu(Class12 var0, com.xy.w.Class9 var1) {
      var0.qk = var1;
   }
}
