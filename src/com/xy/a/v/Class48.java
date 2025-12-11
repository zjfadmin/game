package com.xy.a.v;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.XXGDBean;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.Class54;
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
import com.xy.text.GameView;
import java.awt.Component;
import java.math.BigDecimal;
import java.util.List;

public class Class48 extends com.xy.q.Class50 {
   private Activity aqo;
   private com.xy.w.Class18 amf;
   private int gv;
   private ActivityFC aqp;
   private RichLabel aqq;
   private List<XXGDBean> aqr;
   private Class3[] aqs;
   private com.xy.w.Class18 ei;
   private com.xy.i.Class22 aqt;
   private int cn;
   private com.xy.i.Class22 abw;
   private com.xy.i.Class22 gp;
   private int ae;
   private com.xy.q.Class30 wd;
   private ChongjipackBean aqu;
   private RichLabel bj;

   public void aje(int var1, ChongjipackBean var2, boolean var3, boolean var4, int var5) {
      this.aqo = null;
      this.aqp = null;
      this.aqu = var2;
      this.aqr = var2 != null ? ChongjipackBean.getGoodsImpactGrade(var2.getPackgoods()) : null;
      if (this.cn != var1) {
         this.y(var1);
      }

      Class48 var10000;
      if (var1 == 1) {
         String var10005 = "G3QfTbTb";
         this.bj.setTextSize("#c560202" + var2.getPackgrade(), 104);
         this.bj.setBounds(1 + (104 - this.bj.getWidth()) / 2, 14, this.bj.getWidth(), this.bj.getHeight());
         if (var4) {
            var10000 = this;
            var10005 = "\n3\n\n\u001c[\u001a]\u001b\\巛飯叿";
            this.aqq.setTextSize("#Z#c523425已领取", 88);
            this.aqq.setBounds(385 + (88 - this.aqq.getWidth()) / 2, 14, this.aqq.getWidth(), this.aqq.getHeight());
            this.amf.l();
            this.aqt.setVisible(false);
         } else if (var3) {
            this.aqq.setTextSize("", 88);
            var10000 = this;
            this.aqq.setBounds(0, 0, 0, 0);
            this.amf.l();
            this.aqt.setVisible(true);
         } else {
            String var10001 = "s>s\u0007eVcPbQ笙练杺迚剠";
            this.aqq.setTextSize("#Z#c523425等级未达到", 88);
            var10000 = this;
            this.aqq.setBounds(385 + (88 - this.aqq.getWidth()) / 2, 28, this.aqq.getWidth(), this.aqq.getHeight());
            String var10003 = "Z\n\u0006\r\u0006P\u0010GY\u0007N";
            this.amf.dp("sc/d/99.png");
            this.aqt.setVisible(false);
         }
      } else {
         label37: {
            if (var1 == 2) {
               StringBuffer var6 = new StringBuffer(this.aqq.getText() != null ? this.aqq.getText().length() : 32);
               String var10002 = "G\nG3QbWdVe淬赩";
               var6.append("#Z#c523425消费");
               var6.append(var2.getCanpaymoney());
               String var10004 = "禆刯历贄丙仌乢奿勘\u0013";
               var6.append("积分可购买以下奖励:");
               this.aqq.setTextSize(var6.toString(), 430);
               this.aqq.setBounds(22, 0, this.aqq.getWidth(), this.aqq.getHeight());
               RichLabel var7 = this.bj;
               String var10007 = "s>s\u0007eVcPbQ阀赉j";
               StringBuilder var9 = new StringBuilder("#Z#c523425限购:").append(var5);
               String var10006 = "\u0006";
               var7.setTextSize(var9.append("/").append(var2.getPointLvl().y).toString(), 115);
               if (var5 < var2.getPointLvl().y) {
                  var10000 = this;
                  this.bj.setBounds(370 + (115 - this.bj.getWidth()) / 2, 46, this.bj.getWidth(), this.bj.getHeight());
                  String var10 = "ﾵ";
                  this.aqt.setText("￥" + var2.getCanpaymoney());
                  this.aqt.setVisible(true);
                  break label37;
               }

               this.bj.setBounds(370 + (115 - this.bj.getWidth()) / 2, 24, this.bj.getWidth(), this.bj.getHeight());
               this.aqt.setVisible(false);
            }

            var10000 = this;
         }
      }

      var10000.bi(0);
   }

