package com.xy.a.a;

import com.xy.game.HandleEquip;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.ParamTool;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

class Class54 extends com.xy.q.Class54 {
   // $VF: synthetic field
   final Class35 ata;
   private BigDecimal mz;
   private int ah;

   @Override
   protected void paintComponent(Graphics var1) {
      Goodstable var3;
      Class54 var4;
      label26: {
         RoleData var10000 = this.ata.yx();
         if ((var3 = var10000.getGoodEquip(var10000.goodChoses[this.ah])) != null) {
            if (this.mz != var3.getRgid()) {
               var4 = this;
               this.mz = var3.getRgid();
               this.gs(1, var3);
               break label26;
            }
         } else if (this.mz != null) {
            this.e();
         }

         var4 = this;
      }

      var4.paintComponent(var1);
      if (var3 != null && var3.getGoodlock() == 1) {
         var1.drawImage(com.xy.w.Class15.s, 42, 5, null);
      }

      if (this.aud) {
         var1.setColor(Color.white);
         var1.drawRect(2, 2, this.getWidth() - 4, this.getHeight() - 4);
         var1.drawRect(3, 3, this.getWidth() - 6, this.getHeight() - 6);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      super.mouseReleased(var1);
      if (this.ata.afx.getBattleScene() == null) {
         RoleData var2;
         RoleData var10000 = var2 = this.ata.yx();
         Goodstable var3;
         if ((var3 = var10000.getGoodEquip(var10000.goodChoses[this.ah])) != null) {
            if (!this.ata.ze().ah()) {
               if (var1.getButton() == 3 && this.ata.afx.getMouseIndex() == com.xy.v.Class3.k) {
                  if (HandleEquip.a(var2, this.ah, null)) {
                     this.e();
                     return;
                  }
               } else if (var1.getButton() == 1) {
                  if (this.ata.afx.getMouseIndex() == com.xy.v.Class3.c) {
                     if (var3.getGoodlock() == 1) {
                        String var6 = "讠牐咄巋勥锸";
                        this.ata.afx.dp("该物品已加锁");
                        return;
                     }

                     var3.setGoodlock(1);
                     ParamTool.j(var3, 0, this.ata.afx.getClient());
                     this.ata.afx.setMouseIndex(com.xy.v.Class3.k);
                     String var5 = "勉锨批劶";
                     this.ata.afx.dp("加锁成功");
                     return;
                  }

                  if (this.ata.afx.getMouseIndex() == com.xy.v.Class3.g) {
                     if (var3.getGoodlock() == 0) {
                        String var4 = "讠牐咄朓勥锸";
                        this.ata.afx.dp("该物品未加锁");
                        return;
                     }

                     var3.setGoodlock(0);
                     ParamTool.j(var3, 0, this.ata.afx.getClient());
                     this.ata.afx.setMouseIndex(com.xy.v.Class3.k);
                     String var10001 = "覊锨批劶";
                     this.ata.afx.dp("解锁成功");
                  }
               }
            }
         }
      }
   }

   public Class54(Class35 var1, int var2, com.xy.q.Class30 var3) {
      super(var3);
      this.ata = var1;
      this.ah = var2;
      this.f();
      if (var2 == 0) {
         this.setBounds(44, 87, 59, 57);
      } else if (var2 == 1) {
         this.setBounds(102, 31, 59, 57);
      } else if (var2 == 2) {
         this.setBounds(331, 31, 59, 57);
      } else if (var2 == 3) {
         this.setBounds(102, 87, 59, 57);
      } else if (var2 == 4) {
         this.setBounds(331, 143, 59, 57);
      } else if (var2 == 5) {
         this.setBounds(102, 143, 59, 57);
      } else if (var2 == 6) {
         this.setBounds(273, 31, 59, 57);
      } else if (var2 == 7) {
         this.setBounds(273, 143, 59, 57);
      } else if (var2 == 8) {
         this.setBounds(44, 31, 59, 57);
      } else if (var2 == 9) {
         this.setBounds(44, 143, 59, 57);
      } else if (var2 == 10) {
         this.setBounds(273, 87, 59, 57);
      } else {
         if (var2 == 11) {
            this.setBounds(331, 87, 59, 57);
         }
      }
   }

   // $VF: synthetic method
   private void e() {
      this.mz = null;
      this.gs(0, null);
      this.f();
      this.aui.zc().f(46);
      this.setVisible(true);
   }

   public void f() {
      if (this.ah == 0) {
         String var11 = "\u001aJFMF\u001eGY\u0007N";
         this.dp("sc/d/7.png");
      } else if (this.ah == 1) {
         String var10 = "6Zj]j\u000fkI+^";
         this.dp("sc/d/6.png");
      } else if (this.ah == 2) {
         String var9 = "Z\n\u0006\r\u0006X\u001bGY\u0007N";
         this.dp("sc/d/12.png");
      } else if (this.ah == 3) {
         String var8 = "6Zj]j\u0001kI+^";
         this.dp("sc/d/8.png");
      } else if (this.ah == 4) {
         String var7 = "Z\n\u0006\r\u0006X\u001cGY\u0007N";
         this.dp("sc/d/15.png");
      } else if (this.ah == 5) {
         String var6 = "J&\u0016!\u0016t\tkI+^";
         this.dp("sc/d/10.png");
      } else if (this.ah == 6) {
         String var5 = "Z\n\u0006\r\u0006X\u0018GY\u0007N";
         this.dp("sc/d/11.png");
      } else if (this.ah == 7) {
         String var4 = "J&\u0016!\u0016t\rkI+^";
         this.dp("sc/d/14.png");
      } else if (this.ah == 8) {
         String var3 = "\u001aJFMF\u001cGY\u0007N";
         this.dp("sc/d/5.png");
      } else if (this.ah == 9) {
         String var2 = "6Zj]j\u0000kI+^";
         this.dp("sc/d/9.png");
      } else if (this.ah == 10) {
         String var1 = "Z\n\u0006\r\u0006X\u001aGY\u0007N";
         this.dp("sc/d/13.png");
      } else {
         if (this.ah == 11) {
            String var10001 = "J&\u0016!\u0016t\nkI+^";
            this.dp("sc/d/13.png");
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      if (var1.getButton() == 1) {
         RoleData var10000 = this.ata.yx();
         Goodstable var3;
         if ((var3 = var10000.getGoodEquip(var10000.goodChoses[this.ah])) == null) {
            return;
         }

         if (var1.isShiftDown()) {
            try {
               JTextField var4;
               com.xy.q.Class11 var6 = (com.xy.q.Class11)(var4 = this.ata.ze().getBaseView().ty()).getDocument();
               int var10001 = var4.getCaretPosition();
               BigDecimal var10003 = var3.getRgid();
               String var10004 = "[" + var3.getGoodsname() + "]";
               String var10005 = "n";
               var6.lx(var10001, 2, var10003, var10004, "G", null);
               return;
            } catch (BadLocationException var5) {
               var5.printStackTrace();
               return;
            }
         }
      }
   }
}
