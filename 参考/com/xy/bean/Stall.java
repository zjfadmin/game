package com.xy.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stall {
   private List<String> msg2;
   private int y;
   private String role;
   private int id;
   private Commodity[] goodstables;
   private List<StallNeedBean> needs;
   private int state;
   private Commodity[] pets;
   private int mapid;
   private List<String> msg;
   private String stall;
   private int x;
   private BigDecimal roleid;

   public Commodity getGood(BigDecimal var1) {
      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.goodstables.length; var10000 = var2) {
         if (this.goodstables[var2] != null && this.goodstables[var2].getGood().getRgid().compareTo(var1) == 0) {
            return this.goodstables[var2];
         }

         ++var2;
      }

      return null;
   }

   public boolean a(int var1) {
      StallNeedBean var2;
      if ((var2 = this.getStallNeedBean(var1)) == null) {
         return (boolean)(3 & 4);
      } else {
         this.needs.remove(var2);
         if (this.needs.size() == 0) {
            this.needs = null;
         }

         return true;
      }
   }

   public String getStall() {
      return this.stall;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public Commodity[] getGoodstables() {
      return this.goodstables;
   }

   public Stall() {
      int var10001 = 90 & 61;
      super();
      Commodity[] var1 = new Commodity[var10001];
      boolean var10003 = true;
      this.goodstables = var1;
      var1 = new Commodity[--5];
      var10003 = true;
      this.pets = var1;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public String b() {
      return "";
   }

   public void setRole(String var1) {
      this.role = var1;
   }

   public boolean c(StallNeedBean var1) {
      Stall var10000;
      if (this.needs == null) {
         this.needs = new ArrayList();
         var10000 = this;
      } else {
         if (this.needs.size() >= (122 & 29)) {
            return (boolean)(2 & 5);
         }

         if (this.getStallNeedBean(var1.getId()) != null) {
            return (boolean)(5 >> 3);
         }

         var10000 = this;
      }

      var10000.needs.add(var1);
      return (boolean)(4 ^ 5);
   }

   public void setState(int var1) {
      this.state = var1;
   }

   public String getRole() {
      return this.role;
   }

   public String d() {
      StringBuffer var1 = new StringBuffer();

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.pets.length; var10000 = var2) {
         if (this.pets[var2] != null && this.pets[var2].getPet() != null) {
            if (var1.length() != 0) {
               var1.append("|");
            }

            var1.append(this.pets[var2].getPet().getSid());
            var1.append(",");
            var1.append(4 ^ 5);
            var1.append(",");
            var1.append(this.pets[var2].getMoney());
         }

         ++var2;
      }

      return var1.toString();
   }

   public void setGoodstables(Commodity[] var1) {
      this.goodstables = var1;
   }

   public StallNeedBean getStallNeedBean(int var1) {
      if (this.needs == null) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.needs.iterator(); var10000.hasNext(); var10000 = var3) {
            StallNeedBean var2;
            if ((var2 = (StallNeedBean)var3.next()).getId() == var1) {
               return var2;
            }
         }

         return null;
      }
   }

   public int getX() {
      return this.x;
   }

   public Commodity getCommodity(int var1, int var2) {
      if (var1 == 0) {
         return this.goodstables[var2];
      } else {
         return var1 == 5 >> 2 ? this.pets[var2] : null;
      }
   }

   public BigDecimal getRoleid() {
      return this.roleid;
   }

   public int getPath(int var1) {
      int var10000;
      int var2;
      if (var1 == 0) {
         for(var10000 = var2 = 3 >> 2; var10000 < this.goodstables.length; var10000 = var2) {
            if (this.goodstables[var2] == null) {
               return var2;
            }

            ++var2;
         }
      } else if (var1 == 3 >> 1) {
         for(var10000 = var2 = 3 ^ 3; var10000 < this.pets.length; var10000 = var2) {
            if (this.pets[var2] == null) {
               return var2;
            }

            ++var2;
         }
      }

      return -1;
   }

   public List<String> getMsg2() {
      return this.msg2;
   }

   public void setMapid(int var1) {
      this.mapid = var1;
   }

   public void setMsg(List<String> var1) {
      this.msg = var1;
   }

   public String e() {
      StringBuffer var1 = new StringBuffer();
      if (this.needs == null) {
         return var1.toString();
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.needs.size(); var10000 = var2) {
            StallNeedBean var3;
            if ((var3 = (StallNeedBean)this.needs.get(var2)).getTotal() - var3.getNum() > 0) {
               if (var1.length() != 0) {
                  var1.append("|");
               }

               var1.append(var3.getId());
               var1.append(",");
               var1.append(var3.getTotal() - var3.getNum());
               var1.append(",");
               var1.append(var3.getMoney());
            }

            ++var2;
         }

         return var1.toString();
      }
   }

   public void setMsg2(List<String> var1) {
      this.msg2 = var1;
   }

   public int getNeedNum() {
      if (this.needs == null) {
         return 5 >> 3;
      } else {
         int var1 = 0;
         Iterator var3;
         Iterator var10000 = var3 = this.needs.iterator();

         while(var10000.hasNext()) {
            StallNeedBean var2;
            if ((var2 = (StallNeedBean)var3.next()).getNum() >= var2.getTotal()) {
               var10000 = var3;
            } else {
               ++var1;
               var10000 = var3;
            }
         }

         return var1;
      }
   }

   public List<String> getMsg() {
      return this.msg;
   }

   public Commodity[] getPets() {
      return this.pets;
   }

   public List<StallNeedBean> getNeeds() {
      return this.needs;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setStall(String var1) {
      this.stall = var1;
   }

   public void setPets(Commodity[] var1) {
      this.pets = var1;
   }

   public int getY() {
      return this.y;
   }

   public boolean f(Commodity var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.goodstables.length; var10000 = var2) {
         if (this.goodstables[var2] != null && this.goodstables[var2] == var1) {
            return (boolean)(4 ^ 5);
         }

         ++var2;
      }

      for(var10000 = var2 = 3 & 4; var10000 < this.pets.length; var10000 = var2) {
         if (this.pets[var2] != null && this.pets[var2] == var1) {
            return (boolean)(--1);
         }

         ++var2;
      }

      return (boolean)(2 & 5);
   }

   public String g() {
      StringBuffer var1 = new StringBuffer();

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.goodstables.length; var10000 = var2) {
         if (this.goodstables[var2] != null && this.goodstables[var2].getGood() != null) {
            if (var1.length() != 0) {
               var1.append("|");
            }

            var1.append(this.goodstables[var2].getGood().getRgid());
            var1.append(",");
            var1.append(this.goodstables[var2].getGood().getUsetime());
            var1.append(",");
            var1.append(this.goodstables[var2].getMoney());
         }

         ++var2;
      }

      return var1.toString();
   }

   public int getId() {
      return this.id;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }

   public boolean h(int var1) {
      int var10000;
      int var2;
      if (var1 == 0) {
         for(var10000 = var2 = 5 >> 3; var10000 < this.goodstables.length; var10000 = var2) {
            if (this.goodstables[var2] != null) {
               return (boolean)(5 >> 2);
            }

            ++var2;
         }
      } else if (var1 == (2 ^ 3)) {
         for(var10000 = var2 = 3 >> 2; var10000 < this.pets.length; var10000 = var2) {
            if (this.pets[var2] != null) {
               return (boolean)(3 >> 1);
            }

            ++var2;
         }
      } else if (var1 != 5 >> 1 && var1 == --3) {
         if (this.needs == null) {
            return (boolean)(3 ^ 3);
         }

         for(var10000 = var2 = 0; var10000 < this.needs.size(); var10000 = var2) {
            StallNeedBean var3;
            if ((var3 = (StallNeedBean)this.needs.get(var2)).getNum() < var3.getTotal()) {
               return (boolean)(5 >> 2);
            }

            ++var2;
         }
      }

      return false;
   }

   public int getMapid() {
      return this.mapid;
   }

   public int getState() {
      return this.state;
   }

   public int i(Commodity var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 < this.goodstables.length; var10000 = var2) {
         if (this.goodstables[var2] != null && this.goodstables[var2] == var1) {
            this.goodstables[var2] = null;
            return var2;
         }

         ++var2;
      }

      for(var10000 = var2 = 3 >> 2; var10000 < this.pets.length; var10000 = var2) {
         if (this.pets[var2] != null && this.pets[var2] == var1) {
            this.pets[var2] = null;
            return var2;
         }

         ++var2;
      }

      return -4 >> 2;
   }

   public Commodity getPet(BigDecimal var1) {
      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.pets.length; var10000 = var2) {
         if (this.pets[var2] != null && this.pets[var2].getPet().getSid().compareTo(var1) == 0) {
            return this.pets[var2];
         }

         ++var2;
      }

      return null;
   }
}
