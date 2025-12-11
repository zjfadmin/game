package com.xy.a.a;

import com.xy.richtext.RichLabel;
import javax.swing.JComponent;

class Class51 extends JComponent {
   private com.xy.w.Class18 gh;
   private RichLabel cj;
   // $VF: synthetic field
   final Class33 aqz;
   private Class60[] ara;

   public Class51(Class33 var1) {
      this.aqz = var1;
      this.cj = new RichLabel("", com.xy.q.Class49.bz);
      String var10006 = "}?nlnlnl湷駴掎祦ｄ瀩寃哐沋寁屘乑凓杕纚呔拉恻ｒ殓乴瀩寃扊沋寁那匉犲菫忉飁奈盘令爵拉恻ぜ";
      this.cj.setTextSize("#c000000温馨提示：灵宝和法宝将不再有组合抗性，每个灵宝或法宝都单独获得额外的人物抗性。", 370);
      this.cj.setBounds(39, 245, this.cj.getWidth(), this.cj.getHeight());
      this.add(this.cj);
      this.ara = new Class60[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ara.length; var10000 = var2) {
         this.ara[var2] = new Class60(var1, var2, var1.eg());
         Class51 var3;
         if (var2 == 0) {
            var3 = this;
            this.ara[var2].setBounds(199, 84, 35, 35);
         } else if (var2 == 1) {
            var3 = this;
            this.ara[var2].setBounds(146, 142, 35, 35);
         } else {
            if (var2 == 2) {
               this.ara[var2].setBounds(252, 142, 35, 35);
            }

            var3 = this;
         }

         var3.add(this.ara[var2++]);
      }

      var10006 = "[7\u00070\u0007`\u001azX:O";
      this.gh = new com.xy.w.Class18("sc/d/42.png");
      this.gh.setBounds(115, 27, 198, 206);
      this.add(this.gh);
   }
}
