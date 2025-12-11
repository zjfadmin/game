package com.xy.a;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Point;
import java.math.BigDecimal;
import javax.swing.JList;

public class Class103 extends com.xy.q.Class30 {
   private String aaq;
   private String[] alx;
   private JList<String> aly;
   private BigDecimal hh;

   public void adb(BigDecimal var1, String var2) {
      this.hh = var1;
      this.aaq = var2;
      this.aly.clearSelection();
      Point var3;
      this.yv(Math.min((var3 = this.ze().dd(99, 147)).x, this.afx.screenData.Screen_x - 99), var3.y, 99, 147);
      this.zc().b(this.lj());
   }

   public Class103(GameView var1) {
      super(77, 2, com.xy.q.Class30.agf, var1);
      String var10010 = ")>u>uhc";
      this.yy(80, 100, 99, 147, com.xy.q.Class30.agf);
      this._do("sc/c/59");
      this.aly = new JList<>();
      this.aly.setOpaque(false);
      this.aly.setBackground(com.xy.q.Class49.bk);
      this.aly.setForeground(Color.white);
      this.aly.setFont(com.xy.q.Class49.ac);
      this.aly.setSelectionForeground(Color.white);
      this.aly.setSelectionBackground(com.xy.q.Class49.bk);
      this.aly.addListSelectionListener(new Class39(this));
      String[] var10001 = new String[4];
      String var10004 = "亣明";
      var10001[0] = "交易";
      var10004 = "纙际";
      var10001[1] = "组队";
      var10004 = "劽奺取";
      var10001[2] = "加好友";
      var10004 = "儮閷";
      var10001[3] = "关闭";
      this.alx = var10001;
      this.aly.setListData(this.alx);
      this.aly.setBounds(1, 3, 94, 140);
      this.add(this.aly);
   }

   // $VF: synthetic method
   static JList aff(Class103 var0) {
      return var0.aly;
   }

   public void g(int var1) {
      this.zc().f(this.lj());
      if (var1 != -1 && var1 != 3) {
         if (var1 == 2) {
            com.xy.d.Class8.bq(this.hh, this.aaq, this.ze());
         } else if (var1 == 1) {
            com.xy.d.Class8.az(this.hh, this.ze());
         } else {
            com.xy.d.Class8 var2;
            if ((var2 = this.ze().mapScene.ag(this.hh)) == null) {
               GameView var3 = this.ze();
               String var4 = "玴宱禦佧夷进些";
               var3.dp("玩家离你太远了");
            } else if (var2 == this.ze().roleUnit) {
               GameView var10000 = this.ze();
               String var10001 = "乗肠宣膷嶫撐伆";
               var10000.dp("不能对自己操作");
            } else {
               if (var1 == 0) {
                  com.xy.d.Class8.bt(var2, this.ze());
               }
            }
         }
      }
   }
}
