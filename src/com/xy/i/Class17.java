package com.xy.i;

import com.xy.a.Class113;
import com.xy.a.a.Class33;
import com.xy.a.a.Class35;
import com.xy.bean.ConfirmBean;
import com.xy.bean.RoleShow;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class Class17 extends Class1 {
   private int ah;

   public Class17(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   public Class17(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
      this.form = var4;
   }

   public Class17(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      Class17 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(0);
      this.setText(var6);
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.ah == 1) {
         if (this.form.afx.getBattleScene() == null) {
            this.form.afx.setMouseIndex(com.xy.v.Class3.c);
         }
      } else if (this.ah == 2) {
         if (this.form.afx.getBattleScene() == null) {
            if (!this.form.afx.ah()) {
               this.form.afx.setMouseIndex(com.xy.v.Class3.g);
            }
         }
      } else if (this.ah == 3) {
         if (!this.form.afx.ah()) {
            this.form.yx().setLockPack();
            GameView var21 = this.form.ze();
            String var29 = "肐卛嶮勾镝｟";
            var21._do("背包已加锁！");
         }
      } else if (this.ah == 4) {
         ((Class113)this.form.zc().j(32)).g(com.xy.v.Class12.h(this.form.yx().getLoginResult().getPassword()) ? 0 : 1);
      } else if (this.ah == 5) {
         ((com.xy.a.Class6)this.form.zc().j(27)).bw(null, null, 33);
      } else if (this.ah == 6) {
         if (!this.form.afx.ah()) {
            RoleShow var12 = this.form.afx.roleUnit.ap;
            if (!this.form.za().l(2, 3)) {
               if (var12.getMapid() != 1236L || var12.getX() <= 5977 || var12.getX() >= 8290 || var12.getY() <= 3099 || var12.getY() >= 4174) {
                  String var28 = "厞肜坜浺陇隧并搧搾";
                  this.form.afx.dp("只能在洛阳集市摆摊");
                  return;
               }

               if (var12.getMapid() == 1236L && var12.getX() > 7130 && var12.getX() < 7370 && var12.getY() > 3435 && var12.getY() < 3585) {
                  String var27 = "輺奵吴嚪秝欼搚搔";
                  this.form.afx.dp("车夫周围禁止摆摊");
                  return;
               }
            } else {
               if ((var12.getMapid() != 1236L || var12.getX() <= 5977 || var12.getX() >= 8290 || var12.getY() <= 3099 || var12.getY() >= 4174)
                  && (var12.getMapid() != 1207L || var12.getX() <= 3320 || var12.getX() >= 4320 || var12.getY() <= 4220 || var12.getY() >= 4500)) {
                  String var25 = "坜浺陇隧并扷聱锞寽隧并搧搾";
                  this.form.afx.dp("在洛阳集市或者长安集市摆摊");
                  return;
               }

               if (var12.getMapid() == 1236L && var12.getX() > 7130 && var12.getX() < 7370 && var12.getY() > 3435 && var12.getY() < 3585) {
                  String var24 = "輺奵吴嚪秝欼搚搔";
                  this.form.afx.dp("车夫周围禁止摆摊");
                  return;
               }
            }

            if (var12.getTroop_id() != null || this.form.ze().getBattleScene() != null || this.form.zc().l(14) != null) {
               String var26 = "弧刬狂恠乹肜搲搫ｵ";
               this.form.afx._do("当前状态不能摆摊！");
            } else if (var12.getBooth_id() != null) {
               String var15 = Agreement.getSendTextAES("stallget", var12.getBooth_id().toString());
               this.form.za().k(var15);
            } else {
               Class0.ff(152, this.form.afx);
            }
         }
      } else if (this.ah == 7) {
         Class0.ff(38, this.form.afx);
      } else if (this.ah == 8) {
         if (this.form.yx().j()) {
            Class0.ff(182, this.form.afx);
         } else {
            String var23 = "\u0019\u0019\n";
            String var14 = Agreement.getSendTextAES("parcel", "GET");
            this.form.za().k(var14);
         }
      } else if (this.ah == 9) {
         this.form.yx().av();
      } else if (this.ah == 10) {
         Class35 var11;
         (var11 = (Class35)this.form).f();
      } else if (this.ah >= 11 && this.ah <= 13) {
         Class35 var10 = (Class35)this.form;
         RoleData var13;
         BigDecimal[] var16;
         if ((var16 = (var13 = this.form.yx()).getPackRecord().setEquipType(this.ah - 11)) != null) {
            String var30 = "$;";
            String var17 = Agreement.getSendTextAES("rolechange", "EO" + (this.ah - 11));
            this.form.za().k(var17);
            var10.g(this.ah - 11);
            var13.setEquipGoodsList(var16);
            var13.getRoleProperty().f();

            RoleData var20;
            label197: {
               try {
                  Thread.sleep(5L);
               } catch (Exception var9) {
                  var20 = var13;
                  var9.printStackTrace();
                  break label197;
               }

               var20 = var13;
            }

            var20.ao(false);
            var10.f();
         }
      } else if (this.ah != 21 && this.ah != 22 && this.ah != 23) {
         if (this.ah != 22 && this.ah != 23 && this.ah == 24) {
            RoleData var2 = this.form.yx();
            com.xy.q.Class21 var3;
            com.xy.q.Class21 var10000 = var3 = ((Class35)this.form).acf();
            int var4 = var10000.dx();
            if (var10000.ah() && var4 >= var3.ia() - var3.vq().length) {
               return;
            }

            StringBuffer var5 = new StringBuffer();

            int var6;
            for (int var19 = var6 = 0; var19 < var3.vq().length; var19 = ++var6) {
               int var7 = var6 + var4;
               Goodstable var8;
               if ((var8 = var2.getGood(var2.goodPacks[var7])) != null
                  && var8.getGoodlock() != 1
                  && (GoodType.r(var8.getType()) == -1 || GoodType.getExtra(var8.getValue(), GoodType.Extras[4]) == null)) {
                  if (var5.length() != 0) {
                     String var10001 = "\"";
                     var5.append("|");
                  }

                  var5.append(var8.getRgid());
               }
            }

            if (var5.length() == 0) {
               String var22 = "弧刬肸卤桻泀杽觠湱瑧盰爈咵";
               this.form.afx._do("当前背包栏没有要清理的物品");
               return;
            }

            String var10003 = var5.toString();
            String var10004 = "}\u000b砰密觟屚弍刑肒卙桑盘爷咝乼彟呉t乓卙呵勼镟爵咟ua";
            ConfirmBean var18 = new ConfirmBean(1, var10003, "#W确定要将当前背包栏的物品丢弃吗(不包含加锁物品)?");
            this.form.afx.dm(var18);
         }
      } else {
         ((Class33)this.form).y(this.ah);
      }
   }

   public int il() {
      return this.ah;
   }

   public void n(int var1) {
      this.ah = var1;
   }
}
