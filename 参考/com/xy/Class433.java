package com.xy;

import com.xy.formula.MsgUntil;
import com.xy.game.GameUtil;
import com.xy.game.HandleEquip;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Class433 extends Class345 {
   private Class393[] axr;
   private Class19 up;
   private Class436 eq;
   private Class186[] axs;
   private Class393[] axt;
   private Class585 alb;
   private Class393[] axu;
   private Class393[] axv;
   private Class393[] axw;
   private Class436 bl;
   private <undefinedtype>[] axx;

   public void q() {
      this.d();
      this.p();
      super.q();
   }

   public Class585 anc() {
      return this.alb;
   }

   public boolean t() {
      this.vd().bq();
      return super.t();
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.up != null) {
         this.up.a(var1, 10459 & 22527, 19126 & 13801, --4, Class280.l());
      }

   }

   public void p() {
      RoleData var1;
      RoleData var10000 = var1 = this.vd();
      long var2 = var10000.getLoginResult().getSpecies_id().longValue();
      Goodstable var4;
      long var5;
      if ((var4 = var10000.getGoodEquip(var10000.goodChoses[3 & 4])) != null && (var5 = (long)GameUtil.e(Integer.parseInt(var4.getSkin()))) != 0L) {
         var2 |= (var5 += 18L) << (117 & 42);
      }

      Class433 var7;
      if (this.up == null) {
         this.up = Class330.ai(var2, --2, 4 ^ 5, (String)null);
         var7 = this;
      } else {
         this.up = Class330.w(this.up, --1, String.valueOf(var2));
         var7 = this;
      }

      var7.y(var1.getPackRecord().getEquipType());
   }

   public Class433(GameView var1) {
      int var10001 = 111 & 28;
      int var10005 = -4 >> 2;
      super(1 ^ 3, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 2 & 5, 16798 & 16381, 14317 & 18935, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 127 & 68, 127 & 68, 127 & 68, 127 & 68, (boolean)(5 >> 3)), "物品栏");
      <undefinedtype>[] var6 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.axx = var6;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.axx.length; var10000 = var2) {
         this.axx[var2] = new Class44(var2, this) {
            private BigDecimal co;
            private int m;

         
            private void p() {
               int var10001 = --1;
               int var10005 = 3 ^ 3;
               this.co = null;
               this.c(var10005, (Object)null);
               this.s();
               this.ars.ve().n(63 & 110);
               this.setVisible((boolean)var10001);
            }

            public {
               this.m = var2;
               this.s();
               if (var2 == 0) {
                  this.setBounds(45 & 126, 95 & 119, 123 & 63, 61 & 123);
               } else if (var2 == --1) {
                  this.setBounds(126 & 103, 63 & 95, 127 & 59, 57 & 127);
               } else if (var2 == --2) {
                  this.setBounds(4475 & 28623, 63 & 95, 127 & 59, 61 & 123);
               } else if (var2 == --3) {
                  this.setBounds(111 & 118, 95 & 119, 127 & 59, 127 & 57);
               } else if (var2 == --4) {
                  this.setBounds(331, 143, 59, 57);
               } else if (var2 == --5) {
                  this.setBounds(102, 143, 59, 57);
               } else if (var2 == 6) {
                  this.setBounds(273, 31, 59, 57);
               } else if (var2 == 7) {
                  this.setBounds(273, 143, 59, 57);
               } else if (var2 == 8) {
                  this.setBounds(44, 31, 59, 57);
               } else if (var2 == 9) {
                  this.setBounds(44, 143, 59, 57);
               } else if (var2 == 10) {
                  this.setBounds(273, 87, 59, 57);
               } else {
                  if (var2 == 11) {
                     this.setBounds(331, 87, 59, 57);
                  }

               }
            }

            public void mouseReleased(MouseEvent var1) {
               super.mouseReleased(var1);
               if (Class433.this.aej.getBattleScene() == null) {
                  RoleData var2;
                  RoleData var10000 = var2 = Class433.this.vd();
                  Goodstable var3;
                  if ((var3 = var10000.getGoodEquip(var10000.goodChoses[this.m])) != null) {
                     if (!Class433.this.ux().t()) {
                        if (var1.getButton() == --3 && Class433.this.aej.getMouseIndex() == Class320.l) {
                           if (HandleEquip.c(var2, this.m, (Goodstable)null)) {
                              this.p();
                              return;
                           }
                        } else if (var1.getButton() == (3 & 5)) {
                           if (Class433.this.aej.getMouseIndex() == Class320.g) {
                              if (var3.getGoodlock() == (2 ^ 3)) {
                                 Class433.this.aej.fw("该物品已加锁");
                                 return;
                              }

                              int var10001 = 3 ^ 3;
                              var3.setGoodlock(3 & 5);
                              ParamTool.g(var3, var10001, Class433.this.aej.getClient());
                              Class433.this.aej.setMouseIndex(Class320.l);
                              Class433.this.aej.fw("加锁成功");
                              return;
                           }

                           if (Class433.this.aej.getMouseIndex() == Class320.m) {
                              if (var3.getGoodlock() == 0) {
                                 Class433.this.aej.fw("该物品未加锁");
                                 return;
                              }

                              int var10003 = 5 >> 3;
                              var3.setGoodlock(5 >> 3);
                              ParamTool.g(var3, var10003, Class433.this.aej.getClient());
                              Class433.this.aej.setMouseIndex(Class320.l);
                              Class433.this.aej.fw("解锁成功");
                           }
                        }

                     }
                  }
               }
            }

            protected void paintComponent(Graphics var1) {
               Goodstable var2;
               <undefinedtype> var3;
               label25: {
                  RoleData var10000 = Class433.this.vd();
                  if ((var2 = var10000.getGoodEquip(var10000.goodChoses[this.m])) != null) {
                     if (this.co != var2.getRgid()) {
                        int var10002 = --1;
                        var3 = this;
                        this.co = var2.getRgid();
                        this.c(var10002, var2);
                        break label25;
                     }
                  } else if (this.co != null) {
                     this.p();
                  }

                  var3 = this;
               }

               var3.paintComponent(var1);
               if (var2 != null && var2.getGoodlock() == 5 >> 2) {
                  var1.drawImage(Class222.u, 58 & 111, --5, (ImageObserver)null);
               }

               if (this.aqz) {
                  int var10001 = --3;
                  int var10003 = 1 ^ 3;
                  var1.setColor(Color.white);
                  var1.drawRect(var10003, --2, this.getWidth() - --4, this.getHeight() - --4);
                  var1.drawRect(var10001, --3, this.getWidth() - (23 & 110), this.getHeight() - (47 & 86));
               }

            }

            public void s() {
               if (this.m == 0) {
                  this.fx("sc/d/7.png");
               } else if (this.m == (3 & 5)) {
                  this.fx("sc/d/6.png");
               } else if (this.m == --2) {
                  this.fx("sc/d/12.png");
               } else if (this.m == --3) {
                  this.fx("sc/d/8.png");
               } else if (this.m == --4) {
                  this.fx("sc/d/15.png");
               } else if (this.m == --5) {
                  this.fx("sc/d/10.png");
               } else if (this.m == (110 & 23)) {
                  this.fx("sc/d/11.png");
               } else if (this.m == (63 & 71)) {
                  this.fx("sc/d/14.png");
               } else if (this.m == (108 & 27)) {
                  this.fx("sc/d/5.png");
               } else if (this.m == (25 & 111)) {
                  this.fx("sc/d/9.png");
               } else if (this.m == (27 & 110)) {
                  this.fx("sc/d/13.png");
               } else {
                  if (this.m == (31 & 107)) {
                     this.fx("sc/d/13.png");
                  }

               }
            }

            public void mousePressed(MouseEvent var1) {
               super.mousePressed(var1);
               if (var1.getButton() == (2 ^ 3)) {
                  RoleData var10000 = Class433.this.vd();
                  Goodstable var2;
                  if ((var2 = var10000.getGoodEquip(var10000.goodChoses[this.m])) == null) {
                     return;
                  }

                  if (var1.isShiftDown()) {
                     try {
                        JTextField var4;
                        ((Class175)(var4 = Class433.this.ux().getBaseView().jj()).getDocument()).arf(var4.getCaretPosition(), 1 ^ 3, var2.getRgid(), "[" + var2.getGoodsname() + "]", "G", (AttributeSet)null);
                        return;
                     } catch (BadLocationException var3) {
                        var3.printStackTrace();
                        return;
                     }
                  }
               }

            }
         };
         this.axx[var2].fw("sc/d/4.png");
         this.axx[var2].ad(Class44.arh);
         this.add(this.axx[var2++]);
      }

      var10001 = --4;
      this.bl = new Class436();
      this.bl.eq(Class511.q("sc/d/16.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(2 & 5)));
      this.bl.setBounds(20399 & 12531, 63 & 95, 126 & 109, 405 & 32511);
      this.add(this.bl);
      Class393[] var8 = new Class393[var10001];
      var10003 = true;
      this.axr = var8;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.axr.length; var10000 = var2) {
         this.axr[var2] = new Class393(var2 == 0 ? "sc/e/1.png" : (var2 == 5 >> 2 ? "sc/e/2.png" : (var2 == (1 ^ 3) ? "sc/e/3.png" : (var2 == --3 ? "sc/e/4.png" : ""))), 1, 1 + var2, this);
         this.axr[var2].setBounds((23479 & 9467) + (92 & 55) * var2, 25087 & 7863, 22 & 123, 22 & 123);
         this.add(this.axr[var2++]);
      }

      var8 = new Class393[--5];
      var10003 = true;
      this.axt = var8;

      Class393[] var7;
      Class393 var10;
      int var10006;
      Font var10007;
      String var10009;
      Class433 var10010;
      for(var10000 = var2 = 3 & 4; var10000 < this.axt.length; var10000 = var2) {
         var7 = this.axt;
         var10 = new Class393;
         var10005 = --1;
         var10006 = var2 == --4 ? 123 & 28 : 5 + var2;
         var10007 = Class681.bm;
         if (var2 == 0) {
            var10009 = "存款";
            var10010 = this;
         } else if (var2 == (4 ^ 5)) {
            var10009 = "摆摊";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "装扮";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "检查";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "清包";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10.<init>("sc/e/6.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var7[var2] = var10;
         this.axt[var2].setOffsetTexts(Class681.am);
         Class433 var9;
         if (var2 == 0) {
            this.axt[var2].setBounds(29183 & 3773, 20958 & 12019, 58 & 103, 18);
            var9 = this;
         } else {
            this.axt[var2].setBounds(190 + 50 * var2, 206, 34, 18);
            var9 = this;
         }

         var9.add(this.axt[var2++]);
      }

      for(var10000 = var2 = 3 >> 1; var10000 < this.axt.length; var10000 = var2) {
         Class393 var12 = this.axt[var2];
         var10001 = 190 + 40 * var2;
         ++var2;
         var12.setBounds(var10001, 206, 34, 18);
      }

      if (this.uw().gamePawn) {
         this.axt[--3].setText("包裹");
      }

      var8 = new Class393[--3];
      var10003 = true;
      this.axu = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.axu.length; var10000 = var2) {
         this.axu[var2] = new Class393("sc/e/28.png", 3 & 5, 11 + var2, Class681.bm, (Color[])null, "装备" + MsgUntil.b(var2 + (5 >> 2)), this);
         this.axu[var2].setBounds(310, 255 + var2 * 17, 68, 17);
         this.axu[var2].setVisible((boolean)(3 & 4));
         this.add(this.axu[var2++]);
      }

      Class186[] var11 = new Class186[--2];
      var10003 = true;
      this.axs = var11;

      for(var10000 = var2 = 5 >> 3; var10000 < this.axs.length; var10000 = var2) {
         JLabel var5 = Class133.c(43, 209 + var2 * 24, 36, 19, 3 & 4, Color.black, Class681.ak);
         Class556 var4 = Class133.m(79, 209 + var2 * 24, 144, 19, 10, Color.white, Class681.ce, (MoneyType)null, var1);
         var4.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
         this.add(var5);
         this.add(var4);
         this.axs[var2] = new Class186(var5, var4);
         MoneyType var3 = new MoneyType();
         var3.setId(var2 == 0 ? 5 >> 2 : (var2 == (4 ^ 5) ? 1 ^ 3 : 0));
         var3.setKey(var2 == 0 ? "现金" : (var2 == --1 ? "师贡" : ""));
         var5.setText(var3.getKey());
         ++var2;
         var4.xa(var3);
         var4.ab(--3);
      }

      var8 = new Class393[2];
      var10003 = true;
      this.axw = var8;

      for(var10000 = var2 = 0; var10000 < this.axw.length; var10000 = var2) {
         var7 = this.axw;
         var10 = new Class393;
         var10006 = 9 + var2;
         var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         if (var2 == 0) {
            var10009 = "整理";
            var10010 = this;
         } else if (var2 == 1) {
            var10009 = "换装";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10.<init>("sc/e/7.png", 1, var10006, var10007, var10008, var10009, var10010);
         var7[var2] = var10;
         this.axw[var2].setBounds(240 + 75 * var2, 230, 59, 25);
         this.add(this.axw[var2++]);
      }

      this.eq = new Class436();
      this.eq.eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, false));
      this.eq.setBounds(45, 260, 309, 207);
      this.add(this.eq);
      this.alb = new Class585(this, 6, 4, 51, 51, 0, 0, 46, 262);
      this.alb.hf(Class511.a("sc/d/18.png"));
      this.alb.gb(true);
      this.add(this.alb);
   }

   public void s() {
      int var1 = this.axu[2 & 5].isVisible() ? 5 >> 3 : 1;

      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.axu.length; var10000 = var2) {
         this.axu[var2++].setVisible((boolean)var1);
      }

   }

   public void y(int var1) {
      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.axu.length; var10000 = var2) {
         this.axu[var2].setForeground(var2 == var1 ? Color.red : Color.white);
         ++var2;
      }

   }

   public void d() {
      Class216[] var10001;
      Class433 var10002;
      if (this.alb.aiz() != null) {
         var10001 = this.alb.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (62 & 89), this.alb.t(), 3 & 4, 11251 & 21870, 8157 & 24870);
      this.alb.aiw(var1, 5 >> 3);
   }
}
