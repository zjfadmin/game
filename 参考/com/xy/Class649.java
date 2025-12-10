package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class649 extends Class345 {
   private Class436[] il;
   private Class44[] axf;
   private int ay;
   private JLabel[] hj;
   private int bn;
   private Class68 axg;
   private Class643 avm;

   public Class649(GameView var1) {
      int var10001 = 31 & 109;
      int var10008 = -4 >> 2;
      int var10010 = -4 >> 2;
      int var10012 = -4 >> 2;
      super(97 & 127, --2, Class345.aef, var1);
      this.bn = var10012;
      this.ay = var10010;
      this.va(var10008, 3 & 4, 22139 & 11190, 18931 & 14271, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 77 & 118, 77 & 118, 77 & 118, 77 & 118, (boolean)(3 ^ 3)), "斗转星移");
      this.avm = new Class643("sc/e/26.png", 2 ^ 3, 119 & 126, Class681.ak, Class681.c, "确认转移", this);
      this.avm.setBounds(21759 & 11250, 1469 & 31602, 107 & 119, 125 & 27);
      this.add(this.avm);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.hj = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.b((28911 & 4050) + var2 * (19966 & 13049), 127 & 111, 120 & 87, 17 & 126, Color.black, Class681.ce);
         this.hj[var2].setHorizontalAlignment(59 & 78);
         this.hj[var2].setText(var2 == 0 ? "青龙" : (var2 == (2 ^ 3) ? "白虎" : (var2 == 10 ? "可将副地煞星星阵中的青黄白黑宫其中一个转移到主地煞星上" : (var2 == 11 ? "去，转移后副地煞星将消失。" : (var2 == 12 ? "温馨提示：带有朱雀、玄武、白虎、青龙四种星阵的地煞星才可以斗转星移。" : "学习交流 学习练习临摹自学")))));
         this.add(this.hj[var2]);
         if (var2 >= --2 && var2 <= 9) {
            this.hj[var2].setForeground(Color.white);
            this.hj[var2].setBounds(83 + 248 * ((var2 - (5 >> 1)) / --4), 138 + 39 * ((var2 - --2) % --4), 200, 40);
         } else if (var2 >= 10 && var2 <= 11) {
            this.hj[var2].setFont(Class681.ak);
            this.hj[var2].setBounds(52, 20 + (var2 - 10) * 16, 480, 16);
         } else if (var2 == 12) {
            this.hj[var2].setFont(Class681.ab);
            this.hj[var2].setBounds(52, 399, 480, 16);
         }

         ++var2;
      }

      Class44[] var4 = new Class44[--2];
      var10003 = true;
      this.axf = var4;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.axf.length; var10000 = var2) {
         this.axf[var2] = new Class44(this);
         this.axf[var2].setBounds(134 + 248 * var2, 76, 50, 50);
         this.add(this.axf[var2++]);
      }

      Class436[] var5 = new Class436[22];
      var10003 = true;
      this.il = var5;

      for(var10000 = var2 = 2 & 5; var10000 < this.il.length; var10000 = var2) {
         this.il[var2] = new Class436();
         this.add(this.il[var2]);
         if (var2 != 0 && var2 != --1) {
            if (var2 != (1 ^ 3) && var2 != --3) {
               if (var2 >= --4 && var2 <= 11) {
                  this.il[var2].setBounds(61 + 248 * ((var2 - --4) / --4), 149 + 39 * ((var2 - --4) % 4), 18, 18);
                  this.il[var2].addMouseListener(new MouseListener(var2 - 4) {
                     private int cy;

                     public {
                        this.cy = var2;
                     }

                     public void mouseEntered(MouseEvent var1) {
                     }

                     public void mousePressed(MouseEvent var1) {
                        int var10000;
                        int var2;
                        if (this.cy < --4) {
                           if (Class649.this.bn != this.cy) {
                              Class649.this.bn = this.cy;

                              for(var10000 = var2 = 3 & 4; var10000 < 4; var10000 = var2) {
                                 Class649.this.il[var2 + --4].fw(Class649.this.bn == var2 ? "sc/e/67.png" : "sc/e/68.png");
                                 ++var2;
                              }

                           }
                        } else if (Class649.this.ay != this.cy - --4) {
                           Class649.this.ay = this.cy - --4;

                           for(var10000 = var2 = 3 & 4; var10000 < 4; var10000 = var2) {
                              Class649.this.il[var2 + (41 & 94)].fw(Class649.this.ay == var2 ? "sc/e/67.png" : "sc/e/68.png");
                              ++var2;
                           }

                        }
                     }

                     public void mouseClicked(MouseEvent var1) {
                     }

                     public void mouseReleased(MouseEvent var1) {
                     }

                     public void mouseExited(MouseEvent var1) {
                     }
                  });
               } else if (var2 >= 12 && var2 <= 19) {
                  this.il[var2].eq(Class511.q("sc/d/49.png", 5, 5, 5, 5, (boolean)(2 & 5)));
                  this.il[var2].setBounds(57 + 248 * ((var2 - 12) % 2), 138 + 39 * ((var2 - 12) / 2), 220, 40);
               } else if (var2 == 20) {
                  this.il[var2].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, (boolean)(2 & 5)));
                  this.il[var2].setBounds(53, 343, 462, 54);
               } else if (var2 == 21) {
                  this.il[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 >> 2)));
                  this.il[var2].setBounds(47, 59, 490, 284);
               }
            } else {
               this.il[var2].setBounds(193 + 248 * (var2 - (1 ^ 3)), 74, 30, 30);
            }
         } else {
            this.il[var2].fw("sc/d/4.png");
            this.il[var2].setBounds(130 + 248 * var2, 72, 59, 57);
         }

         ++var2;
      }

      this.axg = new Class68(this, 9, 3 >> 1, 51, 51, 3 ^ 3, 3 ^ 3, 54, 345);
      this.axg.hf(Class511.a("sc/d/18.png"));
      this.add(this.axg);
   }

   public void d() {
      RoleData var5 = this.vd();
      Goodstable var2 = (Goodstable)this.axf[3 & 4].hr();
      Goodstable var3 = (Goodstable)this.axf[3 >> 1].hr();
      if (var2 != null) {
         var2 = var5.getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = var5.getGood(var3.getRgid());
      }

      if (var2 != null && var3 != null && var2.getRgid().compareTo(var3.getRgid()) != 0) {
         if (var3.getStatus() == (2 ^ 3)) {
            this.aej.fw("副卡处于参战状态");
         } else {
            int var4 = this.bn;
            int var1 = this.ay;
            if (var4 != -4 >> 2 && var1 != -4 >> 2) {
               PartJade var9 = new PartJade((long)var4, var1);
               SuitOperBean var7 = new SuitOperBean();
               ArrayList var6;
               (var6 = new ArrayList()).add(var2.getRgid());
               var6.add(var3.getRgid());
               int var10006 = 122 & 61;
               var7.setGoods(var6);
               var7.setType(var10006);
               var7.setJade(var9);
               String var8 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var7));
               this.uw().d(var8);
               var5.h(var3.getRgid());
               Class95 var10;
               if ((var10 = (Class95)this.ve().m(95 & 127)) != null) {
                  var10.ax(var3);
               }

            } else {
               this.aej.fw("请选择主卡或者副卡要替换的星阵宫");
            }
         }
      } else {
         this.aej.fw("请选好主卡和副卡");
      }
   }

   public void amo(int var1, String[] var2, Goodstable var3) {
      if (var3 == null) {
         this.y(var1);
      } else {
         int var7;
         StringBuilder var9;
         JLabel var10;
         int var10000;
         String var10002;
         if (var1 == 0) {
            Class649 var12;
            label59: {
               String[] var6;
               if (var2 == null && (var6 = var3.getValue().split("\\|")).length >= --4) {
                  for(var10000 = var7 = (var6 = var6[--3].split("&")).length - (5 >> 2); var10000 >= 1; var10000 = var7) {
                     if (var6[var7].startsWith("星阵属性")) {
                        var2 = var6[var7].split("=");
                        var12 = this;
                        break label59;
                     }

                     --var7;
                  }
               }

               var12 = this;
            }

            var12.axf[2 & 5].c(3 >> 1, var3);
            var10000 = --4;
            int var11 = -4 >> 2;
            this.il[--2].hf(Class511.a("sc/skill/" + var2[--1] + ".png"));
            this.hj[3 >> 2].setText(var2[3 >> 1]);
            this.bn = var11;

            for(var1 = var10000; var10000 < var2.length; var10000 = var1) {
               this.il[var1].fw("sc/e/68.png");
               var10 = this.hj[var1 - (5 >> 1)];
               var9 = (new StringBuilder(String.valueOf(MsgUntil.getStarName(var1 - --3)))).append(" ");
               var10002 = var2[var1];
               ++var1;
               var10.setText(var9.append(var10002).toString());
            }

            this.y(3 >> 1);
            this.ve().a(this.ae());
         } else {
            Goodstable var5;
            if ((var5 = (Goodstable)this.axf[3 >> 2].hr()) != null) {
               var5 = this.vd().getGood(var5.getRgid());
            }

            if (var5 != null) {
               if (var3.getRgid().compareTo(var5.getRgid()) == 0) {
                  this.aej.fw("不能选择主卡");
               } else {
                  String[] var8;
                  label80: {
                     String[] var4;
                     if (var2 == null && (var4 = var3.getValue().split("\\|")).length >= --4) {
                        for(var10000 = var1 = (var4 = var4[--3].split("&")).length - (4 ^ 5); var10000 >= 1; var10000 = var1) {
                           if (var4[var1].startsWith("星阵属性")) {
                              var8 = var2 = var4[var1].split("=");
                              break label80;
                           }

                           --var1;
                        }
                     }

                     var8 = var2;
                  }

                  if (var8 != null && MsgUntil.k(var2[3 & 5])) {
                     int var10001 = -4 >> 2;
                     this.axf[4 ^ 5].c(5 >> 2, var3);
                     this.il[--3].hf(Class511.a("sc/skill/" + var2[2 ^ 3] + ".png"));
                     this.hj[3 >> 1].setText(var2[3 >> 1]);
                     this.ay = var10001;

                     for(var10000 = var7 = --4; var10000 < var2.length; var10000 = var7) {
                        this.il[var7 + --4].fw("sc/e/68.png");
                        var10 = this.hj[var7 + (5 >> 1)];
                        var9 = (new StringBuilder(String.valueOf(MsgUntil.getStarName(var7 - --3)))).append(" ");
                        var10002 = var2[var7];
                        ++var7;
                        var10.setText(var9.append(var10002).toString());
                     }

                  } else {
                     this.aej.fw("该星卡没有四神兽星阵");
                  }
               }
            }
         }
      }
   }

   public void y(int var1) {
      int var10000;
      int var10001;
      if (var1 == 0) {
         var10000 = 3 ^ 3;
         int var10002 = -4 >> 2;
         this.axf[3 & 4].c(3 ^ 3, (Object)null);
         this.il[--2].q();
         this.hj[5 >> 3].setText((String)null);
         this.bn = var10002;

         for(var1 = var10000; var10000 < 4; var10000 = var1) {
            this.il[var1 + --4].fw("sc/e/68.png");
            var10001 = var1 + --2;
            ++var1;
            this.hj[var10001].setText((String)null);
         }

      } else {
         var10001 = -4 >> 2;
         this.axf[--1].c(3 & 4, (Object)null);
         this.il[--3].q();
         this.hj[3 & 5].setText((String)null);
         this.ay = var10001;

         for(var10000 = var1 = 2 & 5; var10000 < 4; var10000 = var1) {
            this.il[var1 + (29 & 106)].fw("sc/e/68.png");
            var10001 = var1 + (46 & 87);
            ++var1;
            this.hj[var10001].setText((String)null);
         }

      }
   }
}
