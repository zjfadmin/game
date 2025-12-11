package com.xy.a;

import com.xy.bean.Commodity;
import com.xy.bean.RoleShow;
import com.xy.bean.Stall;
import com.xy.bean.StallBean;
import com.xy.bean.StallNeedBean;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StallBuyData;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class127 extends com.xy.q.Class30 {
   private com.xy.q.Class54 auy;
   private com.xy.a.i.Class36 auz;
   private com.xy.q.Class36 ava;
   private com.xy.q.Class52 avb;
   private com.xy.q.Class27 avc;
   private com.xy.q.Class27 avd;
   private com.xy.q.Class36 ave;
   private com.xy.i.Class18 avf;
   private com.xy.q.Class27 avg;
   private JComponent avh;
   private int avi;
   private com.xy.q.Class36 avj;
   private MoneyType avk;
   private com.xy.w.Class18[] avl;
   private com.xy.i.Class18 avm;
   private com.xy.i.Class18[] avn;
   private JComponent avo;
   private com.xy.q.Class54 avp;
   private com.xy.q.Class52 xq;
   private com.xy.i.Class18[] avq;
   private com.xy.w.Class18 aqg;
   private com.xy.a.i.Class36 avr;
   private int agc;
   private com.xy.i.Class18 ase;
   private com.xy.i.Class3[] avs;
   private com.xy.q.Class36 avt;
   private com.xy.q.Class14 avu;
   private com.xy.q.Class14 avv;
   private com.xy.q.Class36 avw;
   private com.xy.q.Class42 avx;
   private Stall avy;
   private int gz;
   private com.xy.q.Class42 avz;
   private JLabel[] lt;
   private Class53[] awa;
   private com.xy.q.Class36 fc;
   private JLabel[] r;
   private com.xy.i.Class18[] ts;
   private com.xy.w.Class18[] j;
   private com.xy.i.Class18[] qh;
   private com.xy.q.Class27 gd;

   public Long dt(long var1, JTextField var3) {
      if (this.fc != var3 && this.ave != var3) {
         if (this.avw != var3 && this.avj != var3) {
            return 0L;
         } else if (var1 >= 0L && this.auy.il() != 0) {
            long var7 = this.yx().getLoginResult().getGold().longValue();
            long var10000;
            if (this.avw == var3) {
               var7 /= Math.max(1L, this.avd.ee());
               var10000 = var1;
            } else {
               var7 /= Math.max(1L, this.avg.ee());
               var10000 = var1;
            }

            return var10000 > var7 ? var7 : null;
         } else {
            return 0L;
         }
      } else if (var1 < 0L || this.avp.il() == 0) {
         return 0L;
      } else if (this.ave == var3) {
         if (this.avp.il() == 1) {
            Goodstable var4;
            if ((var4 = (Goodstable)this.avp.jx()) != null) {
               var4 = this.yx().getGood(var4.getRgid());
            }

            long var5 = var4 != null ? var4.getUsetime() : 0;
            return var1 > var5 ? var5 : null;
         } else {
            return 1L;
         }
      } else {
         return null;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void e() {
      if (this.afx.getClient().gamePawn) {
         boolean var1 = false;
         boolean var2 = false;
         RoleData var3 = this.yx();
         String var4 = null;
         String var5 = null;
         Object var6 = null;
         String var7 = null;
         FileInputStream var8 = null;
         InputStreamReader var9 = null;

         String var63;
         label255: {
            label254: {
               label253: {
                  FileInputStream var62;
                  label252: {
                     label251: {
                        label250: {
                           InputStreamReader var10000;
                           label249: {
                              label248: {
                                 label247: {
                                    File var10;
                                    try {
                                       String var10004 = "\r\u0003\u0010M\u0013\u0016\u0001\u000e\f";
                                       if (!(var10 = new File("map/stall" + var3.getRoleId())).exists()) {
                                          return;
                                       }
                                    } catch (Exception var27) {
                                       var27.printStackTrace();
                                       break label247;
                                    }

                                    try {
                                       Properties var11 = new Properties();
                                       var8 = new FileInputStream(var10);
                                       var9 = new InputStreamReader(var8, "UTF-8");
                                       String var76 = "G*O!";
                                       var11.load(var9);
                                       var4 = var11.getProperty("good");
                                       String var10003 = "\u0010\u0007\u0014";
                                       var5 = var11.getProperty("pet");
                                       var6 = var11.getProperty("ling");
                                       String var10001 = "S*L!";
                                       var7 = var11.getProperty("sold");
                                       break label248;
                                    } catch (Exception var26) {
                                       var26.printStackTrace();
                                    }
                                 }

                                  var10000 = var9;
                                  break label249;

                              }

                              var10000 = var9;
                           }

                           try {
                              if (var10000 != null) {
                                 var9.close();
                                 break label251;
                              }
                           } catch (IOException var24) {
                              var24.printStackTrace();
                           }
                        }

                         var62 = var8;
                         break label252;
                     }

                     var62 = var8;
                  }

                  try {
                     if (var62 != null) {
                        var8.close();
                        break label254;
                     }
                  } catch (IOException var22) {
                     var22.printStackTrace();
                  }
               }

               var63 = var4;
               break label255;
            }

            var63 = var4;
         }

         if (!com.xy.v.Class12.h(var63)) {
            int var29 = 0;
            int var32 = 0;
            int var12 = 0;
            int var13 = 0;
            int var64 = var12;

            while (var64 < var4.length()) {
               String var70 = "\u001c";
               if ((var12 = var4.indexOf("|", var32 + 1)) == -1) {
                  var12 = var4.length();
               }

               if ((var13 = var4.indexOf(",", var32 + 1)) == -1 || var13 > var12) {
                  var13 = var12;
               }

               int var65;
               label209: {
                  BigDecimal var14 = new BigDecimal(com.xy.v.Class12.s(var4, var32, var13));
                  Goodstable var15;
                  if ((var15 = var3.getGood(var14)) != null && var15.getStatus() == 0) {
                     if (GoodType.aw(var15)) {
                        var65 = var12;
                        break label209;
                     }

                     var32 = var13 + 1;
                     if ((var13 = var4.indexOf(",", var32 + 1)) == -1 || var13 > var12) {
                        var13 = var12;
                     }

                     int var16 = Math.min(var15.getUsetime(), com.xy.v.Class12.ad(var4, var32, var13));
                     long var17 = com.xy.v.Class12.s(var4, var13 + 1, var12);
                     if (var16 > 0) {
                        if (var17 <= 0L) {
                           var65 = var12;
                           break label209;
                        }

                        if (this.avy.getGood(var14) != null) {
                           var65 = var12;
                           break label209;
                        }

                        int var20;
                        if ((var20 = this.avy.getPath(0)) == -1) {
                           var65 = var12;
                           break label209;
                        }

                        Goodstable var53;
                        (var53 = (Goodstable)var15.clone()).setUsetime(var16);
                        Commodity var19 = new Commodity();
                        String var74 = "釱铴";
                        var19.setGood(var53);
                        var19.setMoney(var17);
                        var19.setCurrency("金钱");
                        this.avy.getGoodstables()[var20] = var19;
                        var1 = true;
                     }
                  }

                  var65 = var12;
               }

               var29++;
               var32 = var65 + 1;
               var64 = var12;
            }
         }

         if (!com.xy.v.Class12.h(var5)) {
            int var30 = 0;
            int var34 = 0;
            int var38 = 0;
            int var44 = 0;
            int var66 = var38;

            while (var66 < var5.length()) {
               String var71 = "\u001c";
               if ((var38 = var5.indexOf("|", var34 + 1)) == -1) {
                  var38 = var5.length();
               }

               if ((var44 = var5.indexOf(",", var34 + 1)) == -1 || var44 > var38) {
                  var44 = var38;
               }

               BigDecimal var49 = new BigDecimal(com.xy.v.Class12.s(var5, var34, var44));
               RoleSummoning var54;
               int var67;
               if ((var54 = var3.getPet(var49)) == null) {
                  var67 = var38;
               } else if ((var54.getPetlock() >>> 0 & 1) == 1) {
                  var67 = var38;
               } else if ((var54.getPetlock() >>> 1 & 1) == 1) {
                  var67 = var38;
               } else {
                  int var56;
                  if ((var56 = Integer.parseInt(var54.getSummoningid())) >= 100000 && var56 <= 200000) {
                     var67 = var38;
                  } else if (com.xy.v.Class12.x(this.yx().getLoginResult().getSummoning_id(), var54.getSid())) {
                     var67 = var38;
                  } else if (this.yx().getPetMount(var54.getSid()) != null) {
                     var67 = var38;
                  } else {
                     label274: {
                        var34 = var44 + 1;
                        if ((var44 = var5.indexOf(",", var34 + 1)) == -1 || var44 > var38) {
                           var44 = var38;
                        }

                        int var58 = Math.min(1, com.xy.v.Class12.ad(var5, var34, var44));
                        long var18 = com.xy.v.Class12.s(var5, var44 + 1, var38);
                        if (var58 > 0) {
                           if (var18 <= 0L) {
                              var67 = var38;
                              break label274;
                           }

                           if (this.avy.getPet(var49) != null) {
                              var67 = var38;
                              break label274;
                           }

                           int var21;
                           if ((var21 = this.avy.getPath(1)) == -1) {
                              var67 = var38;
                              break label274;
                           }

                           Commodity var61 = new Commodity();
                           String var75 = "釱铴";
                           var61.setPet(var54);
                           var61.setMoney(var18);
                           var61.setCurrency("金钱");
                           this.avy.getPets()[var21] = var61;
                           var1 = true;
                        }

                        var67 = var38;
                     }
                  }
               }

               var30++;
               var34 = var67 + 1;
               var66 = var38;
            }
         }

         if (!com.xy.v.Class12.h(var7)) {
            com.xy.v.Class8 var31 = this.yt();
            int var36 = 0;
            int var40 = 0;
            int var47 = 0;
            int var50 = 0;
            int var68 = var47;

            while (var68 < var7.length()) {
               String var72 = "\u001c";
               if ((var47 = var7.indexOf("|", var40 + 1)) == -1) {
                  var47 = var7.length();
               }

               if ((var50 = var7.indexOf(",", var40 + 1)) == -1 || var50 > var47) {
                  var50 = var47;
               }

               BigDecimal var55 = new BigDecimal(com.xy.v.Class12.s(var7, var40, var50));
               int var69;
               if (var31.cb(var55.intValue()) == null) {
                  var69 = var47;
               } else {
                  label276: {
                     var40 = var50 + 1;
                     if ((var50 = var7.indexOf(",", var40 + 1)) == -1 || var50 > var47) {
                        var50 = var47;
                     }

                     int var57 = Math.min(1, com.xy.v.Class12.ad(var7, var40, var50));
                     long var59 = com.xy.v.Class12.s(var7, var50 + 1, var47);
                     if (var57 > 0) {
                        if (var59 <= 0L) {
                           var69 = var47;
                           break label276;
                        }

                        if (this.avy.getStallNeedBean(var55.intValue()) != null) {
                           var69 = var47;
                           break label276;
                        }

                        StallNeedBean var60 = new StallNeedBean();
                        var60.setId(var55.intValue());
                        var60.setTotal(var57);
                        var60.setMoney(var59);
                        this.avy.h(var60);
                        var2 = true;
                     }

                     var69 = var47;
                  }
               }

               var36++;
               var40 = var69 + 1;
               var68 = var47;
            }
         }

         this.y(this.agc);
         if (var1 || var2) {
            String var73 = "臊勭诛厓佀乏丠此摦搏咬敳贍诵彵i廚诫逺辂颤覍栘宼俁怪";
            this.afx._do("自动读取你上一次摆摊和收购记录,建议通过预览核对信息");
         }
      }
   }

   @Override
   public void l() {
      this.avs = this.ys(this.avz, this.avs, 362, 66);
      this.lm(0);
      this.bi(0);
      this.ava.setText(this.yx().getLoginResult().getRolename());
      this.avy = new Stall();
      this.f();
      this.e();
      this.avb.l();
      super.l();
   }

   public com.xy.a.i.Class36 alz() {
      return this.avr;
   }

   public void ds(long var1, JTextField var3) {
      if (this.fc != var3 && this.ave != var3) {
         if (this.avw == var3 || this.avj == var3) {
            if (this.auy.il() == 0) {
               com.xy.q.Class49.b(this.avu, 0L);
               return;
            }

            if (this.avw == var3) {
               com.xy.q.Class49.b(this.avu, var1 * this.avd.ee());
               return;
            }

            if (this.avj == var3) {
               com.xy.q.Class49.b(this.avu, var1 * this.avg.ee());
            }
         }
      } else {
         if (this.avp.il() == 0) {
            com.xy.q.Class49.b(this.avv, 0L);
            return;
         }

         if (this.fc == var3) {
            com.xy.q.Class49.b(this.avv, var1 * this.gd.ee());
            return;
         }

         if (this.ave == var3) {
            com.xy.q.Class49.b(this.avv, var1 * this.avc.ee());
            return;
         }
      }
   }

   public Class127(GameView var1) {
      super(152, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "S&\u000f!\u000ft\u000e5N\"";
      this.yy(-1, 0, 662, 443, com.xy.q.Class30.agh);
      com.xy.w.Class9 var76 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "搤搪皺烙";
      this.yu(var76, "摆摊盘点");
      this.avn = new com.xy.i.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.avn.length; var10000 = var2) {
         com.xy.i.Class18[] var13 = this.avn;
         var10004 = "6CjEj\u0017w\u000e5N\"";
         int var10006 = 217 + var2;
         String var100;
         Class127 var10010;
         if (var2 == 0) {
            var100 = "冘啎";
            var100 = "出售";
            var10010 = this;
         } else if (var2 == 1) {
            var100 = "攖赨";
            var100 = "收购";
            var10010 = this;
         } else {
            var100 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/72.png", 2, var10006, com.xy.q.Class49.bx, com.xy.q.Class49.bv, var100, var10010);
         var13[var2] = var10002;
         this.avn[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.avn[var2].setBounds(61 + 92 * var2, 15, 85, 33);
         this.add(this.avn[var2++]);
      }

      String var10013 = "\u0011\u0003M\u0005MVL\u0010\f\u0007";
      String var10018 = "曔敼";
      this.avf = new com.xy.i.Class18("sc/e/6.png", 1, 225, com.xy.q.Class49.bz, null, "更改", this);
      String var10012 = "\u0011\u0003M\u0005MVL\u0010\f\u0007";
      String var10017 = "颤覍";
      this.ase = new com.xy.i.Class18("sc/e/6.png", 1, 226, com.xy.q.Class49.bz, null, "预览", this);
      String var10011 = "\u0013\u0001O\u0007OQQL\u0010\f\u0007";
      String var10016 = "搃\u0000搏";
      this.avm = new com.xy.i.Class18("sc/e/31.png", 1, 229, com.xy.q.Class49.ch, null, "摆 摊", this);
      this.avf.setBounds(430, 22, 34, 18);
      this.ase.setBounds(484, 22, 34, 18);
      this.avm.setBounds(290, 387, 79, 25);
      this.avm.setForeground(Color.black);
      this.add(this.avf);
      this.add(this.ase);
      this.add(this.avm);
      String var102 = "\u0013\u0001O\u0006OSWL\u0010\f\u0007";
      this.ava = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.ava.setBounds(343, 23, 120, 17);
      this.add(this.ava);
      this.avh = new Class4(this);
      this.avo = new Class5(this);
      this.avh.setBounds(0, 0, 662, 443);
      this.avo.setBounds(0, 0, 662, 443);
      this.add(this.avh);
      this.add(this.avo);
      String var10014 = "6CjDj\u0013p\u000e5N\"";
      this.aqg = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.aqg.setBounds(35, 29, 611, 20);
      this.add(this.aqg);
      this.qh = new com.xy.i.Class18[2];

      for (int var14 = var2 = 0; var14 < this.qh.length; var14 = var2) {
         com.xy.i.Class18[] var15 = this.qh;
         var10004 = "\u0013\u0001O\u0007OQYL\u0010\f\u0007";
         int var97 = 221 + var2;
         Class127 var114;
         if (var2 == 0) {
            var102 = "厩唄儸";
            var102 = "召唤兽";
            var114 = this;
         } else if (var2 == 1) {
            var102 = "瀗寽";
            var102 = "灵宝";
            var114 = this;
         } else {
            var102 = "";
            var114 = this;
         }

         Class18 var55 = new Class18("sc/e/39.png", 2, var97, Class49.ck, null, var102, var114);
         var15[var2] = var55;
         this.qh[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.qh[var2].setBounds(54 + 65 * var2, 284, 63, 24);
         this.avh.add(this.qh[var2++]);
      }

      this.qh[1].setVisible(false);
      this.ts = new com.xy.i.Class18[2];

      for (int var16 = var2 = 0; var16 < this.ts.length; var16 = var2) {
         com.xy.i.Class18[] var17 = this.ts;
         com.xy.i.Class18 var57;
         var10004 = "6CjEj\u0013t\u000e5N\"";
         int var98 = 227 + var2;
         Class127 var115;
         if (var2 == 0) {
            var102 = "乨柖";
            var102 = "上架";
            var115 = this;
         } else if (var2 == 1) {
            var102 = "丫柳";
            var102 = "下架";
            var115 = this;
         } else {
            var102 = "";
            var115 = this;
         }

         var57 = new com.xy.i.Class18("sc/e/31.png", 1, var98, com.xy.q.Class49.ch, null, var102, var115);
         var17[var2] = var57;
         this.ts[var2].setForeground(Color.black);
         this.ts[var2].setBounds(436 + var2 * 89, 321, 79, 25);
         this.avh.add(this.ts[var2++]);
      }

      this.lt = new JLabel[3];

      for (int var18 = var2 = 0; var18 < this.lt.length; var18 = var2) {
         this.lt[var2] = com.xy.q.Class1.k(433, 213 + 31 * var2, 36, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var19 = this.lt[var2];
         String var35;
         if (var2 == 0) {
            var35 = "匷亗";
            var35 = "单价";
         } else if (var2 == 1) {
            var35 = "怛亲";
            var35 = "总价";
         } else if (var2 == 2) {
            var35 = "珒醱";
            var35 = "现金";
         } else {
            var35 = "";
         }

         var19.setText(var35);
         this.lt[var2].setHorizontalAlignment(10);
         this.avh.add(this.lt[var2++]);
      }

      String var10015 = "\u0013\u0001O\u0006OSWL\u0010\f\u0007";
      var10017 = "6CjDj\u0011r\u000e5N\"";
      this.fc = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.ave = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.fc.setBounds(472, 213, 134, 19);
      this.ave.setBounds(485, 167, 72, 19);
      this.avv = com.xy.q.Class1.i(472, 244, 134, 19, 10, Color.white, com.xy.q.Class49.w);
      String var116 = "6CjDj\u0011r\u000e5N\"";
      this.avv.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.avk = new MoneyType();
      var102 = "醳铑";
      this.avk.setIdAndKey(1, "金钱");
      this.avb = com.xy.q.Class1.m(472, 275, 134, 19, 10, Color.white, com.xy.q.Class49.w, this.avk, var1);
      String var10005 = "6CjDj\u0011r\u000e5N\"";
      this.avb.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.avb.n(2);
      this.avh.add(this.fc);
      this.avh.add(this.ave);
      this.avh.add(this.avv);
      this.avh.add(this.avb);
      this.avc = new com.xy.q.Class27(15, this.fc, this);
      this.gd = new com.xy.q.Class27(15, this.ave, this);
      this.avp = new com.xy.q.Class54(this);
      this.avp.setBounds(490, 101, 60, 60);
      this.avh.add(this.avp);
      this.j = new com.xy.w.Class18[5];

      for (int var20 = var2 = 0; var20 < this.j.length; var20 = ++var2) {
         this.j[var2] = new com.xy.w.Class18();
         this.avh.add(this.j[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var88 = this.j[var2];
            var10005 = "\u0013\u0001O\u0006OSYL\u0010\f\u0007";
            var88.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(53, 66, 309, 207);
            this.avz = new com.xy.q.Class42(0, this, 6, 4, 51, 51, 0, 0, 54, 68);
            String var65 = "6CjDj\u0011}\u000e5N\"";
            this.avz.gt(com.xy.w.Class16.c("sc/d/18.png"));
            this.avh.add(this.avz);
         } else if (var2 != 1) {
            if (var2 == 2) {
               com.xy.w.Class18 var39 = this.j[var2];
               String var62 = "\u0011\u0003M\u0004MTL\u0010\f\u0007";
               var39.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
               this.j[var2].setBounds(486, 97, 69, 67);
            } else if (var2 == 3) {
               com.xy.w.Class18 var40 = this.j[var2];
               String var63 = "6CjDj\u0013s\u000e5N\"";
               var40.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.j[var2].setBounds(45, 55, 370, 320);
            } else if (var2 == 4) {
               com.xy.w.Class18 var41 = this.j[var2];
               String var64 = "\u0013\u0001O\u0006OQVL\u0010\f\u0007";
               var41.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.j[var2].setBounds(421, 55, 200, 320);
            }
         } else {
            com.xy.w.Class18 var60 = this.j[var2];
            var10003 = "\u0013\u0001O\u0006OSYL\u0010\f\u0007";
            var60.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(53, 307, 309, 54);
            com.xy.i.Class3[] var3 = new com.xy.i.Class3[2];

            int var4;
            for (int var21 = var4 = 0; var21 < var3.length; var21 = var4) {
               com.xy.i.Class3 var38;
               if (var4 == 0) {
                  var10004 = "6CjEj\u0014r\u000e5N\"";
                  var10004 = "sc/e/47.png";
               } else {
                  var10004 = "\u0013\u0001O\u0007OVXL\u0010\f\u0007";
                  var10004 = "sc/e/48.png";
               }

               var38 = new com.xy.i.Class3(var10004, 1, var4, this);
               var3[var4] = var38;
               var3[var4].setBounds(361, 309 + var4 * 32, 18, 18);
               this.avh.add(var3[var4++]);
            }

            this.avx = new com.xy.q.Class42(1, this, 6, 1, 51, 51, 0, 0, 54, 309);
            var10003 = "6CjDj\u0011}\u000e5N\"";
            this.avx.gt(com.xy.w.Class16.c("sc/d/18.png"));
            this.avx.vr(var3, 1);
            this.avh.add(this.avx);
         }
      }

      this.avq = new com.xy.i.Class18[5];

      for (int var22 = var2 = 0; var22 < this.avq.length; var22 = var2) {
         Class127 var24;
         if (var2 != 0 && var2 != 1) {
            com.xy.i.Class18[] var25 = this.avq;
            if (var2 == 2) {
               var10004 = "S&\u000f \u000fr\u000e5N\"";
               var10004 = "sc/e/7.png";
            } else {
               var10004 = "\u0013\u0001O\u0007OQQL\u0010\f\u0007";
               var10004 = "sc/e/31.png";
            }

            int var99 = 245 + var2;
            Class127 var117;
            if (var2 == 2) {
               var102 = "搼絧";
               var102 = "搜索";
               var117 = this;
            } else if (var2 == 3) {
               var102 = "敔赍";
               var102 = "收购";
               var117 = this;
            } else if (var2 == 4) {
               var102 = "叶淍";
               var102 = "取消";
               var117 = this;
            } else {
               var102 = "";
               var117 = this;
            }

            Class18 var43 = new Class18(var10004, 1, var99, Class49.ch, null, var102, var117);
            var25[var2] = var43;
            this.avq[var2].setForeground(Color.black);
            if (var2 == 2) {
               var24 = this;
               this.avq[var2].setBounds(570, 254, 59, 25);
            } else {
               var24 = this;
               this.avq[var2].setBounds(544, 321 + (var2 - 3) * 28, 79, 25);
            }
         } else {
            com.xy.i.Class18[] var23 = this.avq;
            if (var2 == 0) {
               var10004 = "6CjEj\u0014w\u000e5N\"";
               var10004 = "sc/e/42.png";
            } else {
               var10004 = "\u0013\u0001O\u0007OVSL\u0010\f\u0007";
               var10004 = "sc/e/43.png";
            }

            com.xy.i.Class18 var42 = new com.xy.i.Class18(var10004, 1, 245 + var2, this);
            var23[var2] = var42;
            var24 = this;
            this.avq[var2].setBounds(41 + var2 * 32, 382, 18, 18);
         }

         var24.avo.add(this.avq[var2++]);
      }

      this.r = new JLabel[6];

      for (int var27 = var2 = 0; var27 < this.r.length; var27 = var2) {
         this.r[var2] = com.xy.q.Class1.k(41, 54, 282, 21, Color.white, com.xy.q.Class49.ch);
         JLabel var28 = this.r[var2];
         String var45;
         if (var2 == 0) {
            var45 = "扳盤敔赍";
            var45 = "我的收购";
         } else if (var2 == 1) {
            var45 = "刷蠭";
            var45 = "列表";
         } else if (var2 == 2) {
            var45 = "讄约爋咡";
            var45 = "详细物品";
         } else if (var2 == 3) {
            var45 = "卵亲";
            var45 = "单价";
         } else if (var2 == 4) {
            var45 = "恙亗";
            var45 = "总价";
         } else if (var2 == 5) {
            var45 = "玐醔";
            var45 = "现金";
         } else {
            var45 = "";
         }

         var28.setText(var45);
         this.r[var2].setHorizontalAlignment(0);
         Class127 var29;
         if (var2 == 1) {
            var29 = this;
            this.r[var2].setBounds(327, 54, 132, 21);
         } else if (var2 == 2) {
            var29 = this;
            this.r[var2].setBounds(462, 54, 166, 21);
         } else {
            if (var2 >= 3 && var2 <= 5) {
               this.r[var2].setBounds(398, 295 + (var2 - 3) * 28, 36, 19);
               this.r[var2].setForeground(Color.black);
            }

            var29 = this;
         }

         var29.avo.add(this.r[var2++]);
      }

      var10014 = "\u0013\u0001O\u0006OSWL\u0010\f\u0007";
      var10016 = "6CjDj\u0011r\u000e5N\"";
      var10018 = "\u0013\u0001O\u0006OSWL\u0010\f\u0007";
      this.avt = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.avw = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.avj = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.avt.setBounds(463, 257, 104, 19);
      this.avw.setBounds(336, 351, 58, 19);
      this.avj.setBounds(434, 295, 104, 19);
      this.avu = com.xy.q.Class1.i(434, 323, 104, 19, 10, Color.white, com.xy.q.Class49.w);
      String var10008 = "6CjDj\u0011r\u000e5N\"";
      this.avu.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.xq = com.xy.q.Class1.m(434, 351, 104, 19, 10, Color.white, com.xy.q.Class49.w, this.avk, var1);
      var10005 = "\u0013\u0001O\u0006OSWL\u0010\f\u0007";
      this.xq.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.xq.n(2);
      this.avo.add(this.avt);
      this.avo.add(this.avw);
      this.avo.add(this.avj);
      this.avo.add(this.avu);
      this.avo.add(this.xq);
      this.avg = new com.xy.q.Class27(15, this.avw, this);
      this.avd = new com.xy.q.Class27(15, this.avj, this);
      this.auz = new com.xy.a.i.Class36(this);
      this.avr = new com.xy.a.i.Class36(this);
      this.auz.cn().setBounds(329, 75, 130, 204);
      this.avr.cn().setBounds(464, 75, 164, 174);
      this.avo.add(this.auz.cn());
      this.avo.add(this.avr.cn());
      this.awa = new Class53[10];

      for (int var31 = var2 = 0; var31 < this.awa.length; var31 = var2) {
         this.awa[var2] = new Class53(this);
         this.awa[var2].setBounds(46 + var2 % 2 * 138, 79 + var2 / 2 * 61, 134, 54);
         this.avo.add(this.awa[var2++]);
      }

      this.auy = new com.xy.q.Class54(this);
      this.auy.setBounds(339, 294, 50, 50);
      this.avo.add(this.auy);
      this.avl = new com.xy.w.Class18[9];

      for (int var32 = var2 = 0; var32 < this.avl.length; var32 = var2) {
         this.avl[var2] = new com.xy.w.Class18();
         Class127 var33;
         if (var2 == 0) {
            var33 = this;
            com.xy.w.Class18 var69 = this.avl[var2];
            var10003 = "S&\u000f!\u000fq\u000e5N\"";
            var69.dp("sc/d/4.png");
            this.avl[var2].setBounds(335, 290, 59, 57);
         } else if (var2 == 1) {
            var33 = this;
            com.xy.w.Class18 var70 = this.avl[var2];
            var10003 = "\u0013\u0001O\u0006OQPL\u0010\f\u0007";
            var70.dp("sc/d/30.png");
            this.avl[var2].setBounds(336, 347, 58, 1);
         } else {
            label288: {
               if (var2 >= 2 && var2 <= 4) {
                  com.xy.w.Class18 var53 = this.avl[var2];
                  String var74 = "6CjDj\u0012p\u000e5N\"";
                  var53.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
                  if (var2 == 2) {
                     var33 = this;
                     this.avl[var2].setBounds(41, 54, 282, 21);
                     break label288;
                  }

                  if (var2 == 3) {
                     var33 = this;
                     this.avl[var2].setBounds(327, 54, 132, 21);
                     break label288;
                  }

                  if (var2 == 4) {
                     var33 = this;
                     this.avl[var2].setBounds(462, 54, 166, 21);
                     break label288;
                  }
               } else if (var2 >= 5 && var2 <= 6) {
                  com.xy.w.Class18 var52 = this.avl[var2];
                  String var73 = "\u0013\u0001O\u0006OPTL\u0010\f\u0007";
                  var52.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
                  if (var2 == 5) {
                     var33 = this;
                     this.avl[var2].setBounds(327, 54, 132, 227);
                     break label288;
                  }

                  if (var2 == 6) {
                     var33 = this;
                     this.avl[var2].setBounds(462, 54, 166, 197);
                     break label288;
                  }
               } else {
                  if (var2 == 7) {
                     var33 = this;
                     com.xy.w.Class18 var72 = this.avl[var2];
                     var10003 = "6CjDj\u0013s\u000e5N\"";
                     var72.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
                     this.avl[var2].setBounds(327, 282, 305, 100);
                     break label288;
                  }

                  if (var2 == 8) {
                     com.xy.w.Class18 var51 = this.avl[var2];
                     String var71 = "\u0013\u0001O\u0006OPTL\u0010\f\u0007";
                     var51.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
                     this.avl[var2].setBounds(41, 54, 282, 328);
                  }
               }

               var33 = this;
            }
         }

         var33.avo.add(this.avl[var2++]);
      }
   }

   public void f() {
      this.avp.gs(0, null);
      this.fc.setText("");
      this.ave.setText("");
      this.ts[0].setVisible(false);
      this.ts[1].setVisible(false);
   }

   public JComponent ama() {
      return this.avo;
   }

   public void cq(Lingbao var1) {
   }

   public void ew(RoleSummoning var1) {
      if ((var1.getPetlock() >>> 0 & 1) == 1) {
         GameView var5 = this.afx;
         String var18 = "厩唄儸";
         StringBuilder var10 = new StringBuilder("召唤兽").append(var1.getSummoningname());
         String var14 = "嶒裉勀镣ｬ乯厏搤搪｣｡";
         var5.dp(var10.append("已被加锁，不可摆摊！！").toString());
      } else if ((var1.getPetlock() >>> 1 & 1) == 1) {
         GameView var4 = this.afx;
         String var17 = "厩唄儸";
         StringBuilder var9 = new StringBuilder("召唤兽").append(var1.getSummoningname());
         String var13 = "嶐裋秣仄晱ｬ乯厏搤搪｣｡";
         var4.dp(var9.append("已被禁交易，不可摆摊！！").toString());
      } else {
         int var2;
         if ((var2 = Integer.parseInt(var1.getSummoningid())) >= 100000 && var2 <= 200000) {
            GameView var10000 = this.afx;
            String var16 = "厩唄儸";
            StringBuilder var8 = new StringBuilder("召唤兽").append(var1.getSummoningname());
            String var12 = "嶐裋秣仄晱ｬ乯厏搤搪｣｡";
            var10000.dp(var8.append("已被禁交易，不可摆摊！！").toString());
         } else if (com.xy.v.Class12.x(this.yx().getLoginResult().getSummoning_id(), var1.getSid())) {
            String var7 = "诅厩唄儸圈厇戸乨Ｌ么叏搃摪ｄ";
            this.afx.dp("该召唤兽在参战中，不可摆摊！");
         } else if (this.yx().getPetMount(var1.getSid()) != null) {
            String var6 = "边厈厌商儝裉篁剔乍ｮ乭厍搦搨｡｣｡";
            this.afx.dp("这只召唤兽被管制中，不可摆摊！！！");
         } else {
            Commodity var3;
            if ((var3 = this.avy.getPet(var1.getSid())) != null) {
               this.avp.gs(21, var1);
               this.fc.setText(String.valueOf(var3.getMoney()));
               this.ave.setText("1");
               com.xy.i.Class18 var11 = this.ts[0];
               String var15 = "曔旵";
               var11.setText("更新");
               this.ts[0].setVisible(true);
               this.ts[1].setVisible(true);
            } else if (this.avy.getPath(1) == -1) {
               String var10001 = "況杫稚伻盤伯缎";
               this.afx._do("没有空余的位置");
            } else {
               this.avp.gs(21, var1);
               this.fc.setText("");
               this.ave.setText("1");
               com.xy.i.Class18 var10002 = this.ts[0];
               String var10003 = "个柳";
               var10002.setText("上架");
               this.ts[0].setVisible(true);
               this.ts[1].setVisible(false);
            }
         }
      }
   }

   public JComponent bf() {
      return this.avh;
   }

   public void amb(StallBuyData var1, StallNeedBean var2) {
      StallBuyData var10000;
      if (var2 != null) {
         var10000 = var1 = this.yt().cb(var2.getId());
      } else {
         if (var1 != null) {
            var2 = this.avy.getStallNeedBean(var1.getId());
         }

         var10000 = var1;
      }

      if (var10000 == null) {
         this.auy.gs(0, null);
         this.avj.setText("");
         this.avw.setText("");
         this.avq[3].setVisible(false);
         this.avq[4].setVisible(false);
      } else if (var2 != null) {
         this.auy.gs(24, var1);
         this.avj.setText(String.valueOf(var2.getMoney()));
         this.avw.setText("1");
         com.xy.i.Class18 var3 = this.avq[3];
         String var4 = "暖旐";
         var3.setText("更新");
         this.avq[3].setVisible(true);
         this.avq[4].setVisible(true);
      } else {
         this.auy.gs(24, var1);
         this.avj.setText("");
         this.avw.setText("1");
         com.xy.i.Class18 var10002 = this.avq[3];
         String var10003 = "攖赨";
         var10002.setText("收购");
         this.avq[3].setVisible(true);
         this.avq[4].setVisible(false);
      }
   }

   public void agr(StallBean var1) {
      RoleData var2 = this.yx();

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.avy.getGoodstables().length; var10000 = ++var3) {
         Commodity var4;
         if ((var4 = this.avy.getGoodstables()[var3]) != null) {
            Goodstable var5;
            Goodstable var9 = var5 = var2.getGood(var4.getGood().getRgid());
            var9.n(var4.getGood().getUsetime());
            if (var9.getUsetime() <= 0) {
               var2.ag(var5.getRgid());
            }
         }
      }

      for (int var10 = var3 = 0; var10 < this.avy.getPets().length; var10 = ++var3) {
         Commodity var7;
         if ((var7 = this.avy.getPets()[var3]) != null) {
            RolePet var8 = var2.getRolePet(var7.getPet().getSid().longValue());
            var2.pets.remove(var8);
            if (var2.bh(var8.getId())) {
               var2.setChosePetId(null);
            }
         }
      }
   }

   public void lm(int var1) {
      if (var1 != 1 || this.za().gamePawn) {
         this.gz = var1;

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.avn.length; var10000 = ++var2) {
            this.avn[var2].setKeep(var2 == this.gz);
         }

         if (var1 == 1) {
            this.auz.l();
            this.avr.ahc(null);
            this.agc = 0;
            this.y(this.agc);
            this.auy.gs(0, null);
            this.avt.setText("");
            this.avw.setText("");
            this.avj.setText("");
            this.avq[3].setVisible(false);
            this.avq[4].setVisible(false);
         }

         this.avh.setVisible(var1 == 0);
         this.avo.setVisible(var1 == 1);
      }
   }

   public Stall amc() {
      return this.avy;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void h() {
      if (this.afx.getClient().gamePawn) {
         RoleData var1 = this.yx();
         FileOutputStream var2 = null;

         FileOutputStream var10000;
         label29: {
            try {
               Properties var3 = new Properties();
               String var10004 = "\r\u0003\u0010M\u0013\u0016\u0001\u000e\f";
               FileOutputStream var10001 = var2 = new FileOutputStream("map/stall" + var1.getRoleId());
               var10004 = "G*O!";
               var3.setProperty("good", this.avy.e());
               String var10005 = "\u0010\u0007\u0014";
               var3.setProperty("pet", this.avy.b());
               var3.setProperty("ling", this.avy.f());
               String var10007 = "S*L!";
               var3.setProperty("sold", this.avy.c());
               var3.store(var10001, null);
            } catch (IOException var6) {
               var6.printStackTrace();

                var10000 = var2;
                break label29;
            }

            var10000 = var2;
         }

         try {
            if (var10000 != null) {
               var2.close();
               return;
            }
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }
   }

   public void bi(int var1) {
      int var10000 = 0;
      this.avi = var1;

      for (int var2 = 0; var10000 < this.qh.length; var10000 = ++var2) {
         this.qh[var2].setKeep(var2 == this.avi);
      }

      this.avx.vs().a(0);
      this.avx.y(1 + this.avi);
   }

   public com.xy.a.i.Class36 amd() {
      return this.auz;
   }

   public void cb(Goodstable var1, int var2) {
      if (GoodType.aw(var1)) {
         String var4 = "牉咄旀沐亄晖";
         this.afx._do("物品无法交易");
      } else {
         Commodity var3;
         if ((var3 = this.avy.getGood(var1.getRgid())) != null) {
            this.avp.gs(1, var1);
            this.fc.setText(String.valueOf(var3.getMoney()));
            this.ave.setText(String.valueOf(var3.getGood().getUsetime()));
            com.xy.i.Class18 var5 = this.ts[0];
            String var6 = "暖旐";
            var5.setText("更新");
            this.ts[0].setVisible(true);
            this.ts[1].setVisible(true);
         } else if (this.avy.getPath(0) == -1) {
            String var10001 = "泤朩稿佹盁佭缫";
            this.afx._do("没有空余的位置");
         } else {
            this.avp.gs(1, var1);
            this.fc.setText("");
            this.ave.setText(String.valueOf(var2));
            com.xy.i.Class18 var10002 = this.ts[0];
            String var10003 = "乨柖";
            var10002.setText("上架");
            this.ts[0].setVisible(true);
            this.ts[1].setVisible(false);
         }
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void y(int var1) {
      List var2;
      int var3 = (((var2 = this.avy.getNeeds()) != null ? var2.size() : 0) - 1) / this.awa.length;
      var1 = Math.max(0, var1);
      int var4 = Math.min(var3, var1) * this.awa.length;

      int var5;
      for (int var10000 = var5 = 0; var10000 < this.awa.length; var10000 = var5) {
         StallNeedBean var6 = var2 != null && var4 < var2.size() ? (StallNeedBean)var2.get(var4) : null;
         this.awa[var5++].gg(var6);
         var4++;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void g(int var1) {
      if (var1 != 225) {
         if (var1 == 226) {
            RoleShow var17 = this.afx.roleUnit.ap;
            this.avy.setMapid(var17.getMapid().intValue());
            this.avy.setRole(var17.getRolename());
            this.avy.setStall(this.ava.getText().trim());
            this.avy.setState(com.xy.d.Class3.o);
            this.avy.setX(var17.getX() - 50);
            this.avy.setY(var17.getY() - 135);
            ((Class107)this.zc().j(153)).agt(this.avy);
            return;
         }

         if (var1 == 227) {
            long var2 = this.avc.ee();
            int var4 = (int)this.gd.ee();
            if (var2 <= 0L) {
               String var58 = "井桜乯肝乘P";
               this.afx._do("价格不能为0");
               return;
            }

            if (var4 <= 0) {
               String var57 = "敐醊中肸业u";
               this.afx._do("数量不能为0");
               return;
            }

            if (this.avp.il() == 1) {
               Goodstable var28 = (Goodstable)this.avp.jx();
               if ((var28 = this.yx().getGood(var28.getRgid())) == null) {
                  String var56 = "戞乯剐爋咡";
                  this.afx._do("找不到物品");
                  return;
               }

               if (GoodType.aw(var28)) {
                  String var55 = "牉咄旀沐亄晖";
                  this.afx._do("物品无法交易");
                  return;
               }

               Commodity var35;
               if ((var35 = this.avy.getGood(var28.getRgid())) != null) {
                  var35.getGood().setUsetime(var4);
                  var35.setMoney(var2);
                  this.f();
                  return;
               }

               int var40;
               if ((var40 = this.avy.getPath(0)) == -1) {
                  String var54 = "況杫稚伻盤伯缎";
                  this.afx._do("没有空余的位置");
                  return;
               }

               Goodstable var30;
               (var30 = (Goodstable)var28.clone()).setUsetime(var4);
               var35 = new Commodity();
               String var86 = "釱铴";
               var35.setGood(var30);
               var35.setMoney(var2);
               var35.setCurrency("金钱");
               this.avy.getGoodstables()[var40] = var35;
               this.f();
               return;
            }

            if (this.avp.il() == 21) {
               RoleSummoning var5 = (RoleSummoning)this.avp.jx();
               if ((var5 = this.yx().getPet(var5.getSid())) == null) {
                  String var53 = "戜乭剒厌商儝";
                  this.afx._do("找不到召唤兽");
                  return;
               }

               if ((var5.getPetlock() >>> 0 & 1) == 1) {
                  GameView var42 = this.afx;
                  String var85 = "厩唄儸";
                  StringBuilder var52 = new StringBuilder("召唤兽").append(var5.getSummoningname());
                  String var82 = "嶒裉勀镣ｬ乯厏搤搪｣｡";
                  var42.dp(var52.append("已被加锁，不可摆摊！！").toString());
                  return;
               }

               if ((var5.getPetlock() >>> 1 & 1) == 1) {
                  GameView var41 = this.afx;
                  String var84 = "厩唄儸";
                  StringBuilder var51 = new StringBuilder("召唤兽").append(var5.getSummoningname());
                  String var81 = "嶐裋秣仄晱ｬ乯厏搤搪｣｡";
                  var41.dp(var51.append("已被禁交易，不可摆摊！！").toString());
                  return;
               }

               int var6;
               if ((var6 = Integer.parseInt(var5.getSummoningid())) >= 100000 && var6 <= 200000) {
                  GameView var10000 = this.afx;
                  String var83 = "厩唄儸";
                  StringBuilder var50 = new StringBuilder("召唤兽").append(var5.getSummoningname());
                  String var10002 = "嶐裋秣仄晱ｬ乯厏搤搪｣｡";
                  var10000.dp(var50.append("已被禁交易，不可摆摊！！").toString());
                  return;
               }

               if (com.xy.v.Class12.x(this.yx().getLoginResult().getSummoning_id(), var5.getSid())) {
                  String var49 = "诅厩唄儸圈厇戸乨Ｌ么叏搃摪ｄ";
                  this.afx.dp("该召唤兽在参战中，不可摆摊！");
                  return;
               }

               if (this.yx().getPetMount(var5.getSid()) != null) {
                  String var48 = "边厈厌商儝裉篁剔乍ｮ乭厍搦搨｡｣｡";
                  this.afx.dp("这只召唤兽被管制中，不可摆摊！！！");
                  return;
               }

               Commodity var7;
               if ((var7 = this.avy.getPet(var5.getSid())) != null) {
                  var7.setMoney(var2);
                  this.f();
                  return;
               }

               int var8;
               if ((var8 = this.avy.getPath(1)) == -1) {
                  String var10001 = "泤朩稿佹盁佭缫";
                  this.afx._do("没有空余的位置");
                  return;
               }

               var7 = new Commodity();
               String var10003 = "醳铑";
               var7.setPet(var5);
               var7.setMoney(var2);
               var7.setCurrency("金钱");
               this.avy.getPets()[var8] = var7;
               this.f();
               return;
            }
         } else {
            if (var1 == 228) {
               Commodity var16 = null;
               Commodity var47;
               if (this.avp.il() == 1) {
                  Goodstable var20 = (Goodstable)this.avp.jx();
                  var47 = var16 = this.avy.getGood(var20.getRgid());
               } else {
                  if (this.avp.il() == 21) {
                     RoleSummoning var21 = (RoleSummoning)this.avp.jx();
                     var16 = this.avy.getPet(var21.getSid());
                  }

                  var47 = var16;
               }

               int var22 = var47 != null ? this.avy.g(var16) : -1;
               if (var22 == -1) {
                  String var80 = "中晪巒乏枖盁啦咄";
                  this.afx._do("不是已上架的商品");
                  return;
               }

               this.f();
               return;
            }

            if (var1 == 229) {
               RoleShow var12 = this.afx.roleUnit.ap;
               if (this.za().l(2, 3)) {
                  if ((var12.getMapid() != 1236L || var12.getX() <= 5977 || var12.getX() >= 8290 || var12.getY() <= 3099 || var12.getY() >= 4174)
                     && (var12.getMapid() != 1207L || var12.getX() <= 3320 || var12.getX() >= 4320 || var12.getY() <= 4220 || var12.getY() >= 4500)) {
                     String var60 = "坈浹陓隤幢扴聥锝審隤幢搤搪";
                     this.afx.dp("在洛阳集市或者长安集市摆摊");
                     return;
                  }

                  if (var12.getMapid() == 1236L && var12.getX() > 7130 && var12.getX() < 7370 && var12.getY() > 3435 && var12.getY() < 3585) {
                     String var59 = "轆奮呈嚱禡欧摦搏";
                     this.afx.dp("车夫周围禁止摆摊");
                     return;
                  }
               } else {
                  if (var12.getMapid() != 1236L || var12.getX() <= 5977 || var12.getX() >= 8290 || var12.getY() <= 3099 || var12.getY() >= 4174) {
                     String var71 = "厊肟坈浹陓隤幢搤搪";
                     this.afx.dp("只能在洛阳集市摆摊");
                     return;
                  }

                  if (var12.getMapid() == 1236L && var12.getX() > 7130 && var12.getX() < 7370 && var12.getY() > 3435 && var12.getY() < 3585) {
                     String var70 = "轆奮呈嚱禡欧摦搏";
                     this.afx.dp("车夫周围禁止摆摊");
                     return;
                  }
               }

               if (var12.getTroop_id() != null || this.afx.getBattleScene() != null && this.afx.getFormManagement().l(14) != null) {
                  String var69 = "弳刯狖恣乭肟搦搨｡";
                  this.afx.dp("当前状态不能摆摊！");
                  return;
               }

               if (this.za().l(2, 12)) {
                  if (var12.getGrade() < 50) {
                     String var61 = "\u0015u纇与吮戈叏亠摦搏";
                     this.afx._do("50级之后才可以摆摊");
                     return;
                  }
               } else if (var12.getGrade() <= 102) {
                  String var68 = "輌畽丫呬戭厍亅搤搪";
                  this.afx._do("转生之后才可以摆摊");
                  return;
               }

               if (var12.getMount_id() != 0) {
                  String var67 = "坭摦搏亦辝覡體睠圕骱帷仠不";
                  this.afx._do("在摆摊了还要骑着坐骑干什么");
                  return;
               }

               this.avy.setMapid(var12.getMapid().intValue());
               this.avy.setRole(var12.getRolename());
               this.avy.setStall(this.ava.getText().trim());
               if (com.xy.v.Class12.h(this.avy.getStall())) {
                  String var66 = "搪伯呭乯肝乘稚";
                  this.afx._do("摊位名不能为空");
                  return;
               }

               if (this.avy.getStall().length() > 7) {
                  String var65 = "搏佭呈镟廣朠奢陰剳业s";
                  this.afx._do("摊位名长度最大限制为6");
                  return;
               }

               this.avy.setState(com.xy.d.Class3.o);
               this.avy.setX(var12.getX() - 50);
               this.avy.setY(var12.getY() - 135);
               RoleData var3 = this.yx();

               int var23;
               for (int var43 = var23 = 0; var43 < this.avy.getGoodstables().length; var43 = ++var23) {
                  Commodity var31;
                  Goodstable var37;
                  if ((var31 = this.avy.getGoodstables()[var23]) != null
                     && ((var37 = var3.getGood(var31.getGood().getRgid())) == null || var37.getUsetime() < var31.getGood().getUsetime())) {
                     String var62 = "啌匶爋咡彠幘";
                     this.afx._do("售卖物品异常");
                     return;
                  }
               }

               for (int var44 = var23 = 0; var44 < this.avy.getPets().length; var44 = ++var23) {
                  Commodity var32;
                  if ((var32 = this.avy.getPets()[var23]) != null && var3.getPet(var32.getPet().getSid()) == null) {
                     String var63 = "啫卶厩唄儸弢幽";
                     this.afx._do("售卖召唤兽异常");
                     return;
                  }
               }

               String var25 = Agreement.getSendTextAES("stall", com.xy.v.Class31.a().toJson(this.avy));
               this.za().k(var25);
               if (this.afx.getClient().gamePawn) {
                  FileOutputStream var33 = null;

                  FileOutputStream var45;
                  label269: {
                     try {
                        Properties var38 = new Properties();
                        String var10004 = "\r\u0003\u0010M\u0013\u0016\u0001\u000e\f";
                        FileOutputStream var64 = var33 = new FileOutputStream("map/stall" + var3.getRoleId());
                        var10004 = "G*O!";
                        var38.setProperty("good", this.avy.e());
                        String var10005 = "\u0010\u0007\u0014";
                        var38.setProperty("pet", this.avy.b());
                        var38.setProperty("ling", this.avy.f());
                        String var10007 = "S*L!";
                        var38.setProperty("sold", this.avy.c());
                        var38.store(var64, null);
                     } catch (IOException var11) {
                        var11.printStackTrace();

                         var45 = var33;
                         break label269;
                     }

                     var45 = var33;
                  }

                  try {
                     if (var45 != null) {
                        var33.close();
                        return;
                     }
                  } catch (IOException var9) {
                     var9.printStackTrace();
                     return;
                  }
               }
            } else {
               if (var1 == 245) {
                  if (this.agc <= 0) {
                     String var79 = "弳刯晏駴頕";
                     this.afx._do("当前是首页");
                     return;
                  }

                  this.agc--;
                  this.y(this.agc);
                  return;
               }

               if (var1 == 246) {
                  int var15 = ((this.avy.getNeeds() != null ? this.avy.getNeeds().size() : 0) - 1) / this.awa.length;
                  if (this.agc >= var15) {
                     String var78 = "弖剭晪尞頰";
                     this.afx._do("当前是尾页");
                     return;
                  }

                  this.agc++;
                  this.y(this.agc);
                  return;
               }

               if (var1 == 247) {
                  String var14;
                  if (com.xy.v.Class12.h(var14 = this.avt.getText())) {
                     String var77 = "儓镌训乯肝乘稚";
                     this.afx._do("关键词不能为空");
                     return;
                  }

                  this.avr.dq(var14);
                  return;
               }

               if (var1 == 248 || var1 == 249) {
                  StallBuyData var13 = null;
                  StallNeedBean var18 = null;
                  if (this.auy.il() == 24) {
                     var13 = (StallBuyData)this.auy.jx();
                  }

                  if (var13 != null) {
                     var18 = this.avy.getStallNeedBean(var13.getId());
                  }

                  if (var13 == null) {
                     String var76 = "佀泤朩遌不盁牉咄";
                     this.afx._do("你没有选中的物品");
                     return;
                  }

                  if (var1 == 248) {
                     int var26 = (int)this.avg.ee();
                     long var34;
                     if ((var34 = this.avd.ee()) <= 0L) {
                        String var75 = "井桜乯肝乘P";
                        this.afx._do("价格不能为0");
                        return;
                     }

                     if (var26 <= 0) {
                        String var74 = "敐醊中肸业u";
                        this.afx._do("数量不能为0");
                        return;
                     }

                     Class127 var46;
                     if (var18 != null) {
                        var46 = this;
                        var18.setTotal(var26);
                        var18.setMoney(var34);
                     } else {
                        var18 = new StallNeedBean();
                        var18.setId(var13.getId());
                        var18.setTotal(var26);
                        var18.setMoney(var34);
                        if (!this.avy.h(var18)) {
                           String var73 = "敖赏乪防RV禭";
                           this.afx._do("收购上限24种");
                           return;
                        }

                        var46 = this;
                     }

                     var46.amb(null, null);
                     this.y(this.agc);
                     return;
                  }

                  if (var1 == 249) {
                     if (!this.avy.a(var13.getId())) {
                        String var72 = "讠牉咄迸杯攖赨";
                        this.afx._do("该物品还未收购");
                        return;
                     }

                     this.amb(null, null);
                     this.y(this.agc);
                  }
               }
            }
         }
      }
   }
}
