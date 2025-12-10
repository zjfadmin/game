package com.xy;

import com.xy.readbean.Skill;
import com.xy.readbean.XuanBao;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class118 extends Class345 {
   private Class116 arr;
   private static Image kv = Class511.a("sc/music/234.a");
   private Class643[] alk;
   private Class436[] auj;
   private JComponent aua;
   private List<null> zc;
   private XuanBao auk;
   private Class643[] y;
   private int[] aul;
   public Comparator<null> aum;
   private <undefinedtype> aun;
   private static Image bx = Class511.a("sc/music/235.a");
   private Class226 auo;
   private JScrollPane dw;
   private int m;

   public void s() {
      int var10000 = 3 ^ 3;

      int var1;
      for(var10000 = var1 = 3 & 4; var10000 < this.zc.size(); var10000 = var1) {
         <undefinedtype> var2 = (<undefinedtype>)this.zc.get(var1);
         int var10001 = (3 >> 2) + var1 % --3 * (86 & 127);
         int var10002 = (5 >> 3) + var1 / --3 * (111 & 118);
         ++var1;
         var2.setBounds(var10001, var10002, 92 & 127, 124 & 111);
      }

      this.aua.setPreferredSize(new Dimension(12799 & 20236, (126 & 109) + Math.max(3 & 4, (this.zc.size() - (2 ^ 3)) / --3) * (103 & 126)));
      this.aua.updateUI();
      this.dw.updateUI();
   }

   public void d() {
      int var1 = 2 & 5;
      Iterator var3;
      Iterator var10000 = var3 = this.vc().aj().getXuanbaoMap().values().iterator();

      while(var10000.hasNext()) {
         XuanBao var2 = (XuanBao)var3.next();
         if (!this.ee(var2.getRace())) {
            var10000 = var3;
         } else if (!this.ajm(var2.getType())) {
            var10000 = var3;
         } else if (!this.au(var2.getLevel())) {
            var10000 = var3;
         } else {
            this.ajk(var1++).ht(var2);
            var10000 = var3;
         }
      }

      int var4;
      for(int var5 = var4 = this.zc.size() - (3 >> 1); var5 >= var1; var5 = var4) {
         this.aua.remove((Component)this.zc.remove(var4--));
      }

      Collections.sort(this.zc, this.aum);
      this.s();
   }

   public void c(int var1, Object var2) {
      if (var1 == (18679 & 14319)) {
         this.y((Integer)var2);
      } else {
         if (var1 == (2030 & 30969)) {
            this.as((Integer)var2);
         }

      }
   }

   public <undefinedtype> ajk(int var1) {
      if (var1 < this.zc.size()) {
         return (<undefinedtype>)this.zc.get(var1);
      } else {
         MouseListener var2 = new MouseListener() {
            private JLabel ir;
            private Image fq;
            private XuanBao ale;

            public void mouseEntered(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               Class118.this.ajl(this);
            }

            public {
               int var10004 = 3 & 4;
               this.ir = Class133.b(var10004, 92 & 111, 126 & 93, 50 & 93, Class681.c("#c214248"), Class681.ab);
               this.ir.setHorizontalAlignment(5 >> 3);
               this.add(this.ir);
               this.addMouseListener(this);
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void ht(XuanBao var1) {
               this.ale = var1;
               this.ir.setText(var1.getName());
               this.fq = Class222.i("xb" + var1.getId());
            }

            public void mouseReleased(MouseEvent var1) {
            }

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               var1.drawImage(Class118.bx, 5 >> 3, 5 >> 3, 127 & 92, 111 & 124, (ImageObserver)null);
               Class511.d(var1, this.fq, 47 & 95, 47 & 95, 123 & 60, 123 & 60);
               if (Class118.this.auk != null && this.ale == Class118.this.auk) {
                  var1.drawImage(Class118.kv, 2 & 5, 2 & 5, 127 & 92, 125 & 110, (ImageObserver)null);
               }

            }
         };
         this.zc.add(var2);
         this.aua.add(var2);
         return var2;
      }
   }

   public void ajl(Object var1) {
      this.auk = var1 != null ? var1.ale : null;
      if (this.auk == null) {
         this.auo.df((String[])null);
         this.auj[2 & 5].q();
         this.aun.ht((XuanBao)null);
      } else {
         String[] var10000 = new String[this.auk.getName().length()];
         boolean var10002 = true;
         String[] var3 = var10000;

         int var2;
         for(int var4 = var2 = 2 & 5; var4 < var3.length; var4 = var2) {
            String var5 = this.auk.getName();
            int var10001 = var2;
            var5 = var5.substring(var2, var2 + (3 & 5));
            ++var2;
            var3[var10001] = var5;
         }

         this.auo.df(var3);
         this.arr.e(var3.length == --4 ? 125 & 30 : (var3.length == --3 ? 47 & 118 : 18));
         this.auj[5 >> 3].hf(Class222.i("xb" + this.auk.getId()));
         this.aun.ht(this.auk);
      }
   }


   private boolean ajm(int var1) {
      if (this.aul[4 ^ 5] == 0) {
         return (boolean)(5 >> 2);
      } else if (this.aul[5 >> 2] == --1 && var1 == (4 ^ 5)) {
         return (boolean)(3 & 5);
      } else if (this.aul[3 >> 1] == 5 >> 1 && var1 == --2) {
         return (boolean)(--1);
      } else {
         return (boolean)(this.aul[--1] == --3 && var1 == --3 ? 4 ^ 5 : 0);
      }
   }

   public void as(int var1) {
      int var2 = this.m == (2 ^ 3) ? 5 >> 3 : (this.m == --2 ? 4 ^ 5 : (this.m == --3 ? 1 ^ 3 : 0));
      int var10000 = 3 & 4;
      this.aul[var2] = var1;

      for(int var3 = var10000; var10000 < this.y.length; var10000 = var3) {
         this.y[var3].setVisible((boolean)(3 >> 2));
         if (var1 == (Integer)this.y[var3].hr()) {
            this.alk[var2].setText(this.y[var3].getText());
         }

         ++var3;
      }

      this.m = 3 >> 2;
      this.d();
   }


   private boolean au(int var1) {
      if (this.aul[1 ^ 3] == 0) {
         return (boolean)(3 & 5);
      } else if (this.aul[1 ^ 3] == --1 && var1 == 5 >> 2) {
         return (boolean)(--1);
      } else if (this.aul[1 ^ 3] == (1 ^ 3) && var1 == (1 ^ 3)) {
         return (boolean)(5 >> 2);
      } else {
         return (boolean)(this.aul[5 >> 1] == --3 && var1 == --3 ? --1 : 0);
      }
   }

   public Class118(GameView var1) {
      int var10001 = --3;
      int var10003 = --3;
      int var10008 = -4 >> 2;
      super(6141 & 26815, 5 >> 1, Class345.aef, var1);
      this.aum = new Comparator<null>() {
         public int f(Object var1, Object var2) {
            if (var1.ale.getId() > var2.ale.getId()) {
               return 4 ^ 5;
            } else {
               return var1.ale.getId() < var2.ale.getId() ? -4 >> 2 : 0;
            }
         }
      };
      this.va(var10008, 5 >> 3, 28628 & 4863, 26394 & 6893, Class345.aeo);
      this.uv((Class604)null, (String)null);
      this.aea.setBounds(20138 & 13303, 63 & 116, 27 & 125, 27 & 125);
      int[] var8 = new int[var10003];
      boolean var10005 = true;
      this.aul = var8;
      Class643[] var4 = new Class643[var10001];
      boolean var9 = true;
      this.alk = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.alk.length; var10000 = var2) {
         Class643[] var3 = this.alk;
         Class643 var10002 = new Class643;
         int var10 = 3 & 5;
         int var10006 = 18935 & 14063;
         Font var10007 = Class681.ab;
         String var10009;
         Class118 var10010;
         if (var2 == 0) {
            var10009 = " 所有玄宝";
            var10010 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = " 所有类型";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = " 所有品质";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/music/196.b", var10, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.alk[var2].bq(--1 + var2);
         this.alk[var2].setBounds((127 & 54) + (122 & 95) * var2, 125 & 63, 95 & 122, 124 & 27);
         this.alk[var2].setForeground(Class681.c("#c214248"));
         this.alk[var2].setHorizontalAlignment(1 ^ 3);
         this.alk[var2].setVerticalAlignment(3 >> 2);
         this.add(this.alk[var2++]);
      }

      var4 = new Class643[111 & 22];
      var9 = true;
      this.y = var4;

      for(var10000 = var2 = 5 >> 3; var10000 < this.y.length; var10000 = var2) {
         this.y[var2] = new Class643("sc/music/195.b", --1, 6888 & 26111, Class681.ab, (Color[])null, "", this);
         this.y[var2].bq(var2);
         this.y[var2].setForeground(Class681.c("#c214248"));
         this.y[var2].setHorizontalAlignment(1 ^ 3);
         this.y[var2].setVerticalAlignment(3 & 4);
         this.y[var2].setVisible((boolean)(5 >> 3));
         this.add(this.y[var2++]);
      }

      int var7 = 127 & 52;
      this.zc = new ArrayList();
      this.aua = new JComponent() {
      };
      this.aua.setOpaque((boolean)(3 >> 1));
      this.dw = Class133.f(var7, 115 & 94, 268, 360, this.aua, -4 >> 2);
      ((Class179)this.dw.getVerticalScrollBar().getUI()).ald(Class511.q("sc/music/210.a", 5 >> 1, 8, 5 >> 1, 8, (boolean)(2 & 5)), 10);
      this.add(this.dw);
      this.auo = new Class226("sc/music/236.a", -4 >> 2, 2 & 5, Class681.ct, (Color[])null, (String[])null, this);
      this.auo.ad(this.arr = new Class116(-2, 28, 2 & 5, 20));
      var10001 = --2;
      this.auo.setBounds(366, 84, 24, 108);
      this.auo.setForeground(Class681.c("#c214248"));
      this.auo.ch(Class681.bv);
      this.add(this.auo);
      this.aun = new Class456() {
         private JScrollPane nk;
         private RichLabel gi;

         public {
            int var10002 = 3 & 4;
            this.gi = new RichLabel("", Class681.ad);
            this.nk = Class133.f(var10002, 2 & 5, 17915 & 15172, 24009 & 8950, this.gi, 87 & 60);
            ((Class179)this.nk.getVerticalScrollBar().getUI()).ald(Class511.q("sc/music/210.a", --2, 24 & 111, --2, 60 & 75, (boolean)(5 >> 3)), 26 & 111);
            this.add(this.nk);
         }

         public void ht(XuanBao var1) {
            if (var1 == null) {
               this.gi.setTextSize("", 1324 & 31743);
            } else {
               Class118.this.vc().bf(String.valueOf(var1.getSkillId()));
               StringBuffer var2 = new StringBuffer();
               var2.append("#c214248【玄宝品质】");
               var2.append(var1.getLevel() == --3 ? "珍品" : (var1.getLevel() == --2 ? "中品" : "初品"));
               var2.append("#r【玄宝类型】");
               var2.append(var1.getType() == (4 ^ 5) ? "攻击型" : (var1.getType() == (1 ^ 3) ? "防御型" : "辅助型"));
               var2.append("#r【适用角色】");
               var2.append(var1.getRace());
               var2.append("#r【技能效果】#r");
               var2.append(var1.getText());
               var2.append("#r【玄印配置】");
               int var4 = 3 ^ 3;

               int var10000;
               int var3;
               int var5;
               for(var10000 = var4; var10000 < var1.getYins().length; var10000 = var4) {
                  var2.append("#r玄印槽");
                  var2.append(var4 + --1);
                  var2.append(" 可镶嵌");
                  var3 = --1;
                  var5 = 3 ^ 3;

                  for(var10000 = var3; var10000 < 5; var10000 = var3) {
                     if ((var1.getYins()[var4] >> var3 & 5 >> 2) == 3 >> 1) {
                        if (var5 != 0) {
                           var2.append("#c214248、");
                        }

                        var2.append(var3 == 5 >> 2 ? "#R红" : (var3 == 5 >> 1 ? "#B蓝" : (var3 == --3 ? "#Y黄" : (var3 == --4 ? "#G绿" : "未知"))));
                        ++var5;
                     }

                     ++var3;
                  }

                  ++var4;
                  var2.append("#c214248玄印");
               }

               var2.append("#r【鸣印技能】");
               var4 = 2 & 5;
               var3 = 2 & 5;
               var5 = 3 & 4;

               for(var10000 = var4; var10000 < var1.getResonances().length; var10000 = var4) {
                  var3 = var1.getResonances()[var4];
                  var5 = var1.getResonances()[var4 + --1];
                  var2.append("#r[");
                  var2.append(var3 == --1 ? "#R红" : (var3 == 5 >> 1 ? "#B蓝" : (var3 == --3 ? "#Y黄" : (var3 == --4 ? "#G绿" : "未知"))));
                  var2.append("#c214248,");
                  var2.append(var5 == (3 & 5) ? "#R红" : (var5 == --2 ? "#B蓝" : (var5 == --3 ? "#Y黄" : (var5 == --4 ? "#G绿" : "未知"))));
                  var2.append("#c214248] ");
                  Skill var6 = Class118.this.vc().bf(String.valueOf(var1.getResonances()[var4 + (5 >> 1)]));
                  var2.append(var6 != null ? Class270.si(var6.getRemark(), var6, 30.0D, 15850 & 17117, --4).replaceAll("#R", "").replaceAll("#G", "") : "未知技能");
                  var4 += 3;
               }

               this.gi.setTextSize(var2.toString(), 24366 & 8701);
            }
         }
      };
      this.aun.setBounds(351, 235, 320, 192);
      this.add(this.aun);
      Class436[] var6 = new Class436[var10001];
      var9 = true;
      this.auj = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.auj.length; var10000 = var2) {
         this.auj[var2] = new Class436();
         Class118 var5;
         if (var2 == 0) {
            var5 = this;
            this.auj[var2].setBounds(443, 83, 120, 120);
         } else {
            if (var2 == 5 >> 2) {
               this.auj[var2].fw("sc/music/231.a");
               this.auj[var2].setBounds(3 >> 2, 3 >> 2, 724, 520);
            }

            var5 = this;
         }

         var5.add(this.auj[var2++]);
      }

   }

   public boolean ee(String var1) {
      if (this.aul[3 >> 2] == 0) {
         return (boolean)(3 >> 1);
      } else if (this.aul[2 & 5] == 5 >> 2 && var1.equals("通用")) {
         return (boolean)(3 >> 1);
      } else if (this.aul[2 & 5] == 5 >> 1 && var1.indexOf("人") != -4 >> 2) {
         return (boolean)(--1);
      } else if (this.aul[3 >> 2] == --3 && var1.indexOf("魔") != -4 >> 2) {
         return (boolean)(4 ^ 5);
      } else if (this.aul[2 & 5] == --4 && var1.indexOf("仙") != -4 >> 2) {
         return (boolean)(3 >> 1);
      } else if (this.aul[3 >> 2] == --5 && var1.indexOf("鬼") != -4 >> 2) {
         return (boolean)(4 ^ 5);
      } else {
         return (boolean)(this.aul[5 >> 3] == (39 & 94) && var1.indexOf("龙") != -4 >> 2 ? 2 ^ 3 : 0);
      }
   }

   public void q() {
      this.d();
      super.q();
   }

   public void y(int var1) {
      int var10000;
      int var2;
      if (this.y[3 >> 2].isVisible() && this.m == var1) {
         for(var10000 = var2 = 3 >> 2; var10000 < this.y.length; var10000 = var2) {
            this.y[var2++].setVisible((boolean)(5 >> 3));
         }

         this.m = 5 >> 3;
      } else {
         this.m = var1;
         var2 = this.m == --1 ? 55 & 78 : (this.m == (1 ^ 3) ? --3 : (this.m == --3 ? --3 : 0));

         for(var10000 = var2; var10000 < this.y.length; var10000 = var2) {
            this.y[var2++].setVisible((boolean)(3 ^ 3));
         }

         var2 = 3 >> 2;
         Class118 var3;
         Class643 var4;
         if (this.m == 5 >> 2) {
            for(var10000 = var1 = 2 & 5; var10000 < 7; var10000 = var1) {
               if (var1 != this.aul[5 >> 3]) {
                  if (var1 == 0) {
                     var3 = this;
                     this.y[var2].setText(" 所有玄宝");
                  } else if (var1 == (4 ^ 5)) {
                     var3 = this;
                     this.y[var2].setText(" 通用玄宝");
                  } else if (var1 == (1 ^ 3)) {
                     var3 = this;
                     this.y[var2].setText(" 人族玄宝");
                  } else if (var1 == --3) {
                     var3 = this;
                     this.y[var2].setText(" 魔族玄宝");
                  } else if (var1 == --4) {
                     var3 = this;
                     this.y[var2].setText(" 仙族玄宝");
                  } else if (var1 == --5) {
                     var3 = this;
                     this.y[var2].setText(" 鬼族玄宝");
                  } else {
                     if (var1 == (87 & 46)) {
                        this.y[var2].setText(" 龙族玄宝");
                     }

                     var3 = this;
                  }

                  var4 = var3.y[var2];
                  ++var2;
                  var4.bq(var1);
               }

               ++var1;
            }

            for(var10000 = var1 = 3 >> 2; var10000 < 6; var10000 = var1) {
               this.y[var1].setBounds(127 & 54, (119 & 93) + var1 * (127 & 24), 91 & 126, 57 & 94);
               this.y[var1++].setVisible((boolean)(3 & 5));
            }

         } else if (this.m == --2) {
            for(var10000 = var1 = 2 & 5; var10000 < 4; var10000 = var1) {
               if (var1 != this.aul[3 & 5]) {
                  if (var1 == 0) {
                     var3 = this;
                     this.y[var2].setText(" 所有类型");
                  } else if (var1 == --1) {
                     var3 = this;
                     this.y[var2].setText(" 攻击型");
                  } else if (var1 == --2) {
                     var3 = this;
                     this.y[var2].setText(" 防御型");
                  } else {
                     if (var1 == --3) {
                        this.y[var2].setText(" 辅助型");
                     }

                     var3 = this;
                  }

                  var4 = var3.y[var2];
                  ++var2;
                  var4.bq(var1);
               }

               ++var1;
            }

            for(var10000 = var1 = 3 >> 2; var10000 < 3; var10000 = var1) {
               this.y[var1].setBounds(31153 & 1758, (95 & 117) + var1 * (120 & 31), 126 & 91, 125 & 26);
               this.y[var1++].setVisible((boolean)(--1));
            }

         } else {
            if (this.m == --3) {
               for(var10000 = var1 = 5 >> 3; var10000 < 4; var10000 = var1) {
                  if (var1 != this.aul[--2]) {
                     if (var1 == 0) {
                        var3 = this;
                        this.y[var2].setText(" 所有品质");
                     } else if (var1 == (4 ^ 5)) {
                        var3 = this;
                        this.y[var2].setText(" 初品");
                     } else if (var1 == (1 ^ 3)) {
                        var3 = this;
                        this.y[var2].setText(" 中品");
                     } else {
                        if (var1 == --3) {
                           this.y[var2].setText(" 珍品");
                        }

                        var3 = this;
                     }

                     var4 = var3.y[var2];
                     ++var2;
                     var4.bq(var1);
                  }

                  ++var1;
               }

               for(var10000 = var1 = 0; var10000 < 3; var10000 = var1) {
                  this.y[var1].setBounds(21995 & 11006, (95 & 117) + var1 * (95 & 56), 95 & 122, 24);
                  this.y[var1++].setVisible(true);
               }
            }

         }
      }
   }
}
