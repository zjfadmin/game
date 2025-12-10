package com.xy.game;

import com.xy.W;
import com.xy.dr;
import com.xy.eC;
import com.xy.el;
import com.xy.ev;
import com.xy.fC;
import com.xy.fa;
import com.xy.fp;
import com.xy.gs;
import com.xy.hd;
import com.xy.jJ;
import com.xy.jY;
import com.xy.lP;
import com.xy.lg;
import com.xy.lz;
import com.xy.mi;
import com.xy.mw;
import com.xy.v;
import com.xy.bean.ConfirmBean;
import com.xy.bean.PalacePkBean;
import com.xy.bean.QuoteOutBean;
import com.xy.bean.SuitOperBean;
import com.xy.entity.DataOther;
import com.xy.entity.Lingbao;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.MsgUntil;
import com.xy.formula.SkillUtil;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCEnroll;
import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.TaskData;
import com.xy.richtext.RichLabel;
import com.xy.scene.DNTGScene;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NpcOption extends RichLabel implements MouseListener {
   private int type;
   private fC form;
   private Object data;
   private int id;

   public void mouseEntered(MouseEvent var1) {
      this.sectionList.set(3 ^ 3, Color.red);
   }

   public NpcOption(fC var1) {
      super("#G", lz.ce);
      this.form = var1;
      if (var1 instanceof jJ) {
         this.addMouseListener(this);
      }

   }

   public static void yb(int var0, int var1, String var2, String var3, GameView var4) {
      lg var5 = var4.getObjectArea();
      RoleTaskData var6 = var4.roleData.getTaskSystem();
      String[] var13 = var3.split(" ");

      int var7;
      for(int var10000 = var7 = 2 & 5; var10000 < var13.length; var10000 = var7) {
         List var8 = el.a(var13[var7]);
         TaskData var9;
         if ((var9 = var5.am(Integer.parseInt((String)var8.get(3 & 4)))) != null) {
            int var10;
            var10000 = var10 = 0;

            while(true) {
               if (var10000 >= var6.getTaskList().size()) {
                  String var14;
                  String var15;
                  if (var0 != 0) {
                     if (var0 == var9.getTaskSetID() && (var1 == 0 || var1 == var9.getTaskID())) {
                        var14 = (String)var8.get(W.c.nextInt(var8.size()));
                        var15 = Agreement.getSendTextAES("taskN", "L" + var14);
                        var4.getClient().d(var15);
                        return;
                     }
                  } else if (var9.getTaskOpen().equals(var2)) {
                     var14 = (String)var8.get(W.c.nextInt(var8.size()));
                     var15 = Agreement.getSendTextAES("taskN", "L" + var14);
                     var4.getClient().d(var15);
                     return;
                  }
                  break;
               }

               Task var11;
               if ((var11 = (Task)var6.getTaskList().get(var10)).getTaskData().getTaskID() == var9.getTaskID() && var11.getTaskState() == --2) {
                  if (var2 == null) {
                     break;
                  }

                  if (var2.equals("我要取消" + var9.getTaskName())) {
                     if (ev.l() < var4.timeTask + 60000L) {
                        var4.f("你需要等待1分钟才能再一次取消任务");
                        return;
                     }

                     if (var4.getClient().k(--3) && var11.getTaskData().a("无法取消")) {
                        var4.f("该任务无法取消");
                        return;
                     }

                     var4.timeTask = ev.l();
                     String var12 = Agreement.getSendTextAES("taskN", "E" + var11.getTaskId());
                     var4.getClient().d(var12);
                     return;
                  }
               }

               ++var10;
               var10000 = var10;
            }
         }

         ++var7;
      }

   }

   public void s() {
      if (!this.form.aej.roleUnit.g() && this.type != (118 & 31) && this.type != (23 & 127) && this.type != (31 & 126)) {
         this.form.aej.f("你还在摆摊");
      } else if (this.type == 0) {
         this.d();
      } else if (this.type == 3 >> 1) {
         this.q();
      } else if (this.type == (1 ^ 3)) {
         HandleOption.ac((Door)this.data, 1 ^ 3, this.form.aej);
      } else {
         jJ var1;
         Goodstable var23;
         if (this.type == --3) {
            var1 = (jJ)this.form;
            if ((var23 = this.form.vd().getGood(new BigDecimal(var1.lj()))) != null) {
               GoodFight var21 = (GoodFight)this.data;
               var1.lp(var23, var21.getMenu());
            }
         } else {
            if (this.type == --4) {
               if (!HandleGood.l(this.form.vd())) {
                  return;
               }

               var1 = (jJ)this.form;
               if ((var23 = this.form.vd().getGood(new BigDecimal(var1.lj()))) == null) {
                  return;
               }

               if (this.id == 0) {
                  HandleOption.u(var23, this.form.aej);
                  return;
               }

               if (this.id == --1) {
                  HandleOption.a((boolean)(3 >> 2), (GoodFight)this.data, var23, this.form.aej);
                  return;
               }

               if (this.id == --2) {
                  HandleOption.l((GoodFight)this.data, var23, this.form.aej);
                  return;
               }

               if (this.id == --3) {
                  HandleOption.g((GoodFight)this.data, var23, this.form.aej);
                  return;
               }
            } else {
               if (this.type == --5) {
                  var1 = (jJ)this.form;
                  if ((var23 = this.form.vd().getGood(new BigDecimal(var1.lj()))) == null) {
                     return;
                  }

                  HandlePet.getChangeCJS(var23, (String)this.data, this.form.vd());
                  return;
               }

               if (this.type != (79 & 54)) {
                  String var18;
                  String var19;
                  if (this.type == (31 & 103)) {
                     var1 = (jJ)this.form;
                     Task var22;
                     if ((var22 = this.form.vd().getTaskSystem().getTaskId(var1.lj().intValue())) == null) {
                        return;
                     }

                     var18 = (String)this.data;
                     var19 = Agreement.getSendTextAES("taskN", "Q" + var22.getTaskId() + "|" + var18 + "|" + this.id);
                     this.form.uw().d(var19);
                     return;
                  }

                  if (this.type == (111 & 24)) {
                     HandleOption.d(this.id, this.form.aej);
                     return;
                  }

                  String var2;
                  if (this.type == (121 & 15)) {
                     var1 = (jJ)this.form;
                     var2 = Agreement.getSendTextAES("userpet", var1.lx() + "|" + var1.lj() + "|" + this.id);
                     this.form.uw().d(var2);
                     return;
                  }

                  if (this.type == (94 & 43)) {
                     if (this.id == 0) {
                        return;
                     } else {
                        RoleSummoning var17;
                        if ((var17 = (var1 = (jJ)this.form).vd().getPet(new BigDecimal(var1.lj()))) == null) {
                           return;
                        } else {
                           var18 = var17.getSummoningskin();
                           MsgUntil.q(var17);
                           if (var18.equals(var17.getSummoningskin())) {
                              return;
                           } else {
                              ParamTool.h(var17, this.form.uw());
                              return;
                           }
                        }
                     }
                  }

                  if (this.type == (107 & 31)) {
                     var1 = (jJ)this.form;
                     var2 = Agreement.getSendTextAES("userpet", "N|" + var1.lj() + "|" + this.id);
                     this.form.uw().d(var2);
                     return;
                  }

                  Goodstable var3;
                  Lingbao var6;
                  RoleData var15;
                  if (this.type == (93 & 46)) {
                     var1 = (jJ)this.form;
                     var15 = this.form.vd();
                     if ((var3 = var15.getGood(new BigDecimal(var1.lj()))) == null) {
                        return;
                     }

                     SuitOperBean var20 = new SuitOperBean();
                     ArrayList var24;
                     (var24 = new ArrayList()).add(var3.getRgid());
                     var20.setType(123 & 63);
                     var6 = null;
                     var20.setGoods(var24);
                     PartJade var25;
                     SuitOperBean var27;
                     if (this.id == 0) {
                        if (var15.getLoginResult().getScoretype("星芒").compareTo(new BigDecimal(127 & 100)) < 0) {
                           this.form.aej.f("星芒不足");
                           return;
                        }

                        var25 = new PartJade(1L, 3 & 4);
                        var27 = var20;
                     } else {
                        if (var15.getLoginResult().getGold().compareTo(new BigDecimal(10000000)) < 0) {
                           this.form.aej.f("大话币不足");
                           return;
                        }

                        var25 = new PartJade(0L, 5 >> 3);
                        var27 = var20;
                     }

                     var27.setJade(var25);
                     String var26 = Agreement.getSendTextAES("suitoperate", mi.b().toJson(var20));
                     this.form.uw().d(var26);
                     return;
                  }

                  String var10;
                  if (this.type == (125 & 15)) {
                     var10 = Agreement.getSendTextAES("rolechange", "EFZ" + this.id);
                     this.form.uw().d(var10);
                     return;
                  }

                  String var5;
                  if (this.type != (79 & 62) && this.type != (15 & 127)) {
                     if (this.type == 16) {
                        ((jJ)this.form).y(this.id);
                        return;
                     }

                     if (this.type == 17) {
                        HandleOption.v(this.id, (jJ)this.form);
                        return;
                     }

                     if (this.type == 18) {
                        fp var8;
                        if ((var8 = (fp)this.form.ve().m(17)) != null) {
                           var8.r((boolean)(4 ^ 5));
                           return;
                        }
                     } else {
                        if (this.type == 19) {
                           BigDecimal var12 = (BigDecimal)this.data;
                           if ((var3 = (var15 = this.form.vd()).getGood(var12)) == null) {
                              return;
                           }

                           ((mw)var15.getGameView().getFormManagement().e(162)).ax(var3);
                           return;
                        }

                        if (this.type == 20) {
                           var10 = Agreement.getSendTextAES("usermount", "SHNJ" + this.id);
                           this.form.uw().d(var10);
                           return;
                        }

                        if (this.type == 21) {
                           long var13 = ((jJ)this.form).lj();
                           var19 = Agreement.getSendTextAES("activity", var13 + "|n" + this.id);
                           this.form.uw().d(var19);
                           return;
                        }

                        if (this.type == 22) {
                           var10 = Agreement.getSendTextAES("user", (String)this.data);
                           this.form.uw().d(var10);
                           return;
                        }

                        if (this.type == 23) {
                           RoleData var9 = this.form.vd();
                           int var14 = (var2 = (String)this.data).indexOf("|");
                           BigDecimal var16 = new BigDecimal(var2.substring(3 & 4, var14));
                           var5 = var2.substring(var14 + --1);
                           if ((var6 = var9.getLingbao(var16)) == null) {
                              this.form.aej.f("灵宝不见了");
                              return;
                           }

                           if (var5.equals("维持原本抗性")) {
                              var14 = var6.getKangxing().indexOf("=");
                              var5 = var6.getKangxing().substring(3 ^ 3, var14);
                           }

                           int var7 = (var6.getLingbaolvl().intValue() - (4 ^ 5)) / 40 + --1;
                           double var11 = var6.getLingbaolvl().intValue() >= 200 ? 10.0D : MsgUntil.getDouble((double)((var7 - (5 >> 2)) * (5 >> 1)) + 0.1D, (double)(var7 * --2) + 0.1D, 4 ^ 5);
                           if (var11 > 10.0D) {
                              var11 = 10.0D;
                           }

                           if (ParamTool.c(200000L, this.form.aej)) {
                              if (var6.getEquipment() == --1) {
                                 var9.getRoleProperty().s(var6.getKangxing(), (boolean)(3 & 4));
                              }

                              var6.setKangxing(var5 + "=" + var11);
                              if (var6.getEquipment() == (2 ^ 3)) {
                                 var9.getRoleProperty().s(var6.getKangxing(), (boolean)(2 ^ 3));
                              }

                              ParamTool.i(var6, this.form.uw());
                              var9.getRoleProperty().h(var6);
                              return;
                           }
                        } else {
                           if (this.type == 30) {
                              this.cc();
                              return;
                           }

                           if (this.type == 31 && (this.id == 0 || this.id == 5 >> 2)) {
                              this.form.uw().setTS(3 & 4, (boolean)(3 >> 1));
                           }
                        }
                     }
                  } else {
                     var1 = (jJ)this.form;
                     Goodstable var10000 = var3 = this.form.vd().getGood(new BigDecimal(var1.lj()));
                     int var4 = var1.lx().intValue();
                     if (var10000 == null || var4 > var3.getUsetime()) {
                        return;
                     }

                     if (this.type == (111 & 30)) {
                        var1.ey(var3, this.id, var4);
                        return;
                     }

                     if (this.type == 15) {
                        var5 = Agreement.getSendTextAES("user", var3.getRgid().toString() + "|" + var4 + "|" + this.id);
                        this.form.uw().d(var5);
                        return;
                     }
                  }
               }
            }

         }
      }
   }


   private void lu(lP var1) {
      if (var1.p.getTaskList() != null) {
         String var8 = (String)this.data;
         lg var7 = this.form.vc();
         RoleTaskData var4 = this.form.vd().getTaskSystem();
         List var9 = var1.p.getTaskList();

         int var5;
         for(int var10000 = var5 = 2 ^ 3; var10000 < var9.size(); var10000 = var5) {
            TaskData var6;
            if ((var6 = var7.am((Integer)var9.get(var5))) != null) {
               int var3;
               var10000 = var3 = 0;

               while(true) {
                  if (var10000 >= var4.getTaskList().size()) {
                     if (var6.getTaskOpen().equals(var8)) {
                        String var11 = Agreement.getSendTextAES("taskN", "L" + var6.getTaskID());
                        this.form.uw().d(var11);
                        return;
                     }
                     break;
                  }

                  Task var2;
                  if ((var2 = (Task)var4.getTaskList().get(var3)).getTaskData().getTaskID() == var6.getTaskID() && var2.getTaskState() == (1 ^ 3)) {
                     if (var8 == null) {
                        break;
                     }

                     if (var8.equals("我要取消" + var6.getTaskName())) {
                        if (ev.l() < this.form.aej.timeTask + 60000L) {
                           this.form.aej.f("你需要等待1分钟才能再一次取消任务");
                           return;
                        }

                        this.form.aej.timeTask = ev.l();
                        String var10 = Agreement.getSendTextAES("taskN", "E" + var2.getTaskId());
                        this.form.uw().d(var10);
                        return;
                     }
                  }

                  ++var3;
                  var10000 = var3;
               }
            }

            ++var5;
         }

      }
   }

   public void d() {
      if (this.id != 0) {
         if (this.id == 3 >> 1) {
            jJ var11 = (jJ)this.form;
            HandleOption.c((Integer)this.data, var11.ls(), this.form.aej);
         } else if (this.id == --2) {
            ((jJ)this.form).as((Integer)this.data);
         } else if (this.id == --3) {
            HandleOption.e(3 & 4, this.form.aej);
         } else if (this.id != --4 && this.id != --5) {
            if (this.id == (79 & 54)) {
               HandleOption.af((Integer)this.data, this.form.aej);
            } else if (this.id == (47 & 87)) {
               HandleOption.af(-4 >> 2, this.form.aej);
            } else if (this.id == (28 & 107)) {
               HandleOption.af(-2 & -1, this.form.aej);
            } else if (this.id == (77 & 59)) {
               HandleOption.q((String)this.data, (jJ)this.form);
            } else if (this.id == (47 & 90)) {
               HandleOption.k(this.form.aej);
            } else if (this.id == (107 & 31)) {
               HandleOption.h((String)this.data, this.form.aej);
            } else if (this.id == (61 & 78)) {
               HandleOption.t(5 >> 3, this.form.aej);
            } else if (this.id == (47 & 94)) {
               HandleOption.t(3 & 5, this.form.aej);
            } else {
               if (this.id != (51 & 92)) {
                  if (this.id == (30 & 115)) {
                     HandleOption.s("神兽学习技能", this.form.aej);
                     return;
                  }

                  if (this.id == (23 & 123)) {
                     HandleOption.s("飞升当前参战神兽", this.form.aej);
                     return;
                  }

                  if (this.id == (124 & 23)) {
                     ((jY)this.form.aej.getFormManagement().e(52 & 111)).y(2 & 5);
                     return;
                  }

                  if (this.id == (21 & 127)) {
                     ((jY)this.form.aej.getFormManagement().e(52 & 111)).y(--1);
                     return;
                  }

                  if (this.id == 22) {
                     HandleOption.s("转生当前召唤兽", this.form.aej);
                     return;
                  }

                  if (this.id == 23) {
                     HandleOption.s("点化当前召唤兽", this.form.aej);
                     return;
                  }

                  if (this.id == 24) {
                     HandleOption.s("启灵当前召唤兽", this.form.aej);
                     return;
                  }

                  if (this.id == 25) {
                     HandleOption.j(this.form.aej);
                     return;
                  }

                  if (this.id == 26) {
                     HandleOption.p("我已做好了转生准备", this.form.aej);
                     return;
                  }

                  if (this.id == 27) {
                     HandleOption.p("我想转换种族", this.form.aej);
                     return;
                  }

                  if (this.id == 28) {
                     HandleBangBattle.c((String)this.data, (jJ)this.form);
                     return;
                  }

                  if (this.id == 31) {
                     this.form.ve().a(25);
                     return;
                  }

                  String var5;
                  if (this.id == 32) {
                     var5 = Agreement.getSendTextAES("ganglist", (String)null);
                     this.form.uw().d(var5);
                     return;
                  }

                  if (this.id == 33) {
                     HandleOption.y(this.form.aej);
                     return;
                  }

                  if (this.id == 34) {
                     this.form.ve().a(55);
                     return;
                  }

                  if (this.id == 35) {
                     this.form.ve().a(29);
                     return;
                  }

                  if (this.id == 36) {
                     var5 = Agreement.getSendTextAES("pawnpet", "SHOW");
                     this.form.uw().d(var5);
                     return;
                  }

                  if (this.id == 37) {
                     var5 = Agreement.getSendTextAES("exchange", "J0");
                     this.form.uw().d(var5);
                     return;
                  }

                  if (this.id == 38) {
                     var5 = Agreement.getSendTextAES("exchange", "J1");
                     this.form.uw().d(var5);
                     return;
                  }

                  if (this.id == 39) {
                     var5 = Agreement.getSendTextAES("exchange", "J2");
                     this.form.uw().d(var5);
                     return;
                  }

                  if (this.id == 41) {
                     this.form.aej.aal(new ConfirmBean(83, (String)null, "输入对应CDK"));
                     return;
                  }

                  if (this.id == 42) {
                     var5 = Agreement.getSendTextAES("obtainarticle", (String)null);
                     this.form.uw().d(var5);
                     return;
                  }

                  if (this.id == 44) {
                     if (this.form.aej.roleData.getLoginResult().getGrade() - 279 < 50) {
                        this.form.aej.f("您当前的等级不能下挑战书！！");
                        return;
                     }

                     ((v)this.form.ve().e(66)).ahl(5 >> 3, (PalacePkBean)null);
                     return;
                  }

                  if (this.id == 45) {
                     this.form.ve().a(63);
                     return;
                  }

                  if (this.id == 46) {
                     this.form.ve().a(64);
                     return;
                  }

                  if (this.id == 47) {
                     this.form.ve().a(65);
                     return;
                  }

                  if (this.id == 49) {
                     this.form.ve().a(84);
                     return;
                  }

                  if (this.id == 50) {
                     this.form.ve().a(85);
                     return;
                  }

                  if (this.id == 51) {
                     if (this.form.aej.scene != null && this.form.aej.scene instanceof DNTGScene) {
                        ((DNTGScene)this.form.aej.scene).j();
                        return;
                     }
                  } else {
                     if (this.id == 53) {
                        ((dr)this.form.ve().e(54)).as((Integer)this.data);
                        this.form.ve().a(54);
                        return;
                     }

                     if (this.id == 54) {
                        eC.al(((jJ)this.form).ls(), this.form.aej);
                        return;
                     }

                     if (this.id == 55) {
                        var5 = Agreement.getSendTextAES("teamArena", "O");
                        this.form.uw().d(var5);
                        return;
                     }

                     if (this.id == 56) {
                        var5 = Agreement.getSendTextAES("hjsl", "S");
                        this.form.uw().d(var5);
                        return;
                     }

                     if (this.id == 57) {
                        var5 = Agreement.getSendTextAES("getfivemsg", "QQ");
                        this.form.uw().d(var5);
                        return;
                     }

                     if (this.id == 58) {
                        HandleOption.o((Integer)this.data, (jJ)this.form);
                        return;
                     }

                     if (this.id == 59 || this.id == 61) {
                        if (this.id != 61 && !ParamTool.c(88888888L, this.form.aej)) {
                           this.form.aej.f("金钱不足88888888");
                           return;
                        }

                        RoleData var6;
                        RoleData var10002 = var6 = this.form.vd();
                        var10002.getPkSys().setPk2(5 >> 3);
                        var10002.getLoginResult().setTaskDaily(var6.getPkSys().b());
                        QuoteOutBean var8 = new QuoteOutBean();
                        var8.setData(var6.getLoginResult().getTaskDaily());
                        String var10 = Agreement.getSendTextAES("quoteout", mi.b().toJson(var8));
                        this.form.uw().d(var10);
                        this.form.aej.f("好好做人");
                        return;
                     }

                     if (this.id == 60) {
                        HandleOption.getfight(16, this.form.aej);
                        return;
                     }

                     if (this.id == 62) {
                        HandleOption.e((Integer)this.data, this.form.aej);
                        return;
                     }

                     if (this.id == 63) {
                        HandleOption.f(this.form.aej);
                        return;
                     }

                     if (this.id == 64) {
                        var5 = Agreement.getSendTextAES("gangbattle", (String)this.data);
                        this.form.uw().d(var5);
                        return;
                     }

                     if (this.id == 65) {
                        if (this.form.aej.roleData.getLoginResult().getGrade() < 399) {
                           this.form.aej.f("您当前的等级不能下战书！！");
                           return;
                        }

                        ((v)this.form.ve().e(66)).ahl(--1, (PalacePkBean)null);
                        return;
                     }

                     if (this.id == 66) {
                        this.form.aej.aal(new ConfirmBean(--3, (String)null, "你确定领养一个孩子"));
                        return;
                     }

                     if (this.id == 67) {
                        ((jJ)this.form).d();
                        return;
                     }

                     if (this.id == 68) {
                        HandleOption.i(this.form.aej);
                        return;
                     }

                     int var1;
                     String var2;
                     if (this.id == 69) {
                        var1 = (Integer)this.data;
                        var2 = Agreement.getSendTextAES("activity", var1 + "|I");
                        this.form.uw().d(var2);
                        return;
                     }

                     if (this.id == 70) {
                        var1 = (Integer)this.data;
                        Activity var7;
                        if ((var7 = this.form.vc().aq(var1)) == null) {
                           return;
                        }

                        int var3;
                        ActivityFC var4 = (var3 = hd.an(var7.getActivitySet(), "报名设置=", "|")) > 0 ? this.form.vc().m(var3) : null;
                        ActivityFCEnroll var9 = var4 != null && var4.getType() == --4 ? (ActivityFCEnroll)var4.getData() : null;
                        var4 = var9 != null ? this.form.vc().m(var9.getT1()) : null;
                        this.form.ux().aal(new ConfirmBean(33, String.valueOf(var1), var4 != null ? var4.getValue() : ""));
                        return;
                     }

                     if (this.id == 71) {
                        var1 = (Integer)this.data;
                        var2 = Agreement.getSendTextAES("activity", var1 + "|D");
                        this.form.uw().d(var2);
                     }
                  }
               }

            }
         } else {
            this.form.aej.fw("该功能取消,可在管家处直接领养孩子");
         }
      }
   }

   public fC getForm() {
      return this.form;
   }

   public void cc() {
      RoleData var1;
      List var2;
      if ((var2 = (var1 = this.form.vd()).dataOtherList) == null) {
         this.form.aej.f("出现异常");
      } else {
         int var3 = 0;
         int var4;
         if (this.id == (4 ^ 5) || this.id == (1 ^ 3)) {
            for(int var10000 = var4 = 0; var10000 < var2.size(); var10000 = var4) {
               if (((DataOther)var2.get(var4)).a()) {
                  ++var3;
               }

               ++var4;
            }
         }

         if (this.id == 0) {
            DataOther var8;
            if ((var8 = var1.getDataOther((Long)this.data)) == null || !var8.a()) {
               this.form.aej.f("出现异常方案");
               return;
            }

            int var5 = SkillUtil.getSepciesIndex(var1.getLoginResult().getSpecies_id());
            if (var8.getType() != 0 && var8.getType() != var5) {
               this.form.aej.f("当前方案只可" + SkillUtil.getSepciesNameByIndex(var8.getType()) + "使用");
               return;
            }

            var1.getPrivateData().setSkills("N", var8.getData());
            var1.getRoleProperty().j();
            ParamTool.f(var1.getPrivateData(), this.form.uw());
            var1.getRoleProperty().n();
            this.form.aej.f("切换成功");
            gs var6;
            if ((var6 = (gs)this.form.ve().m(94 & 115)) != null) {
               var6.as(5 >> 1);
               return;
            }
         } else {
            if (this.id == --1) {
               if (var3 >= --5) {
                  this.form.aej.f("当前方案已达上限");
                  return;
               }

               long var7 = var3 == 0 ? 100000000L : (var3 == --1 ? 300000000L : 500000000L);
               this.form.aej.aal(new ConfirmBean(63 & 102, String.valueOf(var3), "你是否消耗" + var7 / 10000L + "W大话币建立一个天演策加点方案"));
               return;
            }

            if (this.id == --2) {
               if (var3 <= 0) {
                  this.form.aej.f("你没有保存权限");
                  return;
               }

               ((jJ)this.form.ve().e(59 & 95)).dg();
               return;
            }

            if (this.id == --3) {
               this.form.aej.aal(new ConfirmBean(63 & 103, String.valueOf(this.data), "你确定是否覆盖当前方案,并且为新方案命名"));
            }
         }

      }
   }

   public void yc(int var1, int var2, Object var3, String var4, int var5) {
      this.type = var1;
      this.id = var2;
      this.data = var3;
      this.setTextSize("#G" + var4, 8691 & 24526);
   }

   public void mouseExited(MouseEvent var1) {
      this.sectionList.set(3 >> 2, Color.green);
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void mouseClicked(MouseEvent var1) {
   }


   private void q() {
      jJ var1;
      fa var2;
      if ((var2 = (var1 = (jJ)this.form).ls()) != null && var2 instanceof lP) {
         this.lu((lP)var2);
      } else {
         String var4 = (String)this.data;
         NpcInfoBean var3;
         if ((var3 = this.form.vc().ck(String.valueOf(var1.lj()))) != null && !hd.o(var3.getNpctable().getNpcway())) {
            yb(0, 0, var4, var3.getNpctable().getNpcway(), this.form.aej);
         }
      }
   }

   public Object getData() {
      return this.data;
   }

   public void mousePressed(MouseEvent var1) {
      this.form.ve().n(this.form.ae());
      if (!var1.isMetaDown()) {
         this.s();
      }
   }

   public int getId() {
      return this.id;
   }
}
