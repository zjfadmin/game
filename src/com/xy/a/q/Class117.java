package com.xy.a.q;

import com.xy.bean.NpcComposeBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class117 extends com.xy.q.Class30 {
   private com.xy.q.Class21 wx;
   private com.xy.q.Class14 aih;
   private JLabel[] c;
   private MoneyType sj;
   private com.xy.q.Class26[] ayx;
   private com.xy.i.Class19[] vw;
   private int ha;
   private com.xy.i.Class19[] ahs;
   private com.xy.q.Class52 em;
   private com.xy.w.Class18[] j;
   private com.xy.i.Class3[] ayy;
   private BigDecimal hh;

   @Override
   public void l() {
      this.ayy = this.yw(this.wx, this.ayy, 356, 281);
      this.em.l();
      this.g(0);
      super.l();
   }

   public void f() {
      if (!this.afx.ah() && this.hh != null) {
         RoleData var1;
         if ((var1 = this.yx()).getLoginResult().getGold().longValue() < this.hh.longValue()) {
            String var42 = "針铭丁路";
            this.afx._do("金钱不足");
         } else {
            int var2 = this.ha == 1 ? 5 : (this.ha == 3 ? 1 : 2);
            Goodstable[] var3 = new Goodstable[var2];

            int var4;
            for (int var10000 = var4 = 0; var10000 < var2; var10000 = var4) {
               Goodstable var5;
               if ((var5 = (Goodstable)this.ayx[var4].ep().jx()) != null) {
                  var5 = var1.getGood(var5.getRgid());
               }

               if (var5 == null) {
                  String var31 = "讫军鼌爣咝凇朹";
                  this.afx._do("请凑齐物品再来");
                  return;
               }

               if (var5.getGoodlock() == 1) {
                  String var30 = "讹牥咝巾裷劬镝";
                  this.afx._do("该物品已被加锁");
                  return;
               }

               if (GoodType.r(var5.getType()) != -1) {
                  if (GoodType.getExtra(var5.getValue(), GoodType.Extras[3]) != null) {
                     String var29 = "夝袙斪沉畢仒戙遼粱剋";
                     this.afx._do("套装无法用于打造系列");
                     return;
                  }

                  if (GoodType.getExtra(var5.getValue(), GoodType.Extras[4]) != null || var5.getQhv() != null && var5.getQhv() > 0) {
                     String var28 = "嶮镺崐宑瞯旬沉甤仒扟遼糷剋";
                     this.afx._do("已镶嵌宝石无法用于打造系列");
                     return;
                  }
               }

               var3[var4++] = var5;
            }

            String var18;
            if (this.ha == 0) {
               var18 = "扛觝浝纟筬瞯";
               var18 = "我要洗练符石";
            } else if (this.ha == 1) {
               var18 = "戝觝各扌笪瞯";
               var18 = "我要合成符石";
            } else if (this.ha == 2) {
               var18 = "剌覿筬瞯";
               var18 = "分解符石";
            } else if (this.ha == 3) {
               var18 = "弶半笪瞯";
               var18 = "强化符石";
            } else {
               var18 = null;
            }

            String var8 = var18;
            if (var8 != null) {
               Class117 var22;
               label144: {
                  if (this.ha == 0) {
                     if (var3[0].getType() != var3[1].getType()) {
                        String var35 = "醑钲靜觋n习筺瞹扊聏n习筺瞹彦卜瞯";
                        this.afx.dp("重铸需要2个符石或者2个符石强化石");
                        return;
                     }

                     int var9 = MsgUntil.getGoodLvl(var3[0].getValue());
                     int var6 = MsgUntil.getGoodLvl(var3[1].getValue());
                     int var7 = this.za().gameType == 2 ? 2 : 3;
                     if (var9 <= var7) {
                        GameView var24 = this.afx;
                        String var10003 = "尃仒筅仒";
                        StringBuilder var34 = new StringBuilder("小于等于").append(var7);
                        String var45 = "绻筬瞯乇股浝纟";
                        var24.dp(var34.append("级符石不能洗练").toString());
                        return;
                     }

                     if (var9 - var7 != var6) {
                        GameView var23 = this.afx;
                        StringBuilder var32 = new StringBuilder(String.valueOf(var9));
                        String var43 = "纫筺矿畴";
                        var32 = var32.append("级符石用").append(var9 - var7);
                        var43 = "筬瞯浝纟";
                        var23.dp(var32.append("符石洗练").toString());
                        return;
                     }

                     if (GoodType.getExtra(var3[0].getValue(), GoodType.Extras[1]) != null) {
                        var22 = this;
                        String var10002 = "筺矿彦匚呒旬沉釁钤";
                        this.afx._do("符石强化后无法重铸");
                        break label144;
                     }
                  } else {
                     if (this.ha == 1) {
                        int var10;
                        if ((var10 = MsgUntil.getGoodLvl(var3[0].getValue())) >= 5) {
                           String var41 = "乑敥捝\u007f绻亯乖呂扌";
                           this.afx.dp("不支持5级以上合成");
                           return;
                        }

                        int var13;
                        for (int var25 = var13 = 1; var25 < var3.length; var25 = ++var13) {
                           if (MsgUntil.getGoodLvl(var3[0].getValue()) != var10) {
                              String var40 = "呔戜爵响靜覍呐筅绻";
                              this.afx.dp("合成物品需要同等级");
                              return;
                           }
                        }

                        var22 = this;
                        break label144;
                     }

                     if (this.ha == 2) {
                        if (MsgUntil.getGoodLvl(var3[0].getValue()) != 5) {
                           String var36 = "\u007f绻筬瞯戇股剌覿";
                           this.afx.dp("5级符石才能分解");
                           return;
                        }
                     } else {
                        if (this.ha != 3) {
                           return;
                        }

                        if (MsgUntil.getGoodLvl(var3[0].getValue()) != 5) {
                           String var39 = "9绻笪瞯扁股弶半";
                           this.afx.dp("5级符石才能强化");
                           return;
                        }

                        String var12;
                        if ((var12 = GoodType.getExtra(var3[0].getValue(), GoodType.Extras[1])) != null) {
                           String var37 = "z";
                           if (Integer.parseInt(var12.split("&")[1]) >= 10) {
                              var37 = "杜外厶胱彦匚m<歽";
                              this.afx.dp("最多只能强化10次");
                              return;
                           }
                        }
                     }
                  }

                  var22 = this;
               }

               if (ParamTool.g(var22.hh.longValue(), this.afx)) {
                  ArrayList var11 = new ArrayList();

                  int var14;
                  for (int var26 = var14 = 0; var26 < var3.length; var26 = ++var14) {
                     ArrayList var27;
                     if (var14 == 0) {
                        var3[var14].setUsetime(0);
                        var27 = var11;
                     } else {
                        var3[var14].n(1);
                        var27 = var11;
                     }

                     var27.add(var3[var14].getRgid());
                     if (var3[var14].getUsetime() <= 0) {
                        this.ayx[var14].gs(0, null);
                        var1.ag(var3[var14].getRgid());
                     }
                  }

                  NpcComposeBean var15 = new NpcComposeBean();
                  var15.setComposetype(var8);
                  var15.setGoodstables(var11);
                  String var16 = Agreement.getSendTextAES("npccompose", com.xy.v.Class31.a().toJson(var15));
                  this.za().k(var16);
               }
            }
         }
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ha = var1;

      for (int var2 = 0; var10000 < this.ahs.length; var10000 = ++var2) {
         this.ahs[var2].setKeep(var2 == this.ha);
      }

      int var3;
      for (int var6 = var3 = 0; var6 < this.ayx.length; var6 = var3) {
         this.ayx[var3].gs(0, null);
         this.ayx[var3++].setVisible(false);
      }

      if (this.ha == 0) {
         var3 = this.za().gameType == 2 ? 2 : 3;
         JLabel var10007 = this.c[2];
         String var10010 = "伣畢屓仄乧筬瞯";
         StringBuilder var10008 = new StringBuilder("使用小于主符石").append(var3);
         String var10009 = "並笕纫盘笪瞯釁钤";
         var10007.setText(var10008.append("个等级的符石重铸").toString());
         this.c[2].setVisible(true);
         com.xy.i.Class19 var18 = this.vw[0];
         String var21 = "醇钤";
         var18.setText("重铸");
         com.xy.i.Class19 var15 = this.vw[1];
         String var19 = "釁钤览剅";
         var15.setText("重铸规则");
         this.ayx[0].setBounds(174, 95, 59, 58);
         this.ayx[1].setBounds(174, 167, 59, 58);
         this.ayx[0].setVisible(true);
         this.ayx[1].setVisible(true);
      } else if (this.ha != 1) {
         if (this.ha == 2) {
            this.c[2].setVisible(false);
            com.xy.i.Class19 var11 = this.vw[0];
            String var14 = "刊覿";
            var11.setText("分解");
            com.xy.i.Class19 var9 = this.vw[1];
            String var12 = "剌覿覎剅";
            var9.setText("分解规则");
            this.ayx[0].setBounds(174, 95, 59, 58);
            this.ayx[0].setVisible(true);
         } else {
            if (this.ha == 3) {
               this.c[2].setVisible(false);
               com.xy.i.Class19 var16 = this.vw[0];
               String var20 = "弶半";
               var16.setText("强化");
               com.xy.i.Class19 var13 = this.vw[1];
               String var17 = "彰半覎剅";
               var13.setText("强化规则");
               this.ayx[0].setBounds(174, 95, 59, 58);
               this.ayx[1].setBounds(174, 167, 59, 58);
               this.ayx[0].setVisible(true);
               this.ayx[1].setVisible(true);
            }
         }
      } else {
         JLabel var10005 = this.c[2];
         String var10006 = "i习阸\u007f绻筬瞯奜产慅呐续筺瞹厳匍绻骒乜续盘筬瞯";
         var10005.setText("5个除5级符石外任意同级符石可升级高一级的符石");
         this.c[2].setVisible(true);
         com.xy.i.Class19 var10003 = this.vw[0];
         String var10004 = "卋绻";
         var10003.setText("升级");
         com.xy.i.Class19 var10002 = this.vw[1];
         String var10 = "匍绻覎剅";
         var10002.setText("升级规则");
         var10000 = 0;
         this.ayx[0].setBounds(60, 95, 59, 58);
         this.ayx[1].setBounds(117, 95, 59, 58);

         for (int var4 = 0; var10000 < this.ayx.length; var10000 = var4) {
            this.ayx[var4++].setVisible(true);
         }
      }
   }

   public Class117(GameView var1) {
      super(70, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u007f?#8#m\",b;";
      this.yy(-1, 0, 392, 505, com.xy.q.Class30.agh);
      com.xy.w.Class9 var33 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "筬瞯醇钤";
      this.yu(var33, "符石重铸");
      this.ahs = new com.xy.i.Class19[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ahs.length; var10000 = var2) {
         com.xy.i.Class19[] var7 = this.ahs;
         var10004 = "/osis:j\",b;";
         int var10006 = 123 + var2;
         String var41;
         Class117 var10010;
         if (var2 == 0) {
            var41 = "醇钤";
            var41 = "重铸";
            var10010 = this;
         } else if (var2 == 1) {
            var41 = "卋绻";
            var41 = "升级";
            var10010 = this;
         } else if (var2 == 2) {
            var41 = "剌覿";
            var41 = "分解";
            var10010 = this;
         } else if (var2 == 3) {
            var41 = "弶半";
            var41 = "强化";
            var10010 = this;
         } else {
            var41 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/66.png", 2, var10006, Class49.bx, Class49.bv, var41, var10010);
         var7[var2] = var10002;
         this.ahs[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.ahs[var2].setBounds(59 + 65 * var2, 18, 58, 33);
         this.add(this.ahs[var2++]);
      }

      this.vw = new com.xy.i.Class19[2];

      for (int var8 = var2 = 0; var8 < this.vw.length; var8 = var2) {
         com.xy.i.Class19[] var9 = this.vw;
         var10004 = "9?e9ekd,$;";
         int var39 = 131 + var2;
         String var46;
         Class117 var48;
         if (var2 == 0) {
            var46 = "卋绻";
            var46 = "升级";
            var48 = this;
         } else if (var2 == 1) {
            var46 = "匍绻覎剅";
            var46 = "升级规则";
            var48 = this;
         } else {
            var46 = "";
            var48 = this;
         }

         com.xy.i.Class19 var25 = new com.xy.i.Class19("sc/e/7.png", 1, var39, com.xy.q.Class49.ch, null, var46, var48);
         var9[var2] = var25;
         Class117 var10;
         if (var2 == 0) {
            var10 = this;
            this.vw[var2].setForeground(Color.black);
         } else {
            if (var2 == 1) {
               var25 = this.vw[var2];
               var10003 = "/osis>d\",b;";
               var25.setImage("sc/e/28.png");
               this.vw[var2].setFont(com.xy.q.Class49.bz);
               this.vw[var2].setBounds(275, 203, 68, 18);
            }

            var10 = this;
         }

         var10.vw[var2].setBounds(277, 241, 59, 25);
         this.add(this.vw[var2++]);
      }

      this.c = new JLabel[3];

      for (int var11 = var2 = 0; var11 < this.c.length; var11 = var2) {
         int var37 = 235 + 20 * var2;
         String var10008 = "i?\f\u001a\f\u001a\f\u001a";
         this.c[var2] = com.xy.q.Class1.f(71, var37, 72, 19, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.w);
         JLabel var12 = this.c[var2];
         String var17;
         if (var2 == 0) {
            var17 = "涄聋針铭";
            var17 = "消耗金钱";
         } else if (var2 == 1) {
            var17 = "抯杕醛铭";
            var17 = "拥有金钱";
         } else if (var2 == 2) {
            var17 = "i並阸9绻笪瞯多产愃呐纫筺矿厳卋绻體乜纫盘笪瞯";
            var17 = "5个除5级符石外任意同级符石可升级高一级的符石";
         } else {
            var17 = "";
         }

         var12.setText(var17);
         if (var2 == 2) {
            this.c[var2].setFont(com.xy.q.Class49.n);
            this.c[var2].setBounds(53, 63, 300, 15);
            JLabel var13 = this.c[var2];
            var17 = "i?\f\u001a\f\u001azl";
            var13.setForeground(com.xy.q.Class49.c("#cFFFF00"));
         }

         this.add(this.c[var2++]);
      }

      this.sj = new MoneyType();
      String var10012 = "針铭";
      this.sj.setIdAndKey(1, "金钱");
      this.aih = com.xy.q.Class1.i(143, 235, 124, 19, 10, Color.white, com.xy.q.Class49.w);
      this.em = com.xy.q.Class1.m(143, 255, 124, 19, 10, Color.white, com.xy.q.Class49.w, this.sj, var1);
      String var40 = "/)s.s{kd,$;";
      this.aih.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var10005 = "/oshs=k\",b;";
      this.em.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.aih);
      this.add(this.em);
      this.ayx = new com.xy.q.Class26[6];

      for (int var14 = var2 = 0; var14 < this.ayx.length; var14 = var2) {
         this.ayx[var2] = new com.xy.q.Class26(this);
         Class117 var15;
         if (var2 < 5) {
            var15 = this;
            this.ayx[var2].setBounds(60 + var2 * 57, 95, 59, 58);
         } else {
            var15 = this;
            this.ayx[var2].setBounds(174, 167, 59, 58);
         }

         var15.add(this.ayx[var2++]);
      }

      this.j = new com.xy.w.Class18[3];

      for (int var16 = var2 = 0; var16 < this.j.length; var16 = ++var2) {
         this.j[var2] = new com.xy.w.Class18();
         this.add(this.j[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var21 = this.j[var2];
            String var30 = "/)s.syid,$;";
            var21.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
            this.j[var2].setBounds(47, 32, 310, 20);
         } else if (var2 == 1) {
            com.xy.w.Class18 var22 = this.j[var2];
            String var31 = "/oshs8e\",b;";
            var22.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(47, 51, 310, 230);
         } else if (var2 == 2) {
            com.xy.w.Class18 var23 = this.j[var2];
            String var32 = "/)s.s{ed,$;";
            var23.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(47, 281, 309, 207);
         }
      }

      this.wx = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 48, 283);
      var10005 = "/oshs=d\",b;";
      this.wx.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.wx.rm(true);
      this.add(this.wx);
      if (this.za().VALUE.indexOf(73) == -1) {
         this.ahs[2].setVisible(false);
         this.ahs[3].setVisible(false);
      }
   }

   public void h() {
      if (this.ha != 0 && this.ha != 2 && this.ha != 3) {
         if (this.ha == 1) {
            Goodstable var1;
            if ((var1 = (Goodstable)this.ayx[0].ep().jx()) == null) {
               this.hh = null;
               this.aih.setText(null);
               return;
            }

            int var2 = MsgUntil.getGoodLvl(var1.getValue());
            Class117 var10000;
            if (this.za().l(2, 12)) {
               this.hh = new BigDecimal(100000 * var2);
               var10000 = this;
            } else {
               this.hh = new BigDecimal(1000000 * var2);
               var10000 = this;
            }

            com.xy.q.Class49.b(var10000.aih, this.hh.longValue());
         }
      } else if (this.ayx[0].ep().il() == 1) {
         this.hh = new BigDecimal(this.za().l(2, 12) ? 100000 : 1000000);
         com.xy.q.Class49.b(this.aih, this.hh.longValue());
      } else {
         this.hh = null;
         this.aih.setText(null);
      }
   }

   public void bb(Goodstable var1) {
      if (this.ha == 0) {
         long var7;
         if ((var7 = var1.getType()) == 188L || var7 == 187L) {
            int var10 = -1;

            int var12;
            for (int var16 = var12 = 0; var16 < 2; var16 = ++var12) {
               Goodstable var14;
               if ((var14 = (Goodstable)this.ayx[var12].ep().jx()) != null && var14.getRgid().compareTo(var1.getRgid()) == 0) {
                  return;
               }

               if (var14 == null && var10 == -1) {
                  var10 = var12;
               }
            }

            if (var10 == -1) {
               var10 = 0;
            }

            this.ayx[var10].gs(1, var1);
            this.h();
         }
      } else if (this.ha == 1) {
         if (var1.getType() == 188L) {
            int var9 = -1;

            int var11;
            for (int var15 = var11 = 0; var15 < 5; var15 = ++var11) {
               Goodstable var13;
               if ((var13 = (Goodstable)this.ayx[var11].ep().jx()) != null && var13.getRgid().compareTo(var1.getRgid()) == 0) {
                  return;
               }

               if (var13 == null && var9 == -1) {
                  var9 = var11;
               }
            }

            if (var9 == -1) {
               var9 = 0;
            }

            this.ayx[var9].gs(1, var1);
            this.h();
         }
      } else if (this.ha == 2) {
         if (var1.getType() == 188L) {
            int var8 = -1;

            int var5;
            for (int var10000 = var5 = 0; var10000 < 1; var10000 = ++var5) {
               Goodstable var6;
               if ((var6 = (Goodstable)this.ayx[var5].ep().jx()) != null && var6.getRgid().compareTo(var1.getRgid()) == 0) {
                  return;
               }

               if (var6 == null && var8 == -1) {
                  var8 = var5;
               }
            }

            if (var8 == -1) {
               var8 = 0;
            }

            this.ayx[var8].gs(1, var1);
            this.h();
         }
      } else {
         if (this.ha == 3) {
            long var2;
            if ((var2 = var1.getType()) != 188L && var2 != 187L) {
               return;
            }

            int var4 = var2 == 188L ? 0 : 1;
            this.ayx[var4].gs(1, var1);
            this.h();
         }
      }
   }
}
