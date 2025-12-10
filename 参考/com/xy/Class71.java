package com.xy;

import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.ActivityRole;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class71 extends Class456 {
   private JComponent fa;
   private JLabel[] fb;
   private Class379 fc;
   private ActivityMenuSet2 fd;
   private Class436[] cs;
   private RichLabel q;
   private JScrollPane fe;
   private Class345 ef;
   private Activity ex;
   private Class44[] ff;

   public <undefinedtype> cq(int var1) {
      if (var1 < this.fa.getComponentCount()) {
         return (<undefinedtype>)this.fa.getComponent(var1);
      } else {
         Class456 var2 = new Class456(this.ef, this) {
            private JLabel as;
            private RichLabel aj;
            private Class44 ch;
            private Class379 if;
            private RichLabel bw;
            private Class436 ih;

            public {
               int var10011 = 16348 & 16615;
               this.setLayout((LayoutManager)null);
               this.setBackground(Class681.cu);
               this.ch = new Class44(var2);
               this.ch.setBounds(--5, --5, 44 & 127, 44 & 127);
               this.as = Class133.b(var10011, 90 & 47, 122 & 85, 92 & 51, Color.white, Class681.ab);
               this.as.setHorizontalAlignment(3 >> 2);
               this.aj = new RichLabel("", Class681.q);
               this.bw = new RichLabel("", Class681.ab);
               this.if = new Class379("sc/e/31.png", 2 ^ 3, 124 & 115, Class681.ak, Class681.c, "领取", var2, var3);
               this.if.setFont(Class681.ak);
               this.if.setBounds(8086 & 24959, 15 & 126, 127 & 79, 63 & 89);
               this.ih = new Class436(Class511.q("sc/d/66.png", 122 & 85, 4 ^ 5, 122 & 85, 3 & 5, (boolean)(3 >> 2)));
               this.ih.setBounds(94 & 41, 127 & 53, 28670 & 4447, --2);
               this.add(this.ch);
               this.add(this.as);
               this.add(this.aj);
               this.add(this.bw);
               this.add(this.if);
               this.add(this.ih);
            }

            public void q() {
               int var10001 = 3 >> 2;
               this.if.y(3 & 4);
               this.aj.clear();
               this.bw.clear();
               this.ch.q();
               this.setVisible((boolean)var10001);
            }

            public void en(ActivityFC var1, boolean var2, long var3) {
               Class603 var5 = Class71.this.ef.vc();
               this.if.y(var1.getId());
               ActivityFCTarget var8 = (ActivityFCTarget)var1.getData();
               String var6 = var5.cj(var8.getT1());
               String var7 = var5.cj(var8.getT2());
               this.aj.setTextSize(!Class394.o(var6) ? "#W" + var6 : "", 160);
               this.bw.setTextSize(!Class394.o(var7) ? "#cAAAAAA" + var7 : "", 230);
               this.aj.setBounds(63 & 123, 47 & 90, this.aj.getWidth(), this.aj.getHeight());
               this.bw.setBounds(123 & 63, 62 & 95, this.bw.getWidth(), this.bw.getHeight());
               this.as.setText(var3 + "/" + var8.getTarget().getNum());
               if (var2) {
                  this.if.setBtn(-4 >> 2, "sc/e/58.png");
                  this.if.setText("已领取");
               } else if (var3 >= var8.getTarget().getNum()) {
                  this.if.setBtn(5 >> 2, "sc/e/31.png");
                  this.if.setText("领取");
               } else {
                  this.if.setBtn(-4 >> 2, "sc/e/58.png");
                  this.if.setText("未达成");
               }

               StringBuffer var9 = new StringBuffer();
               ActivityFCBase[] var12 = var8.getGains();

               int var13;
               for(int var10000 = var13 = 3 >> 2; var10000 < var12.length; var10000 = var13) {
                  ActivityFCBase var10;
                  if ((var10 = var12[var13]).getType() == (3 & 5)) {
                     if (var9.length() != 0) {
                        var9.append("#r");
                     }

                     Class223 var4 = Class71.this.ex.getPointKey(var10.getId());
                     var9.append(var10.getNum() + (var4 != null ? var4.a : "未知积分"));
                  } else if (var10.getType() == --2) {
                     Goodstable var11;
                     if ((var11 = var5.n(new BigDecimal(var10.getId()))) != null) {
                        if (var9.length() != 0) {
                           var9.append("#r");
                        }

                        var9.append(var10.getNum());
                        var9.append("个");
                        var9.append(var11.getGoodsname());
                     }
                  } else if (var10.getType() == --3) {
                     if (var9.length() != 0) {
                        var9.append("#r");
                     }

                     var9.append("1次随机奖励");
                  } else if (var10.getType() == --4) {
                     if (var9.length() != 0) {
                        var9.append("#r");
                     }

                     var9.append(var10.getNum() + var10.getKey());
                  }

                  ++var13;
               }

               this.ch.c(127 & 22, var9.toString());
               this.ch.ach(Class222.i(!Class394.o(var8.getSkin()) ? var8.getSkin() : "903"));
            }
         };
         this.fa.add(var2);
         return var2;
      }
   }

   public Class71(Class345 var1) {
      int var10001 = --5;
      int var10008 = 3 & 4;
      super();
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.setBounds(var10008, 5 >> 3, 23535 & 9715, 926 & 32367);
      this.ef = var1;
      this.q = new RichLabel("", Class681.ab);
      this.add(this.q);
      this.fc = new Class379("sc/e/26.png", 5 >> 2, 111 & 127, Class681.ak, Class681.c, "一键领取", var1, this);
      this.fc.setFont(Class681.ak);
      this.fc.setBounds(5490 & 27615, 17818 & 15095, 123 & 103, 93 & 59);
      this.add(this.fc);
      Class44[] var4 = new Class44[var10001];
      boolean var10003 = true;
      this.ff = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ff.length; var10000 = var2) {
         this.ff[var2] = new Class44(var1);
         this.ff[var2].ad(Class44.aru);
         this.ff[var2].eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
         this.ff[var2].setBounds((69 & 126) + var2 * (63 & 116), 2694 & 30207, 114 & 63, 114 & 63);
         this.add(this.ff[var2++]);
      }

      JLabel[] var5 = new JLabel[--3];
      var10003 = true;
      this.fb = var5;

      Class71 var3;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.fb.length; var10000 = var2) {
         this.fb[var2] = Class133.b(12263 & 20735, 30124 & 2783, 125 & 126, 63 & 83, Color.white, Class681.ak);
         this.fb[var2].setText(var2 == 0 ? "今日任务" : (var2 == 3 >> 1 ? "今日进度" : (var2 == (1 ^ 3) ? "完成状态" : "")));
         this.fb[var2].setHorizontalAlignment(2 & 5);
         if (var2 == 0) {
            var3 = this;
            this.fb[var2].setBounds(106, 18152 & 14807, 106, 21);
         } else if (var2 == (3 & 5)) {
            var3 = this;
            this.fb[var2].setBounds(251, 192, 106, 21);
         } else {
            if (var2 == (1 ^ 3)) {
               this.fb[var2].setBounds(333, 192, 106, 21);
            }

            var3 = this;
         }

         var3.add(this.fb[var2++]);
      }

      var10001 = --4;
      this.fa = new JComponent() {
      };
      this.fe = Class133.f(68, 212, 373, 275, this.fa, 20);
      this.add(this.fe);
      Class436[] var6 = new Class436[var10001];
      var10003 = true;
      this.cs = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.cs[var2].eq(Class511.q("sc/d/66.png", 80, 4 ^ 5, 80, --1, (boolean)(2 & 5)));
            this.cs[var2].setBounds(76, 126, 350, 1 ^ 3);
         } else if (var2 == (2 ^ 3)) {
            var3 = this;
            this.cs[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 & 4)));
            this.cs[var2].setBounds(68, 192, 373, 21);
         } else if (var2 == (1 ^ 3)) {
            var3 = this;
            this.cs[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(5 >> 3)));
            this.cs[var2].setBounds(68, 192, 373, 297);
         } else {
            if (var2 == --3) {
               this.cs[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(2 & 5)));
               this.cs[var2].setBounds(55, 66, 400, 434);
            }

            var3 = this;
         }

         var3.add(this.cs[var2++]);
      }

   }

   public void cs(Activity var1, ActivityMenuSet2 var2) {
      this.ex = var1;
      this.fd = var2;
      RoleData var14 = this.ef.vd();
      Class603 var4;
      String var5 = (var4 = this.ef.vc()).cj(var2.getT1());
      this.q.setTextSize(var5, 28542 & 4605);
      this.q.setBounds(84 & 111, 71 & 127, this.q.getWidth(), this.q.getHeight());
      int var6 = 3 ^ 3;
      var5 = this.ef.vc().cj(var2.getT2());
      int var7 = 3 ^ 3;
      int var8 = 3 & 4;
      int var9 = var5 != null ? var5.length() : 0;

      int var10000;
      Class44 var28;
      for(var10000 = var8; var10000 < var9; var10000 = var8) {
         if ((var8 = var5.indexOf("|", var7 + --1)) == -4 >> 2) {
            var8 = var9;
         }

         Goodstable var10;
         if ((var10 = var4.n(new BigDecimal(Class394.b(var5, var7, var8)))) == null) {
            var10000 = var8;
         } else {
            var28 = this.ff[var6];
            int var10001 = 3 >> 1;
            ++var6;
            var28.c(var10001, var10);
            var10000 = var8;
         }

         var7 = var10000 + 1;
      }

      for(var10000 = var6; var10000 < this.ff.length; var10000 = var6) {
         var28 = this.ff[var6];
         ++var6;
         var28.c(3 & 4, (Object)null);
      }

      var7 = 3 & 4;
      var8 = 2 & 5;
      var9 = 3 & 4;
      ArrayList var25 = null;
      ActivityRole var18 = var14.getActivity(var1.getId());
      FormulaNum[] var11;
      var6 = (var11 = var2.getBases()).length;

      int var10002;
      int var10005;
      int var10006;
      int var23;
      for(var10000 = var23 = 5 >> 3; var10000 < var6; var10000 = var23) {
         FormulaNum var19 = var11[var23];
         int var12 = 2 & 5;
         int var13 = var19.getSize();

         for(var10000 = var12; var10000 < var13; var10000 = var12) {
            int var3 = (int)var19.getZhi(var12);
            ActivityFC var15;
            if ((var15 = var4.m(var3)) != null && var15.getType() == 5 >> 1) {
               long var16 = var18 != null ? var18.getValueByKey(var3) : 0L;
               if (var16 > 0L) {
                  if (var25 == null) {
                     var25 = new ArrayList();
                  }

                  var25.add(var15);
               } else {
                  ActivityFCTarget var21;
                  ActivityFCTarget var30;
                  if ((var21 = (ActivityFCTarget)var15.getData()).getTarget().getType() == (3 & 5)) {
                     var16 = var18 != null ? var18.getValueByKey(var21.getTarget().getId()) : 0L;
                     var30 = var21;
                  } else if (var21.getTarget().getType() == (1 ^ 3)) {
                     RoleTaskData var29 = var14.getTaskSystem();
                     var30 = var21;
                     var16 = (long)var29.d(var21.getTarget().getId(), --2);
                  } else {
                     var16 = 0L;
                     var30 = var21;
                  }

                  var16 = Math.min(var30.getTarget().getNum(), var16);
                  <undefinedtype> var22 = this.cq(var7);
                  var10002 = 4 ^ 5;
                  int var10007 = 2 & 5;
                  var22.en(var15, (boolean)(2 & 5), var16);
                  var10005 = var7 * (127 & 55);
                  var10006 = 19960 & 13167;
                  ++var7;
                  var22.setBounds(var10007, var10005, var10006, 119 & 63);
                  var22.setVisible((boolean)var10002);
                  var9 = var22.getY() + var22.getHeight();
               }
            }

            ++var12;
         }

         ++var23;
      }

      int var20 = 5 >> 3;
      var23 = var25 != null ? var25.size() : 0;

      for(var10000 = var20; var10000 < var23; var10000 = var20) {
         ActivityFC var24;
         ActivityFCTarget var26 = (ActivityFCTarget)(var24 = (ActivityFC)var25.get(var20)).getData();
         <undefinedtype> var27 = this.cq(var7);
         var10002 = 3 & 5;
         int var10004 = 5 >> 3;
         var27.en(var24, (boolean)(3 & 5), var26.getTarget().getNum());
         var10005 = var7 * (63 & 119);
         var10006 = 29051 & 4076;
         ++var7;
         var27.setBounds(var10004, var10005, var10006, 119 & 63);
         var27.setVisible((boolean)var10002);
         var10000 = var27.getY();
         ++var20;
         var9 = var10000 + var27.getHeight();
      }

      for(var10000 = var20 = var7; var10000 < this.fa.getComponentCount(); var10000 = var20) {
         <undefinedtype> var31 = (<undefinedtype>)this.fa.getComponent(var20);
         ++var20;
         var31.q();
      }

      this.fa.setPreferredSize(new Dimension(var8, var9));
      this.q();
   }

   public void cf(int var1, int var2) {
      RoleData var15 = this.ef.vd();
      Class603 var4 = this.ef.vc();
      int var6;
      int var10000;
      if (var1 == (111 & 127)) {
         StringBuffer var23 = null;
         var6 = var15.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 21495 & 12271);
         ActivityRole var24 = var15.getActivity(this.ex.getId());
         ArrayList var26 = null;
         FormulaNum[] var12;
         int var11 = (var12 = this.fd.getBases()).length;

         int var29;
         for(var10000 = var29 = 5 >> 3; var10000 < var11; var10000 = var29) {
            FormulaNum var27 = var12[var29];
            int var13 = 3 ^ 3;
            int var14 = var27.getSize();

            label128:
            for(var10000 = var13; var10000 < var14; var10000 = var13) {
               int var3 = (int)var27.getZhi(var13);
               ActivityFC var16;
               if ((var16 = var4.m(var3)) != null && var16.getType() == --2) {
                  long var17 = var24 != null ? var24.getValueByKey(var3) : 0L;
                  if (var17 <= 0L) {
                     ActivityFCTarget var21;
                     long var30;
                     if ((var21 = (ActivityFCTarget)var16.getData()).getTarget().getType() == (3 & 5)) {
                        var17 = var24 != null ? var24.getValueByKey(var21.getTarget().getId()) : 0L;
                        var30 = var17;
                     } else {
                        var30 = var21.getTarget().getType() == 5 >> 1 ? (long)var15.getTaskSystem().d(var21.getTarget().getId(), --2) : (var17 = 0L);
                     }

                     if (var30 >= var21.getTarget().getNum()) {
                        ActivityFCBase[] var18;
                        int var31 = (var18 = ((ActivityFCTarget)var16.getData()).getGains()).length;
                        int var19;
                        var10000 = var19 = 3 ^ 3;

                        while(true) {
                           if (var10000 >= var31) {
                              if (var6 < 0) {
                                 if (var23 == null) {
                                    this.ef.aej.f("你的背包不够");
                                    return;
                                 }
                                 break label128;
                              }

                              if (var23 == null) {
                                 (var23 = new StringBuffer()).append(this.ex.getId());
                              }

                              var23.append("|");
                              var23.append(var16.getId());
                              break;
                           }

                           ActivityFCBase var22;
                           if ((var22 = var18[var19]).getType() != --1) {
                              if (var22.getType() == 5 >> 1) {
                                 Goodstable var20;
                                 if ((var20 = var4.n(new BigDecimal(var22.getId()))) != null && GoodType.ag(var20.getType())) {
                                    if (var26 == null || !var26.contains(var22.getId())) {
                                       if (var15.getGoodNum(new BigDecimal(var22.getId())) == 0) {
                                          --var6;
                                       }

                                       if (var26 == null) {
                                          var26 = new ArrayList();
                                       }

                                       var26.add(var22.getId());
                                    }
                                 } else {
                                    var6 = (int)((long)var6 - var22.getNum());
                                 }
                              } else if (var22.getType() == --3) {
                                 --var6;
                              } else {
                                 var22.getType();
                              }
                           }

                           ++var19;
                           var10000 = var19;
                        }
                     }
                  }
               }

               ++var13;
            }

            ++var29;
         }

         if (var23 == null) {
            this.ef.aej.f("没有可领取的奖励");
         } else {
            String var28 = Agreement.getSendTextAES("activity", var23.toString());
            this.ef.uw().d(var28);
         }
      } else {
         if (var1 == (125 & 114)) {
            ActivityFC var5 = var4.m(var2);
            var6 = 3 >> 2;
            ActivityFCBase[] var7 = ((ActivityFCTarget)var5.getData()).getGains();

            int var8;
            for(var10000 = var8 = 3 & 4; var10000 < var7.length; var10000 = var8) {
               ActivityFCBase var9;
               if ((var9 = var7[var8]).getType() != 5 >> 2) {
                  if (var9.getType() != 5 >> 1) {
                     if (var9.getType() == --3) {
                        ++var6;
                     } else {
                        var9.getType();
                     }
                  } else {
                     Goodstable var10 = var4.n(new BigDecimal(var9.getId()));
                     var6 = (int)((long)var6 + (var10 != null && GoodType.ag(var10.getType()) ? 1L : var9.getNum()));
                  }
               }

               ++var8;
            }

            if (var15.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var6) < var6) {
               this.ef.aej.f("你的背包不够");
               return;
            }

            String var25 = Agreement.getSendTextAES("activity", this.ex.getId() + "|" + var5.getId());
            this.ef.uw().d(var25);
         }

      }
   }

   public void q() {
      JScrollBar var1 = this.fe.getVerticalScrollBar();
      int var10001 = 3 >> 2;
      var1.setMaximum(this.fa.getHeight());
      var1.setValue(var10001);
   }
}
