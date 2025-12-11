package com.xy.q;

import com.xy.battle.BattleMan;
import com.xy.battle.BattleScene;
import com.xy.battle.TypeState;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class18 extends JComponent {
   private List<BigDecimal> tr;
   private List<RoleSummoning> wq;
   private long et;
   private Class30 cw;
   private int ah;

   public void kz(Class53 var1) {
      this.et = var1 != null ? var1.ee() : 0L;
      int var2 = 0;
      int var3 = this.getComponentCount();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         Class53 var5 = (Class53)this.getComponent(var2);
         var5.be(var5 == var1);
      }

      RolePet var4 = this.cw.yx().getRolePet(var1 != null ? var1.ee() : 0L);
      if (this.cw instanceof com.xy.a.a.Class16) {
         ((com.xy.a.a.Class16)this.cw).lc(var4);
      } else if (this.cw instanceof com.xy.a.q.Class34) {
         ((com.xy.a.q.Class34)this.cw).lc(var4);
      } else {
         if (this.cw instanceof com.xy.a.a.Class50) {
            ((com.xy.a.a.Class50)this.cw).lc(var4);
         }
      }
   }

   public void ef(long var1) {
      this.et = var1;
   }

   public RoleSummoning jm() {
      if (this.et != 0L && this.wq != null) {
         int var1;
         for (int var10000 = var1 = 0; var10000 < this.wq.size(); var10000 = ++var1) {
            RoleSummoning var2;
            if ((var2 = this.wq.get(var1)).getSid().longValue() == this.et) {
               return var2;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public Class18(Class30 var1) {
      this.cw = var1;
   }

   public Class53 sd() {
      int var1 = 0;
      int var2 = this.getComponentCount();

      for (int var10000 = var1; var10000 < var2; var10000 = ++var1) {
         Class53 var3;
         if ((var3 = (Class53)this.getComponent(var1)).ee() == this.et) {
            return var3;
         }
      }

      return null;
   }

   public void fm(List<RoleSummoning> var1) {
      this.wq = var1;
      this.t();
   }

   public void l() {
      RoleData var1;
      if ((var1 = this.cw.yx()) != null) {
         BattleScene var2;
         com.xy.d.Class11 var3 = (var2 = this.cw.afx.getBattleScene()) != null ? var2.getBattleUnit(0, var1.getRoleId()) : null;
         if (var3 == null) {
            if (this.tr != null) {
               this.tr.clear();
            }
         } else {
            com.xy.d.Class11 var10000;
            if (this.tr == null) {
               this.tr = new ArrayList<>();
               var10000 = var3;
            } else {
               this.tr.clear();
               var10000 = var3;
            }

            BattleMan var7 = var10000.cg();
            String var10001 = "厵唪儤";
            List var4 = var7.j("召唤兽");

            int var5;
            for (int var8 = var5 = 0; var8 < var4.size(); var8 = ++var5) {
               if (((TypeState)var4.get(var5)).getState() != 0) {
                  int var6 = Integer.parseInt(((TypeState)var4.get(var5)).getType());
                  this.tr.add(new BigDecimal(var6));
               }
            }
         }
      }
   }

   public long ee() {
      return this.et;
   }

   public List<RoleSummoning> rs() {
      return this.wq;
   }

   public void t() {
      if (!this.dh()) {
         this.kz(this.sd());
      }
   }

   public boolean dh() {
      if (this.wq != null) {
         return this.ah();
      } else {
         RoleData var1;
         if ((var1 = this.cw.yx()) == null) {
            return false;
         } else {
            long var2 = 0L;
            int var4 = 0;
            int var5 = this.getComponentCount();

            Iterator var7;
            for (Iterator var10000 = var7 = var1.pets.iterator(); var10000.hasNext(); var10000 = var7) {
               RolePet var6 = (RolePet)var7.next();
               Component var8 = var4 < var5 ? this.getComponent(var4) : null;
               Class53 var9 = var8 != null ? (Class53)var8 : null;
               if (var9 == null) {
                  var9 = new Class53(this);
                  var9.setBounds(0, 20 * var4, this.getWidth(), 20);
                  this.add(var9);
               }

               if (var9.alm(++var4, this.et, var6.getPet(), var1, this.tr)) {
                  var2 = var9.ee();
               }

               var9.setVisible(true);
            }

            int var10;
            for (int var12 = var10 = var4; var12 < this.getComponentCount(); var12 = var10) {
               Component var13 = this.getComponent(var10);
               var10++;
               var13.setVisible(false);
            }

            if (var4 != this.ah) {
               this.ah = var4;
               if (this.cw instanceof com.xy.a.a.Class16) {
                  JLabel var14 = ((com.xy.a.a.Class16)this.cw).lb()[0];
                  String var10003 = "口唲兲>";
                  StringBuilder var10001 = new StringBuilder("召唤兽(").append(this.ah);
                  String var10002 = "!k?p";
                  var14.setText(var10001.append("/21)").toString());
               }

               this.setPreferredSize(new Dimension(this.getWidth(), var4 * 20));
            }

            if (var2 == 0L) {
               Component var11 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
               this.kz(var11 != null ? (Class53)var11 : null);
               return var11 != null;
            } else {
               return false;
            }
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.cw.ze().dh()) {
         this.dh();
      }
   }

   public boolean ah() {
      RoleData var1;
      if ((var1 = this.cw.yx()) == null) {
         return false;
      } else {
         long var2 = 0L;
         int var4 = 0;
         int var5 = this.getComponentCount();

         Iterator var7;
         for (Iterator var10000 = var7 = this.wq.iterator(); var10000.hasNext(); var10000 = var7) {
            RoleSummoning var6 = (RoleSummoning)var7.next();
            Component var8 = var4 < var5 ? this.getComponent(var4) : null;
            Class53 var9 = var8 != null ? (Class53)var8 : null;
            if (var9 == null) {
               var9 = new Class53(this);
               var9.setBounds(0, 20 * var4, this.getWidth(), 20);
               this.add(var9);
            }

            if (var9.alm(++var4, this.et, var6, var1, this.tr)) {
               var2 = var9.ee();
            }

            var9.setVisible(true);
         }

         int var10;
         for (int var12 = var10 = var4; var12 < this.getComponentCount(); var12 = var10) {
            Component var13 = this.getComponent(var10);
            var10++;
            var13.setVisible(false);
         }

         if (var4 != this.ah) {
            this.ah = var4;
            this.setPreferredSize(new Dimension(this.getWidth(), var4 * 20));
         }

         if (var2 == 0L) {
            Component var11 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
            this.kz(var11 != null ? (Class53)var11 : null);
            return var11 != null;
         } else {
            return false;
         }
      }
   }

   public Class30 eg() {
      return this.cw;
   }
}
