package com.xy.a;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class119 implements MouseListener {
   private com.xy.w.Class18 co;
   // $VF: synthetic field
   final Class63 arq;
   private int ae;
   private com.xy.q.Class44 arr;
   private int eg;
   private JLabel im;

   @Override
   public void mouseClicked(MouseEvent var1) {
      this.eg = this.eg == 0 ? 1 : 0;
      String var2;
      if (this.eg == 0) {
         var2 = "\u001bdGbG5Q)\u0018i\u000f";
         var2 = "sc/e/29.png";
      } else {
         var2 = "\\;\u0000=\u0000k\u001fv_6H";
         var2 = "sc/e/30.png";
      }

      this.co.dp(var2);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public Class119(Class63 var1, int var2, Class63 var3) {
      this.arq = var1;
      this.im = com.xy.q.Class1.f(0, 0, 0, 0, var2 < 2 ? 2 : (var2 % 2 == 0 ? 4 : 2), Color.black, com.xy.q.Class49.ch);
      var3.add(this.im);
      if (var2 == 0) {
         this.arr = new com.xy.q.Class44();
         this.arr.rm(true);
         String var7 = "P7X-^7X";
         this.arr.dq("800*600");
         String var6 = "i\u001fj\u001br\u0018n\u0017";
         this.arr.dq("1024*768");
         String var5 = "6Z?X-Q1X";
         this.arr.dq("1280*960");
         String var4 = "i\u001cn\u0019r\u0018n\u0017";
         this.arr.dq("1366*768");
         var3.add(this.arr);
      } else if (var2 == 1) {
         this.arr = new com.xy.q.Class44();
         this.arr.rm(true);
         String var10006 = "4X'.W;";
         this.arr.dq("30 FPS");
         String var10005 = "l\u001fxi\b|";
         this.arr.dq("40 FPS");
         String var10004 = "2X'.W;";
         this.arr.dq("50 FPS");
         String var10003 = "n\u001fxi\b|";
         this.arr.dq("60 FPS");
         var3.add(this.arr);
      } else {
         this.co = new com.xy.w.Class18();
         this.co.addMouseListener(this);
         var3.add(this.co);
      }
   }

   public void cc(int var1, int var2) {
      if (var1 > 13) {
         var1 = -1;
      }

      this.ae = var1;
      this.eg = var2;
      if (var1 == -1) {
         this.im.setVisible(false);
         this.co.setVisible(false);
         if (this.arr != null) {
            this.arr.setVisible(false);
         }
      } else {
         String var3;
         if (var1 == 0) {
            var3 = "昹祒讹缆";
            var3 = "显示设置";
         } else if (var1 == 1) {
            var3 = "飉玨乒陿";
            var3 = "频率上限";
         } else if (var1 == 2) {
            var3 = "韴丸";
            var3 = "音乐";
         } else if (var1 == 3) {
            var3 = "鞫敧";
            var3 = "音效";
         } else if (var1 == 4) {
            var3 = "刀碣弇儛";
            var3 = "切磋开关";
         } else if (var1 == 5) {
            var3 = "拽纅陣畇井淐恀";
            var3 = "拒绝陌生人消息";
         } else if (var1 == 6) {
            var3 = "俦亞探敞";
            var3 = "信件接收";
         } else if (var1 == 7) {
            var3 = "勸兊夥古";
            var3 = "加入好友";
         } else if (var1 == 8) {
            var3 = "探县牮咩";
            var3 = "接受物品";
         } else if (var1 == 9) {
            var3 = "揽司纜阰";
            var3 = "接受组队";
         } else if (var1 == 10) {
            var3 = "耆爠觕舚";
            var3 = "老版角色";
         } else if (var1 == 11) {
            var3 = "儫闂领衣爡敧";
            var3 = "关闭飞行特效";
         } else if (var1 == 12) {
            var3 = "麰讣屧圷嚖叴镆飙蠤";
            var3 = "默认小地图右键飞行";
         } else if (var1 == 13) {
            var3 = "黷诼寔趷佐異仔扉衣";
            var3 = "默认寻路使用任我行";
         } else {
            var3 = "";
         }

         this.im.setText(var3);
         if (var1 == 0) {
            this.im.setBounds(52, 40, 80, 20);
            this.arr.zb(132, 40, 100, 20);
            this.arr.n(var2);
            this.im.setVisible(true);
            this.arr.setVisible(true);
         } else if (var1 == 1) {
            this.im.setBounds(306, 40, 80, 20);
            this.arr.zb(386, 40, 100, 20);
            this.arr.n(var2);
            this.im.setVisible(true);
            this.arr.setVisible(true);
         } else {
            this.im.setBounds(40 + var1 % 2 * 290, 41 + var1 / 2 * 35, 170, 20);
            this.co.setBounds(215 + var1 % 2 * 95, 43 + var1 / 2 * 35, 17, 17);
            this.im.setVisible(true);
            if (var2 == 0) {
               var3 = "\u001bdGbG5Q)\u0018i\u000f";
               var3 = "sc/e/29.png";
            } else {
               var3 = "\\;\u0000=\u0000k\u001fv_6H";
               var3 = "sc/e/30.png";
            }

            this.co.dp(var3);
            this.co.setVisible(true);
            if (this.arr != null) {
               this.arr.setVisible(false);
            }
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   // $VF: synthetic method
   static com.xy.q.Class44 ajs(Class119 var0) {
      return var0.arr;
   }

   // $VF: synthetic method
   static int ajt(Class119 var0) {
      return var0.eg;
   }
}
