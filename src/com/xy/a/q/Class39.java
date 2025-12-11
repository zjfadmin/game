package com.xy.a.q;

import com.xy.bean.ChongjipackBean;
import com.xy.formula.MsgUntil;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class39 extends com.xy.q.Class30 {
   private JLabel df;
   private JComponent it;
   private JLabel dh;
   private JLabel fs;
   private com.xy.w.Class18 dm;
   private JScrollPane l;

   public void gw(Object var1) {
      ((Class61)var1).h();
   }

   public void so(int var1, List<ChongjipackBean> var2) {
      this.df.setText(MsgUntil.h(var1));
      if (var2 == null) {
         var2 = new ArrayList();
      }

      String var4 = this.yx().getLoginResult().getVipget();
      String[] var5 = null;
      if (var4 != null) {
         String var10001 = "Q_";
         var5 = var4.split("&&");
      }

      int var6;
      for (int var10000 = var6 = 0; var10000 < var2.size(); var10000 = var6) {
         Class61 var7;
         if ((var7 = (Class61)(var6 < this.it.getComponentCount() ? this.it.getComponent(var6) : null)) == null) {
            this.it.add(var7 = new Class61(this));
         }

         var7.ux(var2.get(var6));
         var7.tg(var5);
         int var10004 = 50 * var6;
         var6++;
         var7.setBounds(0, var10004, 420, 50);
         var7.setVisible(true);
      }

      var6 = var2.size();
      int var9 = this.it.getComponentCount();

      for (int var10 = var6; var10 < var9; var10 = var6) {
         Component var11 = this.it.getComponent(var6);
         var6++;
         ((Class61)var11).ux(null);
      }

      this.it.setPreferredSize(new Dimension(446, 50 * var2.size()));
      this.l.getVerticalScrollBar().setValue(0);
      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   public Class39(GameView var1) {
      super(134, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "\u0004\u001aX\u001dXHY\t\u0019\u001e";
      this.yy(-1, 0, 520, 448, com.xy.q.Class30.agh);
      com.xy.w.Class9 var2 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "斸匤冺纹礴";
      this.yu(var2, "新区冲级礼");
      this.fs = com.xy.q.Class1.f(78, 23, 200, 24, 4, Color.black, com.xy.q.Class49.bu);
      this.dh = com.xy.q.Class1.f(318, 23, 200, 24, 10, Color.black, com.xy.q.Class49.bu);
      String var10004 = "旉卍凋绐偫诖斏";
      this.fs.setText("新区冲级倒计时");
      String var10003 = "夡2动沧）";
      this.dh.setText("天,加油！");
      this.add(this.fs);
      this.add(this.dh);
      this.df = com.xy.q.Class1.f(278, 23, 48, 24, 0, Color.RED, com.xy.q.Class49.bu);
      this.add(this.df);
      this.it = new Class99(this);
      this.l = com.xy.q.Class1.g(52, 60, 446, 360, this.it, 20);
      this.add(this.l);
      this.dm = new com.xy.w.Class18();
      String var10008 = "\n\u0014V\u0013VEMY\t\u0019\u001e";
      this.dm.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.dm.setBounds(48, 57, 448, 367);
      this.add(this.dm);
   }

   public void h() {
      String var1 = this.yx().getLoginResult().getVipget();
      String[] var2 = null;
      if (var1 != null) {
         String var10001 = "8.";
         var2 = var1.split("&&");
      }

      int var3 = 0;
      int var4 = this.it.getComponentCount();

      for (int var10000 = var3; var10000 < var4; var10000 = ++var3) {
         Class61 var5;
         if ((var5 = (Class61)this.it.getComponent(var3)).isVisible()) {
            var5.tg(var2);
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.wt) {
         this.wt = false;
         this.l.updateUI();
      }
   }
}
