package com.xy.readbean;

import java.awt.Point;
import java.util.List;

public class StallBuyMenu {
   private List<StallBuyMenu> menuList;
   private String key;
   private List<Point> pointList;

   public String getKey() {
      return this.key;
   }

   public List<StallBuyMenu> getMenuList() {
      return this.menuList;
   }

   public void setPointList(List<Point> var1) {
      this.pointList = var1;
   }

   public List<Point> getPointList() {
      return this.pointList;
   }

   public void setMenuList(List<StallBuyMenu> var1) {
      this.menuList = var1;
   }

   public void setKey(String var1) {
      this.key = var1;
   }
}
