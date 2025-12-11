package com.xy.i;

import com.xy.a.Class100;
import com.xy.a.Class106;
import com.xy.a.Class107;
import com.xy.a.Class110;
import com.xy.a.Class113;
import com.xy.a.Class115;
import com.xy.a.Class121;
import com.xy.a.Class127;
import com.xy.a.Class138;
import com.xy.a.Class142;
import com.xy.a.Class26;
import com.xy.a.Class27;
import com.xy.a.Class29;
import com.xy.a.Class41;
import com.xy.a.Class44;
import com.xy.a.Class47;
import com.xy.a.Class48;
import com.xy.a.Class50;
import com.xy.a.Class51;
import com.xy.a.Class52;
import com.xy.a.Class56;
import com.xy.a.Class59;
import com.xy.a.Class63;
import com.xy.a.Class68;
import com.xy.a.Class74;
import com.xy.a.Class83;
import com.xy.a.Class91;
import com.xy.a.Class92;
import com.xy.a.Class93;
import com.xy.a.Class98;
import com.xy.a.q.Class49;
import com.xy.a.w.Class25;
import com.xy.bean.FriendBean;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.game.Task;
import com.xy.q.Class30;
import com.xy.readbean.ActiveAward;
import com.xy.socket.Agreement;
import com.xy.text.WatchServiceRunnable;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class18 extends Class1 {
   private int eg;
   private Object acx;

   public Class18(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.eg == 155) {
         int var2 = (Integer)this.acx;
         ActiveAward[] var4 = this.form.yt().q().getAwards();
         Class48 var5 = (Class48)this.form.zc().j(46);
         StringBuilder var10001 = new StringBuilder(String.valueOf(var4[var2].getActive()));
         String var10002 = "浾趄夓勶";
         var5.es(var10001.append("活跃奖励").toString(), var4[var2].getValue());
      }
   }

   public Class18(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.eg = var3;
      this.form = var4;
   }

   public void n(int var1) {
      this.eg = var1;
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.eg == 1) {
         Class0.ff(155, this.form.afx);
      } else if (this.eg == 2) {
         Class0.ff(22, this.form.afx);
      } else if (this.eg == 3 || this.eg == 4 || this.eg == 5 || this.eg == 6 || this.eg == 7) {
         ((Class74)this.form).xd(this.eg, this);
      } else if (this.eg == 11) {
         Class0.ff(1, this.form.afx);
      } else if (this.eg == 12) {
         Class0.ff(2, this.form.afx);
      } else if (this.eg == 13) {
         if (this.form.afx.baseView.at(3)) {
            String var8 = Agreement.getSendTextAES("team6", null);
            this.form.afx.getClient().k(var8);
            this.form.afx.baseView.ab(3, false);
         } else {
            this.form.afx.baseView.g(this.eg);
         }
      } else if (this.eg == 14) {
         this.form.afx.setMouseIndex(com.xy.v.Class3.d);
      } else if (this.eg == 15 || this.eg == 17) {
         this.form.afx.baseView.g(this.eg);
      } else if (this.eg == 16) {
         Class0.ff(82, this.form.afx);
      } else if (this.eg == 18) {
         Class0.ff(3, this.form.afx);
      } else if (this.eg == 19) {
         Class74 var7;
         if ((var7 = (Class74)this.form).at(9)) {
            FriendBean var10;
            if ((var10 = this.form.yx().getFriendChat()) != null) {
               var10.setChat(false);
               ((Class52)this.form.zc().j(56)).st(this.form.yx().getFriend(var10.getFid()));
            }

            if (this.form.yx().getFriendChat() == null) {
               var7.ab(9, false);
            }
         } else {
            Class0.ff(4, this.form.afx);
         }
      } else if (this.eg == 20) {
         Class0.ff(48, this.form.afx);
      } else if (this.eg == 21) {
         this.form.afx.baseView.g(this.eg);
      } else if (this.eg >= 22 && this.eg <= 27) {
         Class18 var11;
         if (this.eg == 22) {
            if (this.form.yx().teamBean != null) {
               Class0.ff(13, this.form.afx);
               var11 = this;
            } else {
               var11 = this;
               this.form.afx.setMouseIndex(com.xy.v.Class3.h);
            }
         } else if (this.eg == 23) {
            var11 = this;
            com.xy.d.Class8.be(this.form.afx);
         } else if (this.eg == 24) {
            var11 = this;
            this.form.afx.setMouseIndex(com.xy.v.Class3.j);
         } else if (this.eg == 25) {
            var11 = this;
            this.form.afx.setMouseIndex(com.xy.v.Class3.l);
         } else if (this.eg == 26) {
            if (this.form.za().gameMount) {
               Class0.ff(172, this.form.afx);
               var11 = this;
            } else {
               Class0.ff(7, this.form.afx);
               var11 = this;
            }
         } else {
            if (this.eg == 27) {
               Class0.ff(147, this.form.afx);
            }

            var11 = this;
         }

         var11.form.afx.baseView.f();
      } else if (this.eg == 28) {
         Class0.ff(52, this.form.afx);
      } else if (this.eg == 31) {
         Class0.ff(60, this.form.afx);
      } else if (this.eg == 32) {
         Class0.ff(40, this.form.afx);
      } else if (this.eg == 33) {
         Class0.ff(167, this.form.afx);
      } else if (this.eg >= 51 && this.eg <= 70) {
         Class18 var10000;
         if (this.eg == 51) {
            Class0.ff(50, this.form.afx);
            var10000 = this;
         } else if (this.eg == 52) {
            Class0.ff(121, this.form.afx);
            var10000 = this;
         } else if (this.eg == 53) {
            Class0.ff(145, this.form.afx);
            var10000 = this;
         } else if (this.eg == 54) {
            int var9;
            if ((var9 = this.form.yx().getPackRecord().getFZType()) == 0) {
               ((com.xy.a.Class6)this.form.zc().j(27)).g(var9);
               return;
            }

            Class0.ff(133, this.form.afx);
            var10000 = this;
         } else if (this.eg == 55) {
            Class0.ff(117, this.form.afx);
            var10000 = this;
         } else if (this.eg == 56) {
            if (this.form.za().l(2, 12)) {
               return;
            }

            this.form.zc().b(39);
            com.xy.a.q.Class6 var2 = (com.xy.a.q.Class6)this.form.zc().j(39);
            var10000 = this;
            var2.y(3);
         } else if (this.eg == 57) {
            this.form.zc().b(39);
            com.xy.a.q.Class6 var5 = (com.xy.a.q.Class6)this.form.zc().j(39);
            var10000 = this;
            var5.y(2);
         } else if (this.eg == 58) {
            WatchServiceRunnable.g();
            var10000 = this;
         } else if (this.eg == 59) {
            String var10001 = "\u0002mk";
            String var6 = Agreement.getSendTextAES("exchange", "X01");
            var10000 = this;
            this.form.afx.getClient().k(var6);
         } else if (this.eg == 60) {
            Class0.ff(114, this.form.afx);
            var10000 = this;
         } else if (this.eg == 61) {
            Class0.ff(68, this.form.afx);
            var10000 = this;
         } else {
            if (this.eg == 62) {
               Class0.ff(150, this.form.afx);
            }

            var10000 = this;
         }

         var10000.form.afx.baseView.f();
      } else if (this.eg == 90) {
         this.form.afx.baseView.xn().h();
      } else if (this.eg == 110 || this.eg == 111) {
         ((com.xy.a.Class23)this.form).cr(this.eg == 110);
      } else if (this.eg == 112) {
         ((Class113)this.form).h();
      } else if (this.eg == 113) {
         ((Class63)this.form).f();
      } else if (this.eg == 114) {
         this.form.afx.gameFrame.fg(this.form.afx);
      } else if (this.eg == 115) {
         this.h();
      } else if (this.eg == 116) {
         HandleOption.b(this.form.afx);
      } else if (this.eg >= 120 && this.eg <= 124) {
         ((Class25)this.form).g(this.eg);
      } else if (this.eg == 131) {
         ((Class110)this.form).h();
      } else if (this.eg == 141 || this.eg == 142 || this.eg == 143) {
         ((Class92)this.form).g(this.eg);
      } else if (this.eg == 144) {
         ((Class27)this.form).g(this.eg);
      } else if (this.eg == 145) {
         ((Class68)this.form).h();
      } else if (this.eg == 146) {
         ((Class59)this.form).h();
      } else if (this.eg == 151 || this.eg == 152 || this.eg == 153) {
         ((Class47)this.form).g(this.eg);
      } else if (this.eg == 154 || this.eg == 155) {
         ((com.xy.a.Class19)this.form).gs(this.eg, this.acx);
      } else if (this.eg != 156 && this.eg != 157) {
         if (this.eg == 164 || this.eg >= 167 && this.eg <= 172 || this.eg == 311 || this.eg == 312) {
            ((Class44)this.form).y(this.eg);
         } else if (this.eg >= 185 && this.eg <= 194) {
            ((Class93)this.form).gs(this.eg, this.acx);
         } else if (this.eg == 204 || this.eg == 205) {
            ((com.xy.a.Class20)this.form).g(this.eg);
         } else if (this.eg >= 209 && this.eg <= 213) {
            ((Class115)this.form).g(this.eg);
         } else if (this.eg == 214 || this.eg == 215) {
            ((Class91)this.form).g(this.eg);
         } else if (this.eg == 216) {
            ((Class83)this.form).f();
         } else if ((this.eg < 225 || this.eg > 229) && (this.eg < 245 || this.eg > 249)) {
            if (this.eg >= 240 && this.eg <= 244) {
               ((Class107)this.form).lm(this.eg);
            } else if (this.eg >= 251 && this.eg <= 256) {
               ((Class41)this.form).y(this.eg);
            } else if (this.eg == 257) {
               ((Class142)this.form).f();
            } else if (this.eg >= 261 && this.eg <= 270) {
               ((Class26)this.form).g(this.eg);
            } else if (this.eg == 271 || this.eg == 272) {
               ((Class121)this.form).aka(this.eg, this.acx, this);
            } else if (this.eg >= 281 && this.eg <= 284) {
               ((Class100)this.form).adq(this.eg, this.acx, this);
            } else if (this.eg == 291) {
               ((Class29)this.form).g(this.eg);
            } else if (this.eg == 304) {
               int var3 = this.form.yx().getPackRecord().getFZType();
               ((com.xy.a.Class6)this.form.zc().j(27)).g(var3);
            } else if (this.eg == 313) {
               ((Class138)this.form).y(this.eg);
            } else if (this.eg == 314 || this.eg == 315 || this.eg == 316 || this.eg == 317) {
               ((Class51)this.form).y(this.eg);
            } else if (this.eg >= 320 && this.eg <= 328) {
               ((Class51)this.form).bi(this.eg - 320);
            } else {
               if (this.eg >= 341 && this.eg <= 343) {
                  ((Class56)this.form).gs(this.eg, this.acx);
               }
            }
         } else {
            ((Class127)this.form).g(this.eg);
         }
      } else {
         ((Class106)this.form).g(this.eg);
      }
   }

   public void gw(Object var1) {
      this.acx = var1;
   }

   public int il() {
      return this.eg;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
      if (this.eg >= 161 && this.eg <= 163) {
         if (var2) {
            ((Class44)this.form).g(this.eg - 161);
            return;
         }
      } else if (this.eg != 165 && this.eg != 166) {
         if (this.eg >= 181 && this.eg <= 184) {
            if (var2) {
               ((Class93)this.form).g(this.eg - 181);
               return;
            }
         } else if (this.eg >= 201 && this.eg <= 203) {
            if (var2) {
               ((Class98)this.form).g(this.eg - 201);
               return;
            }
         } else if (this.eg >= 206 && this.eg <= 208) {
            if (var2) {
               ((Class115)this.form).y(this.eg - 206);
               return;
            }
         } else if (this.eg >= 217 && this.eg <= 218) {
            if (var2) {
               ((Class127)this.form).lm(this.eg - 217);
               return;
            }
         } else if (this.eg >= 221 && this.eg <= 222) {
            if (var2) {
               ((Class127)this.form).bi(this.eg - 221);
               return;
            }
         } else if (this.eg >= 231 && this.eg <= 233) {
            if (var2) {
               ((Class107)this.form).y(this.eg - 231);
               return;
            }
         } else if (this.eg >= 236 && this.eg <= 238) {
            if (var2) {
               ((Class107)this.form).bi(this.eg - 236);
               return;
            }
         } else if (this.eg >= 301 && this.eg <= 303 && var2) {
            ((Class49)this.form).y(this.eg - 301);
         }
      } else if (var2) {
         ((Class44)this.form).lm(this.eg - 165);
         return;
      }
   }

   public void h() {
      RoleData var1;
      RoleTaskData var2 = (var1 = this.form.yx()) != null ? var1.getTaskSystem() : null;
      if (var2 != null) {
         int var3 = ((Class50)this.form).dx();
         Task var4;
         if ((var4 = var2.getTaskId(var3)) == null) {
            String var6 = "達抳觜厌淕盞亦勻";
            this.form.afx.dp("选择要取消的任务");
         } else if (com.xy.v.Class22.l() < var2.time + 60000L) {
            String var10001 = "伧靅视笌忂t剁铚戊肸凊久武厓淏亾勦";
            this.form.afx.dp("你需要等待1分钟才能再一次取消任务");
         } else {
            var2.time = com.xy.v.Class22.l();
            String var10003 = "\u001f";
            String var5 = Agreement.getSendTextAES("taskN", "E" + var4.getTaskId());
            this.form.za().k(var5);
         }
      }
   }

   public Class18(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.eg = var3;
      Class18 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(com.xy.q.Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(0);
      this.setText(var6);
   }

   public Object jx() {
      return this.acx;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.eg == 155) {
         this.form.zc().f(46);
      }
   }
}
