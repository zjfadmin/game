package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.Baby;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.q.Class54;
import com.xy.q.Class60;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class11 extends com.xy.q.Class30 {
   private BigDecimal mq;
   private MoneyType br;
   private com.xy.i.Class11[] mr;
   private com.xy.w.Class18[] iq;
   private int z;
   private Class54[] an;
   private Class52 ek;
   private com.xy.i.Class11[] ms;
   private com.xy.q.Class13 hb;
   private JLabel[] ay;
   private int ds;
   private com.xy.q.Class14[] k;
   private Class12 he;

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.afx.dh()) {
         this.f();
      }

      super.paintComponent(var1);
   }

   public void bi(int var1) {
      int var10000 = 0;
      this.z = var1;

      for (int var2 = 0; var10000 < this.mr.length; var10000 = ++var2) {
         this.mr[var2].setKeep(var2 == this.z);
      }

      int var3;
      for (int var6 = var3 = 0; var6 < this.an.length; var6 = var3) {
         Class54 var7 = this.an[var3];
         var3++;
         var7.gs(0, null);
      }

      Class11 var9;
      if (this.z == 0) {
         Goodstable var4 = this.yt().ay(new BigDecimal(668));
         Class54 var8 = this.an[1];
         byte var10001;
         Goodstable var10002;
         if (var4 != null) {
            var10001 = 1;
            var10002 = var4;
         } else {
            var10001 = 0;
            var10002 = var4;
         }

         var8.gs(var10001, var10002);
         var9 = this;
         this.mq = new BigDecimal(100000);
         Class49.b(this.k[2], this.mq.longValue());
         com.xy.i.Class11 var12 = this.ms[1];
         String var15 = "雾瑩";
         var12.setText("雕琢");
      } else {
         if (this.z == 1) {
            Goodstable var5 = this.yt().ay(new BigDecimal(669));
            Class54 var10 = this.an[1];
            byte var13;
            Goodstable var16;
            if (var5 != null) {
               var13 = 1;
               var16 = var5;
            } else {
               var13 = 0;
               var16 = var5;
            }

            var10.gs(var13, var16);
            this.mq = new BigDecimal(100000);
            Class49.b(this.k[2], this.mq.longValue());
            com.xy.i.Class11 var11 = this.ms[1];
            String var14 = "释铟";
            var11.setText("重铸");
         }

         var9 = this;
      }

      var9.f();
      this.cr(false);
   }

   public void f() {
      RoleData var1;
      long var2 = (var1 = this.yx()).getGoodTypeNum(137);
      if (this.ds != var2) {
         this.ds = (int)var2;
         com.xy.q.Class14 var10000 = this.k[3];
         String var10003 = "6\b";
         var10000.setText("1/" + this.ds);
      }

      if (this.an[0].il() != 0) {
         Goodstable var4;
         if ((var4 = (Goodstable)this.an[0].jx()) != null) {
            var4 = var1.getGood(var4.getRgid());
         }

         if (var4 == null) {
            this.bb(null);
            return;
         }
      }
   }

   public List<BigDecimal> fl(List<BigDecimal> var1, BigDecimal[] var2) {
      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
         Goodstable var4;
         if ((var4 = this.yx().getGoodEquip(var2[var3])) != null) {
            if (var1 == null) {
               var1 = new ArrayList();
            }

            var1.add(var4.getRgid());
         }
      }

      return var1;
   }

   public void y(int var1) {
      this.z = var1;
      this.zc().b(this.lj());
   }

   public void h() {
      if (this.he == null) {
         this.cr(true);
      } else {
         this.cr(!this.he.isVisible());
      }
   }

   public int dx() {
      return this.z;
   }

   public void bb(Goodstable var1) {
      Class54 var10000 = this.an[0];
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      var10000.gs(var10001, var10002);
   }

   public void i(BigDecimal var1) {
      if (this.he != null) {
         RoleData var2 = this.yx();
         Object var3 = new ArrayList();

         int var4;
         for (int var10000 = var4 = 0; var10000 < var2.babys.size(); var10000 = ++var4) {
            Baby var5 = var2.babys.get(var4);
            if (var1 == null || var5.getBabyid().compareTo(var1) == 0) {
               BigDecimal[] var6 = var5.getpartAll();
               var3 = this.fl((List<BigDecimal>)var3, var6);
            }
         }

         this.he.nc.vs().a(0);
         this.he.nc.fm((List<BigDecimal>)var3);
      }
   }

   public void cr(boolean var1) {
      if (this.he != null || var1) {
         if (var1) {
            if (this.he == null) {
               this.add(this.he = new Class12(this), 0);
            }

            this.he.nb.be(false);
            this.he.nb.td().removeAllElements();
            int var2 = 0;
            RoleData var3 = this.yx();
            List var4 = null;

            int var5;
            for (int var10000 = var5 = 0; var10000 < var3.babys.size(); var10000 = ++var5) {
               Baby var6;
               BigDecimal[] var7 = (var6 = var3.babys.get(var5)).getpartAll();
               if (var4 != null) {
                  var4.clear();
               }

               if ((var4 = this.fl(var4, var7)) != null && var4.size() != 0) {
                  var2 += var4.size();
                  StringBuilder var10002 = new StringBuilder(String.valueOf(var6.getBabyname()));
                  String var10003 = "\u000f";
                  var10002 = var10002.append("(").append(var4.size());
                  var10003 = "b";
                  Class60 var8 = new Class60(var10002.append(")").toString(), var6.getBabyid());
                  this.he.nb.afo(var8);
               }
            }

            String var10004 = "兏郯\u000f";
            StringBuilder var11 = new StringBuilder("全部(").append(var2);
            String var13 = "b";
            Class60 var9 = new Class60(var11.append(")").toString(), null);
            this.he.nb.afo(var9);
            this.he.nb.n(this.he.nb.td().size() - 1);
            this.he.setBounds(30, 108, 330, 150);
         }

         this.he.setVisible(var1);
      }
   }

   public boolean dh() {
      RoleData var1;
      Goodstable var2;
      if ((var2 = (var1 = this.yx()).au(this.z == 0 ? 138 : 136)) == null) {
         String var29;
         if (this.z == 0) {
            var29 = "罱尺殘秫瞸";
            var29 = "缺少毓秀石";
         } else {
            var29 = "缝尖捅骯丞";
            var29 = "缺少换骨丹";
         }

         this.afx._do(var29);
         return false;
      } else {
         Goodstable var3;
         if ((var3 = (Goodstable)this.an[0].jx()) != null) {
            var3 = var1.getGood(var3.getRgid());
         }

         if (var3 == null) {
            String var33 = "讼逢抢寒廟牂咊";
            this.afx._do("请选择对应物品");
            return false;
         } else if (this.mq != null && var1.getLoginResult().getGold().compareTo(this.mq) < 0) {
            GameView var27 = this.afx;
            String var10004 = "夀诚带上趔";
            StringBuilder var32 = new StringBuilder("大话币不足").append(this.mq.longValue() / 10000L);
            String var10003 = "乌";
            var27._do(var32.append("万").toString());
            return false;
         } else {
            com.xy.a.q.Class30 var4;
            if ((var4 = (com.xy.a.q.Class30)this.zc().l(11)) != null) {
               byte var10001;
               Goodstable var10002;
               if (this.z == 0) {
                  var10001 = 8;
                  var10002 = var3;
               } else {
                  var10001 = 7;
                  var10002 = var3;
               }

               if (var4.pa(var10001, var10002.getRgid())) {
                  SuitOperBean var12 = new SuitOperBean();
                  ArrayList var13 = new ArrayList();
                  var13.add(var3.getRgid());
                  var13.add(var2.getRgid());
                  var12.setType(this.z == 0 ? 135 : 133);
                  var12.setGoods(var13);
                  String var15 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var12));
                  this.za().k(var15);
                  return true;
               }
            }

            if (var4 == null) {
               var4 = (com.xy.a.q.Class30)this.zc().j(11);
            }

            if (this.z == 0) {
               String var10000 = var3.getValue();
               String var20 = "炻噏屙怀";
               String var5;
               if ((var5 = GoodType.getExtra(var10000, "炼器属性")) == null) {
                  String var31 = "烲釺呅扦肶雾瑩";
                  this.afx._do("点金后才能雕琢");
                  return false;
               }

               var4.oz(var3.getRgid(), var5, 8, true);
            } else {
               StringBuffer var11 = new StringBuffer();
               int var6 = 0;
               int var7;
               int var16 = var7 = 0;

               while (var16 < var3.getValue().length()) {
                  String var17 = var3.getValue();
                  String var21 = "[";
                  if ((var7 = var17.indexOf("|", var6 + 1)) == -1) {
                     var7 = var3.getValue().length();
                  }

                  String var9;
                  if ((var9 = var3.getValue().substring(var6, var7)).startsWith(GoodType.Extras[1])) {
                     var16 = var7;
                  } else {
                     var21 = "v";
                     int var8;
                     if ((var8 = var9.indexOf("=")) == -1) {
                        var16 = var7;
                     } else {
                        label78: {
                           String var10;
                           String var19 = var10 = var9.substring(0, var8);
                           var21 = "筎纀";
                           if (!var19.equals("等级")) {
                              var21 = "裮奌籐埀";
                              if (!var10.equals("装备类型")) {
                                 var21 = "怠刌覆汥";
                                 if (var10.equals("性别要求")) {
                                    var16 = var7;
                                    break label78;
                                 }

                                 if (var11.length() != 0) {
                                    var21 = "7";
                                    var11.append("|");
                                 }

                                 var11.append(var9);
                              }
                           }

                           var16 = var7;
                        }
                     }
                  }

                  var6 = var16 + 1;
                  var16 = var7;
               }

               var4.oz(var3.getRgid(), var11.toString(), 7, true);
            }

            return false;
         }
      }
   }

   public void g(int var1) {
      if (var1 == 83) {
         this.h();
      } else {
         if (var1 == 84) {
            this.dh();
         }
      }
   }

   public Class11(GameView var1) {
      super(166, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "X(\u0004/\u0004z\u0005;E,";
      this.ds = -1;
      this.yy(-1, 0, 382, 450, com.xy.q.Class30.agh);
      com.xy.w.Class9 var40 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "雒琅";
      this.yu(var40, "雕琢");
      this.mr = new com.xy.i.Class11[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.mr.length; var10000 = var2) {
         com.xy.i.Class11[] var10 = this.mr;
         var10004 = "8HdNd\u0018r\u0005;E,";
         int var10006 = 81 + var2;
         String var55;
         Class11 var10010;
         if (var2 == 0) {
            var55 = "雒琅";
            var55 = "雕琢";
            var10010 = this;
         } else if (var2 == 1) {
            var55 = "釦钳";
            var55 = "重铸";
            var10010 = this;
         } else {
            var55 = "";
            var10010 = this;
         }

         com.xy.i.Class11 var10002 = new com.xy.i.Class11("sc/e/39.png", 2, var10006, Class49.ck, null, var55, var10010);
         var10[var2] = var10002;
         this.mr[var2].setOffsetTexts(Class49.bo);
         this.mr[var2].setBounds(52 + 65 * var2, 22, 63, 24);
         this.add(this.mr[var2++]);
      }

      this.ms = new com.xy.i.Class11[3];

      for (int var11 = var2 = 0; var11 < this.ms.length; var11 = var2) {
         com.xy.i.Class11[] var12 = this.ms;
         if (var2 == 0) {
            var10004 = "Td\bb\b5\u001f)Wi@";
            var10004 = "sc/e/28.png";
         } else if (var2 == 1) {
            var10004 = "X(\u0004.\u0004|\u0005;E,";
            var10004 = "sc/e/7.png";
         } else {
            var10004 = "Td\bb\b3\u0017)Wi@";
            var10004 = "sc/e/40.png";
         }

         int var54 = 83 + var2;
         Font var10007 = var2 == 1 ? Class49.ch : Class49.bz;
         String var58;
         Class11 var62;
         if (var2 == 0) {
            var58 = "巙稴裮奌";
            var58 = "已穿装备";
            var62 = this;
         } else if (var2 == 1) {
            var58 = "雒琅";
            var58 = "雕琢";
            var62 = this;
         } else if (var2 == 2) {
            var58 = "ｔ";
            var58 = "？";
            var62 = this;
         } else {
            var58 = "";
            var62 = this;
         }

         com.xy.i.Class11 var10001 = new com.xy.i.Class11(var10004, 1, var54, var10007, null, var58, var62);
         var12[var2] = var10001;
         Class11 var13;
         if (var2 == 0) {
            var13 = this;
            this.ms[var2].setBounds(115, 130, 60, 18);
         } else if (var2 == 1) {
            var13 = this;
            this.ms[var2].setBounds(172, 267, 59, 25);
            this.ms[var2].setForeground(Color.black);
         } else {
            if (var2 == 2) {
               this.ms[var2].setBounds(335, 49, 18, 18);
            }

            var13 = this;
         }

         var13.add(this.ms[var2++]);
      }

      this.ay = new JLabel[4];

      for (int var14 = var2 = 0; var14 < this.ay.length; var14 = var2) {
         int var47 = 167 + 23 * var2;
         String var10008 = "$DAaAaAa";
         this.ay[var2] = com.xy.q.Class1.f(109, var47, 60, 19, 10, Class49.c("#cFFFFFF"), Class49.n);
         JLabel var15 = this.ay[var2];
         String var24;
         if (var2 == 0) {
            var24 = "涣聜佸勐";
            var24 = "消耗体力";
         } else if (var2 == 1) {
            var24 = "拢朮佔劼";
            var24 = "拥有体力";
         } else if (var2 == 2) {
            var24 = "涣聜釺铺";
            var24 = "消耗金钱";
         } else if (var2 == 3) {
            var24 = "拢朮釖钖";
            var24 = "拥有金钱";
         } else {
            var24 = "";
         }

         var15.setText(var24);
         this.add(this.ay[var2++]);
      }

      this.k = new com.xy.q.Class14[4];

      for (int var16 = var2 = 0; var16 < this.k.length; var16 = var2) {
         this.k[var2] = com.xy.q.Class1.i(170, 167 + 23 * var2, 124, 19, 10, Color.white, Class49.w);
         com.xy.q.Class14 var17 = this.k[var2];
         String var28 = "8HdOd\u001a|\u0005;E,";
         var17.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         if (var2 == 3) {
            this.k[var2].setBounds(229, 129, 64, 19);
            this.k[var2].setHorizontalAlignment(0);
         }

         this.add(this.k[var2++]);
      }

      this.br = new MoneyType();
      String var61 = "釶'钖";
      this.br.setIdAndKey(1, "金 钱");
      this.ek = com.xy.q.Class1.m(170, 236, 124, 19, 10, Color.white, Class49.w, this.br, var1);
      String var10005 = "8HdOd\u001a|\u0005;E,";
      this.ek.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ek);
      this.an = new Class54[2];

      for (int var18 = var2 = 0; var18 < this.an.length; var18 = var2) {
         this.an[var2] = new Class54(this);
         Class54 var48 = this.an[var2];
         var10005 = "tD(C(\u0013)Wi@";
         var48.dq("sc/d/4.png");
         this.an[var2].wp(Class54.auc);
         this.an[var2].setBounds(115 + var2 * 116, 71, 59, 57);
         this.add(this.an[var2++]);
      }

      this.iq = new com.xy.w.Class18[2];

      for (int var19 = var2 = 0; var19 < this.iq.length; var19 = var2) {
         this.iq[var2] = new com.xy.w.Class18();
         Class11 var20;
         if (var2 == 0) {
            var20 = this;
            com.xy.w.Class18 var36 = this.iq[var2];
            var10003 = "8HdOd\u001ar\u0005;E,";
            var36.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.iq[var2].setBounds(47, 305, 309, 105);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var29 = this.iq[var2];
               String var37 = "Td\bc\b3\u001e)Wi@";
               var29.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
               this.iq[var2].setBounds(46, 46, 310, 260);
            }

            var20 = this;
         }

         var20.add(this.iq[var2++]);
      }

      com.xy.i.Class3[] var9 = new com.xy.i.Class3[2];

      int var3;
      for (int var21 = var3 = 0; var21 < var9.length; var21 = var3) {
         if (var3 == 0) {
            var10004 = "8HdNd\u001fy\u0005;E,";
            var10004 = "sc/e/42.png";
         } else {
            var10004 = "Td\bb\b3\u0014)Wi@";
            var10004 = "sc/e/43.png";
         }

         com.xy.i.Class3 var30 = new com.xy.i.Class3(var10004, 1, var3, this);
         var9[var3] = var30;
         Class11 var22;
         if (var3 == 0) {
            var9[var3].setBounds(316, 412, 18, 18);
            var22 = this;
         } else {
            var9[var3].setBounds(338, 412, 18, 18);
            var22 = this;
         }

         var22.add(var9[var3++]);
      }

      this.hb = new com.xy.q.Class13(this, 6, 2, 51, 51, 0, 0, 48, 307);
      var10005 = "8HdOd\u001as\u0005;E,";
      this.hb.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.hb.vr(var9, 1);
      this.hb.ol(139L);
      this.add(this.hb);
   }

   @Override
   public void l() {
      this.ek.l();
      this.bi(this.z);
      super.l();
   }
}
