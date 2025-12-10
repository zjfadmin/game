package com.xy.game;

import com.xy.aF;
import com.xy.aZ;
import com.xy.bw;
import com.xy.by;
import com.xy.cp;
import com.xy.cu;
import com.xy.dJ;
import com.xy.eB;
import com.xy.ev;
import com.xy.hd;
import com.xy.lT;
import com.xy.lg;
import com.xy.mi;
import com.xy.bean.BeauBean;
import com.xy.bean.FriendBean;
import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.bean.RoleSystem;
import com.xy.bean.TeamBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.DataOther;
import com.xy.entity.Friendtable;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.PackRecord;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseMeridians;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseValue;
import com.xy.formula.GoodType;
import com.xy.formula.RoleProperty;
import com.xy.formula.SkillUtil;
import com.xy.readbean.Activity2Role;
import com.xy.readbean.ActivityPetManualRole;
import com.xy.readbean.ActivityRole;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RoleData {
   public BigDecimal[] goodXuanBaoStandby;
   private BigDecimal choseWingId;
   private List<Goodstable> parcelList;
   public List<RolePet> pets;
   public BigDecimal[] lingbaoChoses;
   public List<BigDecimal> lingbaoList;
   public TeamBean teamBean;
   private GameView gameView;
   private BigDecimal chosePalId;
   public List<Baby> babys;
   public Map<BigDecimal, Lingbao> lingbaoMap;
   private BaseMountSH[] mountSHs;
   public List<BigDecimal> wingGoodsList;
   private RoleProperty roleProperty;
   private PackRecord packRecord;
   public BigDecimal lastFlyId;
   public Map<String, UseCardBean> limitMap;
   public List<Pal> pals;
   public List<DataOther> dataOtherList;
   public List<BigDecimal> starCardList;
   public BigDecimal[] goodPacks;
   private long[] shortCutSkills;
   private BigDecimal choseMountId;
   private BigDecimal choseXuanBaoId;
   private Map<Integer, ActivityRole> activityMap;
   private boolean helpLing;
   private BigDecimal choseBaoId;
   private BigDecimal choseBabyId;
   public List<Mount> mounts;
   public List<BigDecimal> xuanBaoList;
   private LoginResult loginResult;
   private long roleId;
   private boolean lockPack;
   public List<BigDecimal> ddGoodsList;
   private boolean helpPet;
   private PrivateData privateData;
   private Map<BigDecimal, Goodstable> goodMap;
   private BigDecimal chosePetId;
   private PKSys pkSys;
   private Map<Long, FriendBean> friendMap;
   private BigDecimal choseStarCardId;
   public List<BigDecimal> fabaoList;
   public BigDecimal[] goodChoses;
   private RoleSystem roleSystem;
   public List<BigDecimal> flyList;
   public RoleTaskData taskSystem;

   public Lingbao getLingbao(BigDecimal var1) {
      return (Lingbao)this.lingbaoMap.get(var1);
   }

   public void setLoginResult(LoginResult var1) {
      this.loginResult = var1;
   }

   public RolePet getRolePet(long var1) {
      if (var1 == 0L) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.pets.iterator(); var10000.hasNext(); var10000 = var3) {
            RolePet var4;
            if ((var4 = (RolePet)var3.next()).getId().longValue() == var1) {
               return var4;
            }
         }

         return null;
      }
   }

   public void a() {
      ArrayList var1 = new ArrayList();

      int var10000;
      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < this.ddGoodsList.size(); var10000 = var2) {
         Goodstable var3;
         if ((var3 = (Goodstable)this.goodMap.get(this.ddGoodsList.get(var2))) != null) {
            var1.add(var3);
         }

         ++var2;
      }

      Collections.sort(var1, cp.c);
      ArrayList var4 = new ArrayList();

      int var5;
      for(var10000 = var5 = 3 & 4; var10000 < var1.size(); var10000 = var5) {
         Object var10001 = var1.get(var5);
         ++var5;
         var4.add(((Goodstable)var10001).getRgid());
      }

      this.ddGoodsList = var4;
   }

   public boolean b() {
      return this.helpPet;
   }

   public void setHelpBB(BigDecimal[] var1) {
      int var2 = 3 >> 2;
      int var5 = this.pets.size();

      for(int var10000 = var2; var10000 < var5; var10000 = var2) {
         RolePet var4 = (RolePet)this.pets.get(var2);

         label23: {
            int var3;
            for(var10000 = var3 = 3 >> 2; var10000 < var1.length; var10000 = var3) {
               if (var1[var3].compareTo(var4.getId()) == 0) {
                  var4.setHelp(var3 + (4 ^ 5));
                  break label23;
               }

               ++var3;
            }

            var4.setHelp(5 >> 3);
         }

         ++var2;
      }

      this.ax();
   }

   public Goodstable getWingGood(int var1) {
      return var1 < this.wingGoodsList.size() ? this.getGood((BigDecimal)this.wingGoodsList.get(var1)) : null;
   }

   public lg getObjectArea() {
      return this.gameView.getObjectArea();
   }

   public void c(BigDecimal var1) {
      Goodstable var2 = var1 != null ? this.getGood(var1) : null;
      if (var2 != null) {
         var2.ab(3 & 5);
         if (var2.getUsetime() <= 0) {
            this.h(var2.getRgid());
         }

      }
   }

   public void d(BigDecimal var1, boolean var2) {
      int var4 = 3 ^ 3;
      Goodstable var3;
      if ((var3 = (Goodstable)this.goodMap.remove(var1)) != null) {
         int var10000;
         boolean var6;
         if (var3.getType() == 8888L) {
            if (var3.getStatus() == (2 ^ 3) && hd.v(this.goodChoses[92 & 47], var1)) {
               var10000 = --1;
               this.goodChoses[31 & 108] = null;
               var4 = var10000;
            }

            this.wingGoodsList.remove(var3.getRgid());
            var6 = var2;
         } else if (var3.getType() == 8901L) {
            if (var3.getStatus() == (4 ^ 5) && hd.v(this.goodChoses[46 & 95], var1)) {
               var10000 = 5 >> 2;
               this.goodChoses[46 & 95] = null;
               var4 = var10000;
            }

            this.flyList.remove(var3.getRgid());
            var6 = var2;
         } else if (var3.getType() != 520L || var3.getStatus() != --4 && var3.getStatus() != 3 >> 1) {
            int var5;
            if (var3.getType() == 812L) {
               if (var3.getStatus() == --1) {
                  if (hd.v(this.goodChoses[31 & 111], var1)) {
                     this.goodChoses[31 & 111] = null;
                     var4 = --1;
                  } else if (hd.v(this.goodChoses[95 & 48], var1)) {
                     this.goodChoses[17 & 126] = null;
                     var4 = 4 ^ 5;
                  } else if (hd.v(this.goodChoses[125 & 19], var1)) {
                     var10000 = 3 >> 1;
                     this.goodChoses[61 & 83] = null;
                     var4 = var10000;
                  }
               }

               RoleData var7;
               label107: {
                  for(var10000 = var5 = 0; var10000 < this.goodXuanBaoStandby.length; var10000 = var5) {
                     if (hd.v(this.goodXuanBaoStandby[var5], var1)) {
                        var7 = this;
                        int var10001 = --1;
                        this.goodXuanBaoStandby[var5] = null;
                        var4 = var10001;
                        break label107;
                     }

                     ++var5;
                  }

                  var7 = this;
               }

               var7.xuanBaoList.remove(var3.getRgid());
               var6 = var2;
            } else if (var3.getStatus() == 5 >> 1) {
               var6 = var2;
               this.ddGoodsList.remove(var3.getRgid());
            } else if (var3.getStatus() == --1) {
               var10000 = var5 = 5 >> 3;

               while(true) {
                  if (var10000 >= this.goodChoses.length) {
                     var6 = var2;
                     break;
                  }

                  if (this.goodChoses[var5] != null && this.goodChoses[var5].compareTo(var3.getRgid()) == 0) {
                     var10000 = 5 >> 2;
                     this.goodChoses[var5] = null;
                     var4 = var10000;
                     var6 = var2;
                     break;
                  }

                  ++var5;
                  var10000 = var5;
               }
            } else {
               label89: {
                  if (var3.getStatus() == 0) {
                     for(var10000 = var5 = 3 ^ 3; var10000 < this.goodPacks.length; var10000 = var5) {
                        if (this.goodPacks[var5] != null && this.goodPacks[var5].compareTo(var3.getRgid()) == 0) {
                           var6 = var2;
                           this.goodPacks[var5] = null;
                           break label89;
                        }

                        ++var5;
                     }
                  }

                  var6 = var2;
               }
            }
         } else {
            if (var3.getStatus() == (3 & 5) && hd.v(this.goodChoses[111 & 29], var1)) {
               var10000 = --1;
               this.goodChoses[61 & 79] = null;
               var4 = var10000;
            }

            this.starCardList.remove(var3.getRgid());
            var6 = var2;
         }

         if (var6 && var4 != 0) {
            this.roleProperty.q();
         }

      }
   }

   public void e(BigDecimal var1, int var2) {
      Lingbao var3;
      if (var1 == null) {
         if ((var3 = this.getLingbao(this.lingbaoChoses[var2])) != null && var3.getEquipment() == (3 & 5)) {
            this.lingbaoChoses[var2] = null;
            var3.setEquipment(3 & 4);
            ParamTool.i(var3, this.gameView.getClient());
            this.roleProperty.s(var3.getKangxing(), (boolean)(2 & 5));
            return;
         }
      } else if ((var3 = this.getLingbao(var1)) != null && var3.getEquipment() == 0) {
         RoleData var10000;
         if (!var3.getBaotype().equals("法宝")) {
            var2 = 3 ^ 3;
            var10000 = this;
            this.e((BigDecimal)null, 3 & 4);
         } else {
            var2 = this.lingbaoChoses[3 >> 1] == null ? 3 & 5 : 2;
            var10000 = this;
            this.e((BigDecimal)null, var2);
         }

         var10000.lingbaoChoses[var2] = var3.getBaoid();
         var3.setEquipment(5 >> 2);
         ParamTool.i(var3, this.gameView.getClient());
         this.roleProperty.s(var3.getKangxing(), (boolean)(2 ^ 3));
      }

   }

   public void f(boolean var1) {
      RoleShow var2 = this.gameView.roleUnit.r;
      List var5 = this.gameView.roleData.getPackRecord().getPutTX();
      String var4 = var2.getSkin();
      String var3 = GameUtil.getRoleSkin(this.gameView.roleData.getRoleSkin(), var5, var2, this);
      if (!hd.r(var4, var3)) {
         var2.setSkin(var3.equals("") ? null : var3);
         this.getLoginResult().setSkin(var2.getSkin());
         this.gameView.roleUnit.ba((String)null, var2);
         if (var1 && var5 != null && var5.size() != 0) {
            StringBuffer var6 = new StringBuffer();
            int var10002 = 5 >> 3;
            var6.append("E");
            var6.append((String)var5.get(var10002));
            int var8 = 3 & 5;

            for(int var10000 = var8; var10000 < var5.size(); var10000 = var8) {
               var10002 = var8;
               var6.append("_");
               ++var8;
               var6.append((String)var5.get(var10002));
            }

            if (hd.o(var3)) {
               var3 = var6.toString();
            } else {
               var3 = var3 + "|" + var6.toString();
            }
         }

         String var7 = Agreement.getSendTextAES("1", --5 + var3);
         this.gameView.getClient().d(var7);
      }
   }

   public Goodstable getFlyGood(int var1) {
      return var1 < this.flyList.size() ? this.getGood((BigDecimal)this.flyList.get(var1)) : null;
   }

   public FriendBean getFriend(long var1) {
      return this.friendMap != null ? (FriendBean)this.friendMap.get(var1) : null;
   }

   public Goodstable getEquipGood(int var1) {
      return this.getGoodEquip(this.goodChoses[var1]);
   }

   public Pal getPal(BigDecimal var1) {
      if (var1 == null) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.pals.iterator(); var10000.hasNext(); var10000 = var3) {
            Pal var2;
            if ((var2 = (Pal)var3.next()).getId().compareTo(var1) == 0) {
               return var2;
            }
         }

         return null;
      }
   }

   public Baby getChoseBaby() {
      return this.getBaby(this.choseBabyId);
   }

   public boolean g(BigDecimal var1) {
      if (this.choseMountId != null && var1 != null) {
         return (boolean)(this.choseMountId.compareTo(var1) == 0 ? --1 : 0);
      } else {
         return false;
      }
   }

   public void h(BigDecimal var1) {
      this.d(var1, (boolean)(2 ^ 3));
   }

   public boolean i(Goodstable var1) {
      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.goodPacks.length; var10000 = var2) {
         if (this.goodPacks[var2] == null) {
            var10000 = --1;
            this.goodPacks[var2] = var1.getRgid();
            return (boolean)var10000;
         }

         ++var2;
      }

      return (boolean)(3 >> 2);
   }

   public boolean j(String var1) {
      return this.ap(var1, this.fabaoList, this.lingbaoMap);
   }

   public RoleData(long var1, GameView var3) {
      int var10005 = 3 >> 1;
      int var10007 = 3 & 5;
      int var10009 = 3 & 5;
      super();
      this.lockPack = (boolean)var10009;
      this.helpPet = (boolean)var10007;
      this.helpLing = (boolean)var10005;
      this.roleId = var1;
      this.gameView = var3;
   }

   public void k(String var1, String var2, String var3, String var4, long var5) {
      if (var5 == -1L) {
         this.ag(var2);
      } else {
         UseCardBean var7;
         String var10000;
         label70: {
            if ((var7 = this.getLimit(var2)) != null) {
               var7.setName(var1);
               var7.setTime(var5);
               var7.setValue(var4);
               if (!var7.getSkin().equals(var3)) {
                  var10000 = var2;
                  var7.setSkin(var3);
                  break label70;
               }
            } else {
               this.limitMap.put(var2, var7 = new UseCardBean(var1, var2, var3, var5, var4));
            }

            var10000 = var2;
         }

         cu var8;
         if ((var10000.equals("月卡") || var2.equals("季卡")) && (var8 = (cu)this.gameView.getFormManagement().m(111 & 55)) != null) {
            var8.y(5 >> 1);
         }

         byte var9 = 0;
         int var11 = 2 & 5;
         int var12 = 3 & 4;
         int var13 = 3 ^ 3;
         int var10 = var9 | (!var7.getType().equals("变身卡") && !var7.getType().equals("强法型") && !var7.getType().equals("加抗型") && !var7.getType().equals("增益型") && !var7.getType().equals("VIP") && !var7.getType().equals("帮派") && !var7.getType().equals("单人竞技场") && !var7.getType().equals("回蓝符") ? 3 >> 2 : 1);
         var11 |= !var7.getType().equals("变身卡") && !var7.getType().equals("童卡") && !var7.getType().equals("光武") ? 3 >> 2 : 1;
         var12 |= var7.getType().equals("限时礼包");
         var13 |= var7.getType().equals("靓号");
         if (var10 != 0) {
            this.getRoleProperty().n();
         }

         if (var11 != 0) {
            this.f((boolean)(2 & 5));
         }

         if (var13 != 0) {
            this.getRoleProperty().i();
         }

         by var10001 = this.gameView.baseView;
         var10001.sw |= var12;
         this.gameView.baseView.op = (boolean)(3 & 5);
      }
   }

   public void l(Lingbao var1) {
      this.lingbaoMap.remove(var1.getBaoid());
      this.lingbaoList.remove(var1.getBaoid());
      var1.setOperation("删除");
      ParamTool.i(var1, this.getGameView().getClient());
   }

   public void m() {
      BigDecimal[] var4 = (BigDecimal[])this.goodPacks.clone();
      ArrayList var2 = new ArrayList();

      int var10000;
      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < var4.length; var10000 = var3) {
         Goodstable var1 = var4[var3] != null ? this.getGood(var4[var3]) : null;
         if (var1 != null && var1.getGoodlock() != 5 >> 2 && var1.getType() != 2010L && var1.getType() != 2011L && var1.getType() != 2012L) {
            var4[var3] = null;
            int var5;
            var10000 = var5 = 3 ^ 3;

            while(true) {
               if (var10000 >= var2.size()) {
                  var2.add(var1);
                  break;
               }

               Goodstable var6 = (Goodstable)var2.get(var5);
               if (var1.getType() <= var6.getType() && (var1.getType() != var6.getType() || var1.getGoodsid().longValue() <= var6.getGoodsid().longValue())) {
                  var2.add(var5, var1);
                  break;
               }

               ++var5;
               var10000 = var5;
            }
         }

         ++var3;
      }

      var3 = 3 & 4;

      int var7;
      for(var10000 = var7 = 2 & 5; var10000 < var2.size(); var10000 = var7) {
         while(var3 < var4.length) {
            if (var4[var3] == null) {
               var4[var3] = ((Goodstable)var2.get(var7)).getRgid();
               break;
            }

            ++var3;
         }

         ++var7;
      }

      this.goodPacks = var4;
   }

   public ActivityRole getActivity(int var1) {
      return (ActivityRole)this.activityMap.get(var1);
   }

   public Goodstable getGoodPacK(BigDecimal var1) {
      Goodstable var2;
      return (var2 = (Goodstable)this.goodMap.get(var1)) != null && var2.getStatus() == 0 ? var2 : null;
   }

   public String getPackRecordString() {
      StringBuffer var1 = new StringBuffer();

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.goodPacks.length; var10000 = var2) {
         if (this.goodPacks[var2] != null) {
            if (var1.length() != 0) {
               var1.append("|");
            }

            hd.k((long)(62 + var2), var1);
            hd.k(this.goodPacks[var2].longValue(), var1);
         }

         ++var2;
      }

      return var1.toString();
   }

   public void n(String var1) {
      this.packRecord.a(var1);
      aZ var2;
      if ((var2 = (aZ)this.gameView.getFormManagement().m(63 & 102)) != null) {
         var2.s();
      }

   }

   public Goodstable getPawnGood(int var1) {
      return var1 < this.ddGoodsList.size() ? this.getGood((BigDecimal)this.ddGoodsList.get(var1)) : null;
   }

   public List<Baby> getBabys() {
      return this.babys;
   }

   public Pal getChosePal() {
      return this.getPal(this.chosePalId);
   }

   public Long getShortCutSkillByIndex(int var1) {
      int var2;
      int var3;
      for(int var10000 = var2 = 3 >> 2; var10000 < 3; var10000 = var2) {
         var3 = SkillUtil.getSepciesIndex(this.loginResult.getSpecies_id(), var2);

         int var4;
         for(var10000 = var4 = 3 ^ 3; var10000 < 5; var10000 = var4) {
            if (1001 + var3 * --5 + var4 == var1) {
               return (long)(var2 + (5 >> 2) << (74 & 61) | var4);
            }

            ++var4;
         }

         ++var2;
      }

      BaseMeridians var5;
      var3 = (var5 = this.roleProperty.getMeridians(3 ^ 3)) != null && var5.getKey() != null ? Integer.parseInt(var5.getKey()) - --1 : -1;
      if (var3 != -4 >> 2) {
         var2 = SkillUtil.getFMIndex(SkillUtil.getSepciesIndex(this.loginResult.getSpecies_id()), var3);
         if ((16123 & 28644) + var2 == var1) {
            return 1024L;
         }
      }

      return null;
   }

   public void o(PackRecord var1, RoleSystem var2, PrivateData var3, LoginResult var4) {
      if (var4 != null) {
         this.loginResult = var4;
      }

      if (var2 != null) {
         this.roleSystem = var2;
      }

      if (var1 != null) {
         this.packRecord = var1;
      }

      if (var3 != null) {
         this.privateData = var3;
      }

   }

   public void p(BigDecimal var1, int var2) {
      if (this.parcelList != null) {
         int var3;
         for(int var10000 = var3 = 0; var10000 < this.parcelList.size(); var10000 = var3) {
            Goodstable var4;
            if ((var4 = (Goodstable)this.parcelList.get(var3)).getRgid().compareTo(var1) == 0) {
               if (var2 > 0) {
                  var4.setRgid(var1);
                  var4.setUsetime(var2);
                  return;
               }

               this.parcelList.remove(var3);
               return;
            }

            ++var3;
         }

      }
   }

   public boolean q(BigDecimal var1) {
      if (this.chosePalId != null && var1 != null) {
         return (boolean)(this.chosePalId.compareTo(var1) == 0 ? --1 : 0);
      } else {
         return false;
      }
   }

   public boolean r(BigDecimal var1) {
      if (this.choseBabyId != null && var1 != null) {
         return (boolean)(this.choseBabyId.compareTo(var1) == 0 ? --1 : 0);
      } else {
         return false;
      }
   }

   public boolean s(Lingbao var1) {
      return this.av(var1.getBaoname(), var1.getBaoid(), this.fabaoList, this.lingbaoMap);
   }

   public long getMoney(MoneyType var1) {
      if (var1.getId() == (4 ^ 5)) {
         return this.loginResult.getGold().longValue();
      } else if (var1.getId() == --2) {
         return this.loginResult.getSavegold().longValue();
      } else if (var1.getId() == --3) {
         return this.loginResult.getCodecard().longValue();
      } else if (var1.getId() == --4) {
         return this.loginResult.getMoney().longValue();
      } else if (var1.getId() == --5) {
         return this.loginResult.getPaysum().longValue();
      } else if (var1.getId() == -4 >> 2) {
         return var1.getMax();
      } else {
         int var2;
         int var3;
         if (var1.getId() == (-1 & -2)) {
            var2 = (int)(var1.getMax() >> (122 & 37));
            var3 = (int)(var1.getMax() & 2147483647L);
            return this.getActivityMoney(var2, var3);
         } else if (var1.getId() == (-1 & -3)) {
            var2 = (int)(var1.getMax() >> (102 & 57));
            var3 = (int)(var1.getMax() & 2147483647L);
            return this.getActivityMoney(var2, var3) - this.getActivityMoney(var2, -var3);
         } else if (var1.getId() == (-2 & -3)) {
            return this.getGoodTypeNum((int)var1.getMax());
         } else {
            return var1.getKey() != null ? this.loginResult.getScoretype(var1.getKey()).longValue() : 0L;
         }
      }
   }


   private void t(String var1, int var2, int var3) {
      int var4;
      if ((var4 = var1.indexOf("#", var2 + (3 >> 1))) == -4 >> 2 || var4 > var3) {
         var4 = var3;
      }

      int var5 = hd.b(var1, var2, var4);
      var2 = var4 + (2 ^ 3);
      if ((var4 = var1.indexOf("#", var2 + --1)) == -4 >> 2 || var4 > var3) {
         var4 = var3;
      }

      if ((var2 = hd.b(var1, var2, var4)) == 5 >> 1) {
         this.activityMap.put(var5, new Activity2Role(var1, var4 + --1, var3));
      } else {
         if (var2 == (62 & 71)) {
            this.activityMap.put(var5, new ActivityPetManualRole(var1, var4 + (5 >> 2), var3));
         }

      }
   }

   public FriendBean u(Friendtable var1) {
      if (this.friendMap == null) {
         this.friendMap = new HashMap();
      }

      FriendBean var2;
      if ((var2 = this.getFriend(var1.getRole_id().longValue())) == null) {
         this.friendMap.put(var1.getRole_id().longValue(), var2 = new FriendBean());
      }

      var2.a(var1);
      return var2;
   }

   public GameView getGameView() {
      return this.gameView;
   }

   public Goodstable getUsableFly() {
      Goodstable var1;
      if ((var1 = this.getGood(this.lastFlyId)) != null && var1.getBaseFly().getRl() > 0) {
         return var1;
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.flyList.size(); var10000 = var2) {
            if ((var1 = this.getGood((BigDecimal)this.flyList.get(var2))).getBaseFly().getRl() > 0) {
               return var1;
            }

            ++var2;
         }

         return null;
      }
   }

   public void setChoseMountId(BigDecimal var1) {
      this.choseMountId = var1;
   }

   public long getShortCutSkill(int var1) {
      return this.shortCutSkills[var1];
   }

   public Goodstable getChoseXuanBao() {
      return this.getGood(this.choseXuanBaoId);
   }

   public void v() {
      HashMap var6 = new HashMap();
      String var5;
      if (!hd.o(var5 = this.privateData.getTimingGood())) {
         String[] var9 = var5.split("\\^");

         int var4;
         for(int var10000 = var4 = 3 & 4; var10000 < var9.length; var10000 = var4) {
            String[] var3 = var9[var4].split("#");
            UseCardBean var2 = new UseCardBean();

            int var1;
            for(var10000 = var1 = 2 & 5; var10000 < var3.length; var10000 = var1) {
               if (var1 == 0) {
                  var2.setName(var3[var1]);
               } else if (var1 == (2 ^ 3)) {
                  var2.setType(var3[var1]);
               } else if (var1 == --2) {
                  var2.setSkin(var3[var1]);
               } else if (var1 == --3) {
                  long var7;
                  UseCardBean var10;
                  if ((var7 = Long.parseLong(var3[var1])) < 100000000L) {
                     var7 *= 60000L;
                     var10 = var2;
                  } else {
                     if (var7 < 2000000000L) {
                        var7 *= 1000L;
                     }

                     var10 = var2;
                  }

                  var10.setTime(var7);
               } else if (var1 == --4) {
                  var2.setValue(var3[var1]);
               }

               ++var1;
            }

            ++var4;
            var6.put(var2.getType(), var2);
         }
      }

      this.limitMap = var6;
   }

   public DataOther getDataOther(long var1) {
      if (this.dataOtherList == null) {
         return null;
      } else {
         int var3;
         for(int var10000 = var3 = 0; var10000 < this.dataOtherList.size(); var10000 = var3) {
            DataOther var4;
            if ((var4 = (DataOther)this.dataOtherList.get(var3)).getId() == var1) {
               return var4;
            }

            ++var3;
         }

         return null;
      }
   }

   public Long getShortCutGoodByIndex(BigDecimal var1) {
      return var1.longValue() + 2147483647L;
   }

   public void w() {
      if (this.taskSystem == null) {
         this.taskSystem = new RoleTaskData(this);
      }

      this.taskSystem.e();
   }

   public void setChoseBabyId(BigDecimal var1) {
      this.choseBabyId = var1;
   }

   public Mount getChoseMount() {
      return this.getMount(this.choseMountId);
   }

   public boolean x(int var1) {
      if (var1 == 0) {
         return (boolean)(2 & 5);
      } else {
         Iterator var3;
         Iterator var10000 = var3 = this.pets.iterator();

         while(true) {
            while(var10000.hasNext()) {
               RolePet var2;
               if ((var2 = (RolePet)var3.next()).getBb() != 0) {
                  if (var2.getBb1() == var1 || var2.getBb2() == var1) {
                     return true;
                  }

                  var10000 = var3;
               } else {
                  var10000 = var3;
               }
            }

            return (boolean)(3 >> 2);
         }
      }
   }

   public boolean y() {
      return this.lockPack;
   }

   public BigDecimal getChosePetId() {
      return this.chosePetId;
   }

   public void z(String var1) {
      String var10000;
      if (this.activityMap == null) {
         this.activityMap = new HashMap();
         var10000 = var1;
      } else {
         this.activityMap.clear();
         var10000 = var1;
      }

      if (!hd.o(var10000)) {
         int var2 = 0;

         int var3;
         for(int var4 = var3 = 3 ^ 3; var4 < var1.length(); var4 = var3) {
            if ((var3 = var1.indexOf("|", var2 + (3 & 5))) == -4 >> 2) {
               var3 = var1.length();
            }

            this.t(var1, var2, var3);
            var2 = var3 + (5 >> 2);
         }

      }
   }

   public Baby getBaby(BigDecimal var1) {
      if (var1 == null) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.babys.iterator(); var10000.hasNext(); var10000 = var3) {
            Baby var2;
            if ((var2 = (Baby)var3.next()).getBabyid().compareTo(var1) == 0) {
               return var2;
            }
         }

         return null;
      }
   }

   public List<dJ> aa(dJ... var1) {
      ArrayList var7 = null;
      int var5 = var1.length;

      int var4;
      for(int var10000 = var4 = 2 & 5; var10000 < this.goodPacks.length; var10000 = var4) {
         Goodstable var3;
         int var6;
         if (var5 > 0 && this.goodPacks[var4] != null && (var3 = this.getGood(this.goodPacks[var4])) != null) {
            for(var10000 = var6 = 0; var10000 < var1.length; var10000 = var6) {
               dJ var2;
               if ((var2 = var1[var6]) != null && var2.a == (long)var3.getGoodsid().intValue()) {
                  ArrayList var8;
                  if ((long)var3.getUsetime() >= var2.b) {
                     var8 = var7;
                     --var5;
                     var1[var6] = null;
                     var2.a = var3.getRgid().longValue();
                  } else {
                     var2.b -= (long)var3.getUsetime();
                     var2 = new dJ(var3.getRgid().longValue(), (long)var3.getUsetime());
                     var8 = var7;
                  }

                  if (var8 == null) {
                     var7 = new ArrayList();
                  }

                  var7.add(var2);
               }

               ++var6;
            }
         }

         ++var4;
      }

      if (var5 == 0) {
         return var7;
      } else {
         return null;
      }
   }

   public RoleSystem getRoleSystem() {
      return this.roleSystem;
   }

   public PKSys getPkSys() {
      if (this.pkSys == null) {
         this.pkSys = new PKSys(this);
      }

      return this.pkSys;
   }

   public void ab(List<Goodstable> var1) {
      if (var1 == null) {
         this.parcelList = null;
      } else {
         Collections.sort(var1, cp.c);
         this.parcelList = var1;
      }
   }

   public String getRoleSkin() {
      UseCardBean var1;
      if ((var1 = this.getLimit("童卡")) == null) {
         var1 = this.getLimit("变身卡");
      }

      return var1 != null ? hd.d(var1.getValue(), "皮肤=", "|") : null;
   }

   public void ac(BigDecimal var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.goodPacks.length; var10000 = var2) {
         if (this.goodPacks[var2] != null && this.goodPacks[var2].compareTo(var1) == 0) {
            this.goodPacks[var2] = null;
            return;
         }

         ++var2;
      }

   }

   public void ad(int var1, ActivityRole var2) {
      if (this.activityMap == null) {
         this.activityMap = new HashMap();
      }

      this.activityMap.put(var1, var2);
   }

   public int ae(dJ[] var1) {
      int var2 = var1.length > 0 ? Integer.MAX_VALUE : 0;
      dJ[] var5 = var1;
      int var4 = var1.length;
      int var7;
      int var10000 = var7 = 3 ^ 3;

      while(true) {
         if (var10000 >= var4) {
            var10000 = var2;
            break;
         }

         dJ var9 = var5[var7];
         int var6 = 3 ^ 3;

         int var3;
         for(var10000 = var3 = 3 ^ 3; var10000 < this.goodPacks.length; var10000 = var3) {
            Goodstable var8;
            if (this.goodPacks[var3] != null && (var8 = this.getGood(this.goodPacks[var3])) != null && var9.a == (long)var8.getGoodsid().intValue()) {
               var6 += var8.getUsetime();
            }

            ++var3;
         }

         if ((var2 = (int)Math.min((long)var2, (long)var6 / var9.b)) <= 0) {
            var10000 = var2;
            break;
         }

         ++var7;
         var10000 = var7;
      }

      return var10000 > 0 ? var2 : 0;
   }

   public RolePet getBBRolePet(int var1) {
      if (var1 <= 0) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.pets.iterator(); var10000.hasNext(); var10000 = var3) {
            RolePet var2;
            if ((var2 = (RolePet)var3.next()).getBb() == var1) {
               return var2;
            }
         }

         return null;
      }
   }

   public void setChosePetId(BigDecimal var1) {
      this.chosePetId = var1;
   }

   public long getActivityMoney(int var1, int var2) {
      ActivityRole var3;
      return (var3 = this.getActivity(var1)) != null ? var3.getValueByKey(var2) - var3.getValueByKey(-var2) : 0L;
   }

   public void setRolePetQY(long var1, int var3) {
      Iterator var5;
      Iterator var10000 = var5 = this.pets.iterator();

      while(var10000.hasNext()) {
         RolePet var4;
         if ((var4 = (RolePet)var5.next()).getId().longValue() == var1) {
            var10000 = var5;
            var4.setQy(var3);
         } else {
            if (var3 > 0 && var4.getQy() == var3) {
               var4.setQy(2 & 5);
            }

            var10000 = var5;
         }
      }

      this.ax();
   }

   public void af(Goodstable var1) {
      if (this.parcelList != null && var1 != null) {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.parcelList.size(); var10000 = var2) {
            if (((Goodstable)this.parcelList.get(var2)).getRgid().compareTo(var1.getRgid()) == 0) {
               if (var1.getUsetime() > 0) {
                  this.parcelList.set(var2, var1);
                  return;
               }

               this.parcelList.remove(var2);
               return;
            }

            ++var2;
         }

         this.parcelList.add(var1);
      }
   }

   public void ag(String var1) {
      UseCardBean var2;
      if ((var2 = (UseCardBean)this.limitMap.remove(var1)) != null) {
         cu var3;
         if ((var1.equals("月卡") || var1.equals("季卡")) && (var3 = (cu)this.gameView.getFormManagement().m(127 & 39)) != null) {
            var3.y(5 >> 1);
         }

         byte var7 = 0;
         int var6 = 3 ^ 3;
         int var4 = 3 >> 2;
         int var5 = 3 ^ 3;
         int var8 = var7 | (!var2.getType().equals("变身卡") && !var2.getType().equals("强法型") && !var2.getType().equals("加抗型") && !var2.getType().equals("增益型") && !var2.getType().equals("VIP") && !var2.getType().equals("帮派") && !var2.getType().equals("单人竞技场") ? 5 >> 3 : 1);
         var6 |= !var2.getType().equals("变身卡") && !var2.getType().equals("童卡") ? 3 ^ 3 : 1;
         var4 |= var2.getType().equals("限时礼包");
         if ((var5 |= var2.getType().equals("靓号")) == 0) {
            this.gameView.f(var2.getName() + "已经失去效果");
         }

         if (var8 != 0) {
            this.getRoleProperty().n();
         }

         if (var6 != 0) {
            this.f((boolean)(3 & 4));
         }

         if (var5 != 0) {
            this.getRoleProperty().i();
         }

         by var10001 = this.gameView.baseView;
         var10001.sw |= var4;
         this.gameView.baseView.op = (boolean)(3 >> 1);
      }
   }

   public void ah(List<dJ> var1) {
      ArrayList var5 = new ArrayList();

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < var1.size(); var10000 = var3) {
         dJ var4 = (dJ)var1.get(var3);
         Goodstable var2;
         if ((var2 = this.getGood(new BigDecimal(var4.a))) != null) {
            var2.ab((int)var4.b);
            if (var2.getUsetime() <= 0) {
               this.h(var2.getRgid());
            }

            var5.add(var2);
         }

         ++var3;
      }

      ParamTool.a(var5, --1, this.gameView.getClient());
   }

   public void ai(List<DataOther> var1) {
      if (var1 == null) {
         this.dataOtherList = null;
      } else {
         this.dataOtherList = var1;
      }
   }

   public RoleSummoning getPet(BigDecimal var1) {
      if (var1 == null) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.pets.iterator(); var10000.hasNext(); var10000 = var3) {
            RolePet var2;
            if ((var2 = (RolePet)var3.next()).getId().compareTo(var1) == 0) {
               return var2.getPet();
            }
         }

         return null;
      }
   }

   public FriendBean aj(long var1) {
      return null;
   }

   public RolePet getRolePetQY(int var1) {
      if (var1 == 0) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.pets.iterator(); var10000.hasNext(); var10000 = var3) {
            RolePet var2;
            if ((var2 = (RolePet)var3.next()).getQy() == var1) {
               return var2;
            }
         }

         return null;
      }
   }

   public boolean ak() {
      return this.helpLing;
   }

   public static void main(String[] var0) {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      StringBuffer var1 = new StringBuffer();
      hd.k(62L, var1);
      System.out.println(var1.toString());
      System.out.println(hd.ah(var1.toString(), 3 >> 2, --2) - 62L);
   }

   public boolean al(BigDecimal var1) {
      if (this.choseXuanBaoId != null && var1 != null) {
         return (boolean)(this.choseXuanBaoId.compareTo(var1) == 0 ? --1 : 0);
      } else {
         return false;
      }
   }

   public void am() {
      long[] var10000 = new long[104 & 31];
      boolean var10002 = true;
      long[] var1 = var10000;
      String var2;
      if (!hd.o(var2 = this.packRecord.getShortCutSkills())) {
         var1 = hd.m(var1, var2, 2 & 5, ",");
      }

      this.shortCutSkills = var1;
   }

   public Lingbao getLingBaoIndex(int var1) {
      return var1 < this.lingbaoList.size() ? this.getLingbao((BigDecimal)this.lingbaoList.get(var1)) : null;
   }

   public PrivateData getPrivateData() {
      return this.privateData;
   }

   public void setChoseXuanBaoId(BigDecimal var1) {
      this.choseXuanBaoId = var1;
   }

   public Lingbao getChoseBao() {
      return this.getLingbao(this.choseBaoId);
   }

   public boolean an() {
      return (boolean)(this.parcelList != null ? 4 ^ 5 : 0);
   }

   public void ao(Goodstable var1) {
      if (var1 != null) {
         if (var1.getRole_id().compareTo(this.loginResult.getRole_id()) != 0 && this.an() && var1.getRole_id().longValue() == 100000000L + this.roleId) {
            this.af(var1);
         } else if (var1.getType() == -1L) {
            this.n(String.valueOf(-var1.getGoodsid().longValue()));
         } else if (var1.getUsetime() <= 0) {
            this.h(var1.getRgid());
            this.bm(var1);
         } else {
            Goodstable var2;
            RoleData var8;
            if ((var2 = this.getGood(var1.getRgid())) != null) {
               if (var2.getStatus() == var1.getStatus()) {
                  this.goodMap.put(var1.getRgid(), var1);
                  var2.setRgid(var1.getRgid());
                  if (var1.getType() == 812L && (var1.getStatus() == --1 || var1.getBaseXuanBao().getId() >= --1 && var1.getBaseXuanBao().getId() <= --3)) {
                     this.roleProperty.q();
                  }

                  this.bm(var1);
                  return;
               }

               if (var2.getType() == 812L) {
                  label137: {
                     if (var1.getStatus() == --1) {
                        if (this.goodChoses[47 & 95] == null) {
                           this.goodChoses[79 & 63] = var1.getRgid();
                           var8 = this;
                           break label137;
                        }

                        if (this.goodChoses[49 & 94] == null) {
                           this.goodChoses[30 & 113] = var1.getRgid();
                           var8 = this;
                           break label137;
                        }

                        if (this.goodChoses[27 & 117] == null) {
                           var8 = this;
                           this.goodChoses[25 & 119] = var1.getRgid();
                           break label137;
                        }
                     } else {
                        if (hd.v(var1.getRgid(), this.goodChoses[31 & 111])) {
                           var8 = this;
                           this.goodChoses[79 & 63] = null;
                           break label137;
                        }

                        if (hd.v(var1.getRgid(), this.goodChoses[19 & 124])) {
                           var8 = this;
                           this.goodChoses[94 & 49] = null;
                           break label137;
                        }

                        if (hd.v(var1.getRgid(), this.goodChoses[93 & 51])) {
                           this.goodChoses[23 & 121] = null;
                        }
                     }

                     var8 = this;
                  }

                  var8.goodMap.put(var1.getRgid(), var1);
                  var2.setRgid(var1.getRgid());
                  this.roleProperty.q();
                  this.bm(var1);
                  return;
               }

               this.d(var2.getRgid(), (boolean)(3 ^ 3));
            }

            int var3 = 0;
            this.goodMap.put(var1.getRgid(), var1);
            int var10000;
            if (var1.getType() == 8888L) {
               if (var1.getStatus() == --1) {
                  var10000 = 2 ^ 3;
                  this.goodChoses[78 & 61] = var1.getRgid();
                  var3 = var10000;
               }

               this.wingGoodsList.add(var1.getRgid());
               var10000 = var3;
            } else {
               label180: {
                  if (var1.getType() == 8901L) {
                     this.flyList.add(var1.getRgid());
                     if (var1.getStatus() == (4 ^ 5)) {
                        var10000 = --1;
                        this.goodChoses[46 & 95] = var1.getRgid();
                        this.lastFlyId = this.goodChoses[95 & 46];
                        break label180;
                     }
                  } else {
                     if (var1.getType() == 520L && (var1.getStatus() == --4 || var1.getStatus() == --1)) {
                        if (var1.getStatus() == --1) {
                           var10000 = --1;
                           this.goodChoses[95 & 45] = var1.getRgid();
                           var3 = var10000;
                        }

                        this.starCardList.add(var1.getRgid());
                        var10000 = var3;
                        break label180;
                     }

                     int var4;
                     if (var1.getType() == 812L) {
                        if (var1.getStatus() == --1) {
                           if (this.goodChoses[15] == null) {
                              this.goodChoses[15] = var1.getRgid();
                           } else if (this.goodChoses[16] == null) {
                              this.goodChoses[16] = var1.getRgid();
                           } else if (this.goodChoses[17] == null) {
                              this.goodChoses[17] = var1.getRgid();
                           }

                           var3 = 1;
                        }

                        int var7;
                        if ((var4 = var1.getBaseXuanBao().getId()) == (4 ^ 5)) {
                           var7 = 2 ^ 3;
                           var8 = this;
                           this.goodXuanBaoStandby[3 >> 2] = var1.getRgid();
                           var3 = var7;
                        } else if (var4 == (1 ^ 3)) {
                           var7 = --1;
                           var8 = this;
                           this.goodXuanBaoStandby[2 ^ 3] = var1.getRgid();
                           var3 = var7;
                        } else {
                           if (var4 == --3) {
                              var10000 = --1;
                              this.goodXuanBaoStandby[5 >> 1] = var1.getRgid();
                              var3 = var10000;
                           }

                           var8 = this;
                        }

                        var8.xuanBaoList.add(var1.getRgid());
                        var10000 = var3;
                        break label180;
                     }

                     if (var1.getStatus() == 5 >> 1) {
                        var10000 = var3;
                        this.ddGoodsList.add(var1.getRgid());
                        this.a();
                        break label180;
                     }

                     if (var1.getStatus() == (2 ^ 3)) {
                        if ((var4 = GoodType.ai(var1.getType())) != -4 >> 2) {
                           if (var4 != 10) {
                              this.goodChoses[var4] = var1.getRgid();
                           } else {
                              BigDecimal[] var6 = this.goodChoses;
                              byte var10001;
                              Goodstable var10002;
                              if (this.goodChoses[10] == null) {
                                 var10001 = 10;
                                 var10002 = var1;
                              } else {
                                 var10001 = 11;
                                 var10002 = var1;
                              }

                              var6[var10001] = var10002.getRgid();
                           }

                           byte var5;
                           var10000 = var5 = 1;
                           break label180;
                        }
                     } else if (var1.getStatus() == 0) {
                        this.i(var1);
                     }
                  }

                  var10000 = var3;
               }
            }

            if (var10000 != 0) {
               this.roleProperty.q();
            }

            if (var2 != null) {
               var2.setRgid(var1.getRgid());
            }

            this.bm(var1);
         }
      }
   }

   public PackRecord getPackRecord() {
      return this.packRecord;
   }

   public Mount getMount(int var1) {
      if (var1 == 0) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.mounts.iterator(); var10000.hasNext(); var10000 = var3) {
            Mount var2;
            if ((var2 = (Mount)var3.next()).getMountid() == var1) {
               return var2;
            }
         }

         return null;
      }
   }

   public boolean ap(String var1, List<BigDecimal> var2, Map<BigDecimal, Lingbao> var3) {
      int var4;
      for(int var10000 = var4 = 3 & 4; var10000 < var2.size(); var10000 = var4) {
         if (((Lingbao)var3.get(var2.get(var4))).getBaoname().equals(var1)) {
            return (boolean)(--1);
         }

         ++var4;
      }

      return (boolean)(2 & 5);
   }

   public void aq(int var1) {
      this.activityMap.remove(var1);
   }

   public void ar(Long var1, int var2) {
      if (var1 != null) {
         if (var2 < this.shortCutSkills.length) {
            long var3 = var2 >= 0 ? this.shortCutSkills[var2] : 0L;

            int var5;
            for(int var10000 = var5 = 2 & 5; var10000 < this.shortCutSkills.length; var10000 = var5) {
               if (this.shortCutSkills[var5] == var1) {
                  this.shortCutSkills[var5] = var3;
                  if (var2 >= 0) {
                     this.shortCutSkills[var2] = var1;
                  }

                  return;
               }

               ++var5;
            }

            if (var2 >= 0) {
               this.shortCutSkills[var2] = var1;
            }

         }
      }
   }

   public void as(List<Goodstable> var1) {
      this.bb();
      ArrayList var2 = new ArrayList();
      Iterator var3;
      Iterator var10000 = var3 = var1.iterator();

      while(true) {
         while(var10000.hasNext()) {
            Goodstable var5;
            if ((var5 = (Goodstable)var3.next()).getUsetime() <= 0) {
               var10000 = var3;
            } else {
               RoleData var6;
               if (var5.getType() == 8888L) {
                  if (var5.getStatus() == 5 >> 2) {
                     this.goodChoses[92 & 47] = var5.getRgid();
                  }

                  var6 = this;
                  this.wingGoodsList.add(var5.getRgid());
               } else {
                  label99: {
                     if (var5.getType() == 8901L) {
                        this.flyList.add(var5.getRgid());
                        if (var5.getStatus() == 3 >> 1) {
                           var6 = this;
                           this.goodChoses[30 & 111] = var5.getRgid();
                           this.lastFlyId = this.goodChoses[31 & 110];
                           break label99;
                        }
                     } else {
                        if (var5.getType() == 520L && (var5.getStatus() == --4 || var5.getStatus() == (3 & 5))) {
                           if (var5.getStatus() == (3 & 5)) {
                              this.goodChoses[111 & 29] = var5.getRgid();
                           }

                           var6 = this;
                           this.starCardList.add(var5.getRgid());
                           break label99;
                        }

                        if (var5.getType() == 812L) {
                           Goodstable var7;
                           label66: {
                              if (var5.getStatus() == --1) {
                                 if (this.goodChoses[79 & 63] == null) {
                                    this.goodChoses[47 & 95] = var5.getRgid();
                                    var7 = var5;
                                    break label66;
                                 }

                                 if (this.goodChoses[117 & 26] == null) {
                                    this.goodChoses[61 & 82] = var5.getRgid();
                                    var7 = var5;
                                    break label66;
                                 }

                                 if (this.goodChoses[53 & 91] == null) {
                                    this.goodChoses[115 & 29] = var5.getRgid();
                                 }
                              }

                              var7 = var5;
                           }

                           int var4;
                           if ((var4 = var7.getBaseXuanBao().getId()) == (2 ^ 3)) {
                              var6 = this;
                              this.goodXuanBaoStandby[2 & 5] = var5.getRgid();
                           } else if (var4 == (1 ^ 3)) {
                              var6 = this;
                              this.goodXuanBaoStandby[5 >> 2] = var5.getRgid();
                           } else {
                              if (var4 == --3) {
                                 this.goodXuanBaoStandby[5 >> 1] = var5.getRgid();
                              }

                              var6 = this;
                           }

                           var6.xuanBaoList.add(var5.getRgid());
                           var6 = this;
                           break label99;
                        }

                        if (var5.getStatus() == 5 >> 1) {
                           var6 = this;
                           this.ddGoodsList.add(var5.getRgid());
                           break label99;
                        }

                        if (var5.getStatus() != (4 ^ 5)) {
                           var2.add(var5.getRgid());
                        }
                     }

                     var6 = this;
                  }
               }

               var6.goodMap.put(var5.getRgid(), var5);
               var10000 = var3;
            }
         }

         this.setEquipGoodsList(this.packRecord.getEquipType("E"));
         this.at(var2);
         this.a();
         return;
      }
   }

   public void at(List<BigDecimal> var1) {
      int var10000;
      int var4;
      try {
         String var2;
         if ((var2 = this.packRecord.getRecord()) != null && !var2.equals("")) {
            var4 = 3 ^ 3;
            int var3 = 2 & 5;

            int var5;
            for(var10000 = var5 = 2 & 5; var10000 < var2.length(); var10000 = var5) {
               if ((var5 = var2.indexOf("|", var3 + --1)) == -4 >> 2) {
                  var5 = var2.length();
               }

               label51: {
                  var3 += 2;
                  if ((var4 = (int)(hd.ah(var2, var3 - (1 ^ 3), var3) - 62L)) < this.goodPacks.length) {
                     if (this.goodPacks[var4] != null) {
                        var10000 = var5;
                        break label51;
                     }

                     BigDecimal var6 = new BigDecimal(hd.ah(var2, var3, var5));
                     if (var1.remove(var6)) {
                        this.goodPacks[var4] = var6;
                     }
                  }

                  var10000 = var5;
               }

               var3 = var10000 + 1;
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      int var8 = 0;

      for(var10000 = var4 = 5 >> 3; var10000 < var1.size(); var10000 = var4) {
         BigDecimal var9 = (BigDecimal)var1.get(var4);

         for(var10000 = var8; var10000 < this.goodPacks.length; var10000 = var8) {
            if (this.goodPacks[var8] == null) {
               this.goodPacks[var8] = var9;
               break;
            }

            ++var8;
         }

         ++var4;
      }

   }

   public BaseMountSH getMountSHByindex(int var1) {
      return this.mountSHs[var1];
   }

   public void au(List<RoleSummoning> var1, List<Mount> var2, List<Lingbao> var3, List<Baby> var4, List<Pal> var5) {
      this.mounts = var2;
      this.babys = var4;
      this.pals = var5;
      this.bk(var1);
      this.bf(var3);
   }

   public boolean av(String var1, BigDecimal var2, List<BigDecimal> var3, Map<BigDecimal, Lingbao> var4) {
      int var5;
      for(int var10000 = var5 = 2 & 5; var10000 < var3.size(); var10000 = var5) {
         Lingbao var6;
         if ((var6 = (Lingbao)var4.get(var3.get(var5))).getBaoname().equals(var1)) {
            if (var6.getBaoid().compareTo(var2) != 0) {
               return (boolean)(4 ^ 5);
            }

            return false;
         }

         ++var5;
      }

      return (boolean)(5 >> 3);
   }

   public void setHelpLB(BigDecimal[] var1) {
      int var5 = 2 & 5;

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < var1.length; var10000 = var3) {
         BigDecimal var4 = var1[var3];

         int var2;
         for(var10000 = var2 = var5; var10000 < this.lingbaoList.size(); var10000 = var2) {
            if (((BigDecimal)this.lingbaoList.get(var2)).compareTo(var4) == 0) {
               if (var5 != var2) {
                  BigDecimal var6 = (BigDecimal)this.lingbaoList.get(var5);
                  this.lingbaoList.set(var5, (BigDecimal)this.lingbaoList.get(var2));
                  this.lingbaoList.set(var2, var6);
               }

               ++var5;
               break;
            }

            ++var2;
         }

         ++var3;
      }

      this.bd();
   }

   public void setEquipGoodsList(BigDecimal[] var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 3 ^ 3; var10000 < 12; var10000 = var2) {
         int var10001 = var2;
         BigDecimal var10002 = var1[var2];
         ++var2;
         this.goodChoses[var10001] = var10002;
      }

      for(var10000 = var2 = 3 & 4; var10000 < 12; var10000 = var2) {
         if (this.goodChoses[var2] != null) {
            int var5;
            if (this.getEquipGood(var2) == null) {
               StringBuffer var6;
               (var6 = new StringBuffer()).append("E");
               var6.append(var2);
               var6.append("=A");
               var6.append(this.goodChoses[var2]);
               String var7 = Agreement.getSendTextAES("rolechange", var6.toString());
               this.getGameView().getClient().d(var7);
               this.goodChoses[var2] = null;
            } else {
               for(var10000 = var5 = var2 + (3 & 5); var10000 < 12; var10000 = var5) {
                  if (hd.v(this.goodChoses[var2], this.goodChoses[var5])) {
                     StringBuffer var3;
                     (var3 = new StringBuffer()).append("E");
                     var3.append(var2);
                     var3.append("=A");
                     var3.append(this.goodChoses[var5]);
                     String var4 = Agreement.getSendTextAES("rolechange", var3.toString());
                     this.getGameView().getClient().d(var4);
                     this.goodChoses[var5] = null;
                  }

                  ++var5;
               }
            }
         }

         ++var2;
      }

   }

   public void setHelpLing(boolean var1) {
      this.helpLing = var1;
   }

   public Mount getMount(BigDecimal var1) {
      if (var1 == null) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.mounts.iterator(); var10000.hasNext(); var10000 = var3) {
            Mount var2;
            if ((var2 = (Mount)var3.next()).getMid().compareTo(var1) == 0) {
               return var2;
            }
         }

         return null;
      }
   }

   public int getFaPJ() {
      int var1 = 3 >> 2;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.fabaoList.size(); var10000 = var2) {
         Lingbao var3;
         if ((var3 = this.getLingbao((BigDecimal)this.fabaoList.get(var2))) != null) {
            var1 += BaseValue.getFv(var3);
         }

         ++var2;
      }

      return var1;
   }

   public List<dJ> aw(dJ... var1) {
      ArrayList var7 = null;
      int var5 = var1.length;

      int var4;
      for(int var10000 = var4 = 3 ^ 3; var10000 < this.goodPacks.length; var10000 = var4) {
         Goodstable var3;
         int var6;
         if (var5 > 0 && this.goodPacks[var4] != null && (var3 = this.getGood(this.goodPacks[var4])) != null) {
            for(var10000 = var6 = 0; var10000 < var1.length; var10000 = var6) {
               dJ var2;
               if ((var2 = var1[var6]) != null && var2.a == (long)var3.getType().intValue()) {
                  ArrayList var8;
                  if ((long)var3.getUsetime() >= var2.b) {
                     var8 = var7;
                     --var5;
                     var1[var6] = null;
                     var2.a = var3.getRgid().longValue();
                  } else {
                     var2.b -= (long)var3.getUsetime();
                     var2 = new dJ(var3.getRgid().longValue(), (long)var3.getUsetime());
                     var8 = var7;
                  }

                  if (var8 == null) {
                     var7 = new ArrayList();
                  }

                  var7.add(var2);
               }

               ++var6;
            }
         }

         ++var4;
      }

      if (var5 == 0) {
         return var7;
      } else {
         return null;
      }
   }

   public BaseMountSH getMountSHByMountId(int var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 2; var10000 < this.mountSHs.length; var10000 = var2) {
         if (this.mountSHs[var2].a(var1) != 0) {
            return this.mountSHs[var2];
         }

         ++var2;
      }

      return null;
   }

   public void ax() {
      StringBuffer var1 = new StringBuffer();
      if (!this.helpPet) {
         var1.append("SHUT");
      }

      int var2;
      for(int var10000 = var2 = 0; var10000 < this.pets.size(); var10000 = var2) {
         Object var5 = this.pets.get(var2);
         ++var2;
         ((RolePet)var5).b(var1);
      }

      String var4;
      if (!(var4 = var1.toString()).equals(this.packRecord.getHelpBb())) {
         this.packRecord.setHelpBb(var4);
         String var3 = Agreement.getSendTextAES("1", (2 ^ 3) + this.packRecord.getHelpBb());
         this.gameView.getClient().d(var3);
      }
   }

   public List<FriendBean> getFriendList() {
      if (this.friendMap == null) {
         return new ArrayList(5 >> 3);
      } else {
         ArrayList var1 = new ArrayList(this.friendMap.size());
         Iterator var3;
         Iterator var10000 = var3 = this.friendMap.values().iterator();

         while(var10000.hasNext()) {
            FriendBean var2 = (FriendBean)var3.next();
            var10000 = var3;
            var1.add(var2);
         }

         return var1;
      }
   }

   public void ay() {
      int var9 = 3 & 4;
      int var7 = 3 >> 2;
      int var8 = 3 ^ 3;
      int var4 = 3 ^ 3;
      long var5 = ev.f();
      StringBuffer var2 = null;
      Iterator var3;
      Iterator var10000 = var3 = this.limitMap.entrySet().iterator();

      while(true) {
         while(var10000.hasNext()) {
            UseCardBean var1;
            StringBuffer var14;
            if ((var1 = (UseCardBean)((Entry)var3.next()).getValue()).getType().equals("限时礼包")) {
               List var10;
               int var11;
               for(int var16 = var11 = (var10 = var1.getKeysByActivity()).size() - --1; var16 >= 0; var16 = var11) {
                  bw var12 = (bw)var10.get(var11);
                  if (var5 >= var12.b) {
                     var10.remove(var11);
                     if (var8 == 0) {
                        if (var2 == null) {
                           var14 = var2 = new StringBuffer("T");
                        } else {
                           var14 = var2;
                           var2.append("|");
                        }

                        var14.append(var1.getType());
                        var8 = 2 ^ 3;
                     }

                     var2.append("=");
                     var2.append(var12.a);
                     if (var10.size() == 0) {
                        var3.remove();
                     }
                  }

                  --var11;
               }

               var10000 = var3;
            } else {
               if (var1.b(var5)) {
                  var3.remove();
                  if (var2 == null) {
                     var14 = var2 = new StringBuffer("T");
                  } else {
                     var14 = var2;
                     var2.append("|");
                  }

                  var14.append(var1.getType());
                  if (var1.getType().equals("靓号")) {
                     var10000 = var3;
                     int var10001 = --1;
                     this.gameView.f("你的靓号已到期");
                     var4 = var10001;
                     continue;
                  }

                  var9 |= !var1.getType().equals("变身卡") && !var1.getType().equals("强法型") && !var1.getType().equals("加抗型") && !var1.getType().equals("增益型") && !var1.getType().equals("VIP") && !var1.getType().equals("帮派") && !var1.getType().equals("单人竞技场") ? 3 ^ 3 : 1;
                  var7 |= !var1.getType().equals("变身卡") && !var1.getType().equals("童卡") && !var1.getType().equals("光武") ? 3 & 4 : 1;
                  this.gameView.f(var1.getName() + "已经失去效果");
               }

               var10000 = var3;
            }
         }

         by var15;
         if (var2 == null) {
            var15 = this.gameView.baseView;
            var15.sw |= var8;
            this.gameView.baseView.op = (boolean)(3 & 5);
            return;
         }

         String var13 = Agreement.getSendTextAES("usercard", var2.toString());
         this.gameView.getClient().d(var13);
         if (var9 != 0) {
            this.getRoleProperty().n();
         }

         if (var7 != 0) {
            this.f((boolean)(5 >> 3));
         }

         if (var4 != 0) {
            this.getRoleProperty().i();
         }

         var15 = this.gameView.baseView;
         var15.sw |= var8;
         this.gameView.baseView.op = (boolean)(3 >> 1);
         return;
      }
   }

   public RoleTaskData getTaskSystem() {
      return this.taskSystem;
   }

   public Goodstable az(long var1) {
      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < this.goodPacks.length; var10000 = var3) {
         if (this.goodPacks[var3] != null && this.getGood(this.goodPacks[var3]).getType() == var1) {
            return this.getGood(this.goodPacks[var3]);
         }

         ++var3;
      }

      return null;
   }

   public void ba() {
      if (this.roleProperty == null) {
         this.roleProperty = new RoleProperty(this);
      }

      this.roleProperty.t();
   }

   public void bb() {
      RoleData var10000;
      if (this.goodMap != null) {
         this.goodMap.clear();
         var10000 = this;
      } else {
         this.goodMap = new HashMap();
         var10000 = this;
      }

      if (var10000.wingGoodsList != null) {
         this.wingGoodsList.clear();
         var10000 = this;
      } else {
         this.wingGoodsList = new ArrayList();
         var10000 = this;
      }

      if (var10000.starCardList != null) {
         this.starCardList.clear();
         var10000 = this;
      } else {
         this.starCardList = new ArrayList();
         var10000 = this;
      }

      if (var10000.xuanBaoList != null) {
         this.xuanBaoList.clear();
         var10000 = this;
      } else {
         this.xuanBaoList = new ArrayList();
         var10000 = this;
      }

      if (var10000.flyList != null) {
         this.flyList.clear();
         var10000 = this;
      } else {
         this.flyList = new ArrayList();
         var10000 = this;
      }

      if (var10000.ddGoodsList != null) {
         this.ddGoodsList.clear();
         var10000 = this;
      } else {
         this.ddGoodsList = new ArrayList();
         var10000 = this;
      }

      int var1;
      int var2;
      BigDecimal[] var3;
      boolean var10003;
      if (var10000.goodChoses != null) {
         for(var2 = var1 = 3 >> 2; var2 < this.goodChoses.length; var2 = var1) {
            this.goodChoses[var1++] = null;
         }

         var10000 = this;
      } else {
         var3 = new BigDecimal[31 & 114];
         var10003 = true;
         this.goodChoses = var3;
         var10000 = this;
      }

      if (var10000.goodXuanBaoStandby != null) {
         for(var2 = var1 = 2 & 5; var2 < this.goodXuanBaoStandby.length; var2 = var1) {
            this.goodXuanBaoStandby[var1++] = null;
         }

         var10000 = this;
      } else {
         var3 = new BigDecimal[--3];
         var10003 = true;
         this.goodXuanBaoStandby = var3;
         var10000 = this;
      }

      if (var10000.goodPacks != null && this.goodPacks.length == this.getPackNumTwo(this.loginResult.getTurnAround())) {
         for(var2 = var1 = 2 & 5; var2 < this.goodPacks.length; var2 = var1) {
            this.goodPacks[var1++] = null;
         }

      } else {
         var3 = new BigDecimal[this.getPackNumTwo(this.loginResult.getTurnAround())];
         var10003 = true;
         this.goodPacks = var3;
      }
   }

   public Skill getShortCutSkillById(long var1) {
      if (var1 == 0L) {
         return null;
      } else {
         int var3 = (int)(var1 >> (94 & 41));
         int var5 = (int)(var1 & 255L);
         if (var3 >= --1 && var3 <= --3) {
            int var6 = SkillUtil.getSepciesIndex(this.loginResult.getSpecies_id(), var3 - (5 >> 2));
            int var4 = (5119 & 28649) + var6 * --5 + var5;
            return this.getObjectArea().bf(String.valueOf(var4));
         } else if (var3 != --4) {
            return null;
         } else {
            BaseMeridians var2;
            var5 = (var2 = this.roleProperty.getMeridians(3 >> 2)) != null && var2.getKey() != null ? Integer.parseInt(var2.getKey()) - (3 & 5) : -1;
            if (var5 != -4 >> 2) {
               var3 = SkillUtil.getFMIndex(SkillUtil.getSepciesIndex(this.loginResult.getSpecies_id()), var5);
               return this.getObjectArea().bf(String.valueOf((28400 & 16367) + var3));
            } else {
               return null;
            }
         }
      }
   }

   public void setLockPack() {
      this.lockPack = (boolean)(this.lockPack ? 3 ^ 3 : 1);
   }

   public Goodstable bc(BigDecimal var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.goodPacks.length; var10000 = var2) {
            if (this.goodPacks[var2] != null && this.getGood(this.goodPacks[var2]).getGoodsid().compareTo(var1) == 0) {
               return this.getGood(this.goodPacks[var2]);
            }

            ++var2;
         }

         return null;
      }
   }

   public long getRoleId() {
      return this.roleId;
   }

   public void setChosePalId(BigDecimal var1) {
      this.chosePalId = var1;
   }

   public List<RolePet> getHelpBb() {
      ArrayList var4 = new ArrayList();
      int var8 = 3 & 4;
      int var6 = 2 & 5;
      RolePet var1 = null;

      int var5;
      for(int var10000 = var5 = --1; var10000 != 0; var10000 = var5) {
         var5 = 0;
         var1 = null;
         int var3 = 3 ^ 3;
         int var7 = this.pets.size();

         for(var10000 = var3; var10000 < var7; var10000 = var3) {
            RolePet var2;
            if ((var2 = (RolePet)this.pets.get(var3)).getHelp() != 0 && var2.getHelp() >= var6 && !var4.contains(var2) && (var1 == null || var1.getHelp() > var2.getHelp())) {
               var1 = var2;
            }

            ++var3;
         }

         if (var1 != null) {
            int var10002 = var1.getHelp();
            ++var8;
            var6 = var10002;
            var5 = 2 ^ 3;
            var1.setHelp(var8);
            var4.add(var1);
         }
      }

      return var4;
   }

   public void bd() {
      StringBuffer var1 = new StringBuffer();
      if (!this.helpLing) {
         var1.append("SHUT");
      }

      int var2;
      for(int var10000 = var2 = 0; var10000 < this.lingbaoList.size(); var10000 = var2) {
         if (var1.length() != 0) {
            var1.append("|");
         }

         var1.append(this.lingbaoList.get(var2++));
      }

      String var4;
      if (!(var4 = var1.toString()).equals(this.packRecord.getHelpLing())) {
         this.packRecord.setHelpLing(var4);
         String var3 = Agreement.getSendTextAES("1", (5 >> 1) + this.packRecord.getHelpLing());
         this.gameView.getClient().d(var3);
      }
   }

   public RolePet be(RoleSummoning var1) {
      RolePet var2 = new RolePet(var1.getSid());
      var2.setPet(var1);
      this.pets.add(var2);
      return var2;
   }

   public void bf(List<Lingbao> var1) {
      int var7 = 3 >> 2;
      BigDecimal[] var10000 = new BigDecimal[--3];
      boolean var10002 = true;
      BigDecimal[] var8 = var10000;
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      HashMap var6 = new HashMap();
      Iterator var2;
      Iterator var17 = var2 = var1.iterator();

      while(true) {
         while(var17.hasNext()) {
            Lingbao var12;
            HashMap var18;
            label85: {
               if (!(var12 = (Lingbao)var2.next()).getBaotype().equals("法宝")) {
                  var4.add(var12.getBaoid());
                  if (var12.getEquipment() == --1) {
                     var18 = var6;
                     var8[3 ^ 3] = var12.getBaoid();
                     break label85;
                  }
               } else {
                  if (this.ap(var12.getBaoname(), var5, var6)) {
                     var12.setOperation("删除");
                     String var3 = Agreement.getSendTextAES("updateling", mi.b().toJson(var12));
                     var17 = var2;
                     this.gameView.getClient().d(var3);
                     continue;
                  }

                  var5.add(var12.getBaoid());
                  if (var12.getEquipment() == (2 ^ 3)) {
                     int var10001;
                     Lingbao var20;
                     if (var8[--1] == null) {
                        var10001 = --1;
                        var20 = var12;
                     } else {
                        var10001 = 2;
                        var20 = var12;
                     }

                     var8[var10001] = var20.getBaoid();
                  }
               }

               var18 = var6;
            }

            var18.put(var12.getBaoid(), var12);
            var17 = var2;
         }

         String var13;
         RoleData var19;
         if ((var13 = this.packRecord.getHelpLing()) != null && !var13.equals("") && !var13.equals("null")) {
            int var15 = 0;
            String[] var16;
            var7 = (var16 = var13.split("\\|")).length > 0 && var16[2 & 5].equals("SHUT") ? 3 ^ 3 : 1;
            int var14 = var16.length > 0 && var16[3 >> 2].equals("SHUT") ? --1 : 0;

            for(int var21 = var14; var21 < var16.length; var21 = var14) {
               BigDecimal var9 = new BigDecimal(var16[var14]);

               int var10;
               for(var21 = var10 = var15; var21 < var4.size(); var21 = var10) {
                  if (((BigDecimal)var4.get(var10)).compareTo(var9) == 0) {
                     if (var15 != var10) {
                        BigDecimal var11 = (BigDecimal)var4.get(var15);
                        var4.set(var15, var9);
                        var4.set(var10, var11);
                     }

                     ++var15;
                     break;
                  }

                  ++var10;
               }

               ++var14;
            }

            var19 = this;
         } else {
            var7 = 1;
            var19 = this;
         }

         var19.helpLing = (boolean)var7;
         this.lingbaoMap = var6;
         this.fabaoList = var5;
         this.lingbaoList = var4;
         this.lingbaoChoses = var8;
         return;
      }
   }

   public void bg() {
      BaseMountSH[] var10001 = new BaseMountSH[--5];
      boolean var10003 = true;
      this.mountSHs = var10001;

      int var1;
      for(int var10000 = var1 = 3 & 4; var10000 < this.mountSHs.length; var10000 = var1) {
         BaseMountSH[] var2 = this.mountSHs;
         int var3 = var1;
         BaseMountSH var10002 = this.packRecord.getMountSH(var1);
         ++var1;
         var2[var3] = var10002;
      }

   }

   public int getGoodNum(BigDecimal var1) {
      int var2 = 3 & 4;

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < this.goodPacks.length; var10000 = var3) {
         if (this.goodPacks[var3] != null && this.getGood(this.goodPacks[var3]).getGoodsid().compareTo(var1) == 0) {
            var2 += this.getGood(this.goodPacks[var3]).getUsetime();
         }

         ++var3;
      }

      return var2;
   }

   public String getGoodNum(BigDecimal var1, StringBuffer var2, int var3) {
      int var4;
      for(int var10000 = var4 = 3 & 4; var10000 < this.goodPacks.length; var10000 = var4) {
         Goodstable var5 = this.goodPacks[var4] != null ? this.getGood(this.goodPacks[var4]) : null;
         if (var5 != null && var5.getGoodsid().compareTo(var1) == 0) {
            if (var5.getGoodlock() == (4 ^ 5)) {
               return "道具被上锁";
            }

            if (var2.length() != 0) {
               var2.append("|");
            }

            var2.append(var5.getRgid());
            var2.append("=");
            if (var3 > var5.getUsetime()) {
               var2.append(var5.getUsetime());
               var3 -= var5.getUsetime();
               var10000 = var3;
            } else {
               var2.append(var3);
               var3 = 3 & 4;
               var10000 = var3;
            }

            if (var10000 == 0) {
               return null;
            }
         }

         ++var4;
      }

      if (var3 > 0) {
         return "数量不足";
      } else {
         return null;
      }
   }

   public FriendBean bh(FriendBean var1) {
      if (this.friendMap == null) {
         this.friendMap = new HashMap();
      }

      FriendBean var2;
      if ((var2 = this.getFriend(var1.getFid())) != null) {
         return var2.b(var1);
      } else {
         this.friendMap.put(var1.getFid(), var1);
         return var1;
      }
   }

   public UseCardBean getLimit(String var1) {
      return (UseCardBean)this.limitMap.get(var1);
   }

   public Mount getPetMount(BigDecimal var1) {
      if (this.mounts == null) {
         return null;
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.mounts.size(); var10000 = var2) {
            Mount var3;
            if ((var3 = (Mount)this.mounts.get(var2)).a(var1)) {
               return var3;
            }

            ++var2;
         }

         return null;
      }
   }

   public Goodstable getParcelGood(int var1) {
      return this.parcelList != null && var1 < this.parcelList.size() ? (Goodstable)this.parcelList.get(var1) : null;
   }

   public List<RolePet> bi() {
      int[] var10000 = new int[13 & 123];
      boolean var10002 = true;
      var10000[2 & 5] = 1950 & 32623;
      var10000[3 >> 1] = 6142 & 28445;
      var10000[1 ^ 3] = 22429 & 12159;
      var10000[--3] = 32702 & 1887;
      var10000[--4] = 26431 & 8159;
      var10000[--5] = 6074 & 28517;
      var10000[15 & 118] = 7981 & 26611;
      var10000[103 & 31] = 4003 & 30590;
      var10000[14 & 121] = 22511 & 12083;
      int[] var4 = var10000;
      Iterator var3;
      Iterator var9 = var3 = this.pets.iterator();

      while(true) {
         while(true) {
            label40:
            while(var9.hasNext()) {
               String var1;
               RolePet var5;
               if ((var1 = (var5 = (RolePet)var3.next()).getPet().getPetSkills()) != null && !var1.equals("")) {
                  String[] var8 = var1.split("\\|");
                  int var2;
                  int var10 = var2 = 3 >> 2;

                  label59:
                  while(true) {
                     if (var10 >= var8.length) {
                        var5.setHelp(2 & 5);
                        break;
                     }

                     if (!var8[var2].startsWith("L") && !var8[var2].startsWith("Q") && !var8[var2].startsWith("T") && !var8[var2].startsWith("X")) {
                        int var6 = Integer.parseInt((var6 = var8[var2].indexOf("=")) == -4 >> 2 ? var8[var2] : var8[var2].substring(2 & 5, var6));

                        int var7;
                        for(var10 = var7 = 3 >> 2; var10 < var4.length; var10 = var7) {
                           if (var4[var7] == var6) {
                              if (var5.getHelp() == 0) {
                                 var9 = var3;
                                 var5.setHelp(123 & 103);
                                 continue label40;
                              }
                              break label59;
                           }

                           ++var7;
                        }
                     }

                     ++var2;
                     var10 = var2;
                  }

                  var9 = var3;
               } else {
                  var5.setHelp(3 & 4);
                  var9 = var3;
               }
            }

            return this.getHelpBb();
         }
      }
   }

   public Goodstable getGoodEquip(BigDecimal var1) {
      Goodstable var2 = var1 != null ? (Goodstable)this.goodMap.get(var1) : null;
      return var2 != null && var2.getStatus() == (3 & 5) ? var2 : null;
   }

   public long getGoodTypeNum(int var1) {
      long var2 = 0L;

      int var4;
      for(int var10000 = var4 = 5 >> 3; var10000 < this.goodPacks.length; var10000 = var4) {
         if (this.goodPacks[var4] != null && this.getGood(this.goodPacks[var4]).getType() == (long)var1) {
            var2 += (long)this.getGood(this.goodPacks[var4]).getUsetime();
         }

         ++var4;
      }

      return var2;
   }

   public Lingbao getFaBaoIndex(int var1) {
      return var1 < this.fabaoList.size() ? this.getLingbao((BigDecimal)this.fabaoList.get(var1)) : null;
   }

   public int getBBRolePet() {
      int var1 = 3 & 4;
      Iterator var3;
      Iterator var10000 = var3 = this.pets.iterator();

      while(var10000.hasNext()) {
         RolePet var2;
         if ((var2 = (RolePet)var3.next()).getBb() == 0) {
            var10000 = var3;
         } else {
            var1 |= 5 >> 2 << var2.getBb();
            var10000 = var3;
         }
      }

      int var4;
      for(int var5 = var4 = 2 ^ 3; var5 <= 4; var5 = var4) {
         if ((var1 >>> var4 & 3 >> 1) == 0) {
            return var4;
         }

         ++var4;
      }

      return 5 >> 3;
   }

   public boolean bj(BigDecimal var1) {
      if (this.chosePetId != null && var1 != null) {
         return (boolean)(this.chosePetId.compareTo(var1) == 0 ? 3 & 5 : 0);
      } else {
         return false;
      }
   }

   public void bk(List<RoleSummoning> var1) {
      int var5 = 3 ^ 3;
      ArrayList var3 = new ArrayList();
      String var4;
      RolePet var7;
      List var12;
      int var10000;
      if ((var4 = this.packRecord.getHelpBb()) != null) {
         String[] var2;
         var5 = (var2 = var4.split("\\|")).length > 0 && var2[3 & 4].equals("SHUT") ? 2 & 5 : 1;
         int var6 = var2.length > 0 && var2[3 >> 2].equals("SHUT") ? --1 : 0;

         for(var10000 = var6; var10000 < var2.length; var10000 = var6) {
            var7 = new RolePet(var2[var6]);
            ++var6;
            var3.add(var7);
         }

         var12 = var1;
      } else {
         var5 = 1;
         var12 = var1;
      }

      Iterator var11;
      for(Iterator var13 = var11 = var12.iterator(); var13.hasNext(); var13 = var11) {
         RoleSummoning var9 = (RoleSummoning)var11.next();
         var7 = null;

         RolePet var14;
         label53: {
            int var8;
            for(var10000 = var8 = 3 >> 2; var10000 < var3.size(); var10000 = var8) {
               if (var9.getSid().compareTo(((RolePet)var3.get(var8)).getId()) == 0) {
                  var14 = var7 = (RolePet)var3.get(var8);
                  break label53;
               }

               ++var8;
            }

            var14 = var7;
         }

         if (var14 == null) {
            var3.add(var7 = new RolePet(var9.getSid()));
         }

         var7.setPet(var9);
      }

      int var10;
      for(var10000 = var10 = var3.size() - (4 ^ 5); var10000 >= 0; var10000 = var10) {
         if (((RolePet)var3.get(var10)).getPet() == null) {
            var3.remove(var10);
         }

         --var10;
      }

      this.helpPet = (boolean)var5;
      this.pets = var3;
   }

   public void setHelpPet(boolean var1) {
      this.helpPet = var1;
   }

   public Pal getPal(int var1) {
      Iterator var3;
      for(Iterator var10000 = var3 = this.pals.iterator(); var10000.hasNext(); var10000 = var3) {
         Pal var2;
         if ((var2 = (Pal)var3.next()).getpId() == var1) {
            return var2;
         }
      }

      return null;
   }

   public void bl(BigDecimal var1, int var2) {
      if (var1 != null) {
         if (var2 >= 0 && var2 < this.goodPacks.length) {
            BigDecimal var4 = this.goodPacks[var2];

            int var3;
            for(int var10000 = var3 = 3 ^ 3; var10000 < this.goodPacks.length; var10000 = var3) {
               if (this.goodPacks[var3] != null && this.goodPacks[var3].compareTo(var1) == 0) {
                  this.goodPacks[var3] = var4;
                  this.goodPacks[var2] = var1;
                  return;
               }

               ++var3;
            }

         }
      }
   }

   public void bm(Goodstable var1) {
      lT var2;
      if ((var2 = (lT)this.gameView.getFormManagement().m(127 & 61)) != null && (var2.e() == 0 || var2.e() == --1 || var2.e() == --2)) {
         var2.zl().ax(var1);
      }

      aF var3;
      if ((var3 = (aF)this.gameView.getFormManagement().m(31 & 122)) != null) {
         var3.av(var1);
      }

      if (var1.getType() == 812L) {
         this.getRoleProperty().o(var1);
      } else {
         eB var4;
         if (GoodType.ac(var1.getType()) && (var4 = (eB)this.gameView.getFormManagement().m(95 & 123)) != null) {
            var4.av(var1);
         }

      }
   }

   public BeauBean getBeau() {
      UseCardBean var1;
      return (var1 = this.getLimit("靓号")) != null ? var1.a() : null;
   }

   public int getGoodPackSum(long var1, BigDecimal var3, int var4) {
      int var5 = 5 >> 3;
      int var10000;
      int var6;
      if (!GoodType.ag(var1)) {
         for(var10000 = var6 = 0; var10000 < this.goodPacks.length; var10000 = var6) {
            if (this.goodPacks[var6] == null) {
               ++var5;
               if (var5 >= var4) {
                  return var4;
               }
            }

            ++var6;
         }

         return var5;
      } else {
         for(var10000 = var6 = 3 ^ 3; var10000 < this.goodPacks.length; var10000 = var6) {
            if (this.goodPacks[var6] == null || var3.compareTo(this.getGood(this.goodPacks[var6]).getGoodsid()) == 0) {
               return var4;
            }

            ++var6;
         }

         return var5;
      }
   }

   public RoleSummoning getChosePet() {
      return this.getPet(this.chosePetId);
   }

   public void bn(DataOther var1) {
      if (this.dataOtherList != null) {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.dataOtherList.size(); var10000 = var2) {
            if (((DataOther)this.dataOtherList.get(var2)).getId() == var1.getId()) {
               if (var1.getType() != -4 >> 2) {
                  this.dataOtherList.set(var2, var1);
                  return;
               }

               this.dataOtherList.remove(var2);
               return;
            }

            ++var2;
         }

         this.dataOtherList.add(var1);
      }
   }

   public boolean bo() {
      return (boolean)(this.dataOtherList != null ? 3 & 5 : 0);
   }

   public Goodstable getStarCardGood(int var1) {
      return var1 < this.starCardList.size() ? this.getGood((BigDecimal)this.starCardList.get(var1)) : null;
   }

   public void bp() {
      String var1 = hd.al(this.shortCutSkills, 5 >> 3, ",");
      this.packRecord.setShortCutSkills("JN" + var1);
      var1 = Agreement.getSendTextAES("1", (55 & 78) + var1);
      this.gameView.getClient().d(var1);
   }

   public void bq() {
      String var1 = this.getPackRecordString();
      PackRecord var2 = this.getPackRecord();
      if (!hd.r(var1, var2.getRecord())) {
         var2.setRecord(var1);
         var1 = Agreement.getSendTextAES("1", (5 >> 3) + var1);
         this.gameView.getClient().d(var1);
      }
   }

   public List<BigDecimal> br(List<dJ> var1) {
      ArrayList var5 = new ArrayList();

      int var4;
      for(int var10000 = var4 = 3 & 4; var10000 < var1.size(); var10000 = var4) {
         dJ var3 = (dJ)var1.get(var4);
         Goodstable var2;
         if ((var2 = this.getGood(new BigDecimal(var3.a))) != null) {
            int var6;
            for(var10000 = var6 = 5 >> 3; (long)var10000 < var3.b; var10000 = var6) {
               ++var6;
               var5.add(var2.getRgid());
            }

            var2.ab((int)var3.b);
            if (var2.getUsetime() <= 0) {
               this.h(var2.getRgid());
            }
         }

         ++var4;
      }

      return var5;
   }

   public void setChoseBaoId(BigDecimal var1) {
      this.choseBaoId = var1;
   }

   public LoginResult getLoginResult() {
      return this.loginResult;
   }

   public RoleProperty getRoleProperty() {
      return this.roleProperty;
   }

   public int getPackNum(int var1) {
      int var2 = var1 >= --4 ? --4 : var1;
      return var2 + (int)this.loginResult.getKilltype("包裹") + --1;
   }

   public FriendBean getFriendChat() {
      if (this.friendMap == null) {
         return null;
      } else {
         Iterator var2;
         for(Iterator var10000 = var2 = this.friendMap.values().iterator(); var10000.hasNext(); var10000 = var2) {
            FriendBean var1;
            if ((var1 = (FriendBean)var2.next()).e()) {
               return var1;
            }
         }

         return null;
      }
   }

   public void bs(int var1) {
      BigDecimal[] var10000 = new BigDecimal[this.getPackNumTwo(var1)];
      boolean var10002 = true;
      BigDecimal[] var3 = var10000;
      int var2;
      if (this.goodPacks != null) {
         for(int var4 = var2 = 5 >> 3; var4 < this.goodPacks.length && var2 < var3.length; var4 = var2) {
            int var10001 = var2;
            BigDecimal var5 = this.goodPacks[var2];
            ++var2;
            var3[var10001] = var5;
         }
      }

      this.goodPacks = var3;
   }

   public Goodstable getXuanBaoGood(int var1) {
      return var1 < this.xuanBaoList.size() ? this.getGood((BigDecimal)this.xuanBaoList.get(var1)) : null;
   }

   public void setBabys(List<Baby> var1) {
      this.babys = var1;
   }

   public Goodstable getGood(BigDecimal var1) {
      return (Goodstable)this.goodMap.get(var1);
   }

   public boolean bt(BigDecimal var1) {
      if (this.choseBaoId != null && var1 != null) {
         return (boolean)(this.choseBaoId.compareTo(var1) == 0 ? 5 >> 2 : 0);
      } else {
         return false;
      }
   }

   public int getPackNumTwo(int var1) {
      return this.getPackNum(var1) * (91 & 60);
   }
}
