package com.xy;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.XXGDBean;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.ActivityFCRecord;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.Goodstable;
import com.xy.readbean.TaskSet;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;
import java.math.BigDecimal;
import java.util.List;

public class Class100 extends Class456 {
   private Activity zu;
   private ChongjipackBean zv;
   private RichLabel oe;
   private int dn;
   private <undefinedtype>[] zw;
   private Class436 ts;
   private Class379 zx;
   private RichLabel dr;
   private int gc;
   private int gw;
   private Class436 et;
   private List<XXGDBean> zy;
   private Class379 if;
   private Class379 sl;
   private Class345 is;
   private ActivityFC zz;

   public void dp(int var1) {
      int var10002 = 3 >> 2;
      this.dn = var1;
      this.gc = var10002;
      int var5;
      if (this.zw == null || var1 > this.zw.length) {
         <undefinedtype>[] var10000 = new <undefinedtype>[var1];
         boolean var6 = true;
         <undefinedtype>[] var2 = var10000;

         int var3;
         for(var5 = var3 = 3 & 4; var5 < var2.length; var5 = var3) {
            if (this.zw != null && var3 < this.zw.length) {
               var2[var3] = this.zw[var3];
            } else {
               var2[var3] = new Class44(this.is) {
                  private Class245 abf;

                  public void tz(int var1, Object var2, int var3) {
                     super.c(var1, var2);
                     this.abf.setText(var1 == (3 & 5) && var3 > (2 ^ 3) ? String.valueOf(var3) : "");
                  }

                  public {
                     int var10003 = 1 ^ 3;
                     this.abf = Class133.a(var10003, 2 & 5, 38 & 127, 95 & 46, 90 & 47, Color.white, Class681.bm);
                     this.add(this.abf);
                  }
               };
            }

            ++var3;
         }

         this.zw = var2;
      }

      if (this.zx == null) {
         this.zx = new Class379("sc/e/156.png", 5 >> 2, 119 & 110, this.is, this);
      }

      if (this.sl == null) {
         this.sl = new Class379("sc/e/155.png", --1, 127 & 103, this.is, this);
      }

      int var4;
      if (this.gw == --1) {
         this.zx.setBounds(107 & 125, 59 & 86, 59 & 86, 93 & 59);
         this.sl.setBounds(27647 & 5495, 86 & 59, 86 & 59, 63 & 89);
         this.zx.setVisible((boolean)(3 & 4));
         this.sl.setVisible((boolean)(5 >> 3));
         this.add(this.zx);
         this.add(this.sl);
         var4 = 3 & 4;

         for(var5 = var4; var5 < this.zw.length; var5 = var4) {
            if (var4 < var1) {
               this.zw[var4].ad(Class44.ark);
               this.zw[var4].fw("sc/d/104.png");
               this.zw[var4].setBounds((126 & 125) + var4 * (107 & 62), 76 & 59, 47 & 120, 47 & 120);
               this.zw[var4].c(5 >> 3, (Object)null);
               this.add(this.zw[var4]);
            } else {
               this.remove(this.zw[var4]);
            }

            ++var4;
         }

      } else {
         if (this.gw == 5 >> 1 || this.gw == --3) {
            this.zx.setBounds(63 & 87, 31 & 127, 94 & 51, 29 & 123);
            this.sl.setBounds(377, 31, 18, 25);
            this.zx.setVisible((boolean)(5 >> 3));
            this.sl.setVisible((boolean)(2 & 5));
            this.add(this.zx);
            this.add(this.sl);
            var4 = 2 & 5;

            for(var5 = var4; var5 < this.zw.length; var5 = var4) {
               if (var4 < var1) {
                  this.zw[var4].ad(Class44.ark);
                  this.zw[var4].fw("sc/d/104.png");
                  this.zw[var4].setBounds(42 + var4 * 42, 23, 40, 40);
                  this.zw[var4].c(5 >> 3, (Object)null);
                  this.add(this.zw[var4]);
               } else {
                  this.remove(this.zw[var4]);
               }

               ++var4;
            }
         }

      }
   }

