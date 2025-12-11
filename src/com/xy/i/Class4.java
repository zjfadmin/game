package com.xy.i;

import com.xy.a.a.Class25;
import com.xy.a.a.Class27;
import com.xy.a.a.Class30;
import com.xy.a.a.Class31;
import com.xy.a.a.Class38;
import com.xy.a.a.Class42;
import com.xy.a.a.Class43;
import com.xy.a.a.Class44;
import com.xy.a.a.Class50;
import com.xy.a.q.Class34;
import com.xy.a.q.Class45;
import com.xy.battle.BattleControl;
import com.xy.battle.BattleMan;
import com.xy.battle.TypeState;
import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.PetProperty;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class53;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.List;

public class Class4 extends Class1 {
   private Object pg;
   private int ah;

   @Override
   public void cw(MouseEvent var1) {
      if (this.ah != 3 && this.ah != 4 && this.ah != 5) {
         if (this.ah == 6) {
            if (this.form instanceof com.xy.a.a.Class16) {
               ((com.xy.a.a.Class16)this.form).kz((Class53)this.pg);
               return;
            }
         } else {
            if (this.ah == 7) {
               String var14 = this.getText();
               String var17 = "\u0012";
               if (var14.equals("X")) {
                  ((com.xy.a.a.Class16)this.form).kz(null);
                  return;
               }

               ((com.xy.a.a.Class16)this.form).y(Integer.parseInt(this.getText()));
               return;
            }

            if (this.ah == 21) {
               if (this.form.afx.getBattleScene() != null) {
                  return;
               }

               this.form.afx.setMouseIndex(com.xy.v.Class3.c);
               return;
            }

            if (this.ah == 22) {
               if (this.form.afx.getBattleScene() != null) {
                  return;
               }

               if (this.form.afx.ah()) {
                  return;
               }

               this.form.afx.setMouseIndex(com.xy.v.Class3.g);
               return;
            }

            if ((this.ah < 23 || this.ah > 37) && this.ah != 52 && this.ah != 53) {
               if (this.ah == 41) {
                  if (this.form.afx.ah()) {
                     return;
                  }

                  this.form.zc().f(67);
                  this.form.zc().b(91);
                  return;
               }

               if (this.ah == 42) {
                  Class0.ff(62, this.form.afx);
                  return;
               }

               if (this.ah == 43) {
                  ((com.xy.a.a.Class9)this.form).f();
                  return;
               }

               if (this.ah == 45) {
                  ((com.xy.a.a.Class9)this.form).g(this.ah);
                  return;
               }

               if (this.ah == 51) {
                  ((Class34)this.form).cr(false);
                  return;
               }

               if (this.ah == 61) {
                  if (this.form.ze().getBattleScene() != null) {
                     return;
                  }

                  ((Class31)this.form).c();
                  return;
               }

               if (this.ah == 62) {
                  if (this.form.ze().getBattleScene() != null) {
                     return;
                  }

                  ((Class31)this.form).f();
                  return;
               }

               if (this.ah == 63) {
                  if (this.form.ze().getBattleScene() != null) {
                     return;
                  }

                  Class0.ff(2, this.form.afx);
                  return;
               }

               if (this.ah == 64) {
                  Class0.ff(20, this.form.afx);
                  return;
               }

               if (this.ah == 65) {
                  if (this.form.ze().getBattleScene() != null) {
                     return;
                  }

                  if (this.form.afx.ah()) {
                     return;
                  }

                  this.f();
                  return;
               }

               if (this.ah == 71) {
                  ((Class30)this.form).f();
                  return;
               }

               if (this.ah == 72) {
                  ((Class30)this.form).h();
                  return;
               }

               if (this.ah == 73) {
                  ((Class30)this.form).c();
                  return;
               }

               if (this.ah == 81 || this.ah == 82 || this.ah == 83 || this.ah == 84) {
                  ((Class42)this.form).g(this.ah);
                  return;
               }

               if (this.ah >= 91 && this.ah <= 97) {
                  ((com.xy.a.a.Class12)this.form).g(this.ah);
                  return;
               }

               if (this.ah == 101 || this.ah == 102) {
                  ((com.xy.a.a.Class5)this.form).g(this.ah);
                  return;
               }

               if (this.ah == 105) {
                  ((Class45)this.form.zc().j(92)).g(601);
                  return;
               }

               if (this.ah == 108) {
                  Class0.ff(96, this.form.afx);
                  return;
               }

               if (this.ah == 109) {
                  if (this.form.afx.getBattleScene() != null) {
                     return;
                  }

                  this.form.afx.setMouseIndex(com.xy.v.Class3.c);
                  return;
               }

               if (this.ah == 110) {
                  if (this.form.afx.getBattleScene() != null) {
                     return;
                  }

                  if (this.form.afx.ah()) {
                     return;
                  }

                  this.form.afx.setMouseIndex(com.xy.v.Class3.g);
                  return;
               }

               if (this.ah == 107 || this.ah >= 111 && this.ah <= 115) {
                  ((com.xy.a.a.Class19)this.form).y(this.ah);
                  return;
               }

               if (this.ah == 116 || this.ah == 117) {
                  ((Class25)this.form).g(this.ah);
                  return;
               }

               if (this.ah == 118) {
                  ((Class43)this.form).h();
                  return;
               }

               if (this.ah >= 123 && this.ah <= 130) {
                  ((Class38)this.form).y(this.ah);
                  return;
               }

               if (this.ah >= 131 && this.ah <= 134) {
                  ((Class44)this.form).g(this.ah);
                  return;
               }

               if (this.ah >= 141 && this.ah <= 143) {
                  ((Class50)this.form).g(this.ah);
                  return;
               }

               if (this.ah >= 151 && this.ah <= 155) {
                  ((com.xy.a.a.Class34)this.form).g(this.ah);
                  return;
               }

               if (this.ah >= 171 && this.ah <= 173) {
                  ((com.xy.a.a.Class0)this.form).g(this.ah);
                  return;
               }

               if (this.ah == 191) {
                  ((com.xy.a.a.Class22)this.form.zc().j(174)).g(((Class27)this.form).dx());
                  return;
               }

               if (this.ah == 192) {
                  Class0.ff(175, this.form.afx);
                  return;
               }

               if (this.ah == 193) {
                  this.h();
                  return;
               }

               if (this.ah == 201) {
                  ((com.xy.a.a.Class18)this.form).g(this.ah);
                  return;
               }

               if (this.ah >= 211 && this.ah <= 213) {
                  ((com.xy.a.a.Class22)this.form).y(this.ah);
               }
            } else {
               if (this.ah == 29) {
                  RoleSummoning var8;
                  if ((var8 = this.form.yx().getChosePet()) == null) {
                     return;
                  }

                  if (this.form.ze().getBattleScene() == null) {
                     return;
                  }

                  com.xy.d.Class11 var10;
                  if ((var10 = this.form.ze().getBattleControl().getHandleUnit()) != null && var10.cg().getType() == 0) {
                     BattleMan var12 = var10.cg();
                     String var15 = "叀唕兑";
                     List var11 = var12.j("召唤兽");

                     int var5;
                     for (int var13 = var5 = 0; var13 < var11.size(); var13 = ++var5) {
                        if (((TypeState)var11.get(var5)).getState() == 0
                           && var8.getSid().intValue() == Integer.parseInt(((TypeState)var11.get(var5)).getType())) {
                           BattleControl var6 = this.form.ze().getBattleControl();
                           String var18 = "厦唠l";
                           var6.o(Class14.aid("召唤&" + ((TypeState)var11.get(var5)).getType(), var10, var6));
                           var10.q(true);
                           var6.c();
                           this.form.ze().getFormManagement().f(6);
                           return;
                        }
                     }

                     var15 = "迵叛叀唕兑旑泹叝唈";
                     this.form.afx._do("这只召唤兽无法召唤");
                     return;
                  }

                  return;
               }

               if (this.ah == 33) {
                  RoleSummoning var7;
                  if ((var7 = this.form.yx().getChosePet()) == null) {
                     return;
                  }

                  ((com.xy.a.w.Class25)this.form.zc().j(8)).abn(PropertyUtil.getPetQl(var7, this.form.yx()), 1, var7.getSid());
                  return;
               }

               if (this.ah == 34) {
                  Class0.ff(18, this.form.afx);
                  return;
               }

               if (this.form.ze().getBattleScene() == null) {
                  RoleSummoning var2;
                  if ((var2 = this.form.yx().getChosePet()) == null) {
                     return;
                  }

                  if (this.ah == 23 || this.ah == 24 || this.ah == 25) {
                     ((com.xy.a.a.Class6)this.form.zc().j(47)).ey(var2, this.ah - 23);
                     return;
                  }

                  if (this.ah == 26) {
                     this.ew(var2);
                     return;
                  }

                  if (this.ah == 27) {
                     if (this.form.afx.ah()) {
                        return;
                     }

                     GameView var10000 = this.form.afx;
                     String var10004 = var2.getSid().toString();
                     String var10007 = "'\u001d硪寐覅屌叨啮兹p'\r";
                     StringBuilder var10005 = new StringBuilder("#W确定要将召唤兽:#G").append(var2.getSummoningname());
                     String var10006 = "\u0012{攏申否\u0013";
                     var10000.dm(new ConfirmBean(11, var10004, var10005.append("#W放生吗?").toString()));
                     return;
                  }

                  if (this.ah == 28) {
                     this.pd(var2);
                     return;
                  }

                  if (this.ah == 30) {
                     this.pe(var2);
                     return;
                  }

                  if (this.ah == 31) {
                     Class0.ff(67, this.form.afx);
                     return;
                  }

                  if (this.ah == 32) {
                     Class0.ff(17, this.form.afx);
                     return;
                  }

                  if (this.ah == 36) {
                     this.pf(var2);
                     return;
                  }

                  if (this.ah == 37) {
                     ((com.xy.a.a.Class12)this.form.zc().j(115)).ew(var2);
                     return;
                  }

                  if (this.ah == 52) {
                     com.xy.a.a.Class6 var9 = (com.xy.a.a.Class6)this.form;
                     String var10003 = "\u0004@6";
                     StringBuilder var10001 = new StringBuilder("ND|").append(var9.em());
                     String var10002 = "P";
                     String var4 = Agreement.getSendTextAES("userpet", var10001.append("|").append(var9.ex()).toString());
                     this.form.za().k(var4);
                     return;
                  }

                  if (this.ah == 53) {
                     com.xy.a.a.Class6 var3 = (com.xy.a.a.Class6)this.form;
                     this.pg(var2, var3.ex());
                     return;
                  }
               }
            }
         }
      } else {
         ((com.xy.a.a.Class4)this.form).g(this.ah);
      }
   }

