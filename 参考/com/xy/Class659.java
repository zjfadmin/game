package com.xy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class659 extends JComponent {
   private int em;
   private JScrollPane axo;
   private int dn;
   private boolean afv;
   private int dp;
   private Class436 vk;
   private JLabel bs;
   private Class93 axp;
   private int gw;
   private int fk;
   private int ay;
   private DefaultListModel<Class367> alm;
   private Class345 ef;
   private JList<Class367> rx;
   private int m;

   public void amx(Class367 var1) {
      if (this.ef != null && this.ef instanceof Class605 && !((Class605)this.ef).ee(var1.d())) {
         this.rx.clearSelection();
      } else if (this.ef != null && this.ef instanceof Class34) {
         ((Class34)this.ef).y((Integer)var1.a());
      } else if (this.ef != null && this.ef instanceof Class11) {
         ((Class11)this.ef).y((Integer)var1.a());
      } else if (this.ef != null && this.ef instanceof Class683) {
         ((Class683)this.ef).apb((Point)var1.a());
      } else {
         this.bs.setText(var1.d());
         if (this.ef != null) {
            if (this.ef instanceof Class185) {
               ((Class185)this.ef).bk((BigDecimal)var1.a());
            } else if (this.ef instanceof Class232) {
               ((Class232)this.ef).bk((BigDecimal)var1.a());
            } else if (this.ef instanceof Class4) {
               ((Class4)this.ef).gh((Long)var1.a());
            } else if (this.ef instanceof Class418) {
               ((Class418)this.ef).abq((Long)var1.a(), this);
            } else if (this.ef instanceof Class567) {
               ((Class567)this.ef).f(var1.d());
            } else {
               if (this.ef instanceof Class300) {
                  ((Class300)this.ef).aof(var1.d(), this);
               }

            }
         }
      }
   }

   public void y(int var1) {
      this.rx.setSelectedIndex(var1);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.axo.isVisible()) {
         Graphics2D var2 = (Graphics2D)var1;
         var2.setComposite(Class8.m);
         var2.setColor(Color.BLACK);
         var2.fillRect(this.axo.getX(), this.axo.getY(), this.axo.getWidth(), this.axo.getHeight());
         var2.setComposite(Class8.g);
      }

   }

   public void gb(boolean var1) {
      this.afv = var1;
   }

   public JLabel fa() {
      return this.bs;
   }

   public void bq(Object var1) {
      int var2 = 2 & 5;
      int var3 = this.alm.getSize();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         Class367 var4 = (Class367)this.alm.get(var2);
         if (var1.equals(var4.a())) {
            this.rx.setSelectedIndex(var2);
            return;
         }

         ++var2;
      }

      this.rx.setSelectedIndex(2 & 5);
   }

   public void amy(Class367 var1) {
      this.alm.addElement(var1);
   }

   public Class659(int var1, int var2, Class345 var3) {
      int var10003 = 2 & 5;
      int var10011 = 95 & 52;
      super();
      this.dn = var10011;
      this.em = var1;
      this.gw = var2;
      this.ef = var3;
      this.afv = (boolean)var10003;
      this.dn = var1 == (4 ^ 5) ? 23 & 125 : 20;
      int var10001 = 3 >> 2;
      this.vk = new Class436(Class511.q("sc/d/17.png", 46 & 87, 46 & 87, 46 & 87, 46 & 87, (boolean)(3 >> 2)));
      int var10002 = 3 ^ 3;
      int var10004 = 3 ^ 3;
      Color var10005;
      int var10006;
      if (var1 == 3 >> 1) {
         var10005 = Color.black;
         var10006 = var1;
      } else {
         var10005 = Color.white;
         var10006 = var1;
      }

      this.bs = Class133.b(var10001, var10004, var10002, var10004, var10005, var10006 == 2 ? Class681.q : Class681.y);
      this.bs.setHorizontalAlignment(var1 == --2 ? 31 & 106 : 0);
      this.axp = new Class93(var1 == --2 ? "sc/e/48.png" : "sc/b/B43.png", 1, var3) {
         public void af(MouseEvent var1) {
            Class659.this.ak((boolean)(Class659.this.axo.isVisible() ? 5 >> 3 : 1));
         }

         public void ac(MouseEvent var1, boolean var2) {
         }
      };
      int var4 = 2 & 5;
      this.alm = new DefaultListModel();
      this.rx = new JList();
      Class133.j(this.rx, Color.white, Class681.bx);
      this.rx.setModel(this.alm);
      this.rx.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               Class367 var2;
               if ((var2 = (Class367)Class659.this.rx.getSelectedValue()) == null) {
                  return;
               }

               Class659.this.amx(var2);
               Class659.this.ak((boolean)(5 >> 3));
            }

         }
      });
      this.axo = Class133.f(var4, 5 >> 3, 5 >> 3, 5 >> 3, this.rx, -4 >> 2);
      this.axo.setVisible((boolean)(3 >> 2));
      this.add(this.axo);
      this.add(this.axp);
      this.add(this.bs);
      this.add(this.vk);
      if (var3 instanceof Class683) {
         this.bs.setFont(Class681.bx);
      }

   }

   public int ae() {
      return this.rx.getSelectedIndex();
   }

   public Class367 ana() {
      return (Class367)this.rx.getSelectedValue();
   }

   public void vf(int var1, int var2, int var3, int var4) {
      this.m = var1;
      this.fk = var2;
      this.dp = var3;
      this.ay = var4;
      this.setBounds(var1, var2, var3, var4);
   }

   public void ak(boolean var1) {
      if (this.ef != null) {
      }

      this.axo.setVisible(var1);
      this.setBounds(this.m, this.fk, this.dp, this.ay);
   }

   public void ahr(Class367 var1) {
      this.alm.addElement(var1);
      if (this.alm.size() == (2 ^ 3)) {
         this.rx.setSelectedIndex(2 & 5);
      }

   }

   public void setBounds(int var1, int var2, int var3, int var4) {
      Class659 var10000;
      if (this.axo.isVisible()) {
         Class436 var5 = this.vk;
         int var10001 = 3 & 4;
         int var10002;
         Class659 var10003;
         if (this.afv) {
            var10002 = 3 & 4;
            var10003 = this;
         } else {
            var10002 = this.gw - this.dn;
            var10003 = this;
         }

         var5.setBounds(var10001, var10002, var10003.dp, this.dn);
         JLabel var6;
         if (this.em == (1 ^ 3)) {
            var6 = this.bs;
            var10001 = 2 & 5;
            if (this.afv) {
               var10002 = 3 >> 2;
               var10003 = this;
            } else {
               var10002 = this.gw - this.dn;
               var10003 = this;
            }

            var6.setBounds(var10001, var10002, var10003.dp - (82 & 63), this.dn);
            this.axp.setBounds(this.dp - this.dn + --1, this.afv ? 4 ^ 5 : this.gw - this.dn + (4 ^ 5), 18, 18);
            var10000 = this;
         } else if (this.em == (2 ^ 3)) {
            var6 = this.bs;
            var10001 = 77 & 58;
            if (this.afv) {
               var10002 = 2 & 5;
               var10003 = this;
            } else {
               var10002 = this.gw - this.dn;
               var10003 = this;
            }

            var6.setBounds(var10001, var10002, var10003.dp - (29 & 106) - (127 & 23), this.dn);
            this.axp.setBounds(this.dp - this.dn - (1 ^ 3), this.afv ? 3 & 4 : this.gw - this.dn, 23, 23 & 125);
            var10000 = this;
         } else {
            var6 = this.bs;
            var10001 = 3 >> 2;
            if (this.afv) {
               var10002 = 3 ^ 3;
               var10003 = this;
            } else {
               var10002 = this.gw - this.dn;
               var10003 = this;
            }

            var6.setBounds(var10001, var10002, var10003.dp - (30 & 115), this.dn);
            this.axp.setBounds(this.dp - this.dn + (5 >> 1), this.afv ? --2 : this.gw - this.dn + (5 >> 1), 17, 17);
            var10000 = this;
         }

         JScrollPane var7 = var10000.axo;
         var10001 = 3 & 4;
         if (this.afv) {
            var10002 = this.dn;
            var10003 = this;
         } else {
            var10002 = 0;
            var10003 = this;
         }

         var7.setBounds(var10001, var10002, var10003.dp, this.gw - this.dn);
         var10001 = this.m;
         if (this.afv) {
            var10002 = this.fk;
            var10003 = this;
         } else {
            var10002 = this.fk - this.gw + this.dn;
            var10003 = this;
         }

         super.setBounds(var10001, var10002, var10003.dp, this.gw);
      } else {
         this.vk.setBounds(5 >> 3, 5 >> 3, this.dp, this.dn);
         if (this.em == --2) {
            this.bs.setBounds(2 & 5, 2 & 5, this.dp - (22 & 123), this.dn);
            var10000 = this;
            this.axp.setBounds(this.dp - this.dn + (5 >> 2), --1, 55 & 90, 55 & 90);
         } else if (this.em == --1) {
            this.bs.setBounds(14 & 121, 3 & 4, this.dp - (14 & 121) - (31 & 119), this.dn);
            var10000 = this;
            this.axp.setBounds(this.dp - this.dn - (1 ^ 3), 2 & 5, 95 & 55, 53 & 95);
         } else {
            var10000 = this;
            this.bs.setBounds(0, 0, this.dp - (95 & 50), this.dn);
            this.axp.setBounds(this.dp - this.dn + (1 ^ 3), 5 >> 1, 125 & 19, 125 & 19);
         }

         var10000.setBounds(this.m, this.fk, this.dp, this.ay);
      }
   }

   public void ab(int var1) {
      this.gw = var1;
   }

   public JList<Class367> oz() {
      return this.rx;
   }

   public void fx(String var1) {
      this.ahr(new Class367(var1, (Object)null));
   }

   public Class659() {
      this(2 & 5, 108 & 119, (Class345)null);
   }

   public DefaultListModel<Class367> oy() {
      return this.alm;
   }
}