   public void as(int var1) {
      int var3;
      int var6;
      <undefinedtype> var14;
      int var10000;
      int var10001;
      Goodstable var10002;
      if (this.zz != null) {
         ActivityFCBase[] var12 = null;
         ActivityFCBase[] var15;
         if (this.zz.getType() == (3 & 5)) {
            var15 = var12 = ((ActivityFCBuy)this.zz.getData()).getGains();
         } else {
            if (this.zz.getType() == 5 >> 1) {
               var12 = ((ActivityFCTarget)this.zz.getData()).getGains();
            }

            var15 = var12;
         }

         int var11 = var15 == null ? 3 & 4 : (var12.length > this.dn ? var12.length - this.dn : 0);
         this.gc = Math.max(3 ^ 3, Math.min(var1, var11));
         Class603 var10 = this.is.vc();
         var3 = this.gc;
         var6 = this.dn + this.gc;

         for(var10000 = var3; var10000 < var6; var10000 = var3) {
            ActivityFCBase var9 = null;
            if (var12 != null && var3 < var12.length) {
               var9 = var12[var3];
            }

            if (var9 == null) {
               this.zw[var3 - this.gc].tz(3 >> 2, (Object)null, --1);
            } else if (var9.getType() == --1) {
               Class223 var8 = this.zu.getPointKey(var9.getId());
               this.zw[var3 - this.gc].tz(62 & 87, var9.getNum() + (var8 != null ? var8.a : "未知积分"), --1);
               this.zw[var3 - this.gc].ach(Class222.i("903"));
            } else if (var9.getType() == --2) {
               Goodstable var13 = var10.n(new BigDecimal(var9.getId()));
               var14 = this.zw[var3 - this.gc];
               if (var13 != null) {
                  var10001 = 3 & 5;
                  var10002 = var13;
               } else {
                  var10001 = 0;
                  var10002 = var13;
               }

               var14.tz(var10001, var10002, (int)var9.getNum());
            } else if (var9.getType() == --3) {
               this.zw[var3 - this.gc].tz(126 & 23, "随机奖励", 3 & 5);
               this.zw[var3 - this.gc].ach(Class222.i("903"));
            } else if (var9.getType() == --4) {
               this.zw[var3 - this.gc].tz(23 & 126, var9.getNum() + var9.getKey(), --1);
               this.zw[var3 - this.gc].ach(Class222.i("903"));
            } else {
               this.zw[var3 - this.gc].tz(5 >> 3, (Object)null, --1);
            }

            ++var3;
         }

         this.zx.setVisible((boolean)(var11 > 0 ? 3 >> 1 : 0));
         this.sl.setVisible((boolean)(var11 > 0 ? 2 ^ 3 : 0));
      } else {
         int var7 = this.zy == null ? 3 >> 2 : (this.zy.size() > this.dn ? this.zy.size() - this.dn : 0);
         this.gc = Math.max(3 >> 2, Math.min(var1, var7));
         Class603 var5 = this.is.vc();
         int var4 = this.gc;
         var3 = this.dn + this.gc;

         for(var10000 = var4; var10000 < var3; var10000 = var4) {
            var6 = 0;
            Goodstable var2 = null;
            if (this.zy != null && var4 < this.zy.size()) {
               var2 = var5.n(((XXGDBean)this.zy.get(var4)).getId());
               var6 = ((XXGDBean)this.zy.get(var4)).getSum();
            }

            var14 = this.zw[var4 - this.gc];
            if (var2 != null) {
               var10001 = --1;
               var10002 = var2;
            } else {
               var10001 = 0;
               var10002 = var2;
            }

            ++var4;
            var14.tz(var10001, var10002, var6);
         }

         this.zx.setVisible((boolean)(var7 > 0 ? 3 & 5 : 0));
         this.sl.setVisible((boolean)(var7 > 0 ? --1 : 0));
      }
   }

