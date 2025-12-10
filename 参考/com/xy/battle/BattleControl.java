package com.xy.battle;

import com.xy.bM;
import com.xy.by;
import com.xy.eP;
import com.xy.ev;
import com.xy.fN;
import com.xy.iO;
import com.xy.lj;
import com.xy.mi;
import com.xy.bean.FightOperation;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BattleControl {
   private Object data;
   public FightOperation PetOperation = new FightOperation();
   public int automationServerId;
   public List<SkillTx> skills = new ArrayList();
   public String nqz = "100";
   public int automationServerTime;
   public FightOperation RoleOperation = new FightOperation();
   public boolean automationServer;
   private iO handleUnit;
   public BattleScene battleScene;
   private iO XZUnit;
   public long automationTime;
   public String yqz = "100";
   public int battleCamp;
   public String xyz = "0";
   public GameView gameView;

   public iO getPetUnit() {
      return this.battleScene.getPetUnit(this.getRoleId());
   }

   public SkillTx a(int var1, int var2) {
      int var3;
      for(int var10000 = var3 = this.skills.size() - (3 >> 1); var10000 >= 0; var10000 = var3) {
         if (((SkillTx)this.skills.get(var3)).b(var1, var2, this)) {
            return (SkillTx)this.skills.get(var3);
         }

         --var3;
      }

      return null;
   }

   public FightingState b(String var1, iO var2) {
      return new FightingState(this.battleCamp, var2.bt().getMan(), var1);
   }

   public void setMouseIndex(int var1, Object var2) {
      this.data = var2;
      this.gameView.setMouseIndex(var1);
   }

   public iO getHandleUnit() {
      return this.handleUnit;
   }

   public void c(FightingEvents var1) {
      if (this.battleCamp != -4 >> 2) {
         var1.setFightingsum((int)this.battleScene.getBattleId());
         var1.setCurrentRound(this.battleScene.getBattleRound());
         String var2 = Agreement.getSendText("fig1", mi.b().toJson(var1));
         this.gameView.getClient().d(var2);
         this.o();
         this.gameView.getFormManagement().n(5359 & 27600);
         this.gameView.getFormManagement().n(62 & 111);
         this.gameView.getFormManagement().n(111 & 50);
         this.gameView.getFormManagement().n(55 & 78);
      }
   }

   public void d() {
      this.handleUnit.i((boolean)(4 ^ 5));
      this.m();
   }

   public void e() {
      if (this.XZUnit != null) {
         String var1 = Agreement.getSendTextAES("fig3", this.XZUnit.bt().getId() + "|" + this.XZUnit.bt().getCamp() + "|" + this.XZUnit.bt().getMan());
         this.gameView.getClient().d(var1);
      }
   }

   public long getRoleId() {
      return this.gameView.roleData.getRoleId();
   }

   public void f() {
      this.gameView.baseView.kn().d();
   }

   public void g(List<TypeState> var1) {
      int var4 = 3 & 4;
      int var3 = this.skills.size();

      int var10000;
      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < var1.size(); var10000 = var2) {
         if (((TypeState)var1.get(var2)).getState() == (3 & 5)) {
            if (var4 < var3) {
               SkillTx var6 = (SkillTx)this.skills.get(var4);
               ++var4;
               var6.d(((TypeState)var1.get(var2)).getType(), var4, this.gameView.getObjectArea());
            } else {
               ++var4;
               SkillTx var5;
               (var5 = new SkillTx()).d(((TypeState)var1.get(var2)).getType(), var4, this.gameView.getObjectArea());
               this.skills.add(var5);
            }
         }

         ++var2;
      }

      for(var10000 = var2 = this.skills.size() - (2 ^ 3); var10000 >= var4; var10000 = var2) {
         this.skills.remove(var2--);
      }

   }

   public void setXZUnit(iO var1) {
      this.XZUnit = var1;
   }

   public void h(iO var1, SkillTx var2, int var3, int var4) {
      if (var2 != null) {
         FightOperation var5;
         FightOperation var10000 = var5 = new FightOperation();
         int var10001;
         int var10002;
         if (var3 == this.battleCamp) {
            var10001 = 5 >> 2;
            var10002 = var4;
         } else {
            var10001 = 0;
            var10002 = var4;
         }

         var10000.a((boolean)var10001, var10002, 1, var2.getSkill().getSkillname());
         this.c(this.j(var1, var5));
         var2.setIs((boolean)(3 >> 1));
         this.gameView.f("你释放了" + var2.getSkill().getSkillname());
         this.m();
      }
   }

   public void i(FightOperation var1, boolean var2) {
      if (this.handleUnit != null) {
         if (this.handleUnit.bt().getType() != 0 || var2 || var1.getType() == (102 & 31) || var1.getType() == --5 || !this.battleScene.u(this.handleUnit)) {
            bM var3;
            if (!var2 && (var3 = (bM)this.gameView.getFormManagement().m(27863 & 5055)) != null) {
               var3.aje(this.handleUnit.bt().getType(), var1, this);
            }

            this.c(this.j(this.handleUnit, var1));
            this.d();
         }
      }
   }

   public FightingEvents j(iO var1, FightOperation var2) {
      FightOperation var10000;
      FightingEvents var3;
      ArrayList var4;
      label38: {
         var3 = new FightingEvents();
         var4 = new ArrayList();
         var3.setOriginator(this.b("普通攻击", var1));
         switch(var2.getType()) {
         case 1:
            while(false) {
            }

            var3.getOriginator().setStartState("技能");
            var3.getOriginator().setEndState(var2.getSpell());
            var10000 = var2;
            break label38;
         case 2:
            int var10002;
            Goodstable var5;
            if ((var5 = this.gameView.roleData.getGood(var2.getGood())) == null) {
               var10000 = var2;
               var10002 = -4 >> 2;
               var2.setCamp(-4 >> 2);
               var2.setMan(var10002);
               break label38;
            }

            var3.getOriginator().setStartState("药");
            var3.getOriginator().setEndState(var5.getValue());
            int var10004 = 2 ^ 3;
            var5.ab(2 ^ 3);
            ParamTool.g(var5, var10004, this.gameView.getClient());
            if (var5.getUsetime() <= 0) {
               this.gameView.roleData.h(var5.getRgid());
               var10002 = 2 & 5;
               var10000 = var2;
               int var10006 = -4 >> 2;
               var2.setCamp(-4 >> 2);
               var2.setMan(var10006);
               var2.setType(var10002);
               break label38;
            }
            break;
         case 3:
            var3.getOriginator().setStartState("保护");
            var10000 = var2;
            break label38;
         case 4:
            var3.getOriginator().setStartState("捕捉");
            var10000 = var2;
            break label38;
         case 5:
            var3.getOriginator().setStartState("防御");
            var10000 = var2;
            break label38;
         case 6:
            var3.getOriginator().setStartState("逃跑");
         }

         var10000 = var2;
      }

      int var6;
      if ((var6 = var10000.getCamp()) == 5 >> 2) {
         var6 = this.battleCamp;
      } else if (var6 == 0) {
         var6 = this.battleScene.getOtherCamp(this.battleCamp);
      }

      FightingState var7 = new FightingState(var6, var2.getMan(), (String)null);
      var4.add(var7);
      var3.setAccepterlist(var4);
      return var3;
   }

   public void k() {
      if (this.automationServer) {
         String var1 = Agreement.getSendText(Agreement.fightAuto, this.automationServerId + "|0");
         this.gameView.getClient().d(var1);
         this.o();
      }
   }

   public void l(int var1, int var2) {
      String var3;
      if (this.battleScene == null) {
         var3 = Agreement.getSendText(Agreement.fightAuto, var1 + "|1");
         this.gameView.getClient().d(var3);
      } else if (this.battleScene.getBattleId() != (long)var1) {
         var3 = Agreement.getSendText(Agreement.fightAuto, var1 + "|1|" + this.battleScene.getBattleId());
         this.gameView.getClient().d(var3);
      } else {
         this.automationServer = (boolean)(--1);
         this.automationServerId = var1;
         this.automationServerTime = var2;
         if (this.gameView.getFormManagement().m(17815 & 15103) == null) {
            lj.acv(this);
            this.gameView.f("因为你在关键战斗中长时间不操作,系统帮你设置为自动战斗");
         }
      }
   }

   public iO getRoleUnit() {
      return this.battleScene.getBattleUnit(3 >> 2, this.getRoleId());
   }

   public void m() {
      if (this.battleCamp != -4 >> 2) {
         iO var1;
         if ((var1 = this.battleScene.getHandleUnit(this.gameView.roleData.getRoleId())) != null) {
            this.setMouseIndex(eP.l, (Object)null);
            this.handleUnit = var1;
            int var2 = this.handleUnit.bt().getType();
            fN var10000 = this.gameView.baseView.kn();
            boolean var10002;
            BattleControl var10003;
            if (var2 == 0) {
               var10002 = this.battleScene.u(var1);
               var10003 = this;
            } else {
               var10002 = false;
               var10003 = this;
            }

            var10000.hb(var2, var10002, var10003.battleScene.getBattleType());
         } else {
            this.t();
         }
      }
   }

   public BattleControl(GameView var1) {
      this.gameView = var1;
   }

   public boolean n(Skill var1, iO var2, iO var3) {
      String var4;
      if (!(var4 = var1.getSkillname()).equals("移花接木") && !var4.equals("大手印") && !var4.equals("银索金铃") && !var4.equals("幽怜魅影") && !var4.equals("醉生梦死") && !var4.equals("一曲销魂") && !var4.equals("秦丝冰雾") && !var4.equals("倩女幽魂") && !var4.equals("行眠立盹") && !var4.equals("流连忘返")) {
         if (var2.bt().getType() == 3 >> 1 && (var4.equals("魔之飞步") || var4.equals("急速之魔") || var4.equals("魔神飞舞") || var4.equals("天外飞魔") || var4.equals("乾坤借速") || var4.equals("神迟魂钝") || var4.equals("寒烟羁水"))) {
            return true;
         } else if (w(var4)) {
            return (boolean)(var2.bt().getCamp() == var3.bt().getCamp() ? 5 >> 2 : 0);
         } else {
            return (boolean)(var2.bt().getCamp() != var3.bt().getCamp() ? --1 : 0);
         }
      } else {
         return true;
      }
   }

   public iO getXZUnit() {
      return this.XZUnit;
   }

   public void o() {
      if (this.automationServer) {
         int var10001 = 5 >> 3;
         int var10003 = 5 >> 3;
         this.automationServer = (boolean)(3 & 4);
         this.automationServerId = var10003;
         this.automationServerTime = var10001;
      }
   }

   public void setBattle(int var1, BattleScene var2) {
      this.battleCamp = var1;
      this.battleScene = var2;
      by var3 = this.gameView.baseView;
      this.o();
      BattleControl var10000;
      if (var2 == null) {
         var10000 = this;
         this.skills.clear();
         this.yqz = "0";
         this.nqz = "0";
         this.xyz = "0";
         int var10006 = 3 & 5;
         int var10008 = 3 & 5;
         var3.kw().bq((Object)null);
         var3.kq().bq((Object)null);
         var3.kl().setVisible((boolean)(3 >> 2));
         var3.kp().setVisible((boolean)(5 >> 3));
         var3.kw().setVisible((boolean)(3 ^ 3));
         var3.kq().setVisible((boolean)(5 >> 3));
         var3.kn().r((boolean)(2 & 5));
         var3.kn().mq.setVisible((boolean)(5 >> 3));
         var3.gt((boolean)var10008);
         var3.r((boolean)var10006);
         var3.kg().setVisible((boolean)(2 ^ 3));
         this.gameView.abh((boolean)(4 ^ 5), this.gameView.mapScene.ad().getMapMusic() + ".mp3");
         this.gameView.baseView.kh();
         this.gameView.baseView.kk(this.gameView.roleData.getChosePet(), (iO)null);
      } else {
         if (var1 != -4 >> 2) {
            RoleSummoning var4 = null;
            Lingbao var5 = null;
            iO var6;
            if ((var6 = var2.getBattleUnit(3 & 4, this.getRoleId())) != null) {
               this.yqz = String.valueOf(var6.bt().getYqz());
               this.nqz = String.valueOf(var6.bt().getNqz());
               this.xyz = String.valueOf(var6.bt().getXyz());
               this.g(var6.bt().g("技能"));
               int var7 = var6.bt().getCamp();
               int var8 = var6.bt().getMan();
               var4 = (var6 = var2.getPetUnit(this.getRoleId())) != null ? this.gameView.roleData.getPet(new BigDecimal(var6.bt().getId())) : null;
               var5 = (var6 = var2.getBattleUnitByCampMan(var7, var8 + (75 & 62))) != null ? this.gameView.roleData.getLingbao(new BigDecimal(var6.bt().getId())) : null;
            }

            var3.kw().bq(var4);
            var3.kq().bq(var5);
            var10000 = this;
         } else {
            var3.kw().bq((Object)null);
            var3.kq().bq((Object)null);
            var10000 = this;
         }

         var10000.gameView.chatBox.clearTextListFile(87 & 47);
         var3.kl().setText(var1 == -4 >> 2 ? "离开" : "自动");
         var3.kl().setVisible((boolean)(2 ^ 3));
         var3.kp().setVisible(var2.battleTip);
         var3.kw().setVisible((boolean)(var1 != -4 >> 2 && !this.gameView.systemData.j() ? 2 ^ 3 : 0));
         var3.kq().setVisible((boolean)(var1 != -4 >> 2 && !this.gameView.systemData.j() ? --1 : 0));
         var3.kn().mq.setVisible((boolean)(var1 != -4 >> 2 && var2.getBattleType() >= 0 && var2.getBattleType() <= --5 ? --1 : 0));
         int var10003 = 5 >> 3;
         var3.gt((boolean)(3 >> 2));
         var3.r((boolean)var10003);
         var3.kg().setVisible((boolean)(5 >> 3));
         var10000 = this;
         this.gameView.abf((boolean)(3 & 5), this.gameView.mapScene.ad().getMapMusic() + ".mp3");
         this.gameView.abh((boolean)(--1), var2.getMusic());
      }

      var10000.gameView.q();
      if (var2 != null && var2.getBattleState() == (4 ^ 5)) {
         this.m();
      } else {
         this.t();
      }
   }

   public void p(long var1) {
      if (this.handleUnit != null) {
         if (this.gameView.getFormManagement().m(14559 & 18359) != null) {
            if (var1 <= 5L || ev.l() - this.automationTime >= 2000L) {
               FightOperation var3 = this.handleUnit.bt().getType() == 0 ? this.RoleOperation : this.PetOperation;
               this.i(var3, (boolean)(--1));
            }
         }
      }
   }

   public long getBattleId() {
      return this.battleScene != null ? this.battleScene.getBattleId() : 0L;
   }

   public void q(int var1, int var2) {
      if (this.battleCamp != -4 >> 2) {
         if (this.battleScene != null && this.handleUnit != null) {
            SkillTx var3 = this.handleUnit.bt().getType() == 0 ? this.a(var1, var2) : null;
            int var10001;
            BattleControl var10002;
            FightOperation var4;
            if (var3 != null && !var3.c()) {
               if (var3.getId() == (32767 & 12010)) {
                  this.gameView.getFormManagement().n(62 & 99);
                  this.gameView.getFormManagement().n(47 & 126);
                  this.setMouseIndex(eP.f, var3.getSkill());
                  this.f();
               } else if (var3.getId() >= (28671 & 13097) && var3.getId() <= (14061 & 28606) && this.handleUnit.bt().getNqz() < (127 & 100)) {
                  this.gameView.f("你怒气值还未达到100,无法释放" + var3.getSkill().getSkillname());
               } else {
                  FightOperation var10000 = var4 = new FightOperation();
                  if (this.handleUnit.bt().getCamp() == this.battleCamp) {
                     var10001 = --1;
                     var10002 = this;
                  } else {
                     var10001 = 0;
                     var10002 = this;
                  }

                  var10000.a((boolean)var10001, var10002.handleUnit.bt().getMan(), --1, var3.getSkill().getSkillname());
                  this.c(this.j(this.handleUnit, var4));
                  var3.setIs((boolean)(--1));
                  this.gameView.f("你释放了" + var3.getSkill().getSkillname());
               }
            } else if (this.XZUnit != null) {
               if (this.gameView.getMouseIndex() == eP.h) {
                  if (this.handleUnit != this.XZUnit && this.handleUnit.ap() == this.XZUnit.ap()) {
                     var4 = this.handleUnit.bt().getType() == 0 ? this.RoleOperation : this.PetOperation;
                     if (this.XZUnit.bt().getCamp() == this.battleCamp) {
                        var10001 = 5 >> 2;
                        var10002 = this;
                     } else {
                        var10001 = 0;
                        var10002 = this;
                     }

                     var4.a((boolean)var10001, var10002.XZUnit.bt().getMan(), --3, (String)null);
                     this.s(var4);
                  }
               } else if (this.gameView.getMouseIndex() != eP.c) {
                  FightOperation var7;
                  if (this.gameView.getMouseIndex() == eP.j) {
                     Goodstable var6;
                     if ((var6 = (Goodstable)this.data) != null) {
                        var7 = this.handleUnit.bt().getType() == 0 ? this.RoleOperation : this.PetOperation;
                        if (this.XZUnit.bt().getCamp() == this.battleCamp) {
                           var10001 = --1;
                           var10002 = this;
                        } else {
                           var10001 = 0;
                           var10002 = this;
                        }

                        var7.a((boolean)var10001, var10002.XZUnit.bt().getMan(), 5 >> 1, var6.getRgid().toString());
                        this.s(var7);
                     }
                  } else if (this.gameView.getMouseIndex() == eP.f) {
                     Skill var5;
                     if ((var5 = (Skill)this.data) != null) {
                        if (var5 != null && this.n(var5, this.handleUnit, this.XZUnit)) {
                           if (var5.getSkillid().equals("12010")) {
                              this.h(this.handleUnit, this.v(12011 & 32766), this.XZUnit.bt().getCamp(), this.XZUnit.bt().getMan());
                           } else {
                              var7 = this.handleUnit.bt().getType() == 0 ? this.RoleOperation : this.PetOperation;
                              if (this.XZUnit.bt().getCamp() == this.battleCamp) {
                                 var10001 = 4 ^ 5;
                                 var10002 = this;
                              } else {
                                 var10001 = 0;
                                 var10002 = this;
                              }

                              var7.a((boolean)var10001, var10002.XZUnit.bt().getMan(), 3 >> 1, var5.getSkillname());
                              this.s(var7);
                           }
                        }
                     }
                  } else if (this.handleUnit != this.XZUnit) {
                     var4 = this.handleUnit.bt().getType() == 0 ? this.RoleOperation : this.PetOperation;
                     if (this.XZUnit.bt().getCamp() == this.battleCamp) {
                        var10001 = 4 ^ 5;
                        var10002 = this;
                     } else {
                        var10001 = 0;
                        var10002 = this;
                     }

                     var4.a((boolean)var10001, var10002.XZUnit.bt().getMan(), 3 ^ 3, (String)null);
                     this.s(var4);
                  }
               } else if (this.handleUnit.ap() != this.XZUnit.ap() && (this.battleScene.getBattleType() == 0 || this.battleScene.getBattleType() == --1 || this.battleScene.getBattleType() == --2)) {
                  var4 = this.handleUnit.bt().getType() == 0 ? this.RoleOperation : this.PetOperation;
                  if (this.XZUnit.bt().getCamp() == this.battleCamp) {
                     var10001 = 2 ^ 3;
                     var10002 = this;
                  } else {
                     var10001 = 0;
                     var10002 = this;
                  }

                  var4.a((boolean)var10001, var10002.XZUnit.bt().getMan(), --4, (String)null);
                  this.s(var4);
               }
            }
         }
      }
   }

   public void r(int var1) {
      FightingEvents var2 = new FightingEvents();
      var2.setFightingsum((int)this.battleScene.getBattleId());
      var2.setCurrentRound(var1);
      String var3 = Agreement.getSendText("fig4", mi.b().toJson(var2));
      this.gameView.getClient().d(var3);
   }

   public void s(FightOperation var1) {
      this.i(var1, (boolean)(3 >> 2));
   }

   public void t() {
      this.handleUnit = null;
      this.gameView.getFormManagement().n(54 & 107);
      this.gameView.getFormManagement().n(111 & 62);
      this.gameView.getFormManagement().n(19442 & 13517);
      if (this.battleCamp != -4 >> 2) {
         this.setMouseIndex(eP.l, (Object)null);
         this.gameView.baseView.kn().d();
      }
   }

   public void u() {
      by var1 = this.gameView.baseView;
      if (this.battleScene == null) {
         var1.kw().setVisible((boolean)(3 & 4));
         var1.kq().setVisible((boolean)(5 >> 3));
      } else {
         var1.kw().setVisible((boolean)(this.battleCamp != -4 >> 2 && !this.gameView.systemData.j() ? 4 ^ 5 : 0));
         var1.kq().setVisible((boolean)(this.battleCamp != -4 >> 2 && !this.gameView.systemData.j() ? 4 ^ 5 : 0));
      }
   }

   public SkillTx v(int var1) {
      int var2;
      for(int var10000 = var2 = this.skills.size() - --1; var10000 >= 0; var10000 = var2) {
         if (((SkillTx)this.skills.get(var2)).getId() == var1) {
            return (SkillTx)this.skills.get(var2);
         }

         --var2;
      }

      return null;
   }

   public static boolean w(String var0) {
      return var0.equals("绝境逢生") || var0.equals("子虚乌有") || var0.equals("春回大地") || var0.equals("妙手回春") || var0.equals("春意盎然") || var0.equals("忠诚") || var0.equals("自医") || var0.equals("遗产") || var0.equals("隐身") || var0.equals("仁之木叶神") || var0.equals("智之水叶神") || var0.equals("忠诚") || var0.equals("礼之火叶神") || var0.equals("大隐于朝") || var0.equals("鬼神莫测") || var0.equals("神出鬼没") || var0.equals("作鸟兽散") || var0.equals("将死") || var0.equals("妖之魔力") || var0.equals("力神复苏") || var0.equals("红袖添香") || var0.equals("莲步轻舞") || var0.equals("魔之飞步") || var0.equals("急速之魔") || var0.equals("狮王之怒") || var0.equals("兽王神力") || var0.equals("魔神附身") || var0.equals("楚楚可怜") || var0.equals("魔神护体") || var0.equals("含情脉脉") || var0.equals("魔神飞舞") || var0.equals("天外飞魔") || var0.equals("乾坤借速") || var0.equals("泽披天下") || var0.equals("将军令") || var0.equals("大势锤") || var0.equals("七宝玲珑塔") || var0.equals("黑龙珠") || var0.equals("幽冥鬼手") || var0.equals("绝情鞭") || var0.equals("宝莲灯") || var0.equals("番天印") || var0.equals("锦襕袈裟") || var0.equals("银索金铃") || var0.equals("飞花溅玉") || var0.equals("百害不侵") || var0.equals("明心见性") || var0.equals("五蕴炽盛") || var0.equals("清江映雪") || var0.equals("回光返照") || var0.equals("吹箫引凤") || var0.equals("六根清净") || var0.equals("因缘际会") || var0.equals("以直报怨") || var0.equals("如有神助") || var0.equals("破釜沉舟") || var0.equals("弱水三千") || var0.equals("流风回雪") || var0.equals("岳镇渊渟") || var0.equals("穿针引线") || var0.equals("鸿雁长飞") || var0.equals("销声匿迹") || var0.equals("一苇渡江") || var0.equals("苦海慈航") || var0.equals("拔山") || var0.equals("七星贯日") || var0.equals("御龙") || var0.equals("覆雨") || var0.equals("御龙") || var0.equals("引火烧身") || var0.equals("久旱初雨") || var0.equals("兴云致雨") || var0.equals("润物无声") || var0.equals("沛然莫御") || var0.equals("泽被万物") || var0.equals("春暖花开") || var0.equals("瞒天过海") || var0.equals("双生两仪盾") || var0.equals("固若金汤") || var0.equals("一矢中的") || var0.equals("法魂护体") || var0.equals("幻影迷踪") || var0.equals("兽魂俯首") || var0.equals("刚柔兼备") || var0.equals("凝神一击") || var0.equals("清心静气") || var0.equals("气吞山河") || var0.equals("气聚神凝") || var0.equals("行气如虹") || var0.equals("神龙摆尾") || var0.equals("以己渡人") || var0.equals("藏锋蓄势") || var0.equals("神佑") || var0.equals("蔷薇吐刺") || var0.equals("拨云见日") || var0.equals("佳期如梦") || var0.equals("三潭印月") || var0.equals("开山裂石") || var0.equals("戟指怒目") || var0.equals("气贯长虹") || var0.equals("恭行天罚") || var0.equals("振魂鼓") || var0.equals("玄瞳鉴") || var0.equals("玄鳞甲") || var0.equals("千丝网") || var0.equals("引蕴瓶") || var0.equals("夔灵鼓") || var0.equals("冥河纱") || var0.equals("沧溟露") || var0.equals("素手") || var0.equals("度厄") || var0.equals("处变不惊") || var0.equals("严阵以待");
   }
}
