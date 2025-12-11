package com.xy.a.q;

import com.xy.bean.QuackGameBean;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class101 extends com.xy.q.Class30 {
   private com.xy.q.Class14 asp;
   private int xt;
   private String asq;
   private int[] asr;
   private int gs;
   private JLabel[] ass;
   private Class14[] ast;
   private com.xy.q.Class52 apv;
   private int gw;
   private String[] afv;
   private boolean ak;
   private boolean al;
   private com.xy.i.Class19[] vv;
   private com.xy.q.Class54 bw;
   private BigDecimal ee;
   private com.xy.w.Class18[] fd;
   private BigDecimal gi;
   private com.xy.q.Class54[] aax;
   private List<com.xy.i.Class19> iv;
   private MoneyType ca;

   public void aks(int var1, int var2, String var3, boolean var4) {
      try {
         com.xy.i.Class19 var5 = var1 < this.iv.size() ? this.iv.get(var1) : null;
         if (var5 == null) {
            String var10002 = ">MbKb\u001du\u0000=@*";
            var5 = new com.xy.i.Class19("sc/e/38.png", 2, 230, com.xy.q.Class49.bx, com.xy.q.Class49.bv, "", this);
            this.iv.add(var5);
            this.add(var5, 0);
         }

         var5.setText(var3);
         var5.gw(var2);
         var5.setKeep(var4);
         var5.setBounds(61 + 102 * var1, 27, 95, 33);
         var5.setVisible(true);
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   // $VF: synthetic method
   static void akt(Class101 var0, boolean var1) {
      var0.ak = var1;
   }

   public void y(int var1) {
      if (var1 == 231) {
         if (!this.afx.ah()) {
            List var9;
            if ((var9 = this.yt().bg().getNpcShopMap().get(String.valueOf(499 + this.gs))) != null) {
               ((Class82)this.zc().j(88)).adn(var9, this.asq);
               this.zc().b(88);
            }
         }
      } else {
         if (var1 == 232 || var1 == 233) {
            if (this.afx.ah()) {
               return;
            }

            if (this.afv != null) {
               String var21 = "乻主歐奭邌迣泐朲拌宷ｽ诌笸主乺吜ｰＺ";
               this.afx._do("上一次奖都还没有抽完，请等一下吧！！");
               return;
            }

            this.h();
            RoleData var2 = this.yx();
            int var3 = var1 == 232 ? 10 : 11;
            var3 %= 10;
            Goodstable var4 = this.ee != null ? var2.bk(this.ee) : null;
            if (this.ak) {
               if (this.gi == null) {
                  this.gi = new BigDecimal(0);
               }

               int var5 = var3 == 0 ? 1 : 10;
               if ((var5 = var5 - (var4 != null ? var4.getUsetime() : 0)) > 0) {
                  BigDecimal var6 = new BigDecimal(this.gi.longValue() * var5);
                  if (this.gw == 0) {
                     if (var2.getLoginResult().getCodecard().compareTo(var6) < 0) {
                        String var10001 = "伭沏杄趝奒皪五玧介Ｏｌ";
                        this.afx.dp("你没有足够的仙玉了！！");
                        return;
                     }
                  } else if (this.gw == 1) {
                     if (var2.getLoginResult().getGold().compareTo(var6) < 0) {
                        String var15 = "休沚杸趈奮皿奖详幰亽ｰＺ";
                        this.afx.dp("你没有足够的大话币了！！");
                        return;
                     }
                  } else if (this.gw == 2 && var2.getLoginResult().getSavegold().compareTo(var6) < 0) {
                     String var16 = "伭沏杄趝奒皪纜玧介Ｏｌ";
                     this.afx.dp("你没有足够的绑玉了！！");
                     return;
                  }
               }
            } else if (var4 == null || var4.getUsetime() < (var3 == 0 ? 1 : 10)) {
               String var20 = "休沚杸抆大刃ｽ忐及贖丁吜ｰＺ";
               this.afx.dp("你没有抽奖券，快去购买吧！！");
               return;
            }

            if (var2.getGoodPackSum(-1L, new BigDecimal(-1), var3 == 0 ? 1 : 12) < (var3 == 0 ? 1 : 12)) {
               String var19 = "伭胢午巜溬";
               this.afx._do("你背包已满");
               return;
            }

            StringBuffer var12;
            StringBuffer var10000 = var12 = new StringBuffer();
            String var17 = "x";
            var10000.append("C");
            var12.append(this.gs);
            String var10006 = "1";
            var12.append("|" + var3);
            String var10003 = "G";
            var12.append("|" + (this.ak ? 1 : 0));
            if (var4 != null) {
               int var7 = 0;

               int var8;
               for (int var14 = var8 = 0; var14 < var4.getUsetime() && var8 < (var3 == 0 ? 1 : 10); var14 = var8) {
                  var7++;
                  var10003 = "1";
                  StringBuilder var18 = new StringBuilder("|");
                  BigDecimal var10002 = var4.getRgid();
                  var8++;
                  var12.append(var18.append(var10002).toString());
               }

               this.asp.setText(String.valueOf(var4.getUsetime() - var7));
            }

            String var13 = Agreement.getSendTextAES("getfivemsg", var12.toString());
            this.za().k(var13);
            this.al = true;
         }
      }
   }

   @Override
   public boolean ah() {
      if (this.afv != null) {
         String var10002 = "歘坙抆大Ｗ讆勄剶捙霓杄ｰＺ";
         this.afx._do("正在抽奖，请勿切换面板！！");
         return false;
      } else {
         return super.ah();
      }
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.ast.length; var10000 = var1) {
         this.ast[var1].cb(null, 0);
         this.asr[var1++] = 0;
      }

      this.xt = 0;
   }

   public void tm(QuackGameBean var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.iv.size(); var10000 = var2) {
         Object var16 = this.iv.get(var2);
         var2++;
         ((com.xy.i.Class19)var16).setVisible(false);
      }

      String var17 = var1.getPetmsg();
      String var10001 = "r1";
      String[] var3 = var17.split("\\|");
      int var4 = 0;
      int var18 = 0;
      this.gs = 1;
      this.asq = null;

      for (int var5 = 0; var18 < var3.length; var18 = ++var5) {
         var17 = var3[var5];
         var10001 = "b";
         if (var17.startsWith("Y")) {
            var17 = var3[var5];
            var10001 = "`";
            int var6 = var17.indexOf("-");
            StringBuilder var10006 = new StringBuilder(String.valueOf(var3[var5].substring(var6 + 1)));
            String var10007 = "禞刽";
            this.asq = var10006.append("积分").toString();
            this.gs = Integer.parseInt(var3[var5].substring(1, var6));
            String var7 = null;
            Class101 var22;
            if (this.gs == 1) {
               var17 = "价珄抓夛";
               var7 = "仙玉抽奖";
               var22 = this;
            } else if (this.gs == 2) {
               var17 = "纠玲拌奭";
               var7 = "绑玉抽奖";
               var22 = this;
            } else {
               if (this.gs == 3) {
                  var17 = "釿幌抓夛";
                  var7 = "金币抽奖";
               }

               var22 = this;
            }

            var22.aks(var5, this.gs, var7, true);
         } else if (var3[var5].startsWith("N")) {
            var10001 = var3[var5];
            String var10002 = "\u0016";
            int var10 = var10001.indexOf("-");
            var10 = Integer.parseInt(var3[var5].substring(1, var10));
            String var14 = null;
            Class101 var26;
            if (var10 == 1) {
               var17 = "价珄抓夛";
               var14 = "仙玉抽奖";
               var26 = this;
            } else if (var10 == 2) {
               var17 = "纠玲拌奭";
               var14 = "绑玉抽奖";
               var26 = this;
            } else {
               if (var10 == 3) {
                  var17 = "釿幌抓夛";
                  var14 = "金币抽奖";
               }

               var26 = this;
            }

            var26.aks(var5, var10, var14, false);
         } else {
            Goodstable var12;
            if ((var12 = this.yt().ay(new BigDecimal(var3[var5]))) != null) {
               com.xy.q.Class54 var29 = this.aax[var4];
               var4++;
               var29.gs(1, var12);
            }
         }
      }

      this.ca.setIdAndKey(0, this.asq);
      this.apv.l();
      this.gi = var1.getMoney();
      this.gw = 0;
      this.ee = null;
      Class101 var30;
      if (var1.getPetmsg2() != null) {
         var10001 = var1.getPetmsg2();
         String var40 = "G";
         int var8 = var10001.indexOf("|");
         this.gw = Integer.parseInt(var1.getPetmsg2().substring(0, var8));
         String var13 = var1.getPetmsg2().substring(var8 + 1, var1.getPetmsg2().length());
         var40 = "@8B!";
         this.ee = !var13.equals("null") ? new BigDecimal(var13) : null;
         StringBuffer var15 = new StringBuffer();
         var40 = "弢牒咰丶跂旍淹耬";
         var15.append("当物品不足时消耗");
         var15.append(this.gi);
         if (this.gw == 0) {
            var10001 = "价珄";
            var10001 = "仙玉";
         } else if (this.gw == 1) {
            var10001 = "夜讬帺";
            var10001 = "大话币";
         } else {
            var10001 = "绿珄";
            var10001 = "绑玉";
         }

         var15.append(var10001);
         var40 = "互曄";
         var15.append("代替");
         this.ass[2].setText(var15.toString());
         var30 = this;
      } else {
         var30 = this;
         JLabel var39 = this.ass[2];
         String var10004 = "彽爤哯乀趝斻润聚";
         StringBuilder var44 = new StringBuilder("当物品不足时消耗").append(var1.getMoney());
         String var10003 = "亨玲互曄";
         var39.setText(var44.append("仙玉代替").toString());
      }

      Goodstable var9 = var30.ee != null ? this.yt().ay(this.ee) : null;
      if (var9 != null) {
         this.bw.gs(1, var9);
         this.asp.setText(String.valueOf(this.yx().getGoodNum(this.ee)));
      } else {
         this.bw.gs(0, var9);
         this.asp.setText(null);
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.al) {
         Class44.zk.j(com.xy.v.Class22.l(), 0);

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.ast.length; var10000 = ++var2) {
            if (this.asr[var2] == 1) {
               Class44.zk
                  .ab(var1, this.ast[var2].getX() + Class14.jr(this.ast[var2]).getX() + 3, this.ast[var2].getY() + Class14.jr(this.ast[var2]).getY() + 2);
            }
         }
      }

      if (this.afv != null) {
         if (this.xt % 15 == 0) {
            int var6;
            label31: {
               int var5 = this.xt / 15;
               String[] var3 = this.afv[var5].split("_");
               Goodstable var4;
               if ((var4 = this.yt().ay(new BigDecimal(var3[0]))) != null) {
                  this.ast[var5].cb(var4, Integer.parseInt(var3[1]));
                  this.asr[var5] = Integer.parseInt(var3[2]);
                  if (this.asr[var5] == 1) {
                     var6 = var5;
                     GameView var10001 = this.afx;
                     String var10004 = "佛菆徬价敋醾丁";
                     StringBuilder var10002 = new StringBuilder("你获得了数量为").append(var3[1]);
                     String var10003 = "盉";
                     var10001._do(var10002.append("的").append(var4.getGoodsname()).toString());
                     break label31;
                  }
               } else {
                  System.out.println(var3[0]);
               }

               var6 = var5;
            }

            if (var6 >= this.afv.length - 1) {
               this.afv = null;
            }
         }

         this.xt++;
      }
   }

   public void tg(String[] var1) {
      this.afv = var1;
   }

   public void g(int var1) {
      if (this.afv == null) {
         String var10003 = "m\u000e";
         String var2 = Agreement.getSendTextAES("getfivemsg", "CC" + var1);
         this.za().k(var2);
         this.h();
         this.al = false;
      } else {
         String var10001 = "歘坙抆大Ｗ讆勄剶捙霓杄ｰＺ";
         this.afx._do("正在抽奖，请勿切换面板！！");
      }
   }

   public Class101(GameView var1) {
      super(87, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "].\u0001)\u0001|\u0000=@*";
      this.gs = 1;
      this.gw = 0;
      this.ak = true;
      this.al = false;
      this.yy(-1, 0, 653, 479, com.xy.q.Class30.agh);
      com.xy.w.Class9 var36 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "\u001b拌\u001b大\u001b";
      this.yu(var36, " 抽 奖 ");
      this.iv = new ArrayList<>();
      this.asr = new int[12];
      this.vv = new com.xy.i.Class19[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.vv.length; var10000 = var2) {
         com.xy.i.Class19[] var7 = this.vv;
         String var10004 = ">MbKb\u001cu\u0000=@*";
         int var37 = 231 + var2;
         String var40;
         Class101 var10010;
         if (var2 == 0) {
            var40 = "禞刽儠捙";
            var40 = "积分兑换";
            var10010 = this;
         } else if (var2 == 1) {
            var40 = "抓夛";
            var40 = "抽奖";
            var10010 = this;
         } else if (var2 == 2) {
            var40 = "匰迥拌奭";
            var40 = "十连抽奖";
            var10010 = this;
         } else if (var2 == 3) {
            var40 = "ｒ";
            var40 = "？";
            var10010 = this;
         } else {
            var40 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/28.png", 1, var37, Class49.bz, null, var40, var10010);
         var7[var2] = var10002;
         this.vv[var2].setBounds(538, 32, 68, 17);
         Class101 var8;
         if (var2 == 1) {
            var8 = this;
            com.xy.i.Class19 var32 = this.vv[var2];
            String var10005 = "\u0002X^^^\f_K\u001f\\";
            var32.setImage("sc/e/7.png");
            this.vv[var2].setBounds(289, 394, 59, 25);
            this.vv[var2].setForeground(Color.black);
            this.vv[var2].setFont(com.xy.q.Class49.ch);
         } else if (var2 == 2) {
            var8 = this;
            com.xy.i.Class19 var33 = this.vv[var2];
            String var35 = ">MbKb\u001c{\u0000=@*";
            var33.setImage("sc/e/26.png");
            this.vv[var2].setBounds(359, 394, 99, 25);
            this.vv[var2].setForeground(Color.black);
            this.vv[var2].setFont(com.xy.q.Class49.ch);
         } else {
            if (var2 == 3) {
               com.xy.i.Class19 var10001 = this.vv[var2];
               String var20 = "H\u0012\u0014\u0014\u0014E\u000b_K\u001f\\";
               var10001.setImage("sc/e/40.png");
               this.vv[var2].setBounds(603, 195, 18, 18);
            }

            var8 = this;
         }

         var8.add(this.vv[var2++]);
      }

      this.aax = new com.xy.q.Class54[5];

      for (int var9 = var2 = 0; var9 < this.aax.length; var9 = var2) {
         this.aax[var2] = new com.xy.q.Class54(this);
         this.aax[var2].setBounds(302 + var2 * 65, 91, 50, 50);
         this.add(this.aax[var2++]);
      }

      this.ass = new JLabel[3];

      for (int var10 = var2 = 0; var10 < this.ass.length; var10 = ++var2) {
         this.ass[var2] = com.xy.q.Class1.k(386, 31, 72, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var11 = this.ass[var2];
         String var16;
         if (var2 == 0) {
            var16 = "彽刀私剋";
            var16 = "当前积分";
         } else if (var2 == 1) {
            var16 = "抔朲爘哺";
            var16 = "拥有物品";
         } else if (var2 == 2) {
            var16 = "弞片和丣跾旘淅耹{\u0018{价珄仍暲";
            var16 = "当物品不足时消耗666仙玉代替";
         } else {
            var16 = "";
         }

         var11.setText(var16);
         this.ass[var2].setHorizontalAlignment(10);
         this.add(this.ass[var2]);
         if (var2 == 1) {
            this.ass[var2].setFont(com.xy.q.Class49.n);
            this.ass[var2].setBounds(289, 372, 60, 19);
         } else if (var2 == 2) {
            this.ass[var2].setFont(com.xy.q.Class49.n);
            this.ass[var2].setBounds(309, 422, 300, 19);
         }
      }

      this.ca = new MoneyType();
      String var10013 = "醠钊";
      this.ca.setIdAndKey(1, "金钱");
      this.apv = com.xy.q.Class1.m(456, 31, 150, 19, 10, Color.white, com.xy.q.Class49.w, this.ca, var1);
      this.asp = com.xy.q.Class1.i(346, 372, 112, 19, 10, Color.white, com.xy.q.Class49.w);
      var10007 = ">MbJb\u001fz\u0000=@*";
      this.apv.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      var10006 = "H\u0012\u0014\u0015\u0014@\f_K\u001f\\";
      this.asp.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.apv.n(2);
      this.add(this.asp);
      this.add(this.apv);
      this.bw = new com.xy.q.Class54(this);
      this.bw.setBounds(212, 381, 43, 43);
      this.add(this.bw);
      this.ast = new Class14[12];

      for (int var12 = var2 = 0; var12 < this.ast.length; var12 = var2) {
         this.ast[var2] = new Class14(this);
         this.ast[var2].setBounds(75 + var2 % 6 * 90, 215 + var2 / 6 * 79, 75, 80);
         this.add(this.ast[var2++]);
      }

      this.fd = new com.xy.w.Class18[5];

      for (int var13 = var2 = 0; var13 < this.fd.length; var13 = var2) {
         this.fd[var2] = new com.xy.w.Class18();
         Class101 var14;
         if (var2 == 0) {
            var14 = this;
            com.xy.w.Class18 var24 = this.fd[var2];
            String var10003 = ">MbJb\u001dx\u0000=@*";
            var24.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
            this.fd[var2].setBounds(31, 41, 596, 20);
         } else if (var2 == 1) {
            var14 = this;
            com.xy.w.Class18 var25 = this.fd[var2];
            String var29 = "\u0002X^Y^hF\u0002_K\u001f\\";
            var25.dp("sc/b/S79.png");
            this.fd[var2].setBounds(48, 69, 580, 119);
         } else if (var2 == 2) {
            var14 = this;
            com.xy.w.Class18 var26 = this.fd[var2];
            String var30 = "].\u0001)\u0001y\u0000=@*";
            var26.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
            this.fd[var2].setBounds(204, 373, 66, 65);
         } else if (var2 == 3) {
            var14 = this;
            com.xy.w.Class18 var31 = this.fd[var2];
            String var34 = "H\u0012\u0014\u0014\u0014B\u000b_K\u001f\\";
            var31.dp("sc/e/30.png");
            this.fd[var2].setBounds(288, 423, 17, 17);
            this.fd[var2].addMouseListener(new Class52(this));
         } else {
            if (var2 == 4) {
               com.xy.w.Class18 var19 = this.fd[var2];
               String var27 = ">MbJb\u001d{\u0000=@*";
               var19.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.fd[var2].setBounds(47, 191, 581, 265);
            }

            var14 = this;
         }

         var14.add(this.fd[var2++]);
      }

      this.h();
   }

   @Override
   public void l() {
      super.l();
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] aku(Class101 var0) {
      return var0.fd;
   }

   // $VF: synthetic method
   static boolean akv(Class101 var0) {
      return var0.ak;
   }
}