   public void ajf(int var1, Activity var2, ActivityFC var3, boolean var4, long var5) {
      this.aqo = var2;
      this.aqp = var3;
      this.aqu = null;
      this.aqr = null;
      if (this.cn != var1) {
         this.y(var1);
      }

      Class48 var23;
      if (var3.getType() == 1) {
         long var7 = 0L;
         ActivityFCBuy var9 = (ActivityFCBuy)var3.getData();
         StringBuffer var10;
         StringBuffer var10000 = var10 = new StringBuffer(this.aqq.getText() != null ? this.aqq.getText().length() : 32);
         String var10001 = "G\nG3QbWdVe淬赩";
         var10000.append("#Z#c523425消费");
         int var11 = 0;

         for (int var21 = var11; var21 < var9.getUses().length; var21 = ++var11) {
            ActivityFCBase var12;
            if ((var12 = var9.getUses()[var11]).getType() == 1) {
               var7 = Math.max(var12.getNum(), 0L);
               com.xy.v.Class26 var13 = var2.getPointKey(var12.getId());
               if (var11 != 0) {
                  var10001 = "咥";
                  var10.append("和");
               }

               var10.append(var12.getNum());
               if (var13 != null) {
                  var10001 = var13.a;
               } else {
                  var10001 = "李瞵禋剖";
                  var10001 = "未知积分";
               }

               var10.append(var10001);
            } else if (var12.getType() == 4) {
               var7 = Math.max(var12.getNum(), 0L);
               if (var11 != 0) {
                  var10001 = "咥";
                  var10.append("和");
               }

               var10.append(var12.getNum());
               var10.append(var12.getKey());
            }
         }

         String var10002 = "压赽且亵乯夆動j";
         var10.append("可购买以下奖励:");
         this.aqq.setTextSize(var10.toString(), 430);
         this.aqq.setBounds(22, 0, this.aqq.getWidth(), this.aqq.getHeight());
         if (var9.getBuyMax() > 0) {
            RichLabel var22 = this.bj;
            if (var9.getBuyMax() > 0) {
               String var10003 = "\n3\n\n\u001c[\u001a]\u001b\\陹资\u0013";
               StringBuilder var31 = new StringBuilder("#Z#c523425限购:").append(var5);
               var10002 = "\u007f";
               var10001 = var31.append("/").append(var9.getBuyMax()).toString();
            } else {
               var10001 = "";
            }

            var22.setTextSize(var10001, 115);
         }

         if (var9.getBuyMax() > 0 && var9.getBuyMax() > var5) {
            var23 = this;
            this.bj.setBounds(370 + (115 - this.bj.getWidth()) / 2, 46, this.bj.getWidth(), this.bj.getHeight());
            String var10005 = "ￌ";
            this.aqt.setText("￥" + var7);
            this.aqt.setVisible(true);
         } else {
            var23 = this;
            this.bj.setBounds(370 + (115 - this.bj.getWidth()) / 2, 24, this.bj.getWidth(), this.bj.getHeight());
            this.aqt.setVisible(false);
         }
      } else {
         label120: {
            if (var3.getType() == 2) {
               ActivityFCTarget var8;
               StringBuffer var14;
               StringBuffer var25;
               label143: {
                  var14 = new StringBuffer();
                  String var48 = "G\nG3QbWdVe";
                  var14.append("#Z#c523425");
                  var8 = (ActivityFCTarget)var3.getData();
                  String var15;
                  if (com.xy.v.Class12.h(var15 = this.wd.yt().aj(var8.getT1()))) {
                     if (var8.getTarget().getType() == 1) {
                        Object var17;
                        if ((var17 = var2.getActivityKey(var8.getTarget().getId())) instanceof com.xy.v.Class26) {
                           com.xy.v.Class26 var19 = (com.xy.v.Class26)var17;
                           String var41;
                           if (var8.getTarget().getId() > 0) {
                              var41 = "菞叿";
                              var41 = "获取";
                           } else {
                              var41 = "淬聇";
                              var41 = "消耗";
                           }

                           var14.append(var41);
                           var14.append(var8.getTarget().getNum());
                           if (var19 != null) {
                              var41 = var19.a;
                           } else {
                              var41 = "权矌禆刯";
                              var41 = "未知积分";
                           }

                           var14.append(var41);
                           var25 = var14;
                           break label143;
                        }

                        if (var17 instanceof ActivityFCRecord) {
                           ActivityFCRecord var18;
                           if ((var18 = (ActivityFCRecord)var17).getType() == 1 || var18.getType() == 2) {
                              String var38;
                              if (var18.getType() == 1) {
                                 var38 = "菓历";
                                 var38 = "获取";
                              } else {
                                 var38 = "淡耾";
                                 var38 = "消耗";
                              }

                              var14.append(var38);
                              var14.append(var8.getTarget().getNum());
                              var14.append(var18.getKey2());
                              var25 = var14;
                              break label143;
                           }

                           if (var18.getType() == 3) {
                              TaskSet var20;
                              TaskSet var26 = var20 = this.wd.yt().cj(var18.getKey1());
                              var48 = "寨所";
                              var14.append("完成");
                              var14.append(var8.getTarget().getNum());
                              String var54 = "欈";
                              var14.append("次");
                              String var35;
                              if (var26 != null) {
                                 var35 = var20.getTaskType();
                              } else {
                                 var35 = "李瞵亟勱";
                                 var35 = "未知任务";
                              }

                              var14.append(var35);
                              var25 = var14;
                              break label143;
                           }
                        }
                     } else if (var8.getTarget().getType() == 2) {
                        TaskSet var16;
                        TaskSet var24 = var16 = this.wd.yt().cj(var8.getTarget().getId());
                        var48 = "寥戹";
                        var14.append("完成");
                        var14.append(var8.getTarget().getNum());
                        String var53 = "歱";
                        var14.append("次");
                        String var33;
                        if (var24 != null) {
                           var33 = var16.getTaskType();
                        } else {
                           var33 = "权矌互劈";
                           var33 = "未知任务";
                        }

                        var14.append(var33);
                        var25 = var14;
                        break label143;
                     }
                  } else {
                     var14.append(var15);
                  }

                  var25 = var14;
               }

               String var45 = "x";
               var25.append("(");
               var14.append(var5);
               String var52 = "\u0006";
               var14.append("/");
               var14.append(var8.getTarget().getNum());
               String var55 = "y";
               var14.append(")");
               this.bj.setTextSize(var14.toString(), 430);
               this.bj.setBounds(22, 0, this.bj.getWidth(), this.bj.getHeight());
               if (var4) {
                  var23 = this;
                  var55 = "\n3\n\n\u001c[\u001a]\u001b\\巛飯叿";
                  this.aqq.setTextSize("#Z#c523425已领取", 88);
                  this.aqq.setBounds(385 + (88 - this.aqq.getWidth()) / 2, 20, this.aqq.getWidth(), this.aqq.getHeight());
                  this.amf.l();
                  this.aqt.setVisible(false);
                  break label120;
               }

               if (var5 >= var8.getTarget().getNum()) {
                  this.aqq.setTextSize("", 88);
                  var23 = this;
                  this.aqq.setBounds(0, 0, 0, 0);
                  this.amf.l();
                  this.aqt.setVisible(true);
                  break label120;
               }

               var45 = "s>s\u0007eVcPbQ杺迚所朅亦";
               this.aqq.setTextSize("#Z#c523425未达成条件", 88);
               this.aqq.setBounds(385 + (88 - this.aqq.getWidth()) / 2, 34, this.aqq.getWidth(), this.aqq.getHeight());
               String var51 = "Z\n\u0006\r\u0006P\u0010GY\u0007N";
               this.amf.dp("sc/d/99.png");
               this.aqt.setVisible(false);
            }

            var23 = this;
         }
      }

      var23.bi(0);
   }

