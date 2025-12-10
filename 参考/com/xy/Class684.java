package com.xy;

import com.xy.bean.BuyShopBean;
import com.xy.bean.ShopGoodsBean;
import com.xy.game.HandleOption;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class684 extends Class345 {
   private MoneyType aaw;
   private List<Shop> anh;
   private Class529[] wz;
   private Class556 ani;
   private Class505 anj;
   private Class529 dq;
   private Shop ank;
   private int gc;
   private Class245 rd;
   private Class245 pu;
   private JLabel[] c;
   private Integer anl;
   private Class319 anm;
   private Class436 bl;
   private Class245 abf;

   public void d() {
      if (this.ank == null) {
         this.aej.fw("没有选中的商品");
      } else {
         int var1;
         if ((var1 = (int)this.anm.gl()) <= 0) {
            this.aej.fw("购买数量不能为0");
         } else {
            BuyShopBean var2 = new BuyShopBean();
            BuyShopBean var10000;
            if (this.gc == --1) {
               var10000 = var2;
               var2.setAte(--3);
               var2.setnId(this.anl);
            } else {
               var10000 = var2;
               var2.setAte(--1);
            }

            HandleOption.b(var10000, this.ank, var1, this.aaw, this.aej);
         }
      }
   }

   public void em(Shop var1, boolean var2) {
      if (this.ank != null && this.ank == var1) {
         long var5 = this.anm.gl() + (long)(var2 ? 103 & 123 : 1);
         this.anm.jj().setText(String.valueOf(var5));
      } else {
         this.ank = var1;
         if (this.ank == null) {
            Class681.j(this.abf, 0L);
            this.anm.jj().setText("0");
         } else {
            int var3 = var2 ? 127 & 99 : 1;
            Class681.j(this.abf, var1.getShopprice());
            this.anm.jj().setText(String.valueOf(var3));
            if (var1.getIsPrice() != null) {
               String var4 = Agreement.getSendTextAES("shopPrice", "1|" + var1.getShopid());
               this.uw().d(var4);
            }

         }
      }
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(this.ank != null ? --1 : 0);
   }

   public Class684(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      super(87 & 63, --2, Class345.aef, var1);
      this.va(var10005, 3 & 4, 12159 & 20990, 13199 & 19959, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 124 & 71, 124 & 71, 124 & 71, 124 & 71, (boolean)(3 >> 2)), " 购 买 ");
      Class529[] var10 = new Class529[var10001];
      boolean var10003 = true;
      this.wz = var10;

      int var2;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.wz.length; var10000 = var2) {
         Class529[] var9 = this.wz;
         Class529 var10002 = new Class529;
         var10005 = --2;
         int var10006 = (87 & 121) + var2;
         Font var10007 = Class681.cw;
         String var10009;
         Class684 var10010;
         if (var2 == 0) {
            var10009 = "仙玉";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "金钱";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var9[var2] = var10002;
         this.wz[var2].setOffsetTexts(Class681.cl);
         this.wz[var2].setBounds((127 & 48) + (121 & 71) * var2, 110 & 29, 127 & 63, 88 & 63);
         this.add(this.wz[var2++]);
      }

      this.dq = new Class529("sc/e/31.png", --1, 95 & 123, Class681.ak, Class681.c, "购 买", this);
      this.dq.setBounds(8558 & 24479, 503 & 32607, 111 & 95, 29 & 123);
      this.add(this.dq);
      this.abf = Class133.a(113 & 110, 273, 154, 19, 10, Color.white, Class681.q);
      Class217 var8 = Class133.n(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)), Class681.q, Color.white);
      var8.setBounds(96, 298, 154, 19);
      var8.setHorizontalAlignment(10);
      this.anm = new Class319(15, var8, this);
      this.rd = Class133.a(96, 323, 154, 19, 10, Color.white, Class681.q);
      this.aaw = new MoneyType();
      this.aaw.setIdAndKey(2 ^ 3, "现 金");
      this.ani = Class133.m(96, 348, 154, 19, 10, Color.white, Class681.q, this.aaw, var1);
      this.abf.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(5 >> 3)));
      this.rd.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.ani.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.add(this.abf);
      this.add(var8);
      this.add(this.rd);
      this.add(this.ani);
      JLabel[] var11 = new JLabel[--4];
      var10003 = true;
      this.c = var11;

      int var6;
      for(var10000 = var6 = 2 & 5; var10000 < this.c.length; var10000 = var6) {
         this.c[var6] = Class133.c(--5, 273 + 25 * var6, 90, 19, --4, Class681.c("#c000000"), Class681.ak);
         this.c[var6].setText(var6 == 0 ? "单 价" : (var6 == 5 >> 2 ? "数 量" : (var6 == --2 ? "总 额" : (var6 == --3 ? "现 金" : ""))));
         this.add(this.c[var6++]);
      }

      var10000 = --4;
      this.bl = new Class436();
      this.bl.eq(Class511.q("sc/d/19.png", 30, 30, 30, 30, (boolean)(3 ^ 3)));
      this.bl.setBounds(44, 36, 309, 207);
      this.add(this.bl);
      Class216[] var12 = new Class216[var10000];
      boolean var14 = true;
      Class216[] var7 = var12;

      for(var10000 = var2 = 3 ^ 3; var10000 < var7.length; var10000 = var2) {
         int var3 = -1 + var2;
         String var4 = var2 == 0 ? "首页" : (var2 == --1 ? "上页" : (var2 == (1 ^ 3) ? "下页" : "尾页"));
         int var5 = var2 == 0 ? 260 : (var2 == 5 >> 2 ? 294 : (var2 == --2 ? 374 : 408));
         var7[var2] = new Class216("sc/e/6.png", 3 & 5, var4, var3, this);
         var7[var2].setOffsetTexts(Class681.am);
         var7[var2].setBounds(var5 - 152, 247, 34, 18);
         this.add(var7[var2++]);
      }

      this.pu = Class133.a(176, 247, 46, 18, 2 & 5, Color.white, Class681.ce);
      this.pu.eq(Class511.q("sc/d/17.png", 3, 3, 3, 3, (boolean)(2 & 5)));
      this.add(this.pu);
      this.anj = new Class505(this, 6, 4, 51, 51, 3 & 4, 3 & 4, 45, 38);
      this.anj.hf(Class511.a("sc/d/18.png"));
      this.anj.aix(var7, 1);
      this.anj.ak(true);
      this.add(this.anj);
      this.anj.aiz().k(this.pu);
   }

   public void z(long var1, JTextField var3) {
      if (var1 <= 0L) {
         Class681.j(this.rd, 0L);
      } else if (this.ank != null) {
         Class681.j(this.rd, this.ank.getShopprice() * var1);
      } else {
         Class681.j(this.rd, 0L);
      }
   }

   public void as(int var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.wz.length; var10000 = var2) {
         this.wz[var2].setKeep((boolean)(var1 == var2 ? 4 ^ 5 : 0));
         ++var2;
      }

      Class684 var5;
      if (var1 == 0) {
         var5 = this;
         this.aaw.setIdAndKey(--3, "仙 玉");
      } else {
         if (var1 == (2 ^ 3)) {
            this.aaw.setIdAndKey(--1, "现 金");
         }

         var5 = this;
      }

      var5.c[--3].setText(this.aaw.getKey());
      ArrayList var4 = new ArrayList();
      var1 = var1 == 0 ? 4 ^ 5 : 0;

      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < this.anh.size(); var10000 = var3) {
         if (((Shop)this.anh.get(var3)).getShoptype() == var1) {
            var4.add((Shop)this.anh.get(var3));
         }

         ++var3;
      }

      this.anj.ck(var4);
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 >= 0L && this.ank != null) {
         long var4;
         if ((var4 = this.vd().getMoney(this.aaw) / this.ank.getShopprice()) < var1 && var4 <= 999L) {
            return var4;
         } else {
            return var1 > 999L ? 999L : null;
         }
      } else {
         return 0L;
      }
   }

   public void el(String var1, long var2) {
      if (this.ank != null && this.ank.getShopid().equals(var1)) {
         this.ank.setShopprice(var2);
         Class681.j(this.abf, this.ank.getShopprice());
         this.anm.jj().setText(String.valueOf(this.anm.gl()));
      }

   }

   public void afi(List<Shop> var1, int var2, BigDecimal var3) {
      BigDecimal var10000;
      if (var2 == (127 & 45)) {
         var10000 = var3;
         this.aaw.setIdAndKey(2 & 5, "师徒积分");
      } else if (var2 == (111 & 26)) {
         var10000 = var3;
         this.aaw.setIdAndKey(3 >> 2, "天庭积分");
      } else if (var2 == (127 & 61)) {
         var10000 = var3;
         this.aaw.setIdAndKey(2 & 5, "帮战积分");
      } else if (var2 == (124 & 123)) {
         var10000 = var3;
         this.aaw.setIdAndKey(3 ^ 3, "大雁塔积分");
      } else if (var2 == (125 & 123)) {
         var10000 = var3;
         this.aaw.setIdAndKey(3 >> 2, "地宫积分");
      } else if (var2 == (123 & 127)) {
         var10000 = var3;
         this.aaw.setIdAndKey(3 >> 2, "寻芳积分");
      } else if (var2 == (125 & 126)) {
         this.aaw.setIdAndKey(3 & 4, this.uw().n(5 >> 1, --3) ? "副本积分" : "木魁积分");
         var10000 = var3;
      } else if (var2 == (127 & 126)) {
         var10000 = var3;
         this.aaw.setIdAndKey(5 >> 3, "水陆积分");
      } else if (var2 == (127 & 127)) {
         var10000 = var3;
         this.aaw.setIdAndKey(3 & 4, "副本积分");
      } else if (var2 == (8063 & 25810)) {
         var10000 = var3;
         this.aaw.setIdAndKey(5 >> 3, "种族赛积分");
      } else if (var2 == (13310 & 19957)) {
         var10000 = var3;
         this.aaw.setIdAndKey(2 & 5, "幸运奖池积分");
      } else if (var2 == (29515 & 3767)) {
         var10000 = var3;
         this.aaw.setIdAndKey(5 >> 3, "擂台赛积分");
      } else if (var2 == (1887 & 31485)) {
         var10000 = var3;
         this.aaw.setIdAndKey(2 & 5, "大闹天宫积分");
      } else if (var2 == (95 & 121)) {
         var10000 = var3;
         this.aaw.setIdAndKey(1 ^ 3, "绑 玉");
      } else if (var2 == (14331 & 20463)) {
         var10000 = var3;
         this.aaw.setIdAndKey(2 & 5, "竞技积分");
      } else {
         this.aaw.setIdAndKey(5 >> 2, "现 金");
         var10000 = var3;
      }

      if (var10000 != null) {
         this.aaw.setIdAndMax(-4 >> 2, var3.longValue());
      }

      int var10004 = 5 >> 3;
      this.ani.cc();
      this.anl = null;
      this.c[--3].setText(this.aaw.getKey());
      this.y(var10004);
      this.anj.ck(var1);
      this.em((Shop)null, (boolean)(2 & 5));
   }

   public void y(int var1) {
      int var10000;
      if ((this.gc = var1) == --1) {
         for(var10000 = var1 = 3 >> 2; var10000 < this.wz.length; var10000 = var1) {
            this.wz[var1++].setVisible((boolean)(3 >> 1));
         }

      } else {
         for(var10000 = var1 = 0; var10000 < this.wz.length; var10000 = var1) {
            this.wz[var1++].setVisible((boolean)(5 >> 3));
         }

      }
   }

   public void afj(ShopGoodsBean var1) {
      if (var1.getType() == 0) {
         int var10001 = 2 & 5;
         this.anl = var1.getnId();
         this.anh = var1.getShopList();
         this.as(var10001);
      }

      this.em((Shop)null, (boolean)(2 & 5));
      this.ani.cc();
   }
}
