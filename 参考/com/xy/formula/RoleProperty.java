package com.xy.formula;

import com.xy.M;
import com.xy.O;
import com.xy.S;
import com.xy.W;
import com.xy.bc;
import com.xy.bk;
import com.xy.bo;
import com.xy.bv;
import com.xy.cX;
import com.xy.ca;
import com.xy.cd;
import com.xy.ci;
import com.xy.dK;
import com.xy.eJ;
import com.xy.eZ;
import com.xy.fR;
import com.xy.gE;
import com.xy.hD;
import com.xy.hd;
import com.xy.jw;
import com.xy.kq;
import com.xy.lg;
import com.xy.lx;
import com.xy.bean.BeauBean;
import com.xy.bean.LoginResult;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityPetManualRole;
import com.xy.readbean.ActivitySeries;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleSuitBean;
import com.xy.readbean.Skill;
import com.xy.readbean.TYCModel;
import com.xy.readbean.Title;
import com.xy.readbean.XuanBao;
import com.xy.readbean.XuanYin;
import com.xy.text.GameView;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;

public class RoleProperty {
   public Vector<BaseMeridians> meridiansVector;
   public int sld1;
   public int sm2;
   List<BaseSkill> baseSkills;
   Map<String, Double> grade;
   Map<String, Double> additional;
   Map<String, Double> born;
   public int sm1;
   public boolean isReset;
   Map<Integer, BaseSuit> suitMap;
   double ap;
   public int sld2;
   private RoleData roleData;
   Map<String, Double> equip;
   double hp;
   Ql quality;
   public int qhv;
   double mp;

   public void a(String var1, double var2) {
      QualityZW.b(var1, var2, this.additional);
   }

   public int getAp() {
      LoginResult var1;
      int var8 = (int)((double)((int)((double)((int)((double)((int)((double)BaseValue.getRoleValue((var1 = this.roleData.getLoginResult()).getRace_id(), this.getPower(), cX.d(var1.getGrade()), --2) + this.getValue("ap"))) + this.getValue("AP"))) + this.getValue("攻击"))) + this.getValue("加攻击"));
      double var2 = 1.0D;
      var2 = 1.0D + this.ap + this.getValue("AP成长") + this.getValue("加强攻击") / 125.0D;
      int var10000;
      if (this.roleData.getGameView().getClient().gameBattle) {
         double var4 = this.getValue("基础攻击");
         double var6 = this.getValue("加成攻击");
         var4 *= 1.0D + var6 / 100.0D;
         var10000 = (int)((double)((int)((double)var8 + var4)) + this.getValue("附加攻击"));
      } else {
         var8 = (int)((double)((int)((double)var8 + this.getValue("基础攻击"))) + this.getValue("附加攻击"));
         var2 += this.getValue("加成攻击") / 125.0D;
         var10000 = var8;
      }

      return (int)((double)var10000 * var2);
   }

   public int getBone() {
      return (int)((double)this.roleData.getLoginResult().getBone() + this.getValue("根骨"));
   }

   public void b() {
      if (this.isReset) {
         bo var1;
         if ((var1 = (bo)this.roleData.getGameView().getFormManagement().m(44 & 91)) != null && var1.zg(5 >> 3, (BigDecimal)null)) {
            var1.aoo(this.getQuality(), 3 & 4, (BigDecimal)null);
         }

      }
   }

   public void c(Pal var1) {
      if (var1 != null && this.roleData.q(var1.getId())) {
         ci var2;
         if ((var2 = (ci)this.roleData.getGameView().getFormManagement().m(105 & 127)) != null) {
            var2.as(var1.getpId());
         }

      }
   }

   public void d(Baby var1) {
      if (var1 != null && this.roleData.r(var1.getBabyid())) {
         ca var2;
         if ((var2 = (ca)this.roleData.getGameView().getFormManagement().m(3 >> 1)) != null) {
            var2.ti(var1);
         }

      }
   }

   public RoleProperty(RoleData var1) {
      int var10003 = 3 ^ 3;
      int var10005 = 3 ^ 3;
      int var10007 = 5 >> 3;
      int var10009 = 5 >> 3;
      int var10011 = 3 & 5;
      super();
      this.hp = 0.0D;
      this.mp = 0.0D;
      this.ap = 0.0D;
      this.isReset = (boolean)var10011;
      this.sm1 = var10009;
      this.sm2 = var10007;
      this.sld1 = var10005;
      this.sld2 = var10003;
      this.roleData = var1;
   }

   public int getHp() {
      LoginResult var1;
      return (int)((double)((int)((double)((int)((double)BaseValue.getRoleValue((var1 = this.roleData.getLoginResult()).getRace_id(), this.getBone(), cX.d(var1.getGrade()), 3 & 4) + this.getValue("气血"))) * (this.getValue("HP成长") + this.hp + 1.0D))) * (this.getValue("加强气血") / 100.0D + 1.0D));
   }

   public int getSuitSum(String var1) {
      int var2 = Integer.parseInt(var1);
      BaseSuit var3;
      return (var3 = (BaseSuit)this.suitMap.get(var2)) != null ? var3.getSum() : 0;
   }

   public double e(String var1, double var2, double var4, double var6, double var8) {
      if (var1.endsWith("上限")) {
         return var2 + var4 + var6 + var8;
      } else {
         double var10000;
         if (!var1.equals("抗混乱") && !var1.equals("抗昏睡") && !var1.equals("抗封印") && !var1.equals("抗遗忘") && !var1.equals("抗中毒")) {
            if (!var1.equals("抗三尸虫") && !var1.equals("抗毒伤") && !var1.equals("抗灵宝伤害")) {
               if (var1.equals("物理吸收") || var1.startsWith("抗") || var1.indexOf("躲闪") != -4 >> 2) {
                  var4 = var4 > 75.0D + (double)this.qhv * 1.5D ? 75.0D + (double)this.qhv * 1.5D : var4;
                  var10000 = var2;
                  return var10000 + var4 + var6 + var8;
               }

               if (this.roleData.getGameView().getClient().gameBattle) {
                  if (var1.equals("连击率") || var1.equals("命中率") || var1.equals("狂暴率") || var1.equals("致命率")) {
                     var4 = var4 > 75.0D + (double)this.qhv * 1.5D ? 75.0D + (double)this.qhv * 1.5D : var4;
                     var10000 = var2;
                     return var10000 + var4 + var6 + var8;
                  }
               } else if (var1.equals("连击率")) {
                  if (var2 + var4 + var6 + var8 > 75.0D) {
                     return 75.0D;
                  }

                  return var2 + var4 + var6 + var8;
               }
            }

            var10000 = var2;
            return var10000 + var4 + var6 + var8;
         } else {
            LoginResult var10 = this.roleData.getLoginResult();
            double var11 = BaseValue.a(var1, var10.getRace_id()) * (1.0D + this.getValue(var1 + "上限") / 100.0D);
            double var10001;
            double var13;
            if ((var13 = var2 + var4 + var6) > var11) {
               var10000 = var11;
               var10001 = var8;
            } else {
               var10000 = var13;
               var10001 = var8;
            }

            return var10000 + var10001;
         }
      }
   }

