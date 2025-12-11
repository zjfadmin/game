package com.xy.a.a;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class43 extends com.xy.q.Class30 {
   private JLabel[] ch;
   private int ha;
   private com.xy.q.Class58 alp;
   private com.xy.i.Class4 aln;
   private com.xy.w.Class18[] j;
   private com.xy.q.Class54[] ni;
   private int ah;

   public Class43(GameView var1) {
      super(97, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "$vxqx$ye9r";
      this.ah = -1;
      this.ha = -1;
      this.yy(-1, 0, 562, 435, com.xy.q.Class30.agh);
      com.xy.w.Class9 var22 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "旕轄晝秓";
      this.yu(var22, "斗转星移");
      String var10008 = "f4:2:e#ye9r";
      String var10013 = "砬讌輮秓";
      this.aln = new com.xy.i.Class4("sc/e/26.png", 1, 118, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "确认转移", this);
      this.aln.setBounds(242, 304, 99, 25);
      this.add(this.aln);
      this.ch = new JLabel[13];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ch.length; var10000 = ++var2) {
         this.ch[var2] = com.xy.q.Class1.k(194 + var2 * 248, 111, 80, 16, Color.black, com.xy.q.Class49.ac);
         this.ch[var2].setHorizontalAlignment(10);
         JLabel var5 = this.ch[var2];
         String var8;
         if (var2 == 0) {
            var8 = "霅龌";
            var8 = "青龙";
         } else if (var2 == 1) {
            var8 = "瘿虦";
            var8 = "白虎";
         } else if (var2 == 10) {
            var8 = "叺屑剺坧煋晈昊院丸盓靇麓癨麆宾儡丸乗丿輻秮剧丮坧煋晈丟";
            var8 = "可将副地煞星星阵中的青黄白黑宫其中一个转移到主地煞星上";
         } else if (var2 == 11) {
            var8 = "厓ｎ轄禹否刭團焜昷屄涠女〪";
            var8 = "去，转移后副地煞星将消失。";
         } else if (var2 == 12) {
            var8 = "湾馽掇礯ｍ帳杞朤隗〔珓歳ざ癨蘙〔霅龌嚌秘晈阠盓圥焉昊戚叺亲斂輻昊禬〗";
            var8 = "温馨提示：带有朱雀、玄武、白虎、青龙四种星阵的地煞星才可以斗转星移。";
         } else {
            var8 = "孎丢二洃\b嬤么纁么乶摑膨孎";
            var8 = "学习交流 学习练习临摹自学";
         }

         var5.setText(var8);
         this.add(this.ch[var2]);
         if (var2 >= 2 && var2 <= 9) {
            this.ch[var2].setForeground(Color.white);
            this.ch[var2].setBounds(83 + 248 * ((var2 - 2) / 4), 138 + 39 * ((var2 - 2) % 4), 200, 40);
         } else if (var2 >= 10 && var2 <= 11) {
            this.ch[var2].setFont(com.xy.q.Class49.ch);
            this.ch[var2].setBounds(52, 20 + (var2 - 10) * 16, 480, 16);
         } else if (var2 == 12) {
            this.ch[var2].setFont(com.xy.q.Class49.n);
            this.ch[var2].setBounds(52, 399, 480, 16);
         }
      }

      this.ni = new com.xy.q.Class54[2];

      for (int var6 = var2 = 0; var6 < this.ni.length; var6 = var2) {
         this.ni[var2] = new com.xy.q.Class54(this);
         this.ni[var2].setBounds(134 + 248 * var2, 76, 50, 50);
         this.add(this.ni[var2++]);
      }

      this.j = new com.xy.w.Class18[22];

      for (int var7 = var2 = 0; var7 < this.j.length; var7 = ++var2) {
         this.j[var2] = new com.xy.w.Class18();
         this.add(this.j[var2]);
         if (var2 == 0 || var2 == 1) {
            com.xy.w.Class18 var17 = this.j[var2];
            String var21 = "$vxqx!ye9r";
            var17.dp("sc/d/4.png");
            this.j[var2].setBounds(130 + 248 * var2, 72, 59, 57);
         } else if (var2 == 2 || var2 == 3) {
            this.j[var2].setBounds(193 + 248 * (var2 - 2), 74, 30, 30);
         } else if (var2 >= 4 && var2 <= 11) {
            this.j[var2].setBounds(61 + 248 * ((var2 - 4) / 4), 149 + 39 * ((var2 - 4) % 4), 18, 18);
            this.j[var2].addMouseListener(new Class55(this, var2 - 4));
         } else if (var2 >= 12 && var2 <= 19) {
            com.xy.w.Class18 var16 = this.j[var2];
            String var20 = "[!\u0007&\u0007v\u0011lX,O";
            var16.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(57 + 248 * ((var2 - 12) % 2), 138 + 39 * ((var2 - 12) / 2), 220, 40);
         } else if (var2 == 20) {
            com.xy.w.Class18 var14 = this.j[var2];
            String var18 = "f4:3:f,ye9r";
            var14.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(53, 343, 462, 54);
         } else if (var2 == 21) {
            com.xy.w.Class18 var15 = this.j[var2];
            String var19 = "[!\u0007&\u0007q\u001elX,O";
            var15.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.j[var2].setBounds(47, 59, 490, 284);
         }
      }

      this.alp = new com.xy.q.Class58(this, 9, 1, 51, 51, 0, 0, 54, 345);
      String var10003 = "f4:3:f-ye9r";
      this.alp.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.add(this.alp);
   }

   // $VF: synthetic method
   static void aeg(Class43 var0, int var1) {
      var0.ah = var1;
   }

   public void aeh(int var1, String[] var2, Goodstable var3) {
      if (var3 == null) {
         this.g(var1);
      } else if (var1 == 0) {
         Class43 var25;
         label61: {
            if (var2 == null) {
               String var20 = var3.getValue();
               String var36 = "\u001eT";
               String[] var7;
               if ((var7 = var20.split("\\|")).length >= 4) {
                  String var21 = var7[3];
                  var36 = "3";

                  int var12;
                  for (int var22 = var12 = (var7 = var21.split("&")).length - 1; var22 >= 1; var22 = --var12) {
                     String var23 = var7[var12];
                     var36 = "晝阝尜怏";
                     if (var23.startsWith("星阵属性")) {
                        String var24 = var7[var12];
                        var36 = "(";
                        var2 = var24.split("=");
                        var25 = this;
                        break label61;
                     }
                  }
               }
            }

            var25 = this;
         }

         var25.ni[0].gs(1, var3);
         int var26 = 4;
         this.j[2].gt(com.xy.w.Class16.c("sc/skill/" + var2[1] + ".png"));
         this.ch[0].setText(var2[1]);
         this.ah = -1;

         for (int var9 = 4; var26 < var2.length; var26 = var9) {
            com.xy.w.Class18 var40 = this.j[var9];
            String var45 = "[!\u0007'\u0007t\u0010lX,O";
            var40.dp("sc/e/68.png");
            JLabel var27 = this.ch[var9 - 2];
            StringBuilder var41 = new StringBuilder(String.valueOf(MsgUntil.getStarName(var9 - 3)));
            var45 = "5";
            StringBuilder var42 = var41.append(" ");
            var45 = var2[var9];
            var9++;
            var27.setText(var42.append(var45).toString());
         }

         this.g(1);
         this.zc().b(this.lj());
      } else {
         Goodstable var4;
         if ((var4 = (Goodstable)this.ni[0].jx()) != null) {
            var4 = this.yx().getGood(var4.getRgid());
         }

         if (var4 != null) {
            if (var3.getRgid().compareTo(var4.getRgid()) == 0) {
               String var35 = "乏胕運拁乹卉";
               this.afx.dp("不能选择主卡");
            } else {
               String[] var17;
               label82: {
                  if (var2 == null) {
                     String var10000 = var3.getValue();
                     String var10001 = "\u000bi";
                     String[] var5;
                     if ((var5 = var10000.split("\\|")).length >= 4) {
                        String var13 = var5[3];
                        var10001 = "\u000e";

                        int var6;
                        for (int var14 = var6 = (var5 = var13.split("&")).length - 1; var14 >= 1; var14 = --var6) {
                           String var15 = var5[var6];
                           var10001 = "晈阠尉怲";
                           if (var15.startsWith("星阵属性")) {
                              String var16 = var5[var6];
                              var10001 = "\u0015";
                              var17 = var2 = var16.split("=");
                              break label82;
                           }
                        }
                     }
                  }

                  var17 = var2;
               }

               if (var17 != null && MsgUntil.d(var2[1])) {
                  this.ni[1].gs(1, var3);
                  this.j[3].gt(com.xy.w.Class16.c("sc/skill/" + var2[1] + ".png"));
                  this.ch[1].setText(var2[1]);
                  this.ha = -1;

                  int var11;
                  for (int var18 = var11 = 4; var18 < var2.length; var18 = var11) {
                     com.xy.w.Class18 var32 = this.j[var11 + 4];
                     String var10002 = "[!\u0007'\u0007t\u0010lX,O";
                     var32.dp("sc/e/68.png");
                     JLabel var19 = this.ch[var11 + 2];
                     StringBuilder var33 = new StringBuilder(String.valueOf(MsgUntil.getStarName(var11 - 3)));
                     var10002 = "5";
                     StringBuilder var34 = var33.append(" ");
                     var10002 = var2[var11];
                     var11++;
                     var19.setText(var34.append(var10002).toString());
                  }
               } else {
                  String var31 = "讲昊匶沴杞囎礉全晈阠";
                  this.afx.dp("该星卡没有四神兽星阵");
               }
            }
         }
      }
   }

   // $VF: synthetic method
   static void aei(Class43 var0, int var1) {
      var0.ha = var1;
   }

   // $VF: synthetic method
   static int aej(Class43 var0) {
      return var0.ah;
   }

   public void h() {
      RoleData var1 = this.yx();
      Goodstable var2 = (Goodstable)this.ni[0].jx();
      Goodstable var3 = (Goodstable)this.ni[1].jx();
      if (var2 != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = var1.getGood(var3.getRgid());
      }

      if (var2 == null || var3 == null || var2.getRgid().compareTo(var3.getRgid()) == 0) {
         String var12 = "讵逡夿专匣咤刭卉";
         this.afx.dp("请选好主卡和副卡");
      } else if (var3.getStatus() == 1) {
         String var11 = "券却奓些厕戍狡怔";
         this.afx.dp("副卡处于参战状态");
      } else {
         int var4 = this.ah;
         int var5 = this.ha;
         if (var4 != -1 && var5 != -1) {
            PartJade var6 = new PartJade(var4, var5);
            SuitOperBean var7 = new SuitOperBean();
            ArrayList var8;
            (var8 = new ArrayList()).add(var2.getRgid());
            var8.add(var3.getRgid());
            var7.setGoods(var8);
            var7.setType(56);
            var7.setJade(var6);
            String var9 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var7));
            this.za().k(var9);
            var1.ag(var3.getRgid());
            Class19 var10;
            if ((var10 = (Class19)this.zc().l(95)) != null) {
               var10.br(var3);
            }
         } else {
            String var10001 = "讵逡披专匣戾聇則匣覩暽捊盆昷陷它";
            this.afx.dp("请选择主卡或者副卡要替换的星阵宫");
         }
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] aek(Class43 var0) {
      return var0.j;
   }

   public void g(int var1) {
      if (var1 == 0) {
         int var4 = 0;
         this.ni[0].gs(0, null);
         this.j[2].l();
         this.ch[0].setText(null);
         this.ah = -1;

         for (int var3 = 0; var4 < 4; var4 = var3) {
            com.xy.w.Class18 var6 = this.j[var3 + 4];
            String var8 = "[!\u0007'\u0007t\u0010lX,O";
            var6.dp("sc/e/68.png");
            int var7 = var3 + 2;
            var3++;
            this.ch[var7].setText(null);
         }
      } else {
         this.ni[1].gs(0, null);
         this.j[3].l();
         this.ch[1].setText(null);
         this.ha = -1;

         int var2;
         for (int var10000 = var2 = 0; var10000 < 4; var10000 = var2) {
            com.xy.w.Class18 var10001 = this.j[var2 + 8];
            String var10002 = "f4:2:a-ye9r";
            var10001.dp("sc/e/68.png");
            int var5 = var2 + 6;
            var2++;
            this.ch[var5].setText(null);
         }
      }
   }

   // $VF: synthetic method
   static int ael(Class43 var0) {
      return var0.ha;
   }
}
