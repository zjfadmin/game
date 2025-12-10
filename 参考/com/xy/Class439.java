package com.xy;

import com.xy.bean.FMBean;
import com.xy.bean.FMRole;
import com.xy.bean.LoginResult;
import com.xy.readbean.AllFM;
import com.xy.readbean.FM;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTable.DropLocation;
import javax.swing.table.DefaultTableCellRenderer;

public class Class439 extends Class345 {
   private <undefinedtype> ban;
   private Class436[] pv;
   private <undefinedtype> bao;
   private int bn;
   private Class322[] adt;
   private <undefinedtype> sm;

   public void do(int var1) {
      Object var2;
      if ((var2 = (List)this.vc().bz().getNpcShopMap().get("3001")) == null) {
         var2 = new ArrayList();
      }

      this.sm.cy = --1 + (((List)var2).size() - --1) / (28 & 107);
      if (this.sm.cy <= 0) {
         this.sm.cy = 3 & 5;
      }

      if (var1 > this.sm.cy) {
         var1 = this.sm.cy;
      }

      if (var1 <= 0) {
         var1 = 5 >> 2;
      }

      this.sm.m = var1;

      int var3;
      for(int var10000 = var3 = (this.sm.m - (3 & 5)) * (120 & 15); var10000 < this.sm.m * (58 & 77); var10000 = var3) {
         Shop var4 = var3 < ((List)var2).size() ? (Shop)((List)var2).get(var3) : null;
         var1 = var3 % (29 & 106);
         Class254[] var5 = this.sm.vn;
         ++var3;
         var5[var1].rz(var4);
      }

      this.sm.vh.setText(this.sm.m + "/" + this.sm.cy);
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(--1);
   }

   public void dp(int var1) {
      if (this.sm != null) {
         this.sm.vc = var1;

         int var2;
         for(int var10000 = var2 = 5 >> 3; var10000 < this.sm.kn.length; var10000 = var2) {
            this.sm.kn[var2].setKeep((boolean)(var2 == this.sm.vc ? 2 ^ 3 : 0));
            ++var2;
         }

         if (var1 == 0) {
            this.do(5 >> 2);
            this.sm.ol.cc();
            this.sm.va.setVisible((boolean)(3 & 5));
            this.sm.ve.setVisible((boolean)(3 & 4));
         } else {
            if (var1 == (4 ^ 5)) {
               this.sm.vi[3 ^ 3].cc();
               this.sm.vi[--1].cc();
               this.sm.vm[3 >> 2].setText("0");
               this.sm.vm[5 >> 2].setText("0");
               this.sm.ve.setVisible((boolean)(3 & 5));
               this.sm.va.setVisible((boolean)(3 ^ 3));
            }

         }
      }
   }

   public void as(int var1) {
      if (var1 == (25070 & 7861)) {
         String var5 = Agreement.getSendTextAES("fm", "R");
         this.uw().d(var5);
      } else if (var1 == (11263 & 21671)) {
         this.do(4 ^ 5);
      } else if (var1 == (20206 & 12729)) {
         this.do(this.sm.cy);
      } else if (var1 == (8445 & 24491)) {
         this.do(this.sm.m - (3 & 5));
      } else if (var1 == (21739 & 11198)) {
         this.do(this.sm.m + (3 & 5));
      } else {
         long var2;
         String var4;
         if (var1 == (20415 & 12523)) {
            if ((var2 = this.sm.vl[2 & 5].gl()) <= 0L) {
               this.aej.f("输入你要兑换的数量");
            } else {
               var4 = Agreement.getSendTextAES("fm", "D1" + var2);
               this.uw().d(var4);
            }
         } else if (var1 == (18926 & 14013)) {
            if ((var2 = this.sm.vl[4 ^ 5].gl()) <= 0L) {
               this.aej.f("输入你要兑换的数量");
            } else {
               var4 = Agreement.getSendTextAES("fm", "D2" + var2);
               this.uw().d(var4);
            }
         } else if (var1 == (9727 & 23351)) {
            this.ban.ab(this.ban.gv - --1);
         } else {
            if (var1 == (16189 & 16890)) {
               this.ban.ab(this.ban.gv + --1);
            }

         }
      }
   }