   public Class4(String var1, int var2, int var3, com.xy.q.Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
      this.form = var4;
   }

   public void n(int var1) {
      this.ah = var1;
   }

   public void pd(RoleSummoning var1) {
      RoleData var2 = this.form.yx();

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.goodPacks.length; var10000 = ++var3) {
         if (var1.getFaithful() >= 100) {
            GameView var5 = this.form.afx;
            String var9 = "叨啮兹j";
            StringBuilder var10001 = new StringBuilder("召唤兽 ").append(var1.getSummoningname());
            String var7 = "皵忌诫床巃滍";
            var5.dp(var10001.append("的忠诚度已满").toString());
            return;
         }

         Goodstable var4;
         if ((var4 = var2.getGood(var2.goodPacks[var3])) != null && var4.getType() == 49L) {
            var4.n(1);
            ParamTool.j(var4, 1, this.form.za());
            if (var4.getUsetime() <= 0) {
               var2.ag(var4.getRgid());
            }

            var1.c(Integer.parseInt(var4.getValue()));
            GameView var10002 = this.form.afx;
            String var10005 = "叨啮兹j";
            StringBuilder var10003 = new StringBuilder("召唤兽 ").append(var1.getSummoningname());
            String var10004 = "墲劑亪";
            var10003 = var10003.append("增加了").append(var4.getValue());
            var10004 = "炽循诞廬";
            var10002.dp(var10003.append("点忠诚度").toString());
            ParamTool.d(var1, this.form.za());
            ((com.xy.a.a.Class16)this.form).kv()[1].setText(var1.getFaithful().toString());
            return;
         }
      }

