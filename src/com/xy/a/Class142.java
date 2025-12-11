package com.xy.a;

import com.xy.a.q.Class64;
import com.xy.formula.BaseEquip;
import com.xy.formula.QualityZW;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class142 extends com.xy.q.Class30 {
   private List<Class95> aaf;
   private BigDecimal mq;
   private int ia;
   private String[] ayz;
   private String aza;
   private int z;
   private JLabel sy;
   private com.xy.i.Class18 aoo;
   private RichLabel in;
   private com.xy.q.Class44 nb;
   private JLabel dh;
   private int ds;
   private Goodstable azb;
   private JComponent xp;

   public void aos(String var1) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.nb.en().getText().equals("守护石附灵")) {
               int var2 = 0;
               int var3 = 0;
               int var4;
               int var10000 = var4 = 0;

               while (var10000 < var1.length()) {
                  String var10001 = "o";
                  if ((var4 = var1.indexOf("|", var3 + 1)) == -1) {
                     var4 = var1.length();
                  }

                  label54: {
                     var10001 = "1";
                     int var5;
                     if ((var5 = var1.indexOf("=", var3 + 1)) != -1) {
                        if (var5 > var4) {
                           var10000 = var4;
                           break label54;
                        }

                        String var6;
                        String var14 = var6 = var1.substring(var3, var5);
                        var10001 = "笯纴";
                        if (!var14.equals("等级")) {
                           var10001 = "聸义";
                           if (var6.equals("耐久")) {
                              var10000 = var4;
                              break label54;
                           }

                           var10001 = "拦胮";
                           if (var6.equals("技能")) {
                              var3 = var5 + 1;
                              String var10003 = "/";
                              var5 = var1.indexOf("#", var3 + 1);
                              int var7 = com.xy.v.Class12.ad(var1, var3, var5);
                              Skill var8;
                              int var9;
                              if ((var8 = this.yt().ac(String.valueOf(var7))) != null && (var9 = this.aot(1, var8.getSkillname(), 0.0, var2, 5, 7)) != -1) {
                                 var2 |= 1 << var9;
                                 var10000 = var4;
                                 break label54;
                              }
                           } else {
                              int var13;
                              if ((var13 = this.aot(1, var6, 0.0, var2, 0, 5)) != -1) {
                                 var2 |= 1 << var13;
                              }
                           }
                        }
                     }

                     var10000 = var4;
                  }

                  var3 = var10000 + 1;
                  var10000 = var4;
               }

               if (this.ape(var2, 0, 7)) {
                  String var20 = "宛拂矠阢灦扶劌";
                  this.bk("守护石附灵成功");
               } else {
                  this.aza = "守护石附灵";
               }
            }
         }
      }
   }

   public int aot(int var1, String var2, double var3, int var5, int var6, int var7) {
      int var8 = -1;
      double var9 = 0.0;

      int var11;
      for (int var10000 = var11 = var6; var10000 < var7; var10000 = ++var11) {
         Class95 var12;
         if (!(var12 = this.aaf.get(var11)).e().equals("") && (var5 >>> var11 & 1) != 1 && var12.b(var2)) {
            if (var1 == 1) {
               return var11;
            }

            double var13;
            if (!((var13 = var12.c()) > var3) && (var8 == -1 || !(var9 > var13))) {
               var8 = var11;
               var9 = var13;
            }
         }
      }

      return var8;
   }

   public void f() {
      if (this.ds != 0) {
         this.bk(null);
      } else {
         this.azb = null;
         this.mq = null;
         this.aza = null;
         this.ia = 0;
         this.ds = 1;
         this.z = 0;
         String var10002 = "债歱";
         this.aoo.setText("停止");
         if (this.afx.isVisible() && this.afx.gameFrame.isFocused()) {
            this.aoo.requestFocus();
         }

         this.xp.setVisible(true);
         this.aov(null);
         String var1;
         if ((var1 = this.ox(true)) != null) {
            this.bk(var1);
         }
      }
   }

   public void aou(String var1) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.nb.en().getText().equals("套装洗练")) {
               int var2 = 0;
               int var3 = 0;
               int var4 = 0;
               int var5;
               int var10000 = var5 = 0;

               while (var10000 < var1.length()) {
                  String var10001 = "*";
                  if ((var5 = var1.indexOf("&", var4 + 1)) == -1) {
                     var5 = var1.length();
                  }

                  if (var3 < 4) {
                     var10000 = var5;
                  } else {
                     label43: {
                        var10001 = ".";
                        int var6;
                        if ((var6 = var1.indexOf("=", var4 + 1)) != -1) {
                           if (var6 > var5) {
                              var10000 = var5;
                              break label43;
                           }

                           String var7 = var1.substring(var4, var6);
                           double var8 = Double.parseDouble(var1.substring(var6 + 1, var5));
                           int var10;
                           if ((var10 = this.aot(0, var7, var8, var2, 0, 2)) != -1) {
                              var2 |= 1 << var10;
                           }
                        }

                        var10000 = var5;
                     }
                  }

                  var3++;
                  var4 = var10000 + 1;
                  var10000 = var5;
               }

               if (this.ape(var2, 0, 2)) {
                  String var14 = "夿裉浿经扸劓";
                  this.bk("套装洗练成功");
               } else {
                  this.aza = "套装洗练";
               }
            }
         }
      }
   }

   public void aov(String var1) {
      StringBuffer var2 = new StringBuffer();
      if (var1 != null && !var1.equals("")) {
         var2.append(var1);
         String var10002 = "F3";
         var2.append("  ");
      }

      String var3;
      if (this.ds == 1) {
         var3 = "远蠤両";
         var3 = "运行中";
      } else {
         var3 = "巡债歱";
         var3 = "已停止";
      }

      var2.append(var3);
      if (this.z > 0) {
         String var10003 = ",H笠";
         StringBuilder var5 = new StringBuilder("  第").append(this.z);
         String var6 = "欲戁衟";
         var2.append(var5.append("次执行").toString());
      }

      this.dh.setText(var2.toString());
   }

   public void aow(String var1) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.nb.en().getText().equals("炼化")) {
               int var2 = 0;
               String var10001 = "5";
               String[] var3 = var1.split("&");

               int var4;
               for (int var10000 = var4 = 1; var10000 < var3.length; var10000 = ++var4) {
                  String var13 = var3[var4];
                  var10001 = "1";
                  int var5;
                  if ((var5 = var13.indexOf("=")) != -1) {
                     String var6;
                     String var14 = var6 = var3[var4].substring(0, var5);
                     var10001 = "爟抓";
                     if (var14.equals("特技")) {
                        String var15 = var3[var4];
                        var10001 = "1";
                        String[] var11 = var15.split("=");

                        int var8;
                        for (int var16 = var8 = 1; var16 < var11.length; var16 = ++var8) {
                           int var10;
                           Skill var12;
                           if ((var12 = this.yt().ac(var11[var8])) != null && (var10 = this.aot(1, var12.getSkillname(), 0.0, var2, 4, 6)) != -1) {
                              var2 |= 1 << var10;
                           }
                        }
                     } else {
                        double var7 = QualityZW.getDouble(var3[var4].substring(var5 + 1));
                        int var9;
                        if ((var9 = this.aot(0, var6, var7, var2, 0, 4)) != -1) {
                           var2 |= 1 << var9;
                        }
                     }
                  }
               }

               if (this.ape(var2, 0, 6)) {
                  var10001 = "烚包扶劌";
                  this.bk("炼化成功");
               } else {
                  this.aza = "炼化";
               }
            }
         }
      }
   }

   public void h() {
      if (this.ia == 0) {
         this.ia++;
      } else if (this.aza != null && this.ds == 1) {
         if (this.aza.equals(this.ayz[4])) {
            this.aoz(this.ayz[4]);
         } else if (this.aza.equals(this.ayz[10])) {
            this.aza = null;
            this.aoz(this.ayz[10]);
         } else {
            this.aoz(this.aza);
            this.aza = null;
         }
      }
   }

   public boolean _if(Goodstable var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = 0;
         String var10000 = var1.getValue();
         String var10001 = ":o";
         String[] var3 = var10000.split("\\|");

         int var4;
         for (int var14 = var4 = 0; var14 < var3.length; var14 = ++var4) {
            var10000 = var3[var4];
            var10001 = "炰卾屒恏*";
            if (var10000.startsWith("炼化属性&")) {
               var10000 = var3[var4];
               var10001 = "5";
               String[] var10 = var10000.split("&");

               int var11;
               for (int var19 = var11 = 1; var19 < var10.length; var19 = ++var11) {
                  var10000 = var10[var11];
                  var10001 = "1";
                  int var13;
                  if ((var13 = var10000.indexOf("=")) != -1) {
                     String var8 = var10[var11].substring(0, var13);
                     int var9;
                     if ((var9 = this.aot(1, var8, 0.0, var2, 3, 5)) != -1) {
                        var2 |= 1 << var9;
                     }
                  }
               }
            } else {
               var10000 = var3[var4];
               var10001 = ".";
               int var5;
               if ((var5 = var10000.indexOf("=")) != -1) {
                  String var6;
                  var10000 = var6 = var3[var4].substring(0, var5);
                  var10001 = "垑具";
                  if (!var10000.equals("培养")) {
                     var10001 = "笯纴";
                     if (!var6.startsWith("等级")) {
                        var10001 = "桑骤觩汎";
                        if (!var6.equals("根骨要求")) {
                           var10001 = "瀓怴觧汑";
                           if (!var6.equals("灵性要求")) {
                              var10001 = "勳釃觩汎";
                              if (!var6.equals("力量要求")) {
                                 var10001 = "攩捤觧汑";
                                 if (!var6.equals("敏捷要求")) {
                                    int var12;
                                    if ((var12 = this.aot(1, var6, 0.0, var2, 1, 3)) != -1) {
                                       var2 |= 1 << var12;
                                    }
                                    continue;
                                 }
                              }
                           }
                        }

                        int var7;
                        if ((var7 = this.aot(1, var6, 0.0, var2, 0, 1)) != -1) {
                           var2 |= 1 << var7;
                        }
                     }
                  }
               }
            }
         }

         return this.ape(var2, 0, 5);
      }
   }

   public void aox(String var1) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.nb.en().getText().equals("孩子重铸")) {
               int var2 = 0;
               String var10001 = ":o";
               String[] var3 = var1.split("\\|");

               int var4;
               for (int var10000 = var4 = 2; var10000 < var3.length; var10000 = ++var4) {
                  String var10 = var3[var4];
                  var10001 = "1";
                  int var5;
                  if ((var5 = var10.indexOf("=")) != -1) {
                     String var6 = var3[var4].substring(0, var5);
                     double var7 = QualityZW.getDouble(var3[var4].substring(var5 + 1));
                     int var9;
                     if ((var9 = this.aot(0, var6, var7, var2, 0, 4)) != -1) {
                        var2 |= 1 << var9;
                     }
                  }
               }

               if (this.ape(var2, 0, 4)) {
                  var10001 = "醫铫扶劌";
                  this.bk("重铸成功");
               } else {
                  this.aza = "孩子重铸";
               }
            }
         }
      }
   }

   public Class142(GameView var1) {
      super(121, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "\u0015pIwI\"Hc\bt";
      this.yy(-2, 0, 423, 475, com.xy.q.Class30.agh);
      com.xy.w.Class9 var5 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "膂劤烔匚";
      this.yu(var5, "自动炼化");
      String var10008 = "`\u0005<\u0003<U\"Hc\bt";
      String var10013 = "辸血";
      this.aoo = new com.xy.i.Class18("sc/e/31.png", 1, 257, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "运行", this);
      this.aoo.setBounds(171, 380, 79, 25);
      this.add(this.aoo, 0);
      this.xp = new Class137(this);
      this.xp.setBounds(0, 0, 423, 475);
      this.xp.addMouseListener(com.xy.q.Class1.c);
      this.xp.setVisible(false);
      this.add(this.xp, 1);
      this.nb = new com.xy.q.Class44(0, 100, this);
      this.nb.rm(true);
      this.add(this.nb);
      this.dh = new JLabel();
      this.dh.setFont(com.xy.q.Class49.cp);
      this.dh.setBounds(52, 60, 360, 18);
      this.dh.setForeground(Color.black);
      this.add(this.dh);
      String var10014 = "伙画斐诤亲绕梦柶晉吵杯锊前孄";
      this.sy = new JLabel("使用时请仔细检查是否有错别字");
      this.sy.setFont(com.xy.q.Class49.bm);
      this.sy.setBounds(185, 36, 210, 18);
      this.sy.setForeground(Color.RED);
      this.add(this.sy);
      this.in = new RichLabel("", com.xy.q.Class49.bm, 360);
      this.in.setBounds(44, 245, 360, 136);
      this.add(this.in);
      this.aaf = new ArrayList<>();
      String[] var10001 = new String[]{"炼化", "炼器", "星卡神通", "星卡五行", null, null, null, null, null, null, null, null};
      String var10004 = "鄥饼醥铴";
      var10001[4] = "配饰重铸";
      var10001[5] = "觉醒技重洗";
      var10004 = "鄫饣烟粪";
      var10001[6] = "配饰点粹";
      var10004 = "鄥饼糑炰";
      var10001[7] = "配饰粹炼";
      var10001[8] = "孩子重铸";
      var10001[9] = "孩子雕琢";
      var10001[10] = "守护石附灵";
      var10001[11] = "套装洗练";
      this.ayz = var10001;

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ayz.length; var10000 = ++var2) {
         if ((!this.ayz[var2].equals("孩子重铸") && !this.ayz[var2].equals("孩子雕琢") || this.za().gameBaby)
            && (!this.ayz[var2].equals("守护石附灵") || this.za().gameMount)) {
            this.nb.dq(this.ayz[var2]);
         }
      }

      this.nb.zb(52, 36, 128, 80);
   }

   public void aoy(String var1, boolean var2) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            String var25;
            if (var2) {
               var25 = "鄥饼烑粵";
               var25 = "配饰点粹";
            } else {
               var25 = "鄫饣糟炯";
               var25 = "配饰粹炼";
            }

            String var3 = var25;
            if (this.nb.en().getText().equals(var3)) {
               int var4;
               Class142 var33;
               label99: {
                  var4 = 0;
                  String var10001 = "*";
                  String[] var5 = var1.split("&");
                  double var6 = 1.0;
                  int var8;
                  int var9 = (var8 = Integer.parseInt(var5[1])) >> 5 & 31;
                  int var10 = var8 & 31;
                  if (var2) {
                     int var11;
                     for (int var27 = var11 = 4; var27 < var5.length; var27 = ++var11) {
                        var25 = var5[var11];
                        var10001 = "牪拦.";
                        Skill var12;
                        if (var25.startsWith("特技=") && (var12 = this.yt().ac(var5[var11].substring(3))) != null) {
                           int var13;
                           Class142 var29;
                           if ((var13 = Integer.parseInt(var12.getSkillid())) == 8121) {
                              var6 += 0.15;
                              var29 = this;
                           } else {
                              if (var13 == 8122) {
                                 var6 += 0.25;
                              }

                              var29 = this;
                           }

                           int var14;
                           if ((var14 = var29.aot(1, var12.getSkillname(), 0.0, var4, 2, 3)) != -1) {
                              var4 |= 1 << var14;
                           }
                        }
                     }

                     for (int var30 = var11 = 2; var30 < 4; var30 = ++var11) {
                        if (var11 >= var5.length) {
                           var33 = this;
                           break label99;
                        }

                        var25 = var5[var11];
                        var10001 = "牵拨1";
                        if (!var25.startsWith("特技=")) {
                           var25 = var5[var11];
                           var10001 = ".";
                           int var21;
                           if ((var21 = var25.indexOf("=")) != -1) {
                              String var23 = var5[var11].substring(0, var21);
                              var10001 = var5[var11];
                              String var10002 = "/";
                              var21 = var10001.indexOf("#", var23.length() + 1);
                              double var24 = BaseEquip.getDouble(var5[var11].substring(var23.length() + 1, var21)) * (var11 == 2 ? var9 : var10)
                                 + BaseEquip.getDouble(var5[var11].substring(var21 + 1));
                              if (var6 != 1.0) {
                                 var24 *= var6;
                              }

                              int var16;
                              if ((var16 = this.aot(0, var23, var24, var4, 0, 2)) != -1) {
                                 var4 |= 1 << var16;
                              }
                           }
                        }
                     }
                  } else {
                     String var39 = "恝炪糟倯";
                     int var18;
                     if ((var18 = this.aot(0, "总点粹值", var9 + var10, var4, 0, 1)) != -1) {
                        var4 |= 1 << var18;
                     }

                     var39 = "炵糑倰";
                     if ((var18 = this.aot(0, "点粹值", var9, var4, 1, 2)) != -1) {
                        var4 |= 1 << var18;
                     }

                     var39 = "炪糟倯";
                     if ((var18 = this.aot(0, "点粹值", var10, var4, 2, 3)) != -1) {
                        var4 |= 1 << var18;
                     }
                  }

                  var33 = this;
               }

               if (var33.ape(var4, 0, 3)) {
                  StringBuilder var38 = new StringBuilder(String.valueOf(var3));
                  String var42 = "扸劓";
                  this.bk(var38.append("成功").toString());
               } else {
                  this.aza = var3;
               }
            }
         }
      }
   }

   public void aoz(String var1) {
      if (this.nb.en().getText().equals(var1)) {
         String var2;
         if ((var2 = this.ox(false)) != null) {
            this.bk(var2);
         }
      }
   }

   public boolean nb(String var1) {
      if (this.nb.en().getText().equals(var1)) {
         return false;
      } else if (this.ds == 1) {
         String var21 = "兛债歱穭府";
         this.afx._do("先停止程序");
         return false;
      } else {
         if (var1.equals(this.ayz[0])) {
            this.g(6);
            String var10002 = "屒恏丌";
            this.apd(0, "属性一", 0);
            String var10003 = "屍恁亟";
            this.apd(1, "属性二", 0);
            String var10004 = "屒恏丅";
            this.apd(2, "属性三", 0);
            String var10005 = "屍恁囈";
            this.apd(3, "属性四", 0);
            String var10006 = "牵拨丌";
            this.apd(4, "特技一", 2);
            String var10007 = "牪拦亟";
            this.apd(5, "特技二", 2);
            var10007 = "KG豫凶烔匚霊杳址炵冓远蠤卿厇弌妣臦勀炰卾/\u001a妎柴霌觩锍寲屒恏读址炰卾靮朗迗蠤锍寲/\u001a牵拨屒恏另靨塧凱牵拨吁禘/\u001a口遲迋K^HpH/#笪原吀斞匵鄥外乂屒恏/\u001a侇R屒恏孛毝=\u0014屒恏孛毝>";
            this.in.setText("#K调出炼化面板在点击运行即可开始自动炼化#r如果需要锁定属性请在炼化面板进行锁定#r特技属性只需填写特技名称#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
         } else if (var1.equals(this.ayz[1])) {
            this.g(5);
            String var9 = "屍恁专";
            this.apd(0, "属性一", 0);
            String var22 = "屒恏亀";
            this.apd(1, "属性二", 0);
            String var36 = "屍恁业";
            this.apd(2, "属性三", 0);
            String var41 = "屒恏囗";
            this.apd(3, "属性四", 0);
            String var50 = "屍恁亇";
            this.apd(4, "属性五", 0);
            var50 = "KG豫凶烔匚霊杳址炵冓远蠤卿厇弌妣臦勀炰嘀/\u001a妎柴霌觩锍寲屒恏读址炰卾靮朗迗蠤锍寲/\u001a口遲迋K^HpH/#笪原吀斞匵鄥外乂屒恏/\u001a侇R屒恏孛毝=\u0014屒恏孛毝>";
            this.in.setText("#K调出炼化面板在点击运行即可开始自动炼器#r如果需要锁定属性请在炼化面板进行锁定#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
         } else if (var1.equals(this.ayz[2])) {
            this.g(4);
            String var10 = "财贻";
            this.apd(0, "资质", 1);
            String var23 = "屒恏丌";
            this.apd(1, "属性一", 2);
            var23 = "屍恁亟";
            this.apd(2, "属性二", 2);
            String var42 = "晷阹";
            this.apd(3, "星阵", 2);
            var42 = "EX讑尕朶斊敘罽霄杬乬圻烟凨辶衟匕叼彦姘膌劻烚包Ea厌霓觧塸凿赗赎朓伨覒氤;Q#杦佝O0\u0014昌陓屍恁叹靦塸凿昌陓吞禖0\u0014叼遼返EAFoF0-笵厑吟斐匪鄫変乌屍恁0\u0014侘\\屍恁孄毓\"\u001a屍恁孄毓!";
            this.in.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r只需要填写资质最低要求(70最低)#r星阵属性只需填写星阵名称#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
         } else if (var1.equals(this.ayz[3])) {
            this.g(1);
            String var11 = "仼血勈戜";
            this.apd(0, "五行加成", 1);
            var11 = "0-诤屠权旿攭缈靱朙丙坎炪冝迃蠪占厉弓妭臹勎炯印0\u0014亇蠪劳扶霓觧朚晹阦戫胮畹敛";
            this.in.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r五行加成需要有星阵才能生效");
         } else if (var1.equals(this.ayz[4])) {
            this.g(5);
            String var13 = "尶怫觩汎";
            this.apd(0, "属性要求", 2);
            String var25 = "垜硓尸怴";
            this.apd(1, "基础属性", 2);
            var25 = "垒硌尶怫";
            this.apd(2, "基础属性", 2);
            String var44 = "辽阥尸怴";
            this.apd(3, "进阶属性", 2);
            String var52 = "辳阺尶怫";
            this.apd(4, "进阶属性", 2);
            var52 = "0-诤屠权旿攭缈04住圬0-靱朙丙坎炪冝迃蠪占厉弓妭臹勎炯印0\u0014屍恁覒氤塸凿;桟骻觧汑I灦恁覒氤<勽釜觧汑I敜挑覒氤:乫塸凿刊斆覒氤0\u0014屍恁叹靦塸凿孄毓吞N迈限屍恁丩纙孄尸怴O0\u0014叼遼返EAFoF0-笵厑吟斐匪鄫変乌屍恁0\u0014侘\\屍恁孄毓\"\u001a屍恁孄毓!";
            this.in.setText("#K请将材料放置#R作坊#K面板上在点击运行即可开始自动炼化#r属性要求填写(根骨要求/灵性要求/力量要求/敏捷要求)不填写则无要求#r属性只需填写字段名(进阶属性为绿字属性)#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
         } else if (var1.equals(this.ayz[5])) {
            this.g(2);
            String var14 = "觅釺抌";
            this.apd(0, "觉醒技", 2);
            var14 = "晹纴";
            this.apd(1, "星级", 1);
            String var27 = "KG讟尊朸斕敖罢霊杳乢圤烑凷辸血匛口彨姇膂劤烔匚K~覡醞拨屒恏另靨塧凱觅釺抌呥秼K~厇逖辯/:,\u0014,KG筎叻呤旺卑酁奲並覡醞拨/\u001a侇R抌肕吁禘=\u0014抌肕吁禘>";
            this.in.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r觉醒技属性只需填写觉醒技名称#r可通过#R | #K符号同时匹配多个觉醒技#r例:技能名称1|技能名称2");
         } else if (var1.equals(this.ayz[6])) {
            this.g(3);
            String var16 = "屍恁专";
            this.apd(0, "属性一", 0);
            String var28 = "屒恏亀";
            this.apd(1, "属性二", 0);
            var28 = "爟抓";
            this.apd(2, "特技", 2);
            String var37 = "/#读屮杜旱攲缆靮朗丆址炵冓远蠤卿厇弌妣臦勀炰卾/\u001a牵拨屒恏另靨塧凱牵拨吁禘/\u001a口遲迋K^HpH/#笪原吀斞匵鄥外乂屒恏/\u001a侇R屒恏孛毝=\u0014屒恏孛毝>";
            this.in.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r特技属性只需填写特技名称#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
         } else if (var1.equals(this.ayz[7])) {
            this.g(3);
            String var30 = "恝炪糟倯";
            this.apd(0, "总点粹值", 1);
            var30 = "屒恏丌";
            this.apd(1, "属性一", 1);
            String var45 = "屍恁亟";
            this.apd(2, "属性二", 1);
            com.xy.q.Class36 var10000 = Class95.d(this.aaf.get(1));
            String var10001 = "炵糑倰";
            var10000.setText("点粹值");
            var10000 = Class95.d(this.aaf.get(2));
            var10001 = "炪糟倯";
            var10000.setText("点粹值");
            var10001 = "KG讟尊朸斕敖罢霊杳乢圤烑凷辸血匛口彨姇膂劤烔匚K~尶怫乨戚聭屒恏亀堃皈晇炵糑倰@/:=E>X炵糑倰荫囸H青尽礶霊杳乢皈尶怫偔/#%";
            this.in.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r属性一或者属性二填的是点粹值(#R1-20点粹值范围 非展示面板上的属性值#K)");
         } else if (var1.equals(this.ayz[8])) {
            this.g(4);
            String var17 = "屍恁专";
            this.apd(0, "属性一", 0);
            String var32 = "屒恏亀";
            this.apd(1, "属性二", 0);
            String var38 = "屍恁业";
            this.apd(2, "属性三", 0);
            String var46 = "屒恏囗";
            this.apd(3, "属性四", 0);
            var46 = "EX讑尕朶斊敘罽霄杬坎炪冝迃蠪占厉弓妭臹勎釞钞0\u0014叼遼返EAFoF0-笵厑吟斐匪鄫変乌屍恁0\u0014侘\\屍恁孄毓\"\u001a屍恁孄毓!";
            this.in.setText("#K请将材料放置面板在点击运行即可开始自动重铸#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
         } else if (var1.equals(this.ayz[9])) {
            this.g(6);
            String var18 = "屒恏丌";
            this.apd(0, "属性一", 0);
            String var33 = "屍恁亟";
            this.apd(1, "属性二", 0);
            String var39 = "屒恏丅";
            this.apd(2, "属性三", 0);
            String var48 = "屍恁囈";
            this.apd(3, "属性四", 0);
            String var54 = "牵拨丌";
            this.apd(4, "特技一", 2);
            String var57 = "牪拦亟";
            this.apd(5, "特技二", 2);
            var57 = "KG讟尊朸斕敖罢霊杳址炵冓远蠤卿厇弌妣臦勀炰卾/\u001a牵拨屒恏另靨塧凱牵拨吁禘/\u001a口遲迋K^HpH/#笪原吀斞匵鄥外乂屒恏/\u001a侇R屒恏孛毝=\u0014屒恏孛毝>";
            this.in.setText("#K请将材料放置面板在点击运行即可开始自动炼化#r特技属性只需填写特技名称#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
         } else if (var1.equals(this.ayz[10])) {
            this.g(7);
            String var19 = "屍恁专";
            this.apd(0, "属性一", 0);
            String var34 = "屒恏亀";
            this.apd(1, "属性二", 0);
            String var40 = "屍恁业";
            this.apd(2, "属性三", 0);
            String var49 = "屒恏囗";
            this.apd(3, "属性四", 0);
            String var55 = "屍恁亇";
            this.apd(4, "属性五", 0);
            String var59 = "牵拨丌";
            this.apd(5, "特技一", 2);
            String var10008 = "牪拦亟";
            this.apd(6, "特技二", 2);
            int var2 = 0;

            for (int var4 = var2; var4 < 7; var4 = var2) {
               Class95 var5 = this.aaf.get(var2);
               var2++;
               Class95.a(var5).setEditable(false);
            }

            String var8 = "/#读屮杜旱攲缆靮朗圤烑凷辸血匛口彨姇膂劤烔匚K~爑抌尶怫厂霌堃冕爑抌呥秼K~斈霌堃冕杨尃尶怫偔/\u001a口遲迋K^HpH/#笪原吀斞匵鄥外乂屒恏/\u001a侇R屒恏孛毝=\u0014屒恏孛毝>";
            this.in.setText("#K请将材料放置面板在点击运行即可开始自动炼化#r特技属性只需填写特技名称#r无需填写最小属性值#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
         } else {
            if (!var1.equals(this.ayz[11])) {
               return false;
            }

            this.g(2);
            String var20 = "屍恁专";
            this.apd(0, "属性一", 0);
            String var35 = "屒恏亀";
            this.apd(1, "属性二", 0);
         }

         return true;
      }
   }

   public void apa(String var1) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.nb.en().getText().equals("星卡神通")) {
               int var2 = 0;
               String var10001 = "5";
               String[] var3 = var1.split("&");

               int var4;
               for (int var10000 = var4 = 1; var10000 < var3.length; var10000 = ++var4) {
                  String var12 = var3[var4];
                  var10001 = "1";
                  int var5;
                  if ((var5 = var12.indexOf("=")) != -1) {
                     String var6;
                     String var13 = var6 = var3[var4].substring(0, var5);
                     var10001 = "晹阦尸怴";
                     if (var13.equals("星阵属性")) {
                        String var14 = var3[var4];
                        var10001 = "1";
                        String[] var7 = var14.split("=");
                        int var8;
                        if ((var8 = this.aot(1, var7[1], 0.0, var2, 3, 4)) != -1) {
                           var2 |= 1 << var8;
                        }
                     } else {
                        var10001 = "财贻";
                        if (var6.equals("资质")) {
                           double var10 = QualityZW.getDouble(var3[var4].substring(var5 + 1));
                           int var9;
                           if ((var9 = this.aot(0, var6, var10, var2, 0, 1)) != -1) {
                              var2 |= 1 << var9;
                           }
                        } else {
                           int var11;
                           if ((var11 = this.aot(1, var6, 0.0, var2, 1, 3)) != -1) {
                              var2 |= 1 << var11;
                           }
                        }
                     }
                  }
               }

               if (this.ape(var2, 0, 4)) {
                  var10001 = "晷卭礶逖烔匚扸劓";
                  this.bk("星卡神通炼化成功");
               } else {
                  this.aza = "星卡神通";
               }
            }
         }
      }
   }

   public void apb(String var1) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.nb.en().getText().equals("炼器")) {
               int var2 = 0;
               String var10001 = "*";
               String[] var3 = var1.split("&");

               int var4;
               for (int var10000 = var4 = 2; var10000 < var3.length; var10000 = ++var4) {
                  String var10 = var3[var4];
                  var10001 = ".";
                  int var5;
                  if ((var5 = var10.indexOf("=")) != -1) {
                     String var6 = var3[var4].substring(0, var5);
                     double var7 = QualityZW.getDouble(var3[var4].substring(var5 + 1));
                     int var9;
                     if ((var9 = this.aot(0, var6, var7, var2, 0, 5)) != -1) {
                        var2 |= 1 << var9;
                     }
                  }
               }

               if (this.ape(var2, 0, 5)) {
                  var10001 = "烔噤扸劓";
                  this.bk("炼器成功");
               } else {
                  this.aza = "炼器";
               }
            }
         }
      }
   }

   public void apc(String var1, double var2) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.nb.en().getText().equals("星卡五行")) {
               if (var2 == -1.0) {
                  String var6 = "泉朅晷阹仼血勈戜斈敄";
                  this.bk("没有星阵五行加成无效");
               } else {
                  int var4 = 0;
                  String var10002 = "仲衟勆戃";
                  int var5;
                  if ((var5 = this.aot(0, "五行加成", var2, var4, 0, 1)) != -1) {
                     var4 |= 1 << var5;
                  }

                  if (this.ape(var4, 0, 1)) {
                     String var10001 = "晷卭仼血烔匚扸劓";
                     this.bk("星卡五行炼化成功");
                  } else {
                     this.aza = "星卡五行";
                  }
               }
            }
         }
      }
   }

   public void bk(String var1) {
      this.ds = 0;
      this.azb = null;
      this.mq = null;
      this.aza = null;
      this.ia = 0;
      String var10004 = "辸血";
      this.aoo.setText("运行");
      this.xp.setVisible(false);
      this.aov(var1);
   }

   public Class95 apd(int var1, String var2, int var3) {
      this.aaf.get(var1).f(var2, 52, 90 + var1 * 22, var3);
      return null;
   }

   public void g(int var1) {
      var1 = Math.max(var1, this.aaf.size());

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1; var10000 = var2) {
         Class95 var3 = var2 < this.aaf.size() ? this.aaf.get(var2) : null;
         if (var3 == null) {
            var3 = new Class95(this);
            this.aaf.add(var3);
         }

         var2++;
         var3.f(null, 0, 0, 0);
      }
   }

   public void bq(String var1) {
      if (this.ds == 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.nb.en().getText().equals("孩子雕琢")) {
               int var2 = 0;
               String var10001 = "*";
               String[] var3 = var1.split("&");

               int var4;
               for (int var10000 = var4 = 2; var10000 < var3.length; var10000 = ++var4) {
                  String var13 = var3[var4];
                  var10001 = ".";
                  int var5;
                  if ((var5 = var13.indexOf("=")) != -1) {
                     String var6;
                     String var14 = var6 = var3[var4].substring(0, var5);
                     var10001 = "爑抌";
                     if (var14.equals("特技")) {
                        String var15 = var3[var4];
                        var10001 = ".";
                        String[] var11 = var15.split("=");

                        int var8;
                        for (int var16 = var8 = 1; var16 < var11.length; var16 = ++var8) {
                           int var10;
                           Skill var12;
                           if ((var12 = this.yt().ac(var11[var8])) != null && (var10 = this.aot(1, var12.getSkillname(), 0.0, var2, 4, 6)) != -1) {
                              var2 |= 1 << var10;
                           }
                        }
                     } else {
                        double var7 = QualityZW.getDouble(var3[var4].substring(var5 + 1));
                        int var9;
                        if ((var9 = this.aot(0, var6, var7, var2, 0, 4)) != -1) {
                           var2 |= 1 << var9;
                        }
                     }
                  }
               }

               if (this.ape(var2, 0, 6)) {
                  var10001 = "隽琮扸劓";
                  this.bk("雕琢成功");
               } else {
                  this.aza = "孩子雕琢";
               }
            }
         }
      }
   }

   public void ci(String var1) {
      if (this.ds == 1) {
         if (this.nb.en().getText().equals("觉醒技重洗")) {
            int var2 = 0;
            if (var1 != null && !var1.equals("")) {
               String var10001 = "5";
               String[] var3 = var1.split("&");
               Skill var4;
               int var5;
               if ((var4 = this.yt().ac(var3[1])) != null && (var5 = this.aot(1, var4.getSkillname(), 0.0, var2, 0, 1)) != -1) {
                  var2 |= 1 << var5;
               }

               String var10002 = "晷纫";
               if ((var5 = this.aot(0, "星级", QualityZW.getDouble(var3[2]), var2, 1, 2)) != -1) {
                  var2 |= 1 << var5;
               }
            }

            if (this.ape(var2, 0, 2)) {
               String var7 = "觚釴抓醫洄扶劌";
               this.bk("觉醒技重洗成功");
            } else {
               this.aza = "觉醒技重洗";
            }
         }
      }
   }

   public String ox(boolean var1) {
      Class142 var44;
      label316: {
         String var2;
         if ((var2 = this.nb.en().getText()).equals(this.ayz[0])) {
            com.xy.a.q.Class57 var3;
            if ((var3 = (com.xy.a.q.Class57)this.zc().l(61)) == null || var3.dx() != 0) {
               String var34 = "擞伺畟霄朹戵弓";
               return "操作界面未打开";
            }

            com.xy.a.q.Class64 var4;
            String var5;
            String var10000 = var5 = (var4 = var3.xu()).jg();
            String var10001 = "烔匚袭夋";
            if (!var10000.equals("炼化装备")) {
               var10001 = "烚包亿噻";
               if (!var5.equals("炼化仙器")) {
                  var10001 = "烔匚礶兹";
                  if (!var5.equals("炼化神兵")) {
                     String var33 = "诤遯拺朶斊";
                     return "请选择材料";
                  }
               }
            }

            if (this.zc().l(11) == null) {
               String var32 = "兄戻弌暗据甤靮辳血尶怫镩宖";
               return "先打开替换界面进行属性锁定";
            }

            if (var1 && this.zc().l(11) == null) {
               String var31 = "兛戵弓暙捱甪靱辽衟尸怴镧安";
               return "先打开替换界面进行属性锁定";
            }

            if (this.zc().l(11) == null) {
               String var30 = "擁伴畀霊巾儛闡";
               return "操作界面已关闭";
            }

            if (!var4.yd(false)) {
               String var29 = "朶斊乫趠";
               return "材料不足";
            }
         } else if (var2.equals(this.ayz[1])) {
            com.xy.a.q.Class57 var9;
            if ((var9 = (com.xy.a.q.Class57)this.zc().l(61)) == null || var9.dx() != 2) {
               String var39 = "擁伴畀霊朦戻弌";
               return "操作界面未打开";
            }

            com.xy.a.q.Class64 var19;
            if (!(var19 = var9.xu()).jg().equals("炼器")) {
               String var38 = "诤遯拺朶斊";
               return "请选择材料";
            }

            if (var1 && this.zc().l(11) == null) {
               String var37 = "兄戻弌暗据甤靮辳血尶怫镩宖";
               return "先打开替换界面进行属性锁定";
            }

            if (this.zc().l(11) == null) {
               String var36 = "擞伺畟霄巡儕闾";
               return "操作界面已关闭";
            }

            if (!var19.yd(false)) {
               String var35 = "朸斕乥趿";
               return "材料不足";
            }
         } else if (var2.equals(this.ayz[2]) || var2.equals(this.ayz[3])) {
            com.xy.a.a.Class19 var18;
            if ((var18 = (com.xy.a.a.Class19)this.zc().l(95)) == null || var18.ia() != 1 || var18.dx() != 2) {
               String var76 = "擞伺畟霄朹戵弓";
               return "操作界面未打开";
            }

            if (var18.id() != (var2.equals(this.ayz[2]) ? 0 : 1)) {
               String var75 = "擁伴畀霊朦戻弌";
               return "操作界面未打开";
            }

            if (!var1 && this.zc().l(11) == null) {
               String var74 = "擞伺畟霄巡儕闾";
               return "操作界面已关闭";
            }

            if (!var18.dh()) {
               String var73 = "读遡拥朸斕";
               return "请选择材料";
            }
         } else if (var2.equals(this.ayz[4])) {
            com.xy.a.q.Class57 var10;
            if ((var10 = (com.xy.a.q.Class57)this.zc().l(61)) == null || var10.dx() != 1) {
               String var49 = "擞伺畟霄朹戵弓";
               return "操作界面未打开";
            }

            com.xy.a.q.Class64 var20;
            Class64 var41;
            label306: {
               var20 = var10.xu();
               if (!var1) {
                  if (this.za().gameType == 2) {
                     if (this.azb == null) {
                        String var48 = "冒玼彪帴";
                        return "出现异常";
                     }

                     Goodstable var24;
                     if (this._if(var24 = this.yx().getGood(this.azb.getRgid()))) {
                        String var47 = "鄫饣醫铫寪戃";
                        return "配饰重铸完成";
                     }

                     var41 = var20;
                     var20.ay(var24);
                     break label306;
                  }

                  if (this.azb == null) {
                     String var43 = "冒玼彪帴";
                     return "出现异常";
                  }

                  Goodstable var23;
                  if ((var23 = this.yx().getGood(this.azb.getRgid())) == null || var23 == this.azb) {
                     return null;
                  }

                  if (this._if(var23)) {
                     String var42 = "鄫饣醫铫寪戃";
                     return "配饰重铸完成";
                  }

                  Goodstable[] var6 = var20.zq();

                  int var7;
                  for (int var40 = var7 = 0; var40 < var6.length; var40 = ++var7) {
                     if (var6[var7] != null && (var7 != 1 || this.mq.compareTo(var6[var7].getGoodsid()) != 0)) {
                        var20.cb(var23, var7);
                     }
                  }

                  var20.cb(var23, 0);
                  Goodstable var27;
                  if (!var20.at(1) && (var27 = this.yx().bk(this.mq)) != null) {
                     var20.cb(var27, 1);
                  }
               }

               var41 = var20;
            }

            String var25;
            if (!(var25 = var41.jg()).equals("佩饰重铸")) {
               String var46 = "读遡拥朸斕";
               return "请选择材料";
            }

            Goodstable[] var26 = var20.zq();
            Goodstable var28 = null;
            BigDecimal var8 = null;
            if (var1) {
               var28 = var26[0];
               var8 = var26[1].getGoodsid();
            }

            if (!var20.zp(var26, var20.em(), var25, false)) {
               String var45 = "朶斊乫趠";
               return "材料不足";
            }

            if (var1) {
               var44 = this;
               this.azb = var28;
               this.mq = var8;
               this.ia = 0;
               this.aza = this.ayz[4];
               break label316;
            }
         } else if (var2.equals(this.ayz[5])) {
            com.xy.a.q.Class97 var11;
            if ((var11 = (com.xy.a.q.Class97)this.zc().l(91)) == null || var11.dx() != 1 || var11.id() != 1) {
               String var51 = "擁伴畀霊朦戻弌";
               return "操作界面未打开";
            }

            if (!var11.dh()) {
               String var50 = "诤遯拺朶斊";
               return "请选择材料";
            }
         } else if (var2.equals(this.ayz[6])) {
            com.xy.a.q.Class57 var12;
            if ((var12 = (com.xy.a.q.Class57)this.zc().l(61)) == null || var12.dx() != 1) {
               String var56 = "擁伴畀霊朦戻弌";
               return "操作界面未打开";
            }

            com.xy.a.q.Class64 var21;
            String var52 = (var21 = var12.xu()).jg();
            String var79 = "鄫饣烟粪";
            if (!var52.equals("配饰点粹")) {
               String var55 = "读遡拥朸斕";
               return "请选择材料";
            }

            if (this.zc().l(11) == null) {
               String var54 = "兛戵弓暙捱甪靱辽衟尸怴镧安";
               return "先打开替换界面进行属性锁定";
            }

            if (!var21.yd(false)) {
               String var53 = "朸斕乥趿";
               return "材料不足";
            }
         } else if (var2.equals(this.ayz[7])) {
            com.xy.a.q.Class57 var13;
            if ((var13 = (com.xy.a.q.Class57)this.zc().l(61)) == null || var13.dx() != 1) {
               String var61 = "擞伺畟霄朹戵弓";
               return "操作界面未打开";
            }

            com.xy.a.q.Class64 var22;
            String var57 = (var22 = var13.xu()).jg();
            String var80 = "鄥饼糑炰";
            if (!var57.equals("配饰粹炼")) {
               String var60 = "诤遯拺朶斊";
               return "请选择材料";
            }

            if (this.zc().l(11) == null) {
               String var59 = "兄戻弌暗据甤靮辳血尶怫镩宖";
               return "先打开替换界面进行属性锁定";
            }

            if (!var22.yd(false)) {
               String var58 = "朶斊乫趠";
               return "材料不足";
            }
         } else if (var2.equals(this.ayz[8])) {
            com.xy.a.i.Class11 var14;
            if ((var14 = (com.xy.a.i.Class11)this.zc().l(166)) == null || var14.dx() != 1) {
               String var64 = "擁伴畀霊朦戻弌";
               return "操作界面未打开";
            }

            if (this.zc().l(11) == null) {
               String var63 = "兛戵弓暙捱甪靱辽衟尸怴镧安";
               return "先打开替换界面进行属性锁定";
            }

            if (!var14.dh()) {
               String var62 = "朸斕乥趿";
               return "材料不足";
            }
         } else if (var2.equals(this.ayz[9])) {
            com.xy.a.i.Class11 var15;
            if ((var15 = (com.xy.a.i.Class11)this.zc().l(166)) == null || var15.dx() != 0) {
               String var67 = "擞伺畟霄朹戵弓";
               return "操作界面未打开";
            }

            if (this.zc().l(11) == null) {
               String var66 = "兄戻弌暗据甤靮辳血尶怫镩宖";
               return "先打开替换界面进行属性锁定";
            }

            if (!var15.dh()) {
               String var65 = "朶斊乫趠";
               return "材料不足";
            }
         } else if (var2.equals(this.ayz[10])) {
            com.xy.a.q.Class13 var16;
            if ((var16 = (com.xy.a.q.Class13)this.zc().l(175)) == null || var16.ia() != 2) {
               String var69 = "靨覍烑凷彨姇阬灹捡钢彑凶阬灹霊杳";
               return "需要点击开始附灵按钮弹出附灵面板";
            }

            if (var16.dh()) {
               this.aza = this.ayz[10];
               return null;
            }

            if (!var16.at(323)) {
               String var68 = "朶斊乫趠";
               return "材料不足";
            }
         } else {
            if (!var2.equals(this.ayz[11])) {
               String var72 = "彪帴億弃";
               return "异常公式";
            }

            com.xy.a.i.Class1 var17;
            if ((var17 = (com.xy.a.i.Class1)this.afx.getFormManagement().l(74)) == null) {
               String var71 = "擁伴畀霊朦戻弌";
               return "操作界面未打开";
            }

            if (!var17.at(20)) {
               String var70 = "朶斊乫趠";
               return "材料不足";
            }
         }

         var44 = this;
      }

      var44.z++;
      if (!var1) {
         this.aov(null);
      }

      return null;
   }

   public boolean ape(int var1, int var2, int var3) {
      int var4;
      for (int var10000 = var4 = var2; var10000 < var3; var10000 = ++var4) {
         if (!this.aaf.get(var4).e().equals("") && (var1 >>> var4 & 1) != 1) {
            return false;
         }
      }

      return true;
   }
}
