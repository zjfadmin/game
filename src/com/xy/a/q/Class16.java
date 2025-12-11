package com.xy.a.q;

import com.xy.bean.NpcComposeBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;

public class Class16 extends com.xy.q.Class30 {
   private com.xy.i.Class3[] nf;
   private String ng;
   private com.xy.i.Class19 jv;
   private BigDecimal nh;
   private com.xy.w.Class18[] aw;
   private com.xy.q.Class52 hl;
   private com.xy.q.Class14 iu;
   private JLabel[] gj;
   private com.xy.q.Class54[] ni;
   private com.xy.q.Class21 ky;

   public void ay(Goodstable var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ni.length; var10000 = ++var2) {
         if (this.ni[var2].il() == 1) {
            Goodstable var3 = (Goodstable)this.ni[var2].jx();
            if (com.xy.v.Class12.x(var1.getRgid(), var3.getRgid())) {
               if (var1.getUsetime() > 0) {
                  this.ni[var2].gs(1, var1);
               } else {
                  this.ni[var2].gs(0, null);
               }
            }
         }
      }
   }

   public boolean jy(Goodstable var1, Goodstable var2) {
      int var3 = MsgUntil.getGoodLvl(var1.getValue());
      int var4 = MsgUntil.getGoodLvl(var2.getValue());
      if (this.za().gameType == 2 && !this.za().l(2, 3)) {
         if (var4 >= 6) {
            int var9 = 5 + var4;
            if (var3 < 11 && var9 == 11) {
               return false;
            } else if (var3 < 11 || var3 != var9 && var3 + 1 != var9) {
               String var10 = "靀视伿畯容廓笉绠盄瞸瞳朢匇绠扖聂醍钿";
               this.afx.dp("需要使用对应等级的矿石来升级或者重铸");
               return true;
            } else {
               return false;
            }
         } else if (var3 < 11) {
            String var15 = "靽覕伂甼暉髌绚皐瞂矧";
            this.afx.dp("需要使用更高级的矿石");
            return true;
         } else {
            return false;
         }
      } else if (var3 < 10) {
         String var14 = "戔遠vmvp绠袅奀叻锸寉垉戓钆钺戹凯钆占f";
         this.afx.dp("打造1-10级装备去长安城打铁铺找冯铁匠!");
         return true;
      } else {
         boolean var5 = false;
         if (var3 >= 10 && var3 <= 13) {
            if (var4 != 8 && var4 != 9) {
               String var17 = "扇遝%L9L 绚裑奺佫畕-绚矫瞎5";
               this.afx.dp("打造11-14级装备使用9级矿石!");
               String var13 = "醊钸vpjqt继袂奇伸畨\u007f继瞸瞳f";
               this.afx.dp("重铸10-13级装备使用8级矿石!");
               return true;
            }

            if (var4 == 9) {
               var5 = true;
            }
         } else if (var3 == 14) {
            if (var4 != 9 && var4 != 10) {
               String var10003 = "扇遝%H纳袸夓伂甼L$绚矫瞎5";
               this.afx.dp("打造15级装备使用10级矿石!");
               String var10002 = "醍钿qs继袂奇伸畨~继瞸瞳f";
               this.afx.dp("重铸14级装备使用9级矿石!");
               return true;
            }

            if (var4 == 10) {
               var5 = true;
            }
         } else if (var3 == 15) {
            if (var4 != 10 && var4 != 11) {
               String var16 = "扇遝%K纳袸夓伂甼L%绚矫瞎5";
               this.afx.dp("打造16级装备使用11级矿石!");
               String var11 = "醊钸vu绠袅奀伿畯qw继瞸瞳f";
               this.afx.dp("重铸15级装备使用10级矿石!");
               return true;
            }

            if (var4 == 11) {
               var5 = true;
            }
         } else {
            if (var3 != 16) {
               String var10001 = "镙讨儬彈";
               this.afx.dp("错误公式");
               return true;
            }

            if (var4 != 11) {
               String var12 = "釙钅%K纳袸夓伂甼L%绚矫瞎5";
               this.afx.dp("重铸16级装备使用11级矿石!");
               return true;
            }
         }

         return false;
      }
   }

   public void f() {
      int var1 = 1 + this.yx().goodPacks.length / 24;
      if (this.nf == null || this.nf.length != var1) {
         this.nf = this.zd(this.nf, var1, this.ky.ah());
         short var2 = 356;
         short var3 = 158;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.nf.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.nf[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.ky.vr(this.nf, 0);
      }
   }

   public Class16(GameView var1) {
       super(26, 2, com.xy.q.Class30.afz, var1);
      this.nh = new BigDecimal(100000);
      this.yy(-1, 0, 402, 393, com.xy.q.Class30.agh);
      com.xy.w.Class9 var24 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "戮逴";
      this.yu(var24, "打造");
      var10007 = "4#h%hsvn7. ";
      String var10012 = "扇]逴";
      this.jv = new com.xy.i.Class19("sc/e/31.png", 1, 72, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "打 造", this);
      this.jv.setBounds(298, 115, 79, 25);
      this.add(this.jv);
      this.iu = com.xy.q.Class1.i(263, 45, 114, 19, 10, Color.white, com.xy.q.Class49.ac);
      String var10005 = "4#h$hqpn7. ";
      this.iu.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.iu);
      this.hl = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.ac, null, var1);
      String var10010 = "g\u001e;\u0019;L#Sd\u0013s";
      this.hl.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.hl.n(2);
      this.hl.setText("0");
      this.hl.setBounds(263, 80, 114, 19);
      MoneyType var2 = new MoneyType();
      var10007 = "珰醖";
      var2.setId(1);
      var2.setKey("现金");
      this.hl.alj(var2);
      this.add(this.hl);
      com.xy.q.Class49.b(this.iu, this.nh.longValue());
      this.gj = new JLabel[4];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.gj.length; var10000 = ++var3) {
         int var10004 = 32 + 26 * var3;
         String var10008 = "^w;R;R;R";
         this.gj[var3] = com.xy.q.Class1.f(46, var10004, 36, 19, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.bz);
         JLabel var6 = this.gj[var3];
         String var10001;
         if (var3 == 0) {
            var10001 = "";
         } else if (var3 == 1) {
            var10001 = "";
         } else if (var3 == 2) {
            var10001 = "戀靇醑飚";
            var10001 = "所需金额";
         } else if (var3 == 3) {
            var10001 = "玤]釅";
            var10001 = "现 金";
         } else {
            var10001 = "";
         }

         var6.setText(var10001);
         this.add(this.gj[var3]);
         if (var3 == 0) {
            this.gj[var3].setBounds(53, 38, 57, 21);
         } else if (var3 == 1) {
            this.gj[var3].setBounds(127, 38, 62, 21);
         } else if (var3 >= 2 && var3 <= 3) {
            JLabel var10002 = this.gj[var3];
            String var10003 = "c$pwpwpw";
            var10002.setForeground(com.xy.q.Class49.c("#c000000"));
            this.gj[var3].setFont(com.xy.q.Class49.ch);
            if (var3 == 2) {
               this.gj[var3].setBounds(190, 45, 72, 19);
            } else if (var3 == 3) {
               this.gj[var3].setBounds(215, 80, 48, 19);
            }
         }
      }

      this.ni = new com.xy.q.Class54[2];

      for (int var7 = var3 = 0; var7 < this.ni.length; var7 = var3) {
         this.ni[var3] = new com.xy.q.Class54(this);
         this.ni[var3].setBounds(56 + 76 * var3, 61, 50, 50);
         this.add(this.ni[var3++]);
      }

      this.aw = new com.xy.w.Class18[9];

      for (int var8 = var3 = 0; var8 < this.aw.length; var8 = ++var3) {
         label84: {
            this.aw[var3] = new com.xy.w.Class18();
            this.add(this.aw[var3]);
            if (var3 >= 0 && var3 <= 1) {
               com.xy.w.Class18 var12 = this.aw[var3];
               String var18 = "g\u001e;\u0019;O!Sd\u0013s";
               var12.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
               if (var3 == 0) {
                  var8 = var3;
                  this.aw[var3].setBounds(53, 38, 57, 21);
                  break label84;
               }

               if (var3 == 1) {
                  this.aw[var3].setBounds(127, 38, 62, 21);
               }
            }

            var8 = var3;
         }

         if (var8 >= 2 && var3 <= 3) {
            com.xy.w.Class18 var13 = this.aw[var3];
            String var19 = "4#h$hswn7. ";
            var13.dp("sc/d/30.png");
            this.aw[var3].setBounds(54 + 76 * (var3 - 2), 59, 55, 1);
         }

         if (var3 >= 4 && var3 <= 5) {
            com.xy.w.Class18 var14 = this.aw[var3];
            String var20 = "\u000ewRpR Sd\u0013s";
            var14.dp("sc/d/4.png");
            this.aw[var3].setBounds(52 + 76 * (var3 - 4), 57, 59, 57);
         }

         if (var3 >= 6 && var3 <= 7) {
            com.xy.w.Class18 var15 = this.aw[var3];
            String var21 = "4#h$hswn7. ";
            var15.dp("sc/d/30.png");
            this.aw[var3].setBounds(53 + 76 * (var3 - 6), 114, 58, 1);
         }

         if (var3 == 8) {
            com.xy.w.Class18 var16 = this.aw[var3];
            String var22 = "g\u001e;\u0019;L-Sd\u0013s";
            var16.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.aw[var3].setBounds(47, 158, 309, 207);
         }
      }

      this.ky = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 48, 160);
      String var23 = "4#h$hq\u007fn7. ";
      this.ky.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.ky.rm(true);
      this.add(this.ky);
   }

   public void bb(Goodstable var1) {
      String var10001 = "扑视呈扗亙嘯";
      if (this.ng.equals("我要合成仙器")) {
         if (var1.getType() == 7099L) {
            this.ni[0].gs(1, var1);
            return;
         }

         if (GoodType.w(var1.getType())) {
            this.ni[1].gs(1, var1);
            return;
         }
      } else {
         var10001 = "扬覕区纳交噼";
         if (this.ng.equals("我要升级仙器")) {
            if (var1.getType() == 7099L) {
               this.ni[0].gs(1, var1);
               return;
            }

            if (GoodType.u(var1.getType())) {
               this.ni[1].gs(1, var1);
               return;
            }
         } else {
            var10001 = "扑视浗烻亙嘯";
            if (this.ng.equals("我要洗炼仙器")) {
               if (GoodType.w(var1.getType())) {
                  this.ni[0].gs(1, var1);
                  return;
               }

               if (var1.getType() == 212L) {
                  this.ni[1].gs(1, var1);
                  return;
               }
            } else {
               var10001 = "戮逴L%P%K纳袸夓";
               if (!this.ng.equals("打造11-16级装备")) {
                  var10001 = "扑视戓遧昮遝袅奀";
                  if (!this.ng.equals("我要打造普通装备")) {
                     var10001 = "扬覕区纳礣兡";
                     if (this.ng.equals("我要升级神兵")) {
                        if (GoodType.an(var1.getType())) {
                           this.ni[0].gs(1, var1);
                           return;
                        }

                        if (GoodType.u(var1.getType())) {
                           this.ni[1].gs(1, var1);
                           return;
                        }

                        return;
                     } else {
                        var10001 = "扖见呏扐烻姖瞴";
                        if (this.ng.equals("我要合成炼妖石")) {
                           if (GoodType.ap(var1.getType())) {
                              if (this.za().l(2, 12)) {
                                 String var10000 = var1.getValue();
                                 var10001 = "筝绚)";
                                 String var10002 = ";";
                                 if (com.xy.v.Class12.f(var10000, "等级=", "|") >= 10) {
                                    GameView var11 = this.ze();
                                    var10001 = "烁如瞎朔骥%M纳";
                                    var11._do("炼妖石最高10级");
                                    return;
                                 }
                              }

                              Goodstable var2;
                              if ((var2 = (Goodstable)this.ni[0].jx()) != null) {
                                 var2 = this.yx().getGood(var2.getRgid());
                              }

                              if (var2 == null) {
                                 this.ni[0].gs(1, var1);
                                 return;
                              }

                              if (var2 != var1) {
                                 String var9 = var2.getValue();
                                 var10001 = "笎继z";
                                 String var33 = "h";
                                 int var10 = com.xy.v.Class12.f(var9, "等级=", "|");
                                 var10001 = var1.getValue();
                                 var33 = "笎继z";
                                 String var10003 = "h";
                                 if (var10 != com.xy.v.Class12.f(var10001, "等级=", "|")) {
                                    return;
                                 }

                                 this.ni[1].gs(1, var1);
                                 return;
                              }

                              return;
                           }

                           return;
                        } else {
                           var10001 = "扑视垹儼餰咆";
                           if (this.ng.equals("我要培养饰品")) {
                              if (var1.getType() == 1008L) {
                                 this.ni[1].gs(1, var1);
                                 return;
                              }

                              if (GoodType.aq(var1.getType())) {
                                 Goodstable var3;
                                 if ((var3 = (Goodstable)this.ni[0].jx()) != null) {
                                    var3 = this.yx().getGood(var3.getRgid());
                                 }

                                 if (var3 == null) {
                                    this.ni[0].gs(1, var1);
                                    return;
                                 }

                                 if (var3 != var1) {
                                    this.ni[1].gs(1, var1);
                                    return;
                                 }

                                 return;
                              }

                              return;
                           } else {
                              var10001 = "扬覕醰铬餍哕";
                              if (this.ng.equals("我要重铸饰品")) {
                                 if (GoodType.aq(var1.getType())) {
                                    this.ni[0].gs(1, var1);
                                    return;
                                 }

                                 if (GoodType.u(var1.getType())) {
                                    this.ni[1].gs(1, var1);
                                    return;
                                 }

                                 return;
                              } else {
                                 var10001 = "扑视乊礙儵瞴";
                                 if (this.ng.equals("我要上神兵石")) {
                                    if (GoodType.an(var1.getType())) {
                                       this.ni[0].gs(1, var1);
                                       return;
                                    }

                                    if (var1.getType() == 191L) {
                                       this.ni[1].gs(1, var1);
                                       return;
                                    }

                                    return;
                                 } else {
                                    var10001 = "戅觼埭儆抰軖笲";
                                    if (this.ng.equals("我要培养护身符")) {
                                       if (GoodType.ao(var1.getType())) {
                                          Goodstable var4;
                                          if ((var4 = (Goodstable)this.ni[0].jx()) != null) {
                                             var4 = this.yx().getGood(var4.getRgid());
                                          }

                                          if (var4 == null) {
                                             this.ni[0].gs(1, var1);
                                             return;
                                          }

                                          if (var4 != var1) {
                                             this.ni[1].gs(1, var1);
                                             return;
                                          }

                                          return;
                                       }

                                       return;
                                    } else {
                                       var10001 = "扖见醊钸拣軫筡";
                                       if (this.ng.equals("我要重铸护身符")) {
                                          if (GoodType.ao(var1.getType())) {
                                             this.ni[0].gs(1, var1);
                                             return;
                                          }

                                          if (GoodType.u(var1.getType())) {
                                             this.ni[1].gs(1, var1);
                                             return;
                                          }

                                          return;
                                       } else {
                                          var10001 = "烁匂交噼";
                                          if (this.ng.equals("炼化仙器")) {
                                             if (var1.getType() == 7005L) {
                                                this.ni[1].gs(1, var1);
                                                return;
                                             }

                                             if (GoodType.w(var1.getType())) {
                                                Goodstable var5;
                                                if ((var5 = (Goodstable)this.ni[0].jx()) != null) {
                                                   var5 = this.yx().getGood(var5.getRgid());
                                                }

                                                if (var5 == null) {
                                                   this.ni[0].gs(1, var1);
                                                   return;
                                                }

                                                if (var5 != var1) {
                                                   this.ni[1].gs(1, var1);
                                                   return;
                                                }

                                                return;
                                             }

                                             return;
                                          } else {
                                             var10001 = "垾儻弮昶瞴";
                                             if (this.ng.equals("培养彩晶石")) {
                                                if (var1.getType() == 729L) {
                                                   Goodstable var6;
                                                   if ((var6 = (Goodstable)this.ni[0].jx()) != null) {
                                                      var6 = this.yx().getGood(var6.getRgid());
                                                   }

                                                   if (var6 == null) {
                                                      this.ni[0].gs(1, var1);
                                                      return;
                                                   }

                                                   if (var6 != var1) {
                                                      this.ni[1].gs(1, var1);
                                                      return;
                                                   }

                                                   return;
                                                }

                                                return;
                                             } else {
                                                var10001 = "糃炨礣兡";
                                                if (this.ng.equals("精炼神兵")) {
                                                   if (GoodType.an(var1.getType())) {
                                                      Goodstable var7;
                                                      if ((var7 = (Goodstable)this.ni[0].jx()) != null) {
                                                         var7 = this.yx().getGood(var7.getRgid());
                                                      }

                                                      if (var7 == null) {
                                                         this.ni[0].gs(1, var1);
                                                         return;
                                                      }

                                                      if (var7 != var1) {
                                                         this.ni[1].gs(1, var1);
                                                         return;
                                                      }

                                                      return;
                                                   }

                                                   return;
                                                } else {
                                                   var10001 = "寝瞴呈扗";
                                                   if (this.ng.equals("宝石合成")) {
                                                      if (var1.getType() == 700L) {
                                                         Goodstable var8;
                                                         if ((var8 = (Goodstable)this.ni[0].jx()) != null) {
                                                            var8 = this.yx().getGood(var8.getRgid());
                                                         }

                                                         if (var8 == null) {
                                                            this.ni[0].gs(1, var1);
                                                            return;
                                                         }

                                                         if (var8 != var1) {
                                                            this.ni[1].gs(1, var1);
                                                            return;
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var10001 = "寠矧锋嵘";
                                                      if (!this.ng.equals("宝石镶嵌")) {
                                                         var10001 = "寝瞴辽勧";
                                                         if (!this.ng.equals("宝石追加")) {
                                                            return;
                                                         }
                                                      }

                                                      if (GoodType.l(var1.getType())) {
                                                         this.ni[0].gs(1, var1);
                                                         return;
                                                      }

                                                      if (var1.getType() == 700L) {
                                                         this.ni[1].gs(1, var1);
                                                         return;
                                                      }
                                                   }

                                                   return;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (GoodType.l(var1.getType())) {
                  this.ni[0].gs(1, var1);
                  return;
               }

               if (GoodType.u(var1.getType())) {
                  this.ni[1].gs(1, var1);
                  return;
               }
            }
         }
      }
   }

   public void h() {
      if (!this.afx.ah()) {
         RoleData var1;
         if ((var1 = this.yx()).getLoginResult().getGold().longValue() < this.nh.longValue()) {
            String var126 = "醬钥买趧";
            this.afx.dp("金钱不足");
         } else {
            int var2;
            for (int var10000 = var2 = 0; var10000 < this.ni.length; var10000 = ++var2) {
               Goodstable var3;
               if ((var3 = (Goodstable)this.ni[var2].jx()) != null) {
                  var3 = this.yx().getGood(var3.getRgid());
               }

               if (var3 == null || var3.getStatus() != 0) {
                  String var10001 = "记冑鼗爩咆凍朢";
                  this.afx._do("请凑齐物品再来");
                  return;
               }

               if (var3.getGoodlock() == 1) {
                  String var62 = "诱爔哕嶏袿勝锕";
                  this.afx._do("该物品已被加锁");
                  return;
               }

               if (GoodType.r(var3.getType()) != -1) {
                  if (GoodType.getExtra(var3.getValue(), GoodType.Extras[3]) != null) {
                     String var61 = "夗袂斠沒畨仉戓遧粻剐";
                     this.afx._do("套装无法用于打造系列");
                     return;
                  }

                  if (GoodType.getExtra(var3.getValue(), GoodType.Extras[4]) != null || var3.getQhv() != null && var3.getQhv() > 0) {
                     String var60 = "左锋嵘寠矧斝況畕亚戮逴粆刃";
                     this.afx._do("已镶嵌宝石无法用于打造系列");
                     return;
                  }
               }
            }

            Goodstable var11 = (Goodstable)this.ni[0].jx();
            Goodstable var12 = (Goodstable)this.ni[1].jx();
            if (var11 != null) {
               var11 = var1.getGood(var11.getRgid());
            }

            if (var12 != null) {
               var12 = var1.getGood(var12.getRgid());
            }

            String var63 = "扑视呈扗亙嘯";
            if (this.ng.equals("我要合成仙器")) {
               int var4;
               if ((var4 = MsgUntil.getGoodLvl(var12.getValue())) == 0 || var4 >= 6) {
                  var63 = "杽髌呵戄儐阢交噼";
                  this.afx.dp("最高合成六阶仙器");
                  return;
               }

               int var5;
               if ((var5 = MsgUntil.getGoodLvl(var11.getValue())) == var4) {
                  String var41 = "瀲汔zhijxi烾";
                  Matcher var7;
                  int var8 = (var7 = Pattern.compile("灵气=(.*?)点").matcher(var11.getValue())).find() ? Integer.parseInt(var7.group(1)) : 0;
                  int var9 = var5 != 1 && var5 != 2 ? (var5 == 3 ? 6 : (var5 == 4 ? 5 : 3)) : 8;
                  if (var8 >= var9) {
                     var63 = "璋孄瀈氀嶏滵";
                     this.afx.dp("瓶子灵气已满");
                     return;
                  }

                  if (GoodType.o(var11.getQuality()) != GoodType.o(var12.getQuality())) {
                     var63 = "纑寝哌乊纑寝乍肺涷呏";
                     this.afx.dp("绑定和不绑定不能混合");
                     return;
                  }
               } else if (var5 != 0) {
                  var63 = "阢攍丙皅吘";
                  this.afx.dp("阶数不相同");
                  return;
               }
            } else {
               var63 = "扑视匇绠亙嘯";
               if (this.ng.equals("我要升级仙器")) {
                  String var13;
                  if ((var13 = var11.getValue()) == null || var13.equals("")) {
                     var63 = "迍晒穮璋孄";
                     this.afx.dp("这是空瓶子");
                     return;
                  }

                  int var22 = MsgUntil.getGoodLvl(var13);
                  String var42 = "瀲汔zhijxi烾";
                  Matcher var34;
                  int var36 = (var34 = Pattern.compile("灵气=(.*?)点").matcher(var11.getValue())).find() ? Integer.parseInt(var34.group(1)) : 0;
                  int var38 = var22 != 1 && var22 != 2 ? (var22 == 3 ? 6 : (var22 == 4 ? 5 : 3)) : 8;
                  if (var36 != var38) {
                     var63 = "璋孄瀈氀杗滵";
                     this.afx.dp("瓶子灵气未满");
                     return;
                  }

                  int var10 = MsgUntil.getGoodLvl(var12.getValue());
                  if (var22 + 5 != var10) {
                     GameView var43 = this.afx;
                     StringBuilder var70 = new StringBuilder(String.valueOf(MsgUntil.h(var22)));
                     String var10002 = "陱亙嘯伿畯";
                     StringBuilder var71 = var70.append("阶仙器使用").append(var22 + 5);
                     var10002 = "纳瞂矧区纳";
                     var43.dp(var71.append("级矿石升级").toString());
                     return;
                  }

                  if (var22 >= 6) {
                     var63 = "乍敨捁優陶亞嘨匀继f";
                     this.afx.dp("不支持六阶仙器升级!");
                     return;
                  }
               } else {
                  var63 = "扬覕浪炨交噼";
                  if (!this.ng.equals("我要洗炼仙器")) {
                     var63 = "扑视戓遧昮遝袅奀";
                     if (this.ng.equals("我要打造普通装备")) {
                        if (this.jz(var11, var12)) {
                           return;
                        }
                     } else {
                        var63 = "戮逴L%P%K纳袸夓";
                        if (this.ng.equals("打造11-16级装备")) {
                           if (this.jy(var11, var12)) {
                              return;
                           }
                        } else {
                           var63 = "扑视匇绠礞儲";
                           if (this.ng.equals("我要升级神兵")) {
                              int var14 = MsgUntil.getGoodLvl(var11.getValue());
                              int var23 = MsgUntil.getGoodLvl(var12.getValue());
                              if (var14 < 1 || var14 > 5) {
                                 var63 = "买攻捼\"绚祊儈卓绚5";
                                 this.afx.dp("不支持6级神兵升级!");
                                 return;
                              }

                              if (var14 + 5 != var23) {
                                 GameView var44 = this.afx;
                                 StringBuilder var78 = new StringBuilder(String.valueOf(var14));
                                 String var128 = "绠礞儲伿畯";
                                 StringBuilder var79 = var78.append("级神兵使用").append(var14 + 5);
                                 var128 = "纳瞂矧区纳";
                                 var44.dp(var79.append("级矿石升级").toString());
                                 return;
                              }
                           } else {
                              var63 = "扖见呏扐烻姖瞴";
                              if (!this.ng.equals("我要合成炼妖石")) {
                                 var63 = "扬覕垄兯餍哕";
                                 if (this.ng.equals("我要培养饰品")) {
                                    if (GoodType.aq(var12.getType())) {
                                       if (this.za().l(2, 11)) {
                                          var63 = "刯鄊餰厭儁诿伿畯鄍餷糾匉";
                                          this.afx.dp("副配饰只允许使用配饰精华");
                                          return;
                                       }

                                       if (MsgUntil.getGoodLvl(var12.getValue()) >= 2) {
                                          var63 = "剻鄰饤嶏绛迃判O纳亘丞";
                                          this.afx.dp("副配饰已经达到2级以上");
                                          return;
                                       }
                                    }

                                    if (MsgUntil.getGoodLvl(var11.getValue()) > 6) {
                                       var63 = "嶵迾剷杀骟鄍餷笉绠";
                                       this.afx.dp("已达到最高配饰等级");
                                       return;
                                    }

                                    if (var11.getValue().indexOf("培养=") == -1) {
                                       var63 = "诱鄰饤斝況垄兯";
                                       this.afx.dp("该配饰无法培养");
                                       return;
                                    }
                                 } else {
                                    var63 = "扑视醍钿餰咆";
                                    if (this.ng.equals("我要重铸饰品")) {
                                       this.ng = "佩饰重铸";
                                       int var15 = MsgUntil.getGoodLvl(var11.getValue());
                                       int var24 = MsgUntil.getGoodLvl(var12.getValue());
                                       if (var15 + 3 != var24) {
                                          GameView var47 = this.afx;
                                          StringBuilder var92 = new StringBuilder(String.valueOf(var15));
                                          String var132 = "纳餍哕伂甼";
                                          StringBuilder var93 = var92.append("级饰品使用").append(var15 + 3);
                                          var132 = "绠瞿瞴醍钿";
                                          var47.dp(var93.append("级矿石重铸").toString());
                                          return;
                                       }

                                       String var45 = var11.getValue();
                                       var63 = GoodType.Extras[8];
                                       String var130 = "h";
                                       if (com.xy.v.Class10.a(var45, var63, "|") != null) {
                                          var63 = "鄍餷嶲李烹糾尞恠斠沒醍钿";
                                          this.afx._do("配饰已有点粹属性无法重铸");
                                          return;
                                       }

                                       var45 = var12.getValue();
                                       var63 = GoodType.Extras[3];
                                       var130 = "h";
                                       if (com.xy.v.Class10.a(var45, var63, "|") != null) {
                                          var63 = "鄍餷嶲李夗袂尞恠斠沒醍钿";
                                          this.afx._do("配饰已有套装属性无法重铸");
                                          return;
                                       }
                                    } else {
                                       var63 = "扬覕乷祊儈矧";
                                       if (this.ng.equals("我要上神兵石")) {
                                          String var48 = var11.getValue();
                                          var63 = "礞儲尞恠";
                                          if (var48.indexOf("神兵属性") != -1) {
                                             var63 = "诱礣兡嶏朝礣兡尣怳";
                                             this.afx.dp("该神兵已有神兵属性");
                                             return;
                                          }
                                       } else {
                                          var63 = "扖见垾儻拣軫筡";
                                          if (this.ng.equals("我要培养护身符")) {
                                             short var25;
                                             int var55;
                                             label288: {
                                                var63 = var11.getValue();
                                                String var10003 = "h";
                                                int var16 = (int)com.xy.v.Class12.o(var63, "品质=", "|");
                                                var25 = 800;
                                                String var49 = var11.getValue();
                                                var63 = "烼卑尞恠";
                                                String var6;
                                                if ((var6 = GoodType.getExtra(var49, "炼化属性")) != null) {
                                                   var63 = "2";
                                                   String[] var35 = var6.split("&");

                                                   int var37;
                                                   for (int var50 = var37 = 0; var50 < var35.length; var50 = ++var37) {
                                                      String var51 = var35[var37];
                                                      var63 = "z";
                                                      String[] var39;
                                                      String var52 = (var39 = var51.split("="))[0];
                                                      var63 = "爄抔";
                                                      int var40;
                                                      if (var52.equals("特技")) {
                                                         for (int var53 = var40 = 1; var53 < var39.length; var53 = ++var40) {
                                                            String var54 = var39[var40];
                                                            var63 = "xwsv";
                                                            if (var54.equals("8031")) {
                                                               var25 = 900;
                                                               var55 = var16;
                                                               break label288;
                                                            }
                                                         }
                                                      }
                                                   }
                                                }

                                                var55 = var16;
                                             }

                                             if (var55 > var25) {
                                                GameView var56 = this.afx;
                                                String var140 = "讘抰軖笲咼贼奚亚";
                                                StringBuilder var104 = new StringBuilder("该护身符品质大于").append(var25);
                                                String var134 = "呉斠沒垹儼";
                                                var56.dp(var104.append("后无法培养").toString());
                                                return;
                                             }
                                          } else {
                                             var63 = "戅觼釙钅抰軖笲";
                                             if (this.ng.equals("我要重铸护身符")) {
                                                String var57 = var11.getValue();
                                                String var135 = ";";
                                                if ((int)com.xy.v.Class12.o(var57, "品质=", "|") < 300) {
                                                   var63 = "拙躿筛哕赕髌仳'M$戰胩醰铬";
                                                   this.afx.dp("护身符品质高于300才能重铸");
                                                   return;
                                                }

                                                int var26;
                                                if ((var26 = MsgUntil.getGoodLvl(var12.getValue())) != 9 && var26 != 10) {
                                                   var135 = "拣軫筡醍钿伿畯y绠瞿瞴";
                                                   this.afx.dp("护身符重铸使用9级矿石");
                                                   var63 = "拙躿筛卓绚佫畕%M纳瞂矧";
                                                   this.afx.dp("护身符升级使用10级矿石");
                                                   return;
                                                }

                                                if (var26 == 10 && MsgUntil.getGoodLvl(var11.getValue()) > (this.za().f() ? 8 : 6)) {
                                                   GameView var58 = this.afx;
                                                   String var141 = "拤軬筦笎继杇骘乽";
                                                   StringBuilder var106 = new StringBuilder("护身符等级最高为").append(this.za().f() ? 9 : 7);
                                                   var135 = "纳";
                                                   var58.dp(var106.append("级").toString());
                                                   return;
                                                }
                                             } else {
                                                var63 = "烼卑亙嘯";
                                                if (this.ng.equals("炼化仙器")) {
                                                   String var17 = var12.getType() == 7005L
                                                      ? GoodType.ak(var12.getValue())[1]
                                                      : GoodType.ak(var12.getValue())[0];
                                                   var63 = "陋敤@%";
                                                   if (!var17.equals("阶数=1")) {
                                                      var63 = "伿畯乀陱伜乽烼卑朐旞奪揎亷仁呗x";
                                                      this.afx.dp("使用一阶作为炼化材料太掉价了吗?");
                                                      return;
                                                   }
                                                } else {
                                                   var63 = "埭儆彽昋矧";
                                                   if (!this.ng.equals("培养彩晶石")) {
                                                      var63 = "糾烻礞儲";
                                                      if (this.ng.equals("精炼神兵")) {
                                                         int var18 = MsgUntil.getGoodLvl(var11.getValue());
                                                         int var27 = MsgUntil.getGoodLvl(var12.getValue());
                                                         if (var18 < 1 || var18 > 5) {
                                                            var63 = "买攻捼\"绚祊儈卓绚5";
                                                            this.afx.dp("不支持6级神兵升级!");
                                                            return;
                                                         }

                                                         if (var18 <= 3) {
                                                            var63 = "s继厍亥乍盄礙儵戊厯亢糾纄";
                                                            this.afx.dp("4级及以上的神兵才可以精练");
                                                            return;
                                                         }

                                                         if (var27 > 3) {
                                                            var63 = "畕'绚仱乶皐礣兡糃绗";
                                                            this.afx.dp("用3级以下的神兵精练");
                                                            return;
                                                         }
                                                      } else {
                                                         var63 = "寝瞴呈扗";
                                                         if (!this.ng.equals("宝石合成")) {
                                                            var63 = "寠矧锋嵘";
                                                            if (!this.ng.equals("宝石镶嵌")) {
                                                               var63 = "寝瞴辽勧";
                                                               this.ng.equals("宝石追加");
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            var63 = "扬覕区纳礣兡";
            if (!this.ng.equals("我要升级神兵")) {
               var63 = "糾烻礞儲";
               if (!this.ng.equals("精炼神兵")) {
                  var63 = "寠矧呵戄";
                  if (!this.ng.equals("宝石合成")) {
                     var63 = "寝瞴锶崋";
                     if (!this.ng.equals("宝石镶嵌")) {
                        var63 = "寠矧辀労";
                        if (!this.ng.equals("宝石追加")) {
                           if (!ParamTool.g(this.nh.longValue(), this.afx)) {
                              return;
                           }

                           ArrayList var21;
                           (var21 = new ArrayList()).add(var11.getRgid());
                           var21.add(var12.getRgid());
                           var11.setUsetime(0);
                           var12.n(1);
                           if (var11.getUsetime() <= 0) {
                              var1.ag(var11.getRgid());
                              this.ni[0].gs(0, null);
                           }

                           if (var12.getUsetime() <= 0) {
                              var1.ag(var12.getRgid());
                              this.ni[1].gs(0, null);
                           }

                           NpcComposeBean var30 = new NpcComposeBean();
                           var30.setComposetype(this.ng);
                           var30.setGoodstables(var21);
                           String var33 = Agreement.getSendTextAES("npccompose", com.xy.v.Class31.a().toJson(var30));
                           this.za().k(var33);
                           return;
                        }
                     }
                  }

                  SuitOperBean var20;
                  SuitOperBean var59 = var20 = new SuitOperBean();
                  String var138 = "寝瞴呈扗";
                  int var125;
                  if (this.ng.equals("宝石合成")) {
                     var125 = 121;
                  } else {
                     var138 = "寠矧锋嵘";
                     var125 = this.ng.equals("宝石镶嵌") ? 122 : 123;
                  }

                  var59.setType(var125);
                  ArrayList var29;
                  (var29 = new ArrayList()).add(var11.getRgid());
                  var29.add(var12.getRgid());
                  var20.setGoods(var29);
                  String var32 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var20));
                  this.za().k(var32);
                  return;
               }
            }

            var1.getLoginResult().setGold(var1.getLoginResult().getGold().subtract(this.nh));
            SuitOperBean var19;
            (var19 = new SuitOperBean()).setType(16);
            ArrayList var28;
            (var28 = new ArrayList()).add(var11.getRgid());
            var28.add(var12.getRgid());
            var19.setGoods(var28);
            var11.setUsetime(0);
            var12.n(1);
            if (var11.getUsetime() <= 0) {
               var1.ag(var11.getRgid());
               this.ni[0].gs(0, null);
            }

            if (var12.getUsetime() <= 0) {
               var1.ag(var12.getRgid());
               this.ni[1].gs(0, null);
            }

            String var31 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var19));
            this.za().k(var31);
         }
      }
   }

   public void ci(String var1) {
      String var10001 = "扬覕烁噼";
      if ((this.ng = var1).equals("我要炼器")) {
         JLabel var10002 = this.gj[0];
         String var10003 = "亙嘯";
         var10002.setText("仙器");
         JLabel var6 = this.gj[1];
         String var59 = "札斍";
         var6.setText("材料");
         var10001 = "烻`嘯";
         this.jv.setText("炼 器");
      } else {
         var10001 = "扬覕垄兯餍哕";
         if (var1.equals("我要培养饰品")) {
            JLabel var60 = this.gj[0];
            String var90 = "乼餰咆";
            var60.setText("主饰品");
            JLabel var9 = this.gj[1];
            String var61 = "剻餍哕";
            var9.setText("副饰品");
            var10001 = "垾`儼";
            this.jv.setText("培 养");
         } else {
            var10001 = "扬覕醰铬餍哕";
            if (var1.equals("我要重铸饰品")) {
               JLabel var62 = this.gj[0];
               String var91 = "餰咆";
               var62.setText("饰品");
               JLabel var12 = this.gj[1];
               String var63 = "瞂矧";
               var12.setText("矿石");
               var10001 = "醊`钿";
               this.jv.setText("重 铸");
            } else {
               var10001 = "寠矧呵戄";
               if (var1.equals("宝石合成")) {
                  JLabel var64 = this.gj[0];
                  String var92 = "寝瞴";
                  var64.setText("宝石");
                  JLabel var15 = this.gj[1];
                  String var65 = "寠矧";
                  var15.setText("宝石");
                  var10001 = "呏`扗";
                  this.jv.setText("合 成");
               } else {
                  label68: {
                     var10001 = "寠矧锋嵘";
                     if (!var1.equals("宝石镶嵌")) {
                        var10001 = "寝瞴辽勧";
                        if (!var1.equals("宝石追加")) {
                           var10001 = "扑视戓遧昮遝袅奀";
                           if (!var1.equals("我要打造普通装备")) {
                              var10001 = "戮逴L%P%K纳袸夓";
                              if (!var1.equals("打造11-16级装备")) {
                                 var10001 = "扬覕区纳礣兡";
                                 if (var1.equals("我要升级神兵")) {
                                    JLabel var70 = this.gj[0];
                                    String var95 = "礞儲";
                                    var70.setText("神兵");
                                    JLabel var26 = this.gj[1];
                                    String var71 = "瞂矧";
                                    var26.setText("矿石");
                                    var10001 = "戔`遧";
                                    this.jv.setText("打 造");
                                 } else {
                                    var10001 = "扬覕乷祊儈矧";
                                    if (var1.equals("我要上神兵石")) {
                                       JLabel var72 = this.gj[0];
                                       String var96 = "礞儲";
                                       var72.setText("神兵");
                                       JLabel var29 = this.gj[1];
                                       String var73 = "祊儈矧";
                                       var29.setText("神兵石");
                                       var10001 = "戔`遧";
                                       this.jv.setText("打 造");
                                    } else {
                                       var10001 = "糃炨礣兡";
                                       if (var1.equals("精炼神兵")) {
                                          JLabel var74 = this.gj[0];
                                          String var97 = "乼礞儲";
                                          var74.setText("主神兵");
                                          JLabel var32 = this.gj[1];
                                          String var75 = "剻礣兡";
                                          var32.setText("副神兵");
                                          var10001 = "戔`遧";
                                          this.jv.setText("打 造");
                                       } else {
                                          var10001 = "戅觼吜扭炨姫矧";
                                          if (var1.equals("我要合成炼妖石")) {
                                             JLabel var76 = this.gj[0];
                                             String var98 = "烻姖瞴";
                                             var76.setText("炼妖石");
                                             JLabel var35 = this.gj[1];
                                             String var77 = "炨姫矧";
                                             var35.setText("炼妖石");
                                             var10001 = "戔`遧";
                                             this.jv.setText("打 造");
                                          } else {
                                             var10001 = "扬覕呵戄交噼";
                                             if (var1.equals("我要合成仙器")) {
                                                JLabel var78 = this.gj[0];
                                                String var99 = "儫茕逗颉";
                                                var78.setText("八荒遗风");
                                                JLabel var38 = this.gj[1];
                                                String var79 = "交噼";
                                                var38.setText("仙器");
                                                var10001 = "戔`遧";
                                                this.jv.setText("打 造");
                                             } else {
                                                var10001 = "扬覕区纳交噼";
                                                if (var1.equals("我要升级仙器")) {
                                                   JLabel var80 = this.gj[0];
                                                   String var100 = "儫茕逗颉";
                                                   var80.setText("八荒遗风");
                                                   JLabel var41 = this.gj[1];
                                                   String var81 = "瞂矧";
                                                   var41.setText("矿石");
                                                   var10001 = "戔`遧";
                                                   this.jv.setText("打 造");
                                                } else {
                                                   var10001 = "扬覕浪炨交噼";
                                                   if (var1.equals("我要洗炼仙器")) {
                                                      JLabel var82 = this.gj[0];
                                                      String var101 = "亙嘯";
                                                      var82.setText("仙器");
                                                      JLabel var44 = this.gj[1];
                                                      String var83 = "悀棛矧";
                                                      var44.setText("悔梦石");
                                                      var10001 = "戔`遧";
                                                      this.jv.setText("打 造");
                                                   } else {
                                                      var10001 = "戅觼埭儆抰軖笲";
                                                      if (var1.equals("我要培养护身符")) {
                                                         JLabel var84 = this.gj[0];
                                                         String var102 = "拣軫筡";
                                                         var84.setText("护身符");
                                                         JLabel var47 = this.gj[1];
                                                         String var85 = "抰軖笲";
                                                         var47.setText("护身符");
                                                         var10001 = "戔`遧";
                                                         this.jv.setText("打 造");
                                                      } else {
                                                         var10001 = "戅觼釙钅抰軖笲";
                                                         if (var1.equals("我要重铸护身符")) {
                                                            JLabel var86 = this.gj[0];
                                                            String var103 = "拣軫筡";
                                                            var86.setText("护身符");
                                                            JLabel var50 = this.gj[1];
                                                            String var87 = "瞂矧";
                                                            var50.setText("矿石");
                                                            var10001 = "戔`遧";
                                                            this.jv.setText("打 造");
                                                         } else {
                                                            var10001 = "埭儆彽昋矧";
                                                            if (var1.equals("培养彩晶石")) {
                                                               JLabel var10000 = this.gj[0];
                                                               var10001 = "弮昶瞴";
                                                               var10000.setText("彩晶石");
                                                               JLabel var54 = this.gj[1];
                                                               String var88 = "彽昋矧";
                                                               var54.setText("彩晶石");
                                                               var10001 = "戔`遧";
                                                               this.jv.setText("打 造");
                                                            } else {
                                                               JLabel var3 = this.gj[0];
                                                               var10001 = "爔哕";
                                                               var3.setText("物品");
                                                               JLabel var57 = this.gj[1];
                                                               String var89 = "爩咆";
                                                               var57.setText("物品");
                                                               var10001 = "扇]逴";
                                                               this.jv.setText("打 造");
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                                 break label68;
                              }
                           }

                           JLabel var68 = this.gj[0];
                           String var94 = "袅奀";
                           var68.setText("装备");
                           JLabel var23 = this.gj[1];
                           String var69 = "瞂矧";
                           var23.setText("矿石");
                           var10001 = "戔`遧";
                           this.jv.setText("打 造");
                           break label68;
                        }
                     }

                     JLabel var66 = this.gj[0];
                     String var93 = "袸夓";
                     var66.setText("装备");
                     JLabel var19 = this.gj[1];
                     String var67 = "寝瞴";
                     var19.setText("宝石");
                     var10001 = "镢]嵘";
                     this.jv.setText("镶 嵌");
                  }
               }
            }
         }
      }

      int var2;
      for (int var4 = var2 = 0; var4 < this.ni.length; var4 = var2) {
         com.xy.q.Class54 var5 = this.ni[var2];
         var2++;
         var5.gs(0, null);
      }

      this.zc().b(this.lj());
   }

   @Override
   public void l() {
      this.f();
      super.l();
   }

   public boolean jz(Goodstable var1, Goodstable var2) {
      int var3 = MsgUntil.getGoodLvl(var1.getValue());
      int var4 = MsgUntil.getGoodLvl(var2.getValue());
      if (this.za().l(2, 3)) {
         if (var4 <= 9) {
            return false;
         }
      } else if (this.za().gameType == 2) {
         if (var4 >= 6) {
            int var5 = 5 + var4;
            if (var3 < 11 && var5 == 11) {
               return false;
            }

            if (var3 < 11 || var3 != var5 && var3 + 1 != var5) {
               String var10001 = "靽覕伂甼宄庀笴纳盹矫瞎東区纳扫耑醰铬";
               this.afx.dp("需要使用对应等级的矿石来升级或者重铸");
               return true;
            }

            return false;
         }

         if (var3 < 11) {
            String var7 = "靀视伿畯暴骟继盃瞿瞴";
            this.afx.dp("需要使用更高级的矿石");
            return true;
         }

         return false;
      }

      if (var3 >= 10) {
         String var6 = "戮逴L%P%K纳袸夓叆镫寴桱奉5";
         this.afx.dp("打造11-16级装备去长安桥头!");
         return true;
      } else if (var4 > 9) {
         String var10002 = "戓遧qjqw继袂奇杇骘厭肽伸畨~继瞸瞳f";
         this.afx.dp("打造1-10级装备最高只能使用9级矿石!");
         return true;
      } else {
         return false;
      }
   }
}
