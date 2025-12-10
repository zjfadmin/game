package com.xy;

import com.xy.bean.GiveGoodsBean;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.readbean.Bbuy;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class381 extends Class345 {
   private Class529 ala;
   private Class436 ec;
   private Class585 alb;
   private BigDecimal aaq;
   private Class319[] ahr;
   private Class292 alc;
   private int cy;
   private JLabel[] u;

   public void acz(Goodstable var1, int var2, Class572 var3) {
      GiveGoodsBean var4 = new GiveGoodsBean();
      int var10006 = --3;
      var4.setOtherID(new BigDecimal(var3.p.getI()));
      var4.setType(var10006);
      var4.setRgid(var1.getRgid());
      var4.setSum(var2);
      String var5 = Agreement.getSendTextAES("give", Class695.b().toJson(var4));
      this.uw().d(var5);
      this.d();
   }

   public void ada(Goodstable var1, int var2, Class165 var3) {
      Task var5;
      if ((var5 = this.vd().getTaskSystem().a("给予物品", var1.getGoodsname())) == null) {
         this.aej.f("对你的物品丝毫不感兴趣");
      } else {
         String var4 = Agreement.getSendTextAES("taskN", "G" + var5.getTaskId() + "|" + var1.getRgid() + "|" + var2);
         this.uw().d(var4);
         this.d();
      }
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else if (var3 == this.ahr[3 ^ 3].jj()) {
         RoleData var9 = this.vd();
         Goodstable var5 = this.aaq != null ? var9.getGood(this.aaq) : null;
         if (this.cy != (2 ^ 3) && this.cy != --2) {
            if (var5 == null) {
               return 0L;
            } else {
               return var1 > (long)var5.getUsetime() ? var5.getUsetime().longValue() : null;
            }
         } else if (var5 != null) {
            Bbuy var6;
            if ((var6 = this.vc().bs(var5.getGoodsid())) != null) {
               long var7 = var1 > (long)var5.getUsetime() ? var5.getUsetime().longValue() : var1;
               var7 *= this.cy == (4 ^ 5) ? var6.getPrice1() : var6.getPrice2();
               this.ahr[3 >> 1].jj().setText(String.valueOf(var7));
            }

            return var1 > (long)var5.getUsetime() ? var5.getUsetime().longValue() : null;
         } else {
            this.ahr[--1].jj().setText("0");
            return 0L;
         }
      } else if (var3 == this.ahr[3 >> 1].jj()) {
         if (this.cy != (2 ^ 3) && this.cy != (1 ^ 3)) {
            long var4 = this.vd().getLoginResult().getGold().longValue();
            return var1 > var4 ? var4 : null;
         } else {
            return null;
         }
      } else {
         return 0L;
      }
   }

   public void adc(int var1, Goodstable var2, int var3, Class165 var4) {
      Bbuy var6;
      if ((var6 = this.vc().bs(var2.getGoodsid())) != null && (var6.getPrice1() != 0L || var1 != (4 ^ 5)) && (var6.getPrice2() != 0L || var1 != 5 >> 1)) {
         GiveGoodsBean var7 = new GiveGoodsBean();
         var7.setType(var1);
         var7.setRgid(var2.getRgid());
         var7.setSum(var3);
         String var5 = Agreement.getSendTextAES("give", Class695.b().toJson(var7));
         this.uw().d(var5);
         this.d();
         this.bk(var2.getRgid());
      } else {
         this.aej.f("不属于回收范围");
      }
   }

   public void z(long var1, JTextField var3) {
   }

   public void o() {
      if (!this.aej.t() && this.alc != null) {
         RoleData var4 = this.vd();
         Goodstable var2 = this.aaq != null ? var4.getGood(this.aaq) : null;
         int var3 = Math.min((int)this.ahr[3 & 4].gl(), var2 != null ? var2.getUsetime() : 0);
         if (var2 != null && var2.getGoodlock() == --1) {
            this.aej.f("物品被加锁");
         } else if (this.alc instanceof Class183) {
            if (var2 != null && GoodType.e(var2)) {
               this.aej.f("物品无法给予");
            } else {
               this.ade(var2, var3, (Class183)this.alc);
            }
         } else if (var2 != null && var3 > 0) {
            if (this.alc instanceof Class165) {
               Class165 var1 = (Class165)this.alc;
               if (var4.getTaskSystem().getTaskGive(Integer.parseInt(var1.bb.getNpcid()))) {
                  this.ada(var2, var3, (Class165)this.alc);
               } else if (var1.bb.getNpctype().equals("71")) {
                  this.adc(2 ^ 3, var2, var3, (Class165)this.alc);
               } else if (var1.bb.getNpctype().equals("89")) {
                  this.adc(--2, var2, var3, (Class165)this.alc);
               } else {
                  this.aej.f("对你的物品丝毫不感兴趣");
               }
            } else {
               if (this.alc instanceof Class572) {
                  this.acz(var2, var3, (Class572)this.alc);
               }

            }
         } else {
            this.aej.f("没有选中的物品");
         }
      }
   }

   public void q() {
      this.s();
      super.q();
   }

   public Class381(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10008 = -4 >> 2;
      super(111 & 28, 5 >> 1, Class345.aef, var1);
      this.va(var10008, 2 & 5, 26601 & 6558, 9087 & 24055, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(3 & 4)), "给予");
      this.ala = new Class529("sc/e/7.png", 2 ^ 3, 121 & 79, Class681.ak, Class681.c, "给予", this);
      this.ala.setBounds(20797 & 12263, 5118 & 27923, 127 & 59, 123 & 29);
      this.add(this.ala);
      Class319[] var4 = new Class319[var10001];
      boolean var10003 = true;
      this.ahr = var4;

      int var3;
      int var10000;
      for(var10000 = var3 = 3 & 4; var10000 < this.ahr.length; var10000 = var3) {
         Class217 var2 = Class133.n(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)), Class681.q, Color.white);
         int var6 = 62 & 75;
         var2.setBounds(125 & 103, (926 & 32107) + var3 * (126 & 29), 6907 & 26014, 83 & 63);
         var2.setHorizontalAlignment(var6);
         this.add(var2);
         var4 = this.ahr;
         int var10002 = var3;
         Class319 var7 = new Class319(111 & 31, var2, this);
         ++var3;
         var4[var10002] = var7;
      }

      JLabel[] var5 = new JLabel[--4];
      var10003 = true;
      this.u = var5;

      for(var10000 = var3 = 3 & 4; var10000 < this.u.length; var10000 = var3) {
         this.u[var3] = Class133.c(43, 266 + 28 * var3, 58, 19, --4, Class681.c("#c000000"), Class681.ak);
         this.u[var3].setText(var3 == 0 ? "数 量" : (var3 == (2 ^ 3) ? "银 两" : (var3 == --2 ? "玩家：" : (var3 == --3 ? "学习交流" : ""))));
         this.add(this.u[var3]);
         if (var3 == 5 >> 1) {
            this.u[var3].setForeground(Class681.c("#cFF0000"));
            this.u[var3].setBounds(52, 325, 58, 19);
            this.u[var3].setHorizontalAlignment(10);
         }

         if (var3 == --3) {
            this.u[var3].setBounds(102, 325, 250, 19);
            this.u[var3].setHorizontalAlignment(10);
         }

         ++var3;
      }

      this.ec = new Class436();
      this.ec.eq(Class511.q("sc/d/19.png", 30, 30, 30, 30, (boolean)(2 & 5)));
      this.ec.setBounds(44, 46, 309, 207);
      this.add(this.ec);
      this.alb = new Class585(this, 6, --4, 51, 51, 3 & 4, 3 & 4, 45, 48) {
         protected void xx(Graphics var1, RoleData var2) {
            int var3;
            for(int var10000 = var3 = 3 >> 2; var10000 < this.asw.length; var10000 = var3) {
               if (this.ama != null) {
                  var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + (1 ^ 3), this.m + (1 ^ 3), (ImageObserver)null);
               }

               ++var3;
            }

         }

         protected void cm(Graphics var1, RoleData var2) {
            int var6 = this.ot();
            if (this.op && var6 >= this.tp() - this.asw.length) {
               this.xx(var1, var2);
            } else {
               boolean var4 = false;
               var1.setFont(Class681.ce);
               var1.setColor(Color.white);
               Class603 var5 = Class381.this.cy != 5 >> 2 && Class381.this.cy != 5 >> 1 ? null : Class381.this.vc();

               int var3;
               for(int var10000 = var3 = 2 & 5; var10000 < this.asw.length; var10000 = var3) {
                  int var8 = var3 + var6;
                  if (this.ama != null) {
                     var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + (5 >> 1), this.m + (1 ^ 3), (ImageObserver)null);
                  }

                  Goodstable var7;
                  if ((var7 = var2.getGood(var2.goodPacks[var8])) == null) {
                     if (this.asw[var3] != null) {
                        this.asw[var3].g();
                     }
                  } else {
                     if (this.asw[var3] == null || var7.getRgid() != this.asw[var3].i) {
                        if (this.asw[var3] == null) {
                           this.asw[var3] = new Class467();
                        }

                        this.asw[var3].d(var7);
                     }

                     <undefinedtype> var10;
                     if (var8 != this.gv) {
                        var10 = this;
                        Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (3 & 5), var3 / this.cy * this.gc + --1, this.bn, this.m);
                     } else {
                        Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
                        var10 = this;
                     }

                     if (var10.asw[var3].k != null) {
                        var1.drawString(this.asw[var3].k, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + (127 & 14));
                     }

                     if (this.asw[var3].a != null) {
                        var1.drawString(this.asw[var3].a, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + this.m - (1 ^ 3));
                     }

                     if (var7.getGoodlock() == --1) {
                        var1.drawImage(Class222.u, var3 % this.cy * this.dp + (111 & 52), var3 / this.cy * this.gc, 14 & 123, 47 & 92, (ImageObserver)null);
                     }

                     Bbuy var9;
                     if (var5 != null && (var9 = var5.bs(var7.getGoodsid())) != null && (Class381.this.cy == (4 ^ 5) && var9.getPrice1() != 0L || Class381.this.cy == --2 && var9.getPrice2() != 0L)) {
                        var1.drawImage(Class222.i, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + --4, 127 & 20, 127 & 20, (ImageObserver)null);
                     }

                     if (this.aeg && var8 == this.fk) {
                        var1.setColor(Color.red);
                        var1.drawRect(var3 % this.cy * this.dp + (5 >> 2), var3 / this.cy * this.gc + (3 >> 1), this.bn, this.m);
                        var1.drawRect(var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + (5 >> 1), this.bn - --2, this.m - (1 ^ 3));
                        var1.setColor(Color.white);
                     }
                  }

                  ++var3;
               }

            }
         }
      };
      this.alb.hf(Class511.a("sc/d/18.png"));
      this.alb.gb((boolean)(5 >> 2));
      this.alb.ak((boolean)(4 ^ 5));
      this.add(this.alb);
   }

   public void oj(Goodstable var1, boolean var2) {
      if (!Class394.v(this.aaq, var1.getRgid())) {
         this.aaq = var1.getRgid();
         this.ahr[3 >> 2].jj().setText(String.valueOf(3 & 4));
      }

      long var3 = var2 ? (long)var1.getUsetime() : this.ahr[5 >> 3].gl() + 1L;
      this.ahr[3 & 4].jj().setText(String.valueOf(var3));
   }

   public BigDecimal ez() {
      try {
         long var1;
         if ((var1 = this.ahr[2 ^ 3].gl()) <= 0L) {
            return new BigDecimal(3 & 4);
         } else {
            return this.vd().getLoginResult().getGold().longValue() < var1 ? null : new BigDecimal(var1);
         }
      } catch (Exception var3) {
         return null;
      }
   }

   public Class292 ls() {
      return this.alc;
   }

   public void add(Class292 var1) {
      this.p();
      Class381 var10000;
      if (var1 instanceof Class183) {
         var10000 = this;
         this.ahr[4 ^ 5].jj().setEditable((boolean)(3 & 5));
         this.u[1 ^ 3].setText("玩家:");
      } else if (var1 instanceof Class165) {
         RoleData var2 = this.vd();
         Class165 var3 = (Class165)var1;
         if (!var2.getTaskSystem().getTaskGive(Integer.parseInt(var3.bb.getNpcid()))) {
            if (var3.bb.getNpctype().equals("71")) {
               var10000 = this;
               this.cy = 3 >> 1;
            } else {
               if (!var3.bb.getNpctype().equals("89")) {
                  this.aej.f("他好像不想理你");
                  return;
               }

               this.cy = 5 >> 1;
               var10000 = this;
            }
         } else {
            var10000 = this;
         }

         var10000.ahr[2 ^ 3].jj().setEditable((boolean)(2 & 5));
         var10000 = this;
         this.u[5 >> 1].setText("NPC:");
      } else {
         if (var1 instanceof Class572) {
            this.ahr[4 ^ 5].jj().setEditable((boolean)(3 ^ 3));
            this.u[1 ^ 3].setText("限时收购:");
         }

         var10000 = this;
      }

      var10000.u[--3].setText(var1.aw());
      this.alc = var1;
      if (this.cy == 5 >> 2 || this.cy == (1 ^ 3)) {
         this.bk((BigDecimal)null);
      }

      this.ve().a(this.ae());
   }

   public void p() {
      this.cy = 2 & 5;
      this.d();
   }

   public void ade(Goodstable var1, int var2, Class183 var3) {
      BigDecimal var4;
      if ((var4 = this.ez()) == null) {
         this.aej.f("金钱不足");
      } else if (var1 != null || var4.longValue() > 0L) {
         GiveGoodsBean var5 = new GiveGoodsBean();
         var5.setType(5 >> 3);
         var5.setOtherID(var3.r.getRole_id());
         var5.setOtherName(var3.r.getRolename());
         var5.setRgid(var1 != null ? var1.getRgid() : null);
         var5.setSum(var2);
         var5.setGold(var4);
         String var6 = Agreement.getSendTextAES("give", Class695.b().toJson(var5));
         this.uw().d(var6);
         this.d();
      }
   }

   public void bk(BigDecimal var1) {
      int var7 = this.cy == (4 ^ 5) ? 3 & 5 : (this.cy == --2 ? 1 ^ 3 : 0);
      if (var7 != 0) {
         Class603 var6 = this.vc();
         RoleData var4 = this.vd();
         int var3;
         int var5;
         int var10000 = var3 = (var5 = this.alb.ot() + this.alb.aiy().length) - (31 & 120);

         while(true) {
            if (var10000 < var4.goodPacks.length && var3 < var5) {
               Goodstable var2;
               Bbuy var8;
               if ((var2 = var4.getGood(var4.goodPacks[var3])) == null || var1 != null && var2.getRgid().compareTo(var1) == 0 || var2.getGoodlock() == --1 || (var8 = var6.bs(var2.getGoodsid())) == null || (var7 != (2 ^ 3) || var8.getPrice1() == 0L) && (var7 != (1 ^ 3) || var8.getPrice2() == 0L)) {
                  ++var3;
                  var10000 = var3;
                  continue;
               }

               int var10002 = 3 & 5;
               this.alb.y(var3);
               this.oj(var2, (boolean)var10002);
               return;
            }

            return;
         }
      }
   }

   public void s() {
      Class216[] var10001;
      Class381 var10002;
      if (this.alb.aiz() != null) {
         var10001 = this.alb.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (127 & 24), this.alb.t(), 3 ^ 3, 14325 & 18795, 110 & 63);
      this.alb.aiw(var1, 5 >> 3);
   }

   public void d() {
      this.ahr[5 >> 3].jj().setText("0");
      this.ahr[3 >> 1].jj().setText("0");
      this.aaq = null;
      this.alb.y(-4 >> 2);
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 >> 1);
   }
}
