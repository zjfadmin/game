package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Class47 extends Class345 {
   private JLabel as;
   private Class44 qm;
   private Class585 ab;
   private Class643 qn;
   private <undefinedtype>[] qo;
   private Class19 qp;
   private Class436[] g;

   public void q() {
      if (this.vd() != null) {
         RoleSummoning var1;
         if ((var1 = this.vd().getChosePet()) != null) {
            this.d();
            this.v(var1);
            super.q();
         }
      }
   }

   public void v(RoleSummoning var1) {
      this.s();
      if (var1 != null) {
         RoleData var4;
         if ((var4 = this.vd()) != null) {
            this.as.setText(var1.getSummoningname());
            String var11 = var1.getStye();
            this.qp = var1.getPart(this.aej);
            if (var11 != null && var11.length() > (4 ^ 5)) {
               boolean var5 = true;
               String[] var2 = null;
               String[] var12 = var11.split("\\|");

               int var3;
               String[] var6;
               for(int var10000 = var3 = --1; var10000 < var12.length; var10000 = var3) {
                  Goodstable var7;
                  if ((var6 = var12[var3].split("-")).length >= (1 ^ 3) && (var7 = var4.getGoodEquip(new BigDecimal(var6[--1]))) != null) {
                     int var8 = Integer.parseInt(var6[2 & 5]);
                     this.qo[var8].ax(var7);
                     if (var8 != --3 && var5) {
                        String var10;
                        if ((var10 = MsgUntil.getValuesMessage(var7.getValue().split("\\|"), GoodType.Extras[--5])) != null) {
                           if (var2 == null) {
                              String[] var16 = new String[--3];
                              boolean var10002 = true;
                              var2 = var16;
                           }

                           var2[var8] = var10;
                        } else {
                           var5 = false;
                        }
                     }
                  }

                  ++var3;
               }

               if (var5 && var2 != null && var2[3 & 4] != null && var2[4 ^ 5] != null && var2[1 ^ 3] != null) {
                  String[] var13 = var2[3 ^ 3].split("&");
                  var6 = var2[--1].split("&");
                  String[] var14 = var2[--2].split("&");
                  if (var13[--1].equals(var6[--1]) && var13[--1].equals(var14[3 & 5])) {
                     BigDecimal var15 = MsgUntil.a(var13[1 ^ 3], var6[5 >> 1], var14[5 >> 1]);
                     BigDecimal var9 = MsgUntil.a(var13[--3], var6[--3], var14[--3]);
                     var13[--2] = var15.toString();
                     var13[--3] = var9.toString();
                     this.qm.c(47 & 89, var13);
                  }
               }

            }
         }
      }
   }

   public void s() {
      int var10000 = 3 ^ 3;
      this.as.setText((String)null);

      for(int var1 = var10000; var10000 < this.qo.length; var10000 = var1) {
         this.qo[var1++].ax((Goodstable)null);
      }

      this.qm.c(3 & 4, (Object)null);
      this.qm.fx("sc/d/56.png");
      this.qm.setVisible((boolean)(2 ^ 3));
      this.qp = null;
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.qp != null) {
         this.qp.a(var1, 25342 & 7607, 3577 & 29374, 5 >> 3, Class280.l());
      }

   }

   public boolean t() {
      this.s();
      return super.t();
   }

   public void d() {
      Class216[] var10001;
      Class47 var10002;
      if (this.ab.aiz() != null) {
         var10001 = this.ab.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (26 & 125), this.ab.t(), 5 >> 3, 14670 & 18431, 7465 & 25567);
      this.ab.aiw(var1, 3 & 4);
   }

   public Class47(GameView var1) {
      int var10001 = --4;
      int var10005 = 61 & 90;
      int var10008 = 2 & 5;
      int var10012 = -1 & -3;
      super(79 & 115, 5 >> 1, Class345.aef, var1);
      this.va(var10012, 2 & 5, 14199 & 18939, 18940 & 14327, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 71 & 124, 71 & 124, 71 & 124, 71 & 124, (boolean)(3 & 4)), (String)null);
      this.ak((boolean)var10008);
      this.ad(new Class116(3 & 4, 3 & 4, 31 & 107, 3 & 4));
      this.as = Class133.c(var10005, 115 & 45, 32695 & 382, 122 & 23, 5 >> 3, Class681.c("#c00FF00"), Class681.cd);
      this.add(this.as);
      this.qn = new Class643("sc/e/7.png", 2 ^ 3, 41 & 127, Class681.ak, Class681.c, "洗练", this);
      this.qn.setBounds(18071 & 14846, 1775 & 31223, 59 & 127, 27 & 125);
      this.add(this.qn);
      <undefinedtype>[] var4 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.qo = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.qo.length; var10000 = var2) {
         this.qo[var2] = new Class44(var2, this) {
            private int bn;
            private BigDecimal py;

            public void ax(Goodstable var1) {
               if (var1 == null) {
                  this.p();
               } else {
                  int var10001 = 3 >> 1;
                  this.py = var1.getRgid();
                  this.c(var10001, var1);
               }
            }

            public void mouseReleased(MouseEvent var1) {
               super.mouseReleased(var1);
               if (Class47.this.aej.getBattleScene() == null) {
                  RoleData var2;
                  Goodstable var3;
                  if ((var3 = (var2 = Class47.this.vd()).getGoodEquip(this.py)) != null) {
                     if (!Class47.this.ux().t()) {
                        if (var1.getButton() == --3 && Class47.this.aej.getMouseIndex() == Class320.l) {
                           RoleSummoning var4;
                           if ((var4 = this.ars.vd().getChosePet()) != null) {
                              HandlePet.c(var4, (Goodstable)null, this.bn, var2);
                           }
                        } else {
                           if (var1.getButton() == (4 ^ 5)) {
                              if (Class47.this.aej.getMouseIndex() == Class320.g) {
                                 if (var3.getGoodlock() == (2 ^ 3)) {
                                    Class47.this.aej.fw("该物品已加锁");
                                    return;
                                 }

                                 int var10001 = 3 ^ 3;
                                 var3.setGoodlock(--1);
                                 ParamTool.g(var3, var10001, Class47.this.aej.getClient());
                                 Class47.this.aej.setMouseIndex(Class320.l);
                                 Class47.this.aej.fw("加锁成功");
                                 return;
                              }

                              if (Class47.this.aej.getMouseIndex() == Class320.m) {
                                 if (var3.getGoodlock() == 0) {
                                    Class47.this.aej.fw("该物品未加锁");
                                    return;
                                 }

                                 int var10003 = 3 & 4;
                                 var3.setGoodlock(3 & 4);
                                 ParamTool.g(var3, var10003, Class47.this.aej.getClient());
                                 Class47.this.aej.setMouseIndex(Class320.l);
                                 Class47.this.aej.fw("解锁成功");
                              }
                           }

                        }
                     }
                  }
               }
            }

            public {
               this.bn = var2;
               this.s();
               if (var2 != 0 && var2 != (4 ^ 5) && var2 != (1 ^ 3)) {
                  if (var2 == --3) {
                     this.setBounds(24059 & 8981, 8443 & 24476, 127 & 45, 127 & 45);
                  }

               } else {
                  this.setBounds(46 & 121, (62 & 119) + var2 * (123 & 53), 125 & 47, 125 & 47);
               }
            }

         
            private void p() {
               int var10001 = --1;
               int var10005 = 3 & 4;
               this.py = null;
               this.c(var10005, (Object)null);
               this.s();
               this.ars.ve().n(46 & 127);
               this.setVisible((boolean)var10001);
            }

            public void mousePressed(MouseEvent var1) {
               super.mousePressed(var1);
               if (var1.getButton() == --1) {
                  Goodstable var2;
                  if ((var2 = Class47.this.vd().getGoodEquip(this.py)) == null) {
                     return;
                  }

                  if (var1.isShiftDown()) {
                     try {
                        JTextField var4;
                        ((Class175)(var4 = Class47.this.ux().getBaseView().jj()).getDocument()).arf(var4.getCaretPosition(), --2, var2.getRgid(), "[" + var2.getGoodsname() + "]", "G", (AttributeSet)null);
                        return;
                     } catch (BadLocationException var3) {
                        var3.printStackTrace();
                        return;
                     }
                  }
               }

            }

            public void s() {
               if (this.bn == 0) {
                  this.fx("sc/d/52.png");
               } else if (this.bn == --1) {
                  this.fx("sc/d/53.png");
               } else if (this.bn == (1 ^ 3)) {
                  this.fx("sc/d/54.png");
               } else {
                  if (this.bn == --3) {
                     this.fx("sc/d/55.png");
                  }

               }
            }
         };
         this.qo[var2].fw("sc/d/51.png");
         this.qo[var2].ad(Class44.ary);
         this.add(this.qo[var2++]);
      }

      var10001 = --3;
      this.qm = new Class44(this);
      this.qm.setBounds(29935 & 3002, 202, 24, 24);
      this.add(this.qm);
      Class436[] var5 = new Class436[var10001];
      var10003 = true;
      this.g = var5;

      for(var10000 = var2 = 3 >> 2; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         Class47 var3;
         if (var2 == 0) {
            var3 = this;
            this.g[var2].fw("sc/d/57.png");
            this.g[var2].setBounds(170, 202, 24, 24);
         } else if (var2 == --1) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
            this.g[var2].setBounds(25, 265, 309, 207);
         } else {
            if (var2 == (1 ^ 3)) {
               this.g[var2].eq(Class511.q("sc/d/50.png", 50, 50, 50, 50, (boolean)(5 >> 3)));
               this.g[var2].setBounds(24, 21, 310, 245);
            }

            var3 = this;
         }

         var3.add(this.g[var2++]);
      }

      this.ab = new Class585(this, 6, --4, 51, 51, 3 ^ 3, 3 ^ 3, 26, 267);
      this.ab.hf(Class511.a("sc/d/18.png"));
      this.ab.gb((boolean)(4 ^ 5));
      this.add(this.ab);
   }
}
