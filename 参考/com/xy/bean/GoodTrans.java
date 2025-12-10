package com.xy.bean;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodTrans {
   private List<RoleSummoning> pets;
   private BigDecimal money;
   private List<Lingbao> lingbaos;
   private List<Goodstable> goods;

   public Goodstable getGood(int var1) {
      return this.goods != null && this.goods.size() > var1 ? (Goodstable)this.goods.get(var1) : null;
   }

   public void setPets(List<RoleSummoning> var1) {
      this.pets = var1;
   }

   public void setMoney(BigDecimal var1) {
      this.money = var1;
   }

   public Lingbao getLingbao(int var1) {
      return this.lingbaos != null && this.lingbaos.size() > var1 ? (Lingbao)this.lingbaos.get(var1) : null;
   }

   public RoleSummoning getPet(int var1) {
      return this.pets != null && this.pets.size() > var1 ? (RoleSummoning)this.pets.get(var1) : null;
   }

   public void a(Graphics var1, int var2) {
      var1.setColor(Color.white);
      int var3;
      if (this.goods != null) {
         for(int var10000 = var3 = 5 >> 3; var10000 < this.goods.size(); var10000 = var3) {
            int var4 = 20 + var3 % --4 * (59 & 119);
            int var5 = (13797 & 19327) + var3 / --4 * (59 & 119);
            if (var2 == --1) {
               var4 += 270;
            }

            String var10001 = ((Goodstable)this.goods.get(var3)).getUsetime().toString();
            int var10002 = var4 + --4 + (127 & 23);
            int var10003 = var5 + (111 & 29);
            ++var3;
            var1.drawString(var10001, var10002, var10003 - (63 & 77));
         }
      }

   }

   public BigDecimal getMoney() {
      return this.money;
   }

   public void setGoods(List<Goodstable> var1) {
      this.goods = var1;
   }

   public List<Goodstable> getGoods() {
      return this.goods;
   }

   public Goodstable getGood(BigDecimal var1) {
      if (this.goods == null) {
         return null;
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.goods.size(); var10000 = var2) {
            if (((Goodstable)this.goods.get(var2)).getRgid().compareTo(var1) == 0) {
               return (Goodstable)this.goods.get(var2);
            }

            ++var2;
         }

         return null;
      }
   }

   public void b(GoodTrans2 var1) {
      this.setGood(var1.getGoods());
      this.setPet(var1.getPet(), var1.a());
      this.setLingbao(var1.getLingbao(), var1.a());
      if (var1.getMoney() != null) {
         this.money = var1.getMoney();
      }

   }

   public void setLingbao(Lingbao var1, boolean var2) {
      if (var1 != null) {
         if (this.lingbaos == null) {
            this.lingbaos = new ArrayList();
         }

         if (var2) {
            this.lingbaos.add(var1);
         } else {
            int var3;
            for(int var10000 = var3 = this.lingbaos.size() - (3 & 5); var10000 >= 0; var10000 = var3) {
               if (((Lingbao)this.lingbaos.get(var3)).getBaoid().compareTo(var1.getBaoid()) == 0) {
                  this.lingbaos.remove(var3);
                  return;
               }

               --var3;
            }

         }
      }
   }

   public void setLingbaos(List<Lingbao> var1) {
      this.lingbaos = var1;
   }

   public void setPet(RoleSummoning var1, boolean var2) {
      if (var1 != null) {
         if (this.pets == null) {
            this.pets = new ArrayList();
         }

         if (var2) {
            this.pets.add(var1);
         } else {
            int var3;
            for(int var10000 = var3 = this.pets.size() - (3 & 5); var10000 >= 0; var10000 = var3) {
               if (((RoleSummoning)this.pets.get(var3)).getSid().compareTo(var1.getSid()) == 0) {
                  this.pets.remove(var3);
                  return;
               }

               --var3;
            }

         }
      }
   }

   public List<RoleSummoning> getPets() {
      return this.pets;
   }

   public void setGood(Goodstable var1) {
      if (var1 != null) {
         if (this.goods == null) {
            this.goods = new ArrayList();
         }

         int var2;
         for(int var10000 = var2 = this.goods.size() - (3 & 5); var10000 >= 0; var10000 = var2) {
            if (((Goodstable)this.goods.get(var2)).getRgid().compareTo(var1.getRgid()) == 0) {
               if (var1.getUsetime() <= 0) {
                  this.goods.remove(var2);
                  return;
               }

               this.goods.set(var2, var1);
               return;
            }

            --var2;
         }

         if (var1.getUsetime() > 0) {
            this.goods.add(var1);
         }

      }
   }

   public boolean setPet(RoleSummoning var1) {
      if (var1 == null) {
         return (boolean)(3 ^ 3);
      } else {
         if (this.pets == null) {
            this.pets = new ArrayList();
         }

         int var2;
         for(int var10000 = var2 = this.pets.size() - (2 ^ 3); var10000 >= 0; var10000 = var2) {
            if (((RoleSummoning)this.pets.get(var2)).getSid().compareTo(var1.getSid()) == 0) {
               var10000 = 2 & 5;
               this.pets.remove(var2);
               return (boolean)var10000;
            }

            --var2;
         }

         if (this.pets.size() >= --2) {
            return (boolean)(2 & 5);
         } else {
            this.pets.add(var1);
            return (boolean)(--1);
         }
      }
   }

   public boolean setLingbao(Lingbao var1) {
      if (var1 == null) {
         return (boolean)(2 & 5);
      } else {
         if (this.lingbaos == null) {
            this.lingbaos = new ArrayList();
         }

         int var2;
         for(int var10000 = var2 = this.lingbaos.size() - (4 ^ 5); var10000 >= 0; var10000 = var2) {
            if (((Lingbao)this.lingbaos.get(var2)).getBaoid().compareTo(var1.getBaoid()) == 0) {
               var10000 = 3 & 4;
               this.lingbaos.remove(var2);
               return (boolean)var10000;
            }

            --var2;
         }

         if (this.lingbaos.size() >= 5 >> 1) {
            return (boolean)(5 >> 3);
         } else {
            this.lingbaos.add(var1);
            return (boolean)(--1);
         }
      }
   }

   public List<Lingbao> getLingbaos() {
      return this.lingbaos;
   }
}
