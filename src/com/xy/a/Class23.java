package com.xy.a;

import com.xy.bean.ChangeRoleNameBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.bean.SuitOperBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.formula.RoleGradeBorn;
import com.xy.formula.RoleSkill;
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

public class Class23 extends com.xy.q.Class30 {
   private LinkedList<ConfirmBean> mb;
   private com.xy.q.Class36 lw;
   private ConfirmBean mc;
   private com.xy.i.Class18 md;
   private RichLabel ck;
   private com.xy.i.Class18 me;

   // $VF: synthetic method
   private void im(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3;
         if (com.xy.v.Class12.h(var3 = this.lw.getText().trim())) {
            String var10001 = "辢光丼胑下穖";
            this.afx.dp("输入不能为空");
         } else {
            String var4 = Agreement.getSendTextAES("exchangegoods", var3);
            this.za().k(var4);
         }
      }
   }

   // $VF: synthetic method
   private void in(boolean var1, ConfirmBean var2) {
      if (var1) {
         if (var2.getType() == 3) {
            if (this.yx().getBabys().size() >= 6) {
               GameView var10000 = this.ze();
               String var10 = "朱夶披兗\u0007丆存孼";
               var10000._do("最多抚养6个孩子");
            } else {
               String var9 = "P\fZ";
               String var7 = Agreement.getSendTextAES("babycustoday", "yes");
               this.za().k(var7);
            }
         } else {
            if (var2.getType() != 4 && var2.getType() == 30) {
               String var10001 = var2.getValue();
               String var10002 = "P";
               int var3 = var10001.indexOf("|");
               Baby var4 = this.yx().getBaby(new BigDecimal(com.xy.v.Class12.s(var2.getValue(), 0, var3)));
               Goodstable var5 = this.yx().getGood(new BigDecimal(com.xy.v.Class12.s(var2.getValue(), var3 + 1, var2.getValue().length())));
               if (var4 == null || var5 == null || var5.getType() != 53L) {
                  return;
               }

               StringBuilder var8 = new StringBuilder().append(var5.getRgid());
               var10002 = "U";
               String var6 = Agreement.getSendTextAES("userbaby", var8.append("|").append(var4.getBabyid()).toString());
               this.za().k(var6);
            }
         }
      }
   }

   public boolean io(ConfirmBean var1) {
      return var1.getType() == 81
         || var1.getType() == 82
         || var1.getType() == 83
         || var1.getType() == 84
         || var1.getType() == 85
         || var1.getType() == 86
         || var1.getType() == 33
         || var1.getType() == 35;
   }

   // $VF: synthetic method
   private void ip(boolean var1, ConfirmBean var2) {
      if (var1) {
         Goodstable var3;
         if ((var3 = this.yx().getGood(new BigDecimal(var2.getValue()))) != null && var3.getType() == 520L) {
            if (!this.ze().ah()) {
               RoleData var4 = this.yx();
               if (var2.getType() == 20) {
                  SuitOperBean var5 = new SuitOperBean();
                  ArrayList var8;
                  (var8 = new ArrayList()).add(var3.getRgid());
                  var5.setGoods(var8);
                  var5.setType(58);
                  String var7 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var5));
                  this.za().k(var7);
               } else if (var3.getStatus() == 1) {
                  GameView var10 = this.ze();
                  String var11 = "州右戴昮卍旑泹叧凖";
                  var10._do("已参战星卡无法取出");
               } else {
                  Goodstable var10000;
                  if (var3.getStatus() == 0) {
                     var10000 = var3;
                     var4.ag(var3.getRgid());
                     var3.setStatus(4);
                     var4.aq(var3);
                  } else {
                     if (var3.getStatus() == 4) {
                        if (var4.getGoodPackSum(var3.getType(), var3.getGoodsid(), 1) <= 0) {
                           GameView var9 = this.ze();
                           String var10001 = "肥匬桕教乤趚";
                           var9._do("背包格数不足");
                           return;
                        }

                        var4.ag(var3.getRgid());
                        var3.setStatus(0);
                        var4.aq(var3);
                        com.xy.a.a.Class19 var6;
                        if ((var6 = (com.xy.a.a.Class19)this.zc().l(95)) != null) {
                           var6.br(var3);
                        }

                        this.zc().f(97);
                     }

                     var10000 = var3;
                  }

                  ParamTool.j(var10000, 0, this.za());
               }
            }
         }
      }
   }

   public String iq(ConfirmBean var1) {
      if (var1.getType() == 81) {
         String var7 = "俟攕";
         return "修改";
      } else if (var1.getType() == 82) {
         String var6 = "侇歊";
         return "修正";
      } else if (var1.getType() == 83) {
         String var5 = "兠捎";
         return "兑换";
      } else if (var1.getType() == 84) {
         String var4 = "覊禨";
         return "解禁";
      } else if (var1.getType() == 85) {
         String var3 = "角尭";
         return "解封";
      } else if (var1.getType() == 86) {
         String var2 = "抲勶";
         return "招募";
      } else {
         String var10000 = "硟家";
         return "确定";
      }
   }

   // $VF: synthetic method
   private void ir(boolean var1, ConfirmBean var2) {
      if (var1) {
         com.xy.a.q.Class64 var5;
         label168: {
            RoleData var3 = this.yx();
            if (var2.getType() == 18) {
               com.xy.a.q.Class41 var4;
               if ((var4 = (com.xy.a.q.Class41)this.zc().l(85)) != null && var4.dx() == 2) {
                  var4.hy(true);
                  return;
               }
            } else {
               if (var2.getType() == 19) {
                  String var45 = var2.getValue();
                  String var55 = "P";
                  int var31 = var45.indexOf("|");
                  BigDecimal var38 = new BigDecimal(com.xy.v.Class12.s(var2.getValue(), 0, var31));
                  BigDecimal var42 = new BigDecimal(com.xy.v.Class12.s(var2.getValue(), var31 + 1, var2.getValue().length()));
                  Goodstable var43 = var3.getGood(var38);
                  Goodstable var44 = var3.getGood(var42);
                  if (var43 != null && var44 != null && var38.compareTo(var42) != 0) {
                     if (!GoodType.v(var44.getType())) {
                        return;
                     }

                     if (var43.getGoodlock() == 1) {
                        var55 = "诌爀哨嶛袂勉锨";
                        this.afx.dp("该物品已被加锁");
                        return;
                     }

                     if (var44.getGoodlock() == 1) {
                        var55 = "诉牘哭巃袇劑锭";
                        this.afx.dp("该物品已被加锁");
                        return;
                     }

                     if (var44.getStatus() == 0) {
                        return;
                     }

                     int var9 = MsgUntil.getGoodLvl(var44.getValue());
                     BigDecimal var10 = new BigDecimal(3200000 * var9);
                     if (var3.getLoginResult().getGold().longValue() < var10.longValue()) {
                        var55 = "醸钘乤趚";
                        this.afx.dp("金钱不足");
                        return;
                     }

                     if (!var3.ad(var44)) {
                        var55 = "能匩巃滍";
                        this.afx.dp("背包已满");
                        return;
                     }

                     var44.setStatus(0);
                     ArrayList var11;
                     (var11 = new ArrayList()).add(var38);
                     var11.add(var42);
                     var3.getLoginResult().setGold(var3.getLoginResult().getGold().subtract(var10));
                     SuitOperBean var12 = new SuitOperBean();
                     var12.setType(20);
                     var12.setGoods(var11);
                     String var13 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var12));
                     this.za().k(var13);
                     return;
                  }

                  return;
               }

               if (var2.getType() == 21) {
                  String var65 = "XU";
                  String var30 = Agreement.getSendTextAES("TransState", "1|" + var2.getValue());
                  this.za().k(var30);
                  return;
               }

               if (var2.getType() == 22) {
                  com.xy.a.q.Class57 var16;
                  var5 = (var16 = (com.xy.a.q.Class57)this.afx.getFormManagement().j(61)).dx() == 1 ? var16.xu() : null;
                  String var6 = var5 != null ? var5.jg() : null;
                  if (var6 != null) {
                     String var10001 = "仨噄刷觏";
                     if (var6.equals("仙器分解")) {
                        break label168;
                     }

                     var10001 = "审拍矚副觊";
                     if (var6.equals("守护石分解")) {
                        break label168;
                     }
                  }
               } else {
                  if (var2.getType() == 23) {
                     String var64 = "o";
                     String var29 = Agreement.getSendTextAES("userpal", "C" + var2.getValue());
                     this.za().k(var29);
                     return;
                  }

                  if (var2.getType() == 24) {
                     Class23 var10000;
                     label151: {
                        try {
                           RoleShow var28 = this.afx.roleUnit.ap;
                           LoginResult var37 = this.afx.roleData.getLoginResult();
                           var37.setGang_id(new BigDecimal(0));
                           var37.setGangname("");
                           var37.setGangpost("");
                           var37.setAchievement(new BigDecimal(0));
                           var37.setResistance("主-|副-");
                           var28.setGang_id(var37.getGang_id());
                           var28.setGangname(var37.getGangname());
                           var3.getRoleProperty().f();
                           String var41 = Agreement.getSendTextAES("gangretreat", null);
                           this.za().k(var41);
                        } catch (Exception var15) {
                           var10000 = this;
                           var15.printStackTrace();
                           break label151;
                        }

                        var10000 = this;
                     }

                     var10000.zc().f(48);
                     return;
                  }

                  if (var2.getType() == 25) {
                     String var27 = Agreement.getSendTextAES("gangchange", var2.getValue());
                     this.za().k(var27);
                     this.zc().f(48);
                     return;
                  }

                  if (var2.getType() == 26) {
                     String var17 = Agreement.getSendTextAES("gangshot", var2.getValue());
                     this.za().k(var17);
                     Class98 var32;
                     if ((var32 = (Class98)this.zc().l(48)) != null) {
                        var32.i(new BigDecimal(var2.getValue()));
                        return;
                     }
                  } else {
                     if (var2.getType() == 28) {
                        String var61 = var2.getValue();
                        String var63 = "U";
                        int var26 = var61.indexOf("|");
                        String var54 = var2.getValue();
                        var61 = "P";
                        int var36 = var54.indexOf("|", var26 + 1);
                        MapModel var40;
                        if ((var40 = this.yt().g(var2.getValue().substring(0, var26))) == null) {
                           return;
                        }

                        int var7 = com.xy.v.Class12.ad(var2.getValue(), var26 + 1, var36);
                        int var8 = com.xy.v.Class12.ad(var2.getValue(), var36 + 1, var2.getValue().length());
                        HandleOption.ae(var40, var7, var8, this.afx, true);
                        return;
                     }

                     if (var2.getType() == 29) {
                        String var25 = Agreement.getSendTextAES("exchange", var2.getValue());
                        this.za().k(var25);
                        return;
                     }

                     if (var2.getType() == 87) {
                        String var24 = Agreement.getSendTextAES("Chongjipacksure", var2.getValue());
                        this.za().k(var24);
                        return;
                     }

                     if (var2.getType() == 88) {
                        String var23 = Agreement.getSendTextAES("activity", var2.getValue());
                        this.za().k(var23);
                        return;
                     }

                     if (var2.getType() == 89) {
                        String var22 = Agreement.getSendTextAES("racialtransformation", var2.getValue());
                        this.za().k(var22);
                        return;
                     }

                     if (var2.getType() == 33) {
                        String var21;
                        if (com.xy.v.Class12.h(var21 = this.lw.getText())) {
                           String var53 = "陶伤呤秙乤胔乓穓";
                           this.afx._do("队伍名称不能为空");
                           return;
                        }

                        if (!com.xy.v.Class0.j(var21)) {
                           String var52 = "阳似吡私両背朥版殦笗叛";
                           this.afx.dp("队伍名称不能有特殊符号");
                           return;
                        }

                        if (!com.xy.v.Class0.b(var21)) {
                           String var51 = "阶佤吤禙丄卬吂霷泼嬾笏ｨＨ";
                           this.afx.dp("队伍名称中包含非法字符！！");
                           return;
                        }

                        if (var21.length() > 5) {
                           String var50 = "阮伡吼秜朱夶\u0004丆学笊";
                           this.afx.dp("队伍名称最多5个字符");
                           return;
                        }

                        StringBuilder var49 = new StringBuilder(String.valueOf(var2.getValue()));
                        String var60 = "\u0015l";
                        String var35 = Agreement.getSendTextAES("activity", var49.append("|E").append(var21).toString());
                        this.za().k(var35);
                        return;
                     }

                     if (var2.getType() == 34) {
                        UseCardBean var20;
                        if ((var20 = var3.getLimit("靓号")) == null) {
                           String var48 = "佌沐朥面叛";
                           this.afx.dp("你没有靓号");
                           return;
                        }

                        var3.af("靓号");
                        String var10002 = "}";
                        StringBuffer var34;
                        (var34 = new StringBuffer("T")).append(var20.getType());
                        String var39 = Agreement.getSendTextAES("usercard", var34.toString());
                        this.afx.getClient().k(var39);
                        this.zc().f(183);
                        this.zc().f(184);
                        this.zc().f(185);
                        return;
                     }

                     if (var2.getType() == 35) {
                        int var18 = 0;

                        try {
                           var18 = Integer.parseInt(this.lw.getText());
                        } catch (Exception var14) {
                           String var47 = "叆背塇敁孻";
                           this.afx.dp("只能填数字");
                           return;
                        }

                        String var10003 = "+\u001b";
                        String var33 = Agreement.getSendTextAES("BEAU", "B2" + var18);
                        this.za().k(var33);
                     }
                  }
               }
            }

            return;
         }

         var5.yd(true);
      }
   }

   // $VF: synthetic method
   private void is(boolean var1, ConfirmBean var2) {
      if (var1) {
         if (!this.ze().ah()) {
            String var3;
            String var10000 = var3 = var2.getValue();
            String var10001 = "P";
            if (var10000.indexOf("|") == -1) {
               Goodstable var9;
               if ((var9 = this.yx().getGood(new BigDecimal(var3))) != null) {
                  if (var9.getGoodlock() == 1) {
                     var10001 = "诉牘哭巃劌锰＠丼參专弯〳〮";
                     this.afx.dp("该物品已加锁，不可丢弃。。");
                  } else if (GoodType.r(var9.getType()) != -1 && GoodType.getExtra(var9.getValue(), GoodType.Extras[4]) != null) {
                     var10001 = "巛锟嵥寴矚斉泼之弪";
                     this.afx._do("已镶嵌宝石无法丢弃");
                  } else {
                     var9.setUsetime(0);
                     this.yx().ag(var9.getRgid());
                     ParamTool.j(var9, 1, this.za());
                  }
               }
            } else {
               ArrayList var4 = new ArrayList();
               int var5 = 0;
               int var6 = 0;
               int var7;
               int var11 = var7 = 0;

               while (var11 < var3.length()) {
                  var10001 = "U";
                  if ((var7 = var3.indexOf("|", var6 + 1)) == -1) {
                     var7 = var3.length();
                  }

                  Goodstable var8;
                  int var12;
                  if ((var8 = this.yx().getGood(new BigDecimal(com.xy.v.Class12.s(var3, var6, var7)))) == null) {
                     var12 = var7;
                  } else if (var8.getGoodlock() == 1) {
                     var12 = var7;
                     String var10002 = "诉牘哭巃劌锰＠丼參专弯〳〮";
                     this.afx.dp("该物品已加锁，不可丢弃。。");
                  } else if (GoodType.r(var8.getType()) != -1 && GoodType.getExtra(var8.getValue(), GoodType.Extras[4]) != null) {
                     var12 = var7;
                     String var16 = "巛锟嵥寴矚斉泼之弪";
                     this.afx._do("已镶嵌宝石无法丢弃");
                  } else {
                     var8.setUsetime(0);
                     var12 = var7;
                     this.yx().ag(var8.getRgid());
                     var4.add(var8);
                  }

                  var5++;
                  var6 = var12 + 1;
                  var11 = var7;
               }

               if (var4.size() != 0) {
                  ParamTool.e(var4, 1, this.za());
               }
            }
         }
      }
   }

   // $VF: synthetic method
   private void it(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3;
         if (com.xy.v.Class12.h(var3 = this.lw.getText().trim())) {
            String var5 = "迺兌乤胔乓穓";
            this.afx.dp("输入不能为空");
         } else {
            StringBuilder var10001 = new StringBuilder(String.valueOf(var2.getValue()));
            String var10002 = "P";
            String var4 = Agreement.getSendTextAES("user", var10001.append("|").append(var3).toString());
            this.za().k(var4);
         }
      }
   }

   // $VF: synthetic method
   private void iu(boolean var1, ConfirmBean var2) {
      if (var1) {
         RoleData var3 = this.yx();
         if (var2.getType() == 5) {
            Lingbao var16;
            if ((var16 = var3.getLingbao(new BigDecimal(var2.getValue()))) != null) {
               String var34 = var16.getBaotype();
               String var45 = "沼宴";
               if (!var34.equals("法宝")) {
                  int var21;
                  if ((var21 = var16.b(4)) == -1) {
                     return;
                  }

                  List var24;
                  if ((var24 = var3.bj(new com.xy.v.Class24(10079L, var21 * 8))) == null) {
                     GameView var35 = this.afx;
                     String var50 = "丼夳";
                     StringBuilder var46 = new StringBuilder("不够").append(var21 * 8);
                     String var48 = "乃灜寴夀婨卙";
                     var35.dp(var46.append("个灵宝天威印").toString());
                     return;
                  }

                  var3.n(var24);
                  var16.d(true);
                  ParamTool.b(var16, this.za());
                  var3.getRoleProperty().v(var16);
                  return;
               }
            }
         } else if (var2.getType() == 6) {
            Lingbao var15;
            if ((var15 = var3.getLingbao(new BigDecimal(var2.getValue()))) != null) {
               String var30 = var15.getBaotype();
               String var41 = "泤宱";
               if (!var30.equals("法宝")) {
                  int var20;
                  if ((var20 = var15.a(4)) == -1) {
                     return;
                  }

                  if ((var20 - 2) * 30 + 1 > var15.getLingbaolvl().intValue()) {
                     return;
                  }

                  if (var20 >= 4) {
                     var30 = var15.getBaoquality();
                     var41 = "斉仞";
                     if (!var30.equals("无价")) {
                        var30 = var15.getBaoquality();
                        var41 = "休为";
                        if (!var30.equals("传世")) {
                           return;
                        }
                     }
                  }

                  List var23;
                  if ((var23 = var3.bj(new com.xy.v.Class24(10079L, var20 * 8))) == null) {
                     GameView var33 = this.afx;
                     String var49 = "乤夶";
                     StringBuilder var44 = new StringBuilder("不够").append(var20 * 8);
                     String var47 = "丛灙宬夅娰卜";
                     var33.dp(var44.append("个灵宝天威印").toString());
                     return;
                  }

                  var3.n(var23);
                  var15.d(false);
                  ParamTool.b(var15, this.za());
                  var3.getRoleProperty().v(var15);
                  return;
               }
            }
         } else {
            if (var2.getType() == 7) {
               String var10000 = var2.getValue();
               String var10001 = "U";
               int var4 = var10000.indexOf("|");
               BigDecimal var5 = new BigDecimal(var2.getValue().substring(0, var4));
               String var6 = var2.getValue().substring(var4 + 1);
               Lingbao var7;
               if ((var7 = var3.getLingbao(var5)) == null) {
                  return;
               }

               var10000 = var7.getBaotype();
               var10001 = "泤宱";
               if (var10000.equals("法宝")) {
                  return;
               }

               if (ParamTool.g(this.za().l(2, 12) ? 100000 : 800000, this.afx)) {
                  var7.setSkills(com.xy.v.Class12.p(var7.getSkills(), var6, 0));
                  ParamTool.b(var7, this.za());
                  var3.getRoleProperty().v(var7);
                  return;
               }
            } else if (var2.getType() == 8) {
               Lingbao var12;
               if ((var12 = var3.getLingbao(new BigDecimal(var2.getValue()))) == null) {
                  return;
               }

               String var28 = var12.getBaotype();
               String var37 = "沼宴";
               if (var28.equals("法宝")) {
                  return;
               }

               if (!com.xy.v.Class12.h(var12.getFushis())) {
                  var37 = "刑陈剼兤卉丧笗矟";
                  this.afx.dp("删除前先卸下符石");
                  return;
               }

               if (var12.getEquipment() == 1) {
                  var37 = "迱奭产袬央狟怨";
                  this.afx.dp("还处于装备状态");
                  return;
               }

               var3.ar(var12);
               com.xy.a.a.Class33 var17;
               if ((var17 = (com.xy.a.a.Class33)this.afx.getFormManagement().l(43)) != null) {
                  var17.cq(null);
                  return;
               }
            } else {
               if (var2.getType() == 9) {
                  Lingbao var14;
                  if ((var14 = var3.getLingbao(new BigDecimal(var2.getValue()))) == null) {
                     return;
                  }

                  int var18;
                  int var22 = (var18 = var14.getLingbaolvl().intValue()) / 5;
                  List var25;
                  if ((var25 = var3.bj(new com.xy.v.Class24(10079L, var22))) == null) {
                     GameView var29 = this.afx;
                     String var10003 = "丼夳";
                     StringBuilder var40 = new StringBuilder("不够").append(var22);
                     String var10002 = "乃灜寴夀婨卙";
                     var29.dp(var40.append("个灵宝天威印").toString());
                     return;
                  }

                  var3.n(var25);
                  long var8 = var14.getLingbaoexe().longValue();
                  long var10 = ExpUtil.a(var18);
                  long var10005 = var8 - var10;
                  var18++;
                  var8 = var10005;
                  var14.setLingbaolvl(new BigDecimal(var18));
                  var14.setLingbaoexe(new BigDecimal(var8));
                  ParamTool.b(var14, this.za());
                  var3.getRoleProperty().v(var14);
                  return;
               }

               if (var2.getType() == 10) {
                  Lingbao var13;
                  if ((var13 = var3.getLingbao(new BigDecimal(var2.getValue()))) == null) {
                     return;
                  }

                  if (ParamTool.g(200000L, this.afx)) {
                     if (var13.getEquipment() == 1) {
                        var3.getRoleProperty().r(var13.getKangxing(), false);
                     }

                     var13.setKangxing(MsgUntil.a(var13.getLingbaolvl().intValue(), this.afx.getClient()));
                     if (var13.getEquipment() == 1) {
                        var3.getRoleProperty().r(var13.getKangxing(), true);
                     }

                     ParamTool.b(var13, this.za());
                     var3.getRoleProperty().v(var13);
                  }
               }
            }
         }
      }
   }

   // $VF: synthetic method
   private void iv(boolean var1, ConfirmBean var2) {
      if (var1) {
         RoleData var3 = this.yx();
         String var4;
         if (com.xy.v.Class12.h(var4 = this.lw.getText().trim())) {
            String var18 = "迺兌乤胔乓穓";
            this.afx.dp("输入不能为空");
         } else if (var3.teamBean != null) {
            String var17 = "绵阳犇怭为両背体甙攕吼卍";
            this.afx.dp("组队状态下不能使用改名卡");
         } else if (var4.equals(var3.getLoginResult().getRolename())) {
            String var16 = "俇敐吧盭吤嬾两肔咥膃巘醤夤";
            this.afx.dp("修改后的名字不能和自己重复");
         } else if (!com.xy.v.Class0.j(var4)) {
            String var15 = "係攈吢皵吡学両背朥版殦笗叛";
            this.afx.dp("修改后的名字不能有特殊符号");
         } else if (!com.xy.v.Class0.b(var4)) {
            String var14 = "吤禙丄卬吂霷泼嬾笏ｨＨ";
            this.afx.dp("名称中包含非法字符！！");
         } else {
            int var5 = 0;
            char[] var6 = var4.toCharArray();

            int var7;
            for (int var10000 = var7 = 0; var10000 < var6.length; var10000 = ++var7) {
               if (String.valueOf(var6[var7]).getBytes().length == 1) {
                  var5++;
               } else {
                  var5 += 2;
               }
            }

            if (var5 > 14) {
               String var13 = "吼秜夛镓";
               this.afx.dp("名称太长");
            } else if (var2.getValue() == null) {
               if (this.afx.getClient().l(2, 12)) {
                  if (var3.getLoginResult().getMoney() < 30) {
                     String var10001 = "禆刯乤趚Z\u0019";
                     this.afx.dp("积分不足30");
                     return;
                  }

                  ChangeRoleNameBean var11 = new ChangeRoleNameBean();
                  var11.setOldName(var3.getLoginResult().getRolename());
                  var11.setNewName(var4);
                  String var12 = Agreement.getSendTextAES("changerolename", com.xy.v.Class31.a().toJson(var11));
                  this.za().k(var12);
               }
            } else {
               Goodstable var10;
               if ((var10 = var3.getGood(new BigDecimal(var2.getValue()))) != null) {
                  ChangeRoleNameBean var8 = new ChangeRoleNameBean();
                  var8.setOldName(var3.getLoginResult().getRolename());
                  var8.setNewName(var4);
                  var8.setRgid(var10.getRgid());
                  String var9 = Agreement.getSendTextAES("changerolename", com.xy.v.Class31.a().toJson(var8));
                  this.za().k(var9);
               }
            }
         }
      }
   }

   // $VF: synthetic method
   private void iw(boolean var1, ConfirmBean var2) {
      if (var1) {
         RoleData var3;
         LoginResult var4 = (var3 = this.yx()).getLoginResult();
         String var10000 = this.lw.getText().trim();
         String var10001 = "\u0001";
         String[] var5;
         if ((var5 = var10000.split("-")).length > var4.getTurnAround() || var5.length > 3) {
            var10001 = "厃胔迺兌仧臃軂监呥皭輅甶歈教";
            this.afx.dp("只能输入于自身相同的转生次数");
         } else {
            int[] var6;
            if ((var6 = RoleGradeBorn.getbz(var5)) == null) {
               var10001 = "辢光栍弣朸诃";
               this.afx.dp("输入格式有误");
            } else {
               String var7 = null;

               int var8;
               for (int var13 = var8 = 0; var13 < var6.length; var13 = var8) {
                  String[] var14 = RoleSkill.getRoleSkill().getAllSkill(var6[var8], var8 * 5000 + 10000);
                  var8++;
                  var7 = RoleGradeBorn.e(var14, var7);
               }

               RoleData var17;
               label41: {
                  var10000 = var3.getPrivateData().getBorn();
                  var10001 = "厥屷恎\u000f";
                  String var10002 = "P";
                  String var11;
                  if ((var11 = com.xy.v.Class12.ai(var10000, "双属性&", "|")) != null) {
                     var10002 = "厥屷恎\u000f";
                     String var12 = "双属性&" + var11;
                     if (var7 == null || var7.length() == 0) {
                        var7 = var12;
                        var17 = var3;
                        break label41;
                     }

                     StringBuilder var16 = new StringBuilder(String.valueOf(var7));
                     var10001 = "P";
                     var7 = var16.append("|").append(var12).toString();
                  }

                  var17 = var3;
               }

               Goodstable var9;
               if ((var9 = var17.getGood(new BigDecimal(var2.getValue()))) != null) {
                  var9.n(1);
                  if (var9.getUsetime() <= 0) {
                     var3.ag(var9.getRgid());
                  }

                  ParamTool.j(var9, 1, this.za());
                  PrivateData var10 = var3.getPrivateData();
                  var10.setBorn(var7);
                  ParamTool.a(var10, this.za());
                  var3.getRoleProperty().g(null, var7);
                  String var23 = "暝攐侇歊批劶";
                  this.afx.dp("更改修正成功");
               }
            }
         }
      }
   }

   public void h() {
      synchronized (this) {
         this.mc = this.mb.size() != 0 ? this.mb.removeFirst() : null;
         if (this.mc == null) {
            this.zc().f(this.lj());
         } else {
            this.ck.setTextSize(this.mc.getMSG(), 494);
            this.lw.setText(null);
            this.lw.setVisible(this.io(this.mc));
            this.lw.setBounds(21, this.ck.getY() + this.ck.getHeight() + 5, 494, 20);
            this.me.setText(this.iq(this.mc));
            this.me.setBounds(65, this.ck.getY() + this.ck.getHeight() + 45, 59, 25);
            this.md.setBounds(375, this.ck.getY() + this.ck.getHeight() + 45, 59, 25);
            this.yv(-1, 0, 532, this.me.getY() + 50);
            if (!this.isVisible()) {
               this.zc().b(this.lj());
            }

            if (this.lw.isVisible() && this.afx.isVisible() && this.afx.gameFrame.isFocused()) {
               this.lw.requestFocus();
            }
         }
      }
   }

   public void dm(ConfirmBean var1) {
      synchronized (this) {
         this.mb.add(var1);
         if (this.mc == null) {
            this.h();
         }
      }
   }

   // $VF: synthetic method
   private void ix(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3 = Agreement.getSendTextAES("taskN", var2.getValue());
         this.za().k(var3);
      }
   }

   // $VF: synthetic method
   private void iy(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3;
         if (!com.xy.v.Class12.u(var3 = this.lw.getText().trim())) {
            String var10001 = "诞迺兌攙孾";
            this.afx.dp("请输入数字");
         } else {
            String var10003 = "kP";
            String var4 = Agreement.getSendTextAES("hjsl", "Z|" + var3);
            this.za().k(var4);
         }
      }
   }

   // $VF: synthetic method
   private void iz(boolean var1, ConfirmBean var2) {
      if (var1) {
         if (var2.getType() == 14) {
            String var10000 = var2.getValue();
            String var10001 = "P";
            int var3;
            if ((var3 = var10000.indexOf("|")) == -1) {
               var3 = var2.getValue().length();
            }

            BigDecimal var4 = new BigDecimal(com.xy.v.Class12.s(var2.getValue(), 0, var3));
            RoleData var5;
            Mount var6;
            if ((var6 = (var5 = this.yx()).getMount(var4)) == null) {
               return;
            }

            if (var2.getType() == 14) {
               if (var5.getLoginResult().getMount_id() == var6.getMountid()) {
                  var10001 = "悁盭坹髸迱裂悁髸睩吋Ｈ";
                  this.afx.dp("您的坐骑还被您骑着呢！");
                  return;
               }

               if (var6.getSid() != null || var6.getOthrersid() != null || var6.getSid3() != null) {
                  var10001 = "悙皨坡骽箐刚睱叀唕兑呓Ｍ";
                  this.afx.dp("您的坐骑管制着召唤兽呢！");
                  return;
               }

               String var8 = Agreement.getSendTextAES("mountrelease", "" + var6.getMid());
               this.za().k(var8);
               var5.mounts.remove(var6);
               if (!this.afx.getClient().gameMount) {
                  com.xy.a.a.Class31 var11;
                  if ((var11 = (com.xy.a.a.Class31)this.afx.getFormManagement().l(7)) != null) {
                     var11.e();
                     return;
                  }

                  this.afx.getFormManagement().f(20);
                  return;
               }

               com.xy.a.a.Class53 var9;
               if ((var9 = (com.xy.a.a.Class53)this.afx.getFormManagement().l(172)) == null || !var9.dh()) {
                  this.afx.getFormManagement().f(20);
                  return;
               }
            }
         } else if (var2.getType() == 32) {
            String var10 = Agreement.getSendTextAES("usermount", var2.getValue());
            this.afx.getClient().k(var10);
         }
      }
   }

   public Class23(GameView var1) {
      super(104, 3, com.xy.q.Class30.afz, var1);
      String var10007 = "_R\u0003U\u0003\u0003\u001a\u001f\\_K";
      this.yy(-1, 0, 532, 149, com.xy.q.Class30.agf);
      this._do("sc/d/26.png");
      this.mb = new LinkedList<>();
      this.ck = com.xy.v.Class27.j("", com.xy.q.Class49.ac, 384);
      this.ck.setBounds(21, 25, 494, 20);
      this.add(this.ck);
      String var10005 = "Z\n\u0006\r\u0006X\u001eGY\u0007N";
      this.lw = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.ac, Color.white);
      this.lw.setBounds(21, 50, 494, 20);
      this.add(this.lw);
      String var10010 = "BO\u001eI\u001e\u001b\u001f\\_K";
      String var10015 = "砇害";
      this.me = new com.xy.i.Class18("sc/e/7.png", 1, 110, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "确定", this);
      String var10009 = "BO\u001eI\u001e\u001b\u001f\\_K";
      String var10014 = "县涡";
      this.md = new com.xy.i.Class18("sc/e/7.png", 1, 111, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "取消", this);
      this.me.setBounds(65, 102, 59, 25);
      this.md.setBounds(375, 102, 59, 25);
      this.add(this.me);
      this.add(this.md);
   }

   // $VF: synthetic method
   private void ja(boolean var1, ConfirmBean var2) {
      if (var1) {
         String var3;
         if (!com.xy.v.Class12.u(var3 = this.lw.getText().trim())) {
            String var5 = "诞迺兌攙孾";
            this.afx.dp("请输入数字");
         } else {
            StringBuilder var10001 = new StringBuilder(String.valueOf(var2.getValue()));
            String var10002 = "P";
            String var4 = Agreement.getSendTextAES("user", var10001.append("|").append(var3).toString());
            this.za().k(var4);
         }
      }
   }

   public void cr(boolean var1) {
      Class23 var10000;
      if (this.mc.getType() == 1) {
         var10000 = this;
         this.is(var1, this.mc);
      } else if (this.mc.getType() == 2) {
         var10000 = this;
         this.ip(var1, this.mc);
      } else if (this.mc.getType() == 20) {
         var10000 = this;
         this.ip(var1, this.mc);
      } else if (this.mc.getType() == 3) {
         var10000 = this;
         this.in(var1, this.mc);
      } else if (this.mc.getType() == 4) {
         var10000 = this;
         this.in(var1, this.mc);
      } else if (this.mc.getType() == 30) {
         var10000 = this;
         this.in(var1, this.mc);
      } else if (this.mc.getType() == 5
         || this.mc.getType() == 6
         || this.mc.getType() == 7
         || this.mc.getType() == 8
         || this.mc.getType() == 9
         || this.mc.getType() == 10) {
         var10000 = this;
         this.iu(var1, this.mc);
      } else if (this.mc.getType() == 11 || this.mc.getType() == 12 || this.mc.getType() == 13 || this.mc.getType() == 31) {
         var10000 = this;
         this.jd(var1, this.mc);
      } else if (this.mc.getType() == 14 || this.mc.getType() == 32) {
         var10000 = this;
         this.iz(var1, this.mc);
      } else if (this.mc.getType() == 15) {
         var10000 = this;
         this.jb(var1, this.mc);
      } else if (this.mc.getType() == 16) {
         var10000 = this;
         this.jb(var1, this.mc);
      } else if (this.mc.getType() == 17) {
         var10000 = this;
         this.ix(var1, this.mc);
      } else if (this.mc.getType() == 18) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 19) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 21) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 22) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 23) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 24) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 25) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 26) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 28) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 29) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 87) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 88) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 89) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 33) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 34) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 35) {
         var10000 = this;
         this.ir(var1, this.mc);
      } else if (this.mc.getType() == 27) {
         var10000 = this;
         this.afx.gameFrame.fg(this.afx);
      } else if (this.mc.getType() == 81) {
         var10000 = this;
         this.iv(var1, this.mc);
      } else if (this.mc.getType() == 82) {
         var10000 = this;
         this.iw(var1, this.mc);
      } else if (this.mc.getType() == 83) {
         var10000 = this;
         this.im(var1, this.mc);
      } else if (this.mc.getType() == 84) {
         var10000 = this;
         this.ja(var1, this.mc);
      } else if (this.mc.getType() == 85) {
         var10000 = this;
         this.it(var1, this.mc);
      } else if (this.mc.getType() == 86) {
         var10000 = this;
         this.iy(var1, this.mc);
      } else {
         var10000 = this;
         this.jc(var1, this.mc);
      }

      var10000.h();
   }

   @Override
   public boolean ah() {
      if (this.mc != null) {
         this.h();
      }

      return super.ah();
   }

   // $VF: synthetic method
   private void jb(boolean var1, ConfirmBean var2) {
      if (var1) {
         if (var2.getType() == 15) {
            if (ParamTool.g(Long.parseLong(var2.getValue()), this.afx)) {
               RoleData var10000 = this.yx();
               var10000.getPrivateData().setSkills("N", null);
               PrivateData var10003 = var10000.getPrivateData();
               String var10004 = "x";
               var10003.setSkills("T", null);
               var10000.getRoleProperty().k();
               ParamTool.a(var10000.getPrivateData(), this.za());
               var10000.getRoleProperty().y();
               com.xy.a.w.Class4 var6;
               if ((var6 = (com.xy.a.w.Class4)this.zc().l(82)) != null) {
                  var6.y(2);
                  return;
               }
            }
         } else if (var2.getType() == 16) {
            if (this.yx().getLoginResult().getGold().compareTo(new BigDecimal(500000)) < 0) {
               String var10001 = "醸钘乤趚";
               this.afx._do("金钱不足");
               return;
            }

            String var4 = Agreement.getSendTextAES("rolechange", var2.getValue());
            this.za().k(var4);
         }
      }
   }

   // $VF: synthetic method
   private void jc(boolean var1, ConfirmBean var2) {
      if (var2.getType() == 120) {
         if (!var1) {
            String var6 = "\u0001";
            var2.setValue("-" + var2.getValue());
         }

         String var5 = Agreement.getSendTextAES("confirm", com.xy.v.Class31.a().toJson(var2));
         this.za().k(var5);
      } else if (var2.getType() == 122) {
         if (!var1) {
            String var10002 = "\u0004";
            var2.setValue("-" + var2.getValue());
         }

         String var4 = Agreement.getSendTextAES("confirm", com.xy.v.Class31.a().toJson(var2));
         this.za().k(var4);
      } else if (var1) {
         String var3 = Agreement.getSendTextAES("confirm", com.xy.v.Class31.a().toJson(var2));
         this.za().k(var3);
      }
   }

   // $VF: synthetic method
   private void jd(boolean var1, ConfirmBean var2) {
      if (var1) {
         if (var2.getType() == 13) {
            String var9 = Agreement.getSendTextAES("userpet", var2.getValue());
            this.za().k(var9);
         } else if (var2.getType() == 31) {
            String var8 = Agreement.getSendTextAES("userpet", var2.getValue());
            this.za().k(var8);
         } else {
            String var10000 = var2.getValue();
            String var10001 = "U";
            int var3;
            if ((var3 = var10000.indexOf("|")) == -1) {
               var3 = var2.getValue().length();
            }

            RoleData var4;
            RolePet var5;
            RoleSummoning var6;
            if ((var6 = (var5 = (var4 = this.yx()).getRolePet(com.xy.v.Class12.s(var2.getValue(), 0, var3))).getPet()) != null) {
               if (var2.getType() == 11) {
                  if (var6.getPetlock() == 1) {
                     var10001 = "诔叀唕兑巃劌锰\u0000丼胑攏申";
                     this.afx.dp("该召唤兽已加锁,不能放生");
                  } else if (var6.getGoods() != null) {
                     var10001 = "讌叅啍兔摓帏眩裬奮房凬丐";
                     this.afx.dp("该召唤兽携带着装备或内丹");
                  } else if (var4.getPetMount(var6.getSid()) != null) {
                     var10001 = "迵叛叀唕兑袚箍切丁］両叞攒甮ＭＰＭ";
                     this.afx.dp("这只召唤兽被管制中，不可放生！！！");
                  } else if (var4.getLoginResult().getSummoning_id() != null && var4.getLoginResult().getSummoning_id().compareTo(var6.getSid()) == 0) {
                     var10001 = "述厃叅啍兔嶛圁厫戱乄ＨｨＨ";
                     this.afx.dp("这只召唤兽已在参战中！！！");
                  } else {
                     var4.pets.remove(var5);
                     String var10 = Agreement.getSendTextAES("petrelease", var6.getSid().toString());
                     this.za().k(var10);
                  }
               } else {
                  if (var2.getType() == 12) {
                     String var10003 = "|bP";
                     String var7 = Agreement.getSendTextAES("userpet", "PS|" + var2.getValue());
                     this.za().k(var7);
                  }
               }
            }
         }
      }
   }
}
