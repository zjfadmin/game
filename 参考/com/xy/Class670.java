package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.HandleGood;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class670 extends Class345 {
   private Class217 bai;
   private Class319 ht;
   private BigDecimal ahf;
   private Class44 zq;
   private JLabel[] fb;
   private int gc;
   private Class643[] azi;
   private BigDecimal ge;
   private int ay;
   private Class436[] be;
   private int bn;
   private Class136[] baj;
   private String rf;

   public void z(long var1, JTextField var3) {
   }

   public Class670(GameView var1) {
      int var10001 = --4;
      int var10005 = -4 >> 2;
      super(31911 & 1018, --3, Class345.aef, var1);
      this.va(var10005, 2 & 5, 19178 & 13823, 255 & 32698, Class345.aei);
      this.uv(Class511.q("sc/d/1.png", 102 & 93, 102 & 93, 102 & 93, 102 & 93, (boolean)(3 >> 2)), (String)null);
      Class643[] var5 = new Class643[var10001];
      boolean var10003 = true;
      this.azi = var5;

      int var2;
      Class670 var4;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.azi.length; var10000 = var2) {
         Class643[] var3 = this.azi;
         Class643 var10002 = new Class643;
         var10005 = 4 ^ 5;
         int var10006 = (1011 & 31887) + var2;
         Font var10007 = Class681.ak;
         String var10009;
         Class670 var10010;
         if (var2 == 0) {
            var10009 = "最小";
            var10010 = this;
         } else if (var2 == (4 ^ 5)) {
            var10009 = "最大";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "取消";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "确定";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/6.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         if (var2 != 0 && var2 != 3 >> 1) {
            if (var2 == --2 || var2 == --3) {
               this.azi[var2].setImage("sc/e/7.png");
               this.azi[var2].setBounds((49 & 110) + (111 & 127) * (var2 - --2), 15867 & 17036, 59 & 127, 91 & 61);
               this.azi[var2].setForeground(Color.black);
            }

            var4 = this;
         } else {
            var4 = this;
            this.azi[var2].setBounds((97 & 62) + (29919 & 2984) * var2, 103 & 127, 59 & 102, 95 & 50);
            this.azi[var2].setFont(Class681.bm);
         }

         var4.add(this.azi[var2++]);
      }

      JLabel[] var6 = new JLabel[--3];
      var10003 = true;
      this.fb = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.fb.length; var10000 = var2) {
         JLabel[] var8 = this.fb;
         int var10 = 55 & 88;
         Color var11;
         int var12;
         if (var2 == (4 ^ 5)) {
            var11 = Color.red;
            var12 = var2;
         } else {
            var11 = Color.white;
            var12 = var2;
         }

         var8[var2] = Class133.b(21, var10, 192, 21, var11, var12 == 0 ? Class681.ak : Class681.q);
         this.fb[var2].setText(var2 == 0 ? "一键使用" : (var2 == 3 >> 1 ? "学习交流练习" : (var2 == --2 ? "123,456" : "")));
         if (var2 == 0) {
            var4 = this;
            this.fb[var2].setHorizontalAlignment(5 >> 3);
         } else {
            if (var2 >= 3 >> 1 && var2 <= --2) {
               this.fb[var2].setHorizontalAlignment(10);
               this.fb[var2].setBounds(84, 51 + (var2 - (3 >> 1)) * 21, 150, 16);
            }

            var4 = this;
         }

         var4.add(this.fb[var2++]);
      }

      var10001 = 5 >> 1;
      this.bai = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)), Class681.q, Color.white);
      this.bai.setBounds(70, 103, 94, 19);
      this.add(this.bai);
      this.ht = new Class319(15, this.bai, this);
      this.zq = new Class44(this);
      this.zq.ad(Class44.ary);
      this.zq.setBounds(31, 47, 45, 45);
      this.zq.fw("sc/d/51.png");
      this.add(this.zq);
      Class436[] var7 = new Class436[var10001];
      var10003 = true;
      this.be = var7;

      for(var10000 = var2 = 3 & 4; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.be[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
            this.be[var2].setBounds(21, 16, 192, 21);
         } else {
            if (var2 == 3 >> 1) {
               this.be[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
               this.be[var2].setBounds(21, 16, 192, 152);
            }

            var4 = this;
         }

         var4.add(this.be[var2++]);
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         int var2;
         if (this.gc == (47 & 91)) {
            var2 = (int)this.vd().getLoginResult().getContribution().longValue();
            if (this.bn != var2) {
               this.bn = var2;
               this.fb[--2].setText("驯养次数:" + var2 / this.ay);
               return;
            }
         } else if (this.gc == (126 & 13)) {
            var2 = this.vd().ae(this.baj);
            if (this.bn != var2) {
               this.bn = var2;
               this.fb[--2].setText("可兑换次数:" + var2 / this.ay);
               return;
            }
         } else {
            Goodstable var3;
            if (this.gc == (15 & 125)) {
               if ((var3 = this.vd().getGood(this.ahf)) == null) {
                  this.ve().n(this.ae());
                  return;
               }

               if (this.bn != var3.getUsetime()) {
                  this.bn = var3.getUsetime();
                  this.fb[5 >> 1].setText("可兑换次数:" + this.bn / this.ay);
                  return;
               }
            } else {
               if ((var3 = this.vd().getGood(this.ge)) == null) {
                  this.ve().n(this.ae());
                  return;
               }

               if (this.bn != var3.getUsetime()) {
                  this.bn = var3.getUsetime();
                  this.fb[1 ^ 3].setText("拥有数量:" + this.bn / this.ay);
               }
            }
         }
      }

   }

   public void arc(int var1, BigDecimal var2, Goodstable var3) {
      int var10002 = 2 ^ 3;
      this.rf = null;
      this.baj = null;
      this.gc = var1;
      this.ahf = var2;
      this.ge = var3.getRgid();
      this.bn = var3.getUsetime();
      this.ay = var10002;
      if (var3.getType() == 118L) {
         this.ay = Math.max(this.ay, Class394.an(var3.getValue(), "需要数量=", "|"));
      }

      var10002 = 23471 & 9428;
      this.zq.c(--1, var3);
      this.fb[3 & 5].setText(var3.getGoodsname());
      this.fb[--2].setText("拥有数量:" + this.bn / this.ay);
      this.y(var10002);
      this.ve().a(this.ae());
   }

   public void ard(BigDecimal var1, Class136[] var2, Goodstable var3) {
      int var10002 = 29902 & 2997;
      int var10007 = --1;
      int var10015 = 95 & 44;
      this.rf = null;
      this.gc = var10015;
      this.ahf = var1;
      this.baj = var2;
      this.bn = this.vd().ae(var2);
      this.ay = var10007;
      this.zq.c(3 >> 1, var3);
      this.fb[4 ^ 5].setText(var3.getGoodsname());
      this.fb[5 >> 1].setText("可兑换次数:" + this.bn);
      this.y(var10002);
      this.ve().a(this.ae());
   }

   public void y(int var1) {
      if (var1 == (27803 & 5095)) {
         this.bai.setText("1");
      } else {
         Goodstable var2;
         int var3;
         if (var1 == (32151 & 748)) {
            if (this.gc != (123 & 15) && this.gc != (45 & 94) && this.gc != (47 & 93)) {
               if ((var2 = this.vd().getGood(this.ge)) != null) {
                  var3 = var2.getUsetime();
                  if (var2.getType() == 118L && var2.getGoodsid().intValue() != 81229 && Class394.p(var2.getValue(), "读条=", "|") == 0L) {
                     var3 = Math.min(10 & 127, var3);
                  }

                  this.bai.setText(String.valueOf(var3));
               }
            } else {
               this.bai.setText(String.valueOf(this.bn / this.ay));
            }
         } else if (var1 == (16895 & 16005)) {
            this.ve().n(this.ae());
         } else {
            if (var1 == (3263 & 29638)) {
               if (this.gc == (95 & 43)) {
                  int var15 = Math.min((int)this.ht.gl(), this.bn / this.ay);
                  var3 = this.rf.equals("批量驯养参战召唤兽亲密") ? 61 & 119 : (this.rf.equals("批量驯养坐骑经验") ? 54 & 127 : (this.rf.equals("批量驯养坐骑技能熟练度") ? 119 & 63 : (this.rf.equals("批量驯养灵宝契合") ? 124 & 59 : (this.rf.equals("批量驯养灵宝经验") ? 61 & 123 : (this.rf.equals("批量驯养首个参战法宝经验") ? 127 & 58 : 0)))));
                  if (var15 > 0 && var3 != 0) {
                     String var19 = Agreement.getSendTextAES("gangbattle", var3 + "|" + this.ahf + "|" + var15);
                     this.uw().d(var19);
                     this.ve().n(this.ae());
                     return;
                  }

                  this.aej.fw("数量不能为0");
                  return;
               }

               if (this.gc == (31 & 108)) {
                  RoleData var13 = this.vd();
                  if ((var3 = Math.min((int)this.ht.gl(), var13.ae(this.baj))) <= 0) {
                     this.aej.fw("数量不能为0");
                     return;
                  }

                  Goodstable var18;
                  if ((var18 = this.vc().n(this.ahf)) != null && var13.getGoodPackSum(var18.getType(), var18.getGoodsid(), var3) >= var3) {
                     Class136[] var23 = new Class136[this.baj.length];
                     boolean var10002 = true;
                     Class136[] var20 = var23;

                     for(int var24 = var1 = 3 ^ 3; var24 < var20.length; var24 = var1) {
                        int var10001 = var1;
                        Class136 var25 = new Class136(this.baj[var1].a, this.baj[var1].b * (long)var3);
                        ++var1;
                        var20[var10001] = var25;
                     }

                     List var16;
                     if ((var16 = var13.aa(var20)) == null) {
                        this.aej.fw("物品不足");
                        return;
                     }

                     PartJade var22;
                     (var22 = new PartJade(10L, this.ahf.intValue())).setJade1(var3);
                     SuitOperBean var7 = new SuitOperBean();
                     var7.setType(21);
                     var7.setJade(var22);
                     var7.setGoods(var13.br(var16));
                     String var8 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var7));
                     this.uw().d(var8);
                     this.ve().n(this.ae());
                     return;
                  }

                  this.aej.fw("背包已满");
                  return;
               }

               String var12;
               if (this.gc == 13) {
                  if ((var2 = this.vd().getGood(this.ahf)) == null) {
                     this.aej.fw("物品已不存在");
                     return;
                  }

                  if ((var3 = Math.min((int)this.ht.gl(), var2.getUsetime() / this.ay)) <= 0) {
                     this.aej.fw("数量不能为0");
                     return;
                  }

                  PartJade var17 = new PartJade(var2.getRgid().longValue(), var3);
                  SuitOperBean var5 = new SuitOperBean();
                  var5.setType(24);
                  var5.setJade(var17);
                  var12 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var5));
                  this.uw().d(var12);
                  this.ve().n(this.ae());
                  return;
               }

               if ((var2 = this.vd().getGood(this.ge)) == null) {
                  this.aej.fw("物品已不存在");
                  return;
               }

               if ((var3 = Math.min((int)this.ht.gl(), var2.getUsetime() / this.ay)) <= 0) {
                  this.aej.fw("数量不能为0");
                  return;
               }

               long var4 = var2.getType();
               Class670 var10000;
               if (this.gc == 0) {
                  if (var4 == 814L) {
                     HandleGood.d(var2, this.vd(), var3);
                     this.ve().n(this.ae());
                     return;
                  }

                  if (var4 != 88L && var4 != 112L && var4 != 151L && !GoodType.ae(var4) && !GoodType.t(var4)) {
                     if (var4 == 132L) {
                        Class472 var14 = (Class472)this.ux().getFormManagement().e(27);
                        var14.ew(var2, var3);
                        this.ve().n(this.ae());
                        return;
                     }

                     if (var4 == 118L) {
                        if (this.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 3 & 5) == 0) {
                           this.aej.fw("你的背包已满");
                           return;
                        }

                        long var21;
                        if ((var21 = Class394.p(var2.getValue(), "读条=", "|")) > 0L) {
                           this.aej.getGameReadBar().setReadBar(var3, --3, "(" + var3 + ")开启" + var2.getGoodsname(), (double)Math.max(300L, var21), Class280.l(), var2.getRgid());
                           this.ve().n(this.ae());
                           return;
                        }

                        var2.ab(var3 * this.ay);
                        if (var2.getUsetime() <= 0) {
                           this.vd().h(var2.getRgid());
                        }
                     } else {
                        var2.ab(var3 * this.ay);
                        if (var2.getUsetime() <= 0) {
                           this.vd().h(var2.getRgid());
                        }
                     }
                  }

                  var12 = Agreement.getSendTextAES("user", var2.getRgid().toString() + "|" + var3);
                  var10000 = this;
                  this.aej.getClient().d(var12);
               } else {
                  String var6;
                  if (this.gc == --1) {
                     RoleSummoning var11;
                     if ((var11 = this.vd().getPet(this.ahf)) == null) {
                        this.aej.fw("召唤兽已不存在");
                        return;
                     }

                     if (var4 == 715L) {
                        if (var11.getFriendliness() >= 20000000L) {
                           this.aej.f("该召唤兽的亲密值已满！");
                           return;
                        }
                     } else if (var4 != 2040L && var4 != 1005L && var4 == 2323L && var11.getPetSkills().indexOf("3034") == -4 >> 2) {
                        this.aej.f("该召唤兽没有???");
                        return;
                     }

                     var6 = Agreement.getSendTextAES("userpet", var2.getRgid().toString() + "|" + var11.getSid() + "|" + var3);
                     var10000 = this;
                     this.aej.getClient().d(var6);
                  } else {
                     label220: {
                        if (this.gc != 5 >> 1) {
                           if (this.gc == --3) {
                              Baby var10;
                              if ((var10 = this.vd().getBaby(this.ahf)) == null) {
                                 this.aej.fw("孩子已不存在");
                                 return;
                              }

                              if (var4 != 133L) {
                              }

                              var6 = Agreement.getSendTextAES("userbaby", var2.getRgid() + "|" + var10.getBabyid() + "|" + var3);
                              var10000 = this;
                              this.aej.getClient().d(var6);
                              break label220;
                           }

                           if (this.gc == --4) {
                              Lingbao var9;
                              if ((var9 = this.vd().getLingbao(this.ahf)) == null) {
                                 this.aej.fw("灵宝或法宝已不存在");
                                 return;
                              }

                              var6 = Agreement.getSendTextAES("userling", var2.getRgid() + "|" + var9.getBaoid() + "|" + var3);
                              this.aej.getClient().d(var6);
                           }
                        }

                        var10000 = this;
                     }
                  }
               }

               var10000.ve().n(this.ae());
            }

         }
      }
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else if (this.gc != (43 & 95) && this.gc != (127 & 12) && this.gc != (127 & 13)) {
         if (this.ge == null) {
            return 0L;
         } else {
            Goodstable var5;
            if ((var5 = this.vd().getGood(this.ge)) == null) {
               return 0L;
            } else {
               int var4 = var5.getUsetime() / this.ay;
               if (var5.getType() == 118L && var5.getGoodsid().intValue() != 81229 && Class394.p(var5.getValue(), "读条=", "|") == 0L) {
                  var4 = Math.min(106 & 31, var4);
               }

               return var1 > (long)var4 ? (long)var4 : null;
            }
         }
      } else {
         return var1 > (long)(this.bn / this.ay) ? (long)(this.bn / this.ay) : null;
      }
   }

   public void eb(BigDecimal var1, String var2) {
      int var10002 = 28852 & 4047;
      int var10007 = 24543 & 9724;
      int var10015 = 95 & 43;
      this.baj = null;
      this.gc = var10015;
      this.ahf = var1;
      this.rf = var2;
      this.bn = (int)this.vd().getLoginResult().getContribution().longValue();
      this.ay = var10007;
      this.zq.c(59 & 84, 32751 & 2035);
      this.fb[3 & 5].setText(var2.substring(5 >> 1));
      this.fb[--2].setText("驯养次数:" + this.bn / this.ay);
      this.y(var10002);
      this.ve().a(this.ae());
   }

   public void ax(Goodstable var1) {
      if (var1.getType() == 721L) {
         int var10002 = --1;
         int var10008 = 45 & 95;
         this.rf = null;
         this.gc = var10008;
         this.ahf = var1.getRgid();
         this.bn = var1.getUsetime();
         this.ay = var10002;
         this.zq.c(3 & 5, var1);
         if (var1.getType() == 721L) {
            this.ay = --3;
            this.fb[3 >> 1].setText("兑换灵元晶");
         }

         var10002 = 5318 & 27581;
         this.fb[5 >> 1].setText("可兑换次数:" + this.bn / this.ay);
         this.y(var10002);
         this.ve().a(this.ae());
      }
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(--1);
   }
}
