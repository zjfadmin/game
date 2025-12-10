package com.xy;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseSkillData;
import com.xy.formula.GoodType;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.Shop;
import com.xy.readbean.Skill;
import java.awt.Image;
import java.math.BigDecimal;

public class Class467 {
   public String a;
   public static final byte b = 11;
   public static final byte c = 1;
   public static final byte d = 7;
   public static final byte e = 3;
   public static final byte f = 6;
   public static final byte g = 12;
   public static final byte h = 5;
   public BigDecimal i;
   public Object j;
   public String k;
   public static final byte l = 4;
   public static final byte m = 0;
   public static final byte n = 2;
   public byte o;
   public Image p;
   public static final byte q = 8;

   public void a(RoleSummoning var1) {
      if (var1 == null) {
         this.g();
      } else {
         this.o = (byte)(45 & 90);
         this.i = var1.getSid();
         this.p = Class222.t("p" + var1.getSummoningskin());
         this.a = null;
      }
   }

   public void b(RoleTxBean var1) {
      if (var1 == null) {
         this.g();
      } else {
         this.o = (byte)(111 & 23);
         this.i = new BigDecimal(var1.getGid());
         this.p = Class222.i("tx" + var1.getRdId());
         this.a = null;
      }
   }

   public void c(Lingbao var1) {
      if (var1 == null) {
         this.g();
      } else {
         this.o = (byte)(var1.getBaotype().equals("法宝") ? 87 & 46 : 5);
         this.i = var1.getBaoid();
         this.p = Class222.j(var1.getSkin());
         this.a = null;
      }
   }

   public void d(Goodstable var1) {
      this.j((byte)(--1), var1, var1.getUsetime());
   }

   public void e(BaseSkillData var1) {
      if (var1 == null) {
         this.g();
      } else {
         this.o = (byte)(--2);
         this.i = new BigDecimal(var1.getSkill().getSkillid());
         Class467 var10000;
         if (this.i.longValue() > 12000L && this.i.longValue() <= 13000L) {
            var10000 = this;
            this.p = Class222.s(this.i.intValue());
         } else {
            var10000 = this;
            this.p = Class222.g(var1.getSkill().getSkillid());
         }

         var10000.a = null;
      }
   }

   public void f(byte var1, Skill var2, int var3) {
      if (var2 == null) {
         this.g();
      } else {
         this.o = var1;
         this.i = new BigDecimal(var2.getSkillid());
         this.p = Class222.g(var2.getSkillid());
         this.j = var3;
         this.a = null;
      }
   }

   public void g() {
      this.o = (byte)(2 & 5);
      this.i = null;
      this.p = null;
      this.k = null;
      this.j = null;
      this.a = null;
   }

   public void h(Goodstable var1, Class603 var2) {
      if (var1 == null) {
         this.g();
      } else {
         this.o = (byte)(5 >> 2);
         this.i = var1.getRgid();
         this.p = Class222.i(var1.getBaseFly().getSkinGood(var2));
         this.k = GoodType.ag(var1.getType()) ? "" + var1.getUsetime() : null;
         this.a = null;
      }
   }

   public void i(Shop var1) {
      if (var1 == null) {
         this.g();
      } else {
         this.o = (byte)(--3);
         this.i = new BigDecimal(var1.getShopid());
         this.p = Class222.i(var1.getShopskin());
         this.j = var1;
         this.a = null;
      }
   }

   public void j(byte var1, Goodstable var2, int var3) {
      if (var2 == null) {
         this.g();
      } else {
         this.o = var1;
         this.i = var2.getRgid();
         this.p = Class222.i(var2.getSkin());
         this.k = GoodType.ag(var2.getType()) ? String.valueOf(var3) : null;
         if (var2.getType() == 811L) {
            int var4 = var2.getValue().indexOf("|");
            this.a = var2.getValue().substring(var4 + (2 ^ 3)) + "级";
         } else {
            this.a = null;
         }
      }
   }
}
