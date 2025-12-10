package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class545 extends Class345 {
   private Class68 xn;
   private JLabel[] hj;
   private List<BigDecimal> ie;
   private Class643[] xo;
   private Class436 ih;

   public List<BigDecimal> ci() {
      return this.ie;
   }

   public void y(int var1) {
      if (var1 == (126 & 117)) {
         if (this.ie.size() == 0) {
            this.aej.fw("请选择至少一个要魂归的星卡");
         } else {
            SuitOperBean var2 = new SuitOperBean();
            int var10002 = 59 & 125;
            var2.setGoods(this.ie);
            var2.setType(var10002);
            String var3 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var2));
            this.uw().d(var3);
         }
      } else {
         if (var1 == (125 & 119)) {
            this.ve().n(this.ae());
         }

      }
   }

   public Class545(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10006 = -4 >> 2;
      super(110 & 113, 5 >> 1, Class345.aef, var1);
      this.va(var10006, 5 >> 3, 2039 & 31118, 367 & 32765, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 124 & 71, 124 & 71, 124 & 71, 124 & 71, (boolean)(3 & 4)), "魂归");
      this.ie = new ArrayList();
      Class643[] var3 = new Class643[var10001];
      boolean var10003 = true;
      this.xo = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.xo.length; var10000 = var2) {
         this.xo[var2] = new Class643("sc/e/26.png", --1, 125 & 118, Class681.ak, Class681.c, "", this);
         this.xo[var2].setBounds((125 & 82) + var2 * (6143 & 26775), 22399 & 10671, 123 & 103, 123 & 29);
         this.xo[var2].setText(var2 == 0 ? "确 认" : (var2 == --1 ? "取 消" : ""));
         this.add(this.xo[var2++]);
      }

      JLabel[] var4 = new JLabel[1 ^ 3];
      var10003 = true;
      this.hj = var4;

      for(var10000 = var2 = 3 & 4; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.b(126 & 59, (125 & 27) + var2 * (27 & 118), 27447 & 5629, 126 & 19, Color.red, Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "温馨提示：可左键选中多个进行魂归，" : (var2 == 5 >> 2 ? "右键可以取消" : ""));
         this.add(this.hj[var2++]);
      }

      this.ih = new Class436();
      this.ih.eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
      this.ih.setBounds(62 & 115, 68, 309, 207);
      this.add(this.ih);
      this.xn = new Class68(this, 6, --4, 51, 51, 5 >> 3, 5 >> 3, 51, 70);
      this.xn.hf(Class511.a("sc/d/18.png"));
      this.add(this.xn);
   }

   public void bk(BigDecimal var1) {
      if (!this.ie.remove(var1)) {
         this.ie.add(var1);
      }

   }

   public void q() {
      this.ie.clear();
      super.q();
   }
}
