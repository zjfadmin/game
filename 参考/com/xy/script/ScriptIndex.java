package com.xy.script;

import com.xy.hY;

public class ScriptIndex {
   private int type;
   private hY mapPoint;
   private int key;

   public void setKey(int var1) {
      this.key = var1;
   }

   public void setMapPoint(hY var1) {
      this.mapPoint = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public ScriptIndex(int var1) {
      this.type = var1;
   }

   public hY getMapPoint() {
      return this.mapPoint;
   }

   public int getKey() {
      return this.key;
   }

   public int getType() {
      return this.type;
   }
}
