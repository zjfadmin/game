package com.xy.bean;

import com.xy.hd;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RoleShow {
   private BigDecimal booth_id;
   private String rolename;
   private BigDecimal role_id;
   private transient int captian;
   private String teamInfo;
   private int TurnAround;
   private int y;
   private int fighting;
   private String gangname;
   private Integer grade;
   private int mount_id;
   private transient Color colorTitle;
   private List<PathPoint> Player_Paths;
   private BigDecimal species_id;
   private Integer skill_id;
   private int x;
   private BigDecimal troop_id;
   private BigDecimal gang_id;
   private String title;
   private Long mapid;
   private String skin;
   private double sp;

   public void setGrade(Integer var1) {
      this.grade = var1;
   }

   public Color getColorTitle() {
      return this.colorTitle;
   }

   public Integer getSkill_id() {
      return this.skill_id;
   }

   public void setGangname(String var1) {
      this.gangname = var1;
   }

   public int getFighting() {
      return this.fighting;
   }

   public int getX() {
      return this.x;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public void setCaptian(int var1) {
      this.captian = var1;
   }

   public void setRole_id(BigDecimal var1) {
      this.role_id = var1;
   }

   public void setSpecies_id(BigDecimal var1) {
      this.species_id = var1;
   }

   public void a(String var1, int var2, int var3) {
      int var4 = 3 & 4;

      int var5;
      for(int var10000 = var5 = 5 >> 3; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("#", var2 + (3 & 5))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.role_id = new BigDecimal(hd.q(var1, var2, var5));
         } else if (var4 == (2 ^ 3)) {
            var10000 = var5;
            this.species_id = new BigDecimal(hd.q(var1, var2, var5));
         } else if (var4 == 5 >> 1) {
            var10000 = var5;
            this.grade = hd.b(var1, var2, var5);
         } else {
            if (var4 == --3) {
               this.rolename = var1.substring(var2, var5);
            }

            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }

   public String getTitle() {
      return this.title;
   }

   public BigDecimal getTroop_id() {
      return this.troop_id;
   }

   public String getRolename() {
      return this.rolename;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public String getGangname() {
      return this.gangname;
   }

   public void setPlayer_Paths(List<PathPoint> var1) {
      this.Player_Paths = var1;
   }

   public void setBooth_id(BigDecimal var1) {
      this.booth_id = var1;
   }

   public void setSp(double var1) {
      this.sp = var1;
   }

   public void setMapid(Long var1) {
      this.mapid = var1;
   }

   public String getTeam() {
      return this.teamInfo != null && !this.teamInfo.equals("") && !this.teamInfo.equals("|") ? this.teamInfo : this.rolename;
   }

   public void setTurnAround(int var1) {
      this.TurnAround = var1;
   }

   public void setColorTitle(Color var1) {
      this.colorTitle = var1;
   }

   public BigDecimal getGang_id() {
      return this.gang_id;
   }

   public RoleShow(LoginResult var1) {
      int var10005 = 3 >> 2;
      super();
      this.TurnAround = var10005;
      this.sp = 0.24D;
      this.b(var1);
   }

   public void setGang_id(BigDecimal var1) {
      this.gang_id = var1;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }

   public List<PathPoint> getPlayer_Paths() {
      return this.Player_Paths;
   }

   public void setMount_id(int var1) {
      this.mount_id = var1;
   }

   public BigDecimal getSpecies_id() {
      return this.species_id;
   }

   public RoleShow() {
      int var10003 = 2 & 5;
      super();
      this.TurnAround = var10003;
      this.sp = 0.24D;
   }

   public int getTurnAround() {
      return this.TurnAround;
   }

   public void setRolename(String var1) {
      this.rolename = var1;
   }

   public Long getMapid() {
      return this.mapid;
   }

   public void setSkill_id(Integer var1) {
      this.skill_id = var1;
   }

   public int getY() {
      return this.y;
   }

   public void setTroop_id(BigDecimal var1) {
      this.troop_id = var1;
   }

   public int getCaptian() {
      return this.captian;
   }

   public void b(LoginResult var1) {
      RoleShow var10000;
      if (this.Player_Paths == null) {
         this.Player_Paths = new ArrayList();
         var10000 = this;
      } else {
         this.Player_Paths.clear();
         var10000 = this;
      }

      var10000.x = var1.getX().intValue();
      this.y = var1.getY().intValue();
      this.mapid = var1.getMapid();
      this.role_id = var1.getRole_id();
      this.gang_id = var1.getGang_id();
      this.gangname = var1.getGangname();
      this.species_id = var1.getSpecies_id();
      this.booth_id = var1.getBooth_id();
      this.skill_id = var1.getSkill_id();
      this.TurnAround = var1.getTurnAround();
      this.grade = var1.getGrade();
      this.rolename = var1.getRolename();
      this.title = var1.getTitle();
      this.fighting = var1.getFighting();
      this.mount_id = var1.getMount_id();
      this.troop_id = var1.getTroop_id();
      this.teamInfo = var1.getTeamInfo();
      this.skin = var1.getSkin();
   }

   public double getSp() {
      return this.sp;
   }

   public String getTeamInfo() {
      return this.teamInfo;
   }

   public void setFighting(int var1) {
      this.fighting = var1;
   }

   public int getMount_id() {
      return this.mount_id;
   }

   public BigDecimal getRole_id() {
      return this.role_id;
   }

   public void setTeamInfo(String var1) {
      this.teamInfo = var1;
   }

   public String getSkin() {
      return this.skin;
   }

   public Integer getGrade() {
      return this.grade;
   }

   public BigDecimal getBooth_id() {
      return this.booth_id;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public boolean c() {
      return (boolean)(this.Player_Paths != null && this.Player_Paths.size() > --1 ? 3 & 5 : 0);
   }
}
