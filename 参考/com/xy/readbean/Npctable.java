package com.xy.readbean;

public class Npctable {
   private String headTxt;
   private String dir;
   private String binding;
   private String title;
   private String talkid;
   private String ticktxt;
   private String tx;
   private String npcid;
   private String tick;
   private String npcname;
   private String ty;
   private String npcway;
   private String npctype;
   private String skin;
   private String mname;

   public String getTitle() {
      return this.title;
   }

   public void setTick(String var1) {
      this.tick = var1;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }

   public void setNpcway(String var1) {
      this.npcway = var1 == null ? null : var1.trim();
   }

   public void setNpcid(String var1) {
      this.npcid = var1;
   }

   public void setTicktxt(String var1) {
      this.ticktxt = var1 == null ? null : var1.trim();
   }

   public String getBinding() {
      return this.binding;
   }

   public String getNpcid() {
      return this.npcid;
   }

   public String getDir() {
      return this.dir;
   }

   public void setNpcname(String var1) {
      this.npcname = var1 == null ? null : var1.trim();
   }

   public String getNpcway() {
      return this.npcway;
   }

   public void setTy(String var1) {
      this.ty = var1;
   }

   public String getSkin() {
      return this.skin;
   }

   public void setDir(String var1) {
      this.dir = var1;
   }

   public void setMname(String var1) {
      this.mname = var1 == null ? null : var1.trim();
   }

   public void setTalkid(String var1) {
      this.talkid = var1 == null ? null : var1.trim();
   }

   public void setBinding(String var1) {
      this.binding = var1;
   }

   public String getNpctype() {
      return this.npctype;
   }

   public String getTx() {
      return this.tx;
   }

   public String getTy() {
      return this.ty;
   }

   public void setHeadTxt(String var1) {
      this.headTxt = var1;
   }

   public String getTick() {
      return this.tick;
   }

   public void setTx(String var1) {
      this.tx = var1;
   }

   public void setNpctype(String var1) {
      this.npctype = var1;
   }

   public String getTicktxt() {
      return this.ticktxt;
   }

   public String getMname() {
      return this.mname;
   }

   public String getHeadTxt() {
      return this.headTxt;
   }

   public String getNpcname() {
      return this.npcname;
   }

   public String getTalkid() {
      return this.talkid;
   }
}