   public Long x(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         long var4 = this.vd().getMoney(this.sm.rr);
         return var1 > var4 ? var4 : null;
      }
   }

   public void z(long var1, JTextField var3) {
      if (var3 == this.sm.vm[3 ^ 3]) {
         LoginResult var10000 = this.vd().getLoginResult();
         int var4 = var10000.getTurnAround();
         int var5 = Class224.d(var10000.getGrade());
         long var6 = var4 <= --3 ? this.vc().ac(var4, var5) : 6000000000L;
         var6 = (long)((double)var6 * 0.002D);
         Class681.j(this.sm.vg[3 & 4], var6 * var1);
      } else {
         if (var3 == this.sm.vm[4 ^ 5]) {
            Class681.j(this.sm.vg[--1], 20L * var1);
         }

      }
   }

   public void q() {
      this.y(5 >> 3);
      super.q();
   }

   public void y(int var1) {
      if (var1 == (3 & 5)) {
         String var2 = Agreement.getSendTextAES("fm", "");
         this.uw().d(var2);
      } else {
         this.ark(var1, (FMBean)null);
      }
   }

   public boolean t() {
      if (this.ban != null) {
         this.ban.sd = null;
      }

      return super.t();
   }

   public void ark(int var1, FMBean var2) {
      int var10000 = 3 & 4;
      this.bn = var1;

      for(int var3 = var10000; var10000 < this.adt.length; var10000 = var3) {
         this.adt[var3].setKeep((boolean)(var3 == this.bn ? 2 ^ 3 : 0));
         ++var3;
      }

      if (var1 == 0) {
         if (this.ban == null) {
            this.add(this.ban = new JComponent() {
               private Class322[] ayk;
               private JScrollPane w;
               private int gv;
               private FM ayl;
               private RichLabel z;
               private JLabel[] iv;
               private Class436[] pv;
               private Class19 sd;
               private Class245[] nr;
               private List<Class44> ez;

               public void ann(FM var1) {
                  FM var10001 = this.ayl = var1;
                  this.iv[3 ^ 3].setText("<html>" + var1.getFmName() + "</html>");
                  this.iv[--1].setText(String.valueOf(var1.getFmLvl()));
                  this.nr[4 ^ 5].setText(String.valueOf(var1.getFmLvl()));
                  this.sd = Class330.f(var10001.getFmSkin(), 71 & 63, 3 >> 1, (String)null);
                  StringBuffer var2 = new StringBuffer();
                  if (var1.getFmMsg1() != null) {
                     var2.append(var1.getFmMsg1());
                  }

                  if (var1.getFmMsg2() != null) {
                     var2.append("#r");
                     var2.append(var1.getFmMsg2());
                  }

                  this.z.setTextSize(var2.toString(), 4031 & 28926);
               }

               protected void paintChildren(Graphics var1) {
                  super.paintChildren(var1);
                  if (this.sd != null) {
                     this.sd.a(var1, 30199 & 3054, 4603 & 28366, 5 >> 3, Class280.l());
                  }

               }

               public {
                  int var10001 = 1 ^ 3;
                  int var10003 = -4 >> 2;
                  this.gv = var10003;
                  Class322[] var4 = new Class322[var10001];
                  boolean var8 = true;
                  this.ayk = var4;

                  int var10000;
                  int var2;
                  for(var10000 = var2 = 3 ^ 3; var10000 < this.ayk.length; var10000 = var2) {
                     this.ayk[var2] = new Class322(var2 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, (26551 & 6527) + var2, Class439.this.gk());
                     this.ayk[var2].setBounds((127 & 109) + (10714 & 22207) * var2, 491 & 32701, 23 & 122, 23 & 122);
                     this.add(this.ayk[var2++]);
                  }

                  JLabel[] var5 = new JLabel[--4];
                  var8 = true;
                  this.iv = var5;

                  <undefinedtype> var3;
                  for(var10000 = var2 = 5 >> 3; var10000 < this.iv.length; var10000 = var2) {
                     this.iv[var2] = Class133.b(30190 & 2943, 111 & 86, 95 & 50, 111 & 116, Color.white, Class681.cw);
                     this.iv[var2].setText(var2 == (1 ^ 3) ? "击杀获得" : (var2 == --3 ? "积分" : ""));
                     this.iv[var2].setHorizontalAlignment(3 >> 2);
                     if (var2 == (2 ^ 3)) {
                        var3 = this;
                        this.iv[var2].setFont(Class681.ce);
                        this.iv[var2].setBounds(21150 & 12159, 125 & 95, 45 & 123, 15 & 127);
                     } else if (var2 == 5 >> 1) {
                        var3 = this;
                        this.iv[var2].setFont(Class681.bm);
                        this.iv[var2].setBounds(16877 & 16283, 16119 & 16861, 62 & 125, 18);
                        this.iv[var2].setForeground(Color.red);
                        this.iv[var2].setHorizontalAlignment(--4);
                     } else {
                        if (var2 == --3) {
                           this.iv[var2].setFont(Class681.bm);
                           this.iv[var2].setBounds(522, 213, 60, 18);
                           this.iv[var2].setForeground(Color.red);
                           this.iv[var2].setHorizontalAlignment(10);
                        }

                        var3 = this;
                     }

                     var3.add(this.iv[var2++]);
                  }

                  Class245[] var6 = new Class245[--2];
                  var8 = true;
                  this.nr = var6;

                  for(var10000 = var2 = 3 & 4; var10000 < this.nr.length; var10000 = var2) {
                     this.nr[var2] = Class133.a(133, 425, 124, 19, 3 >> 2, Color.white, Class681.q);
                     this.nr[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
                     if (var2 == --1) {
                        this.nr[var2].setBounds(457, 214, 60, 18);
                     }

                     this.add(this.nr[var2++]);
                  }

                  Class436[] var7 = new Class436[--5];
                  var8 = true;
                  this.pv = var7;

                  for(var10000 = var2 = 2 & 5; var10000 < this.pv.length; var10000 = var2) {
                     this.pv[var2] = new Class436();
                     if (var2 == 0) {
                        var3 = this;
                        this.pv[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
                        this.pv[var2].setBounds(43, 65, 305, 388);
                     } else if (var2 == (2 ^ 3)) {
                        var3 = this;
                        this.pv[var2].fw("sc/d/75.png");
                        this.pv[var2].setBounds(361, 68, 28, 157);
                     } else if (var2 == (1 ^ 3)) {
                        var3 = this;
                        this.pv[var2].fw("sc/d/76.png");
                        this.pv[var2].setBounds(542, 67, 42, 41);
                     } else if (var2 == --3) {
                        var3 = this;
                        this.pv[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 ^ 3)));
                        this.pv[var2].setBounds(357, 65, 236, 172);
                     } else {
                        if (var2 == --4) {
                           this.pv[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(5 >> 3)));
                           this.pv[var2].setBounds(357, 239, 236, 213);
                        }

                        var3 = this;
                     }

                     var3.add(this.pv[var2++]);
                  }

                  this.ez = new ArrayList();
                  this.z = new RichLabel("", Class681.ce);
                  this.w = Class133.f(362, 240, 235, 214, this.z, 20);
                  this.add(this.w);
                  this.setBounds(2 & 5, 2 & 5, 620, 479);
               }

               public void ab(int var1) {
                  AllFM var4;
                  if ((var4 = Class439.this.vc().bm()) != null) {
                     List var3 = var4.getFmType();
                     var1 = var1 < 0 ? 3 & 4 : (var1 < var3.size() ? var1 : var3.size() - --1);
                     if (var1 != this.gv) {
                        this.gv = var1;
                        String var7 = (String)var3.get(this.gv);
                        this.nr[5 >> 3].setText(var7);
                        List var9 = var4.getAllList();
                        int var8 = 3 ^ 3;

                        int var2;
                        int var10000;
                        for(var10000 = var2 = 3 >> 2; var10000 < var9.size(); var10000 = var2) {
                           FM var5;
                           if ((var5 = (FM)var9.get(var2)).getFmType().equals(var7)) {
                              Class44 var6 = null;
                              Class44 var10;
                              if (var2 < this.ez.size()) {
                                 var10 = var6 = (Class44)this.ez.get(var2);
                              } else {
                                 var6 = new Class44(Class439.this.gk()) {
                                    public void af(MouseEvent var1) {
                                       FM var2 = (FM)this.arp;
                                       ann(var2);
                                    }
                                 };
                                 var10 = var6;
                                 int var10004 = 126 & 63;
                                 var6.fw("sc/d/51.png");
                                 var6.ad(Class44.asa);
                                 var6.setBounds(var10004 + var8 % --5 * (55 & 127), (94 & 111) + var8 / --5 * (63 & 119), 61 & 111, 61 & 111);
                                 this.add(var6, 2 & 5);
                                 this.ez.add(var6);
                              }

                              var10.c(0, var5);
                              int var10001 = 3 & 5;
                              String var10003 = var5.getFmHead();
                              ++var8;
                              var6.fx(Class222.l(var10003));
                              var6.setVisible((boolean)var10001);
                           }

                           ++var2;
                        }

                        for(var10000 = var2 = this.ez.size() - (4 ^ 5); var10000 >= var8; var10000 = var2) {
                           this.remove((Component)this.ez.get(var2));
                           this.ez.remove(var2--);
                        }

                     }
                  }
               }
            }, --1);
         }

         if (this.ban.sd == null && this.ban.ayl != null) {
            this.ban.ann(this.ban.ayl);
         }

         this.ban.ab(5 >> 3);
         this.ban.setVisible((boolean)(2 ^ 3));
         if (this.bao != null) {
            this.bao.setVisible((boolean)(2 & 5));
         }

         if (this.sm != null) {
            this.sm.setVisible((boolean)(3 >> 2));
            return;
         }
      } else if (var1 == (3 & 5)) {
         if (this.bao == null) {
            this.add(this.bao = new JComponent() {
               private Class44[] nt;
               private JTable nu;
               private Class322 nv;
               private JScrollPane fl;
               private Vector<Vector<Object>> nw;
               private Class436[] e;
               private JLabel[] u;

               public void hy(FMBean var1) {
                  FMRole var2 = var1.getMyRole();
                  this.e[5 >> 3].fw(Class222.l(var2.getSpecies_id().toString()));
                  this.u[5 >> 1].setText(var2.getFmPlace() != 0 ? String.valueOf(var2.getFmPlace()) : "未上榜");
                  this.u[--3].setText(var2.getFmPlacePast() != 0 ? String.valueOf(var2.getFmPlacePast()) : "未上榜");
                  this.u[46 & 95].setText(String.valueOf(var2.getFmjf()));
                  var2 = var1.getFmRole();
                  this.e[5 >> 1].fw(var2 != null ? Class222.l(var2.getSpecies_id().toString()) : null);
                  this.u[47 & 91].setText("名称：" + (var2 != null ? var2.getRolename() : ""));
                  this.u[44 & 95].setText(" I D：" + (var2 != null ? var2.getRole_id().toString() : ""));
                  this.u[79 & 61].setText("积分：" + (var2 != null ? var2.getFmjfPast() : ""));
                  int var10000 = 3 ^ 3;
                  this.u[127 & 15].setText(var1.getFmTime());

                  int var4;
                  for(var4 = var10000; var10000 < this.nt.length; var10000 = var4) {
                     BigDecimal var3 = var1.getGoodIds() != null && var4 < var1.getGoodIds().length ? var1.getGoodIds()[var4] : null;
                     Goodstable var5 = var3 != null ? Class439.this.vc().n(var3) : null;
                     Class44 var7 = this.nt[var4];
                     int var10001;
                     Goodstable var10002;
                     if (var5 != null) {
                        var10001 = 4 ^ 5;
                        var10002 = var5;
                     } else {
                        var10001 = 0;
                        var10002 = var5;
                     }

                     var7.c(var10001, var10002);
                     ++var4;
                  }

                  var10000 = 3 >> 2;
                  this.nw.clear();

                  for(var4 = var10000; var10000 < var1.getFmRoleList().size(); var10000 = var4) {
                     var2 = (FMRole)var1.getFmRoleList().get(var4);
                     Vector var6 = new Vector();
                     var6.add(String.valueOf(var2.getFmPlace()));
                     var6.add(var2.getRolename());
                     var6.add(Class224.r(var2.getGrade()) + "级");
                     var6.add(String.valueOf(var2.getFmjf()));
                     ++var4;
                     this.nw.addElement(var6);
                  }

                  if (this.nu.getRowCount() > 0) {
                     this.nu.setRowSelectionInterval(2 & 5, 2 & 5);
                  }

                  this.nu.updateUI();
                  this.fl.getVerticalScrollBar().setValue(5 >> 3);
               }

               public {
                  int var10001 = 115 & 28;
                  this.nv = new Class322("sc/e/26.png", --1, 2295 & 30636, Class681.ak, Class681.c, "领取奖励", Class439.this.gk());
                  this.nv.setBounds(987 & 32239, 103 & 124, 103 & 123, 127 & 25);
                  this.add(this.nv);
                  JLabel[] var6 = new JLabel[var10001];
                  boolean var10003 = true;
                  this.u = var6;

                  int var2;
                  int var10000;
                  for(var10000 = var2 = 2 & 5; var10000 < this.u.length; var10000 = var2) {
                     if (var2 != --5 && var2 != (55 & 78) && var2 != (111 & 23) && var2 != (94 & 41)) {
                        this.u[var2] = Class133.b((111 & 121) + var2 % --2 * (30905 & 2039), (111 & 95) + var2 / --2 * (119 & 29), 119 & 108, 115 & 30, Color.white, Class681.ak);
                        this.u[var2].setText(var2 == 0 ? "本期排名：" : (var2 == 5 >> 2 ? "上期排名：" : (var2 == --2 ? "未上榜" : (var2 == --3 ? "未上榜" : (var2 == --4 ? "本期积分：" : (var2 == --5 ? "名次" : (var2 == (111 & 22) ? "昵称" : (var2 == 7 ? "等级" : (var2 == 8 ? "积分" : (var2 == 9 ? "上一期榜首" : (var2 == 10 ? "前十名丰厚奖励展示" : (var2 == 11 ? "名称：" : (var2 == 12 ? " I D：" : (var2 == 13 ? "积分：" : (var2 == 14 ? "888888" : (var2 == 15 ? "活动时间:2020年4月14日 00:00 至 2020年4月28日 23:59" : ""))))))))))))))));
                        this.u[var2].setHorizontalAlignment(10);
                        this.add(this.u[var2]);
                        if (var2 >= 5 >> 1 && var2 <= --3) {
                           this.u[var2].setFont(Class681.ab);
                           this.u[var2].setForeground(Color.green);
                        } else if (var2 == --4) {
                           this.u[var2].setBounds(459, 77, 200, 18);
                        } else if (var2 == --5) {
                           this.u[var2].setBounds(64, 137, 36, 21);
                        } else if (var2 == 6) {
                           this.u[var2].setBounds(146, 137, 36, 21);
                        } else if (var2 == 7) {
                           this.u[var2].setBounds(232, 137, 36, 21);
                        } else if (var2 == 8) {
                           this.u[var2].setBounds(310, 137, 36, 21);
                        } else if (var2 == 9) {
                           this.u[var2].setHorizontalAlignment(2 & 5);
                           this.u[var2].setBounds(379, 137, 214, 21);
                        } else if (var2 == 10) {
                           this.u[var2].setHorizontalAlignment(3 ^ 3);
                           this.u[var2].setBounds(379, 259, 214, 21);
                        } else if (var2 >= 11 && var2 <= 13) {
                           this.u[var2].setFont(Class681.bm);
                           this.u[var2].setBounds(468, 171 + (var2 - 11) * 17, 122, 14);
                        } else if (var2 == 14) {
                           this.u[var2].setFont(Class681.q);
                           this.u[var2].setBounds(540, 77, 120, 18);
                           this.u[var2].setForeground(Color.green);
                        } else if (var2 == 15) {
                           this.u[var2].setFont(Class681.ab);
                           this.u[var2].setBounds(44, 448, 500, 15);
                           this.u[var2].setForeground(Color.red);
                        }
                     }

                     ++var2;
                  }

                  Class44[] var7 = new Class44[6];
                  var10003 = true;
                  this.nt = var7;

                  for(var10000 = var2 = 3 & 4; var10000 < this.nt.length; var10000 = var2) {
                     this.nt[var2] = new Class44(Class439.this.gk());
                     this.nt[var2].fw("sc/d/4.png");
                     this.nt[var2].ad(Class44.aqy);
                     this.nt[var2].setBounds(388 + var2 % --3 * 69, 300 + var2 / --3 * 67, 59, 57);
                     this.add(this.nt[var2++]);
                  }

                  Vector var5 = new Vector();
                  var5.addElement("名次");
                  var5.addElement("昵称");
                  var5.addElement("等级");
                  var5.addElement("积分");
                  this.nw = new Vector();
                  int[] var10010 = new int[--4];
                  boolean var10012 = true;
                  var10010[3 ^ 3] = 60;
                  var10010[4 ^ 5] = 130;
                  var10010[1 ^ 3] = 125;
                  var10010[--3] = 95;
                  this.nu = Class133.e(this.nw, var5, Class681.bx, Color.white, var10010);
                  DefaultTableCellRenderer var3;
                  (var3 = new DefaultTableCellRenderer() {
                     public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
                        if (var1 == null) {
                           return this;
                        } else {
                           DropLocation var7;
                           if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
                              var3 = --1;
                           }

                           int var10000;
                           if (var3 != 0) {
                              super.setBackground(Class681.bk);
                              var10000 = var5;
                           } else {
                              super.setBackground(Class681.cu);
                              var10000 = var5;
                           }

                           <undefinedtype> var8;
                           if (var10000 < 3) {
                              var8 = this;
                              super.setForeground(Color.yellow);
                           } else {
                              var8 = this;
                              super.setForeground(Color.white);
                           }

                           var8.setFont(var1.getFont());
                           this.setValue(var2);
                           return this;
                        }
                     }
                  }).setHorizontalAlignment(2 & 5);
                  this.nu.setDefaultRenderer(Object.class, var3);
                  this.fl = Class133.f(43, 137, 332, 309, this.nu, 20);
                  this.add(this.fl);
                  Class436[] var9 = new Class436[11];
                  var10003 = true;
                  this.e = var9;

                  int var4;
                  for(var10000 = var4 = 2 & 5; var10000 < this.e.length; var10000 = var4) {
                     this.e[var4] = new Class436();
                     <undefinedtype> var8;
                     if (var4 == 0) {
                        var8 = this;
                        this.e[var4].setBounds(56, 79, 39, 39);
                     } else if (var4 == 5 >> 2) {
                        var8 = this;
                        this.e[var4].fw("sc/d/51.png");
                        this.e[var4].setBounds(53, 76, 45, 45);
                     } else if (var4 == 2) {
                        var8 = this;
                        this.e[var4].setBounds(411, 172, 42, 42);
                     } else if (var4 == 3) {
                        var8 = this;
                        this.e[var4].fw("sc/d/28.png");
                        this.e[var4].setBounds(406, 167, 52, 52);
                     } else if (var4 == 4) {
                        var8 = this;
                        this.e[var4].eq(Class511.q("sc/d/49.png", 5, 5, 5, 5, (boolean)(3 >> 2)));
                        this.e[var4].setBounds(43, 65, 550, 66);
                     } else {
                        label251: {
                           if (var4 >= 5 && var4 <= 7) {
                              this.e[var4].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(3 & 4)));
                              if (var4 == 5) {
                                 var8 = this;
                                 this.e[var4].setBounds(43, 137, 332, 21);
                                 break label251;
                              }

                              if (var4 == 6) {
                                 var8 = this;
                                 this.e[var4].setBounds(379, 137, 214, 21);
                                 break label251;
                              }

                              if (var4 == 7) {
                                 var8 = this;
                                 this.e[var4].setBounds(379, 259, 214, 21);
                                 break label251;
                              }
                           } else if (var4 >= 8 && var4 <= 10) {
                              this.e[var4].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 >> 2)));
                              if (var4 == 8) {
                                 var8 = this;
                                 this.e[var4].setBounds(43, 137, 332, 309);
                                 break label251;
                              }

                              if (var4 == 9) {
                                 var8 = this;
                                 this.e[var4].setBounds(379, 137, 214, 118);
                                 break label251;
                              }

                              if (var4 == 10) {
                                 this.e[var4].setBounds(379, 259, 214, 187);
                              }
                           }

                           var8 = this;
                        }
                     }

                     var8.add(this.e[var4++]);
                  }

                  this.setBounds(2 & 5, 2 & 5, 620, 479);
               }
            }, 4 ^ 5);
         }

         this.bao.hy(var2);
         this.bao.setVisible((boolean)(4 ^ 5));
         if (this.ban != null) {
            this.ban.setVisible((boolean)(3 ^ 3));
         }

         if (this.sm != null) {
            this.sm.setVisible((boolean)(2 & 5));
            return;
         }
      } else if (var1 == (1 ^ 3)) {
         if (this.sm == null) {
            this.add(this.sm = new JComponent() {
               private JComponent va;
               private JLabel tj;
               private int vc;
               private RichLabel vd;
               private JComponent ve;
               private MoneyType vf;
               private Class245[] vg;
               private Class245 vh;
               private Class556[] vi;
               private Class322[] vj;
               private Class322[] kh;
               private Class436[] v;
               private Class436 vk;
               private Class319[] vl;
               private Class217[] vm;
               private JLabel[] ai;
               private MoneyType rr;
               private Class254[] vn;
               private Class322[] kn;
               private Class556 ol;
               private int cy;
               private int m;

               public void q() {
               }

               public {
                  int var10001 = --2;
                  Class322[] var4 = new Class322[var10001];
                  boolean var10003 = true;
                  this.kn = var4;

                  int var2;
                  Class322[] var3;
                  int var10000;
                  Class322 var10002;
                  int var10005;
                  int var10006;
                  Font var10007;
                  String var10009;
                  Class439 var10010;
                  for(var10000 = var2 = 3 ^ 3; var10000 < this.kn.length; var10000 = var2) {
                     var3 = this.kn;
                     var10002 = new Class322;
                     var10005 = 5 >> 1;
                     var10006 = (8375 & 24557) + var2;
                     var10007 = Class681.cw;
                     if (var2 == 0) {
                        var10009 = "斩妖积分";
                        var10010 = Class439.this;
                     } else if (var2 == --1) {
                        var10009 = "伏魔令";
                        var10010 = Class439.this;
                     } else {
                        var10009 = "";
                        var10010 = Class439.this;
                     }

                     var3[var2] = var10002;
                     this.kn[var2].setOffsetTexts(Class681.cl);
                     this.kn[var2].setBounds((115 & 62) + (118 & 111) * var2, 60 & 127, 127 & 100, 121 & 30);
                     this.add(this.kn[var2++]);
                  }

                  var10001 = 108 & 27;
                  this.va = new JComponent() {
                  };
                  this.ve = new JComponent() {
                  };
                  this.va.setBounds(2 & 5, 2 & 5, 11118 & 22269, 7647 & 25599);
                  this.ve.setBounds(5 >> 3, 5 >> 3, 24447 & 8940, 18431 & 14815);
                  this.add(this.va);
                  this.add(this.ve);
                  int var17 = 995 & 32062;
                  int var10011 = 28135 & 5115;
                  this.vf = new MoneyType();
                  this.vf.setIdAndKey(5 >> 3, "斩妖积分");
                  this.ol = Class133.m(var10011, 126 & 63, 127 & 110, 27 & 119, 10, Color.white, Class681.q, this.vf, Class439.this.aej);
                  this.vh = Class133.a(var17, 430, 58, 18, 2 & 5, Color.white, Class681.q);
                  this.ol.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
                  this.vh.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
                  this.ol.ab(--2);
                  this.va.add(this.ol);
                  this.va.add(this.vh);
                  Class254[] var5 = new Class254[var10001];
                  var10003 = true;
                  this.vn = var5;

                  for(var10000 = var2 = 5 >> 3; var10000 < this.vn.length; var10000 = var2) {
                     this.vn[var2] = new Class254(Class439.this.gk());
                     this.vn[var2].setBounds(58 + var2 % --4 * 138, 105 + var2 / --4 * 165, 115, 150);
                     this.va.add(this.vn[var2++]);
                  }

                  var10001 = --4;
                  this.tj = Class133.b(411, 62, 110, 19, Color.black, Class681.ak);
                  this.tj.setText("斩妖积分");
                  this.va.add(this.tj);
                  var4 = new Class322[var10001];
                  var10003 = true;
                  this.kh = var4;

                  <undefinedtype> var7;
                  for(var10000 = var2 = 5 >> 3; var10000 < this.kh.length; var10000 = var2) {
                     if (var2 != 0 && var2 != 3 >> 1) {
                        this.kh[var2] = new Class322(var2 == (1 ^ 3) ? "sc/e/42.png" : "sc/e/43.png", 1, 167 + var2, Class439.this.gk());
                        var7 = this;
                        this.kh[var2].setBounds(269 + (var2 - (5 >> 1)) * 82, 430, 18, 18);
                     } else {
                        var3 = this.kh;
                        var10002 = new Class322;
                        var10005 = 3 & 5;
                        var10006 = 167 + var2;
                        var10007 = Class681.bm;
                        if (var2 == 0) {
                           var10009 = "首页";
                           var10010 = Class439.this;
                        } else if (var2 == (4 ^ 5)) {
                           var10009 = "末页";
                           var10010 = Class439.this;
                        } else {
                           var10009 = "";
                           var10010 = Class439.this;
                        }

                        var3[var2] = var10002;
                        var7 = this;
                        this.kh[var2].setBounds(232 + var2 * 140, 430, 34, 18);
                     }

                     var7.va.add(this.kh[var2++]);
                  }

                  var4 = new Class322[--2];
                  var10003 = true;
                  this.vj = var4;

                  for(var10000 = var2 = 3 ^ 3; var10000 < this.vj.length; var10000 = var2) {
                     this.vj[var2] = new Class322("sc/e/31.png", 3 >> 1, 171 + var2, Class681.ak, Class681.c, "兑换", Class439.this.gk());
                     this.vj[var2].setBounds(415, 156 + var2 * 150, 79, 25);
                     this.ve.add(this.vj[var2++]);
                  }

                  JLabel[] var8 = new JLabel[10];
                  var10003 = true;
                  this.ai = var8;

                  for(var10000 = var2 = 2 & 5; var10000 < this.ai.length; var10000 = var2) {
                     this.ai[var2] = Class133.b(150, 100 + 150 * var2, 100, 19, Color.black, Class681.ak);
                     this.ai[var2].setText(var2 != 0 && var2 != (3 & 5) ? (var2 != (1 ^ 3) && var2 != --5 ? (var2 != --3 && var2 != 6 ? (var2 != --4 && var2 != 7 ? (var2 == 8 ? "【人物经验】" : (var2 == 9 ? "【勇者积分】" : "")) : "获得") : "兑换") : "拥有") : "伏魔令");
                     this.ai[var2].setHorizontalAlignment(3 ^ 3);
                     if (var2 >= 5 >> 1 && var2 <= --4) {
                        var7 = this;
                        this.ai[var2].setBounds(263, 132 + (var2 - --2) * 27, 36, 19);
                     } else if (var2 >= 5 && var2 <= 7) {
                        var7 = this;
                        this.ai[var2].setBounds(263, 283 + (var2 - 5) * 27, 36, 19);
                     } else {
                        if (var2 >= 8 && var2 <= 9) {
                           this.ai[var2].setHorizontalAlignment(10);
                           this.ai[var2].setFont(Class681.ab);
                           this.ai[var2].setBounds(300, 206 + (var2 - 8) * 150, 80, 14);
                        }

                        var7 = this;
                     }

                     var7.ve.add(this.ai[var2++]);
                  }

                  this.vd = new RichLabel("", Class681.ab);
                  this.vd.setTextSize("#c000000温馨提示：#r1、每张伏魔令可兑换的人物经验与兑换时的人物等级有关。#r2、每张伏魔令可兑换的勇者积分，根据价格规律浮动。", 360);
                  this.vd.setBounds(149, 385, this.vd.getWidth(), this.vd.getHeight());
                  this.ve.add(this.vd);
                  this.rr = new MoneyType();
                  this.rr.setIdAndKey(2 & 5, "伏魔令");
                  Class319[] var10 = new Class319[2];
                  var10003 = true;
                  this.vl = var10;
                  Class556[] var11 = new Class556[2];
                  var10003 = true;
                  this.vi = var11;
                  Class217[] var12 = new Class217[2];
                  var10003 = true;
                  this.vm = var12;
                  Class245[] var13 = new Class245[2];
                  var10003 = true;
                  this.vg = var13;

                  for(var10000 = var2 = 5 >> 3; var10000 < 2; var10000 = var2) {
                     this.vi[var2] = Class133.m(305, 132 + 150 * var2, 94, 19, 10, Color.white, Class681.q, this.rr, Class439.this.aej);
                     this.vm[var2] = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, false), Class681.q, Color.white);
                     this.vg[var2] = Class133.a(305, 186 + 150 * var2, 94, 19, 10, Color.white, Class681.q);
                     this.vm[var2].setBounds(305, 159 + 150 * var2, 94, 19);
                     this.vi[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
                     this.vg[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
                     this.vi[var2].ab(2);
                     this.ve.add(this.vm[var2]);
                     this.ve.add(this.vg[var2]);
                     this.ve.add(this.vi[var2]);
                     Class319[] var16 = this.vl;
                     int var10004 = var2;
                     Class319 var15 = new Class319(15, this.vm[var2], Class439.this.gk());
                     ++var2;
                     var16[var10004] = var15;
                  }

                  Class436[] var14 = new Class436[5];
                  var10003 = true;
                  this.v = var14;

                  for(var10000 = var2 = 0; var10000 < this.v.length; var10000 = var2) {
                     this.v[var2] = new Class436();
                     if (var2 >= 0 && var2 <= 1) {
                        if (var2 == 0) {
                           var7 = this;
                           this.v[var2].fw("sc/d/77.png");
                        } else {
                           if (var2 == 1) {
                              this.v[var2].fw("sc/d/78.png");
                           }

                           var7 = this;
                        }

                        var7.v[var2].setBounds(154, 123 + var2 * 150, 92, 92);
                        var7 = this;
                     } else if (var2 >= 2 && var2 <= 3) {
                        var7 = this;
                        this.v[var2].eq(Class511.q("sc/d/4.png", 5, 5, 5, 5, false));
                        this.v[var2].setBounds(150, 119 + (var2 - 2) * 150, 100, 100);
                     } else {
                        if (var2 == 4) {
                           this.v[var2].eq(Class511.q("sc/d/66.png", 80, 1, 80, 1, false));
                           this.v[var2].setBounds(112, 237, 416, 2);
                        }

                        var7 = this;
                     }

                     var7.ve.add(this.v[var2++]);
                  }

                  this.vk = new Class436(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
                  this.vk.setBounds(43, 84, 550, 374);
                  this.add(this.vk);
                  this.setBounds(0, 0, 620, 479);
               }
            }, 3 & 5);
         }

         int var10003 = 2 & 5;
         this.sm.q();
         this.dp(var10003);
         this.sm.setVisible((boolean)(3 >> 1));
         if (this.ban != null) {
            this.ban.setVisible((boolean)(3 & 4));
         }

         if (this.bao != null) {
            this.bao.setVisible((boolean)(2 & 5));
         }
      }

   }

   public Class439(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      super(123 & 118, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 3 & 4, 15996 & 17391, 21471 & 11775, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 108 & 87, 108 & 87, 108 & 87, 108 & 87, (boolean)(3 >> 2)), "降妖伏魔");
      Class322[] var4 = new Class322[var10001];
      boolean var10003 = true;
      this.adt = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.adt.length; var10000 = var2) {
         Class322[] var3 = this.adt;
         Class322 var10002 = new Class322;
         var10005 = --2;
         int var10006 = (23739 & 9189) + var2;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class439 var10010;
         if (var2 == 0) {
            var10009 = "斩妖除魔";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "积分排名";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "积分商城";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.adt[var2].setOffsetTexts(Class681.bv);
         this.adt[var2].setBounds((119 & 58) + (102 & 127) * var2, 23 & 122, 95 & 127, 51 & 109);
         this.add(this.adt[var2++]);
      }

      Class436[] var5 = new Class436[3 >> 1];
      var10003 = true;
      this.pv = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.pv.length; var10000 = var2) {
         this.pv[var2] = new Class436();
         if (var2 == 0) {
            this.pv[var2].eq(Class511.q("sc/d/35.png", 116 & 91, 94 & 43, 116 & 91, 106 & 31, (boolean)(2 & 5)));
            this.pv[var2].setBounds(94 & 63, 99 & 60, 18166 & 15161, 20);
         }

         this.add(this.pv[var2++]);
      }

      if (this.ban == null) {
         this.add(this.ban = new JComponent() {
            private Class322[] ayk;
            private JScrollPane w;
            private int gv;
            private FM ayl;
            private RichLabel z;
            private JLabel[] iv;
            private Class436[] pv;
            private Class19 sd;
            private Class245[] nr;
            private List<Class44> ez;

            public void ann(FM var1) {
               FM var10001 = this.ayl = var1;
               this.iv[3 ^ 3].setText("<html>" + var1.getFmName() + "</html>");
               this.iv[--1].setText(String.valueOf(var1.getFmLvl()));
               this.nr[4 ^ 5].setText(String.valueOf(var1.getFmLvl()));
               this.sd = Class330.f(var10001.getFmSkin(), 71 & 63, 3 >> 1, (String)null);
               StringBuffer var2 = new StringBuffer();
               if (var1.getFmMsg1() != null) {
                  var2.append(var1.getFmMsg1());
               }

               if (var1.getFmMsg2() != null) {
                  var2.append("#r");
                  var2.append(var1.getFmMsg2());
               }

               this.z.setTextSize(var2.toString(), 4031 & 28926);
            }

            protected void paintChildren(Graphics var1) {
               super.paintChildren(var1);
               if (this.sd != null) {
                  this.sd.a(var1, 30199 & 3054, 4603 & 28366, 5 >> 3, Class280.l());
               }

            }

            public {
               int var10001 = 1 ^ 3;
               int var10003 = -4 >> 2;
               this.gv = var10003;
               Class322[] var4 = new Class322[var10001];
               boolean var8 = true;
               this.ayk = var4;

               int var10000;
               int var2;
               for(var10000 = var2 = 3 ^ 3; var10000 < this.ayk.length; var10000 = var2) {
                  this.ayk[var2] = new Class322(var2 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, (26551 & 6527) + var2, Class439.this.gk());
                  this.ayk[var2].setBounds((127 & 109) + (10714 & 22207) * var2, 491 & 32701, 23 & 122, 23 & 122);
                  this.add(this.ayk[var2++]);
               }

               JLabel[] var5 = new JLabel[--4];
               var8 = true;
               this.iv = var5;

               <undefinedtype> var3;
               for(var10000 = var2 = 5 >> 3; var10000 < this.iv.length; var10000 = var2) {
                  this.iv[var2] = Class133.b(30190 & 2943, 111 & 86, 95 & 50, 111 & 116, Color.white, Class681.cw);
                  this.iv[var2].setText(var2 == (1 ^ 3) ? "击杀获得" : (var2 == --3 ? "积分" : ""));
                  this.iv[var2].setHorizontalAlignment(3 >> 2);
                  if (var2 == (2 ^ 3)) {
                     var3 = this;
                     this.iv[var2].setFont(Class681.ce);
                     this.iv[var2].setBounds(21150 & 12159, 125 & 95, 45 & 123, 15 & 127);
                  } else if (var2 == 5 >> 1) {
                     var3 = this;
                     this.iv[var2].setFont(Class681.bm);
                     this.iv[var2].setBounds(16877 & 16283, 16119 & 16861, 62 & 125, 18);
                     this.iv[var2].setForeground(Color.red);
                     this.iv[var2].setHorizontalAlignment(--4);
                  } else {
                     if (var2 == --3) {
                        this.iv[var2].setFont(Class681.bm);
                        this.iv[var2].setBounds(522, 213, 60, 18);
                        this.iv[var2].setForeground(Color.red);
                        this.iv[var2].setHorizontalAlignment(10);
                     }

                     var3 = this;
                  }

                  var3.add(this.iv[var2++]);
               }

               Class245[] var6 = new Class245[--2];
               var8 = true;
               this.nr = var6;

               for(var10000 = var2 = 3 & 4; var10000 < this.nr.length; var10000 = var2) {
                  this.nr[var2] = Class133.a(133, 425, 124, 19, 3 >> 2, Color.white, Class681.q);
                  this.nr[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
                  if (var2 == --1) {
                     this.nr[var2].setBounds(457, 214, 60, 18);
                  }

                  this.add(this.nr[var2++]);
               }

               Class436[] var7 = new Class436[--5];
               var8 = true;
               this.pv = var7;

               for(var10000 = var2 = 2 & 5; var10000 < this.pv.length; var10000 = var2) {
                  this.pv[var2] = new Class436();
                  if (var2 == 0) {
                     var3 = this;
                     this.pv[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
                     this.pv[var2].setBounds(43, 65, 305, 388);
                  } else if (var2 == (2 ^ 3)) {
                     var3 = this;
                     this.pv[var2].fw("sc/d/75.png");
                     this.pv[var2].setBounds(361, 68, 28, 157);
                  } else if (var2 == (1 ^ 3)) {
                     var3 = this;
                     this.pv[var2].fw("sc/d/76.png");
                     this.pv[var2].setBounds(542, 67, 42, 41);
                  } else if (var2 == --3) {
                     var3 = this;
                     this.pv[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 ^ 3)));
                     this.pv[var2].setBounds(357, 65, 236, 172);
                  } else {
                     if (var2 == --4) {
                        this.pv[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(5 >> 3)));
                        this.pv[var2].setBounds(357, 239, 236, 213);
                     }

                     var3 = this;
                  }

                  var3.add(this.pv[var2++]);
               }

               this.ez = new ArrayList();
               this.z = new RichLabel("", Class681.ce);
               this.w = Class133.f(362, 240, 235, 214, this.z, 20);
               this.add(this.w);
               this.setBounds(2 & 5, 2 & 5, 620, 479);
            }

            public void ab(int var1) {
               AllFM var4;
               if ((var4 = Class439.this.vc().bm()) != null) {
                  List var3 = var4.getFmType();
                  var1 = var1 < 0 ? 3 & 4 : (var1 < var3.size() ? var1 : var3.size() - --1);
                  if (var1 != this.gv) {
                     this.gv = var1;
                     String var7 = (String)var3.get(this.gv);
                     this.nr[5 >> 3].setText(var7);
                     List var9 = var4.getAllList();
                     int var8 = 3 ^ 3;

                     int var2;
                     int var10000;
                     for(var10000 = var2 = 3 >> 2; var10000 < var9.size(); var10000 = var2) {
                        FM var5;
                        if ((var5 = (FM)var9.get(var2)).getFmType().equals(var7)) {
                           Class44 var6 = null;
                           Class44 var10;
                           if (var2 < this.ez.size()) {
                              var10 = var6 = (Class44)this.ez.get(var2);
                           } else {
                              var6 = new Class44(Class439.this.gk()) {
                                 public void af(MouseEvent var1) {
                                    FM var2 = (FM)this.arp;
                                    ann(var2);
                                 }
                              };
                              var10 = var6;
                              int var10004 = 126 & 63;
                              var6.fw("sc/d/51.png");
                              var6.ad(Class44.asa);
                              var6.setBounds(var10004 + var8 % --5 * (55 & 127), (94 & 111) + var8 / --5 * (63 & 119), 61 & 111, 61 & 111);
                              this.add(var6, 2 & 5);
                              this.ez.add(var6);
                           }

                           var10.c(0, var5);
                           int var10001 = 3 & 5;
                           String var10003 = var5.getFmHead();
                           ++var8;
                           var6.fx(Class222.l(var10003));
                           var6.setVisible((boolean)var10001);
                        }

                        ++var2;
                     }

                     for(var10000 = var2 = this.ez.size() - (4 ^ 5); var10000 >= var8; var10000 = var2) {
                        this.remove((Component)this.ez.get(var2));
                        this.ez.remove(var2--);
                     }

                  }
               }
            }
         }, 3 & 5);
      }

      if (this.bao == null) {
         this.add(this.bao = new JComponent() {
            private Class44[] nt;
            private JTable nu;
            private Class322 nv;
            private JScrollPane fl;
            private Vector<Vector<Object>> nw;
            private Class436[] e;
            private JLabel[] u;

            public void hy(FMBean var1) {
               FMRole var2 = var1.getMyRole();
               this.e[5 >> 3].fw(Class222.l(var2.getSpecies_id().toString()));
               this.u[5 >> 1].setText(var2.getFmPlace() != 0 ? String.valueOf(var2.getFmPlace()) : "未上榜");
               this.u[--3].setText(var2.getFmPlacePast() != 0 ? String.valueOf(var2.getFmPlacePast()) : "未上榜");
               this.u[46 & 95].setText(String.valueOf(var2.getFmjf()));
               var2 = var1.getFmRole();
               this.e[5 >> 1].fw(var2 != null ? Class222.l(var2.getSpecies_id().toString()) : null);
               this.u[47 & 91].setText("名称：" + (var2 != null ? var2.getRolename() : ""));
               this.u[44 & 95].setText(" I D：" + (var2 != null ? var2.getRole_id().toString() : ""));
               this.u[79 & 61].setText("积分：" + (var2 != null ? var2.getFmjfPast() : ""));
               int var10000 = 3 ^ 3;
               this.u[127 & 15].setText(var1.getFmTime());

               int var4;
               for(var4 = var10000; var10000 < this.nt.length; var10000 = var4) {
                  BigDecimal var3 = var1.getGoodIds() != null && var4 < var1.getGoodIds().length ? var1.getGoodIds()[var4] : null;
                  Goodstable var5 = var3 != null ? Class439.this.vc().n(var3) : null;
                  Class44 var7 = this.nt[var4];
                  int var10001;
                  Goodstable var10002;
                  if (var5 != null) {
                     var10001 = 4 ^ 5;
                     var10002 = var5;
                  } else {
                     var10001 = 0;
                     var10002 = var5;
                  }

                  var7.c(var10001, var10002);
                  ++var4;
               }

               var10000 = 3 >> 2;
               this.nw.clear();

               for(var4 = var10000; var10000 < var1.getFmRoleList().size(); var10000 = var4) {
                  var2 = (FMRole)var1.getFmRoleList().get(var4);
                  Vector var6 = new Vector();
                  var6.add(String.valueOf(var2.getFmPlace()));
                  var6.add(var2.getRolename());
                  var6.add(Class224.r(var2.getGrade()) + "级");
                  var6.add(String.valueOf(var2.getFmjf()));
                  ++var4;
                  this.nw.addElement(var6);
               }

               if (this.nu.getRowCount() > 0) {
                  this.nu.setRowSelectionInterval(2 & 5, 2 & 5);
               }

               this.nu.updateUI();
               this.fl.getVerticalScrollBar().setValue(5 >> 3);
            }

            public {
               int var10001 = 115 & 28;
               this.nv = new Class322("sc/e/26.png", --1, 2295 & 30636, Class681.ak, Class681.c, "领取奖励", Class439.this.gk());
               this.nv.setBounds(987 & 32239, 103 & 124, 103 & 123, 127 & 25);
               this.add(this.nv);
               JLabel[] var6 = new JLabel[var10001];
               boolean var10003 = true;
               this.u = var6;

               int var2;
               int var10000;
               for(var10000 = var2 = 2 & 5; var10000 < this.u.length; var10000 = var2) {
                  if (var2 != --5 && var2 != (55 & 78) && var2 != (111 & 23) && var2 != (94 & 41)) {
                     this.u[var2] = Class133.b((111 & 121) + var2 % --2 * (30905 & 2039), (111 & 95) + var2 / --2 * (119 & 29), 119 & 108, 115 & 30, Color.white, Class681.ak);
                     this.u[var2].setText(var2 == 0 ? "本期排名：" : (var2 == 5 >> 2 ? "上期排名：" : (var2 == --2 ? "未上榜" : (var2 == --3 ? "未上榜" : (var2 == --4 ? "本期积分：" : (var2 == --5 ? "名次" : (var2 == (111 & 22) ? "昵称" : (var2 == 7 ? "等级" : (var2 == 8 ? "积分" : (var2 == 9 ? "上一期榜首" : (var2 == 10 ? "前十名丰厚奖励展示" : (var2 == 11 ? "名称：" : (var2 == 12 ? " I D：" : (var2 == 13 ? "积分：" : (var2 == 14 ? "888888" : (var2 == 15 ? "活动时间:2020年4月14日 00:00 至 2020年4月28日 23:59" : ""))))))))))))))));
                     this.u[var2].setHorizontalAlignment(10);
                     this.add(this.u[var2]);
                     if (var2 >= 5 >> 1 && var2 <= --3) {
                        this.u[var2].setFont(Class681.ab);
                        this.u[var2].setForeground(Color.green);
                     } else if (var2 == --4) {
                        this.u[var2].setBounds(459, 77, 200, 18);
                     } else if (var2 == --5) {
                        this.u[var2].setBounds(64, 137, 36, 21);
                     } else if (var2 == 6) {
                        this.u[var2].setBounds(146, 137, 36, 21);
                     } else if (var2 == 7) {
                        this.u[var2].setBounds(232, 137, 36, 21);
                     } else if (var2 == 8) {
                        this.u[var2].setBounds(310, 137, 36, 21);
                     } else if (var2 == 9) {
                        this.u[var2].setHorizontalAlignment(2 & 5);
                        this.u[var2].setBounds(379, 137, 214, 21);
                     } else if (var2 == 10) {
                        this.u[var2].setHorizontalAlignment(3 ^ 3);
                        this.u[var2].setBounds(379, 259, 214, 21);
                     } else if (var2 >= 11 && var2 <= 13) {
                        this.u[var2].setFont(Class681.bm);
                        this.u[var2].setBounds(468, 171 + (var2 - 11) * 17, 122, 14);
                     } else if (var2 == 14) {
                        this.u[var2].setFont(Class681.q);
                        this.u[var2].setBounds(540, 77, 120, 18);
                        this.u[var2].setForeground(Color.green);
                     } else if (var2 == 15) {
                        this.u[var2].setFont(Class681.ab);
                        this.u[var2].setBounds(44, 448, 500, 15);
                        this.u[var2].setForeground(Color.red);
                     }
                  }

                  ++var2;
               }

               Class44[] var7 = new Class44[6];
               var10003 = true;
               this.nt = var7;

               for(var10000 = var2 = 3 & 4; var10000 < this.nt.length; var10000 = var2) {
                  this.nt[var2] = new Class44(Class439.this.gk());
                  this.nt[var2].fw("sc/d/4.png");
                  this.nt[var2].ad(Class44.aqy);
                  this.nt[var2].setBounds(388 + var2 % --3 * 69, 300 + var2 / --3 * 67, 59, 57);
                  this.add(this.nt[var2++]);
               }

               Vector var5 = new Vector();
               var5.addElement("名次");
               var5.addElement("昵称");
               var5.addElement("等级");
               var5.addElement("积分");
               this.nw = new Vector();
               int[] var10010 = new int[--4];
               boolean var10012 = true;
               var10010[3 ^ 3] = 60;
               var10010[4 ^ 5] = 130;
               var10010[1 ^ 3] = 125;
               var10010[--3] = 95;
               this.nu = Class133.e(this.nw, var5, Class681.bx, Color.white, var10010);
               DefaultTableCellRenderer var3;
               (var3 = new DefaultTableCellRenderer() {
                  public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
                     if (var1 == null) {
                        return this;
                     } else {
                        DropLocation var7;
                        if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
                           var3 = --1;
                        }

                        int var10000;
                        if (var3 != 0) {
                           super.setBackground(Class681.bk);
                           var10000 = var5;
                        } else {
                           super.setBackground(Class681.cu);
                           var10000 = var5;
                        }

                        <undefinedtype> var8;
                        if (var10000 < 3) {
                           var8 = this;
                           super.setForeground(Color.yellow);
                        } else {
                           var8 = this;
                           super.setForeground(Color.white);
                        }

                        var8.setFont(var1.getFont());
                        this.setValue(var2);
                        return this;
                     }
                  }
               }).setHorizontalAlignment(2 & 5);
               this.nu.setDefaultRenderer(Object.class, var3);
               this.fl = Class133.f(43, 137, 332, 309, this.nu, 20);
               this.add(this.fl);
               Class436[] var9 = new Class436[11];
               var10003 = true;
               this.e = var9;

               int var4;
               for(var10000 = var4 = 2 & 5; var10000 < this.e.length; var10000 = var4) {
                  this.e[var4] = new Class436();
                  <undefinedtype> var8;
                  if (var4 == 0) {
                     var8 = this;
                     this.e[var4].setBounds(56, 79, 39, 39);
                  } else if (var4 == 5 >> 2) {
                     var8 = this;
                     this.e[var4].fw("sc/d/51.png");
                     this.e[var4].setBounds(53, 76, 45, 45);
                  } else if (var4 == 2) {
                     var8 = this;
                     this.e[var4].setBounds(411, 172, 42, 42);
                  } else if (var4 == 3) {
                     var8 = this;
                     this.e[var4].fw("sc/d/28.png");
                     this.e[var4].setBounds(406, 167, 52, 52);
                  } else if (var4 == 4) {
                     var8 = this;
                     this.e[var4].eq(Class511.q("sc/d/49.png", 5, 5, 5, 5, (boolean)(3 >> 2)));
                     this.e[var4].setBounds(43, 65, 550, 66);
                  } else {
                     label251: {
                        if (var4 >= 5 && var4 <= 7) {
                           this.e[var4].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(3 & 4)));
                           if (var4 == 5) {
                              var8 = this;
                              this.e[var4].setBounds(43, 137, 332, 21);
                              break label251;
                           }

                           if (var4 == 6) {
                              var8 = this;
                              this.e[var4].setBounds(379, 137, 214, 21);
                              break label251;
                           }

                           if (var4 == 7) {
                              var8 = this;
                              this.e[var4].setBounds(379, 259, 214, 21);
                              break label251;
                           }
                        } else if (var4 >= 8 && var4 <= 10) {
                           this.e[var4].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 >> 2)));
                           if (var4 == 8) {
                              var8 = this;
                              this.e[var4].setBounds(43, 137, 332, 309);
                              break label251;
                           }

                           if (var4 == 9) {
                              var8 = this;
                              this.e[var4].setBounds(379, 137, 214, 118);
                              break label251;
                           }

                           if (var4 == 10) {
                              this.e[var4].setBounds(379, 259, 214, 187);
                           }
                        }

                        var8 = this;
                     }
                  }

                  var8.add(this.e[var4++]);
               }

               this.setBounds(2 & 5, 2 & 5, 620, 479);
            }
         }, 3 >> 1);
      }

      if (this.sm == null) {
         this.add(this.sm = new JComponent() {
            private JComponent va;
            private JLabel tj;
            private int vc;
            private RichLabel vd;
            private JComponent ve;
            private MoneyType vf;
            private Class245[] vg;
            private Class245 vh;
            private Class556[] vi;
            private Class322[] vj;
            private Class322[] kh;
            private Class436[] v;
            private Class436 vk;
            private Class319[] vl;
            private Class217[] vm;
            private JLabel[] ai;
            private MoneyType rr;
            private Class254[] vn;
            private Class322[] kn;
            private Class556 ol;
            private int cy;
            private int m;

            public void q() {
            }

            public {
               int var10001 = --2;
               Class322[] var4 = new Class322[var10001];
               boolean var10003 = true;
               this.kn = var4;

               int var2;
               Class322[] var3;
               int var10000;
               Class322 var10002;
               int var10005;
               int var10006;
               Font var10007;
               String var10009;
               Class439 var10010;
               for(var10000 = var2 = 3 ^ 3; var10000 < this.kn.length; var10000 = var2) {
                  var3 = this.kn;
                  var10002 = new Class322;
                  var10005 = 5 >> 1;
                  var10006 = (8375 & 24557) + var2;
                  var10007 = Class681.cw;
                  if (var2 == 0) {
                     var10009 = "斩妖积分";
                     var10010 = Class439.this;
                  } else if (var2 == --1) {
                     var10009 = "伏魔令";
                     var10010 = Class439.this;
                  } else {
                     var10009 = "";
                     var10010 = Class439.this;
                  }

                  var3[var2] = var10002;
                  this.kn[var2].setOffsetTexts(Class681.cl);
                  this.kn[var2].setBounds((115 & 62) + (118 & 111) * var2, 60 & 127, 127 & 100, 121 & 30);
                  this.add(this.kn[var2++]);
               }

               var10001 = 108 & 27;
               this.va = new JComponent() {
               };
               this.ve = new JComponent() {
               };
               this.va.setBounds(2 & 5, 2 & 5, 11118 & 22269, 7647 & 25599);
               this.ve.setBounds(5 >> 3, 5 >> 3, 24447 & 8940, 18431 & 14815);
               this.add(this.va);
               this.add(this.ve);
               int var17 = 995 & 32062;
               int var10011 = 28135 & 5115;
               this.vf = new MoneyType();
               this.vf.setIdAndKey(5 >> 3, "斩妖积分");
               this.ol = Class133.m(var10011, 126 & 63, 127 & 110, 27 & 119, 10, Color.white, Class681.q, this.vf, Class439.this.aej);
               this.vh = Class133.a(var17, 430, 58, 18, 2 & 5, Color.white, Class681.q);
               this.ol.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
               this.vh.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
               this.ol.ab(--2);
               this.va.add(this.ol);
               this.va.add(this.vh);
               Class254[] var5 = new Class254[var10001];
               var10003 = true;
               this.vn = var5;

               for(var10000 = var2 = 5 >> 3; var10000 < this.vn.length; var10000 = var2) {
                  this.vn[var2] = new Class254(Class439.this.gk());
                  this.vn[var2].setBounds(58 + var2 % --4 * 138, 105 + var2 / --4 * 165, 115, 150);
                  this.va.add(this.vn[var2++]);
               }

               var10001 = --4;
               this.tj = Class133.b(411, 62, 110, 19, Color.black, Class681.ak);
               this.tj.setText("斩妖积分");
               this.va.add(this.tj);
               var4 = new Class322[var10001];
               var10003 = true;
               this.kh = var4;

               <undefinedtype> var7;
               for(var10000 = var2 = 5 >> 3; var10000 < this.kh.length; var10000 = var2) {
                  if (var2 != 0 && var2 != 3 >> 1) {
                     this.kh[var2] = new Class322(var2 == (1 ^ 3) ? "sc/e/42.png" : "sc/e/43.png", 1, 167 + var2, Class439.this.gk());
                     var7 = this;
                     this.kh[var2].setBounds(269 + (var2 - (5 >> 1)) * 82, 430, 18, 18);
                  } else {
                     var3 = this.kh;
                     var10002 = new Class322;
                     var10005 = 3 & 5;
                     var10006 = 167 + var2;
                     var10007 = Class681.bm;
                     if (var2 == 0) {
                        var10009 = "首页";
                        var10010 = Class439.this;
                     } else if (var2 == (4 ^ 5)) {
                        var10009 = "末页";
                        var10010 = Class439.this;
                     } else {
                        var10009 = "";
                        var10010 = Class439.this;
                     }

                     var3[var2] = var10002;
                     var7 = this;
                     this.kh[var2].setBounds(232 + var2 * 140, 430, 34, 18);
                  }

                  var7.va.add(this.kh[var2++]);
               }

               var4 = new Class322[--2];
               var10003 = true;
               this.vj = var4;

               for(var10000 = var2 = 3 ^ 3; var10000 < this.vj.length; var10000 = var2) {
                  this.vj[var2] = new Class322("sc/e/31.png", 3 >> 1, 171 + var2, Class681.ak, Class681.c, "兑换", Class439.this.gk());
                  this.vj[var2].setBounds(415, 156 + var2 * 150, 79, 25);
                  this.ve.add(this.vj[var2++]);
               }

               JLabel[] var8 = new JLabel[10];
               var10003 = true;
               this.ai = var8;

               for(var10000 = var2 = 2 & 5; var10000 < this.ai.length; var10000 = var2) {
                  this.ai[var2] = Class133.b(150, 100 + 150 * var2, 100, 19, Color.black, Class681.ak);
                  this.ai[var2].setText(var2 != 0 && var2 != (3 & 5) ? (var2 != (1 ^ 3) && var2 != --5 ? (var2 != --3 && var2 != 6 ? (var2 != --4 && var2 != 7 ? (var2 == 8 ? "【人物经验】" : (var2 == 9 ? "【勇者积分】" : "")) : "获得") : "兑换") : "拥有") : "伏魔令");
                  this.ai[var2].setHorizontalAlignment(3 ^ 3);
                  if (var2 >= 5 >> 1 && var2 <= --4) {
                     var7 = this;
                     this.ai[var2].setBounds(263, 132 + (var2 - --2) * 27, 36, 19);
                  } else if (var2 >= 5 && var2 <= 7) {
                     var7 = this;
                     this.ai[var2].setBounds(263, 283 + (var2 - 5) * 27, 36, 19);
                  } else {
                     if (var2 >= 8 && var2 <= 9) {
                        this.ai[var2].setHorizontalAlignment(10);
                        this.ai[var2].setFont(Class681.ab);
                        this.ai[var2].setBounds(300, 206 + (var2 - 8) * 150, 80, 14);
                     }

                     var7 = this;
                  }

                  var7.ve.add(this.ai[var2++]);
               }

               this.vd = new RichLabel("", Class681.ab);
               this.vd.setTextSize("#c000000温馨提示：#r1、每张伏魔令可兑换的人物经验与兑换时的人物等级有关。#r2、每张伏魔令可兑换的勇者积分，根据价格规律浮动。", 360);
               this.vd.setBounds(149, 385, this.vd.getWidth(), this.vd.getHeight());
               this.ve.add(this.vd);
               this.rr = new MoneyType();
               this.rr.setIdAndKey(2 & 5, "伏魔令");
               Class319[] var10 = new Class319[2];
               var10003 = true;
               this.vl = var10;
               Class556[] var11 = new Class556[2];
               var10003 = true;
               this.vi = var11;
               Class217[] var12 = new Class217[2];
               var10003 = true;
               this.vm = var12;
               Class245[] var13 = new Class245[2];
               var10003 = true;
               this.vg = var13;

               for(var10000 = var2 = 5 >> 3; var10000 < 2; var10000 = var2) {
                  this.vi[var2] = Class133.m(305, 132 + 150 * var2, 94, 19, 10, Color.white, Class681.q, this.rr, Class439.this.aej);
                  this.vm[var2] = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, false), Class681.q, Color.white);
                  this.vg[var2] = Class133.a(305, 186 + 150 * var2, 94, 19, 10, Color.white, Class681.q);
                  this.vm[var2].setBounds(305, 159 + 150 * var2, 94, 19);
                  this.vi[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
                  this.vg[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
                  this.vi[var2].ab(2);
                  this.ve.add(this.vm[var2]);
                  this.ve.add(this.vg[var2]);
                  this.ve.add(this.vi[var2]);
                  Class319[] var16 = this.vl;
                  int var10004 = var2;
                  Class319 var15 = new Class319(15, this.vm[var2], Class439.this.gk());
                  ++var2;
                  var16[var10004] = var15;
               }

               Class436[] var14 = new Class436[5];
               var10003 = true;
               this.v = var14;

               for(var10000 = var2 = 0; var10000 < this.v.length; var10000 = var2) {
                  this.v[var2] = new Class436();
                  if (var2 >= 0 && var2 <= 1) {
                     if (var2 == 0) {
                        var7 = this;
                        this.v[var2].fw("sc/d/77.png");
                     } else {
                        if (var2 == 1) {
                           this.v[var2].fw("sc/d/78.png");
                        }

                        var7 = this;
                     }

                     var7.v[var2].setBounds(154, 123 + var2 * 150, 92, 92);
                     var7 = this;
                  } else if (var2 >= 2 && var2 <= 3) {
                     var7 = this;
                     this.v[var2].eq(Class511.q("sc/d/4.png", 5, 5, 5, 5, false));
                     this.v[var2].setBounds(150, 119 + (var2 - 2) * 150, 100, 100);
                  } else {
                     if (var2 == 4) {
                        this.v[var2].eq(Class511.q("sc/d/66.png", 80, 1, 80, 1, false));
                        this.v[var2].setBounds(112, 237, 416, 2);
                     }

                     var7 = this;
                  }

                  var7.ve.add(this.v[var2++]);
               }

               this.vk = new Class436(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
               this.vk.setBounds(43, 84, 550, 374);
               this.add(this.vk);
               this.setBounds(0, 0, 620, 479);
            }
         }, 4 ^ 5);
      }

   }
}
