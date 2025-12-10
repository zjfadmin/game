package com.xy.bean;

import com.xy.entity.Mount;
import java.util.List;

public class RoleTransBean {
   private List<Mount> mounts;
   private PrivateData privateData;
   private LoginResult loginResult;

   public void setMounts(List<Mount> var1) {
      this.mounts = var1;
   }

   public void setLoginResult(LoginResult var1) {
      this.loginResult = var1;
   }

   public LoginResult getLoginResult() {
      return this.loginResult;
   }

   public List<Mount> getMounts() {
      return this.mounts;
   }

   public PrivateData getPrivateData() {
      return this.privateData;
   }

   public void setPrivateData(PrivateData var1) {
      this.privateData = var1;
   }
}