   public void f(Baby var1) {
      this.mp = this.hp = 0.0D;
      this.ap = 0.0D;
      if (var1 != null && !hd.o(var1.getTalents())) {
         String[] var4 = var1.getTalents().split("\\|");

         int var2;
         for(int var10000 = var2 = 2 & 5; var10000 < var4.length; var10000 = var2) {
            int var3;
            if ((var3 = Integer.parseInt(var4[var2].split("=")[5 >> 3])) == 5 >> 2) {
               this.ap = 0.01D;
            } else if (var3 == --2) {
               this.hp = 0.01D;
            } else if (var3 == --3) {
               this.mp = 0.01D;
            }

            ++var2;
         }

         this.k();
      } else {
         this.k();
      }
   }

   public BaseMeridians g(String var1) {
      if (var1 != null && !var1.equals("")) {
         BaseMeridians var4 = null;
         String[] var7 = var1.split("\\|");

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < var7.length; var10000 = var3) {
            if (var7[var3].startsWith("99=")) {
               label78: {
                  int var8;
                  for(var10000 = var8 = 5 >> 3; var10000 < this.meridiansVector.size(); var10000 = var8) {
                     if (((BaseMeridians)this.meridiansVector.get(var8)).getBh() == (103 & 123)) {
                        ((BaseMeridians)this.meridiansVector.get(var8)).b(3 >> 2, var7[var3].substring(--3), 0.0D);
                        break label78;
                     }

                     ++var8;
                  }

                  var4 = new BaseMeridians(111 & 115, 3 ^ 3, 3 ^ 3, var7[var3].substring(--3), 0.0D);
                  this.meridiansVector.add(var4);
               }
            } else {
               String[] var2;
               if ((var2 = var7[var3].split("_")).length == --5 || var2.length == --3) {
                  label88: {
                     int var5 = Integer.parseInt(var2[3 & 4]);

                     int var6;
                     for(var10000 = var6 = 3 >> 2; var10000 < this.meridiansVector.size(); var10000 = var6) {
                        if (((BaseMeridians)this.meridiansVector.get(var6)).getBh() == var5) {
                           var4 = (BaseMeridians)this.meridiansVector.get(var6);
                           int var10002 = 1 ^ 3;
                           var4.setExp(Integer.parseInt(var2[--1]));
                           int var10001 = Integer.parseInt(var2[var10002]);
                           String var10;
                           String[] var10003;
                           if (var2.length == --5) {
                              var10 = var2[--3];
                              var10003 = var2;
                           } else {
                              var10 = null;
                              var10003 = var2;
                           }

                           var4.b(var10001, var10, var10003.length == --5 ? Double.parseDouble(var2[--4]) : 0.0D);
                           break label88;
                        }

                        ++var6;
                     }

                     BaseMeridians var9 = new BaseMeridians;
                     int var11 = Integer.parseInt(var2[3 >> 1]);
                     int var10004 = Integer.parseInt(var2[5 >> 1]);
                     String var10005;
                     String[] var10006;
                     if (var2.length == --5) {
                        var10005 = var2[--3];
                        var10006 = var2;
                     } else {
                        var10005 = null;
                        var10006 = var2;
                     }

                     var9.<init>(var5, var11, var10004, var10005, var10006.length == --5 ? Double.parseDouble(var2[--4]) : 0.0D);
                     var4 = var9;
                     this.meridiansVector.add(var4);
                  }
               }
            }

            ++var3;
         }

         return var4;
      } else {
         return null;
      }
   }

   public void h(Lingbao var1) {
      if (var1 != null && this.roleData.bt(var1.getBaoid())) {
         S var2;
         if ((var2 = (S)this.roleData.getGameView().getFormManagement().m(127 & 43)) != null) {
            var2.mj(var1);
         }

      }
   }

   public void i() {
      GameView var1;
      cd var2;
      if ((var2 = (cd)(var1 = this.roleData.getGameView()).getFormManagement().m(2 & 5)) != null) {
         var2.d();
      }

      UseCardBean var4;
      BeauBean var3 = (var4 = this.roleData.getLimit("靓号")) != null ? var4.a() : null;
      if (var3 != null) {
         bv var5;
         if ((var5 = (bv)var1.getFormManagement().m(18935 & 14015)) != null) {
            var5.d();
         }

         GameView var10000;
         label27: {
            if (var3.getLvl() == 5 >> 2) {
               jw var6;
               if ((var6 = (jw)var1.getFormManagement().m(1720 & 31231)) != null) {
                  var10000 = var1;
                  var6.bl();
                  break label27;
               }
            } else {
               var1.getFormManagement().n(25084 & 7867);
            }

            var10000 = var1;
         }

         hD var7;
         if ((var7 = (hD)var10000.getFormManagement().m(10939 & 22013)) != null) {
            var7.bl();
            return;
         }
      } else {
         var1.getFormManagement().n(25599 & 7351);
         var1.getFormManagement().n(11517 & 21434);
         var1.getFormManagement().n(14585 & 18367);
      }

   }

   public void j() {
      int var10002 = 3 ^ 3;
      int var10004 = 3 ^ 3;
      int var10006 = 3 ^ 3;
      this.sm1 = 2 & 5;
      this.sm2 = var10006;
      this.sld1 = var10004;
      this.sld2 = var10002;
      String[] var18;
      if ((var18 = this.roleData.getPrivateData().getSkill("N")) != null) {
         try {
            int var5 = 0;
            int var15 = ExpUtil.getTSP(this.roleData.getLoginResult().getExtraPointInt("T"));
            int var4 = 2 & 5;
            int var2 = SkillUtil.getSepciesIndex(this.roleData.getLoginResult().getSpecies_id());
            int var6 = Integer.parseInt(var18[3 >> 2]);
            this.sm1 = SkillUtil.getSmIndex(var2, var6 == --2 ? 4 ^ 5 : 0);
            this.sm2 = SkillUtil.getSmIndex(var2, var6 == 0 ? 3 >> 1 : 2);
            long var7 = (long)var2;
            long var9 = 4294967296L | (long)this.sm1;
            long var11 = 4294967296L | (long)this.sm2;
            long var13 = 8589934592L | (long)(this.sm2 > this.sm1 ? this.sm2 << (58 & 77) | this.sm1 : this.sm1 << (24 & 111) | this.sm2);
            var2 = 2 ^ 3;
            var6 = var18 != null ? var18.length : 0;

            for(int var10000 = var2; var10000 < var6; var10000 = var2) {
               int var3 = (var4 = Integer.parseInt(var18[var2])) >> (43 & 93) & 31 & 103;
               int var16 = var4 >> (118 & 15) & 23 & 111;
               int var17 = var4 >> --3 & 31 & 103;
               int var1;
               if ((var1 = var4 & 127 & 7) > --5) {
                  var1 = --5;
               }

               var15 -= var1;
               var5 += var1;
               if (var15 < 0) {
                  int var10001 = 2 & 5;
                  int var10003 = 3 ^ 3;
                  int var10005 = 3 ^ 3;
                  this.sm1 = 3 & 4;
                  this.sm2 = var10005;
                  this.sld1 = var10003;
                  this.sld2 = var10001;
                  return;
               }

               long var19 = var3 == 0 ? var7 : (var3 == --1 ? var9 : (var3 == --2 ? var11 : var13));
               var19 = var19 | (long)(var16 << (92 & 51)) | (long)(var17 << (127 & 24));
               if (var3 == 5 >> 2) {
                  this.sld1 += var1 * (1 ^ 3);
               } else if (var3 == (1 ^ 3)) {
                  this.sld2 += var1 * (1 ^ 3);
               } else if (var3 != 0) {
                  this.sld1 += var1;
                  this.sld2 += var1;
               }

               ++var2;
            }

         } catch (Exception var21) {
            var10002 = 3 ^ 3;
            var10004 = 5 >> 3;
            var10006 = 5 >> 3;
            this.sm1 = 3 ^ 3;
            this.sm2 = var10006;
            this.sld1 = var10004;
            this.sld2 = var10002;
            var21.printStackTrace();
         }
      }
   }

   public void k() {
      if (this.isReset) {
         GameView var1 = this.roleData.getGameView();
         LoginResult var2 = this.roleData.getLoginResult();
         int var3 = this.getHp();
         int var4 = this.getMp();
         if (var2.getHp().intValue() == 0) {
            var2.setHp(new BigDecimal(var3));
            var2.setMp(new BigDecimal(var4));
         }

         if (var2.getHp().intValue() > var3) {
            var2.setHp(new BigDecimal(var3));
         }

         if (var2.getMp().intValue() > var4) {
            var2.setMp(new BigDecimal(var4));
         }

         var1.baseView.kh();
         cd var5;
         if ((var5 = (cd)var1.getFormManagement().m(3 >> 2)) != null) {
            var5.d();
         }

         this.b();
      }
   }

   public void l(Mount var1) {
      if (var1 != null) {
         GameView var2;
         if ((var2 = this.roleData.getGameView()).getClient().gameMount) {
            kq var3;
            if ((var3 = (kq)var2.getFormManagement().m(7403 & 25535)) != null) {
               var3.adi(var1);
            }

            if (!this.roleData.g(var1.getMid())) {
               return;
            }

            eZ var4;
            gE var5;
            if (((var4 = (eZ)var2.getFormManagement().m(25262 & 7677)) == null || !var4.amv(var1)) && (var5 = (gE)var2.getFormManagement().m(119 & 28)) != null) {
               var5.adi(var1);
               return;
            }
         } else {
            if (!this.roleData.g(var1.getMid())) {
               return;
            }

            bc var6;
            if ((var6 = (bc)var2.getFormManagement().m(31 & 103)) != null) {
               var6.adi(var1);
               return;
            }

            gE var7;
            if ((var7 = (gE)var2.getFormManagement().m(21 & 126)) != null) {
               var7.adi(var1);
            }
         }

      }
   }

   public double getBorn(String var1) {
      Double var2;
      return (var2 = (Double)this.born.get(var1)) != null ? var2 : 0.0D;
   }

   public double getAdditional(String var1) {
      Double var2;
      return (var2 = (Double)this.additional.get(var1)) != null ? var2 : 0.0D;
   }

   public void m(RoleSummoning var1) {
      if (var1 != null && this.roleData.bj(var1.getSid())) {
         RolePet var5 = this.roleData.getRolePet(var1.getSid().longValue());
         GameView var10000;
         GameView var3;
         fR var4;
         if ((var4 = (fR)(var3 = this.roleData.getGameView()).getFormManagement().m(95 & 38)) != null) {
            var10000 = var3;
            var4.w(var5);
         } else {
            lx var2;
            if ((var2 = (lx)var3.getFormManagement().m(63 & 82)) != null) {
               var2.v(var1);
            }

            M var6;
            if ((var6 = (M)var3.getFormManagement().m(115 & 79)) != null) {
               var6.v(var1);
            }

            O var8;
            if ((var8 = (O)var3.getFormManagement().m(47 & 127)) != null) {
               var8.v(var1);
            }

            var10000 = var3;
         }

         bo var7;
         if ((var7 = (bo)var10000.getFormManagement().m(95 & 40)) != null && var7.zg(2 ^ 3, var1.getSid())) {
            var7.aoo(PropertyUtil.getPetQl(var1, this.roleData), --1, var1.getSid());
         }

         int[] var9 = var1 != null ? PetProperty.getPetHMASp(var1, this.roleData) : null;
         var3.baseView.ky(var9, var1);
      }
   }

   public void n() {
      this.additional.clear();
      BigDecimal[] var1 = this.roleData.lingbaoChoses;

      int var2;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < var1.length; var10000 = var2) {
         Lingbao var3;
         if ((var3 = this.roleData.getLingbao(var1[var2])) != null) {
            this.s(var3.getKangxing(), (boolean)(3 >> 1));
         }

         ++var2;
      }

      int var4;
      for(var10000 = var2 = 3 & 4; var10000 < 8; var10000 = var2) {
         UseCardBean var26;
         if ((var26 = this.roleData.getLimit(var2 == 0 ? "变身卡" : (var2 == (3 & 5) ? "强法型" : (var2 == 5 >> 1 ? "加抗型" : (var2 == --3 ? "增益型" : (var2 == --4 ? "VIP" : (var2 == --5 ? "帮派" : (var2 == (31 & 102) ? "单人竞技场" : (var2 == (23 & 111) ? "回蓝符" : ""))))))))) != null && (var2 != (7 & 127) || !hd.i(var26.getValue()))) {
            BaseQl[] var22 = var26.getQls();

            for(var10000 = var4 = 5 >> 3; var10000 < var22.length; var10000 = var4) {
               if (var22[var4] != null) {
                  this.a(var22[var4].getKey(), var22[var4].getValue());
               }

               ++var4;
            }
         }

         ++var2;
      }

      int var5;
      int var23;
      String[] var27;
      int var28;
      RoleProperty var42;
      label236: {
         if (this.roleData.getGameView().getClient().gameNewTyc) {
            if ((var27 = this.roleData.getPrivateData().getSkill("N")) != null) {
               var28 = 5 >> 3;
               var23 = SkillUtil.getSepciesIndex(this.roleData.getLoginResult().getSpecies_id());
               var4 = Integer.parseInt(var27[2 & 5]);
               var5 = SkillUtil.getSmIndex(var23, var4 == (1 ^ 3) ? --1 : 0);
               int var6 = SkillUtil.getSmIndex(var23, var4 == 0 ? 4 ^ 5 : 2);
               long var7 = (long)var23;
               long var9 = 4294967296L | (long)var5;
               long var11 = 4294967296L | (long)var6;
               long var13 = 8589934592L | (long)(var6 > var5 ? var6 << (104 & 31) | var5 : var5 << (92 & 43) | var6);
               int var15 = 5 >> 2;
               int var16 = var27 != null ? var27.length : 0;

               for(var10000 = var15; var10000 < var16; var10000 = var15) {
                  int var17 = (var28 = Integer.parseInt(var27[var15])) >> (75 & 61) & 111 & 23;
                  int var18 = var28 >> (95 & 38) & 47 & 87;
                  int var19 = var28 >> --3 & 39 & 95;
                  List var38 = this.roleData.getObjectArea().af(var17 == 0 ? var7 : (var17 == 3 >> 1 ? var9 : (var17 == --2 ? var11 : var13)));
                  TYCModel var20 = null;
                  Iterator var21;
                  Iterator var40 = var21 = var38.iterator();

                  TYCModel var41;
                  while(true) {
                     if (!var40.hasNext()) {
                        var41 = var20;
                        break;
                     }

                     TYCModel var39;
                     if ((var39 = (TYCModel)var21.next()).getLvl() == var18 && var39.getIndex() == var19) {
                        var41 = var20 = var39;
                        break;
                     }

                     var40 = var21;
                  }

                  if (var41 != null && (var20.getSkillId() <= (15309 & 26558) || var20.getSkillId() == (25535 & 16345) || var20.getSkillId() == (11263 & 30618))) {
                     this.v(var20.getSkillId(), var28 & 103 & 31);
                  }

                  ++var15;
               }

               var42 = this;
               break label236;
            }
         } else if ((var27 = this.roleData.getPrivateData().getSkill("T")) != null) {
            for(var10000 = var28 = --1; var10000 < var27.length; var10000 = var28) {
               String[] var43 = var27[var28].split("_");
               var4 = Integer.parseInt(var43[2 & 5]);
               var5 = Integer.parseInt(var43[5 >> 2]);
               if (var4 <= (11197 & 30670) || var4 == (29689 & 12191) || var4 == 9114) {
                  if (var5 > --5) {
                     bk.c();
                     return;
                  }

                  this.v(var4, var5);
               }

               ++var28;
            }
         }

         var42 = this;
      }

      Title var29;
      if (hd.o(var42.roleData.getLoginResult().getTitle()) && (var29 = this.roleData.getObjectArea().a(this.roleData.getLoginResult().getTitle())) != null && var29.getValue() != null) {
         String[] var30 = var29.getValue().split("\\|");

         for(var10000 = var23 = 3 & 4; var10000 < var30.length; var10000 = var23) {
            String[] var31;
            if ((var31 = var30[var23].split("=")).length > --1) {
               this.a(var31[2 & 5], QualityZW.getDouble(var31[4 ^ 5]));
            }

            ++var23;
         }
      }

      for(var10000 = var2 = 0; var10000 < this.meridiansVector.size(); var10000 = var2) {
         BaseMeridians var32;
         if ((var32 = (BaseMeridians)this.meridiansVector.get(var2)).getBh() != 0 && var32.getBh() != 99) {
            if (var32.getKey().equals("抗仙法")) {
               this.a("抗风", var32.getKeyValue());
               this.a("抗火", var32.getKeyValue());
               this.a("抗水", var32.getKeyValue());
               this.a("抗雷", var32.getKeyValue());
            } else {
               this.a(var32.getKey(), var32.getKeyValue());
            }
         }

         ++var2;
      }

      String var10001;
      if (!hd.o(this.roleData.getLoginResult().getResistance())) {
         var27 = this.roleData.getLoginResult().getResistance().split("\\|");

         for(var10000 = var28 = 5 >> 3; var10000 < var27.length; var10000 = var28) {
            if (var27[var28].startsWith("D")) {
               String[] var24 = var27[var28].split("#");
               var10000 = 3 & 4;
               var24[3 & 4] = var24[0].substring(1);

               for(var4 = var10000; var10000 < var24.length; var10000 = var4) {
                  String[] var34 = var24[var4].split("=");
                  var10001 = var34[0];
                  ++var4;
                  this.a(var10001, QualityZW.getDouble(var34[1]));
               }
            }

            ++var28;
         }
      }

      if (this.roleData.getGameView().getClient().gamePetManual) {
         ActivitySeries var33;
         Activity var35;
         ActivityPetManualRole var25 = (var35 = (var33 = this.roleData.getObjectArea().br()).getActivityPetManual()) != null ? (ActivityPetManualRole)this.roleData.getActivity(var35.getId()) : null;
         if (var25 != null) {
            List var36 = var25.getList(0, var35, var33);

            for(var10000 = var5 = 0; var10000 < var36.size(); var10000 = var5) {
               BaseQl var37 = (BaseQl)var36.get(var5);
               var10001 = var37.getKey();
               ++var5;
               this.a(var10001, var37.getValue());
            }
         }
      }

      this.k();
   }

   public void o(Goodstable var1) {
      GameView var2;
      eJ var3;
      if ((var3 = (eJ)(var2 = this.roleData.getGameView()).getFormManagement().m(254 & 32703)) != null) {
         var3.av(var1);
      }

      dK var4;
      if ((var4 = (dK)var2.getFormManagement().m(11007 & 21951)) != null) {
         var4.av(var1);
      }

   }

   public void p(String var1, double var2) {
      QualityZW.b(var1, var2, this.equip);
   }

   public BaseMeridians getMeridians(int var1) {
      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.meridiansVector.size(); var10000 = var2) {
         if (((BaseMeridians)this.meridiansVector.get(var2)).getBh() == var1) {
            return (BaseMeridians)this.meridiansVector.get(var2);
         }

         ++var2;
      }

      return null;
   }

   public void q() {
      lg var9 = this.roleData.getObjectArea();
      LoginResult var11 = this.roleData.getLoginResult();
      BigDecimal[] var10 = this.roleData.goodChoses;
      BaseEquip[] var10000 = new BaseEquip[111 & 30];
      boolean var10002 = true;
      BaseEquip[] var4 = var10000;

      int var5;
      int var55;
      for(var55 = var5 = 5 >> 3; var55 < var10.length; var55 = var5) {
         if (var5 != (15 & 126) && var5 != (47 & 95) && var5 != (28 & 115) && var5 != (21 & 123)) {
            Goodstable var6;
            String var7 = (var6 = this.roleData.getGood(var10[var5])) != null ? var6.getValue() : null;
            if (var7 != null && !var7.equals("")) {
               var4[var5] = new BaseEquip(var7, var6.getType(), var9, this.roleData);
               var4[var5].setQhv(var6.getQhv());
               var4[var5].setEquipPart(var5);
            }
         }

         ++var5;
      }

      var5 = cX.g(var11.getGrade());
      int var35 = cX.d(var11.getGrade());
      int var36;
      var55 = var36 = --1;

      while(true) {
         int var1;
         int var8;
         int var44;
         label532:
         while(var55 != 0) {
            byte var37 = 0;
            int var10001 = 3 >> 2;
            this.equip.clear();
            this.baseSkills.clear();
            this.suitMap.clear();
            var8 = var10001;
            this.qhv = 5 >> 3;

            for(var55 = var1 = 3 ^ 3; var55 < var4.length; var55 = var1) {
               BaseEquip var3;
               if (var4[var1] != null && (var3 = var4[var1]).getQhv() != null) {
                  ++var8;
                  if (this.qhv == 0 || this.qhv > var3.getQhv()) {
                     this.qhv = var3.getQhv();
                  }
               }

               ++var1;
            }

            if (var8 == --5 && this.qhv != 0) {
               this.p("四抗上限", (double)this.qhv * 0.4D);
               this.p("装备抗性上限", (double)this.qhv * 1.5D);
               this.p("HP", (double)(this.qhv * (22491 & 12276)));
               this.p("MP", (double)(this.qhv * (5099 & 28668)));
            } else {
               this.qhv = 3 & 4;
            }

            for(var55 = var1 = 0; var55 < var4.length; var55 = var1) {
               if (var4[var1] != null) {
                  boolean var27 = this.roleData.getGameView().getClient().gameBattle && (var4[var1].getEquipPart() == --1 || var4[var1].getEquipPart() == --3);
                  BaseEquip var2;
                  if ((var2 = var4[var1]).getQls() != null) {
                     double var12 = 1.0D;
                     if (var2.getQhv() != null) {
                        var12 += BaseEquip.getQHGemXS(var2.getQhv()) / 100.0D;
                     }

                     int var14;
                     for(var55 = var14 = var2.getQls().size() - (3 & 5); var55 >= 0; var55 = var14) {
                        BaseQl var15 = (BaseQl)var2.getQls().get(var14);
                        if (var27 && QualityZW.a(var15.getKey())) {
                           this.p(var15.getKey(), var15.getValue() * var12 / 2.0D);
                        } else {
                           this.p(var15.getKey(), var15.getValue() * var12);
                        }

                        --var14;
                     }
                  }

                  if (var2.getQlews() != null) {
                     for(var55 = var44 = var2.getQlews().size() - (4 ^ 5); var55 >= 0; var55 = var44) {
                        BaseQl var13 = (BaseQl)var2.getQlews().get(var44);
                        if (var27 && QualityZW.a(var13.getKey())) {
                           this.p(var13.getKey(), var13.getValue() / 2.0D);
                        } else {
                           this.p(var13.getKey(), var13.getValue());
                        }

                        --var44;
                     }
                  }

                  if (var2.getBaseSkills() != null) {
                     for(var55 = var44 = var2.getBaseSkills().size() - (4 ^ 5); var55 >= 0; var55 = var44) {
                        this.baseSkills.add((BaseSkill)var2.getBaseSkills().get(var44--));
                     }
                  }

                  if (var2.getBaseSuit() != null) {
                     BaseSuit var48;
                     if ((var48 = (BaseSuit)this.suitMap.get(var2.getBaseSuit().getSuitId())) == null) {
                        var48 = new BaseSuit(var2.getBaseSuit().getSuitId(), var2.getBaseSuit().getLvl(), 4 ^ 5);
                        this.suitMap.put(var48.getSuitId(), var48);
                     } else {
                        var48.setSum(var48.getSum() + (3 & 5));
                        if (var48.getLvl() > var2.getBaseSuit().getLvl()) {
                           var48.setLvl(var2.getBaseSuit().getLvl());
                        }
                     }
                  }
               }

               ++var1;
            }

            for(var55 = var1 = 3 ^ 3; var55 < var4.length; var55 = var1) {
               BaseLimit var29;
               if (var4[var1] != null && (var29 = var4[var1].getBaseLimit()) != null) {
                  if (var29.getXs() != -999.0D) {
                     if (var29.getGg() != 0 && var29.getSXValue(5 >> 3) > this.getBone()) {
                        var55 = --1;
                        var4[var1] = null;
                        continue label532;
                     }

                     if (var29.getLx() != 0 && var29.getSXValue(--1) > this.getSpir()) {
                        var55 = 5 >> 2;
                        var4[var1] = null;
                        continue label532;
                     }

                     if (var29.getLm() != 0 && var29.getSXValue(5 >> 1) > this.getPower()) {
                        var55 = 3 >> 1;
                        var4[var1] = null;
                        continue label532;
                     }

                     if (var29.getMj() != 0 && var29.getSXValue(--3) > this.getSpeed()) {
                        var55 = --1;
                        var4[var1] = null;
                        continue label532;
                     }

                     if (var29.getSw() != 0 && var29.getSw() > var11.getPrestige().intValue()) {
                        var55 = --1;
                        var4[var1] = null;
                        continue label532;
                     }
                  }

                  boolean var38;
                  if (!var29.a()) {
                     if (var5 < var29.getZs()) {
                        var55 = 1;
                        var4[var1] = null;
                        var38 = true;
                        continue label532;
                     }

                     if (var5 == var29.getZs() && var35 < var29.getLvl()) {
                        var55 = 1;
                        var4[var1] = null;
                        var38 = true;
                        continue label532;
                     }

                     if (var5 > var29.getZsMax()) {
                        var55 = 1;
                        var4[var1] = null;
                        var38 = true;
                        continue label532;
                     }

                     if (var5 == var29.getZsMax() && var35 > var29.getLvlMax()) {
                        var55 = 1;
                        var4[var1] = null;
                        var38 = true;
                        continue label532;
                     }
                  }

                  if (!hd.o(var29.getRole()) && var29.getRole().indexOf(var11.getLocalname()) == -4 >> 2) {
                     var55 = 1;
                     var4[var1] = null;
                     var38 = true;
                     continue label532;
                  }

                  if (var29.getSex() != 5 >> 1 && W.k(this.roleData.getLoginResult().getSpecies_id()) != var29.getSex()) {
                     var55 = 1;
                     var4[var1] = null;
                     var38 = true;
                     continue label532;
                  }
               }

               ++var1;
            }

            var55 = var37;
         }

         Iterator var26;
         Iterator var61 = var26 = this.baseSkills.iterator();

         while(var61.hasNext()) {
            BaseSkill var39;
            if ((var39 = (BaseSkill)var26.next()).getSkillId() == (32617 & 8151)) {
               var61 = var26;
               this.p("忽视抗混", (double)(this.getBone() / (54 & 123)) * 0.1D);
            } else if (var39.getSkillId() == (16322 & 24447)) {
               var61 = var26;
               this.p("忽视抗封", (double)(this.getBone() / (59 & 118)) * 0.1D);
            } else if (var39.getSkillId() == (8151 & 32619)) {
               var61 = var26;
               this.p("忽视抗睡", (double)(this.getBone() / (63 & 114)) * 0.1D);
            } else if (var39.getSkillId() == (24404 & 16367)) {
               var61 = var26;
               this.p("忽视抗遗忘", (double)(this.getBone() / (114 & 63)) * 0.1D);
            } else if (var39.getSkillId() == (24391 & 16381)) {
               var61 = var26;
               this.p("加强毒", (double)(this.getBone() / 10) * 0.1D);
            } else if (var39.getSkillId() == 8006) {
               var61 = var26;
               this.p("忽视抗混", (double)(this.getSpir() / 30) * 0.1D);
            } else if (var39.getSkillId() == 8007) {
               var61 = var26;
               this.p("忽视抗封", (double)(this.getSpir() / 30) * 0.1D);
            } else if (var39.getSkillId() == 8008) {
               var61 = var26;
               this.p("忽视抗睡", (double)(this.getSpir() / 30) * 0.1D);
            } else if (var39.getSkillId() == 8009) {
               var61 = var26;
               this.p("忽视抗遗忘", (double)(this.getSpir() / 30) * 0.1D);
            } else if (var39.getSkillId() == 8010) {
               var61 = var26;
               this.p("加强毒", (double)(this.getSpir() / 10) * 0.1D);
            } else if (var39.getSkillId() == 8011) {
               var61 = var26;
               this.p("忽视抗雷", (double)(this.getBone() / 10) * 0.1D);
            } else if (var39.getSkillId() == 8012) {
               var61 = var26;
               this.p("忽视抗火", (double)(this.getBone() / 10) * 0.1D);
            } else if (var39.getSkillId() == 8013) {
               var61 = var26;
               this.p("忽视抗风", (double)(this.getBone() / 10) * 0.1D);
            } else if (var39.getSkillId() == 8014) {
               var61 = var26;
               this.p("忽视抗水", (double)(this.getBone() / 10) * 0.1D);
            } else if (var39.getSkillId() == 8015) {
               var61 = var26;
               this.p("忽视抗鬼火", (double)(this.getBone() / 20) * 0.1D);
            } else if (var39.getSkillId() == 8018) {
               var61 = var26;
               this.p("命中率", 15.0D);
            } else if (var39.getSkillId() == 8019) {
               var61 = var26;
               this.p("命中率", 30.0D);
            } else {
               if (var39.getSkillId() == 8022) {
               }

               var61 = var26;
            }
         }

         var61 = var26 = this.suitMap.values().iterator();

         while(var61.hasNext()) {
            BaseSuit var40 = (BaseSuit)var26.next();
            RoleSuitBean var30;
            BaseSkill[] var24 = (var30 = this.roleData.getObjectArea().bx(var40.getSuitId())) != null ? var30.getSuits() : null;
            if (var24 == null) {
               var61 = var26;
            } else {
               for(var55 = var44 = 0; var55 < var24.length; var55 = var44) {
                  BaseSkill var43 = var24[var44];
                  String var47;
                  if (var40.getSum() >= var43.getLvl() && (var47 = BaseSuit.getsuitSkill(var43.getSkillId())) != null) {
                     double var50 = BaseSuit.getSuitValue(var43.getSkillId(), var40.getLvl());
                     if (var47.equals("加强法术")) {
                        this.p("加强风", var50);
                        this.p("加强雷", var50);
                        this.p("加强水", var50);
                        this.p("加强火", var50);
                        this.p("加强鬼火", var50);
                     } else if (var47.equals("提抗上限")) {
                        this.p("四抗", -var50);
                        this.p("四抗上限", var50);
                     } else {
                        this.p(var47, var50);
                     }
                  }

                  ++var44;
               }

               var61 = var26;
            }
         }

         if (!hd.o(this.roleData.getLoginResult().getResistance())) {
            String[] var41 = this.roleData.getLoginResult().getResistance().split("\\|");

            for(var55 = var1 = 0; var55 < var41.length; var55 = var1) {
               if (var41[var1].startsWith("X")) {
                  String[] var32 = var41[var1].split("#");
                  var55 = 0;
                  var32[0] = var32[0].substring(1);

                  for(int var25 = 0; var55 < var32.length; var55 = var25) {
                     String[] var53 = var32[var25].split("=");
                     String var57 = var53[0];
                     ++var25;
                     this.p(var57, QualityZW.getDouble(var53[1]));
                  }
               }

               ++var1;
            }
         }

         double var16;
         double var18;
         int var20;
         Point var21;
         double var22;
         XuanBao var28;
         Goodstable var31;
         int var33;
         BaseXuanBao var34;
         Point[] var42;
         Skill var46;
         double var51;
         double var54;
         for(var55 = var8 = 15; var55 < 18; var55 = var8) {
            if ((var31 = this.roleData.getGood(var10[var8])) != null) {
               var34 = var31.getBaseXuanBao();
               var28 = var9.cb(var34.getId());
               var44 = var34.getLvl() / 10;
               int var45 = 0;
               var55 = var44;

               lg var62;
               while(true) {
                  if (var55 <= 0) {
                     var62 = var9;
                     break;
                  }

                  Point var49;
                  if ((var49 = var34.getXuanYinByIndex(var45)) == null) {
                     var62 = var9;
                     break;
                  }

                  XuanYin var52;
                  if (var49.x != 0 && (var52 = var9.ao(Math.abs(var49.x))) != null) {
                     this.p(var52.getBaseQl().getKey(), var52.getBaseQl().getValue() * (double)Math.min(var44, var49.y));
                  }

                  ++var45;
                  var55 = var44;
               }

               var46 = var62.bf(String.valueOf(var28.getSkillId()));
               if (var28.getSkillId() == 16001 || var28.getSkillId() == 16002 || var28.getSkillId() == 16003) {
                  var51 = (double)this.getBone();
                  var16 = (double)(var28.getSkillId() == 16002 ? this.getPower() : this.getSpir());
                  var18 = (double)(this.getSpeed() / --2);
                  var42 = var34.c(var28, var9);
                  var55 = var20 = 0;

                  while(true) {
                     if (var55 >= var28.getResonances().length) {
                        var54 = var46.getFormulas()[0].a((double)var34.getLvl(), var35, var5) * (var51 + var16 + var18);
                        if (var28.getSkillId() == 16001) {
                           this.p("法术防御", var54);
                        } else if (var28.getSkillId() == 16002) {
                           this.p("防御", var54);
                        } else if (var28.getSkillId() == 16003) {
                           this.p("法术伤害", var54);
                        }
                        break;
                     }

                     if ((var21 = var42[var20 / --3]).x > 0 && var21.y > 0) {
                        var33 = var28.getResonances()[var20 + (5 >> 1)];
                        var22 = var9.bf(String.valueOf(var33)).getFormulas()[0].a((double)(Math.min(var44, var21.x) + Math.min(var44, var21.y)), var35, var5);
                        if (var33 != 15001 && var33 != 15003 && var33 != 15005) {
                           if (var33 != 15002 && var33 != 15006 && var33 != 15004) {
                              if (var33 == 15007) {
                                 var18 += var22 / 100.0D * var18;
                              }
                           } else {
                              var16 += var22 / 100.0D * var16;
                           }
                        } else {
                           var51 += var22 / 100.0D * var51;
                        }
                     }

                     var20 += 3;
                     var55 = var20;
                  }
               }
            }

            ++var8;
         }

         for(var55 = var8 = 0; var55 < this.roleData.goodXuanBaoStandby.length; var55 = var8) {
            if (this.roleData.goodXuanBaoStandby[var8] != null && (var31 = this.roleData.getGood(this.roleData.goodXuanBaoStandby[var8])) != null && var31.getStatus() == 0) {
               var34 = var31.getBaseXuanBao();
               XuanBao var58 = var28 = var9.cb(var34.getId());
               var44 = var34.getLvl() / 10;
               var46 = var9.bf(String.valueOf(var58.getSkillId()));
               if (var28.getSkillId() == 16001 || var28.getSkillId() == 16002 || var28.getSkillId() == 16003) {
                  var51 = (double)this.getBone();
                  var16 = (double)(var28.getSkillId() == 16002 ? this.getPower() : this.getSpir());
                  var18 = (double)(this.getSpeed() / (5 >> 1));
                  var42 = var34.c(var28, var9);
                  var55 = var20 = 0;

                  while(true) {
                     if (var55 >= var28.getResonances().length) {
                        var54 = var46.getFormulas()[0].a((double)var34.getLvl(), var35, var5) * (var51 + var16 + var18);
                        var54 = var46.getFormulas()[1].a((double)var34.getLvl(), var35, var5) / 100.0D * var54;
                        if (var28.getSkillId() == 16001) {
                           this.p("法术防御", var54);
                        } else if (var28.getSkillId() == 16002) {
                           this.p("防御", var54);
                        } else if (var28.getSkillId() == 16003) {
                           this.p("法术伤害", var54);
                        }
                        break;
                     }

                     if ((var21 = var42[var20 / --3]).x > 0 && var21.y > 0) {
                        var33 = var28.getResonances()[var20 + (1 ^ 3)];
                        var22 = var9.bf(String.valueOf(var33)).getFormulas()[0].a((double)(Math.min(var44, var21.x) + Math.min(var44, var21.y)), var35, var5);
                        if (var33 != 15001 && var33 != 15003 && var33 != 15005) {
                           if (var33 != 15002 && var33 != 15006 && var33 != 15004) {
                              if (var33 == 15007) {
                                 var18 += var22 / 100.0D * var18;
                              }
                           } else {
                              var16 += var22 / 100.0D * var16;
                           }
                        } else {
                           var51 += var22 / 100.0D * var51;
                        }
                     }

                     var20 += 3;
                     var55 = var20;
                  }
               }
            }

            ++var8;
         }

         this.k();
         return;
      }
   }

   public int getPower() {
      return (int)((double)this.roleData.getLoginResult().getPower() + this.getValue("力量"));
   }

   public List<String> r() {
      ArrayList var1 = new ArrayList();

      Iterator var10000;
      Entry var2;
      Iterator var3;
      for(var10000 = var3 = this.born.entrySet().iterator(); var10000.hasNext(); var10000 = var3) {
         var2 = (Entry)var3.next();
         if (!var1.contains(var2.getKey())) {
            var1.add((String)var2.getKey());
         }
      }

      for(var10000 = var3 = this.grade.entrySet().iterator(); var10000.hasNext(); var10000 = var3) {
         var2 = (Entry)var3.next();
         if (!var1.contains(var2.getKey())) {
            var1.add((String)var2.getKey());
         }
      }

      for(var10000 = var3 = this.equip.entrySet().iterator(); var10000.hasNext(); var10000 = var3) {
         var2 = (Entry)var3.next();
         if (!var1.contains(var2.getKey())) {
            var1.add((String)var2.getKey());
         }
      }

      for(var10000 = var3 = this.additional.entrySet().iterator(); var10000.hasNext(); var10000 = var3) {
         var2 = (Entry)var3.next();
         if (!var1.contains(var2.getKey())) {
            var1.add((String)var2.getKey());
         }
      }

      return var1;
   }

   public void s(String var1, boolean var2) {
      String[] var5;
      String[] var10000 = var5 = var1.split("=");
      double var3 = Double.parseDouble(var10000[4 ^ 5]);
      if (var10000[5 >> 3].startsWith("抗") && !(var3 > 10.1D)) {
         this.a(var5[3 ^ 3], var2 ? var3 : -var3);
         this.b();
      } else {
         bk.c();
      }
   }

   public void t() {
      this.isReset = (boolean)(3 >> 2);
      this.y();
      this.j();
      this.z();
      this.ab((String[])null, this.roleData.getPrivateData().getBorn());
      this.w(this.roleData.getLoginResult().getMeridians());
      int var10004 = 4 ^ 5;
      this.f((Baby)null);
      this.n();
      this.q();
      this.isReset = (boolean)var10004;
      this.k();
   }

   public int getSpeed() {
      return (int)((double)this.roleData.getLoginResult().getSpeed() + this.getValue("敏捷"));
   }

   public int getMp() {
      LoginResult var1;
      return (int)((double)((int)((double)BaseValue.getRoleValue((var1 = this.roleData.getLoginResult()).getRace_id(), this.getSpir(), cX.d(var1.getGrade()), --1) + this.getValue("法力"))) * (this.getValue("加强魔法") / 100.0D + this.getValue("MP成长") + this.mp + 1.0D));
   }

   public Ql getQuality() {
      this.quality.d();
      List var1 = this.r();

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < var1.size(); var10000 = var2) {
         Ql var5 = this.quality;
         String var10001 = (String)var1.get(var2);
         Object var10003 = var1.get(var2);
         ++var2;
         QualityZW.c(var5, var10001, this.getValue((String)var10003));
      }

      double var4;
      if (var1.contains("水魔附身") && (var4 = this.getValue("水魔附身")) > 0.0D) {
         this.quality.setRolewxj(0.0D);
         this.quality.setRolewxm(0.0D);
         this.quality.setRolewxh(0.0D);
         this.quality.setRolewxt(0.0D);
         this.quality.setRolewxs(100.0D);
         this.quality.setRolewxqkh(this.quality.getRolewxqkh() + var4 * 20.0D);
      }

      if (var1.contains("五行归一")) {
         this.quality.f(this.getValue("五行归一"));
      }

      return this.quality;
   }

   public void u(String var1, double var2) {
      QualityZW.b(var1, var2, this.born);
   }

   public double getValue(String var1) {
      return this.e(var1, this.getGrade(var1), this.getEquip(var1), this.getBorn(var1), this.getAdditional(var1));
   }

   public void v(int var1, int var2) {
      if (var1 == (31679 & 10089)) {
         this.a("MP", (double)(var2 * (12285 & 22482)));
      } else if (var1 == (28462 & 13307)) {
         this.a("HP", (double)(var2 * (28670 & 8097)));
      } else if (var1 == (9195 & 32575)) {
         this.a("HP", (double)(var2 * (1002 & 32765)));
      } else if (var1 == (30524 & 11247)) {
         this.a("根骨", (double)var2);
      } else if (var1 == (31597 & 10175)) {
         this.a("力量", (double)var2);
      } else if (var1 == (10174 & 31599)) {
         this.a("AP", (double)(var2 * (125 & 102)));
      } else if (var1 == (11183 & 30591)) {
         this.a("SP", (double)var2);
      } else if (var1 == (16247 & 25528)) {
         this.a("抗风", (double)var2);
      } else if (var1 == (32565 & 9211)) {
         this.a("抗火", (double)var2);
      } else if (var1 == (11254 & 30523)) {
         this.a("抗水", (double)var2);
      } else if (var1 == (31679 & 10099)) {
         this.a("抗雷", (double)var2);
      } else if (var1 == (11263 & 30516)) {
         this.a("抗鬼火", (double)var2);
      } else if (var1 == 9013) {
         this.a("抗三尸", (double)(var2 * 100));
      } else if (var1 == 9014) {
         this.a("抗反震", (double)(var2 * 500));
      } else if (var1 == 9015) {
         this.a("风法狂暴", (double)var2);
      } else if (var1 == 9016) {
         this.a("火法狂暴", (double)var2);
      } else if (var1 == 9017) {
         this.a("水法狂暴", (double)var2);
      } else if (var1 == 9018) {
         this.a("鬼火伤害", (double)(var2 * 100));
      } else if (var1 == 9019) {
         this.a("强力克金", (double)var2);
      } else if (var1 == 9020) {
         this.a("强力克木", (double)var2);
      } else if (var1 == 9021) {
         this.a("强力克火", (double)var2);
      } else if (var1 == 9022) {
         this.a("强力克土", (double)var2);
      } else if (var1 == 9023) {
         this.a("物理吸收", (double)var2);
      } else if (var1 == 9024) {
         this.a("躲闪率", (double)var2);
      } else if (var1 == 9025) {
         this.a("强震慑", (double)var2);
      } else if (var1 == 9026) {
         this.a("反击率", (double)var2);
      } else if (var1 == 9027) {
         this.a("反击次数", (double)var2);
      } else if (var1 == 9028) {
         this.a("狂暴率", (double)var2);
      } else if (var1 == 9029) {
         this.a("反震率", (double)var2);
      } else if (var1 == 9030) {
         this.a("敏捷", (double)var2);
      } else if (var1 == 9031) {
         this.a("恢复气血", (double)(var2 * 400));
      } else if (var1 == 9113) {
         this.a("附加混乱攻击", (double)var2);
      } else {
         if (var1 == 9114) {
            this.a("附加封印攻击", (double)var2);
         }

      }
   }

   public BaseMeridians w(String var1) {
      if (var1 != null && !var1.equals("")) {
         BaseMeridians var4 = null;
         String[] var7 = var1.split("\\|");

         int var3;
         for(int var10000 = var3 = 2 & 5; var10000 < var7.length; var10000 = var3) {
            if (var7[var3].startsWith("99=")) {
               label78: {
                  int var8;
                  for(var10000 = var8 = 3 >> 2; var10000 < this.meridiansVector.size(); var10000 = var8) {
                     if (((BaseMeridians)this.meridiansVector.get(var8)).getBh() == (107 & 119)) {
                        ((BaseMeridians)this.meridiansVector.get(var8)).b(3 >> 2, var7[var3].substring(--3), 0.0D);
                        break label78;
                     }

                     ++var8;
                  }

                  var4 = new BaseMeridians(107 & 119, 3 ^ 3, 3 ^ 3, var7[var3].substring(--3), 0.0D);
                  this.meridiansVector.add(var4);
               }
            } else {
               String[] var2;
               if ((var2 = var7[var3].split("_")).length == --5 || var2.length == --3) {
                  label88: {
                     int var5 = Integer.parseInt(var2[3 >> 2]);

                     int var6;
                     for(var10000 = var6 = 3 & 4; var10000 < this.meridiansVector.size(); var10000 = var6) {
                        if (((BaseMeridians)this.meridiansVector.get(var6)).getBh() == var5) {
                           var4 = (BaseMeridians)this.meridiansVector.get(var6);
                           int var10002 = --2;
                           var4.setExp(Integer.parseInt(var2[--1]));
                           int var10001 = Integer.parseInt(var2[var10002]);
                           String var10;
                           String[] var10003;
                           if (var2.length == --5) {
                              var10 = var2[--3];
                              var10003 = var2;
                           } else {
                              var10 = null;
                              var10003 = var2;
                           }

                           var4.b(var10001, var10, var10003.length == --5 ? Double.parseDouble(var2[--4]) : 0.0D);
                           break label88;
                        }

                        ++var6;
                     }

                     BaseMeridians var9 = new BaseMeridians;
                     int var11 = Integer.parseInt(var2[4 ^ 5]);
                     int var10004 = Integer.parseInt(var2[--2]);
                     String var10005;
                     String[] var10006;
                     if (var2.length == --5) {
                        var10005 = var2[--3];
                        var10006 = var2;
                     } else {
                        var10005 = null;
                        var10006 = var2;
                     }

                     var9.<init>(var5, var11, var10004, var10005, var10006.length == --5 ? Double.parseDouble(var2[--4]) : 0.0D);
                     var4 = var9;
                     this.meridiansVector.add(var4);
                  }
               }
            }

            ++var3;
         }

         return var4;
      } else {
         return null;
      }
   }

   public void x() {
      if (this.isReset) {
         cd var1;
         if ((var1 = (cd)this.roleData.getGameView().getFormManagement().m(3 ^ 3)) != null) {
            var1.d();
         }

      }
   }

   public int getCalm() {
      return (int)((double)this.roleData.getLoginResult().getCalm() + this.getValue("定力"));
   }

   public void y() {
      this.quality = new Ql();
      this.grade = new HashMap();
      this.born = new HashMap();
      this.equip = new HashMap();
      this.additional = new HashMap();
      this.meridiansVector = new Vector();
      this.baseSkills = new ArrayList();
      this.suitMap = new HashMap();
      this.hp = 0.0D;
      this.mp = 0.0D;
      this.ap = 0.0D;
   }

   public double getEquip(String var1) {
      Double var2;
      return (var2 = (Double)this.equip.get(var1)) != null ? var2 : 0.0D;
   }

   public double getGrade(String var1) {
      Double var2;
      return (var2 = (Double)this.grade.get(var1)) != null ? var2 : 0.0D;
   }

   public int getCdz() {
      LoginResult var1;
      return BaseValue.getRoleValue((var1 = this.roleData.getLoginResult()).getRace_id(), this.getCalm(), cX.d(var1.getGrade()), --4);
   }

   public int getSp() {
      LoginResult var1;
      return (int)((double)((int)((double)((int)((double)((int)((double)((int)((double)((int)((double)BaseValue.getRoleValue((var1 = this.roleData.getLoginResult()).getRace_id(), this.getSpeed(), cX.d(var1.getGrade()), --3) + this.getValue("sp"))) + this.getValue("SP"))) + this.getValue("速度"))) + this.getValue("加速度"))) + this.getValue("附加速度"))) * (this.getValue("加强速度") / 100.0D + this.getValue("SP成长") + 1.0D));
   }

   public int getSpir() {
      return (int)((double)this.roleData.getLoginResult().getSpir() + this.getValue("灵性"));
   }

   public void z() {
      this.grade.clear();
      LoginResult var1;
      LoginResult var10000 = var1 = this.roleData.getLoginResult();
      int var2 = cX.d(var10000.getGrade());
      int var6;
      if ((var6 = cX.g(var10000.getGrade())) <= --4 && var2 <= (8957 & 24010)) {
         String[] var4 = RoleGradeBorn.getGradeKX().f(var2, var1.getRace_id()).split("\\|");

         int var5;
         for(int var7 = var5 = 3 >> 2; var7 < var4.length; var7 = var5) {
            String[] var3 = var4[var5].split("=");
            String var10001 = var3[3 ^ 3];
            int var10003 = 2 ^ 3;
            ++var5;
            this.aa(var10001, Double.parseDouble(var3[var10003]));
         }

         RoleProperty var8;
         label30: {
            if (var6 == --4) {
               var2 -= 140;
               var2 /= 90 & 47;
               if (var1.getRace_id().intValue() == (26589 & 16179)) {
                  var8 = this;
                  this.aa("四抗上限", (double)var2 * 1.2D);
                  break label30;
               }

               if (var1.getRace_id().intValue() == (32542 & 10227)) {
                  var8 = this;
                  this.aa("四抗上限", (double)var2 * 1.1D);
                  break label30;
               }

               if (var1.getRace_id().intValue() == (12211 & 30559)) {
                  var8 = this;
                  this.aa("四抗上限", (double)var2 * 1.0D);
                  break label30;
               }

               if (var1.getRace_id().intValue() == (30588 & 12183)) {
                  this.aa("四抗上限", (double)var2 * 0.9D);
               }
            }

            var8 = this;
         }

         var8.k();
      } else {
         bk.c();
      }
   }

   public void aa(String var1, double var2) {
      QualityZW.b(var1, var2, this.grade);
   }

   public String ab(String[] var1, String var2) {
      this.born.clear();
      String var5;
      if ((var5 = RoleGradeBorn.d(var1, var2)) != null && !var5.equals("")) {
         String[] var6 = var5.split("\\|");

         int var3;
         for(int var10000 = var3 = 2 & 5; var10000 < var6.length; var10000 = var3) {
            if (!var6[var3].startsWith("双属性")) {
               String[] var4 = var6[var3].split("=");
               this.u(var4[3 >> 2], QualityZW.getDouble(var4[4 ^ 5]));
            }

            ++var3;
         }

         this.k();
         return var5;
      } else {
         return var5;
      }
   }
}
