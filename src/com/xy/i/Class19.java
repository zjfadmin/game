package com.xy.i;

import com.xy.a.q.Class100;
import com.xy.a.q.Class101;
import com.xy.a.q.Class103;
import com.xy.a.q.Class104;
import com.xy.a.q.Class105;
import com.xy.a.q.Class108;
import com.xy.a.q.Class111;
import com.xy.a.q.Class117;
import com.xy.a.q.Class33;
import com.xy.a.q.Class35;
import com.xy.a.q.Class39;
import com.xy.a.q.Class40;
import com.xy.a.q.Class41;
import com.xy.a.q.Class42;
import com.xy.a.q.Class43;
import com.xy.a.q.Class44;
import com.xy.a.q.Class45;
import com.xy.a.q.Class47;
import com.xy.a.q.Class55;
import com.xy.a.q.Class57;
import com.xy.a.q.Class59;
import com.xy.a.q.Class64;
import com.xy.a.q.Class67;
import com.xy.a.q.Class70;
import com.xy.a.q.Class73;
import com.xy.a.q.Class79;
import com.xy.a.q.Class85;
import com.xy.a.q.Class86;
import com.xy.a.q.Class88;
import com.xy.a.q.Class90;
import com.xy.a.q.Class94;
import com.xy.a.q.Class97;
import com.xy.a.q.Class98;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class19 extends Class1 {
   private Object pg;
   private int ah;

   public Class19(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   public void n(int var1) {
      this.ah = var1;
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.ah == 1) {
         ((Class88)this.form).y(-1);
      } else if (this.ah >= 2 && this.ah <= 5) {
         ((Class88)this.form).g(this.ah - 2);
      } else if (this.ah == 6) {
         ((Class88)this.form).f();
      } else if (this.ah == 7) {
         ((Class88)this.form).e();
      } else if (this.ah == 13) {
         ((Class103)this.form).h();
      } else if (this.ah == 14 || this.ah == 15) {
         ((Class103)this.form).cr(this.ah == 14);
      } else if (this.ah == 24) {
         ((Class35)this.form).h();
      } else if (this.ah >= 31 && this.ah <= 36) {
         ((Class43)this.form).g(this.ah);
      } else if (this.ah >= 51 && this.ah <= 62) {
         ((Class67)this.form).g(this.ah);
      } else if (this.ah == 63) {
         GameClient var2 = this.form.za();
         String var3 = "-";
         var2.k(Agreement.getSendTextAES("teamArena", "A"));
      } else if (this.ah == 64) {
         GameClient var10000 = this.form.za();
         String var10002 = "\u000e";
         var10000.k(Agreement.getSendTextAES("teamArena", "D"));
      } else if (this.ah == 65) {
         ((Class104)this.form).h();
      } else if (this.ah == 71) {
         ((Class40)this.form).f();
      } else if (this.ah == 72) {
         ((com.xy.a.q.Class16)this.form).h();
      } else if (this.ah == 73) {
         ((com.xy.a.q.Class17)this.form).e();
      } else if (this.ah == 74) {
         ((com.xy.a.q.Class12)this.form).e();
      } else if (this.ah == 91) {
         ((com.xy.a.q.Class18)this.form).h();
      } else if (this.ah == 101 || this.ah == 102 || this.ah == 103) {
         ((Class90)this.form).g(this.ah);
      } else if (this.ah == 104) {
         ((Class45)this.form).h();
      } else if (this.ah == 105) {
         ((com.xy.a.q.Class8)this.form).gw(this.pg);
      } else if (this.ah == 106 || this.ah == 107) {
         ((Class85)this.form).g(this.ah);
      } else if (this.ah == 115) {
         ((Class64)this.form).yd(false);
      } else if (this.ah == 121) {
         ((Class55)this.form).gw(this.pg);
      } else if (this.ah == 122) {
         ((Class47)this.form).h();
      } else if (this.ah == 131) {
         ((Class117)this.form).f();
      } else if (this.ah == 141) {
         ((Class45)this.form.zc().j(92)).g(600);
      } else if (this.ah == 142) {
         ((Class97)this.form).h();
      } else if (this.ah == 143) {
         ((Class97)this.form).dh();
      } else if (this.ah == 161) {
         ((Class41)this.form).hy(false);
      } else if (this.ah == 162) {
         ((Class41)this.form).f();
      } else if (this.ah == 180) {
         ((Class105)this.form).h();
      } else if (this.ah == 187) {
         ((Class105)this.form).gw(this.pg);
      } else if (this.ah >= 181 && this.ah <= 186) {
         ((Class105)this.form).g(this.ah);
      } else if (this.ah == 188 || this.ah == 189) {
         ((Class94)this.form).g(this.ah);
      } else if (this.ah == 190) {
         ((Class39)this.form).gw(this.pg);
      } else if (this.ah >= 191 && this.ah <= 199) {
         ((Class70)this.form).g(this.ah);
      } else if (this.ah >= 200 && this.ah <= 202) {
         ((Class98)this.form).g(this.ah);
      } else if (this.ah == 203) {
         ((Class86)this.form).h();
      } else if (this.ah == 204) {
         ((Class44)this.form).h();
      } else if (this.ah == 205) {
         ((Class111)this.form).gw(this.pg);
      } else if (this.ah >= 208 && this.ah <= 215) {
         ((com.xy.a.q.Class19)this.form).g(this.ah);
      } else if (this.ah == 223) {
         ((Class108)this.form).h();
      } else if (this.ah >= 224 && this.ah <= 226) {
         ((com.xy.a.q.Class30)this.form).g(this.ah);
      } else if (this.ah == 228) {
         ((Class59)this.form).f();
      } else if (this.ah == 229) {
         ((Class42)this.form).h();
      } else if (this.ah >= 231 && this.ah <= 234) {
         ((Class101)this.form).y(this.ah);
      } else if (this.ah >= 261 && this.ah <= 264) {
         ((Class33)this.form).y(this.ah);
      } else if (this.ah >= 274 && this.ah <= 281) {
         ((Class79)this.form).y(this.ah);
      } else if (this.ah >= 282 && this.ah <= 283) {
         ((Class100)this.form).g(this.ah);
      } else if (this.ah >= 291 && this.ah <= 293) {
         ((com.xy.a.q.Class20)this.form).g(this.ah);
      } else if (this.ah == 307) {
         ((com.xy.a.q.Class3)this.form).y(this.ah);
      } else if (this.ah != 311 && this.ah != 312) {
         if (this.ah >= 323 && this.ah <= 325) {
            ((com.xy.a.q.Class13)this.form).at(this.ah);
         }
      } else {
         ((Class73)this.form).g(this.ah);
      }
   }

   public int il() {
      return this.ah;
   }

   public Class19(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
      this.form = var4;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
      if (this.ah != 11 && this.ah != 12) {
         if (this.ah != 21 && this.ah != 22 && this.ah != 23) {
            if (this.ah != 81 && this.ah != 82) {
               if (this.ah >= 111 && this.ah <= 114) {
                  if (var2) {
                     ((Class57)this.form).g(this.ah - 111);
                     return;
                  }
               } else if (this.ah >= 116 && this.ah <= 120) {
                  if (var2) {
                     ((com.xy.a.i.Class23)this.form).g(this.ah - 116);
                     return;
                  }
               } else if (this.ah >= 123 && this.ah <= 126) {
                  if (var2) {
                     ((Class117)this.form).g(this.ah - 123);
                     return;
                  }
               } else if (this.ah >= 133 && this.ah <= 135) {
                  if (var2) {
                     ((Class97)this.form).y(this.ah - 133);
                     return;
                  }
               } else if (this.ah >= 151 && this.ah <= 153) {
                  if (var2) {
                     ((Class41)this.form).g(this.ah - 151);
                     return;
                  }
               } else if (this.ah >= 171 && this.ah <= 172) {
                  if (var2) {
                     ((Class105)this.form).y(this.ah - 171);
                     return;
                  }
               } else if (this.ah != 206 && this.ah != 207) {
                  if (this.ah != 221 && this.ah != 222) {
                     if (this.ah == 230) {
                        if (var2) {
                           ((Class101)this.form).g((Integer)this.pg);
                           return;
                        }
                     } else if (this.ah >= 241 && this.ah <= 244) {
                        if (var2) {
                           ((com.xy.a.q.Class6)this.form).y(this.ah - 241);
                           return;
                        }
                     } else if (this.ah >= 251 && this.ah <= 256) {
                        if (var2) {
                           ((Class33)this.form).g(this.ah - 251);
                           return;
                        }
                     } else if (this.ah >= 271 && this.ah <= 273) {
                        if (var2) {
                           ((Class79)this.form).g(this.ah - 271);
                           return;
                        }
                     } else if (this.ah >= 301 && this.ah <= 306) {
                        if (var2) {
                           ((com.xy.a.q.Class3)this.form).g(this.ah - 301);
                           return;
                        }
                     } else if (this.ah >= 321 && this.ah <= 322 && var2) {
                        ((com.xy.a.q.Class13)this.form).g(this.ah - 321);
                     }
                  } else if (var2) {
                     ((Class108)this.form).g(this.ah - 221);
                     return;
                  }
               } else if (var2) {
                  ((com.xy.a.q.Class19)this.form).y(this.ah - 206);
                  return;
               }
            } else if (var2) {
               ((com.xy.a.q.Class18)this.form).g(this.ah - 81);
               return;
            }
         } else if (var2) {
            ((Class35)this.form).g(this.ah - 20);
            return;
         }
      } else if (var2) {
         ((Class103)this.form).g(this.ah - 11);
         return;
      }
   }

   public Class19(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      Class19 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public void gw(Object var1) {
      this.pg = var1;
   }
}
