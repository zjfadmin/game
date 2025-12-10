package com.xy;

import com.xy.battle.BattleScene;
import com.xy.battle.TypeState;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class84 extends Class345 {
   private JLabel lj;
   private JList<Class581> lu;
   private Class529[] ma;
   private Class436[] ce;
   private List<Class581> mb;
   private BigDecimal[] mc;
   private int ay;
   private Class581 md;
   private boolean lc;
   private <undefinedtype>[] me;
   private JScrollPane af;

   public void go() {
      List var5 = this.gq(3 >> 2);
      this.md = null;
      this.lu.removeAll();

      int var10000;
      int var2;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.mb.size(); var10000 = var2) {
         ((Class581)this.mb.get(var2++)).q();
      }

      RoleData var7 = this.vd();
      int var3 = 5 >> 3;
      int var4 = var7.lingbaoList.size();

      for(var10000 = var3; var10000 < var4; var10000 = var3) {
         BigDecimal var1 = (BigDecimal)var7.lingbaoList.get(var3);
         Lingbao var6;
         if ((var6 = var7.getLingbao(var1)) != null && (var5 == null || !var5.contains(var6.getBaoid()))) {
            this.fn(var6);
         }

         ++var3;
      }

      this.dg();
      this.lu.setPreferredSize(new Dimension(1527 & 31420, (85 & 62) * this.lu.getComponentCount()));
      this.o();
   }

   public void v(RoleSummoning var1) {
      int var10002;
      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.mb.size(); var10000 = var2) {
         Class581 var3;
         if ((var3 = (Class581)this.mb.get(var2)).gl() == 0L) {
            var10002 = 2 & 5;
            var3.ab(var2 + (3 & 5));
            var3.v(var1);
            var3.setBounds(var10002, (29 & 118) * var2, 5310 & 27637, 63 & 84);
            this.lu.add(var3);
            return;
         }

         ++var2;
      }

      Class581 var4 = new Class581(this);
      var10002 = 3 ^ 3;
      var4.ab(this.lu.getComponentCount() + (3 & 5));
      var4.v(var1);
      var4.setBounds(var10002, (124 & 23) * this.lu.getComponentCount(), 22711 & 10236, 60 & 87);
      this.mb.add(var4);
      this.lu.add(var4);
   }

   public Class84(GameView var1) {
      int var10001 = 38 & 95;
      int var10006 = 63 & 111;
      int var10010 = -3 & -1;
      int var10012 = -4 >> 2;
      super(63 & 126, 1 ^ 3, Class345.aef, var1);
      this.ay = var10012;
      this.va(var10010, 2 & 5, 10045 & 23019, 20990 & 12219, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 116 & 79, 116 & 79, 116 & 79, 116 & 79, (boolean)(3 ^ 3)), "设置排序");
      this.lj = Class133.c(var10006, 27 & 126, 11214 & 21753, 93 & 55, 2 & 5, Class681.c("#cFFFFFF"), Class681.ak);
      this.lj.setText("召唤兽");
      this.add(this.lj);
      Class529[] var5 = new Class529[var10001];
      boolean var10003 = true;
      this.ma = var5;

      int var2;
      Class84 var4;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ma.length; var10000 = var2) {
         Class529[] var3 = this.ma;
         Class529 var10002 = new Class529;
         int var10005 = 5 >> 2;
         var10006 = (5 >> 2) + var2;
         Font var10007 = Class681.bm;
         Class84 var13;
         String var10009;
         if (var2 == 0) {
            var10009 = "宠";
            var13 = this;
         } else if (var2 == --1) {
            var10009 = "";
            var13 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "";
            var13 = this;
         } else if (var2 == --3) {
            var10009 = "顶";
            var13 = this;
         } else if (var2 == --4) {
            var10009 = "底";
            var13 = this;
         } else if (var2 == --5) {
            var10009 = "保存设置";
            var13 = this;
         } else {
            var10009 = "";
            var13 = this;
         }

         var10002.<init>("sc/e/40.png", var10005, var10006, var10007, (Color[])null, var10009, var13);
         var3[var2] = var10002;
         if (var2 == 0) {
            var4 = this;
            this.ma[var2].setBounds(8073 & 24951, 122 & 79, 58 & 87, 58 & 87);
         } else if (var2 == 5 >> 2) {
            var4 = this;
            this.ma[var2].setImage("sc/e/47.png");
            this.ma[var2].setBounds(26029 & 6995, 18131 & 14764, 127 & 18, 127 & 18);
         } else if (var2 == 5 >> 1) {
            var4 = this;
            this.ma[var2].setImage("sc/e/48.png");
            this.ma[var2].setBounds(257, 157, 18, 18);
         } else if (var2 == --3) {
            var4 = this;
            this.ma[var2].setBounds(257, 211, 18, 18);
         } else if (var2 == --4) {
            var4 = this;
            this.ma[var2].setBounds(257, 240, 18, 18);
         } else {
            if (var2 == --5) {
               this.ma[var2].setImage("sc/e/28.png");
               this.ma[var2].setBounds(47, 333, 85, 18);
            }

            var4 = this;
         }

         var4.add(this.ma[var2++]);
      }

      var10001 = --3;
      this.mb = new ArrayList();
      this.lu = new JList();
      this.lu.setBackground(Class681.cu);
      this.lu.setSelectionMode(5 >> 3);
      this.af = Class133.f(47, 47, 200, 279, this.lu, 20);
      this.add(this.af);
      <undefinedtype>[] var6 = new <undefinedtype>[var10001];
      var10003 = true;
      this.me = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.me.length; var10000 = var2) {
         <undefinedtype>[] var11 = this.me;
         var10001 = var2;
         MouseListener var7 = new MouseListener(var2, this) {
            private Class436 uc;
            private JLabel d;
            private int bn;
            private int m;

            public void ab(int var1) {
               this.m = var1;
               this.uc.fw(var1 == 0 ? "sc/e/29.png" : "sc/e/30.png");
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.bn == 0) {
                  Class84.this.s();
               } else {
                  if (this.bn == 5 >> 1) {
                     Class84.this.aej.systemData.setB6((boolean)(this.m != 0 ? 4 ^ 5 : 0));
                     Class84.this.aej.systemData.setValue();
                     this.ab(this.m == 0 ? 4 ^ 5 : 0);
                     Class84.this.aej.getBattleControl().u();
                  }

               }
            }

            public {
               int var10002 = 65 & 127;
               this.bn = var2;
               this.d = Class133.c(var10002, (32638 & 487) + var2 * (23 & 126), 2462 & 30455, 93 & 51, 58 & 79, Color.black, Class681.bu);
               this.d.setText(var2 == 0 ? "开启支援列表" : (var2 == (2 ^ 3) ? "锁定首发召唤兽" : (var2 == (1 ^ 3) ? "战斗界面显示支援" : "")));
               this.uc = new Class436("sc/e/29.png");
               this.uc.setBounds(47 & 127, (10751 & 22374) + var2 * (119 & 30), 113 & 31, 113 & 31);
               Class84 var10000;
               if (var2 == (4 ^ 5)) {
                  var10000 = var3;
                  this.ab(5 >> 2);
               } else {
                  this.uc.addMouseListener(this);
                  var10000 = var3;
               }

               var10000.add(this.d);
               var3.add(this.uc);
            }
         };
         ++var2;
         var11[var10001] = var7;
      }

      Class436[] var10 = new Class436[--2];
      var10003 = true;
      this.ce = var10;

      for(var10000 = var2 = 3 & 4; var10000 < this.ce.length; var10000 = var2) {
         this.ce[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.ce[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(2 & 5)));
            this.ce[var2].setBounds(47, 26, 200, 21);
         } else {
            if (var2 == (3 & 5)) {
               this.ce[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(2 & 5)));
               this.ce[var2].setBounds(47, 26, 200, 300);
            }

            var4 = this;
         }

         var4.add(this.ce[var2++]);
      }

   }

   public void dg() {
      if (this.mc != null) {
         int var1 = this.lu.getComponentCount();
         ArrayList var2 = new ArrayList();

         int var10000;
         int var3;
         for(var10000 = var3 = 2 & 5; var10000 < this.mb.size(); var10000 = var3) {
            var2.add((Class581)this.mb.get(var3++));
         }

         for(var10000 = var3 = this.mc.length - (5 >> 2); var10000 >= 0; var10000 = var3) {
            this.gp(this.mc[var3--], var2);
         }

         for(var10000 = var3 = 3 & 4; var10000 < var2.size() && var3 < var1; var10000 = var3) {
            ((Class581)var2.get(var3)).ab(var3 + (3 & 5));
            Class581 var4 = (Class581)var2.get(var3);
            int var10001 = 3 >> 2;
            int var10002 = (117 & 30) * var3;
            ++var3;
            var4.setBounds(var10001, var10002, 28404 & 4543, 116 & 31);
         }

         this.mb = var2;
      }
   }

   public void o() {
      RoleData var1 = this.vd();
      if (this.ay == 0) {
         this.me[3 >> 2].ab(var1.b() ? --1 : 0);
      } else {
         if (this.ay == --1) {
            this.me[3 ^ 3].ab(var1.ak() ? 3 >> 1 : 0);
         }

      }
   }

   public void q() {
      if (this.vd() != null) {
         this.me[--2].ab(this.aej.systemData.j() ? 3 ^ 3 : 1);
         this.as(this.ay);
         super.q();
      }
   }

   public void dp(int var1) {
      if (this.md != null) {
         int var2 = this.md.ae();
         int var3 = var1 == 0 ? var2 - (2 ^ 3) : (var1 == (4 ^ 5) ? var2 + --1 : (var1 == (1 ^ 3) ? --1 : this.lu.getComponentCount()));
         if (var3 >= 5 >> 2 && var3 <= this.lu.getComponentCount()) {
            Class581 var6 = (Class581)this.mb.get(var3 - (5 >> 2));
            long var4 = this.md.gl();
            String var7 = this.md.fa().getText();
            this.md.is(var6.gl(), var6.fa().getText());
            var6.is(var4, var7);
            this.gi(var6);
         }
      }
   }

   public void p() {
      List var1 = this.gq(2 & 5);
      this.md = null;
      this.lu.removeAll();

      int var10000;
      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < this.mb.size(); var10000 = var2) {
         ((Class581)this.mb.get(var2++)).q();
      }

      List var6 = this.vd().bi();
      int var3 = 2 & 5;
      int var4 = var6.size();

      for(var10000 = var3; var10000 < var4; var10000 = var3) {
         RolePet var5;
         if ((var5 = (RolePet)var6.get(var3)).getHelp() != 0 && (var1 == null || !var1.contains(var5.getId()))) {
            this.v(var5.getPet());
         }

         ++var3;
      }

      this.dg();
      this.lu.setPreferredSize(new Dimension(246 & 32701, (126 & 21) * this.lu.getComponentCount()));
      this.o();
   }

   public void as(int var1) {
      if (var1 == -4 >> 2) {
         var1 = this.ay == 0 ? 2 ^ 3 : 0;
      }

      this.ay = var1;
      this.lj.setText(this.ay == 0 ? "召唤兽" : "灵宝");
      this.ma[3 ^ 3].setText(this.ay == 0 ? "宠" : "灵");
      this.me[2 ^ 3].d.setText(this.ay == 0 ? "锁定首发召唤兽" : "锁定首发灵宝");
      if (this.ay == 0) {
         this.p();
      } else {
         this.go();
      }
   }

   public void fn(Lingbao var1) {
      int var10002;
      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.mb.size(); var10000 = var2) {
         Class581 var3;
         if ((var3 = (Class581)this.mb.get(var2)).gl() == 0L) {
            var10002 = 3 ^ 3;
            var3.ab(var2 + --1);
            var3.fn(var1);
            var3.setBounds(var10002, (29 & 118) * var2, 19637 & 13310, 61 & 86);
            this.lu.add(var3);
            return;
         }

         ++var2;
      }

      Class581 var4 = new Class581(this);
      var10002 = 3 & 4;
      var4.ab(this.lu.getComponentCount() + --1);
      var4.fn(var1);
      var4.setBounds(var10002, (84 & 63) * this.lu.getComponentCount(), 2743 & 30204, 125 & 22);
      this.mb.add(var4);
      this.lu.add(var4);
   }

   public void gp(BigDecimal var1, List<Class581> var2) {
      int var3 = 5 >> 3;
      int var4 = var2.size();

      for(int var10000 = var3; var10000 < var4; var10000 = var3) {
         if (((Class581)var2.get(var3)).gl() == var1.longValue()) {
            var2.add(3 & 4, (Class581)var2.remove(var3));
            return;
         }

         ++var3;
      }

   }

   public List<BigDecimal> gq(int var1) {
      this.lc = (boolean)(this.aej.getBattleScene() != null && this.aej.getClient().gameBattle ? 4 ^ 5 : 0);
      this.mc = null;
      ArrayList var4 = null;
      if (this.lc) {
         RoleData var3 = this.vd();
         BattleScene var2;
         Class514 var5 = (var2 = this.aej.getBattleScene()) != null ? var2.getBattleUnit(2 & 5, var3.getRoleId()) : null;
         if (var5 != null) {
            var4 = new ArrayList();
            List var8 = var5.bt().g(var1 == 0 ? "召唤兽" : "灵宝");

            int var7;
            for(int var10000 = var7 = 5 >> 3; var10000 < var8.size(); var10000 = var7) {
               if (((TypeState)var8.get(var7)).getState() != 0) {
                  int var6 = Integer.parseInt(((TypeState)var8.get(var7)).getType());
                  var4.add(new BigDecimal(var6));
               }

               ++var7;
            }

            if (var1 == 0) {
               this.mc = var5.bt().petIds;
               return var4;
            }

            if (var1 == 3 >> 1) {
               this.mc = var5.bt().lingIds;
            }
         }
      }

      return var4;
   }

   public void gi(Class581 var1) {
      int var10000 = 3 ^ 3;
      this.md = var1;

      for(int var2 = var10000; var10000 < this.mb.size(); var10000 = var2) {
         Class581 var3;
         (var3 = (Class581)this.mb.get(var2)).fa().setForeground(var1 == var3 ? Color.RED : Color.green);
         ++var2;
      }

   }

   public void s() {
      RoleData var1 = this.vd();
      Class84 var10000;
      if (this.ay == 0) {
         var1.setHelpPet((boolean)(var1.b() ? 5 >> 3 : 1));
         var10000 = this;
         var1.ax();
      } else {
         var1.setHelpLing((boolean)(var1.ak() ? 3 ^ 3 : 1));
         var10000 = this;
         var1.bd();
      }

      if (var10000.lc) {
         this.d();
      }

      this.o();
   }

   public void y(int var1) {
      this.ay = var1;
   }

   public void d() {
      RoleData var4;
      if (!this.lc) {
         var4 = this.vd();
         if (this.ay == 0) {
            var4.setHelpBB(this.gr());
         } else {
            var4.setHelpLB(this.gr());
         }
      } else {
         var4 = this.vd();
         BigDecimal[] var2;
         if ((var2 = this.gr()).length != 0) {
            StringBuffer var3;
            (var3 = new StringBuffer()).append(this.ay == 0 ? 7 & 127 : 8);
            if (this.ay == 0) {
               var3.append(var4.b() ? 2 ^ 3 : 0);
            } else {
               var3.append(var4.ak() ? --1 : 0);
            }

            int var1;
            for(int var10000 = var1 = 0; var10000 < var2.length; var10000 = var1) {
               var3.append("|");
               var3.append(var2[var1++]);
            }

            String var5 = Agreement.getSendTextAES("1", var3.toString());
            this.aej.getClient().d(var5);
            BattleScene var7;
            Class514 var6 = (var7 = this.aej.getBattleScene()) != null ? var7.getBattleUnit(3 >> 2, this.vd().getRoleId()) : null;
            if (var6 != null) {
               if (this.ay == 0) {
                  var6.bt().petIds = var2;
                  return;
               }

               if (this.ay == 5 >> 2) {
                  var6.bt().lingIds = var2;
               }
            }

         }
      }
   }

   public BigDecimal[] gr() {
      BigDecimal[] var10000 = new BigDecimal[this.lu.getComponentCount()];
      boolean var10002 = true;
      BigDecimal[] var1 = var10000;

      int var2;
      for(int var3 = var2 = 5 >> 3; var3 < var1.length; var3 = var2) {
         int var10001 = var2;
         BigDecimal var4 = new BigDecimal(((Class581)this.mb.get(var2)).gl());
         ++var2;
         var1[var10001] = var4;
      }

      return var1;
   }
}
