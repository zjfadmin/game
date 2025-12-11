package com.xy.i;

import com.xy.a.q.Class102;
import com.xy.a.q.Class106;
import com.xy.a.q.Class29;
import com.xy.a.q.Class71;
import com.xy.a.q.Class90;
import com.xy.bean.BuyShopBean;
import com.xy.game.RoleData;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.readbean.Eshop;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.v.Class31;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JComponent;

public class Class16 extends Class1 {
   private int eg;
   private JComponent xp;

   public void n(int var1) {
      this.eg = var1;
   }

   public void ajh(JComponent var1) {
      this.xp = var1;
   }

   public void aji(MouseEvent var1) {
      if (this.xp instanceof Class29) {
         if (!this.form.afx.ah()) {
            Class29 var5 = (Class29)this.xp;
            ((Class90)this.form.zc().j(44)).ahb(null, var5.ou());
         }
      } else if (this.xp instanceof Class71) {
         ((Class71)this.xp).t();
      } else {
         if (this.xp instanceof Class102) {
            if (this.form.afx.ah()) {
               return;
            }

            Class102 var2;
            if ((var2 = (Class102)this.xp).ep().jx() instanceof Shop) {
               Shop var6;
               if ((var6 = (Shop)var2.ep().jx()) == null) {
                  return;
               }

               ((Class90)this.form.zc().j(44)).ahb(null, var6);
               return;
            }

            if (var2.ep().jx() instanceof Eshop) {
               Eshop var3;
               if ((var3 = (Eshop)var2.ep().jx()) == null) {
                  return;
               }

               if (Integer.parseInt(var3.getEshopiid()) < 0) {
                  this.qw(var3);
                  return;
               }

               ((Class90)this.form.zc().j(44)).ahb(var3, null);
               return;
            }
         } else if (this.form instanceof Class106) {
            ((Class106)this.form).ajh(this.xp);
         }
      }
   }

   public int il() {
      return this.eg;
   }

   public static String ajj(Shop var0, Class30 var1) {
      String var10000 = "醸钘";
      String var2 = "金钱";
      if (var0.getShoptype() == 45) {
         var10000 = "帹徾秞刪";
         var2 = "师徒积分";
         return "师徒积分";
      } else if (var0.getShoptype() == 89) {
         var10000 = "纸玠";
         var2 = "绑玉";
         return "绑玉";
      } else if (var0.getShoptype() == 10) {
         var10000 = "夘庁秞刪";
         var2 = "天庭积分";
         return "天庭积分";
      } else if (var0.getShoptype() == 61) {
         var10000 = "幇戱禆刯";
         var2 = "帮战积分";
         return "帮战积分";
      } else if (var0.getShoptype() == 120) {
         var10000 = "夋雰塸秞刪";
         var2 = "大雁塔积分";
         return "大雁塔积分";
      } else if (var0.getShoptype() == 121) {
         var10000 = "坙宂禆刯";
         var2 = "地宫积分";
         return "地宫积分";
      } else if (var0.getShoptype() == 123) {
         var10000 = "寊芟秞刪";
         var2 = "寻芳积分";
         return "寻芳积分";
      } else if (var0.getShoptype() == 124) {
         if (var1.za().l(2, 3)) {
            var10000 = "分朅禆刯";
            var10000 = "副本积分";
         } else {
            var10000 = "朙魭秞刪";
            var10000 = "木魁积分";
         }

         return var10000;
      } else if (var0.getShoptype() == 126) {
         var10000 = "汝陯禆刯";
         var2 = "水陆积分";
         return "水陆积分";
      } else if (var0.getShoptype() == 127) {
         var10000 = "剞最秞刪";
         var2 = "副本积分";
         return "副本积分";
      } else if (var0.getShoptype() == 1106) {
         var10000 = "秤斦赲禆刯";
         var2 = "种族赛积分";
         return "种族赛积分";
      } else if (var0.getShoptype() == 600) {
         var10000 = "毥斻奧竌";
         var2 = "比斗奖章";
         return "比斗奖章";
      } else if (var0.getShoptype() == 601) {
         var10000 = "晶芻";
         var2 = "星芒";
         return "星芒";
      } else if (var0.getShoptype() == 605) {
         var10000 = "外闕夘宇秞刪";
         var2 = "大闹天宫积分";
         return "大闹天宫积分";
      } else if (var0.getShoptype() == 2027) {
         var10000 = "窷抩禆刯";
         var2 = "竞技积分";
         return "竞技积分";
      } else if (var0.getShoptype() == 1100) {
         var10000 = "掙幓秞刪";
         var2 = "推广积分";
         return "推广积分";
      } else if (var0.getShoptype() == 505) {
         var10000 = "擫厙赲禆刯";
         var2 = "擂台赛积分";
         return "擂台赛积分";
      } else if (var0.getShoptype() == 3000) {
         var10000 = "祹禣秞刪";
         var2 = "祈福积分";
         return "祈福积分";
      } else if (var0.getShoptype() == 3001) {
         var10000 = "旀妿禆刯";
         var2 = "斩妖积分";
         return "斩妖积分";
      } else {
         if (var0.getShoptype() == 500) {
            var10000 = "幉迼奧汌秞刪";
            var2 = "幸运奖池积分";
         }

         return var2;
      }
   }

   public Class16(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.eg = var3;
      Class16 var10000;
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

   public Class16(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   public void qw(Eshop var1) {
      RoleData var2;
      if ((var2 = this.form.yx()).getPackRecord().f(String.valueOf(-Integer.parseInt(var1.getEshopiid())))) {
         String var5 = "佉嶛拌杠诌爐敡";
         this.form.afx.dp("你已拥有该特效");
      } else if (var2.getLoginResult().getCodecard().compareTo(new BigDecimal(var1.getEshopprice())) < 0) {
         String var10001 = "沐朥趂夳皵仵玸\r";
         this.form.afx.dp("没有足够的仙玉!");
      } else {
         BuyShopBean var3 = new BuyShopBean();
         var3.setAte(0);
         var3.setCd(var1.getEshopid());
         var3.setSum(1);
         String var4 = Agreement.getSendTextAES("nbuy", Class31.a().toJson(var3));
         this.form.za().k(var4);
      }
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.xp != null) {
         this.aji(var1);
      }
   }

   public Class16(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.eg = var3;
   }
}
