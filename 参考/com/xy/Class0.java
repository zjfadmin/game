package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.PalacePkBean;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Class0 extends Class345 {
   private JLabel[] fx;
   private <undefinedtype>[] aqe;
   private long agt;
   private RichLabel[] aqf;
   private long wj;
   private Class436 eq;
   private JTextArea aqg;
   private Class319 aqh;
   private PalacePkBean aqi;
   private int ay;
   private Class322[] kn;
   private long lp;
   private Class217[] dc;
   private Class436 ih;

   public void z(long var1, JTextField var3) {
      if (this.ay == 0 || this.ay == (2 ^ 3)) {
         if (this.aqe[--3].bb) {
            this.wj = var1;
            this.fx[24 & 111].setText("消耗金钱：" + var1 + "两");
            return;
         }

         if (this.aqe[--4].bb) {
            this.agt = var1;
            this.fx[91 & 45].setText("消耗仙玉：" + var1 + "仙玉");
            return;
         }

         if (this.aqe[--5].bb) {
            this.lp = var1;
            this.fx[95 & 42].setText("消耗经验：" + var1 + "经验");
         }
      }

   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 >> 1);
   }

   public Long x(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else if (this.ay != 0 && this.ay != (4 ^ 5)) {
         return 0L;
      } else {
         LoginResult var4 = this.vd().getLoginResult();
         if (this.aqe[--3].bb) {
            if (var1 > var4.getGold().longValue()) {
               return var4.getGold().longValue();
            }
         } else if (this.aqe[--4].bb) {
            if (var1 > var4.getCodecard().longValue()) {
               return var4.getCodecard().longValue();
            }
         } else {
            if (!this.aqe[--5].bb) {
               return 0L;
            }

            if (var1 > var4.getExperience().longValue()) {
               return var4.getExperience().longValue();
            }
         }

         return null;
      }
   }

   public boolean t() {
      if (this.ay == --2 && this.aqi != null) {
         this.aqi.setType(1 ^ 3);
         String var1 = Agreement.getSendTextAES("bookofchalg", Class695.b().toJson(this.aqi));
         this.uw().d(var1);
         this.aqi = null;
      }

      return super.t();
   }

   public Class0(GameView var1) {
      int var10001 = --2;
      int var10005 = -4 >> 2;
      super(66 & 127, 5 >> 1, Class345.aef, var1);
      this.wj = 0L;
      this.agt = 0L;
      this.lp = 0L;
      this.va(var10005, 5 >> 3, 32190 & 1019, 11143 & 22010, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 127 & 68, 127 & 68, 127 & 68, 127 & 68, (boolean)(5 >> 3)), "决斗下战书");
      Class322[] var5 = new Class322[var10001];
      boolean var10003 = true;
      this.kn = var5;

      int var3;
      int var10000;
      for(var10000 = var3 = 3 >> 2; var10000 < this.kn.length; var10000 = var3) {
         Class322[] var4 = this.kn;
         Class322 var10002 = new Class322;
         var10005 = --1;
         int var10006 = (1694 & 31229) + var3;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class0 var10010;
         if (var3 == 0) {
            var10009 = "确 认";
            var10010 = this;
         } else if (var3 == --1) {
            var10009 = "取 消";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/26.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var4[var3] = var10002;
         this.kn[var3].setBounds((121 & 118) + (7858 & 25055) * var3, 9685 & 23422, 123 & 103, 31 & 121);
         this.add(this.kn[var3++]);
      }

      JLabel[] var6 = new JLabel[27 & 111];
      var10003 = true;
      this.fx = var6;

      for(var10000 = var3 = 3 >> 2; var10000 < this.fx.length; var10000 = var3) {
         this.fx[var3] = Class133.b(115 & 62, 125 & 30, 29997 & 3070, 31 & 115, Color.black, Class681.bu);
         this.fx[var3].setText(var3 == 0 ? "输入决斗对象名字：" : (var3 == --1 ? "投入" : (var3 == (1 ^ 3) ? "下战书" : (var3 == --3 ? "发送铃铛" : (var3 == --4 ? "银两" : (var3 == --5 ? "仙玉" : (var3 == (86 & 47) ? "人物经验" : (var3 == 7 ? "单位" : (var3 == 8 ? "消耗金钱：0两" : (var3 == 9 ? "消耗仙玉：0仙玉" : (var3 == 10 ? "消耗经验：0经验" : "")))))))))));
         this.fx[var3].setHorizontalAlignment(10);
         this.add(this.fx[var3]);
         if (var3 == 0) {
            this.fx[var3].setFont(Class681.ak);
         } else if (var3 == --1) {
            this.fx[var3].setBounds(85, 65, 36, 17);
         } else if (var3 == 5 >> 1) {
            this.fx[var3].setBounds(85, 159, 54, 17);
         } else if (var3 == --3) {
            this.fx[var3].setBounds(85, 182, 72, 17);
         } else if (var3 >= --4 && var3 <= 6) {
            this.fx[var3].setBounds(106 + (var3 - --4) * 80, 89, 72, 17);
         } else if (var3 == 7) {
            this.fx[var3].setFont(Class681.al);
            this.fx[var3].setBounds(192, 112, 40, 19);
         } else if (var3 >= 8 && var3 <= 10) {
            this.fx[var3].setForeground(Color.red);
            this.fx[var3].setFont(Class681.bm);
            this.fx[var3].setBounds(233, 111 + (var3 - 8) * 16, 200, 14);
         }

         ++var3;
      }

      RichLabel[] var7 = new RichLabel[--3];
      var10003 = true;
      this.aqf = var7;

      Class0 var8;
      for(var10000 = var3 = 3 & 4; var10000 < this.aqf.length; var10000 = var3) {
         if (var3 == 0) {
            var8 = this;
            this.aqf[var3] = new RichLabel((String)null, Class681.ab);
            this.aqf[var3].setTextSize("#c000000(战书将公告全服,#cFF0000花费5,000,000两#c000000)", 230);
            this.aqf[var3].setBounds(134, 156, this.aqf[var3].getWidth(), this.aqf[var3].getHeight());
         } else if (var3 == 5 >> 2) {
            var8 = this;
            this.aqf[var3] = new RichLabel((String)null, Class681.ab);
            this.aqf[var3].setTextSize("#c000000(勾选后扣除#cFF0000100仙玉#c000000)", 230);
            this.aqf[var3].setBounds(151, 179, this.aqf[var3].getWidth(), this.aqf[var3].getHeight());
         } else {
            if (var3 == (1 ^ 3)) {
               this.aqf[var3] = new RichLabel((String)null, Class681.al);
               this.aqf[var3].setTextSize("#c000000决斗警示：#r1、下注金额将全额归属决斗胜方。#r2、下注经验在决斗结束后，失败方损失所下注的经验。", 360);
               this.aqf[var3].setBounds(55, 279, this.aqf[var3].getWidth(), this.aqf[var3].getHeight());
            }

            var8 = this;
         }

         var8.add(this.aqf[var3++]);
      }

      Class217[] var10 = new Class217[5 >> 1];
      var10003 = true;
      this.dc = var10;

      for(var10000 = var3 = 3 >> 2; var10000 < this.dc.length; var10000 = var3) {
         this.dc[var3] = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)), Class681.q, Color.white);
         this.dc[var3].setBounds(203, 28, 132, 19);
         this.add(this.dc[var3]);
         if (var3 == --1) {
            this.dc[var3].setBounds(86, 112, 104, 19);
         } else if (var3 == (1 ^ 3)) {
            this.dc[var3].setBounds(77, 205, 324, 49);
         }

         ++var3;
      }

      this.aqh = new Class319(15, this.dc[3 & 5], this);
      this.ih = new Class436(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.aqg = Class133.d(Class681.q, Color.white);
      this.aqg.setBounds(79, 207, 320, 45);
      this.ih.setBounds(77, 205, 324, 49);
      this.add(this.aqg);
      this.add(this.ih);
      <undefinedtype>[] var11 = new <undefinedtype>[6];
      var10003 = true;
      this.aqe = var11;

      for(var10000 = var3 = 5 >> 3; var10000 < this.aqe.length; var10000 = var3) {
         this.aqe[var3] = new MouseListener() {
            private Class436 av;
            private boolean bb;
            private int m;

            public void mouseClicked(MouseEvent var1) {
               if (this.m == 0) {
                  if (Class0.this.ay == 0 || Class0.this.ay == (2 ^ 3)) {
                     if (this.bb) {
                        Class0 var10000 = Class0.this;
                        Class0 var10001 = Class0.this;
                        Class0.this.lp = 0L;
                        var10001.agt = 0L;
                        var10000.wj = 0L;
                        Class0.this.fx[90 & 45].setText("消耗金钱：0两");
                        Class0.this.fx[105 & 31].setText("消耗仙玉：0仙玉");
                        Class0.this.fx[47 & 90].setText("消耗经验：0经验");
                        Class0.this.aqe[--3].ak((boolean)(3 ^ 3));
                        Class0.this.aqe[--4].ak((boolean)(2 & 5));
                        Class0.this.aqe[--5].ak((boolean)(3 ^ 3));
                        Class0.this.fx[95 & 39].setText((String)null);
                        Class0.this.dc[5 >> 2].setText((String)null);
                     }

                     this.ak((boolean)(this.bb ? 3 ^ 3 : 1));
                     return;
                  }
               } else {
                  if (this.m == (2 ^ 3) || this.m == 5 >> 1) {
                     this.ak((boolean)(this.bb ? 3 & 4 : 1));
                     return;
                  }

                  if ((this.m == --3 || this.m == --4 || this.m == --5) && (Class0.this.ay == 0 || Class0.this.ay == (2 ^ 3)) && Class0.this.aqe[5 >> 3].bb) {
                     Class0.this.aqe[--3].ak((boolean)(this.m == --3 ? 3 & 5 : 0));
                     Class0.this.aqe[--4].ak((boolean)(this.m == --4 ? 5 >> 2 : 0));
                     Class0.this.aqe[--5].ak((boolean)(this.m == --5 ? --1 : 0));
                     Class0.this.fx[111 & 23].setText(this.m == --3 ? "两" : (this.m == --4 ? "仙玉" : "经验"));
                     Class0.this.dc[4 ^ 5].setText(String.valueOf(this.m == --3 ? Class0.this.wj : (this.m == 4 ? Class0.this.agt : Class0.this.lp)));
                  }
               }

            }

            public void mousePressed(MouseEvent var1) {
            }

            public void ak(boolean var1) {
               this.bb = var1;
               if (this.m < --3) {
                  this.av.fw(var1 ? "sc/e/30.png" : "sc/e/29.png");
               } else {
                  this.av.fw(var1 ? "sc/e/62.png" : "sc/e/63.png");
               }
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
            }
         };
         this.aqe[var3].m = var3;
         Class436 var2 = new Class436();
         if (var3 == 0) {
            var8 = this;
            var2.setBounds(66, 65, 17, 17);
         } else if (var3 == --1) {
            var8 = this;
            var2.setBounds(66, 158, 17, 17);
         } else if (var3 == 5 >> 1) {
            var8 = this;
            var2.setBounds(66, 182, 17, 17);
         } else {
            var2.setBounds(86 + 80 * (var3 - 3), 89, 18, 18);
            var8 = this;
         }

         var8.aqe[var3].av = var2;
         this.aqe[var3].ak((boolean)(var3 < 4 ? --1 : 0));
         var2.addMouseListener(this.aqe[var3++]);
         this.add(var2);
      }

      this.eq = new Class436(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 & 4)));
      this.eq.setBounds(54, 54, 360, 226);
      this.add(this.eq);
   }

   public void ahl(int var1, PalacePkBean var2) {
      this.ay = var1;
      this.aqi = var2;
      this.aqg.setText("");
      this.fx[63 & 71].setText("");
      this.wj = this.agt = this.lp = 0L;
      this.fx[24 & 111].setText("消耗金钱：0两");
      this.fx[59 & 77].setText("消耗仙玉：0仙玉");
      this.fx[43 & 94].setText("消耗经验：0经验");
      Class217 var10000 = this.dc[5 >> 3];
      int var10002 = 3 & 4;
      int var3 = 3 & 4;
      var10000.setVisible((boolean)var10002);

      for(var1 = var10002; var3 < this.aqe.length; var3 = var1) {
         this.aqe[var1++].ak((boolean)(4 ^ 5));
      }

      Class0 var4;
      if (this.ay == 0) {
         this.fx[3 >> 2].setText("输入决斗对象名字：");
         var4 = this;
         this.dc[3 >> 2].setText("");
         this.dc[3 >> 2].setVisible((boolean)(2 ^ 3));
         this.dc[--1].setEditable((boolean)(4 ^ 5));
         this.aqe[--3].ak((boolean)(2 & 5));
         this.aqe[--4].ak((boolean)(3 ^ 3));
         this.aqe[--5].ak((boolean)(5 >> 3));
         this.kn[3 >> 2].setText("确 认");
         this.kn[--1].setText("取 消");
      } else if (this.ay == (4 ^ 5)) {
         var4 = this;
         this.fx[3 ^ 3].setText("挑战成功者升为擂主");
         this.dc[2 ^ 3].setEditable((boolean)(5 >> 2));
         this.aqe[--3].ak((boolean)(3 & 4));
         this.aqe[--4].ak((boolean)(3 >> 2));
         this.aqe[--5].ak(false);
         this.kn[0].setText("确 认");
         this.kn[1].setText("取 消");
      } else if (this.ay == 5 >> 1) {
         var4 = this;
         this.dc[1].setEditable(false);
         this.fx[0].setText("【" + var2.getUsername() + "】玩家向你下达了战书");
         this.kn[0].setText("接受挑战");
         this.kn[1].setText("认怂投降");
      } else {
         if (this.ay == --3) {
            this.dc[1].setEditable(false);
            this.fx[0].setText("挑战成功者升为擂主");
            this.kn[0].setText("接受挑战");
            this.kn[1].setText("认怂投降");
         }

         var4 = this;
      }

      if (var4.ay == --2 || this.ay == --3) {
         this.wj = var2.getGold() != null ? var2.getGold().longValue() : 0L;
         this.agt = var2.getXianyu() != null ? var2.getXianyu().longValue() : 0L;
         this.lp = var2.getExp() != null ? var2.getExp().longValue() : 0L;
         this.fx[72 & 63].setText("消耗金钱：" + this.wj + "两");
         this.fx[29 & 107].setText("消耗仙玉：" + this.agt + "仙玉");
         this.fx[123 & 14].setText("消耗经验：" + this.lp + "经验");
      }

      this.dc[1].setText("");
      this.ve().a(this.ae());
   }

   public void y(int var1) {
      if (var1 == (15516 & 17407)) {
         if (!this.aej.t()) {
            LoginResult var9 = this.vd().getLoginResult();
            String var3 = this.dc[2 & 5].getText().trim();
            String var4 = this.aqg.getText().trim();
            if (this.wj < 10000000L && this.agt < 1000L) {
               this.aej.f("大话币最低下注金额： 1千万大话币。或者仙玉最低下注金额： 1000仙玉。");
            } else if (this.wj > var9.getGold().longValue()) {
               this.aej.f("大话币不足以支付投入金额");
            } else if (this.agt > var9.getCodecard().longValue()) {
               this.aej.f("仙玉不足以支付投入仙玉");
            } else if (this.lp > var9.getExperience().longValue()) {
               this.aej.f("经验不足以支付投入经验");
            } else {
               long var5 = this.wj;
               long var7 = this.agt;
               if (this.aqe[4 ^ 5].bb && (var5 += 20000000L) > var9.getGold().longValue()) {
                  this.aej.f("大话币不足以支付全服公告金额");
               } else if ((var5 += 2000000L) > var9.getGold().longValue()) {
                  this.aej.f("大话币不足以战书费用");
               } else if (this.aqe[5 >> 1].bb && (var7 += 100L) > var9.getCodecard().longValue()) {
                  this.aej.f("仙玉不足以支付铃铛金额");
               } else {
                  if (this.ay == 0) {
                     if (Class394.o(var3)) {
                        this.aej.f("请输入您要挑战者的名称。");
                        return;
                     }

                     if (var3.equals(var9.getRolename())) {
                        this.aej.f("您不能挑战自己！！");
                        return;
                     }
                  } else if (this.ay == (4 ^ 5)) {
                     if (this.wj > 1000000000L) {
                        this.aej.f("最高下注金额： 10亿大话币。");
                        return;
                     }

                     if (this.agt > 100000L) {
                        this.aej.f("仙玉最高下注金额： 10万仙玉。");
                        return;
                     }
                  } else if (this.ay != 5 >> 1) {
                  }

                  PalacePkBean var11 = new PalacePkBean();
                  PalacePkBean var10000;
                  if (this.ay == 0) {
                     int var10002 = 5 >> 3;
                     var10000 = var11;
                     var11.setUsername(var3);
                     var11.setType(var10002);
                  } else {
                     label141: {
                        if (this.ay == (4 ^ 5)) {
                           var11.setType(127 & 11);
                           Long var10 = ((Class472)this.aej.getFormManagement().e(127 & 27)).lj();
                           var11.setNtype(var10 != null ? var10.intValue() : 0);
                           if (var11.getNtype() < (8703 & 24574) || var11.getNtype() > (7082 & 26199)) {
                              var10000 = var11;
                              var11.setNtype(8191 & 25086);
                              break label141;
                           }
                        } else {
                           if (this.ay == --2) {
                              var10000 = var11;
                              var11.setType(2 ^ 3);
                              var11.setPId(this.aqi.getPId());
                              break label141;
                           }

                           if (this.ay == --3) {
                              var11.setType(2 ^ 3);
                              var11.setPId(this.aqi.getPId());
                           }
                        }

                        var10000 = var11;
                     }
                  }

                  var10000.setGold(new BigDecimal(this.wj));
                  var11.setXianyu(new BigDecimal(this.agt));
                  var11.setExp(new BigDecimal(this.lp));
                  var11.setSendStr(this.aqe[1 ^ 3].bb ? var4 : null);
                  var11.setChoices(var11.getChoices() + ((this.aqe[--1].bb ? --1 : 0) << 0));
                  var11.setChoices(var11.getChoices() + ((this.aqe[--2].bb ? 4 ^ 5 : 0) << 0));
                  String var6 = Agreement.getSendTextAES("bookofchalg", Class695.b().toJson(var11));
                  this.uw().d(var6);
               }
            }
         }
      } else {
         if (var1 == (12511 & 20413)) {
            if (this.ay == (1 ^ 3) && this.aqi != null) {
               this.aqi.setType(5 >> 1);
               String var2 = Agreement.getSendTextAES("bookofchalg", Class695.b().toJson(this.aqi));
               this.uw().d(var2);
               this.aqi = null;
            }

            this.ve().n(127 & 66);
         }

      }
   }
}
