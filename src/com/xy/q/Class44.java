package com.xy.q;

import com.xy.a.Class132;
import com.xy.a.Class142;
import com.xy.a.q.Class97;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class44 extends JComponent {
   private com.xy.w.Class18 amf;
   private int gv = 20;
   private int gw;
   private boolean ln;
   private com.xy.i.Class1 amg;
   private int gz;
   private DefaultListModel<Class60> pd;
   private Class30 amh;
   private int cn;
   private int ha;
   private JLabel ad;
   private int ae;
   private int ds;
   private JList<Class60> aly;
   private JScrollPane l;

   public void rm(boolean var1) {
      this.ln = var1;
   }

   public void afo(Class60 var1) {
      this.pd.addElement(var1);
   }

   public void be(boolean var1) {
      if (this.amh != null) {
      }

      this.l.setVisible(var1);
      this.setBounds(this.ae, this.ds, this.cn, this.gz);
   }

   public JList<Class60> th() {
      return this.aly;
   }

   public Class44(int var1, int var2, Class30 var3) {
      this.gw = var1;
      this.ha = var2;
      this.amh = var3;
      this.ln = false;
      this.gv = var1 == 1 ? 21 : 20;
      String var10005 = "\u0006ZZ]Z\bB\u0017\u0005W\u0012";
      this.amf = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      Color var6;
      int var10006;
      if (var1 == 1) {
         var6 = Color.black;
         var10006 = var1;
      } else {
         var6 = Color.white;
         var10006 = var1;
      }

      this.ad = Class1.k(0, 0, 0, 0, var6, var10006 == 2 ? Class49.w : Class49.aw);
      this.ad.setHorizontalAlignment(var1 == 2 ? 10 : 0);
      String var4;
      if (var1 == 2) {
         var4 = "jC6E6\u0014!\u000eiN~";
         var4 = "sc/e/48.png";
      } else {
         var4 = "J\u0016\u0016\u0017\u00167\rF\u0017\u0005W\u0012";
         var4 = "sc/b/B43.png";
      }

      Class28 var10000 = new Class28(this, var4, 1, var3);
      this.amg = var10000;
      this.pd = new DefaultListModel<>();
      this.aly = new JList<>();
      Class1.c(this.aly, Color.white, Class49.cp);
      this.aly.setModel(this.pd);
      this.aly.addListSelectionListener(new Class32(this));
      this.l = Class1.g(0, 0, 0, 0, this.aly, -1);
      this.l.setVisible(false);
      this.add(this.l);
      this.add(this.amg);
      this.add(this.ad);
      this.add(this.amf);
   }

   public Class44() {
      this(0, 100, null);
   }

   // $VF: synthetic method
   static JScrollPane afp(Class44 var0) {
      return var0.l;
   }

   public JLabel en() {
      return this.ad;
   }

   public void gw(Object var1) {
      int var2 = 0;
      int var3 = this.pd.getSize();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         Class60 var4 = this.pd.get(var2);
         if (var1.equals(var4.a())) {
            this.aly.setSelectedIndex(var2);
            return;
         }
      }

      this.aly.setSelectedIndex(0);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.l.isVisible()) {
         Graphics2D var2 = (Graphics2D)var1;
         var2.setComposite(com.xy.w.Class1.l);
         var2.setColor(Color.BLACK);
         var2.fillRect(this.l.getX(), this.l.getY(), this.l.getWidth(), this.l.getHeight());
         var2.setComposite(com.xy.w.Class1.c);
      }
   }

   // $VF: synthetic method
   static JList afq(Class44 var0) {
      return var0.aly;
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      if (this.l.isVisible()) {
         int var10002;
         Class44 var10003;
         if (this.ln) {
            var10002 = 0;
            var10003 = this;
         } else {
            var10002 = this.ha - this.gv;
            var10003 = this;
         }

         this.amf.setBounds(0, var10002, var10003.cn, this.gv);
         Class44 var5;
         if (this.gw == 2) {
            if (this.ln) {
               var10002 = 0;
               var10003 = this;
            } else {
               var10002 = this.ha - this.gv;
               var10003 = this;
            }

            this.ad.setBounds(0, var10002, var10003.cn - 18, this.gv);
            this.amg.setBounds(this.cn - this.gv + 1, this.ln ? 1 : this.ha - this.gv + 1, 18, 18);
            var5 = this;
         } else if (this.gw == 1) {
            if (this.ln) {
               var10002 = 0;
               var10003 = this;
            } else {
               var10002 = this.ha - this.gv;
               var10003 = this;
            }

            this.ad.setBounds(8, var10002, var10003.cn - 8 - 23, this.gv);
            this.amg.setBounds(this.cn - this.gv - 2, this.ln ? 0 : this.ha - this.gv, 23, 21);
            var5 = this;
         } else {
            if (this.ln) {
               var10002 = 0;
               var10003 = this;
            } else {
               var10002 = this.ha - this.gv;
               var10003 = this;
            }

            this.ad.setBounds(0, var10002, var10003.cn - 18, this.gv);
            this.amg.setBounds(this.cn - this.gv + 2, this.ln ? 2 : this.ha - this.gv + 2, 17, 17);
            var5 = this;
         }

         if (this.ln) {
            var10002 = this.gv;
            var10003 = this;
         } else {
            var10002 = 0;
            var10003 = this;
         }

         var5.l.setBounds(0, var10002, var10003.cn, this.ha - this.gv);
         if (this.ln) {
            var10002 = this.ds;
            var10003 = this;
         } else {
            var10002 = this.ds - this.ha + this.gv;
            var10003 = this;
         }

         super.setBounds(this.ae, var10002, var10003.cn, this.ha);
      } else {
         this.amf.setBounds(0, 0, this.cn, this.gv);
         Class44 var10000;
         if (this.gw == 2) {
            this.ad.setBounds(0, 0, this.cn - 18, this.gv);
            var10000 = this;
            this.amg.setBounds(this.cn - this.gv + 1, 1, 18, 18);
         } else if (this.gw == 1) {
            this.ad.setBounds(8, 0, this.cn - 8 - 23, this.gv);
            var10000 = this;
            this.amg.setBounds(this.cn - this.gv - 2, 0, 23, 21);
         } else {
            var10000 = this;
            this.ad.setBounds(0, 0, this.cn - 18, this.gv);
            this.amg.setBounds(this.cn - this.gv + 2, 2, 17, 17);
         }

         var10000.setBounds(this.ae, this.ds, this.cn, this.gz);
      }
   }

   public void afr(Class60 var1) {
      if (this.amh != null && this.amh instanceof Class142 && !((Class142)this.amh).nb(var1.b())) {
         this.aly.clearSelection();
      } else if (this.amh != null && this.amh instanceof com.xy.a.v.Class38) {
         ((com.xy.a.v.Class38)this.amh).g((Integer)var1.a());
      } else if (this.amh != null && this.amh instanceof com.xy.a.v.Class23) {
         ((com.xy.a.v.Class23)this.amh).g((Integer)var1.a());
      } else {
         this.ad.setText(var1.b());
         if (this.amh != null) {
            if (this.amh instanceof Class97) {
               ((Class97)this.amh).i((BigDecimal)var1.a());
            } else if (this.amh instanceof com.xy.a.i.Class6) {
               ((com.xy.a.i.Class6)this.amh).i((BigDecimal)var1.a());
            } else if (this.amh instanceof Class132) {
               ((Class132)this.amh).ef((Long)var1.a());
            } else if (this.amh instanceof com.xy.a.Class29) {
               ((com.xy.a.Class29)this.amh).me((Long)var1.a(), this);
            } else {
               if (this.amh instanceof com.xy.a.a.Class34) {
                  ((com.xy.a.a.Class34)this.amh).ci(var1.b());
               }
            }
         }
      }
   }

   public void li(Class60 var1) {
      this.pd.addElement(var1);
      if (this.pd.size() == 1) {
         this.aly.setSelectedIndex(0);
      }
   }

   public void g(int var1) {
      this.ha = var1;
   }

   public void n(int var1) {
      this.aly.setSelectedIndex(var1);
   }

   public DefaultListModel<Class60> td() {
      return this.pd;
   }

   public void zb(int var1, int var2, int var3, int var4) {
      this.ae = var1;
      this.ds = var2;
      this.cn = var3;
      this.gz = var4;
      this.setBounds(var1, var2, var3, var4);
   }

   public void dq(String var1) {
      this.li(new Class60(var1, null));
   }

   public Class60 afs() {
      return this.aly.getSelectedValue();
   }

   public int il() {
      return this.aly.getSelectedIndex();
   }
}
