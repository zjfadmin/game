package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.formula.ExpUtil;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Skill;
import com.xy.readbean.TYCModel;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class20 extends Class345 {
   private Class70 gk;
   private Class436[] gl;
   private Class70 gm;
   private Class436 gn;
   private JLabel go;
   private JLabel gp;
   private Class436 gq;
   private Class70 gr;
   private List<null> gs;
   public int dm;
   public int dn;
   public int do;
   private Class70 gt;
   private boolean gu;
   public int gv;
   public int gc;
   public int gw;
   private Class70 gx;
   private Class70 gy;
   private Class70 gz;
   private Class151 ha;
   public int cy;
   private Class70 hb;

   public void dg() {
      if (this.gw == 0 && this.dm <= this.dn) {
         int var5 = 0;
         StringBuffer var4;
         (var4 = new StringBuffer()).append(this.cy);
         Iterator var2 = this.gs.iterator();
         Iterator var10000 = var2;

         while(true) {
            while(var10000.hasNext()) {
               <undefinedtype> var3;
               if ((var3 = (<undefinedtype>)var2.next()).ayt != null) {
                  if (var3.fk == 0) {
                     var10000 = var2;
                     continue;
                  }

                  int var1 = 0;
                  int var7;
                  if (var3.ayt.getType() == 0) {
                     var7 = var1 = 5 >> 3;
                  } else if (var3.ayt.getType() == --1) {
                     var7 = (var3.ayt.getKey() == this.gc ? 5 >> 2 : 2) << 9;
                  } else {
                     if (var3.ayt.getType() == --2) {
                        var1 = 32604 & 1699;
                     }

                     var7 = var1;
                  }

                  var1 = var7 | var3.ayt.getLvl() << (22 & 111) | var3.ayt.getIndex() << --3 | var3.fk;
                  var4.append("#");
                  var4.append(var1);
                  if (var3.fk > var3.gw) {
                     var5 = --1;
                  }
               }

               var10000 = var2;
            }

            if (var5 == 0) {
               this.aej.f("没有修改的痕迹");
               return;
            }

            RoleData var6 = this.vd();
            int var10002 = 3 & 4;
            var6.getPrivateData().setSkills("N", var4.toString());
            var6.getRoleProperty().j();
            ParamTool.f(var6.getPrivateData(), this.uw());
            var6.getRoleProperty().n();
            this.as(var10002);
            this.aej.f("已保存");
            return;
         }
      }
   }

   public void dh(int var1) {
      if (var1 == 0) {
         this.gq.setBounds(117 & 127, 12063 & 21221, 115 & 110, 95 & 54);
         this.gp.setBounds(30957 & 1983, 15159 & 18125, 124 & 63, 127 & 22);
         this.gy.setBounds(1498 & 31485, 3063 & 30223, 102 & 59, 114 & 31);
         this.gr.setBounds(5629 & 27390, 8711 & 24575, 63 & 98, 26 & 119);
         this.gm.setBounds(52, 515, 59, 25);
         this.gn.setVisible((boolean)(3 >> 2));
         this.go.setVisible((boolean)(3 & 4));
         this.ha.setVisible((boolean)(3 & 4));
         this.gm.ab(301);
         this.gm.setImage("sc/e/7.png");
         this.gm.setText("切换");
         this.gy.setBtn(4 ^ 5, "sc/e/6.png");
         this.hb.setText("模拟加点");
         this.gk.setBtn(5 >> 2, "sc/e/26.png");
      } else {
         this.gq.setBounds(52, 517, 98, 22);
         this.gp.setBounds(108, 517, 60, 22);
         this.gy.setBounds(151, 519, 34, 18);
         this.gr.setBounds(187, 519, 34, 18);
         this.gm.setBounds(320, 518, 17, 17);
         this.gn.setVisible((boolean)(3 >> 1));
         this.go.setVisible((boolean)(4 ^ 5));
         this.gm.ab(302);
         this.gm.setText((String)null);
         this.gm.setImage("sc/c/5");
         this.gy.setBtn(-4 >> 2, "sc/c/158");
         this.hb.setText("取消模拟");
         this.gk.setBtn(-4 >> 2, "sc/c/159");
      }
   }

   public int di(int var1, int var2, int var3, Object var4, Object var5, boolean var6) {
      if (var1 == (1 ^ 3)) {
         return this.dm + (var5 == null ? 3 & 4 : (var6 ? 3 & 5 : -1));
      } else {
         int var7 = 0;
         Iterator var9;
         Iterator var10000 = var9 = this.gs.iterator();

         while(true) {
            while(var10000.hasNext()) {
               <undefinedtype> var8;
               if ((var8 = (<undefinedtype>)var9.next()).ayt != null) {
                  if (var8 == var4) {
                     var10000 = var9;
                     continue;
                  }

                  int var10 = var8.fk;
                  if (var8 == var5) {
                     var10 += var6 ? 5 >> 2 : -1;
                  }

                  if (var10 < 0) {
                     var10000 = var9;
                     continue;
                  }

                  if (var1 == 0) {
                     if (var8.ayt.getType() == 0) {
                        if (var3 == 0) {
                           var7 += var10;
                           var10000 = var9;
                           continue;
                        }
                     } else if (var8.ayt.getType() == 5 >> 2) {
                        if (var2 == var8.ayt.getKey() && var3 == var8.ayt.getLvl()) {
                           var7 += var10;
                           var10000 = var9;
                           continue;
                        }
                     } else if (var8.ayt.getType() == 5 >> 1 && var2 == 0 && var3 == var8.ayt.getLvl()) {
                        var7 += var10;
                        var10000 = var9;
                        continue;
                     }
                  } else if (var1 == 3 >> 1) {
                     if (var8.ayt.getType() == (3 & 5)) {
                        if (var2 == var8.ayt.getKey()) {
                           var7 += var10;
                           var10000 = var9;
                           continue;
                        }
                     } else if (var8.ayt.getType() == (1 ^ 3) && var2 == 0) {
                        var7 += var10;
                        var10000 = var9;
                        continue;
                     }
                  } else if (var1 == --3 && var4 != null) {
                     if (var8.ayt.getType() != var4.ayt.getType()) {
                        var10000 = var9;
                     } else if (var8.ayt.getKey() != var4.ayt.getKey()) {
                        var10000 = var9;
                     } else if (var8.ayt.getLvl() + (3 & 5) != var4.ayt.getLvl()) {
                        var10000 = var9;
                     } else {
                        if (var8.ayt.getIndex() == var4.ayt.getIndex()) {
                           return var7 + var10;
                        }

                        var10000 = var9;
                     }
                     continue;
                  }
               }

               var10000 = var9;
            }

            return var7;
         }
      }
   }

   public void dk(int var1) {
      if (var1 != 0) {
         int var2 = (this.do - --1) / --2;
         int var3 = (var1 - (3 & 5)) / (5 >> 1);
         this.do = var1;
         if (var3 != var2) {
            this.fx("sc/c/" + ((91 & 124) + var3));
            this.gz.setImage("sc/c/" + ((127 & 93) + var3 * --3));
            this.gx.setImage("sc/c/" + ((94 & 127) + var3 * --3));
            this.gt.setImage("sc/c/" + ((127 & 95) + var3 * --3));
            this.gl[47 & 86].fw("sc/c/" + ((111 & 124) + var3));
            this.gl[79 & 55].fw("sc/c/" + ((108 & 127) + var3));
         }
      }
   }

   public JComponent dl() {
      return this.ha;
   }

   public int e() {
      return this.cy;
   }

   public void dm(Object var1, boolean var2) {
      int var5;
      if ((var5 = var1.fk + (var2 ? 5 >> 2 : -1)) >= var1.gw && var5 <= --5 && this.dm + (var2 ? 4 ^ 5 : -1) <= this.dn) {
         Iterator var3;
         Iterator var10000 = var3 = this.gs.iterator();

         while(true) {
            while(var10000.hasNext()) {
               <undefinedtype> var4;
               if ((var4 = (<undefinedtype>)var3.next()).ayt != null) {
                  if (var4.fk == 0) {
                     var10000 = var3;
                     continue;
                  }

                  if (!this.dr(var4, var1, var2)) {
                     return;
                  }
               }

               var10000 = var3;
            }

            var1.ab(var5);
            this.dm += var2 ? 4 ^ 5 : -1;
            this.p();
            return;
         }
      }
   }

   public void do(int var1) {
      for(int var10000 = var1 = var1; var10000 < this.gs.size(); var10000 = var1) {
         Object var2 = this.gs.get(var1);
         ++var1;
         ((<undefinedtype>)var2).anx((TYCModel)null);
      }

   }

   public void dp(int var1) {
      int var10002 = 2 & 5;
      this.dk(var1);
      this.dq(var10002, (String[])null);
      this.go.setText((String)this.ha.oy().get(var1 - (2 ^ 3)));
      this.ha.setVisible((boolean)(2 & 5));
   }

   public void o() {
      this.as(2 & 5);
   }

   public void dq(int var1, String[] var2) {
      this.cy = var1;
      this.gu = (boolean)(var2 != null ? 4 ^ 5 : 0);
      this.dm = 2 & 5;
      this.gc = SkillUtil.getSmIndex(this.do, this.cy == --2 ? 4 ^ 5 : 0);
      this.gv = SkillUtil.getSmIndex(this.do, this.cy == 0 ? 4 ^ 5 : 2);
      var1 = SkillUtil.getSmIndex(this.do, this.cy == 0 ? 5 >> 1 : (this.cy == 5 >> 2 ? 5 >> 2 : 0));
      this.gl[73 & 62].fw("sc/c/" + ((113 & 126) + this.gc));
      this.gl[13 & 123].fw("sc/c/" + ((123 & 116) + this.gv));
      this.gl[91 & 46].fw("sc/c/" + ((11421 & 21478) + this.gc));
      this.gl[75 & 63].fw("sc/c/" + ((25782 & 7117) + this.gv));
      this.gl[124 & 15].fw("sc/c/" + ((119 & 120) + var1));
      Class603 var5 = this.vc();
      int var3 = 5 >> 3;
      List var4 = var5.af((long)this.do);
      var3 = this.du(var3, 3 & 4, var4);
      var4 = var5.af(4294967296L | (long)this.gc);
      var3 = this.du(var3, --1, var4);
      var4 = var5.af(4294967296L | (long)this.gv);
      var3 = this.du(var3, --2, var4);
      var4 = var5.af(8589934592L | (long)(this.gv > this.gc ? this.gv << (31 & 104) | this.gc : this.gc << (26 & 109) | this.gv));
      this.do(this.du(var3, --3, var4));
      this.df(var2);
      this.p();
   }

   public boolean dr(Object var1, Object var2, boolean var3) {
      if (var1.ayt.getType() != 0 && (var1 != var2 || var3)) {
         if (var1.ayt.getType() == --1) {
            int var4 = var1.ayt.getLvl() == --1 ? 84 & 63 : 5;
            if (this.di(3 & 4, var1.ayt.getKey(), var1.ayt.getLvl() - (5 >> 2), null, var2, var3) < var4) {
               return (boolean)(3 & 4);
            }

            int var5;
            if ((var5 = this.di(3 >> 2, var1.ayt.getKey(), var1.ayt.getLvl(), null, var2, var3)) > (106 & 31)) {
               return (boolean)(5 >> 3);
            }

            if (var1.ayt.getLvl() > --1) {
               var4 = this.di(5 >> 3, var1.ayt.getKey(), var1.ayt.getLvl() - (3 >> 1), null, var2, var3);
               if (var5 > var4) {
                  return (boolean)(3 >> 2);
               }
            }

            int var6;
            if (var1.ayt.getLvl() == --5) {
               var6 = var1.fk;
               if (var1 == var2) {
                  var6 += var3 ? 5 >> 2 : -1;
               }

               var4 = var6 == 0 ? 85 & 62 : (var6 == (4 ^ 5) ? 53 & 95 : (var6 == (1 ^ 3) ? 59 & 94 : (var6 == --3 ? 63 & 95 : (var6 == --4 ? 62 & 101 : 40))));
               if (this.di(--1, var1.ayt.getKey(), var1.ayt.getLvl(), null, var2, var3) < var4) {
                  return (boolean)(3 >> 2);
               }
            }

            if (var1.ayt.getLvl() == --5 || var1.ayt.getLvl() == (23 & 110)) {
               Class20 var10000;
               if (var1.ayt.getLvl() == --5) {
                  if (this.di(2 & 5, var1.ayt.getKey() == this.gc ? this.gv : this.gc, 5, null, var2, var3) > 0) {
                     var6 = var1.fk;
                     if (var1 == var2) {
                        var6 += var3 ? 3 & 5 : -1;
                     }

                     var4 = var6 == 0 ? 119 & 127 : 120;
                     var10000 = this;
                  } else {
                     var4 = 0;
                     var10000 = this;
                  }
               } else {
                  var4 = 80;
                  var10000 = this;
               }

               if (var10000.di(2, 3 ^ 3, 3 ^ 3, null, var2, var3) < var4) {
                  return (boolean)(3 & 4);
               }
            }

            if (var1.ayt.getLvl() == --5 && this.di(3 ^ 3, var1.ayt.getKey(), --5, var1, var2, var3) > 0) {
               return false;
            }

            if (var1.ayt.getLvl() == (127 & 6) && this.di(--3, var1.ayt.getKey(), --5, var1, var2, var3) < --5) {
               return false;
            }
         } else if (var1.ayt.getType() == (1 ^ 3)) {
            if (this.di(0, this.gc, var1.ayt.getLvl(), null, var2, var3) < --5) {
               return false;
            }

            if (this.di(0, this.gv, var1.ayt.getLvl(), null, var2, var3) < --5) {
               return false;
            }

            if (this.di(0, 0, var1.ayt.getLvl(), var1, var2, var3) > 0) {
               return false;
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public void p() {
      this.gp.setText(String.valueOf(this.dn - this.dm));
      Iterator var2;
      Iterator var10000 = var2 = this.gs.iterator();

      while(var10000.hasNext()) {
         <undefinedtype> var1;
         if ((var1 = (<undefinedtype>)var2.next()).ayt == null) {
            var10000 = var2;
         } else {
            <undefinedtype> var3;
            if (var1.fk >= --5) {
               var3 = var1;
               var1.afz = (boolean)(3 >> 2);
            } else {
               var3 = var1;
               var1.afz = this.dr(var1, var1, (boolean)(2 ^ 3));
            }

            var3.s();
            var10000 = var2;
         }
      }

   }

   public <undefinedtype> ds(int var1) {
      Object var2 = var1 < this.gs.size() ? (<undefinedtype>)this.gs.get(var1) : null;
      if (var2 == null) {
         this.gs.add(var2 = new MouseListener() {
            private boolean afz;
            private int gw;
            private int fk;
            private boolean lb;
            private boolean lc;
            private JLabel rk = new JLabel();
            private TYCModel ayt;

            public void mouseEntered(MouseEvent var1) {
               this.p();
               if (this.afz || this.fk > 0) {
                  this.lb = Boolean.TRUE;
               }
            }

            public void anx(TYCModel var1) {
               <undefinedtype> var10000 = this;
               TYCModel var2 = var1;
               <undefinedtype> var3 = var10000;
               var3.gw = 3 & 4;
               var3.ayt = var2;
               if (var2 != null) {
                  var3.d();
                  var10000 = var3;
               } else {
                  var3.o();
                  var10000 = var3;
               }

               var10000.setVisible((boolean)(var2 != null ? 5 >> 2 : 0));
            }

            public void o() {
               this.q();
               this.cc();
            }

            public void p() {
               Skill var1 = this.ayt.getSkill(Class20.this.vc());
               StringBuffer var2 = new StringBuffer();
               if (var1 != null) {
                  var2.append("#W【等级】");
                  var2.append(this.fk);
                  var2.append("/5#r【境界】");
                  var2.append(this.ayt.getLvl());
                  var2.append("#r【神元】");
                  <undefinedtype> var10000;
                  if (this.ayt.getType() == 0) {
                     var10000 = this;
                     var2.append("通用");
                  } else if (this.ayt.getType() == 3 >> 1) {
                     var10000 = this;
                     var2.append("专有");
                  } else {
                     if (this.ayt.getType() == --2) {
                        var2.append("融合");
                     }

                     var10000 = this;
                  }

                  if (var10000.fk > 0) {
                     this.aoc(this.fk, var1, var2);
                  }

                  if (this.fk < --5) {
                     var2.append("#r#W下一等级");
                     this.aoc(this.fk + (3 >> 1), var1, var2);
                     if (!this.afz) {
                        this.aoa(var2);
                     }
                  }
               }

               Class270 var3 = (Class270)Class20.this.ve().e(127 & 46);
               String var10001;
               StringBuffer var10002;
               if (var1 != null) {
                  var10001 = var1.getSkillname();
                  var10002 = var2;
               } else {
                  var10001 = "";
                  var10002 = var2;
               }

               var3.rl(var10001, var10002.toString());
            }

            public void af(MouseEvent var1) {
               if (var1.getButton() == 3 >> 1) {
                  if (this.fk < --5) {
                     Class20.this.dm(this, (boolean)(2 ^ 3));
                     return;
                  }
               } else if (var1.getButton() == --3 && this.fk > 0) {
                  Class20.this.dm(this, (boolean)(3 & 4));
               }

            }

            public void mouseExited(MouseEvent var1) {
               this.ak(Boolean.FALSE);
               this.lb = Boolean.FALSE;
               Class20.this.ve().n(47 & 126);
            }

            public {
               this.rk.setOpaque((boolean)(2 ^ 3));
               this.rk.setBackground(Color.BLACK);
               this.rk.setFont(Class681.ad);
               this.rk.setHorizontalAlignment(5 >> 3);
               this.rk.setBounds(2 ^ 3, 127 & 24, 127 & 24, 61 & 79);
               this.add(this.rk);
               this.addMouseListener(this);
            }

            protected void paintComponent(Graphics var1) {
               int var10003 = 5 >> 3;
               var1.setColor(Color.BLACK);
               var1.fillRect(var10003, 3 ^ 3, this.getWidth(), this.getHeight());
               super.paintComponent(var1);
            }

            public void aoa(StringBuffer var1) {
               int var2;
               int var5;
               Iterator var6;
               <undefinedtype> var7;
               Iterator var9;
               if (this.ayt.getType() == (2 ^ 3)) {
                  var2 = this.ayt.getLvl() == --1 ? 126 & 21 : 5;
                  if ((var5 = Class20.this.dw(3 >> 2, this.ayt.getKey(), this.ayt.getLvl() - --1, null)) < var2) {
                     var1.append("#r#R前置区域(");
                     StringBuffer var10000;
                     if (this.ayt.getLvl() != 5 >> 2) {
                        var1.append(SkillUtil.getSmKey(this.ayt.getKey()));
                        var10000 = var1;
                        var1.append("系境界");
                     } else {
                        var10000 = var1;
                        var1.append("通用境界");
                     }

                     var10000.append(this.ayt.getLvl() - (2 ^ 3));
                     var1.append(")不足");
                     var1.append(var2);
                     var1.append("点");
                  }

                  if (this.ayt.getLvl() == --5) {
                     var2 = this.fk == 0 ? 29 & 118 : (this.fk == 0 ? 89 & 63 : (this.fk == 0 ? 126 & 31 : (this.fk == 0 ? 59 & 103 : 39)));
                     if ((var5 = Class20.this.dw(3 >> 1, this.ayt.getKey(), 5 >> 3, null)) < var2) {
                        var1.append("#r#R需要");
                        var1.append(SkillUtil.getSmKey(this.ayt.getKey()));
                        var1.append("系");
                        var1.append(var2);
                        var1.append("点总点数");
                     }
                  }

                  if (this.ayt.getLvl() == --5 && var5 >= var2 || this.ayt.getLvl() == (62 & 71)) {
                     var2 = this.ayt.getLvl() == --5 ? (Class20.this.dw(3 & 4, this.ayt.getKey() == Class20.this.gc ? Class20.this.gv : Class20.this.gc, 5, null) > 0 ? 127 & 119 : 0) : 80;
                     if (Class20.this.dw(1 ^ 3, 5 >> 3, 5 >> 3, null) < var2) {
                        var1.append("#r#R需要");
                        var1.append(var2);
                        var1.append("点总点数");
                     }
                  }

                  <undefinedtype> var4;
                  if (this.ayt.getLvl() == --5) {
                     Iterator var3;
                     var9 = var3 = Class20.this.gs.iterator();

                     label132:
                     while(true) {
                        while(true) {
                           if (!var9.hasNext()) {
                              break label132;
                           }

                           if ((var4 = (<undefinedtype>)var3.next()).ayt != null && var4 != this) {
                              if (!this.ayt.a(var4.ayt)) {
                                 var9 = var3;
                                 continue;
                              }

                              var1.append("#r#R与#Y");
                              var1.append(var4.ayt.getSkillName(Class20.this.vc()));
                              var1.append("#R互斥");
                           }

                           var9 = var3;
                        }
                     }
                  }

                  if (this.ayt.getLvl() == (127 & 6)) {
                     var2 = --5;
                     var4 = null;
                     var9 = var6 = Class20.this.gs.iterator();

                     <undefinedtype> var10;
                     while(true) {
                        if (!var9.hasNext()) {
                           var10 = var4;
                           break;
                        }

                        if ((var7 = (<undefinedtype>)var6.next()).ayt == null) {
                           var9 = var6;
                        } else if (var7.ayt.getType() != this.ayt.getType()) {
                           var9 = var6;
                        } else if (var7.ayt.getKey() != this.ayt.getKey()) {
                           var9 = var6;
                        } else if (var7.ayt.getLvl() + --1 != this.ayt.getLvl()) {
                           var9 = var6;
                        } else {
                           if (var7.ayt.getIndex() == this.ayt.getIndex()) {
                              var10 = var4 = var7;
                              break;
                           }

                           var9 = var6;
                        }
                     }

                     if (var10 != null && var4.fk < var2) {
                        var1.append("#r#R需要");
                        var1.append(var2);
                        var1.append("点#Y");
                        var1.append(var4.ayt.getSkillName(Class20.this.vc()));
                        return;
                     }
                  }
               } else if (this.ayt.getType() == --2) {
                  var2 = --5;
                  var5 = Class20.this.dw(5 >> 3, Class20.this.gc, this.ayt.getLvl(), null);
                  int var8 = Class20.this.dw(3 >> 2, Class20.this.gv, this.ayt.getLvl(), null);
                  if (var5 < var2 || var8 < var2) {
                     var1.append("#r#R前置区域(");
                     var1.append(SkillUtil.getSmKey(var5 < var2 ? Class20.this.gc : Class20.this.gv));
                     var1.append("系境界");
                     var1.append(this.ayt.getLvl());
                     if (var5 < var2 && var8 < var2) {
                        var1.append("和");
                        var1.append(SkillUtil.getSmKey(Class20.this.gv));
                        var1.append("系境界");
                        var1.append(this.ayt.getLvl());
                        var1.append(")不足");
                        var1.append(var2);
                        var1.append("点");
                     }
                  }

                  var9 = var6 = Class20.this.gs.iterator();

                  while(true) {
                     while(var9.hasNext()) {
                        if ((var7 = (<undefinedtype>)var6.next()).ayt != null && var7 != this) {
                           if (!this.ayt.a(var7.ayt)) {
                              var9 = var6;
                              continue;
                           }

                           var1.append("#r#R与#Y");
                           var1.append(var7.ayt.getSkillName(Class20.this.vc()));
                           var1.append("#R互斥");
                        }

                        var9 = var6;
                     }

                     return;
                  }
               }

            }

            public void mouseReleased(MouseEvent var1) {
               if (this.afz || this.fk > 0) {
                  this.ak(Boolean.FALSE);
               }
            }

            public void ak(boolean var1) {
               if (this.lc != var1) {
                  this.lc = var1;
                  this.setBounds(this.getX() + (var1 ? 4 ^ 5 : -1), this.getY() + (var1 ? 3 >> 1 : -1), this.getWidth(), this.getHeight());
               }
            }

            public void mouseClicked(MouseEvent var1) {
            }

            public void ab(int var1) {
               this.fk = var1;
            }

            public void s() {
               this.rk.setText(this.fk + "/5");
               if (!this.afz && this.fk == 0) {
                  this.rk.setVisible((boolean)(3 & 4));
                  this.cc();
               } else {
                  <undefinedtype> var10000;
                  if (this.afz) {
                     this.rk.setForeground(this.fk == this.gw ? Color.yellow : Color.green);
                     var10000 = this;
                  } else {
                     this.rk.setForeground(this.fk == --5 ? Color.yellow : Color.red);
                     var10000 = this;
                  }

                  var10000.fx("sc/c/153");
                  this.rk.setVisible((boolean)(3 & 5));
               }
            }

            public void aoc(int var1, Skill var2, StringBuffer var3) {
               var3.append("#r#G");
               SkillUtil.e(var3, var2.getRemark(), var2, var1);
            }

            public void d() {
               this.fk = 3 ^ 3;
               this.afz = (boolean)(this.ayt.getType() == 0 && this.fk != --5 ? 3 >> 1 : 0);
               this.hf(Class222.s(this.ayt.getSkillId()));
               this.s();
            }

            public void mousePressed(MouseEvent var1) {
               if (this.afz || this.fk > 0) {
                  this.ak(Boolean.TRUE);
                  if (this.lb) {
                     this.af(var1);
                  }

               }
            }
         });
         this.add((Component)var2);
      }

      return (<undefinedtype>)var2;
   }

   public void dt(int var1, int var2, int var3, int var4) {
      int var5 = 3 & 4;
      int var6 = 3 ^ 3;
      int var10000;
      if (var4 == 0) {
         var5 = (29659 & 3508) - var1 * (47 & 122) / --2;
         var6 = 77 & 126;
         var10000 = var2;
      } else if (var4 == (4 ^ 5)) {
         var5 = var3 != --2 && var3 != --4 ? (var3 == --3 ? 79 & 114 : 126) : 81;
         var6 = (117 & 126) + var3 * (127 & 54);
         var10000 = var2;
      } else if (var4 == (1 ^ 3)) {
         var5 = var3 != 5 >> 1 && var3 != --4 ? (var3 == --3 ? 90 & 103 : 126) : 81;
         var5 = (18235 & 15327) - var5 - var1 * (46 & 123);
         var6 = (119 & 124) + var3 * (118 & 63);
         var10000 = var2;
      } else {
         if (var4 == --3) {
            var5 = (12785 & 20382) - var1 * (122 & 47) / (1 ^ 3);
            var6 = (118 & 125) + var3 * (63 & 118);
         }

         var10000 = var2;
      }

      for(var10000 = var1 = var10000 - var1; var10000 < var2; var10000 = var1) {
         <undefinedtype> var7 = this.ds(var1);
         int var10001 = var5 + var7.ayt.getIndex() * (111 & 58);
         ++var1;
         var7.setBounds(var10001, var6, 38, 38);
      }

   }

   public int du(int var1, int var2, List<TYCModel> var3) {
      int var4 = -4 >> 2;
      int var5 = 2 & 5;
      Iterator var6;
      Iterator var10000 = var6 = var3.iterator();

      while(true) {
         while(var10000.hasNext()) {
            TYCModel var7 = (TYCModel)var6.next();
            this.ds(var1).anx(var7);
            ++var1;
            if (var4 != -4 >> 2 && var4 == var7.getLvl()) {
               ++var5;
               var10000 = var6;
            } else {
               if (var4 != -4 >> 2) {
                  this.dt(var5, var1 - (3 & 5), var4, var2);
               }

               var4 = var7.getLvl();
               var5 = 3 & 5;
               var10000 = var6;
            }
         }

         this.dt(var5, var1, var4, var2);
         return var1;
      }
   }

   public boolean bl() {
      return this.gu;
   }

   public void as(int var1) {
      if (var1 == -4 >> 2) {
         var1 = this.gw == 0 ? --1 : 0;
      }

      if (this.gw != var1) {
         this.dh(var1);
      }

      int var10002 = 3 & 4;
      this.gw = var1;
      this.dm = var10002;
      int var10001;
      if (this.gw == 0) {
         RoleData var2;
         this.y(ExpUtil.getTSP((var2 = this.vd()).getLoginResult().getExtraPointInt("T")));
         RoleData var4 = var2;
         String[] var3 = var2.getPrivateData().getSkill("N");
         this.dk(SkillUtil.getSepciesIndex(var4.getLoginResult().getSpecies_id()));
         String[] var5;
         if (var3 != null) {
            var10001 = Integer.parseInt(var3[3 & 4]);
            var5 = var3;
         } else {
            var10001 = 0;
            var5 = var3;
         }

         this.dq(var10001, var5);
      } else {
         var10001 = 3 & 5;
         this.y(121 & 126);
         this.dp(var10001);
      }
   }

   public void s() {
      if (this.gw == (3 & 5)) {
         this.dq(this.cy, (String[])null);
      } else if (this.dm != 0) {
         long var1 = (long)(this.dm * (this.uw().n(5 >> 1, 124 & 15) ? 200000 : 5000000));
         this.aej.aal(new ConfirmBean(31 & 111, String.valueOf(var1), "#W你确定要花费#R" + var1 / 10000L + "W#W银两,重置天演策加点吗?"));
      }
   }

   public Class20(GameView var1) {
      int var10000 = 91 & 46;
      int var10002 = -4 >> 2;
      int var10005 = 2 & 5;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10005, 3 >> 2, 23423 & 10120, 30320 & 3007, Class345.aei);
      this.ad(new Class116(57 & 118, 127 & 63, 63 & 95, 53 & 126));
      this.gw = var10002;
      String[] var4 = new String[var10000];
      boolean var7 = true;
      var4[5 >> 3] = "男人";
      var4[3 >> 1] = "女人";
      var4[5 >> 1] = "男魔";
      var4[--3] = "女魔";
      var4[--4] = "男仙";
      var4[--5] = "女仙";
      var4[94 & 39] = "男鬼";
      var4[71 & 63] = "女鬼";
      var4[78 & 57] = "男龙";
      var4[61 & 75] = "女龙";
      String[] var2 = var4;
      int var10001 = 127 & 13;
      this.ha = new Class151(91 & 100, 127 & 120, "sc/c/157", var2);
      this.add(this.ha);
      this.ha.oz().addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent var1) {
            int var2;
            if ((var2 = Class20.this.ha.oz().getSelectedIndex()) != -4 >> 2) {
               Class20.this.dp(var2 + (3 >> 1));
            }
         }
      });
      this.gm = new Class70("sc/e/7.png", 2 ^ 3, 22447 & 10621, Class681.ak, Class681.c, "切换", this);
      this.add(this.gm);
      this.gy = new Class70("sc/e/6.png", 3 >> 1, 29119 & 3951, Class681.bm, (Color[])null, "兑换", this);
      this.gy.setOffsetTexts(Class681.am);
      this.add(this.gy);
      this.gr = new Class70("sc/e/6.png", 3 >> 1, 304, Class681.bm, (Color[])null, "洗点", this);
      this.gr.setOffsetTexts(Class681.am);
      this.add(this.gr);
      this.hb = new Class70("sc/e/26.png", 2 ^ 3, 305, Class681.ak, Class681.c, "模拟加点", this);
      this.add(this.hb);
      this.gk = new Class70("sc/e/26.png", 5 >> 2, 306, Class681.ak, Class681.c, "确认加点", this);
      this.add(this.gk);
      this.gp = new JLabel();
      this.gp.setForeground(Color.white);
      this.gp.setFont(Class681.ce);
      this.add(this.gp);
      this.gq = new Class436("sc/c/155");
      this.add(this.gq);
      this.go = new JLabel();
      this.go.setForeground(Color.white);
      this.go.setFont(Class681.ce);
      this.add(this.go);
      this.gn = new Class436("sc/c/156");
      this.add(this.gn);
      this.ha.setBounds(272, 397, 64, 120);
      this.go.setBounds(274, 517, 64, 20);
      this.gn.setBounds(235, 517, 104, 20);
      this.hb.setBounds(540, 515, 99, 25);
      this.gk.setBounds(645, 515, 99, 25);
      this.gz = new Class70((String)null, 3 & 5, 307, this);
      this.gx = new Class70((String)null, 3 & 5, 308, this);
      this.gt = new Class70((String)null, -4 >> 2, 309, this);
      this.gz.setBounds(329, 372, 73, 92);
      this.gx.setBounds(393, 372, 73, 92);
      this.gt.setBounds(350, 435, 99, 72);
      this.add(this.gz);
      this.add(this.gx);
      this.add(this.gt);
      Class436[] var6 = new Class436[var10001];
      boolean var10003 = true;
      this.gl = var6;

      int var3;
      for(var10000 = var3 = this.gl.length - (5 >> 2); var10000 >= 0; var10000 = var3) {
         this.gl[var3] = new Class436(var3 < 6 ? "sc/c/154" : null);
         Class20 var5;
         if (var3 == 0) {
            var5 = this;
            this.gl[var3].setBounds(141, 425, 11, 14);
         } else if (var3 == (3 & 5)) {
            var5 = this;
            this.gl[var3].setBounds(183, 425, 11, 14);
         } else if (var3 == 5 >> 1) {
            var5 = this;
            this.gl[var3].setBounds(225, 425, 11, 14);
         } else if (var3 == --3) {
            var5 = this;
            this.gl[var3].setBounds(557, 425, 11, 14);
         } else if (var3 == --4) {
            var5 = this;
            this.gl[var3].setBounds(599, 425, 11, 14);
         } else if (var3 == --5) {
            var5 = this;
            this.gl[var3].setBounds(641, 425, 11, 14);
         } else if (var3 == 6) {
            var5 = this;
            this.gl[var3].setBounds(164, 110, 95, 60);
         } else if (var3 == 7) {
            var5 = this;
            this.gl[var3].setBounds(537, 110, 95, 60);
         } else if (var3 == 8) {
            var5 = this;
            this.gl[var3].setBounds(198, 123, 33, 33);
         } else if (var3 == 9) {
            var5 = this;
            this.gl[var3].setBounds(570, 123, 33, 33);
         } else if (var3 == 10) {
            var5 = this;
            this.gl[var3].setBounds(343, 445, 33, 33);
         } else if (var3 == 11) {
            var5 = this;
            this.gl[var3].setBounds(420, 445, 33, 33);
         } else {
            if (var3 == 12) {
               this.gl[var3].setBounds(382, 384, 33, 33);
            }

            var5 = this;
         }

         var5.add(this.gl[var3--]);
      }

      this.gs = new ArrayList();
   }

   public void df(String[] var1) {
      if (var1 != null) {
         boolean var4 = false;

         int var5;
         for(int var10000 = var5 = 5 >> 2; var10000 < var1.length; var10000 = var5) {
            int var9;
            int var2 = (var9 = Integer.parseInt(var1[var5])) >> (59 & 77) & 111 & 23;
            int var3 = 5 >> 3;
            int var6 = var9 >> (62 & 71) & 87 & 47;
            int var7 = var9 >> --3 & 55 & 79;
            Class20 var10;
            if (var2 == 0) {
               var2 = 2 & 5;
               var10 = this;
               var3 = this.do;
            } else if (var2 == --1) {
               var2 = 5 >> 2;
               var10 = this;
               var3 = this.gc;
            } else if (var2 == --2) {
               var2 = 2 ^ 3;
               var10 = this;
               var3 = this.gv;
            } else {
               var2 = 2;
               var3 = this.gv > this.gc ? this.gv << (59 & 76) | this.gc : this.gc << (73 & 62) | this.gv;
               var10 = this;
            }

            <undefinedtype> var8 = var10.dv(var2, var3, var6, var7);
            var8.ab(var9 & 111 & 23);
            var8.gw = var8.fk;
            ++var5;
            this.dm += var8.fk;
         }

      }
   }

   public void y(int var1) {
      this.dn = var1;
      this.gp.setText(String.valueOf(var1 - this.dm));
   }

   public void d() {
      if (this.gw == 5 >> 2) {
         this.dl().setVisible((boolean)(4 ^ 5));
      }

   }

   public <undefinedtype> dv(int var1, int var2, int var3, int var4) {
      Iterator var6;
      Iterator var10000 = var6 = this.gs.iterator();

      while(var10000.hasNext()) {
         <undefinedtype> var5;
         if (!(var5 = (<undefinedtype>)var6.next()).isVisible()) {
            var10000 = var6;
         } else if (var5.ayt.getType() != var1) {
            var10000 = var6;
         } else if (var5.ayt.getKey() != var2) {
            var10000 = var6;
         } else if (var5.ayt.getLvl() != var3) {
            var10000 = var6;
         } else {
            if (var5.ayt.getIndex() == var4) {
               return var5;
            }

            var10000 = var6;
         }
      }

      return null;
   }

   public int dw(int var1, int var2, int var3, Object var4) {
      return this.di(var1, var2, var3, var4, null, (boolean)(3 & 5));
   }
}
