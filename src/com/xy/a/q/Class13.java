package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.bean.QualityClBean;
import com.xy.bean.SuitOperBean;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.AlchemySet;
import com.xy.readbean.AlchemyUnit;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class13 extends com.xy.q.Class30 {
   private long kz;
   private int la;
   private com.xy.i.Class19[] lb;
   private com.xy.q.Class14[] lc;
   private com.xy.w.Class1 ld;
   private com.xy.a.i.Class12 le;
   private List<com.xy.v.Class33> lf;
   private QualityClBean lg;
   private com.xy.q.Class54[] lh;
   private Image li;
   private Object lj;
   private com.xy.i.Class19[] lk;
   private long ll;
   private com.xy.q.Class52[] lm;
   private boolean ln;
   private com.xy.w.Class1 ka;
   private com.xy.w.Class18[] iq;
   private List<com.xy.v.Class26> lo;
   private Image lp;
   private Class46 lq;
   private Image g;
   private Class46 lr;
   private JLabel[] gj;
   private long fh;
   private long kd;

   // $VF: synthetic method
   static void hs(Class13 var0, Image var1) {
      var0.lp = var1;
   }

   @Override
   public void l() {
      this.lh[0].gs(0, null);
      this.lr.cc(0, 0);
      this.lh[1].gs(0, null);
      this.lq.cc(0, 0);
      this.g(0);
      super.l();
   }

   public void br(Goodstable var1) {
      if (this.le != null) {
         this.cr(false);
         int var2 = (Integer)this.le.nd;
         if (!this.dh()) {
            if (var2 == 0) {
               this.bb(var1);
            } else {
               if (var2 == 1) {
                  this.ay(var1);
               }
            }
         }
      }
   }

   // $VF: synthetic method
   static com.xy.q.Class14[] ht(Class13 var0) {
      return var0.lc;
   }

   // $VF: synthetic method
   static Class46 hu(Class13 var0) {
      return var0.lq;
   }

   public boolean dh() {
      return this.ln;
   }

   // $VF: synthetic method
   static Image hv(Class13 var0) {
      return var0.lp;
   }

   public void af(com.xy.q.Class54 var1) {
      if (this.la == 1) {
         if (this.lh[0].il() == 0) {
            String var10001 = "儔逅抵丷寔抨瞯";
            this.afx._do("先选择主守护石");
         } else {
            this.y(1);
         }
      }
   }

   public void bi(int var1) {
      if (var1 == 0) {
         int var12;
         for (int var26 = var12 = 0; var26 < this.gj.length; var26 = ++var12) {
            this.gj[var12].setVisible(var12 < 6 || var12 == 8);
         }

         for (int var27 = var12 = 0; var27 < this.lc.length; var27 = ++var12) {
            this.lc[var12].setVisible(var12 < 2);
         }

         for (int var28 = var12 = 0; var28 < this.lm.length; var28 = var12) {
            this.lm[var12++].setVisible(true);
         }

         for (int var29 = var12 = 0; var29 < this.lh.length; var29 = var12) {
            this.lh[var12++].setVisible(true);
         }

         for (int var30 = var12 = 0; var30 < this.lb.length; var30 = ++var12) {
            this.lb[var12].setVisible(var12 < 1);
         }

         this.lr.setVisible(true);
         this.lq.setVisible(false);
         this.iq[1].setVisible(true);
         this.iq[2].setVisible(true);
      } else if (var1 == 1) {
         int var7;
         for (int var21 = var7 = 0; var21 < this.gj.length; var21 = var7) {
            this.gj[var7++].setVisible(true);
         }

         for (int var22 = var7 = 0; var22 < this.lc.length; var22 = var7) {
            this.lc[var7++].setVisible(true);
         }

         for (int var23 = var7 = 0; var23 < this.lm.length; var23 = var7) {
            this.lm[var7++].setVisible(true);
         }

         for (int var24 = var7 = 0; var24 < this.lh.length; var24 = var7) {
            this.lh[var7++].setVisible(true);
         }

         for (int var25 = var7 = 0; var25 < this.lb.length; var25 = ++var7) {
            this.lb[var7].setVisible(var7 < 1);
         }

         this.lr.setVisible(true);
         this.lq.setVisible(true);
         this.iq[1].setVisible(true);
         this.iq[2].setVisible(true);
      } else {
         if (var1 == 2) {
            int var2;
            for (int var10000 = var2 = 0; var10000 < this.gj.length; var10000 = var2) {
               this.gj[var2++].setVisible(false);
            }

            for (int var17 = var2 = 0; var17 < this.lc.length; var17 = var2) {
               this.lc[var2++].setVisible(false);
            }

            for (int var18 = var2 = 0; var18 < this.lm.length; var18 = var2) {
               this.lm[var2++].setVisible(false);
            }

            for (int var19 = var2 = 0; var19 < this.lh.length; var19 = var2) {
               this.lh[var2++].setVisible(false);
            }

            for (int var20 = var2 = 0; var20 < this.lb.length; var20 = var2) {
               this.lb[var2++].setVisible(true);
            }

            this.lr.setVisible(true);
            this.lq.setVisible(true);
            this.iq[1].setVisible(false);
            this.iq[2].setVisible(false);
         }
      }
   }

   @Override
   public boolean ah() {
      if (this.ka != null) {
         this.ka = null;
      }

      if (this.ld != null) {
         this.ld = null;
      }

      return super.ah();
   }

   public void y(int var1) {
      if (this.la == 0 || this.la == 1) {
         if (this.le == null) {
            this.le = new com.xy.a.i.Class12(this);
            this.le.ne.ol(108L);
            this.le.nd = var1;
            this.le.ne.y(var1 == 0 ? 0 : 1);
            this.add(this.le, 0);
            this.cr(true);
         } else {
            this.le.nd = var1;
            this.le.ne.y(var1 == 0 ? 0 : 1);
            this.cr(!this.le.isVisible());
         }
      }
   }

   // $VF: synthetic method
   static void hw(Class13 var0, Image var1) {
      var0.li = var1;
   }

   public static int hx() {
      int var0;
      if ((var0 = com.xy.v.Class0.a.nextInt(100)) < 12) {
         return 5;
      } else if (var0 < 39) {
         return 4;
      } else {
         return var0 < 73 ? 3 : 2;
      }
   }

   public void ay(Goodstable var1) {
      this.lh[1].gs(1, var1);
      this.lq.us(var1, this.yt().bi());
      if (this.la == 1 && this.lo != null) {
         this.lo.clear();
      }
   }

   public void h() {
      int var1 = Integer.parseInt(this.lg.getData());
      this.lq.n(var1);
      if (!com.xy.v.Class12.h(this.lg.getNewAttr())) {
         Goodstable var2 = this.lh[0].il() == 1 ? (Goodstable)this.lh[0].jx() : null;
         AlchemySet var3 = this.yt().bi();
         if (var2 != null && var3 != null) {
            if (this.lo != null) {
               this.lo.clear();
            }

            if (this.lf == null) {
               this.lf = new ArrayList<>();
            }

            this.lf.clear();

            int var4;
            for (int var10000 = var4 = 0; var10000 < 7; var10000 = ++var4) {
               if ((var1 >> var4 & 1) != 0) {
                  Class58 var5 = Class46.uu(this.lq)[var4];
                  if ((var4 >= 5 || !com.xy.v.Class12.h(Class58.xx(var5))) && (var4 < 5 || Class58.yb(var5) != 0)) {
                     int var6;
                     Class58 var7 = (var6 = this.lr.ut(var4, Class58.xx(var5), Class58.yb(var5))) >= 0 ? Class46.uu(this.lr)[var6] : null;
                     if (var7 != null) {
                        Class13 var17;
                        if (var4 < 5) {
                           String var15 = this.lg.getNewAttr();
                           StringBuilder var10001 = new StringBuilder(String.valueOf(Class58.xx(var7)));
                           String var10002 = "a";
                           String var19 = var10001.append("=").toString();
                           var10002 = "h";
                           String var8;
                           if (com.xy.v.Class12.h(var8 = com.xy.v.Class12.ai(var15, var19, "|"))) {
                              continue;
                           }

                           double var9 = Double.parseDouble(var8);
                           if (Class58.xz(var7) >= var9) {
                              continue;
                           }

                           AlchemyUnit var11 = var3.getAlchemyUnit(Class58.xx(var7));
                           com.xy.v.Class26 var12;
                           com.xy.v.Class26 var16 = var12 = new com.xy.v.Class26();
                           var16.b = var6;
                           String var10003 = "w";
                           var16.a = "+"
                              + com.xy.v.Class12.e(var9 - Class58.xz(var7), var11 != null ? var11.getSize() : 1)
                              + com.xy.a.Class48.qb(Class58.xx(var7));
                           if (this.lo == null) {
                              this.lo = new ArrayList<>();
                           }

                           var17 = this;
                           this.lo.add(var12);
                        } else {
                           String var18 = this.lg.getNewAttr();
                           String var26 = "抔胇)";
                           StringBuilder var20 = new StringBuilder("技能=").append(Class58.yb(var7));
                           String var23 = "\u007f";
                           String var21 = var20.append("#").toString();
                           var23 = "h";
                           String var13;
                           if (com.xy.v.Class12.h(var13 = com.xy.v.Class12.ai(var18, var21, "|"))) {
                              continue;
                           }

                           int var14 = Integer.valueOf(var13);
                           if (Class58.xz(var7) >= var14) {
                              continue;
                           }

                           com.xy.v.Class26 var10 = new com.xy.v.Class26();
                           var10.b = var6;
                           String var10004 = "w";
                           StringBuilder var25 = new StringBuilder("+").append(com.xy.v.Class12.e(var14 - (int)Class58.xz(var7), 0));
                           var26 = "纳";
                           var10.a = var25.append("级").toString();
                           if (this.lo == null) {
                              this.lo = new ArrayList<>();
                           }

                           var17 = this;
                           this.lo.add(var10);
                        }

                        var17.lf.add(new com.xy.v.Class33(this.lq.getX() + var5.getX() + 30, this.lq.getY() + var5.getY() + 18, com.xy.v.Class22.l(), 1L));
                        this.lf.add(new com.xy.v.Class33(this.lr.getX() + var7.getX() + 30, this.lr.getY() + var7.getY() + 18, com.xy.v.Class22.l(), 0L));
                     }
                  }
               }
            }

            this.lr.us(var2, var3);
         }
      }
   }

   public void hy(boolean var1) {
      this.ln = var1;
      this.kd = com.xy.v.Class22.l();
      this.kz = 0L;
      this.lj = null;
      if (this.lo != null) {
         this.lo.clear();
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.la = var1;

      for (int var2 = 0; var10000 < this.lk.length; var10000 = ++var2) {
         this.lk[var2].setKeep(var2 == this.la || var2 == 0 && this.la == 2);
      }

      this.lg = null;
      this.hy(false);
      this.cr(false);
      Class13 var21;
      if (var1 == 0) {
         com.xy.q.Class49.b(this.lc[0], this.ll = 200000L);
         com.xy.q.Class49.b(this.lc[1], this.fh = 0L);
         JLabel var10003 = this.gj[0];
         String var10004 = "宜択矧";
         var10003.setText("守护石");
         JLabel var10002 = this.gj[1];
         String var53 = "瀩兏昪";
         var10002.setText("灵元晶");
         var10000 = 0;
         this.gj[0].setBounds(95, 118, 100, 22);
         this.gj[1].setBounds(239, 118, 100, 22);

         for (int var4 = 0; var10000 < this.lh.length; var10000 = var4) {
            com.xy.q.Class54 var13 = this.lh[var4];
            int var10001 = 97 + var4 * 144;
            var4++;
            var13.setBounds(var10001, 156, 52, 52);
         }

         Goodstable var5 = this.yt().ay(new BigDecimal(25297));
         com.xy.q.Class54 var14 = this.lh[1];
         byte var30;
         Goodstable var38;
         if (var5 != null && var5.getType() == 107L) {
            var30 = 1;
            var38 = var5;
         } else {
            var30 = 0;
            var38 = var5;
         }

         var14.gs(var30, var38);
         var10000 = 2;
         this.lq.cc(0, 0);
         var10002 = this.gj[4];
         String var54 = "液考佩劏";
         var10002.setText("消耗体力");
         JLabel var31 = this.gj[5];
         String var40 = "择杕佟勇";
         var31.setText("拥有体力");

         for (int var3 = 2; var10000 < 6; var10000 = var3) {
            JLabel var32 = this.gj[var3];
            String var41 = "\u0019w\bU\u000bW\n'";
            var32.setForeground(com.xy.q.Class49.c("#c2A1C03"));
            JLabel var16 = this.gj[var3];
            int var42 = 237 + (var3 - 2) * 29;
            var3++;
            var16.setBounds(94, var42, 72, 20);
         }

         this.gj[8].setHorizontalAlignment(10);
         this.gj[8].setFont(com.xy.q.Class49.k);
         this.gj[8].setForeground(Color.black);
         var10002 = this.gj[8];
         String var55 = "侁畕參屒恻";
         var10002.setText("保留原属性");
         this.gj[8].setBounds(360, 429, 90, 17);
         MoneyType var33 = this.lm[1].alk();
         var10000 = 0;
         var33.setIdAndKey(0, null);

         for (int var10 = 0; var10000 < this.lm.length; var10000 = var10) {
            com.xy.q.Class52 var18 = this.lm[var10];
            int var44 = 264 + var10 * 54;
            var10++;
            var18.setBounds(170, var44, 132, 20);
         }

         int var11;
         for (int var19 = var11 = 0; var19 < 2; var19 = var11) {
            com.xy.q.Class14 var20 = this.lc[var11];
            int var45 = 237 + var11 * 54;
            var11++;
            var20.setBounds(170, var45, 132, 20);
         }

         var21 = this;
         com.xy.w.Class18 var10007 = this.iq[1];
         String var10008 = "Iw\u0015p\u0015%\r#\u0014dTs";
         var10007.dp("sc/d/177.png");
         this.iq[1].setBounds(182, 161, 30, 42);
         com.xy.w.Class18 var10005 = this.iq[2];
         String var10006 = "/osis?l\",b;";
         var10005.dp("sc/e/30.png");
         this.iq[2].setBounds(343, 429, 17, 17);
         com.xy.i.Class19 var56 = this.lb[0];
         var10004 = "强姟陾灡";
         var56.setText("开始附灵");
         this.lb[0].setBounds(233, 426, 99, 25);
         this.lr.setBounds(353, 105, 257, 248);
      } else if (var1 == 1) {
         com.xy.q.Class49.b(this.lc[0], this.ll = 200000L);
         com.xy.q.Class49.b(this.lc[1], this.fh = 100L);
         JLabel var57 = this.gj[0];
         String var65 = "丷寔抨瞯";
         var57.setText("主守护石");
         JLabel var46 = this.gj[1];
         String var58 = "剕宜択矧";
         var46.setText("副守护石");
         var10000 = 0;
         this.gj[0].setBounds(168, 75, 100, 22);
         this.gj[1].setBounds(483, 75, 100, 22);

         for (int var6 = 0; var10000 < this.lh.length; var10000 = var6) {
            com.xy.q.Class54 var23 = this.lh[var6];
            int var34 = 102 + var6 * 315;
            var6++;
            var23.setBounds(var34, 72, 52, 52);
         }

         var10000 = 2;
         this.lh[1].gs(0, null);
         this.lq.cc(0, 0);
         var46 = this.gj[4];
         String var59 = "择杕宄拸乇屄";
         var46.setText("拥有守护之尘");
         JLabel var35 = this.gj[5];
         String var48 = "液考宲抰乱尌";
         var35.setText("消耗守护之尘");

         for (int var7 = 2; var10000 < 6; var10000 = var7) {
            this.gj[var7].setForeground(Color.black);
            JLabel var25 = this.gj[var7];
            int var36 = 57 + (var7 - 2) % 2 * 227;
            int var49 = 415 + (var7 - 2) / 2 * 27;
            var7++;
            var25.setBounds(var36, var49, 102, 19);
         }

         this.gj[8].setHorizontalAlignment(4);
         this.gj[8].setFont(com.xy.q.Class49.w);
         var57 = this.gj[8];
         var65 = "/?J\u001aJkHl";
         var57.setForeground(com.xy.q.Class49.c("#cFFF7D0"));
         var46 = this.gj[8];
         String var61 = "叻吂攢灏窙丐敤";
         var46.setText("可吸收灵窍个数");
         this.gj[8].setBounds(254, 385, 120, 16);
         MoneyType var37 = this.lm[1].alk();
         var10000 = 0;
         String var62 = "宄拸乇屄";
         var37.setIdAndKey(0, "守护之尘");

         for (int var8 = 0; var10000 < this.lm.length; var10000 = var8) {
            com.xy.q.Class52 var27 = this.lm[var8];
            int var51 = 415 + 29 * var8;
            var8++;
            var27.setBounds(386, var51, 114, 19);
         }

         int var9;
         for (int var28 = var9 = 0; var28 < 2; var28 = var9) {
            com.xy.q.Class14 var29 = this.lc[var9];
            int var52 = 415 + 29 * var9;
            var9++;
            var29.setBounds(159, var52, 114, 19);
         }

         var21 = this;
         com.xy.w.Class18 var72 = this.iq[1];
         String var10009 = "Iw\u0015p\u0015%\r\"\u0014dTs";
         var72.dp("sc/d/176.png");
         this.iq[1].setBounds(322, 284, 38, 16);
         com.xy.w.Class18 var70 = this.iq[2];
         String var71 = "\u007f?#8#m4h\",b;";
         var70.dp("sc/d/184.png");
         this.iq[2].setBounds(85, 384, 510, 17);
         com.xy.i.Class19 var67 = this.lb[0];
         String var69 = "强姟熮炨";
         var67.setText("开始熔炼");
         this.lb[0].setBounds(515, 426, 99, 25);
         this.lr.setBounds(55, 132, 257, 248);
         this.lq.setBounds(370, 132, 257, 248);
      } else {
         if (var1 == 2) {
            this.ll = 200000L;
            this.fh = 0L;
            this.lq.cc(0, 0);
            this.lr.setBounds(55, 132, 257, 248);
            this.lq.setBounds(370, 132, 257, 248);
            com.xy.i.Class19 var63 = this.lb[0];
            String var68 = "绫纱陈瀩";
            var63.setText("继续附灵");
            this.lb[0].setBounds(520, 80, 99, 25);
            this.lb[1].setBounds(443, 426, 99, 25);
            this.lb[2].setBounds(128, 426, 99, 25);
         }

         var21 = this;
      }

      var21.bi(var1);
   }

   // $VF: synthetic method
   static Image hz(Class13 var0) {
      return var0.li;
   }

   public boolean at(int var1) {
      if (var1 == 323) {
         if (this.la == 0) {
            Goodstable var9 = this.lh[0].il() == 1 ? (Goodstable)this.lh[0].jx() : null;
            if (var9 == null) {
               String var28 = "词逝拓宜択矧";
               this.afx._do("请选择守护石");
               return false;
            }

            this.g(2);
            return true;
         }

         if (this.la == 1) {
            if (this.dh()) {
               return false;
            }

            RoleData var8;
            if ((var8 = this.yx()).getLoginResult().getGold().longValue() < this.ll) {
               String var27 = "針铭丁路";
               this.afx._do("金钱不足");
               return false;
            }

            LoginResult var19 = var8.getLoginResult();
            String var21 = "宲抰乱尌";
            if (var19.getScoretype("守护之尘").longValue() < this.fh) {
               String var26 = "宄拸乇屄丁路";
               this.afx._do("守护之尘不足");
               return false;
            }

            Goodstable var11 = this.lh[0].il() == 1 ? (Goodstable)this.lh[0].jx() : null;
            Goodstable var13 = this.lh[1].il() == 1 ? (Goodstable)this.lh[1].jx() : null;
            if (var11 != null) {
               var11 = var8.getGood(var11.getRgid());
            }

            if (var13 != null) {
               var11 = var8.getGood(var11.getRgid());
            }

            if (var11 != null && var13 != null) {
               var8.getLoginResult().setGold(new BigDecimal(var8.getLoginResult().getGold().longValue() - this.ll));
               var19 = var8.getLoginResult();
               var21 = var8.getLoginResult().getScore();
               String var10004 = "寔抨丗尔a";
               var19.setScore(com.xy.v.Class5.a(var21, "守护之尘=" + this.fh, 3));
               var13.n(1);
               if (var13.getUsetime() <= 0) {
                  var8.ag(var13.getRgid());
               }

               this.lh[1].gs(0, null);
               this.hy(true);
               SuitOperBean var16 = new SuitOperBean();
               ArrayList var17;
               (var17 = new ArrayList()).add(var11.getRgid());
               var17.add(var13.getRgid());
               var16.setType(144);
               var16.setGoods(var17);
               String var18 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var16));
               this.za().k(var18);
               return true;
            }

            var21 = "词逝拓宜択矧戬宜択矧丷圼胶匑";
            this.afx._do("请选择守护石或守护石不在背包");
            return false;
         }

         if (this.la == 2) {
            if (this.dh()) {
               return false;
            }

            RoleData var2;
            if ((var2 = this.yx()).getLoginResult().getGold().longValue() < this.ll) {
               String var25 = "釫钥丷趧";
               this.afx._do("金钱不足");
               return false;
            }

            Goodstable var3 = this.lh[0].il() == 1 ? (Goodstable)this.lh[0].jx() : null;
            if (var3 != null) {
               var3 = var2.getGood(var3.getRgid());
            }

            if (var3 == null) {
               String var24 = "读違拥寔抨瞯戚寔抨瞯丁坴胀卙";
               this.afx._do("请选择守护石或守护石不在背包");
               return false;
            }

            Goodstable var4;
            if ((var4 = var2.au(107L)) == null) {
               String var10002 = "缮尫灡兹晢";
               this.afx._do("缺少灵元晶");
               return false;
            }

            var2.getLoginResult().setGold(new BigDecimal(var2.getLoginResult().getGold().longValue() - this.ll));
            var4.n(1);
            if (var4.getUsetime() <= 0) {
               var2.ag(var4.getRgid());
            }

            this.hy(true);

            int var5;
            for (int var10000 = var5 = 0; var10000 < this.lb.length; var10000 = var5) {
               this.lb[var5++].setVisible(false);
            }

            SuitOperBean var15 = new SuitOperBean();
            ArrayList var6;
            (var6 = new ArrayList()).add(var3.getRgid());
            var6.add(var4.getRgid());
            var15.setType(143);
            var15.setGoods(var6);
            String var7 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var15));
            this.za().k(var7);
            return true;
         }
      } else {
         if (var1 == 324) {
            if (this.lg == null) {
               return false;
            }

            Goodstable var10;
            if ((var10 = this.yx().getGood(this.lg.getRgid())) == null) {
               String var29 = "寔抨瞯丁坴胀卙";
               this.afx._do("守护石不在背包");
               return false;
            }

            var10.setValue(this.lg.getNewAttr());
            String var12 = Agreement.getSendTextAES("extrattroper", com.xy.v.Class31.a().toJson(this.lg));
            this.za().k(var12);
            this.lg = null;
            Goodstable var14 = this.lh[0].il() == 1 ? (Goodstable)this.lh[0].jx() : null;
            this.lr.us(var14, this.yt().bi());
            this.lq.cc(0, 0);
            return true;
         }

         if (var1 == 325) {
            this.g(0);
            return true;
         }
      }

      return false;
   }

   public Class13(GameView var1) {
      super(175, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "Iw\u0015p\u0015%\u0014dTs";
      this.li = null;
      this.lp = null;
      this.g = null;
      this.yy(-1, 0, 662, 485, com.xy.q.Class30.agh);
      com.xy.w.Class9 var44 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "寔抨瞯擁伀";
      this.yu(var44, "守护石操作");
      this.lk = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.lk.length; var10000 = var2) {
         com.xy.i.Class19[] var11 = this.lk;
         var10004 = "gY;_;\t,\u0014dTs";
         int var10006 = 321 + var2;
         String var54;
         Class13 var10010;
         if (var2 == 0) {
            var54 = "陈瀩";
            var54 = "附灵";
            var10010 = this;
         } else if (var2 == 1) {
            var54 = "螷炨";
            var54 = "融炼";
            var10010 = this;
         } else {
            var54 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/38.png", 2, var10006, Class49.bx, Class49.bv, var54, var10010);
         var11[var2] = var10002;
         this.lk[var2].setBounds(54 + 102 * var2, 23, 95, 33);
         this.add(this.lk[var2++]);
      }

      String var12 = "/?>\u001d=\u001f<o";
      Color var5 = com.xy.q.Class49.c("#c2A1C03");
      this.gj = new JLabel[9];

      int var3;
      for (int var13 = var3 = 0; var13 < this.gj.length; var13 = var3) {
         Class13 var14;
         label154: {
            this.gj[var3] = com.xy.q.Class1.k(0, 0, 0, 0, var5, com.xy.q.Class49.bj);
            if (var3 >= 2 && var3 <= 5) {
               this.gj[var3].setFont(com.xy.q.Class49.aa);
               if (var3 == 2) {
                  var14 = this;
                  JLabel var26 = this.gj[var3];
                  String var32 = "液考釫钥";
                  var26.setText("消耗金钱");
                  break label154;
               }

               if (var3 == 3) {
                  var14 = this;
                  JLabel var25 = this.gj[var3];
                  String var31 = "择杕針铭";
                  var25.setText("拥有金钱");
                  break label154;
               }
            } else if (var3 >= 6 && var3 <= 7) {
               JLabel var45 = this.gj[var3];
               var10004 = "锁炨筳纳";
               var45.setText("锻炼等级");
               this.gj[var3].setFont(com.xy.q.Class49.n);
               JLabel var10001 = this.gj[var3];
               String var30 = "/?>\u0019=\u001d<i";
               var10001.setForeground(com.xy.q.Class49.c("#c2E1A05"));
               this.gj[var3].setBounds(170 + (var3 - 6) * 315, 106, 60, 17);
            }

            var14 = this;
         }

         var14.add(this.gj[var3++]);
      }

      this.lc = new com.xy.q.Class14[5];

      for (int var15 = var3 = 0; var15 < this.lc.length; var15 = var3) {
         this.lc[var3] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var16 = this.lc[var3];
         String var27 = "gY;_;\b-\u0014dTs";
         var16.mt(com.xy.w.Class16.m("sc/e/29.png", 6, 6, 6, 6, false));
         Class13 var17;
         if (var3 >= 2 && var3 <= 3) {
            var17 = this;
            this.lc[var3].setBounds(227 + (var3 - 2) * 315, 106, 44, 17);
         } else {
            if (var3 == 4) {
               this.lc[var3].setForeground(Color.green);
               this.lc[var3].setHorizontalAlignment(0);
               this.lc[var3].setBounds(386, 384, 44, 17);
            }

            var17 = this;
         }

         var17.add(this.lc[var3++]);
      }

      this.lm = new com.xy.q.Class52[2];

      for (int var18 = var3 = 0; var18 < this.lm.length; var18 = var3) {
         MoneyType var4 = new MoneyType();
         if (var3 == 0) {
            String var35 = "針铭";
            var4.setIdAndKey(1, "金钱");
         }

         this.lm[var3] = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, var4, var1);
         com.xy.q.Class52 var36 = this.lm[var3];
         var10003 = "gY;_;\b-\u0014dTs";
         var36.mt(com.xy.w.Class16.m("sc/e/29.png", 6, 6, 6, 6, false));
         this.add(this.lm[var3++]);
      }

      this.lb = new com.xy.i.Class19[3];

      for (int var19 = var3 = 0; var19 < this.lb.length; var19 = var3) {
         com.xy.i.Class19[] var20 = this.lb;
         var10004 = "/osis>j\",b;";
         int var53 = 323 + var3;
         String var57;
         Class13 var59;
         if (var3 == 1) {
            var57 = "曅捶層怳";
            var57 = "替换属性";
            var59 = this;
         } else if (var3 == 2) {
            var57 = "还嚂";
            var57 = "返回";
            var59 = this;
         } else {
            var57 = "";
            var59 = this;
         }

         com.xy.i.Class19 var38 = new com.xy.i.Class19("sc/e/26.png", 1, var53, com.xy.q.Class49.ch, null, var57, var59);
         var20[var3] = var38;
         Class13 var21;
         if (var3 == 1) {
            var21 = this;
            this.lb[var3].setBounds(233, 426, 99, 25);
         } else {
            if (var3 == 2) {
               this.lb[var3].setBounds(233, 426, 99, 25);
            }

            var21 = this;
         }

         var21.lb[var3].setForeground(Color.black);
         this.add(this.lb[var3++]);
      }

      this.lh = new com.xy.q.Class54[2];

      for (int var22 = var3 = 0; var22 < this.lh.length; var22 = var3) {
         this.lh[var3] = new com.xy.q.Class54(this);
         com.xy.q.Class54 var47 = this.lh[var3];
         var10004 = "Iw\u0015p\u0015%\u0002$\u0014dTs";
         var47.dq("sc/d/180.png");
         this.lh[var3].wp(com.xy.q.Class54.atv);
         this.add(this.lh[var3++]);
      }

      this.lr = new Class46(this, 0);
      this.lq = new Class46(this, 1);
      this.add(this.lr);
      this.add(this.lq);
      this.iq = new com.xy.w.Class18[4];

      for (int var23 = var3 = 0; var23 < this.iq.length; var23 = var3) {
         this.iq[var3] = new com.xy.w.Class18();
         Class13 var24;
         if (var3 == 0) {
            var24 = this;
            com.xy.w.Class18 var41 = this.iq[var3];
            var10003 = "/oshs?i\",b;";
            var41.mt(com.xy.w.Class16.m("sc/d/35.png", 100, 2, 100, 2, false));
            this.iq[var3].setBounds(48, 37, 590, 20);
         } else {
            if (var3 != 1 && var3 != 2 && var3 == 3) {
               com.xy.w.Class18 var28 = this.iq[var3];
               String var42 = "Iw\u0015p\u0015%\u0002'\u0014dTs";
               var28.dp("sc/d/183.png");
               this.iq[var3].setBounds(46, 59, 592, 347);
            }

            var24 = this;
         }

         var24.add(this.iq[var3++]);
      }
   }

   public void bb(Goodstable var1) {
      this.lh[0].gs(1, var1);
      this.lr.us(var1, this.yt().bi());
      if (this.la == 1) {
         this.lh[1].gs(0, null);
         this.lq.cc(0, 0);
      }
   }

   public int ia() {
      return this.la;
   }

   // $VF: synthetic method
   static void ib(Class13 var0, Image var1) {
      var0.g = var1;
   }

   // $VF: synthetic method
   static Class46 ic(Class13 var0) {
      return var0.lr;
   }

   public void ai(com.xy.q.Class54 var1) {
      if (!this.dh()) {
         if (var1 == this.lh[0]) {
            this.ak(var1);
         } else {
            if (var1 == this.lh[1]) {
               this.af(var1);
            }
         }
      }
   }

   public static int id() {
      int var0;
      if ((var0 = com.xy.v.Class0.a.nextInt(100)) < 4) {
         return 2;
      } else {
         return var0 < 20 ? 1 : 0;
      }
   }

   public void cr(boolean var1) {
      if (this.le != null) {
         Class13 var10000;
         label29: {
            if (var1) {
               if (this.la == 0) {
                  var10000 = this;
                  this.le.setBounds(10, 208, 330, 150);
                  break label29;
               }

               if (this.la == 1 && (Integer)this.le.nd == 0) {
                  var10000 = this;
                  this.le.setBounds(10, 122, 330, 150);
                  break label29;
               }

               if (this.la == 1 && (Integer)this.le.nd == 1) {
                  this.le.setBounds(325, 122, 330, 150);
               }
            }

            var10000 = this;
         }

         var10000.le.setVisible(var1);
      }
   }

   // $VF: synthetic method
   static Image ie(Class13 var0) {
      return var0.g;
   }

   public void ak(com.xy.q.Class54 var1) {
      if (this.la == 0 || this.la == 1) {
         this.y(0);
      }
   }

   public static int dx() {
      int var0;
      if ((var0 = com.xy.v.Class0.a.nextInt(100)) < 5) {
         return 4;
      } else if (var0 < 35) {
         return 3;
      } else {
         return var0 < 75 ? 2 : 1;
      }
   }

   public void gs(int var1, Object var2) {
      if (var1 == this.la) {
         this.lj = var2;
      }
   }

   public boolean _if(Goodstable var1) {
      Goodstable var2;
      if ((var2 = (Goodstable)this.lh[0].jx()) != null && !com.xy.v.Class12.x(var2.getRgid(), var1.getRgid())) {
         int var10000 = Class46.uv(this.lr);
         String var10002 = var1.getValue();
         String var10003 = "筝纝)";
         String var10004 = " ";
         if (var10000 >= 2 + com.xy.v.Class12.f(var10002, "等级=", "|")) {
            return false;
         } else {
            AlchemySet var3;
            if ((var3 = this.yt().bi()) == null) {
               return false;
            } else {
               int var4;
               for (int var9 = var4 = 0; var9 < Class46.uu(this.lr).length; var9 = ++var4) {
                  Class58 var5 = Class46.uu(this.lr)[var4];
                  Object var6 = null;
                  Goodstable var11;
                  if (var4 < 5) {
                     AlchemyUnit var7;
                     if (com.xy.v.Class12.h(Class58.xx(var5)) || (var7 = var3.getAlchemyUnit(Class58.xx(var5))) == null || Class58.xz(var5) >= var7.getMax()) {
                        continue;
                     }

                     var10002 = "h";
                     StringBuilder var10 = new StringBuilder("|").append(Class58.xx(var5));
                     String var10001 = "a";
                     var6 = var10.append("=").toString();
                     var11 = var1;
                  } else {
                     if (Class58.yb(var5) == 0 || Class58.xz(var5) >= 15.0) {
                        continue;
                     }

                     var10002 = "F抔胇)";
                     StringBuilder var12 = new StringBuilder("|技能=").append(Class58.yb(var5));
                     String var13 = "\u007f";
                     var6 = var12.append("#").toString();
                     var11 = var1;
                  }

                  if (var11.getValue().indexOf((String)var6) != -1) {
                     return true;
                  }
               }

               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      long var2;
      if (this.ln && (var2 = (com.xy.v.Class22.l() - this.kd) / 160L) > this.kz) {
         this.kz = var2;
         if (this.la == 1) {
            if (this.lj != null && var2 >= 6L) {
               this.lg = (QualityClBean)this.lj;
               this.hy(false);
               this.h();
               if (com.xy.v.Class12.h(this.lg.getNewAttr())) {
                  String var6 = "刳宄拸矿乱揜厊凶卥酁専怫s牵拜丂乧宄拸矿乑匵鄑\uff00乧宄拸矿杶叝畃叔半";
                  this.afx._do("副守护石中提取出匹配属性/特技与主守护石不匹配，主守护石未发生变化");
                  return;
               }

               String var5 = "戄劥仚剕宜択矧丗揄召凮匃酙層怳\u0015牭抺８丁宜択矧莍徃墤弮";
               this.afx._do("成功从副守护石中提取出匹配属性/特技，主守护石获得增强");
               return;
            }

            this.lq.t();
            return;
         }

         if (this.la == 2) {
            if (this.lj != null && var2 >= 6L) {
               this.lg = (QualityClBean)this.lj;
               int var10000 = 0;
               this.hy(false);
               this.lq.uw(this.lg.getNewAttr(), this.yt().bi());

               for (int var4 = 0; var10000 < this.lb.length; var10000 = var4) {
                  this.lb[var4++].setVisible(true);
               }

               return;
            }

            this.lq.l();
         }
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.lf != null && this.lf.size() > 0) {
         long var2 = com.xy.v.Class22.l();

         int var4;
         for (int var10000 = var4 = this.lf.size() - 1; var10000 >= 0; var10000 = --var4) {
            com.xy.v.Class33 var5;
            com.xy.w.Class1 var6 = (var5 = this.lf.get(var4)).d == 0L ? this.ka : this.ld;
            long var11;
            if (var6 == null && var5.d == 0L) {
               String var13 = "\u007f?#1c)\u007f9#/d.`m\"(o,";
               var6 = this.ka = com.xy.w.Class11.x("sc/mouse/shrl1.tcp");
               var11 = var2;
            } else {
               if (var6 == null && var5.d != 0L) {
                  String var10001 = "Iw\u0015yUaIq\u0015gRfV&\u0014`Yd";
                  var6 = this.ld = com.xy.w.Class11.x("sc/mouse/shrl2.tcp");
               }

               var11 = var2;
            }

            long var7;
            if ((var7 = var11 - var5.b - 100L) >= 0L) {
               if (var7 >= (var6 != null ? var6.a() : 500)) {
                  this.lf.remove(var4);
               } else if (var6 != null) {
                  var6.j(var7, 0);
                  var6.ab(var1, (int)var5.a, (int)var5.c);
               }
            }
         }
      }

      if (this.lo != null && this.lo.size() > 0) {
         var1.setColor(Color.black);
         var1.setFont(com.xy.q.Class49.w);

         int var9;
         for (int var12 = var9 = this.lo.size() - 1; var12 >= 0; var12 = var9) {
            com.xy.v.Class26 var3 = this.lo.get(var9);
            Class58 var10 = Class46.uu(this.lr)[(int)var3.b];
            String var14 = var3.d();
            int var10002 = this.lr.getX() + var10.getX() + 267;
            int var10003 = this.lr.getY() + var10.getY();
            var9--;
            var1.drawString(var14, var10002, var10003 + 23);
         }
      }

      if (this.lo == null) {
         this.lo = new ArrayList<>();
      }
   }
}
