package com.xy;

import com.xy.bean.BuyShopBean;
import com.xy.game.RoleData;
import com.xy.readbean.Eshop;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JComponent;

public class Class243 extends Class93 {
   private int cy;
   private JComponent qh;

   public void ac(MouseEvent var1, boolean var2) {
   }

   public static String zs(Shop var0, Class345 var1) {
      String var2 = "金钱";
      if (var0.getShoptype() == (111 & 61)) {
         var2 = "师徒积分";
         return "师徒积分";
      } else if (var0.getShoptype() == (95 & 121)) {
         var2 = "绑玉";
         return "绑玉";
      } else if (var0.getShoptype() == (31 & 106)) {
         var2 = "天庭积分";
         return "天庭积分";
      } else if (var0.getShoptype() == (127 & 61)) {
         var2 = "帮战积分";
         return "帮战积分";
      } else if (var0.getShoptype() == (124 & 123)) {
         var2 = "大雁塔积分";
         return "大雁塔积分";
      } else if (var0.getShoptype() == (125 & 123)) {
         var2 = "地宫积分";
         return "地宫积分";
      } else if (var0.getShoptype() == (123 & 127)) {
         var2 = "寻芳积分";
         return "寻芳积分";
      } else if (var0.getShoptype() == (127 & 124)) {
         var2 = var1.uw().n(--2, --3) ? "副本积分" : "木魁积分";
         return var2;
      } else if (var0.getShoptype() == (127 & 126)) {
         var2 = "水陆积分";
         return "水陆积分";
      } else if (var0.getShoptype() == (127 & 127)) {
         var2 = "副本积分";
         return "副本积分";
      } else if (var0.getShoptype() == (24190 & 9683)) {
         var2 = "种族赛积分";
         return "种族赛积分";
      } else if (var0.getShoptype() == (30331 & 3036)) {
         var2 = "比斗奖章";
         return "比斗奖章";
      } else if (var0.getShoptype() == (28413 & 4955)) {
         var2 = "星芒";
         return "星芒";
      } else if (var0.getShoptype() == (23131 & 10238)) {
         var2 = "缘念积分";
         return "缘念积分";
      } else if (var0.getShoptype() == (14943 & 18429)) {
         var2 = "大闹天宫积分";
         return "大闹天宫积分";
      } else if (var0.getShoptype() == (30715 & 4079)) {
         var2 = "竞技积分";
         return "竞技积分";
      } else if (var0.getShoptype() == 1100) {
         var2 = "推广积分";
         return "推广积分";
      } else if (var0.getShoptype() == 505) {
         var2 = "擂台赛积分";
         return "擂台赛积分";
      } else if (var0.getShoptype() == 3000) {
         var2 = "祈福积分";
         return "祈福积分";
      } else if (var0.getShoptype() == 3001) {
         var2 = "斩妖积分";
         return "斩妖积分";
      } else {
         if (var0.getShoptype() == 500) {
            var2 = "幸运奖池积分";
         }

         return var2;
      }
   }

   public void nw(JComponent var1) {
      this.qh = var1;
   }

   public void af(MouseEvent var1) {
      if (this.qh != null) {
         this.zt(var1);
      }
   }

   public Class243(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void zt(MouseEvent var1) {
      if (this.qh instanceof Class293) {
         if (!this.form.aej.t()) {
            Class293 var4 = (Class293)this.qh;
            ((Class570)this.form.ve().e(109 & 62)).agx((Eshop)null, var4.uc());
         }
      } else if (this.qh instanceof Class74) {
         ((Class74)this.qh).cc();
      } else {
         if (this.qh instanceof Class254) {
            if (this.form.aej.t()) {
               return;
            }

            Class254 var3;
            if ((var3 = (Class254)this.qh).u().hr() instanceof Shop) {
               Shop var5;
               if ((var5 = (Shop)var3.u().hr()) == null) {
                  return;
               }

               ((Class570)this.form.ve().e(110 & 61)).agx((Eshop)null, var5);
               return;
            }

            if (var3.u().hr() instanceof Eshop) {
               Eshop var2;
               if ((var2 = (Eshop)var3.u().hr()) == null) {
                  return;
               }

               if (Integer.parseInt(var2.getEshopiid()) < 0) {
                  this.sq(var2);
                  return;
               }

               ((Class570)this.form.ve().e(60 & 111)).agx(var2, (Shop)null);
               return;
            }
         } else if (this.form instanceof Class607) {
            ((Class607)this.form).nw(this.qh);
         }

      }
   }

   public Class243(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.cy = var3;
      Class243 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public Class243(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.cy = var3;
   }

   public void sq(Eshop var1) {
      RoleData var2;
      if ((var2 = this.form.vd()).getPackRecord().b(String.valueOf(-Integer.parseInt(var1.getEshopiid())))) {
         this.form.aej.fw("你已拥有该特效");
      } else if (var2.getLoginResult().getCodecard().compareTo(new BigDecimal(var1.getEshopprice())) < 0) {
         this.form.aej.fw("没有足够的仙玉!");
      } else {
         BuyShopBean var4 = new BuyShopBean();
         int var10002 = 4 ^ 5;
         var4.setAte(3 ^ 3);
         var4.setCd(var1.getEshopid());
         var4.setSum(var10002);
         String var3 = Agreement.getSendTextAES("nbuy", Class695.b().toJson(var4));
         this.form.uw().d(var3);
      }
   }

   public void ab(int var1) {
      this.cy = var1;
   }

   public int ae() {
      return this.cy;
   }
}
