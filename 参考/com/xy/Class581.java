package com.xy;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.socket.ParamTool;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Class581 extends JComponent implements MouseListener {
   private Class248 wi;
   private JLabel li;
   private boolean cb;
   private long wj;
   private boolean wk;
   private int gc;
   public static Color wl = new Color(18895 & 14075, 19965 & 12983, 95 & 123);
   private Class643 kr;
   public static Color pp = new Color(123 & 79, 4791 & 28141, 32473 & 439, 1973 & 30974);
   private boolean lb;
   private int bn;
   public static Color wm = new Color(20923 & 11997, 20923 & 11997, 20923 & 11997, 31647 & 1270);
   private Class345 pr;

   public void is(long var1, String var3) {
      this.wj = var1;
      this.li.setText(var3);
   }

   public void gb(boolean var1) {
      this.cb = var1;
   }

   public int ae() {
      return this.gc;
   }

   public JLabel fa() {
      return this.li;
   }

   public void fn(Lingbao var1) {
      this.bn = 5 >> 2;
      this.wj = var1 != null ? var1.getBaoid().longValue() : 0L;
      this.li.setText(var1 != null ? var1.getBaoname() : null);
   }

   public Class581(Class248 var1) {
      this.pr = var1.gk();
      this.wi = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.kr = new Class643("sc/c/81", 3 & 5, 30 & 103, Class681.bm, (Color[])null, (String)null, this.pr);
      this.kr.setBounds(--3, --1, 118 & 27, 118 & 27);
      this.kr.bq(this);
      this.add(this.kr);
      this.li = new JLabel();
      this.li.setFont(Class681.ad);
      this.li.setForeground(Color.GREEN);
      this.li.setBounds(122 & 29, 5 >> 1, 126 & 111, 48 & 95);
      this.add(this.li);
      this.addMouseListener(this);
   }

   public void mouseEntered(MouseEvent var1) {
      this.cb = (boolean)(--1);
      if (this.pr instanceof Class264 || this.pr instanceof Class674 || this.pr instanceof Class275) {
         RolePet var2;
         if ((var2 = this.pr.vd().getRolePet(this.wj)) == null) {
            return;
         }

         ((Class106)this.wi.gk().ve().e(106 & 63)).amj(var2.getPet(), this.pr.vd().getLoginResult().getRolename(), (List)null, (boolean)(3 & 4));
      }

   }

   public Class581(Class345 var1) {
      this.pr = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.kr = new Class643("sc/c/81", 5 >> 2, 111 & 22, Class681.bm, (Color[])null, (String)null, var1);
      this.kr.setBounds(--3, --1, 51 & 94, 51 & 94);
      this.kr.bq(this);
      this.add(this.kr);
      this.li = new JLabel();
      this.li.setFont(Class681.ad);
      this.li.setForeground(Color.GREEN);
      this.li.setBounds(127 & 24, 5 >> 1, 111 & 126, 26 & 117);
      this.add(this.li);
      this.addMouseListener(this);
   }

   public void ak(boolean var1) {
      this.lb = var1;
      if (this.pr instanceof Class258) {
         this.li.setForeground(var1 ? Color.red : Color.white);
      }

   }

   public void af(MouseEvent var1) {
      RolePet var2;
      RoleSummoning var3 = (var2 = this.pr.vd().getRolePet(this.wj)) != null ? var2.getPet() : null;
      if (var2 != null) {
         Class581 var10000;
         label47: {
            if (var1.getButton() == --1) {
               label44: {
                  if (var1.isShiftDown()) {
                     label42: {
                        try {
                           JTextField var5;
                           ((Class175)(var5 = this.pr.aej.getBaseView().jj()).getDocument()).arf(var5.getCaretPosition(), --3, var2.getId(), "[" + var3.getSummoningname() + "]", "G", (AttributeSet)null);
                        } catch (BadLocationException var4) {
                           var4.printStackTrace();
                           break label42;
                        }

                        var10000 = this;
                        break label44;
                     }
                  }

                  var10000 = this;
               }

               if (var10000.pr.aej.getMouseIndex() == Class320.g) {
                  this.pr.aej.setMouseIndex(Class320.l);
                  if ((var3.getPetlock() >> (2 & 5) & 3 >> 1) == --1) {
                     var10000 = this;
                     this.pr.aej.fw("该召唤兽已加锁");
                     break label47;
                  }

                  var3.setPetlock(var3.getPetlock() | 4 ^ 5);
                  ParamTool.h(var3, this.pr.uw());
                  this.pr.aej.fw("加锁成功");
                  if (this.lb) {
                     ((Class264)this.pr).r((boolean)(5 >> 2));
                     var10000 = this;
                     break label47;
                  }
               } else if (this.pr.aej.getMouseIndex() == Class320.m && (var3.getPetlock() >> (3 ^ 3) & (4 ^ 5)) == (2 ^ 3)) {
                  this.pr.aej.setMouseIndex(Class320.l);
                  var3.setPetlock(var3.getPetlock() & -2 & -1);
                  ParamTool.h(var3, this.pr.uw());
                  this.pr.aej.fw("解锁成功");
                  if (this.lb) {
                     ((Class264)this.pr).r((boolean)(2 & 5));
                  }
               }
            }

            var10000 = this;
         }

         var10000.wi.gi(this);
      }
   }

   public void q() {
      int var10003 = 3 & 4;
      int var10005 = 5 >> 3;
      this.bn = 3 >> 2;
      this.wj = 0L;
      this.lb = (boolean)var10005;
      this.wk = (boolean)var10003;
      this.li.setText((String)null);
      this.li.setForeground(Color.GREEN);
   }

   public void mouseClicked(MouseEvent var1) {
      if (var1.isMetaDown() && (this.pr instanceof Class264 || this.pr instanceof Class275)) {
         this.pr.ve().n(this.pr.ae());
      }

   }

   public void ab(int var1) {
      this.gc = var1;
      this.kr.setText(String.valueOf(var1));
   }

   public boolean nz(int var1, long var2, RoleSummoning var4, RoleData var5, List<BigDecimal> var6) {
      this.wj = var4.getSid().longValue();
      this.lb = (boolean)(this.wj == var2 ? 5 >> 2 : 0);
      this.wk = (boolean)(var4.getPetlock() == 3 >> 1 ? 4 ^ 5 : 0);
      String var7;
      if (!Class394.r(var7 = var4.getSummoningname(), this.li.getText())) {
         this.li.setText(var7);
      }

      if (this.gc != var1) {
         this.kr.setText(String.valueOf(this.gc = var1));
      }

      Class581 var10000;
      if (!(this.pr instanceof Class264) && !(this.pr instanceof Class275)) {
         if (this.pr instanceof Class258) {
            this.li.setForeground(this.lb ? Color.red : Color.white);
         }

         var10000 = this;
      } else if (var6 != null && var6.contains(var4.getSid())) {
         var10000 = this;
         this.li.setForeground(Color.red);
      } else if (Class394.v(var5.getLoginResult().getSummoning_id(), var4.getSid())) {
         this.li.setForeground(wl);
         var10000 = this;
      } else {
         this.li.setForeground(Color.white);
         var10000 = this;
      }

      return var10000.lb;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var10001;
      if (this.lb) {
         var10001 = 5 >> 3;
         var1.setColor(pp);
         var1.fillRect(var10001, 3 & 4, this.getWidth(), this.getHeight());
      } else {
         if (this.cb) {
            var10001 = 5 >> 3;
            var1.setColor(wm);
            var1.fillRect(var10001, 5 >> 3, this.getWidth(), this.getHeight());
         }

      }
   }

   public void v(RoleSummoning var1) {
      this.bn = 3 >> 2;
      this.wj = var1 != null ? var1.getSid().longValue() : 0L;
      this.li.setText(var1 != null ? var1.getSummoningname() : null);
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public boolean t() {
      return this.cb;
   }

   public long gl() {
      return this.wj;
   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }

   }

   public void mousePressed(MouseEvent var1) {
      if (this.pr instanceof Class84) {
         ((Class84)this.pr).gi(this);
      } else if (this.pr instanceof Class264) {
         this.af(var1);
      } else if (this.pr instanceof Class674) {
         ((Class674)this.pr).ok(this.pr.vd().getRolePet(this.wj), var1);
      } else {
         if (this.wi != null) {
            this.wi.gi(this);
         }

      }
   }

   public void mouseExited(MouseEvent var1) {
      this.cb = (boolean)(3 & 4);
      if (this.pr instanceof Class264 || this.pr instanceof Class674 || this.pr instanceof Class275) {
         this.wi.gk().ve().n(47 & 122);
      }

   }
}
