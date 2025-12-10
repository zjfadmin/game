package com.xy;

import com.xy.entity.Gang;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Class200 extends Class345 {
   private Class322 vo;
   private Class217 aoo;
   private JLabel[] ad;
   private Class436 bl;
   private JTextArea aqp;

   public Class200(GameView var1) {
      int var10001 = 5 >> 1;
      int var10009 = -2 & -1;
      super(61 & 91, 1 ^ 3, Class345.aef, var1);
      this.va(var10009, 2 & 5, 15230 & 17899, 28668 & 4419, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 79 & 116, 79 & 116, 79 & 116, 79 & 116, (boolean)(3 >> 2)), "创建帮派");
      this.ad(new Class116(15 & 126, 3 & 4, 3 & 4, 125 & 87));
      this.vo = new Class322("sc/e/26.png", 3 & 5, 11517 & 21395, Class681.ak, Class681.c, "创建帮派", this);
      this.vo.setBounds(25326 & 7581, 12722 & 20223, 115 & 111, 91 & 61);
      this.add(this.vo);
      this.aoo = Class133.n(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)), Class681.q, Color.white);
      this.bl = new Class436(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)));
      this.aqp = Class133.d(Class681.q, Color.white);
      this.aqp.setBounds(14004 & 18895, 105 & 87, 25833 & 7134, 93 & 114);
      this.aoo.setBounds(130, 37, 160, 19);
      this.bl.setBounds(130, 63, 204, 84);
      this.add(this.aoo);
      this.add(this.aqp);
      this.add(this.bl);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.ad = var3;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.c(52, 37 + var2 * 26, 72, 19, 10, Class681.c("#c000000"), Class681.ak);
         this.ad[var2].setText(var2 == 0 ? "帮派名称" : (var2 == --1 ? "帮派宗旨" : ""));
         this.add(this.ad[var2++]);
      }

   }

   public void d() {
      BigDecimal var1;
      if ((var1 = this.aej.roleUnit.r.getGang_id()) != null && var1.intValue() != 0) {
         this.aej.f("你已有帮派");
      } else {
         String var4 = this.aoo.getText().trim();
         String var2 = this.aqp.getText().trim();
         if (var4.equals("")) {
            this.aej.f("帮派名为空");
         } else if (var2.equals("")) {
            this.aej.f("帮派宗旨为空");
         } else {
            RoleData var3 = this.vd();
            Class200 var10000;
            if (var3.bc(new BigDecimal(1527 & 31741)) != null) {
               Gang var5 = new Gang();
               var5.setGangname(var4);
               var5.setIntroduction(var2);
               var4 = Agreement.getSendTextAES("gangcreate", Class695.b().toJson(var5));
               var10000 = this;
               this.uw().d(var4);
            } else {
               var10000 = this;
               this.aej.f("你背包没有三界召集令");
            }

            var10000.ve().n(this.ae());
         }
      }
   }
}
