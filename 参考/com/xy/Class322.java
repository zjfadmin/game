package com.xy;

import com.xy.bean.FriendBean;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.game.Task;
import com.xy.readbean.ActiveAward;
import com.xy.socket.Agreement;
import com.xy.text.WatchServiceRunnable;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class322 extends Class93 {
   private int cy;
   private Object cz;

   public Class322(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.cy = var3;
      Class322 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(5 >> 3);
      this.setText(var6);
   }

   public Class322(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void af(MouseEvent var1) {
      if (this.cy == --1) {
         Class658.cy(23227 & 9695, this.form.aej);
      } else if (this.cy == --2) {
         Class658.cy(127 & 22, this.form.aej);
      } else if (this.cy != --3 && this.cy != --4 && this.cy != --5 && this.cy != (31 & 102) && this.cy != (39 & 95)) {
         if (this.cy == (75 & 63)) {
            Class658.cy(5 >> 2, this.form.aej);
         } else if (this.cy == (29 & 110)) {
            Class658.cy(5 >> 1, this.form.aej);
         } else {
            String var4;
            if (this.cy == (125 & 15)) {
               if (this.form.aej.baseView.au(--3)) {
                  var4 = Agreement.getSendTextAES("team6", (String)null);
                  this.form.aej.getClient().d(var4);
                  this.form.aej.baseView.jy(--3, (boolean)(5 >> 3));
               } else {
                  this.form.aej.baseView.y(this.cy);
               }
            } else if (this.cy == (62 & 79)) {
               this.form.aej.setMouseIndex(Class320.a);
            } else if (this.cy != (47 & 95) && this.cy != (125 & 19)) {
               if (this.cy == (58 & 85)) {
                  Class658.cy(126 & 83, this.form.aej);
               } else if (this.cy == (114 & 31)) {
                  Class658.cy(--3, this.form.aej);
               } else if (this.cy == (87 & 59)) {
                  Class219 var5;
                  if ((var5 = (Class219)this.form).au(57 & 79)) {
                     FriendBean var6;
                     if ((var6 = this.form.vd().getFriendChat()) != null) {
                        var6.setChat((boolean)(5 >> 3));
                        ((Class494)this.form.ve().e(59 & 124)).afc(this.form.vd().getFriend(var6.getFid()));
                     }

                     if (this.form.vd().getFriendChat() == null) {
                        var5.jy(9, (boolean)(3 & 4));
                     }

                  } else {
                     Class658.cy(4, this.form.aej);
                  }
               } else if (this.cy == 20) {
                  Class658.cy(48, this.form.aej);
               } else if (this.cy == 21) {
                  this.form.aej.baseView.y(this.cy);
               } else {
                  Class322 var10000;
                  if (this.cy >= 22 && this.cy <= 27) {
                     if (this.cy == 22) {
                        if (this.form.vd().teamBean != null) {
                           Class658.cy(13, this.form.aej);
                           var10000 = this;
                        } else {
                           var10000 = this;
                           this.form.aej.setMouseIndex(Class320.d);
                        }
                     } else if (this.cy == 23) {
                        var10000 = this;
                        Class183.r(this.form.aej);
                     } else if (this.cy == 24) {
                        var10000 = this;
                        this.form.aej.setMouseIndex(Class320.e);
                     } else if (this.cy == 25) {
                        var10000 = this;
                        this.form.aej.setMouseIndex(Class320.n);
                     } else if (this.cy == 26) {
                        if (this.form.uw().gameMount) {
                           Class658.cy(172, this.form.aej);
                           var10000 = this;
                        } else {
                           Class658.cy(7, this.form.aej);
                           var10000 = this;
                        }
                     } else {
                        if (this.cy == 27) {
                           Class658.cy(147, this.form.aej);
                        }

                        var10000 = this;
                     }

                     var10000.form.aej.baseView.ke();
                  } else if (this.cy == 28) {
                     Class658.cy(52, this.form.aej);
                  } else if (this.cy == 29) {
                     Class658.cy(187, this.form.aej);
                  } else if (this.cy == 31) {
                     Class658.cy(60, this.form.aej);
                  } else if (this.cy == 32) {
                     Class658.cy(40, this.form.aej);
                  } else if (this.cy == 33) {
                     Class658.cy(167, this.form.aej);
                  } else {
                     if (this.cy == 34) {
                        if (this.form.uw().k(--4)) {
                           Class658.cy(193, this.form.aej);
                           return;
                        }
                     } else {
                        int var2;
                        if (this.cy >= 51 && this.cy <= 70) {
                           if (this.cy == 51) {
                              Class658.cy(50, this.form.aej);
                              var10000 = this;
                           } else if (this.cy == 52) {
                              Class658.cy(121, this.form.aej);
                              var10000 = this;
                           } else if (this.cy == 53) {
                              Class658.cy(145, this.form.aej);
                              var10000 = this;
                           } else if (this.cy == 54) {
                              if ((var2 = this.form.vd().getPackRecord().getFZType()) == 0) {
                                 ((Class472)this.form.ve().e(27)).dp(var2);
                                 return;
                              }

                              Class658.cy(133, this.form.aej);
                              var10000 = this;
                           } else if (this.cy == 55) {
                              Class658.cy(117, this.form.aej);
                              var10000 = this;
                           } else {
                              Class174 var3;
                              if (this.cy == 56) {
                                 if (this.form.uw().n(5 >> 1, 12)) {
                                    return;
                                 }

                                 this.form.ve().a(39);
                                 var3 = (Class174)this.form.ve().e(39);
                                 var10000 = this;
                                 var3.as(--3);
                              } else if (this.cy == 57) {
                                 this.form.ve().a(39);
                                 var3 = (Class174)this.form.ve().e(39);
                                 var10000 = this;
                                 var3.as(5 >> 1);
                              } else if (this.cy == 58) {
                                 WatchServiceRunnable.c();
                                 var10000 = this;
                              } else if (this.cy == 59) {
                                 var4 = Agreement.getSendTextAES("exchange", "X01");
                                 var10000 = this;
                                 this.form.aej.getClient().d(var4);
                              } else if (this.cy == 60) {
                                 Class658.cy(114, this.form.aej);
                                 var10000 = this;
                              } else if (this.cy == 61) {
                                 Class658.cy(68, this.form.aej);
                                 var10000 = this;
                              } else {
                                 if (this.cy == 62) {
                                    Class658.cy(150, this.form.aej);
                                 }

                                 var10000 = this;
                              }
                           }

                           var10000.form.aej.baseView.ke();
                           return;
                        }

                        if (this.cy == 90) {
                           this.form.aej.baseView.kg().d();
                           return;
                        }

                        if (this.cy == 110 || this.cy == 111) {
                           ((Class573)this.form).r((boolean)(this.cy == 110 ? 3 >> 1 : 0));
                           return;
                        }

                        if (this.cy == 112) {
                           ((Class289)this.form).d();
                           return;
                        }

                        if (this.cy == 113) {
                           ((Class328)this.form).s();
                           return;
                        }

                        if (this.cy == 114) {
                           this.form.aej.gameFrame.ng(this.form.aej);
                           return;
                        }

                        if (this.cy == 115) {
                           this.d();
                           return;
                        }

                        if (this.cy == 116) {
                           HandleOption.m(this.form.aej);
                           return;
                        }

                        if (this.cy >= 120 && this.cy <= 124) {
                           ((Class207)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 131) {
                           ((Class62)this.form).d();
                           return;
                        }

                        if (this.cy == 141 || this.cy == 142 || this.cy == 143) {
                           ((Class599)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 144) {
                           ((Class273)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 145) {
                           ((Class200)this.form).d();
                           return;
                        }

                        if (this.cy == 146) {
                           ((Class15)this.form).d();
                           return;
                        }

                        if (this.cy == 151 || this.cy == 152 || this.cy == 153) {
                           ((Class675)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 154 || this.cy == 155) {
                           ((Class665)this.form).c(this.cy, this.cz);
                           return;
                        }

                        if (this.cy == 156 || this.cy == 157) {
                           ((Class0)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 164 || this.cy >= 167 && this.cy <= 172 || this.cy == 311 || this.cy == 312) {
                           ((Class439)this.form).as(this.cy);
                           return;
                        }

                        if (this.cy >= 185 && this.cy <= 194) {
                           ((Class622)this.form).c(this.cy, this.cz);
                           return;
                        }

                        if (this.cy == 204 || this.cy == 205) {
                           ((Class533)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy >= 209 && this.cy <= 213) {
                           ((Class210)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 214 || this.cy == 215) {
                           ((Class432)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 216) {
                           ((Class483)this.form).d();
                           return;
                        }

                        if (this.cy >= 225 && this.cy <= 229 || this.cy >= 245 && this.cy <= 249) {
                           ((Class130)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy >= 240 && this.cy <= 244) {
                           ((Class9)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy >= 251 && this.cy <= 256) {
                           ((Class107)this.form).dp(this.cy);
                           return;
                        }

                        if (this.cy == 257) {
                           ((Class605)this.form).s();
                           return;
                        }

                        if (this.cy >= 261 && this.cy <= 270) {
                           ((Class119)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 271 || this.cy == 272) {
                           ((Class49)this.form).ahw(this.cy, this.cz, this);
                           return;
                        }

                        if (this.cy >= 281 && this.cy <= 284) {
                           ((Class426)this.form).ut(this.cy, this.cz, this);
                           return;
                        }

                        if (this.cy == 291) {
                           ((Class418)this.form).y(this.cy);
                           return;
                        }

                        if (this.cy == 304) {
                           var2 = this.form.vd().getPackRecord().getFZType();
                           ((Class472)this.form.ve().e(27)).dp(var2);
                           return;
                        }

                        if (this.cy == 313) {
                           ((Class632)this.form).as(this.cy);
                           return;
                        }

                        if (this.cy == 314 || this.cy == 315 || this.cy == 316 || this.cy == 317) {
                           ((Class566)this.form).do(this.cy);
                           return;
                        }

                        if (this.cy >= 320 && this.cy <= 328) {
                           ((Class566)this.form).y(this.cy - 320);
                           return;
                        }

                        if (this.cy >= 341 && this.cy <= 343) {
                           ((Class120)this.form).c(this.cy, this.cz);
                        }
                     }

                  }
               }
            } else {
               this.form.aej.baseView.y(this.cy);
            }
         }
      } else {
         ((Class219)this.form).ko(this.cy, this);
      }
   }

   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.cy == (22975 & 9947)) {
         this.form.ve().n(47 & 126);
      }

   }

   public Object hr() {
      return this.cz;
   }

   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.cy == (16127 & 16795)) {
         int var4 = (Integer)this.cz;
         ActiveAward[] var2 = this.form.vc().w().getAwards();
         Class270 var3 = (Class270)this.form.ve().e(47 & 126);
         var3.rl(var2[var4].getActive() + "活跃奖励", var2[var4].getValue());
      }

   }

   public Class322(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.cy = var3;
      this.form = var4;
   }

   public void bq(Object var1) {
      this.cz = var1;
   }

   public void d() {
      RoleData var1;
      RoleTaskData var2 = (var1 = this.form.vd()) != null ? var1.getTaskSystem() : null;
      if (var2 != null) {
         int var3 = ((Class624)this.form).e();
         Task var4;
         if ((var4 = var2.getTaskId(var3)) == null) {
            this.form.aej.fw("选择要取消的任务");
         } else if (Class280.l() < var2.time + 60000L) {
            this.form.aej.fw("你需要等待1分钟才能再一次取消任务");
         } else {
            var2.time = Class280.l();
            String var5 = Agreement.getSendTextAES("taskN", "E" + var4.getTaskId());
            this.form.uw().d(var5);
         }
      }
   }

   public void ab(int var1) {
      this.cy = var1;
   }

   public void ac(MouseEvent var1, boolean var2) {
      if (this.cy >= (17065 & 15863) && this.cy <= (15551 & 17379)) {
         if (var2) {
            ((Class439)this.form).y(this.cy - (29367 & 3561));
            return;
         }
      } else if (this.cy != (16821 & 16111) && this.cy != (18943 & 13990)) {
         if (this.cy >= (14079 & 18869) && this.cy <= (16062 & 16889)) {
            if (var2) {
               ((Class622)this.form).y(this.cy - (20151 & 12797));
               return;
            }
         } else if (this.cy >= (9423 & 23545) && this.cy <= (20427 & 12543)) {
            if (var2) {
               ((Class490)this.form).y(this.cy - (13273 & 19695));
               return;
            }
         } else if (this.cy >= (8447 & 24526) && this.cy <= (30674 & 2301)) {
            if (var2) {
               ((Class210)this.form).as(this.cy - (1262 & 31711));
               return;
            }
         } else if (this.cy >= (5595 & 27389) && this.cy <= 218) {
            if (var2) {
               ((Class130)this.form).dp(this.cy - 217);
               return;
            }
         } else if (this.cy >= 221 && this.cy <= 222) {
            if (var2) {
               ((Class130)this.form).as(this.cy - 221);
               return;
            }
         } else if (this.cy >= 231 && this.cy <= 233) {
            if (var2) {
               ((Class9)this.form).do(this.cy - 231);
               return;
            }
         } else if (this.cy >= 236 && this.cy <= 238) {
            if (var2) {
               ((Class9)this.form).dp(this.cy - 236);
               return;
            }
         } else if (this.cy >= 301 && this.cy <= 303) {
            if (var2) {
               ((Class138)this.form).y(this.cy - 301);
               return;
            }
         } else if (this.cy >= 351 && this.cy <= 352 && var2) {
            ((Class372)this.form).y(this.cy - 351);
         }
      } else if (var2) {
         ((Class439)this.form).dp(this.cy - (2551 & 30381));
         return;
      }

   }

   public int ae() {
      return this.cy;
   }
}
