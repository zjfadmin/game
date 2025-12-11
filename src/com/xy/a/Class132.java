package com.xy.a;

import com.xy.formula.FormulaNum;
import com.xy.readbean.AllMapBean;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Class132 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] bb;
   private JLabel[] lt;
   private com.xy.q.Class44 uy;
   private com.xy.q.Class36 fc;
   private com.xy.q.Class23 awt;
   private MapModel awu;
   private JComponent cr;
   private JScrollPane ba;
   private RichLabel bj;

   public void ams(String var1, JTextField var2) {
      if (this.awu != null) {
         this.h();
      }
   }

   public Class132(GameView var1) {
      super(157, 2, com.xy.q.Class30.afz, var1);
      String var10004 = "$TxSx\u0006yG9P";
      this.yy(-2, 0, 262, 415, com.xy.q.Class30.agh);
      com.xy.w.Class9 var21 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10005 = "寭扒X|U";
      this.yu(var21, "寻找NPC");
      this.cr = new Class75(this);
      this.lt = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.lt.length; var10000 = var2) {
         this.lt[var2] = com.xy.q.Class1.k(47, 32 + 47 * var2, 120, 20, Color.black, com.xy.q.Class49.ch);
         JLabel var10 = this.lt[var2];
         String var15;
         if (var2 == 0) {
            var15 = "辤儲Y'T呚秇";
            var15 = "输入npc名称";
         } else if (var2 == 1) {
            var15 = "圖晹";
            var15 = "场景";
         } else {
            var15 = "";
         }

         var10.setText(var15);
         this.lt[var2].setHorizontalAlignment(10);
         this.add(this.lt[var2++]);
      }

      var10005 = "D4\u00183\u0018f\u0000yG9P";
      this.fc = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 5, 5, 5, 5, false), com.xy.q.Class49.w, Color.white);
      this.fc.setHorizontalAlignment(10);
      this.fc.setBounds(47, 54, 184, 19);
      this.add(this.fc);
      this.awt = new com.xy.q.Class23(15, this.fc, this);
      this.uy = new com.xy.q.Class44(2, 100, this);
      this.uy.rm(true);
      this.uy.zb(84, 79, 145, 20);
      this.add(this.uy);
      ArrayList var6 = new ArrayList();
      AllMapBean var3;
      Iterator var5 = (var3 = this.yt().af()).getAllMap().values().iterator();
      Iterator var11 = var5;

      while (var11.hasNext()) {
         MapModel var4 = (MapModel)var5.next();
         var11 = var5;
         var6.add(var4.getMapId());
      }

      int var12 = 0;
      Collections.sort(var6);

      for (int var7 = 0; var12 < var6.size(); var12 = var7) {
         MapModel var9 = var3.getAllMap().get(((Long)var6.get(var7)).toString());
         com.xy.q.Class44 var13 = this.uy;
         String var10003 = var9.getMapName();
         long var22 = var9.getMapId();
         var7++;
         var13.li(new com.xy.q.Class60(var10003, var22));
      }

      this.ba = com.xy.q.Class1.g(50, 124, 181, 223, this.cr, 20);
      this.add(this.ba);
      this.bj = new RichLabel("", com.xy.q.Class49.n);
      String var10007 = "\u000fu\u001c&\u001c&\u001c&\u0006炯凗搊紎绅枰叹仉柳眧诳bFo圾尣圦囒皒佡罸";
      this.bj.setTextSize("#c000000*点击搜索结果可以查看该NPC在小地图的位置", 180);
      this.bj.setBounds(51, 352, this.bj.getWidth(), this.bj.getHeight());
      this.add(this.bj);
      this.bb = new com.xy.w.Class18[2];

      int var8;
      for (int var14 = var8 = 0; var14 < this.bb.length; var14 = ++var8) {
         this.bb[var8] = new com.xy.w.Class18();
         this.add(this.bb[var8]);
         if (var8 == 0) {
            com.xy.w.Class18 var17 = this.bb[var8];
            String var19 = "D4\u00183\u0018e\u0002yG9P";
            var17.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.bb[var8].setBounds(49, 103, 180, 21);
         } else if (var8 == 1) {
            com.xy.w.Class18 var18 = this.bb[var8];
            String var20 = "eO9H9\u001e\"\u0002fBq";
            var18.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.bb[var8].setBounds(49, 103, 180, 245);
         }
      }
   }

   public void h() {
      String var1;
      if (com.xy.v.Class12.h(var1 = this.fc.getText())) {
         var1 = null;
      }

      com.xy.v.Class8 var2 = this.yt();
      FormulaNum[] var3 = this.awu.getNpcs();
      int var4 = 0;
      int var5 = 0;
      int var6 = var3 != null ? var3.length : 0;

      for (int var10000 = var5; var10000 < var6; var10000 = ++var5) {
         FormulaNum var7 = var3[var5];
         int var8 = 0;
         int var9 = var7.getSize();

         for (int var15 = var8; var15 < var9; var15 = ++var8) {
            long var10 = var7.getZhi(var8);
            NpcInfoBean var12;
            if ((var12 = var2.at(String.valueOf(var10))) != null
               && !com.xy.v.Class12.h(var12.getNpctable().getNpctype())
               && !com.xy.v.Class12.h(var12.getNpctable().getNpcname())
               && (var1 == null || var12.getNpctable().getNpcname().indexOf(var1) != -1)) {
               Class143 var13;
               if ((var13 = (Class143)(var4 < this.cr.getComponentCount() ? this.cr.getComponent(var4) : null)) == null) {
                  this.cr.add(var13 = new Class143(this, var4));
               }

               var13.app(var4++, this.awu, var12);
            }
         }
      }

      for (int var16 = var5 = var4; var16 < this.cr.getComponentCount(); var16 = var5) {
         this.cr.getComponent(var5++).setVisible(false);
      }

      this.cr.setPreferredSize(new Dimension(163, var4 * 38));
   }

   public void ef(long var1) {
      this.awu = this.yt().g(String.valueOf(var1));
      this.h();
   }

   public void mc(MapModel var1) {
      this.fc.setText("");
      this.uy.gw(var1.getMapId());
      this.zc().b(this.lj());
   }
}
