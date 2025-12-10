package com.xy;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.table.DefaultTableCellRenderer;

public class Class11 extends Class345 {
   private long zd;
   private Class436[] il;
   private <undefinedtype>[] agv;
   private Class94 agw;
   private Class436 r;
   private <undefinedtype> agx;
   private int cy;
   private <undefinedtype> cx;

   public void d() {
      if (Class280.f() - this.zd >= (long)(Class280.i * --5)) {
         this.zd = Class280.f();
         Activity var1;
         int var2;
         ActivityFC var3 = (var2 = Class394.an((var1 = this.agw.kd()).getActivitySet(), "赛制设置=", "|")) > 0 ? this.vc().m(var2) : null;
         BWDHRule var5 = var3 != null && var3.getType() == --5 ? (BWDHRule)var3.getData() : null;

         int var6;
         for(int var10000 = var6 = 2 & 5; var10000 < this.agv.length; var10000 = var6) {
            <undefinedtype> var7 = this.agv[var6];
            Point[] var10001;
            Activity var10002;
            if (var5 != null) {
               var10001 = var5.getRuleTimes((1 ^ 3) + var6);
               var10002 = var1;
            } else {
               var10001 = null;
               var10002 = var1;
            }

            var7.ik(var10001, var10002);
            ++var6;
         }

         var6 = var5 != null ? var5.getRuleIndex((Class280.f() - var1.getTimeOpen()) / 1000L) : 0;
         var6 = Math.max(Math.min(var6 - (5 >> 1), --3), 3 & 4);
         String var4 = Agreement.getSendTextAES("activity", var1.getId() + "|M" + (var6 + (5 >> 1)));
         this.uw().d(var4);
      }
   }

   public void wy(int var1, Object var2) {
      int var10000 = 3 >> 2;
      this.cy = var1;

      for(var1 = var10000; var10000 < this.agv.length; var10000 = var1) {
         if (this.agv[var1].ij((boolean)(var1 == this.cy ? 2 ^ 3 : 0))) {
            this.agv[var1].fw(this.agv[var1].op ? "sc/d/130.png" : "sc/d/131.png");
         }

         <undefinedtype> var3 = this.agv[var1];
         int var10001 = (var1 >= this.cy ? 61 & 123 : 47) + 93 * var1;
         int var10002;
         Class11 var10003;
         if (this.agv[var1].op) {
            var10002 = 51 & 127;
            var10003 = this;
         } else {
            var10002 = 52;
            var10003 = this;
         }

         int var4 = var10003.agv[var1].op ? 29919 & 2990 : 140;
         ++var1;
         var3.setBounds(var10001, var10002, var4, 40);
      }

      if (this.cy == 0) {
         this.cx.oe((BWDHTeam[])var2);
         this.cx.setVisible((boolean)(--1));
         this.agx.setVisible((boolean)(3 & 4));
      } else {
         this.agx.wn.setVisible((boolean)(this.cy == 5 >> 2 ? 4 ^ 5 : 0));
         this.agx.ph((BWDHRuleBattleRecord[])var2);
         this.agx.setVisible((boolean)(4 ^ 5));
         this.cx.setVisible((boolean)(5 >> 3));
      }
   }

   public void y(int var1) {
      if (Class280.f() - this.zd < (long)(Class280.i * --5)) {
         this.aej.f("你点击的太快了");
      } else {
         this.zd = Class280.f();
         Activity var2 = this.agw.kd();
         String var3 = Agreement.getSendTextAES("activity", var2.getId() + "|M3#" + var1);
         this.uw().d(var3);
      }
   }

   public void c(int var1, Object var2) {
      Activity var3;
      int var4;
      String var5;
      if (var1 == (3823 & 29105)) {
         var3 = this.agw.kd();
         var4 = (Integer)var2;
         var5 = Agreement.getSendTextAES("activity", var3.getId() + "|C" + var4);
         this.uw().d(var5);
      } else {
         if (var1 == (19638 & 13291)) {
            var3 = this.agw.kd();
            var4 = (Integer)var2;
            var5 = Agreement.getSendTextAES("activity", var3.getId() + "|c" + var4);
            this.uw().d(var5);
         }

      }
   }

