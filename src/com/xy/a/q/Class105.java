package com.xy.a.q;

import com.xy.bean.ConfirmBean;
import com.xy.bean.SuitOperBean;
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
import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class Class105 extends com.xy.q.Class30 {
   private com.xy.i.Class19[] lk;
   private static Border awc;
   private int gw;
   private JScrollPane yc;
   private BigDecimal bs;
   private JComponent awd;
   private com.xy.i.Class19[] hi;
   private com.xy.q.Class54 hr;
   private com.xy.q.Class52 ek;
   private com.xy.q.Class14 ac;
   private Class5[] awe;
   private JLabel[] ay;
   private com.xy.q.Class13 awf;
   private com.xy.w.Class18[] fp;
   private MoneyType ca;

   public Goodstable vf(int var1) {
      if (var1 == 0) {
         return (Goodstable)this.hr.jx();
      } else {
         int var2;
         for (int var10000 = var2 = 0; var10000 < this.awe.length; var10000 = ++var2) {
            if (Class5.fa(this.awe[var2]) != 1 && Class5.fc(this.awe[var2]).il() == 1) {
               return (Goodstable)Class5.fc(this.awe[var2]).jx();
            }
         }

         return null;
      }
   }

   public void bi(int var1) {
      Class105 var12;
      if (var1 == -2) {
         int var2;
         for (int var10000 = var2 = 1; var10000 < this.hi.length; var10000 = var2) {
            this.hi[var2++].setVisible(false);
         }

         var12 = this;
      } else {
         com.xy.i.Class19 var13 = this.hi[1];
         String var19;
         if (var1 == -1) {
            var19 = "儏邠";
            var19 = "全部";
         } else if (var1 == 0) {
            var19 = "歊噾";
            var19 = "武器";
         } else if (var1 == 3) {
            var19 = "蠄杅";
            var19 = "衣服";
         } else if (var1 == 1) {
            var19 = "帑孆";
            var19 = "帽子";
         } else if (var1 == 2) {
            var19 = "頞钶";
            var19 = "项链";
         } else if (var1 == 5) {
            var19 = "鞧孆";
            var19 = "鞋子";
         } else {
            var19 = "";
         }

         var13.setText(var19);
         int var14 = 2;
         this.hi[1].setVisible(true);

         for (int var8 = 2; var14 < this.hi.length; var14 = var8) {
            this.hi[var8++].setVisible(false);
         }

         var12 = this;
      }

      RoleData var9 = var12.yx();
      int var3 = 0;
      BigDecimal[] var4 = var1 == -2 ? var9.goodChoses : var9.goodPacks;

      int var5;
      for (int var15 = var5 = 0; var15 < var4.length; var15 = ++var5) {
         Goodstable var6;
         if ((var6 = var9.getGood(var4[var5])) != null && (var1 < 0 && GoodType.ad(var6.getType()) || var1 >= 0 && var1 == GoodType.r(var6.getType()))) {
            Class50 var7;
            if ((var7 = (Class50)(var3 < this.awd.getComponentCount() ? this.awd.getComponent(var3) : null)) == null) {
               var7 = new Class50(this);
               var7.setBounds(0, var3 * 69, 159, 68);
               this.awd.add(var7);
            }

            var3++;
            var7.bb(var6);
         }
      }

      var5 = var3;
      int var11 = this.awd.getComponentCount();

      for (int var16 = var3; var16 < var11; var16 = var5) {
         Class50 var17 = (Class50)this.awd.getComponent(var5);
         var5++;
         var17.bb(null);
      }

      this.awd.setPreferredSize(new Dimension(160, 69 * var3));
      this.amf(null);
   }

   public void y(int var1) {
      int var10000 = 0;
      this.gw = var1;

      for (int var2 = 0; var10000 < this.lk.length; var10000 = ++var2) {
         this.lk[var2].setKeep(var2 == this.gw);
      }

      this.bi(this.gw == 0 ? -2 : -1);
   }

   public void g(int var1) {
      if (this.hi[2].isVisible()) {
         this.bi(var1 == 182 ? 0 : (var1 == 183 ? 3 : (var1 == 184 ? 1 : (var1 == 185 ? 2 : (var1 == 186 ? 5 : -1)))));
      } else {
         com.xy.i.Class19 var10000 = this.hi[1];
         String var10001 = "兄郾";
         var10000.setText("全部");

         int var2;
         for (int var3 = var2 = 1; var3 < this.hi.length; var3 = var2) {
            this.hi[var2++].setVisible(true);
         }
      }
   }

   @Override
   public void l() {
      this.y(0);
      this.ek.l();
      super.l();
   }

   public void ay(Goodstable var1) {
      Goodstable var2;
      BigDecimal var10000;
      Goodstable var10001;
      if ((var2 = (Goodstable)this.hr.jx()) != null) {
         var10000 = var2.getRgid();
         var10001 = var1;
      } else {
         var10000 = null;
         var10001 = var1;
      }

      if (com.xy.v.Class12.x(var10000, var10001.getRgid())) {
         RoleData var3 = this.yx();
         this.bs = null;
         this.ac.setText(null);
         this.ay[1].setText(null);
         this.hr.gs(0, null);

         int var4;
         for (int var17 = var4 = 0; var17 < this.awe.length; var17 = var4) {
            Class5 var18 = this.awe[var4];
            var4++;
            var18.fd(0, null);
         }

         this.awe[2].setVisible(false);
         this.hr.gs(1, var1);
         var4 = GoodType.r(var1.getType());
         int var5 = 0;
         int var6 = var4 == 0 ? 3 : 2;

         for (int var19 = var5; var19 < var6; var19 = ++var5) {
            if (var4 == 0) {
               JLabel var20 = Class5.fb(this.awe[var5]);
               String var30;
               if (var5 == 0) {
                  String var29 = "贬烩瞻";
                  var30 = "赤炎石";
               } else if (var5 == 1) {
                  String var31 = "紽烳知";
                  var30 = "紫烟石";
               } else {
                  String var32 = "嬜隧瞻";
                  var30 = "孔雀石";
               }

               var20.setText(var30);
            } else if (var4 == 1) {
               JLabel var21 = Class5.fb(this.awe[var5]);
               String var34;
               if (var5 == 0) {
                  String var33 = "萫昳知";
                  var34 = "落星石";
               } else {
                  String var35 = "苑蒮瞻";
                  var34 = "芙蓉石";
               }

               var21.setText(var34);
            } else if (var4 == 2) {
               JLabel var22 = Class5.fb(this.awe[var5]);
               String var37;
               if (var5 == 0) {
                  String var36 = "沆队知";
                  var37 = "沐阳石";
               } else {
                  String var38 = "苑蒮瞻";
                  var37 = "芙蓉石";
               }

               var22.setText(var37);
            } else if (var4 == 3) {
               JLabel var23 = Class5.fb(this.awe[var5]);
               String var40;
               if (var5 == 0) {
                  String var39 = "萫昳知";
                  var40 = "落星石";
               } else {
                  String var41 = "泘陔瞻";
                  var40 = "沐阳石";
               }

               var23.setText(var40);
            } else if (var4 == 5) {
               JLabel var24 = Class5.fb(this.awe[var5]);
               String var43;
               if (var5 == 0) {
                  String var42 = "琟璯知";
                  var43 = "琉璃石";
               } else {
                  String var44 = "定尖瞻";
                  var43 = "寒山石";
               }

               var24.setText(var43);
            }
         }

         if (var4 == 0) {
            this.awe[2].setVisible(true);
         }

         Goodstable var25;
         if (var4 == 0) {
            var25 = var1;
            this.awf.ol(746L, 755L, 767L);
         } else if (var4 == 1) {
            var25 = var1;
            this.awf.ol(749L, 761L);
         } else if (var4 == 2) {
            var25 = var1;
            this.awf.ol(749L, 764L);
         } else if (var4 == 3) {
            var25 = var1;
            this.awf.ol(761L, 764L);
         } else {
            if (var4 == 5) {
               this.awf.ol(752L, 758L);
            }

            var25 = var1;
         }

         String var26 = var25.getValue();
         String var45 = "宱知屲怱";
         String var12;
         if ((var12 = GoodType.getExtra(var26, "宝石属性")) != null) {
            String var46 = "n";
            String[] var13 = var12.split("&");

            int var7;
            for (int var27 = var7 = 1; var27 < var13.length; var27 = ++var7) {
               BigDecimal var8 = new BigDecimal(var13[var7]);
               int var9;
               if ((var2 = var3.getGoodEquip(var8)) != null && (var9 = GoodType.ai(var4, var2.getType())) != 0) {
                  this.awe[var9 - 1].fd(1, var2);
               }
            }

            var7 = 0;
            int var15 = this.awd.getComponentCount();

            for (int var28 = var7; var28 < var15; var28 = ++var7) {
               Class50 var16;
               if (!(var16 = (Class50)this.awd.getComponent(var7)).isVisible()) {
                  return;
               }

               if (Class50.vi(var16)[0].ee() == var1.getRgid().longValue()) {
                  var16.bb(var1);
                  return;
               }
            }
         }
      }
   }

   public void ak(com.xy.q.Class54 var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.awe.length; var10000 = ++var2) {
         if (Class5.fc(this.awe[var2]) == var1) {
            if (Class5.fa(this.awe[var2]) != 0) {
               return;
            }

            this.awe[var2].fd(0, null);
            this.bs = null;
            this.ac.setText(null);
            this.ay[1].setText(null);
            return;
         }
      }
   }

   public void h() {
      RoleData var1 = this.yx();
      Goodstable var2 = this.vf(0);
      Goodstable var3 = this.vf(1);
      if (var2 != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = var1.getGood(var3.getRgid());
      }

      if (var2 != null && var3 != null && var2.getRgid().compareTo(var3.getRgid()) != 0) {
         if (var2.getGoodlock() == 1) {
            String var19 = "诳牅哗州袽劌锗";
            this.afx.dp("该物品已被加锁");
         } else if (var3.getGoodlock() == 1) {
            String var18 = "训爎咉嶕裣勇镉";
            this.afx.dp("该物品已被加锁");
         } else if (var3.getStatus() != 1) {
            int var4 = MsgUntil.getGoodLvl(var3.getValue());
            BigDecimal var5 = new BigDecimal(5000000 + var4 * 1000000);
            if (var1.getLoginResult().getGold().longValue() < var5.longValue()) {
               String var17 = "釽钧両趥";
               this.afx.dp("金钱不足");
            } else {
               com.xy.v.Class24[] var10001 = new com.xy.v.Class24[1];
               boolean var10006 = false;
               var10001[0] = new com.xy.v.Class24(81095L, var4 <= 4 ? 1 : var4 - 3);
               List var6;
               if ((var6 = var1.bj(var10001)) == null) {
                  GameView var15 = this.afx;
                  String var10003 = "乪套";
                  StringBuilder var16 = new StringBuilder("不够").append(var4 <= 4 ? 1 : var4 - 3);
                  String var10002 = "丼宱知粒単";
                  var15.dp(var16.append("个宝石精华").toString());
               } else {
                  ArrayList var7;
                  (var7 = new ArrayList()).add(var2.getRgid());
                  var7.add(var3.getRgid());
                  Iterator var9 = var6.iterator();

                  for (Iterator var10000 = var9; var10000.hasNext(); var10000 = var9) {
                     com.xy.v.Class24 var8 = (com.xy.v.Class24)var9.next();
                     BigDecimal var10 = new BigDecimal(var8.b);

                     int var11;
                     for (int var14 = var11 = 0; var14 < var8.a; var14 = var11) {
                        var11++;
                        var7.add(var10);
                     }
                  }

                  var1.bb(var6);
                  var3.setStatus(1);
                  var1.at(var3.getRgid());
                  var1.getLoginResult().setGold(var1.getLoginResult().getGold().subtract(var5));
                  SuitOperBean var12 = new SuitOperBean();
                  var12.setType(20);
                  var12.setGoods(var7);
                  String var13 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var12));
                  this.za().k(var13);
               }
            }
         }
      }
   }

   public Class105(GameView var1) {
      super(84, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0014+H,HyI8\t/";
      this.yy(-1, 0, 552, 375, com.xy.q.Class30.agh);
      com.xy.w.Class9 var44 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "宱知承逶";
      this.yu(var44, "宝石打造");
      this.lk = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.lk.length; var10000 = var2) {
         com.xy.i.Class19[] var8 = this.lk;
         var10004 = ";\u0004g\u0002gTqI8\t/";
         int var10006 = 171 + var2;
         String var52;
         Class105 var10010;
         if (var2 == 0) {
            var52 = "巤裩夑";
            var52 = "已装备";
            var10010 = this;
         } else if (var2 == 1) {
            var52 = "儑亞";
            var52 = "其他";
            var10010 = this;
         } else {
            var52 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/39.png", 2, var10006, Class49.ck, null, var52, var10010);
         var8[var2] = var10002;
         this.lk[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.lk[var2].setBounds(49 + 65 * var2, 22, 63, 24);
         this.add(this.lk[var2++]);
      }

      this.hi = new com.xy.i.Class19[7];

      for (int var9 = var2 = 0; var9 < this.hi.length; var9 = ++var2) {
         if (var2 == 0) {
            var10004 = "_u\u0003s\u0003!\u0002fBq";
            String var54 = "戴遨";
            this.hi[var2] = new com.xy.i.Class19("sc/e/7.png", 1, 180, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "打造", this);
            this.hi[var2].setBounds(349, 241, 59, 25);
            this.add(this.hi[var2]);
         } else {
            var10004 = "eO9I9\u001e.\u0002fBq";
            this.hi[var2] = new com.xy.i.Class19("sc/e/28.png", 1, 180 + var2, com.xy.q.Class49.bz, null, "", this);
            com.xy.i.Class19 var10 = this.hi[var2];
            String var16;
            if (var2 == 1) {
               var16 = "儏邠";
               var16 = "全部";
            } else if (var2 == 2) {
               var16 = "歊噾";
               var16 = "武器";
            } else if (var2 == 3) {
               var16 = "蠄杅";
               var16 = "衣服";
            } else if (var2 == 4) {
               var16 = "帑孆";
               var16 = "帽子";
            } else if (var2 == 5) {
               var16 = "頞钶";
               var16 = "项链";
            } else if (var2 == 6) {
               var16 = "鞧孆";
               var16 = "鞋子";
            } else {
               var16 = "";
            }

            var10.setText(var16);
            this.hi[var2].setBounds(156, 48 + (var2 - 1) * 18, 68, 18);
            this.add(this.hi[var2]);
         }
      }

      this.ca = new MoneyType();
      String var10012 = "醶铹";
      this.ca.setIdAndKey(1, "金钱");
      this.ac = com.xy.q.Class1.i(363, 188, 104, 19, 10, Color.white, com.xy.q.Class49.w);
      this.ek = com.xy.q.Class1.m(363, 211, 104, 19, 10, Color.white, com.xy.q.Class49.w, this.ca, var1);
      String var51 = "eO9H9\u001d!\u0002fBq";
      this.ac.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var10005 = ";\u0004g\u0003gV\u007fI8\t/";
      this.ek.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ac);
      this.add(this.ek);
      this.ay = new JLabel[4];

      for (int var11 = var2 = 0; var11 < this.ay.length; var11 = var2) {
         this.ay[var2] = com.xy.q.Class1.k(0, 0, 0, 0, Color.white, com.xy.q.Class49.n);
         JLabel var12 = this.ay[var2];
         String var23;
         if (var2 == 0) {
            var23 = "涤老粒単";
            var23 = "消耗精华";
         } else if (var2 == 1) {
            var23 = "q^g^q^q";
            var23 = "99/9999";
         } else if (var2 == 2) {
            var23 = "涤老釽钧";
            var23 = "消耗金钱";
         } else if (var2 == 3) {
            var23 = "抂杁醶铹";
            var23 = "拥有金钱";
         } else {
            var23 = "";
         }

         var12.setText(var23);
         Class105 var13;
         if (var2 == 0) {
            var13 = this;
            this.ay[var2].setBounds(298, 159, 58, 19);
         } else if (var2 == 1) {
            var13 = this;
            this.ay[var2].setBounds(400, 159, 80, 19);
         } else if (var2 == 2) {
            var13 = this;
            this.ay[var2].setBounds(298, 188, 58, 19);
         } else {
            if (var2 == 3) {
               this.ay[var2].setBounds(298, 211, 58, 19);
            }

            var13 = this;
         }

         var13.add(this.ay[var2++]);
      }

      this.awd = new Class84(this);
      this.yc = com.xy.q.Class1.g(49, 68, 180, 277, this.awd, 20);
      this.add(this.yc);
      this.hr = new com.xy.q.Class54(this);
      String var10007 = "_u\u0003r\u0003\"\u0002fBq";
      com.xy.w.Class18 var6 = new com.xy.w.Class18("sc/d/4.png");
      this.hr.setBounds(260, 71, 50, 50);
      var6.setBounds(256, 67, 59, 57);
      this.add(this.hr);
      this.add(var6);
      this.awe = new Class5[3];

      int var3;
      for (int var14 = var3 = 0; var14 < this.awe.length; var14 = var3) {
         this.awe[var3] = new Class5(this);
         this.awe[var3].setBounds(329 + 57 * var3, 67, 52, 70);
         this.add(this.awe[var3++]);
      }

      this.fp = new com.xy.w.Class18[8];

      for (int var15 = var3 = 0; var15 < this.fp.length; var15 = ++var3) {
         this.fp[var3] = new com.xy.w.Class18();
         this.add(this.fp[var3]);
         if (var3 == 0) {
            com.xy.w.Class18 var27 = this.fp[var3];
            String var37 = ";\u0004g\u0003gU}I8\t/";
            var27.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.fp[var3].setBounds(49, 46, 180, 21);
         } else if (var3 == 1) {
            com.xy.w.Class18 var28 = this.fp[var3];
            String var38 = "eO9H9\u001e\"\u0002fBq";
            var28.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fp[var3].setBounds(49, 46, 180, 300);
         } else if (var3 == 2) {
            com.xy.w.Class18 var29 = this.fp[var3];
            String var39 = ";\u0004g\u0003gV\u007fI8\t/";
            var29.mt(com.xy.w.Class16.m("sc/d/17.png", 5, 5, 5, 5, false));
            this.fp[var3].setBounds(246, 58, 260, 80);
         } else if (var3 == 3) {
            com.xy.w.Class18 var30 = this.fp[var3];
            String var40 = "!\u0018\"";
            var30.gt(com.xy.w.Class15.d("744"));
            this.fp[var3].setBounds(366, 157, 23, 23);
         } else if (var3 == 4) {
            com.xy.w.Class18 var31 = this.fp[var3];
            String var41 = "\u0014+H,H|I8\t/";
            var31.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
            this.fp[var3].setBounds(362, 153, 31, 31);
         } else if (var3 == 5) {
            com.xy.w.Class18 var49 = this.fp[var3];
            var10005 = "eO9H9\u001d/\u0002fBq";
            var49.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.fp[var3].setBounds(245, 282, 258, 54);
            this.awf = new com.xy.q.Class13(this, 5, 1, 51, 51, 0, 0, 246, 284);
            var10003 = ";\u0004g\u0003gVpI8\t/";
            this.awf.gt(com.xy.w.Class16.c("sc/d/18.png"));
            this.add(this.awf);
         } else if (var3 == 6) {
            com.xy.w.Class18 var32 = this.fp[var3];
            String var42 = "eO9H9\u001b\"\u0002fBq";
            var32.mt(com.xy.w.Class16.m("sc/d/74.png", 16, 16, 16, 16, false));
            this.fp[var3].setBounds(228, 46, 300, 300);
         } else if (var3 == 7) {
            com.xy.w.Class18 var33 = this.fp[var3];
            String var43 = ";\u0004g\u0003gU|I8\t/";
            var33.mt(com.xy.w.Class16.m("sc/d/24.png", 290, 290, 2, 2, false));
            this.fp[var3].setBounds(231, 49, 294, 294);
         }
      }
   }

   public void bb(Goodstable var1) {
      Goodstable var2;
      if ((var2 = (Goodstable)this.hr.jx()) != null) {
         int var3;
         if ((var3 = GoodType.ai(GoodType.r(var2.getType()), var1.getType()) - 1) != -1) {
            if (Class5.fa(this.awe[var3]) == 1) {
               String var7 = "嶕戛遇训簜埃寺瞻";
               this.afx.dp("已打造该类型宝石");
            } else {
               int var4;
               for (int var10000 = var4 = 0; var10000 < this.awe.length; var10000 = ++var4) {
                  if (Class5.fa(this.awe[var4]) != 1) {
                     this.awe[var4].fd(0, null);
                  }
               }

               this.awe[var3].fd(0, var1);
               var4 = MsgUntil.getGoodLvl(var1.getValue());
               JLabel var6 = this.ay[1];
               StringBuilder var10001 = new StringBuilder(String.valueOf(var4 <= 4 ? 1 : var4 - 3));
               String var10002 = "9";
               var6.setText(var10001.append("/").append(this.yx().getGoodNum(new BigDecimal(81095))).toString());
               this.bs = new BigDecimal(5000000 + var4 * 1000000);
               com.xy.q.Class49.b(this.ac, this.bs.longValue());
            }
         }
      }
   }

   public void gw(Object var1) {
      Class5 var2;
      if (Class5.fa(var2 = (Class5)var1) == 1) {
         RoleData var3 = this.yx();
         Goodstable var4 = (Goodstable)this.hr.jx();
         Goodstable var5 = (Goodstable)Class5.fc(var2).jx();
         if (var4 != null) {
            var4 = var3.getGood(var4.getRgid());
         }

         if (var5 != null) {
            var5 = var3.getGood(var5.getRgid());
         }

         if (var4 != null && var5 != null) {
            StringBuffer var6;
            StringBuffer var10000 = var6 = new StringBuffer();
            String var10001 = "D\u0011伇砦寽苹赞k5h";
            var10000.append("#Y你确定花费#R ");
            var6.append(MsgUntil.getGoodLvl(var5.getValue()) * 3200000);
            String var10003 = "\f5u采钝拐協诳宱知吻)";
            var6.append(" #Y金钱拆卸该宝石吗?");
            GameView var7 = this.afx;
            StringBuilder var10007 = new StringBuilder().append(var4.getRgid());
            String var10008 = "4";
            var7.dm(new ConfirmBean(19, var10007.append("|").append(var5.getRgid()).toString(), var6.toString()));
         }
      }
   }

   public void amf(Class50 var1) {
      int var2 = 0;
      int var3 = this.awd.getComponentCount();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         Class50 var4;
         if ((var4 = (Class50)this.awd.getComponent(var2)).isVisible()) {
            if (var4 == var1) {
               if (awc == null) {
                  awc = BorderFactory.createLineBorder(Color.YELLOW, 2);
               }

               var4.setBorder(awc);
            } else {
               var4.setBorder(BorderFactory.createEmptyBorder());
            }
         }
      }

      this.bs = null;
      this.ac.setText(null);
      this.ay[1].setText(null);
      int var17 = 0;
      this.hr.gs(0, null);

      for (int var11 = 0; var17 < this.awe.length; var17 = var11) {
         Class5 var18 = this.awe[var11];
         var11++;
         var18.fd(0, null);
      }

      this.awe[2].setVisible(false);
      RoleData var12 = this.yx();
      Goodstable var13 = var1 != null ? (Goodstable)Class50.vi(var1)[0].jx() : null;
      if (var13 != null) {
         var13 = var12.getGood(var13.getRgid());
      }

      if (var13 == null) {
         this.awf.ol(-1L);
      } else {
         this.hr.gs(1, var13);
         int var14 = GoodType.r(var13.getType());
         int var5 = 0;
         int var6 = var14 == 0 ? 3 : 2;

         for (int var19 = var5; var19 < var6; var19 = ++var5) {
            if (var14 == 0) {
               JLabel var20 = Class5.fb(this.awe[var5]);
               String var28;
               if (var5 == 0) {
                  var28 = "赲炢知";
                  var28 = "赤炎石";
               } else if (var5 == 1) {
                  var28 = "絣炸瞻";
                  var28 = "紫烟石";
               } else {
                  var28 = "孂雬知";
                  var28 = "孔雀石";
               }

               var20.setText(var28);
            } else if (var14 == 1) {
               JLabel var21 = Class5.fb(this.awe[var5]);
               String var32;
               if (var5 == 0) {
                  var32 = "葵晸瞻";
                  var32 = "落星石";
               } else {
                  var32 = "芏蓥知";
                  var32 = "芙蓉石";
               }

               var21.setText(var32);
            } else if (var14 == 2) {
               JLabel var22 = Class5.fb(this.awe[var5]);
               String var35;
               if (var5 == 0) {
                  var35 = "泘陔瞻";
                  var35 = "沐阳石";
               } else {
                  var35 = "芏蓥知";
                  var35 = "芙蓉石";
               }

               var22.setText(var35);
            } else if (var14 == 3) {
               JLabel var23 = Class5.fb(this.awe[var5]);
               String var38;
               if (var5 == 0) {
                  var38 = "葵晸瞻";
                  var38 = "落星石";
               } else {
                  var38 = "沆队知";
                  var38 = "沐阳石";
               }

               var23.setText(var38);
            } else if (var14 == 5) {
               JLabel var24 = Class5.fb(this.awe[var5]);
               String var41;
               if (var5 == 0) {
                  var41 = "瑁瓤瞻";
                  var41 = "琉璃石";
               } else {
                  var41 = "寄屝知";
                  var41 = "寒山石";
               }

               var24.setText(var41);
            }
         }

         if (var14 == 0) {
            this.awe[2].setVisible(true);
         }

         Goodstable var25;
         if (var14 == 0) {
            var25 = var13;
            this.awf.ol(746L, 755L, 767L);
         } else if (var14 == 1) {
            var25 = var13;
            this.awf.ol(749L, 761L);
         } else if (var14 == 2) {
            var25 = var13;
            this.awf.ol(749L, 764L);
         } else if (var14 == 3) {
            var25 = var13;
            this.awf.ol(761L, 764L);
         } else {
            if (var14 == 5) {
               this.awf.ol(752L, 758L);
            }

            var25 = var13;
         }

         String var26 = var25.getValue();
         String var43 = "寺瞻尹息";
         String var15;
         if ((var15 = GoodType.getExtra(var26, "宝石属性")) != null) {
            var43 = "0";
            String[] var16 = var15.split("&");

            int var7;
            for (int var27 = var7 = 1; var27 < var16.length; var27 = ++var7) {
               BigDecimal var8 = new BigDecimal(var16[var7]);
               Goodstable var9;
               int var10;
               if ((var9 = var12.getGoodEquip(var8)) != null && (var10 = GoodType.ai(var14, var9.getType())) != 0) {
                  this.awe[var10 - 1].fd(1, var9);
               }
            }
         }
      }
   }
}
