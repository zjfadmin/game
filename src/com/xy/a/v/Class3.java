package com.xy.a.v;

import com.xy.q.Class54;
import java.awt.Color;

class Class3 extends Class54 {
   private com.xy.q.Class14 en;
   // $VF: synthetic field
   final Class48 eo;

   public void dy(int var1, Object var2, int var3) {
      super.gs(var1, var2);
      this.en.setText(var1 == 1 && var3 > 1 ? String.valueOf(var3) : "");
   }

   public Class3(Class48 var1, com.xy.q.Class30 var2) {
      super(var2);
      this.eo = var1;
      this.en = com.xy.q.Class1.i(2, 0, 38, 14, 10, Color.white, com.xy.q.Class49.bz);
      this.add(this.en);
   }
}
