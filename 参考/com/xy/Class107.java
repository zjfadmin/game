package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Assist;
import com.xy.script.ScriptTask;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Class107 extends Class345 {
   private <undefinedtype> aya;
   private Border ayb;
   private Class322 nv;
   private Class322 vo;
   private Point ayc;
   private Class322 wq;
   private Class322 aw;
   private Class322 sa;

   public boolean bl() {
      List var6;
      if ((var6 = this.vc().w().getAssistList()) == null) {
         return (boolean)(3 >> 2);
      } else {
         Class107 var10000;
         label58: {
            label57: {
               try {
                  List var2;
                  if ((var2 = Class27.f("map/assist.txt")) != null && var2.size() != 0) {
                     int var5 = 3 ^ 3;
                     int var4 = 2 & 5;
                     int var12 = var5;

                     while(true) {
                        if (var12 >= var2.size()) {
                           break label57;
                        }

                        String var3;
                        if (!(var3 = ((String)var2.get(var5)).trim()).equals("")) {
                           int var1 = var3.indexOf("=");
                           boolean var7;
                           int var10001;
                           int var10002;
                           if (var7 = var3.startsWith("ON")) {
                              var10001 = 5 >> 1;
                              var10002 = var1;
                           } else {
                              var10001 = 3;
                              var10002 = var1;
                           }

                           int var8 = Integer.parseInt(var3.substring(var10001, var10002));
                           int var11 = Integer.parseInt(var3.substring(var1 + (4 ^ 5)));

                           for(var12 = var1 = 3 & 4; var12 < var6.size(); var12 = var1) {
                              Assist var9;
                              if ((var9 = (Assist)var6.get(var1)).getId() == var8) {
                                 var9.setOn(var7);
                                 var9.setNum(var11);
                                 var9.setId(var8);
                                 if (var1 != var4) {
                                    var6.remove(var1);
                                    var6.add(var4, var9);
                                 }

                                 ++var4;
                                 break;
                              }

                              ++var1;
                           }
                        }

                        ++var5;
                        var12 = var5;
                     }
                  }
               } catch (Exception var10) {
                  var10.printStackTrace();
               }

               var10000 = this;
               break label58;
            }

            var10000 = this;
         }

         var10000.ck(var6);
         return (boolean)(5 >> 2);
      }
   }

   public Long x(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         int var4 = 0;
         int var5 = this.aya.xh.size();

         for(int var10000 = var4; var10000 < var5; var10000 = var4) {
            Class602 var6;
            if ((var6 = (Class602)this.aya.xh.get(var4)).jj() == var3) {
               Assist var9;
               if ((var9 = var6.xh()) == null) {
                  return 0L;
               }

               long var7 = (long)var9.getMax();
               if (var1 > var7) {
                  return var7;
               }

               return null;
            }

            ++var4;
         }

         return 0L;
      }
   }

   public Class107(GameView var1) {
      int var10006 = -4 >> 2;
      super(17055 & 15857, 5 >> 1, Class345.aef, var1);
      this.va(var10006, 5 >> 3, 17279 & 16350, 16347 & 16831, Class345.aei);
      this.im("sc/b/S341.png");
      this.aw = new Class322("sc/b/B458.png", --1, 12799 & 20219, this);
      this.aw.setBounds(22256 & 11103, 8683 & 24436, 117 & 111, 127 & 30);
      this.add(this.aw);
      this.wq = new Class322("sc/b/B42.png", 4 ^ 5, 7677 & 25343, this);
      this.wq.setBounds(15357 & 17910, 9726 & 23399, 57 & 87, 57 & 87);
      this.add(this.wq);
      this.nv = new Class322("sc/b/B43.png", --1, 2559 & 30462, this);
      this.nv.setBounds(14072 & 19215, 31734 & 1391, 21 & 123, 21 & 123);
      this.add(this.nv);
      this.vo = new Class322("sc/e/40.png", --1, 255, "顶", this);
      this.vo.setBounds(540, 358, 18, 18);
      this.add(this.vo);
      this.sa = new Class322("sc/e/40.png", --1, 256, "底", this);
      this.sa.setBounds(560, 358, 18, 18);
      this.add(this.sa);
      this.aya = new JComponent() {
         private List<Class602> xh;
         private Class602 apd;
         private JComponent aib;
         private JList<Class602> ape;
         private JScrollPane dw;

         public {
            int var10008 = 2 & 5;
            this.setOpaque((boolean)var10008);
            this.setLayout((LayoutManager)null);
            this.aib = new JComponent() {
               protected void paintComponent(Graphics var1) {
                  Graphics2D var2 = (Graphics2D)var1;
                  var2.setComposite(Class8.n);
                  var2.setColor(Color.BLACK);
                  var2.fill(this.getBounds());
                  var2.dispose();
               }
            };
            this.aib.setBounds(3 & 4, 3 & 4, 24047 & 9210, 15340 & 17715);
            this.aib.addMouseListener(Class133.a);
            this.aib.setVisible((boolean)(5 >> 3));
            this.add(this.aib);
            int var10004 = 3 ^ 3;
            this.xh = new ArrayList();
            this.ape = new JList();
            this.ape.setFont(Class681.ad);
            this.ape.setBackground(Class681.cu);
            this.ape.setSelectionMode(2 & 5);
            this.dw = Class133.f(var10004, 2 & 5, 17390 & 15867, 25020 & 8035, this.ape, -4 >> 2);
            this.add(this.dw);
         }
      };
      this.aya.setBounds(213, 60, 490, 288);
      this.add(this.aya);
   }

   public void dp(int var1) {
      RoleData var2;
      int var3;
      String var4;
      if (var1 == (9979 & 23039)) {
         if ((var2 = this.vd()).getLimit("月卡") == null && var2.getLimit("季卡") == null) {
            this.aej.fw("该功能解锁需要月卡或季卡");
            return;
         }

         if (!this.aej.roleUnit.g()) {
            this.aej.f("你还在摆摊");
            return;
         }

         if (var2.getRoleSystem().getIsPk() == 5 >> 2 || var2.getRoleSystem().getIsGood() == (2 ^ 3)) {
            this.ayc = new Point(var2.getRoleSystem().getIsPk(), var2.getRoleSystem().getIsGood());
            var3 = 3 & 4;
            int var10000;
            if (var2.getRoleSystem().getIsPk() == (4 ^ 5)) {
               var10000 = 4 ^ 5;
               var2.getRoleSystem().setIsPk(2 & 5);
               var3 = var10000;
            }

            if (var2.getRoleSystem().getIsGood() == (4 ^ 5)) {
               var10000 = 3 >> 1;
               var2.getRoleSystem().setIsGood(3 >> 2);
               var3 = var10000;
            }

            if (var3 != 0) {
               var4 = Agreement.getSendTextAES("roleSystem", Class695.b().toJson(var2.getRoleSystem()));
               this.uw().d(var4);
            }
         }

         StringBuffer var6 = new StringBuffer();

         Iterator var5;
         for(Iterator var8 = var5 = this.aya.xh.iterator(); var8.hasNext(); var8 = var5) {
            Class602 var7 = (Class602)var5.next();
            var7.gb((boolean)(3 >> 1));
            if (var6.length() != 0) {
               var6.append("\r\n");
            }

            var6.append(var7.t() ? "ON" : "OFF");
            var6.append(var7.xh().getId());
            var6.append("=");
            var6.append(var7.e());
         }

         if (this.au(5 >> 3)) {
            Class27.l("map/assist.txt", var6.toString());
            return;
         }
      } else {
         if (var1 == (12031 & 20988)) {
            this.aej.automation.n((boolean)(3 ^ 3), 3 ^ 3);
            if (this.ayc != null) {
               var2 = this.vd();
               var3 = 3 & 4;
               if (this.ayc.x != var2.getRoleSystem().getIsPk()) {
                  var2.getRoleSystem().setIsPk(this.ayc.x == 0 ? 4 ^ 5 : 0);
                  var3 = 4 ^ 5;
               }

               if (this.ayc.y != var2.getRoleSystem().getIsGood()) {
                  var2.getRoleSystem().setIsGood(this.ayc.y == 0 ? --1 : 0);
                  var3 = --1;
               }

               if (var3 != 0) {
                  var4 = Agreement.getSendTextAES("roleSystem", Class695.b().toJson(var2.getRoleSystem()));
                  this.uw().d(var4);
               }

               this.ayc = null;
            }

            this.r((boolean)(5 >> 3));
            return;
         }

         if (var1 == (7165 & 25855)) {
            this.as(5 >> 3);
            return;
         }

         if (var1 == (2559 & 30462)) {
            this.as(3 & 5);
            return;
         }

         if (var1 == (8703 & 24319)) {
            this.as(1 ^ 3);
            return;
         }

         if (var1 == (12586 & 20437)) {
            this.as(--3);
         }
      }

   }

   public void r(boolean var1) {
      if (var1) {
         if (this.aw.ae() != (10236 & 22783)) {
            this.aw.ab(30974 & 2045);
            this.aw.setImage("sc/b/B459.png");
            this.aya.aib.setVisible((boolean)(--1));
         }
      } else if (this.aw.ae() != (31995 & 1023)) {
         this.aw.ab(7931 & 25087);
         this.aw.setImage("sc/b/B458.png");
         this.aya.aib.setVisible((boolean)(3 >> 2));
      }
   }

   public void as(int var1) {
      if (this.aya.apd != null) {
         int var2 = this.aya.apd.ae();
         int var3 = var1 == 0 ? var2 - --1 : (var1 == --1 ? var2 + (3 & 5) : (var1 == 5 >> 1 ? 3 >> 1 : this.aya.ape.getComponentCount()));
         if (var3 >= --1 && var3 <= this.aya.ape.getComponentCount()) {
            Class602 var5 = (Class602)this.aya.xh.get(var3 - (3 >> 1));
            boolean var6 = this.aya.apd.t();
            var3 = this.aya.apd.e();
            Assist var4 = this.aya.apd.xh();
            this.aya.apd.xf(var5.t(), var5.e(), var5.xh());
            var5.xf(var6, var3, var4);
            this.ang(var5);
         }
      }
   }

   public boolean au(int var1) {
      ScriptTask var4 = null;
      Iterator var2;
      Iterator var10000 = var2 = this.aya.xh.iterator();

      ScriptTask var8;
      while(true) {
         if (!var10000.hasNext()) {
            var8 = var4;
            break;
         }

         Class602 var3;
         int var5;
         if ((var5 = (var3 = (Class602)var2.next()).tp()) <= 0) {
            var10000 = var2;
         } else {
            Assist var6;
            if ((var6 = var3.xh()).getSid() != var1) {
               String[] var7 = var6.getValue().split("\\|");
               var8 = var4 = new ScriptTask(var7, var5, var6.getSid());
               break;
            }

            var10000 = var2;
            var3.gb((boolean)(2 & 5));
         }
      }

      if (var8 == null) {
         int var10002 = 5 >> 3;
         this.r((boolean)(5 >> 3));
         return (boolean)var10002;
      } else {
         int var10004 = --1;
         this.aej.automation.d(var4, (boolean)(--1), 3 >> 1);
         this.r((boolean)var10004);
         return (boolean)(--1);
      }
   }

   public void y(int var1) {
      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.aya.xh.size(); var10000 = var2) {
         Assist var3;
         Class602 var4;
         if ((var3 = (var4 = (Class602)this.aya.xh.get(var2)).xh()) != null && var3.getSid() == var1) {
            var4.xg(var2 + (3 & 5), var3);
            return;
         }

         ++var2;
      }

   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(2 ^ 3);
   }

   public void z(long var1, JTextField var3) {
   }

   public void q() {
      if (this.bl()) {
         super.q();
      }
   }

   public void ang(Class602 var1) {
      this.aya.apd = var1;
      if (this.ayb == null && var1 != null) {
         this.ayb = BorderFactory.createLineBorder(Color.YELLOW, 5 >> 1);
      }

      int var2 = 0;
      int var4 = this.aya.ape.getComponentCount();

      for(int var10000 = var2; var10000 < var4; var10000 = var2) {
         Class602 var3 = var2 < this.aya.xh.size() ? (Class602)this.aya.xh.get(var2) : null;
         if (var3 != null) {
            var3.setBorder(var3 == var1 ? this.ayb : null);
         }

         ++var2;
      }

   }

   public void ck(List<Assist> var1) {
      if (var1 != null) {
         this.aya.apd = null;
         this.aya.ape.removeAll();
         int var2 = 2 & 5;
         int var5 = var1.size();

         int var10000;
         for(var10000 = var2; var10000 < var5; var10000 = var2) {
            Assist var4 = (Assist)var1.get(var2);
            Class602 var3 = var2 < this.aya.xh.size() ? (Class602)this.aya.xh.get(var2) : null;
            if (var3 == null) {
               var3 = new Class602(this);
               this.aya.xh.add(var3);
            }

            int var10001 = 2 & 5;
            var3.xg(var2 + (4 ^ 5), var4);
            var3.setBounds(var10001, (53 & 127) * var2, 15317 & 17918, 61 & 119);
            ++var2;
            this.aya.ape.add(var3);
         }

         this.aya.ape.setPreferredSize(new Dimension(23006 & 10229, (61 & 119) * this.aya.ape.getComponentCount()));

         for(var10000 = var2 = var1.size(); var10000 < this.aya.xh.size(); var10000 = var2) {
            Class602 var6 = (Class602)this.aya.xh.get(var2);
            ++var2;
            var6.xg(2 & 5, (Assist)null);
         }

      }
   }
}
