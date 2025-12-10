package com.xy;

import com.xy.formula.FormulaNum;
import com.xy.readbean.AllMapBean;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Class4 extends Class345 {
   private Class217 kk;
   private RichLabel bt;
   private JScrollPane o;
   private MapModel qe;
   private Class202 qf;
   private Class659 qg;
   private Class436[] e;
   private JLabel[] ly;
   private JComponent qh;

   public Class4(GameView var1) {
      int var10001 = --2;
      int var10006 = -1 & -2;
      super(17149 & 15775, 1 ^ 3, Class345.aef, var1);
      this.va(var10006, 3 ^ 3, 19326 & 13703, 3071 & 30111, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 77 & 118, 77 & 118, 77 & 118, 77 & 118, (boolean)(2 & 5)), "寻找NPC");
      this.qh = new JComponent() {
      };
      JLabel[] var10 = new JLabel[var10001];
      boolean var10003 = true;
      this.ly = var10;

      int var5;
      int var10000;
      for(var10000 = var5 = 5 >> 3; var10000 < this.ly.length; var10000 = var5) {
         this.ly[var5] = Class133.b(111 & 63, (117 & 42) + (111 & 63) * var5, 121 & 126, 22 & 125, Color.black, Class681.ak);
         this.ly[var5].setText(var5 == 0 ? "输入npc名称" : (var5 == --1 ? "场景" : ""));
         this.ly[var5].setHorizontalAlignment(26 & 111);
         this.add(this.ly[var5++]);
      }

      this.kk = Class133.n(Class511.q("sc/d/17.png", --5, --5, --5, --5, (boolean)(3 ^ 3)), Class681.q, Color.white);
      this.kk.setHorizontalAlignment(62 & 75);
      this.kk.setBounds(63 & 111, 119 & 62, 1470 & 31481, 91 & 55);
      this.add(this.kk);
      this.qf = new Class202(127 & 15, this.kk, this);
      this.qg = new Class659(--2, 100, this);
      this.qg.gb((boolean)(--1));
      this.qg.vf(84, 79, 145, 20);
      this.add(this.qg);
      ArrayList var6 = new ArrayList();
      AllMapBean var4;
      Iterator var2 = (var4 = this.vc().bb()).getAllMap().values().iterator();
      Iterator var9 = var2;

      while(var9.hasNext()) {
         MapModel var3 = (MapModel)var2.next();
         var9 = var2;
         var6.add(var3.getMapId());
      }

      var10000 = 2 & 5;
      Collections.sort(var6);

      int var8;
      for(var8 = var10000; var10000 < var6.size(); var10000 = var8) {
         MapModel var7 = (MapModel)var4.getAllMap().get(((Long)var6.get(var8)).toString());
         Class659 var11 = this.qg;
         String var13 = var7.getMapName();
         long var10004 = var7.getMapId();
         ++var8;
         var11.ahr(new Class367(var13, var10004));
      }

      var10001 = 1 ^ 3;
      this.o = Class133.f(50, 124, 181, 223, this.qh, 20);
      this.add(this.o);
      this.bt = new RichLabel("", Class681.ab);
      this.bt.setTextSize("#c000000*点击搜索结果可以查看该NPC在小地图的位置", 180);
      this.bt.setBounds(51, 352, this.bt.getWidth(), this.bt.getHeight());
      this.add(this.bt);
      Class436[] var12 = new Class436[var10001];
      var10003 = true;
      this.e = var12;

      for(var10000 = var8 = 3 >> 2; var10000 < this.e.length; var10000 = var8) {
         this.e[var8] = new Class436();
         this.add(this.e[var8]);
         if (var8 == 0) {
            this.e[var8].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(2 & 5)));
            this.e[var8].setBounds(49, 103, 180, 21);
         } else if (var8 == (2 ^ 3)) {
            this.e[var8].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
            this.e[var8].setBounds(49, 103, 180, 245);
         }

         ++var8;
      }

   }

   public void gh(long var1) {
      this.qe = this.vc().ay(String.valueOf(var1));
      this.d();
   }

   public void d() {
      String var5;
      if (Class394.o(var5 = this.kk.getText())) {
         var5 = null;
      }

      Class603 var4 = this.vc();
      FormulaNum[] var3 = this.qe.getNpcs();
      int var2 = 5 >> 3;
      int var1 = 5 >> 3;
      int var6 = var3 != null ? var3.length : 0;

      int var10000;
      for(var10000 = var1; var10000 < var6; var10000 = var1) {
         FormulaNum var7 = var3[var1];
         int var8 = 3 >> 2;
         int var9 = var7.getSize();

         for(var10000 = var8; var10000 < var9; var10000 = var8) {
            long var10 = var7.getZhi(var8);
            NpcInfoBean var12;
            if ((var12 = var4.ck(String.valueOf(var10))) != null && !Class394.o(var12.getNpctable().getNpctype()) && !Class394.o(var12.getNpctable().getNpcname()) && (var5 == null || var12.getNpctable().getNpcname().indexOf(var5) != -4 >> 2)) {
               Object var11;
               if ((var11 = (<undefinedtype>)(var2 < this.qh.getComponentCount() ? this.qh.getComponent(var2) : null)) == null) {
                  this.qh.add((Component)(var11 = new MouseListener(var2) {
                     private JLabel at;
                     private boolean ee;
                     private JLabel d;
                     private int cy;
                     private long aol;

                     public void afw(int var1, MapModel var2, NpcInfoBean var3) {
                        this.aol = var2.getMapId();
                        this.cy = Integer.parseInt(var3.getNpctable().getNpcid());
                        int var4 = Integer.parseInt(var3.getNpctable().getTx());
                        int var5 = Integer.parseInt(var3.getNpctable().getTy());
                        this.at.setText(var1 + (5 >> 2) + "." + var3.getNpctable().getNpcname());
                        this.d.setText(var2.getMapName() + "(" + var4 / (118 & 29) + "," + var5 / (30 & 117) + ")");
                        this.setVisible((boolean)(--1));
                     }

                     public void mouseReleased(MouseEvent var1) {
                     }

                     public void mouseEntered(MouseEvent var1) {
                        this.ee = (boolean)(5 >> 2);
                     }

                     protected void paintComponent(Graphics var1) {
                        super.paintComponent(var1);
                        if (this.ee) {
                           int var10001 = 2 & 5;
                           var1.setColor(Class581.wm);
                           var1.fillRect(var10001, 5 >> 3, this.getWidth(), this.getHeight());
                        }

                     }

                     public void mousePressed(MouseEvent var1) {
                        MapModel var3 = Class4.this.vc().ay(String.valueOf(this.aol));
                        NpcInfoBean var2 = Class4.this.vc().ck(String.valueOf(this.cy));
                        if (var3 != null && var2 != null) {
                           ((Class49)Class4.this.ve().e(31 & 118)).ahy(var3, var2);
                        }
                     }

                     public void mouseClicked(MouseEvent var1) {
                     }

                     public void mouseExited(MouseEvent var1) {
                        this.ee = (boolean)(3 ^ 3);
                     }

                     public {
                        int var10003 = --3;
                        int var10005 = --3;
                        this.setLayout((LayoutManager)null);
                        this.setBackground(Class681.cu);
                        this.at = Class133.b(var10005, --3, 9701 & 23226, 120 & 23, Color.white, Class681.ce);
                        this.d = Class133.b(var10003, 55 & 91, 22696 & 10231, 50 & 93, Color.white, Class681.ce);
                        this.add(this.at);
                        this.add(this.d);
                        var10003 = 2 & 5;
                        this.addMouseListener(this);
                        this.setBounds(var10003, (38 & 127) * var2, 23787 & 9143, 103 & 62);
                     }
                  }));
               }

               ((<undefinedtype>)var11).afw(var2++, this.qe, var12);
            }

            ++var8;
         }

         ++var1;
      }

      for(var10000 = var1 = var2; var10000 < this.qh.getComponentCount(); var10000 = var1) {
         this.qh.getComponent(var1++).setVisible((boolean)(3 >> 2));
      }

      this.qh.setPreferredSize(new Dimension(10487 & 22443, var2 * (38 & 127)));
   }

   public void iv(MapModel var1) {
      this.kk.setText("");
      this.qg.bq(var1.getMapId());
      this.ve().a(this.ae());
   }

   public void iw(String var1, JTextField var2) {
      if (this.qe != null) {
         this.d();
      }

   }
}
