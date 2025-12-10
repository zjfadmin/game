package com.xy;

import com.xy.formula.BaseEquip;
import com.xy.formula.PetProperty;
import com.xy.formula.QualityZW;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class605 extends Class345 {
   private RichLabel zk;
   private JComponent zl;
   private Goodstable zm;
   private String zn;
   private String[] zo;
   private JLabel lk;
   private int gv;
   private int gc;
   private Class659 zp;
   private List<null> xh;
   private String nc;
   private Class322 az;
   private int bn;
   private BigDecimal co;
   private JLabel ax;

   public void pj(String var1) {
      if (this.gv == 5 >> 2) {
         if (var1 != null && !var1.equals("")) {
            if (this.zp.fa().getText().equals("星卡神通")) {
               int var2 = 0;
               String[] var8 = var1.split("&");

               int var3;
               for(int var10000 = var3 = 3 >> 1; var10000 < var8.length; var10000 = var3) {
                  int var4;
                  if ((var4 = var8[var3].indexOf("=")) != -4 >> 2) {
                     String var5;
                     if ((var5 = var8[var3].substring(3 ^ 3, var4)).equals("星阵属性")) {
                        String[] var6 = var8[var3].split("=");
                        int var7;
                        if ((var7 = this.pq(--1, var6[--1], 0.0D, var2, --3, --4)) != -4 >> 2) {
                           var2 |= (4 ^ 5) << var7;
                        }
                     } else if (var5.equals("资质")) {
                        double var9 = QualityZW.getDouble(var8[var3].substring(var4 + --1));
                        if ((var4 = this.pq(3 & 4, var5, var9, var2, 3 ^ 3, --1)) != -4 >> 2) {
                           var2 |= --1 << var4;
                        }
                     } else {
                        int var10;
                        if ((var10 = this.pq(--1, var5, 0.0D, var2, 2 ^ 3, --3)) != -4 >> 2) {
                           var2 |= (3 & 5) << var10;
                        }
                     }
                  }

                  ++var3;
               }

               if (this.pw(var2, 3 ^ 3, --4)) {
                  this.pr("星卡神通炼化成功");
               } else {
                  this.nc = "星卡神通";
               }
            }
         }
      }
   }

   public void pk(String var1) {
      if (this.gv == 3 >> 1) {
         if (this.zp.fa().getText().equals("兽装重洗")) {
            int var2 = 0;
            if (var1 != null && !var1.equals("")) {
               String[] var7 = var1.split("\\|");

               int var4;
               for(int var10000 = var4 = 2 & 5; var10000 < var7.length; var10000 = var4) {
                  int var8;
                  if (var7[var4].startsWith(PetProperty.evs[3 ^ 3])) {
                     if ((var8 = this.pq(--1, "根骨", 0.0D, var2, 2 & 5, 4 ^ 5)) != -4 >> 2) {
                        var2 |= 5 >> 2 << var8;
                     }
                  } else if (var7[var4].startsWith(PetProperty.evs[--1])) {
                     if ((var8 = this.pq(5 >> 2, "灵性", 0.0D, var2, 3 ^ 3, 4 ^ 5)) != -4 >> 2) {
                        var2 |= --1 << var8;
                     }
                  } else if (var7[var4].startsWith(PetProperty.evs[--2])) {
                     if ((var8 = this.pq(2 ^ 3, "力量", 0.0D, var2, 5 >> 3, --1)) != -4 >> 2) {
                        var2 |= (3 & 5) << var8;
                     }
                  } else if (var7[var4].startsWith(PetProperty.evs[--3])) {
                     if ((var8 = this.pq(2 ^ 3, "敏捷", 0.0D, var2, 3 >> 2, 2 ^ 3)) != -4 >> 2) {
                        var2 |= (4 ^ 5) << var8;
                     }
                  } else if (var7[var4].startsWith(PetProperty.evs[25 & 110])) {
                     if ((var8 = this.pq(1, "附加速度", 0.0D, var2, 0, 1)) != -4 >> 2) {
                        var2 |= 1 << var8;
                     }
                  } else if (var7[var4].startsWith(PetProperty.evs[--4])) {
                     String[] var3 = var7[var4].split("\\&");

                     int var5;
                     for(var10000 = var5 = 1; var10000 < var3.length; var10000 = var5) {
                        int var6 = var3[var5].indexOf("=");
                        String var9 = var3[var5].substring(0, var6);
                        if ((var6 = this.pq(1, var9, 0.0D, var2, 1, --4)) != -4 >> 2) {
                           var2 |= 1 << var6;
                        }

                        ++var5;
                     }
                  }

                  ++var4;
               }
            }

            if (this.pw(var2, 0, 5 >> 1)) {
               this.pr("兽装重洗成功");
            } else {
               this.nc = "兽装重洗";
            }
         }
      }
   }

   public void s() {
      if (this.gv != 0) {
         this.pr((String)null);
      } else {
         int var10003 = 3 & 4;
         int var10005 = 2 ^ 3;
         int var10007 = 3 ^ 3;
         this.zm = this.zn = null;
         this.co = null;
         this.nc = null;
         this.bn = var10007;
         this.gv = var10005;
         this.gc = var10003;
         this.az.setText("停止");
         if (this.aej.isVisible() && this.aej.gameFrame.isFocused()) {
            this.az.requestFocus();
         }

         int var10001 = 5 >> 2;
         this.zl.setVisible((boolean)(5 >> 2));
         this.po((String)null);
         String var1;
         if ((var1 = this.pu((boolean)var10001)) != null) {
            this.pr(var1);
         }
      }
   }

   public void pl(String var1) {
      if (this.gv == --1) {
         if (var1 != null && !var1.equals("")) {
            if (this.zp.fa().getText().equals("守护石附灵")) {
               int var5 = 0;
               int var4 = 3 >> 2;

               int var3;
               for(int var10000 = var3 = 3 ^ 3; var10000 < var1.length(); var10000 = var3) {
                  if ((var3 = var1.indexOf("|", var4 + (2 ^ 3))) == -4 >> 2) {
                     var3 = var1.length();
                  }

                  label51: {
                     int var2;
                     if ((var2 = var1.indexOf("=", var4 + (3 & 5))) != -4 >> 2) {
                        if (var2 > var3) {
                           var10000 = var3;
                           break label51;
                        }

                        String var6;
                        if (!(var6 = var1.substring(var4, var2)).equals("等级")) {
                           if (var6.equals("耐久")) {
                              var10000 = var3;
                              break label51;
                           }

                           int var7;
                           if (var6.equals("技能")) {
                              var4 = var2 + (3 >> 1);
                              var2 = var1.indexOf("#", var4 + --1);
                              var7 = Class394.b(var1, var4, var2);
                              Skill var8;
                              if ((var8 = this.vc().bf(String.valueOf(var7))) != null && (var2 = this.pq(--1, var8.getSkillname(), 0.0D, var5, --5, 23 & 111)) != -4 >> 2) {
                                 var5 |= (4 ^ 5) << var2;
                                 var10000 = var3;
                                 break label51;
                              }
                           } else if ((var7 = this.pq(2 ^ 3, var6, 0.0D, var5, 2 & 5, --5)) != -4 >> 2) {
                              var5 |= (2 ^ 3) << var7;
                           }
                        }
                     }

                     var10000 = var3;
                  }

                  var4 = var10000 + 1;
               }

               if (this.pw(var5, 5 >> 3, 111 & 23)) {
                  this.pr("守护石附灵成功");
               } else {
                  this.nc = "守护石附灵";
               }
            }
         }
      }
   }

   public void pm(String var1) {
      if (this.gv == (4 ^ 5)) {
         if (var1 != null && !var1.equals("")) {
            if (this.zp.fa().getText().equals("炼器")) {
               int var2 = 0;
               String[] var8 = var1.split("&");

               int var3;
               for(int var10000 = var3 = 1 ^ 3; var10000 < var8.length; var10000 = var3) {
                  int var4;
                  if ((var4 = var8[var3].indexOf("=")) != -4 >> 2) {
                     String var5 = var8[var3].substring(3 & 4, var4);
                     double var6 = QualityZW.getDouble(var8[var3].substring(var4 + --1));
                     if ((var4 = this.pq(5 >> 3, var5, var6, var2, 3 >> 2, --5)) != -4 >> 2) {
                        var2 |= 5 >> 2 << var4;
                     }
                  }

                  ++var3;
               }

               if (this.pw(var2, 2 & 5, --5)) {
                  this.pr("炼器成功");
               } else {
                  this.nc = "炼器";
               }
            }
         }
      }
   }

   public void pn(String var1, double var2) {
      if (this.gv == --1) {
         if (var1 != null && !var1.equals("")) {
            if (this.zp.fa().getText().equals("星卡五行")) {
               if (var2 == -1.0D) {
                  this.pr("没有星阵五行加成无效");
               } else {
                  int var4 = 0;
                  int var5;
                  if ((var5 = this.pq(2 & 5, "五行加成", var2, var4, 2 & 5, 3 & 5)) != -4 >> 2) {
                     var4 |= --1 << var5;
                  }

                  if (this.pw(var4, 3 & 4, --1)) {
                     this.pr("星卡五行炼化成功");
                  } else {
                     this.nc = "星卡五行";
                  }
               }
            }
         }
      }
   }

   public boolean ee(String var1) {
      if (this.zp.fa().getText().equals(var1)) {
         return (boolean)(3 ^ 3);
      } else {
         int var10000;
         if (this.gv == 3 >> 1) {
            var10000 = 5 >> 3;
            this.aej.f("先停止程序");
            return (boolean)var10000;
         } else {
            int var10001;
            if (var1.equals(this.zo[2 & 5])) {
               var10001 = 5 >> 3;
               this.y(78 & 55);
               this.pv(var10001, "属性一", 3 >> 2);
               this.pv(4 ^ 5, "属性二", 3 & 4);
               this.pv(5 >> 1, "属性三", 5 >> 3);
               this.pv(--3, "属性四", 2 & 5);
               this.pv(--4, "特技一", 1 ^ 3);
               this.pv(--5, "特技二", 1 ^ 3);
               this.zk.setText("#K调出炼化面板在点击运行即可开始自动炼化#r如果需要锁定属性请在炼化面板进行锁定#r特技属性只需填写特技名称#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
            } else if (var1.equals(this.zo[4 ^ 5])) {
               var10001 = 3 & 4;
               this.y(--5);
               this.pv(var10001, "属性一", 3 & 4);
               this.pv(4 ^ 5, "属性二", 3 >> 2);
               this.pv(--2, "属性三", 3 & 4);
               this.pv(--3, "属性四", 3 >> 2);
               this.pv(--4, "属性五", 5 >> 3);
               this.zk.setText("#K调出炼化面板在点击运行即可开始自动炼器#r如果需要锁定属性请在炼化面板进行锁定#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
            } else if (var1.equals(this.zo[5 >> 1])) {
               var10001 = 3 >> 2;
               this.y(--4);
               this.pv(var10001, "资质", 5 >> 2);
               this.pv(1, "属性一", 5 >> 1);
               this.pv(5 >> 1, "属性二", 5 >> 1);
               this.pv(--3, "星阵", --2);
               this.zk.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r只需要填写资质最低要求(70最低)#r星阵属性只需填写星阵名称#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
            } else if (var1.equals(this.zo[3])) {
               this.y(1);
               this.pv(0, "五行加成", 1);
               this.zk.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r五行加成需要有星阵才能生效");
            } else if (var1.equals(this.zo[4])) {
               this.y(5);
               this.pv(0, "属性要求", 2);
               this.pv(1, "基础属性", 2);
               this.pv(2, "基础属性", 2);
               this.pv(3, "进阶属性", 2);
               this.pv(4, "进阶属性", 2);
               this.zk.setText("#K请将材料放置#R作坊#K面板上在点击运行即可开始自动炼化#r属性要求填写(根骨要求/灵性要求/力量要求/敏捷要求)不填写则无要求#r属性只需填写字段名(进阶属性为绿字属性)#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
            } else if (var1.equals(this.zo[5])) {
               this.y(2);
               this.pv(0, "觉醒技", 2);
               this.pv(1, "星级", 1);
               this.zk.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r觉醒技属性只需填写觉醒技名称#r可通过#R | #K符号同时匹配多个觉醒技#r例:技能名称1|技能名称2");
            } else if (var1.equals(this.zo[46 & 87])) {
               this.y(3);
               this.pv(0, "属性一", 0);
               this.pv(1, "属性二", 0);
               this.pv(2, "特技", 2);
               this.zk.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r特技属性只需填写特技名称#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
            } else if (var1.equals(this.zo[103 & 31])) {
               this.y(3);
               this.pv(0, "总点粹值", 1);
               this.pv(1, "属性一", 1);
               this.pv(2, "属性二", 1);
               ((<undefinedtype>)this.xh.get(1)).d.setText("点粹值");
               ((<undefinedtype>)this.xh.get(2)).d.setText("点粹值");
               this.zk.setText("#K请将材料放置面板上在点击运行即可开始自动炼化#r属性一或者属性二填的是点粹值(#R1-20点粹值范围 非展示面板上的属性值#K)");
            } else if (var1.equals(this.zo[73 & 62])) {
               this.y(4);
               this.pv(0, "属性一", 0);
               this.pv(1, "属性二", 0);
               this.pv(2, "属性三", 0);
               this.pv(3, "属性四", 0);
               this.zk.setText("#K请将材料放置面板在点击运行即可开始自动重铸#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
            } else if (var1.equals(this.zo[105 & 31])) {
               this.y(23 & 110);
               this.pv(0, "属性一", 0);
               this.pv(1, "属性二", 0);
               this.pv(2, "属性三", 0);
               this.pv(3, "属性四", 0);
               this.pv(4, "特技一", 2);
               this.pv(5, "特技二", 2);
               this.zk.setText("#K请将材料放置面板在点击运行即可开始自动炼化#r特技属性只需填写特技名称#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
            } else if (var1.equals(this.zo[126 & 11])) {
               this.y(111 & 23);
               this.pv(0, "属性一", 0);
               this.pv(1, "属性二", 0);
               this.pv(2, "属性三", 0);
               this.pv(3, "属性四", 0);
               this.pv(4, "属性五", 0);
               this.pv(5, "特技一", 2);
               this.pv(55 & 78, "特技二", 2);
               int var2 = 0;

               for(var10000 = var2; var10000 < 7; var10000 = var2) {
                  <undefinedtype> var3 = (<undefinedtype>)this.xh.get(var2);
                  ++var2;
                  var3.c.setEditable(false);
               }

               this.zk.setText("#K请将材料放置面板在点击运行即可开始自动炼化#r特技属性只需填写特技名称#r无需填写最小属性值#r可通过#R | #K符号同时匹配多个属性#r例:属性字段1|属性字段2");
            } else if (var1.equals(this.zo[47 & 91])) {
               this.y(2);
               this.pv(0, "属性一", 0);
               this.pv(1, "属性二", 0);
            } else {
               if (!var1.equals(this.zo[60 & 79])) {
                  return false;
               }

               this.y(4);
               this.pv(0, "基础属性", 2);
               this.pv(1, "炼化属性", 2);
               this.pv(2, "炼化属性", 2);
               this.pv(3, "炼化属性", 2);
            }

            return true;
         }
      }
   }

   public void po(String var1) {
      StringBuffer var2 = new StringBuffer();
      if (var1 != null && !var1.equals("")) {
         var2.append(var1);
         var2.append("  ");
      }

      var2.append(this.gv == (3 & 5) ? "运行中" : "已停止");
      if (this.gc > 0) {
         var2.append("  第" + this.gc + "次执行");
      }

      this.ax.setText(var2.toString());
   }

   public boolean pp(Goodstable var1) {
      if (var1 == null) {
         return (boolean)(5 >> 3);
      } else {
         int var5 = 0;
         String[] var8 = var1.getValue().split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var8.length; var10000 = var3) {
            int var6;
            if (var8[var3].startsWith("炼化属性&")) {
               String[] var10 = var8[var3].split("&");

               int var9;
               for(var10000 = var9 = --1; var10000 < var10.length; var10000 = var9) {
                  if ((var6 = var10[var9].indexOf("=")) != -4 >> 2) {
                     String var7 = var10[var9].substring(5 >> 3, var6);
                     int var11;
                     if ((var11 = this.pq(4 ^ 5, var7, 0.0D, var5, --3, --5)) != -4 >> 2) {
                        var5 |= (4 ^ 5) << var11;
                     }
                  }

                  ++var9;
               }
            } else {
               String var2;
               int var4;
               if ((var4 = var8[var3].indexOf("=")) != -4 >> 2 && !(var2 = var8[var3].substring(5 >> 3, var4)).equals("培养") && !var2.startsWith("等级")) {
                  if (!var2.equals("根骨要求") && !var2.equals("灵性要求") && !var2.equals("力量要求") && !var2.equals("敏捷要求")) {
                     if ((var6 = this.pq(--1, var2, 0.0D, var5, --1, --3)) != -4 >> 2) {
                        var5 |= (2 ^ 3) << var6;
                     }
                  } else if ((var6 = this.pq(2 ^ 3, var2, 0.0D, var5, 5 >> 3, --1)) != -4 >> 2) {
                     var5 |= 5 >> 2 << var6;
                  }
               }
            }

            ++var3;
         }

         return this.pw(var5, 3 >> 2, --5);
      }
   }

   public Class605(GameView var1) {
      int var10001 = 31 & 109;
      int var10008 = -1 & -2;
      super(127 & 121, --2, Class345.aef, var1);
      this.va(var10008, 3 ^ 3, 4079 & 29111, 18395 & 14847, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 110 & 85, 110 & 85, 110 & 85, 110 & 85, (boolean)(2 & 5)), "自动炼化");
      this.az = new Class322("sc/e/31.png", 5 >> 2, 23307 & 9717, Class681.ak, Class681.c, "运行", this);
      this.az.setBounds(8171 & 24767, 27519 & 5628, 79 & 127, 95 & 57);
      this.add(this.az, 5 >> 3);
      this.zl = new JComponent() {
         protected void paintComponent(Graphics var1) {
            Graphics2D var2 = (Graphics2D)var1;
            var2.setComposite(Class8.n);
            var2.setColor(Color.BLACK);
            var2.fill(this.getBounds());
            var2.dispose();
         }
      };
      this.zl.setBounds(3 & 4, 3 & 4, 12207 & 20983, 6655 & 26587);
      this.zl.addMouseListener(Class133.a);
      this.zl.setVisible((boolean)(5 >> 3));
      this.add(this.zl, 4 ^ 5);
      this.zp = new Class659(2 & 5, 116 & 111, this);
      this.zp.gb((boolean)(5 >> 2));
      this.add(this.zp);
      this.ax = new JLabel();
      this.ax.setFont(Class681.bx);
      this.ax.setBounds(119 & 60, 60 & 127, 360, 18);
      this.ax.setForeground(Color.black);
      this.add(this.ax);
      this.lk = new JLabel("使用时请仔细检查是否有错别字");
      this.lk.setFont(Class681.ad);
      this.lk.setBounds(185, 36, 210, 18);
      this.lk.setForeground(Color.RED);
      this.add(this.lk);
      this.zk = new RichLabel("", Class681.ad, 360);
      this.zk.setBounds(44, 245, 360, 136);
      this.add(this.zk);
      this.xh = new ArrayList();
      String[] var3 = new String[var10001];
      boolean var10003 = true;
      var3[2 & 5] = "炼化";
      var3[5 >> 2] = "炼器";
      var3[1 ^ 3] = "星卡神通";
      var3[--3] = "星卡五行";
      var3[--4] = "配饰重铸";
      var3[--5] = "觉醒技重洗";
      var3[6] = "配饰点粹";
      var3[7] = "配饰粹炼";
      var3[8] = "孩子重铸";
      var3[9] = "孩子雕琢";
      var3[10] = "守护石附灵";
      var3[11] = "套装洗练";
      var3[12] = "兽装重洗";
      this.zo = var3;

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.zo.length; var10000 = var2) {
         if ((!this.zo[var2].equals("孩子重铸") && !this.zo[var2].equals("孩子雕琢") || this.uw().gameBaby) && (!this.zo[var2].equals("守护石附灵") || this.uw().gameMount)) {
            this.zp.fx(this.zo[var2]);
         }

         ++var2;
      }

      this.zp.vf(52, 36, 128, 80);
   }

   public void y(int var1) {
      var1 = Math.max(var1, this.xh.size());

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < var1; var10000 = var2) {
         Object var3 = var2 < this.xh.size() ? (<undefinedtype>)this.xh.get(var2) : null;
         if (var3 == null) {
            var3 = new Object() {
               private JLabel b = new JLabel();
               private Class217 c;
               private Class217 d;

               public {
                  this.b.setForeground(Color.black);
                  this.b.setFont(Class681.bx);
                  this.d = Class133.n(Class511.q("sc/d/17.png", 6 & 127, 6 & 127, 6 & 127, 6 & 127, (boolean)(3 >> 2)), Class681.ce, Color.white);
                  this.c = Class133.n(Class511.q("sc/d/17.png", 87 & 46, 87 & 46, 87 & 46, 87 & 46, (boolean)(2 & 5)), Class681.bx, Color.white);
                  Class605.this.add(this.b);
                  Class605.this.add(this.d);
                  Class605.this.add(this.c);
               }

               public double c() {
                  return QualityZW.getDouble(this.c.getText());
               }

               public boolean d(String var1) {
                  String var2 = this.f();
                  if (var1.length() > var2.length()) {
                     return (boolean)(3 ^ 3);
                  } else if (var2.equals(var1)) {
                     return (boolean)(--1);
                  } else if (var2.indexOf("|") == -4 >> 2) {
                     return (boolean)(3 & 4);
                  } else {
                     String[] var4 = var2.split("\\|");

                     int var3;
                     for(int var10000 = var3 = 3 >> 2; var10000 < var4.length; var10000 = var3) {
                        if (var4[var3].equals(var1)) {
                           return (boolean)(5 >> 2);
                        }

                        ++var3;
                     }

                     return (boolean)(5 >> 3);
                  }
               }

               public void e(String var1, int var2, int var3, int var4) {
                  this.b.setVisible((boolean)(var2 != 0 ? --1 : 0));
                  this.d.setVisible((boolean)(var2 != 0 ? 2 ^ 3 : 0));
                  this.c.setVisible((boolean)(var2 != 0 ? 3 >> 1 : 0));
                  if (var2 != 0) {
                     this.b.setText(var1);
                     this.d.setText("");
                     this.c.setText("");
                     this.b.setBounds(var2 - (93 & 42), var3, 125 & 70, 82 & 63);
                     this.d.setBounds(var2 + (62 & 127), var3 - (3 & 5), 86 & 127, 87 & 60);
                     this.c.setBounds(var2 + (127 & 62) + (125 & 62) + (35 & 127), var3 - (3 >> 1), 127 & 51, 63 & 84);
                     this.d.setEditable((boolean)(var4 != 0 && var4 != --2 ? 5 >> 3 : 1));
                     this.c.setEditable((boolean)(var4 != 0 && var4 != (3 & 5) ? 5 >> 3 : 1));
                     if (var4 == 3 >> 1) {
                        this.d.setText(var1);
                     } else {
                        if (var4 == 5 >> 1) {
                           this.c.setVisible((boolean)(--1));
                        }

                     }
                  }
               }

               public String f() {
                  return this.d.getText();
               }
            };
            this.xh.add(var3);
         }

         int var10002 = 3 & 4;
         ++var2;
         ((<undefinedtype>)var3).e((String)null, var10002, var10002, var10002);
      }

   }

   public int pq(int var1, String var2, double var3, int var5, int var6, int var7) {
      int var8 = -4 >> 2;
      double var9 = 0.0D;

      for(int var10000 = var6 = var6; var10000 < var7; var10000 = var6) {
         <undefinedtype> var11;
         if (!(var11 = (<undefinedtype>)this.xh.get(var6)).f().equals("") && (var5 >>> var6 & --1) != (3 & 5) && var11.d(var2)) {
            if (var1 == --1) {
               return var6;
            }

            double var12;
            if (!((var12 = var11.c()) > var3) && (var8 == -4 >> 2 || !(var9 > var12))) {
               var8 = var6;
               var9 = var12;
            }
         }

         ++var6;
      }

      return var8;
   }

   public void pr(String var1) {
      int var10005 = 3 & 4;
      this.gv = 3 ^ 3;
      this.zn = null;
      this.zm = null;
      this.co = null;
      this.nc = null;
      this.bn = var10005;
      this.az.setText("运行");
      this.zl.setVisible((boolean)(5 >> 3));
      this.po(var1);
   }

   public void ps(String var1) {
      if (this.gv == 3 >> 1) {
         if (var1 != null && !var1.equals("")) {
            if (this.zp.fa().getText().equals("孩子雕琢")) {
               int var2 = 0;
               String[] var10 = var1.split("&");

               int var3;
               for(int var10000 = var3 = 1 ^ 3; var10000 < var10.length; var10000 = var3) {
                  int var4;
                  if ((var4 = var10[var3].indexOf("=")) != -4 >> 2) {
                     String var5;
                     if ((var5 = var10[var3].substring(3 ^ 3, var4)).equals("特技")) {
                        String[] var11 = var10[var3].split("=");

                        int var7;
                        for(var10000 = var7 = 3 >> 1; var10000 < var11.length; var10000 = var7) {
                           int var9;
                           Skill var12;
                           if ((var12 = this.vc().bf(var11[var7])) != null && (var9 = this.pq(--1, var12.getSkillname(), 0.0D, var2, --4, 79 & 54)) != -4 >> 2) {
                              var2 |= 3 >> 1 << var9;
                           }

                           ++var7;
                        }
                     } else {
                        double var6 = QualityZW.getDouble(var10[var3].substring(var4 + (2 ^ 3)));
                        int var8;
                        if ((var8 = this.pq(3 & 4, var5, var6, var2, 3 & 4, --4)) != -4 >> 2) {
                           var2 |= --1 << var8;
                        }
                     }
                  }

                  ++var3;
               }

               if (this.pw(var2, 3 ^ 3, 79 & 54)) {
                  this.pr("雕琢成功");
               } else {
                  this.nc = "孩子雕琢";
               }
            }
         }
      }
   }

   public void pt(String var1) {
      if (this.gv == (3 & 5)) {
         if (var1 != null && !var1.equals("")) {
            if (this.zp.fa().getText().equals("炼化")) {
               int var2 = 0;
               String[] var10 = var1.split("&");

               int var3;
               for(int var10000 = var3 = --1; var10000 < var10.length; var10000 = var3) {
                  int var4;
                  if ((var4 = var10[var3].indexOf("=")) != -4 >> 2) {
                     String var5;
                     if ((var5 = var10[var3].substring(3 ^ 3, var4)).equals("特技")) {
                        String[] var11 = var10[var3].split("=");

                        int var7;
                        for(var10000 = var7 = --1; var10000 < var11.length; var10000 = var7) {
                           int var9;
                           Skill var12;
                           if ((var12 = this.vc().bf(var11[var7])) != null && (var9 = this.pq(3 >> 1, var12.getSkillname(), 0.0D, var2, --4, 111 & 22)) != -4 >> 2) {
                              var2 |= --1 << var9;
                           }

                           ++var7;
                        }
                     } else {
                        double var6 = QualityZW.getDouble(var10[var3].substring(var4 + (2 ^ 3)));
                        int var8;
                        if ((var8 = this.pq(2 & 5, var5, var6, var2, 3 >> 2, --4)) != -4 >> 2) {
                           var2 |= 3 >> 1 << var8;
                        }
                     }
                  }

                  ++var3;
               }

               if (this.pw(var2, 3 & 4, 22 & 111)) {
                  this.pr("炼化成功");
               } else {
                  this.nc = "炼化";
               }
            }
         }
      }
   }

   public String pu(boolean var1) {
      Class605 var17;
      label343: {
         String var2;
         Class595 var3;
         Class250 var4;
         String var5;
         if ((var2 = this.zp.fa().getText()).equals(this.zo[3 & 4])) {
            if ((var3 = (Class595)this.ve().m(125 & 63)) == null || var3.e() != 0) {
               return "操作界面未打开";
            }

            if (!(var5 = (var4 = var3.zl()).yo()).equals("炼化装备") && !var5.equals("炼化仙器") && !var5.equals("炼化神兵")) {
               return "请选择材料";
            }

            if (this.ve().m(47 & 91) == null) {
               return "先打开替换界面进行属性锁定";
            }

            if (var1 && this.ve().m(95 & 43) == null) {
               return "先打开替换界面进行属性锁定";
            }

            if (this.ve().m(75 & 63) == null) {
               return "操作界面已关闭";
            }

            if (!var4.ij((boolean)(5 >> 3))) {
               return "材料不足";
            }
         } else {
            Class250 var10000;
            if (var2.equals(this.zo[3 >> 1])) {
               if ((var3 = (Class595)this.ve().m(125 & 63)) == null || var3.e() != (1 ^ 3)) {
                  return "操作界面未打开";
               }

               if (!(var5 = (var4 = var3.zl()).yo()).equals("炼器") && !var5.equals("保留炼器")) {
                  return "请选择材料";
               }

               if (var1 && this.ve().m(59 & 79) == null) {
                  return "先打开替换界面进行属性锁定";
               }

               if (this.ve().m(123 & 15) == null) {
                  return "操作界面已关闭";
               }

               if (this.zn == null) {
                  this.zn = var5;
                  var10000 = var4;
               } else {
                  if (!this.zn.equals(var5)) {
                     return "材料不足";
                  }

                  var10000 = var4;
               }

               if (!var10000.ij(false)) {
                  return "材料不足";
               }
            } else if (!var2.equals(this.zo[--2]) && !var2.equals(this.zo[--3])) {
               if (var2.equals(this.zo[--4])) {
                  if ((var3 = (Class595)this.ve().m(63 & 125)) == null || var3.e() != --1) {
                     return "操作界面未打开";
                  }

                  Goodstable[] var6;
                  Goodstable var15;
                  label333: {
                     var4 = var3.zl();
                     if (!var1) {
                        Goodstable var12;
                        if (this.uw().gameType == 5 >> 1) {
                           if (this.zm == null) {
                              return "出现异常";
                           }

                           if (this.pp(var12 = this.vd().getGood(this.zm.getRgid()))) {
                              return "配饰重铸完成";
                           }

                           var10000 = var4;
                           var4.av(var12);
                           break label333;
                        }

                        if (this.zm == null) {
                           return "出现异常";
                        }

                        if ((var12 = this.vd().getGood(this.zm.getRgid())) == null || var12 == this.zm) {
                           return null;
                        }

                        if (this.pp(var12)) {
                           return "配饰重铸完成";
                        }

                        var6 = var4.yu();

                        int var7;
                        for(int var16 = var7 = 3 >> 2; var16 < var6.length; var16 = var7) {
                           if (var6[var7] != null && (var7 != --1 || this.co.compareTo(var6[var7].getGoodsid()) != 0)) {
                              var4.ew(var12, var7);
                           }

                           ++var7;
                        }

                        int var10001 = 3 >> 1;
                        var4.ew(var12, 3 ^ 3);
                        if (!var4.au(var10001) && (var15 = this.vd().bc(this.co)) != null) {
                           var4.ew(var15, 3 >> 1);
                        }
                     }

                     var10000 = var4;
                  }

                  if (!(var5 = var10000.yo()).equals("佩饰重铸")) {
                     return "请选择材料";
                  }

                  var6 = var4.yu();
                  var15 = null;
                  BigDecimal var8 = null;
                  if (var1) {
                     var15 = var6[5 >> 3];
                     var8 = var6[3 >> 1].getGoodsid();
                  }

                  if (!var4.zb(var6, var4.ez(), var5, (boolean)(2 & 5))) {
                     return "材料不足";
                  }

                  if (var1) {
                     var17 = this;
                     int var10004 = 3 ^ 3;
                     this.zm = var15;
                     this.co = var8;
                     this.bn = var10004;
                     this.nc = this.zo[--4];
                     break label343;
                  }
               } else {
                  Class185 var10;
                  if (var2.equals(this.zo[--5])) {
                     if ((var10 = (Class185)this.ve().m(127 & 91)) == null || var10.e() != 5 >> 2 || var10.ov() != --1) {
                        return "操作界面未打开";
                     }

                     if (!var10.bl()) {
                        return "请选择材料";
                     }
                  } else if (var2.equals(this.zo[30 & 103])) {
                     if ((var3 = (Class595)this.ve().m(125 & 63)) == null || var3.e() != (2 ^ 3)) {
                        return "操作界面未打开";
                     }

                     if (!(var4 = var3.zl()).yo().equals("配饰点粹")) {
                        return "请选择材料";
                     }

                     if (this.ve().m(11 & 127) == null) {
                        return "先打开替换界面进行属性锁定";
                     }

                     if (!var4.ij((boolean)(3 ^ 3))) {
                        return "材料不足";
                     }
                  } else if (var2.equals(this.zo[39 & 95])) {
                     if ((var3 = (Class595)this.ve().m(61 & 127)) == null || var3.e() != --1) {
                        return "操作界面未打开";
                     }

                     if (!(var4 = var3.zl()).yo().equals("配饰粹炼")) {
                        return "请选择材料";
                     }

                     if (this.ve().m(11) == null) {
                        return "先打开替换界面进行属性锁定";
                     }

                     if (!var4.ij(false)) {
                        return "材料不足";
                     }
                  } else {
                     Class660 var11;
                     if (var2.equals(this.zo[8])) {
                        if ((var11 = (Class660)this.ve().m(166)) == null || var11.e() != 1) {
                           return "操作界面未打开";
                        }

                        if (this.ve().m(11) == null) {
                           return "先打开替换界面进行属性锁定";
                        }

                        if (!var11.bl()) {
                           return "材料不足";
                        }
                     } else if (var2.equals(this.zo[9])) {
                        if ((var11 = (Class660)this.ve().m(166)) == null || var11.e() != 0) {
                           return "操作界面未打开";
                        }

                        if (this.ve().m(11) == null) {
                           return "先打开替换界面进行属性锁定";
                        }

                        if (!var11.bl()) {
                           return "材料不足";
                        }
                     } else if (var2.equals(this.zo[10])) {
                        Class428 var13;
                        if ((var13 = (Class428)this.ve().m(175)) == null || var13.e() != 5 >> 1) {
                           return "需要点击开始附灵按钮弹出附灵面板";
                        }

                        if (var13.bl() && (Class280.l() - var13.gl()) / 160L < 6L) {
                           this.nc = this.zo[10];
                           return null;
                        }

                        if (!var13.aeb(323, true)) {
                           return "材料不足";
                        }
                     } else if (var2.equals(this.zo[11])) {
                        Class86 var14;
                        if ((var14 = (Class86)this.aej.getFormManagement().m(74)) == null) {
                           return "操作界面未打开";
                        }

                        if (!var14.au(20)) {
                           return "材料不足";
                        }
                     } else {
                        if (!var2.equals(this.zo[12])) {
                           return "异常公式";
                        }

                        if ((var10 = (Class185)this.ve().m(91)) == null || var10.e() != 1 || var10.ov() != 0) {
                           return "操作界面未打开";
                        }

                        if (!var10.bl()) {
                           return "请选择材料";
                        }
                     }
                  }
               }
            } else {
               Class95 var9;
               if ((var9 = (Class95)this.ve().m(127 & 95)) == null || var9.ov() != (2 ^ 3) || var9.ot() != --2) {
                  return "操作界面未打开";
               }

               if (var9.e() != (var2.equals(this.zo[--2]) ? 2 & 5 : 1)) {
                  return "操作界面未打开";
               }

               if (!var1 && this.ve().m(95 & 43) == null) {
                  return "操作界面已关闭";
               }

               if (!var9.bl()) {
                  return "请选择材料";
               }
            }
         }

         var17 = this;
      }

      ++var17.gc;
      if (!var1) {
         this.po((String)null);
      }

      return null;
   }

   public <undefinedtype> pv(int var1, String var2, int var3) {
      ((<undefinedtype>)this.xh.get(var1)).e(var2, 125 & 54, (123 & 94) + var1 * (30 & 119), var3);
      return null;
   }

   public boolean pw(int var1, int var2, int var3) {
      for(int var10000 = var2 = var2; var10000 < var3; var10000 = var2) {
         if (!((<undefinedtype>)this.xh.get(var2)).f().equals("") && (var1 >>> var2 & --1) != --1) {
            return (boolean)(5 >> 3);
         }

         ++var2;
      }

      return (boolean)(3 >> 1);
   }

   public void px(String var1) {
      if (this.gv == 5 >> 2) {
         if (var1 != null && !var1.equals("")) {
            if (this.zp.fa().getText().equals("孩子重铸")) {
               int var2 = 0;
               String[] var8 = var1.split("\\|");

               int var3;
               for(int var10000 = var3 = 1 ^ 3; var10000 < var8.length; var10000 = var3) {
                  int var4;
                  if ((var4 = var8[var3].indexOf("=")) != -4 >> 2) {
                     String var5 = var8[var3].substring(5 >> 3, var4);
                     double var6 = QualityZW.getDouble(var8[var3].substring(var4 + --1));
                     if ((var4 = this.pq(3 ^ 3, var5, var6, var2, 3 >> 2, --4)) != -4 >> 2) {
                        var2 |= (2 ^ 3) << var4;
                     }
                  }

                  ++var3;
               }

               if (this.pw(var2, 3 ^ 3, --4)) {
                  this.pr("重铸成功");
               } else {
                  this.nc = "孩子重铸";
               }
            }
         }
      }
   }

   public void py(String var1, boolean var2) {
      if (this.gv == --1) {
         if (var1 != null && !var1.equals("")) {
            String var4 = var2 ? "配饰点粹" : "配饰粹炼";
            if (this.zp.fa().getText().equals(var4)) {
               int var3;
               Class605 var19;
               label97: {
                  var3 = 0;
                  String[] var14 = var1.split("&");
                  double var5 = 1.0D;
                  int var7;
                  int var8 = (var7 = Integer.parseInt(var14[--1])) >> --5 & 63 & 95;
                  var7 &= 127 & 31;
                  int var15;
                  if (var2) {
                     int var10000;
                     for(var10000 = var15 = --4; var10000 < var14.length; var10000 = var15) {
                        Skill var9;
                        if (var14[var15].startsWith("特技=") && (var9 = this.vc().bf(var14[var15].substring(--3))) != null) {
                           int var10;
                           if ((var10 = Integer.parseInt(var9.getSkillid())) == (16313 & 24575)) {
                              var5 += 0.15D;
                              var19 = this;
                           } else {
                              if (var10 == (8127 & 32762)) {
                                 var5 += 0.25D;
                              }

                              var19 = this;
                           }

                           int var11;
                           if ((var11 = var19.pq(1, var9.getSkillname(), 0.0D, var3, 5 >> 1, --3)) != -4 >> 2) {
                              var3 |= 3 >> 1 << var11;
                           }
                        }

                        ++var15;
                     }

                     for(var10000 = var15 = 5 >> 1; var10000 < 4; var10000 = var15) {
                        if (var15 >= var14.length) {
                           var19 = this;
                           break label97;
                        }

                        int var16;
                        if (!var14[var15].startsWith("特技=") && (var16 = var14[var15].indexOf("=")) != -4 >> 2) {
                           String var17 = var14[var15].substring(3 >> 2, var16);
                           var16 = var14[var15].indexOf("#", var17.length() + (5 >> 2));
                           double var18 = BaseEquip.getDouble(var14[var15].substring(var17.length() + (4 ^ 5), var16)) * (double)(var15 == 5 >> 1 ? var8 : var7) + BaseEquip.getDouble(var14[var15].substring(var16 + (5 >> 2)));
                           if (var5 != 1.0D) {
                              var18 *= var5;
                           }

                           int var13;
                           if ((var13 = this.pq(5 >> 3, var17, var18, var3, 5 >> 3, --2)) != -4 >> 2) {
                              var3 |= (3 & 5) << var13;
                           }
                        }

                        ++var15;
                     }
                  } else {
                     if ((var15 = this.pq(3 >> 2, "总点粹值", (double)(var8 + var7), var3, 3 >> 2, --1)) != -4 >> 2) {
                        var3 |= --1 << var15;
                     }

                     if ((var15 = this.pq(3 ^ 3, "点粹值", (double)var8, var3, 3 & 5, 1 ^ 3)) != -4 >> 2) {
                        var3 |= 3 >> 1 << var15;
                     }

                     if ((var15 = this.pq(3 & 4, "点粹值", (double)var7, var3, --2, --3)) != -1) {
                        var3 |= --1 << var15;
                     }
                  }

                  var19 = this;
               }

               if (var19.pw(var3, 3 >> 2, 3)) {
                  this.pr(var4 + "成功");
               } else {
                  this.nc = var4;
               }
            }
         }
      }
   }

   public void la(String var1) {
      if (this.gv == (4 ^ 5)) {
         if (this.zp.fa().getText().equals("觉醒技重洗")) {
            int var2 = 0;
            if (var1 != null && !var1.equals("")) {
               String[] var5 = var1.split("&");
               int var3;
               Skill var4;
               if ((var4 = this.vc().bf(var5[3 & 5])) != null && (var3 = this.pq(3 & 5, var4.getSkillname(), 0.0D, var2, 3 & 4, 2 ^ 3)) != -4 >> 2) {
                  var2 |= 3 >> 1 << var3;
               }

               if ((var3 = this.pq(3 >> 2, "星级", QualityZW.getDouble(var5[--2]), var2, 2 ^ 3, 1 ^ 3)) != -4 >> 2) {
                  var2 |= (4 ^ 5) << var3;
               }
            }

            if (this.pw(var2, 2 & 5, --2)) {
               this.pr("觉醒技重洗成功");
            } else {
               this.nc = "觉醒技重洗";
            }
         }
      }
   }

   public void d() {
      if (this.bn == 0) {
         this.bn += 5 >> 2;
      } else if (this.nc != null && this.gv == (3 & 5)) {
         if (this.nc.equals(this.zo[--4])) {
            this.f(this.zo[--4]);
         } else if (this.nc.equals(this.zo[123 & 14])) {
            this.nc = null;
            this.f(this.zo[78 & 59]);
         } else {
            this.f(this.nc);
            this.nc = null;
         }
      }
   }

   public void lb(String var1) {
      if (this.gv == (3 & 5)) {
         if (var1 != null && !var1.equals("")) {
            if (this.zp.fa().getText().equals("套装洗练")) {
               int var5 = 0;
               int var6 = 3 >> 2;
               int var4 = 5 >> 3;

               int var2;
               for(int var10000 = var2 = 2 & 5; var10000 < var1.length(); var10000 = var2) {
                  if ((var2 = var1.indexOf("&", var4 + (2 ^ 3))) == -4 >> 2) {
                     var2 = var1.length();
                  }

                  if (var6 < --4) {
                     var10000 = var2;
                  } else {
                     label56: {
                        int var3;
                        if ((var3 = var1.indexOf("=", var4 + (4 ^ 5))) != -4 >> 2) {
                           if (var3 > var2) {
                              var10000 = var2;
                              break label56;
                           }

                           String var7 = var1.substring(var4, var3);
                           double var8 = Double.parseDouble(var1.substring(var3 + --1, var2));
                           if ((var3 = this.pq(5 >> 3, var7, var8, var5, 3 >> 2, 1 ^ 3)) != -4 >> 2) {
                              var5 |= (3 & 5) << var3;
                           }
                        }

                        var10000 = var2;
                     }
                  }

                  ++var6;
                  var4 = var10000 + 1;
               }

               if (this.pw(var5, 5 >> 3, 1 ^ 3)) {
                  this.pr("套装洗练成功");
               } else {
                  this.nc = "套装洗练";
               }
            }
         }
      }
   }

   public void f(String var1) {
      if (this.zp.fa().getText().equals(var1)) {
         if ((var1 = this.pu((boolean)(3 & 4))) != null) {
            this.pr(var1);
         }
      }
   }
}
