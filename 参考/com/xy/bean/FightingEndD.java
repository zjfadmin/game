package com.xy.bean;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import java.util.ArrayList;
import java.util.List;

public class FightingEndD {
   private RoleSummoning pet;
   private String mData;
   private LoginResult loginResult;
   private Integer doorId;
   private List<Lingbao> lingbaos;
   private int type;
   private int Fightingsumber;

   public LoginResult getLoginResult() {
      return this.loginResult;
   }

   public Integer getDoorId() {
      return this.doorId;
   }

   public String getmData() {
      return this.mData;
   }

   public List<Lingbao> getLingbaos() {
      if (this.lingbaos == null) {
         this.lingbaos = new ArrayList();
      }

      return this.lingbaos;
   }

   public int getFightingsumber() {
      return this.Fightingsumber;
   }

   public int getType() {
      return this.type;
   }

   public void setLingbaos(List<Lingbao> var1) {
      this.lingbaos = var1;
   }

   public void a(Lingbao var1) {
      this.getLingbaos().add(var1);
   }

   public void setFightingsumber(int var1) {
      this.Fightingsumber = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void b(String var1) {
      if (this.mData == null) {
         this.mData = var1;
      } else {
         this.mData = this.mData + "%" + var1;
      }
   }

   public void setmData(String var1) {
      this.mData = var1;
   }

   public void setLoginResult(LoginResult var1) {
      this.loginResult = var1;
   }

   public void setPet(RoleSummoning var1) {
      this.pet = var1;
   }

   public RoleSummoning getPet() {
      return this.pet;
   }

   public void setDoorId(Integer var1) {
      this.doorId = var1;
   }
}
