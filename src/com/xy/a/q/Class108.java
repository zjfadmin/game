package com.xy.a.q;

import com.xy.bean.FriendBean;
import com.xy.bean.GoodTrans2;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Class108 extends com.xy.q.Class30 {
   private com.xy.q.Class36 aww;
   private com.xy.q.Class52 awx;
   private int gs;
   private com.xy.q.Class54[] aft;
   private com.xy.q.Class7 awy;
   private com.xy.q.Class27 awz;
   private com.xy.i.Class19 axa;
   private MoneyType br;
   private Class89 axb;
   private com.xy.w.Class18[] iq;
   private com.xy.i.Class19[] hi;
   private com.xy.i.Class3[] axc;
   private JLabel[] ch;
   private Class89 axd;
   private com.xy.q.Class21 axe;
   private JScrollPane i;
   private com.xy.q.Class18 axf;
   private com.xy.w.Class18[] fp;
   private com.xy.q.Class14[] axg;

   public boolean du(long var1, JTextField var3) {
      return this.axd != null && Class89.j(this.axd) == 0;
   }

   // $VF: synthetic method
   static com.xy.q.Class14[] amx(Class108 var0) {
      return var0.axg;
   }

   public void cp(int var1, String var2) {
      Class89 var3 = null;
      Class89 var4 = null;
      int var10000;
      if (Class89.b(this.axb).equals(var2)) {
         var3 = this.axb;
         var4 = this.axd;
         var10000 = var1;
      } else {
         if (this.yx().getLoginResult().getRolename().equals(var2)) {
            var3 = this.axd;
            var4 = this.axb;
         }

         var10000 = var1;
      }

      if (var10000 == 3) {
         var3.e(1);
      } else {
         if (var1 == 4) {
            var3.e(0);
            if (Class89.j(var4) == 2) {
               var4.e(1);
               return;
            }
         } else if (var1 == 5) {
            var3.e(2);
         }
      }
   }

   public void h() {
      if (!this.afx.ah()) {
         if (Class89.j(this.axd) != 0 && Class89.j(this.axb) != 0) {
            if (Class89.c(this.axb).getGoods() != null && this.yx().getGoodPackSum(-1L, new BigDecimal(-1), 999) < Class89.c(this.axb).getGoods().size()) {
               String var5 = "胒匍专趻";
               this.afx._do("背包不足");
            } else {
               if (Class89.c(this.axb).getPets() != null) {
                  int var1 = Class89.c(this.axb).getPets().size() + this.yx().pets.size();
                  if (Class89.c(this.axd).getPets() != null) {
                     var1 -= Class89.c(this.axd).getPets().size();
                  }

                  if (var1 > 21) {
                     String var4 = "厑唚儀栂嬭丳跎";
                     this.afx._do("召唤兽格子不足");
                     return;
                  }
               }

               String var3 = "=";
               String var2 = Agreement.getSendTextAES("TransState", "5");
               this.za().k(var2);
            }
         } else {
            String var10001 = "厱文邀锿寧扳肀炇円硐寧";
            this.afx._do("双方都锁定才能点击确定");
         }
      }
   }

   @Override
   public boolean ah() {
      if (this.axb != null && Class89.c(this.axb) != null) {
         String var6 = ":";
         String var3 = Agreement.getSendTextAES("TransState", "2");
         this.za().k(var3);
         return false;
      } else {
         if (this.axd != null) {
            Class89.d(this.axd, null);
         }

         if (this.axb != null) {
            Class89.d(this.axb, null);
         }

         int var1;
         for (int var10000 = var1 = 0; var10000 < this.aft.length; var10000 = var1) {
            this.aft[var1].gs(0, null);
            this.aft[var1++].setVisible(true);
         }

         for (int var4 = var1 = 0; var4 < this.axg.length; var4 = var1) {
            this.axg[var1++].setText(null);
         }

         return super.ah();
      }
   }

   public void amy(RolePet var1, MouseEvent var2) {
      if (Class89.j(this.axd) == 0) {
         RoleSummoning var3 = var1 != null ? var1.getPet() : null;
         if (var3 != null) {
            if ((var3.getPetlock() >>> 0 & 1) == 1) {
               GameView var11 = this.afx;
               String var20 = "厑唚儀";
               StringBuilder var16 = new StringBuilder("召唤兽").append(var3.getSummoningname());
               String var18 = "巺袵动锟＄专叧人昛？）";
               var11.dp(var16.append("已被加锁，不可交易！！").toString());
            } else if ((var3.getPetlock() >>> 1 & 1) == 1) {
               GameView var10 = this.afx;
               String var19 = "厑唚儀";
               StringBuilder var15 = new StringBuilder("召唤兽").append(var3.getSummoningname());
               String var17 = "巬袣禟京昍＄专叧人昛？）";
               var10.dp(var15.append("已被禁交易，不可交易！！").toString());
            } else {
               int var4;
               if ((var4 = Integer.parseInt(var3.getSummoningid())) >= 100000 && var4 <= 200000) {
                  GameView var10000 = this.afx;
                  String var10003 = "厑唚儀";
                  StringBuilder var14 = new StringBuilder("召唤兽").append(var3.getSummoningname());
                  String var10002 = "巬袣禟京昍＄专叧人昛？）";
                  var10000.dp(var14.append("已被禁交易，不可交易！！").toString());
               } else if (com.xy.v.Class12.x(this.yx().getLoginResult().getSummoning_id(), var3.getSid())) {
                  String var13 = "诛厑唚儀圖县戦乐Ｒ买发仙昭ｼ";
                  this.afx.dp("该召唤兽在参战中，不可交易！");
               } else if (this.yx().getPetMount(var3.getSid()) != null) {
                  String var12 = "近叴古唺兵袵箩刨严２丅叱京昍）？）";
                  this.afx._do("这只召唤兽被管制中，不可交易！！！");
               } else {
                  int var5 = Class89.c(this.axd).getPets() != null ? Class89.c(this.axd).getPets().size() : 0;
                  boolean var6 = Class89.c(this.axd).setPet(var3);
                  int var7 = Class89.c(this.axd).getPets() != null ? Class89.c(this.axd).getPets().size() : 0;
                  if (var5 == var7) {
                     String var10001 = "栂嬭巌溜";
                     this.afx._do("格子已满");
                  } else {
                     GoodTrans2 var8 = new GoodTrans2();
                     var8.setI(var6);
                     var8.setPet(var3);
                     String var9 = Agreement.getSendTextAES("TransGood", com.xy.v.Class31.a().toJson(var8));
                     this.za().k(var9);
                     this.and(var8);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.axd != null) {
         this.axd.f(var1);
      }

      if (this.axb != null) {
         this.axb.f(var1);
      }
   }

   public void cr(boolean var1) {
      if (this.axd != null && Class89.c(this.axd) != null) {
         if (var1) {
            RoleData var2 = this.yx();
            List var3 = Class89.c(this.axd).getGoods();
            List var4 = Class89.c(this.axd).getPets();
            List var5 = Class89.c(this.axd).getLingbaos();
            int var6 = 0;
            int var7 = var3 != null ? var3.size() : 0;

            for (int var10000 = var6; var10000 < var7; var10000 = ++var6) {
               Goodstable var8 = (Goodstable)var3.get(var6);
               Goodstable var9;
               Goodstable var29 = var9 = var2.getGood(var8.getRgid());
               var29.n(var8.getUsetime());
               if (var29.getUsetime() <= 0) {
                  var2.ag(var9.getRgid());
               }
            }

            var6 = 0;
            var7 = var4 != null ? var4.size() : 0;

            for (int var30 = var6; var30 < var7; var30 = ++var6) {
               RoleSummoning var23 = (RoleSummoning)var4.get(var6);
               RolePet var28;
               if ((var28 = var2.getRolePet(var23.getSid().longValue())) != null) {
                  var2.pets.remove(var28);
               }

               if (var2.bh(var28.getId())) {
                  var2.setChosePetId(null);
               }
            }

            var6 = 0;
            var7 = var5 != null ? var5.size() : 0;

            for (int var31 = var6; var31 < var7; var31 = ++var6) {
               Lingbao var24;
               Lingbao var10001 = var24 = (Lingbao)var5.get(var6);
               var2.ar(var24);
               var2.lingbaoMap.remove(var24.getBaoid());
               var2.lingbaoList.remove(var24.getBaoid());
               if (var2.u(var10001.getBaoid())) {
                  var2.setChoseBaoId(null);
               }
            }

            var3 = Class89.c(this.axb).getGoods();
            var4 = Class89.c(this.axb).getPets();
            var5 = Class89.c(this.axb).getLingbaos();
            if (Class89.c(this.axb).getMoney() != null && Class89.c(this.axb).getMoney().longValue() > 0L) {
               String var10003 = "伝莉忪釯铌\u001d\u001e\u000eMx;x;";
               this.afx._do("你获得金钱#c00FFFF" + Class89.c(this.axb).getMoney());
            }

            var6 = 0;
            var7 = var3 != null ? var3.size() : 0;

            for (int var32 = var6; var32 < var7; var32 = var6) {
               Goodstable var25 = (Goodstable)var3.get(var6);
               GameView var33 = this.afx;
               String var45 = "佨莩徟=O";
               StringBuilder var38 = new StringBuilder("你获得#G").append(var25.getUsetime());
               String var10002 = "^g乗\u001d\u001e\u000eMx;x;";
               var38 = var38.append("#Y个#c00FFFF");
               var10002 = var25.getGoodsname();
               var6++;
               var33._do(var38.append(var10002).toString());
            }

            var6 = 0;
            var7 = var4 != null ? var4.size() : 0;

            for (int var34 = var6; var34 < var7; var34 = var6) {
               RoleSummoning var26 = (RoleSummoning)var4.get(var6);
               GameView var35 = this.afx;
               String var46 = "佾莿徉古唺兵=k.8XNXN";
               StringBuilder var40 = new StringBuilder("你获得召唤兽#c00FFFF");
               String var43 = var26.getSummoningname();
               var6++;
               var35._do(var40.append(var43).toString());
            }

            var6 = 0;
            var7 = var5 != null ? var5.size() : 0;

            for (int var36 = var6; var36 < var7; var36 = var6) {
               Lingbao var27 = (Lingbao)var5.get(var6);
               GameView var37 = this.afx;
               String var47 = "伝莉忪灋寠\u001d\u001e\u000eMx;x;";
               StringBuilder var41 = new StringBuilder("你获得灵宝#c00FFFF");
               String var44 = var27.getBaoname();
               var6++;
               var37._do(var41.append(var44).toString());
            }
         }

         Class89.d(this.axd, null);
         Class89.d(this.axb, null);
         this.zc().f(this.lj());
      }
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         long var4 = this.yx().getLoginResult().getGold().longValue();
         return var1 > var4 ? var4 : null;
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] amz(Class108 var0) {
      return var0.fp;
   }

   // $VF: synthetic method
   static Class89 ana(Class108 var0) {
      return var0.axd;
   }

   public Class108(GameView var1) {
      super(14, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "mk1l190xpo";
      this.yy(-1, 0, 562, 475, com.xy.q.Class30.agh);
      com.xy.w.Class9 var40 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "亚普";
      this.yu(var40, "交易");
      this.hi = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.hi.length; var10000 = var2) {
         com.xy.i.Class19[] var10 = this.hi;
         var10004 = "{}'{'-10xpo";
         int var10006 = 221 + var2;
         String var50;
         Class108 var10010;
         if (var2 == 0) {
            var50 = "厑唚儀";
            var50 = "召唤兽";
            var10010 = this;
         } else if (var2 == 1) {
            var50 = "火宕";
            var50 = "灵宝";
            var10010 = this;
         } else {
            var50 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/39.png", 2, var10006, Class49.ck, null, var50, var10010);

         var10[var2] = var10002;
         this.hi[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.hi[var2].setBounds(50 + 65 * var2, 9, 63, 24);
         this.add(this.hi[var2++]);
      }

      this.axf = new com.xy.q.Class18(this);
      this.axf.setBounds(0, 0, 140, 20);
      this.i = com.xy.q.Class1.g(47, 53, 160, 160, this.axf, 20);
      this.add(this.i);
      this.iq = new com.xy.w.Class18[3];

      for (int var11 = var2 = 0; var11 < this.iq.length; var11 = var2) {
         this.iq[var2] = new com.xy.w.Class18();
         Class108 var12;
         if (var2 == 0) {
            var12 = this;
            com.xy.w.Class18 var32 = this.iq[var2];
            var10003 = "\u000e]RZR\fH\u0010\rP\u001a";
            var32.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var2].setBounds(47, 32, 160, 21);
         } else if (var2 == 1) {
            var12 = this;
            com.xy.w.Class18 var33 = this.iq[var2];
            var10003 = "{}'z',<0xpo";
            var33.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.iq[var2].setBounds(47, 32, 160, 180);
         } else {
            if (var2 == 2) {
               com.xy.w.Class18 var10001 = this.iq[var2];
               String var34 = "\u000e]RZR\u000fD\u0010\rP\u001a";
               var10001.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
               this.iq[var2].setBounds(49, 32, 156, 156);
            }

            var12 = this;
         }

         var12.add(this.iq[var2++]);
      }

      String var10008 = "mk1m1?0xpo";
      String var10013 = "硐寧";
      this.axa = new com.xy.i.Class19("sc/e/7.png", 1, 223, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "确定", this);
      this.axa.setBounds(42, 272, 59, 25);
      this.add(this.axa);
      this.ch = new JLabel[11];

      for (int var13 = var2 = 0; var13 < this.ch.length; var13 = ++var2) {
         this.ch[var2] = com.xy.q.Class1.k(47, 220 + 22 * var2, 36, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var14 = this.ch[var2];
         String var24;
         if (var2 == 0) {
            var24 = "玮釙";
            var24 = "现金";
         } else if (var2 == 1) {
            var24 = "铈乙";
            var24 = "银两";
         } else if (var2 == 2) {
            var24 = "铨丬";
            var24 = "银两";
         } else {
            var24 = "";
         }

         var14.setText(var24);
         this.ch[var2].setHorizontalAlignment(10);
         this.add(this.ch[var2]);
         if (var2 == 2) {
            this.ch[var2].setBounds(337, 246, 36, 19);
         }
      }

      this.br = new MoneyType();
      String var10011 = "釯铌";
      this.br.setIdAndKey(1, "金钱");
      this.awx = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, this.br, var1);
      this.awx.n(2);
      String var48 = "{}'z'/?0xpo";
      this.awx.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.awx.setBounds(85, 220, 123, 19);
      this.add(this.awx);
      String var10007 = "\u000e]RZR\u000fJ\u0010\rP\u001a";
      this.aww = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.aww.setBounds(85, 242, 123, 19);
      this.add(this.aww);
      this.awz = new com.xy.q.Class27(15, this.aww, this);
      this.axg = new com.xy.q.Class14[9];

      for (int var15 = var2 = 0; var15 < this.axg.length; var15 = var2) {
         Class108 var16;
         if (var2 == 0) {
            var16 = this;
            this.axg[var2] = com.xy.q.Class1.i(375, 246, 123, 19, 10, Color.white, com.xy.q.Class49.w);
         } else if (var2 >= 1 && var2 <= 4) {
            var16 = this;
            this.axg[var2] = com.xy.q.Class1.i(42 + (var2 - 1) / 2 * 106, 302 + (var2 - 1) % 2 * 20, 100, 19, 10, Color.white, com.xy.q.Class49.w);
            this.axg[var2].addMouseListener(new Class2(this, 1, var2 - 1));
         } else {
            if (var2 >= 5 && var2 <= 8) {
               this.axg[var2] = com.xy.q.Class1.i(313 + (var2 - 5) / 2 * 106, 302 + (var2 - 5) % 2 * 20, 100, 19, 10, Color.white, com.xy.q.Class49.w);
               this.axg[var2].addMouseListener(new Class2(this, 2, var2 - 5));
            }

            var16 = this;
         }

         com.xy.q.Class14 var17 = var16.axg[var2];
         String var27 = "{}'z'/?0xpo";
         var17.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.axg[var2++]);
      }

      this.fp = new com.xy.w.Class18[6];

      for (int var18 = var2 = 0; var18 < this.fp.length; var18 = ++var2) {
         this.fp[var2] = new com.xy.w.Class18();
         this.add(this.fp[var2]);
         if (var2 >= 0 && var2 <= 2) {
            com.xy.w.Class18 var28 = this.fp[var2];
            String var37 = "\u000e]RZR\u000fD\u0010\rP\u001a";
            var28.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            if (var2 == 0) {
               this.fp[var2].setBounds(215, 32, 309, 207);
            } else if (var2 == 1) {
               this.fp[var2].setBounds(41, 345, 207, 105);
            } else if (var2 == 2) {
               this.fp[var2].setBounds(313, 345, 207, 105);
            }
         } else if (var2 == 3) {
            this.fp[var2].setBounds(140, 269, 17, 17);
            this.fp[var2].addMouseListener(new Class2(this, 0, 0));
         } else if (var2 == 4) {
            this.fp[var2].setBounds(503, 247, 17, 17);
         } else if (var2 == 5) {
            this.fp[var2].setBounds(270, 258, 34, 59);
         }
      }

      this.axe = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 216, 34);
      var10004 = "{}'z'/00xpo";
      this.axe.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.add(this.axe);
      com.xy.i.Class3[] var8 = new com.xy.i.Class3[2];

      int var3;
      for (int var19 = var3 = 0; var19 < var8.length; var19 = var3) {
         if (var3 == 0) {
            var10004 = "\u000e]R[R\nO\u0010\rP\u001a";
            var10004 = "sc/e/42.png";
         } else {
            var10004 = "{}'{'*;0xpo";
            var10004 = "sc/e/43.png";
         }

         com.xy.i.Class3 var29 = new com.xy.i.Class3(var10004, 1, var3, this);
         var8[var3] = var29;
         var8[var3].setBounds(163 + 21 * var3, 187, 18, 18);
         this.add(var8[var3++]);
      }

      this.awy = new com.xy.q.Class7(true, this, 3, 3, 51, 51, 0, 0, 50, 34);
      var48 = "\u000e]RZR\u000fE\u0010\rP\u001a";
      this.awy.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.awy.vr(var8, 1);
      this.add(this.awy);
      this.aft = new com.xy.q.Class54[16];

      for (int var20 = var3 = 0; var20 < this.aft.length; var20 = var3) {
         this.aft[var3] = new com.xy.q.Class54(this);
         Class108 var21;
         if (var3 < 8) {
            var21 = this;
            this.aft[var3].setBounds(42 + 51 * (var3 % 4), 347 + 51 * (var3 / 4), 51, 51);
         } else {
            var21 = this;
            this.aft[var3].setBounds(314 + 51 * ((var3 - 8) % 4), 347 + 51 * ((var3 - 8) / 4), 51, 51);
         }

         com.xy.q.Class54 var22 = var21.aft[var3];
         String var30 = "{}'z'/00xpo";
         var22.dq("sc/d/18.png");
         this.add(this.aft[var3++]);
      }
   }

   // $VF: synthetic method
   static Class89 anb(Class108 var0) {
      return var0.axb;
   }

   public void ds(long var1, JTextField var3) {
      if (this.axb != null && Class89.i(this.axb) != null) {
         long var4 = Class89.c(this.axd).getMoney() != null ? Class89.c(this.axd).getMoney().longValue() : 0L;
         if (var1 != var4) {
            Class89.c(this.axd).setMoney(new BigDecimal(var1));
            GoodTrans2 var6 = new GoodTrans2();
            var6.setI(true);
            var6.setMoney(Class89.c(this.axd).getMoney());
            String var7 = Agreement.getSendTextAES("TransGood", com.xy.v.Class31.a().toJson(var6));
            this.za().k(var7);
         }
      }
   }

   public void anc(GoodTrans2 var1) {
      Class89.c(this.axb).b(var1);
      if (var1.getMoney() != null) {
         this.axb.a(var1.getMoney().longValue());
      }

      int var2;
      if (var1.getGoods() != null) {
         for (int var10000 = var2 = 0; var10000 < 8; var10000 = ++var2) {
            Goodstable var3 = Class89.c(this.axb).getGood(var2);
            Goodstable var4 = (Goodstable)this.aft[8 + var2].jx();
            if (var3 != null || var4 != null) {
               if (var3 == null) {
                  this.aft[8 + var2].gs(0, null);
                  this.aft[8 + var2].setVisible(true);
               } else if (var4 == null) {
                  this.aft[8 + var2].gs(18, var3);
               } else if (!com.xy.v.Class12.x(var3.getRgid(), var4.getRgid())) {
                  this.aft[8 + var2].gs(18, var3);
               }
            }
         }
      }

      if (var1.getPet() != null) {
         RoleSummoning var5 = Class89.c(this.axb).getPet(0);
         RoleSummoning var7 = Class89.c(this.axb).getPet(1);
         this.axg[5].setText(var5 != null ? var5.getSummoningname() : null);
         this.axg[6].setText(var7 != null ? var7.getSummoningname() : null);
      }

      if (var1.getLingbao() != null) {
         Lingbao var6 = Class89.c(this.axb).getLingbao(0);
         Lingbao var8 = Class89.c(this.axb).getLingbao(1);
         this.axg[7].setText(var6 != null ? var6.getBaoname() : null);
         this.axg[8].setText(var8 != null ? var8.getBaoname() : null);
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.gs = var1;

      for (int var2 = 0; var10000 < this.hi.length; var10000 = ++var2) {
         this.hi[var2].setKeep(var2 == this.gs);
      }

      if (this.gs == 0) {
         this.axf.t();
         this.i.setVisible(true);
         this.iq[0].setVisible(true);
         this.iq[1].setVisible(true);
         this.iq[2].setVisible(false);
         this.awy.setVisible(false);
      } else {
         if (this.gs == 1) {
            this.iq[2].setVisible(true);
            this.awy.setVisible(true);
            this.iq[0].setVisible(false);
            this.iq[1].setVisible(false);
            this.i.setVisible(false);
         }
      }
   }

   public void adb(BigDecimal var1, String var2) {
      if (this.axb != null) {
         Class89.g(this.axb, null);
      }

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.aft.length; var10000 = var3) {
         this.aft[var3].gs(0, null);
         this.aft[var3++].setVisible(true);
      }

      for (int var6 = var3 = 0; var6 < this.axg.length; var6 = var3) {
         this.axg[var3++].setText(null);
      }

      if (this.axd == null) {
         this.axd = new Class89(this);
      }

      if (this.axb == null) {
         this.axb = new Class89(this);
      }

      this.axd.h(null, null);
      this.axb.h(var1, var2);
      this.aww.setText("0");
      FriendBean var5 = this.yx().getFriend(var1.longValue());
      com.xy.w.Class18 var7 = this.fp[5];
      String var10;
      if (var5 != null && var5.getGroup() == 2) {
         var10 = null;
      } else {
         var10 = "mk1j1{.80xpo";
         var10 = "sc/b/s00.png";
      }

      var7.dp(var10);
      this.zc().b(this.lj());
   }

   public void and(GoodTrans2 var1) {
      int var2;
      if (var1.getGoods() != null) {
         for (int var10000 = var2 = 0; var10000 < 8; var10000 = ++var2) {
            Goodstable var3 = Class89.c(this.axd).getGood(var2);
            Goodstable var4 = (Goodstable)this.aft[var2].jx();
            if (var3 != null || var4 != null) {
               if (var3 == null) {
                  this.aft[var2].gs(0, null);
                  this.aft[var2].setVisible(true);
               } else if (var4 == null) {
                  this.aft[var2].gs(1, var3);
               } else if (!com.xy.v.Class12.x(var3.getRgid(), var4.getRgid())) {
                  this.aft[var2].gs(1, var3);
               }
            }
         }
      }

      if (var1.getPet() != null) {
         RoleSummoning var5 = Class89.c(this.axd).getPet(0);
         RoleSummoning var7 = Class89.c(this.axd).getPet(1);
         this.axg[1].setText(var5 != null ? var5.getSummoningname() : null);
         this.axg[2].setText(var7 != null ? var7.getSummoningname() : null);
      }

      if (var1.getLingbao() != null) {
         Lingbao var6 = Class89.c(this.axd).getLingbao(0);
         Lingbao var8 = Class89.c(this.axd).getLingbao(1);
         this.axg[3].setText(var6 != null ? var6.getBaoname() : null);
         this.axg[4].setText(var8 != null ? var8.getBaoname() : null);
      }
   }

   @Override
   public void l() {
      this.axc = this.yw(this.axe, this.axc, 524, 51);
      this.awx.l();
      this.g(0);
      super.l();
   }

   public void hr(Goodstable var1, boolean var2) {
      if (Class89.j(this.axd) == 0) {
         if (GoodType.aw(var1)) {
            String var7 = "语牷哉禟歪人昛";
            this.afx._do("该物品禁止交易");
         } else {
            Goodstable var3;
            if ((var3 = Class89.c(this.axd).getGood(var1.getRgid())) == null) {
               if (Class89.c(this.axd).getGoods() != null && Class89.c(this.axd).getGoods().size() >= 8) {
                  String var10001 = "栂嬭巌溜";
                  this.afx._do("格子已满");
                  return;
               }

               var3 = (Goodstable)var1.clone();
               var3.setUsetime(1);
               Class89.c(this.axd).setGood(var3);
               var3.setUsetime(0);
            }

            int var4 = var2 ? var1.getUsetime() : Math.min(var1.getUsetime(), var3.getUsetime() + 1);
            if (var4 != var3.getUsetime()) {
               var3.setUsetime(var4);
               GoodTrans2 var5 = new GoodTrans2();
               var5.setI(true);
               var5.setGoods(var3);
               String var6 = Agreement.getSendTextAES("TransGood", com.xy.v.Class31.a().toJson(var5));
               this.za().k(var6);
               this.and(var5);
            }
         }
      }
   }

   public void cq(Lingbao var1) {
      if (Class89.j(this.axd) == 0) {
         if (var1 != null) {
            if (var1.getEquipment() == 1) {
               String var7 = "讘灋寠圖县戦乐Ｒ买发仙昭ｼ";
               this.afx._do("该灵宝在参战中，不可交易！");
            } else {
               int var2 = Class89.c(this.axd).getLingbaos() != null ? Class89.c(this.axd).getLingbaos().size() : 0;
               boolean var3 = Class89.c(this.axd).setLingbao(var1);
               int var4 = Class89.c(this.axd).getLingbaos() != null ? Class89.c(this.axd).getLingbaos().size() : 0;
               if (var2 == var4) {
                  String var10001 = "栢存巬滩";
                  this.afx._do("格子已满");
               } else {
                  GoodTrans2 var5 = new GoodTrans2();
                  var5.setI(var3);
                  var5.setLingbao(var1);
                  String var6 = Agreement.getSendTextAES("TransGood", com.xy.v.Class31.a().toJson(var5));
                  this.za().k(var6);
                  this.and(var5);
               }
            }
         }
      }
   }
}