   @Override
   public Component add(Component var1) {
      if (!var1.isVisible()) {
         var1.setVisible(true);
      }

      return super.add(var1);
   }

   public void bi(int var1) {
      if (this.aqp != null) {
         ActivityFCBase[] var9 = null;
         ActivityFCBase[] var17;
         if (this.aqp.getType() == 1) {
            var17 = var9 = ((ActivityFCBuy)this.aqp.getData()).getGains();
         } else {
            if (this.aqp.getType() == 2) {
               var9 = ((ActivityFCTarget)this.aqp.getData()).getGains();
            }

            var17 = var9;
         }

         int var10 = var17 == null ? 0 : (var9.length > this.gv ? var9.length - this.gv : 0);
         this.ae = Math.max(0, Math.min(var1, var10));
         com.xy.v.Class8 var11 = this.wd.yt();
         int var12 = this.ae;
         int var13 = this.gv + this.ae;

         for (int var18 = var12; var18 < var13; var18 = ++var12) {
            ActivityFCBase var14 = null;
            if (var9 != null && var12 < var9.length) {
               var14 = var9[var12];
            }

            if (var14 == null) {
               this.aqs[var12 - this.ae].dy(0, null, 1);
            } else if (var14.getType() == 1) {
               com.xy.v.Class26 var8 = this.aqo.getPointKey(var14.getId());
               Class3 var19 = this.aqs[var12 - this.ae];
               StringBuilder var29 = new StringBuilder(String.valueOf(var14.getNum()));
               String var10003;
               if (var8 != null) {
                  var10003 = var8.a;
               } else {
                  var10003 = "权矌禆刯";
                  var10003 = "未知积分";
               }

               var19.dy(22, var29.append(var10003).toString(), 1);
               Class3 var20 = this.aqs[var12 - this.ae];
               String var24 = "iTc";
               var20.gt(com.xy.w.Class15.d("903"));
            } else if (var14.getType() == 2) {
               Goodstable var15 = var11.ay(new BigDecimal(var14.getId()));
               Class3 var21 = this.aqs[var12 - this.ae];
               byte var25;
               Goodstable var30;
               if (var15 != null) {
                  var25 = 1;
                  var30 = var15;
               } else {
                  var25 = 0;
                  var30 = var15;
               }

               var21.dy(var25, var30, (int)var14.getNum());
            } else if (var14.getType() == 3) {
               Class3 var26 = this.aqs[var12 - this.ae];
               String var32 = "雦朓夿劘";
               var26.dy(22, "随机奖励", 1);
               Class3 var22 = this.aqs[var12 - this.ae];
               String var27 = "iTc";
               var22.gt(com.xy.w.Class15.d("903"));
            } else if (var14.getType() == 4) {
               this.aqs[var12 - this.ae].dy(22, var14.getNum() + var14.getKey(), 1);
               Class3 var23 = this.aqs[var12 - this.ae];
               String var28 = "\u0010Y\u001a";
               var23.gt(com.xy.w.Class15.d("903"));
            } else {
               this.aqs[var12 - this.ae].dy(0, null, 1);
            }
         }

         this.gp.setVisible(var10 > 0);
         this.abw.setVisible(var10 > 0);
      } else {
         int var2 = this.aqr == null ? 0 : (this.aqr.size() > this.gv ? this.aqr.size() - this.gv : 0);
         this.ae = Math.max(0, Math.min(var1, var2));
         com.xy.v.Class8 var3 = this.wd.yt();
         int var4 = this.ae;
         int var5 = this.gv + this.ae;

         for (int var10000 = var4; var10000 < var5; var10000 = var4) {
            int var6 = 0;
            Goodstable var7 = null;
            if (this.aqr != null && var4 < this.aqr.size()) {
               var7 = var3.ay(this.aqr.get(var4).getId());
               var6 = this.aqr.get(var4).getSum();
            }

            Class3 var16 = this.aqs[var4 - this.ae];
            byte var10001;
            Goodstable var10002;
            if (var7 != null) {
               var10001 = 1;
               var10002 = var7;
            } else {
               var10001 = 0;
               var10002 = var7;
            }

            var4++;
            var16.dy(var10001, var10002, var6);
         }

         this.gp.setVisible(var2 > 0);
         this.abw.setVisible(var2 > 0);
      }
   }