   public Component add(Component var1) {
      if (!var1.isVisible()) {
         var1.setVisible((boolean)(2 ^ 3));
      }

      return super.add(var1);
   }

   public void y(int var1) {
      if ((this.gw = var1) == (3 & 5)) {
         if (this.et == null) {
            this.et = new Class436();
         }

         if (this.ts == null) {
            this.ts = new Class436();
         }

         this.et.eq(Class511.q("sc/d/100.png", 63 & 94, 63 & 94, 63 & 94, 63 & 94, (boolean)(3 >> 2)));
         this.et.setBounds(3 & 4, 3 & 4, 19423 & 13821, 123 & 61);
         this.ts.setBounds(2038 & 31151, 125 & 11, 111 & 29, 58 & 87);
         if (this.dr == null) {
            this.dr = new RichLabel();
         }

         if (this.oe == null) {
            this.oe = new RichLabel();
         }

         this.dr.setFont(Class681.q);
         this.oe.setFont(Class681.ak);
         if (this.if == null) {
            this.if = new Class379("sc/e/154.png", --1, 103 & 125, this.is, this);
         }

         int var10003 = 30 & 103;
         this.if.setFont(Class681.ak);
         this.if.setText("领取");
         this.if.setForeground(Class681.c("#c523425"));
         this.if.setBounds(21423 & 11740, 11 & 126, 127 & 75, 43 & 119);
         this.dp(var10003);
         this.add(this.dr);
         this.add(this.oe);
         this.add(this.if);
         this.add(this.ts);
         this.add(this.et);
      } else if (var1 == 5 >> 1) {
         if (this.ts != null) {
            this.ts.setVisible((boolean)(5 >> 3));
         }

         if (this.et == null) {
            this.et = new Class436();
         }

         this.et.eq(Class511.q("sc/d/100.png", 127 & 30, 127 & 30, 127 & 30, 127 & 30, (boolean)(3 & 4)));
         this.et.setBounds(5 >> 3, 5 >> 3, 10717 & 22527, 79 & 118);
         if (this.dr == null) {
            this.dr = new RichLabel();
         }

         if (this.oe == null) {
            this.oe = new RichLabel();
         }

         this.dr.setFont(Class681.ak);
         this.oe.setFont(Class681.ak);
         if (this.if == null) {
            this.if = new Class379("sc/e/154.png", 4 ^ 5, 101, this.is, this);
         }

         this.if.setFont(Class681.ak);
         this.if.setForeground(Class681.c("#c523425"));
         this.if.setBounds(396, 15, 75, 35);
         this.dp(8);
         this.add(this.dr);
         this.add(this.oe);
         this.add(this.if);
         this.add(this.et);
      } else {
         if (var1 == --3) {
            if (this.et == null) {
               this.et = new Class436();
            }

            if (this.ts == null) {
               this.ts = new Class436();
            }

            this.et.eq(Class511.q("sc/d/100.png", 30, 30, 30, 30, (boolean)(3 >> 2)));
            this.et.setBounds(3 & 4, 3 & 4, 477, 70);
            this.ts.setBounds(422, 15, 13, 18);
            if (this.dr == null) {
               this.dr = new RichLabel();
            }

            if (this.oe == null) {
               this.oe = new RichLabel();
            }

            this.dr.setFont(Class681.ak);
            this.oe.setFont(Class681.ak);
            if (this.if == null) {
               this.if = new Class379("sc/e/154.png", 5 >> 2, 101, this.is, this);
            }

            this.if.setFont(Class681.ak);
            this.if.setText("领取");
            this.if.setForeground(Class681.c("#c523425"));
            this.if.setBounds(396, 16, 75, 35);
            this.dp(8);
            this.add(this.dr);
            this.add(this.oe);
            this.add(this.if);
            this.add(this.ts);
            this.add(this.et);
         }

      }
   }

