package com.xy.a;

import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class143 extends JComponent implements MouseListener {
   private JLabel df;
   private boolean gk;
   private long lx;
   private int ds;
   // $VF: synthetic field
   final Class132 azf;
   private JLabel im;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.gk = false;
   }

   public void app(int var1, MapModel var2, NpcInfoBean var3) {
      this.lx = var2.getMapId();
      this.ds = Integer.parseInt(var3.getNpctable().getNpcid());
      int var4 = Integer.parseInt(var3.getNpctable().getTx());
      int var5 = Integer.parseInt(var3.getNpctable().getTy());
      JLabel var10002 = this.im;
      StringBuilder var10003 = new StringBuilder(String.valueOf(var1 + 1));
      String var10004 = "k";
      var10002.setText(var10003.append(".").append(var3.getNpctable().getNpcname()).toString());
      JLabel var10001 = this.df;
      StringBuilder var6 = new StringBuilder(String.valueOf(var2.getMapName()));
      String var8 = "o";
      StringBuilder var7 = var6.append("(").append(var4 / 20).append(",").append(var5 / 20);
      String var9 = "l";
      var10001.setText(var7.append(")").toString());
      this.setVisible(true);
   }

   public Class143(Class132 var1, int var2) {
      this.azf = var1;
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.im = com.xy.q.Class1.k(3, 3, 160, 16, Color.white, com.xy.q.Class49.ac);
      this.df = com.xy.q.Class1.k(3, 19, 160, 16, Color.white, com.xy.q.Class49.ac);
      this.add(this.im);
      this.add(this.df);
      this.addMouseListener(this);
      this.setBounds(0, 38 * var2, 163, 38);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.gk = true;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      MapModel var2 = this.azf.yt().g(String.valueOf(this.lx));
      NpcInfoBean var3 = this.azf.yt().at(String.valueOf(this.ds));
      if (var2 != null && var3 != null) {
         ((Class121)this.azf.zc().j(22)).akq(var2, var3);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.gk) {
         var1.setColor(com.xy.q.Class53.wu);
         var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}
