package com.xy;

import com.xy.bean.ChangeRoleNameBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.bean.SuitOperBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.DataOther;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.formula.RoleGradeBorn;
import com.xy.formula.RoleSkill;
import com.xy.formula.SkillUtil;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Class573 extends Class345 {
   private ConfirmBean ajv;
   private LinkedList<ConfirmBean> ajw;
   private Class322 az;
   private RichLabel bw;
   private Class217 ajx;
   private Class322 sa;


   private void aak(boolean var1, ConfirmBean var2) {
      if (var1) {
         if (!this.ux().t()) {
            String var6;
            if ((var6 = var2.getValue()).indexOf("|") == -4 >> 2) {
               Goodstable var8;
               if ((var8 = this.vd().getGood(new BigDecimal(var6))) != null) {
                  if (var8.getGoodlock() == 3 >> 1) {
                     this.aej.fw("该物品已加锁，不可丢弃。。");
                  } else if (GoodType.ai(var8.getType()) != -4 >> 2 && GoodType.getExtra(var8.getValue(), GoodType.Extras[--4]) != null) {
                     this.aej.f("已镶嵌宝石无法丢弃");
                  } else {
                     int var10001 = 3 & 5;
                     var8.setUsetime(3 & 4);
                     this.vd().h(var8.getRgid());
                     ParamTool.g(var8, var10001, this.uw());
                  }
               }
            } else {
               ArrayList var7 = new ArrayList();
               int var10000 = 2 & 5;
               int var4 = 3 >> 2;

               int var3;
               for(var10000 = var3 = 3 >> 2; var10000 < var6.length(); var10000 = var3) {
                  if ((var3 = var6.indexOf("|", var4 + (3 >> 1))) == -4 >> 2) {
                     var3 = var6.length();
                  }

                  Goodstable var5;
                  if ((var5 = this.vd().getGood(new BigDecimal(Class394.q(var6, var4, var3)))) == null) {
                     var10000 = var3;
                  } else if (var5.getGoodlock() == --1) {
                     var10000 = var3;
                     this.aej.fw("该物品已加锁，不可丢弃。。");
                  } else if (GoodType.ai(var5.getType()) != -4 >> 2 && GoodType.getExtra(var5.getValue(), GoodType.Extras[--4]) != null) {
                     var10000 = var3;
                     this.aej.f("已镶嵌宝石无法丢弃");
                  } else {
                     var5.setUsetime(3 ^ 3);
                     var10000 = var3;
                     this.vd().h(var5.getRgid());
                     var7.add(var5);
                  }

                  var4 = var10000 + 1;
               }

               if (var7.size() != 0) {
                  ParamTool.a(var7, --1, this.uw());
               }

            }
         }
      }
   }

   public void aal(ConfirmBean var1) {
      synchronized(this) {
         this.ajw.add(var1);
         if (this.ajv == null) {
            this.d();
         }
      }
   }


   private void aam(boolean var1, ConfirmBean var2) {
      if (var1) {
         RoleData var8 = this.vd();
         String var6;
         if (Class394.o(var6 = this.ajx.getText().trim())) {
            this.aej.fw("输入不能为空");
         } else if (var8.teamBean != null) {
            this.aej.fw("组队状态下不能使用改名卡");
         } else if (var6.equals(var8.getLoginResult().getRolename())) {
            this.aej.fw("修改后的名字不能和自己重复");
         } else if (!Class27.i(var6)) {
            this.aej.fw("修改后的名字不能有特殊符号");
         } else if (!Class27.c(var6)) {
            this.aej.fw("名称中包含非法字符！！");
         } else {
            int var4 = 0;
            char[] var5 = var6.toCharArray();

            int var3;
            for(int var10000 = var3 = 3 >> 2; var10000 < var5.length; var10000 = var3) {
               if (String.valueOf(var5[var3]).getBytes().length == 3 >> 1) {
                  ++var4;
               } else {
                  var4 += 2;
               }

               ++var3;
            }

            if (var4 > (94 & 47)) {
               this.aej.fw("名称太长");
            } else if (var2.getValue() == null) {
               if (this.aej.getClient().n(5 >> 1, 12 & 127)) {
                  if (var8.getLoginResult().getMoney() < (127 & 30)) {
                     this.aej.fw("积分不足30");
                     return;
                  }

                  ChangeRoleNameBean var11 = new ChangeRoleNameBean();
                  var11.setOldName(var8.getLoginResult().getRolename());
                  var11.setNewName(var6);
                  String var12 = Agreement.getSendTextAES("changerolename", Class695.b().toJson(var11));
                  this.uw().d(var12);
               }

            } else {
               Goodstable var10;
               if ((var10 = var8.getGood(new BigDecimal(var2.getValue()))) != null) {
                  ChangeRoleNameBean var7 = new ChangeRoleNameBean();
                  var7.setOldName(var8.getLoginResult().getRolename());
                  var7.setNewName(var6);
                  var7.setRgid(var10.getRgid());
                  String var9 = Agreement.getSendTextAES("changerolename", Class695.b().toJson(var7));
                  this.uw().d(var9);
               }
            }
         }
      }
   }


   private void aan(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3;
         if (!Class394.i(var3 = this.ajx.getText().trim())) {
            this.aej.fw("请输入数字");
         } else {
            var3 = Agreement.getSendTextAES("hjsl", "Z|" + var3);
            this.uw().d(var3);
         }
      }
   }


   private void aao(boolean var1, ConfirmBean var2) {
      if (var1) {
         if (var2.getType() == (47 & 94)) {
            int var7;
            if ((var7 = var2.getValue().indexOf("|")) == -4 >> 2) {
               var7 = var2.getValue().length();
            }

            BigDecimal var3 = new BigDecimal(Class394.q(var2.getValue(), 3 >> 2, var7));
            RoleData var4;
            Mount var8;
            if ((var8 = (var4 = this.vd()).getMount(var3)) == null) {
               return;
            }

            if (var2.getType() == (47 & 94)) {
               if (var4.getLoginResult().getMount_id() == var8.getMountid()) {
                  this.aej.fw("您的坐骑还被您骑着呢！");
                  return;
               }

               if (var8.getSid() != null || var8.getOthrersid() != null || var8.getSid3() != null) {
                  this.aej.fw("您的坐骑管制着召唤兽呢！");
                  return;
               }

               String var5 = Agreement.getSendTextAES("mountrelease", "" + var8.getMid());
               this.uw().d(var5);
               var4.mounts.remove(var8);
               if (!this.aej.getClient().gameMount) {
                  Class199 var10;
                  if ((var10 = (Class199)this.aej.getFormManagement().m(31 & 103)) != null) {
                     var10.o();
                     return;
                  }

                  this.aej.getFormManagement().n(94 & 53);
                  return;
               }

               Class329 var9;
               if ((var9 = (Class329)this.aej.getFormManagement().m(21932 & 11007)) == null || !var9.bl()) {
                  this.aej.getFormManagement().n(28 & 119);
                  return;
               }
            }
         } else if (var2.getType() == (121 & 38)) {
            String var6 = Agreement.getSendTextAES("usermount", var2.getValue());
            this.aej.getClient().d(var6);
         }

      }
   }

   public boolean aap(ConfirmBean var1) {
      return (boolean)(var1.getType() != (123 & 85) && var1.getType() != (119 & 90) && var1.getType() != (91 & 119) && var1.getType() != (119 & 92) && var1.getType() != (93 & 119) && var1.getType() != (126 & 87) && var1.getType() != (39 & 121) && var1.getType() != (103 & 59) && var1.getType() != (55 & 111) ? 3 >> 2 : 1);
   }


   private void aaq(boolean var1, ConfirmBean var2) {
      if (var1) {
         RoleData var11 = this.vd();
         Lingbao var3;
         int var13;
         List var16;
         Class136[] var10001;
         boolean var10003;
         if (var2.getType() == --5) {
            if ((var3 = var11.getLingbao(new BigDecimal(var2.getValue()))) != null && !var3.getBaotype().equals("法宝")) {
               if ((var13 = var3.i(--4)) != -4 >> 2) {
                  var10001 = new Class136[4 ^ 5];
                  var10003 = true;
                  var10001[3 & 4] = new Class136(10079L, (long)(var13 * (125 & 10)));
                  if ((var16 = var11.aa(var10001)) == null) {
                     this.aej.fw("不够" + var13 * (43 & 92) + "个灵宝天威印");
                  } else {
                     var11.ah(var16);
                     var3.e((boolean)(3 >> 1));
                     ParamTool.i(var3, this.uw());
                     var11.getRoleProperty().h(var3);
                  }
               }
            }
         } else if (var2.getType() == (127 & 6)) {
            if ((var3 = var11.getLingbao(new BigDecimal(var2.getValue()))) != null && !var3.getBaotype().equals("法宝")) {
               if ((var13 = var3.b(--4)) != -4 >> 2) {
                  if ((var13 - (5 >> 1)) * (95 & 62) + (3 & 5) <= var3.getLingbaolvl().intValue()) {
                     if (var13 < --4 || var3.getBaoquality().equals("无价") || var3.getBaoquality().equals("传世")) {
                        var10001 = new Class136[--1];
                        var10003 = true;
                        var10001[3 >> 2] = new Class136(10079L, (long)(var13 * (47 & 88)));
                        if ((var16 = var11.aa(var10001)) == null) {
                           this.aej.fw("不够" + var13 * (123 & 12) + "个灵宝天威印");
                        } else {
                           var11.ah(var16);
                           var3.e((boolean)(3 & 4));
                           ParamTool.i(var3, this.uw());
                           var11.getRoleProperty().h(var3);
                        }
                     }
                  }
               }
            }
         } else {
            if (var2.getType() == (7 & 127)) {
               int var12 = var2.getValue().indexOf("|");
               BigDecimal var14 = new BigDecimal(var2.getValue().substring(3 ^ 3, var12));
               String var15 = var2.getValue().substring(var12 + (5 >> 2));
               Lingbao var17;
               if ((var17 = var11.getLingbao(var14)) == null || var17.getBaotype().equals("法宝")) {
                  return;
               }

               if (ParamTool.c((long)(this.uw().n(1 ^ 3, 93 & 46) ? 100000 : 800000), this.aej)) {
                  var17.setSkills(Class394.c(var17.getSkills(), var15, 2 & 5));
                  ParamTool.i(var17, this.uw());
                  var11.getRoleProperty().h(var17);
                  return;
               }
            } else if (var2.getType() == (57 & 78)) {
               if ((var3 = var11.getLingbao(new BigDecimal(var2.getValue()))) == null || var3.getBaotype().equals("法宝")) {
                  return;
               }

               if (!Class394.o(var3.getFushis())) {
                  this.aej.fw("删除前先卸下符石");
                  return;
               }

               if (var3.getEquipment() == 3 >> 1) {
                  this.aej.fw("还处于装备状态");
                  return;
               }

               var11.l(var3);
               Class31 var4;
               if ((var4 = (Class31)this.aej.getFormManagement().m(43 & 127)) != null) {
                  var4.mj((Lingbao)null);
                  return;
               }
            } else {
               if (var2.getType() == (111 & 25)) {
                  if ((var3 = var11.getLingbao(new BigDecimal(var2.getValue()))) == null) {
                     return;
                  }

                  int var5 = (var13 = var3.getLingbaolvl().intValue()) / --5;
                  var10001 = new Class136[4 ^ 5];
                  var10003 = true;
                  var10001[3 & 4] = new Class136(10079L, (long)var5);
                  List var6;
                  if ((var6 = var11.aa(var10001)) == null) {
                     this.aej.fw("不够" + var5 + "个灵宝天威印");
                     return;
                  }

                  var11.ah(var6);
                  long var7 = var3.getLingbaoexe().longValue();
                  long var9 = ExpUtil.c(var13);
                  long var10005 = var7 - var9;
                  ++var13;
                  var7 = var10005;
                  var3.setLingbaolvl(new BigDecimal(var13));
                  var3.setLingbaoexe(new BigDecimal(var7));
                  ParamTool.i(var3, this.uw());
                  var11.getRoleProperty().h(var3);
                  return;
               }

               if (var2.getType() == (47 & 90)) {
                  if ((var3 = var11.getLingbao(new BigDecimal(var2.getValue()))) == null) {
                     return;
                  }

                  if (ParamTool.c(200000L, this.aej)) {
                     if (var3.getEquipment() == --1) {
                        var11.getRoleProperty().s(var3.getKangxing(), (boolean)(3 >> 2));
                     }

                     var3.setKangxing(MsgUntil.j(var3.getLingbaolvl().intValue(), this.aej.getClient()));
                     if (var3.getEquipment() == --1) {
                        var11.getRoleProperty().s(var3.getKangxing(), (boolean)(--1));
                     }

                     ParamTool.i(var3, this.uw());
                     var11.getRoleProperty().h(var3);
                  }
               }
            }

         }
      }
   }


   private void aar(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3 = Agreement.getSendTextAES("taskN", var2.getValue());
         this.uw().d(var3);
      }
   }


   private void aas(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3;
         if (Class394.o(var3 = this.ajx.getText().trim())) {
            this.aej.fw("输入不能为空");
         } else {
            var3 = Agreement.getSendTextAES("user", var2.getValue() + "|" + var3);
            this.uw().d(var3);
         }
      }
   }

   public String aat(ConfirmBean var1) {
      if (var1.getType() == (123 & 85)) {
         return "修改";
      } else if (var1.getType() == (122 & 87)) {
         return "修正";
      } else if (var1.getType() == (95 & 115)) {
         return "兑换";
      } else if (var1.getType() == (87 & 124)) {
         return "解禁";
      } else if (var1.getType() == (119 & 93)) {
         return "解封";
      } else {
         return var1.getType() == (87 & 126) ? "招募" : "确定";
      }
   }

   public void d() {
      synchronized(this) {
         this.ajv = this.ajw.size() != 0 ? (ConfirmBean)this.ajw.removeFirst() : null;
         if (this.ajv == null) {
            this.ve().n(this.ae());
         } else {
            int var10002 = -4 >> 2;
            this.bw.setTextSize(this.ajv.getMSG(), 6126 & 27135);
            this.ajx.setText((String)null);
            this.ajx.setVisible(this.aap(this.ajv));
            this.ajx.setBounds(93 & 55, this.bw.getY() + this.bw.getHeight() + --5, 29167 & 4094, 86 & 61);
            this.az.setText(this.aat(this.ajv));
            this.az.setBounds(91 & 101, this.bw.getY() + this.bw.getHeight() + (109 & 63), 59 & 127, 95 & 57);
            this.sa.setBounds(5111 & 28031, this.bw.getY() + this.bw.getHeight() + (63 & 109), 59 & 127, 27 & 125);
            this.vf(var10002, 3 ^ 3, 21205 & 12094, this.az.getY() + (50 & 127));
            if (!this.isVisible()) {
               this.ve().a(this.ae());
            }

            if (this.ajx.isVisible() && this.aej.isVisible() && this.aej.gameFrame.isFocused()) {
               this.ajx.requestFocus();
            }

         }
      }
   }


   private void aau(boolean var1, ConfirmBean var2) {
      String var3;
      if (var2.getType() == (121 & 126)) {
         if (!var1) {
            var2.setValue("-" + var2.getValue());
         }

         var3 = Agreement.getSendTextAES("confirm", Class695.b().toJson(var2));
         this.uw().d(var3);
      } else if (var2.getType() == (123 & 126)) {
         if (!var1) {
            var2.setValue("-" + var2.getValue());
         }

         var3 = Agreement.getSendTextAES("confirm", Class695.b().toJson(var2));
         this.uw().d(var3);
      } else if (var1) {
         if (var2.getType() == (55 & 109)) {
            this.uw().d(var2.getValue());
         } else if (var2.getType() == (103 & 62)) {
            var3 = Agreement.getSendTextAES("rolechange", "AB" + var2.getValue());
            this.uw().d(var3);
         } else if (var2.getType() == (55 & 111)) {
            if (Class394.o(var3 = this.ajx.getText().trim())) {
               this.aej.fw("输入不能为空");
            } else if (var3.length() >= (75 & 116)) {
               this.aej.fw("方案名称过长");
            } else {
               DataOther var4;
               RoleData var6;
               if ((var4 = (var6 = this.vd()).getDataOther(Long.parseLong(var2.getValue()))) != null && var4.a()) {
                  String var5 = var6.getPrivateData().a("N");
                  var4.setType(!Class394.o(var5) ? SkillUtil.getSepciesIndex(var6.getLoginResult().getSpecies_id()) : 0);
                  var4.setKey(var3);
                  var4.setData(var5);
                  String var7 = Agreement.getSendTextAES("rolechange", "AC" + Class695.b().toJson(var4));
                  this.uw().d(var7);
               } else {
                  this.aej.fw("出现异常方案");
               }
            }
         } else {
            var3 = Agreement.getSendTextAES("confirm", Class695.b().toJson(var2));
            this.uw().d(var3);
         }
      }
   }


   private void aav(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var8;
         if (var2.getType() == (125 & 15)) {
            var8 = Agreement.getSendTextAES("userpet", var2.getValue());
            this.uw().d(var8);
         } else if (var2.getType() == (95 & 63)) {
            var8 = Agreement.getSendTextAES("userpet", var2.getValue());
            this.uw().d(var8);
         } else {
            int var6;
            if ((var6 = var2.getValue().indexOf("|")) == -4 >> 2) {
               var6 = var2.getValue().length();
            }

            RoleData var3;
            RoleSummoning var4;
            RolePet var7;
            if ((var4 = (var7 = (var3 = this.vd()).getRolePet(Class394.q(var2.getValue(), 5 >> 3, var6))).getPet()) != null) {
               String var5;
               if (var2.getType() == (31 & 107)) {
                  if (var4.getPetlock() == --1) {
                     this.aej.fw("该召唤兽已加锁,不能放生");
                  } else if (var4.getGoods() != null) {
                     this.aej.fw("该召唤兽携带着装备或内丹");
                  } else if (var3.getPetMount(var4.getSid()) != null) {
                     this.aej.fw("这只召唤兽被管制中，不可放生！！！");
                  } else if (var3.getLoginResult().getSummoning_id() != null && var3.getLoginResult().getSummoning_id().compareTo(var4.getSid()) == 0) {
                     this.aej.fw("这只召唤兽已在参战中！！！");
                  } else {
                     var3.pets.remove(var7);
                     var5 = Agreement.getSendTextAES("petrelease", var2.getValue());
                     this.uw().d(var5);
                  }
               } else {
                  if (var2.getType() == (95 & 44)) {
                     var5 = Agreement.getSendTextAES("userpet", "PS|" + var2.getValue());
                     this.uw().d(var5);
                  }

               }
            }
         }
      }
   }

   public Class573(GameView var1) {
      int var10009 = -4 >> 2;
      super(125 & 106, --3, Class345.aef, var1);
      this.va(var10009, 3 >> 2, 32606 & 693, 1533 & 31383, Class345.aei);
      this.fx("sc/d/26.png");
      this.ajw = new LinkedList();
      this.bw = Class271.l("", Class681.ce, 4565 & 28586);
      this.bw.setBounds(31 & 117, 127 & 25, 8175 & 25086, 118 & 29);
      this.add(this.bw);
      this.ajx = Class133.n(Class511.q("sc/d/17.png", 87 & 46, 87 & 46, 87 & 46, 87 & 46, (boolean)(3 & 4)), Class681.ce, Color.white);
      this.ajx.setBounds(63 & 85, 63 & 114, 31742 & 1519, 119 & 28);
      this.add(this.ajx);
      this.az = new Class322("sc/e/7.png", --1, 111 & 126, Class681.ak, Class681.c, "确定", this);
      this.sa = new Class322("sc/e/7.png", 3 >> 1, 111 & 127, Class681.ak, Class681.c, "取消", this);
      this.az.setBounds(99 & 93, 102, 59, 25);
      this.sa.setBounds(375, 102, 59, 25);
      this.add(this.az);
      this.add(this.sa);
   }


   private void aaw(boolean var1, ConfirmBean var2) {
      if (var1) {
         if (var2.getType() == (95 & 47)) {
            if (ParamTool.c(Long.parseLong(var2.getValue()), this.aej)) {
               RoleData var10000 = this.vd();
               var10000.getPrivateData().setSkills("N", (String)null);
               var10000.getPrivateData().setSkills("T", (String)null);
               var10000.getRoleProperty().j();
               ParamTool.f(var10000.getPrivateData(), this.uw());
               var10000.getRoleProperty().n();
               Class371 var3;
               if ((var3 = (Class371)this.ve().m(90 & 119)) != null) {
                  var3.as(1 ^ 3);
                  return;
               }
            }
         } else if (var2.getType() == (116 & 27)) {
            if (this.vd().getLoginResult().getGold().compareTo(new BigDecimal(500000)) < 0) {
               this.aej.f("金钱不足");
               return;
            }

            String var4 = Agreement.getSendTextAES("rolechange", var2.getValue());
            this.uw().d(var4);
         }

      }
   }


   private void aax(boolean var1, ConfirmBean var2) {
      if (var1) {
         RoleData var12 = this.vd();
         if (var2.getType() == (30 & 115)) {
            Class347 var28;
            if ((var28 = (Class347)this.ve().m(119 & 93)) != null && var28.e() == (1 ^ 3)) {
               var28.r((boolean)(--1));
               return;
            }
         } else {
            int var13;
            if (var2.getType() == (83 & 63)) {
               var13 = var2.getValue().indexOf("|");
               BigDecimal var21 = new BigDecimal(Class394.q(var2.getValue(), 3 & 4, var13));
               BigDecimal var22 = new BigDecimal(Class394.q(var2.getValue(), var13 + (3 & 5), var2.getValue().length()));
               Goodstable var23 = var12.getGood(var21);
               Goodstable var25 = var12.getGood(var22);
               if (var23 != null && var25 != null && var21.compareTo(var22) != 0) {
                  if (!GoodType.ab(var25.getType())) {
                     return;
                  }

                  if (var23.getGoodlock() == (3 & 5)) {
                     this.aej.fw("该物品已被加锁");
                     return;
                  }

                  if (var25.getGoodlock() == 5 >> 2) {
                     this.aej.fw("该物品已被加锁");
                     return;
                  }

                  if (var25.getStatus() == 0) {
                     return;
                  }

                  int var8 = MsgUntil.getGoodLvl(var25.getValue());
                  BigDecimal var27 = new BigDecimal(3200000 * var8);
                  if (var12.getLoginResult().getGold().longValue() < var27.longValue()) {
                     this.aej.fw("金钱不足");
                     return;
                  }

                  if (!var12.i(var25)) {
                     this.aej.fw("背包已满");
                     return;
                  }

                  var25.setStatus(2 & 5);
                  ArrayList var9;
                  (var9 = new ArrayList()).add(var21);
                  var9.add(var22);
                  var12.getLoginResult().setGold(var12.getLoginResult().getGold().subtract(var27));
                  SuitOperBean var29 = new SuitOperBean();
                  var29.setType(63 & 84);
                  var29.setGoods(var9);
                  String var30 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var29));
                  this.uw().d(var30);
                  return;
               }

               return;
            }

            String var3;
            if (var2.getType() == (87 & 61)) {
               var3 = Agreement.getSendTextAES("TransState", "1|" + var2.getValue());
               this.uw().d(var3);
               return;
            }

            String var5;
            if (var2.getType() == (86 & 63)) {
               Class595 var26;
               Class250 var20 = (var26 = (Class595)this.aej.getFormManagement().e(63 & 125)).e() == 3 >> 1 ? var26.zl() : null;
               var5 = var20 != null ? var20.yo() : null;
               if (var5 != null && (var5.equals("仙器分解") || var5.equals("守护石分解"))) {
                  var20.ij((boolean)(3 & 5));
                  return;
               }
            } else {
               if (var2.getType() == (23 & 127)) {
                  var3 = Agreement.getSendTextAES("userpal", "C" + var2.getValue());
                  this.uw().d(var3);
                  return;
               }

               if (var2.getType() == (95 & 56)) {
                  Class573 var10000;
                  label153: {
                     try {
                        RoleShow var24 = this.aej.roleUnit.r;
                        LoginResult var19 = this.aej.roleData.getLoginResult();
                        var19.setGang_id(new BigDecimal(5 >> 3));
                        var19.setGangname("");
                        var19.setGangpost("");
                        var19.setAchievement(new BigDecimal(3 >> 2));
                        var19.setResistance("主-|副-");
                        var24.setGang_id(var19.getGang_id());
                        var24.setGangname(var19.getGangname());
                        var12.getRoleProperty().q();
                        var5 = Agreement.getSendTextAES("gangretreat", (String)null);
                        this.uw().d(var5);
                     } catch (Exception var11) {
                        var10000 = this;
                        var11.printStackTrace();
                        break label153;
                     }

                     var10000 = this;
                  }

                  var10000.ve().n(48 & 127);
                  return;
               }

               if (var2.getType() == (93 & 59)) {
                  var3 = Agreement.getSendTextAES("gangchange", var2.getValue());
                  this.uw().d(var3);
                  this.ve().n(56 & 119);
                  return;
               }

               if (var2.getType() == (31 & 122)) {
                  var3 = Agreement.getSendTextAES("gangshot", var2.getValue());
                  this.uw().d(var3);
                  Class490 var4;
                  if ((var4 = (Class490)this.ve().m(120 & 55)) != null) {
                     var4.bk(new BigDecimal(var2.getValue()));
                     return;
                  }
               } else {
                  if (var2.getType() == (124 & 31)) {
                     var13 = var2.getValue().indexOf("|");
                     int var17 = var2.getValue().indexOf("|", var13 + (3 & 5));
                     MapModel var18;
                     if ((var18 = this.vc().ay(var2.getValue().substring(5 >> 3, var13))) == null) {
                        return;
                     }

                     int var6 = Class394.b(var2.getValue(), var13 + --1, var17);
                     int var7 = Class394.b(var2.getValue(), var17 + (2 ^ 3), var2.getValue().length());
                     HandleOption.n(var18, var6, var7, this.aej, (boolean)(--1));
                     return;
                  }

                  if (var2.getType() == (95 & 61)) {
                     var3 = Agreement.getSendTextAES("exchange", var2.getValue());
                     this.uw().d(var3);
                     return;
                  }

                  if (var2.getType() == 87) {
                     var3 = Agreement.getSendTextAES("Chongjipacksure", var2.getValue());
                     this.uw().d(var3);
                     return;
                  }

                  if (var2.getType() == 88) {
                     var3 = Agreement.getSendTextAES("activity", var2.getValue());
                     this.uw().d(var3);
                     return;
                  }

                  if (var2.getType() == 89) {
                     var3 = Agreement.getSendTextAES("racialtransformation", var2.getValue());
                     this.uw().d(var3);
                     return;
                  }

                  String var15;
                  if (var2.getType() == 33) {
                     if (Class394.o(var3 = this.ajx.getText())) {
                        this.aej.f("队伍名称不能为空");
                        return;
                     }

                     if (!Class27.i(var3)) {
                        this.aej.fw("队伍名称不能有特殊符号");
                        return;
                     }

                     if (!Class27.c(var3)) {
                        this.aej.fw("队伍名称中包含非法字符！！");
                        return;
                     }

                     if (var3.length() > --5) {
                        this.aej.fw("队伍名称最多5个字符");
                        return;
                     }

                     var15 = Agreement.getSendTextAES("activity", var2.getValue() + "|E" + var3);
                     this.uw().d(var15);
                     return;
                  }

                  if (var2.getType() == 34) {
                     UseCardBean var14;
                     if ((var14 = var12.getLimit("靓号")) == null) {
                        this.aej.fw("你没有靓号");
                        return;
                     }

                     var12.ag("靓号");
                     StringBuffer var16;
                     (var16 = new StringBuffer("T")).append(var14.getType());
                     var5 = Agreement.getSendTextAES("usercard", var16.toString());
                     this.aej.getClient().d(var5);
                     this.ve().n(183);
                     this.ve().n(184);
                     this.ve().n(185);
                     return;
                  }

                  if (var2.getType() == 35) {
                     var13 = 3 ^ 3;

                     try {
                        var13 = Integer.parseInt(this.ajx.getText());
                     } catch (Exception var10) {
                        this.aej.fw("只能填数字");
                        return;
                     }

                     var15 = Agreement.getSendTextAES("BEAU", "B2" + var13);
                     this.uw().d(var15);
                     return;
                  }

                  if (var2.getType() == 36) {
                     var3 = Agreement.getSendTextAES("user", var2.getValue());
                     this.uw().d(var3);
                  }
               }
            }
         }

      }
   }


   private void aay(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3;
         if (!Class394.i(var3 = this.ajx.getText().trim())) {
            this.aej.fw("请输入数字");
         } else {
            var3 = Agreement.getSendTextAES("user", var2.getValue() + "|" + var3);
            this.uw().d(var3);
         }
      }
   }


   private void aaz(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3;
         if (Class394.o(var3 = this.ajx.getText().trim())) {
            this.aej.fw("输入不能为空");
         } else {
            var3 = Agreement.getSendTextAES("exchangegoods", var3);
            this.uw().d(var3);
         }
      }
   }

   public void r(boolean var1) {
      Class573 var10000;
      if (this.ajv.getType() == --1) {
         var10000 = this;
         this.aak(var1, this.ajv);
      } else if (this.ajv.getType() == --2) {
         var10000 = this;
         this.abc(var1, this.ajv);
      } else if (this.ajv.getType() == (62 & 85)) {
         var10000 = this;
         this.abc(var1, this.ajv);
      } else if (this.ajv.getType() == --3) {
         var10000 = this;
         this.aba(var1, this.ajv);
      } else if (this.ajv.getType() == --4) {
         var10000 = this;
         this.aba(var1, this.ajv);
      } else if (this.ajv.getType() == (31 & 126)) {
         var10000 = this;
         this.aba(var1, this.ajv);
      } else if (this.ajv.getType() != --5 && this.ajv.getType() != (55 & 78) && this.ajv.getType() != (63 & 71) && this.ajv.getType() != (58 & 77) && this.ajv.getType() != (11 & 125) && this.ajv.getType() != (95 & 42)) {
         if (this.ajv.getType() != (123 & 15) && this.ajv.getType() != (92 & 47) && this.ajv.getType() != (61 & 79) && this.ajv.getType() != (95 & 63)) {
            if (this.ajv.getType() != (63 & 78) && this.ajv.getType() != (100 & 59)) {
               if (this.ajv.getType() == (15 & 127)) {
                  var10000 = this;
                  this.aaw(var1, this.ajv);
               } else if (this.ajv.getType() == (119 & 24)) {
                  var10000 = this;
                  this.aaw(var1, this.ajv);
               } else if (this.ajv.getType() == (95 & 49)) {
                  var10000 = this;
                  this.aar(var1, this.ajv);
               } else if (this.ajv.getType() == 18) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 19) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 21) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 22) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 23) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 24) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 25) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 26) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 28) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 29) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 87) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 88) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 89) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 33) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 34) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 35) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 36) {
                  var10000 = this;
                  this.aax(var1, this.ajv);
               } else if (this.ajv.getType() == 27) {
                  var10000 = this;
                  this.aej.gameFrame.ng(this.aej);
               } else if (this.ajv.getType() == 81) {
                  var10000 = this;
                  this.aam(var1, this.ajv);
               } else if (this.ajv.getType() == 82) {
                  var10000 = this;
                  this.abb(var1, this.ajv);
               } else if (this.ajv.getType() == 83) {
                  var10000 = this;
                  this.aaz(var1, this.ajv);
               } else if (this.ajv.getType() == 84) {
                  var10000 = this;
                  this.aay(var1, this.ajv);
               } else if (this.ajv.getType() == 85) {
                  var10000 = this;
                  this.aas(var1, this.ajv);
               } else if (this.ajv.getType() == 86) {
                  var10000 = this;
                  this.aan(var1, this.ajv);
               } else {
                  var10000 = this;
                  this.aau(var1, this.ajv);
               }
            } else {
               var10000 = this;
               this.aao(var1, this.ajv);
            }
         } else {
            var10000 = this;
            this.aav(var1, this.ajv);
         }
      } else {
         var10000 = this;
         this.aaq(var1, this.ajv);
      }

      var10000.d();
   }

   public boolean t() {
      if (this.ajv != null) {
         this.d();
      }

      return super.t();
   }


   private void aba(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var6;
         if (var2.getType() == --3) {
            if (this.vd().getBabys().size() >= (15 & 118)) {
               this.ux().f("最多抚养6个孩子");
            } else {
               var6 = Agreement.getSendTextAES("babycustoday", "yes");
               this.uw().d(var6);
            }
         } else {
            if (var2.getType() != --4 && var2.getType() == (95 & 62)) {
               int var4 = var2.getValue().indexOf("|");
               Baby var3 = this.vd().getBaby(new BigDecimal(Class394.q(var2.getValue(), 2 & 5, var4)));
               Goodstable var5 = this.vd().getGood(new BigDecimal(Class394.q(var2.getValue(), var4 + --1, var2.getValue().length())));
               if (var3 == null || var5 == null || var5.getType() != 53L) {
                  return;
               }

               var6 = Agreement.getSendTextAES("userbaby", var5.getRgid() + "|" + var3.getBabyid());
               this.uw().d(var6);
            }

         }
      }
   }


   private void abb(boolean var1, ConfirmBean var2) {
      if (var1) {
         RoleData var6;
         LoginResult var4 = (var6 = this.vd()).getLoginResult();
         String[] var3;
         if ((var3 = this.ajx.getText().trim().split("-")).length <= var4.getTurnAround() && var3.length <= --3) {
            int[] var10;
            if ((var10 = RoleGradeBorn.getbz(var3)) == null) {
               this.aej.fw("输入格式有误");
            } else {
               String var9 = null;

               int var5;
               for(int var10000 = var5 = 5 >> 3; var10000 < var10.length; var10000 = var5) {
                  String[] var12 = RoleSkill.getRoleSkill().getAllSkill(var10[var5], var5 * (24477 & 13290) + (16377 & 26390));
                  ++var5;
                  var9 = RoleGradeBorn.d(var12, var9);
               }

               RoleData var13;
               label56: {
                  String var11;
                  if ((var11 = Class394.d(var6.getPrivateData().getBorn(), "双属性&", "|")) != null) {
                     var11 = "双属性&" + var11;
                     if (var9 == null || var9.length() == 0) {
                        var9 = var11;
                        var13 = var6;
                        break label56;
                     }

                     var9 = var9 + "|" + var11;
                  }

                  var13 = var6;
               }

               Goodstable var8;
               if ((var8 = var13.getGood(new BigDecimal(var2.getValue()))) != null) {
                  var8.ab(5 >> 2);
                  if (var8.getUsetime() <= 0) {
                     var6.h(var8.getRgid());
                  }

                  ParamTool.g(var8, --1, this.uw());
                  PrivateData var7 = var6.getPrivateData();
                  var7.setBorn(var9);
                  ParamTool.f(var7, this.uw());
                  var6.getRoleProperty().ab((String[])null, var9);
                  this.aej.fw("更改修正成功");
               }
            }
         } else {
            this.aej.fw("只能输入于自身相同的转生次数");
         }
      }
   }


   private void abc(boolean var1, ConfirmBean var2) {
      if (var1) {
         Goodstable var6;
         if ((var6 = this.vd().getGood(new BigDecimal(var2.getValue()))) != null && var6.getType() == 520L) {
            if (!this.ux().t()) {
               RoleData var3 = this.vd();
               if (var2.getType() == (86 & 61)) {
                  SuitOperBean var7 = new SuitOperBean();
                  ArrayList var8;
                  (var8 = new ArrayList()).add(var6.getRgid());
                  int var10003 = 122 & 63;
                  var7.setGoods(var8);
                  var7.setType(var10003);
                  String var5 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var7));
                  this.uw().d(var5);
               } else if (var6.getStatus() == 5 >> 2) {
                  this.ux().f("已参战星卡无法取出");
               } else {
                  Goodstable var10000;
                  if (var6.getStatus() == 0) {
                     var10000 = var6;
                     var3.h(var6.getRgid());
                     var6.setStatus(--4);
                     var3.ao(var6);
                  } else {
                     if (var6.getStatus() == --4) {
                        if (var3.getGoodPackSum(var6.getType(), var6.getGoodsid(), 4 ^ 5) <= 0) {
                           this.ux().f("背包格数不足");
                           return;
                        }

                        var3.h(var6.getRgid());
                        var6.setStatus(3 ^ 3);
                        var3.ao(var6);
                        Class95 var4;
                        if ((var4 = (Class95)this.ve().m(95 & 127)) != null) {
                           var4.ax(var6);
                        }

                        this.ve().n(105 & 119);
                     }

                     var10000 = var6;
                  }

                  ParamTool.g(var10000, 0, this.uw());
               }
            }
         }
      }
   }
}
