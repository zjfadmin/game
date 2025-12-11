package com.xy.a;

import com.xy.bean.Commodity;
import com.xy.bean.StallNeedBean;
import com.xy.formula.GoodType;
import com.xy.readbean.StallBuyData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class15 extends com.xy.w.Class18 implements MouseListener {
   private int ia;
   private Class15 ib;
   private Commodity ic;
   private com.xy.w.Class18 ei;
   private com.xy.q.Class54 hr;
   private com.xy.q.Class14 id;
   private JLabel df;
   private boolean gk;
   // $VF: synthetic field
   final Class107 ie;
   private JLabel fs;
   private boolean bi;
   private StallNeedBean _if;

   public void gg(StallNeedBean var1) {
      this._if = var1;
      this.bi = false;
      if (var1 == null) {
         this.hr.gs(0, null);
         this.setVisible(false);
      } else {
         StallBuyData var2 = this.ie.yt().cb(var1.getId());
         this.hr.gs(25, var1);
         this.fs.setText(String.valueOf(var1.getTotal() - var1.getNum()));
         String var10001;
         if (var2 != null) {
            var10001 = var2.getName();
         } else {
            var10001 = "札矿牮哛";
            var10001 = "未知物品";
         }

         this.df.setText(var10001);
         com.xy.q.Class49.b(this.id, var1.getMoney());
         this.setVisible(true);
      }
   }

   // $VF: synthetic method
   static Class15 gh(Class15 var0) {
      return var0.ib;
   }

   // $VF: synthetic method
   static void gi(Class15 var0, boolean var1) {
      var0.bi = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.bi) {
         if (Class107.anr == null) {
            String var10000 = "\u0011+M%\r=\u0011-M.\u000e!\u0001#\u0007:Pf\u0016+\u0012";
            Class107.anr = com.xy.w.Class11.f("sc/mouse/flicker2.tcp", null);
         }

         Class107.anr.j(com.xy.v.Class22.l(), 0);
         Class107.anr.ab(var1, 4, 5);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   // $VF: synthetic method
   static StallNeedBean gj(Class15 var0) {
      return var0._if;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.gk) {
         this.ie.gg(this._if);
      } else {
         this.ie.gl(this.ic);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   // $VF: synthetic method
   static Commodity gk(Class15 var0) {
      return var0.ic;
   }

   public void gl(Commodity var1) {
      this.ic = var1;
      if (this.ic == null) {
         this.hr.gs(0, null);
         this.setVisible(false);
      } else {
         com.xy.q.Class49.b(this.id, var1.getMoney());
         Class15 var10000;
         if (var1.getGood() != null) {
            this.hr.gs(18, var1.getGood());
            this.fs.setText(GoodType.z(var1.getGood().getType()) ? var1.getGood().getUsetime().toString() : "");
            var10000 = this;
            this.df.setText(var1.getGood().getGoodsname());
            this.fs.setForeground(Color.white);
            this.fs.setHorizontalAlignment(10);
            this.df.setFont(com.xy.q.Class49.w);
            this.fs.setBounds(8, 8, 40, 14);
            this.df.setBounds(55, 7, 120, 18);
            this.id.setBounds(54, 24, 86, 19);
            this.hr.setBounds(7, 7, 40, 40);
            String var10006 = "\u0011+M,MpSf\u0012&\u0005";
            this.ei.dp("sc/d/81.png");
            this.ei.mt(null);
            this.ei.setBounds(5, 5, 44, 44);
            this.setBounds(49 + 151 * (this.ia % 4), 82 + 55 * (this.ia / 4), 148, 54);
         } else {
            if (var1.getPet() != null) {
               this.hr.gs(21, var1.getPet());
               JLabel var10013 = this.fs;
               StringBuilder var10014 = new StringBuilder(String.valueOf(com.xy.v.Class4.k(var1.getPet().getGrade())));
               String var10015 = "纽";
               var10013.setText(var10014.append("级").toString());
               this.df.setText(var1.getPet().getSummoningname());
               this.fs.setForeground(Color.black);
               this.fs.setHorizontalAlignment(4);
               this.df.setFont(com.xy.q.Class49.ch);
               this.fs.setBounds(200, 15, 80, 19);
               this.df.setBounds(78, 15, 150, 19);
               this.id.setBounds(78, 43, 205, 19);
               this.hr.setBounds(13, 11, 53, 53);
               String var10005 = ";\u0001g\u0006gVf\u0012&\u0005";
               this.ei.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
               this.ei.l();
               this.ei.setBounds(9, 7, 61, 61);
               this.setBounds(49 + 303 * (this.ia % 2), 85 + 82 * (this.ia / 2), 300, 76);
            }

            var10000 = this;
         }

         var10000.setVisible(true);
      }
   }

   public Class15(Class107 var1, int var2, boolean var3) {
      super(com.xy.w.Class16.m("sc/d/36.png", 16, 16, 16, 16, false));
      String var10017 = "id5c54,)ji}";
      this.ie = var1;
      this.ib = this;
      this.ia = var2;
      this.gk = var3;
      this.fs = com.xy.q.Class1.f(0, 0, 0, 0, 10, Color.black, com.xy.q.Class49.n);
      this.df = com.xy.q.Class1.f(0, 0, 0, 0, 10, Color.black, com.xy.q.Class49.ch);
      this.id = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w);
      String var10004 = "\u0011+M,MyUf\u0012&\u0005";
      this.id.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.hr = new Class140(this, var1.eg());
      com.xy.w.Class18 var10001;
      if (var3) {
         String var10003 = "id5c54,)ji}";
         var10001 = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/36.png", 16, 16, 16, 16, false));
      } else {
         String var4 = "\u0011+M,MpSf\u0012&\u0005";
         var10001 = new com.xy.w.Class18("sc/d/81.png");
      }

      this.ei = var10001;
      if (var3) {
         this.fs.setForeground(Color.white);
         this.fs.setHorizontalAlignment(10);
         this.df.setForeground(Color.black);
         this.df.setFont(com.xy.q.Class49.bz);
         this.df.setHorizontalAlignment(10);
         String var10008 = "ty(~(.)ji}";
         this.hr.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
         this.hr.wp(com.xy.q.Class54.aur);
         this.hr.rm(false);
         this.hr.setBounds(8, 5, 47, 45);
         this.fs.setBounds(14, 11, 40, 14);
         this.df.setBounds(59, 10, 132, 14);
         this.id.setBounds(57, 29, 134, 19);
         this.ei.setBounds(0, 0, 200, 56);
      }

      this.add(this.fs);
      this.add(this.df);
      this.add(this.hr);
      this.add(this.id);
      this.add(this.ei);
      this.addMouseListener(this);
   }
}
