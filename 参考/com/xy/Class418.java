package com.xy;

import com.xy.game.GameUtil;
import com.xy.readbean.AllMapBean;
import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class418 extends Class345 {
   private RichLabel lt;
   private Class70[] ajz;
   private JLabel[] fb;
   private Class436[] ce;
   private Class322 aka;
   private JScrollPane mv;
   private Class659 qc;
   private Class659 qg;
   private MapModel akb;
   private InputBean akc;
   private MapModel akd;

   public void y(int var1) {
   }

   public void d() {
      if (this.akd != null && this.akb != null && this.akd != this.akb) {
         this.lt.setTextSize(this.vc().ca().b(this.akd, this.akb, this.vd()), 14653 & 18430);
      } else {
         this.lt.setTextSize("", 2047 & 31036);
      }
   }

   public Class418(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10012 = -4 >> 2;
      super(27135 & 5788, --2, Class345.aef, var1);
      this.va(var10012, 2 & 5, 12221 & 20946, 7678 & 25339, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 77 & 118, 77 & 118, 77 & 118, 77 & 118, (boolean)(5 >> 3)), (String)null);
      this.qg = new Class659(--2, 119 & 108, this);
      this.qc = new Class659(1 ^ 3, 127 & 100, this);
      this.qg.gb((boolean)(4 ^ 5));
      this.qc.gb((boolean)(--1));
      this.qg.vf(63 & 111, 55 & 107, 119 & 123, 54 & 93);
      this.qc.vf(28605 & 4350, 111 & 51, 127 & 115, 23 & 124);
      this.add(this.qg);
      this.add(this.qc);
      this.aka = new Class322("sc/e/7.png", 4 ^ 5, 27439 & 5619, Class681.ak, Class681.c, "", this);
      this.aka.setBounds(16183 & 16895, 33, 59, 25);
      this.aka.setText("搜索");
      this.add(this.aka);
      JLabel[] var10 = new JLabel[var10001];
      boolean var10003 = true;
      this.fb = var10;

      int var5;
      int var10000;
      for(var10000 = var5 = 3 ^ 3; var10000 < this.fb.length; var10000 = var5) {
         this.fb[var5] = Class133.b(25 + 141 * var5, 35, 18, 20, Color.black, Class681.ak);
         this.fb[var5].setText(var5 == 0 ? "从" : (var5 == 3 >> 1 ? "到" : ""));
         this.fb[var5].setHorizontalAlignment(2 & 5);
         this.add(this.fb[var5++]);
      }

      this.lt = new RichLabel("", Class681.q);
      this.lt.addMouseListener(new MouseListener() {
         public void mouseClicked(MouseEvent var1) {
         }

         public void mouseExited(MouseEvent var1) {
         }

         public void mousePressed(MouseEvent var1) {
            Class418.this.akc = Class418.this.lt.isMonitor(var1.getX(), var1.getY());
            if (Class418.this.akc != null) {
               Class418.this.akc.setM((boolean)(4 ^ 5));
            }

         }

         public void mouseEntered(MouseEvent var1) {
         }

         public void mouseReleased(MouseEvent var1) {
            if (Class418.this.akc != null) {
               GameUtil.d(Class418.this.akc, Class418.this.ux());
            }

         }
      });
      this.mv = Class133.f(34, 85, 336, 138, this.lt, 20);
      this.add(this.mv);
      ArrayList var6 = new ArrayList();
      AllMapBean var4;
      Iterator var2 = (var4 = this.vc().bb()).getAllMap().values().iterator();
      Iterator var9 = var2;

      while(var9.hasNext()) {
         MapModel var3 = (MapModel)var2.next();
         var9 = var2;
         var6.add(var3.getMapId());
      }

      var10000 = 5 >> 3;
      Collections.sort(var6);

      int var8;
      for(var8 = var10000; var10000 < var6.size(); var10000 = var8) {
         MapModel var7 = (MapModel)var4.getAllMap().get(((Long)var6.get(var8)).toString());
         this.qg.ahr(new Class367(var7.getMapName(), var7.getMapId()));
         Class659 var12 = this.qc;
         String var13 = var7.getMapName();
         long var10004 = var7.getMapId();
         ++var8;
         var12.ahr(new Class367(var13, var10004));
      }

      Class436[] var11 = new Class436[1 ^ 3];
      var10003 = true;
      this.ce = var11;

      for(var10000 = var8 = 3 ^ 3; var10000 < this.ce.length; var10000 = var8) {
         this.ce[var8] = new Class436();
         this.add(this.ce[var8]);
         if (var8 == 0) {
            this.ce[var8].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 ^ 3)));
            this.ce[var8].setBounds(30, 65, 340, 21);
         } else if (var8 == (4 ^ 5)) {
            this.ce[var8].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(2 & 5)));
            this.ce[var8].setBounds(30, 65, 340, 160);
         }

         ++var8;
      }

   }

   public void iv(MapModel var1) {
      this.akc = null;
      this.qg.bq(var1.getMapId());
      this.qc.bq(var1.getMapId());
      this.ve().a(this.ae());
   }

   public void abq(long var1, Class659 var3) {
      MapModel var4;
      if ((var4 = this.vc().ay(String.valueOf(var1))) != null) {
         Class418 var10000;
         if (this.qg == var3) {
            var10000 = this;
            this.akd = var4;
         } else {
            if (this.qc == var3) {
               this.akb = var4;
            }

            var10000 = this;
         }

         var10000.d();
      }
   }
}