   public void ab(int var1) {
      if (var1 != (101 & 127)) {
         if (var1 == (127 & 102)) {
            if (this.gc <= 0) {
               return;
            }

            this.as(this.gc - (4 ^ 5));
            return;
         }

         if (var1 == (127 & 103)) {
            int var21 = 2 & 5;
            Class100 var23;
            if (this.zz != null) {
               ActivityFCBase[] var12 = null;
               ActivityFCBase[] var22;
               if (this.zz.getType() == --1) {
                  var22 = var12 = ((ActivityFCBuy)this.zz.getData()).getGains();
               } else {
                  if (this.zz.getType() == 5 >> 1) {
                     var12 = ((ActivityFCTarget)this.zz.getData()).getGains();
                  }

                  var22 = var12;
               }

               var21 = var22 == null ? 5 >> 3 : (var12.length > this.dn ? var12.length - this.dn : 0);
               var23 = this;
            } else {
               var21 = this.zy == null ? 3 & 4 : (this.zy.size() > this.dn ? this.zy.size() - this.dn : 0);
               var23 = this;
            }

            if (var23.gc >= var21) {
               return;
            }

            this.as(this.gc + --1);
         }
      } else {
         int var3;
         int var4;
         int var10000;
         if (this.zv == null) {
            if (this.zz != null) {
               RoleData var20 = this.is.vd();
               var3 = 5 >> 3;
               Class603 var11 = this.is.vc();
               ActivityFCBase[] var14 = null;
               if (this.zz.getType() == (3 & 5)) {
                  var14 = ((ActivityFCBuy)this.zz.getData()).getGains();
               } else if (this.zz.getType() == (1 ^ 3)) {
                  var14 = ((ActivityFCTarget)this.zz.getData()).getGains();
               }

               int var15;
               for(var10000 = var15 = 0; var10000 < var14.length; var10000 = var15) {
                  ActivityFCBase var7;
                  if ((var7 = var14[var15]).getType() != 5 >> 2) {
                     if (var7.getType() != (1 ^ 3)) {
                        if (var7.getType() == --3) {
                           ++var3;
                        } else {
                           var7.getType();
                        }
                     } else {
                        Goodstable var2 = var11.n(new BigDecimal(var7.getId()));
                        var3 = (int)((long)var3 + (var2 != null && GoodType.ag(var2.getType()) ? 1L : var7.getNum()));
                     }
                  }

                  ++var15;
               }

               if (var20.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var3) < var3) {
                  this.is.aej.f("你的背包不够");
                  return;
               }

               if (this.zz.getType() == (4 ^ 5)) {
                  var15 = 2 & 5;
                  ActivityFCBuy var18 = (ActivityFCBuy)this.zz.getData();
                  StringBuffer var10;
                  (var10 = new StringBuffer()).append("你确定花费");
                  var4 = 2 & 5;

                  for(var10000 = var4; var10000 < var18.getUses().length; var10000 = var4) {
                     ActivityFCBase var17;
                     if ((var17 = var18.getUses()[var4]).getType() == 3 >> 1) {
                        Class223 var9 = this.zu.getPointKey(var17.getId());
                        if (var4 != 0) {
                           var10.append("和");
                        }

                        var10.append("#G");
                        var10.append(var17.getNum());
                        var10.append("#W");
                        var10.append(var9 != null ? var9.a : "未知积分");
                     } else if (var17.getType() == --4) {
                        if (var4 != 0) {
                           var10.append("和");
                        }

                        var10.append("#G");
                        var10.append(var17.getNum());
                        var10.append("#W");
                        var10.append(var17.getKey());
                        if (var17.getId() == --4) {
                           var15 = 5 >> 2;
                        }
                     }

                     ++var4;
                  }

                  var10.append("购买该礼包。");
                  if (var15 != 0) {
                     var10.append("#W你当前拥有#G");
                     var10.append(this.is.vd().getLoginResult().getMoney());
                     var10.append("#W积分");
                  }

                  this.is.aej.aal(new ConfirmBean(88 & 127, this.zu.getId() + "|" + this.zz.getId(), var10.toString()));
                  return;
               }

               if (this.zz.getType() == --2) {
                  String var16 = Agreement.getSendTextAES("activity", this.zu.getId() + "|" + this.zz.getId());
                  this.is.uw().d(var16);
                  this.is.aej.automation.setAutomationBtnRed(--5);
                  return;
               }
            }
         } else {
            if (this.gw == (1 ^ 3)) {
               StringBuffer var19;
               (var19 = new StringBuffer()).append("你确定花费#G");
               var19.append(this.zv.getCanpaymoney());
               var19.append("#W积分购买#Y");
               var19.append(this.zv.getPackname());
               var19.append("#W。你当前拥有#G");
               var19.append(this.is.vd().getLoginResult().getMoney());
               var19.append("#W积分");
               this.is.aej.aal(new ConfirmBean(119 & 95, this.zv.getPacktype() + "|" + this.zv.getPackgradetype(), var19.toString()));
               return;
            }

            Class603 var8 = this.is.vc();
            var3 = 3 ^ 3;
            var4 = 3 >> 2;
            int var5 = this.zy != null ? this.zy.size() : 0;
            var10000 = var4;

            while(true) {
               if (var10000 >= var5) {
                  if (this.is.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var3) < var3) {
                     this.is.aej.f("你的背包不够");
                     return;
                  }

                  String var13 = Agreement.getSendTextAES("Chongjipacksure", this.zv.getPacktype() + "|" + this.zv.getPackgradetype());
                  this.is.uw().d(var13);
                  if (this.gw != 5 >> 1 || this.zv.getCanpaymoney() <= 0) {
                     this.is.aej.automation.setAutomationBtnRed(--5);
                     return;
                  }
                  break;
               }

               Goodstable var6 = var8.n(((XXGDBean)this.zy.get(var4)).getId());
               var10000 = var3 + (var6 != null && GoodType.ag(var6.getType()) ? 1 : ((XXGDBean)this.zy.get(var4)).getSum());
               ++var4;
               var3 = var10000;
               var10000 = var4;
            }
         }
      }

   }

   public void qd(int var1, Activity var2, ActivityFC var3, boolean var4, long var5) {
      this.zu = var2;
      this.zz = var3;
      this.zv = null;
      this.zy = null;
      if (this.gw != var1) {
         this.y(var1);
      }

      Class100 var21;
      if (var3.getType() == (2 ^ 3)) {
         long var7 = 0L;
         ActivityFCBuy var13 = (ActivityFCBuy)var3.getData();
         StringBuffer var9;
         (var9 = new StringBuffer(this.oe.getText() != null ? this.oe.getText().length() : 32)).append("#Z#c523425消费");
         int var10 = 5 >> 3;

         for(int var10000 = var10; var10000 < var13.getUses().length; var10000 = var10) {
            ActivityFCBase var11;
            if ((var11 = var13.getUses()[var10]).getType() == 3 >> 1) {
               var7 = Math.max(var11.getNum(), 0L);
               Class223 var12 = var2.getPointKey(var11.getId());
               if (var10 != 0) {
                  var9.append("和");
               }

               var9.append(var11.getNum());
               var9.append(var12 != null ? var12.a : "未知积分");
            } else if (var11.getType() == --4) {
               var7 = Math.max(var11.getNum(), 0L);
               if (var10 != 0) {
                  var9.append("和");
               }

               var9.append(var11.getNum());
               var9.append(var11.getKey());
            }

            ++var10;
         }

         var9.append("可购买以下奖励:");
         this.oe.setTextSize(var9.toString(), 13294 & 19903);
         this.oe.setBounds(95 & 54, 2 & 5, this.oe.getWidth(), this.oe.getHeight());
         if (var13.getBuyMax() > 0) {
            this.dr.setTextSize(var13.getBuyMax() > 0 ? "#Z#c523425限购:" + var5 + "/" + var13.getBuyMax() : "", 115);
         }

         if (var13.getBuyMax() > 0 && (long)var13.getBuyMax() > var5) {
            var21 = this;
            this.dr.setBounds((3447 & 29690) + ((119 & 123) - this.dr.getWidth()) / --2, 46 & 127, this.dr.getWidth(), this.dr.getHeight());
            this.if.setText("￥" + var7);
            this.if.setVisible((boolean)(5 >> 2));
         } else {
            var21 = this;
            this.dr.setBounds((1014 & 32123) + ((127 & 115) - this.dr.getWidth()) / (1 ^ 3), 88 & 63, this.dr.getWidth(), this.dr.getHeight());
            this.if.setVisible((boolean)(5 >> 3));
         }
      } else {
         label117: {
            if (var3.getType() == --2) {
               ActivityFCTarget var8;
               StringBuffer var15;
               StringBuffer var23;
               label113: {
                  var15 = new StringBuffer();
                  var15.append("#Z#c523425");
                  var8 = (ActivityFCTarget)var3.getData();
                  String var14;
                  if (Class394.o(var14 = this.is.vc().cj(var8.getT1()))) {
                     TaskSet var22;
                     if (var8.getTarget().getType() == (3 & 5)) {
                        Object var16;
                        if ((var16 = var2.getActivityKey(var8.getTarget().getId())) instanceof Class223) {
                           Class223 var19 = (Class223)var16;
                           var15.append(var8.getTarget().getId() > 0 ? "获取" : "消耗");
                           var15.append(var8.getTarget().getNum());
                           var15.append(var19 != null ? var19.a : "未知积分");
                           var23 = var15;
                           break label113;
                        }

                        if (var16 instanceof ActivityFCRecord) {
                           ActivityFCRecord var18;
                           if ((var18 = (ActivityFCRecord)var16).getType() == (4 ^ 5) || var18.getType() == (1 ^ 3)) {
                              var15.append(var18.getType() == 3 >> 1 ? "获取" : "消耗");
                              var15.append(var8.getTarget().getNum());
                              var15.append(var18.getKey2());
                              var23 = var15;
                              break label113;
                           }

                           if (var18.getType() == --3) {
                              TaskSet var20;
                              var22 = var20 = this.is.vc().b(var18.getKey1());
                              var15.append("完成");
                              var15.append(var8.getTarget().getNum());
                              var15.append("次");
                              var15.append(var22 != null ? var20.getTaskType() : "未知任务");
                              var23 = var15;
                              break label113;
                           }
                        }
                     } else if (var8.getTarget().getType() == 5 >> 1) {
                        TaskSet var17;
                        var22 = var17 = this.is.vc().b(var8.getTarget().getId());
                        var15.append("完成");
                        var15.append(var8.getTarget().getNum());
                        var15.append("次");
                        var15.append(var22 != null ? var17.getTaskType() : "未知任务");
                        var23 = var15;
                        break label113;
                     }
                  } else {
                     var15.append(var14);
                  }

                  var23 = var15;
               }

               var23.append("(");
               var15.append(var5);
               var15.append("/");
               var15.append(var8.getTarget().getNum());
               var15.append(")");
               this.dr.setTextSize(var15.toString(), 30639 & 2558);
               this.dr.setBounds(95 & 54, 5 >> 3, this.dr.getWidth(), this.dr.getHeight());
               if (var4) {
                  var21 = this;
                  this.oe.setTextSize("#Z#c523425已领取", 90 & 125);
                  this.oe.setBounds((11245 & 21907) + ((91 & 124) - this.oe.getWidth()) / (1 ^ 3), 119 & 28, this.oe.getWidth(), this.oe.getHeight());
                  this.ts.q();
                  this.if.setVisible((boolean)(3 >> 2));
                  break label117;
               }

               if (var5 >= var8.getTarget().getNum()) {
                  this.oe.setTextSize("", 89 & 126);
                  var21 = this;
                  this.oe.setBounds(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2);
                  this.ts.q();
                  this.if.setVisible((boolean)(5 >> 2));
                  break label117;
               }

               this.oe.setTextSize("#Z#c523425未达成条件", 125 & 90);
               this.oe.setBounds(385 + (88 - this.oe.getWidth()) / --2, 34, this.oe.getWidth(), this.oe.getHeight());
               this.ts.fw("sc/d/99.png");
               this.if.setVisible((boolean)(3 ^ 3));
            }

            var21 = this;
         }
      }

      var21.as(0);
   }

   public void qe(int var1, ChongjipackBean var2, boolean var3, boolean var4, int var5) {
      this.zu = null;
      this.zz = null;
      this.zv = var2;
      this.zy = var2 != null ? ChongjipackBean.getGoodsImpactGrade(var2.getPackgoods()) : null;
      if (this.gw != var1) {
         this.y(var1);
      }

      Class100 var10000;
      if (var1 == (4 ^ 5)) {
         this.dr.setTextSize("#c560202" + var2.getPackgrade(), 127 & 104);
         this.dr.setBounds(--1 + ((123 & 108) - this.dr.getWidth()) / (1 ^ 3), 111 & 30, this.dr.getWidth(), this.dr.getHeight());
         if (var4) {
            var10000 = this;
            this.oe.setTextSize("#Z#c523425已领取", 90 & 125);
            this.oe.setBounds((15337 & 17815) + ((126 & 89) - this.oe.getWidth()) / (5 >> 1), 111 & 30, this.oe.getWidth(), this.oe.getHeight());
            this.ts.q();
            this.if.setVisible((boolean)(3 >> 2));
         } else if (var3) {
            this.oe.setTextSize("", 124 & 91);
            var10000 = this;
            this.oe.setBounds(2 & 5, 2 & 5, 2 & 5, 2 & 5);
            this.ts.q();
            this.if.setVisible((boolean)(5 >> 2));
         } else {
            this.oe.setTextSize("#Z#c523425等级未达到", 93 & 122);
            var10000 = this;
            this.oe.setBounds((4481 & 28671) + ((124 & 91) - this.oe.getWidth()) / --2, 94 & 61, this.oe.getWidth(), this.oe.getHeight());
            this.ts.fw("sc/d/99.png");
            this.if.setVisible((boolean)(2 & 5));
         }
      } else {
         label35: {
            if (var1 == (1 ^ 3)) {
               StringBuffer var6 = new StringBuffer(this.oe.getText() != null ? this.oe.getText().length() : 32);
               var6.append("#Z#c523425消费");
               var6.append(var2.getCanpaymoney());
               var6.append("积分可购买以下奖励:");
               this.oe.setTextSize(var6.toString(), 5550 & 27647);
               this.oe.setBounds(30 & 119, 5 >> 3, this.oe.getWidth(), this.oe.getHeight());
               this.dr.setTextSize("#Z#c523425限购:" + var5 + "/" + var2.getPointLvl().y, 115 & 127);
               if (var5 < var2.getPointLvl().y) {
                  var10000 = this;
                  this.dr.setBounds((15226 & 17911) + (115 - this.dr.getWidth()) / --2, 46, this.dr.getWidth(), this.dr.getHeight());
                  this.if.setText("￥" + var2.getCanpaymoney());
                  this.if.setVisible((boolean)(3 >> 1));
                  break label35;
               }

               this.dr.setBounds(370 + (115 - this.dr.getWidth()) / (5 >> 1), 24, this.dr.getWidth(), this.dr.getHeight());
               this.if.setVisible((boolean)(2 & 5));
            }

            var10000 = this;
         }
      }

      var10000.as(0);
   }

   public Class100(Class345 var1) {
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.is = var1;
   }
}
