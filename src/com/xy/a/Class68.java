package com.xy.a;

import com.xy.entity.Gang;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Class68 extends com.xy.q.Class30 {
   private JTextArea acp;
   private JLabel[] ay;
   private com.xy.q.Class36 t;
   private com.xy.w.Class18 dm;
   private com.xy.i.Class18 me;

   public Class68(GameView var1) {
      super(25, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "e\u007f9x9-8lx{";
      this.yy(-2, 0, 362, 320, com.xy.q.Class30.agh);
      com.xy.w.Class9 var6 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10008 = "刐廢帥洦";
      this.yu(var6, "创建帮派");
      this.wp(new com.xy.v.Class32(14, 0, 0, 85));
      var10008 = "ou3s3$*8lx{";
      String var10013 = "刐廢帥洦";
      this.me = new com.xy.i.Class18("sc/e/26.png", 1, 145, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "创建帮派", this);
      this.me.setBounds(140, 178, 99, 25);
      this.add(this.me);
      String var10011 = "ou3r3'+8lx{";
      this.t = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.w, Color.white);
      String var10012 = "kh7o7:/%he\u007f";
      this.dm = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.acp = com.xy.q.Class1.e(com.xy.q.Class49.w, Color.white);
      this.acp.setBounds(132, 65, 200, 80);
      this.t.setBounds(130, 37, 160, 19);
      this.dm.setBounds(130, 63, 204, 84);
      this.add(this.t);
      this.add(this.acp);
      this.add(this.dm);
      this.ay = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ay.length; var10000 = var2) {
         int var10004 = 37 + var2 * 26;
         var10008 = "5\u007f&,&,&,";
         this.ay[var2] = com.xy.q.Class1.f(52, var10004, 72, 19, 10, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var3 = this.ay[var2];
         String var4;
         if (var2 == 0) {
            var4 = "帥洦吆秨";
            var4 = "帮派名称";
         } else if (var2 == 1) {
            var4 = "常洢宁旴";
            var4 = "帮派宗旨";
         } else {
            var4 = "";
         }

         var3.setText(var4);
         this.add(this.ay[var2++]);
      }
   }

   public void h() {
      BigDecimal var1;
      if ((var1 = this.afx.roleUnit.ap.getGang_id()) != null && var1.intValue() != 0) {
         String var8 = "佸巹朑帥洦";
         this.afx._do("你已有帮派");
      } else {
         String var2 = this.t.getText().trim();
         String var3 = this.acp.getText().trim();
         if (var2.equals("")) {
            String var7 = "帲洨向丬穦";
            this.afx._do("帮派名为空");
         } else if (var3.equals("")) {
            String var10001 = "帥洦宜旰丱穢";
            this.afx._do("帮派宗旨为空");
         } else {
            RoleData var4 = this.yx();
            Class68 var10000;
            if (var4.bk(new BigDecimal(501)) != null) {
               Gang var5 = new Gang();
               var5.setGangname(var2);
               var5.setIntroduction(var3);
               String var6 = Agreement.getSendTextAES("gangcreate", com.xy.v.Class31.a().toJson(var5));
               var10000 = this;
               this.za().k(var6);
            } else {
               var10000 = this;
               String var10002 = "佶胐匓沽期丕畚台雐仸";
               this.afx._do("你背包没有三界召集令");
            }

            var10000.zc().f(this.lj());
         }
      }
   }
}