      String var6 = "悙沍朸趟央完牘叏粟亪";
      this.form.afx.dp("您没有足够宠物口粮了");
   }

   public Class4(String var1, int var2, int var3, String var4, com.xy.q.Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   public void f() {
      RoleData var1;
      if ((var1 = this.form.yx()) != null) {
         Mount var2;
         if ((var2 = var1.getChoseMount()) != null) {
            if (var1.getLoginResult().getMount_id() == var2.getMountid()) {
               String var3 = "惢皀圚骕辒袯惢骕眊呦ｋ";
               this.form.afx.dp("您的坐骑还被您骑着呢！");
            } else if (var2.getSid() == null && var2.getOthrersid() == null && var2.getSid3() == null) {
               GameView var10000 = this.form.afx;
               String var10004 = var2.getMid().toString();
               String var10007 = "iS砤实觋専圚骕p'\r";
               StringBuilder var10005 = new StringBuilder("#W确定要将坐骑:#G").append(var2.getMountname());
               String var10006 = "\u0012{攏申否\u0013";
               var10000.dm(new ConfirmBean(14, var10004, var10005.append("#W放生吗?").toString()));
            } else {
               String var10001 = "悙皨坡骽箐刚睱叀唕兑呓Ｍ";
               this.form.afx.dp("您的坐骑管制着召唤兽呢！");
            }
         }
      }
   }

   public void pe(RoleSummoning var1) {
      RoleData var2 = this.form.yx();
      com.xy.a.a.Class16 var3 = (com.xy.a.a.Class16)this.form;
      BigDecimal var4;
      if ((var4 = var2.getLoginResult().getSummoning_id()) != null && var4.compareTo(var1.getSid()) == 0) {
         Class4 var10002 = var3.kw()[9];
         String var8 = "叆扒";
         var10002.setText("参战");
         var2.getLoginResult().setSummoning_id(null);
         String var7 = "|";
         String var6 = Agreement.getSendTextAES("rolechange", "P");
         this.form.za().k(var6);
      } else {
         Class4 var10000 = var3.kw()[9];
         String var10001 = "伕急";
         var10000.setText("休息");
         var2.getLoginResult().setSummoning_id(var1.getSid());
         String var10003 = "|";
         String var5 = Agreement.getSendTextAES("rolechange", "P" + var1.getSid());
         this.form.za().k(var5);
      }
   }

   public void pf(RoleSummoning var1) {
      RoleData var2 = this.form.yx();
      com.xy.a.a.Class16 var3;
      com.xy.a.a.Class16 var10000 = var3 = (com.xy.a.a.Class16)this.form;
      int var4 = var10000.ky(0);
      int var5 = var10000.ky(1);
      int var6 = var10000.ky(2);
      int var7 = var10000.ky(3);
      int var8 = var10000.ky(4);
      int var9 = var1.getCanpoint();
      int[] var10 = PetProperty.getPetHMASp(var1, var2);
      if ((var9 = var9 - var4) - var5 - var6 - var7 - var8 + var10[5] + var10[6] + var10[7] + var10[8] + var10[9] >= 0
         && (var4 > var10[5] || var5 > var10[6] || var6 > var10[7] || var7 > var10[8] || var8 > var10[9])) {
         var1.setBone(var1.getBone() + var4 - var10[5]);
         var1.setSpir(var1.getSpir() + var5 - var10[6]);
         var1.setPower(var1.getPower() + var6 - var10[7]);
         var1.setSpeed(var1.getSpeed() + var7 - var10[8]);
         var1.setCalm(var1.getCalm() + var8 - var10[9]);
         ParamTool.d(var1, this.form.za());
         var3.lc(var2.getRolePet(var1.getSid().longValue()));
      }
   }

   public int il() {
      return this.ah;
   }

   public Class4(String var1, int var2, int var3, Font var4, Color[] var5, String var6, com.xy.q.Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      Class4 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
      if (this.ah != 1 && this.ah != 2) {
         if (this.ah != 103 && this.ah != 104) {
            if (this.ah >= 120 && this.ah <= 122) {
               if (var2) {
                  ((Class38)this.form).bi(this.ah - 120);
                  return;
               }
            } else if (this.ah >= 161 && this.ah <= 162) {
               if (var2) {
                  ((com.xy.a.a.Class53)this.form).g(this.ah - 161);
                  return;
               }
            } else if (this.ah >= 181 && this.ah <= 185 && var2) {
               ((Class27)this.form).g(this.ah - 181);
            }
         } else if (var2) {
            if (this.form.afx.ah()) {
               return;
            }

            ((com.xy.a.a.Class19)this.form).bi(this.ah - 103);
            return;
         }
      } else if (var2) {
         ((com.xy.a.a.Class4)this.form).y(this.ah);
         return;
      }
   }

   public void h() {
      int var1 = 0;
      int var2 = 0;
      BaseMountSH var4 = this.form.yx().getMountSHByindex(0);

      int var5;
      for (int var10000 = var5 = 0; var10000 < var4.getMounts().length; var10000 = ++var5) {
         BaseMountSkill var6;
         if ((var6 = var4.getMounts()[var5]).getB1() != 0 && var6.getB2() != 0 && var6.getB3() < 1000) {
            var1++;
            var2 += 1000 - var6.getB3();
         }
      }

      if (var1 == 0) {
         String var10001 = "沥权霄觋俪奇皀寂抠瞹";
         this.form.afx._do("没有需要修复的守护石");
      } else {
         ((com.xy.a.Class6)this.form.zc().j(27)).cc(var1, var2);
      }
   }

   public void gw(Object var1) {
      this.pg = var1;
   }

   public void pg(RoleSummoning var1, BigDecimal var2) {
      RoleData var3 = this.form.yx();
      if ((var1.getPetlock() >> 0 & 1) == 1) {
         GameView var10 = this.form.afx;
         String var10003 = "叀唕兑";
         StringBuilder var13 = new StringBuilder("召唤兽").append(var1.getSummoningname());
         String var10002 = "嶸袯勪锅ｆ三厥吔冰冁乳％ｋ";
         var10._do(var13.append("已被加锁，不可吐出内丹！！").toString());
      } else if (var3.getGoodPackSum(-1L, new BigDecimal(-1), 999) <= 0) {
         String var12 = "胠匴州滐ＭＰＭ";
         this.form.afx._do("背包已满！！！");
      } else {
         String var10000 = var1.getInnerGoods();
         String var10001 = "X6";
         String[] var4 = var10000.split("\\|");
         String var5 = "";

         int var6;
         for (int var8 = var6 = 0; var8 < var4.length; var8 = ++var6) {
            if (var2.compareTo(new BigDecimal(var4[var6])) == 0) {
               Goodstable var7;
               if ((var7 = var3.getGoodEquip(var2)) != null) {
                  var7.setStatus(0);
                  var3.ad(var7);
                  ParamTool.j(var7, 0, this.form.za());
               }
            } else {
               if (!var5.equals("")) {
                  StringBuilder var9 = new StringBuilder(String.valueOf(var5));
                  var10001 = "P";
                  var5 = var9.append("|").toString();
               }

               var5 = var5 + var4[var6];
            }
         }

         var1.setInnerGoods(var5);
         ParamTool.d(var1, this.form.za());
         var3.getRoleProperty().i(var1);
      }
   }

   public void cp(int var1, String var2) {
      this.ah = var1;
      this.setText(var2);
   }

   public void ew(RoleSummoning var1) {
      String var3 = ((com.xy.a.a.Class16)this.form).ku().getText().trim();
      String var4 = var1.getSummoningname();
      if (!var3.equals("") && !var3.equals(var4)) {
         if (var3.length() > 9) {
            String var7 = "吉禺三肷迃锵";
            this.form.afx.dp("名称不能过长");
         } else {
            var1.setSummoningname(var3);
            ParamTool.d(var1, this.form.za());
            GameView var5 = this.form.afx;
            String var9 = "悙皨叝唈兌\f";
            StringBuilder var6 = new StringBuilder("您的召唤兽 ").append(var4);
            String var8 = "戔動攽呇举p";
            var5.dp(var6.append("成功改名为:").append(var3).toString());
         }
      } else {
         GameView var10000 = this.form.afx;
         String var10003 = "诳这兡厦唠儷";
         StringBuilder var10001 = new StringBuilder("请输入召唤兽").append(var1.getSummoningname());
         String var10002 = "皨斁吡学Ｍ";
         var10000.dp(var10001.append("的新名字！").toString());
      }
   }
}
