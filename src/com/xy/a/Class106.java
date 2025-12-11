package com.xy.a;

import com.xy.bean.LoginResult;
import com.xy.bean.PalacePkBean;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Class106 extends com.xy.q.Class30 {
   private JTextArea amk;
   private com.xy.w.Class18 aml;
   private JLabel[] dy;
   private com.xy.i.Class18[] tv;
   private Class136[] amm;
   private PalacePkBean amn;
   private com.xy.q.Class36[] amo;
   private RichLabel[] amp;
   private long amq;
   private com.xy.q.Class27 aal;
   private com.xy.w.Class18 gh;
   private long et;
   private int eg;
   private long kd;

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   // $VF: synthetic method
   static Class136[] aft(Class106 var0) {
      return var0.amm;
   }

   // $VF: synthetic method
   static long afu(Class106 var0) {
      return var0.amq;
   }

   public void ds(long var1, JTextField var3) {
      if (this.eg == 0 || this.eg == 1) {
         if (Class136.ano(this.amm[3])) {
            this.et = var1;
            JLabel var5 = this.dy[8];
            String var11 = "涫聈釲铮Ｙ";
            StringBuilder var7 = new StringBuilder("消耗金钱：").append(var1);
            String var9 = "丁";
            var5.setText(var7.append("两").toString());
            return;
         }

         if (Class136.ano(this.amm[4])) {
            this.kd = var1;
            JLabel var4 = this.dy[9];
            String var10 = "涫聈仺珖Ｙ";
            StringBuilder var6 = new StringBuilder("消耗仙玉：").append(var1);
            String var8 = "亘玬";
            var4.setText(var6.append("仙玉").toString());
            return;
         }

         if (Class136.ano(this.amm[5])) {
            this.amq = var1;
            JLabel var10000 = this.dy[10];
            String var10003 = "涫聈绬髓Ｙ";
            StringBuilder var10001 = new StringBuilder("消耗经验：").append(var1);
            String var10002 = "纎骩";
            var10000.setText(var10001.append("经验").toString());
         }
      }
   }

   // $VF: synthetic method
   static void afv(Class106 var0, long var1) {
      var0.amq = var1;
   }

   public void afw(int var1, PalacePkBean var2) {
      this.eg = var1;
      this.amn = var2;
      this.amk.setText("");
      this.dy[7].setText("");
      this.et = this.kd = this.amq = 0L;
      JLabel var10003 = this.dy[8];
      String var10004 = "涭聖釴铰＿q丁";
      var10003.setText("消耗金钱：0两");
      JLabel var10002 = this.dy[9];
      String var29 = "淗耴了玪ｅ\u0013了玪";
      var10002.setText("消耗仙玉：0仙玉");
      JLabel var10001 = this.dy[10];
      String var17 = "淉耲纎骩｛\u0015纎骩";
      var10001.setText("消耗经验：0经验");
      com.xy.q.Class36 var8 = this.amo[0];
      int var10000 = 0;
      var8.setVisible(false);

      for (int var3 = 0; var10000 < this.amm.length; var10000 = var3) {
         this.amm[var3++].be(true);
      }

      Class106 var4;
      if (this.eg == 0) {
         var4 = this;
         JLabel var10009 = this.dy[0];
         String var10010 = "辰儺冐旈寚谾吮嬈Ｙ";
         var10009.setText("输入决斗对象名字：");
         this.amo[0].setText("");
         this.amo[0].setVisible(true);
         this.amo[1].setEditable(true);
         this.amm[3].be(false);
         this.amm[4].be(false);
         this.amm[5].be(false);
         com.xy.i.Class18 var18 = this.tv[0];
         String var30 = "硋a讁";
         var18.setText("确 认");
         com.xy.i.Class18 var10 = this.tv[1];
         String var19 = "叵\u007f涫";
         var10.setText("取 消");
      } else if (this.eg == 1) {
         var4 = this;
         JLabel var10007 = this.dy[0];
         String var10008 = "挴扙戵勞耠匆丟撃丞";
         var10007.setText("挑战成功者升为擂主");
         this.amo[1].setEditable(true);
         this.amm[3].be(false);
         this.amm[4].be(false);
         this.amm[5].be(false);
         com.xy.i.Class18 var20 = this.tv[0];
         String var31 = "硍\u007f讇";
         var20.setText("确 认");
         com.xy.i.Class18 var11 = this.tv[1];
         String var21 = "右a涭";
         var11.setText("取 消");
      } else if (this.eg == 2) {
         var4 = this;
         this.amo[1].setEditable(false);
         var10003 = this.dy[0];
         String var10006 = "〳";
         StringBuilder var39 = new StringBuilder("【").append(var2.getUsername());
         String var10005 = "ぐ玌寷吴伡丮迿亣扙乃";
         var10003.setText(var39.append("】玩家向你下达了战书").toString());
         com.xy.i.Class18 var22 = this.tv[0];
         String var33 = "揺叴捎戻";
         var22.setText("接受挑战");
         com.xy.i.Class18 var12 = this.tv[1];
         String var23 = "该性拔陨";
         var12.setText("认怂投降");
      } else {
         if (this.eg == 3) {
            this.amo[1].setEditable(false);
            var10002 = this.dy[0];
            String var34 = "挲扇戳勀耦匘丙撝丘";
            var10002.setText("挑战成功者升为擂主");
            com.xy.i.Class18 var13 = this.tv[0];
            String var25 = "揤史捐戽";
            var13.setText("接受挑战");
            com.xy.i.Class18 var5 = this.tv[1];
            String var14 = "读怡拊陮";
            var5.setText("认怂投降");
         }

         var4 = this;
      }

      if (var4.eg == 2 || this.eg == 3) {
         this.et = var2.getGold() != null ? var2.getGold().longValue() : 0L;
         this.kd = var2.getXianyu() != null ? var2.getXianyu().longValue() : 0L;
         this.amq = var2.getExp() != null ? var2.getExp().longValue() : 0L;
         var10001 = this.dy[8];
         var10004 = "涭聖釴铰＿";
         StringBuilder var26 = new StringBuilder("消耗金钱：").append(this.et);
         String var35 = "万";
         var10001.setText(var26.append("两").toString());
         JLabel var6 = this.dy[9];
         String var36 = "涭聖仼珈＿";
         StringBuilder var27 = new StringBuilder("消耗仙玉：").append(this.kd);
         String var37 = "了玪";
         var6.setText(var27.append("仙玉").toString());
         JLabel var7 = this.dy[10];
         String var38 = "涭聖绪髍＿";
         StringBuilder var16 = new StringBuilder("消耗经验：").append(this.amq);
         String var28 = "纐骯";
         var7.setText(var16.append("经验").toString());
      }

      this.amo[1].setText("");
      this.zc().b(this.lj());
   }

   // $VF: synthetic method
   static long afx(Class106 var0) {
      return var0.kd;
   }

   public void g(int var1) {
      if (var1 == 156) {
         if (!this.afx.ah()) {
            LoginResult var12 = this.yx().getLoginResult();
            String var3 = this.amo[0].getText().trim();
            String var4 = this.amk.getText().trim();
            if (this.et < 10000000L && this.kd < 1000L) {
               String var24 = "夂讜帤杁佫乊泍醐颸｛\u0005p卦乆夂讜帤ぃ戳聄仼珈朥伏丮沩釴飜＿a\u0014q\u0015q仼珈〧";
               this.afx._do("大话币最低下注金额： 1千万大话币。或者仙玉最低下注金额： 1000仙玉。");
            } else if (this.et > var12.getGold().longValue()) {
               String var23 = "奸课幞丮跬仆数任拊兆醎颾";
               this.afx._do("大话币不足以支付投入金额");
            } else if (this.kd > var12.getCodecard().longValue()) {
               String var22 = "仼珈丨跲什敮份拔兀亘玬";
               this.afx._do("仙玉不足以支付投入仙玉");
            } else if (this.amq > var12.getExperience().longValue()) {
               String var21 = "绬髓丮跬仆数任拊兆纐骯";
               this.afx._do("经验不足以支付投入经验");
            } else {
               long var5 = this.et;
               long var7 = this.kd;
               if (Class136.ano(this.amm[1]) && (var5 += 20000000L) > var12.getGold().longValue()) {
                  String var20 = "奦诸幀丨跲什敮份儩木儭呯醐颸";
                  this.afx._do("大话币不足以支付全服公告金额");
               } else if ((var5 = var5 + 2000000L) > var12.getGold().longValue()) {
                  String var19 = "奸课幞丮跬仆扇久赦甋";
                  this.afx._do("大话币不足以战书费用");
               } else if (Class136.ano(this.amm[2]) && (var7 = var7 + 100L) > var12.getCodecard().longValue()) {
                  String var18 = "仼珈丨跲什敮份钂链醐颸";
                  this.afx._do("仙玉不足以支付铃铛金额");
               } else {
                  if (this.eg == 0) {
                     if (com.xy.v.Class12.h(var3)) {
                        String var15 = "讨辰儺悋觞挲扇耦盛吮禯〡";
                        this.afx._do("请输入您要挑战者的名称。");
                        return;
                     }

                     if (var3.equals(var12.getRolename())) {
                        String var10001 = "悍乌胘捐戽膫巔｀Ｄ";
                        this.afx._do("您不能挑战自己！！");
                        return;
                     }
                  } else if (this.eg == 1) {
                     if (this.et > 1000000000L) {
                        String var17 = "朣骇丨沷釲飂Ｙ\u007f\u0012o亜奸课幞〡";
                        this.afx._do("最高下注金额： 10亿大话币。");
                        return;
                     }

                     if (this.kd > 100000L) {
                        String var16 = "亘玬杁髽乊泍醐颸｛\u0005p\u0015乆仼珈〧";
                        this.afx._do("仙玉最高下注金额： 10万仙玉。");
                        return;
                     }
                  } else if (this.eg != 2) {
                  }

                  PalacePkBean var9 = new PalacePkBean();
                  PalacePkBean var10000;
                  if (this.eg == 0) {
                     var10000 = var9;
                     var9.setUsername(var3);
                     var9.setType(0);
                  } else {
                     label139: {
                        if (this.eg == 1) {
                           var9.setType(11);
                           Long var11 = ((Class6)this.afx.getFormManagement().j(27)).bv();
                           var9.setNtype(var11 != null ? var11.intValue() : 0);
                           if (var9.getNtype() < 510 || var9.getNtype() > 514) {
                              var10000 = var9;
                              var9.setNtype(510);
                              break label139;
                           }
                        } else {
                           if (this.eg == 2) {
                              var10000 = var9;
                              var9.setType(1);
                              var9.setPId(this.amn.getPId());
                              break label139;
                           }

                           if (this.eg == 3) {
                              var9.setType(1);
                              var9.setPId(this.amn.getPId());
                           }
                        }

                        var10000 = var9;
                     }
                  }

                  var10000.setGold(new BigDecimal(this.et));
                  var9.setXianyu(new BigDecimal(this.kd));
                  var9.setExp(new BigDecimal(this.amq));
                  var9.setSendStr(Class136.ano(this.amm[2]) ? var4 : null);
                  var9.setChoices(var9.getChoices() + ((Class136.ano(this.amm[1]) ? 1 : 0) << 0));
                  var9.setChoices(var9.getChoices() + ((Class136.ano(this.amm[2]) ? 1 : 0) << 0));
                  String var10 = Agreement.getSendTextAES("bookofchalg", com.xy.v.Class31.a().toJson(var9));
                  this.za().k(var10);
               }
            }
         }
      } else {
         if (var1 == 157) {
            if (this.eg == 2 && this.amn != null) {
               this.amn.setType(2);
               String var2 = Agreement.getSendTextAES("bookofchalg", com.xy.v.Class31.a().toJson(this.amn));
               this.za().k(var2);
               this.amn = null;
            }

            this.zc().f(66);
         }
      }
   }

   // $VF: synthetic method
   static void afy(Class106 var0, long var1) {
      var0.et = var1;
   }

   // $VF: synthetic method
   static void afz(Class106 var0, long var1) {
      var0.kd = var1;
   }

   public Class106(GameView var1) {
      super(66, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "2FnAn\u0014oU/B";
      this.et = 0L;
      this.kd = 0L;
      this.amq = 0L;
      this.yy(-1, 0, 442, 386, com.xy.q.Class30.agh);
      com.xy.w.Class9 var33 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "冐旈丨扇久";
      this.yu(var33, "决斗下战书");
      this.tv = new com.xy.i.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.tv.length; var10000 = var2) {
         com.xy.i.Class18[] var8 = this.tv;
         var10004 = "V\"\n$\ns\u0013oU/B";
         int var10006 = 156 + var2;
         String var39;
         Class106 var10010;
         if (var2 == 0) {
            var39 = "硍\u007f讇";
            var39 = "确 认";
            var10010 = this;
         } else if (var2 == 1) {
            var39 = "右a涭";
            var39 = "取 消";
            var10010 = this;
         } else {
            var39 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/26.png", 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var39, var10010);
         var8[var2] = var10002;
         this.tv[var2].setBounds(112 + 146 * var2, 340, 99, 25);
         this.add(this.tv[var2++]);
      }

      this.dy = new JLabel[11];

      for (int var9 = var2 = 0; var9 < this.dy.length; var9 = ++var2) {
         this.dy[var2] = com.xy.q.Class1.k(50, 28, 300, 19, Color.black, com.xy.q.Class49.k);
         JLabel var10 = this.dy[var2];
         String var16;
         if (var2 == 0) {
            var16 = "辰儺冐旈寚谾吮嬈Ｙ";
            var16 = "输入决斗对象名字：";
         } else if (var2 == 1) {
            var16 = "拔兀";
            var16 = "投入";
         } else if (var2 == 2) {
            var16 = "丨扇久";
            var16 = "下战书";
         } else if (var2 == 3) {
            var16 = "厐逤钂链";
            var16 = "发送铃铛";
         } else if (var2 == 4) {
            var16 = "钩万";
            var16 = "银两";
         } else if (var2 == 5) {
            var16 = "亘玬";
            var16 = "仙玉";
         } else if (var2 == 6) {
            var16 = "以牊纐骯";
            var16 = "人物经验";
         } else if (var2 == 7) {
            var16 = "匔佨";
            var16 = "单位";
         } else if (var2 == 8) {
            var16 = "涫聈釲铮Ｙo万";
            var16 = "消耗金钱：0两";
         } else if (var2 == 9) {
            var16 = "淉耲亘玬｛\u0015亘玬";
            var16 = "消耗仙玉：0仙玉";
         } else if (var2 == 10) {
            var16 = "淗耴纐骯ｅ\u0013纐骯";
            var16 = "消耗经验：0经验";
         } else {
            var16 = "";
         }

         var10.setText(var16);
         this.dy[var2].setHorizontalAlignment(10);
         this.add(this.dy[var2]);
         if (var2 == 0) {
            this.dy[var2].setFont(com.xy.q.Class49.ch);
         } else if (var2 == 1) {
            this.dy[var2].setBounds(85, 65, 36, 17);
         } else if (var2 == 2) {
            this.dy[var2].setBounds(85, 159, 54, 17);
         } else if (var2 == 3) {
            this.dy[var2].setBounds(85, 182, 72, 17);
         } else if (var2 >= 4 && var2 <= 6) {
            this.dy[var2].setBounds(106 + (var2 - 4) * 80, 89, 72, 17);
         } else if (var2 == 7) {
            this.dy[var2].setFont(com.xy.q.Class49.co);
            this.dy[var2].setBounds(192, 112, 40, 19);
         } else if (var2 >= 8 && var2 <= 10) {
            this.dy[var2].setForeground(Color.red);
            this.dy[var2].setFont(com.xy.q.Class49.bz);
            this.dy[var2].setBounds(233, 111 + (var2 - 8) * 16, 200, 14);
         }
      }

      this.amp = new RichLabel[3];

      for (int var11 = var2 = 0; var11 < this.amp.length; var11 = var2) {
         Class106 var12;
         if (var2 == 0) {
            var12 = this;
            this.amp[var2] = new RichLabel(null, com.xy.q.Class49.n);
            RichLabel var29 = this.amp[var2];
            var10003 = "bFq\u0015q\u0015q\u0015i戽丧尣儭呯儩木m\u0006\"c\u0007\u0015q\u0015q芔赸\u0010m\u0015q\u0015m\u0015q\u0015乥\u0006\"\u0015q\u0015q\u0015q\f";
            var29.setTextSize("#c000000(战书将公告全服,#cFF0000花费5,000,000两#c000000)", 230);
            this.amp[var2].setBounds(134, 156, this.amp[var2].getWidth(), this.amp[var2].getHeight());
         } else if (var2 == 1) {
            var12 = this;
            this.amp[var2] = new RichLabel(null, com.xy.q.Class49.n);
            RichLabel var30 = this.amp[var2];
            var10003 = "|@o\u0013o\u0013o\u0013w勝遖吭戼陇|@\u0019eo\u0013o\u0013n\u0013o仺珖\u0000<\u0013o\u0013o\u0013o\n";
            var30.setTextSize("#c000000(勾选后扣除#cFF0000100仙玉#c000000)", 230);
            this.amp[var2].setBounds(151, 179, this.amp[var2].getWidth(), this.amp[var2].getHeight());
         } else {
            if (var2 == 2) {
               this.amp[var2] = new RichLabel(null, com.xy.q.Class49.co);
               RichLabel var27 = this.amp[var2];
               String var31 = "bFq\u0015q\u0015q\u0015凲斲謧礟｛\u00063\u0014\u3040丮沩釴飜尣儩颸弓屻凲斲肝斜ぃ\u00063\u0017\u3040丮沩绪髍圍凲斲纒杺呏Ｉ奰贀旸捺奰扥乊泍盅绪髍〧";
               var27.setTextSize("#c000000决斗警示：#r1、下注金额将全额归属决斗胜方。#r2、下注经验在决斗结束后，失败方损失所下注的经验。", 360);
               this.amp[var2].setBounds(55, 279, this.amp[var2].getWidth(), this.amp[var2].getHeight());
            }

            var12 = this;
         }

         var12.add(this.amp[var2++]);
      }

      this.amo = new com.xy.q.Class36[2];

      for (int var13 = var2 = 0; var13 < this.amo.length; var13 = ++var2) {
         String var10005 = "P<\f;\fn\u0014qS1D";
         this.amo[var2] = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
         this.amo[var2].setBounds(203, 28, 132, 19);
         this.add(this.amo[var2]);
         if (var2 == 1) {
            this.amo[var2].setBounds(86, 112, 104, 19);
         } else if (var2 == 2) {
            this.amo[var2].setBounds(77, 205, 324, 49);
         }
      }

      this.aal = new com.xy.q.Class27(15, this.amo[1], this);
      String var41 = "V\"\n%\np\u0012oU/B";
      this.aml = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.amk = com.xy.q.Class1.e(com.xy.q.Class49.w, Color.white);
      this.amk.setBounds(79, 207, 320, 45);
      this.aml.setBounds(77, 205, 324, 49);
      this.add(this.amk);
      this.add(this.aml);
      this.amm = new Class136[6];

      for (int var14 = var2 = 0; var14 < this.amm.length; var14 = var2) {
         this.amm[var2] = new Class136(this);
         Class136.anq(this.amm[var2], var2);
         com.xy.w.Class18 var3 = new com.xy.w.Class18();
         Class106 var15;
         if (var2 == 0) {
            var15 = this;
            var3.setBounds(66, 65, 17, 17);
         } else if (var2 == 1) {
            var15 = this;
            var3.setBounds(66, 158, 17, 17);
         } else if (var2 == 2) {
            var15 = this;
            var3.setBounds(66, 182, 17, 17);
         } else {
            var3.setBounds(86 + 80 * (var2 - 3), 89, 18, 18);
            var15 = this;
         }

         Class136.anp(var15.amm[var2], var3);
         this.amm[var2].be(var2 < 4);
         var3.addMouseListener(this.amm[var2++]);
         this.add(var3);
      }

      String var38 = "P<\f;\fl\u0015qS1D";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      this.gh.setBounds(54, 54, 360, 226);
      this.add(this.gh);
   }

   // $VF: synthetic method
   static long aga(Class106 var0) {
      return var0.et;
   }

   // $VF: synthetic method
   static com.xy.q.Class36[] agb(Class106 var0) {
      return var0.amo;
   }

   // $VF: synthetic method
   static JLabel[] agc(Class106 var0) {
      return var0.dy;
   }

   // $VF: synthetic method
   static int agd(Class106 var0) {
      return var0.eg;
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else if (this.eg != 0 && this.eg != 1) {
         return 0L;
      } else {
         LoginResult var4 = this.yx().getLoginResult();
         if (Class136.ano(this.amm[3])) {
            if (var1 > var4.getGold().longValue()) {
               return var4.getGold().longValue();
            }
         } else if (Class136.ano(this.amm[4])) {
            if (var1 > var4.getCodecard().longValue()) {
               return var4.getCodecard().longValue();
            }
         } else {
            if (!Class136.ano(this.amm[5])) {
               return 0L;
            }

            if (var1 > var4.getExperience().longValue()) {
               return var4.getExperience().longValue();
            }
         }

         return null;
      }
   }

   @Override
   public boolean ah() {
      if (this.eg == 2 && this.amn != null) {
         this.amn.setType(2);
         String var1 = Agreement.getSendTextAES("bookofchalg", com.xy.v.Class31.a().toJson(this.amn));
         this.za().k(var1);
         this.amn = null;
      }

      return super.ah();
   }
}
