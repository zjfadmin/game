package com.xy.bean;

import java.math.BigDecimal;

public class ChangeRoleNameBean {
   private boolean flag;
   private String newName;
   private BigDecimal rgid;
   private String oldName;

   public String getNewName() {
      return this.newName;
   }

   public void setOldName(String var1) {
      this.oldName = var1;
   }

   public void setRgid(BigDecimal var1) {
      this.rgid = var1;
   }

   public BigDecimal getRgid() {
      return this.rgid;
   }

   public boolean a() {
      return this.flag;
   }

   public String getOldName() {
      return this.oldName;
   }

   public void setFlag(boolean var1) {
      this.flag = var1;
   }

   public void setNewName(String var1) {
      this.newName = var1;
   }
}
