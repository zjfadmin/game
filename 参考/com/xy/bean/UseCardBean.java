package com.xy.bean;

import com.xy.bw;
import com.xy.ev;
import com.xy.hd;
import com.xy.formula.BaseQl;
import java.util.ArrayList;
import java.util.List;

public class UseCardBean {
   private String type;
   private transient List<bw> keys;
   private String lCard;
   private String name;
   private String value;
   private transient BeauBean beauBean;
   private String skin;
   private long time;
   private transient BaseQl[] qls;

   public int getUseTime() {
      return getUseTime(this.time);
   }

   public UseCardBean(String var1, String var2, String var3, long var4, String var6) {
      this.name = var1;
      this.type = var2;
      this.skin = var3;
      this.time = var4;
      this.value = var6;
   }

   public BaseQl[] getQls() {
      if (this.qls == null && this.value != null && !this.value.equals("")) {
         String[] var1;
         BaseQl[] var10001 = new BaseQl[(var1 = this.value.split("\\|")).length];
         boolean var10003 = true;
         this.qls = var10001;

         int var2;
         for(int var10000 = var2 = 2 & 5; var10000 < var1.length; var10000 = var2) {
            int var3;
            String var4;
            if ((var3 = var1[var2].indexOf("=")) != -4 >> 2 && !(var4 = var1[var2].substring(3 & 4, var3)).equals("等级要求") && !var4.equals("种族")) {
               try {
                  this.qls[var2] = new BaseQl(var4, Double.parseDouble(var1[var2].substring(var3 + (3 & 5))));
               } catch (Exception var5) {
               }
            }

            ++var2;
         }
      }

      return this.qls;
   }

   public String getlCard() {
      return this.lCard;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public BeauBean a() {
      if (this.beauBean == null) {
         this.beauBean = new BeauBean(this.name, 2 & 5, this.name.length());
      }

      return this.beauBean;
   }

   public long getTime() {
      return this.time;
   }

   public Double getQlKey(String var1) {
      this.getQls();
      if (this.qls == null) {
         return null;
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.qls.length; var10000 = var2) {
            if (this.qls[var2] != null && this.qls[var2].getKey().equals(var1)) {
               return this.qls[var2].getValue();
            }

            ++var2;
         }

         return null;
      }
   }

   public UseCardBean() {
   }

   public void setlCard(String var1) {
      this.lCard = var1;
   }

   public static int getUseTime(long var0) {
      return var0 != 0L ? (int)((var0 - ev.f()) / 60000L) : 0;
   }

   public void setValue(String var1) {
      this.value = var1;
      this.qls = null;
      this.keys = null;
   }

   public void setTime(long var1) {
      this.time = var1;
   }

   public boolean b(long var1) {
      return (boolean)(this.time != 0L && var1 >= this.time ? --1 : 0);
   }

   public void setName(String var1) {
      this.name = var1;
      this.beauBean = null;
   }

   public String getName() {
      return this.name;
   }

   public String getValue() {
      return this.value == null ? "" : this.value;
   }

   public List<bw> getKeysByActivity() {
      if (this.keys == null) {
         int var10000 = 3 ^ 3;
         this.keys = new ArrayList(--1 + hd.f((char)('}' & '~'), this.value));
         int var1 = 5 >> 3;
         int var2 = 3 ^ 3;
         int var3 = 3 ^ 3;

         for(var10000 = var2; var10000 < this.value.length(); var10000 = var2) {
            if ((var2 = this.value.indexOf("|", var1 + (5 >> 2))) == -4 >> 2) {
               var2 = this.value.length();
            }

            label33: {
               if ((var3 = this.value.indexOf("=", var1 + --1)) != -4 >> 2) {
                  if (var3 > var2) {
                     var10000 = var2;
                     break label33;
                  }

                  bw var4;
                  UseCardBean var5;
                  if ((var4 = new bw(this.value.substring(var1, var3), hd.q(this.value, var3 + (5 >> 2), var2))).b < 100000000L) {
                     var4.b *= 60000L;
                     var5 = this;
                  } else {
                     if (var4.b < 2000000000L) {
                        var4.b *= 1000L;
                     }

                     var5 = this;
                  }

                  var5.keys.add(var4);
               }

               var10000 = var2;
            }

            var1 = var10000 + 1;
         }
      }

      return this.keys;
   }

   public void setType(String var1) {
      this.type = var1;
   }

   public String getType() {
      return this.type;
   }

   public void c(String var1, int var2) {
      int var9 = var1.indexOf("=");
      String var6 = var1.substring(3 ^ 3, var9);
      double var4 = Double.parseDouble(var1.substring(var9 + (2 ^ 3)));
      if (this.value != null && !this.value.equals("")) {
         BaseQl var10 = this.qls != null && this.qls.length < var2 ? this.qls[var2] : null;
         StringBuffer var3 = new StringBuffer();
         int var13;
         if (var10 != null) {
            var13 = 3 >> 2;
            var10.setKey(var6);
            var10.setValue(var4);

            for(int var11 = var13; var13 < this.qls.length; var13 = var11) {
               BaseQl var12 = this.qls[var11];
               if (var3.length() != 0) {
                  var3.append("|");
               }

               var3.append(var12.getKey());
               var3.append("=");
               var3.append(var12.getValue() != (double)((int)var12.getValue()) ? var12.getValue() : (double)((int)var12.getValue()));
               ++var11;
            }

            this.value = var3.toString();
         } else {
            String[] var7 = this.value.split("\\|");
            String var8 = var6 + "=" + (var4 != (double)((int)var4) ? var4 : (double)((int)var4));

            for(var13 = var9 = 3 >> 2; var13 < var7.length; var13 = var9) {
               if (var3.length() != 0) {
                  var3.append("|");
               }

               if (var9 != var2) {
                  var3.append(var7[var9]);
               } else {
                  var3.append(var8);
                  var8 = null;
               }

               ++var9;
            }

            if (var8 != null) {
               if (var3.length() != 0) {
                  var3.append("|");
               }

               var3.append(var8);
            }

            this.setValue(var3.toString());
         }
      } else {
         this.setValue(var6 + "=" + (var4 != (double)((int)var4) ? var4 : (double)((int)var4)));
      }
   }

   public String getSkin() {
      return this.skin;
   }
}
