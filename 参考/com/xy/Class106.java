package com.xy;

import com.xy.bean.Coordinates;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.MsgUntil;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class106 extends Class345 {
   private Image kv;
   private String vt;
   private List<Goodstable> aso;
   private Class19 axa;
   private Class44[] axb;
   private boolean wk;
   private RichLabel bt;
   private String axc;
   private JLabel[] iv;
   private boolean ee;
   private Image bx;
   private JLabel[] ly;
   private Class436[] g;

   public void paint(Graphics var1) {
      super.paint(var1);
      if (this.wk) {
         var1.drawImage(Class222.u, 123 & 124, 111 & 31, 110 & 27, 110 & 29, this);
      }

      if (this.ee) {
         var1.drawImage(Class222.k, 27135 & 5983, 3 >> 2, this);
      }

      if (this.axa != null) {
         this.axa.a(var1, 95 & 117, 1967 & 30935, 3 ^ 3, Class280.l());
      }

      if (this.axc != null) {
         if (this.bx == null) {
            this.bx = Class511.a("sc/c/86");
         }

         var1.drawImage(this.bx, 79 & 63, 695 & 32202, this);
         var1.setColor(Color.white);
         var1.setFont(Class681.ce);
         var1.drawString(this.axc, 57 & 127, 8123 & 24789);
      }

      if (this.vt != null) {
         if (this.kv == null) {
            this.kv = Class511.a("sc/c/87");
         }

         var1.drawImage(this.kv, 127 & 15, 27607 & 5310, this);
         var1.setColor(Color.white);
         var1.setFont(Class681.ce);
         var1.drawString(this.vt, 127 & 57, 1021 & 31911);
      }

   }

   public String ami(String var1, String var2, String var3) {
      if (var1 != null && var2 != null && var3 != null) {
         int var4;
         for(int var10000 = var4 = 0; var10000 < 3; var10000 = var4) {
            String var5 = var4 == 0 ? var1 : (var4 == (3 & 5) ? var2 : var3);
            int var6;
            if ((var6 = var5.indexOf("觉醒技")) == -4 >> 2) {
               return null;
            }

            int var7;
            if ((var7 = (var5 = var5.substring(var6)).indexOf("|")) != -4 >> 2) {
               var5 = var5.substring(3 ^ 3, var7);
            }

            if (var4 == 0) {
               var1 = var5;
            } else if (var4 == --1) {
               var2 = var5;
            } else {
               var3 = var5;
            }

            ++var4;
         }

         String[] var10 = var1.split("\\&");
         String[] var12 = var2.split("\\&");
         String[] var11 = var3.split("\\&");
         if (var10[--1].equals(var12[2 ^ 3]) && var10[--1].equals(var11[3 >> 1])) {
            Skill var13 = this.vc().bf(var10[4 ^ 5]);
            double var8 = MsgUntil.a(var10[5 >> 1], var12[--2], var11[--2]).doubleValue();
            return var13.getSkillname() + "(" + var8 + ")";
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void jy(int var1, boolean var2) {
      int var3 = this.getWidth();
      Point var4 = var2 ? this.ux().vn(var3, var1) : this.ux().abg(var3, var1);
      this.vf(var4.x, var4.y, var3, var1);
      this.ve().a(this.ae());
   }

   public void amj(RoleSummoning var1, String var2, List<Goodstable> var3, boolean var4) {
      RoleData var5;
      RolePet var6 = (var5 = this.vd()).getRolePet(var1.getSid().longValue());
      int var7 = Integer.parseInt(var1.getSummoningid());
      this.wk = (boolean)((var1.getPetlock() >>> (3 & 4) & 5 >> 2) == 5 >> 2 ? 5 >> 2 : 0);
      this.ee = (var1.getPetlock() >>> --1 & --1) == (4 ^ 5) || var7 >= 100000 && var7 <= 200000;
      this.axa = var1.getPart(this.aej);
      if (this.aso == null) {
         this.aso = new ArrayList();
      } else {
         this.aso.clear();
      }

      Goodstable var28 = null;
      Goodstable var8 = null;
      Goodstable var9 = null;
      Goodstable var10 = null;
      int var11;
      String[] var13;
      int var10000;
      int var32;
      if (var3 != null) {
         for(var10000 = var11 = 3 & 4; var10000 < var3.size(); var10000 = var11) {
            Goodstable var12;
            if ((var12 = (Goodstable)var3.get(var11)).getType() == 750L) {
               this.aso.add(var12);
            } else if (var12.getType() == 729L) {
               var28 = var12;
            } else if (var12.getType() == 510L) {
               var8 = var12;
            } else if (var12.getType() == 511L) {
               var9 = var12;
            } else if (var12.getType() == 512L) {
               var10 = var12;
            }

            ++var11;
         }
      } else {
         String[] var31;
         if (var1.getStye() != null && var1.getStye().length() > --1) {
            var31 = var1.getStye().split("\\|");

            for(var10000 = var32 = 2 ^ 3; var10000 < var31.length; var10000 = var32) {
               Goodstable var14;
               if ((var13 = var31[var32].split("-")).length >= (1 ^ 3) && (var14 = var5.getGoodEquip(new BigDecimal(var13[3 >> 1]))) != null) {
                  if (var14.getType() == 729L) {
                     var28 = var14;
                  } else if (var14.getType() == 510L) {
                     var8 = var14;
                  } else if (var14.getType() == 511L) {
                     var9 = var14;
                  } else if (var14.getType() == 512L) {
                     var10 = var14;
                  }
               }

               ++var32;
            }
         }

         if (var1.getInnerGoods() != null && !var1.getInnerGoods().equals("")) {
            var31 = var1.getInnerGoods().split("\\|");

            for(var10000 = var32 = 3 >> 2; var10000 < var31.length; var10000 = var32) {
               Goodstable var34;
               if ((var34 = var5.getGoodEquip(new BigDecimal(var31[var32]))) != null) {
                  this.aso.add(var34);
               }

               ++var32;
            }
         }
      }

      String var33 = null;
      var32 = 3 >> 2;
      int var35 = 2 & 5;
      ArrayList var37 = new ArrayList();
      int var26;
      if (var1.getPetSkills() != null && !var1.getPetSkills().equals("")) {
         String[] var23 = var1.getPetSkills().split("\\|");

         for(var10000 = var26 = 5 >> 3; var10000 < var23.length; var10000 = var26) {
            if (var23[var26].startsWith("L")) {
               var33 = var23[var26];
            } else if (!var23[var26].startsWith("X")) {
               if (var23[var26].startsWith("Q")) {
                  var35 = Integer.parseInt(var23[var26].substring(3 & 5));
               } else if (var23[var26].startsWith("T")) {
                  var32 = Integer.parseInt(var23[var26].substring(5 >> 2));
               } else {
                  var37.add(var23[var26]);
               }
            }

            ++var26;
         }
      }

      this.axc = var32 != 0 ? var32 + "阶" : null;
      this.vt = var35 != 0 ? var35 + "次" : null;
      StringBuffer var24 = new StringBuffer();
      var24.append("#W");
      var24.append(var1.getSummoningname());
      var24.append("#R  ");
      var24.append(Class224.t(var1.getGrade()));
      var24.append("#r#cFBFFC1亲密：");
      var24.append(var1.getFriendliness());
      if (var2 != null) {
         var24.append("#r#cFBFFC1主人：");
         var24.append(var2);
      }

      var24.append("#r#cFBFFC1成长率 ");
      InputBean var27 = new InputBean(3 & 4, var1.getGrowlevel(), (Coordinates)null);
      var24.append("#V");
      var24.append(Class695.b().toJson(var27));
      var24.append("#L");
      var24.append("\t 龙骨x");
      var24.append(var1.getDragon());
      if (var1.getSsn().equals("5") || var1.getSummoningid().equals("200125")) {
         var24.append("  龙涎丸×");
         var24.append(var1.getDraC());
      }

      int[] var22 = PetProperty.getPetHMASp(var1, this.vd());
      var32 = String.valueOf(var22[3 >> 2]).length() + String.valueOf(var1.getHp()).length();
      var24.append("#r#c7DDE8C气血 ");
      var24.append(var22[3 >> 2]);
      var27 = new InputBean(0, String.valueOf(var1.getHp()), (Coordinates)null);
      var24.append("#W(#V");
      var24.append(Class695.b().toJson(var27));
      var24.append("#L)");
      var35 = var32;

      for(var10000 = var32; var10000 < 10; var10000 = var35) {
         ++var35;
         var24.append(" ");
      }

      var24.append("#c7DDE8C攻击 ");
      var24.append(var22[5 >> 1]);
      var27 = new InputBean(0, String.valueOf(var1.getAp()), (Coordinates)null);
      var24.append("#W(#V");
      var24.append(Class695.b().toJson(var27));
      var24.append("#L)");
      var24.append("#r#c7DDE8C法力 ");
      var24.append(var22[1]);
      var27 = new InputBean(0, String.valueOf(var1.getMp()), (Coordinates)null);
      var24.append("#W(#V");
      var24.append(Class695.b().toJson(var27));
      var24.append("#L)");
      var35 = String.valueOf(var22[1]).length() + String.valueOf(var1.getMp()).length();

      for(var10000 = var35; var10000 < 10; var10000 = var35) {
         ++var35;
         var24.append(" ");
      }

      var24.append("#c7DDE8C速度 ");
      var24.append(var22[--3]);
      var27 = new InputBean(0, String.valueOf(var1.getSp()), (Coordinates)null);
      var24.append("#W(#V");
      var24.append(Class695.b().toJson(var27));
      var24.append("#L)");
      if (var1.getTurnRount() == --4) {
         var24.append("#r#c7DDE8C禅定 ");
         var24.append(var22[--4]);
         var27 = new InputBean(0, "0", (Coordinates)null);
         var24.append("#W(#V");
         var24.append(Class695.b().toJson(var27));
         var24.append("#L)");
      }

      var24.append("#r#cD8AB6C内   丹 ");
      var35 = 0;

      for(var10000 = var35; var10000 < this.aso.size(); var10000 = var35) {
         if (var35 != 0) {
            var24.append("#r        ");
         }

         Goodstable var29 = (Goodstable)this.aso.get(var35);
         var24.append(var29.getGoodsname());
         var24.append("  ");
         var24.append(var29.getValue().split("\\|")[--2].split("=")[1]);
         ++var35;
         var24.append("级");
      }

      if (var1.getTurnRount() >= --4) {
         var35 = 0;
         var26 = 107 & 29;
         if (var33 != null) {
            String[] var50 = var33.split("=");
            var26 = Integer.parseInt(var50[0].substring(1));
            var35 = BaseValue.getLxLvl(Integer.parseInt(var50[1]));
         }

         var24.append("#r#Y灵犀技能:");
         var24.append(var35);
         var24.append(" 开启技能格:");
         var24.append(var26);
         var24.append("/16");
      }

      var24.append("#r #r#c8EDEFF炼妖次数    ");
      var24.append(var1.getAlchemynum());
      var13 = null;
      String[] var30 = null;
      if (var1.getResistance() != null && !var1.getResistance().equals("")) {
         var13 = var1.getResistance().split("\\|");
      }

      int var15;
      if (var1.getLyk() != null && !var1.getLyk().equals("")) {
         var30 = var1.getLyk().split("\\|");

         for(var10000 = var15 = 0; var10000 < var30.length; var10000 = var15) {
            if (var30[var15].startsWith("物品亲密=")) {
               var30[var15] = null;
            }

            ++var15;
         }
      }

      int var21;
      if (var13 != null) {
         double var38 = 0.0D;
         double var17 = 0.0D;

         for(var10000 = var11 = 0; var10000 < var13.length; var10000 = var11) {
            String[] var19;
            StringBuffer var51;
            label398: {
               var38 = Double.parseDouble((var19 = var13[var11].split("="))[1]);
               String var20 = var19[0] + "=";
               var17 = 0.0D;
               if (var30 != null) {
                  for(var10000 = var21 = 0; var10000 < var30.length; var10000 = var21) {
                     if (var30[var21] != null && var30[var21].startsWith(var20)) {
                        var51 = var24;
                        var17 = Double.parseDouble(var30[var21].split("=")[1]);
                        var30[var21] = null;
                        break label398;
                     }

                     ++var21;
                  }
               }

               var51 = var24;
            }

            var51.append("#r");
            var24.append(var19[0]);
            var24.append(": ");
            var24.append(var38 + var17);
            var24.append("(#W");
            var24.append(var38);
            var24.append("#c8EDEFF+");
            var24.append(var17);
            ++var11;
            var24.append(")");
         }
      }

      String var10002;
      if (var30 != null) {
         var15 = 0;

         int var16;
         for(var10000 = var16 = 0; var10000 < var30.length; var10000 = var16) {
            if (var30[var16] != null) {
               var24.append(var15 % (5 >> 1) == 0 ? "#r" : " ");
               var10002 = var30[var16];
               ++var15;
               var24.append(var10002.replaceAll("=", ": "));
            }

            ++var16;
         }
      }

      var24.append("#r#Y装备:#r #r#Y觉醒技:");
      String var10001;
      Goodstable var48;
      if (var8 != null) {
         var10001 = var8.getValue();
         var48 = var9;
      } else {
         var10001 = null;
         var48 = var9;
      }

      Goodstable var10003;
      if (var48 != null) {
         var10002 = var9.getValue();
         var10003 = var10;
      } else {
         var10002 = null;
         var10003 = var10;
      }

      String var40;
      if ((var40 = this.ami(var10001, var10002, var10003 != null ? var10.getValue() : null)) != null) {
         var24.append(var40);
      } else {
         var24.append("未觉醒");
      }

      boolean var39 = false;
      if (this.uw().gamePetManual && var6 != null) {
         Skill var41 = var6.getQy() > 0 ? this.vc().bf(String.valueOf(var6.getQy())) : null;
         var24.append("#r#Y契印状态:");
         var24.append(var41 != null ? var41.getSkillname() : "无契印");
         var39 = true;
      }

      this.bt.setTextSize(var24.toString(), 19455 & 13567);
      this.bt.setBounds(2751 & 30171, 26 & 111, this.bt.getWidth(), this.bt.getHeight());
      int var42 = (51 & 111) + (var39 ? 119 & 26 : 0);

      int var18;
      for(var10000 = var18 = 0; var10000 < this.axb.length; var10000 = var18) {
         this.axb[var18].setBounds((8403 & 24559) + (62 & 95) * var18, this.bt.getHeight() - var42, 26 & 127, 26 & 127);
         if (var18 == --3) {
            if (var28 != null) {
               this.axb[var18].c(1, var28);
            } else {
               this.axb[var18].c(0, (Object)null);
               this.axb[var18].setVisible(true);
            }
         } else {
            Goodstable var36 = var18 == 0 ? var8 : (var18 == 1 ? var9 : var10);
            if (var36 != null) {
               this.axb[var18].c(1, var36);
            } else {
               this.axb[var18].c(0, (Object)null);
               this.axb[var18].setVisible(true);
            }
         }

         ++var18;
      }

      for(var10000 = var18 = 0; var10000 < var22.length; var10000 = var18) {
         var22[var18++] = 0;
      }

      if ((var18 = var1.getOpenSealByType(0)) > (125 & 11)) {
         var18 = 95 & 41;
      }

      for(var10000 = var11 = var18; var10000 < 9; var10000 = var11) {
         this.g[var11].setVisible(false);
         this.iv[var11++].setVisible(false);
      }

      for(var10000 = var11 = 0; var10000 < var18; var10000 = var11) {
         Skill var43 = null;
         int var44 = -4 >> 2;
         int var25;
         if (var11 == (95 & 38) && var1.getBeastSkills() != null && !var1.getBeastSkills().equals("")) {
            var43 = this.vc().bf(var1.getBeastSkills());
            var10000 = var11;
         } else {
            if (var11 < (7 & 126) && var37 != null && var11 < var37.size() || var11 > (14 & 119) && var37 != null && var11 - 1 < var37.size()) {
               String var46;
               if ((var25 = (var46 = (String)var37.get(var11 < (70 & 63) ? var11 : var11 - 1)).indexOf("=")) != -4 >> 2) {
                  var44 = Integer.parseInt(var46.substring(var25 + 1));
               }

               var43 = this.vc().bf(var25 == -4 >> 2 ? var46 : var46.substring(0, var25));
            }

            var10000 = var11;
         }

         var21 = var10000;
         Skill var52;
         if (var11 == (23 & 110)) {
            var21 = var18 - 1;
            var52 = var43;
         } else {
            if (var21 > 6) {
               var21 = var11 - 1;
            }

            var52 = var43;
         }

         Class106 var53;
         label356: {
            if (var52 != null) {
               this.g[var21].hf(Class222.g(var43.getSkillid()));
               if (var44 != -4 >> 2) {
                  var52 = var43;
                  this.iv[var21].setText(var43.getSkillname() + "(" + var44 + ")");
               } else {
                  this.iv[var21].setText(var43.getSkillname());
                  var52 = var43;
               }

               if ((var25 = Integer.parseInt(var52.getSkillid())) == 1815) {
                  var53 = this;
                  var22[0] = 50;
                  break label356;
               }

               if (var25 == 1816) {
                  var53 = this;
                  var22[1] = 50;
                  break label356;
               }

               if (var25 == 1817) {
                  var53 = this;
                  var22[--4] = 50;
                  break label356;
               }

               if (var25 == 1818) {
                  var53 = this;
                  var22[--3] = 50;
                  break label356;
               }

               if (var25 == 1819) {
                  var53 = this;
                  var22[--2] = 50;
                  break label356;
               }
            } else {
               this.g[var21].fw("sc/c/85");
               this.iv[var21].setText("已开启");
            }

            var53 = this;
         }

         var53.g[var21].setVisible(true);
         ++var11;
         this.iv[var21].setVisible(true);
      }

      var11 = 10 + this.bt.getHeight();
      if (180 + var18 * 20 > var11) {
         var11 = 180 + var18 * 20;
      }

      var11 += 30;
      var32 = var22[0] == 0 && var22[1] == 0 && var22[2] == 0 && var22[3] == 0 && var22[4] == 0 ? 1 : 2;
      var10000 = 0;
      var22[0] += Integer.parseInt(var1.getGold()) / var32;
      var22[1] += Integer.parseInt(var1.getWood()) / var32;
      var22[2] += Integer.parseInt(var1.getSoil()) / var32;
      var22[3] += Integer.parseInt(var1.getFire()) / var32;
      var22[4] += Integer.parseInt(var1.getWater()) / var32;
      this.ly[0].setText("金:" + var22[0]);
      this.ly[1].setText("木:" + var22[1]);
      this.ly[2].setText("土:" + var22[2]);
      this.ly[3].setText("水:" + var22[4]);
      this.ly[4].setText("火:" + var22[3]);

      for(int var45 = 0; var10000 < 5; var10000 = var45) {
         JLabel var54 = this.ly[var45];
         int var47 = 130 + var45 * 52;
         int var49 = var11 - 20;
         ++var45;
         var54.setBounds(var47, var49, 52, 30);
      }

      var11 += 15;
      this.jy(var11, var4);
   }

   public Class106(GameView var1) {
      int var10007 = -4 >> 2;
      int var10009 = 3 >> 2;
      int var10011 = 3 >> 2;
      super(46 & 123, --4, Class345.aef, var1);
      this.wk = (boolean)var10011;
      this.ee = (boolean)var10009;
      this.va(var10007, 3 & 4, 10196 & 22971, 6590 & 26487, Class345.aei);
      this.uv(Class511.q("sc/c/80", 125 & 22, 125 & 22, 125 & 22, 125 & 22, (boolean)(3 ^ 3)), (String)null);
      this.bt = new RichLabel("", Class681.ce, 28927 & 4095);
      this.bt.setBounds(20731 & 12191, 107 & 30, this.bt.getWidth(), this.bt.getHeight());
      this.add(this.bt);
      Color var4 = Color.decode("0xA49BC8");
      JLabel[] var10001 = new JLabel[--5];
      boolean var10003 = true;
      this.ly = var10001;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ly.length; var10000 = var2) {
         this.ly[var2] = new JLabel();
         this.ly[var2].setForeground(var4);
         this.ly[var2].setBackground(Class681.cu);
         this.ly[var2].setFont(Class681.ce);
         this.add(this.ly[var2++]);
      }

      Class116 var5 = new Class116(--2, --2, 60 & 91, 60 & 91);
      Class44[] var6 = new Class44[--4];
      var10003 = true;
      this.axb = var6;

      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < this.axb.length; var10000 = var3) {
         this.axb[var3] = new Class44(this);
         this.axb[var3].ad(var5);
         this.axb[var3].fw("sc/c/85");
         this.add(this.axb[var3++]);
      }

      Class436[] var7 = new Class436[123 & 13];
      var10003 = true;
      this.g = var7;
      var10001 = new JLabel[13 & 123];
      var10003 = true;
      this.iv = var10001;
      var4 = Color.decode("0xA5B4F3");

      for(var10000 = var3 = 3 >> 2; var10000 < this.g.length; var10000 = var3) {
         this.g[var3] = new Class436();
         this.g[var3].setOpaque((boolean)(2 ^ 3));
         this.g[var3].setBounds(90 & 47, (5558 & 27389) + var3 * (127 & 20), 87 & 60, 87 & 60);
         this.add(this.g[var3]);
         this.iv[var3] = new JLabel();
         this.iv[var3].setForeground(var4);
         this.iv[var3].setBackground(Class681.cu);
         this.iv[var3].setFont(Class681.ce);
         this.iv[var3].setBounds(47 & 115, (4534 & 28413) + var3 * 20, 105, 20);
         this.add(this.iv[var3++]);
      }

   }
}
