package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Buff;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class234 extends Class345 {
   private JComponent fa;
   private int gv;
   private JLabel ik;
   private Class436[] il;
   private RichLabel aj;
   private JScrollPane fl;
   private List<null> im;
   private <undefinedtype>[] in;
   private <undefinedtype> io;
   private static Class604 ip;

   public void ep(Object var1, int var2) {
      if (var1.px[3 >> 2].tp() == (125 & 23)) {
         if (this.io == null) {
            this.io = new MouseListener() {
               private <undefinedtype>[] auq;
               private int ay;
               private RichLabel bv;
               private long lp;
               private Class436 bl;
               private JLabel[] u;

               public void mouseReleased(MouseEvent var1) {
               }

            
               static int ajo(Object var0) {
                  return var0.ay;
               }

               public {
                  int var10001 = --2;
                  int var10003 = 5 >> 3;
                  int var10005 = 1279 & 31705;
                  this.setBounds(var10005, 52 & 107, 26486 & 6621, 14332 & 18791);
                  this.setVisible((boolean)var10003);
                  JLabel[] var3 = new JLabel[var10001];
                  boolean var5 = true;
                  this.u = var3;

                  int var10000;
                  int var2;
                  for(var10000 = var2 = 3 >> 2; var10000 < this.u.length; var10000 = var2) {
                     this.u[var2] = Class133.b(58 & 109, 95 & 52, 7139 & 25886, 81 & 63, Color.black, Class681.ak);
                     this.u[var2].setText(var2 == 0 ? "第 出场召唤兽的锦囊" : (var2 == (4 ^ 5) ? "1" : ""));
                     this.u[var2].setHorizontalAlignment(3 ^ 3);
                     this.add(this.u[var2]);
                     if (var2 == (3 & 5)) {
                        this.u[var2].setForeground(Color.red);
                        this.u[var2].setBounds(106 & 119, 92 & 55, 22 & 127, 57 & 87);
                     }

                     ++var2;
                  }

                  var10001 = 63 & 89;
                  this.bv = new RichLabel("", Class681.q);
                  this.bv.setTextSize("#c000000温馨提示：召唤兽的两个锦囊会同时生效", 28536 & 4511);
                  this.bv.setBounds(36 & 127, 21817 & 11263, this.bv.getWidth(), this.bv.getHeight());
                  this.add(this.bv);
                  this.bl = new Class436();
                  this.bl.eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 & 4)));
                  this.bl.setBounds(40, 45, 258, 258);
                  this.add(this.bl);
                  <undefinedtype>[] var4 = new <undefinedtype>[var10001];
                  var5 = true;
                  this.auq = var4;

                  for(var10000 = var2 = 5 >> 3; var10000 < this.auq.length; var10000 = var2) {
                     this.auq[var2] = new Class44(Class234.this) {
                        private JLabel d;
                        private boolean lc;
                        // $FF: synthetic field
                        final Class234 adi;

                        public void up(Buff var1) {
                           int var10001;
                           Buff var10002;
                           if (var1 != null) {
                              var10001 = 49 & 95;
                              var10002 = var1;
                           } else {
                              var10001 = 0;
                              var10002 = var1;
                           }

                           this.c(var10001, var10002);
                           this.setVisible((boolean)(--1));
                           this.d.setText(var1 != null ? var1.getbName() : null);
                           this.lc = var1 != null ? this.adi.vd().x(var1.getbId()) : false;
                        }

                        protected void paintComponent(Graphics var1) {
                           super.paintComponent(var1);
                           if (this.lc) {
                              var1.drawImage(Class222.i, 105 & 55, 2 & 5, 22 & 121, 22 & 121, (ImageObserver)null);
                           }

                        }

                        public void af(MouseEvent var1) {
                           Buff var3;
                           if ((var3 = (Buff)this.hr()) != null) {
                              RolePet var2;
                              if ((var2 = this.adi.vd().getRolePet(null.ajs(Class234.es(this.adi)))) != null) {
                                 <undefinedtype> var10000;
                                 if (var3.getbId() == var2.getBb1()) {
                                    var10000 = this;
                                    var2.setBb1(2 & 5);
                                 } else if (var3.getbId() == var2.getBb2()) {
                                    var10000 = this;
                                    var2.setBb2(2 & 5);
                                 } else {
                                    if (this.adi.vd().x(var3.getbId())) {
                                       return;
                                    }

                                    if (null.ajo(Class234.es(this.adi)) == 0) {
                                       var2.setBb1(var3.getbId());
                                       var10000 = this;
                                    } else {
                                       var2.setBb2(var3.getbId());
                                       var10000 = this;
                                    }
                                 }

                                 Class234.es(var10000.adi).setVisible((boolean)(3 ^ 3));
                                 this.adi.vd().ax();
                                 this.adi.y(Class234.er(this.adi));
                              }
                           }
                        }

                        public {
                           super((this.adi = var1).gk());
                           this.fw("sc/d/18.png");
                           this.d = new JLabel();
                           this.d.setBounds(5 >> 3, 93 & 63, 123 & 53, 23 & 124);
                           this.d.setFont(Class681.ce);
                           this.d.setForeground(Color.green);
                           this.d.setHorizontalAlignment(--4);
                           this.add(this.d);
                        }
                     };
                     this.auq[var2].setBounds(41 + var2 % --5 * 51, 47 + var2 / --5 * 51, 49, 49);
                     this.add(this.auq[var2++]);
                  }

                  this.addMouseListener(this);
               }

               public void mouseClicked(MouseEvent var1) {
               }

               protected void paintComponent(Graphics var1) {
                  super.paintComponent(var1);
                  if (Class234.ip == null) {
                     Class234.ip = Class511.q("sc/d/36.png", 126 & 21, 126 & 21, 126 & 21, 126 & 21, (boolean)(3 & 4));
                  }

                  Class234.ip.g(var1, this.getWidth(), this.getHeight());
               }

               public void mousePressed(MouseEvent var1) {
                  if (var1.isMetaDown()) {
                     Class234.this.io.setVisible((boolean)(3 ^ 3));
                  }

               }

               public void mouseEntered(MouseEvent var1) {
               }

            
               static long ajs(Object var0) {
                  return var0.lp;
               }

               public void mouseExited(MouseEvent var1) {
               }
            };
            this.add(this.io, 5 >> 3);
         }

         this.io.lp = var1.px[3 & 4].gl();
         this.io.ay = var2;
         Map var5 = this.vc().by().getBuffMap();
         int var3 = 5 >> 3;
         Iterator var4;
         Iterator var10000 = var4 = var5.values().iterator();

         int var8;
         while(true) {
            if (!var10000.hasNext()) {
               var8 = var3;
               break;
            }

            Buff var6;
            if ((var6 = (Buff)var4.next()).getbType() != (1 ^ 3)) {
               var10000 = var4;
            } else {
               this.io.auq[var3++].up(var6);
               if (var3 == (89 & 63)) {
                  var8 = var3;
                  break;
               }

               var10000 = var4;
            }
         }

         var2 = var8;

         for(var8 = var2; var8 < this.io.auq.length; var8 = var2) {
            this.io.auq[var2++].up((Buff)null);
         }

         this.io.u[4 ^ 5].setText(String.valueOf(var1.ay + (2 ^ 3)));
         this.io.setVisible((boolean)(--1));
      }
   }


   static int er(Class234 var0) {
      return var0.gv;
   }

   public void et(Object var1, boolean var2) {
      RoleData var3;
      RolePet var4;
      if ((var4 = (var3 = this.vd()).getRolePet(var1.it.gl())) != null) {
         RoleData var10000;
         if (var2) {
            if (var4.getBb() > 0) {
               return;
            }

            int var5;
            if ((var5 = var3.getBBRolePet()) == 0) {
               return;
            }

            var4.a(var5);
            var10000 = var3;
         } else {
            if (var4.getBb() == 0) {
               return;
            }

            var4.a(3 ^ 3);
            var10000 = var3;
         }

         var10000.ax();
         this.y(this.gv);
         Class653 var6;
         if ((var6 = (Class653)this.ve().m(19639 & 13263)) != null) {
            var6.s();
         }

      }
   }

   public Class234(GameView var1) {
      int var10001 = --4;
      int var10006 = 2295 & 30686;
      int var10010 = -4 >> 2;
      super(29626 & 3277, 1 ^ 3, Class345.aef, var1);
      this.va(var10010, 3 & 4, 9947 & 23412, 26557 & 6647, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 116 & 79, 116 & 79, 116 & 79, 116 & 79, (boolean)(3 ^ 3)), "设置参战");
      this.ik = Class133.c(var10006, 95 & 61, 25558 & 7549, 61 & 87, 5 >> 3, Color.white, Class681.ak);
      this.ik.setText("设置参战召唤兽");
      this.add(this.ik);
      this.aj = new RichLabel("", Class681.ab);
      this.aj.setTextSize("#cFF0000左键#c000000点击出场，#cFF0000右键#c000000点击取消出场；可选1个召唤兽作为支援上阵。", 21495 & 11772);
      this.aj.setBounds(51 & 126, 11775 & 21378, this.aj.getWidth(), this.aj.getHeight());
      this.add(this.aj);
      <undefinedtype>[] var4 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.in = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < this.in.length; var10000 = var2) {
         this.in[var2] = new JComponent(var2) {
            private int ay;
            private <undefinedtype> azn;
            private Class44[] px;
            private JLabel[] u;

            public void w(RolePet var1) {
               RoleSummoning var4 = var1 != null ? var1.getPet() : null;
               Buff var3 = var1 != null && var1.getBb1() != 0 ? Class234.this.vc().p(var1.getBb1()) : null;
               Buff var2 = var1 != null && var1.getBb2() != 0 ? Class234.this.vc().p(var1.getBb2()) : null;
               Class44 var10000 = this.px[3 & 4];
               int var10001;
               RoleSummoning var10002;
               if (var4 != null) {
                  var10001 = 95 & 53;
                  var10002 = var4;
               } else {
                  var10001 = 0;
                  var10002 = var4;
               }

               var10000.c(var10001, var10002);
               var10000 = this.px[3 >> 1];
               Buff var7;
               if (var3 != null) {
                  var10001 = 127 & 17;
                  var7 = var3;
               } else {
                  var10001 = 0;
                  var7 = var3;
               }

               var10000.c(var10001, var7);
               var10000 = this.px[--2];
               if (var2 != null) {
                  var10001 = 55 & 89;
                  var7 = var2;
               } else {
                  var10001 = 0;
                  var7 = var2;
               }

               var10000.c(var10001, var7);

               int var5;
               for(int var6 = var5 = 3 >> 2; var6 < this.px.length; var6 = var5) {
                  this.px[var5++].setVisible((boolean)(--1));
               }

               this.u[--1].setText(var3 != null ? var3.getbName() : "锦囊1");
               this.u[5 >> 1].setText(var2 != null ? var2.getbName() : "锦囊2");
               this.u[--3].setVisible((boolean)(var3 == null ? 4 ^ 5 : 0));
               this.u[--4].setVisible((boolean)(var3 == null ? --1 : 0));
            }

            public {
               int var10001 = --5;
               this.ay = var2;
               this.azn = this;
               JLabel[] var5 = new JLabel[var10001];
               boolean var10003 = true;
               this.u = var5;

               int var10000;
               int var3;
               <undefinedtype> var4;
               for(var10000 = var3 = 2 & 5; var10000 < this.u.length; var10000 = var3) {
                  this.u[var3] = Class133.b(2 & 5, 2 & 5, 2 & 5, 2 & 5, Color.black, var3 == 0 ? Class681.ak : Class681.ab);
                  if (var3 == 0) {
                     this.u[var3].setText(var2 == 0 ? "第1出场" : (var2 == (2 ^ 3) ? "第2出场" : (var2 == --2 ? "第3出场" : "支援上阵")));
                     var4 = this;
                     this.u[var3].setBounds(3 ^ 3, 3 ^ 3, 397 & 32510, 31 & 113);
                  } else if (var3 != --1 && var3 != --2) {
                     label97: {
                        if (var3 == --3 || var3 == --4) {
                           this.u[var3].setForeground(Color.gray);
                           this.u[var3].setHorizontalAlignment(3 >> 2);
                           this.u[var3].setText(var3 == --3 ? "添 加" : "锦 囊");
                           if (var3 == --3) {
                              var4 = this;
                              this.u[var3].setBounds(126 & 63, 125 & 38, 107 & 61, 62 & 81);
                              break label97;
                           }

                           this.u[var3].setBounds(62 & 127, 61 & 122, 41, 16);
                        }

                        var4 = this;
                     }
                  } else {
                     this.u[var3].setHorizontalAlignment(5 >> 3);
                     this.u[var3].setText("锦囊" + var3);
                     if (var3 == 5 >> 2) {
                        var4 = this;
                        this.u[var3].setBounds(62 & 127, 19 & 125, 45 & 123, 92 & 51);
                     } else {
                        var4 = this;
                        this.u[var3].setBounds(127 & 102, 87 & 57, 45 & 123, 18 & 125);
                     }
                  }

                  var4.add(this.u[var3++]);
               }

               Class44[] var6 = new Class44[--3];
               var10003 = true;
               this.px = var6;

               for(var10000 = var3 = 2 & 5; var10000 < this.px.length; var10000 = var3) {
                  if (var3 == 0) {
                     var4 = this;
                     this.px[var3] = new Class44(Class234.this.gk());
                     this.px[var3].ad(Class44.aqy);
                     this.px[var3].fw("sc/d/4.png");
                     this.px[var3].setBounds(--4, 18, 59, 57);
                  } else {
                     if (var3 == --1) {
                        var4 = this;
                        this.px[var3] = new Class44(Class234.this.gk()) {
                           public void af(MouseEvent var1) {
                              Class234.this.ep(azn, 5 >> 3);
                           }
                        };
                     } else {
                        var4 = this;
                        this.px[var3] = new Class44(Class234.this.gk()) {
                           public void af(MouseEvent var1) {
                              Class234.this.ep(azn, 5 >> 2);
                           }
                        };
                     }

                     var4.px[var3].ad(Class44.la);
                     this.px[var3].eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
                     if (var3 == 3 >> 1) {
                        var4 = this;
                        this.px[var3].setBounds(62, 34, 41, 41);
                     } else {
                        var4 = this;
                        this.px[var3].setBounds(102, 34, 41, 41);
                     }
                  }

                  var4.add(this.px[var3++]);
               }

            }
         };
         this.in[var2].setBounds(125 & 58, (43 & 126) + (95 & 117) * var2, 5851 & 27061, 109 & 94);
         this.add(this.in[var2++]);
      }

      var10001 = --3;
      this.im = new ArrayList();
      this.fa = new JComponent() {
      };
      this.fl = Class133.f(215, 49, 338, 335, this.fa, -4 >> 2);
      this.add(this.fl);
      Class436[] var5 = new Class436[var10001];
      var10003 = true;
      this.il = var5;

      for(var10000 = var2 = 2 & 5; var10000 < this.il.length; var10000 = var2) {
         this.il[var2] = new Class436();
         Class234 var3;
         if (var2 == 0) {
            var3 = this;
            this.il[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(2 & 5)));
            this.il[var2].setBounds(47, 29, 166, 356);
         } else if (var2 == --1) {
            var3 = this;
            this.il[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(2 & 5)));
            this.il[var2].setBounds(214, 29, 340, 21);
         } else {
            if (var2 == 5 >> 1) {
               this.il[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
               this.il[var2].setBounds(214, 29, 340, 356);
            }

            var3 = this;
         }

         var3.add(this.il[var2++]);
      }

   }

   public void eu(RolePet var1, int var2) {
      Object var3 = var2 < this.im.size() ? (<undefinedtype>)this.im.get(var2) : null;
      if (var3 == null) {
         var3 = new MouseListener() {
            private Class44 akj;
            private JLabel at;
            private JLabel bd;
            private JLabel d;
            private Class44 ae;
            private Class44 it = new Class44(Class234.this.gk());

            public void mousePressed(MouseEvent var1) {
               if (var1.getButton() == --1) {
                  Class234.this.et(this, (boolean)(2 ^ 3));
               } else {
                  if (var1.getButton() == --3) {
                     Class234.this.et(this, (boolean)(5 >> 3));
                  }

               }
            }

            public {
               this.it.ad(Class44.aqv);
               this.it.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
               this.it.setBounds(--1, --1, 111 & 60, 111 & 60);
               this.akj = new Class44(Class234.this.gk());
               this.akj.setBounds(127 & 42, 27 & 118, 27 & 118, 27 & 118);
               this.ae = new Class44(Class234.this.gk());
               this.ae.setBounds(126 & 63, 51 & 94, 51 & 94, 51 & 94);
               this.d = new JLabel();
               this.bd = new JLabel();
               this.at = new JLabel();
               this.d.setBounds(114 & 95, 22 & 123, 126 & 121, 124 & 23);
               this.bd.setBounds(19946 & 13023, 83 & 62, 117 & 90, 23 & 124);
               this.at.setBounds(23323 & 9726, 119 & 26, 54 & 123, 20);
               this.d.setFont(Class681.ce);
               this.bd.setFont(Class681.ce);
               this.at.setFont(Class681.ce);
               this.d.setHorizontalAlignment(3 ^ 3);
               this.bd.setHorizontalAlignment(3 & 4);
               this.at.setHorizontalAlignment(3 >> 2);
               this.add(this.it);
               this.add(this.akj);
               this.add(this.ae);
               this.add(this.d);
               this.add(this.bd);
               this.add(this.at);
               this.addMouseListener(this);
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void w(RolePet var1) {
               RoleSummoning var2 = var1 != null ? var1.getPet() : null;
               <undefinedtype> var5;
               if (var2 != null) {
                  this.it.c(61 & 87, var2);
                  Buff var3 = var1.getBb1() != 0 ? Class234.this.vc().p(var1.getBb1()) : null;
                  Class44 var10000 = this.akj;
                  int var10001;
                  Buff var10002;
                  if (var3 != null) {
                     var10001 = 115 & 29;
                     var10002 = var3;
                  } else {
                     var10001 = 0;
                     var10002 = var3;
                  }

                  var10000.c(var10001, var10002);
                  var3 = var1.getBb2() != 0 ? Class234.this.vc().p(var1.getBb2()) : null;
                  var10000 = this.ae;
                  if (var3 != null) {
                     var10001 = 51 & 93;
                     var10002 = var3;
                  } else {
                     var10001 = 0;
                     var10002 = var3;
                  }

                  var10000.c(var10001, var10002);
                  var5 = this;
               } else {
                  var5 = this;
                  this.it.c(3 & 4, (Object)null);
                  this.it.setVisible((boolean)(--1));
                  this.akj.c(3 & 4, (Object)null);
                  this.ae.c(3 >> 2, (Object)null);
               }

               var5.d.setText(var2 != null ? var2.getSummoningname() : null);
               this.bd.setText(var2 != null ? Class224.t(var2.getGrade()) : null);
               this.at.setText(var1 != null && var1.getBb() > 0 ? String.valueOf(var1.getBb()) : null);
               Color var4 = var1 != null && var1.getBb() > 0 ? Color.green : Color.white;
               this.d.setForeground(var4);
               this.bd.setForeground(var4);
               this.at.setForeground(var4);
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
            }
         };
         this.fa.add((Component)var3);
         this.im.add(var3);
      }

      int var10001 = 2 ^ 3;
      int var10003 = 2 & 5;
      ((<undefinedtype>)var3).w(var1);
      ((<undefinedtype>)var3).setBounds(var10003, (111 & 61) * var2, 4081 & 29006, 63 & 109);
      ((<undefinedtype>)var3).setVisible((boolean)var10001);
   }

   public void y(int var1) {
      this.gv = var1;
      RoleData var6;
      List var4 = (var6 = this.vd()).pets;
      int var5 = 5 >> 3;

      int var10000;
      int var2;
      RolePet var3;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.in.length; var10000 = var2) {
         var3 = var6.getBBRolePet(var2 + --1);
         this.in[var2].w(var3);
         if (var3 != null) {
            this.eu(var3, var5++);
         }

         ++var2;
      }

      for(var10000 = var2 = 3 >> 2; var10000 < var4.size(); var10000 = var2) {
         if ((var3 = (RolePet)var4.get(var2)).getBb() == 0) {
            this.eu(var3, var5++);
         }

         ++var2;
      }

      for(var10000 = var2 = var5; var10000 < this.im.size(); var10000 = var2) {
         <undefinedtype> var7 = (<undefinedtype>)this.im.get(var2);
         int var10001 = 2 & 5;
         ++var2;
         var7.w((RolePet)null);
         var7.setVisible((boolean)var10001);
      }

      this.fa.setPreferredSize(new Dimension(22486 & 10621, (63 & 109) * var5));
      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }
}