   public void wz(int var1, BWDHRuleBattleRecord[] var2) {
      this.wy(3 >> 1, var2);
      this.agx.wn.fa().setText(var1 == 0 ? "16强抢位赛" : (var1 == --1 ? "8强抢位赛" : "4强抢位赛"));
   }

   public Class11(Class94 var1) {
      int var10001 = --4;
      int var10005 = 3 ^ 3;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1.aej);
      this.va(var10005, 2 & 5, 30670 & 2815, 3998 & 29295, Class345.aei);
      this.agw = var1;
      <undefinedtype>[] var4 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.agv = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < this.agv.length; var10000 = var2) {
         this.agv[var2] = new MouseListener(var2) {
            private JLabel d;
            private JLabel ir;
            private int cy;
            private boolean op;

            public boolean ij(boolean var1) {
               if (var1 == this.op) {
                  return (boolean)(3 & 4);
               } else {
                  this.op = var1;
                  if (var1) {
                     this.ir.setForeground(Color.white);
                     this.d.setForeground(Color.white);
                     this.ir.setBounds(5 >> 3, --4, 29918 & 2991, 125 & 22);
                     this.d.setBounds(3 & 4, 126 & 19, 16638 & 16271, 84 & 63);
                  } else {
                     this.ir.setForeground(Class681.c("#c462803"));
                     this.d.setForeground(Class681.c("#c462803"));
                     this.ir.setBounds(123 & 44, --3, 95 & 125, 62 & 85);
                     this.d.setBounds(110 & 57, 53 & 91, 95 & 125, 95 & 52);
                  }

                  return true;
               }
            }

            public void ik(Point[] var1, Activity var2) {
               if (var1 == null) {
                  this.im("00.00-00.00");
               } else {
                  long var3 = var2.getTimeOpen() + (long)var1[3 >> 2].x * 1000L;
                  long var5 = var2.getTimeOpen() + (long)var1[var1.length - (4 ^ 5)].y * 1000L;
                  this.im(Class280.c(var3, "MM.dd") + "-" + Class280.c(var5, "MM.dd"));
               }
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
            }

            public {
               int var10004 = 44 & 123;
               int var10006 = 57 & 110;
               this.cy = var2;
               this.ir = Class133.b(var10006, --3, 95 & 125, 31 & 116, Class681.c("#c462803"), Class681.ak);
               this.d = Class133.b(var10004, 123 & 21, 93 & 127, 61 & 86, Class681.c("#c462803"), Class681.bm);
               this.ir.setHorizontalAlignment(5 >> 3);
               this.d.setHorizontalAlignment(3 & 4);
               this.ir.setText(var2 == 0 ? "积分赛" : (var2 == 5 >> 2 ? "入围赛" : (var2 == --2 ? "半决赛" : "总决赛")));
               this.add(this.ir);
               this.add(this.d);
               this.addMouseListener(this);
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (!Class280.j()) {
                  Activity var2 = Class11.this.agw.kd();
                  String var3 = Agreement.getSendTextAES("activity", var2.getId() + "|M" + (this.cy + --2));
                  Class11.this.uw().d(var3);
               }
            }

            public void im(String var1) {
               if (!Class394.r(var1, this.d.getText())) {
                  this.d.setText(var1);
               }
            }
         };
         this.agv[var2].fw("sc/d/131.png");
         this.agv[var2].setBounds((127 & 47) + var2 * (125 & 95), 53 & 126, 11151 & 21756, 104 & 63);
         this.add(this.agv[var2++]);
      }

      var10001 = --2;
      this.cx = new Class456() {
         private Vector<Vector<Object>> nw;
         private JScrollPane nk;
         private JTable ws;

         public void oe(BWDHTeam[] var1) {
            int var10000 = 3 >> 2;
            this.nw.clear();

            for(int var4 = var10000; var10000 < var1.length; var10000 = var4) {
               BWDHTeam var3 = var1[var4];
               Vector var2;
               (var2 = new Vector()).add(String.valueOf(var4 + (4 ^ 5)));
               var2.add(var3.getName());
               var2.add(String.valueOf(var3.getData2()[3 >> 2]));
               var2.add(String.valueOf(var3.getData2()[4 ^ 5]));
               var2.add(String.valueOf(var3.getData2()[1 ^ 3]));
               var2.add(String.valueOf(var3.getData2()[--3]));
               var2.add(String.valueOf(var3.getData2()[--4]));
               var2.add(String.valueOf(var3.getData2()[--5]));
               ++var4;
               this.nw.addElement(var2);
            }

            if (this.ws.getRowCount() > 0) {
               this.ws.setRowSelectionInterval(3 & 4, 3 & 4);
            }

            this.ws.updateUI();
            JScrollBar var5 = this.nk.getVerticalScrollBar();
            int var10001 = 3 >> 2;
            var5.setMaximum(this.ws.getHeight());
            var5.setValue(var10001);
         }

         public {
            Vector var2 = new Vector();
            var2.addElement("排名");
            var2.addElement("队伍名");
            var2.addElement("积分");
            var2.addElement("胜场");
            var2.addElement("负场");
            var2.addElement("回合数");
            var2.addElement("召唤兽消耗");
            var2.addElement("灵宝消耗");
            this.nw = new Vector();
            int[] var10010 = new int[71 & 63];
            boolean var10012 = true;
            var10010[3 >> 2] = 117 & 78;
            var10010[--1] = 90 & 117;
            var10010[5 >> 1] = 62 & 125;
            var10010[--3] = 60 & 127;
            var10010[--4] = 127 & 60;
            var10010[--5] = 94 & 123;
            var10010[31 & 102] = 90 & 127;
            this.ws = Class133.e(this.nw, var2, Class681.ce, Color.white, var10010);
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

                     <undefinedtype> var10000;
                     if (var3 != 0) {
                        super.setBackground(Class681.bk);
                        var10000 = this;
                     } else {
                        super.setBackground(Class681.cu);
                        var10000 = this;
                     }

                     var10000.setForeground(var5 < (112 & 47) ? Color.black : Color.red);
                     this.setFont(var1.getFont());
                     this.setValue(var2);
                     return this;
                  }
               }
            }).setHorizontalAlignment(5 >> 3);
            this.ws.setDefaultRenderer(Object.class, var3);
            this.nk = Class133.f(114 & 61, 127 & 95, 8159 & 25203, 24445 & 8679, this.ws, 53 & 94);
            this.nk.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/106.png", --3, --3, --3, --3, (boolean)(2 & 5)), 10 & 125));
            this.add(this.nk);
         }
      };
      this.agx = new Class456() {
         private JLabel[] iv;
         private JScrollPane fe;
         private JComponent ko;
         private List<null> lq;
         private Class659 wn;

         public void ph(BWDHRuleBattleRecord[] var1) {
            int var10000;
            int var10001;
            int var2;
            for(var10000 = var2 = 2 & 5; var10000 < var1.length; var10000 = var2) {
               Object var3 = var2 < this.lq.size() ? (<undefinedtype>)this.lq.get(var2) : null;
               if (var3 == null) {
                  var3 = new Class436() {
                     // $FF: synthetic field
                     final Class11 oo;
                     private JLabel[] hj;
                     private Class379 sl;
                     private Class379 hp;
                     private Class436 ih;

                     public void aet(BWDHRuleBattleRecord var1) {
                        <undefinedtype> var10000;
                        BWDHRuleBattle var2;
                        if ((var2 = var1.getBwdhRuleBattle()).getType() == 0) {
                           var10000 = this;
                           this.hj[5 >> 3].setText("16强抢位赛第" + var1.getIndex() + "轮");
                        } else if (var2.getType() == 3 >> 1) {
                           var10000 = this;
                           this.hj[5 >> 3].setText("8强抢位赛第" + var1.getIndex() + "轮");
                        } else if (var2.getType() == (1 ^ 3)) {
                           var10000 = this;
                           this.hj[3 & 4].setText("4强抢位赛第" + var1.getIndex() + "轮");
                        } else if (var2.getType() == --3) {
                           var10000 = this;
                           this.hj[3 >> 2].setText("半决赛第" + var1.getIndex() + "轮");
                        } else if (var2.getType() == --4) {
                           var10000 = this;
                           this.hj[3 & 4].setText("季殿争夺赛第" + var1.getIndex() + "轮");
                        } else {
                           if (var2.getType() == --5) {
                              this.hj[3 & 4].setText("冠亚争夺赛第" + var1.getIndex() + "轮");
                           }

                           var10000 = this;
                        }

                        var10000.hj[5 >> 2].setText(var2.getBwdhTeam1().getName());
                        this.hj[--3].setText(var2.getBwdhTeam2().getName());
                        this.hp.setName(String.valueOf(var1.getId()));
                        this.sl.setName(String.valueOf(var1.getId()));
                        BWDHRuleBattleRecord var3;
                        if (var1.getType() == 0) {
                           var3 = var1;
                           this.sl.setText("未开始");
                        } else if (var1.getType() == --1) {
                           var3 = var1;
                           this.sl.setText("直播");
                        } else if (var1.getWin() != (2 ^ 3) && var1.getWin() != --2) {
                           if (var1.getWin() == --5) {
                              var3 = var1;
                              this.sl.setText("无效");
                           } else {
                              this.sl.setText("已结束");
                              var3 = var1;
                           }
                        } else {
                           this.sl.setText("录像");
                           var3 = var1;
                        }

                        if (var3.getType() == --2) {
                           if (var1.getWin() == (2 ^ 3)) {
                              this.ih.fw("sc/d/144.png");
                              this.ih.setBounds(23982 & 8921, --5, 123 & 31, 126 & 25);
                              return;
                           }

                           if (var1.getWin() == --2) {
                              this.ih.fw("sc/d/144.png");
                              this.ih.setBounds(22015 & 11119, --5, 31 & 123, 126 & 25);
                              return;
                           }

                           if (var1.getWin() == --3) {
                              this.ih.fw("sc/d/195.png");
                              this.ih.setBounds(23496 & 9407, --5, 63 & 91, 57 & 94);
                              return;
                           }

                           if (var1.getWin() == --4) {
                              this.ih.fw("sc/d/195.png");
                              this.ih.setBounds(29183 & 3951, --5, 27 & 127, 120 & 31);
                           }
                        }

                     }

                     public {
                        int var10001 = --4;
                        this.oo = var1;
                        super(Class511.q("sc/d/142.png", 118 & 29, 90 & 47, 118 & 29, 90 & 47, (boolean)(5 >> 3)));
                        this.ih = new Class436();
                        this.add(this.ih);
                        JLabel[] var4 = new JLabel[var10001];
                        boolean var10003 = true;
                        this.hj = var4;

                        int var2;
                        for(int var10000 = var2 = 3 & 4; var10000 < this.hj.length; var10000 = var2) {
                           this.hj[var2] = Class133.b(15 & 124, 43 & 94, 14230 & 18667, 119 & 28, Color.black, Class681.q);
                           <undefinedtype> var3;
                           if (var2 == 5 >> 2) {
                              var3 = this;
                              this.hj[var2].setHorizontalAlignment(--4);
                              this.hj[var2].setBounds(19127 & 13787, 42 & 95, 127 & 100, 55 & 92);
                           } else if (var2 == 5 >> 1) {
                              var3 = this;
                              this.hj[var2].setText("VS");
                              this.hj[var2].setBounds(4517 & 28507, 46 & 91, 27 & 118, 61 & 86);
                           } else {
                              if (var2 == --3) {
                                 this.hj[var2].setHorizontalAlignment(31 & 106);
                                 this.hj[var2].setBounds(285, 10, 100, 20);
                              }

                              var3 = this;
                           }

                           var3.add(this.hj[var2++]);
                        }

                        this.hp = new Class379("sc/e/167.png", 3 & 5, 161, Class681.ab, (Color[])null, "查看", var1.gk());
                        this.hp.setBounds(417, 12, 61, 18);
                        this.sl = new Class379("sc/e/167.png", 3 & 5, 162, Class681.ab, (Color[])null, "未开始", var1.gk());
                        this.sl.setBounds(505, 12, 61, 18);
                        this.add(this.hp);
                        this.add(this.sl);
                     }
                  };
                  this.lq.add(var3);
                  this.ko.add((Component)var3);
               }

               var10001 = 5 >> 2;
               int var10003 = 3 ^ 3;
               ((<undefinedtype>)var3).aet(var1[var2]);
               int var10004 = (123 & 46) * var2;
               int var10005 = 24133 & 9214;
               ++var2;
               ((<undefinedtype>)var3).setBounds(var10003, var10004, var10005, 106 & 63);
               ((<undefinedtype>)var3).setVisible((boolean)var10001);
            }

            for(var10000 = var2 = var1.length; var10000 < this.lq.size(); var10000 = var2) {
               Object var5 = this.lq.get(var2);
               ++var2;
               ((<undefinedtype>)var5).setVisible((boolean)(5 >> 3));
            }

            this.ko.setPreferredSize(new Dimension(9796 & 23551, (42 & 127) * var1.length));
            JScrollBar var4 = this.fe.getVerticalScrollBar();
            var10001 = 5 >> 3;
            var4.setMaximum(this.ko.getHeight());
            var4.setValue(var10001);
         }

         public {
            int var10001 = --4;
            this.wn = new Class659(--2, 124 & 103, Class11.this.gk());
            this.wn.gb((boolean)(2 ^ 3));
            this.wn.vf(23358 & 9959, 111 & 87, 124 & 103, 91 & 55);
            this.wn.amy(new Class367("16强抢位赛", 2 & 5));
            this.wn.amy(new Class367("8强抢位赛", 3 >> 1));
            this.wn.amy(new Class367("4强抢位赛", 5 >> 1));
            this.wn.fa().setText("16强抢位赛");
            this.add(this.wn);
            JLabel[] var4 = new JLabel[var10001];
            boolean var10003 = true;
            this.iv = var4;

            int var2;
            for(int var10000 = var2 = 3 ^ 3; var10000 < this.iv.length; var10000 = var2) {
               this.iv[var2] = Class133.b(121 & 54, 127 & 95, 18641 & 14271, 55 & 93, Color.white, Class681.ak);
               this.iv[var2].setText(var2 == 0 ? "比赛" : (var2 == 5 >> 2 ? "对阵" : (var2 == --2 ? "队伍" : (var2 == --3 ? "观看" : ""))));
               this.iv[var2].setHorizontalAlignment(5 >> 3);
               <undefinedtype> var3;
               if (var2 == (3 & 5)) {
                  var3 = this;
                  this.iv[var2].setBounds(12503 & 20457, 127 & 95, 7935 & 25077, 85 & 63);
               } else if (var2 == --2) {
                  var3 = this;
                  this.iv[var2].setBounds(13823 & 19411, 127 & 95, 61 & 127, 21);
               } else {
                  if (var2 == --3) {
                     this.iv[var2].setBounds(555, 95, 61, 21);
                  }

                  var3 = this;
               }

               var3.add(this.iv[var2++]);
            }

            this.ko = new JComponent() {
            };
            this.fe = Class133.f(50, 118, 593, 336, this.ko, 20);
            this.fe.getVerticalScrollBar().setUI(new Class179(Class511.q("sc/d/106.png", --3, --3, --3, --3, (boolean)(5 >> 3)), 8));
            this.add(this.fe);
            this.lq = new ArrayList();
         }
      };
      this.cx.setBounds(3 & 4, 3 & 4, 2783 & 30702, 28527 & 4766);
      this.agx.setBounds(2 & 5, 2 & 5, 26319 & 7166, 19342 & 13951);
      this.add(this.cx);
      this.add(this.agx);
      Class436[] var5 = new Class436[var10001];
      var10003 = true;
      this.il = var5;

      for(var10000 = var2 = 3 & 4; var10000 < this.il.length; var10000 = var2) {
         this.il[var2] = new Class436();
         Class11 var3;
         if (var2 == 0) {
            var3 = this;
            this.il[var2].eq(Class511.q("sc/d/105.png", --3, --3, --3, --3, (boolean)(2 & 5)));
            this.il[var2].setBounds(26623 & 6780, 126 & 119, 46 & 87, 29683 & 3420);
         } else {
            if (var2 == (3 & 5)) {
               this.il[var2].eq(Class511.q("sc/d/143.png", 107 & 30, 107 & 30, 107 & 30, 107 & 30, (boolean)(3 ^ 3)));
               this.il[var2].setBounds(48, 95, 601, 21);
            }

            var3 = this;
         }

         var3.add(this.il[var2++]);
      }

      this.r = new Class436(Class511.q("sc/d/132.png", 50, 50, 50, 50, (boolean)(2 & 5)));
      this.r.setBounds(41, 88, 615, 376);
      this.add(this.r);
   }
}
