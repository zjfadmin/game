package com.xy.bean;

import java.util.ArrayList;
import java.util.List;

public class RoleMoveBean {
   List<PathPoint> Paths = new ArrayList();
   private String role;

   public List<PathPoint> getPaths() {
      return this.Paths;
   }

   public void setPaths(List<PathPoint> var1) {
      this.Paths = var1;
   }

   public void setRole(String var1) {
      this.role = var1;
   }

   public String getRole() {
      return this.role;
   }
}
