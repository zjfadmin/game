package com.xy.i;

import com.xy.a.Class48;
import com.xy.bean.ConfirmBean;
import com.xy.game.HandleOption;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class2 extends Class1 {
   private int ds;
   private Object pg;
   private int ah;

   public void gw(Object var1) {
      this.pg = var1;
   }

   public void g(int var1) {
      this.ds = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.ds == 2021 || this.ds == 2022 || this.ds == 2023) {
         this.form.zc().f(46);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.ds == 2021 || this.ds == 2022 || this.ds == 2023) {
         Class48 var2 = (Class48)this.form.zc().j(46);
         String var10003 = "筎纭'*";
         var2.bq("等级  " + this.ah);
      }
   }

   public int lj() {
      return this.ah;
   }

   public Class2(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   public void n(int var1) {
      this.ah = var1;
   }

   public Class2(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ds = var3;
      this.form = var4;
   }

   public int il() {
      return this.ds;
   }

   public Class2(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ds = var3;
      Class2 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(0);
      this.setText(var6);
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.ds != 0) {
         if (this.ds == 59999) {
            this.form.zc().b(121);
            return;
         }

         if (this.ds == 59998) {
            ((com.xy.a.Class6)this.form.zc().j(27)).bw(null, null, 59998);
            return;
         }

         if (this.ds == 59997) {
            String var6 = "\u0007p";
            String var4 = Agreement.getSendTextAES("taskN", "G7");
            this.form.za().k(var4);
            return;
         }

         if (this.ds == 59996) {
            Class0.ff(117, this.form.afx);
            return;
         }

         if (this.ds == 59995) {
            ((com.xy.a.Class6)this.form.zc().j(27)).bw(null, null, 85);
            return;
         }

         if (this.ds == 59994) {
            String var5 = "笡矹";
            HandleOption.w("符石", this.form.afx);
            return;
         }

         if (this.ds == 59993) {
            String var10000 = "扖见呏扐烻姖瞴";
            HandleOption.w("我要合成炼妖石", this.form.afx);
            return;
         }

         if (this.ds == 59992) {
            Class0.ff(105, this.form.afx);
            return;
         }

         if (this.ds == 59991) {
            Class0.ff(113, this.form.afx);
            return;
         }

         if (this.ds == 59990) {
            ((com.xy.a.Class6)this.form.zc().j(27)).bw(null, null, 59990);
            return;
         }

         if (this.ds == 59989) {
            String var10001 = "R7;";
            String var3 = Agreement.getSendTextAES("exchange", "X01");
            this.form.za().k(var3);
            return;
         }

         if (this.ds == 59988) {
            Class0.ff(40, this.form.afx);
            return;
         }

         if (this.ds == 59987) {
            Object var10007 = null;
            var10007 = "讷返儥伧盄旷呍禷l侩敹扗募呉屆戤阤tp禨剆k传弔刍禨剆}c\u0000";
            this.form.afx.dm(new ConfirmBean(81, null, "请输入你的新名称,修改成功后将扣除30积分,你当前积分:#G" + this.form.yx().getLoginResult().getMoney()));
            return;
         }

         if (HandleOption.ac(this.ds, null, this.form.afx)) {
            return;
         }

         if (this.ds == 1002
            || this.ds == 1107
            || this.ds == 521
            || this.ds >= 1101 && this.ds <= 1105
            || this.ds >= 510 && this.ds <= 514
            || this.ds == 2020
            || this.ds == 2022
            || this.ds == 2023) {
            String var2 = Agreement.getSendTextAES("gangmonitor", String.valueOf(this.ds));
            this.form.za().k(var2);
            return;
         }

         ((com.xy.a.Class6)this.form.zc().j(27)).bw(null, null, this.ds);
      }
   }

   public Object jx() {
      return this.pg;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   public void cp(int var1, String var2) {
      this.ds = var1;
      this.setText(var2);
   }
}
