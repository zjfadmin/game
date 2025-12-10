package com.xy.richtext;

import com.xy.bean.Coordinates;
import java.awt.Color;
import java.math.BigDecimal;

public class InputBean {
   private transient boolean isM;
   private String name;
   private String color;
   private transient Integer e_y;
   private transient InputBean inputBean;
   private transient Integer height;
   private transient Color color2;
   private Coordinates zb;
   private RichBeau richBeau;
   private transient Integer s_y;
   private transient Integer e_x;
   private BigDecimal id;
   private transient String text;
   private transient Integer index;
   private int type;
   private transient Integer s_x;

   public void setM(boolean var1) {
      this.setMonitor(var1);
      if (this.inputBean != null) {
         this.inputBean.setMonitor(var1);
      }

      int var2 = 0;
      int var3 = this.richBeau != null ? this.richBeau.getUnits().length : 0;

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         this.richBeau.getUnits()[var2++].setM(var1);
      }

   }

   public boolean isMonitor(int var1, int var2) {
      if (this.height != null) {
         if (this.inputBean != null && this.inputBean.height != null) {
            return this.isMonitor(var1, var2, Math.min(this.s_x, this.inputBean.s_x), Math.min(this.s_y, this.inputBean.s_y), Math.max(this.e_x, this.inputBean.e_x), Math.max(this.e_y, this.inputBean.e_y));
         }

         if (var2 >= this.s_y && var2 <= this.e_y + this.height) {
            if (this.s_y == this.e_y) {
               if (var1 >= this.s_x && var1 <= this.e_x) {
                  return (boolean)(4 ^ 5);
               }

               return false;
            }

            if (var2 <= this.s_y + this.height) {
               if (var1 >= this.e_x) {
                  return (boolean)(3 & 5);
               }

               return false;
            }

            if (var2 < this.e_y) {
               return (boolean)(--1);
            }

            if (var1 <= this.e_x) {
               return (boolean)(5 >> 2);
            }
         }
      }

      return false;
   }

   public boolean isMonitor(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= var4 && var2 <= var6 + this.height) {
         if (var4 == var6) {
            if (var1 >= var3 && var1 <= var5) {
               return (boolean)(3 & 5);
            }

            return false;
         }

         if (var2 <= var4 + this.height) {
            if (var1 >= var5) {
               return (boolean)(3 >> 1);
            }

            return false;
         }

         if (var2 < var6) {
            return (boolean)(3 >> 1);
         }

         if (var1 <= var5) {
            return (boolean)(3 >> 1);
         }
      }

      return false;
   }

   public String getName() {
      return this.name;
   }

   public Integer getE_y() {
      return this.e_y;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setInputBean(InputBean var1) {
      this.inputBean = var1;
   }

   public void setIndex(Integer var1) {
      this.index = var1;
   }

   public void setS_y(Integer var1) {
      this.s_y = var1;
   }

   public RichBeau getRichBeau() {
      return this.richBeau;
   }

   public int getIndex() {
      return this.index;
   }

   public String getColor() {
      return this.color;
   }

   public InputBean(int var1, int var2, BigDecimal var3, String var4, String var5) {
      this(var1, var2, var3, var4, var5, (Coordinates)null);
   }

   public Color getColor2() {
      return this.color2;
   }

   public void setText(String var1) {
      this.text = var1;
   }

   public void setE_x(Integer var1) {
      this.e_x = var1;
   }

   public InputBean(int var1, BigDecimal var2, String var3, Coordinates var4) {
      this((Integer)null, var1, var2, var3, (String)null, var4);
   }

   public InputBean(Integer var1, int var2, BigDecimal var3, String var4, String var5, Coordinates var6) {
      this.index = var1;
      this.type = var2;
      this.id = var3;
      this.name = var4;
      this.color = var5;
      this.zb = var6;
   }

   public void setColor(String var1) {
      this.color = var1;
   }

   public InputBean(int var1, BigDecimal var2, String var3, String var4) {
      this((Integer)null, var1, var2, var3, var4, (Coordinates)null);
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setS_x(Integer var1) {
      this.s_x = var1;
   }

   public Integer getE_x() {
      return this.e_x;
   }

   public Coordinates getZb() {
      return this.zb;
   }

   public int getType() {
      return this.type;
   }

   public BigDecimal getId() {
      return this.id;
   }

   public InputBean clone() {
      InputBean var1 = new InputBean();
      var1.index = this.index;
      var1.type = this.type;
      var1.id = this.id;
      var1.name = this.name;
      var1.color = this.color;
      var1.zb = this.zb;
      var1.color2 = this.color2;
      return var1;
   }

   public InputBean(int var1) {
      this.type = var1;
   }

   public void setColor2(Color var1) {
      this.color2 = var1;
   }

   public void setE_y(Integer var1) {
      this.e_y = var1;
   }

   public void setId(BigDecimal var1) {
      this.id = var1;
   }

   public void setMonitor(boolean var1) {
      this.isM = var1;
   }

   public Integer getHeight() {
      return this.height;
   }

   public Integer getS_x() {
      return this.s_x;
   }

   public InputBean() {
   }

   public void setRichBeau(RichBeau var1) {
      this.richBeau = var1;
   }

   public void setZb(Coordinates var1) {
      this.zb = var1;
   }

   public InputBean(int var1, String var2, Coordinates var3) {
      this((Integer)null, var1, (BigDecimal)null, var2, (String)null, var3);
   }

   public void setHeight(Integer var1) {
      this.height = var1;
   }

   public Integer getS_y() {
      return this.s_y;
   }

   public boolean isM() {
      return this.isM;
   }

   public boolean isIndex(int var1) {
      return (boolean)(var1 > this.index && this.index + this.name.length() > var1 ? --1 : 0);
   }

   public String getText() {
      return this.text;
   }

   public InputBean getInputBean() {
      return this.inputBean;
   }

   public void setIndex(int var1) {
      this.index = var1;
   }
}
