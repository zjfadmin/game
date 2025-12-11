package com.xy.a.q;

import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.bean.NpcComposeBean;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.AlchemySet;
import com.xy.readbean.AlchemyUnit;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class64 extends com.xy.q.Class30 {
   private DefaultListModel<String> pk;
   private JScrollPane pl;
   private Class92[] ahe;
   private com.xy.q.Class52 agw;
   Goodstable[] ahf;
   private BigDecimal bt;
   private JLabel[] ir;
   private com.xy.q.Class21 ahg;
   private int cn = -1;
   private JList<String> m;
   private com.xy.i.Class3[] ahh;
   private com.xy.i.Class19 go;
   private MoneyType ef;
   private com.xy.q.Class14[] k;
   private com.xy.w.Class18[] cl;

   public boolean zp(Goodstable[] var1, BigDecimal var2, String var3, boolean var4) {
      if (this.yx().getLoginResult().getGold().longValue() < var2.longValue()) {
         String var20 = "醐钔乌趖";
         this.afx._do("金钱不足");
         return false;
      } else {
         ArrayList var5 = new ArrayList();
         int var6 = 0;
         int var7 = -1;

         int var8;
         for (int var10000 = var8 = 0; var10000 < var1.length; var10000 = ++var8) {
            if (var1[var8] != null) {
               var6++;
               var7 = var8;
               if (var1[var8].getGoodlock() == 1) {
                  String var18 = "误牮哋巵袡劧锋";
                  this.afx.dp("该物品已被加锁");
                  return false;
               }

               int var9 = 1;

               int var10;
               for (int var11 = var10 = 0; var11 < var5.size(); var11 = ++var10) {
                  if (var1[var8].getRgid().compareTo((BigDecimal)var5.get(var10)) == 0) {
                     var9++;
                  }
               }

               if (var9 > var1[var8].getUsetime()) {
                  String var10002 = "诒冐齵爨哤凌杀";
                  this.afx._do("请凑齐物品再来");
                  return false;
               }

               var5.add(var1[var8].getRgid());
            }
         }

         if (var7 + 1 != var6) {
            String var19 = ")^诽圯弟寻畆靥柯県兦弈&妅枖弒寶畋靨沦會対庞八弅'聞糼箫琁呒衢兏";
            this.afx._do("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
            return false;
         } else {
            String var10001 = "伨饕垸兞";
            if (!var3.equals("佩饰培养")) {
               var10001 = "万锤埾共";
               if (!var3.equals("一键培养")) {
                  var10001 = "禙矖呉戵";
                  if (!var3.equals("秘石合成")) {
                     var10001 = "逧垁释铲";
                     if (!var3.equals("造型重铸")) {
                        var10001 = "亘噍則视";
                        if (!var3.equals("仙器分解")) {
                           var10001 = "块骛驪炶";
                           if (!var3.equals("坐骑驭炼")) {
                              var10001 = "宭拥矖則视";
                              if (!var3.equals("守护石分解")) {
                                 return this.aab(var1, var2, var3, var5);
                              }
                           }
                        }
                     }
                  }

                  return this.aac(var1, var2, var3, var5, var4);
               }
            }

            return this.zv(var1, var2, var5);
         }
      }
   }

   public Goodstable[] zq() {
      int var1;
      if (this.ahf == null) {
         this.ahf = new Goodstable[this.ahe.length];
      } else {
         for (int var10000 = var1 = 0; var10000 < this.ahf.length; var10000 = var1) {
            this.ahf[var1++] = null;
         }
      }

      for (int var3 = var1 = 0; var3 < this.ahf.length; var3 = ++var1) {
         this.ahf[var1] = this.ahe[var1].aho();
         if (this.ahf[var1] == null) {
            if (Class92.ahp(this.ahe[var1]).il() != 0) {
               String var10002 = "牣哆巸上冇胋匏";
               this.afx._do("物品已不再背包");
               return null;
            }
            break;
         }
      }

      return this.ahf;
   }

   public void cb(Goodstable var1, int var2) {
      this.ahe[var2].bb(var1);
      this.h();
   }

   public boolean zr(String var1, Goodstable[] var2, boolean var3) {
      String var10001 = "炻匜裂复";
      if (!var1.equals("炼化装备")) {
         var10001 = "烽匳亘噍";
         if (!var1.equals("炼化仙器")) {
            var10001 = "炻匜祙兿";
            if (!var1.equals("炼化神兵")) {
               var10001 = "裂复埾共";
               if (!var1.equals("装备培养")) {
                  var10001 = "袄夢匆纂";
                  if (!var1.equals("装备升级")) {
                     var10001 = "裂复释铲";
                     if (!var1.equals("装备重铸")) {
                        return this.zp(var2, this.bt, var1, var3);
                     }
                  }
               }

               if (this.yx().getLoginResult().getGold().longValue() < this.bt.longValue()) {
                  String var10002 = "醐钔乌趖";
                  this.afx._do("金钱不足");
                  return false;
               }

               this.aaa(var2, var1);
               return true;
            }
         }
      }

      Class30 var4;
      if ((var4 = (Class30)this.zc().l(11)) != null && var4.pa(0, var2[0].getRgid())) {
         return this.zs(var4, var2, this.bt, 4);
      } else {
         String var10000 = var2[0].getValue();
         var10001 = "烽匳尟怂";
         String var5 = GoodType.getExtra(var10000, "炼化属性");
         if (var4 == null) {
            var4 = (Class30)this.zc().j(11);
         }

         var4.oz(var2[0].getRgid(), var5, 0, true);
         return false;
      }
   }

   public boolean at(int var1) {
      return this.ahe[var1].aho() != null;
   }

   public int dx() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.ahe.length; var10000 = ++var1) {
         if (this.ahe[var1].isVisible() && Class92.ahp(this.ahe[var1]).il() != 1) {
            return var1;
         }
      }

      return -1;
   }

   public void g(int var1) {
      this.f();
      if (this.cn != var1) {
         Class64 var10000;
         label70: {
            this.cn = var1;
            this.pk.removeAllElements();
            if (var1 == 0) {
               String var10003 = "炻匜裂复";
               this.pk.addElement("炼化装备");
               String var10002 = "烽匳亘噍";
               this.pk.addElement("炼化仙器");
               if (this.za().gameType == 2) {
                  if (!this.za().l(2, 3)) {
                     String var10001 = "炻匜祙兿";
                     this.pk.addElement("炼化神兵");
                  }

                  if (!this.za().l(2, 3)) {
                     String var7 = "袄夢戒逅";
                     this.pk.addElement("装备打造");
                  }

                  String var8 = "裂复巬铲";
                  this.pk.addElement("装备巫铸");
               }

               String var10005 = "遡垮醌铝";
               this.pk.addElement("造型重铸");
               String var10004 = "伞伾裂复區纭";
               this.pk.addElement("伙伴装备升级");
               var10003 = "佘休袄夢醌铝";
               this.pk.addElement("伙伴装备重铸");
               var10002 = "伞伾裂复埾共";
               this.pk.addElement("伙伴装备培养");
               if (this.za().gameMount) {
                  var10000 = this;
                  var10002 = "坵髐癛烽东";
                  this.pk.addElement("坐骑百炼丹");
                  break label70;
               }
            } else if (var1 == 1) {
               String var10011 = "佮饺埾共";
               this.pk.addElement("佩饰培养");
               this.pk.addElement("佩饰重铸");
               String var10009 = "抁軪笃垸兞";
               this.pk.addElement("护身符培养");
               String var10008 = "抮躬第释铲";
               this.pk.addElement("护身符重铸");
               String var10007 = "彌昷矖垸兞";
               this.pk.addElement("彩晶石培养");
               String var10006 = "酊饺炾粳";
               this.pk.addElement("配饰点粹");
               String var21 = "鄌饕糸炙";
               this.pk.addElement("配饰粹炼");
               String var20 = "酊饺精叜";
               this.pk.addElement("配饰粹取");
               String var18 = "鄌饕烽吭";
               this.pk.addElement("配饰炼合");
               String var15 = "酊饺刁觩";
               this.pk.addElement("配饰分解");
               if (this.za().gameType == 2) {
                  String var9 = "亘噍則视";
                  this.pk.addElement("仙器分解");
               }

               if (this.za().gameMount) {
                  var10000 = this;
                  var15 = "宂抣矹刁觩";
                  this.pk.addElement("守护石分解");
                  break label70;
               }
            } else if (var1 == 2) {
               String var19 = "彁公";
               this.pk.addElement("开光");
               this.pk.addElement("炼器");
               String var10 = "渂陮炻噢";
               this.pk.addElement("清除炼器");
            }

            var10000 = this;
         }

         var10000.ci(null);

         int var2;
         for (int var3 = var2 = 0; var3 < this.ahe.length; var3 = var2) {
            label58: {
               if (var1 == 2) {
                  int var4;
                  if (var2 < 4) {
                     Class92 var11 = this.ahe[var2];
                     var4 = var2;
                     var11.setBounds(248 + var2 % 2 * 67, 75 + var2 / 2 * 65, 59, 58);
                  } else {
                     if (var2 == 4) {
                        this.ahe[var2].setBounds(382, 108, 59, 58);
                     }

                     var4 = var2;
                  }

                  if (var4 > 4) {
                     var10000 = this;
                     this.ahe[var2].setVisible(false);
                     break label58;
                  }
               } else {
                  this.ahe[var2].setBounds(248 + var2 % 3 * 67, 75 + var2 / 3 * 65, 59, 58);
                  if (var2 >= 4) {
                     this.ahe[var2].setVisible(true);
                  }
               }

               var10000 = this;
            }

            var10000.ahe[var2++].bb(null);
         }

         this.h();
      }
   }

   public boolean zs(Class30 var1, Goodstable[] var2, BigDecimal var3, int var4) {
      RoleData var5;
      LoginResult var6 = (var5 = this.yx()).getLoginResult();
      int var7 = 0;
      int var8 = 0;
      if (var4 == 4 || var4 == 1) {
         var8 = (var7 = var1.id()) % 10;
         var7 /= 10;
      }

      int var9 = var4 == 4 ? var1.dx() : 0;
      BigDecimal var10 = null;
      if (var6.getGold().longValue() < var3.longValue()) {
         String var53 = "b|醐钔乌趖";
         this.afx.dp("#Y金钱不足");
         return false;
      } else {
         if (this.za().l(2, 7)) {
            if (var8 > 2) {
               String var38 = "朇夐叭胷锆宐5丠";
               this.afx.dp("最多只能锁定2个");
               return false;
            }

            BigDecimal var10000;
            if (var8 == 1 && var4 == 4) {
               var10000 = var10 = new BigDecimal(1000);
            } else {
               if (var8 == 2 && var4 == 4) {
                  var10 = new BigDecimal(2500);
               }

               var10000 = var10;
            }

            if (var10000 != null && var6.getCodecard().longValue() < var10.longValue()) {
               String var10002 = "亘玬乌趖";
               this.afx.dp("仙玉不足");
               return false;
            }
         } else {
            if (var8 > 3) {
               String var52 = "朇夐叭胷锆宐4丠";
               this.afx.dp("最多只能锁定3个");
               return false;
            }

            int var22;
            label209: {
               if (var8 > 0) {
                  if (var8 == 1) {
                     if (var4 == 4) {
                        var10 = new BigDecimal(100);
                        var22 = var4;
                     } else {
                        var10 = new BigDecimal(1000);
                        var22 = var4;
                     }
                     break label209;
                  }

                  if (var8 == 2) {
                     if (var4 == 4) {
                        var10 = new BigDecimal(500);
                        var22 = var4;
                     } else {
                        var10 = new BigDecimal(3000);
                        var22 = var4;
                     }
                     break label209;
                  }

                  if (var8 == 3) {
                     if (var4 == 4) {
                        var10 = new BigDecimal(2500);
                        var22 = var4;
                        break label209;
                     }

                     var10 = new BigDecimal(6000);
                  }
               }

               var22 = var4;
            }

            BigDecimal var23;
            label198: {
               if (var22 == 4 && var9 == 1) {
                  if (var10 == null) {
                     var23 = var10 = new BigDecimal(10000);
                     break label198;
                  }

                  var10 = var10.add(new BigDecimal(10000));
               }

               var23 = var10;
            }

            if (var23 != null && var6.getSavegold().longValue() < var10.longValue()) {
               String var51 = "纐玬乌趖";
               this.afx.dp("绑玉不足");
               return false;
            }
         }

         ArrayList var11 = new ArrayList();
         int var12 = 0;
         int var13 = -1;

         int var14;
         for (int var24 = var14 = 0; var24 < var2.length; var24 = ++var14) {
            if (var2[var14] != null) {
               var13 = var14;
               var12++;
               if (var2[var14].getGoodlock() == 1) {
                  String var40 = "误牮哋巵袡劧锋";
                  this.afx.dp("该物品已被加锁");
                  return false;
               }

               int var15 = 1;

               int var16;
               for (int var25 = var16 = 0; var25 < var11.size(); var25 = ++var16) {
                  if (var2[var14].getRgid().compareTo((BigDecimal)var11.get(var16)) == 0) {
                     var15++;
                  }
               }

               if (var15 > var2[var14].getUsetime()) {
                  String var39 = "诒冐齵爨哤凌杀";
                  this.afx._do("请凑齐物品再来");
                  return false;
               }

               var11.add(var2[var14].getRgid());
            }
         }

         if (var13 + 1 != var12) {
            String var50 = ")^诽圯弟寻畆靥柯県兦弈&妅枖弒寶畋靨沦會対庞八弅'聞糼箫琁呒衢兏";
            this.afx.dp("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
            return false;
         } else {
            SuitOperBean var18 = new SuitOperBean();
            if (var4 == 0) {
               if (var12 != 2) {
                  String var42 = "\u0006\u0018诒坩弰宽畩霣柀睊光彎\t姃枹彔寙甍靇泠本宸庱儭弪a聱粺箄瑇命蠤兠";
                  this.afx.dp("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
                  return false;
               }

               String var26 = var2[0].getValue();
               String var10001 = "炻噢屙怭";
               String var19;
               if ((var19 = GoodType.getExtra(var26, "炼器属性")) != null) {
                  var10001 = "\u0003";
                  if (Integer.parseInt(var19.split("&")[1]) >= 5) {
                     String var41 = "朊夠弊兎欫敷?";
                     this.afx.dp("最大开光次数5");
                     return false;
                  }
               }

               var18.setType(10);
            } else if (var4 == 1) {
               if (var12 != 4) {
                  String var44 = "\u0006\u0018诒坩弰宽畩霣柀睊光彎\t姃枹彔寙甍靇泠本宸庱儭弪a聱粺箄瑇命蠤兠";
                  this.afx.dp("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
                  return false;
               }

               String var27 = var2[0].getValue();
               String var34 = "炻噢屙怭";
               if (GoodType.getExtra(var27, "炼器属性") == null) {
                  String var43 = "儉厞彁公";
                  this.afx.dp("先去开光");
                  return false;
               }

               var18.setType(11);
            } else if (var4 == 3) {
               if (var12 != 1) {
                  String var45 = ")^诽圯弟寻畆靥柯県兦弈&妅枖弒寶畋靨沦會対庞八弅'聞糼箫琁呒衢兏";
                  this.afx.dp("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
                  return false;
               }

               var18.setType(13);
            } else if (var4 == 4) {
               String var28 = var2[0].getValue();
               String var35 = "外裠尟怂";
               if (GoodType.getExtra(var28, "套装属性") != null) {
                  String var49 = "奐裏旧泟炻匜";
                  this.afx.dp("套装无法炼化");
                  return false;
               }

               if (var9 == 1 && !GoodType.h(var2[0].getType()) && !GoodType.ao(var2[0].getType())) {
                  String var48 = "b|辘籞埊裠奆暧斷沄杈寜廕皡爸报";
                  this.afx.dp("#Y这类型装备暂时没有对应的特技");
                  return false;
               }

               if (GoodType.w(var2[0].getType())) {
                  if (var2[1].getType() == 7005L) {
                     var28 = GoodType.ak(var2[1].getValue())[1];
                     var35 = "阱敺:;";
                     if (!var28.equals("阶数=1")) {
                        String var46 = "伾甍乁阓伝丟烽匳朑於奫掬亶亣呖\u001a";
                        this.afx.dp("使用一阶作为炼化材料太掉价了吗?");
                        return false;
                     }
                  } else if (GoodType.w(var2[1].getType())) {
                     var28 = GoodType.ak(var2[1].getValue())[0];
                     var35 = "阱敺:;";
                     if (!var28.equals("阶数=1")) {
                        String var47 = "伾甍乁阓伝丟烽匳朑於奫掬亶亣呖\u001a";
                        this.afx.dp("使用一阶作为炼化材料太掉价了吗?");
                        return false;
                     }
                  }
               }

               var18.setType(14);
            }

            int var20;
            for (int var31 = var20 = 1; var31 < var2.length; var31 = ++var20) {
               if (var2[var20] != null) {
                  var2[var20].n(1);
                  if (var2[var20].getUsetime() <= 0) {
                     var5.ag(var2[var20].getRgid());
                  }
               }
            }

            var6.setGold(var6.getGold().subtract(var3));
            if (var10 != null) {
               SuitOperBean var32;
               if (this.za().l(2, 7)) {
                  var6.setCodecard(var6.getCodecard().subtract(var10));
                  var32 = var18;
               } else {
                  var6.setSavegold(var6.getSavegold().subtract(var10));
                  var32 = var18;
               }

               var32.setJade(new PartJade(var7, var9));
            }

            var18.setGoods(var11);
            String var21 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var18));
            this.za().k(var21);
            return true;
         }
      }
   }

   public void ay(Goodstable var1) {
      Class64 var10000;
      label65: {
         if (this.cn == 2) {
            if (GoodType.h(var1.getType())) {
               var10000 = this;
               this.ahe[0].bb(var1);
               break label65;
            }

            int var2;
            if ((var1.getType() == 505L || var1.getType() == 507L) && (var2 = this.dx()) > 0) {
               var10000 = this;
               this.ahe[var2].bb(var1);
               break label65;
            }
         } else {
            boolean var9;
            label57: {
               boolean var5 = true;
               if (var1.getType() >= 497L && var1.getType() <= 499L) {
                  byte var3 = 1;
                  if (var1.getType() == 497L) {
                     var3 = 1;
                     var10000 = this;
                  } else if (var1.getType() == 499L) {
                     var3 = 2;
                     var10000 = this;
                  } else {
                     if (var1.getType() == 498L) {
                        var3 = 3;
                     }

                     var10000 = this;
                  }

                  Goodstable var4;
                  if ((var4 = var10000.ahe[var3].aho()) == null) {
                     var9 = false;
                     this.ahe[var3].bb(var1);
                     var5 = false;
                     break label57;
                  }

                  if (var4.getType() != var1.getType()) {
                     this.ahe[var3].bb(var1);
                     var5 = false;
                  }
               }

               var9 = var5;
            }

            int var7;
            if (var9) {
               for (int var10 = var7 = 0; var10 < this.ahe.length; var10 = ++var7) {
                  if (this.ahe[var7].aho() == null) {
                     var10000 = this;
                     this.ahe[var7].bb(var1);
                     break label65;
                  }
               }
            }
         }

         var10000 = this;
      }

      var10000.h();
   }

   public boolean zt(String var1, Goodstable[] var2, boolean var3) {
      String var10001 = "酊饺炾粳";
      if (!var1.equals("配饰点粹")) {
         var10001 = "鄌饕糸炙";
         if (!var1.equals("配饰粹炼")) {
            var10001 = "鄌饕則视";
            if (!var1.equals("配饰分解")) {
               var10001 = "酊饺精叜";
               if (!var1.equals("配饰粹取")) {
                  var10001 = "鄌饕烽吭";
                  if (!var1.equals("配饰炼合")) {
                     return this.zp(var2, this.bt, var1, var3);
                  }
               }
            }

            return this.zu(var2, this.bt, var1);
         }
      }

      var10001 = "酊饺炾粳";
      int var4 = var1.equals("配饰点粹") ? 5 : 6;
      Class30 var5;
      if ((var5 = (Class30)this.zc().l(11)) != null && var5.pa(var4, var2[0].getRgid())) {
         return this.zu(var2, this.bt, var1);
      } else {
         String var6 = GoodType.getExtra(var2[0].getValue(), GoodType.Extras[8]);
         if (var4 == 5) {
            String var10000 = var2[0].getValue();
            var10001 = "筬绦\u0018";
            String var10002 = "v";
            if (com.xy.v.Class10.h(var10000, "等级=", "|") != 7L) {
               var10002 = "v纂鄌饕戌胘烸粜";
               this.afx.dp("7级配饰才能点粹");
               return false;
            }
         } else if (var6 == null) {
            String var14 = "會炾粳屙怭扊胷精炶";
            this.afx.dp("有点粹属性才能粹炼");
            return false;
         }

         if (var5 == null) {
            var5 = (Class30)this.zc().j(11);
         }

         var5.oz(var2[0].getRgid(), var6, var4, false);
         return false;
      }
   }

   public BigDecimal em() {
      return this.bt;
   }

   public boolean zu(Goodstable[] var1, BigDecimal var2, String var3) {
      RoleData var4;
      LoginResult var5;
      if ((var5 = (var4 = this.yx()).getLoginResult()).getGold().longValue() < var2.longValue()) {
         String var78 = "醐钔乌趖";
         this.afx._do("金钱不足");
         return false;
      } else {
         ArrayList var6 = new ArrayList();
         int var7 = 0;
         int var8 = -1;

         int var9;
         for (int var10000 = var9 = 0; var10000 < var1.length; var10000 = ++var9) {
            if (var1[var9] != null) {
               var8 = var9;
               var7++;
               if (var1[var9].getGoodlock() == 1) {
                  String var57 = "误牮哋巵袡劧锋";
                  this.afx.dp("该物品已被加锁");
                  return false;
               }

               int var10 = 1;

               int var11;
               for (int var26 = var11 = 0; var26 < var6.size(); var26 = ++var11) {
                  if (var1[var9].getRgid().compareTo((BigDecimal)var6.get(var11)) == 0) {
                     var10++;
                  }
               }

               if (var10 > var1[var9].getUsetime()) {
                  String var10002 = "诒冐齵爨哤凌杀";
                  this.afx._do("请凑齐物品再来");
                  return false;
               }

               var6.add(var1[var9].getRgid());
            }
         }

         if (var8 + 1 != var7) {
            String var77 = ")^诽圯弟寻畆靥柯県兦弈&妅枖弒寶畋靨沦會対庞八弅'聞糼箫琁呒衢兏";
            this.afx._do("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
            return false;
         } else {
            SuitOperBean var16;
            int var34;
            label179: {
               var9 = 1;
               var16 = new SuitOperBean();
               String var10001 = "鄌饕烸粜";
               if (var3.equals("配饰点粹")) {
                  var16.setType(81);
                  String var27 = var1[0].getValue();
                  var10001 = "筃纠7";
                  String var58 = "Y";
                  if (com.xy.v.Class10.h(var27, "等级=", "|") != 7L) {
                     var58 = "震見0纭酊饺扊胷炾粳";
                     this.afx._do("需要7级配饰才能点粹");
                     return false;
                  }
               } else {
                  var10001 = "鄌饕糸炙";
                  if (var3.equals("配饰粹炼")) {
                     var16.setType(82);
                     String var38 = var1[0].getValue();
                     var10001 = "炳精屔怠,";
                     String var74 = "Y";
                     String var20;
                     if ((var20 = com.xy.v.Class10.a(var38, "点粹属性&", "|")) == null) {
                        var74 = "會炾粳屙怭扊胷精炶";
                        this.afx.dp("有点粹属性才能粹炼");
                        return false;
                     }

                     var10001 = "\u0003";
                     int var24;
                     int var25;
                     int var13 = ((var24 = var20.indexOf("&")) != -1 ? (var25 = Integer.parseInt(var20.substring(0, var24))) : (var25 = 33)) >> 5 & 31;
                     int var14 = var25 & 31;
                     var34 = var9 = 1 + var13 / 8 + var14 / 8;
                     break label179;
                  }

                  var10001 = "酊饺刁觩";
                  if (var3.equals("配饰分解")) {
                     var34 = 0;
                     var16.setType(83);

                     for (int var19 = 0; var34 < var1.length; var34 = ++var19) {
                        if (var1[var19] != null) {
                           String var36 = var1[var19].getValue();
                           var10001 = "筬绦\u0018";
                           String var70 = "v";
                           if (com.xy.v.Class10.h(var36, "等级=", "|") < 4L) {
                              var70 = "杁尴靁覤u纂鄌饕戌胘則视";
                              this.afx._do("最少需要4级配饰才能分解");
                              return false;
                           }

                           String var37 = var1[var19].getValue();
                           var10001 = GoodType.Extras[8];
                           var70 = "v";
                           if (com.xy.v.Class10.a(var37, var10001, "|") != null) {
                              var70 = "鄌饕嶳本烸粜尟怂斡泰則视";
                              this.afx._do("配饰已有点粹属性无法分解");
                              return false;
                           }
                        }
                     }

                     var34 = var9;
                     break label179;
                  }

                  var10001 = "酊饺精叜";
                  if (var3.equals("配饰粹取")) {
                     var16.setType(84);
                     String var28 = var1[0].getValue();
                     var10001 = "筬绦\u0018";
                     String var60 = "v";
                     if (com.xy.v.Class10.h(var28, "等级=", "|") != 7L) {
                        var60 = "靁覤v纂鄌饕戌胘糸右";
                        this.afx._do("需要7级配饰才能粹取");
                        return false;
                     }

                     String var29 = var1[0].getValue();
                     var10001 = GoodType.Extras[8];
                     var60 = "v";
                     if (com.xy.v.Class10.a(var29, var10001, "|") == null) {
                        var60 = "鄌饕泠本烸粜尟怂斡泰糸右";
                        this.afx._do("配饰没有点粹属性无法粹取");
                        return false;
                     }

                     String var30 = var1[1].getValue();
                     var10001 = GoodType.Extras[8];
                     var60 = "v";
                     if (com.xy.v.Class10.a(var30, var10001, "|") != null) {
                        var60 = "糸玬纒晓嶳本烸粜尟怂斡泰糸右";
                        this.afx._do("粹玉结晶已有点粹属性无法粹取");
                        return false;
                     }
                  } else {
                     var10001 = "酊饺炻吂";
                     if (var3.equals("配饰炼合")) {
                        var16.setType(85);
                        String var31 = var1[0].getValue();
                        var10001 = GoodType.Extras[8];
                        String var66 = "Y";
                        if (com.xy.v.Class10.a(var31, var10001, "|") == null) {
                           var66 = "精玃绔晼沦會炾粳屙怭旧泟精叜";
                           this.afx._do("粹玉结晶没有点粹属性无法粹取");
                           return false;
                        }

                        String var32 = var1[1].getValue();
                        var10001 = "筬绦\u0018";
                        var66 = "v";
                        if (com.xy.v.Class10.h(var32, "等级=", "|") != 7L) {
                           var66 = "靁覤v纂鄌饕戌胘糸右";
                           this.afx._do("需要7级配饰才能粹取");
                           return false;
                        }

                        String var17;
                        if ((var17 = var1[0].getValue()) != null && !var17.equals("")) {
                           var10001 = "v";
                           var34 = var17.indexOf("|");
                        } else {
                           var34 = -1;
                        }

                        int var12 = var34;
                        var17 = var12 != -1 ? var17.substring(0, var12) : null;
                        if (var17 == null || !var17.equals(GoodType.i(var1[1].getType()))) {
                           var10001 = "辘丏鄌饕乌逧呉迼乫籞埊皡糸玬纒晓";
                           this.afx._do("这个配饰不适合这个类型的粹玉结晶");
                           return false;
                        }
                     }
                  }
               }

               var34 = var9;
            }

            int var21 = var34 != 1 ? 1 : var1.length;

            for (int var39 = var21; var39 < var1.length; var39 = ++var21) {
               if (var1[var21] != null && var1[var21].getUsetime() < var9) {
                  String var75 = "诽凖齚牮哋冊杯";
                  this.afx._do("请凑齐物品再来");
                  return false;
               }
            }

            var34 = 0;
            var5.setGold(var5.getGold().subtract(var2));

            for (int var22 = 0; var34 < var1.length; var34 = ++var22) {
               if (var1[var22] != null && (var22 != 0 || var16.getType() != 81 && var16.getType() != 82 && var16.getType() != 84)) {
                  var1[var22].n(var22 == 0 ? 1 : var9);
                  if (var1[var22].getUsetime() <= 0) {
                     var4.ag(var1[var22].getRgid());
                     this.ahe[var22].bb(null);
                  }
               }
            }

            var16.setGoods(var6);
            String var23 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var16));
            this.za().k(var23);
            return true;
         }
      }
   }

   public boolean zv(Goodstable[] var1, BigDecimal var2, List<BigDecimal> var3) {
      RoleData var4;
      LoginResult var5;
      LoginResult var10000 = var5 = (var4 = this.yx()).getLoginResult();
      int var6 = var1[1].getUsetime();
      long var7;
      if ((var7 = var10000.getGold().longValue()) / var2.longValue() < var6) {
         var6 = (int)(var7 / var2.longValue());
      }

      int var9 = 0;
      String var18 = var1[0].getValue();
      String var10001 = "\u001dY";
      String[] var10;
      if (MsgUntil.getGoodLvl((var10 = var18.split("\\|"))[0]) >= 7) {
         String var31 = "迟沫弇攴?纭佮饺埾共";
         this.afx._do("还没开放8级佩饰培养");
         return false;
      } else {
         if (GoodType.aq(var1[1].getType())) {
            if (this.za().l(2, 11)) {
               String var30 = "刮酨餱叏儀讝伾甍鄌饕糿卫";
               this.afx.dp("副配饰只允许使用配饰精华");
               return false;
            }

            if (MsgUntil.getGoodLvl(var1[1].getValue()) >= 2) {
               String var29 = "剥酊饺巵绅边刺5纭仢一";
               this.afx.dp("副配饰已经达到2级以上");
               return false;
            }
         }

         int var11 = 0;

         int var12;
         for (int var19 = var12 = 0; var19 < var10.length; var19 = ++var12) {
            if (var10[var12].length() >= 2) {
               String var20 = var10[var12].substring(0, 2);
               var10001 = "垸兞";
               if (var20.equals("培养")) {
                  String var21 = var10[var12];
                  var10001 = "7";
                  String var22 = var21.split("=")[1];
                  var10001 = "\n";
                  String[] var23 = var22.split("/");
                  int var14 = Integer.parseInt(var23[0]);
                  var9 = (var11 = Integer.parseInt(var23[1])) - var14 + 1;
               }
            }
         }

         if (var11 == 0) {
            String var28 = "误酊饺旧泟埾共";
            this.afx._do("该配饰无法培养");
            return false;
         } else {
            if (var9 > var6) {
               var9 = var6;
            }

            if (var9 <= 0) {
               String var27 = "\u0006\u0018诒冐齵爨哤凌杀";
               this.afx.dp("#Y请凑齐物品再来");
               return false;
            } else {
               var2 = new BigDecimal(var2.longValue() * var9);
               if (var5.getGold().longValue() < var2.longValue()) {
                  String var10002 = "$S釖钻上趹";
                  this.afx.dp("#Y金钱不足");
                  return false;
               } else {
                  GameView var10003 = this.afx;
                  String var10006 = "严镯埜儺亣";
                  StringBuilder var10004 = new StringBuilder("一键培养了").append(var9);
                  String var10005 = "欫";
                  var10003._do(var10004.append("次").toString());
                  var5.setGold(var5.getGold().subtract(var2));
                  SuitOperBean var16 = new SuitOperBean();
                  PartJade var13 = new PartJade(-1L, -1);
                  var13.setJade1(var9);
                  var16.setType(15);
                  var1[0].setUsetime(0);
                  var4.ag(var1[0].getRgid());
                  this.ahe[0].bb(null);
                  var1[1].n(var9);
                  if (var1[1].getUsetime() <= 0) {
                     var4.ag(var1[1].getRgid());
                     this.ahe[1].bb(null);
                  }

                  var16.setJade(var13);
                  var16.setGoods(var3);
                  String var17 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var16));
                  this.za().k(var17);
                  return true;
               }
            }
         }
      }
   }

   public String zw() {
      int var1 = 0;
      int var2 = -1;
      int var3;
      int var10000 = var3 = 0;

      while (true) {
         if (var10000 >= this.ahe.length) {
            var10000 = var2;
            break;
         }

         if (!this.ahe[var3].isVisible()) {
            var10000 = var2;
            break;
         }

         if (Class92.ahp(this.ahe[var3]).il() == 1) {
            var1++;
            var2 = var3;
         }

         var10000 = ++var3;
      }

      if (var10000 + 1 != var1) {
         String var11 = "5";
         return "?";
      } else {
         Goodstable var4;
         if ((var4 = this.ahe[0].aho()) != null && GoodType.h(var4.getType())) {
            if (var1 == 1) {
               String var7 = var4.getValue();
               String var10001 = "炻噢屙怭";
               if (var7.indexOf("炼器属性") != -1) {
                  String var10 = "湄陁";
                  return "清除";
               }
            }

            if (var1 == 2 && this.ahe[1].ee() == 505L) {
               String var9 = "弇元";
               return "开光";
            } else if (var1 == 4 && this.ahe[1].ee() == 507L && this.ahe[2].ee() == 507L && this.ahe[3].ee() == 507L) {
               return "炼器";
            } else {
               String var8 = "\u001a";
               return "?";
            }
         } else {
            String var6 = "\u001a";
            return "?";
         }
      }
   }

   public boolean yd(boolean var1) {
      String var2;
      String var10000 = var2 = this.jg();
      String var10001 = "\u001a";
      if (var10000.equals("?")) {
         return false;
      } else {
         Goodstable[] var3;
         if ((var3 = this.zq()) == null) {
            return false;
         } else if (this.cn == 0) {
            return this.zr(var2, var3, var1);
         } else if (this.cn == 1) {
            return this.zt(var2, var3, var1);
         } else {
            return this.cn == 2 ? this.zx(var2, var3, var1) : false;
         }
      }
   }

   public void ci(String var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ahe.length; var10000 = var2) {
         this.ahe[var2].dq(null);
         this.ahe[var2++].bb(null);
      }

      Class64 var4;
      label116: {
         if (!com.xy.v.Class12.h(var1)) {
            String var5 = "烽匳袄夢";
            if (var1.equals("炼化装备")) {
               var4 = this;
               Class92 var136 = this.ahe[0];
               String var141 = "晩逐裂复";
               var136.dq("普通装备");
               Class92 var126 = this.ahe[1];
               String var137 = "凄东";
               var126.dq("内丹");
               Class92 var98 = this.ahe[2];
               String var127 = "衊玵珛";
               var98.dq("血玲珑");
               Class92 var53 = this.ahe[3];
               String var99 = "东彌";
               var53.dq("九彩");
               break label116;
            }

            var5 = "炻匜仞噢";
            if (var1.equals("炼化仙器")) {
               var4 = this;
               Class92 var96 = this.ahe[0];
               String var125 = "亘噍";
               var96.dq("仙器");
               Class92 var52 = this.ahe[1];
               String var97 = "仞噢粹卄";
               var52.dq("仙器精华");
               break label116;
            }

            var5 = "烽匳礟児";
            if (var1.equals("炼化神兵")) {
               var4 = this;
               Class92 var94 = this.ahe[0];
               String var124 = "祙兿";
               var94.dq("神兵");
               Class92 var51 = this.ahe[1];
               String var95 = "祻儴矖";
               var51.dq("神兵石");
               break label116;
            }

            var5 = "裂复扔逪";
            if (var1.equals("装备打造")) {
               var4 = this;
               Class92 var92 = this.ahe[0];
               String var123 = "是逿袄夢";
               var92.dq("普通装备");
               Class92 var50 = this.ahe[1];
               String var93 = "矸矹";
               var50.dq("矿石");
               break label116;
            }

            var5 = "袄夢嶪铝";
            if (var1.equals("装备巫铸")) {
               var4 = this;
               Class92 var121 = this.ahe[0];
               String var135 = "晩逐裂复";
               var121.dq("普通装备");
               Class92 var90 = this.ahe[1];
               String var122 = "瞾矖";
               var90.dq("矿石");
               Class92 var49 = this.ahe[2];
               String var91 = "巬铲杗斓";
               var49.dq("巫铸材料");
               break label116;
            }

            var5 = "遡垮醌铝";
            if (var1.equals("造型重铸")) {
               var4 = this;
               Class92 var88 = this.ahe[0];
               String var120 = "仞噢";
               var88.dq("仙器");
               Class92 var48 = this.ahe[1];
               String var89 = "釨钹矖";
               var48.dq("重铸石");
               break label116;
            }

            var5 = "伞伾裂复區纭";
            if (var1.equals("伙伴装备升级")) {
               var4 = this;
               Class92 var86 = this.ahe[0];
               String var119 = "佘休袄夢";
               var86.dq("伙伴装备");
               Class92 var47 = this.ahe[1];
               String var87 = "矸矹";
               var47.dq("矿石");
               break label116;
            }

            var5 = "佘休袄夢醌铝";
            if (var1.equals("伙伴装备重铸")) {
               var4 = this;
               Class92 var84 = this.ahe[0];
               String var118 = "伞伾裂复";
               var84.dq("伙伴装备");
               Class92 var46 = this.ahe[1];
               String var85 = "瞾矖";
               var46.dq("矿石");
               break label116;
            }

            var5 = "伞伾裂复埾共";
            if (var1.equals("伙伴装备培养")) {
               var4 = this;
               Class92 var82 = this.ahe[0];
               String var117 = "佘休袄夢";
               var82.dq("伙伴装备");
               Class92 var45 = this.ahe[1];
               String var83 = "伞伾裂复";
               var45.dq("伙伴装备");
               break label116;
            }

            var5 = "伨饕垸兞";
            if (var1.equals("佩饰培养")) {
               var4 = this;
               Class92 var80 = this.ahe[0];
               String var116 = "佮饺";
               var80.dq("佩饰");
               Class92 var44 = this.ahe[1];
               String var81 = "伨饕";
               var44.dq("佩饰");
               break label116;
            }

            if (var1.equals("佩饰重铸")) {
               if (this.za().gameType == 2) {
                  var4 = this;
                  Class92 var133 = this.ahe[0];
                  String var140 = "佮饺";
                  var133.dq("佩饰");
                  Class92 var113 = this.ahe[1];
                  String var134 = "凄东";
                  var113.dq("内丹");
                  Class92 var76 = this.ahe[2];
                  String var114 = "衊玵珛";
                  var76.dq("血玲珑");
                  Class92 var42 = this.ahe[3];
                  String var77 = "东彌";
                  var42.dq("九彩");
               } else {
                  var4 = this;
                  Class92 var78 = this.ahe[0];
                  String var115 = "佮饺";
                  var78.dq("佩饰");
                  Class92 var43 = this.ahe[1];
                  String var79 = "瞾矖";
                  var43.dq("矿石");
               }
               break label116;
            }

            var5 = "抮躬第埾共";
            if (var1.equals("护身符培养")) {
               var4 = this;
               Class92 var74 = this.ahe[0];
               String var112 = "抁軪笃";
               var74.dq("护身符");
               Class92 var41 = this.ahe[1];
               String var75 = "抮躬第";
               var41.dq("护身符");
               break label116;
            }

            var5 = "抁軪笃醌铝";
            if (var1.equals("护身符重铸")) {
               var4 = this;
               Class92 var72 = this.ahe[0];
               String var111 = "抮躬第";
               var72.dq("护身符");
               Class92 var40 = this.ahe[1];
               String var73 = "瞾矖";
               var40.dq("矿石");
               break label116;
            }

            var5 = "彣晱矹埾共";
            if (var1.equals("彩晶石培养")) {
               var4 = this;
               Class92 var70 = this.ahe[0];
               String var110 = "彌昷矖";
               var70.dq("彩晶石");
               Class92 var39 = this.ahe[1];
               String var71 = "彣晱矹";
               var39.dq("彩晶石");
               break label116;
            }

            var5 = "鄌饕烸粜";
            if (var1.equals("配饰点粹")) {
               var4 = this;
               Class92 var108 = this.ahe[0];
               String var132 = "佮饺";
               var108.dq("佩饰");
               Class92 var68 = this.ahe[1];
               String var109 = "蠤夌礟矖";
               var68.dq("补天神石");
               Class92 var38 = this.ahe[2];
               String var69 = "衊玵珛";
               var38.dq("血玲珑");
               break label116;
            }

            var5 = "鄌饕糸炙";
            if (var1.equals("配饰粹炼")) {
               var4 = this;
               Class92 var106 = this.ahe[0];
               String var131 = "佮饺";
               var106.dq("佩饰");
               Class92 var66 = this.ahe[1];
               String var107 = "糸玬";
               var66.dq("粹玉");
               Class92 var37 = this.ahe[2];
               String var67 = "畞元精玃";
               var37.dq("留光粹玉");
               break label116;
            }

            var5 = "鄌饕糸右";
            if (var1.equals("配饰粹取")) {
               var4 = this;
               Class92 var64 = this.ahe[0];
               String var105 = "佮饺";
               var64.dq("佩饰");
               Class92 var36 = this.ahe[1];
               String var65 = "糸玬纒晓";
               var36.dq("粹玉结晶");
               break label116;
            }

            var5 = "酊饺炻吂";
            if (var1.equals("配饰炼合")) {
               var4 = this;
               Class92 var62 = this.ahe[1];
               String var104 = "伨饕";
               var62.dq("佩饰");
               Class92 var35 = this.ahe[0];
               String var63 = "精玃绔晼";
               var35.dq("粹玉结晶");
               break label116;
            }

            var5 = "鄌饕則视";
            if (var1.equals("配饰分解")) {
               var4 = this;
               Class92 var34 = this.ahe[0];
               String var61 = "佮饺";
               var34.dq("佩饰");
               break label116;
            }

            var5 = "亘噍則视";
            if (var1.equals("仙器分解")) {
               var4 = this;
               Class92 var33 = this.ahe[0];
               String var60 = "仞噢";
               var33.dq("仙器");
               break label116;
            }

            var5 = "彁公";
            if (var1.equals("开光")) {
               var4 = this;
               Class92 var58 = this.ahe[0];
               String var103 = "歡噢";
               var58.dq("武器");
               Class92 var32 = this.ahe[1];
               String var59 = "东玡亘玬";
               var32.dq("九玄仙玉");
               break label116;
            }

            if (var1.equals("炼器")) {
               var4 = this;
               Class92 var129 = this.ahe[0];
               String var139 = "歡噢";
               var129.dq("武器");
               Class92 var101 = this.ahe[1];
               String var130 = "萘鬅沼";
               var101.dq("落魄沙");
               Class92 var56 = this.ahe[2];
               String var102 = "萷魃沓";
               var56.dq("落魄沙");
               Class92 var31 = this.ahe[3];
               String var57 = "萘鬅沼";
               var31.dq("落魄沙");
               break label116;
            }

            var5 = "渂陮炻噢";
            if (var1.equals("清除炼器")) {
               var4 = this;
               Class92 var30 = this.ahe[0];
               String var55 = "欧噍";
               var30.dq("武器");
               break label116;
            }

            var5 = "坚骖癴炻丳";
            if (var1.equals("坐骑百炼丹")) {
               var4 = this;
               Class92 var10006 = this.ahe[0];
               String var10007 = "癛烽东";
               var10006.dq("百炼丹");
               Class92 var10005 = this.ahe[1];
               String var142 = "癴炻丳";
               var10005.dq("百炼丹");
               Class92 var10004 = this.ahe[2];
               String var138 = "炙姗矖";
               var10004.dq("炼妖石");
               Class92 var10003 = this.ahe[3];
               String var128 = "炶妑矹";
               var10003.dq("炼妖石");
               Class92 var10002 = this.ahe[4];
               String var100 = "炙姗矖";
               var10002.dq("炼妖石");
               Class92 var29 = this.ahe[5];
               String var54 = "炶妑矹";
               var29.dq("炼妖石");
               break label116;
            }

            var5 = "宭拥矖則视";
            if (var1.equals("守护石分解")) {
               Class92 var3 = this.ahe[0];
               var5 = "宂抣矹";
               var3.dq("守护石");
            }
         }

         var4 = this;
      }

      var4.h();
   }

   public void ak(com.xy.q.Class54 var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ahe.length; var10000 = ++var2) {
         if (Class92.ahp(this.ahe[var2]) == var1) {
            this.ahe[var2].bb(null);
            this.zc().f(46);
            this.h();
            return;
         }
      }
   }

   public boolean zx(String var1, Goodstable[] var2, boolean var3) {
      if (var1.equals("炼器")) {
         Class30 var4;
         if ((var4 = (Class30)this.zc().l(11)) != null && var4.pa(1, var2[0].getRgid())) {
            return this.zs(var4, var2, this.bt, 1);
         } else {
            String var10000 = var2[0].getValue();
            String var7 = "炻噢屙怭";
            String var5 = GoodType.getExtra(var10000, "炼器属性");
            if (var4 == null) {
               var4 = (Class30)this.zc().j(11);
            }

            var4.oz(var2[0].getRgid(), var5, 1, true);
            return false;
         }
      } else {
         String var10001 = "湄陁";
         if (var1.equals("清除")) {
            return this.zs(null, var2, this.bt, 3);
         } else {
            var10001 = "弇元";
            return var1.equals("开光") ? this.zs(null, var2, this.bt, 0) : false;
         }
      }
   }

   // $VF: synthetic method
   static JList zy(Class64 var0) {
      return var0.m;
   }

   public void f() {
      int var1 = 1 + this.yx().goodPacks.length / 24;
      if (this.ahh == null || this.ahh.length != var1) {
         this.ahh = this.zd(this.ahh, var1, this.ahg.ah());
         short var2 = 524;
         short var3 = 283;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.ahh.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.ahh[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.ahg.vr(this.ahh, 0);
      }
   }

   public String zz() {
      int var1 = 0;
      int var2 = -1;
      int var3;
      int var10000 = var3 = 0;

      while (true) {
         if (var10000 >= this.ahe.length) {
            var10000 = var2;
            break;
         }

         if (!this.ahe[var3].isVisible()) {
            var10000 = var2;
            break;
         }

         if (Class92.ahp(this.ahe[var3]).il() == 1) {
            var1++;
            var2 = var3;
         }

         var10000 = ++var3;
      }

      if (var10000 + 1 != var1) {
         String var33 = "5";
         return "?";
      } else if (var1 != 2 || !GoodType.aq(this.ahe[0].ee()) || !GoodType.aq(this.ahe[1].ee()) && this.ahe[1].ee() != 1008L) {
         if (this.za().gameType == 2) {
            if (var1 == 4 && GoodType.aq(this.ahe[0].ee()) && this.ahe[1].ee() == 497L && this.ahe[2].ee() == 499L && this.ahe[3].ee() == 498L) {
               return "佩饰重铸";
            }
         } else if (var1 == 2 && GoodType.aq(this.ahe[0].ee()) && GoodType.u(this.ahe[1].ee())) {
            return "佩饰重铸";
         }

         if (var1 == 2 && GoodType.ao(this.ahe[0].ee()) && GoodType.ao(this.ahe[1].ee())) {
            String var32 = "抮躬第埾共";
            return "护身符培养";
         } else if (var1 == 2 && GoodType.ao(this.ahe[0].ee()) && GoodType.u(this.ahe[1].ee())) {
            String var31 = "抁軪笃醌铝";
            return "护身符重铸";
         } else if (var1 == 2 && this.ahe[0].ee() == 729L && this.ahe[1].ee() == 729L) {
            String var30 = "彣晱矹埾共";
            return "彩晶石培养";
         } else if (var1 == 4 && this.ahe[0].ee() == 8889L && this.ahe[1].ee() == 8889L && this.ahe[2].ee() == 8889L && this.ahe[3].ee() == 8889L) {
            String var29 = "禙矖呉戵";
            return "秘石合成";
         } else if (var1 == 3 && GoodType.y(this.ahe[0].ee()) && this.ahe[1].aho().getGoodsid().intValue() == 309 && this.ahe[2].ee() == 499L) {
            String var28 = "酊饺炾粳";
            return "配饰点粹";
         } else if (var1 != 2 && var1 != 3 || !GoodType.y(this.ahe[0].ee()) || this.ahe[1].ee() != 777L || var1 != 2 && (var1 != 3 || this.ahe[2].ee() != 778L)
            )
          {
            if (var1 == 2 && GoodType.y(this.ahe[0].ee()) && this.ahe[1].ee() == 779L) {
               String var27 = "酊饺精叜";
               return "配饰粹取";
            } else if (var1 == 2 && GoodType.y(this.ahe[1].ee()) && this.ahe[0].ee() == 779L) {
               String var26 = "鄌饕烽吭";
               return "配饰炼合";
            } else {
               if (var1 >= 1) {
                  boolean var5 = true;
                  int var4;
                  var10000 = var4 = 0;

                  boolean var17;
                  while (true) {
                     if (var10000 >= this.ahe.length) {
                        var17 = var5;
                        break;
                     }

                     if (Class92.ahp(this.ahe[var4]).il() == 1 && !GoodType.y(this.ahe[var4].ee())) {
                        var17 = var5 = false;
                        break;
                     }

                     var10000 = ++var4;
                  }

                  if (var17) {
                     String var25 = "酊饺刁觩";
                     return "配饰分解";
                  }
               }

               if (this.za().gameType == 2 && var1 >= 1) {
                  boolean var7 = true;
                  int var11;
                  var10000 = var11 = 0;

                  boolean var19;
                  while (true) {
                     if (var10000 >= this.ahe.length) {
                        var19 = var7;
                        break;
                     }

                     if (Class92.ahp(this.ahe[var11]).il() == 1 && !GoodType.w(this.ahe[var11].ee())) {
                        var19 = var7 = false;
                        break;
                     }

                     var10000 = ++var11;
                  }

                  if (var19) {
                     String var24 = "亘噍則视";
                     return "仙器分解";
                  }

                  if (this.za().gameMount) {
                     var7 = true;
                     var10000 = var11 = 0;

                     boolean var21;
                     while (true) {
                        if (var10000 >= this.ahe.length) {
                           var21 = var7;
                           break;
                        }

                        if (Class92.ahp(this.ahe[var11]).il() == 1 && this.ahe[var11].ee() != 108L) {
                           var21 = var7 = false;
                           break;
                        }

                        var10000 = ++var11;
                     }

                     if (var21) {
                        String var23 = "宂抣矹刁觩";
                        return "守护石分解";
                     }
                  }
               }

               String var22 = "\u001a";
               return "?";
            }
         } else {
            String var15 = "鄌饕糸炙";
            return "配饰粹炼";
         }
      } else {
         String var14 = "乁锋垸兞";
         return "一键培养";
      }
   }

   public void aaa(Goodstable[] var1, String var2) {
      String var10000 = var1[0].getValue();
      String var10001 = "奴呉広";
      var10000 = MsgUntil.getPalEquipAgree(var10000, "契合度");
      var10001 = "7";
      var10000 = var10000.split("=")[1];
      var10001 = "\n";
      String[] var5 = var10000.split("/");
      var10000 = "裂复區纭";
      if ("装备升级".equals(var2)) {
         if (Integer.parseInt(var5[0]) < Integer.parseInt(var5[1])) {
            var10001 = "认裠奆奴呉広乌夺";
            this.afx._do("该装备契合度不够");
            return;
         }
      } else {
         var10000 = "裂复埾共";
         if ("装备培养".equals(var2)) {
            if (Integer.parseInt(var5[0]) >= Integer.parseInt(var5[1])) {
               var10001 = "认裠奆奴呉広嶳滄";
               this.afx._do("该装备契合度已满");
               return;
            }

            if (GoodType.x(var1[1].getType())) {
               var10000 = var1[1].getValue();
               var10001 = "筎纭";
               var10000 = MsgUntil.getPalEquipAgree(var10000, "等级");
               var10001 = "\u0018";
               if (Integer.parseInt(var10000.split("=")[1]) >= 4) {
                  var10001 = "裏夀>纠仯不匏拫>纠&上胷佛丰埾共達兽";
                  this.afx._do("装备4级以上包括4级,不能作为培养道具");
                  return;
               }
            } else if (var1[1].getType() != 7511L) {
               var10001 = "乌昊佘休袄夢垸兞递兒";
               this.afx._do("不是伙伴装备培养道具");
               return;
            }
         }
      }

      SuitOperBean var6 = new SuitOperBean();
      ArrayList var7 = new ArrayList();

      int var8;
      for (int var16 = var8 = 0; var16 < var1.length; var16 = ++var8) {
         if (var1[var8] != null) {
            var7.add(var1[var8].getRgid());
         }
      }

      var6.setGoods(var7);
      String var10002 = "裂复埾共";
      var6.setType(62 - ("装备培养".equals(var2) ? 1 : 0));
      String var9 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var6));
      this.za().k(var9);
   }

   public boolean aab(Goodstable[] var1, BigDecimal var2, String var3, List<BigDecimal> var4) {
      RoleData var5;
      LoginResult var6 = (var5 = this.yx()).getLoginResult();
      NpcComposeBean var7 = new NpcComposeBean();
      BigDecimal var10000;
      if (var3.equals("佩饰重铸")) {
         if (this.za().gameType != 2) {
            String var19 = var1[0].getValue();
            int var24 = MsgUntil.getGoodLvl(var1[0].getValue());
            int var31 = MsgUntil.getGoodLvl(var1[1].getValue());
            if (var24 != var31 - 3) {
               GameView var92 = this.afx;
               String var113 = "诒伾甍";
               StringBuilder var107 = new StringBuilder("请使用").append(var24 + 3);
               String var112 = "纠矵矴近衋采铿+";
               var92._do(var107.append("级矿石进行重铸!").toString());
               return false;
            }
         }

         String var58 = var1[0].getValue();
         String var89 = GoodType.Extras[8];
         String var103 = "Y";
         if (com.xy.v.Class10.a(var58, var89, "|") != null) {
            var103 = "酊饺巵會炾粳屙怭旧泟释铲";
            this.afx._do("配饰已有点粹属性无法重铸");
            return false;
         }

         String var59 = var1[0].getValue();
         var89 = GoodType.Extras[3];
         var103 = "Y";
         if (com.xy.v.Class10.a(var59, var89, "|") != null) {
            var103 = "酊饺巵會奐裏屙怭旧泟释铲";
            this.afx._do("配饰已有套装属性无法重铸");
            return false;
         }

         var89 = "扐覤醌铝餱哤";
         var7.setComposetype("我要重铸饰品");
         var10000 = var2;
      } else {
         String var10001 = "抮躬第埾共";
         if (var3.equals("护身符培养")) {
            String var46 = var1[0].getValue();
            var10001 = "\u001dY";
            String[] var18 = var46.split("\\|");
            int var23 = 0;

            int var29;
            for (int var47 = var29 = 0; var47 < var18.length; var47 = ++var29) {
               String var48 = var18[var29];
               var10001 = "7";
               String[] var34;
               String var49 = (var34 = var48.split("="))[0];
               var10001 = "咀贍";
               if (var49.equals("品质")) {
                  String var50 = var34[1];
                  var10001 = "%";
                  var23 = Integer.parseInt(var50.split("/")[0]);
                  break;
               }
            }

            int var30;
            int var57;
            label159: {
               var30 = 800;
               String var51 = var1[0].getValue();
               var10001 = "烽匳尟怂";
               String var35;
               if ((var35 = GoodType.getExtra(var51, "炼化属性")) != null) {
                  var10001 = ",";
                  String[] var12 = var35.split("&");

                  int var13;
                  for (int var52 = var13 = 0; var52 < var12.length; var52 = ++var13) {
                     String var53 = var12[var13];
                     var10001 = "\u0018";
                     String[] var14;
                     String var54 = (var14 = var53.split("="))[0];
                     var10001 = "牾把";
                     int var15;
                     if (var54.equals("特技")) {
                        for (int var55 = var15 = 1; var55 < var14.length; var55 = ++var15) {
                           String var56 = var14[var15];
                           var10001 = "y\u0015r\u0014";
                           if (var56.equals("8031")) {
                              var30 = 900;
                              var57 = var23;
                              break label159;
                           }
                        }
                     }
                  }
               }

               var57 = var23;
            }

            if (var57 > var30) {
               GameView var88 = this.afx;
               String var10004 = "询抮躬第哆财夠亄";
               StringBuilder var102 = new StringBuilder("该护身符品质大于").append(var30);
               String var111 = "含斡泰垸兞";
               var88.dp(var102.append("后无法培养").toString());
               return false;
            }

            var10001 = "戛覆埳兼抮躬第";
            var7.setComposetype("我要培养护身符");
            var10000 = var2;
         } else {
            var10001 = "抁軪笃醌铝";
            if (var3.equals("护身符重铸")) {
               String var36 = var1[0].getValue();
               var10001 = "[v";
               String[] var17 = var36.split("\\|");
               byte var22 = 0;

               int var41;
               label176: {
                  int var27;
                  for (int var37 = var27 = 0; var37 < var17.length; var37 = ++var27) {
                     String var38 = var17[var27];
                     var10001 = "\u0018";
                     String[] var11;
                     String var39 = (var11 = var38.split("="))[0];
                     var10001 = "哆财";
                     if (var39.equals("品质")) {
                        String var40 = var11[1];
                        var10001 = "\n";
                        var41 = Integer.parseInt(var40.split("/")[0]);
                        break label176;
                     }
                  }

                  var41 = var22;
               }

               if (var41 < 300) {
                  String var101 = "询抮躬第哆财佉亄4:7皎震見埾共";
                  this.afx.dp("该护身符品质低于300的需要培养");
                  return false;
               }

               String var42 = var1[1].getValue();
               var10001 = "\u0018";
               int var28;
               if ((var28 = Integer.parseInt(var42.split("=")[1])) != 9 && var28 != 10) {
                  String var100 = "抮躬第释铲佸產>纭矸矹+卍纠併甯;7纭矸矹";
                  this.afx.dp("护身符重铸使用9级矿石,升级使用10级矿石");
                  return false;
               }

               var10001 = "戴觀釨钹抁軪笃";
               var7.setComposetype("我要重铸护身符");
               String var43 = var1[0].getValue();
               var10001 = "[v";
               String var44 = var43.split("\\|")[0];
               var10001 = "\u0018";
               int var32 = Integer.parseInt(var44.split("=")[1]);
               if (var28 == 10) {
                  if (++var32 > (this.za().f() ? 9 : 7)) {
                     GameView var45 = this.afx;
                     String var110 = "抣躡笡筃纠朊髟丰";
                     StringBuilder var77 = new StringBuilder("护身符等级最高为").append(this.za().f() ? 9 : 7);
                     String var99 = "纂";
                     var45.dp(var77.append("级").toString());
                     return false;
                  }
               }

               var10000 = var2;
            } else {
               var10001 = "彣晱矹埾共";
               if (var3.equals("彩晶石培养")) {
                  var10000 = var2;
                  String var98 = "埜儺彌昷矖";
                  var7.setComposetype("培养彩晶石");
               } else {
                  var10001 = "裂复扔逪";
                  if (!var3.equals("装备打造")) {
                     var10001 = "裂复巬铲";
                     if (!var3.equals("装备巫铸")) {
                        return false;
                     }

                     int var16 = MsgUntil.getGoodLvl(var1[0].getValue());
                     int var21 = MsgUntil.getGoodLvl(var1[1].getValue());
                     if (var16 < 10) {
                        String var97 = "扶遡\u0014l\u0014q纂袄夢叺镚寈埫戒铤钻扛凮铤卡\u0004";
                        this.afx.dp("打造1-10级装备去长安城打铁铺找冯铁匠!");
                        return false;
                     }

                     if (var16 >= 10 && var16 <= 13) {
                        if (var21 != 8 && var21 != 9) {
                           String var109 = "扙逧;6'6>纠裏夀併甯3纠矵矴+";
                           this.afx.dp("打造11-14级装备使用9级矿石!");
                           String var96 = "釨钹\u0014q\bp\u0016绦裠奆佚畩\u001d绦矚瞲\u0004";
                           this.afx.dp("重铸10-13级装备使用8级矿石!");
                           return false;
                        }
                     } else if (var16 == 14) {
                        if (var21 != 9 && var21 != 10) {
                           String var10003 = "扙逧;2纭裂复佸產6:纠矵矴+";
                           this.afx.dp("打造15级装备使用10级矿石!");
                           String var93 = "醌铝p\u0011绦裠奆佚畩\u001c绦矚瞲\u0004";
                           this.afx.dp("重铸14级装备使用9级矿石!");
                           return false;
                        }
                     } else if (var16 == 15) {
                        if (var21 != 10 && var21 != 11) {
                           String var108 = "扙逧;1纭裂复佸產6;纠矵矴+";
                           this.afx.dp("打造16级装备使用11级矿石!");
                           String var94 = "釨钹\u0014t纂袄夢伾甍p\u0015绦矚瞲\u0004";
                           this.afx.dp("重铸15级装备使用10级矿石!");
                           return false;
                        }
                     } else {
                        if (var16 != 16) {
                           var10001 = "镘诊儭弪";
                           this.afx.dp("错误公式");
                           return false;
                        }

                        if (var21 != 11) {
                           String var95 = "采铿;1纭裂复佸產6;纠矵矴+";
                           this.afx.dp("重铸16级装备使用11级矿石!");
                           return false;
                        }
                     }

                     var10001 = "裂复巬铲";
                     var7.setComposetype("装备巫铸");
                     var10000 = var2;
                  } else {
                     if (this.za().gameType == 2 && !this.za().l(2, 3)) {
                        int var8 = MsgUntil.getGoodLvl(var1[0].getValue());
                        int var9;
                        if ((var9 = MsgUntil.getGoodLvl(var1[1].getValue())) >= 6) {
                           int var10 = 5 + var9;
                           if ((var8 >= 11 || var10 != 11) && (var8 < 11 || var8 != var10 && var8 + 1 != var10)) {
                              var10001 = "靁覤伾甍宸庱笈纂盅矚瞲杀匆纂扗耠醌铝";
                              this.afx.dp("需要使用对应等级的矿石来升级或者重铸");
                              return false;
                           }
                        } else if (var8 < 11) {
                           String var10002 = "震見佸產曳髒纠皎矸矹";
                           this.afx.dp("需要使用更高级的矿石");
                           return false;
                        }
                     }

                     var10001 = "戒逅p\u0014l\u0014w纂袄夢";
                     var7.setComposetype("打造11-16级装备");
                     var10000 = var2;
                  }
               }
            }
         }
      }

      ParamTool.g(var10000.longValue(), this.afx);
      ArrayList var20 = new ArrayList();
      int var25 = 0;

      for (int var60 = var25; var60 < var1.length; var60 = ++var25) {
         if (var1[var25] != null) {
            var20.add(var1[var25].getRgid());
            var1[var25].n(1);
            if (var1[var25].getUsetime() <= 0) {
               var5.ag(var1[var25].getRgid());
               this.ahe[var25].bb(null);
            }
         }
      }

      var7.setGoodstables(var20);
      String var26 = Agreement.getSendTextAES("npccompose", com.xy.v.Class31.a().toJson(var7));
      this.za().k(var26);
      return true;
   }

   public void h() {
      String var1 = this.jg();
      if (!this.go.getText().equals(var1)) {
         Class64 var10000;
         label56: {
            this.go.setText(var1);
            String var10001 = "鄌饕烸粜";
            if (var1.equals("配饰点粹")) {
               long var2 = this.za().l(2, 12) ? 100000 : 10000000;
               if (this.bt == null || this.bt.longValue() != var2) {
                  var10000 = this;
                  this.bt = new BigDecimal(var2);
                  break label56;
               }
            } else {
               var10001 = "酊饺精叜";
               if (var1.equals("配饰粹取")) {
                  long var4 = this.za().l(2, 12) ? 20000000L : 2000000000L;
                  if (this.bt == null || this.bt.longValue() != var4) {
                     var10000 = this;
                     this.bt = new BigDecimal(var4);
                     break label56;
                  }
               } else {
                  var10001 = "坵髐癛烽东";
                  if (var1.equals("坐骑百炼丹")) {
                     long var5 = 100000L;
                     if (this.bt == null || this.bt.longValue() != var5) {
                        var10000 = this;
                        this.bt = new BigDecimal(var5);
                        break label56;
                     }
                  } else if (this.bt == null || this.bt.longValue() != 100000L) {
                     this.bt = new BigDecimal(100000);
                  }
               }
            }

            var10000 = this;
         }

         com.xy.q.Class49.b(var10000.k[0], this.bt.longValue());
      }
   }

   // $VF: synthetic method
   private boolean aac(Goodstable[] var1, BigDecimal var2, String var3, List<BigDecimal> var4, boolean var5) {
      RoleData var6;
      LoginResult var7 = (var6 = this.yx()).getLoginResult();
      SuitOperBean var8 = new SuitOperBean();
      String var10001 = "租矹吏戚";
      if (var3.equals("秘石合成")) {
         var8.setType(36);
         int var9 = -1;

         int var10;
         for (int var10000 = var10 = 0; var10000 < var1.length; var10000 = ++var10) {
            if (var1[var10] != null) {
               if (var9 == -1) {
                  String var36 = var1[var10].getValue();
                  var10001 = "\u0018";
                  var9 = Integer.parseInt(var36.split("=")[1]);
               } else {
                  var10001 = var1[var10].getValue();
                  String var10002 = "7";
                  if (var9 != Integer.parseInt(var10001.split("=")[1])) {
                     var10002 = "佚畩筬绦盝呍皡禙矖呉戵";
                     this.afx._do("使用等级相同的秘石合成");
                     return false;
                  }
               }
            }
         }

         if (var9 == -1) {
            return false;
         }

         if (var9 >= 5) {
            String var68 = "朇髒2纭";
            this.afx._do("最高5级");
            return false;
         }
      } else {
         var10001 = "遡垮醌铝";
         if (var3.equals("造型重铸")) {
            var8.setType(22);
            if (!GoodType.h(var6.getGood(var4.get(0)).getType())) {
               String var69 = "叭會歡噢扊胷释铲逧垁";
               this.afx._do("只有武器才能重铸造型");
               return false;
            }
         } else {
            var10001 = "亘噍則视";
            if (var3.equals("仙器分解")) {
               var8.setType(23);
               int var22 = 0;
               StringBuffer var37;
               if (var5) {
                  var37 = null;
               } else {
                  String var70 = ")P佪昨听覆技";
                  var37 = new StringBuffer("#W你是否要把");
               }

               StringBuffer var27 = var37;

               int var11;
               for (int var38 = var11 = 0; var38 < var1.length; var38 = ++var11) {
                  if (var1[var11] != null) {
                     if (var1[var11].getGoodlock() == 1) {
                        String var73 = "厫胘則视杫劅镀皡亘噍";
                        this.afx._do("只能分解未加锁的仙器");
                        return false;
                     }

                     if (var27 != null) {
                        String var39 = var1[var11].getValue();
                        var10001 = "阼敷7";
                        String var71 = "Y";
                        long var12;
                        if ((var12 = com.xy.v.Class5.j(var39, "阶数=", "|")) == 1L) {
                           var37 = var27;
                           var22++;
                        } else if (var12 == 2L) {
                           var37 = var27;
                           var22 += 8;
                        } else if (var12 == 3L) {
                           var37 = var27;
                           var22 += 64;
                        } else if (var12 == 4L) {
                           var37 = var27;
                           var22 += 384;
                        } else if (var12 == 5L) {
                           var37 = var27;
                           var22 += 1920;
                        } else {
                           if (var12 == 6L) {
                              var22 += 5760;
                           }

                           var37 = var27;
                        }

                        var37.append(var1[var11].getGoodsname());
                        var71 = "\"$X";
                        var27.append("(#R");
                        var27.append(MsgUntil.h((int)var12));
                        String var10004 = "\u0006\u0016阓h\u000b";
                        var27.append("#W阶).");
                     }
                  }
               }

               if (var27 != null) {
                  String var74 = "远衆刁觩)颎讦莽徐仓噯粴卉敺釈0$X";
                  var27.append("进行分解.预计获得仙器精华数量:#R");
                  var27.append(var22);
                  this.afx.dm(new ConfirmBean(22, null, var27.toString()));
                  return false;
               }
            } else {
               var10001 = "圑骴騬炙";
               if (var3.equals("坐骑驭炼")) {
                  var8.setType(141);
                  int var23 = 0;
                  int var28 = 0;

                  int var30;
                  for (int var41 = var30 = 0; var41 < var1.length; var41 = ++var30) {
                     if (var1[var30] != null) {
                        if (var1[var30].getGoodlock() == 1) {
                           GameView var60 = this.afx;
                           StringBuilder var79 = new StringBuilder(String.valueOf(var1[var30].getGoodsname()));
                           String var10003 = "袡劧锋旧泟擊佖";
                           var60._do(var79.append("被加锁无法操作").toString());
                           return false;
                        }

                        if (var30 == 0) {
                           String var42 = var1[var30].getValue();
                           var10001 = "筬绦\u0018";
                           String var75 = "v";
                           var23 = com.xy.v.Class12.f(var42, "等级=", "|");
                        } else if (var30 == 1) {
                           String var43 = var1[var30].getValue();
                           var10001 = "筬绦\u0018";
                           String var76 = "v";
                           var28 = com.xy.v.Class12.f(var43, "等级=", "|");
                        } else {
                           String var44 = var1[var30].getValue();
                           var10001 = "筬绦\u0018";
                           String var77 = "v";
                           if (com.xy.v.Class12.f(var44, "等级=", "|") < 6) {
                              var77 = "烽妳瞲朥屐\u0013绦扨肼袎騬炙";
                              this.afx._do("炼妖石最少6级才能被驭炼");
                              return false;
                           }
                        }
                     }
                  }

                  if (var23 != var28) {
                     String var80 = "震見吋纭皃癴炻丳扊胷驪炶";
                     this.afx._do("需要同级的百炼丹才能驭炼");
                     return false;
                  }
               } else {
                  var10001 = "宭拥矖則视";
                  if (var3.equals("守护石分解")) {
                     var8.setType(142);
                     int var24 = 0;
                     StringBuffer var45;
                     if (var5) {
                        var45 = null;
                     } else {
                        String var81 = ")P佪昨听覆技";
                        var45 = new StringBuffer("#W你是否要把");
                     }

                     StringBuffer var29 = var45;

                     int var31;
                     for (int var46 = var31 = 0; var46 < var1.length; var46 = ++var31) {
                        if (var1[var31] != null) {
                           if (var1[var31].getGoodlock() == 1) {
                              String var84 = "叏肼刣覢朏勡锤盅宭拥矖";
                              this.afx._do("只能分解未加锁的守护石");
                              return false;
                           }

                           if (var29 != null) {
                              AlchemySet var32 = this.yt().bi();
                              int var13 = 0;
                              String var14 = var1[var31].getValue();
                              int var15 = 0;
                              int var16;
                              int var47 = var16 = 0;

                              while (var47 < var14.length()) {
                                 var10001 = "v";
                                 if ((var16 = var14.indexOf("|", var15 + 1)) == -1) {
                                    var16 = var14.length();
                                 }

                                 int var49;
                                 label203: {
                                    var10001 = "\u0018";
                                    int var17;
                                    if ((var17 = var14.indexOf("=", var15 + 1)) != -1) {
                                       if (var17 > var16) {
                                          var49 = var16;
                                          break label203;
                                       }

                                       String var18;
                                       String var48 = var18 = var14.substring(var15, var17);
                                       var10001 = "筎纭";
                                       if (var48.equals("等级")) {
                                          var13 = com.xy.v.Class12.ad(var14, var17 + 1, var16);
                                          var49 = var16;
                                          break label203;
                                       }

                                       var10001 = "聑习";
                                       if (var18.equals("耐久")) {
                                          var49 = var16;
                                          break label203;
                                       }

                                       var10001 = "抇胷";
                                       if (var18.equals("技能")) {
                                          var15 = var17 + 1;
                                          String var82 = "\u0006";
                                          int var35 = com.xy.v.Class12.ad(var14, var14.indexOf("#", var15 + 1) + 1, var16);
                                          var24 += 120 * var35;
                                          var49 = var16;
                                          break label203;
                                       }

                                       AlchemyUnit var19 = var32 != null ? var32.getAlchemyUnit(var18) : null;
                                       if (var19 == null) {
                                          var49 = var16;
                                          break label203;
                                       }

                                       double var20 = Double.parseDouble(var14.substring(var17 + 1, var16));
                                       var24 = (int)(var24 + 600.0 * Math.min(var20 / var19.getMax(), 1.0));
                                    }

                                    var49 = var16;
                                 }

                                 var15 = var49 + 1;
                                 var47 = var16;
                              }

                              var29.append(var1[var31].getGoodsname());
                              String var83 = "\"$X";
                              var29.append("(#R");
                              var29.append(var13);
                              String var86 = "\u0006\u0016纂h\u000b";
                              var29.append("#W级).");
                           }
                        }
                     }

                     if (var29 != null) {
                        String var85 = "远衆刁觩)颎讦莽徐宂抣乁尟敺釈0$X";
                        var29.append("进行分解.预计获得守护之尘数量:#R");
                        var29.append(var24);
                        this.afx.dm(new ConfirmBean(22, null, var29.toString()));
                        return false;
                     }
                  }
               }
            }
         }
      }

      var7.setGold(var7.getGold().subtract(var2));
      int var25 = var8.getType() == 141 ? 1 : 0;

      for (int var50 = var25; var50 < var1.length; var50 = ++var25) {
         if (var1[var25] != null) {
            var1[var25].n(1);
            if (var1[var25].getUsetime() <= 0) {
               var6.ag(var1[var25].getRgid());
               this.ahe[var25].bb(null);
            }
         }
      }

      var8.setGoods(var4);
      String var26 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var8));
      this.za().k(var26);
      return true;
   }

   public void bb(Goodstable var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ahe.length; var10000 = ++var2) {
         if (this.ahe[var2].isVisible() && Class92.ahp(this.ahe[var2]).il() == 1) {
            Goodstable var3 = (Goodstable)Class92.ahp(this.ahe[var2]).jx();
            if (com.xy.v.Class12.x(var1.getRgid(), var3.getRgid())) {
               this.ahe[var2].bb(var1.getUsetime() > 0 ? var1 : null);
               this.h();
               return;
            }
         }
      }
   }

   public Class64(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 562, 520, com.xy.q.Class30.agf);
      this.pk = new DefaultListModel<>();
      this.m = new JList<>();
      this.m.setOpaque(false);
      this.m.setSelectionBackground(new Color(33, 42, 52));
      this.m.setSelectionForeground(Color.GREEN);
      this.m.setForeground(Color.GREEN);
      this.m.setFont(com.xy.q.Class49.ac);
      this.m.setBackground(com.xy.q.Class49.bk);
      this.m.setModel(this.pk);
      this.m.setSelectionMode(0);
      this.m.addListSelectionListener(new Class75(this));
      this.pl = com.xy.q.Class1.g(49, 75, 163, 202, this.m, -1);
      this.add(this.pl);
      String var10009 = "V\"\n$\nr\u0014oU/B";
      String var10014 = "5";
      this.go = new com.xy.i.Class19("sc/e/31.png", 1, 115, com.xy.q.Class49.ai, com.xy.q.Class49.bv, "?", this);
      this.go.setBounds(443, 125, 79, 25);
      this.add(this.go);
      this.ir = new JLabel[9];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ir.length; var10000 = var2) {
         String var10008 = "bF\u0007c\u0007c\u0007c";
         this.ir[var2] = com.xy.q.Class1.f(46, 54, 165, 21, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
         JLabel var6 = this.ir[var2];
         String var13;
         if (var2 == 0) {
            var13 = "巸劧兯佛址";
            var13 = "已加入作坊";
         } else if (var2 == 1) {
            var13 = "珱\u0005a\u0005a釴";
            var13 = "现    金";
         } else if (var2 == 2) {
            var13 = "涏耝釖钻";
            var13 = "消耗金钱";
         } else if (var2 == 3) {
            var13 = "佹國丞";
            var13 = "作坊主";
         } else if (var2 == 4) {
            var13 = "殲*'佇";
            var13 = "段  位";
         } else if (var2 == 5) {
            var13 = "笈\u0005a纂";
            var13 = "等  级";
         } else if (var2 == 6) {
            var13 = "句甘亭";
            var13 = "可生产";
         } else if (var2 == 7) {
            var13 = "熺纂広";
            var13 = "熟练度";
         } else if (var2 == 8) {
            var13 = "戗*'尻";
            var13 = "成  就";
         } else {
            var13 = "";
         }

         var6.setText(var13);
         if (var2 >= 1 && var2 <= 2) {
            this.ir[var2].setFont(com.xy.q.Class49.w);
            this.ir[var2].setBounds(248, 215 + (var2 - 1) * 27, 62, 19);
         }

         if (var2 >= 3 && var2 <= 9) {
            JLabel var22 = this.ir[var2];
            String var10002 = "bFq\u0015q\u0015q\u0015";
            var22.setForeground(com.xy.q.Class49.c("#c000000"));
            this.ir[var2].setBounds(41, 297 + (var2 - 3) * 32, 62, 19);
         }

         this.add(this.ir[var2++]);
      }

      this.ef = new MoneyType();
      String var10010 = "玺'釛";
      this.ef.setIdAndKey(1, "现 金");
      this.agw = com.xy.q.Class1.m(320, 215, 144, 19, 10, Color.white, com.xy.q.Class49.w, this.ef, var1);
      String var10006 = "V\"\n%\np\u0012oU/B";
      this.agw.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.agw.n(2);
      this.add(this.agw);
      this.k = new com.xy.q.Class14[7];

      for (int var7 = var2 = 0; var7 < this.k.length; var7 = var2) {
         this.k[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var8 = this.k[var2];
         String var23 = "yd%c%6=)zim";
         var8.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         Class64 var9;
         if (var2 == 0) {
            this.k[var2].setBounds(320, 242, 144, 19);
            var9 = this;
         } else {
            this.k[var2].setBounds(107, 297 + (var2 - 1) * 32, 104, 19);
            var9 = this;
         }

         var9.add(this.k[var2++]);
      }

      this.ahe = new Class92[6];

      for (int var10 = var2 = 0; var10 < this.ahe.length; var10 = var2) {
         this.ahe[var2] = new Class92(this);
         this.ahe[var2].setBounds(248 + var2 % 3 * 67, 75 + var2 / 3 * 65, 59, 58);
         this.add(this.ahe[var2++]);
      }

      this.cl = new com.xy.w.Class18[4];

      for (int var11 = var2 = 0; var11 < this.cl.length; var11 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         Class64 var12;
         if (var2 == 0) {
            var12 = this;
            com.xy.w.Class18 var28 = this.cl[var2];
            String var10003 = "V\"\n%\ns\u0010oU/B";
            var28.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(46, 54, 165, 21);
         } else if (var2 == 1) {
            var12 = this;
            com.xy.w.Class18 var29 = this.cl[var2];
            String var33 = "yd%c%5>)zim";
            var29.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(46, 54, 165, 225);
         } else if (var2 == 2) {
            var12 = this;
            com.xy.w.Class18 var30 = this.cl[var2];
            String var34 = "V\"\n%\np\u0013oU/B";
            var30.mt(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(215, 54, 310, 225);
         } else {
            if (var2 == 3) {
               com.xy.w.Class18 var24 = this.cl[var2];
               String var31 = "yd%c%63)zim";
               var24.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
               this.cl[var2].setBounds(215, 283, 309, 207);
            }

            var12 = this;
         }

         var12.add(this.cl[var2++]);
      }

      this.ahg = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 216, 285);
      String var10004 = "V\"\n%\np\u001doU/B";
      this.ahg.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.ahg.rm(true);
      this.add(this.ahg);
   }

   public String aad() {
      int var1 = 0;
      int var2 = -1;
      int var3;
      int var10000 = var3 = 0;

      while (true) {
         if (var10000 >= this.ahe.length) {
            var10000 = var2;
            break;
         }

         if (!this.ahe[var3].isVisible()) {
            var10000 = var2;
            break;
         }

         if (Class92.ahp(this.ahe[var3]).il() == 1) {
            var1++;
            var2 = var3;
         }

         var10000 = ++var3;
      }

      if (var10000 + 1 != var1) {
         String var24 = "\u001a";
         return "?";
      } else {
         if (var1 == 4 && this.ahe[1].ee() == 497L && this.ahe[2].ee() == 499L && this.ahe[3].ee() == 498L) {
            if (GoodType.l(this.ahe[0].ee()) || GoodType.ao(this.ahe[0].ee()) || GoodType.x(this.ahe[0].ee())) {
               String var23 = "炻匜裂复";
               return "炼化装备";
            }

            if (GoodType.w(this.ahe[0].ee())) {
               if (this.za().gameType == 2) {
                  String var22 = "\u001a";
                  return "?";
               }

               String var21 = "炻匜仞噢";
               return "炼化仙器";
            }
         }

         if (var1 == 2 && GoodType.w(this.ahe[0].ee()) && (GoodType.w(this.ahe[1].ee()) || this.ahe[1].ee() == 7005L || this.ahe[1].ee() == 7010L)) {
            String var8 = "烽匳亘噍";
            return "炼化仙器";
         } else if (var1 == 2 && GoodType.an(this.ahe[0].ee()) && this.ahe[1].ee() == 191L && !this.za().l(2, 3)) {
            String var20 = "炻匜祙兿";
            return "炼化神兵";
         } else if (var1 == 2 && GoodType.x(this.ahe[0].ee()) && this.ahe[1].ee() == 500L) {
            String var17 = this.ahe[0].jg();
            String var10001 = "笈纂";
            String var18 = MsgUntil.getPalEquipAgree(var17, "等级");
            var10001 = "7";
            String var19 = var18.split("=")[1];
            var10001 = this.ahe[1].jg();
            String var10002 = "\u0018";
            return MsgUntil.k(var19, var10001.split("=")[1]);
         } else if (var1 == 2 && GoodType.x(this.ahe[0].ee()) && (GoodType.x(this.ahe[1].ee()) || this.ahe[1].ee() == 7511L)) {
            String var9 = "裂复埾共";
            return "装备培养";
         } else if (var1 == 2 && GoodType.w(this.ahe[0].ee()) && this.ahe[1].ee() == 214L) {
            String var16 = "遡垮醌铝";
            return "造型重铸";
         } else {
            if (this.za().gameType == 2) {
               if (var1 == 3 && GoodType.l(this.ahe[0].ee()) && this.ahe[1].ee() == 500L && this.ahe[2].ee() == 555L) {
                  String var15 = "裂复巬铲";
                  return "装备巫铸";
               }

               if (!this.za().l(2, 3) && var1 == 2 && GoodType.l(this.ahe[0].ee()) && this.ahe[1].ee() == 500L) {
                  String var14 = "袄夢戒逅";
                  return "装备打造";
               }
            }

            if (this.za().gameMount && var1 >= 3 && this.ahe[0].ee() == 103L && this.ahe[1].ee() == 103L) {
               boolean var5 = true;

               boolean var11;
               label109: {
                  int var4;
                  for (int var10 = var4 = 2; var10 < var1; var10 = ++var4) {
                     if (!GoodType.ap(this.ahe[var4].ee())) {
                        var11 = var5 = false;
                        break label109;
                     }
                  }

                  var11 = var5;
               }

               if (var11) {
                  String var13 = "块骛驪炶";
                  return "坐骑驭炼";
               }
            }

            String var12 = "\u001a";
            return "?";
         }
      }
   }

   public String jg() {
      if (this.cn == 0) {
         return this.aad();
      } else if (this.cn == 1) {
         return this.zz();
      } else if (this.cn == 2) {
         return this.zw();
      } else {
         String var10000 = "5";
         return "?";
      }
   }
}
