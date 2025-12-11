package com.xy.a;

import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.MsgUntil;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
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

public class Class1 extends com.xy.q.Class30 {
   private List<Goodstable> ai;
   private Image aj;
   private boolean ak;
   private boolean al;
   private RichLabel am;
   private com.xy.q.Class54[] an;
   private String ao;
   private JLabel[] ap;
   private String aq;
   private com.xy.w.Class18[] ar;
   private com.xy.w.Class0 as;
   private Image at;
   private JLabel[] au;

   public String z(String var1, String var2, String var3) {
      if (var1 != null && var2 != null && var3 != null) {
         int var4;
         for (int var10000 = var4 = 0; var10000 < 3; var10000 = ++var4) {
            String var5 = var4 == 0 ? var1 : (var4 == 1 ? var2 : var3);
            String var10001 = "覃醖拊";
            int var6;
            if ((var6 = var5.indexOf("觉醒技")) == -1) {
               return null;
            }

            String var11;
            String var15 = var11 = var5.substring(var6);
            var10001 = ",";
            int var7;
            if ((var7 = var15.indexOf("|")) != -1) {
               var11 = var11.substring(0, var7);
            }

            if (var4 == 0) {
               var1 = var11;
            } else if (var4 == 1) {
               var2 = var11;
            } else {
               var3 = var11;
            }
         }

         String var19 = "Xl";
         String[] var10 = var1.split("\\&");
         var19 = "8v";
         String[] var12 = var2.split("\\&");
         var19 = "Xl";
         String[] var13 = var3.split("\\&");
         if (var10[1].equals(var12[1]) && var10[1].equals(var13[1])) {
            Skill var14 = this.yt().ac(var10[1]);
            double var8 = MsgUntil.r(var10[2], var12[2], var13[2]).doubleValue();
            StringBuilder var16 = new StringBuilder(String.valueOf(var14.getSkillname()));
            var19 = "x";
            var16 = var16.append("(").append(var8);
            var19 = "c";
            return var16.append(")").toString();
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public Class1(GameView var1) {
      super(42, 4, com.xy.q.Class30.afz, var1);
      String var10005 = "#\u0007\u007f\u0007\u007f\\`";
      this.al = false;
      this.ak = false;
      this.yy(-1, 0, 400, 310, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/c/80", 20, 20, 20, 20, false), null);
      this.am = new RichLabel("", com.xy.q.Class49.ac, 255);
      this.am.setBounds(155, 10, this.am.getWidth(), this.am.getHeight());
      this.add(this.am);
      String var10002 = "42E~=\bGr";
      Color var2 = Color.decode("0xA49BC8");
      this.au = new JLabel[5];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.au.length; var10000 = var3) {
         this.au[var3] = new JLabel();
         this.au[var3].setForeground(var2);
         this.au[var3].setBackground(com.xy.q.Class49.bk);
         this.au[var3].setFont(com.xy.q.Class49.ac);
         this.add(this.au[var3++]);
      }

      com.xy.v.Class32 var6 = new com.xy.v.Class32(2, 2, 24, 24);
      this.an = new com.xy.q.Class54[4];

      int var4;
      for (int var8 = var4 = 0; var8 < this.an.length; var8 = var4) {
         this.an[var4] = new com.xy.q.Class54(this);
         this.an[var4].wp(var6);
         com.xy.q.Class54 var12 = this.an[var4];
         String var10003 = "#\u0007\u007f\u0007\u007f\\e";
         var12.dq("sc/c/85");
         this.add(this.an[var4++]);
      }

      this.ar = new com.xy.w.Class18[9];
      this.ap = new JLabel[9];
      String var9 = "42E\u007fF~By";
      var2 = Color.decode("0xA5B4F3");

      for (int var10 = var4 = 0; var10 < this.ar.length; var10 = var4) {
         this.ar[var4] = new com.xy.w.Class18();
         this.ar[var4].setOpaque(true);
         this.ar[var4].setBounds(10, 180 + var4 * 20, 20, 20);
         this.add(this.ar[var4]);
         this.ap[var4] = new JLabel();
         this.ap[var4].setForeground(var2);
         this.ap[var4].setBackground(com.xy.q.Class49.bk);
         this.ap[var4].setFont(com.xy.q.Class49.ac);
         this.ap[var4].setBounds(35, 180 + var4 * 20, 105, 20);
         this.add(this.ap[var4++]);
      }
   }

   public void aa(RoleSummoning var1, List<Goodstable> var2, boolean var3) {
      RoleData var4 = this.yx();
      int var5 = Integer.parseInt(var1.getSummoningid());
      this.al = (var1.getPetlock() >>> 0 & 1) == 1;
      this.ak = (var1.getPetlock() >>> 1 & 1) == 1 || var5 >= 100000 && var5 <= 200000;
      this.as = var1.getPart(this.afx);
      if (this.ai == null) {
         this.ai = new ArrayList<>();
      } else {
         this.ai.clear();
      }

      Goodstable var6 = null;
      Goodstable var7 = null;
      Goodstable var8 = null;
      Goodstable var9 = null;
      int var10;
      if (var2 != null) {
         for (int var10000 = var10 = 0; var10000 < var2.size(); var10000 = ++var10) {
            Goodstable var11;
            if ((var11 = var2.get(var10)).getType() == 750L) {
               this.ai.add(var11);
            } else if (var11.getType() == 729L) {
               var6 = var11;
            } else if (var11.getType() == 510L) {
               var7 = var11;
            } else if (var11.getType() == 511L) {
               var8 = var11;
            } else if (var11.getType() == 512L) {
               var9 = var11;
            }
         }
      } else {
         if (var1.getStye() != null && var1.getStye().length() > 1) {
            String var65 = var1.getStye();
            String var10001 = "8,";
            String[] var27 = var65.split("\\|");

            int var30;
            for (int var66 = var30 = 1; var66 < var27.length; var66 = ++var30) {
               var65 = var27[var30];
               var10001 = "g";
               String[] var12;
               Goodstable var13;
               if ((var12 = var65.split("-")).length >= 2 && (var13 = var4.getGoodEquip(new BigDecimal(var12[1]))) != null) {
                  if (var13.getType() == 729L) {
                     var6 = var13;
                  } else if (var13.getType() == 510L) {
                     var7 = var13;
                  } else if (var13.getType() == 511L) {
                     var8 = var13;
                  } else if (var13.getType() == 512L) {
                     var9 = var13;
                  }
               }
            }
         }

         if (var1.getInnerGoods() != null && !var1.getInnerGoods().equals("")) {
            String var68 = var1.getInnerGoods();
            String var107 = "8,";
            String[] var28 = var68.split("\\|");

            int var31;
            for (int var69 = var31 = 0; var69 < var28.length; var69 = ++var31) {
               Goodstable var33;
               if ((var33 = var4.getGoodEquip(new BigDecimal(var28[var31]))) != null) {
                  this.ai.add(var33);
               }
            }
         }
      }

      String var29 = null;
      int var32 = 0;
      int var34 = 0;
      ArrayList var35 = new ArrayList();
      if (var1.getPetSkills() != null && !var1.getPetSkills().equals("")) {
         String var70 = var1.getPetSkills();
         String var108 = "X6";
         String[] var14 = var70.split("\\|");

         int var15;
         for (int var71 = var15 = 0; var71 < var14.length; var71 = ++var15) {
            var70 = var14[var15];
            var108 = "\u001c";
            if (var70.startsWith("L")) {
               var29 = var14[var15];
            } else {
               var70 = var14[var15];
               var108 = "\u0012";
               if (!var70.startsWith("X")) {
                  var70 = var14[var15];
                  var108 = "\u0001";
                  if (var70.startsWith("Q")) {
                     var34 = Integer.parseInt(var14[var15].substring(1));
                  } else {
                     var70 = var14[var15];
                     var108 = "\u001e";
                     if (var70.startsWith("T")) {
                        var32 = Integer.parseInt(var14[var15].substring(1));
                     } else {
                        var35.add(var14[var15]);
                     }
                  }
               }
            }
         }
      }

      String var114;
      if (var32 != 0) {
         StringBuilder var113 = new StringBuilder(String.valueOf(var32));
         String var10002 = "陦";
         var114 = var113.append("阶").toString();
      } else {
         var114 = null;
      }

      this.aq = var114;
      if (var34 != 0) {
         StringBuilder var115 = new StringBuilder(String.valueOf(var34));
         String var151 = "歫";
         var114 = var115.append("次").toString();
      } else {
         var114 = null;
      }

      StringBuffer var36;
      label415: {
         this.ao = var114;
         StringBuffer var76 = var36 = new StringBuffer();
         var114 = "G\u0007";
         var76.append("#W");
         var36.append(var1.getSummoningname());
         String var10004 = "'\u0018$j";
         var36.append("#R  ");
         var36.append(com.xy.v.Class4.k(var1.getGrade()));
         String var10006 = "G\"G3\"\u0012\"\u0016'a扴锯珣p";
         var36.append("#r#cFBFFC1成长率 ");
         var36.append(var1.getGrowlevel());
         String var10008 = "C$鿓骬2";
         var36.append("\t 龙骨x");
         var36.append(var1.getDragon());
         String var77 = var1.getSsn();
         var114 = "e";
         if (!var77.equals("5")) {
            String var78 = var1.getSummoningid();
            var114 = "6z4{6\u007f";
            if (!var78.equals("200125")) {
               break label415;
            }
         }

         var114 = "Dp鿽淞乜\u0087";
         var36.append("  龙涎丸×");
         var36.append(var1.getDraC());
      }

      int[] var37 = PetProperty.getPetHMASp(var1, this.yx());
      int var16 = String.valueOf(var37[0]).length() + String.valueOf(var1.getHp()).length();
      var114 = "ivig}@\u000eArG汞衄j";
      var36.append("#r#c7DDE8C气血 ");
      var36.append(var37[0]);
      String var10005 = "s3x";
      StringBuilder var10003 = new StringBuilder("#W(").append(var1.getHp());
      String var175 = "-j";
      var36.append(var10003.append(") ").toString());
      int var17 = var16;

      for (int var79 = var16; var79 < 10; var79 = var17) {
         var17++;
         var114 = "p";
         var36.append(" ");
      }

      var114 = "ig}@\u000eArG敱凿j";
      var36.append("#c7DDE8C攻击 ");
      var36.append(var37[2]);
      var10005 = "s3x";
      var10003 = new StringBuilder("#W(").append(var1.getAp());
      var175 = "-j";
      var36.append(var10003.append(") ").toString());
      var175 = "s\u0016s\u0007g \u0014!h'沅勿p";
      var36.append("#r#c7DDE8C法力 ");
      var36.append(var37[1]);
      String var196 = "iSb";
      StringBuilder var191 = new StringBuilder("#W(").append(var1.getMp());
      String var10007 = "Mp";
      var36.append(var191.append(") ").toString());
      var17 = String.valueOf(var37[1]).length() + String.valueOf(var1.getMp()).length();

      for (int var80 = var17; var80 < 10; var80 = var17) {
         var17++;
         var114 = "j";
         var36.append(" ");
      }

      String var152 = "s\u0007g \u0014!h'遏廂p";
      var36.append("#c7DDE8C速度 ");
      var36.append(var37[3]);
      String var192 = "iSb";
      StringBuilder var178 = new StringBuilder("#W(").append(var1.getSp());
      var10005 = "Mp";
      var36.append(var178.append(") ").toString());
      if (var1.getTurnRount() == 4) {
         var114 = "ivig}@\u000eArG秏实j";
         var36.append("#r#c7DDE8C禅定 ");
         var36.append(var37[4]);
         String var164 = "s3xTy";
         var36.append("#W(0)");
      }

      var114 = "'8')@rE\b2\t冁j$j丽j";
      var36.append("#r#cD8AB6C内   丹 ");
      var17 = 0;

      for (int var81 = var17; var81 < this.ai.size(); var81 = var17) {
         if (var17 != 0) {
            var114 = "G\"DpDpDpDp";
            var36.append("#r        ");
         }

         Goodstable var18 = this.ai.get(var17);
         var36.append(var18.getGoodsname());
         var152 = "$j";
         var36.append("  ");
         String var165 = var18.getValue();
         var175 = "8,";
         String var166 = var165.split("\\|")[2];
         var175 = "w";
         var36.append(var166.split("=")[1]);
         var17++;
         var175 = "绷";
         var36.append("级");
      }

      if (var1.getTurnRount() >= 4) {
         var17 = 0;
         int var43 = 9;
         if (var29 != null) {
            var114 = "w";
            String[] var82 = var29.split("=");
            var43 = Integer.parseInt(var82[0].substring(1));
            var17 = BaseValue.getLxLvl(Integer.parseInt(var82[1]));
         }

         var114 = "s\u0016s=瀥狤拐肙j";
         var36.append("#r#Y灵犀技能:");
         var36.append(var17);
         String var167 = "j弄呥抄肷核p";
         var36.append(" 开启技能格:");
         var36.append(var43);
         var10005 = "\u007fUf";
         var36.append("/16");
      }

      var114 = "ivj'8')<\u000f@\u000fB\f炸姜欥攺$j$j";
      var36.append("#r #r#c8EDEFF炼妖次数    ");
      var36.append(var1.getAlchemynum());
      String[] var42 = null;
      String[] var44 = null;
      if (var1.getResistance() != null && !var1.getResistance().equals("")) {
         String var83 = var1.getResistance();
         var114 = "8,";
         var42 = var83.split("\\|");
      }

      if (var1.getLyk() != null && !var1.getLyk().equals("")) {
         String var84 = var1.getLyk();
         var114 = "X6";
         var44 = var84.split("\\|");

         int var19;
         for (int var85 = var19 = 0; var85 < var44.length; var85 = ++var19) {
            var84 = var44[var19];
            var114 = "爹咥仢客m";
            if (var84.startsWith("物品亲密=")) {
               var44[var19] = null;
            }
         }
      }

      if (var42 != null) {
         double var45 = 0.0;
         double var21 = 0.0;

         int var23;
         for (int var87 = var23 = 0; var87 < var42.length; var87 = var23) {
            String[] var24;
            StringBuffer var91;
            label376: {
               String var88 = var42[var23];
               var114 = "w";
               var45 = Double.parseDouble((var24 = var88.split("="))[1]);
               StringBuilder var89 = new StringBuilder(String.valueOf(var24[0]));
               var114 = "m";
               String var25 = var89.append("=").toString();
               var21 = 0.0;
               int var26;
               if (var44 != null) {
                  for (int var90 = var26 = 0; var90 < var44.length; var90 = ++var26) {
                     if (var44[var26] != null && var44[var26].startsWith(var25)) {
                        var91 = var36;
                        var152 = var44[var26];
                        String var168 = "w";
                        var21 = Double.parseDouble(var152.split("=")[1]);
                        var44[var26] = null;
                        break label376;
                     }
                  }
               }

               var91 = var36;
            }

            var114 = "G\"";
            var91.append("#r");
            var36.append(var24[0]);
            String var169 = ">j";
            var36.append(": ");
            var36.append(var45 + var21);
            var10005 = "xG\u0007";
            var36.append("(#W");
            var36.append(var45);
            var10007 = "igrA\u000eA\fBa";
            var36.append("#c8EDEFF+");
            var36.append(var21);
            var23++;
            String var10009 = "y";
            var36.append(")");
         }
      }

      if (var44 != null) {
         int var47 = 0;

         int var20;
         for (int var92 = var20 = 0; var92 < var44.length; var92 = ++var20) {
            if (var44[var20] != null) {
               if (var47 % 2 == 0) {
                  var114 = "'8";
                  var114 = "#r";
               } else {
                  var114 = "p";
                  var114 = " ";
               }

               var36.append(var114);
               var152 = var44[var20];
               String var170 = "w";
               var175 = "^p";
               var47++;
               var36.append(var152.replaceAll("=", ": "));
            }
         }
      }

      var114 = "'8'\u0013裁奍>ivj'8'\u0013觍釘抄p";
      var36.append("#r#Y装备:#r #r#Y觉醒技:");
      Goodstable var156;
      if (var7 != null) {
         var114 = var7.getValue();
         var156 = var8;
      } else {
         var114 = null;
         var156 = var8;
      }

      Goodstable var171;
      if (var156 != null) {
         var152 = var8.getValue();
         var171 = var9;
      } else {
         var152 = null;
         var171 = var9;
      }

      String var48;
      Class1 var93;
      if ((var48 = this.z(var114, var152, var171 != null ? var9.getValue() : null)) != null) {
         var36.append(var48);
         var93 = this;
      } else {
         var114 = "杺覭釂";
         var36.append("未觉醒");
         var93 = this;
      }

      var93.am.setTextSize(var36.toString(), 255);
      int var94 = 0;
      this.am.setBounds(155, 10, this.am.getWidth(), this.am.getHeight());

      for (int var49 = 0; var94 < this.an.length; var94 = ++var49) {
         this.an[var49].setBounds(195 + 30 * var49, this.am.getHeight() - 35, 26, 26);
         if (var49 == 3) {
            if (var6 != null) {
               this.an[var49].gs(1, var6);
            } else {
               this.an[var49].gs(0, null);
               this.an[var49].setVisible(true);
            }
         } else {
            Goodstable var53 = var49 == 0 ? var7 : (var49 == 1 ? var8 : var9);
            if (var53 != null) {
               this.an[var49].gs(1, var53);
            } else {
               this.an[var49].gs(0, null);
               this.an[var49].setVisible(true);
            }
         }
      }

      int var50;
      for (int var95 = var50 = 0; var95 < var37.length; var95 = var50) {
         var37[var50++] = 0;
      }

      if ((var50 = var1.getOpenSealByType(0)) > 9) {
         var50 = 9;
      }

      int var54;
      for (int var96 = var54 = var50; var96 < 9; var96 = var54) {
         this.ar[var54].setVisible(false);
         this.ap[var54++].setVisible(false);
      }

      for (int var97 = var54 = 0; var97 < var50; var97 = var54) {
         Skill var22 = null;
         int var60 = -1;
         int var99;
         if (var54 == 6 && var1.getBeastSkills() != null && !var1.getBeastSkills().equals("")) {
            var22 = this.yt().ac(var1.getBeastSkills());
            var99 = var54;
         } else {
            if (var54 < 6 && var35 != null && var54 < var35.size() || var54 > 6 && var35 != null && var54 - 1 < var35.size()) {
               String var61;
               String var98 = var61 = (String)var35.get(var54 < 6 ? var54 : var54 - 1);
               var114 = "w";
               int var63;
               if ((var63 = var98.indexOf("=")) != -1) {
                  var60 = Integer.parseInt(var61.substring(var63 + 1));
               }

               var22 = this.yt().ac(var63 == -1 ? var61 : var61.substring(0, var63));
            }

            var99 = var54;
         }

         int var62 = var99;
         Skill var100;
         if (var54 == 6) {
            var62 = var50 - 1;
            var100 = var22;
         } else {
            if (var62 > 6) {
               var62 = var54 - 1;
            }

            var100 = var22;
         }

         label314: {
            if (var100 != null) {
               this.ar[var62].gt(com.xy.w.Class15.h(var22.getSkillid()));
               Skill var101;
               if (var60 != -1) {
                  var101 = var22;
                  JLabel var146 = this.ap[var62];
                  StringBuilder var158 = new StringBuilder(String.valueOf(var22.getSkillname()));
                  String var172 = "x";
                  StringBuilder var159 = var158.append("(").append(var60);
                  String var173 = "c";
                  var146.setText(var159.append(")").toString());
               } else {
                  this.ap[var62].setText(var22.getSkillname());
                  var101 = var22;
               }

               int var64;
               if ((var64 = Integer.parseInt(var101.getSkillid())) == 1815) {
                  var93 = this;
                  var37[0] = 50;
                  break label314;
               }

               if (var64 == 1816) {
                  var93 = this;
                  var37[1] = 50;
                  break label314;
               }

               if (var64 == 1817) {
                  var93 = this;
                  var37[4] = 50;
                  break label314;
               }

               if (var64 == 1818) {
                  var93 = this;
                  var37[3] = 50;
                  break label314;
               }

               if (var64 == 1819) {
                  var93 = this;
                  var37[2] = 50;
                  break label314;
               }
            } else {
               com.xy.w.Class18 var147 = this.ar[var62];
               var152 = "#\u0007\u007f\u0007\u007f\\e";
               var147.dp("sc/c/85");
               JLabel var103 = this.ap[var62];
               var114 = "嶸弄呥";
               var103.setText("已开启");
            }

            var93 = this;
         }

         var93.ar[var62].setVisible(true);
         var54++;
         this.ap[var62].setVisible(true);
      }

      var54 = 10 + this.am.getHeight();
      if (180 + var50 * 20 > var54) {
         var54 = 180 + var50 * 20;
      }

      var54 += 30;
      var16 = var37[0] == 0 && var37[1] == 0 && var37[2] == 0 && var37[3] == 0 && var37[4] == 0 ? 1 : 2;
      int var104 = 0;
      var37[0] += Integer.parseInt(var1.getGold()) / var16;
      var37[1] += Integer.parseInt(var1.getWood()) / var16;
      var37[2] += Integer.parseInt(var1.getSoil()) / var16;
      var37[3] += Integer.parseInt(var1.getFire()) / var16;
      var37[4] += Integer.parseInt(var1.getWater()) / var16;
      JLabel var189 = this.au[0];
      var196 = "醵j";
      var189.setText("金:" + var37[0]);
      JLabel var183 = this.au[1];
      var10007 = "本p";
      var183.setText("木:" + var37[1]);
      JLabel var174 = this.au[2];
      String var193 = "坻j";
      var174.setText("土:" + var37[2]);
      JLabel var161 = this.au[3];
      var10005 = "氰p";
      var161.setText("水:" + var37[4]);
      JLabel var149 = this.au[4];
      var175 = "瀏j";
      var149.setText("火:" + var37[3]);

      for (int var59 = 0; var104 < 5; var104 = var59) {
         JLabel var105 = this.au[var59];
         int var150 = 130 + var59 * 52;
         int var162 = var54 - 20;
         var59++;
         var105.setBounds(var150, var162, 52, 30);
      }

      var54 += 15;
      this.ab(var54, var3);
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      if (this.al) {
         var1.drawImage(com.xy.w.Class15.s, 120, 15, 10, 12, this);
      }

      if (this.ak) {
         var1.drawImage(com.xy.w.Class15.a, 351, 0, this);
      }

      if (this.as != null) {
         this.as.r(var1, 85, 135, 0, com.xy.v.Class22.l());
      }

      if (this.aq != null) {
         if (this.at == null) {
            String var10001 = "#\u0007\u007f\u0007\u007f\\f";
            this.at = com.xy.w.Class16.c("sc/c/86");
         }

         var1.drawImage(this.at, 15, 130, this);
         var1.setColor(Color.white);
         var1.setFont(com.xy.q.Class49.ac);
         var1.drawString(this.aq, 57, 145);
      }

      if (this.ao != null) {
         if (this.aj == null) {
            String var2 = "9gege<}";
            this.aj = com.xy.w.Class16.c("sc/c/87");
         }

         var1.drawImage(this.aj, 15, 150, this);
         var1.setColor(Color.white);
         var1.setFont(com.xy.q.Class49.ac);
         var1.drawString(this.ao, 57, 165);
      }
   }

   public void ab(int var1, boolean var2) {
      int var3 = this.getWidth();
      Point var5 = var2 ? this.ze().df(var3, var1) : this.ze().dd(var3, var1);
      this.yv(var5.x, var5.y, var3, var1);
      this.zc().b(this.lj());
   }
}