   public void y(int var1) {
      if ((this.cn = var1) == 1) {
         if (this.ei == null) {
            this.ei = new com.xy.w.Class18();
         }

         if (this.amf == null) {
            this.amf = new com.xy.w.Class18();
         }

         String var5 = "\u001aJFMF\u0018Y\u0019GY\u0007N";
         this.ei.mt(com.xy.w.Class16.m("sc/d/100.png", 30, 30, 30, 30, false));
         this.ei.setBounds(0, 0, 477, 57);
         this.amf.setBounds(422, 9, 13, 18);
         if (this.bj == null) {
            this.bj = new RichLabel();
         }

         if (this.aqq == null) {
            this.aqq = new RichLabel();
         }

         this.bj.setFont(com.xy.q.Class49.w);
         this.aqq.setFont(com.xy.q.Class49.ch);
         if (this.aqt == null) {
            String var4 = "\u00173K5KaQdJ \n7";
            this.aqt = new com.xy.i.Class22("sc/e/154.png", 1, 101, this.wd, this);
         }

         this.aqt.setFont(com.xy.q.Class49.ch);
         String var8 = "飯叿";
         this.aqt.setText("领取");
         String var7 = "G3QbWdVe";
         this.aqt.setForeground(com.xy.q.Class49.c("#c523425"));
         this.aqt.setBounds(396, 10, 75, 35);
         this.n(6);
         this.add(this.bj);
         this.add(this.aqq);
         this.add(this.aqt);
         this.add(this.amf);
         this.add(this.ei);
      } else if (var1 == 2) {
         if (this.amf != null) {
            this.amf.setVisible(false);
         }

         if (this.ei == null) {
            this.ei = new com.xy.w.Class18();
         }

         String var2 = "\u001aJFMF\u0018Y\u0019GY\u0007N";
         this.ei.mt(com.xy.w.Class16.m("sc/d/100.png", 30, 30, 30, 30, false));
         this.ei.setBounds(0, 0, 477, 70);
         if (this.bj == null) {
            this.bj = new RichLabel();
         }

         if (this.aqq == null) {
            this.aqq = new RichLabel();
         }

         this.bj.setFont(com.xy.q.Class49.ch);
         this.aqq.setFont(com.xy.q.Class49.ch);
         if (this.aqt == null) {
            var2 = "\u00173K5KaQdJ \n7";
            this.aqt = new com.xy.i.Class22("sc/e/154.png", 1, 101, this.wd, this);
         }

         this.aqt.setFont(com.xy.q.Class49.ch);
         String var6 = "JJ\\\u001bZ\u001d[\u001c";
         this.aqt.setForeground(com.xy.q.Class49.c("#c523425"));
         this.aqt.setBounds(396, 15, 75, 35);
         this.n(8);
         this.add(this.bj);
         this.add(this.aqq);
         this.add(this.aqt);
         this.add(this.ei);
      } else {
         if (var1 == 3) {
            if (this.ei == null) {
               this.ei = new com.xy.w.Class18();
            }

            if (this.amf == null) {
               this.amf = new com.xy.w.Class18();
            }

            String var10004 = "\u00173K4KaT`J \n7";
            this.ei.mt(com.xy.w.Class16.m("sc/d/100.png", 30, 30, 30, 30, false));
            this.ei.setBounds(0, 0, 477, 70);
            this.amf.setBounds(422, 15, 13, 18);
            if (this.bj == null) {
               this.bj = new RichLabel();
            }

            if (this.aqq == null) {
               this.aqq = new RichLabel();
            }

            this.bj.setFont(com.xy.q.Class49.ch);
            this.aqq.setFont(com.xy.q.Class49.ch);
            if (this.aqt == null) {
               String var10003 = "\u001aJFLF\u0018\\\u001dGY\u0007N";
               this.aqt = new com.xy.i.Class22("sc/e/154.png", 1, 101, this.wd, this);
            }

            this.aqt.setFont(com.xy.q.Class49.ch);
            String var10007 = "飢历";
            this.aqt.setText("领取");
            String var10006 = "JJ\\\u001bZ\u001d[\u001c";
            this.aqt.setForeground(com.xy.q.Class49.c("#c523425"));
            this.aqt.setBounds(396, 16, 75, 35);
            this.n(8);
            this.add(this.bj);
            this.add(this.aqq);
            this.add(this.aqt);
            this.add(this.amf);
            this.add(this.ei);
         }
      }
   }

