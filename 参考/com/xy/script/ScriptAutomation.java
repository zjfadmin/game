package com.xy.script;

import com.xy.aG;
import com.xy.am;
import com.xy.bw;
import com.xy.cX;
import com.xy.cz;
import com.xy.dJ;
import com.xy.eC;
import com.xy.ev;
import com.xy.gX;
import com.xy.gz;
import com.xy.hY;
import com.xy.iI;
import com.xy.jJ;
import com.xy.lP;
import com.xy.lg;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.bean.UseCardBean;
import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.GameUtil;
import com.xy.game.HandleBangBattle;
import com.xy.game.HandleGood;
import com.xy.game.HandleOption;
import com.xy.game.NpcOption;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.readbean.ActiveAward;
import com.xy.readbean.ActiveBase;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.ActivityRole;
import com.xy.readbean.AllActive;
import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.TaskData;
import com.xy.richtext.TipBox;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.FlyEquip;
import com.xy.text.GameView;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScriptAutomation {
   private int timeInterval;
   private boolean assist;
   private long handleTime;
   private Object handleData;
   private List<Object> scriptList;
   private long handleFlag;
   private int access;
   private TipBox tipBox;
   private int automationBtnRed;
   private ScriptTask scriptTask;
   public GameView gameView;
   private dJ automationDoubleExp;
   private int handleType;
   private int automationTask;
   public boolean script;

   public void setAutomationBtnRed(int var1) {
      this.automationBtnRed = var1;
   }

   public void a() {
      if (this.gameView.getBattleScene() == null && this.gameView.getClient().k(--3)) {
         if ((this.automationTask -= --1) <= 0) {
            this.automationTask = 127 & 120;
            RoleData var4 = this.gameView.roleData;
            boolean var5 = this.gameView.roleUnit.h();
            int var3 = this.gameView.roleUnit.ap();
            Iterator var2;
            Iterator var10000 = var2 = this.gameView.getObjectArea().ap().getAutomationList().iterator();

            while(true) {
               while(var10000.hasNext()) {
                  TaskData var1;
                  if (!(var1 = (TaskData)var2.next()).b(var3, var5)) {
                     var10000 = var2;
                  } else if (!var1.c(var4.getLoginResult().getGrade())) {
                     var10000 = var2;
                  } else if (var4.getTaskSystem().getSetTask(var1.getTaskSetID()) != null) {
                     var10000 = var2;
                  } else if (var1.getTaskSet().getSumlimit() != 0 && var1.getTaskSet().getSumlimit() <= var4.getTaskSystem().getTaskSetNum(var1.getTaskSet(), --2)) {
                     var10000 = var2;
                  } else if (var1.getTaskSet().getSumreceive() != 0 && var1.getTaskSet().getSumreceive() <= var4.getTaskSystem().getTaskSetNum(var1.getTaskSet(), --1)) {
                     var10000 = var2;
                  } else if (var1.getOpenTime() != null && !var1.d()) {
                     var10000 = var2;
                  } else {
                     String var6 = Agreement.getSendTextAES("taskN", "l" + var1.getTaskID());
                     var10000 = var2;
                     this.gameView.getClient().d(var6);
                  }
               }

               return;
            }
         }
      }
   }

   public void b(List<Object> var1) {
      synchronized(this) {
         this.script = (boolean)(3 & 5);
         this.scriptList = var1;
      }
   }

   public void setTipText(String var1) {
      this.getTipBox().setText(var1);
   }

   public void c() {
      if (this.automationDoubleExp != null && this.automationDoubleExp.b <= ev.l()) {
         long var1 = this.automationDoubleExp.a;
         this.automationDoubleExp = null;
         jJ var3;
         if ((var3 = (jJ)this.gameView.getFormManagement().m(95 & 59)) != null && var3.e() == (95 & 63)) {
            ScriptAutomation var10000;
            if (var1 == 0L) {
               HandleOption.af(127 & 60, this.gameView);
               var10000 = this;
            } else {
               if (var1 == 1L) {
                  HandleOption.af(-4 >> 2, this.gameView);
               }

               var10000 = this;
            }

            var10000.gameView.getFormManagement().n(95 & 59);
         }
      }
   }

   public void d(ScriptTask var1, boolean var2, int var3) {
      synchronized(this) {
         int var10001 = 2 ^ 3;
         this.n(var2, var3);
         this.scriptTask = var1;
         var1.setTimeAssist();
         this.script = (boolean)var10001;
      }
   }

   public boolean e() {
      lg var5 = this.gameView.getObjectArea();
      LoginResult var4 = this.gameView.roleData.getLoginResult();
      String[] var7 = null;
      if (var4.getVipget() != null) {
         var7 = var4.getVipget().split("&&");
      }

      List var2 = var5.bt(2 ^ 3);
      int var1 = 2 & 5;
      int var6 = var2 != null ? var2.size() : 0;

      int var10000;
      for(var10000 = var1; var10000 < var6; var10000 = var1) {
         ChongjipackBean var3 = (ChongjipackBean)var2.get(var1);
         boolean var8;
         int var9 = (var8 = cX.j(var4.getGrade(), var3.getPackgrade())) && am.ib(var7, --4, var3.getPackgradetype()) ? 3 >> 1 : 0;
         if (var9 == 0 && var8) {
            return (boolean)(5 >> 2);
         }

         ++var1;
      }

      UseCardBean var12;
      List var15 = (var12 = this.gameView.roleData.getLimit("限时礼包")) != null ? var12.getKeysByActivity() : null;
      int var14 = 3 & 4;
      int var16 = var15 != null ? var15.size() : 0;

      for(var10000 = var14; var10000 < var16; var10000 = var14) {
         bw var17 = (bw)var15.get(var14);
         bw var13;
         if ((var13 = var5.r(var17.a)) != null) {
            var7 = null;
            if (var4.getVipget() != null) {
               var7 = var4.getVipget().split("&&");
            }

            var2 = var5.bk(63 & 75, var13.a);
            var1 = 5 >> 3;
            int var10 = var2 != null ? var2.size() : 0;

            for(var10000 = var1; var10000 < var10; var10000 = var1) {
               ChongjipackBean var11;
               if ((var11 = (ChongjipackBean)var2.get(var1)).getCanpaymoney() <= 0 && am.ia(var7, 127 & 7, var11.getPackgradetype()) < var11.getPointLvl().y) {
                  return true;
               }

               ++var1;
            }
         }

         ++var14;
      }

      return (boolean)(3 & 4);
   }

   public dJ getAutomationDoubleExp() {
      return this.automationDoubleExp;
   }

   public void setAutomationTask(int var1) {
      this.automationTask = var1;
   }

   public void f() {
      if (this.access == 0) {
         this.n((boolean)(3 & 4), 3 & 4);
      }

   }

   public void g(ScriptTask var1) {
      this.d(var1, (boolean)(3 >> 2), 3 >> 2);
   }


   private void h(int var1, ScriptOpen var2) {
      ScriptAutomation var10000;
      label119: {
         if (var2.getType() == 0) {
            int var3 = 3 >> 2;
            Goodstable var4;
            if (this.gameView.getClient().VALUE.indexOf("P") != -4 >> 2 && this.gameView.roleData.getEquipGood(94 & 47) == null && (var4 = this.gameView.roleData.getUsableFly()) != null) {
               String var5 = Agreement.getSendTextAES("rolechange", "FE" + var4.getRgid());
               int var10001 = 3 & 5;
               this.gameView.getClient().d(var5);
               var3 = var10001;
               this.gameView.flyEquip = new FlyEquip(var2.getX() / (86 & 61), var2.getY() / (23 & 124), (boolean)(4 ^ 5), ev.l());
            }

            if (var3 == 0) {
               var10000 = this;
               GameUtil.f(var2.getX() / (52 & 95), var2.getY() / (85 & 62), 3 & 4, (boolean)(--1), this.gameView);
               break label119;
            }
         } else {
            Door var6;
            int var10002;
            if (var2.getType() == 3 >> 1) {
               if ((var6 = this.gameView.getObjectArea().bo(String.valueOf(var2.getId()))) != null) {
                  var10002 = --3;
                  var10000 = this;
                  HandleOption.ac(var6, var10002, this.gameView);
                  break label119;
               }
            } else if (var2.getType() == 5 >> 1) {
               this.gameView.getFormManagement().n(27 & 127);
               if ((var6 = this.gameView.getObjectArea().bo(String.valueOf(var2.getId()))) != null) {
                  var10002 = --3;
                  var10000 = this;
                  HandleOption.ac(var6, var10002, this.gameView);
                  break label119;
               }
            } else {
               Goodstable var15;
               if (var2.getType() == --3) {
                  if ((var15 = this.gameView.roleData.getGood(new BigDecimal(var2.getId()))) == null || !GoodType.au(var15.getType())) {
                     this.gameView.f("孔明灯坐标已丢失,本次自动取消");
                     return;
                  }

                  GoodFight var10;
                  if ((var10 = var15.getFight().getFight(var2.getMap(), var2.getX(), var2.getY())) == null) {
                     this.gameView.f("孔明灯坐标已丢失,本次自动取消");
                     return;
                  }

                  HandleOption.a(true, var10, var15, this.gameView);
                  var10000 = this;
                  this.gameView.getFormManagement().n(95 & 59);
                  break label119;
               }

               if (var2.getType() == --4) {
                  var10000 = this;
                  HandleOption.r(var2.getMap(), var2.getX(), var2.getY(), this.gameView);
                  break label119;
               }

               if (var2.getType() == (31 & 106)) {
                  if ((var15 = this.gameView.roleData.getGood(new BigDecimal(var2.getId()))) == null || !GoodType.au(var15.getType())) {
                     this.gameView.f("孔明灯坐标已丢失,本次自动取消");
                     return;
                  }

                  HandleGood.g(var15, this.gameView.roleData);
                  var10000 = this;
                  break label119;
               }

               cz var8;
               if (var2.getType() == (11 & 127)) {
                  if ((var8 = this.gameView.mapScene.l(var2.getId())) != null) {
                     var10000 = this;
                     var8.a(this.gameView);
                     break label119;
                  }
               } else {
                  jJ var14;
                  if (var2.getType() == (76 & 63)) {
                     if ((var14 = (jJ)this.gameView.getFormManagement().m(27 & 127)) != null && var14.ls() instanceof cz) {
                        cz var9 = (cz)var14.ls();
                        NpcOption.yb(var2.getMap(), (int)var2.getId(), (String)null, var9.bb.getNpcway(), this.gameView);
                     }

                     var10000 = this;
                     this.gameView.getFormManagement().n(27 & 127);
                     break label119;
                  }

                  if (var2.getType() == (13 & 127)) {
                     if ((var8 = this.gameView.mapScene.l(var2.getId())) != null) {
                        gz var7;
                        if ((var7 = (gz)this.gameView.getFormManagement().m(95 & 59)) == null) {
                           eC.al(var8, this.gameView);
                           return;
                        }

                        if (var7.ls() != var8) {
                           this.gameView.getFormManagement().n(127 & 27);
                           return;
                        }

                        Goodstable var12;
                        if ((var12 = this.gameView.roleData.bc(new BigDecimal(var2.getMap()))) == null) {
                           this.gameView.f("没有相应物品");
                           return;
                        }

                        var7.oj(var12, (boolean)(5 >> 2));
                        var7.o();
                        this.scriptList.set(var1, (Object)null);
                        return;
                     }
                  } else if (var2.getType() == (46 & 95)) {
                     iI var11;
                     if ((var11 = this.gameView.roleData.getTaskSystem().getTaskUnit(var2.getId(), this.gameView.mapScene.l)) != null) {
                        var10000 = this;
                        var11.a(this.gameView);
                        break label119;
                     }
                  } else {
                     if (var2.getType() == 15) {
                        if ((var14 = (jJ)this.gameView.getFormManagement().m(27)) != null) {
                           HandleOption.o(2 & 5, var14);
                        }

                        var10000 = this;
                        this.gameView.getFormManagement().n(27);
                        break label119;
                     }

                     if (var2.getType() == 16) {
                        lP var13;
                        if ((var13 = this.gameView.mapScene.q((int)var2.getId())) != null) {
                           var10000 = this;
                           var13.a(this.gameView);
                           break label119;
                        }
                     } else if (var2.getType() == 17) {
                        if ((var14 = (jJ)this.gameView.getFormManagement().m(27)) != null) {
                           HandleOption.o(3 ^ 3, var14);
                        }

                        this.gameView.getFormManagement().n(27);
                     }
                  }
               }
            }
         }

         var10000 = this;
      }

      var10000.scriptList.remove(var1);
   }

   public void i() {
      if (this.gameView.isLoadMap) {
         this.c();
         this.a();
         this.u();
         if (this.automationDoubleExp == null) {
            if (this.handleType != 0) {
               this.w();
            } else if (this.scriptList != null || this.scriptTask != null) {
               ScriptAutomation var1 = this;
               synchronized(this) {
                  if (this.scriptList == null) {
                     if (this.scriptTask != null) {
                        this.s();
                     }

                  } else {
                     int var2;
                     if ((var2 = this.scriptList.size()) == 0) {
                        this.q();
                     } else {
                        --var2;
                        Object var3;
                        if ((var3 = this.scriptList.get(var2)) == null) {
                           this.scriptList.remove(var2);
                        } else {
                           ScriptAutomation var10000;
                           if (var3 instanceof ScriptOpen) {
                              this.h(var2, (ScriptOpen)var3);
                              var10000 = var1;
                           } else {
                              if (var3 instanceof ScriptEnd) {
                                 this.t(var2, (ScriptEnd)var3);
                              }

                              var10000 = var1;
                           }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void j(Task var1, int var2) {
      synchronized(this) {
         if (this.scriptTask != null && this.scriptTask.getTaskSetID() == var1.getTaskData().getTaskSetID()) {
            if (var2 != (9 & 127) && var2 != (41 & 94)) {
               if (var2 == --4) {
                  this.scriptTask.setTimeAssist();
               }

            } else {
               this.r();
            }
         }
      }
   }

   public boolean k(Activity var1) {
      lg var11 = this.gameView.getObjectArea();
      ActivityRole var5 = this.gameView.roleData.getActivity(var1.getId());

      int var4;
      for(int var10000 = var4 = 2 & 5; var10000 < var1.getMenuSet2s().length; var10000 = var4) {
         ActivityMenuSet2 var3;
         if ((var3 = var1.getMenuSet2s()[var4]).getId() == --3 || var3.getId() == --4) {
            FormulaNum[] var8;
            int var7 = (var8 = var3.getBases()).length;

            int var6;
            for(var10000 = var6 = 2 & 5; var10000 < var7; var10000 = var6) {
               FormulaNum var16 = var8[var6];
               int var9 = 5 >> 3;
               int var10 = var16.getSize();

               for(var10000 = var9; var10000 < var10; var10000 = var9) {
                  int var2 = (int)var16.getZhi(var9);
                  ActivityFC var12;
                  if ((var12 = var11.m(var2)) != null && var12.getType() == (1 ^ 3)) {
                     long var13 = var5 != null ? var5.getValueByKey(var2) : 0L;
                     if (var13 <= 0L) {
                        ActivityFCTarget var15;
                        ActivityFCTarget var17;
                        if ((var15 = (ActivityFCTarget)var12.getData()).getTarget().getType() == --1) {
                           var13 = var5 != null ? var5.getValueByKey(var15.getTarget().getId()) : 0L;
                           var17 = var15;
                        } else if (var15.getTarget().getType() == 5 >> 1) {
                           RoleTaskData var10001 = this.gameView.roleData.getTaskSystem();
                           var17 = var15;
                           var13 = (long)var10001.d(var15.getTarget().getId(), 1 ^ 3);
                        } else {
                           var13 = 0L;
                           var17 = var15;
                        }

                        if (Math.min(var17.getTarget().getNum(), var13) >= var15.getTarget().getNum()) {
                           return (boolean)(3 & 5);
                        }
                     }
                  }

                  ++var9;
               }

               ++var6;
            }
         }

         ++var4;
      }

      return (boolean)(3 ^ 3);
   }

   public boolean l() {
      RoleData var7;
      AllActive var6 = (var7 = this.gameView.roleData) != null ? this.gameView.getObjectArea().w() : null;
      if (var6 == null) {
         return (boolean)(5 >> 3);
      } else {
         int var5 = 0;
         ActiveBase[] var4 = var6.getBases();

         int var10000;
         int var1;
         int var3;
         for(var10000 = var3 = 3 >> 2; var10000 < var4.length; var10000 = var3) {
            ActiveBase var2 = var4[var3];
            var1 = var7.getTaskSystem().d(var2.getSid(), --2);
            if (var2.getNum() < var1) {
               var1 = var2.getNum();
            }

            int var10002 = var2.getValue();
            ++var3;
            var5 += var1 * var10002;
         }

         ActiveAward[] var9 = var6.getAwards();
         int var8 = var7.getTaskSystem().d(1 ^ 3, --3);

         for(var10000 = var1 = 5 >> 3; var10000 < var9.length; var10000 = var1) {
            if (var9[var1].getActive() <= var5 && (var8 >> var1 & --1) != --1) {
               return (boolean)(5 >> 2);
            }

            ++var1;
         }

         return (boolean)(3 >> 2);
      }
   }

   public void m(Task var1) {
      TaskProgress var9;
      if ((var9 = var1.getTaskProgress(this.scriptTask)) == null) {
         this.r();
      } else {
         ScriptIndex var18;
         if (var9.getType() == 0) {
            if ((var18 = this.scriptTask.getScriptIndex(3 & 4, var9)) == null) {
               this.r();
            } else {
               this.v(var18);
            }
         } else if (var9.getType() == (79 & 54)) {
            if ((var18 = this.scriptTask.getScriptIndex(2 ^ 3, var9)) == null) {
               this.r();
            } else {
               this.v(var18);
            }
         } else {
            int var10002;
            if (var9.getType() == --4) {
               BigDecimal var17 = new BigDecimal(var9.getDId());
               if (this.gameView.roleData.getGoodNum(var17) + var9.getSum() < var9.getMax()) {
                  this.gameView.f("没有足够的物品");
                  this.r();
               } else {
                  ScriptIndex var15;
                  if ((var15 = this.scriptTask.getScriptIndex(5 >> 1, var9)) == null) {
                     this.r();
                  } else {
                     int var16;
                     ScriptAutomation var21;
                     label78: {
                        var16 = this.access;
                        if (this.access == 3 >> 1 && this.gameView.getClient().n(1 ^ 3, 126 & 13)) {
                           Goodstable var10 = this.gameView.systemData.a() ? this.gameView.roleData.az(105L) : null;
                           if (var10 != null) {
                              var10002 = 4 ^ 5;
                              var10.ab(5 >> 2);
                              ParamTool.g(var10, var10002, this.gameView.getClient());
                              if (var10.getUsetime() <= 0) {
                                 var21 = this;
                                 this.gameView.roleData.h(var10.getRgid());
                                 break label78;
                              }
                           } else {
                              var16 = 0;
                           }
                        }

                        var21 = this;
                     }

                     RoleShow var11 = var21.gameView.roleUnit.r;
                     hY var7 = var15.getMapPoint();
                     List var19;
                     if ((var19 = this.gameView.getObjectArea().ca().d(var11.getMapid().intValue(), var11.getX(), var11.getY(), 3 & 4, var7.a(), var7.f(), var7.c(), 3 >> 2, var16, this.gameView.roleData)) == null) {
                        this.gameView.f("你所在位置无法达到目的地");
                        this.r();
                     } else {
                        ScriptOpen var8 = new ScriptOpen(93 & 47, (long)var9.getGId(), var9.getDId(), var9.getMax() - var9.getSum(), 3 >> 2, 3 >> 2);
                        var19.add(3 ^ 3, var8);
                        this.b(var19);
                     }
                  }
               }
            } else {
               if (var9.getMap() != 0) {
                  int var6;
                  TaskProgress var10000;
                  label100: {
                     var6 = this.access;
                     if (this.access == (3 & 5) && this.gameView.getClient().n(1 ^ 3, 108 & 31)) {
                        Goodstable var3 = this.gameView.systemData.a() ? this.gameView.roleData.az(105L) : null;
                        if (var3 != null) {
                           var10002 = 4 ^ 5;
                           var3.ab(3 & 5);
                           ParamTool.g(var3, var10002, this.gameView.getClient());
                           if (var3.getUsetime() <= 0) {
                              var10000 = var9;
                              this.gameView.roleData.h(var3.getRgid());
                              break label100;
                           }
                        } else {
                           var6 = 0;
                        }
                     }

                     var10000 = var9;
                  }

                  if (var10000.getType() == (10 & 125) && this.gameView.roleUnit.r.getMapid() == (long)var9.getMap()) {
                     int var12 = this.gameView.roleUnit.ab - var9.getX();
                     int var4 = this.gameView.roleUnit.al - var9.getY();
                     if (var12 * var12 + var4 * var4 <= var9.getDId() * var9.getDId()) {
                        return;
                     }
                  }

                  RoleShow var13 = this.gameView.roleUnit.r;
                  List var14;
                  if ((var14 = this.gameView.getObjectArea().ca().d(var13.getMapid().intValue(), var13.getX(), var13.getY(), 3 & 4, var9.getMap(), var9.getX(), var9.getY(), 5 >> 3, var6, this.gameView.roleData)) == null) {
                     this.gameView.f("你所在位置无法达到目的地");
                     this.r();
                     return;
                  }

                  ScriptOpen var20 = new ScriptOpen;
                  TaskProgress var10003;
                  if (var9.getType() == 3 >> 1) {
                     var10002 = 78 & 63;
                     var10003 = var9;
                  } else {
                     var10002 = 11;
                     var10003 = var9;
                  }

                  var20.<init>(var10002, (long)var10003.getDId());
                  ScriptOpen var5 = var20;
                  var14.add(3 >> 2, var5);
                  if (var9.getType() == 5 >> 2 || var9.getType() == 5 >> 1) {
                     ScriptOpen var2 = new ScriptOpen(47 & 95, (long)var9.getDId());
                     var14.add(3 ^ 3, var2);
                  }

                  this.b(var14);
               }

            }
         }
      }
   }

   public void n(boolean var1, int var2) {
      synchronized(this) {
         int var10007 = 3 & 4;
         this.assist = var1;
         this.access = var2;
         this.script = (boolean)var10007;
         this.scriptList = null;
         this.scriptTask = null;
         this.gameView.getGameReadBar().setReadBar(2 & 5, 2 & 5, (String)null, 0.0D, 0L, (Object)null);
         aG var5;
         if ((var5 = (aG)this.gameView.getFormManagement().m(21143 & 11769)) != null) {
            var5.r((boolean)(3 & 4));
         }

      }
   }

   public ScriptAutomation(GameView var1) {
      int var10003 = 124 & 63;
      int var10005 = 124 & 63;
      int var10007 = 5 >> 3;
      super();
      this.script = (boolean)var10007;
      this.automationTask = var10005;
      this.automationBtnRed = var10003;
      this.gameView = var1;
   }

   public boolean o(boolean var1) {
      long var2 = (long)(this.gameView.getClient().n(--2, 28 & 111) ? 479 & 32687 : 70);
      if (this.gameView.roleUnit.h() && (long)this.gameView.roleData.getLoginResult().getGrade() >= var2) {
         if (this.gameView.roleUnit.ad() != null && this.gameView.roleUnit.ad().length == --5) {
            if (this.gameView.roleData.getLoginResult().getGold().longValue() < 3000000L) {
               return (boolean)(3 >> 2);
            } else if (this.gameView.roleUnit.r.getMapid() == 3320L) {
               int var5 = 3 >> 1;
               this.handleTime = Math.max(ev.f() + 60000L, this.handleTime);
               return (boolean)var5;
            } else {
               if (var1) {
                  this.handleType = 3 >> 1;
                  this.handleFlag = 0L;
                  this.handleTime = ev.f() + 120000L;
               } else {
                  if (this.handleFlag >= ev.f()) {
                     return (boolean)(2 ^ 3);
                  }

                  if (this.gameView.getBattleScene() != null) {
                     return (boolean)(2 ^ 3);
                  }

                  if (this.handleFlag != 0L) {
                     return (boolean)(2 & 5);
                  }

                  Door var4;
                  Door var10000 = var4 = new Door();
                  var10000.setDoormap(this.gameView.roleUnit.r.getMapid().toString());
                  var10000.setDoorpoint(this.gameView.roleUnit.ab + "|" + this.gameView.roleUnit.al);
                  this.handleData = var4;
                  HandleBangBattle.c("自动参加水陆大会", (jJ)null);
                  this.handleFlag = ev.f() + 5000L;
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void setAutomationDoubleExp(dJ var1) {
      this.automationDoubleExp = var1;
   }

   public void p() {
      this.handleType = --2;
      this.handleFlag = ev.f() + 2000L;
      this.handleTime = ev.f() + 60000L;
   }

   public void q() {
      ScriptAutomation var1 = this;
      synchronized(this) {
         ScriptAutomation var10000;
         if (this.scriptTask == null) {
            this.n((boolean)(5 >> 3), 5 >> 3);
            var10000 = var1;
         } else {
            this.scriptList = null;
            var10000 = var1;
         }

      }
   }

   public boolean r() {
      if (this.assist) {
         int var1 = this.scriptTask != null ? this.scriptTask.getTaskSetID() : 0;
         if (((aG)this.gameView.getFormManagement().e(16793 & 16119)).au(var1)) {
            return (boolean)(2 ^ 3);
         }
      }

      this.n((boolean)(5 >> 3), 5 >> 3);
      return (boolean)(3 & 4);
   }

   public void s() {
      ScriptAutomation var1 = this;
      synchronized(this) {
         if (this.gameView.getBattleScene() == null) {
            if (!this.gameView.roleUnit.h()) {
               this.n((boolean)(2 & 5), 2 & 5);
            } else if (this.scriptTask.i()) {
               ScriptAutomation var10000;
               if (this.scriptTask.getNpcID() == 0) {
                  ScriptIndex var11 = this.scriptTask.getScriptIndex(3 ^ 3, (TaskProgress)null);
                  this.scriptTask.d();
                  if (var11 != null) {
                     this.v(var11);
                     var10000 = var1;
                  } else {
                     this.r();
                     var10000 = var1;
                  }

               } else {
                  Task var2;
                  if ((var2 = this.gameView.roleData.getTaskSystem().getSetTask(this.scriptTask.getTaskSetID())) != null) {
                     this.scriptTask.d();
                     this.m(var2);
                  } else {
                     if (this.scriptTask.b() >= 0) {
                        int var8;
                        label78: {
                           var8 = this.scriptTask.f() ? this.access : 1;
                           if (this.scriptTask.f() && this.access == (2 ^ 3) && this.gameView.getClient().n(--2, 93 & 46)) {
                              Goodstable var3 = this.gameView.systemData.a() ? this.gameView.roleData.az(105L) : null;
                              if (var3 != null) {
                                 int var10002 = 3 >> 1;
                                 var3.ab(--1);
                                 ParamTool.g(var3, var10002, this.gameView.getClient());
                                 if (var3.getUsetime() <= 0) {
                                    var10000 = this;
                                    this.gameView.roleData.h(var3.getRgid());
                                    break label78;
                                 }
                              } else {
                                 var8 = 0;
                              }
                           }

                           var10000 = this;
                        }

                        RoleShow var10 = var10000.gameView.roleUnit.r;
                        List var4;
                        if ((var4 = this.gameView.getObjectArea().ca().d(var10.getMapid().intValue(), var10.getX(), var10.getY(), 3 >> 2, this.scriptTask.getMap(), this.scriptTask.getX(), this.scriptTask.getY(), 3 ^ 3, var8, this.gameView.roleData)) == null) {
                           this.gameView.f("你所在位置无法达到目的地");
                           this.r();
                           return;
                        }

                        ScriptOpen var5 = new ScriptOpen(31 & 107, (long)this.scriptTask.getNpcID());
                        var4.add(3 & 4, var5);
                        ScriptOpen var6 = new ScriptOpen(109 & 30, (long)this.scriptTask.getTaskID(), this.scriptTask.getTaskSetID(), 3 ^ 3, 3 ^ 3, 3 ^ 3);
                        var4.add(3 ^ 3, var6);
                        var10000 = this;
                        this.b(var4);
                     } else {
                        if (this.scriptTask.f()) {
                           this.r();
                           return;
                        }

                        ArrayList var9 = new ArrayList();
                        ScriptOpen var12 = new ScriptOpen(--4, 0L, this.scriptTask.getMap(), this.scriptTask.getX(), this.scriptTask.getY(), 5 >> 3);
                        var9.add(3 ^ 3, var12);
                        ScriptEnd var13 = new ScriptEnd(this.scriptTask.getMap(), this.scriptTask.getX(), this.scriptTask.getY(), 3 ^ 3);
                        var9.add(3 ^ 3, var13);
                        var9.add((Object)null);
                        var9.add((Object)null);
                        ScriptEnd var14 = new ScriptEnd(5 >> 2);
                        var9.add(var14);
                        this.b(var9);
                        var10000 = this;
                     }

                     var10000.scriptTask.d();
                  }
               }
            }
         }
      }
   }


   private void t(int var1, ScriptEnd var2) {
      if (var2.getType() == 0) {
         eC var3;
         if ((var3 = this.gameView.roleUnit).r.getMapid() == (long)var2.getMap() && Math.abs(var3.ab - var2.getX()) < (108 & 119) && Math.abs(var3.al - var2.getY()) < (111 & 116)) {
            this.scriptList.remove(var1);
            return;
         }
      } else if (var2.getType() == --1) {
         this.r();
      }

   }

   public TipBox getTipBox() {
      return this.tipBox != null ? this.tipBox : (this.tipBox = new TipBox("#Y自动寻路中", (GameView)null));
   }

   public void u() {
      if ((this.automationBtnRed -= 2 ^ 3) <= 0 && this.gameView.getClient().u()) {
         this.automationBtnRed = 120 & 127;
         this.gameView.baseView.kt()[--2].setRed(this.e());
         this.gameView.baseView.kt()[--3].setRed(this.l());
         List var4 = this.gameView.baseView.ks();

         int var2;
         for(int var10000 = var2 = 3 ^ 3; var10000 < var4.size(); var10000 = var2) {
            Activity var1;
            gX var3;
            if ((var3 = (gX)var4.get(var2)).tp() > (126 & 101) && var3.tp() < (30955 & 2012) && (var1 = this.gameView.getObjectArea().aq(var3.tp())) != null && var1.getModelId() != (3 & 5)) {
               if (var1.getModelId() == --2) {
                  var3.setRed(this.k(var1));
               } else if (var1.getModelId() == --3) {
               }
            }

            ++var2;
         }

      }
   }

   public void v(ScriptIndex var1) {
      RoleShow var2 = this.gameView.roleUnit.r;
      hY var3;
      List var5;
      ScriptAutomation var10000;
      int var10002;
      if ((var3 = var1.getMapPoint()).a() != var2.getMapid().intValue()) {
         int var11;
         label54: {
            var11 = this.access;
            if (this.access == --1 && this.gameView.getClient().n(5 >> 1, 109 & 30)) {
               Goodstable var13 = this.gameView.systemData.a() ? this.gameView.roleData.az(105L) : null;
               if (var13 != null) {
                  var10002 = --1;
                  var13.ab(2 ^ 3);
                  ParamTool.g(var13, var10002, this.gameView.getClient());
                  if (var13.getUsetime() <= 0) {
                     var10000 = this;
                     this.gameView.roleData.h(var13.getRgid());
                     break label54;
                  }
               } else {
                  var11 = 0;
               }
            }

            var10000 = this;
         }

         if ((var5 = var10000.gameView.getObjectArea().ca().d(var2.getMapid().intValue(), var2.getX(), var2.getY(), 5 >> 3, var3.a(), var3.f(), var3.c(), 5 >> 3, var11, this.gameView.roleData)) == null) {
            this.gameView.f("你所在位置无法达到目的地");
            this.r();
         } else {
            this.b(var5);
         }
      } else if (var1.getType() == 0) {
         lP var10;
         if ((var10 = this.gameView.mapScene.c(var1.getKey(), this.gameView.roleUnit.ab, this.gameView.roleUnit.al, this.scriptTask)) != null) {
            int var12;
            label63: {
               var12 = this.access;
               if (this.access == --1 && this.gameView.getClient().n(--2, 78 & 61)) {
                  Goodstable var7 = this.gameView.systemData.a() ? this.gameView.roleData.az(105L) : null;
                  if (var7 != null) {
                     var10002 = 3 & 5;
                     var7.ab(4 ^ 5);
                     ParamTool.g(var7, var10002, this.gameView.getClient());
                     if (var7.getUsetime() <= 0) {
                        var10000 = this;
                        this.gameView.roleData.h(var7.getRgid());
                        break label63;
                     }
                  } else {
                     var12 = 0;
                  }
               }

               var10000 = this;
            }

            List var8;
            if ((var8 = var10000.gameView.getObjectArea().ca().d(var2.getMapid().intValue(), var2.getX(), var2.getY(), 3 >> 2, var2.getMapid().intValue(), var10.ab, var10.al, 2 & 5, var12, this.gameView.roleData)) == null) {
               this.scriptTask.g();
            } else {
               this.scriptTask.a((long)var10.p.getI());
               ScriptOpen var6 = new ScriptOpen(88 & 55, (long)var10.p.getI());
               List var14 = var8;
               List var10001 = var8;
               var8.add(3 ^ 3, var6);
               ScriptOpen var9 = new ScriptOpen(93 & 51, (long)var10.p.getI());
               var14.add(3 >> 2, var9);
               this.b(var10001);
            }
         }
      } else {
         if (var1.getType() == 3 >> 1) {
            Point var4 = this.gameView.mapScene.r.m();
            if ((var5 = this.gameView.getObjectArea().ca().d(var2.getMapid().intValue(), var2.getX(), var2.getY(), 3 ^ 3, var2.getMapid().intValue(), var4.x, var4.y, 3 & 4, 3 & 4, this.gameView.roleData)) != null) {
               this.b(var5);
            }
         }

      }
   }

   public void w() {
      if (this.handleTime < ev.f()) {
         this.handleType = 3 ^ 3;
      } else {
         if (this.handleType == (2 ^ 3)) {
            if (!this.o((boolean)(2 & 5))) {
               this.handleType = 2 & 5;
               return;
            }
         } else if (this.handleType == --2) {
            if (this.handleFlag >= ev.f()) {
               return;
            }

            if (this.handleFlag == 0L) {
               this.q();
               this.handleType = 3 & 4;
               return;
            }

            if (this.handleData != null && this.handleData instanceof Door) {
               HandleOption.ac((Door)this.handleData, --3, this.gameView);
               this.handleFlag = 0L;
               return;
            }

            HandleOption.e(0, this.gameView);
            this.handleFlag = 0L;
         }

      }
   }
}
