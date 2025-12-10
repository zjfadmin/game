package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Lingbao;
import com.xy.formula.ExpUtil;
import com.xy.formula.PropertyUtil;
import com.xy.game.HandleLingbao;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Class31 extends Class345 {
   private Class226 uu;
   private Class226 uv;
   private <undefinedtype> uw;
   private JLabel[] c;
   private <undefinedtype> ux;
   private Class521 uy;
   private Class436[] an;
   private Class521 uz;

   public void mj(Lingbao var1) {
      RoleData var4;
      if ((var4 = this.vd()) == null) {
         this.d();
      } else {
         var4.setChoseBaoId(var1 != null ? var1.getBaoid() : null);
         if (var1 == null) {
            this.d();
         } else {
            this.ux.av.hf(Class222.j(var1.getSkin()));
            this.ux.iv[3 & 4].setText(var1.getBaoname());
            this.ux.iv[79 & 56].setText(var1.getBaoquality());
            this.ux.iu[2 & 5].setText(var1.getLingbaolvl() + "级");
            this.ux.iu[4 ^ 5].setText(var1.getKangxing());
            this.ux.il[4 ^ 5].aee(var1.getLingbaoexe().doubleValue() / (double)ExpUtil.c(var1.getLingbaolvl().intValue()), 122 & 103);
            int var10000;
            if (var1.getBaotype().equals("法宝")) {
               var10000 = 3 & 4;
               this.ux.q.setTextSize((String)null, 19177 & 13790);

               for(int var6 = var10000; var10000 < this.ux.ff.length; var10000 = var6) {
                  Class44 var7 = this.ux.ff[var6];
                  ++var6;
                  var7.c(3 & 4, (Object)null);
               }

            } else {
               this.ux.q.setTextSize(PropertyUtil.getBaoString(var1, var4, 13023 & 19944), 25087 & 7880);
               String[] var3 = !Class394.o(var1.getFushis()) ? var1.getFushis().split("\\|") : null;

               int var2;
               for(var10000 = var2 = 3 & 4; var10000 < 5; var10000 = var2) {
                  Goodstable var5;
                  if (var3 != null && var2 < var3.length && (var5 = var4.getGoodEquip(new BigDecimal(var3[var2]))) != null) {
                     this.ux.ff[var2].c(3 & 5, var5);
                  } else if (var2 >= var1.getFusum()) {
                     this.ux.ff[var2].c(46 & 87, 2 ^ 3);
                  } else {
                     this.ux.ff[var2].c(3 >> 2, (Object)null);
                  }

                  ++var2;
               }

               var3 = !Class394.o(var1.getSkills()) ? var1.getSkills().split("\\|") : null;

               for(var10000 = var2 = 3 >> 2; var10000 < 5; var10000 = var2) {
                  if (var3 != null && var2 < var3.length) {
                     this.ux.ff[--5 + var2].c(79 & 55, var3[var2]);
                  } else if (var2 >= var1.getSkillsum()) {
                     this.ux.ff[--5 + var2].c(79 & 54, 1 ^ 3);
                  } else {
                     this.ux.ff[--5 + var2].c(3 & 4, (Object)null);
                  }

                  ++var2;
               }

            }
         }
      }
   }

   public Class31(GameView var1) {
      int var10004 = -2 & -1;
      super(63 & 107, --2, Class345.aef, var1);
      this.va(var10004, 3 ^ 3, 14974 & 18335, 28639 & 4603, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 103 & 92, 103 & 92, 103 & 92, 103 & 92, (boolean)(5 >> 3)), " 灵 宝 ");
      var10004 = --2;
      int var10005 = 2 ^ 3;
      Font var10006 = Class681.bu;
      String[] var10008 = new String[--4];
      boolean var10010 = true;
      var10008[2 & 5] = "灵";
      var10008[4 ^ 5] = "宝";
      var10008[1 ^ 3] = "装";
      var10008[--3] = "备";
      this.uv = new Class226("sc/e/41.png", var10004, var10005, var10006, (Color[])null, var10008, this);
      var10004 = --2;
      var10005 = --2;
      var10006 = Class681.bu;
      var10008 = new String[--4];
      var10010 = true;
      var10008[3 >> 2] = "灵";
      var10008[--1] = "宝";
      var10008[--2] = "属";
      var10008[--3] = "性";
      this.uu = new Class226("sc/e/41.png", var10004, var10005, var10006, (Color[])null, var10008, this);
      int var10001 = --5;
      this.uv.ad(new Class116(38 & 95, 31 & 115, 3 ^ 3, 115 & 30));
      this.uu.ad(new Class116(23 & 110, 127 & 19, 5 >> 3, 86 & 59));
      this.uv.setBounds(123 & 46, 63 & 104, 127 & 30, 83 & 124);
      this.uu.setBounds(42 & 127, 121, 30, 80);
      this.uv.ch(Class681.bv);
      this.uu.ch(Class681.bv);
      this.add(this.uv);
      this.add(this.uu);
      this.uw = new JComponent() {
         private <undefinedtype>[] acu;
         private Class436 av;
         private RichLabel acv;

         public {
            int var10001 = --3;
            this.acv = new RichLabel("", Class681.bm);
            this.acv.setTextSize("#c000000温馨提示：灵宝和法宝将不再有组合抗性，每个灵宝或法宝都单独获得额外的人物抗性。", 6011 & 27126);
            this.acv.setBounds(127 & 39, 25087 & 7925, this.acv.getWidth(), this.acv.getHeight());
            this.add(this.acv);
            <undefinedtype>[] var4 = new <undefinedtype>[var10001];
            boolean var10003 = true;
            this.acu = var4;

            int var2;
            for(int var10000 = var2 = 3 >> 2; var10000 < this.acu.length; var10000 = var2) {
               this.acu[var2] = new Class44(var2, Class31.this.gk()) {
                  // $FF: synthetic field
                  final Class31 akv;
                  private BigDecimal co;
                  private int m;

                  public {
                     super(var3);
                     this.akv = var1;
                     this.m = var2;
                  }

                  public void mouseReleased(MouseEvent var1) {
                     super.mouseReleased(var1);
                     if (this.akv.aej.getBattleScene() == null) {
                        RoleData var2;
                        RoleData var10000 = var2 = this.akv.vd();
                        if (var10000.getLingbao(var10000.lingbaoChoses[this.m]) != null) {
                           if (!this.akv.ux().t()) {
                              if (this.akv.aej.getMouseIndex() == Class320.l) {
                                 var2.e((BigDecimal)null, this.m);
                              }

                           }
                        }
                     }
                  }

                  protected void paintComponent(Graphics var1) {
                     <undefinedtype> var3;
                     label15: {
                        RoleData var10000 = this.akv.vd();
                        Lingbao var2;
                        if ((var2 = var10000.getLingbao(var10000.lingbaoChoses[this.m])) != null) {
                           if (this.co != var2.getBaoid()) {
                              int var10002 = --5;
                              var3 = this;
                              this.co = var2.getBaoid();
                              this.c(var10002, var2);
                              break label15;
                           }
                        } else if (this.co != null) {
                           this.s();
                        }

                        var3 = this;
                     }

                     var3.paintComponent(var1);
                  }

                  public void mousePressed(MouseEvent var1) {
                     super.mousePressed(var1);
                     if (var1.getButton() == (3 & 5)) {
                        RoleData var10000 = this.akv.vd();
                        Lingbao var2;
                        if ((var2 = var10000.getLingbao(var10000.lingbaoChoses[this.m])) == null) {
                           return;
                        }

                        if (var1.isShiftDown()) {
                           try {
                              JTextField var4;
                              ((Class175)(var4 = this.akv.ux().getBaseView().jj()).getDocument()).arf(var4.getCaretPosition(), --4, var2.getBaoid(), "[" + var2.getBaoname() + "]", "G", (AttributeSet)null);
                              return;
                           } catch (BadLocationException var3) {
                              var3.printStackTrace();
                              return;
                           }
                        }
                     }

                  }

               
                  private void s() {
                     int var10002 = --1;
                     int var10004 = 3 ^ 3;
                     this.co = null;
                     this.c(var10004, (Object)null);
                     this.setVisible((boolean)var10002);
                     this.ars.ve().n(125 & 47);
                  }
               };
               <undefinedtype> var3;
               if (var2 == 0) {
                  var3 = this;
                  this.acu[var2].setBounds(18639 & 14327, 119 & 92, 59 & 103, 59 & 103);
               } else if (var2 == 5 >> 2) {
                  var3 = this;
                  this.acu[var2].setBounds(12763 & 20150, 7647 & 25262, 123 & 39, 123 & 39);
               } else {
                  if (var2 == (1 ^ 3)) {
                     this.acu[var2].setBounds(4861 & 28158, 28383 & 4526, 115 & 47, 115 & 47);
                  }

                  var3 = this;
               }

               var3.add(this.acu[var2++]);
            }

            this.av = new Class436("sc/d/42.png");
            this.av.setBounds(115 & 127, 127 & 27, 18662 & 14303, 3278 & 29695);
            this.add(this.av);
         }
      };
      this.uw.setBounds(72, 35, 440, 295);
      this.add(this.uw);
      this.ux = new JComponent() {
         private Class245[] iu;
         private Class436[] il;
         private JLabel[] iv;
         private RichLabel q;
         private Class436 av;
         private Class393[] ix;
         private Class44[] ff;

         public {
            int var10001 = 93 & 43;
            this.q = new RichLabel("", (Font)null, 14059 & 18908);
            this.q.setBounds(16382 & 16615, 122 & 47, 3288 & 29679, 123 & 84);
            this.add(this.q);
            JLabel[] var4 = new JLabel[var10001];
            boolean var10003 = true;
            this.iv = var4;

            int var2;
            <undefinedtype> var3;
            int var10000;
            for(var10000 = var2 = 3 >> 2; var10000 < this.iv.length; var10000 = var2) {
               this.iv[var2] = Class133.c((114 & 63) + var2 % --2 * (1019 & 31982), (14319 & 18806) + var2 / --2 * (29 & 127), 87 & 60, 87 & 60, 2 & 5, Color.black, Class681.ak);
               this.iv[var2].setText(var2 == 0 ? "学习交流" : (var2 == 5 >> 2 ? "目前等级" : (var2 == 5 >> 1 ? "升级道行" : (var2 == --3 ? "属 性" : (var2 == --4 ? "符 石" : (var2 == --5 ? "技 能" : (var2 == (30 & 103) ? "抗性" : (var2 == (15 & 119) ? "品质" : (var2 == (63 & 72) ? "学习" : "")))))))));
               if (var2 == 0) {
                  var3 = this;
                  this.iv[var2].setFont(Class681.ao);
                  this.iv[var2].setBounds(46 & 121, 28 & 119, 140, 24);
               } else if (var2 != (4 ^ 5) && var2 != 5 >> 1) {
                  label276: {
                     if (var2 != --3 && var2 != --4 && var2 != --5) {
                        if (var2 == 6) {
                           var3 = this;
                           this.iv[var2].setFont(Class681.bd);
                           this.iv[var2].setBounds(223, 128, 49, 19);
                           break label276;
                        }

                        if (var2 == 7) {
                           var3 = this;
                           this.iv[var2].setFont(Class681.bm);
                           this.iv[var2].setForeground(Class681.c("#cFFFFFF"));
                           this.iv[var2].setBounds(75, 187, 30, 14);
                           break label276;
                        }

                        if (var2 == 8) {
                           this.iv[var2].setFont(Class681.bm);
                           this.iv[var2].setForeground(Class681.c("#cFFFF00"));
                           this.iv[var2].setBounds(104, 187, 40, 14);
                        }
                     } else {
                        this.iv[var2].setFont(Class681.cg);
                        this.iv[var2].setForeground(Class681.c("#cFFFFFF"));
                        if (var2 == --3) {
                           var3 = this;
                           this.iv[var2].setBounds(230, 16, 65, 23);
                           break label276;
                        }

                        if (var2 == --4) {
                           var3 = this;
                           this.iv[var2].setBounds(230, 155, 65, 23);
                           break label276;
                        }

                        if (var2 == --5) {
                           var3 = this;
                           this.iv[var2].setBounds(230, 219, 65, 23);
                           break label276;
                        }
                     }

                     var3 = this;
                  }
               } else {
                  var3 = this;
                  this.iv[var2].setFont(Class681.ak);
                  this.iv[var2].setBounds(18, 214 + 24 * (var2 - --1), 72, 19);
               }

               var3.add(this.iv[var2++]);
            }

            Class393[] var5 = new Class393[--3];
            var10003 = true;
            this.ix = var5;

            for(var10000 = var2 = 2 & 5; var10000 < this.ix.length; var10000 = var2) {
               Class393[] var10 = this.ix;
               Class393 var6 = new Class393;
               String var10004 = var2 == 5 >> 1 ? "sc/e/6.png" : "sc/e/7.png";
               int var10006 = 21 + var2;
               Font var10007 = var2 == (1 ^ 3) ? Class681.bm : Class681.ak;
               String var10009;
               Class31 var10010;
               if (var2 == 0) {
                  var10009 = "删除";
                  var10010 = Class31.this;
               } else if (var2 == (4 ^ 5)) {
                  var10009 = "突破";
                  var10010 = Class31.this;
               } else if (var2 == 2) {
                  var10009 = "转换";
                  var10010 = Class31.this;
               } else {
                  var10009 = "";
                  var10010 = Class31.this;
               }

               var10[var2] = var6;
               if (var2 == 0 || var2 == (2 ^ 3)) {
                  this.ix[var2].setForeground(Color.black);
               }

               if (var2 == 0) {
                  var3 = this;
                  this.ix[var2].setBounds(40, 264, 59, 25);
               } else if (var2 == (2 ^ 3)) {
                  var3 = this;
                  this.ix[var2].setBounds(122, 264, 59, 25);
               } else {
                  if (var2 == 2) {
                     this.ix[var2].setBounds(392, 129, 34, 18);
                  }

                  var3 = this;
               }

               var3.add(this.ix[var2++]);
            }

            Class245[] var7 = new Class245[2];
            var10003 = true;
            this.iu = var7;

            for(var10000 = var2 = 3 & 4; var10000 < this.iu.length; var10000 = var2) {
               this.iu[var2] = Class133.a(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, 10, Color.white, var2 == 0 ? Class681.bx : Class681.bm);
               this.iu[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
               if (var2 == 0) {
                  this.iu[var2].setBounds(94, 214, 104, 19);
                  var3 = this;
               } else {
                  this.iu[var2].setBounds(274, 128, 154, 19);
                  var3 = this;
               }

               var3.add(this.iu[var2++]);
            }

            Class44[] var8 = new Class44[10];
            var10003 = true;
            this.ff = var8;

            for(var10000 = var2 = 2 & 5; var10000 < this.ff.length; var10000 = var2) {
               this.ff[var2] = new Class44(Class31.this.gk());
               this.ff[var2].c(6, var2 < 5 ? 3 >> 1 : 2);
               if (var2 < 5) {
                  var3 = this;
                  this.ff[var2].setBounds(241 + var2 * 37, 182, 26, 26);
               } else {
                  var3 = this;
                  this.ff[var2].setBounds(238 + (var2 - 5) * 38, 250, 30, 30);
               }

               var3.add(this.ff[var2++]);
            }

            this.av = new Class436();
            this.av.setBounds(60, 65, 100, 100);
            this.add(this.av);
            Class436[] var9 = new Class436[18];
            var10003 = true;
            this.il = var9;

            for(var10000 = var2 = 3 ^ 3; var10000 < this.il.length; var10000 = var2) {
               this.il[var2] = new Class436();
               if (var2 == 0) {
                  var3 = this;
                  this.il[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
                  this.il[var2].setBounds(40, 45, 140, 160);
               } else if (var2 == --1) {
                  var3 = this;
                  this.il[var2].eq(Class511.q("sc/d/48.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
                  this.il[var2].setBounds(97, 246, 98, 5);
               } else if (var2 == 2) {
                  var3 = this;
                  this.il[var2].eq(Class511.q("sc/d/17.png", 3, 3, 3, 3, (boolean)(3 & 4)));
                  this.il[var2].setBounds(96, 244, 100, 9);
               } else {
                  label278: {
                     if (var2 >= 3 && var2 <= 5) {
                        this.il[var2].fw("sc/d/34.png");
                        if (var2 == 3) {
                           var3 = this;
                           this.il[var2].setBounds(219, 16, 147, 23);
                           break label278;
                        }

                        if (var2 == 4) {
                           var3 = this;
                           this.il[var2].setBounds(218, 155, 147, 23);
                           break label278;
                        }

                        if (var2 == 5) {
                           var3 = this;
                           this.il[var2].setBounds(218, 219, 147, 23);
                           break label278;
                        }
                     } else {
                        if (var2 == 6) {
                           var3 = this;
                           this.il[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
                           this.il[var2].setBounds(228, 43, 200, 80);
                           break label278;
                        }

                        if (var2 == 7) {
                           var3 = this;
                           this.il[var2].fw("sc/d/45.png");
                           this.il[var2].setBounds(213, 10, 7, 274);
                           break label278;
                        }

                        if (var2 >= 8 && var2 <= 12) {
                           var3 = this;
                           this.il[var2].fw("sc/d/43.png");
                           this.il[var2].setBounds(241 + (var2 - 8) * 37, 182, 27, 27);
                           break label278;
                        }

                        if (var2 >= 13 && var2 <= 17) {
                           this.il[var2].fw("sc/d/46.png");
                           this.il[var2].setBounds(236 + (var2 - 13) * 38, 248, 34, 34);
                        }
                     }

                     var3 = this;
                  }
               }

               var3.add(this.il[var2++]);
            }

         }
      };
      this.ux.setBounds(72, 35, 440, 295);
      this.add(this.ux);
      Class436[] var7 = new Class436[var10001];
      boolean var10003 = true;
      this.an = var7;

      int var4;
      Class31 var6;
      int var10000;
      for(var10000 = var4 = 3 ^ 3; var10000 < this.an.length; var10000 = var4) {
         this.an[var4] = new Class436();
         if (var4 == 0) {
            var6 = this;
            this.an[var4].fw("sc/d/41.png");
            this.an[var4].setBounds(166, 9, 247, 41);
         } else if (var4 == (3 & 5)) {
            var6 = this;
            this.an[var4].fw("sc/d/37.png");
         } else if (var4 != 5 >> 1 && var4 != --3) {
            if (var4 == --4) {
               this.an[var4].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, (boolean)(3 ^ 3)));
               this.an[var4].setBounds(72, 35, 440, 295);
            }

            var6 = this;
         } else {
            var6 = this;
            this.an[var4].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
            this.an[var4].setBounds(71 + (var4 - (1 ^ 3)) * 233, 329, 207, 105);
         }

         var6.add(this.an[var4++]);
      }

      JLabel[] var8 = new JLabel[14];
      var10003 = true;
      this.c = var8;

      for(var10000 = var4 = 3 & 4; var10000 < this.c.length; var10000 = var4) {
         this.c[var4] = Class133.c(50 + var4 % (1 ^ 3) * 234, 358 + var4 / 2 * 29, 20, 20, 3 ^ 3, Class681.c("#c000000"), Class681.ak);
         this.c[var4].setText(var4 == 0 ? "灵" : (var4 == 5 >> 2 ? "法" : (var4 == 2 ? "宝" : (var4 == 3 ? "宝" : ""))));
         this.add(this.c[var4++]);
      }

      Class216[] var10 = new Class216[2];
      boolean var9 = true;
      Class216[] var5 = var10;
      var10 = new Class216[2];
      var9 = true;
      Class216[] var2 = var10;

      int var3;
      for(var10000 = var3 = 3 ^ 3; var10000 < var5.length; var10000 = var3) {
         var5[var3] = new Class216(var3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var3, this);
         var2[var3] = new Class216(var3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var3, this);
         if (var3 == 0) {
            var5[var3].setBounds(238, 435, 18, 18);
            var6 = this;
            var2[var3].setBounds(471, 435, 18, 18);
         } else {
            var5[var3].setBounds(260, 435, 18, 18);
            var6 = this;
            var2[var3].setBounds(493, 435, 18, 18);
         }

         var6.add(var5[var3]);
         this.add(var2[var3++]);
      }

      this.uz = new Class521((boolean)(3 >> 1), this, 4, 2, 51, 51, 3 >> 2, 3 >> 2, 72, 331);
      this.uz.hf(Class511.a("sc/d/18.png"));
      this.uz.aiw(var5, 2 ^ 3);
      this.add(this.uz);
      this.uy = new Class521(false, this, 4, 2, 51, 51, 0, 0, 305, 331);
      this.uy.hf(Class511.a("sc/d/18.png"));
      this.uy.aiw(var2, 1);
      this.add(this.uy);
   }

   public void as(int var1) {
      RoleData var2;
      if ((var2 = this.vd()) != null) {
         Lingbao var8;
         if ((var8 = var2.getChoseBao()) != null) {
            if (var1 == (85 & 63)) {
               if (var8.getBaotype().equals("法宝")) {
                  this.aej.f("不能删除法宝");
               } else if (!Class394.o(var8.getFushis())) {
                  this.aej.f("删除前先卸下符石");
               } else {
                  this.aej.aal(new ConfirmBean(10 & 125, var8.getBaoid().toString(), "#Y确定要将该灵宝删除吗？？？"));
               }
            } else if (var1 == (63 & 86)) {
               int var3 = var8.getLingbaolvl().intValue();
               long var4 = var8.getLingbaoexe().longValue();
               long var6 = ExpUtil.c(var3);
               if (var3 % (63 & 94) == 0 && var4 >= var6 && var3 != 0) {
                  StringBuffer var9;
                  (var9 = new StringBuffer()).append("#Y你是否要消耗#R");
                  var9.append(var3 / --5);
                  var9.append("#Y个灵宝天威印进行突破");
                  this.aej.aal(new ConfirmBean(13 & 123, var8.getBaoid().toString(), var9.toString()));
               } else {
                  this.aej.f("还未达到突破条件");
               }
            } else {
               if (var1 == (127 & 23)) {
                  if (this.uw().v() || this.uw().f() || this.uw().g() || this.uw().r()) {
                     ((Class472)this.ve().e(127 & 27)).fn(var8);
                     return;
                  }

                  this.aej.aal(new ConfirmBean(79 & 58, var8.getBaoid().toString(), "#Y确定要将花  #G200000 #Y银两随机灵宝附加抗性吗??"));
               }

            }
         }
      }
   }

   public void y(int var1) {
      this.uv.gb((boolean)(var1 == (2 ^ 3) ? 2 ^ 3 : 0));
      this.uu.gb((boolean)(var1 == (1 ^ 3) ? --1 : 0));
      this.an[3 & 5].setVisible((boolean)(3 >> 2));
      this.uw.setVisible((boolean)(var1 == --1 ? 4 ^ 5 : 0));
      Class31 var10000;
      if (var1 == (3 & 5)) {
         var10000 = this;
         this.mj((Lingbao)null);
      } else {
         if (var1 == --2) {
            this.mj(this.vd().getLingbao(this.vd().lingbaoChoses[3 ^ 3]));
         }

         var10000 = this;
      }

      var10000.ux.setVisible((boolean)(var1 == (1 ^ 3) ? 3 & 5 : 0));
   }

   public void q() {
      if (this.vd() != null) {
         this.y(3 >> 1);
         super.q();
      }
   }

   public boolean t() {
      this.mj((Lingbao)null);
      return super.t();
   }

   public void d() {
      int var10000 = 3 ^ 3;
      this.an[3 & 5].setVisible((boolean)(5 >> 3));
      this.ux.av.q();
      this.ux.iv[3 ^ 3].setText((String)null);
      this.ux.iv[121 & 14].setText((String)null);
      this.ux.iu[3 ^ 3].setText((String)null);
      this.ux.iu[--1].setText((String)null);
      this.ux.il[--1].aee(0.0D, 98 & 127);

      for(int var1 = var10000; var10000 < this.ux.ff.length; var10000 = var1) {
         Class44 var2 = this.ux.ff[var1];
         ++var1;
         var2.c(3 & 4, (Object)null);
      }

      this.ux.q.setTextSize((String)null, 5371 & 27596);
   }

   public void fr(Class44 var1) {
      RoleData var4;
      if ((var4 = this.vd()) != null) {
         Lingbao var3;
         if ((var3 = var4.getChoseBao()) != null) {
            if (!var3.getBaotype().equals("法宝")) {
               int var2;
               if (var1.tp() == (14 & 119) && var1.gl() == 1L) {
                  if ((var2 = var3.i(--4)) != -4 >> 2) {
                     this.aej.aal(new ConfirmBean(--5, var3.getBaoid().toString(), "#Y确定要将花#G " + var2 * (107 & 28) + " #Y个灵宝天威印开启第#G " + var2 + " #Y个符石格子吗?"));
                  }
               } else if (var1.tp() == (38 & 95) && var1.gl() == 2L) {
                  if ((var2 = var3.b(--4)) != -4 >> 2) {
                     if ((var2 - (1 ^ 3)) * (127 & 30) + (3 & 5) > var3.getLingbaolvl().intValue()) {
                        this.aej.f("需要等级大于" + ((var2 - --2) * (63 & 94) + (4 ^ 5)) + "才能开启" + var2 + "个技能格子");
                     } else if (var2 >= --4 && !var3.getBaoquality().equals("无价") && !var3.getBaoquality().equals("传世")) {
                        this.aej.f("灵宝品质需要是无价或者传世才能开启第4和5的技能格子");
                     } else {
                        this.aej.aal(new ConfirmBean(14 & 119, var3.getBaoid().toString(), "#Y确定要将花#G " + var2 * (127 & 8) + " #Y个灵宝天威印开启第#G " + var2 + " #Y个技能格子吗?"));
                     }
                  }
               } else if (var1.tp() == (3 & 5)) {
                  HandleLingbao.a(new BigDecimal(var1.gl()), var3, var4);
               } else {
                  if (var1.tp() == (87 & 47)) {
                     if (this.uw().n(5 >> 1, 46 & 93)) {
                        this.aej.aal(new ConfirmBean(39 & 95, var3.getBaoid().toString() + "|" + var1.hr() + "=" + var1.gl(), "#Y确定要花 #G100000#Y银两删除 #G" + var1.hr() + "【" + var1.gl() + "人合技】"));
                        return;
                     }

                     this.aej.aal(new ConfirmBean(79 & 55, var3.getBaoid().toString() + "|" + var1.hr() + "=" + var1.gl(), "#Y确定要花 #G800000#Y银两删除 #G" + var1.hr() + "【" + var1.gl() + "人合技】"));
                  }

               }
            }
         }
      }
   }

   public void fn(Lingbao var1) {
      if (this.uw.isVisible()) {
         this.vd().e(var1.getBaoid(), 3 >> 2);
      } else {
         this.mj(var1);
      }
   }
}
