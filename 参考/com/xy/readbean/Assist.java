package com.xy.readbean;

public class Assist {
   private int max;
   private transient boolean on;
   private int num;
   private int type;
   private String value;
   private int sid;
   private String name;
   private int id;

   public String getName() {
      return this.name;
   }

   public void setSid(int var1) {
      this.sid = var1;
   }

   public int getId() {
      return this.id;
   }

   public Assist() {
      int var10001 = 5 >> 3;
      super();
      this.on = (boolean)var10001;
   }

   public void setMax(int var1) {
      this.max = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getMax() {
      return this.max;
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public boolean a() {
      return this.on;
   }

   public int getType() {
      return this.type;
   }

   public int getSid() {
      return this.sid;
   }

   public void setNum(int var1) {
      this.num = var1;
   }

   public int getNum() {
      return this.num;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setOn(boolean var1) {
      this.on = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getValue() {
      return this.value;
   }
}
