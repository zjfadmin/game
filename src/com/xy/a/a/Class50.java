package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.game.HandlePet;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class50 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] aqa;
   private com.xy.i.Class4[] aqb;
   private com.xy.q.Class18 aqc;
   private com.xy.q.Class4 aqd;
   private JLabel[] ir;
   private JScrollPane rf;
   private Class61[] aqe;
   private com.xy.q.Class54 jw;
   private BigDecimal dt;
   private JScrollPane i;
   private BigDecimal bn;
   private RichLabel ck;
   private static Image bp = com.xy.w.Class16.c("sc/d/113.png");

   public void lc(RolePet var1) {
      if (var1 == null) {
         this.h();
      } else {
         RoleSummoning var2 = var1.getPet();
         ArrayList var3 = new ArrayList();
         if (var2.getPetSkills() != null && !var2.getPetSkills().equals("")) {
            String var10000 = var2.getPetSkills();
            String var10001 = "4p";
            String[] var4 = var10000.split("\\|");

            int var5;
            for (int var12 = var5 = 0; var12 < var4.length; var12 = ++var5) {
               var10000 = var4[var5];
               var10001 = "f";
               if (!var10000.startsWith("L")) {
                  var10000 = var4[var5];
                  var10001 = "]";
                  if (!var10000.startsWith("Q")) {
                     var10000 = var4[var5];
                     var10001 = "~";
                     if (!var10000.startsWith("T")) {
                        var10000 = var4[var5];
                        var10001 = "T";
                        if (!var10000.startsWith("X")) {
                           var3.add(var4[var5]);
                        }
                     }
                  }
               }
            }
         }

         this.bn = var1.getId();
         int var10 = var2.getOpenSealByType(0);
         int var11 = var2.getOpenSealByType(1);

         int var6;
         for (int var17 = var6 = 0; var17 < 9; var17 = ++var6) {
            if (var6 >= var10) {
               if (this.za().gamePetSkill && var6 >= var11) {
                  this.aqe[var6].cc(-2, -1);
               } else {
                  this.aqe[var6].cc(-1, -1);
               }
            } else if (var6 != 6 || var2.getBeastSkills() == null || var2.getBeastSkills().equals("")) {
               if (var6 < 6 && var3 != null && var6 < var3.size() || var6 > 6 && var3 != null && var6 - 1 < var3.size()) {
                  String var7;
                  String var18 = var7 = (String)var3.get(var6 < 6 ? var6 : var6 - 1);
                  String var23 = "\u0017";
                  int var8;
                  int var9 = (var8 = var18.indexOf("=")) == -1 ? -1 : Integer.parseInt(var7.substring(var8 + 1));
                  this.aqe[var6].cc(Integer.parseInt(var8 == -1 ? var7 : var7.substring(0, var8)), var9);
               } else {
                  this.aqe[var6].cc(0, -1);
               }
            }
         }
      }
   }

   public void f() {
      this.aqc.t();
      this.aqd.t();
   }

   public void aim(Goodstable var1, RoleSummoning var2) {
      this.aqc.ef(var2.getSid().longValue());
      this.aqd.ef(var1.getRgid().longValue());
      this.f();
      this.zc().b(this.lj());
   }

   public void g(int var1) {
      if (var1 == 141 || var1 == 142) {
         RoleSummoning var2 = this.yx().getPet(this.bn);
         Goodstable var3 = this.yx().getGood(this.dt);
         if (var2 == null || var3 == null) {
            return;
         }

         if (var3.getGoodlock() == 1) {
            String var24 = "讍牥咩巾勈锍";
            this.afx.dp("该物品已加锁");
            return;
         }

         if (var1 == 141) {
            String var8 = var2.getPetSkills();
            int var9;
            if ((var9 = var2.getOpenSealByType(0)) > 0 && var8 != null && !var8.equals("")) {
               String var17 = "7V";
               int var7 = var8.split("\\|").length;
               var17 = "@";
               if (var8.indexOf("L") != -1) {
                  var7--;
               }

               var17 = "{";
               if (var8.indexOf("Q") != -1) {
                  var7--;
               }

               var17 = "T";
               if (var8.indexOf("X") != -1) {
                  var7--;
               }

               var17 = "~";
               if (var8.indexOf("T") != -1) {
                  var7--;
               }

               if (HandlePet.getSkillNum(var9) <= var7) {
                  var17 = "叠啌共拨胱桔孜嶚练溉亊";
                  this.afx._do("召唤兽技能格子已经满了");
                  return;
               }
            }

            StringBuilder var22 = new StringBuilder(String.valueOf(var3.getRgid().toString()));
            String var25 = "V";
            String var6 = Agreement.getSendTextAES("userpet", var22.append("|").append(var2.getSid()).toString());
            this.za().k(var6);
            return;
         }

         if (var1 == 142) {
            byte var12;
            label58: {
               String var10000 = var2.getSsn();
               String var10001 = ">";
               if (!var10000.equals("2")) {
                  String var10 = var2.getSsn();
                  var10001 = "\u0019";
                  if (!var10.equals("3")) {
                     String var11 = var2.getSsn();
                     var10001 = "8";
                     if (!var11.equals("4")) {
                        var12 = 6;
                        break label58;
                     }
                  }
               }

               var12 = 9;
            }

            byte var4 = var12;
            if (var2.getOpenSealByType(1) >= var4) {
               String var16 = "迳厁叆問兗盯抪肖栖嬻郗嶙觉彫Ｋ";
               this.afx._do("这只召唤兽的技能格子都已解开！");
               return;
            }

            String var10003 = "F8p";
            StringBuilder var15 = new StringBuilder("JP|").append(var2.getSid());
            String var10002 = "V";
            String var5 = Agreement.getSendTextAES("userpet", var15.append("|").append(var3.getRgid()).toString());
            this.za().k(var5);
         }
      }
   }

   // $VF: synthetic method
   static Image gu() {
      return bp;
   }

   public Class50(GameView var1) {
      super(163, 2, com.xy.q.Class30.afz, var1);
      String var10012 = "\u0018IDND\u001bEZ\u0005M";
      this.yy(-1, 0, 487, 448, com.xy.q.Class30.agh);
      com.xy.w.Class9 var33 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10013 = "聖鬬丵";
      this.yu(var33, "聚魄丹");
      this.aqc = new com.xy.q.Class18(this);
      this.aqc.setBounds(0, 0, 150, 20);
      this.aqd = new com.xy.q.Class4(this);
      this.aqd.setBounds(0, 0, 150, 20);
      this.i = com.xy.q.Class1.g(43, 59, 155, 168, this.aqc, 20);
      this.rf = com.xy.q.Class1.g(43, 252, 155, 168, this.aqd, 20);
      this.add(this.i);
      this.add(this.rf);
      this.aqb = new com.xy.i.Class4[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aqb.length; var10000 = var2) {
         com.xy.i.Class4[] var6 = this.aqb;
         String var29;
         if (var2 == 2) {
            var29 = "\u0018IDOD\u001bEZ\u0005M";
            var29 = "sc/e/1.png";
         } else {
            var29 = "\u007f\u000b#\r#Z:F|\u0006k";
            var29 = "sc/e/26.png";
         }

         int var10006 = 141 + var2;
         String var31;
         Class50 var10010;
         if (var2 == 0) {
            var31 = "菜徽拫胗";
            var31 = "获得技能";
            var10010 = this;
         } else if (var2 == 1) {
            var31 = "彨抌肕栰";
            var31 = "开技能格";
            var10010 = this;
         } else {
            var31 = "";
            var10010 = this;
         }

         com.xy.i.Class4 var10001 = new com.xy.i.Class4(var29, 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var31, var10010);
         var6[var2] = var10001;
         Class50 var7;
         if (var2 == 2) {
            var7 = this;
            this.aqb[var2].setBounds(437, 48, 18, 18);
         } else {
            var7 = this;
            this.aqb[var2].setBounds(223 + 128 * var2, 398, 99, 25);
         }

         var7.add(this.aqb[var2++]);
      }

      this.ir = new JLabel[2];

      for (int var8 = var2 = 0; var8 < this.ir.length; var8 = var2) {
         this.ir[var2] = com.xy.q.Class1.k(43, 38 + 193 * var2, 155, 21, Color.white, com.xy.q.Class49.ch);
         JLabel var9 = this.ir[var2];
         String var15;
         if (var2 == 0) {
            var15 = "叆問兗剼衂";
            var15 = "召唤兽列表";
         } else if (var2 == 1) {
            var15 = "择条聖鬬丵";
            var15 = "拥有聚魄丹";
         } else {
            var15 = "";
         }

         var9.setText(var15);
         this.ir[var2].setHorizontalAlignment(0);
         this.add(this.ir[var2++]);
      }

      this.ck = new RichLabel("", com.xy.q.Class49.w);
      this.add(this.ck);
      this.aqe = new Class61[9];

      for (int var10 = var2 = 0; var10 < this.aqe.length; var10 = var2) {
         this.aqe[var2] = new Class61(this, var2);
         Class50 var11;
         if (var2 == 0) {
            var11 = this;
            this.aqe[var2].setBounds(301, 40, 62, 62);
         } else if (var2 == 1) {
            var11 = this;
            this.aqe[var2].setBounds(233, 82, 62, 62);
         } else if (var2 == 2) {
            var11 = this;
            this.aqe[var2].setBounds(204, 149, 62, 62);
         } else if (var2 == 3) {
            var11 = this;
            this.aqe[var2].setBounds(233, 217, 62, 62);
         } else if (var2 == 4) {
            var11 = this;
            this.aqe[var2].setBounds(301, 259, 62, 62);
         } else if (var2 == 5) {
            var11 = this;
            this.aqe[var2].setBounds(370, 216, 62, 62);
         } else if (var2 == 6) {
            var11 = this;
            this.aqe[var2].setVisible(false);
         } else if (var2 == 7) {
            var11 = this;
            this.aqe[var2].setBounds(398, 149, 62, 62);
         } else {
            if (var2 == 8) {
               this.aqe[var2].setBounds(369, 82, 62, 62);
            }

            var11 = this;
         }

         var11.add(this.aqe[var2++]);
      }

      this.jw = new com.xy.q.Class54(this);
      this.jw.setBounds(210, 337, 50, 50);
      this.add(this.jw);
      this.aqa = new com.xy.w.Class18[7];

      for (int var12 = var2 = 0; var12 < this.aqa.length; var12 = var2) {
         this.aqa[var2] = new com.xy.w.Class18();
         Class50 var13;
         if (var2 == 0 || var2 == 1) {
            var13 = this;
            com.xy.w.Class18 var26 = this.aqa[var2];
            String var28 = "Y\b\u0005\u000f\u0005Y\u001fEZ\u0005M";
            var26.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aqa[var2].setBounds(43, 38 + 193 * var2, 155, 21);
         } else if (var2 == 2 || var2 == 3) {
            var13 = this;
            com.xy.w.Class18 var25 = this.aqa[var2];
            String var10003 = "\u007f\u000b#\f#Z8F|\u0006k";
            var25.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aqa[var2].setBounds(43, 38 + 193 * (var2 - 2), 155, 190);
         } else if (var2 == 4) {
            var13 = this;
            this.aqa[var2].setBounds(202, 37, 264, 291);
            com.xy.w.Class18 var17 = this.aqa[var2];
            String var22 = "\u0018IDND\u001bZ\u001eEZ\u0005M";
            var17.dp("sc/d/114.png");
         } else if (var2 == 5) {
            var13 = this;
            this.aqa[var2].setBounds(206, 333, 59, 57);
            com.xy.w.Class18 var18 = this.aqa[var2];
            String var23 = "\u001boGhG8F|\u0006k";
            var18.dp("sc/d/4.png");
         } else {
            if (var2 == 6) {
               com.xy.w.Class18 var19 = this.aqa[var2];
               String var24 = "Y\b\u0005\u000f\u0005Y\u001eEZ\u0005M";
               var19.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.aqa[var2].setBounds(270, 333, 195, 56);
            }

            var13 = this;
         }

         var13.add(this.aqa[var2++]);
      }
   }

   public void h() {
      int var10000 = 0;
      this.bn = null;

      for (int var1 = 0; var10000 < this.aqe.length; var10000 = var1) {
         Class61 var2 = this.aqe[var1];
         var1++;
         var2.cc(-1, -1);
      }
   }

   public void bb(Goodstable var1) {
      if (var1 == null) {
         this.dt = null;
         this.ck.clear();
         this.jw.gs(0, null);
      } else {
         this.dt = var1.getRgid();
         String var10004 = var1.getValue();
         String var10005 = "抌肕1";
         String var10006 = "V";
         String var2 = com.xy.v.Class12.ai(var10004, "技能=", "|");
         String var10003 = var1.getValue();
         var10004 = "抌肕筅经1";
         var10005 = "V";
         String var3 = com.xy.v.Class12.ai(var10003, "技能等级=", "|");
         this.jw.gs(1, var1);
         RichLabel var10001 = this.ck;
         var10004 = "/1抌肕６KK";
         StringBuilder var10002 = new StringBuilder("#Y技能：#G").append(var2);
         var10003 = "\t\u0019\t2抪肖筣绌ＰHm";
         var10001.setTextSize(var10002.append("#r#Y技能等级：#G").append(var3).toString(), 188);
         this.ck.setBounds(274, 334, this.ck.getWidth(), this.ck.getHeight());
      }
   }

   static {
      String var10000 = "\u001boGhG=Y?F|\u0006k";
   }
}
