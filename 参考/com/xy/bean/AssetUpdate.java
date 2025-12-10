package com.xy.bean;

import com.xy.bk;
import com.xy.entity.Baby;
import com.xy.entity.DataOther;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.Pal;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import java.util.List;

public class AssetUpdate {
   private List<PartJade> jades;
   private List<Pal> pals;
   private String activity;
   private List<Lingbao> lingbaos;
   public static int DEAL = --4;
   private String msg;
   public static int USERGOOD = 107 & 28;
   private long I;
   private List<Baby> babys;
   private QuackGameBean gameBean;
   public static int NPC = 2 & 5;
   public static int INTEGRATION = --2;
   public static int STALLGET = 127 & 6;
   private String data;
   private String resistance;
   private DataOther dataOther;
   private String task;
   private UseCardBean useCard;
   public static int STALLBUY = --5;
   public static int GIVE = --3;
   public static int STALLRET = 23 & 111;
   private int type;
   private String sceneMsg;
   public static int MALL = --1;
   private List<Goodstable> goods;
   private List<RoleSummoning> pets;
   private String vip;
   private List<Mount> mounts;

   public String getMsg() {
      return this.msg;
   }

   public void setVip(String var1) {
      this.vip = var1;
   }

   public void setLingbaos(List<Lingbao> var1) {
      this.lingbaos = var1;
   }

   public void setI(long var1) {
      this.I = bk.a(var1);
   }

   public UseCardBean getUseCard() {
      return this.useCard;
   }

   public void setMsg(String var1) {
      this.msg = var1;
   }

   public String getSceneMsg() {
      return this.sceneMsg;
   }

   public void setMounts(List<Mount> var1) {
      this.mounts = var1;
   }

   public String a() {
      StringBuffer var1 = null;
      int var10000;
      String[] var5;
      int var7;
      switch(this.type) {
      case 0:
      case 1:
      case 2:
         while(false) {
         }

         if (this.msg != null && this.msg.length() != 0) {
            (var1 = new StringBuffer()).append("获得了");
            var1.append(this.msg);
            return var1.toString();
         } else {
            return null;
         }
      case 3:
         var1 = new StringBuffer();
         var1.append("你收到别人送给你的");
         if (this.msg != null) {
            var1.append(this.msg);
         }

         if (this.data != null) {
            if (var1.length() != 0) {
               var1.append(",");
            }

            var5 = this.data.split("\\|");

            for(var10000 = var7 = 3 & 4; var10000 < var5.length; var10000 = var7) {
               if (var5[var7].startsWith("D")) {
                  var1.append("金钱");
                  var1.append(var5[var7].split("=")[--1]);
               }

               ++var7;
            }
         }

         return var1.toString();
      case 4:
      case 7:
      case 9:
      case 10:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      default:
         return null;
      case 5:
         if (this.data == null) {
            return null;
         }

         (var1 = new StringBuffer()).append("花费了");
         var5 = this.data.split("\\|");
         var7 = 3 >> 2;

         for(var10000 = var7; var10000 < var5.length; var10000 = var7) {
            if (var5[var7].startsWith("D")) {
               var5[var7] = var5[var7].split("=")[--1];
               var1.append("#G");
               var1.append(var5[var7].startsWith("-") ? var5[var7].substring(--1) : var5[var7]);
               var1.append("#Y金钱");
            }

            ++var7;
         }

         var1.append("购买了");
         var1.append(this.msg);
         return var1.toString();
      case 6:
         if (this.data == null) {
            return null;
         }

         (var1 = new StringBuffer()).append("你售出");
         var1.append(this.msg);
         var1.append("获得了");
         String[] var4 = this.data.split("\\|");
         int var6 = 3 & 4;

         for(var10000 = var6; var10000 < var4.length; var10000 = var6) {
            if (var4[var6].startsWith("D")) {
               var4[var6] = var4[var6].split("=")[2 ^ 3];
               var1.append(var4[var6].startsWith("-") ? var4[var6].substring(--1) : var4[var6]);
               var1.append("金钱");
            }

            ++var6;
         }

         return var1.toString();
      case 8:
         if (this.data == null) {
            return null;
         }

         (var1 = new StringBuffer()).append("获得了");
         String[] var3 = this.data.split("\\|");
         int var2 = 5 >> 3;

         for(var10000 = var2; var10000 < var3.length; var10000 = var2) {
            if (var3[var2].startsWith("D=")) {
               var1.append("#G");
               var1.append(var3[var2].substring(--2));
               var1.append("#Y金钱");
            } else if (var3[var2].startsWith("X=")) {
               var1.append("#G");
               var1.append(var3[var2].substring(--2));
               var1.append("#Y仙玉");
            } else if (var3[var2].startsWith("S=")) {
               var1.append("#G");
               var1.append(var3[var2].substring(--2));
               var1.append("#Y绑玉");
            } else if (var3[var2].startsWith("C=")) {
               var1.append("#G");
               var1.append(var3[var2].substring(1 ^ 3));
               var1.append("#Y充值积分");
            } else if (var3[var2].startsWith("B=")) {
               var1.append("#G");
               var1.append(var3[var2].substring(5 >> 1));
               var1.append("帮贡");
            }

            ++var2;
         }

         return var1.toString();
      case 11:
         (var1 = new StringBuffer()).append("你取回了");
         var1.append(this.msg);
         return var1.toString();
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
         return this.msg;
      }
   }

   public void setGoods(List<Goodstable> var1) {
      this.goods = var1;
   }

   public void setJades(List<PartJade> var1) {
      this.jades = var1;
   }

   public List<RoleSummoning> getPets() {
      return this.pets;
   }

   public List<PartJade> getJades() {
      return this.jades;
   }

   public void setDataOther(DataOther var1) {
      this.dataOther = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setResistance(String var1) {
      this.resistance = var1;
   }

   public List<Baby> getBabys() {
      return this.babys;
   }

   public String getActivity() {
      return this.activity;
   }

   public void setUseCard(UseCardBean var1) {
      this.useCard = var1;
   }

   public void setGameBean(QuackGameBean var1) {
      this.gameBean = var1;
   }

   public String getResistance() {
      return this.resistance;
   }

   public DataOther getDataOther() {
      return this.dataOther;
   }

   public void setBabys(List<Baby> var1) {
      this.babys = var1;
   }

   public void setTask(String var1) {
      this.task = var1;
   }

   public void setPals(List<Pal> var1) {
      this.pals = var1;
   }

   public String getVip() {
      return this.vip;
   }

   public QuackGameBean getGameBean() {
      return this.gameBean;
   }

   public List<Goodstable> getGoods() {
      return this.goods;
   }

   public List<Mount> getMounts() {
      return this.mounts;
   }

   public String getTask() {
      return this.task;
   }

   public long getI() {
      return bk.b(this.I);
   }

   public String getData() {
      return this.data;
   }

   public int getType() {
      return this.type;
   }

   public void setActivity(String var1) {
      this.activity = var1;
   }

   public void setPets(List<RoleSummoning> var1) {
      this.pets = var1;
   }

   public List<Pal> getPals() {
      return this.pals;
   }

   public void setSceneMsg(String var1) {
      this.sceneMsg = var1;
   }

   public List<Lingbao> getLingbaos() {
      return this.lingbaos;
   }

   public void setData(String var1) {
      this.data = var1;
   }
}
