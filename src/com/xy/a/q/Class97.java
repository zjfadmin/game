package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class97 extends com.xy.q.Class30 {
   private com.xy.q.Class27 aps;
   private Class24 apt;
   private MoneyType apu;
   private int gs;
   private com.xy.i.Class19 pv;
   private com.xy.i.Class19 xc;
   private com.xy.q.Class52 apv;
   private com.xy.q.Class56 apw;
   private com.xy.q.Class14 ok;
   private com.xy.q.Class36 apx;
   private com.xy.q.Class26[] apy;
   private MoneyType sj;
   private com.xy.i.Class19 jv;
   private com.xy.w.Class18[] sk;
   private com.xy.a.i.Class12 apz;
   private BigDecimal dt;
   private com.xy.i.Class19[] aic;
   private int ds;
   private com.xy.q.Class52 kt;
   private JLabel[] au;

   public void cr(boolean var1) {
      if (this.apz != null || var1) {
         if (var1) {
            if (this.apz == null) {
               this.add(this.apz = new com.xy.a.i.Class12(this), 0);
            }

            this.apz.nb.be(false);
            this.apz.nb.td().removeAllElements();
            int var2 = 0;
            RoleData var3 = this.yx();
            List var4 = null;

            int var5;
            for (int var10000 = var5 = 0; var10000 < var3.pets.size(); var10000 = ++var5) {
               RoleSummoning var6;
               String var7;
               if ((var7 = (var6 = var3.pets.get(var5).getPet()).getStye()) != null && var7.length() > 1) {
                  String var10001 = "O\u0014";
                  String[] var8 = var7.split("\\|");
                  if (var4 != null) {
                     var4.clear();
                  }

                  if ((var4 = this.aii(var4, var8)) != null && var4.size() != 0) {
                     var2 += var4.size();
                     StringBuilder var10002 = new StringBuilder(String.valueOf(var6.getSummoningname()));
                     String var10003 = "2";
                     var10002 = var10002.append("(").append(var4.size());
                     var10003 = "A";
                     com.xy.q.Class60 var9 = new com.xy.q.Class60(var10002.append(")").toString(), var6.getSid());
                     this.apz.nb.afo(var9);
                  }
               }
            }

            String var10004 = "兲邡2";
            StringBuilder var12 = new StringBuilder("全部(").append(var2);
            String var14 = "A";
            com.xy.q.Class60 var10 = new com.xy.q.Class60(var12.append(")").toString(), null);
            this.apz.nb.afo(var10);
            this.apz.nb.n(this.apz.nb.td().size() - 1);
            this.apz.setBounds(30, 128, 330, 150);
         }

         this.apz.setVisible(var1);
      }
   }

   public List<BigDecimal> aii(List<BigDecimal> var1, String[] var2) {
      int var3;
      for (int var10000 = var3 = 1; var10000 < var2.length; var10000 = ++var3) {
         String var6 = var2[var3];
         String var10001 = "7";
         String[] var4;
         if ((var4 = var6.split("-")).length >= 2) {
            String var7 = var4[0];
            var10001 = "[";
            Goodstable var5;
            if (!var7.equals("3") && (var5 = this.yx().getGood(new BigDecimal(var4[1]))) != null) {
               if (var1 == null) {
                  var1 = new ArrayList();
               }

               var1.add(var5.getRgid());
            }
         }
      }

      return var1;
   }

   // $VF: synthetic method
   static int aij(Class97 var0) {
      return var0.gs;
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else {
         long var5 = this.yx().getMoney(this.sj);
         return var1 > var5 ? var5 : null;
      }
   }

   public int id() {
      return this.gs;
   }

   public void h() {
      if (this.apz == null) {
         this.cr(true);
      } else {
         this.cr(!this.apz.isVisible());
      }
   }

   public boolean dh() {
      RoleData var1 = this.yx();
      Goodstable var2;
      if ((var2 = (Goodstable)this.apy[0].ep().jx()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var2 == null) {
         String var51 = "诤遡拺厄唷儕裖奯";
         this.afx._do("请选择召唤兽装备");
         return false;
      } else if (this.dt != null && var1.getLoginResult().getGold().compareTo(this.dt) < 0) {
         GameView var39 = this.afx;
         String var10004 = "夽讔帛乄趩";
         StringBuilder var50 = new StringBuilder("大话币不足").append(this.dt.longValue() / 10000L);
         String var52 = "乯";
         var39._do(var50.append("万").toString());
         return false;
      } else {
         String var10000 = var2.getValue();
         String var10001 = "\u0015f";
         String[] var3 = var10000.split("\\|");
         SuitOperBean var4 = new SuitOperBean();
         if (this.ds == 0 && this.gs == 0) {
            Goodstable var15;
            if ((var15 = (Goodstable)this.apy[1].ep().jx()) != null) {
               var15 = var1.getGood(var15.getRgid());
            }

            if (var15 == null) {
               String var49 = "沲条通久玗钩晥瞛";
               this.afx._do("没有选中玄铁晶石");
               return false;
            }

            var10001 = "道灯";
            if (Integer.parseInt(MsgUntil.getValuesMessage(var3, "通灵")) >= 6000) {
               String var48 = "讍裖奯皗遲灦偔巡级抦迖丙阸？斈泆址埪儓";
               this.afx.dp("该装备的通灵值已经抵达上限，无法在培养");
               return false;
            }

            var4.setType(41);
            ArrayList var22;
            (var22 = new ArrayList()).add(var2.getRgid());
            var22.add(var15.getRgid());
            var4.setGoods(var22);
            var15.n(1);
            if (var15.getUsetime() <= 0) {
               var1.ag(var15.getRgid());
               this.apy[1].gs(0, null);
            }
         } else if (this.ds == 0 && this.gs == 1) {
            var4.setType(42);
            ArrayList var14;
            (var14 = new ArrayList()).add(var2.getRgid());
            var4.setGoods(var14);
            var2.n(1);
            if (var2.getUsetime() <= 0) {
               var1.ag(var2.getRgid());
               this.apy[0].gs(0, null);
            }
         } else if (this.ds == 1 && this.gs == 0) {
            var4.setType(43);
            ArrayList var13;
            (var13 = new ArrayList()).add(var2.getRgid());
            var4.setGoods(var13);
            int var19 = 1;

            for (int var25 = var19; var25 < this.apy.length; var25 = var19) {
               Goodstable var7;
               if ((var7 = (Goodstable)this.apy[var19].ep().jx()) != null) {
                  var7 = var1.getGood(var7.getRgid());
               }

               if (var7 == null) {
                  if (var19 == 1) {
                     var10001 = "语敷兿珍铛昿矩";
                     this.afx._do("请放入玄铁晶石");
                  } else if (var19 == 2) {
                     var10001 = "讟攭儍冖乑粭匦";
                     this.afx._do("请放入内丹精华");
                  } else {
                     var10001 = "设攤儬乇张事鿐珺";
                     this.afx._do("请放入九彩云龙珠");
                  }

                  return false;
               }

               int var8 = 1;

               Iterator var23;
               for (Iterator var26 = var23 = var13.iterator(); var26.hasNext(); var26 = var23) {
                  if (((BigDecimal)var23.next()).compareTo(var7.getRgid()) == 0) {
                     var8++;
                  }
               }

               if (var8 > var7.getUsetime()) {
                  GameView var34 = this.afx;
                  StringBuilder var47 = new StringBuilder(String.valueOf(var7.getGoodsname()));
                  String var10003 = "散醧丞跛";
                  var34.dp(var47.append("数量不足").toString());
                  return false;
               }

               var19++;
               var13.add(var7.getRgid());
            }

            for (int var27 = var19 = 1; var27 < var13.size(); var27 = ++var19) {
               Goodstable var21;
               Goodstable var28 = var21 = var1.getGood((BigDecimal)var13.get(var19));
               var28.n(1);
               if (var28.getUsetime() <= 0) {
                  var1.ag(var21.getRgid());
                  this.apy[var19].gs(0, null);
               }
            }
         } else if (this.ds == 1 && this.gs == 1) {
            Goodstable var12;
            if ((var12 = (Goodstable)this.apy[1].ep().jx()) != null) {
               var12 = var1.getGood(var12.getRgid());
            }

            if (var12 == null) {
               String var46 = "注朓遀丷雙朒礗矩";
               this.afx._do("没有选中隐月神石");
               return false;
            }

            var10001 = "覡醁拨";
            if (MsgUntil.getValuesMessage(var3, "觉醒技") == null) {
               String var45 = "讬裟奎治杀觓釛抚";
               this.afx.dp("该装备没有觉醒技");
               return false;
            }

            var4.setType(44);
            ArrayList var18;
            (var18 = new ArrayList()).add(var2.getRgid());
            var18.add(var12.getRgid());
            var4.setGoods(var18);
            var12.n(1);
            if (var12.getUsetime() <= 0) {
               var1.ag(var12.getRgid());
               this.apy[1].gs(0, null);
            }
         } else if (this.ds == 2 && this.gs == 0) {
            var10001 = "覡醁拨";
            String var11;
            if ((var11 = MsgUntil.getValuesMessage(var3, "觉醒技")) == null) {
               String var44 = "讬裟奎治杀觓釛抚";
               this.afx.dp("该装备没有觉醒技");
               return false;
            }

            int var17;
            if ((var17 = (int)this.aps.ee()) <= 0) {
               return false;
            }

            long var24 = var17;
            LoginResult var31 = var1.getLoginResult();
            String var41 = "毇旿奅窈";
            if (var24 > var31.getScoretype("比斗奖章").longValue()) {
               var41 = "殝斍够竺改釕乄趩";
               this.afx.dp("比斗奖章数量不足");
               return false;
            }

            var10001 = "N";
            if (ExpUtil.d(Long.parseLong(var11.split("&")[3])) >= 20L) {
               var41 = "筓绮巨纆辤剹朚奮倦";
               this.afx._do("等级已经达到最大值");
               return false;
            }

            var4.setType(46);
            var4.setJade(new PartJade(var17, 0));
            ArrayList var10;
            (var10 = new ArrayList()).add(var2.getRgid());
            var4.setGoods(var10);
         } else {
            if (this.ds != 2 || this.gs != 1) {
               return false;
            }

            var10001 = "覡醁拨";
            if (MsgUntil.getValuesMessage(var3, "觉醒技") != null) {
               String var40 = "讬裟奎巨杀觓釛抚";
               this.afx.dp("该装备已有觉醒技");
               return false;
            }

            Goodstable var5;
            if ((var5 = (Goodstable)this.apy[1].ep().jx()) != null) {
               var5 = var1.getGood(var5.getRgid());
            }

            if (var5 == null) {
               String var10002 = "沲条通久卐帜魑瞛";
               this.afx._do("没有选中千年魂石");
               return false;
            }

            var4.setType(45);
            ArrayList var6;
            (var6 = new ArrayList()).add(var2.getRgid());
            var6.add(var5.getRgid());
            var4.setGoods(var6);
            var5.n(1);
            if (var5.getUsetime() <= 0) {
               var1.ag(var5.getRgid());
               this.apy[1].gs(0, null);
            }
         }

         String var16 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var4));
         this.za().k(var16);
         return true;
      }
   }

   public int dx() {
      return this.ds;
   }

   public void ak(com.xy.q.Class54 var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.apy.length; var10000 = ++var2) {
         if (this.apy[var2].ep() == var1) {
            this.apy[var2].gs(0, null);
            if (this.ds == 2 && this.gs == 0) {
               this.apt.h();
            }

            return;
         }
      }
   }

   public Class97(GameView var1) {
      super(91, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "`\u000b<\f<Y=\u0018}\u000f";
      this.gs = -1;
      this.dt = null;
      this.yy(-3, 0, 382, 455, com.xy.q.Class30.agh);
      com.xy.w.Class9 var27 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "袌夝烵匌";
      this.yu(var27, "装备炼化");
      this.aic = new com.xy.i.Class19[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aic.length; var10000 = var2) {
         com.xy.i.Class19[] var7 = this.aic;
         var10004 = "\u001bpGvG Q=\u0018}\u000f";
         int var10006 = 133 + var2;
         String var32;
         Class97 var10010;
         if (var2 == 0) {
            var32 = "垰兡";
            var32 = "培养";
            var10010 = this;
         } else if (var2 == 1) {
            var32 = "釞钐";
            var32 = "重铸";
            var10010 = this;
         } else if (var2 == 2) {
            var32 = "覀醈";
            var32 = "觉醒";
            var10010 = this;
         } else {
            var32 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/39.png", 2, var10006, Class49.ck, null, var32, var10010);
         var7[var2] = var10002;
         this.aic[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.aic[var2].setBounds(56 + 65 * var2, 30, 63, 24);
         this.add(this.aic[var2++]);
      }

      String var10008 = "\u001bpGvG!P=\u0018}\u000f";
      String var10013 = "儘捸够劫";
      this.jv = new com.xy.i.Class19("sc/e/28.png", 1, 141, com.xy.q.Class49.bz, null, "兑换奖励", this);
      this.jv.setBounds(49, 420, 68, 18);
      this.add(this.jv);
      String var35 = "\u001bpGvG!P=\u0018}\u000f";
      String var10014 = "嶻穥袌夝";
      this.pv = new com.xy.i.Class19("sc/e/28.png", 1, 142, com.xy.q.Class49.bz, null, "已穿装备", this);
      var10008 = "`\u000b<\r<_=\u0018}\u000f";
      var10013 = "垰兡";
      this.xc = new com.xy.i.Class19("sc/e/7.png", 1, 143, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "培养", this);
      this.add(this.pv);
      this.add(this.xc);
      this.apy = new com.xy.q.Class26[6];

      for (int var8 = var2 = 0; var8 < this.apy.length; var8 = var2) {
         this.apy[var2] = new com.xy.q.Class26(this);
         this.add(this.apy[var2++]);
      }

      this.au = new JLabel[6];

      for (int var9 = var2 = 0; var9 < this.au.length; var9 = var2) {
         this.au[var2] = com.xy.q.Class1.f(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.n);
         Class97 var10;
         if (var2 == 0) {
            var10 = this;
            this.au[var2].setBounds(130, 68, 54, 18);
         } else if (var2 == 1) {
            var10 = this;
            this.au[var2].setBounds(224, 68, 54, 18);
         } else if (var2 == 2) {
            var10 = this;
            JLabel var10001 = this.au[var2];
            String var20 = "涛聿釂铙";
            var10001.setText("消耗金钱");
         } else if (var2 == 3) {
            var10 = this;
            JLabel var14 = this.au[var2];
            String var21 = "抬朓醘钫";
            var14.setText("拥有金钱");
         } else if (var2 == 4) {
            var10 = this;
            JLabel var15 = this.au[var2];
            String var22 = "涛聿奅窈";
            var15.setText("消耗奖章");
         } else {
            if (var2 == 5) {
               JLabel var11 = this.au[var2];
               String var16 = "抬朓够竺";
               var11.setText("拥有奖章");
            }

            var10 = this;
         }

         var10.add(this.au[var2++]);
      }

      String var10012 = "\u001bpGwG\"_=\u0018}\u000f";
      this.apu = new MoneyType();
      String var10017 = "釂铙";
      this.apu.setIdAndKey(1, "金钱");
      this.sj = new MoneyType();
      String var10015 = "殝斍够竺";
      this.sj.setIdAndKey(0, "比斗奖章");
      com.xy.w.Class9 var6 = com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false);
      this.ok = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w);
      this.apx = com.xy.q.Class1.j(var6, com.xy.q.Class49.w, Color.white);
      this.kt = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, this.apu, var1);
      this.apv = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, this.sj, var1);
      this.kt.n(2);
      this.apv.n(2);
      this.ok.mt(var6);
      this.kt.mt(var6);
      this.apv.mt(var6);
      this.add(this.ok);
      this.add(this.apx);
      this.add(this.kt);
      this.add(this.apv);
      this.aps = new com.xy.q.Class27(15, this.apx, this);
      this.sk = new com.xy.w.Class18[4];

      int var3;
      for (int var12 = var3 = 0; var12 < this.sk.length; var12 = var3) {
         this.sk[var3] = new com.xy.w.Class18();
         Class97 var13;
         if (var3 == 0) {
            var13 = this;
            this.sk[var3].setBounds(111 + var3 * 94, 68, 18, 18);
            this.sk[var3].addMouseListener(new Class78(this));
         } else if (var3 == 1) {
            var13 = this;
            this.sk[var3].setBounds(111 + var3 * 94, 68, 18, 18);
            this.sk[var3].addMouseListener(new Class22(this));
         } else if (var3 == 2) {
            var13 = this;
            com.xy.w.Class18 var24 = this.sk[var3];
            var10003 = "i*5-5x#gj'}";
            var24.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.sk[var3].setBounds(48, 313, 309, 105);
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var17 = this.sk[var3];
               String var25 = "\u001bpGwG'Q=\u0018}\u000f";
               var17.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
               this.sk[var3].setBounds(47, 54, 310, 260);
            }

            var13 = this;
         }

         var13.add(this.sk[var3++]);
      }

      this.apw = new com.xy.q.Class56(this, 6, 2, 51, 51, 0, 0, 49, 315);
      var10003 = "i*5-5x\"gj'}";
      this.apw.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.add(this.apw);
   }

   public void y(int var1) {
      int var10000 = 0;
      this.ds = var1;

      for (int var2 = 0; var10000 < this.aic.length; var10000 = ++var2) {
         this.aic[var2].setKeep(var2 == this.ds);
      }

      Class97 var4;
      if (this.ds == 0) {
         JLabel var3 = this.au[0];
         String var10001 = "埪儓";
         var3.setText("培养");
         var4 = this;
         JLabel var6 = this.au[1];
         String var10002 = "剏觹";
         var6.setText("分解");
      } else if (this.ds == 1) {
         var4 = this;
         JLabel var10 = this.au[0];
         String var10003 = "釞浿屍恏";
         var10.setText("重洗属性");
         JLabel var7 = this.au[1];
         String var11 = "醄悅拉胧";
         var7.setText("重悟技能");
      } else {
         if (this.ds == 2) {
            JLabel var8 = this.au[0];
            String var12 = "揃匯筚经";
            var8.setText("提升等级");
            JLabel var5 = this.au[1];
            String var9 = "彉吵覀醈";
            var5.setText("开启觉醒");
         }

         var4 = this;
      }

      var4.g(0);
      this.kt.l();
      this.apv.l();
   }

   public void ds(long var1, JTextField var3) {
   }

   public void i(BigDecimal var1) {
      if (this.apz != null) {
         RoleData var2 = this.yx();
         Object var3 = new ArrayList();

         int var4;
         for (int var10000 = var4 = 0; var10000 < var2.pets.size(); var10000 = ++var4) {
            RoleSummoning var5 = var2.pets.get(var4).getPet();
            String var6;
            if ((var1 == null || var5.getSid().compareTo(var1) == 0) && (var6 = var5.getStye()) != null && var6.length() > 1) {
               String var10001 = "\u0015f";
               String[] var7 = var6.split("\\|");
               var3 = this.aii((List<BigDecimal>)var3, var7);
            }
         }

         this.apz.nc.vs().a(0);
         this.apz.nc.fm((List<BigDecimal>)var3);
      }
   }

   public void bb(Goodstable var1) {
      if (GoodType.ag(var1.getType())) {
         this.apy[0].gs(1, var1);
         if (this.ds == 2 && this.gs == 0) {
            this.apt.h();
            return;
         }
      } else if (this.ds == 0 && this.gs == 0) {
         if (var1.getType() == 513L) {
            this.apy[1].gs(1, var1);
            return;
         }
      } else if (this.ds == 1 && this.gs == 0) {
         if (var1.getType() == 513L) {
            this.apy[1].gs(1, var1);
            return;
         }

         if (var1.getType() == 497L) {
            this.apy[2].gs(1, var1);
            return;
         }

         if (var1.getType() == 498L) {
            this.apy[3].gs(1, var1);
            this.apy[4].gs(1, var1);
            this.apy[5].gs(1, var1);
            return;
         }
      } else if (this.ds == 1 && this.gs == 1) {
         if (var1.getType() == 515L) {
            this.apy[1].gs(1, var1);
            return;
         }
      } else if (this.ds == 2 && this.gs == 1 && var1.getType() == 514L) {
         this.apy[1].gs(1, var1);
      }
   }

   // $VF: synthetic method
   static com.xy.q.Class26[] aik(Class97 var0) {
      return var0.apy;
   }

   public com.xy.q.Class26[] ail() {
      return this.apy;
   }

   @Override
   public void l() {
      this.y(0);
      super.l();
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void g(int var1) {
      if (this.gs != var1) {
         com.xy.w.Class18 var10000 = this.sk[0];
         String var14;
         if (var1 == 0) {
            var14 = "\u001bpGvG%_=\u0018}\u000f";
            var14 = "sc/e/67.png";
         } else {
            var14 = "i*5,5\u007f\"gj'}";
            var14 = "sc/e/68.png";
         }

         var10000.dp(var14);
         var10000 = this.sk[1];
         if (var1 == 1) {
            var14 = "\u001bpGvG%_=\u0018}\u000f";
            var14 = "sc/e/67.png";
         } else {
            var14 = "i*5,5\u007f\"gj'}";
            var14 = "sc/e/68.png";
         }

         var10000.dp(var14);
      }

      this.gs = var1;
      this.cr(false);
      this.pv.setVisible(false);

      int var2;
      for (int var6 = var2 = 2; var6 < this.au.length; var6 = var2) {
         this.au[var2++].setVisible(false);
      }

      this.ok.setVisible(false);
      this.apx.setVisible(false);
      int var7 = 0;
      this.kt.setVisible(false);
      this.apv.setVisible(false);

      for (int var3 = 0; var7 < this.apy.length; var7 = var3) {
         this.apy[var3].gs(0, null);
         this.apy[var3++].setVisible(false);
      }

      if (this.apt != null) {
         this.apt.setVisible(false);
      }

      if (this.ds == 0 && this.gs == 0) {
         this.apy[0].setBounds(115, 118, 59, 58);
         this.apy[1].setBounds(231, 118, 59, 58);
         com.xy.q.Class26 var34 = this.apy[0];
         String var39 = "裖奯";
         var34.dq("装备");
         com.xy.q.Class26 var28 = this.apy[1];
         String var35 = "珍铛昿矩";
         var28.dq("玄铁晶石");
         this.pv.setBounds(114, 100, 61, 18);
         this.pv.setVisible(true);
         String var25 = "埪儓";
         this.xc.setText("培养");
         this.xc.setBounds(170, 272, 59, 25);
         this.au[2].setBounds(98, 204, 72, 19);
         this.au[2].setVisible(true);
         this.au[3].setBounds(98, 227, 72, 19);
         this.au[3].setVisible(true);
         this.ok.setBounds(170, 204, 124, 19);
         this.ok.setVisible(true);
         this.kt.setBounds(170, 227, 124, 19);
         this.kt.setVisible(true);
         Class97 var13;
         if (this.za().l(2, 8)) {
            this.dt = new BigDecimal(1000000);
            var13 = this;
         } else if (this.za().l(2, 12)) {
            this.dt = new BigDecimal(100000);
            var13 = this;
         } else {
            this.dt = new BigDecimal(50000000);
            var13 = this;
         }

         com.xy.q.Class49.b(var13.ok, this.dt.longValue());
      } else if (this.ds == 0 && this.gs == 1) {
         this.apy[0].setBounds(165, 118, 59, 58);
         com.xy.q.Class26 var10005 = this.apy[0];
         String var10006 = "袌夝";
         var10005.dq("装备");
         String var22 = "刕見";
         this.xc.setText("分解");
         this.xc.setBounds(170, 272, 59, 25);
         this.dt = null;
         this.ok.setText(null);
      } else if (this.ds == 1 && this.gs == 0) {
         var7 = 1;
         this.apy[0].setBounds(165, 114, 59, 58);

         for (int var4 = 1; var7 < this.apy.length; var7 = var4) {
            com.xy.q.Class26 var11 = this.apy[var4];
            int var21 = 54 + (var4 - 1) * 59;
            var4++;
            var11.setBounds(var21, 177, 59, 58);
         }

         com.xy.q.Class26 var10018 = this.apy[0];
         String var10019 = "袌夝";
         var10018.dq("装备");
         com.xy.q.Class26 var10017 = this.apy[1];
         String var42 = "玗钩晥瞛";
         var10017.dq("玄铁晶石");
         com.xy.q.Class26 var10016 = this.apy[2];
         String var41 = "凌丣糷協";
         var10016.dq("内丹精华");
         com.xy.q.Class26 var37 = this.apy[3];
         String var40 = "乎弁";
         var37.dq("九彩");
         com.xy.q.Class26 var32 = this.apy[4];
         String var38 = "且彳";
         var32.dq("九彩");
         com.xy.q.Class26 var27 = this.apy[5];
         String var33 = "乎弁";
         var27.dq("九彩");
         this.pv.setBounds(164, 96, 61, 18);
         this.pv.setVisible(true);
         String var24 = "醄洍";
         this.xc.setText("重洗");
         this.xc.setBounds(170, 284, 59, 25);
         this.au[2].setBounds(98, 237, 72, 19);
         this.au[2].setVisible(true);
         this.au[3].setBounds(98, 260, 72, 19);
         this.au[3].setVisible(true);
         this.ok.setBounds(170, 237, 124, 19);
         this.ok.setVisible(true);
         this.kt.setBounds(170, 260, 124, 19);
         this.kt.setVisible(true);
         Class97 var12;
         if (this.za().l(2, 12)) {
            this.dt = new BigDecimal(100000);
            var12 = this;
         } else {
            this.dt = new BigDecimal(1000000);
            var12 = this;
         }

         com.xy.q.Class49.b(var12.ok, this.dt.longValue());
      } else if (this.ds == 1 && this.gs == 1) {
         this.apy[0].setBounds(115, 118, 59, 58);
         this.apy[1].setBounds(231, 118, 59, 58);
         com.xy.q.Class26 var30 = this.apy[0];
         String var36 = "裖奯";
         var30.dq("装备");
         com.xy.q.Class26 var26 = this.apy[1];
         String var31 = "雙朒礗矩";
         var26.dq("隐月神石");
         this.pv.setBounds(114, 100, 61, 18);
         this.pv.setVisible(true);
         String var23 = "釞惷";
         this.xc.setText("重悟");
         this.xc.setBounds(170, 272, 59, 25);
         this.au[2].setBounds(98, 204, 72, 19);
         this.au[2].setVisible(true);
         this.au[3].setBounds(98, 227, 72, 19);
         this.au[3].setVisible(true);
         this.ok.setBounds(170, 204, 124, 19);
         this.ok.setVisible(true);
         this.kt.setBounds(170, 227, 124, 19);
         this.kt.setVisible(true);
         Class97 var9;
         if (this.za().l(2, 12)) {
            this.dt = new BigDecimal(1000000);
            var9 = this;
         } else {
            this.dt = new BigDecimal(5000000);
            var9 = this;
         }

         com.xy.q.Class49.b(var9.ok, this.dt.longValue());
      } else if (this.ds == 2 && this.gs == 0) {
         this.apy[0].setBounds(85, 105, 59, 58);
         com.xy.q.Class26 var10023 = this.apy[0];
         String var10024 = "袌夝";
         var10023.dq("装备");
         this.pv.setBounds(85, 88, 61, 18);
         this.pv.setVisible(true);
         String var10021 = "揃匯";
         this.xc.setText("提升");
         this.xc.setBounds(170, 278, 59, 25);
         this.au[2].setBounds(100, 229, 58, 20);
         this.au[2].setVisible(true);
         this.au[3].setBounds(100, 252, 58, 20);
         this.au[3].setVisible(true);
         this.ok.setBounds(161, 229, 124, 20);
         this.ok.setVisible(true);
         this.kt.setBounds(161, 252, 124, 20);
         this.kt.setVisible(true);
         this.au[4].setBounds(100, 168, 58, 20);
         this.au[4].setVisible(true);
         this.au[5].setBounds(100, 191, 58, 20);
         this.au[5].setVisible(true);
         this.apx.setBounds(161, 168, 124, 20);
         this.apx.setVisible(true);
         this.apv.setBounds(161, 191, 124, 20);
         this.apv.setVisible(true);
         this.dt = new BigDecimal(6000);
         com.xy.q.Class49.b(this.ok, this.dt.longValue());
         if (this.apt == null) {
            this.apt = new Class24(this);
            this.apt.setBounds(149, 106, 165, 56);
            this.add(this.apt, 1);
         }

         this.apt.h();
         this.apt.setVisible(true);
         this.apx.setText("0");
      } else {
         if (this.ds == 2 && this.gs == 1) {
            this.apy[0].setBounds(115, 118, 59, 58);
            this.apy[1].setBounds(231, 118, 59, 58);
            com.xy.q.Class26 var10014 = this.apy[0];
            String var10015 = "袌夝";
            var10014.dq("装备");
            com.xy.q.Class26 var10013 = this.apy[1];
            String var29 = "卐帜魑瞛";
            var10013.dq("千年魂石");
            this.pv.setBounds(114, 100, 61, 18);
            this.pv.setVisible(true);
            String var10011 = "彉吵";
            this.xc.setText("开启");
            this.xc.setBounds(170, 272, 59, 25);
            this.au[2].setBounds(98, 204, 72, 19);
            this.au[2].setVisible(true);
            this.au[3].setBounds(98, 227, 72, 19);
            this.au[3].setVisible(true);
            this.ok.setBounds(170, 204, 124, 19);
            this.ok.setVisible(true);
            this.kt.setBounds(170, 227, 124, 19);
            this.kt.setVisible(true);
            Class97 var8;
            if (this.za().l(2, 12)) {
               this.dt = new BigDecimal(2000000);
               var8 = this;
            } else {
               this.dt = new BigDecimal(10000000);
               var8 = this;
            }

            com.xy.q.Class49.b(var8.ok, this.dt.longValue());
         }
      }
   }
}
