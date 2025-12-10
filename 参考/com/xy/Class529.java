package com.xy;

import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class529 extends Class93 {
   private int cy;
   private Object cz;

   public int ae() {
      return this.cy;
   }

   public Class529(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.cy = var3;
      this.form = var4;
   }

   public Class529(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void ab(int var1) {
      this.cy = var1;
   }

   public void ac(MouseEvent var1, boolean var2) {
      if (this.cy != (91 & 47) && this.cy != (108 & 31)) {
         if (this.cy != (125 & 23) && this.cy != (55 & 94) && this.cy != (23 & 127)) {
            if (this.cy != (81 & 127) && this.cy != (87 & 122)) {
               if (this.cy >= (111 & 127) && this.cy <= (127 & 114)) {
                  if (var2) {
                     ((Class595)this.form).y(this.cy - (111 & 127));
                     return;
                  }
               } else if (this.cy >= (125 & 118) && this.cy <= (126 & 121)) {
                  if (var2) {
                     ((Class671)this.form).y(this.cy - (124 & 119));
                     return;
                  }
               } else if (this.cy >= 123 && this.cy <= 126) {
                  if (var2) {
                     ((Class583)this.form).y(this.cy - 123);
                     return;
                  }
               } else if (this.cy >= 133 && this.cy <= 135) {
                  if (var2) {
                     ((Class185)this.form).as(this.cy - 133);
                     return;
                  }
               } else if (this.cy >= 151 && this.cy <= 153) {
                  if (var2) {
                     ((Class347)this.form).y(this.cy - 151);
                     return;
                  }
               } else if (this.cy >= 171 && this.cy <= 172) {
                  if (var2) {
                     ((Class312)this.form).dp(this.cy - 171);
                     return;
                  }
               } else if (this.cy != 206 && this.cy != 207) {
                  if (this.cy != 221 && this.cy != 222) {
                     if (this.cy == 230) {
                        if (var2) {
                           ((Class657)this.form).y((Integer)this.cz);
                           return;
                        }
                     } else if (this.cy >= 241 && this.cy <= 244) {
                        if (var2) {
                           ((Class174)this.form).as(this.cy - 241);
                           return;
                        }
                     } else if (this.cy >= 251 && this.cy <= 256) {
                        if (var2) {
                           ((Class417)this.form).y(this.cy - 251);
                           return;
                        }
                     } else if (this.cy >= 271 && this.cy <= 273) {
                        if (var2) {
                           ((Class139)this.form).dp(this.cy - 271);
                           return;
                        }
                     } else if (this.cy >= 301 && this.cy <= 306) {
                        if (var2) {
                           ((Class162)this.form).dp(this.cy - 301);
                           return;
                        }
                     } else if (this.cy >= 321 && this.cy <= 322 && var2) {
                        ((Class428)this.form).dp(this.cy - 321);
                     }
                  } else if (var2) {
                     ((Class674)this.form).y(this.cy - 221);
                     return;
                  }
               } else if (var2) {
                  ((Class653)this.form).as(this.cy - 206);
                  return;
               }
            } else if (var2) {
               ((Class684)this.form).as(this.cy - (93 & 115));
               return;
            }
         } else if (var2) {
            ((Class420)this.form).y(this.cy - (127 & 20));
            return;
         }
      } else if (var2) {
         ((Class21)this.form).y(this.cy - (47 & 91));
         return;
      }

   }

   public void af(MouseEvent var1) {
      if (this.cy == 5 >> 2) {
         ((Class84)this.form).as(-4 >> 2);
      } else if (this.cy >= (1 ^ 3) && this.cy <= --5) {
         ((Class84)this.form).dp(this.cy - --2);
      } else if (this.cy == (95 & 38)) {
         ((Class84)this.form).d();
      } else if (this.cy == (15 & 119)) {
         ((Class84)this.form).s();
      } else if (this.cy == (79 & 61)) {
         ((Class21)this.form).d();
      } else if (this.cy != (15 & 126) && this.cy != (31 & 111)) {
         if (this.cy == (126 & 25)) {
            ((Class420)this.form).p();
         } else if (this.cy >= (63 & 95) && this.cy <= (102 & 61)) {
            ((Class559)this.form).y(this.cy);
         } else if (this.cy >= (55 & 123) && this.cy <= (63 & 126)) {
            ((Class204)this.form).y(this.cy);
         } else if (this.cy == (127 & 63)) {
            this.form.uw().d(Agreement.getSendTextAES("teamArena", "A"));
         } else if (this.cy == (88 & 103)) {
            this.form.uw().d(Agreement.getSendTextAES("teamArena", "D"));
         } else if (this.cy == (115 & 77)) {
            ((Class392)this.form).d();
         } else if (this.cy == (87 & 111)) {
            ((Class474)this.form).p();
         } else if (this.cy == (77 & 122)) {
            ((Class108)this.form).s();
         } else if (this.cy == 73) {
            ((Class381)this.form).o();
         } else if (this.cy == 74) {
            ((Class242)this.form).p();
         } else if (this.cy == 91) {
            ((Class684)this.form).d();
         } else if (this.cy != 101 && this.cy != 102 && this.cy != 103) {
            if (this.cy == 104) {
               ((Class110)this.form).p();
            } else if (this.cy == 105) {
               ((Class376)this.form).bq(this.cz);
            } else if (this.cy != 106 && this.cy != 107) {
               if (this.cy == 115) {
                  ((Class250)this.form).ij((boolean)(2 & 5));
               } else if (this.cy == 121) {
                  ((Class620)this.form).bq(this.cz);
               } else if (this.cy == 122) {
                  ((Class476)this.form).d();
               } else if (this.cy == 131) {
                  ((Class583)this.form).s();
               } else if (this.cy == 141) {
                  ((Class110)this.form.ve().e(92)).y(600);
               } else if (this.cy == 142) {
                  ((Class185)this.form).d();
               } else if (this.cy == 143) {
                  ((Class185)this.form).bl();
               } else if (this.cy == 161) {
                  ((Class347)this.form).r((boolean)(2 & 5));
               } else if (this.cy == 162) {
                  ((Class347)this.form).s();
               } else if (this.cy == 180) {
                  ((Class312)this.form).d();
               } else if (this.cy == 187) {
                  ((Class312)this.form).bq(this.cz);
               } else if (this.cy >= 181 && this.cy <= 186) {
                  ((Class312)this.form).as(this.cy);
               } else if (this.cy != 188 && this.cy != 189) {
                  if (this.cy == 190) {
                     ((Class284)this.form).bq(this.cz);
                  } else if (this.cy >= 191 && this.cy <= 199) {
                     ((Class147)this.form).y(this.cy);
                  } else if (this.cy >= 200 && this.cy <= 202) {
                     ((Class508)this.form).as(this.cy);
                  } else if (this.cy == 203) {
                     ((Class669)this.form).d();
                  } else if (this.cy == 204) {
                     ((Class309)this.form).d();
                  } else if (this.cy == 205) {
                     ((Class645)this.form).bq(this.cz);
                  } else if (this.cy >= 208 && this.cy <= 215) {
                     ((Class653)this.form).y(this.cy);
                  } else if (this.cy == 223) {
                     ((Class674)this.form).d();
                  } else if (this.cy >= 224 && this.cy <= 226) {
                     ((Class53)this.form).y(this.cy);
                  } else if (this.cy == 228) {
                     ((Class40)this.form).s();
                  } else if (this.cy == 229) {
                     ((Class208)this.form).d();
                  } else if (this.cy >= 231 && this.cy <= 234) {
                     ((Class657)this.form).as(this.cy);
                  } else if (this.cy >= 261 && this.cy <= 264) {
                     ((Class417)this.form).dp(this.cy);
                  } else if (this.cy >= 274 && this.cy <= 281) {
                     ((Class139)this.form).as(this.cy);
                  } else if (this.cy >= 282 && this.cy <= 283) {
                     ((Class368)this.form).y(this.cy);
                  } else if (this.cy >= 291 && this.cy <= 293) {
                     ((Class623)this.form).y(this.cy);
                  } else if (this.cy == 307) {
                     ((Class162)this.form).as(this.cy);
                  } else if (this.cy != 311 && this.cy != 312) {
                     if (this.cy >= 323 && this.cy <= 325) {
                        ((Class428)this.form).aeb(this.cy, (boolean)(5 >> 3));
                     }

                  } else {
                     ((Class166)this.form).y(this.cy);
                  }
               } else {
                  ((Class229)this.form).y(this.cy);
               }
            } else {
               ((Class258)this.form).y(this.cy);
            }
         } else {
            ((Class570)this.form).y(this.cy);
         }
      } else {
         ((Class21)this.form).gt((boolean)(this.cy == (31 & 110) ? --1 : 0));
      }
   }

   public void bq(Object var1) {
      this.cz = var1;
   }

   public Class529(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.cy = var3;
      Class529 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }
}
