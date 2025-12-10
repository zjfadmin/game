package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.game.HandleOption;
import com.xy.readbean.NpcInfoBean;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class369 extends Class93 {
   private int bn;
   private int cy;
   private Object cz;

   public void af(MouseEvent var1) {
      if (this.bn != 0) {
         if (this.bn == 59999) {
            this.form.ve().a(121 & 127);
            return;
         }

         if (this.bn == 59998) {
            ((Class472)this.form.ve().e(59 & 95)).ll((Class165)null, (NpcInfoBean)null, 59998);
            return;
         }

         String var2;
         if (this.bn == 59997) {
            var2 = Agreement.getSendTextAES("taskN", "G7");
            this.form.uw().d(var2);
            return;
         }

         if (this.bn == 59996) {
            Class658.cy(125 & 119, this.form.aej);
            return;
         }

         if (this.bn == 59995) {
            ((Class472)this.form.ve().e(95 & 59)).ll((Class165)null, (NpcInfoBean)null, 93 & 119);
            return;
         }

         if (this.bn == 59994) {
            HandleOption.h("符石", this.form.aej);
            return;
         }

         if (this.bn == 59993) {
            HandleOption.h("我要合成炼妖石", this.form.aej);
            return;
         }

         if (this.bn == 59992) {
            Class658.cy(107 & 125, this.form.aej);
            return;
         }

         if (this.bn == 59991) {
            Class658.cy(117 & 123, this.form.aej);
            return;
         }

         if (this.bn == 59990) {
            ((Class472)this.form.ve().e(59 & 95)).ll((Class165)null, (NpcInfoBean)null, 59990);
            return;
         }

         if (this.bn == 59989) {
            var2 = Agreement.getSendTextAES("exchange", "X01");
            this.form.uw().d(var2);
            return;
         }

         if (this.bn == 59988) {
            Class658.cy(108 & 59, this.form.aej);
            return;
         }

         if (this.bn == 59987) {
            int var10003 = 83 & 125;
            Object var10007 = null;
            this.form.aej.aal(new ConfirmBean(var10003, (String)null, "请输入你的新名称,修改成功后将扣除30积分,你当前积分:#G" + this.form.vd().getLoginResult().getMoney()));
            return;
         }

         if (HandleOption.c(this.bn, (Class292)null, this.form.aej)) {
            return;
         }

         if (this.bn == (25579 & 8190) || this.bn == (28407 & 5467) || this.bn == (25355 & 7933) || this.bn >= (28141 & 5727) && this.bn <= (15699 & 18173) || this.bn >= (510 & 32767) && this.bn <= 514 || this.bn == 2020 || this.bn == 2022 || this.bn == 2023) {
            var2 = Agreement.getSendTextAES("gangmonitor", String.valueOf(this.bn));
            this.form.uw().d(var2);
            return;
         }

         ((Class472)this.form.ve().e(27)).ll((Class165)null, (NpcInfoBean)null, this.bn);
      }

   }

   public void bq(Object var1) {
      this.cz = var1;
   }

   public Class369(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.bn = var3;
      this.form = var4;
   }

   public Object hr() {
      return this.cz;
   }

   public void ac(MouseEvent var1, boolean var2) {
   }

   public int tp() {
      return this.cy;
   }

   public Class369(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.bn = var3;
      Class369 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(3 ^ 3);
      this.setText(var6);
   }

   public void gd(int var1, String var2) {
      this.bn = var1;
      this.setText(var2);
   }

   public void y(int var1) {
      this.bn = var1;
   }

   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.bn == (22511 & 12277) || this.bn == (2030 & 32759) || this.bn == (22503 & 12287)) {
         Class270 var2 = (Class270)this.form.ve().e(62 & 111);
         var2.f("等级  " + this.cy);
      }

   }

   public void ab(int var1) {
      this.cy = var1;
   }

   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.bn == (18423 & 16365) || this.bn == (12287 & 22502) || this.bn == (16375 & 18415)) {
         this.form.ve().n(46 & 127);
      }

   }

   public int ae() {
      return this.bn;
   }

   public Class369(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }
}
