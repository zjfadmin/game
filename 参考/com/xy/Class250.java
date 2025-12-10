package com.xy;

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
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class250 extends Class345 {
   private Class529 aam;
   private Class436[] lh;
   private BigDecimal rm;
   private Class556 aim;
   private JScrollPane w;
   Goodstable[] ain;
   private <undefinedtype>[] aio;
   private DefaultListModel<String> jb;
   private JList<String> yp;
   private Class585 ab;
   private JLabel[] hj;
   private int bn;
   private MoneyType ahm;
   private Class245[] ail;

   public String yo() {
      if (this.bn == 0) {
         return this.yr();
      } else if (this.bn == --1) {
         return this.yq();
      } else {
         return this.bn == 5 >> 1 ? this.nn() : "?";
      }
   }

   public void yp(Goodstable[] var1, String var2) {
      String[] var3 = MsgUntil.getPalEquipAgree(var1[3 >> 2].getValue(), "契合度").split("=")[3 & 5].split("/");
      if ("装备升级".equals(var2)) {
         if (Integer.parseInt(var3[2 & 5]) < Integer.parseInt(var3[2 ^ 3])) {
            this.aej.f("该装备契合度不够");
            return;
         }
      } else if ("装备培养".equals(var2)) {
         if (Integer.parseInt(var3[3 >> 2]) >= Integer.parseInt(var3[3 >> 1])) {
            this.aej.f("该装备契合度已满");
            return;
         }

         if (GoodType.g(var1[2 ^ 3].getType())) {
            if (Integer.parseInt(MsgUntil.getPalEquipAgree(var1[3 & 5].getValue(), "等级").split("=")[--1]) >= --4) {
               this.aej.f("装备4级以上包括4级,不能作为培养道具");
               return;
            }
         } else if (var1[4 ^ 5].getType() != 7511L) {
            this.aej.f("不是伙伴装备培养道具");
            return;
         }
      }

      SuitOperBean var4 = new SuitOperBean();
      ArrayList var5 = new ArrayList();

      int var6;
      for(int var10000 = var6 = 3 ^ 3; var10000 < var1.length; var10000 = var6) {
         if (var1[var6] != null) {
            var5.add(var1[var6].getRgid());
         }

         ++var6;
      }

      int var10001 = 126 & 63;
      var4.setGoods(var5);
      var4.setType(var10001 - ("装备培养".equals(var2) ? 4 ^ 5 : 0));
      String var7 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var4));
      this.uw().d(var7);
   }

   public String yq() {
      int var1 = 3 >> 2;
      int var2 = -4 >> 2;
      int var3;
      int var10000 = var3 = 3 >> 2;

      while(true) {
         if (var10000 >= this.aio.length) {
            var10000 = var2;
            break;
         }

         if (!this.aio[var3].isVisible()) {
            var10000 = var2;
            break;
         }

         if (this.aio[var3].ahi.tp() == 3 >> 1) {
            ++var1;
            var2 = var3;
         }

         ++var3;
         var10000 = var3;
      }

      if (var10000 + 1 != var1) {
         return "?";
      } else if (var1 != (1 ^ 3) || !GoodType.am(this.aio[2 & 5].gl()) || !GoodType.am(this.aio[--1].gl()) && this.aio[--1].gl() != 1008L) {
         if (this.uw().gameType == --2) {
            if (var1 == --4 && GoodType.am(this.aio[3 & 4].gl()) && this.aio[--1].gl() == 497L && this.aio[1 ^ 3].gl() == 499L && this.aio[--3].gl() == 498L) {
               return "佩饰重铸";
            }
         } else if (var1 == (1 ^ 3) && GoodType.am(this.aio[3 >> 2].gl()) && GoodType.j(this.aio[2 ^ 3].gl())) {
            return "佩饰重铸";
         }

         if (var1 == (1 ^ 3) && GoodType.h(this.aio[3 & 4].gl()) && GoodType.h(this.aio[5 >> 2].gl())) {
            return "护身符培养";
         } else if (var1 == 5 >> 1 && GoodType.h(this.aio[5 >> 3].gl()) && GoodType.j(this.aio[2 ^ 3].gl())) {
            return "护身符重铸";
         } else if (var1 == 5 >> 1 && this.aio[5 >> 3].gl() == 729L && this.aio[2 ^ 3].gl() == 729L) {
            return "彩晶石培养";
         } else if (var1 == --4 && this.aio[3 ^ 3].gl() == 8889L && this.aio[5 >> 2].gl() == 8889L && this.aio[5 >> 1].gl() == 8889L && this.aio[--3].gl() == 8889L) {
            return "秘石合成";
         } else if (var1 == --3 && GoodType.m(this.aio[3 & 4].gl()) && this.aio[2 ^ 3].alw().getGoodsid().intValue() == (32247 & 829) && this.aio[5 >> 1].gl() == 499L) {
            return "配饰点粹";
         } else if ((var1 == --2 || var1 == 3) && GoodType.m(this.aio[0].gl()) && this.aio[1].gl() == 777L && (var1 == 2 || var1 == 3 && this.aio[2].gl() == 778L)) {
            return "配饰粹炼";
         } else if (var1 == 2 && GoodType.m(this.aio[0].gl()) && this.aio[1].gl() == 779L) {
            return "配饰粹取";
         } else if (var1 == 2 && GoodType.m(this.aio[1].gl()) && this.aio[0].gl() == 779L) {
            return "配饰炼合";
         } else {
            boolean var4;
            boolean var5;
            if (var1 >= 1) {
               var4 = true;
               var10000 = var2 = 0;

               while(true) {
                  if (var10000 >= this.aio.length) {
                     var5 = var4;
                     break;
                  }

                  if (this.aio[var2].ahi.tp() == 1 && !GoodType.m(this.aio[var2].gl())) {
                     var5 = var4 = false;
                     break;
                  }

                  ++var2;
                  var10000 = var2;
               }

               if (var5) {
                  return "配饰分解";
               }
            }

            if (this.uw().gameType == 2 && var1 >= 1) {
               var4 = true;
               var10000 = var2 = 0;

               while(true) {
                  if (var10000 >= this.aio.length) {
                     var5 = var4;
                     break;
                  }

                  if (this.aio[var2].ahi.tp() == 1 && !GoodType.an(this.aio[var2].gl())) {
                     var5 = var4 = false;
                     break;
                  }

                  ++var2;
                  var10000 = var2;
               }

               if (var5) {
                  return "仙器分解";
               }

               if (this.uw().gameMount) {
                  var4 = true;
                  var10000 = var2 = 0;

                  while(true) {
                     if (var10000 >= this.aio.length) {
                        var5 = var4;
                        break;
                     }

                     if (this.aio[var2].ahi.tp() == 1 && this.aio[var2].gl() != 108L) {
                        var5 = var4 = false;
                        break;
                     }

                     ++var2;
                     var10000 = var2;
                  }

                  if (var5) {
                     return "守护石分解";
                  }
               }
            }

            return "?";
         }
      } else {
         return "一键培养";
      }
   }

   public String yr() {
      int var1 = 3 >> 2;
      int var2 = -4 >> 2;
      int var3;
      int var10000 = var3 = 2 & 5;

      while(true) {
         if (var10000 >= this.aio.length) {
            var10000 = var2;
            break;
         }

         if (!this.aio[var3].isVisible()) {
            var10000 = var2;
            break;
         }

         if (this.aio[var3].ahi.tp() == 3 >> 1) {
            ++var1;
            var2 = var3;
         }

         ++var3;
         var10000 = var3;
      }

      if (var10000 + 1 != var1) {
         return "?";
      } else {
         if (var1 == --4 && this.aio[4 ^ 5].gl() == 497L && this.aio[5 >> 1].gl() == 499L && this.aio[--3].gl() == 498L) {
            if (GoodType.c(this.aio[3 >> 2].gl()) || GoodType.h(this.aio[3 & 4].gl()) || GoodType.g(this.aio[3 ^ 3].gl())) {
               return "炼化装备";
            }

            if (GoodType.an(this.aio[5 >> 3].gl())) {
               if (this.uw().gameType == (1 ^ 3)) {
                  return "?";
               }

               return "炼化仙器";
            }
         }

         if (var1 == --2 && GoodType.an(this.aio[3 & 4].gl()) && (GoodType.an(this.aio[5 >> 2].gl()) || this.aio[5 >> 2].gl() == 7005L || this.aio[--1].gl() == 7010L)) {
            return "炼化仙器";
         } else if (var1 == 5 >> 1 && GoodType.aa(this.aio[3 >> 2].gl()) && this.aio[5 >> 2].gl() == 191L && !this.uw().n(5 >> 1, --3)) {
            return "炼化神兵";
         } else if (var1 == 5 >> 1 && GoodType.g(this.aio[3 >> 2].gl()) && this.aio[4 ^ 5].gl() == 500L) {
            return MsgUntil.n(MsgUntil.getPalEquipAgree(this.aio[3 & 4].nn(), "等级").split("=")[3 & 5], this.aio[3 & 5].nn().split("=")[3 >> 1]);
         } else if (var1 == 5 >> 1 && GoodType.g(this.aio[0].gl()) && (GoodType.g(this.aio[1].gl()) || this.aio[1].gl() == 7511L)) {
            return "装备培养";
         } else if (var1 == 5 >> 1 && GoodType.an(this.aio[0].gl()) && this.aio[1].gl() == 214L) {
            return "造型重铸";
         } else {
            if (this.uw().gameType == (1 ^ 3)) {
               if (var1 == --3 && GoodType.c(this.aio[0].gl()) && this.aio[1].gl() == 500L && this.aio[--2].gl() == 555L) {
                  return "装备巫铸";
               }

               if (!this.uw().n(5 >> 1, 3) && var1 == 2 && GoodType.c(this.aio[0].gl()) && this.aio[1].gl() == 500L) {
                  return "装备打造";
               }
            }

            if (this.uw().gameMount && var1 >= 3 && this.aio[0].gl() == 103L && this.aio[1].gl() == 103L) {
               boolean var4 = true;

               boolean var5;
               label107: {
                  for(var10000 = var2 = 2; var10000 < var1; var10000 = var2) {
                     if (!GoodType.ah(this.aio[var2].gl())) {
                        var5 = var4 = false;
                        break label107;
                     }

                     ++var2;
                  }

                  var5 = var4;
               }

               if (var5) {
                  return "坐骑驭炼";
               }
            }

            return "?";
         }
      }
   }

   public void s() {
      Class216[] var10001;
      Class250 var10002;
      if (this.ab.aiz() != null) {
         var10001 = this.ab.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (62 & 89), this.ab.t(), 2 & 5, 19103 & 14188, 24959 & 8091);
      this.ab.aiw(var1, 3 ^ 3);
   }

   public BigDecimal ez() {
      return this.rm;
   }

   public void fr(Class44 var1) {
      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.aio.length; var10000 = var2) {
         if (this.aio[var2].ahi == var1) {
            this.aio[var2].ax((Goodstable)null);
            this.ve().n(46 & 127);
            this.d();
            return;
         }

         ++var2;
      }

   }

   public boolean ij(boolean var1) {
      String var2;
      if ((var2 = this.yo()).equals("?")) {
         return (boolean)(3 >> 2);
      } else {
         Goodstable[] var3;
         if ((var3 = this.yu()) == null) {
            return (boolean)(2 & 5);
         } else if (this.bn == 0) {
            return this.za(var2, var3, var1);
         } else if (this.bn == --1) {
            return this.yt(var2, var3, var1);
         } else {
            return this.bn == --2 ? this.yz(var2, var3, var1) : false;
         }
      }
   }

   public void av(Goodstable var1) {
      Class250 var10000;
      label66: {
         int var2;
         if (this.bn == 5 >> 1) {
            if (GoodType.n(var1.getType())) {
               var10000 = this;
               this.aio[3 >> 2].ax(var1);
               break label66;
            }

            if (var1.getType() != 505L && var1.getType() != 507L) {
               if (var1.getType() == 508L) {
                  var10000 = this;
                  this.aio[--4].ax(var1);
                  break label66;
               }
            } else if ((var2 = this.e()) > 0) {
               var10000 = this;
               this.aio[var2].ax(var1);
               break label66;
            }
         } else {
            int var3;
            int var5;
            label63: {
               var2 = 1;
               if (var1.getType() >= 497L && var1.getType() <= 499L) {
                  var3 = 4 ^ 5;
                  if (var1.getType() == 497L) {
                     var3 = --1;
                     var10000 = this;
                  } else if (var1.getType() == 499L) {
                     var3 = 5 >> 1;
                     var10000 = this;
                  } else {
                     if (var1.getType() == 498L) {
                        var3 = --3;
                     }

                     var10000 = this;
                  }

                  Goodstable var4;
                  if ((var4 = var10000.aio[var3].alw()) == null) {
                     var5 = 3 ^ 3;
                     this.aio[var3].ax(var1);
                     break label63;
                  }

                  if (var4.getType() != var1.getType()) {
                     var5 = 2 & 5;
                     this.aio[var3].ax(var1);
                     var2 = var5;
                  }
               }

               var5 = var2;
            }

            if (var5 != 0) {
               for(var5 = var3 = 2 & 5; var5 < this.aio.length; var5 = var3) {
                  if (this.aio[var3].alw() == null) {
                     var10000 = this;
                     this.aio[var3].ax(var1);
                     break label66;
                  }

                  ++var3;
               }
            }
         }

         var10000 = this;
      }

      var10000.d();
   }

   public void f(String var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.aio.length; var10000 = var2) {
         this.aio[var2].fx((String)null);
         this.aio[var2++].ax((Goodstable)null);
      }

      Class250 var3;
      label114: {
         if (!Class394.o(var1)) {
            if (var1.equals("炼化装备")) {
               var3 = this;
               this.aio[3 ^ 3].fx("普通装备");
               this.aio[2 ^ 3].fx("内丹");
               this.aio[--2].fx("血玲珑");
               this.aio[--3].fx("九彩");
               break label114;
            }

            if (var1.equals("炼化仙器")) {
               var3 = this;
               this.aio[3 ^ 3].fx("仙器");
               this.aio[--1].fx("仙器精华");
               break label114;
            }

            if (var1.equals("炼化神兵")) {
               var3 = this;
               this.aio[5 >> 3].fx("神兵");
               this.aio[4 ^ 5].fx("神兵石");
               break label114;
            }

            if (var1.equals("装备打造")) {
               var3 = this;
               this.aio[3 >> 2].fx("普通装备");
               this.aio[4 ^ 5].fx("矿石");
               break label114;
            }

            if (var1.equals("装备巫铸")) {
               var3 = this;
               this.aio[3 >> 2].fx("普通装备");
               this.aio[--1].fx("矿石");
               this.aio[1 ^ 3].fx("巫铸材料");
               break label114;
            }

            if (var1.equals("造型重铸")) {
               var3 = this;
               this.aio[5 >> 3].fx("仙器");
               this.aio[5 >> 2].fx("重铸石");
               break label114;
            }

            if (var1.equals("伙伴装备升级")) {
               var3 = this;
               this.aio[3 ^ 3].fx("伙伴装备");
               this.aio[--1].fx("矿石");
               break label114;
            }

            if (var1.equals("伙伴装备重铸")) {
               var3 = this;
               this.aio[5 >> 3].fx("伙伴装备");
               this.aio[2 ^ 3].fx("矿石");
               break label114;
            }

            if (var1.equals("伙伴装备培养")) {
               var3 = this;
               this.aio[2 & 5].fx("伙伴装备");
               this.aio[4 ^ 5].fx("伙伴装备");
               break label114;
            }

            if (var1.equals("佩饰培养")) {
               var3 = this;
               this.aio[2 & 5].fx("佩饰");
               this.aio[1].fx("佩饰");
               break label114;
            }

            if (var1.equals("佩饰重铸")) {
               if (this.uw().gameType == 5 >> 1) {
                  var3 = this;
                  this.aio[0].fx("佩饰");
                  this.aio[1].fx("内丹");
                  this.aio[1 ^ 3].fx("血玲珑");
                  this.aio[--3].fx("九彩");
               } else {
                  var3 = this;
                  this.aio[0].fx("佩饰");
                  this.aio[1].fx("矿石");
               }
               break label114;
            }

            if (var1.equals("护身符培养")) {
               var3 = this;
               this.aio[0].fx("护身符");
               this.aio[1].fx("护身符");
               break label114;
            }

            if (var1.equals("护身符重铸")) {
               var3 = this;
               this.aio[0].fx("护身符");
               this.aio[1].fx("矿石");
               break label114;
            }

            if (var1.equals("彩晶石培养")) {
               var3 = this;
               this.aio[0].fx("彩晶石");
               this.aio[1].fx("彩晶石");
               break label114;
            }

            if (var1.equals("配饰点粹")) {
               var3 = this;
               this.aio[0].fx("佩饰");
               this.aio[1].fx("补天神石");
               this.aio[--2].fx("血玲珑");
               break label114;
            }

            if (var1.equals("配饰粹炼")) {
               var3 = this;
               this.aio[0].fx("佩饰");
               this.aio[1].fx("粹玉");
               this.aio[1 ^ 3].fx("留光粹玉");
               break label114;
            }

            if (var1.equals("配饰粹取")) {
               var3 = this;
               this.aio[0].fx("佩饰");
               this.aio[1].fx("粹玉结晶");
               break label114;
            }

            if (var1.equals("配饰炼合")) {
               var3 = this;
               this.aio[1].fx("佩饰");
               this.aio[0].fx("粹玉结晶");
               break label114;
            }

            if (var1.equals("配饰分解")) {
               var3 = this;
               this.aio[0].fx("佩饰");
               break label114;
            }

            if (var1.equals("仙器分解")) {
               var3 = this;
               this.aio[0].fx("仙器");
               break label114;
            }

            if (var1.equals("开光")) {
               var3 = this;
               this.aio[0].fx("武器");
               this.aio[1].fx("九玄仙玉");
               break label114;
            }

            if (var1.equals("炼器")) {
               var3 = this;
               this.aio[0].fx("武器");
               this.aio[1].fx("落魄沙");
               this.aio[5 >> 1].fx("落魄沙");
               this.aio[--3].fx("落魄沙");
               this.aio[--4].fx("神工笔录");
               break label114;
            }

            if (var1.equals("清除炼器")) {
               var3 = this;
               this.aio[0].fx("武器");
               break label114;
            }

            if (var1.equals("坐骑百炼丹")) {
               var3 = this;
               this.aio[0].fx("百炼丹");
               this.aio[1].fx("百炼丹");
               this.aio[1 ^ 3].fx("炼妖石");
               this.aio[--3].fx("炼妖石");
               this.aio[--4].fx("炼妖石");
               this.aio[--5].fx("炼妖石");
               break label114;
            }

            if (var1.equals("守护石分解")) {
               this.aio[0].fx("守护石");
            }
         }

         var3 = this;
      }

      var3.d();
   }

   public void d() {
      String var1 = this.yo();
      if (!this.aam.getText().equals(var1)) {
         Class250 var10000;
         label68: {
            this.aam.setText(var1);
            long var2;
            if (var1.equals("配饰点粹")) {
               var2 = (long)(this.uw().n(1 ^ 3, 12 & 127) ? 100000 : 10000000);
               if (this.rm == null || this.rm.longValue() != var2) {
                  var10000 = this;
                  this.rm = new BigDecimal(var2);
                  break label68;
               }
            } else if (var1.equals("配饰粹取")) {
               var2 = this.uw().n(--2, 92 & 47) ? 20000000L : 2000000000L;
               if (this.rm == null || this.rm.longValue() != var2) {
                  var10000 = this;
                  this.rm = new BigDecimal(var2);
                  break label68;
               }
            } else if (var1.equals("坐骑百炼丹")) {
               var2 = 100000L;
               if (this.rm == null || this.rm.longValue() != var2) {
                  var10000 = this;
                  this.rm = new BigDecimal(var2);
                  break label68;
               }
            } else if (this.rm == null || this.rm.longValue() != 100000L) {
               this.rm = new BigDecimal(100000);
            }

            var10000 = this;
         }

         Class681.j(var10000.ail[3 ^ 3], this.rm.longValue());
      }
   }

   public int e() {
      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < this.aio.length; var10000 = var1) {
         if (this.aio[var1].isVisible() && this.aio[var1].ahi.tp() != --1) {
            return var1;
         }

         ++var1;
      }

      return -4 >> 2;
   }

   public Class250(GameView var1) {
      int var10001 = 25 & 111;
      int var10005 = 55 & 121;
      int var10017 = 3 >> 2;
      int var10020 = -4 >> 2;
      int var10022 = -4 >> 2;
      super(var10020, -4 >> 2, Class345.aei, var1);
      this.bn = var10022;
      this.va(var10017, 5 >> 3, 7863 & 25466, 18972 & 14315, Class345.aei);
      this.jb = new DefaultListModel();
      this.yp = new JList();
      this.yp.setOpaque((boolean)(3 ^ 3));
      this.yp.setSelectionBackground(new Color(105 & 55, 47 & 122, 55 & 124));
      this.yp.setSelectionForeground(Color.GREEN);
      this.yp.setForeground(Color.GREEN);
      this.yp.setFont(Class681.ce);
      this.yp.setBackground(Class681.cu);
      this.yp.setModel(this.jb);
      this.yp.setSelectionMode(2 & 5);
      this.yp.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               Class250.this.f((String)Class250.this.yp.getSelectedValue());
            }

         }
      });
      this.w = Class133.f(var10005, 123 & 79, 18683 & 14247, 11995 & 20974, this.yp, -4 >> 2);
      this.add(this.w);
      this.aam = new Class529("sc/e/31.png", --1, 115 & 127, Class681.cn, Class681.c, "?", this);
      this.aam.setBounds(16827 & 16383, 127 & 125, 111 & 95, 123 & 29);
      this.add(this.aam);
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.hj = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(62 & 111, 54, 165, 21, 3 & 4, Class681.c("#cFFFFFF"), Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "已加入作坊" : (var2 == 3 >> 1 ? "现    金" : (var2 == 5 >> 1 ? "消耗金钱" : (var2 == --3 ? "作坊主" : (var2 == --4 ? "段  位" : (var2 == --5 ? "等  级" : (var2 == 6 ? "可生产" : (var2 == 7 ? "熟练度" : (var2 == 8 ? "成  就" : "")))))))));
         if (var2 >= --1 && var2 <= 5 >> 1) {
            this.hj[var2].setFont(Class681.q);
            this.hj[var2].setBounds(248, 215 + (var2 - (2 ^ 3)) * 27, 62, 19);
         }

         if (var2 >= --3 && var2 <= 9) {
            this.hj[var2].setForeground(Class681.c("#c000000"));
            this.hj[var2].setBounds(41, 297 + (var2 - --3) * 32, 62, 19);
         }

         this.add(this.hj[var2++]);
      }

      this.ahm = new MoneyType();
      this.ahm.setIdAndKey(3 & 5, "现 金");
      this.aim = Class133.m(320, 215, 144, 19, 10, Color.white, Class681.q, this.ahm, var1);
      this.aim.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.aim.ab(1 ^ 3);
      this.add(this.aim);
      Class245[] var5 = new Class245[7];
      var10003 = true;
      this.ail = var5;

      Class250 var3;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ail.length; var10000 = var2) {
         this.ail[var2] = Class133.a(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, 10, Color.white, Class681.q);
         this.ail[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
         if (var2 == 0) {
            this.ail[var2].setBounds(320, 242, 144, 19);
            var3 = this;
         } else {
            this.ail[var2].setBounds(107, 297 + (var2 - (3 >> 1)) * 32, 104, 19);
            var3 = this;
         }

         var3.add(this.ail[var2++]);
      }

      <undefinedtype>[] var6 = new <undefinedtype>[6];
      var10003 = true;
      this.aio = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.aio.length; var10000 = var2) {
         this.aio[var2] = new JComponent() {
            private JLabel bd;
            private Class436 r;
            private Class44 ahi = new Class44(Class250.this.gk());
            private Class436 ih;

            public BigDecimal ez() {
               Goodstable var1;
               return (var1 = this.alw()) != null ? var1.getRgid() : null;
            }

            public {
               this.ahi.setBounds(--4, --4, 58 & 119, 58 & 119);
               this.add(this.ahi);
               this.bd = Class133.c(5 >> 3, 23 & 125, 122 & 63, 84 & 59, 3 >> 2, Color.gray, Class681.bm);
               this.add(this.bd);
               this.ih = new Class436("sc/d/4.png");
               this.r = new Class436("sc/d/30.png");
               this.ih.setBounds(2 & 5, 2 & 5, 123 & 63, 61 & 123);
               this.r.setBounds(3 & 5, 57 & 127, 62 & 123, 3 & 5);
               this.add(this.ih);
               this.add(this.r);
            }

            public long gl() {
               Goodstable var1;
               return (var1 = this.alw()) != null ? var1.getType() : -1L;
            }

            public Goodstable alw() {
               Goodstable var1;
               return this.ahi.tp() == (2 ^ 3) && (var1 = (Goodstable)this.ahi.hr()).getRgid() != null ? Class250.this.vd().getGood(var1.getRgid()) : null;
            }

            public void ax(Goodstable var1) {
               this.bd.setVisible((boolean)(var1 == null ? --1 : 0));
               Class44 var10000 = this.ahi;
               int var10001;
               Goodstable var10002;
               if (var1 != null) {
                  var10001 = 3 >> 1;
                  var10002 = var1;
               } else {
                  var10001 = 0;
                  var10002 = var1;
               }

               var10000.c(var10001, var10002);
            }

            public void fx(String var1) {
               this.bd.setText(var1);
            }

            public String nn() {
               Goodstable var1;
               return (var1 = this.alw()) != null ? var1.getValue() : null;
            }
         };
         this.aio[var2].setBounds(248 + var2 % --3 * 67, 75 + var2 / --3 * 65, 59, 58);
         this.add(this.aio[var2++]);
      }

      Class436[] var7 = new Class436[--4];
      var10003 = true;
      this.lh = var7;

      for(var10000 = var2 = 3 & 4; var10000 < this.lh.length; var10000 = var2) {
         this.lh[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.lh[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
            this.lh[var2].setBounds(46, 54, 165, 21);
         } else if (var2 == (2 ^ 3)) {
            var3 = this;
            this.lh[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.lh[var2].setBounds(46, 54, 165, 225);
         } else if (var2 == 2) {
            var3 = this;
            this.lh[var2].eq(Class511.q("sc/d/16.png", 2, 2, 2, 2, false));
            this.lh[var2].setBounds(215, 54, 310, 225);
         } else {
            if (var2 == 3) {
               this.lh[var2].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, false));
               this.lh[var2].setBounds(215, 283, 309, 207);
            }

            var3 = this;
         }

         var3.add(this.lh[var2++]);
      }

      this.ab = new Class585(this, 6, 4, 51, 51, 0, 0, 216, 285);
      this.ab.hf(Class511.a("sc/d/18.png"));
      this.ab.gb(true);
      this.add(this.ab);
   }

   public boolean ys(Class53 var1, Goodstable[] var2, BigDecimal var3, int var4) {
      RoleData var5;
      LoginResult var6 = (var5 = this.vd()).getLoginResult();
      int var7 = 5 >> 3;
      int var8 = 5 >> 3;
      if (var4 == --4 || var4 == --1 || var4 == -4 >> 2) {
         var8 = (var7 = var1.ov()) % (42 & 95);
         var7 /= 79 & 58;
      }

      int var9 = var4 == --4 ? var1.e() : 0;
      BigDecimal var15 = null;
      int var19;
      if (var6.getGold().longValue() < var3.longValue()) {
         var19 = 3 & 4;
         this.aej.fw("#Y金钱不足");
         return (boolean)var19;
      } else {
         BigDecimal var10000;
         if (this.uw().n(--2, 63 & 71)) {
            if (var8 > --2) {
               var19 = 3 & 4;
               this.aej.fw("最多只能锁定2个");
               return (boolean)var19;
            }

            if (var8 == (4 ^ 5) && var4 == --4) {
               var10000 = var15 = new BigDecimal(22521 & 11246);
            } else {
               if (var8 == --2 && var4 == --4) {
                  var15 = new BigDecimal(12254 & 23013);
               }

               var10000 = var15;
            }

            if (var10000 != null && var6.getCodecard().longValue() < var15.longValue()) {
               var19 = 3 >> 2;
               this.aej.fw("仙玉不足");
               return (boolean)var19;
            }
         } else {
            if (var8 > --3) {
               var19 = 3 & 4;
               this.aej.fw("最多只能锁定3个");
               return (boolean)var19;
            }

            label222: {
               if (var8 > 0) {
                  if (var8 == --1) {
                     if (var4 == --4) {
                        var15 = new BigDecimal(108 & 119);
                        var19 = var4;
                     } else {
                        var15 = new BigDecimal(20463 & 13304);
                        var19 = var4;
                     }
                     break label222;
                  }

                  if (var8 == (1 ^ 3)) {
                     if (var4 == --4) {
                        var15 = new BigDecimal(20477 & 12790);
                        var19 = var4;
                     } else {
                        var15 = new BigDecimal(20475 & 15292);
                        var19 = var4;
                     }
                     break label222;
                  }

                  if (var8 == --3) {
                     if (var4 == --4) {
                        var15 = new BigDecimal(24551 & 10716);
                        var19 = var4;
                        break label222;
                     }

                     var15 = new BigDecimal(16370 & 22397);
                  }
               }

               var19 = var4;
            }

            label211: {
               if (var19 == 4 && var9 == --1) {
                  if (var15 == null) {
                     var10000 = var15 = new BigDecimal(30704 & 12063);
                     break label211;
                  }

                  var15 = var15.add(new BigDecimal(16189 & 26578));
               }

               var10000 = var15;
            }

            if (var10000 != null && var6.getSavegold().longValue() < var15.longValue()) {
               var19 = 2 & 5;
               this.aej.fw("绑玉不足");
               return (boolean)var19;
            }
         }

         ArrayList var16 = new ArrayList();
         int var10 = 3 ^ 3;
         int var11 = -4 >> 2;

         int var12;
         int var13;
         for(var19 = var12 = 3 >> 2; var19 < var2.length; var19 = var12) {
            if (var2[var12] != null) {
               var11 = var12;
               ++var10;
               if (var2[var12].getGoodlock() == 3 >> 1) {
                  var19 = 2 & 5;
                  this.aej.fw("该物品已被加锁");
                  return (boolean)var19;
               }

               var13 = 1;

               int var14;
               for(var19 = var14 = 5 >> 3; var19 < var16.size(); var19 = var14) {
                  if (var2[var12].getRgid().compareTo((BigDecimal)var16.get(var14)) == 0) {
                     ++var13;
                  }

                  ++var14;
               }

               if (var13 > var2[var12].getUsetime()) {
                  var19 = 3 & 4;
                  this.aej.f("请凑齐物品再来");
                  return (boolean)var19;
               }

               var16.add(var2[var12].getRgid());
            }

            ++var12;
         }

         if (var11 + (5 >> 2) != var10) {
            var19 = 2 & 5;
            this.aej.fw("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
            return (boolean)var19;
         } else {
            SuitOperBean var17 = new SuitOperBean();
            String var18;
            if (var4 == 0) {
               if (var10 != --2) {
                  var19 = 3 & 4;
                  this.aej.fw("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
                  return (boolean)var19;
               }

               if ((var18 = GoodType.getExtra(var2[0].getValue(), "炼器属性")) != null && Integer.parseInt(var18.split("&")[1]) >= 5) {
                  this.aej.fw("最大开光次数5");
                  return false;
               }

               var17.setType(27 & 110);
            } else if (var4 != 1 && var4 != -1) {
               if (var4 == 3) {
                  if (var10 != 1) {
                     this.aej.fw("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
                     return false;
                  }

                  var17.setType(93 & 47);
               } else if (var4 == 4) {
                  if (GoodType.getExtra(var2[0].getValue(), "套装属性") != null) {
                     this.aej.fw("套装无法炼化");
                     return false;
                  }

                  if (var9 == 1 && !GoodType.n(var2[0].getType()) && !GoodType.h(var2[0].getType())) {
                     this.aej.fw("#Y这类型装备暂时没有对应的特技");
                     return false;
                  }

                  if (GoodType.an(var2[0].getType())) {
                     if (var2[1].getType() == 7005L) {
                        if (!GoodType.f(var2[1].getValue())[1].equals("阶数=1")) {
                           this.aej.fw("使用一阶作为炼化材料太掉价了吗?");
                           return false;
                        }
                     } else if (GoodType.an(var2[1].getType()) && !GoodType.f(var2[1].getValue())[0].equals("阶数=1")) {
                        this.aej.fw("使用一阶作为炼化材料太掉价了吗?");
                        return false;
                     }
                  }

                  var17.setType(14);
               }
            } else {
               if (var10 != (var4 == -1 ? 5 : 4)) {
                  this.aej.fw("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
                  return false;
               }

               if (GoodType.getExtra(var2[0].getValue(), "炼器属性") == null) {
                  this.aej.fw("先去开光");
                  return false;
               }

               var17.setType(var4 == -1 ? 125 & 14 : 11);
            }

            for(var19 = var13 = 1; var19 < var2.length; var19 = var13) {
               if (var2[var13] != null) {
                  var2[var13].ab(1);
                  if (var2[var13].getUsetime() <= 0) {
                     var5.h(var2[var13].getRgid());
                  }
               }

               ++var13;
            }

            var6.setGold(var6.getGold().subtract(var3));
            if (var15 != null) {
               SuitOperBean var20;
               if (this.uw().n(2, 7)) {
                  var6.setCodecard(var6.getCodecard().subtract(var15));
                  var20 = var17;
               } else {
                  var6.setSavegold(var6.getSavegold().subtract(var15));
                  var20 = var17;
               }

               var20.setJade(new PartJade((long)var7, var9));
            }

            var17.setGoods(var16);
            var18 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var17));
            this.uw().d(var18);
            return true;
         }
      }
   }

   public boolean yt(String var1, Goodstable[] var2, boolean var3) {
      if (!var1.equals("配饰点粹") && !var1.equals("配饰粹炼")) {
         return !var1.equals("配饰分解") && !var1.equals("配饰粹取") && !var1.equals("配饰炼合") ? this.zb(var2, this.rm, var1, var3) : this.yw(var2, this.rm, var1);
      } else {
         int var4 = var1.equals("配饰点粹") ? --5 : 6;
         Class53 var5;
         if ((var5 = (Class53)this.ve().m(79 & 59)) != null && var5.zg(var4, var2[2 & 5].getRgid())) {
            return this.yw(var2, this.rm, var1);
         } else {
            String var6 = GoodType.getExtra(var2[2 & 5].getValue(), GoodType.Extras[74 & 61]);
            int var10000;
            if (var4 == --5) {
               if (Class241.e(var2[3 & 4].getValue(), "等级=", "|") != 7L) {
                  var10000 = 3 ^ 3;
                  this.aej.fw("7级配饰才能点粹");
                  return (boolean)var10000;
               }
            } else if (var6 == null) {
               var10000 = 3 & 4;
               this.aej.fw("有点粹属性才能粹炼");
               return (boolean)var10000;
            }

            if (var5 == null) {
               var5 = (Class53)this.ve().e(75 & 63);
            }

            var5.zi(var2[3 >> 2].getRgid(), var6, var4, (boolean)(3 >> 2));
            return false;
         }
      }
   }

   public Goodstable[] yu() {
      int var10000;
      int var1;
      if (this.ain == null) {
         Goodstable[] var10001 = new Goodstable[this.aio.length];
         boolean var10003 = true;
         this.ain = var10001;
      } else {
         for(var10000 = var1 = 0; var10000 < this.ain.length; var10000 = var1) {
            this.ain[var1++] = null;
         }
      }

      for(var10000 = var1 = 0; var10000 < this.ain.length; var10000 = var1) {
         this.ain[var1] = this.aio[var1].alw();
         if (this.ain[var1] == null) {
            if (this.aio[var1].ahi.tp() != 0) {
               this.aej.f("物品已不再背包");
               return null;
            }
            break;
         }

         ++var1;
      }

      return this.ain;
   }

   public boolean au(int var1) {
      return (boolean)(this.aio[var1].alw() != null ? 3 & 5 : 0);
   }

   public boolean yv(Goodstable[] var1, BigDecimal var2, String var3, List<BigDecimal> var4) {
      RoleData var14;
      (var14 = this.vd()).getLoginResult();
      NpcComposeBean var5 = new NpcComposeBean();
      int var7;
      int var8;
      BigDecimal var10000;
      int var23;
      if (var3.equals("佩饰重铸")) {
         if (this.uw().gameType != 5 >> 1) {
            String var16 = var1[5 >> 3].getValue();
            var7 = MsgUntil.getGoodLvl(var1[3 ^ 3].getValue());
            var8 = MsgUntil.getGoodLvl(var1[3 >> 1].getValue());
            if (var7 != var8 - --3) {
               var23 = 3 ^ 3;
               this.aej.f("请使用" + (var7 + --3) + "级矿石进行重铸!");
               return (boolean)var23;
            }
         }

         if (Class241.d(var1[3 >> 2].getValue(), GoodType.Extras[45 & 90], "|") != null) {
            var23 = 3 >> 2;
            this.aej.f("配饰已有点粹属性无法重铸");
            return (boolean)var23;
         }

         if (Class241.d(var1[2 & 5].getValue(), GoodType.Extras[--3], "|") != null) {
            var23 = 3 & 4;
            this.aej.f("配饰已有套装属性无法重铸");
            return (boolean)var23;
         }

         var5.setComposetype("我要重铸饰品");
         var10000 = var2;
      } else {
         String[] var9;
         String[] var15;
         if (var3.equals("护身符培养")) {
            var15 = var1[3 & 4].getValue().split("\\|");
            var7 = 3 >> 2;

            for(var23 = var8 = 3 ^ 3; var23 < var15.length; var23 = var8) {
               if ((var9 = var15[var8].split("="))[2 & 5].equals("品质")) {
                  var7 = Integer.parseInt(var9[3 >> 1].split("/")[3 ^ 3]);
                  break;
               }

               ++var8;
            }

            label147: {
               var8 = 800;
               String var20;
               if ((var20 = GoodType.getExtra(var1[3 >> 2].getValue(), "炼化属性")) != null) {
                  String[] var21 = var20.split("&");

                  int var11;
                  for(var23 = var11 = 3 >> 2; var23 < var21.length; var23 = var11) {
                     String[] var12;
                     int var13;
                     if ((var12 = var21[var11].split("="))[3 >> 2].equals("特技")) {
                        for(var23 = var13 = 2 ^ 3; var23 < var12.length; var23 = var13) {
                           if (var12[var13].equals("8031")) {
                              var8 = 12263 & 21404;
                              var23 = var7;
                              break label147;
                           }

                           ++var13;
                        }
                     }

                     ++var11;
                  }
               }

               var23 = var7;
            }

            if (var23 > var8) {
               var23 = 3 ^ 3;
               this.aej.fw("该护身符品质大于" + var8 + "后无法培养");
               return (boolean)var23;
            }

            var5.setComposetype("我要培养护身符");
            var10000 = var2;
         } else if (var3.equals("护身符重铸")) {
            var15 = var1[3 ^ 3].getValue().split("\\|");
            byte var17 = 0;

            label164: {
               for(var23 = var8 = 0; var23 < var15.length; var23 = var8) {
                  if ((var9 = var15[var8].split("="))[0].equals("品质")) {
                     var23 = Integer.parseInt(var9[1].split("/")[0]);
                     break label164;
                  }

                  ++var8;
               }

               var23 = var17;
            }

            if (var23 < 300) {
               this.aej.fw("该护身符品质低于300的需要培养");
               return false;
            }

            if ((var8 = Integer.parseInt(var1[1].getValue().split("=")[1])) != (107 & 29) && var8 != (47 & 90)) {
               this.aej.fw("护身符重铸使用9级矿石,升级使用10级矿石");
               return false;
            }

            var5.setComposetype("我要重铸护身符");
            int var19 = Integer.parseInt(var1[0].getValue().split("\\|")[0].split("=")[1]);
            if (var8 == (107 & 30)) {
               int var10 = 125 & 11;
               ++var19;
               if (var19 > var10) {
                  this.aej.fw("护身符等级最高为" + var10 + "级");
                  return false;
               }
            }

            var10000 = var2;
         } else if (var3.equals("彩晶石培养")) {
            var10000 = var2;
            var5.setComposetype("培养彩晶石");
         } else {
            int var6;
            if (!var3.equals("装备打造")) {
               if (!var3.equals("装备巫铸")) {
                  return false;
               }

               var6 = MsgUntil.getGoodLvl(var1[0].getValue());
               var7 = MsgUntil.getGoodLvl(var1[1].getValue());
               if (var6 < (79 & 58)) {
                  this.aej.fw("打造1-10级装备去长安城打铁铺找冯铁匠!");
                  return false;
               }

               if (var6 >= (75 & 62) && var6 <= (93 & 47)) {
                  if (var7 != (93 & 42) && var7 != (95 & 41)) {
                     this.aej.fw("打造11-14级装备使用9级矿石!");
                     this.aej.fw("重铸10-13级装备使用8级矿石!");
                     return false;
                  }
               } else if (var6 == 14) {
                  if (var7 != 9 && var7 != 10) {
                     this.aej.fw("打造15级装备使用10级矿石!");
                     this.aej.fw("重铸14级装备使用9级矿石!");
                     return false;
                  }
               } else if (var6 == 15) {
                  if (var7 != 10 && var7 != 11) {
                     this.aej.fw("打造16级装备使用11级矿石!");
                     this.aej.fw("重铸15级装备使用10级矿石!");
                     return false;
                  }
               } else {
                  if (var6 != 16) {
                     this.aej.fw("错误公式");
                     return false;
                  }

                  if (var7 != 11) {
                     this.aej.fw("重铸16级装备使用11级矿石!");
                     return false;
                  }
               }

               var5.setComposetype("装备巫铸");
               var10000 = var2;
            } else {
               if (this.uw().gameType == 5 >> 1 && !this.uw().n(5 >> 1, --3)) {
                  var6 = MsgUntil.getGoodLvl(var1[0].getValue());
                  if ((var7 = MsgUntil.getGoodLvl(var1[1].getValue())) >= (94 & 39)) {
                     var8 = --5 + var7;
                     if ((var6 >= (11 & 127) || var8 != (27 & 111)) && (var6 < (127 & 11) || var6 != var8 && var6 + 1 != var8)) {
                        this.aej.fw("需要使用对应等级的矿石来升级或者重铸");
                        return false;
                     }
                  } else if (var6 < (127 & 11)) {
                     this.aej.fw("需要使用更高级的矿石");
                     return false;
                  }
               }

               var5.setComposetype("打造11-16级装备");
               var10000 = var2;
            }
         }
      }

      ParamTool.c(var10000.longValue(), this.aej);
      ArrayList var18 = new ArrayList();
      var7 = 0;

      for(var23 = var7; var23 < var1.length; var23 = var7) {
         if (var1[var7] != null) {
            var18.add(var1[var7].getRgid());
            var1[var7].ab(1);
            if (var1[var7].getUsetime() <= 0) {
               var14.h(var1[var7].getRgid());
               this.aio[var7].ax((Goodstable)null);
            }
         }

         ++var7;
      }

      var5.setGoodstables(var18);
      String var22 = Agreement.getSendTextAES("npccompose", Class695.b().toJson(var5));
      this.uw().d(var22);
      return true;
   }

   public void ew(Goodstable var1, int var2) {
      this.aio[var2].ax(var1);
      this.d();
   }

   public boolean yw(Goodstable[] var1, BigDecimal var2, String var3) {
      RoleData var4;
      LoginResult var5;
      int var10000;
      if ((var5 = (var4 = this.vd()).getLoginResult()).getGold().longValue() < var2.longValue()) {
         var10000 = 5 >> 3;
         this.aej.f("金钱不足");
         return (boolean)var10000;
      } else {
         ArrayList var6 = new ArrayList();
         int var7 = 3 & 4;
         int var8 = -4 >> 2;

         int var9;
         int var11;
         for(var10000 = var9 = 3 & 4; var10000 < var1.length; var10000 = var9) {
            if (var1[var9] != null) {
               var8 = var9;
               ++var7;
               if (var1[var9].getGoodlock() == 3 >> 1) {
                  var10000 = 3 ^ 3;
                  this.aej.fw("该物品已被加锁");
                  return (boolean)var10000;
               }

               int var10 = 1;

               for(var10000 = var11 = 2 & 5; var10000 < var6.size(); var10000 = var11) {
                  if (var1[var9].getRgid().compareTo((BigDecimal)var6.get(var11)) == 0) {
                     ++var10;
                  }

                  ++var11;
               }

               if (var10 > var1[var9].getUsetime()) {
                  var10000 = 3 >> 2;
                  this.aej.f("请凑齐物品再来");
                  return (boolean)var10000;
               }

               var6.add(var1[var9].getRgid());
            }

            ++var9;
         }

         if (var8 + (4 ^ 5) != var7) {
            var10000 = 3 >> 2;
            this.aej.f("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
            return (boolean)var10000;
         } else {
            SuitOperBean var13;
            String var14;
            label177: {
               var9 = 1;
               var13 = new SuitOperBean();
               int var10001;
               if (var3.equals("配饰点粹")) {
                  var10001 = 3 ^ 3;
                  var13.setType(87 & 121);
                  if (Class241.e(var1[var10001].getValue(), "等级=", "|") != 7L) {
                     var10000 = 5 >> 3;
                     this.aej.f("需要7级配饰才能点粹");
                     return (boolean)var10000;
                  }
               } else {
                  if (var3.equals("配饰粹炼")) {
                     var10001 = 5 >> 3;
                     var13.setType(119 & 90);
                     if ((var14 = Class241.d(var1[var10001].getValue(), "点粹属性&", "|")) == null) {
                        var10000 = 5 >> 3;
                        this.aej.fw("有点粹属性才能粹炼");
                        return (boolean)var10000;
                     }

                     var8 = ((var7 = var14.indexOf("&")) != -4 >> 2 ? (var7 = Integer.parseInt(var14.substring(2 & 5, var7))) : (var7 = 33)) >> 5 & 95 & 63;
                     int var12 = var7 & 31 & 127;
                     var10000 = var9 = --1 + var8 / (14 & 121) + var12 / (104 & 31);
                     break label177;
                  }

                  if (var3.equals("配饰分解")) {
                     var10000 = 3 >> 2;
                     var13.setType(119 & 91);

                     for(var11 = var10000; var10000 < var1.length; var10000 = var11) {
                        if (var1[var11] != null) {
                           if (Class241.e(var1[var11].getValue(), "等级=", "|") < 4L) {
                              var10000 = 3 >> 2;
                              this.aej.f("最少需要4级配饰才能分解");
                              return (boolean)var10000;
                           }

                           if (Class241.d(var1[var11].getValue(), GoodType.Extras[76 & 59], "|") != null) {
                              var10000 = 3 & 4;
                              this.aej.f("配饰已有点粹属性无法分解");
                              return (boolean)var10000;
                           }
                        }

                        ++var11;
                     }

                     var10000 = var9;
                     break label177;
                  }

                  if (var3.equals("配饰粹取")) {
                     var10001 = 5 >> 3;
                     var13.setType(119 & 92);
                     if (Class241.e(var1[var10001].getValue(), "等级=", "|") != 7L) {
                        var10000 = 3 >> 2;
                        this.aej.f("需要7级配饰才能粹取");
                        return (boolean)var10000;
                     }

                     if (Class241.d(var1[0].getValue(), GoodType.Extras[92 & 43], "|") == null) {
                        this.aej.f("配饰没有点粹属性无法粹取");
                        return false;
                     }

                     if (Class241.d(var1[1].getValue(), GoodType.Extras[126 & 9], "|") != null) {
                        this.aej.f("粹玉结晶已有点粹属性无法粹取");
                        return false;
                     }
                  } else if (var3.equals("配饰炼合")) {
                     var13.setType(117 & 95);
                     if (Class241.d(var1[0].getValue(), GoodType.Extras[111 & 24], "|") == null) {
                        this.aej.f("粹玉结晶没有点粹属性无法粹取");
                        return false;
                     }

                     if (Class241.e(var1[1].getValue(), "等级=", "|") != 7L) {
                        this.aej.f("需要7级配饰才能粹取");
                        return false;
                     }

                     var7 = (var14 = var1[0].getValue()) != null && !var14.equals("") ? var14.indexOf("|") : -1;
                     var14 = var7 != -4 >> 2 ? var14.substring(0, var7) : null;
                     if (var14 == null || !var14.equals(GoodType.at(var1[1].getType()))) {
                        this.aej.f("这个配饰不适合这个类型的粹玉结晶");
                        return false;
                     }
                  }
               }

               var10000 = var9;
            }

            var11 = var10000 != 1 ? 1 : var1.length;

            for(var10000 = var11; var10000 < var1.length; var10000 = var11) {
               if (var1[var11] != null && var1[var11].getUsetime() < var9) {
                  this.aej.f("请凑齐物品再来");
                  return false;
               }

               ++var11;
            }

            var10000 = 0;
            var5.setGold(var5.getGold().subtract(var2));

            for(var11 = 0; var10000 < var1.length; var10000 = var11) {
               if (var1[var11] != null && (var11 != 0 || var13.getType() != (117 & 91) && var13.getType() != (83 & 126) && var13.getType() != (126 & 85))) {
                  var1[var11].ab(var11 == 0 ? 1 : var9);
                  if (var1[var11].getUsetime() <= 0) {
                     var4.h(var1[var11].getRgid());
                     this.aio[var11].ax((Goodstable)null);
                  }
               }

               ++var11;
            }

            var13.setGoods(var6);
            var14 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var13));
            this.uw().d(var14);
            return true;
         }
      }
   }

   public boolean yx(Goodstable[] var1, BigDecimal var2, List<BigDecimal> var3) {
      RoleData var4;
      LoginResult var5;
      LoginResult var10000 = var5 = (var4 = this.vd()).getLoginResult();
      int var6 = var1[3 >> 1].getUsetime();
      long var7;
      if ((var7 = var10000.getGold().longValue()) / var2.longValue() < (long)var6) {
         var6 = (int)(var7 / var2.longValue());
      }

      int var13 = 0;
      String[] var8;
      int var16;
      if (MsgUntil.getGoodLvl((var8 = var1[2 & 5].getValue().split("\\|"))[2 & 5]) >= (23 & 111)) {
         var16 = 5 >> 3;
         this.aej.f("还没开放8级佩饰培养");
         return (boolean)var16;
      } else {
         if (GoodType.am(var1[--1].getType())) {
            if (this.uw().n(--2, 59 & 79)) {
               var16 = 3 ^ 3;
               this.aej.fw("副配饰只允许使用配饰精华");
               return (boolean)var16;
            }

            if (MsgUntil.getGoodLvl(var1[3 & 5].getValue()) >= (1 ^ 3)) {
               var16 = 5 >> 3;
               this.aej.fw("副配饰已经达到2级以上");
               return (boolean)var16;
            }
         }

         int var9 = 0;

         int var10;
         for(var16 = var10 = 5 >> 3; var16 < var8.length; var16 = var10) {
            if (var8[var10].length() >= --2 && var8[var10].substring(3 & 4, 5 >> 1).equals("培养")) {
               String[] var17 = var8[var10].split("=")[--1].split("/");
               int var12 = Integer.parseInt(var17[3 & 4]);
               var13 = (var9 = Integer.parseInt(var17[--1])) - var12 + (3 & 5);
            }

            ++var10;
         }

         if (var9 == 0) {
            var16 = 3 & 4;
            this.aej.f("该配饰无法培养");
            return (boolean)var16;
         } else {
            if (var13 > var6) {
               var13 = var6;
            }

            if (var13 <= 0) {
               var16 = 2 & 5;
               this.aej.fw("#Y请凑齐物品再来");
               return (boolean)var16;
            } else {
               var2 = new BigDecimal(var2.longValue() * (long)var13);
               if (var5.getGold().longValue() < var2.longValue()) {
                  var16 = 3 >> 2;
                  this.aej.fw("#Y金钱不足");
                  return (boolean)var16;
               } else {
                  this.aej.f("一键培养了" + var13 + "次");
                  var5.setGold(var5.getGold().subtract(var2));
                  SuitOperBean var14 = new SuitOperBean();
                  PartJade var11 = new PartJade(-1L, -4 >> 2);
                  int var10004 = 3 ^ 3;
                  int var10006 = 63 & 79;
                  var11.setJade1(var13);
                  var14.setType(var10006);
                  var1[var10004].setUsetime(2 & 5);
                  var4.h(var1[5 >> 3].getRgid());
                  this.aio[0].ax((Goodstable)null);
                  var1[1].ab(var13);
                  if (var1[1].getUsetime() <= 0) {
                     var4.h(var1[1].getRgid());
                     this.aio[1].ax((Goodstable)null);
                  }

                  var14.setJade(var11);
                  var14.setGoods(var3);
                  String var15 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var14));
                  this.uw().d(var15);
                  return true;
               }
            }
         }
      }
   }

   public boolean yz(String var1, Goodstable[] var2, boolean var3) {
      if (!var1.equals("炼器") && !var1.equals("保留炼器")) {
         if (var1.equals("清除")) {
            return this.ys((Class53)null, var2, this.rm, --3);
         } else {
            return var1.equals("开光") ? this.ys((Class53)null, var2, this.rm, 2 & 5) : false;
         }
      } else {
         Class53 var5;
         if ((var5 = (Class53)this.ve().m(11 & 127)) != null) {
            int var10001;
            Goodstable[] var10002;
            if (var1.equals("保留炼器")) {
               var10001 = -4 >> 2;
               var10002 = var2;
            } else {
               var10001 = 1;
               var10002 = var2;
            }

            if (var5.zg(var10001, var10002[0].getRgid())) {
               return this.ys(var5, var2, this.rm, var1.equals("保留炼器") ? -4 >> 2 : 1);
            }
         }

         String var4 = GoodType.getExtra(var2[5 >> 3].getValue(), "炼器属性");
         if (var5 == null) {
            var5 = (Class53)this.ve().e(123 & 15);
         }

         var5.zi(var2[3 ^ 3].getRgid(), var4, var1.equals("保留炼器") ? -4 >> 2 : 1, true);
         return (boolean)(3 & 4);
      }
   }

   public void ax(Goodstable var1) {
      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.aio.length; var10000 = var2) {
         if (this.aio[var2].isVisible() && this.aio[var2].ahi.tp() == 5 >> 2) {
            Goodstable var3 = (Goodstable)this.aio[var2].ahi.hr();
            if (Class394.v(var1.getRgid(), var3.getRgid())) {
               this.aio[var2].ax(var1.getUsetime() > 0 ? var1 : null);
               this.d();
               return;
            }
         }

         ++var2;
      }

   }

   public boolean za(String var1, Goodstable[] var2, boolean var3) {
      if (!var1.equals("炼化装备") && !var1.equals("炼化仙器") && !var1.equals("炼化神兵")) {
         if (!var1.equals("装备培养") && !var1.equals("装备升级") && !var1.equals("装备重铸")) {
            return this.zb(var2, this.rm, var1, var3);
         } else if (this.vd().getLoginResult().getGold().longValue() < this.rm.longValue()) {
            int var10000 = 3 >> 2;
            this.aej.f("金钱不足");
            return (boolean)var10000;
         } else {
            this.yp(var2, var1);
            return (boolean)(4 ^ 5);
         }
      } else {
         Class53 var4;
         if ((var4 = (Class53)this.ve().m(111 & 27)) != null && var4.zg(3 ^ 3, var2[3 ^ 3].getRgid())) {
            return this.ys(var4, var2, this.rm, --4);
         } else {
            String var5 = GoodType.getExtra(var2[3 >> 2].getValue(), "炼化属性");
            if (var4 == null) {
               var4 = (Class53)this.ve().e(31 & 107);
            }

            var4.zi(var2[3 ^ 3].getRgid(), var5, 3 & 4, (boolean)(--1));
            return (boolean)(3 & 4);
         }
      }
   }

   public boolean zb(Goodstable[] var1, BigDecimal var2, String var3, boolean var4) {
      int var10000;
      if (this.vd().getLoginResult().getGold().longValue() < var2.longValue()) {
         var10000 = 3 & 4;
         this.aej.f("金钱不足");
         return (boolean)var10000;
      } else {
         ArrayList var5 = new ArrayList();
         int var6 = 3 ^ 3;
         int var7 = -4 >> 2;

         int var8;
         for(var10000 = var8 = 2 & 5; var10000 < var1.length; var10000 = var8) {
            if (var1[var8] != null) {
               ++var6;
               var7 = var8;
               if (var1[var8].getGoodlock() == (2 ^ 3)) {
                  var10000 = 3 ^ 3;
                  this.aej.fw("该物品已被加锁");
                  return (boolean)var10000;
               }

               int var9 = 1;

               int var10;
               for(var10000 = var10 = 3 ^ 3; var10000 < var5.size(); var10000 = var10) {
                  if (var1[var8].getRgid().compareTo((BigDecimal)var5.get(var10)) == 0) {
                     ++var9;
                  }

                  ++var10;
               }

               if (var9 > var1[var8].getUsetime()) {
                  var10000 = 3 ^ 3;
                  this.aej.f("请凑齐物品再来");
                  return (boolean)var10000;
               }

               var5.add(var1[var8].getRgid());
            }

            ++var8;
         }

         if (var7 + (3 >> 1) != var6) {
            var10000 = 2 & 5;
            this.aej.f("#Y请在引导界面查看公式,如果引导界面没有对应公式 联系管理员补充");
            return (boolean)var10000;
         } else if (!var3.equals("佩饰培养") && !var3.equals("一键培养")) {
            if (!var3.equals("秘石合成") && !var3.equals("造型重铸") && !var3.equals("仙器分解") && !var3.equals("坐骑驭炼") && !var3.equals("守护石分解")) {
               return this.yv(var1, var2, var3, var5);
            } else {
               return this.zc(var1, var2, var3, var5, var4);
            }
         } else {
            return this.yx(var1, var2, var5);
         }
      }
   }

   public void y(int var1) {
      this.s();
      if (this.bn != var1) {
         Class250 var10000;
         label67: {
            this.bn = var1;
            this.jb.removeAllElements();
            if (var1 == 0) {
               this.jb.addElement("炼化装备");
               this.jb.addElement("炼化仙器");
               if (this.uw().gameType == (1 ^ 3)) {
                  if (!this.uw().n(--2, --3)) {
                     this.jb.addElement("炼化神兵");
                  }

                  if (!this.uw().n(--2, --3)) {
                     this.jb.addElement("装备打造");
                  }

                  this.jb.addElement("装备巫铸");
               }

               this.jb.addElement("造型重铸");
               this.jb.addElement("伙伴装备升级");
               this.jb.addElement("伙伴装备重铸");
               this.jb.addElement("伙伴装备培养");
               if (this.uw().gameMount) {
                  var10000 = this;
                  this.jb.addElement("坐骑百炼丹");
                  break label67;
               }
            } else if (var1 == (3 & 5)) {
               this.jb.addElement("佩饰培养");
               this.jb.addElement("佩饰重铸");
               this.jb.addElement("护身符培养");
               this.jb.addElement("护身符重铸");
               this.jb.addElement("彩晶石培养");
               this.jb.addElement("配饰点粹");
               this.jb.addElement("配饰粹炼");
               this.jb.addElement("配饰粹取");
               this.jb.addElement("配饰炼合");
               this.jb.addElement("配饰分解");
               if (this.uw().gameType == --2) {
                  this.jb.addElement("仙器分解");
               }

               if (this.uw().gameMount) {
                  var10000 = this;
                  this.jb.addElement("守护石分解");
                  break label67;
               }
            } else if (var1 == --2) {
               this.jb.addElement("开光");
               this.jb.addElement("炼器");
               this.jb.addElement("清除炼器");
            }

            var10000 = this;
         }

         var10000.f((String)null);

         int var2;
         for(int var3 = var2 = 3 >> 2; var3 < this.aio.length; var3 = var2) {
            label55: {
               if (var1 == 5 >> 1) {
                  if (var2 < --4) {
                     <undefinedtype> var5 = this.aio[var2];
                     int var10002 = 31483 & 1532;
                     var3 = var2;
                     var5.setBounds(var10002 + var2 % (1 ^ 3) * (95 & 99), (79 & 123) + var2 / (5 >> 1) * (69 & 123), 63 & 123, 122 & 63);
                  } else {
                     if (var2 == --4) {
                        this.aio[var2].setBounds(12799 & 20350, 109 & 126, 123 & 63, 126 & 59);
                     }

                     var3 = var2;
                  }

                  if (var3 > 4) {
                     var10000 = this;
                     this.aio[var2].setVisible((boolean)(5 >> 3));
                     break label55;
                  }
               } else {
                  this.aio[var2].setBounds((14586 & 18429) + var2 % --3 * (75 & 119), (111 & 91) + var2 / --3 * (115 & 77), 59 & 127, 126 & 59);
                  if (var2 >= --4) {
                     this.aio[var2].setVisible((boolean)(3 >> 1));
                  }
               }

               var10000 = this;
            }

            var10000.aio[var2++].ax((Goodstable)null);
         }

         this.d();
      }
   }

   public String nn() {
      int var1 = 3 >> 2;
      int var2 = -4 >> 2;
      int var3;
      int var10000 = var3 = 5 >> 3;

      while(true) {
         if (var10000 >= this.aio.length) {
            var10000 = var2;
            break;
         }

         if (!this.aio[var3].isVisible()) {
            var10000 = var2;
            break;
         }

         if (this.aio[var3].ahi.tp() == 3 >> 1) {
            ++var1;
            var2 = var3;
         }

         ++var3;
         var10000 = var3;
      }

      if (var10000 + 1 != var1) {
         return "?";
      } else {
         Goodstable var4;
         if ((var4 = this.aio[3 ^ 3].alw()) != null && GoodType.n(var4.getType())) {
            if (var1 == 3 >> 1 && var4.getValue().indexOf("炼器属性") != -4 >> 2) {
               return "清除";
            } else if (var1 == (1 ^ 3) && this.aio[--1].gl() == 505L) {
               return "开光";
            } else if (var1 == --4 && this.aio[3 & 5].gl() == 507L && this.aio[--2].gl() == 507L && this.aio[--3].gl() == 507L) {
               return "炼器";
            } else {
               return var1 == --5 && this.aio[--1].gl() == 507L && this.aio[--2].gl() == 507L && this.aio[--3].gl() == 507L && this.aio[--4].gl() == 508L ? "保留炼器" : "?";
            }
         } else {
            return "?";
         }
      }
   }


   private boolean zc(Goodstable[] var1, BigDecimal var2, String var3, List<BigDecimal> var4, boolean var5) {
      RoleData var6;
      LoginResult var7 = (var6 = this.vd()).getLoginResult();
      SuitOperBean var8 = new SuitOperBean();
      int var9;
      int var10;
      int var10000;
      if (var3.equals("秘石合成")) {
         var10000 = -4 >> 2;
         var8.setType(116 & 47);
         var9 = var10000;

         for(var10000 = var10 = 3 ^ 3; var10000 < var1.length; var10000 = var10) {
            if (var1[var10] != null) {
               if (var9 == -4 >> 2) {
                  var9 = Integer.parseInt(var1[var10].getValue().split("=")[--1]);
               } else if (var9 != Integer.parseInt(var1[var10].getValue().split("=")[3 & 5])) {
                  var10000 = 5 >> 3;
                  this.aej.f("使用等级相同的秘石合成");
                  return (boolean)var10000;
               }
            }

            ++var10;
         }

         if (var9 == -4 >> 2) {
            return (boolean)(3 & 4);
         }

         if (var9 >= --5) {
            var10000 = 3 >> 2;
            this.aej.f("最高5级");
            return (boolean)var10000;
         }
      } else if (var3.equals("造型重铸")) {
         var8.setType(119 & 30);
         if (!GoodType.n(var6.getGood((BigDecimal)var4.get(5 >> 3)).getType())) {
            var10000 = 2 & 5;
            this.aej.f("只有武器才能重铸造型");
            return (boolean)var10000;
         }
      } else {
         int var11;
         StringBuffer var21;
         if (var3.equals("仙器分解")) {
            var10000 = 3 ^ 3;
            var8.setType(31 & 119);
            var9 = var10000;
            var21 = var5 ? null : new StringBuffer("#W你是否要把");

            for(var10000 = var11 = 3 & 4; var10000 < var1.length; var10000 = var11) {
               if (var1[var11] != null) {
                  if (var1[var11].getGoodlock() == (3 & 5)) {
                     var10000 = 2 & 5;
                     this.aej.f("只能分解未加锁的仙器");
                     return (boolean)var10000;
                  }

                  if (var21 != null) {
                     long var12;
                     StringBuffer var26;
                     if ((var12 = Class509.b(var1[var11].getValue(), "阶数=", "|")) == 1L) {
                        var26 = var21;
                        ++var9;
                     } else if (var12 == 2L) {
                        var26 = var21;
                        var9 += 8;
                     } else if (var12 == 3L) {
                        var26 = var21;
                        var9 += 64;
                     } else if (var12 == 4L) {
                        var26 = var21;
                        var9 += 384;
                     } else if (var12 == 5L) {
                        var26 = var21;
                        var9 += 1920;
                     } else {
                        if (var12 == 6L) {
                           var9 += 5760;
                        }

                        var26 = var21;
                     }

                     var26.append(var1[var11].getGoodsname());
                     var21.append("(#R");
                     var21.append(MsgUntil.b((int)var12));
                     var21.append("#W阶).");
                  }
               }

               ++var11;
            }

            if (var21 != null) {
               var10000 = 3 >> 2;
               var21.append("进行分解.预计获得仙器精华数量:#R");
               var21.append(var9);
               this.aej.aal(new ConfirmBean(22 & 127, (String)null, var21.toString()));
               return (boolean)var10000;
            }
         } else if (var3.equals("坐骑驭炼")) {
            var10000 = 2 & 5;
            var8.setType(4317 & 28591);
            var9 = var10000;
            var10 = 3 & 4;

            for(var10000 = var11 = 3 & 4; var10000 < var1.length; var10000 = var11) {
               if (var1[var11] != null) {
                  if (var1[var11].getGoodlock() == (3 & 5)) {
                     var10000 = 5 >> 3;
                     this.aej.f(var1[var11].getGoodsname() + "被加锁无法操作");
                     return (boolean)var10000;
                  }

                  if (var11 == 0) {
                     var9 = Class394.an(var1[var11].getValue(), "等级=", "|");
                  } else if (var11 == (4 ^ 5)) {
                     var10 = Class394.an(var1[var11].getValue(), "等级=", "|");
                  } else if (Class394.an(var1[var11].getValue(), "等级=", "|") < (7 & 126)) {
                     var10000 = 5 >> 3;
                     this.aej.f("炼妖石最少6级才能被驭炼");
                     return (boolean)var10000;
                  }
               }

               ++var11;
            }

            if (var9 != var10) {
               this.aej.f("需要同级的百炼丹才能驭炼");
               return false;
            }
         } else if (var3.equals("守护石分解")) {
            var8.setType(13822 & 19087);
            var9 = 0;
            var21 = var5 ? null : new StringBuffer("#W你是否要把");

            for(var10000 = var11 = 0; var10000 < var1.length; var10000 = var11) {
               if (var1[var11] != null) {
                  if (var1[var11].getGoodlock() == 1) {
                     this.aej.f("只能分解未加锁的守护石");
                     return false;
                  }

                  if (var21 != null) {
                     AlchemySet var22 = this.vc().q();
                     int var13 = 0;
                     var3 = var1[var11].getValue();
                     int var20 = 0;

                     byte var14;
                     int var24;
                     for(var10000 = var14 = 0; var10000 < var3.length(); var10000 = var24) {
                        if ((var24 = var3.indexOf("|", var20 + 1)) == -4 >> 2) {
                           var24 = var3.length();
                        }

                        label201: {
                           int var15;
                           if ((var15 = var3.indexOf("=", var20 + 1)) != -4 >> 2) {
                              if (var15 > var24) {
                                 var10000 = var24;
                                 break label201;
                              }

                              String var16;
                              if ((var16 = var3.substring(var20, var15)).equals("等级")) {
                                 var13 = Class394.b(var3, var15 + 1, var24);
                                 var10000 = var24;
                                 break label201;
                              }

                              if (var16.equals("耐久")) {
                                 var10000 = var24;
                                 break label201;
                              }

                              if (var16.equals("技能")) {
                                 var20 = var15 + 1;
                                 int var25 = Class394.b(var3, var3.indexOf("#", var20 + 1) + 1, var24);
                                 var9 += (127 & 120) * var25;
                                 var10000 = var24;
                                 break label201;
                              }

                              AlchemyUnit var17 = var22 != null ? var22.getAlchemyUnit(var16) : null;
                              if (var17 == null) {
                                 var10000 = var24;
                                 break label201;
                              }

                              double var18 = Double.parseDouble(var3.substring(var15 + 1, var24));
                              var9 = (int)((double)var9 + 600.0D * Math.min(var18 / var17.getMax(), 1.0D));
                           }

                           var10000 = var24;
                        }

                        var20 = var10000 + 1;
                     }

                     var21.append(var1[var11].getGoodsname());
                     var21.append("(#R");
                     var21.append(var13);
                     var21.append("#W级).");
                  }
               }

               ++var11;
            }

            if (var21 != null) {
               var21.append("进行分解.预计获得守护之尘数量:#R");
               var21.append(var9);
               this.aej.aal(new ConfirmBean(22 & 127, (String)null, var21.toString()));
               return false;
            }
         }
      }

      var7.setGold(var7.getGold().subtract(var2));
      var9 = var8.getType() == (21933 & 10975) ? 1 : 0;

      for(var10000 = var9; var10000 < var1.length; var10000 = var9) {
         if (var1[var9] != null) {
            var1[var9].ab(1);
            if (var1[var9].getUsetime() <= 0) {
               var6.h(var1[var9].getRgid());
               this.aio[var9].ax((Goodstable)null);
            }
         }

         ++var9;
      }

      var8.setGoods(var4);
      String var23 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var8));
      this.uw().d(var23);
      return true;
   }
}
