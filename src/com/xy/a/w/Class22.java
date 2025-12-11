package com.xy.a.w;

import com.xy.bean.BeauBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class22 extends com.xy.q.Class30 {
   private com.xy.i.Class20[] pe;
   private RichLabel cj;
   private JLabel[] o;
   private com.xy.w.Class18[] cl;

   @Override
   public void l() {
      if (this.yx() != null) {
         this.h();
         super.l();
      }
   }

   public Class22(GameView var1) {
      super(183, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "n]2Z2\u000f3NsY";
      this.yy(-1, 0, 402, 400, com.xy.q.Class30.agh);
      com.xy.w.Class9 var31 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "戵盜靷厯";
      this.yu(var31, "我的靓号");
      this.pe = new com.xy.i.Class20[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.pe.length; var10000 = var2) {
         com.xy.i.Class20[] var5 = this.pe;
         if (var2 == 0) {
            var10004 = "n]2[2\b3NsY";
            var10004 = "sc/e/6.png";
         } else if (var2 == 1) {
            var10004 = "W;\u000b=\u000bo\n(J?";
            var10004 = "sc/e/7.png";
         } else {
            var10004 = "M~\u0011x\u0011/\b3NsY";
            var10004 = "sc/e/26.png";
         }

         int var10006 = 381 + var2;
         String var36;
         Class22 var10010;
         if (var2 == 0) {
            var36 = "捴獶";
            var36 = "捐献";
            var10010 = this;
         } else if (var2 == 1) {
            var36 = "绰贇";
            var36 = "续费";
            var10010 = this;
         } else if (var2 == 2) {
            var36 = "弤遂靷厯";
            var36 = "开通靓号";
            var10010 = this;
         } else if (var2 == 3) {
            var36 = "靎叉柎艌";
            var36 = "靓号染色";
            var10010 = this;
         } else if (var2 == 4) {
            var36 = "颵逋昚祢";
            var36 = "频道显示";
            var10010 = this;
         } else {
            var36 = "";
            var10010 = this;
         }

         com.xy.i.Class20 var10001 = new com.xy.i.Class20(var10004, 1, var10006, Class49.ch, null, var36, var10010);
         var5[var2] = var10001;
         this.pe[var2].setBounds(323, 191, 34, 18);
         Class22 var6;
         if (var2 == 0) {
            var6 = this;
            this.pe[var2].setFont(Class49.bz);
            this.pe[var2].setForeground(Color.white);
         } else if (var2 == 1) {
            var6 = this;
            this.pe[var2].setBounds(256, 188, 59, 25);
            this.pe[var2].setForeground(Color.black);
         } else {
            if (var2 >= 2 && var2 <= 4) {
               this.pe[var2].setBounds(256, 253 + (var2 - 2) * 42, 99, 25);
               this.pe[var2].setForeground(Color.black);
            }

            var6 = this;
         }

         var6.add(this.pe[var2++]);
      }

      this.cj = new RichLabel("", Class49.w);
      this.add(this.cj);
      this.o = new JLabel[12];

      for (int var7 = var2 = 0; var7 < this.o.length; var7 = var2) {
         this.o[var2] = com.xy.q.Class1.k(50, 32, 320, 21, Color.white, Class49.ch);
         JLabel var8 = this.o[var2];
         String var12;
         if (var2 == 0) {
            var12 = "彎剳敕枢";
            var12 = "当前效果";
         } else if (var2 == 1) {
            var12 = "叇姯\u0011`ｂ";
            var12 = "原始ID：";
         } else if (var2 == 2) {
            var12 = "存乽亚浜绽乽臔孻\u000f-\u000e%\b";
            var12 = "学习交流练习自学10086";
         } else if (var2 == 3) {
            var12 = "霋叓剨朻斮闐ｂ";
            var12 = "靓号到期时间：";
         } else if (var2 == 4) {
            var12 = "/\u000e/\u000e幩\u000b朕\u000f(叉";
            var12 = "2020年5月15号";
         } else if (var2 == 5) {
            var12 = "刔杇朎纵贝剁伾嚆攒霋叓ｔ霤醕斔赵乔扎竺投";
            var12 = "到期未续费则会回收靓号，需重新购买或竞拍";
         } else if (var2 == 6) {
            var12 = "枿哜靭只Ｒ";
            var12 = "极品靓号，";
         } else if (var2 == 7) {
            var12 = "尙仳尮赭";
            var12 = "尽享尊贵";
         } else if (var2 == 8) {
            var12 = "靭只柭良Ｒ";
            var12 = "靓号染色，";
         } else if (var2 == 9) {
            var12 = "彔晦与恿";
            var12 = "彰显个性";
         } else if (var2 == 10) {
            var12 = "颯過昀礧Ｒ";
            var12 = "频道显示，";
         } else if (var2 == 11) {
            var12 = "丣仢瞍皶";
            var12 = "万人瞩目";
         } else {
            var12 = "";
         }

         var8.setText(var12);
         this.o[var2].setHorizontalAlignment(10);
         Class22 var9;
         if (var2 == 0) {
            var9 = this;
            this.o[var2].setHorizontalAlignment(0);
         } else {
            label189: {
               if (var2 >= 1 && var2 <= 5) {
                  this.o[var2].setFont(Class49.n);
                  if (var2 == 1) {
                     var9 = this;
                     this.o[var2].setBounds(60, 60, 54, 14);
                     break label189;
                  }

                  if (var2 == 2) {
                     var9 = this;
                     this.o[var2].setBounds(114, 60, 200, 14);
                     break label189;
                  }

                  if (var2 == 3) {
                     var9 = this;
                     this.o[var2].setBounds(60, 193, 91, 14);
                     break label189;
                  }

                  if (var2 == 4) {
                     var9 = this;
                     this.o[var2].setBounds(151, 193, 100, 14);
                     break label189;
                  }

                  if (var2 == 5) {
                     var9 = this;
                     this.o[var2].setBounds(81, 225, 280, 14);
                     this.o[var2].setForeground(Color.black);
                     break label189;
                  }
               } else if (var2 >= 6 && var2 <= 11) {
                  this.o[var2].setFont(Class49.bx);
                  this.o[var2].setBounds(77 + (var2 - 6) % 2 * 85, 254 + (var2 - 6) / 2 * 42, 100, 19);
                  if (var2 == 6 || var2 == 8 || var2 == 10) {
                     this.o[var2].setForeground(Color.yellow);
                  }
               }

               var9 = this;
            }
         }

         var9.add(this.o[var2++]);
      }

      this.cl = new com.xy.w.Class18[6];

      for (int var10 = var2 = 0; var10 < this.cl.length; var10 = ++var2) {
         this.cl[var2] = new com.xy.w.Class18();
         this.add(this.cl[var2]);
         if (var2 >= 0 && var2 <= 2) {
            com.xy.w.Class18 var26 = this.cl[var2];
            String var30 = "M~\u0011y\u0011+\b3NsY";
            var26.mt(com.xy.w.Class16.m("sc/d/66.png", 100, 1, 100, 1, false));
            if (var2 == 0) {
               this.cl[var2].setBounds(60, 180, 300, 2);
            } else if (var2 == 1) {
               this.cl[var2].setBounds(60, 283, 300, 2);
            } else if (var2 == 2) {
               this.cl[var2].setBounds(60, 325, 300, 2);
            }
         } else if (var2 == 3) {
            com.xy.w.Class18 var24 = this.cl[var2];
            String var28 = "+Gw@w\u0016m\n(J?";
            var24.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(50, 32, 320, 21);
         } else if (var2 >= 4 && var2 <= 5) {
            com.xy.w.Class18 var25 = this.cl[var2];
            String var29 = "M~\u0011y\u0011/\n3NsY";
            var25.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            if (var2 == 4) {
               this.cl[var2].setBounds(50, 32, 320, 190);
            } else if (var2 == 5) {
               this.cl[var2].setBounds(50, 241, 320, 132);
            }
         }
      }
   }

   public void h() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         UseCardBean var2;
         BeauBean var3 = (var2 = var1.getLimit("靓号")) != null ? var2.a() : null;
         Class22 var10000;
         if (var3 == null) {
            var10000 = this;
            this.cj.setTextSize("", 320);
         } else if (var3.a()) {
            RichLabel var4 = this.cj;
            String var10003 = "\u0007\u000ef\u001de\r";
            StringBuilder var10001 = new StringBuilder("#VBEAU").append(var3.toString());
            String var10002 = ">r";
            var4.setTextSize(var10001.append("#L").toString(), 320);
            var10000 = this;
         } else {
            String var8 = "\u0007;b\u001e\u0014hb\u001e";
            this.cj.setTextSize("#cFF00FF" + var3.getBeau(), 320);
            var10000 = this;
         }

         var10000.cj.setBounds(50 + (320 - this.cj.getWidth()) / 2, 116, this.cj.getWidth(), this.cj.getHeight());
         this.o[2].setText(String.valueOf(var1.getRoleId()));
         if (var3 != null) {
            JLabel var5 = this.o[4];
            long var6 = var2.getTime();
            String var7 = "GdGd幊Ps朕Zy旛";
            var5.setText(com.xy.v.Class22.j(var6, "yyyy年MM月dd日"));
            this.o[3].setVisible(true);
            this.o[4].setVisible(true);
            this.pe[0].setVisible(true);
            this.pe[1].setVisible(true);
         } else {
            this.o[3].setVisible(false);
            this.o[4].setVisible(false);
            this.pe[0].setVisible(false);
            this.pe[1].setVisible(false);
         }
      }
   }

   public void g(int var1) {
      if (var1 == 383) {
         String var6 = "rh";
         String var5 = Agreement.getSendTextAES("BEAU", "V0");
         this.za().k(var5);
      } else {
         RoleData var2;
         if ((var2 = this.yx()) != null) {
            UseCardBean var3;
            BeauBean var4 = (var3 = var2.getLimit("靓号")) != null ? var3.a() : null;
            if (var4 != null) {
               if (var1 == 381) {
                  String var10005 = "佞硳室覜攀弞诛靎叉吊Ａ";
                  this.afx.dm(new ConfirmBean(34, null, "你确定要放弃该靓号吗？"));
               } else if (var1 == 382) {
                  com.xy.i.Class0.ff(185, this.afx);
               } else {
                  if (var1 == 384) {
                     if (var4.getLvl() != 1) {
                        String var10001 = "讽靷厯旄靘柷航";
                        this.afx._do("该靓号无需染色");
                        return;
                     }

                     com.xy.i.Class0.ff(184, this.afx);
                  }
               }
            }
         }
      }
   }
}
