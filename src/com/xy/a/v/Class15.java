package com.xy.a.v;

import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.q.Class54;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class15 extends com.xy.q.Class50 {
   private RichLabel re;
   private com.xy.w.Class18[] bb;
   private JScrollPane rf;
   private JLabel[] ch;
   private ActivityMenuSet2 rg;
   private Class54[] rh;
   private com.xy.q.Class30 ri;
   private com.xy.i.Class22 rc;
   private JComponent qe;
   private Activity rj;

   public Class15(com.xy.q.Class30 var1) {
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.setBounds(0, 0, 483, 526);
      this.ri = var1;
      this.re = new RichLabel("", com.xy.q.Class49.n);
      this.add(this.re);
      String var10010 = "_R\u0003T\u0003\u0003\u001a\u001f\\_K";
      String var10015 = "且锌颒叴";
      this.rc = new com.xy.i.Class22("sc/e/26.png", 1, 111, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "一键领取", var1, this);
      this.rc.setFont(com.xy.q.Class49.ch);
      this.rc.setBounds(338, 146, 99, 25);
      this.add(this.rc);
      this.rh = new Class54[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.rh.length; var10000 = var2) {
         this.rh[var2] = new Class54(var1);
         this.rh[var2].wp(Class54.aup);
         Class54 var10003 = this.rh[var2];
         String var10004 = "BO\u001eH\u001e\u0018\u001f\\_K";
         var10003.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
         this.rh[var2].setBounds(68 + var2 * 52, 134, 50, 50);
         this.add(this.rh[var2++]);
      }

      this.ch = new JLabel[3];

      for (int var5 = var2 = 0; var5 < this.ch.length; var5 = var2) {
         this.ch[var2] = com.xy.q.Class1.k(231, 140, 124, 19, Color.white, com.xy.q.Class49.ch);
         JLabel var6 = this.ch[var2];
         String var10;
         if (var2 == 0) {
            var10 = "仞旇仯劃";
            var10 = "今日任务";
         } else if (var2 == 1) {
            var10 = "任旉迪床";
            var10 = "今日进度";
         } else if (var2 == 2) {
            var10 = "官戲犢怣";
            var10 = "完成状态";
         } else {
            var10 = "";
         }

         var6.setText(var10);
         this.ch[var2].setHorizontalAlignment(0);
         Class15 var7;
         if (var2 == 0) {
            var7 = this;
            this.ch[var2].setBounds(106, 192, 106, 21);
         } else if (var2 == 1) {
            var7 = this;
            this.ch[var2].setBounds(251, 192, 106, 21);
         } else {
            if (var2 == 2) {
               this.ch[var2].setBounds(333, 192, 106, 21);
            }

            var7 = this;
         }

         var7.add(this.ch[var2++]);
      }

      this.qe = new Class19(this);
      this.rf = com.xy.q.Class1.g(68, 212, 373, 275, this.qe, 20);
      this.add(this.rf);
      this.bb = new com.xy.w.Class18[4];

      for (int var8 = var2 = 0; var8 < this.bb.length; var8 = var2) {
         this.bb[var2] = new com.xy.w.Class18();
         Class15 var9;
         if (var2 == 0) {
            var9 = this;
            com.xy.w.Class18 var15 = this.bb[var2];
            String var20 = "_R\u0003U\u0003\u0007\u001a\u001f\\_K";
            var15.mt(com.xy.w.Class16.m("sc/d/66.png", 80, 1, 80, 1, false));
            this.bb[var2].setBounds(76, 126, 350, 2);
         } else if (var2 == 1) {
            var9 = this;
            com.xy.w.Class18 var16 = this.bb[var2];
            String var21 = "Qw\rp\r&\u0017:RzE";
            var16.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.bb[var2].setBounds(68, 192, 373, 21);
         } else if (var2 == 2) {
            var9 = this;
            com.xy.w.Class18 var17 = this.bb[var2];
            String var22 = "_R\u0003U\u0003\u0003\u0018\u001f\\_K";
            var17.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.bb[var2].setBounds(68, 192, 373, 297);
         } else {
            if (var2 == 3) {
               com.xy.w.Class18 var13 = this.bb[var2];
               String var18 = "Qw\rp\r'\u0014:RzE";
               var13.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.bb[var2].setBounds(55, 66, 400, 434);
            }

            var9 = this;
         }

         var9.add(this.bb[var2++]);
      }
   }

   public void t() {
      JScrollBar var1 = this.rf.getVerticalScrollBar();
      var1.setMaximum(this.qe.getHeight());
      var1.setValue(0);
   }

   public Class49 mg(int var1) {
      if (var1 < this.qe.getComponentCount()) {
         return (Class49)this.qe.getComponent(var1);
      } else {
         Class49 var2 = new Class49(this, this.ri, this);
         this.qe.add(var2);
         return var2;
      }
   }

   public void cc(int var1, int var2) {
      RoleData var3 = this.ri.yx();
      com.xy.v.Class8 var4 = this.ri.yt();
      if (var1 == 111) {
         StringBuffer var26 = null;
         int var27 = var3.getGoodPackSum(-1L, new BigDecimal(-1), 999);
         ActivityRole var28 = var3.getActivity(this.rj.getId());
         ArrayList var30 = null;
         FormulaNum[] var12;
         int var11 = (var12 = this.rg.getBases()).length;

         int var33;
         for (int var36 = var33 = 0; var36 < var11; var36 = ++var33) {
            FormulaNum var31 = var12[var33];
            int var13 = 0;
            int var14 = var31.getSize();

            for (int var37 = var13; var37 < var14; var37 = ++var13) {
               int var15 = (int)var31.getZhi(var13);
               ActivityFC var16;
               if ((var16 = var4.ba(var15)) != null && var16.getType() == 2) {
                  long var17 = var28 != null ? var28.getValueByKey(var15) : 0L;
                  if (var17 <= 0L) {
                     ActivityFCTarget var19;
                     long var38;
                     if ((var19 = (ActivityFCTarget)var16.getData()).getTarget().getType() == 1) {
                        var17 = var28 != null ? var28.getValueByKey(var19.getTarget().getId()) : 0L;
                        var38 = var17;
                     } else {
                        var38 = var19.getTarget().getType() == 2 ? var3.getTaskSystem().f(var19.getTarget().getId(), 2) : (var17 = 0L);
                     }

                     if (var38 >= var19.getTarget().getNum()) {
                        ActivityFCBase[] var24;
                        int var23 = (var24 = ((ActivityFCTarget)var16.getData()).getGains()).length;

                        int var22;
                        for (int var39 = var22 = 0; var39 < var23; var39 = ++var22) {
                           ActivityFCBase var21;
                           if ((var21 = var24[var22]).getType() != 1) {
                              if (var21.getType() == 2) {
                                 Goodstable var25;
                                 if ((var25 = var4.ay(new BigDecimal(var21.getId()))) == null || !GoodType.z(var25.getType())) {
                                    var27 = (int)(var27 - var21.getNum());
                                 } else if (var30 == null || !var30.contains(var21.getId())) {
                                    if (var3.getGoodNum(new BigDecimal(var21.getId())) == 0) {
                                       var27--;
                                    }

                                    if (var30 == null) {
                                       var30 = new ArrayList();
                                    }

                                    var30.add(var21.getId());
                                 }
                              } else if (var21.getType() == 3) {
                                 var27--;
                              } else {
                                 var21.getType();
                              }
                           }
                        }

                        if (var27 < 0) {
                           if (var26 == null) {
                              String var42 = "佴皦胘匧丙夽";
                              this.ri.afx._do("你的背包不够");
                              return;
                           }
                           break;
                        }

                        if (var26 == null) {
                           (var26 = new StringBuffer()).append(this.rj.getId());
                        }

                        String var41 = "P";
                        var26.append("|");
                        var26.append(var16.getId());
                     }
                  }
               }
            }
         }

         if (var26 == null) {
            String var43 = "沵末叻颤参皦奂劓";
            this.ri.afx._do("没有可领取的奖励");
         } else {
            String var32 = Agreement.getSendTextAES("activity", var26.toString());
            this.ri.za().k(var32);
         }
      } else {
         if (var1 == 112) {
            ActivityFC var5 = var4.ba(var2);
            int var6 = 0;
            ActivityFCBase[] var7 = ((ActivityFCTarget)var5.getData()).getGains();

            int var8;
            for (int var10000 = var8 = 0; var10000 < var7.length; var10000 = ++var8) {
               ActivityFCBase var9;
               if ((var9 = var7[var8]).getType() != 1) {
                  if (var9.getType() == 2) {
                     Goodstable var10 = var4.ay(new BigDecimal(var9.getId()));
                     var6 = (int)(var6 + (var10 != null && GoodType.z(var10.getType()) ? 1L : var9.getNum()));
                  } else if (var9.getType() == 3) {
                     var6++;
                  } else {
                     var9.getType();
                  }
               }
            }

            if (var3.getGoodPackSum(-1L, new BigDecimal(-1), var6) < var6) {
               String var40 = "佑皨能匩丼夳";
               this.ri.afx._do("你的背包不够");
               return;
            }

            StringBuilder var10001 = new StringBuilder(String.valueOf(this.rj.getId()));
            String var10002 = "^";
            String var29 = Agreement.getSendTextAES("activity", var10001.append("|").append(var5.getId()).toString());
            this.ri.za().k(var29);
         }
      }
   }

   // $VF: synthetic method
   static com.xy.q.Class30 mh(Class15 var0) {
      return var0.ri;
   }

   // $VF: synthetic method
   static Activity mi(Class15 var0) {
      return var0.rj;
   }

   public void mj(Activity var1, ActivityMenuSet2 var2) {
      this.rj = var1;
      this.rg = var2;
      RoleData var3 = this.ri.yx();
      com.xy.v.Class8 var4;
      String var5 = (var4 = this.ri.yt()).aj(var2.getT1());
      this.re.setTextSize(var5, 380);
      this.re.setBounds(68, 71, this.re.getWidth(), this.re.getHeight());
      int var6 = 0;
      var5 = this.ri.yt().aj(var2.getT2());
      int var7 = 0;
      int var8 = 0;
      int var9 = var5 != null ? var5.length() : 0;
      int var10000 = var8;

      while (var10000 < var9) {
         String var10001 = "P";
         if ((var8 = var5.indexOf("|", var7 + 1)) == -1) {
            var8 = var9;
         }

         Goodstable var10;
         if ((var10 = var4.ay(new BigDecimal(com.xy.v.Class12.ad(var5, var7, var8)))) == null) {
            var10000 = var8;
         } else {
            Class54 var39 = this.rh[var6];
            var6++;
            var39.gs(1, var10);
            var10000 = var8;
         }

         var7 = var10000 + 1;
         var10000 = var8;
      }

      for (int var40 = var6; var40 < this.rh.length; var40 = var6) {
         Class54 var41 = this.rh[var6];
         var6++;
         var41.gs(0, null);
      }

      var7 = 0;
      byte var27 = 0;
      var9 = 0;
      ArrayList var29 = null;
      ActivityRole var11 = var3.getActivity(var1.getId());
      FormulaNum[] var15;
      int var14 = (var15 = var2.getBases()).length;

      int var13;
      for (int var42 = var13 = 0; var42 < var14; var42 = ++var13) {
         FormulaNum var12 = var15[var13];
         int var16 = 0;
         int var17 = var12.getSize();

         for (int var43 = var16; var43 < var17; var43 = ++var16) {
            int var18 = (int)var12.getZhi(var16);
            ActivityFC var19;
            if ((var19 = var4.ba(var18)) != null && var19.getType() == 2) {
               long var20 = var11 != null ? var11.getValueByKey(var18) : 0L;
               if (var20 > 0L) {
                  if (var29 == null) {
                     var29 = new ArrayList();
                  }

                  var29.add(var19);
               } else {
                  ActivityFCTarget var22;
                  ActivityFCTarget var44;
                  if ((var22 = (ActivityFCTarget)var19.getData()).getTarget().getType() == 1) {
                     var20 = var11 != null ? var11.getValueByKey(var22.getTarget().getId()) : 0L;
                     var44 = var22;
                  } else if (var22.getTarget().getType() == 2) {
                     RoleTaskData var49 = var3.getTaskSystem();
                     var44 = var22;
                     var20 = var49.f(var22.getTarget().getId(), 2);
                  } else {
                     var20 = 0L;
                     var44 = var22;
                  }

                  var20 = Math.min(var44.getTarget().getNum(), var20);
                  Class49 var23 = this.mg(var7);
                  var23.ajk(var19, false, var20);
                  int var10005 = var7 * 55;
                  var7++;
                  var23.setBounds(0, var10005, 360, 55);
                  var23.setVisible(true);
                  var9 = var23.getY() + var23.getHeight();
               }
            }
         }
      }

      int var30 = 0;
      var13 = var29 != null ? var29.size() : 0;

      for (var10000 = var30; var10000 < var13; var10000 = var30) {
         ActivityFC var33;
         ActivityFCTarget var34 = (ActivityFCTarget)(var33 = (ActivityFC)var29.get(var30)).getData();
         Class49 var35 = this.mg(var7);
         var35.ajk(var33, true, var34.getTarget().getNum());
         int var50 = var7 * 55;
         var7++;
         var35.setBounds(0, var50, 360, 55);
         var35.setVisible(true);
         var10000 = var35.getY();
         var30++;
         var9 = var10000 + var35.getHeight();
      }

      for (int var47 = var30 = var7; var47 < this.qe.getComponentCount(); var47 = var30) {
         Class49 var48 = (Class49)this.qe.getComponent(var30);
         var30++;
         var48.t();
      }

      this.qe.setPreferredSize(new Dimension(var27, var9));
      this.t();
   }
}
