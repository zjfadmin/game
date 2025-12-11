package com.xy.q;

import com.xy.a.q.Class108;
import com.xy.a.q.Class85;
import com.xy.a.q.Class88;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.socket.ParamTool;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class Class53 extends JComponent implements MouseListener {
   private com.xy.i.Class4 atk;
   private boolean ln;
   private Class18 aqc;
   private long atl;
   private boolean wt;
   public static Color wu = new Color(153, 153, 153, 150);
   public static Color acj = new Color(75, 165, 145, 180);
   private int ha;
   private JLabel ad;
   private Class30 ri;
   private boolean il;
   public static Color atm = new Color(203, 181, 91);
   private int ah;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.wt) {
         var1.setColor(acj);
         var1.fillRect(0, 0, this.getWidth(), this.getHeight());
      } else {
         if (this.ln) {
            var1.setColor(wu);
            var1.fillRect(0, 0, this.getWidth(), this.getHeight());
         }
      }
   }

   public Class53(Class30 var1) {
      this.ri = var1;
      this.setLayout(null);
      this.setBackground(Class49.bk);
      String var10007 = ">MbMb\u0016|";
      this.atk = new com.xy.i.Class4("sc/c/81", 1, 6, Class49.bz, null, null, var1);
      this.atk.setBounds(3, 1, 18, 18);
      this.atk.gw(this);
      this.add(this.atk);
      this.ad = new JLabel();
      this.ad.setFont(Class49.bm);
      this.ad.setForeground(Color.GREEN);
      this.ad.setBounds(24, 2, 110, 16);
      this.add(this.ad);
      this.addMouseListener(this);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.ln = true;
      if (this.ri instanceof com.xy.a.a.Class16 || this.ri instanceof Class108) {
         RolePet var2;
         if ((var2 = this.ri.yx().getRolePet(this.atl)) == null) {
            return;
         }

         ((com.xy.a.Class1)this.aqc.eg().zc().j(42)).aa(var2.getPet(), null, false);
      }
   }

   public void ru(long var1, String var3) {
      this.atl = var1;
      this.ad.setText(var3);
   }

   public void rm(boolean var1) {
      this.ln = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.isMetaDown() && this.ri instanceof com.xy.a.a.Class16) {
         this.ri.zc().f(this.ri.lj());
      }
   }

   public void ew(RoleSummoning var1) {
      this.ah = 0;
      this.atl = var1 != null ? var1.getSid().longValue() : 0L;
      this.ad.setText(var1 != null ? var1.getSummoningname() : null);
   }

   public void cw(MouseEvent var1) {
      RolePet var2;
      RoleSummoning var3 = (var2 = this.ri.yx().getRolePet(this.atl)) != null ? var2.getPet() : null;
      if (var2 != null) {
         Class53 var7;
         label49: {
            if (var1.getButton() == 1) {
               label46: {
                  label45:
                  if (var1.isShiftDown()) {
                     try {
                        JTextField var4;
                        Class11 var6 = (Class11)(var4 = this.ri.afx.getBaseView().ty()).getDocument();
                        int var10001 = var4.getCaretPosition();
                        BigDecimal var10003 = var2.getId();
                        String var10004 = "[" + var3.getSummoningname() + "]";
                        String var10005 = "\u0010";
                        var6.lx(var10001, 3, var10003, var10004, "G", null);
                     } catch (BadLocationException var5) {
                        var5.printStackTrace();
                        break label45;
                     }

                     var7 = this;
                     break label46;
                  }

                  var7 = this;
               }

               if (var7.ri.afx.getMouseIndex() == com.xy.v.Class3.c) {
                  this.ri.afx.setMouseIndex(com.xy.v.Class3.k);
                  if ((var3.getPetlock() >> 0 & 1) == 1) {
                     var7 = this;
                     String var8 = "讨参啩兓嶿劎镌";
                     this.ri.afx.dp("该召唤兽已加锁");
                     break label49;
                  }

                  var3.setPetlock(var3.getPetlock() | 1);
                  ParamTool.d(var3, this.ri.za());
                  String var10002 = "劕镖戥勈";
                  this.ri.afx.dp("加锁成功");
                  if (this.wt) {
                     ((com.xy.a.a.Class16)this.ri).cr(true);
                     var7 = this;
                     break label49;
                  }
               } else if (this.ri.afx.getMouseIndex() == com.xy.v.Class3.g && (var3.getPetlock() >> 0 & 1) == 1) {
                  this.ri.afx.setMouseIndex(com.xy.v.Class3.k);
                  var3.setPetlock(var3.getPetlock() & -2);
                  ParamTool.d(var3, this.ri.za());
                  String var9 = "觍镌戾勒";
                  this.ri.afx.dp("解锁成功");
                  if (this.wt) {
                     ((com.xy.a.a.Class16)this.ri).cr(false);
                  }
               }
            }

            var7 = this;
         }

         var7.aqc.kz(this);
      }
   }

   public Class53(Class18 var1) {
      this.ri = var1.eg();
      this.aqc = var1;
      this.setLayout(null);
      this.setBackground(Class49.bk);
      String var10007 = "$VxVx\rf";
      this.atk = new com.xy.i.Class4("sc/c/81", 1, 6, Class49.bz, null, null, this.ri);
      this.atk.setBounds(3, 1, 18, 18);
      this.atk.gw(this);
      this.add(this.atk);
      this.ad = new JLabel();
      this.ad.setFont(Class49.bm);
      this.ad.setForeground(Color.GREEN);
      this.ad.setBounds(24, 2, 110, 16);
      this.add(this.ad);
      this.addMouseListener(this);
   }

   public void n(int var1) {
      this.ha = var1;
      this.atk.setText(String.valueOf(var1));
   }

   public void cq(Lingbao var1) {
      this.ah = 1;
      this.atl = var1 != null ? var1.getBaoid().longValue() : 0L;
      this.ad.setText(var1 != null ? var1.getBaoname() : null);
   }

   public JLabel en() {
      return this.ad;
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }
   }

   public int il() {
      return this.ha;
   }

   public boolean ah() {
      return this.ln;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.ln = false;
      if (this.ri instanceof com.xy.a.a.Class16 || this.ri instanceof Class108) {
         this.aqc.eg().zc().f(42);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ri instanceof Class88) {
         ((Class88)this.ri).kz(this);
      } else if (this.ri instanceof com.xy.a.a.Class16) {
         this.cw(var1);
      } else if (this.ri instanceof Class108) {
         ((Class108)this.ri).amy(this.ri.yx().getRolePet(this.atl), var1);
      } else {
         if (this.aqc != null) {
            this.aqc.kz(this);
         }
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public void be(boolean var1) {
      this.wt = var1;
      if (this.ri instanceof Class85) {
         this.ad.setForeground(var1 ? Color.red : Color.white);
      }
   }

   public boolean alm(int var1, long var2, RoleSummoning var4, RoleData var5, List<BigDecimal> var6) {
      this.atl = var4.getSid().longValue();
      this.wt = this.atl == var2;
      this.il = var4.getPetlock() == 1;
      String var7;
      if (!com.xy.v.Class12.am(var7 = var4.getSummoningname(), this.ad.getText())) {
         this.ad.setText(var7);
      }

      if (this.ha != var1) {
         this.atk.setText(String.valueOf(this.ha = var1));
      }

      Class53 var10000;
      if (this.ri instanceof com.xy.a.a.Class16) {
         if (var6 != null && var6.contains(var4.getSid())) {
            var10000 = this;
            this.ad.setForeground(Color.red);
         } else if (com.xy.v.Class12.x(var5.getLoginResult().getSummoning_id(), var4.getSid())) {
            this.ad.setForeground(atm);
            var10000 = this;
         } else {
            this.ad.setForeground(Color.white);
            var10000 = this;
         }
      } else {
         if (this.ri instanceof Class85) {
            this.ad.setForeground(this.wt ? Color.red : Color.white);
         }

         var10000 = this;
      }

      return var10000.wt;
   }

   public void t() {
      this.ah = 0;
      this.atl = 0L;
      this.wt = false;
      this.il = false;
      this.ad.setText(null);
      this.ad.setForeground(Color.GREEN);
   }

   public long ee() {
      return this.atl;
   }
}
