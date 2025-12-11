package com.xy.w;

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

public class Class14 {
   public static final byte a = 12;
   public Object b;
   public String c;
   public static final byte d = 8;
   public BigDecimal e;
   public static final byte f = 2;
   public static final byte g = 4;
   public static final byte h = 6;
   public static final byte i = 3;
   public static final byte j = 7;
   public static final byte k = 11;
   public byte l;
   public static final byte m = 5;
   public static final byte n = 0;
   public static final byte o = 1;
   public Image p;

   public void a(Goodstable var1, com.xy.v.Class8 var2) {
      if (var1 == null) {
         this.e();
      } else {
         this.l = 1;
         this.e = var1.getRgid();
         this.p = Class15.d(var1.getBaseFly().getSkinGood(var2));
         this.c = GoodType.z(var1.getType()) ? "" + var1.getUsetime() : null;
      }
   }

   public void b(Shop var1) {
      if (var1 == null) {
         this.e();
      } else {
         this.l = 3;
         this.e = new BigDecimal(var1.getShopid());
         this.p = Class15.d(var1.getShopskin());
         this.b = var1;
      }
   }

   public void c(byte var1, Skill var2, int var3) {
      if (var2 == null) {
         this.e();
      } else {
         this.l = var1;
         this.e = new BigDecimal(var2.getSkillid());
         this.p = Class15.h(var2.getSkillid());
         this.b = var3;
      }
   }

   public void d(RoleTxBean var1) {
      if (var1 == null) {
         this.e();
      } else {
         this.l = 7;
         this.e = new BigDecimal(var1.getGid());
         String var10003 = "6P";
         this.p = Class15.d("tx" + var1.getRdId());
      }
   }

   public void e() {
      this.l = 0;
      this.e = null;
      this.p = null;
      this.c = null;
      this.b = null;
   }

   public void f(BaseSkillData var1) {
      if (var1 == null) {
         this.e();
      } else {
         this.l = 2;
         this.e = new BigDecimal(var1.getSkill().getSkillid());
         if (this.e.longValue() > 12000L && this.e.longValue() <= 13000L) {
            this.p = Class15.i(this.e.intValue());
         } else {
            this.p = Class15.h(var1.getSkill().getSkillid());
         }
      }
   }

   public void g(Goodstable var1) {
      this.h((byte)1, var1, var1.getUsetime());
   }

   public void h(byte var1, Goodstable var2, int var3) {
      if (var2 == null) {
         this.e();
      } else {
         this.l = var1;
         this.e = var2.getRgid();
         this.p = Class15.d(var2.getSkin());
         this.c = GoodType.z(var2.getType()) ? String.valueOf(var3) : null;
      }
   }

   public void i(RoleSummoning var1) {
      if (var1 == null) {
         this.e();
      } else {
         this.l = 8;
         this.e = var1.getSid();
         String var10003 = "X";
         this.p = Class15.e("p" + var1.getSummoningskin());
      }
   }

   public void j(Lingbao var1) {
      if (var1 == null) {
         this.e();
      } else {
         String var10001 = var1.getBaotype();
         String var10002 = "沈寇";
         this.l = (byte)(var10001.equals("法宝") ? 6 : 5);
         this.e = var1.getBaoid();
         this.p = Class15.b(var1.getSkin());
      }
   }
}
