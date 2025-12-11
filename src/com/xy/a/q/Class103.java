package com.xy.a.q;

import com.xy.entity.PackRecord;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.aCard;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Class103 extends com.xy.q.Class30 {
   private aCard atn;
   private RichLabel aqq;
   private com.xy.i.Class19[] ol;
   private Vector<Vector<Object>> ato;
   private JLabel[] ir;
   private com.xy.i.Class19[] vv;
   private com.xy.w.Class18[] sk;
   private int ha;
   private JScrollPane cp;
   private com.xy.q.Class54[] hc;
   private com.xy.q.Class36 t;
   private JScrollPane ba;
   private JTable fq;

   public Color aln(String var1) {
      String var10001 = "弽泈";
      if (var1.equals("强法")) {
         return Color.red;
      } else {
         var10001 = "抭恓";
         return var1.equals("抗性") ? com.xy.q.Class49.ax : Color.green;
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ha = var1;

      for (int var2 = 0; var10000 < this.vv.length; var10000 = ++var2) {
         this.vv[var2].setKeep(var2 == var1);
      }

      this.alq(this.yt().bx().getaMap(), null);
   }

   public void hy(boolean var1) {
      RoleData var2 = this.yx();
      aCard var3 = null;

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.hc.length; var10000 = var4) {
         this.hc[var4].gs(0, null);
         this.hc[var4++].setVisible(true);
      }

      String var11;
      if (this.za().gameMount) {
         PackRecord var10 = var2.getPackRecord();
         String var13 = "EN";
         var11 = var10.getOtherValue("BS");
      } else {
         var11 = var2.getPackRecord().getlCard();
      }

      String var9 = var11;
      if (!com.xy.v.Class12.h(var9)) {
         com.xy.v.Class8 var5 = this.yt();
         String var15;
         if (this.za().gameMount) {
            var15 = "#";
         } else {
            var15 = "\\|";
         }

         String[] var6 = var9.split(var15);

         int var7;
         for (int var12 = var7 = 0; var12 < var6.length && var7 < this.hc.length; var12 = ++var7) {
            aCard var8;
            if ((var8 = var5.bx().getaMap().get(Integer.decode(var6[var7]))) != null) {
               this.hc[var7].gs(11, var8);
               if (var3 == null) {
                  var3 = var8;
               }
            }
         }
      }

      if (var1) {
         this.alp(var3);
      }
   }

   // $VF: synthetic method
   static Vector alo(Class103 var0) {
      return var0.ato;
   }

   public void alp(aCard var1) {
      this.atn = var1;
      if (this.atn == null) {
         com.xy.w.Class18 var62 = this.sk[5];
         String var79 = "nd2c21/)miz";
         var62.dp("sc/d/62.png");
         this.aqq.setTextSize("", 130);
      } else {
         this.sk[5].dp(com.xy.w.Class15.l(this.atn.getSkin()));
         String var2 = null;
         String var3 = null;
         String var4 = null;
         String var5 = null;
         String var6 = null;
         StringBuffer var7 = new StringBuffer();
         String var10004 = "WY\u0012\\\u0012\\\u0012\\呹秊N";
         StringBuilder var10002 = new StringBuilder("#cffffff名称:").append(this.atn.getName());
         String var10003 = "$o";
         var7.append(var10002.append("#r").toString());
         var10003 = "WY\u0012\\D\nD\n淼耭N";
         StringBuilder var10001 = new StringBuilder("#cff0000消耗:").append(this.atn.getMoney());
         String var64;
         if (this.atn.getType() == 0) {
            String var63 = "夺诚帜";
            var64 = "大话币";
         } else {
            String var65 = "代珽";
            var64 = "仙玉";
         }

         var10001 = var10001.append(var64);
         String var66 = "$o";
         var7.append(var10001.append("#r").toString());
         String var8 = this.atn.getValue();
         if (var8 != null && !"".equals(var8)) {
            String var10000 = this.atn.getValue();
            String var26 = "f\b";
            String[] var9 = var10000.split("\\|");

            int var10;
            for (int var18 = var10 = 0; var18 < var9.length; var18 = ++var10) {
               var10000 = var9[var10];
               String var27 = " ";
               int var11;
               if ((var11 = var10000.indexOf("=")) != -1) {
                  String var12 = var9[var10].substring(0, var11);
                  String var13 = var9[var10].substring(var11 + 1);
                  String var28 = "仆咶勯";
                  if (!var12.equals("亲和力")) {
                     String var29 = "秊旒";
                     if (!var12.equals("种族")) {
                        String var30 = "筳结";
                        if (!var12.equals("等级")) {
                           String var33 = "劚彎氮蠴";
                           if (!var12.equals("加强气血")) {
                              String var34 = "劧弧魓泈";
                              if (!var12.equals("加强魔法")) {
                                 String var35 = "劚彎攁冏";
                                 if (!var12.equals("加强攻击")) {
                                    String var36 = "劧弧逘庻";
                                    if (!var12.equals("加强速度")) {
                                       String var39 = "里";
                                       if (var12.equals("金")) {
                                          String var71 = "醥\u0000T";
                                          StringBuilder var20 = new StringBuilder("金: ").append(var13);
                                          String var40 = "=";
                                          var2 = var20.append(" ").toString();
                                       } else {
                                          String var41 = "杜";
                                          if (var12.equals("木")) {
                                             String var72 = "朵==";
                                             StringBuilder var21 = new StringBuilder("木: ").append(var13);
                                             String var42 = "T";
                                             var3 = var21.append(" ").toString();
                                          } else {
                                             String var43 = "氩";
                                             if (var12.equals("水")) {
                                                String var73 = "汀\u0000T";
                                                StringBuilder var22 = new StringBuilder("水: ").append(var13);
                                                String var44 = "=";
                                                var4 = var22.append(" ").toString();
                                             } else {
                                                String var45 = "瀟";
                                                if (var12.equals("火")) {
                                                   String var74 = "灶==";
                                                   StringBuilder var23 = new StringBuilder("火: ").append(var13);
                                                   String var46 = "T";
                                                   var5 = var23.append(" ").toString();
                                                } else {
                                                   String var47 = "圂";
                                                   if (var12.equals("土")) {
                                                      String var75 = "坫\u0000T";
                                                      StringBuilder var24 = new StringBuilder("土: ").append(var13);
                                                      String var48 = "=";
                                                      var6 = var24.append(" ").toString();
                                                   } else {
                                                      var10003 = "\u00193";
                                                      var10001 = new StringBuilder("#G").append(var12);
                                                      String var76 = "'";
                                                      var10001 = var10001.append(":").append(var13);
                                                      String var77 = "\u0019\u0006";
                                                      var7.append(var10001.append("#r").toString());
                                                   }
                                                }
                                             }
                                          }
                                       }
                                       continue;
                                    }
                                 }
                              }
                           }

                           var10003 = "\u0019-";
                           var10001 = new StringBuilder("#Y").append(var12);
                           String var69 = "'";
                           var10001 = var10001.append(":").append(var13);
                           String var70 = "\u0019\u0006";
                           var7.append(var10001.append("#r").toString());
                           continue;
                        }
                     }
                  }

                  var10003 = ">P」";
                  var10001 = new StringBuilder("#W【").append(var12);
                  String var67 = "づ";
                  var10001 = var10001.append("】").append(var13);
                  String var68 = "$o";
                  var7.append(var10001.append("#r").toString());
               }
            }
         }

         var10003 = ">d(0[F[A挜绪旫闳'";
         var10001 = new StringBuilder("#c57FAFF持续时间:").append(this.atn.getTime());
         String var78 = "割";
         var7.append(var10001.append("分").toString());
         boolean var14 = true;
         int var16 = 0;
         if (var2 != null) {
            if (var14) {
               String var52 = ">u〝$o$D";
               var7.append("#r　#r#Y");
               var14 = false;
            }

            var16++;
            if (var16 == 3 || var16 == 5) {
               String var53 = "\u0019\u0006";
               var7.append("#r");
            }

            var7.append(var2);
         }

         if (var3 != null) {
            if (var14) {
               String var54 = ">u〝$o$D";
               var7.append("#r　#r#Y");
               var14 = false;
            }

            var16++;
            if (var16 == 3 || var16 == 5) {
               String var55 = "\u0019\u0006";
               var7.append("#r");
            }

            var7.append(var3);
         }

         if (var4 != null) {
            if (var14) {
               String var56 = ">u〝$o$D";
               var7.append("#r　#r#Y");
               var14 = false;
            }

            var16++;
            if (var16 == 3 || var16 == 5) {
               String var57 = "\u0019\u0006";
               var7.append("#r");
            }

            var7.append(var4);
         }

         if (var5 != null) {
            if (var14) {
               String var58 = ">u〝$o$D";
               var7.append("#r　#r#Y");
               var14 = false;
            }

            var16++;
            if (var16 == 3 || var16 == 5) {
               String var59 = "\u0019\u0006";
               var7.append("#r");
            }

            var7.append(var5);
         }

         if (var6 != null) {
            if (var14) {
               String var60 = ">u〝$o$D";
               var7.append("#r　#r#Y");
               var14 = false;
            }

            var16++;
            if (var16 == 3 || var16 == 5) {
               String var61 = "\u0019\u0006";
               var7.append("#r");
            }

            var7.append(var6);
         }

         this.aqq.setTextSize(var7.toString(), 130);
      }
   }

   public void alq(Map<Integer, aCard> var1, String var2) {
      if (com.xy.v.Class12.h(var2)) {
         var2 = null;
      }

      this.ato.clear();
      ArrayList var3 = new ArrayList();
      Iterator var5;
      Iterator var10000 = var5 = var1.keySet().iterator();

      while (var10000.hasNext()) {
         Integer var4 = (Integer)var5.next();
         aCard var6;
         if ((var6 = var1.get(var4)) != null) {
            if (var6.getType() != this.ha) {
               var10000 = var5;
               continue;
            }

            if (var2 != null && var6.getName().indexOf(var2) == -1) {
               var10000 = var5;
               continue;
            }

            var3.add(var4);
         }

         var10000 = var5;
      }

      Collections.sort(var3);

      for (Iterator var11 = var5 = var3.iterator(); var11.hasNext(); var11 = var5) {
         Integer var8 = (Integer)var5.next();
         aCard var10 = var1.get(var8);
         Vector var7;
         (var7 = new Vector()).add(var10.getGn());
         var7.add(var10.getName());
         StringBuilder var10004 = new StringBuilder(String.valueOf(var10.getTime()));
         String var10005 = "割";
         var7.add(var10004.append("分").toString());
         StringBuilder var10001 = new StringBuilder(String.valueOf(var10.getMoney()));
         String var12;
         if (var10.getType() == 0) {
            var12 = "夺诚帜";
            var12 = "大话币";
         } else {
            var12 = "代珽";
            var12 = "仙玉";
         }

         var7.add(var10001.append(var12).toString());
         var7.add(var8);
         this.ato.addElement(var7);
      }

      this.fq.clearSelection();
      this.ba.getVerticalScrollBar().setValue(0);
      this.ba.updateUI();
   }

   public void h() {
      this.alq(this.yt().bx().getaMap(), this.t.getText().trim());
   }

   public void cr(boolean var1) {
      if (this.atn != null) {
         RoleData var2 = this.yx();
         if (this.atn.getType() == 0) {
            if (new BigDecimal(this.atn.getMoney()).compareTo(var2.getLoginResult().getGold()) > 0) {
               String var10001 = "夺诚帜上趮";
               this.afx._do("大话币不足");
               return;
            }
         } else if (new BigDecimal(this.atn.getMoney()).compareTo(var2.getLoginResult().getCodecard()) > 0) {
            String var5 = "代珽丷跇";
            this.afx._do("仙玉不足");
            return;
         }

         StringBuilder var4 = new StringBuilder(String.valueOf(var1 ? 0 : 1));
         String var10002 = "a";
         String var3 = Agreement.getSendTextAES("usercard", var4.append("|").append(this.atn.getId()).toString());
         this.za().k(var3);
      }
   }

   // $VF: synthetic method
   static JTable alr(Class103 var0) {
      return var0.fq;
   }

   public Class103(GameView var1) {
      super(89, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "I\u0017\u0015\u0010\u0015E\u0014\u0004T\u0013";
      this.ha = 0;
      this.yy(-1, 0, 800, 423, com.xy.q.Class30.agh);
      com.xy.w.Class9 var36 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "丄卜事叅";
      this.yu(var36, "七十二变");
      this.vv = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.vv.length; var10000 = var2) {
         com.xy.i.Class19[] var10 = this.vv;
         var10004 = "\u0007Y[_[\u000fF\u0014\u0004T\u0013";
         int var10006 = 11 + var2;
         String var54;
         Class103 var10010;
         if (var2 == 0) {
            var54 = "釖钬叟躶";
            var54 = "金钱变身";
            var10010 = this;
         } else if (var2 == 1) {
            var54 = "代珽叢軟";
            var54 = "仙玉变身";
            var10010 = this;
         } else {
            var54 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/52.png", 2, var10006, Class49.ck, null, var54, var10010);
         var10[var2] = var10002;
         this.vv[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.vv[var2].setBounds(379 + 102 * var2, 21, 100, 24);
         this.add(this.vv[var2++]);
      }

      this.ir = new JLabel[3];

      for (int var11 = var2 = 0; var11 < this.ir.length; var11 = var2) {
         Color var10007;
         int var10008;
         if (var2 != 0 && var2 != 2) {
            var10007 = Color.white;
            var10008 = var2;
         } else {
            var10007 = Color.black;
            var10008 = var2;
         }

         this.ir[var2] = com.xy.q.Class1.f(0, 0, 0, 0, 0, var10007, var10008 == 2 ? com.xy.q.Class49.n : com.xy.q.Class49.ch);
         JLabel var12 = this.ir[var2];
         String var20;
         if (var2 == 0) {
            var20 = "卦吐";
            var20 = "卡名";
         } else if (var2 == 1) {
            var20 = "層恓";
            var20 = "属性";
         } else if (var2 == 2) {
            var20 = "亓衑盿兖＝里兌朵〆朵兌圂〆圂兌氩〆氩兌灶〆灶兌里";
            var20 = "五行相克：金克木、木克土、土克水、水克火、火克金";
         } else {
            var20 = "";
         }

         var12.setText(var20);
         Class103 var13;
         if (var2 == 0) {
            var13 = this;
            this.ir[var2].setBounds(587, 24, 42, 19);
         } else if (var2 == 1) {
            var13 = this;
            this.ir[var2].setBounds(45, 45, 150, 21);
         } else {
            if (var2 == 2) {
               this.ir[var2].setBounds(45, 24, 312, 20);
            }

            var13 = this;
         }

         var13.add(this.ir[var2++]);
      }

      this.aqq = new RichLabel("", com.xy.q.Class49.n);
      this.cp = com.xy.q.Class1.g(49, 66, 145, 325, this.aqq, 20);
      this.add(this.cp);
      Vector var7 = new Vector();
      var10004 = "釖钬";
      String var49 = "旌門";
      String var53 = "卦吐";
      String var60 = "劥肉";
      var7.addElement("功能");
      var7.addElement("卡名");
      var7.addElement("时间");
      var7.addElement("金钱");
      this.ato = new Vector<>();
      this.fq = com.xy.q.Class1.l(this.ato, var7, com.xy.q.Class49.cp, Color.white, 60, 120, 80, 120);
      this.fq.getSelectionModel().addListSelectionListener(new Class0(this));
      Class38 var3;
      (var3 = new Class38(this)).setHorizontalAlignment(0);
      this.fq.setDefaultRenderer(Object.class, var3);
      this.ba = com.xy.q.Class1.g(379, 45, 394, 350, this.fq, 20);
      this.add(this.ba);
      this.ol = new com.xy.i.Class19[3];

      int var4;
      for (int var14 = var4 = 0; var14 < this.ol.length; var14 = var4) {
         com.xy.i.Class19[] var15 = this.ol;
         if (var4 == 0) {
            var10004 = "I\u0017\u0015\u0011\u0015A\u0014\u0004T\u0013";
            var10004 = "sc/e/5.png";
         } else {
            var10004 = "nd2b23+)miz";
            var10004 = "sc/e/46.png";
         }

         int var50 = 13 + var4;
         Font var52 = var4 == 0 ? com.xy.q.Class49.bz : com.xy.q.Class49.ch;
         String var57;
         Class103 var61;
         if (var4 == 0) {
            var57 = "搦絖";
            var57 = "搜索";
            var61 = this;
         } else if (var4 == 1) {
            var57 = "叟躶逧垖";
            var57 = "变身造型";
            var61 = this;
         } else if (var4 == 2) {
            var57 = "乹叢軟通埿";
            var57 = "不变身造型";
            var61 = this;
         } else {
            var57 = "";
            var61 = this;
         }

         com.xy.i.Class19 var23 = new com.xy.i.Class19(var10004, 1, var50, var52, null, var57, var61);
         var15[var4] = var23;
         Class103 var16;
         if (var4 == 0) {
            this.ol[var4].setBounds(719, 25, 34, 17);
            var16 = this;
         } else {
            this.ol[var4].setForeground(Color.black);
            var16 = this;
            this.ol[var4].setBounds(229, 338 + 30 * (var4 - 1), 119, 25);
         }

         var16.add(this.ol[var4++]);
      }

      var49 = "nd2c26*)miz";
      this.t = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.bz, Color.white);
      this.t.setBounds(633, 24, 120, 19);
      this.add(this.t);
      this.sk = new com.xy.w.Class18[7];

      for (int var17 = var4 = 0; var17 < this.sk.length; var17 = var4) {
         this.sk[var4] = new com.xy.w.Class18();
         Class103 var18;
         if (var4 == 0) {
            var18 = this;
            com.xy.w.Class18 var28 = this.sk[var4];
            var10003 = "\u0007Y[^[\bA\u0014\u0004T\u0013";
            var28.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.sk[var4].setBounds(45, 45, 150, 21);
         } else if (var4 == 1) {
            var18 = this;
            com.xy.w.Class18 var29 = this.sk[var4];
            var10003 = "nd2c25))miz";
            var29.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.sk[var4].setBounds(45, 45, 150, 350);
         } else if (var4 == 2) {
            var18 = this;
            com.xy.w.Class18 var30 = this.sk[var4];
            var10003 = "\u0007Y[^[\bA\u0014\u0004T\u0013";
            var30.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.sk[var4].setBounds(379, 45, 394, 21);
         } else if (var4 == 3) {
            var18 = this;
            com.xy.w.Class18 var31 = this.sk[var4];
            var10003 = "nd2c25))miz";
            var31.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.sk[var4].setBounds(379, 45, 394, 350);
         } else if (var4 == 4) {
            var18 = this;
            com.xy.w.Class18 var32 = this.sk[var4];
            var10003 = "\u0007Y[^[\fE\u0014\u0004T\u0013";
            var32.dp("sc/d/61.png");
            this.sk[var4].setBounds(208, 53, 160, 221);
         } else if (var4 == 5) {
            var18 = this;
            this.sk[var4].setBounds(209, 55, 158, 218);
         } else {
            if (var4 == 6) {
               com.xy.w.Class18 var24 = this.sk[var4];
               String var33 = "nd2c25))miz";
               var24.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.sk[var4].setBounds(206, 45, 165, 240);
            }

            var18 = this;
         }

         var18.add(this.sk[var4++]);
      }

      com.xy.v.Class32 var9 = new com.xy.v.Class32(7, 3, 26, 34);
      this.hc = new com.xy.q.Class54[3];

      int var5;
      for (int var19 = var5 = 0; var19 < this.hc.length; var19 = var5) {
         this.hc[var5] = new com.xy.q.Class54(this);
         this.hc[var5].wp(var9);
         com.xy.q.Class54 var42 = this.hc[var5];
         var10004 = "\u0007Y[^[\b@\u0014\u0004T\u0013";
         var42.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
         this.hc[var5].setBounds(214 + 52 * var5, 291, 40, 40);
         this.add(this.hc[var5++]);
      }
   }

   @Override
   public void l() {
      this.hy(true);
      this.g(0);
      super.l();
   }
}
