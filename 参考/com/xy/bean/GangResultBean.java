package com.xy.bean;

import com.xy.entity.Gang;
import com.xy.entity.GangGroup;
import com.xy.entity.Gangapplytable;
import java.util.List;

public class GangResultBean {
   private List<LoginResult> roleTables;
   private Gang gang;
   private GangGroup gangGroup;
   private List<Gangapplytable> gangapplytables;

   public void setGangGroup(GangGroup var1) {
      this.gangGroup = var1;
   }

   public List<Gangapplytable> getGangapplytables() {
      return this.gangapplytables;
   }

   public void setGangapplytables(List<Gangapplytable> var1) {
      this.gangapplytables = var1;
   }

   public void setGang(Gang var1) {
      this.gang = var1;
   }

   public void setRoleTables(List<LoginResult> var1) {
      this.roleTables = var1;
   }

   public Gang getGang() {
      return this.gang;
   }

   public List<LoginResult> getRoleTables() {
      return this.roleTables;
   }

   public GangGroup getGangGroup() {
      return this.gangGroup;
   }
}
