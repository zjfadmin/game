package com.xy.bean;

import java.util.List;

public class UserRoleArrBean {
   private List<LoginResult> list;
   private int phonestatues;

   public void setList(List<LoginResult> var1) {
      this.list = var1;
   }

   public List<LoginResult> getList() {
      return this.list;
   }

   public int getPhonestatues() {
      return this.phonestatues;
   }

   public void setPhonestatues(int var1) {
      this.phonestatues = var1;
   }
}
