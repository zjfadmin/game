package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.ParamTool;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

class Class36 extends com.xy.q.Class54 {
   private BigDecimal gi;
   private int ds;
   // $VF: synthetic field
   final Class62 ajs;

   public void bb(Goodstable var1) {
      if (var1 == null) {
         this.e();
      } else {
         this.gi = var1.getRgid();
         this.gs(1, var1);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      if (var1.getButton() == 1) {
         Goodstable var3;
         if ((var3 = this.ajs.yx().getGoodEquip(this.gi)) == null) {
            return;
         }

         if (var1.isShiftDown()) {
            try {
               JTextField var4;
               com.xy.q.Class11 var10000 = (com.xy.q.Class11)(var4 = this.ajs.ze().getBaseView().ty()).getDocument();
               int var10001 = var4.getCaretPosition();
               BigDecimal var10003 = var3.getRgid();
               String var10004 = "[" + var3.getGoodsname() + "]";
               String var10005 = "v";
               var10000.lx(var10001, 2, var10003, var10004, "G", null);
               return;
            } catch (BadLocationException var5) {
               var5.printStackTrace();
               return;
            }
         }
      }
   }

   // $VF: synthetic method
   private void e() {
      this.gi = null;
      this.gs(0, null);
      this.f();
      this.aui.zc().f(46);
      this.setVisible(true);
   }

   public Class36(Class62 var1, int var2, com.xy.q.Class30 var3) {
      super(var3);
      this.ajs = var1;
      this.ds = var2;
      this.f();
      if (var2 != 0 && var2 != 1 && var2 != 2) {
         if (var2 == 3) {
            this.setBounds(273, 152, 45, 45);
         }
      } else {
         this.setBounds(40, 54 + var2 * 49, 45, 45);
      }
   }

   public void f() {
      if (this.ds == 0) {
         String var3 = "B\u000e\u001e\t\u001eX\u0003CA\u0003V";
         this.dp("sc/d/52.png");
      } else if (this.ds == 1) {
         String var2 = "[C\u0007D\u0007\u0015\u001b\u000eXNO";
         this.dp("sc/d/53.png");
      } else if (this.ds == 2) {
         String var1 = "B\u000e\u001e\t\u001eX\u0005CA\u0003V";
         this.dp("sc/d/54.png");
      } else {
         if (this.ds == 3) {
            String var10001 = "[C\u0007D\u0007\u0015\u001d\u000eXNO";
            this.dp("sc/d/55.png");
         }
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      super.mouseReleased(var1);
      if (this.ajs.afx.getBattleScene() == null) {
         RoleData var2;
         Goodstable var3;
         if ((var3 = (var2 = this.ajs.yx()).getGoodEquip(this.gi)) != null) {
            if (!this.ajs.ze().ah()) {
               if (var1.getButton() == 3 && this.ajs.afx.getMouseIndex() == com.xy.v.Class3.k) {
                  RoleSummoning var4;
                  if ((var4 = this.aui.yx().getChosePet()) != null) {
                     HandlePet.e(var4, null, this.ds, var2);
                  }
               } else {
                  if (var1.getButton() == 1) {
                     if (this.ajs.afx.getMouseIndex() == com.xy.v.Class3.c) {
                        if (var3.getGoodlock() == 1) {
                           this.ajs.afx.dp("该物品已加锁");
                           return;
                        }

                        var3.setGoodlock(1);
                        ParamTool.j(var3, 0, this.ajs.afx.getClient());
                        this.ajs.afx.setMouseIndex(com.xy.v.Class3.k);
                        this.ajs.afx.dp("加锁成功");
                        return;
                     }

                     if (this.ajs.afx.getMouseIndex() == com.xy.v.Class3.g) {
                        if (var3.getGoodlock() == 0) {
                           this.ajs.afx.dp("该物品未加锁");
                           return;
                        }

                        var3.setGoodlock(0);
                        ParamTool.j(var3, 0, this.ajs.afx.getClient());
                        this.ajs.afx.setMouseIndex(com.xy.v.Class3.k);
                        this.ajs.afx.dp("解锁成功");
                     }
                  }
               }
            }
         }
      }
   }
}
