package com.xy.bean;

import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.PackRecord;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import java.util.List;

public class EnterGameBean {
   private String monster;
   private List<Mount> mounts;
   private List<StallBean> stallBeans;
   private String sceneMsg;
   private List<RoleShow> roleShows;
   private PackRecord packRecord;
   private LoginResult loginResult;
   private long serverTime;
   private RoleSystem roleSystem;
   private List<Pal> pals;
   private List<RoleSummoning> roleSummonings;
   private PrivateData privateData;
   private List<Baby> babys;
   private List<Goodstable> list;
   private List<Lingbao> lingbaos;
   private TeamBean teamBean;
   private String activity;

   public void setServerTime(long var1) {
      this.serverTime = var1;
   }

   public void setStallBeans(List<StallBean> var1) {
      this.stallBeans = var1;
   }

   public void setTeamBean(TeamBean var1) {
      this.teamBean = var1;
   }

   public void setPrivateData(PrivateData var1) {
      this.privateData = var1;
   }

   public void setActivity(String var1) {
      this.activity = var1;
   }

   public void setLingbaos(List<Lingbao> var1) {
      this.lingbaos = var1;
   }

   public void setLoginResult(LoginResult var1) {
      this.loginResult = var1;
   }

   public void setRoleSummonings(List<RoleSummoning> var1) {
      this.roleSummonings = var1;
   }

   public void setList(List<Goodstable> var1) {
      this.list = var1;
   }

   public String getSceneMsg() {
      return this.sceneMsg;
   }

   public void setRoleShows(List<RoleShow> var1) {
      this.roleShows = var1;
   }

   public RoleSystem getRoleSystem() {
      return this.roleSystem;
   }

   public LoginResult getLoginResult() {
      return this.loginResult;
   }

   public PrivateData getPrivateData() {
      return this.privateData;
   }

   public TeamBean getTeamBean() {
      return this.teamBean;
   }

   public PackRecord getPackRecord() {
      return this.packRecord;
   }

   public void setPals(List<Pal> var1) {
      this.pals = var1;
   }

   public List<StallBean> getStallBeans() {
      return this.stallBeans;
   }

   public void setMounts(List<Mount> var1) {
      this.mounts = var1;
   }

   public List<Lingbao> getLingbaos() {
      return this.lingbaos;
   }

   public String getActivity() {
      return this.activity;
   }

   public void setBabys(List<Baby> var1) {
      this.babys = var1;
   }

   public void setPackRecord(PackRecord var1) {
      this.packRecord = var1;
   }

   public String getMonster() {
      return this.monster;
   }

   public List<Pal> getPals() {
      return this.pals;
   }

   public void setSceneMsg(String var1) {
      this.sceneMsg = var1;
   }

   public List<RoleSummoning> getRoleSummonings() {
      return this.roleSummonings;
   }

   public void setMonster(String var1) {
      this.monster = var1;
   }

   public List<RoleShow> getRoleShows() {
      return this.roleShows;
   }

   public void setRoleSystem(RoleSystem var1) {
      this.roleSystem = var1;
   }

   public List<Goodstable> getList() {
      return this.list;
   }

   public List<Mount> getMounts() {
      return this.mounts;
   }

   public List<Baby> getBabys() {
      return this.babys;
   }

   public long getServerTime() {
      return this.serverTime;
   }
}
