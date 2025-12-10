package com.xy;

import com.xy.bean.Coordinates;
import com.xy.bean.RoleShow;
import com.xy.game.RoleData;
import com.xy.readbean.ActiveAward;
import com.xy.readbean.ActiveBase;
import com.xy.readbean.AllActive;
import com.xy.richtext.RichLabel;
import com.xy.script.ScriptOpen;
import com.xy.script.ScriptTask;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class665 extends Class345 {
   private JLabel[] aer;
   private JScrollPane w;
   private List<null> abd;
   private JComponent aky;
   private static Image gd;
   private static Image xs;
   private int ay;
   private RichLabel bv;
   private Class245 yl;
   private JScrollPane dw;
   private Class436[] g;

   public int acg(String var1, String var2) {
      String var10000 = var1;
      var1 = var1.replace(var2, "");
      return var10000.length() - var1.length();
   }

   public Class665(GameView var1) {
      int var10001 = 7 & 127;
      int var10006 = -4 >> 2;
      int var10008 = 3 >> 2;
      super(110 & 57, --2, Class345.aef, var1);
      this.ay = var10008;
      this.va(var10006, 2 & 5, 22239 & 11183, 16359 & 16889, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 111 & 84, 111 & 84, 111 & 84, 111 & 84, (boolean)(3 ^ 3)), "活动");
      this.abd = new ArrayList();
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.aer = var4;

      int var10000;
      int var2;
      Class665 var3;
      for(var10000 = var2 = 3 >> 2; var10000 < this.aer.length; var10000 = var2) {
         this.aer[var2] = Class133.c(126 & 45, 127 & 33, 127 & 90, 95 & 55, 3 ^ 3, Class681.c("#c000000"), Class681.ak);
         this.aer[var2].setText(var2 == 0 ? "每日活动" : (var2 == --1 ? "活动时间于每日凌晨     刷新" : (var2 == (1 ^ 3) ? "24:00" : (var2 == --3 ? "活动列表" : (var2 == --4 ? "活动详情" : (var2 == --5 ? "活跃度" : (var2 == (55 & 78) ? "当前活跃度" : "")))))));
         if (var2 == 0) {
            var3 = this;
            this.aer[var2].setFont(Class681.cf);
            this.aer[var2].setForeground(Class681.c("#cFFFFFF"));
         } else if (var2 == 3 >> 1) {
            var3 = this;
            this.aer[var2].setHorizontalAlignment(26 & 111);
            this.aer[var2].setBounds(3046 & 30105, 111 & 54, 12538 & 20479, 23 & 123);
         } else if (var2 == --2) {
            var3 = this;
            this.aer[var2].setHorizontalAlignment(31 & 106);
            this.aer[var2].setBounds(537, 38, 50, 19);
            this.aer[var2].setForeground(Class681.c("#cFF0000"));
         } else {
            label127: {
               if (var2 != --3 && var2 != --4) {
                  if (var2 == --5) {
                     var3 = this;
                     this.aer[var2].setBounds(71, 423, 59, 18);
                     break label127;
                  }

                  if (var2 == 6) {
                     this.aer[var2].setBounds(511, 418, 97, 18);
                  }
               } else {
                  this.aer[var2].setForeground(Class681.c("#cFFFFFF"));
                  if (var2 == --3) {
                     var3 = this;
                     this.aer[var2].setBounds(52, 62, 385, 21);
                     break label127;
                  }

                  if (var2 == --4) {
                     var3 = this;
                     this.aer[var2].setBounds(440, 62, 180, 21);
                     break label127;
                  }
               }

               var3 = this;
            }
         }

         var3.add(this.aer[var2++]);
      }

      this.yl = Class133.a(524, 438, 71, 19, 3 & 4, Color.white, Class681.q);
      this.yl.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
      this.add(this.yl);
      this.aky = new JComponent() {
      };
      this.bv = new RichLabel("", Class681.ce);
      this.w = Class133.f(54, 84, 383, 310, this.aky, 20);
      this.dw = Class133.f(442, 84, 178, 310, this.bv, 20);
      this.add(this.w);
      this.add(this.dw);
      Class436[] var5 = new Class436[8];
      var10003 = true;
      this.g = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.g[var2].fw("sc/d/34.png");
            this.g[var2].setBounds(44, 33, 177, 23);
         } else if (var2 == (4 ^ 5)) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 & 4)));
            this.g[var2].setBounds(52, 62, 385, 21);
         } else if (var2 == (1 ^ 3)) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
            this.g[var2].setBounds(440, 62, 180, 21);
         } else if (var2 == --3) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
            this.g[var2].setBounds(52, 62, 385, 332);
         } else if (var2 == 4) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
            this.g[var2].setBounds(440, 62, 180, 332);
         } else if (var2 == 5) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 >> 2)));
            this.g[var2].setBounds(42, 27, 587, 380);
         } else if (var2 == 6) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/67.png", 3, 3, 3, 3, (boolean)(3 & 4)));
            this.g[var2].setBounds(133, 429, 342, 8);
         } else {
            if (var2 == 7) {
               this.g[var2].eq(Class511.q("sc/d/17.png", 3, 3, 3, 3, (boolean)(3 ^ 3)));
               this.g[var2].setBounds(132, 428, 344, 10);
            }

            var3 = this;
         }

         var3.add(this.g[var2++]);
      }

   }

   public synchronized void s() {
      RoleData var8;
      if ((var8 = this.vd()) != null) {
         AllActive var5;
         if ((var5 = this.vc().w()) != null) {
            this.ay = 3 >> 2;
            int var6 = this.aky.getComponentCount();
            ActiveBase[] var4 = var5.getBases();

            int var1;
            int var2;
            int var10000;
            int var10001;
            int var10002;
            for(var10000 = var2 = 5 >> 3; var10000 < var4.length; var10000 = var2) {
               ActiveBase var3 = var4[var2];
               Object var7 = null;
               RoleData var14;
               if (var2 < var6) {
                  var7 = (<undefinedtype>)this.aky.getComponent(var2);
                  var14 = var8;
               } else {
                  var7 = new MouseListener() {
                     public ActiveBase ar;
                     private JLabel as;
                     private JLabel at;
                     private JLabel d;
                     private Class436 av;
                     private Class322 aw;
                     private JLabel ax;

                     public void mouseExited(MouseEvent var1) {
                     }

                     public {
                        int var10008 = 3 & 4;
                        this.setPreferredSize(new Dimension(1523 & 31615, 125 & 63));
                        this.setOpaque((boolean)var10008);
                        this.setLayout((LayoutManager)null);
                        this.aw = new Class322("sc/e/7.png", 3 >> 1, 15518 & 17403, Class681.ak, Class681.c, "前往", Class665.this.gk());
                        this.aw.bq(this);
                        this.aw.setBounds(1839 & 31223, 20 & 127, 59 & 127, 89 & 63);
                        this.add(this.aw);
                        this.av = new Class436();
                        this.av.setBounds(59 & 78, 59 & 78, 109 & 63, 46 & 125);
                        this.add(this.av);
                        this.ax = new JLabel();
                        this.ax.setBounds(123 & 61, 41 & 95, 101 & 126, 125 & 22);
                        this.ax.setFont(Class681.bm);
                        this.ax.setForeground(Color.white);
                        this.add(this.ax);
                        this.as = new JLabel();
                        this.as.setBounds(127 & 57, 62 & 99, 100, 20);
                        this.as.setFont(Class681.bm);
                        this.as.setForeground(Color.white);
                        this.add(this.as);
                        this.at = new JLabel();
                        this.at.setBounds(152, 9, 150, 20);
                        this.at.setFont(Class681.bm);
                        this.at.setForeground(Color.white);
                        this.add(this.at);
                        this.d = new JLabel();
                        this.d.setBounds(152, 34, 110, 20);
                        this.d.setFont(Class681.bm);
                        this.d.setForeground(Color.white);
                        this.add(this.d);
                        this.addMouseListener(this);
                     }

                     public void ai(ActiveBase var1, int var2) {
                        int var4 = (this.ar = var1).getNum();
                        StringBuffer var3;
                        (var3 = new StringBuffer()).append("日次数 ");
                        var3.append(var2);
                        var3.append("/");
                        var3.append(var4);
                        this.as.setText(var3.toString());
                        var3.setLength(5 >> 3);
                        int var5 = var1.getValue();
                        var3.append("活跃度 ");
                        int var10001;
                        int var10002;
                        if (var2 > var4) {
                           var10001 = var4;
                           var10002 = var5;
                        } else {
                           var10001 = var2;
                           var10002 = var5;
                        }

                        var3.append(var10001 * var10002);
                        var3.append("/");
                        var3.append(var4 * var5);
                        this.d.setText(var3.toString());
                        this.at.setText(var1.getHead());
                        this.ax.setText(var1.getaName());
                        this.av.hf(Class222.i(var1.getSkin()));
                        String var6 = var1.getGuide();
                        if (var6 != null && !"".equals(var6)) {
                           this.aw.setText(Class665.this.acg(var6, "-") == --3 ? "前往" : "自动");
                           this.aw.setVisible((boolean)(3 >> 1));
                        } else {
                           this.aw.setVisible((boolean)(5 >> 3));
                        }
                     }

                     protected void paintComponent(Graphics var1) {
                        super.paintComponent(var1);
                        if (Class665.xs == null) {
                           Class665.xs = Class511.a("sc/d/66.png");
                        }

                        if (Class665.gd == null) {
                           Class665.gd = Class511.a("sc/d/4.png");
                        }

                        var1.drawImage(Class665.xs, 45 & 95, 127 & 59, 9563 & 23549, --1, (ImageObserver)null);
                        var1.drawImage(Class665.gd, 11 & 126, 11 & 126, 111 & 61, 60 & 111, (ImageObserver)null);
                     }

                     public void mouseReleased(MouseEvent var1) {
                     }

                     public void mouseClicked(MouseEvent var1) {
                     }

                     public void mousePressed(MouseEvent var1) {
                        if (this.ar != null) {
                           Class665.this.bv.setTextSize(this.ar.getText(), 26016 & 6911);
                        }
                     }

                     public void mouseEntered(MouseEvent var1) {
                     }
                  };
                  var14 = var8;
                  this.aky.add((Component)var7);
               }

               var1 = var14.getTaskSystem().d(var3.getSid(), 5 >> 1);
               var10002 = 3 & 4;
               ((<undefinedtype>)var7).ai(var3, var1);
               ((<undefinedtype>)var7).setBounds(var10002, (3 >> 2) + var2 * (127 & 61), 18803 & 14335, 125 & 63);
               if (var3.getNum() < var1) {
                  var1 = var3.getNum();
               }

               var10001 = this.ay;
               int var10003 = var3.getValue();
               ++var2;
               this.ay = var10001 + var1 * var10003;
            }

            for(var10000 = var2 = var6 - (3 >> 1); var10000 >= var4.length; var10000 = var2) {
               this.aky.remove(var2--);
            }

            this.aky.setPreferredSize(new Dimension(26615 & 6523, (63 & 125) * var4.length));
            this.yl.setText(String.valueOf(this.ay));
            ActiveAward[] var9 = var5.getAwards();
            int var10 = (3028 & 30079) / var9.length;
            int var11 = var8.getTaskSystem().d(1 ^ 3, --3);
            var6 = this.abd.size();

            for(var10000 = var1 = 2 & 5; var10000 < var9.length; var10000 = var1) {
               var8 = null;
               Object var12;
               Object var15;
               if (var1 < var6) {
                  var15 = var12 = (<undefinedtype>)this.abd.get(var1);
               } else {
                  var12 = new Object(var1) {
                     JLabel a;
                     Class322 b;

                     public {
                        int var10002 = 2 & 5;
                        this.a = Class133.c(var10002, 3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, Color.black, Class681.bu);
                        this.b = new Class322("sc/b/B308.png", 2 ^ 3, 12255 & 20667, Class665.this.gk());
                        this.b.bq(var2);
                     }
                  };
                  this.add(((<undefinedtype>)var12).b);
                  var15 = var12;
                  this.add(((<undefinedtype>)var12).a);
                  this.abd.add(var12);
                  this.remove(this.g[126 & 7]);
                  this.remove(this.g[23 & 111]);
                  this.add(this.g[47 & 86]);
                  this.add(this.g[95 & 39]);
               }

               ((<undefinedtype>)var15).a.setText(String.valueOf(var9[var1].getActive()));
               ((<undefinedtype>)var12).b.setName(var9[var1].getValue());
               if (var9[var1].getActive() > this.ay) {
                  var15 = var12;
                  ((<undefinedtype>)var12).b.setBtn(-4 >> 2, "sc/b/B309.png");
               } else if ((var11 >> var1 & (2 ^ 3)) == 3 >> 1) {
                  var15 = var12;
                  ((<undefinedtype>)var12).b.setBtn(-4 >> 2, "sc/b/B310.png");
               } else {
                  var15 = var12;
                  ((<undefinedtype>)var12).b.setBtn(3 >> 1, "sc/b/B308.png");
               }

               ((<undefinedtype>)var15).b.setBounds((127 & 90) + var10 * (var1 + (4 ^ 5)), 26109 & 7070, 109 & 63, 38 & 125);
               var10001 = (94 & 123) + var10 * (var1 + (3 & 5));
               var10002 = 22015 & 11195;
               ++var1;
               ((<undefinedtype>)var12).a.setBounds(var10001, var10002, 45, 20);
            }

            for(var10000 = var1 = var6 - (5 >> 2); var10000 >= var9.length; var10000 = var1) {
               <undefinedtype> var13;
               <undefinedtype> var16 = var13 = (<undefinedtype>)this.abd.remove(var1);
               --var1;
               this.remove(var13.b);
               this.remove(var16.a);
            }

            this.g[6].setBounds(133, 429, (int)Math.min(342.0D, 342.0D * ((double)this.ay / 340.0D)), 8);
         }
      }
   }

   public void q() {
      this.s();
      super.q();
   }

   public void y(int var1) {
      RoleData var5;
      if ((var5 = this.vd()) != null) {
         int var10000;
         int var3;
         int var4;
         if (var1 == 5 >> 1) {
            var4 = var5.getTaskSystem().d(--2, --3);

            for(var10000 = var3 = 3 & 4; var10000 < this.abd.size(); var10000 = var3) {
               <undefinedtype> var7;
               if (Integer.parseInt((var7 = (<undefinedtype>)this.abd.get(var3)).a.getText()) > this.ay) {
                  var7.b.setBtn(-4 >> 2, "sc/b/B309.png");
               } else if ((var4 >> var3 & (4 ^ 5)) == (3 & 5)) {
                  var7.b.setBtn(-4 >> 2, "sc/b/B310.png");
               } else {
                  var7.b.setBtn(--1, "sc/b/B308.png");
               }

               ++var3;
            }

         } else {
            var4 = this.aky.getComponentCount();

            for(var10000 = var3 = 5 >> 3; var10000 < var4; var10000 = var3) {
               <undefinedtype> var2;
               if ((var2 = (<undefinedtype>)this.aky.getComponent(var3)).ar.getSid() == var1) {
                  int var6 = var5.getTaskSystem().d(var1, 1 ^ 3);
                  var2.ai(var2.ar, var6);
                  Class665 var8;
                  if (var2.ar.getNum() < var6) {
                     var8 = this;
                     var6 = var2.ar.getNum();
                  } else {
                     var8 = this;
                     this.ay += var2.ar.getValue();
                  }

                  var8.yl.setText(String.valueOf(this.ay));
                  this.y(5 >> 1);
                  return;
               }

               ++var3;
            }

         }
      }
   }

   public void d() {
      this.s();
   }

   public void c(int var1, Object var2) {
      if (var1 == (7326 & 25595)) {
         if (this.aej.getBattleScene() == null) {
            if (!this.aej.roleUnit.h()) {
               this.aej.f("你是队员无法操作");
            } else if (!this.aej.roleUnit.g()) {
               this.aej.f("你还在摆摊");
            } else {
               String[] var3;
               <undefinedtype> var8;
               if ((var3 = (var8 = (<undefinedtype>)var2).ar.getGuide().split("-")).length == --5) {
                  this.aej.automation.g(new ScriptTask(var3, var8.ar.getSid()));
               } else {
                  RoleShow var5 = this.aej.roleUnit.r;
                  Coordinates var6 = new Coordinates(Integer.parseInt(var3[3 & 4]), Integer.parseInt(var3[4 ^ 5]), Integer.parseInt(var3[5 >> 1]));
                  List var9;
                  if ((var9 = this.aej.getObjectArea().ca().d(var5.getMapid().intValue(), var5.getX(), var5.getY(), 3 & 4, var6.getMapID(), var6.getX(), var6.getY(), 3 ^ 3, 3 ^ 3, this.aej.roleData)) == null) {
                     this.aej.f("你所在位置无法达到目的地");
                  } else {
                     ScriptOpen var7 = new ScriptOpen(107 & 31, (long)Integer.parseInt(var3[--3]));
                     var9.add(2 & 5, var7);
                     this.aej.automation.b(var9);
                  }
               }
            }
         }
      } else {
         if (var1 == (11231 & 21691)) {
            String var4 = Agreement.getSendTextAES("taskN", "R2=" + (Integer)var2);
            this.uw().d(var4);
            this.aej.automation.setAutomationBtnRed(--5);
         }

      }
   }
}
