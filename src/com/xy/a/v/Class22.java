package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class22 extends com.xy.q.Class30 {
   private com.xy.i.Class22[] wj;
   private RichLabel ed;
   private com.xy.q.Class36 fc;
   private Class13[] wk;
   private com.xy.q.Class27 wl;
   private long et;
   private com.xy.w.Class18[] fp;
   private JLabel im;

   public Class22(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 703, 542, com.xy.q.Class30.agf);
      this.wj = new com.xy.i.Class22[1];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.wj.length; var10000 = var2) {
         com.xy.i.Class22[] var5 = this.wj;
         String var16;
         if (var2 == 0) {
            var16 = "\u001aQFWF\u0003Q\nGB\u0007U";
            var16 = "sc/e/188.png";
         } else if (var2 == 1) {
            var16 = "0QlWl\u0003v\u0004mB-U";
            var16 = "sc/e/156.png";
         } else {
            var16 = "\u001aQFWF\u0003\\\u0007GB\u0007U";
            var16 = "sc/e/155.png";
         }

         com.xy.i.Class22 var10001 = new com.xy.i.Class22(var16, 1, 181 + var2, this);
         var5[var2] = var10001;
         this.wj[var2].setBounds(342, 69, 20, 20);
         if (var2 >= 1 && var2 <= 2) {
            this.wj[var2].setBounds(305 + (var2 - 1) * 94, 498, 18, 25);
         }

         this.add(this.wj[var2++]);
      }

      this.im = com.xy.q.Class1.k(172, 69, 46, 19, Color.black, com.xy.q.Class49.ch);
      String var10005 = "摟紐";
      this.im.setText("搜索");
      this.add(this.im);
      this.ed = new RichLabel("", com.xy.q.Class49.n);
      String var10007 = "\u0011\n\u0006Q\u0006Z\u0001Z〢覭别讝昼へ\u0011\u001b叝二臘遠靬\\s盭\u0004伤敂霺叅";
      this.ed.setTextSize("#c484333【规则说明】#r可以自选非5A的6位数靓号", 480);
      this.ed.setBounds(172, 94, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      String var10008 = "A \u001d'\u001dr\u0005mB-U";
      this.fc = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.fc.setBounds(216, 69, 144, 19);
      this.add(this.fc);
      this.wl = new com.xy.q.Class27(0, this.fc, this);
      this.wk = new Class13[16];

      for (int var6 = var2 = 0; var6 < this.wk.length; var6 = var2) {
         this.wk[var2] = new Class13(this, var2, this);
         this.wk[var2].setBounds(43 + var2 % 4 * 160, 217 + var2 / 4 * 70, 156, 66);
         this.add(this.wk[var2++]);
      }

      this.fp = new com.xy.w.Class18[3];

      for (int var7 = var2 = 0; var7 < this.fp.length; var7 = var2) {
         this.fp[var2] = new com.xy.w.Class18();
         Class22 var8;
         if (var2 == 0) {
            var8 = this;
            com.xy.w.Class18 var11 = this.fp[var2];
            String var10003 = "A\n\u001d\r\u001d_\u0004GB\u0007U";
            var11.mt(com.xy.w.Class16.m("sc/d/66.png", 100, 1, 100, 1, false));
            this.fp[var2].setBounds(47, 208, 629, 2);
         } else if (var2 == 1) {
            var8 = this;
            com.xy.w.Class18 var12 = this.fp[var2];
            String var15 = "0QlVl\u0000s\u0003mB-U";
            var12.dp("sc/d/201.png");
            this.fp[var2].setBounds(63, 26, 81, 207);
         } else {
            if (var2 == 2) {
               com.xy.w.Class18 var9 = this.fp[var2];
               String var13 = "A\n\u001d\r\u001dZ\u0004GB\u0007U";
               var9.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.fp[var2].setBounds(44, 58, 634, 142);
            }

            var8 = this;
         }

         var8.add(this.fp[var2++]);
      }
   }

   public void cc(int var1, int var2) {
      if (var1 == 180) {
         if (var2 != 0) {
            String var10003 = "+\u0002";
            String var4 = Agreement.getSendTextAES("BEAU", "B0" + var2);
            this.za().k(var4);
         }
      } else if (var1 == 181) {
         if (com.xy.v.Class22.f() - this.et < com.xy.v.Class22.h * 10) {
            String var10001 = "伣炋盇夘徨亴";
            this.afx._do("你点的太快了");
         } else {
            this.et = com.xy.v.Class22.f();
            String var10004 = "?\u0002";
            String var3 = Agreement.getSendTextAES("BEAU", "V0" + this.fc.getText());
            this.za().k(var3);
         }
      } else {
         if (var1 != 182) {
         }
      }
   }

   public void ne(int[] var1) {
      Activity var2;
      int var8;
      if ((var2 = this.yt().bb()) != null) {
         String var10000 = var2.getActivitySet();
         String var10001 = "遊靡厴识晍\u000f";
         String var10002 = "N";
         var8 = com.xy.v.Class12.f(var10000, "选靓号说明=", "|");
      } else {
         var8 = 0;
      }

      int var3 = var8;
      ActivityFC var4 = var3 > 0 ? this.yt().ba(var3) : null;
      String var11;
      if (var4 != null) {
         var11 = var4.getValue();
      } else {
         var11 = "辛朘诽罜讷昼旄朞";
         var11 = "还未设置说明文本";
      }

      this.ed.setTextSize(var11, 480);
      this.ed.setBounds(172, 94, this.ed.getWidth(), this.ed.getHeight());
      int var5 = var1[0];

      int var6;
      for (int var9 = var6 = 0; var9 < this.wk.length; var9 = var6) {
         int var7 = var6 + 1 < var1.length ? var1[var6 + 1] : 0;
         Class13 var10 = this.wk[var6];
         var6++;
         var10.cc(var7, var5);
      }
   }
}
