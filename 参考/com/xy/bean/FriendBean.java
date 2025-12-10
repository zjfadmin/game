package com.xy.bean;

import com.xy.entity.Friendtable;

public class FriendBean {
   private int lvl;
   private BeauBean beauBean;
   private boolean chat;
   private long fid;
   private int speciesId;
   private String roleName;
   private int flag;
   private StringBuffer chatBuffer;

   public FriendBean a(Friendtable var1) {
      int var10001 = --2;
      this.fid = var1.getRole_id().longValue();
      this.flag = var10001 | (var1.getOnlineState() == (2 ^ 3) ? 4 ^ 5 : 0) << 4;
      this.lvl = var1.getGrade().intValue();
      this.speciesId = var1.getSpecies_id().intValue();
      this.roleName = var1.getRolename();
      this.beauBean = var1.getBeauBean();
      return this;
   }

   public FriendBean b(FriendBean var1) {
      this.flag = var1.flag;
      this.lvl = var1.lvl;
      this.speciesId = var1.speciesId;
      this.roleName = var1.roleName;
      this.beauBean = var1.beauBean;
      return this;
   }

   public boolean c() {
      return (boolean)(this.flag >> --4 != 0 ? --1 : 0);
   }

   public void setChat(boolean var1) {
      this.chat = var1;
   }

   public void setFlag(int var1) {
      this.flag = var1;
   }

   public void d(String var1) {
      if (this.chatBuffer == null) {
         this.chatBuffer = new StringBuffer();
      }

      this.chatBuffer.append(var1);
   }

   public int getSpeciesId() {
      return this.speciesId;
   }

   public String getRoleName() {
      return this.roleName;
   }

   public int getFlag() {
      return this.flag;
   }

   public void setFid(long var1) {
      this.fid = var1;
   }

   public FriendBean() {
      int var10001 = 24309 & 28459;
      int var10003 = 3 ^ 3;
      super();
      this.lvl = var10003;
      this.speciesId = var10001;
   }

   public long getFid() {
      return this.fid;
   }

   public void setChatBuffer(StringBuffer var1) {
      this.chatBuffer = var1;
   }

   public void setSpeciesId(int var1) {
      this.speciesId = var1;
   }

   public void setRoleName(String var1) {
      this.roleName = var1;
   }

   public int getLvl() {
      return this.lvl;
   }

   public int getGroup() {
      return this.flag & 127 & 15;
   }

   public String getChat() {
      return this.chatBuffer != null ? this.chatBuffer.toString() : "";
   }

   public BeauBean getBeauBean() {
      return this.beauBean;
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public void setBeauBean(BeauBean var1) {
      this.beauBean = var1;
   }

   public boolean e() {
      return this.chat;
   }
}