   public void g(int var1) {
      if (var1 == 101) {
         if (this.aqu != null) {
            if (this.cn == 2) {
               StringBuffer var13;
               StringBuffer var31 = var13 = new StringBuffer();
               String var44 = "估砊寊苕赩G\u0017";
               var31.append("你确定花费#G");
               var13.append(this.aqu.getCanpaymoney());
               String var49 = "J~禆刯资乙Jp";
               var13.append("#W积分购买#Y");
               var13.append(this.aqu.getPackname());
               String var51 = "G\u0007て估強初抁杙G\u0017";
               var13.append("#W。你当前拥有#G");
               var13.append(this.wd.yx().getLoginResult().getMoney());
               String var10007 = "J~禆刯";
               var13.append("#W积分");
               GameView var52 = this.wd.afx;
               StringBuilder var10011 = new StringBuilder().append(this.aqu.getPacktype());
               String var10012 = ",";
               var52.dm(new ConfirmBean(87, var10011.append("|").append(this.aqu.getPackgradetype()).toString(), var13.toString()));
               return;
            }

            com.xy.v.Class8 var12 = this.wd.yt();
            int var16 = 0;
            int var18 = 0;
            int var19 = this.aqr != null ? this.aqr.size() : 0;

            for (int var29 = var18; var29 < var19; var29 = var18) {
               Goodstable var23 = var12.ay(this.aqr.get(var18).getId());
               var29 = var16 + (var23 != null && GoodType.z(var23.getType()) ? 1 : this.aqr.get(var18).getSum());
               var18++;
               var16 = var29;
            }

            if (this.wd.yx().getGoodPackSum(-1L, new BigDecimal(-1), var16) < var16) {
               String var43 = "伉皭肥匬乤夶";
               this.wd.afx._do("你的背包不够");
               return;
            }

            StringBuilder var42 = new StringBuilder().append(this.aqu.getPacktype());
            String var46 = ",";
            String var20 = Agreement.getSendTextAES("Chongjipacksure", var42.append("|").append(this.aqu.getPackgradetype()).toString());
            this.wd.za().k(var20);
            return;
         }

         if (this.aqp != null) {
            RoleData var2 = this.wd.yx();
            int var3 = 0;
            com.xy.v.Class8 var4 = this.wd.yt();
            ActivityFCBase[] var5 = null;
            if (this.aqp.getType() == 1) {
               var5 = ((ActivityFCBuy)this.aqp.getData()).getGains();
            } else if (this.aqp.getType() == 2) {
               var5 = ((ActivityFCTarget)this.aqp.getData()).getGains();
            }

            int var6;
            for (int var10000 = var6 = 0; var10000 < var5.length; var10000 = ++var6) {
               ActivityFCBase var7;
               if ((var7 = var5[var6]).getType() != 1) {
                  if (var7.getType() == 2) {
                     Goodstable var8 = var4.ay(new BigDecimal(var7.getId()));
                     var3 = (int)(var3 + (var8 != null && GoodType.z(var8.getType()) ? 1L : var7.getNum()));
                  } else if (var7.getType() == 3) {
                     var3++;
                  } else {
                     var7.getType();
                  }
               }
            }

            if (var2.getGoodPackSum(-1L, new BigDecimal(-1), var3) < var3) {
               String var41 = "伉皭肥匬乤夶";
               this.wd.afx._do("你的背包不够");
               return;
            }

            if (this.aqp.getType() == 1) {
               boolean var22 = false;
               ActivityFCBuy var24 = (ActivityFCBuy)this.aqp.getData();
               StringBuffer var25;
               StringBuffer var26 = var25 = new StringBuffer();
               String var34 = "估砊寊苕赩";
               var26.append("你确定花费");
               int var9 = 0;

               for (int var27 = var9; var27 < var24.getUses().length; var27 = ++var9) {
                  ActivityFCBase var10;
                  if ((var10 = var24.getUses()[var9]).getType() == 1) {
                     com.xy.v.Class26 var11 = this.aqo.getPointKey(var10.getId());
                     if (var9 != 0) {
                        var34 = "咥";
                        var25.append("和");
                     }

                     String var10003 = "G\u0017";
                     var25.append("#G");
                     var25.append(var10.getNum());
                     String var10005 = "J~";
                     var25.append("#W");
                     if (var11 != null) {
                        var34 = var11.a;
                     } else {
                        var34 = "李瞵禋剖";
                        var34 = "未知积分";
                     }

                     var25.append(var34);
                  } else if (var10.getType() == 4) {
                     if (var9 != 0) {
                        var34 = "咥";
                        var25.append("和");
                     }

                     var34 = "G\u0017";
                     var25.append("#G");
                     var25.append(var10.getNum());
                     String var47 = "J~";
                     var25.append("#W");
                     var25.append(var10.getKey());
                     if (var10.getId() == 4) {
                        var22 = true;
                     }
                  }
               }

               String var45 = "赉丠讁祬卡げ";
               var25.append("购买该礼包。");
               if (var22) {
                  var34 = "\n>佉强剤抌朠Jn";
                  var25.append("#W你当前拥有#G");
                  var25.append(this.wd.yx().getLoginResult().getMoney());
                  String var48 = "G\u0007禋剖";
                  var25.append("#W积分");
               }

               GameView var28 = this.wd.afx;
               StringBuilder var10004 = new StringBuilder(String.valueOf(this.aqo.getId()));
               String var50 = "U";
               var28.dm(new ConfirmBean(88, var10004.append("|").append(this.aqp.getId()).toString(), var25.toString()));
               return;
            }

            if (this.aqp.getType() == 2) {
               StringBuilder var10001 = new StringBuilder(String.valueOf(this.aqo.getId()));
               String var10002 = ",";
               String var21 = Agreement.getSendTextAES("activity", var10001.append("|").append(this.aqp.getId()).toString());
               this.wd.za().k(var21);
               return;
            }
         }
      } else {
         if (var1 == 102) {
            if (this.ae <= 0) {
               return;
            }

            this.bi(this.ae - 1);
            return;
         }

         if (var1 == 103) {
            int var14 = 0;
            Class48 var33;
            if (this.aqp != null) {
               ActivityFCBase[] var17 = null;
               ActivityFCBase[] var32;
               if (this.aqp.getType() == 1) {
                  var32 = var17 = ((ActivityFCBuy)this.aqp.getData()).getGains();
               } else {
                  if (this.aqp.getType() == 2) {
                     var17 = ((ActivityFCTarget)this.aqp.getData()).getGains();
                  }

                  var32 = var17;
               }

               var14 = var32 == null ? 0 : (var17.length > this.gv ? var17.length - this.gv : 0);
               var33 = this;
            } else {
               var14 = this.aqr == null ? 0 : (this.aqr.size() > this.gv ? this.aqr.size() - this.gv : 0);
               var33 = this;
            }

            if (var33.ae >= var14) {
               return;
            }

            this.bi(this.ae + 1);
         }
      }
   }

   public void n(int var1) {
      this.gv = var1;
      this.ae = 0;
      if (this.aqs == null || var1 > this.aqs.length) {
         Class3[] var2 = new Class3[var1];

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            if (this.aqs != null && var3 < this.aqs.length) {
               var2[var3] = this.aqs[var3];
            } else {
               var2[var3] = new Class3(this, this.wd);
            }
         }

         this.aqs = var2;
      }

      if (this.gp == null) {
         String var10003 = "\u00173K5KaQfJ \n7";
         this.gp = new com.xy.i.Class22("sc/e/156.png", 1, 102, this.wd, this);
      }

      if (this.abw == null) {
         String var8 = "\u001aJFLF\u0018\\\u001cGY\u0007N";
         this.abw = new com.xy.i.Class22("sc/e/155.png", 1, 103, this.wd, this);
      }

      if (this.cn == 1) {
         this.gp.setBounds(105, 18, 18, 25);
         this.abw.setBounds(375, 18, 18, 25);
         this.gp.setVisible(false);
         this.abw.setVisible(false);
         this.add(this.gp);
         this.add(this.abw);
         int var5 = 0;

         for (int var7 = var5; var7 < this.aqs.length; var7 = ++var5) {
            if (var5 < var1) {
               this.aqs[var5].wp(Class54.aun);
               Class3 var9 = this.aqs[var5];
               String var10 = "\u00173K4KaTdJ \n7";
               var9.dq("sc/d/104.png");
               this.aqs[var5].setBounds(124 + var5 * 42, 8, 40, 40);
               this.aqs[var5].gs(0, null);
               this.add(this.aqs[var5]);
            } else {
               this.remove(this.aqs[var5]);
            }
         }
      } else {
         if (this.cn == 2 || this.cn == 3) {
            this.gp.setBounds(23, 31, 18, 25);
            this.abw.setBounds(377, 31, 18, 25);
            this.gp.setVisible(false);
            this.abw.setVisible(false);
            this.add(this.gp);
            this.add(this.abw);
            int var4 = 0;

            for (int var6 = var4; var6 < this.aqs.length; var6 = ++var4) {
               if (var4 < var1) {
                  this.aqs[var4].wp(Class54.aun);
                  Class3 var10004 = this.aqs[var4];
                  String var10005 = "\u001aJFMF\u0018Y\u001dGY\u0007N";
                  var10004.dq("sc/d/104.png");
                  this.aqs[var4].setBounds(42 + var4 * 42, 23, 40, 40);
                  this.aqs[var4].gs(0, null);
                  this.add(this.aqs[var4]);
               } else {
                  this.remove(this.aqs[var4]);
               }
            }
         }
      }
   }

   public Class48(com.xy.q.Class30 var1) {
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.wd = var1;
   }
}
