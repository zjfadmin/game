package com.xy;

import com.xy.game.GameUtil;
import com.xy.richtext.ChatBox;
import com.xy.richtext.ChatFileRandom;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.richtext.TextListFile;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class566 extends Class345 {
   private JComponent yz;
   private InputBean aif;
   private JLabel lj;
   private int br;
   private int gv;
   private int gc;
   private int gw;
   private Class436[] cs;
   private Class322[] aig;
   private LinkedList<RichLabel> aih;
   private int bn;
   String[] gh;
   private Class322[] adb;

   protected void fz(Graphics var1) {
      int var2;
      if ((var2 = this.gw) == -4 >> 2) {
         var2 = Math.min(Math.max(this.yz.getHeight() - this.br, 2 & 5), this.bn);
      }

      var2 -= this.bn;
      int var3 = 3 >> 2;
      var1.translate(2 & 5, var2);

      Iterator var5;
      for(Iterator var10000 = var5 = this.aih.iterator(); var10000.hasNext(); var10000 = var5) {
         RichLabel var4;
         RichLabel var6 = var4 = (RichLabel)var5.next();
         var1.translate(3 ^ 3, var3);
         var3 = var6.getHeight();
         if ((var2 += var3) >= 0) {
            var4.paint(var1);
         }

         if (var2 > this.bn) {
            return;
         }
      }

   }

   public boolean t() {
      this.yl(this.aih);
      return super.t();
   }


   private int yd(int var1, int var2, int var3) {
      return Math.min(Math.max(var1 - var3, 2 & 5), var2);
   }

   public void do(int var1) {
      if (var1 == (7163 & 25918)) {
         this.y(this.gc != -4 >> 2 ? this.gc : 0);
      } else if (var1 == (30139 & 2943)) {
         Class658.cy(23220 & 9707, this.aej);
      } else if (var1 == (18876 & 14207)) {
         this.cf(951 & 31966, this.yz.getHeight());
      } else {
         if (var1 == (21503 & 11581)) {
            this.cf(-150 & -1, this.yz.getHeight());
         }

      }
   }

   public void dp(int var1) {
      if (this.gc != var1) {
         if (this.gc != -4 >> 2) {
            this.aig[this.gc].setBounds(this.aig[this.gc].getX() - (78 & 55), this.aig[this.gc].getY(), 103 & 88, 29 & 123);
         }

         this.gc = var1;
         this.aig[this.gc].setBounds(this.aig[this.gc].getX() + (110 & 23), this.aig[this.gc].getY(), 95 & 96, 25 & 127);
      }

   }


   private InputBean yf(int var1, int var2) {
      int var3;
      if ((var3 = this.gw) == -4 >> 2) {
         var3 = Math.min(Math.max(this.yz.getHeight() - this.br, 3 & 4), this.bn);
      }

      var3 -= this.bn;
      int var4 = 3 & 4;

      RichLabel var5;
      Iterator var6;
      for(Iterator var10000 = var6 = this.aih.iterator(); var10000.hasNext() && (var5 = (RichLabel)var6.next()) != null; var10000 = var6) {
         var4 = var5.getHeight();
         if ((var3 += var4) >= 0 && var3 >= var2) {
            return var5.isMonitor(var1, var2 - (var3 - var4));
         }

         if (var3 > this.bn) {
            break;
         }
      }

      return null;
   }

   public void q() {
      this.y(this.gc != -4 >> 2 ? this.gc : 0);
      super.q();
   }

   public synchronized void yg(Class120 var1, StringBuffer var2, int var3, TextListFile var4, int var5) {
      if (var4 != null) {
         int var6 = var1.e();
         int var24;
         if (var4.points.size() == var5) {
            Iterator var16;
            Iterator var26 = var16 = var4.fileList.iterator();

            while(true) {
               label84:
               while(var26.hasNext()) {
                  String var27 = (String)var16.next();
                  var2.setLength(2 & 5);
                  RichLabel var19 = ChatBox.getTextList(var27, Class681.q, 7039 & 26056);

                  int var20;
                  for(var24 = var20 = 3 & 4; var24 < var19.sectionList.size(); var24 = var20) {
                     Object var22;
                     if ((var22 = var19.sectionList.get(var20)) instanceof String) {
                        var2.append(var22);
                     } else if (var22 instanceof InputBean) {
                        var2.append(((InputBean)var22).getName());
                     }

                     ++var20;
                  }

                  for(var24 = var20 = 3 ^ 3; var24 < var6; var24 = var20) {
                     String var23 = var1.tq(var20);
                     if (this.gh[var3].equals(var23)) {
                        var26 = var16;
                        this.aih.addLast(var19);
                        continue label84;
                     }

                     if (var2.indexOf(var23) != -4 >> 2) {
                        this.aih.addLast(var19);
                        var26 = var16;
                        continue label84;
                     }

                     ++var20;
                  }

                  var26 = var16;
                  ChatBox.removeTextList(var19);
               }

               return;
            }
         } else {
            try {
               Class136 var7 = (Class136)var4.points.get(var5);
               ChatFileRandom var8 = ChatBox.getChatFileRandom(var4.id, this.aej.roleData.getRoleId(), (boolean)(5 >> 3));
               byte[] var10000 = new byte[(int)var7.b];
               boolean var10002 = true;
               byte[] var9 = var10000;
               var8.read(var7.a, var9);
               var9 = Class97.a(var10000);
               String var10;
               if (!Class394.o(var10 = new String(var9, Class142.e))) {
                  byte var11 = 0;
                  int var13 = 2 & 5;

                  int var21;
                  for(var24 = var11; var24 != -1; var24 = var21) {
                     label120: {
                        var21 = var10.indexOf("\n", var13);
                        RichLabel var14 = null;
                        StringBuffer var25;
                        if (var21 != -4 >> 2) {
                           if (var13 + (5 >> 2) == var21) {
                              var24 = var21;
                              break label120;
                           }

                           var14 = ChatBox.getTextList(var10.substring(var13, var21), Class681.q, 16367 & 16728);
                           var25 = var2;
                        } else {
                           var14 = ChatBox.getTextList(var10.substring(var13), Class681.q, 11130 & 21965);
                           var25 = var2;
                        }

                        var25.setLength(0);

                        int var15;
                        for(var24 = var15 = 3 & 4; var24 < var14.sectionList.size(); var24 = var15) {
                           Object var17;
                           if ((var17 = var14.sectionList.get(var15)) instanceof String) {
                              var2.append(var17);
                           } else if (var17 instanceof InputBean) {
                              var2.append(((InputBean)var17).getName());
                           }

                           ++var15;
                        }

                        var24 = var15 = 5 >> 3;

                        while(true) {
                           if (var24 >= var6) {
                              var24 = var21;
                              ChatBox.removeTextList(var14);
                              break;
                           }

                           String var18 = var1.tq(var15);
                           if (this.gh[var3].equals(var18)) {
                              var24 = var21;
                              this.aih.addLast(var14);
                              break;
                           }

                           if (var2.indexOf(var18) != -4 >> 2) {
                              this.aih.addLast(var14);
                              var24 = var21;
                              break;
                           }

                           ++var15;
                           var24 = var15;
                        }
                     }

                     var13 = var24 + 1;
                  }

               }
            } catch (Exception var12) {
               var12.printStackTrace();
            }
         }
      }
   }


   private void d() {
      int var1 = 5 >> 3;
      int var4 = 3 >> 2;

      Iterator var2;
      for(Iterator var10000 = var2 = this.aih.iterator(); var10000.hasNext(); var10000 = var2) {
         ++var4;
         RichLabel var3 = (RichLabel)var2.next();
         if (var4 != this.aih.size()) {
            var1 += var3.getHeight();
         }
      }

      this.bn = var1;
      this.br = this.aih.size() > 0 ? ((RichLabel)this.aih.getLast()).getHeight() : 0;
   }

   public synchronized void yj(TextListFile var1, int var2) {
      if (var1 != null) {
         RichLabel var5;
         if (var1.points.size() != var2) {
            try {
               Class136 var4 = (Class136)var1.points.get(var2);
               ChatFileRandom var9 = ChatBox.getChatFileRandom(var1.id, this.aej.roleData.getRoleId(), (boolean)(3 ^ 3));
               byte[] var12 = new byte[(int)var4.b];
               boolean var10002 = true;
               byte[] var11 = var12;
               var9.read(var4.a, var11);
               var11 = Class97.a(var12);
               String var7;
               if (!Class394.o(var7 = new String(var11, Class142.e))) {
                  boolean var8 = false;
                  String var13 = var7;

                  int var10;
                  for(var10 = var7.length(); (var2 = var13.lastIndexOf("\n", var10 - (4 ^ 5))) != -4 >> 2; var13 = var7) {
                     int var14;
                     if (var2 + (3 & 5) == var10) {
                        var14 = var2;
                     } else {
                        var5 = ChatBox.getTextList(var7.substring(var2 + (4 ^ 5), var10), Class681.q, 5469 & 27626);
                        var14 = var2;
                        this.aih.addFirst(var5);
                     }

                     var10 = var14;
                  }

                  var5 = ChatBox.getTextList(var7.substring(3 ^ 3, var10), Class681.q, 18809 & 14286);
                  this.aih.addFirst(var5);
                  this.d();
               }
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         } else {
            Iterator var3;
            Iterator var10000 = var3 = var1.fileList.iterator();

            while(var10000.hasNext()) {
               var5 = ChatBox.getTextList((String)var3.next(), Class681.q, 25548 & 7547);
               var10000 = var3;
               this.aih.addLast(var5);
            }

            this.d();
         }
      }
   }

   public Class566(GameView var1) {
      int var10001 = 77 & 58;
      int var10003 = -4 >> 2;
      super(28863 & 4063, --2, Class345.aef, var1);
      this.gc = var10003;
      String[] var4 = new String[var10001];
      boolean var10 = true;
      var4[2 & 5] = "当前";
      var4[3 >> 1] = "队伍";
      var4[1 ^ 3] = "帮派";
      var4[--3] = "世界";
      var4[--4] = "传音";
      var4[--5] = "系统";
      var4[70 & 63] = "消息";
      var4[95 & 39] = "战斗";
      this.gh = var4;
      var10001 = --4;
      this.va(-4 >> 2, 3 ^ 3, 26086 & 7163, 24557 & 8695, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 84 & 111, 84 & 111, 84 & 111, 84 & 111, (boolean)(2 & 5)), "聊天记录");
      this.aih = new LinkedList();
      this.yz = new JComponent() {
         protected void paintComponent(Graphics var1) {
            super.paintComponent(var1);
            Class566.this.fz(var1);
         }
      };
      this.yz.setBounds(123 & 55, 111 & 62, 32582 & 511, 5038 & 28121);
      this.yz.addMouseWheelListener(new MouseWheelListener() {
         public void mouseWheelMoved(MouseWheelEvent var1) {
            Class566.this.cf(-var1.getWheelRotation() * (47 & 120), Class566.this.yz.getHeight());
         }
      });
      this.yz.addMouseListener(new MouseListener() {
         public void mousePressed(MouseEvent var1) {
            Class566.this.aif = Class566.this.yf(var1.getX(), var1.getY());
            if (Class566.this.aif != null) {
               Class566.this.aif.setM((boolean)(--1));
            }
         }

         public void mouseExited(MouseEvent var1) {
         }

         public void mouseReleased(MouseEvent var1) {
            if (Class566.this.aif != null) {
               GameUtil.d(Class566.this.aif, Class566.this.ux());
            }

         }

         public void mouseClicked(MouseEvent var1) {
         }

         public void mouseEntered(MouseEvent var1) {
         }
      });
      this.add(this.yz);
      this.lj = Class133.c(127 & 47, 121 & 31, 32767 & 350, 119 & 29, 3 & 4, Class681.c("#cFFFFFF"), Class681.ak);
      this.lj.setText("聊天记录查询");
      this.add(this.lj);
      Class322[] var6 = new Class322[var10001];
      var10 = true;
      this.adb = var6;

      int var2;
      Class322[] var3;
      Class566 var5;
      int var10000;
      int var10006;
      Font var10007;
      String var10009;
      Class566 var10010;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.adb.length; var10000 = var2) {
         if (var2 != 0 && var2 != (2 ^ 3)) {
            this.adb[var2] = new Class322(var2 == --2 ? "sc/e/47.png" : "sc/e/48.png", 1, 314 + var2, this);
            var10000 = var2;
         } else {
            var3 = this.adb;
            Class322 var7 = new Class322;
            String var10004 = var2 == 0 ? "sc/e/6.png" : "sc/e/69.png";
            var10006 = (8571 & 24510) + var2;
            var10007 = Class681.bm;
            if (var2 == 0) {
               var10009 = "刷新";
               var10010 = this;
            } else if (var2 == (2 ^ 3)) {
               var10009 = "关键词搜索";
               var10010 = this;
            } else {
               var10009 = "";
               var10010 = this;
            }

            var7.<init>(var10004, 1, var10006, var10007, (Color[])null, var10009, var10010);
            var3[var2] = var7;
            var10000 = var2;
         }

         if (var10000 == 0) {
            var5 = this;
            this.adb[var2].setBounds(350, 27, 34, 18);
            this.adb[var2].setOffsetTexts(Class681.am);
         } else if (var2 == --1) {
            var5 = this;
            this.adb[var2].setBounds(310, 447, 85, 18);
            this.adb[var2].setOffsetTexts(Class681.am);
         } else if (var2 == 5 >> 1) {
            var5 = this;
            this.adb[var2].setBounds(378, 45, 18, 18);
         } else {
            if (var2 == --3) {
               this.adb[var2].setBounds(378, 421, 18, 18);
            }

            var5 = this;
         }

         var5.add(this.adb[var2++]);
      }

      Class436[] var9 = new Class436[5 >> 1];
      var10 = true;
      this.cs = var9;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         this.add(this.cs[var2]);
         if (var2 == 0) {
            this.cs[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
            this.cs[var2].setBounds(47, 25, 350, 21);
         } else if (var2 == --1) {
            this.cs[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(2 & 5)));
            this.cs[var2].setBounds(47, 25, 350, 415);
         }

         ++var2;
      }

      var6 = new Class322[9];
      var10 = true;
      this.aig = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.aig.length; var10000 = var2) {
         var3 = this.aig;
         Class322 var8 = new Class322;
         int var10005 = --1;
         var10006 = 320 + var2;
         var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         if (var2 == 0) {
            var10009 = "当前";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "世界";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "队伍";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "帮派";
            var10010 = this;
         } else if (var2 == 4) {
            var10009 = "战斗";
            var10010 = this;
         } else if (var2 == 5) {
            var10009 = "系统";
            var10010 = this;
         } else if (var2 == 6) {
            var10009 = "信息";
            var10010 = this;
         } else if (var2 == 7) {
            var10009 = "传音";
            var10010 = this;
         } else if (var2 == 8) {
            var10009 = "搜索";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var8.<init>("sc/e/7.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var8;
         if (var2 <= 6) {
            var5 = this;
            this.aig[var2].setBounds(393, 38 + var2 * 30, 64, 25);
         } else if (var2 == 7) {
            var5 = this;
            this.aig[var2].setBounds(393, 368, 64, 25);
         } else {
            if (var2 == 8) {
               this.aig[var2].setBounds(393, 398, 64, 25);
            }

            var5 = this;
         }

         var5.add(this.aig[var2++]);
      }

   }

   public void as(int var1) {
      this.dp(var1);
      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      } else {
         this.y(var1 != -4 >> 2 ? var1 : 0);
      }
   }

   public void yl(LinkedList<RichLabel> var1) {
      if (var1 != null) {
         Iterator var2;
         for(Iterator var10000 = var2 = var1.iterator(); var10000.hasNext(); var10000 = var2) {
            ChatBox.removeTextList((RichLabel)var2.next());
         }

         var1.clear();
      }
   }

   public void cf(int var1, int var2) {
      if (this.gw == -4 >> 2 && var2 > 0) {
         this.gw = this.yd(var2, this.bn, this.br);
      }

      this.gw = Math.max(Math.min(this.gw + var1, this.bn), 3 & 4);
      if (this.gw >= this.bn && this.gv > 0) {
         Class566 var10000;
         if ((var1 = this.gc) == --1) {
            var1 = --3;
            var10000 = this;
         } else if (var1 == 5 >> 1) {
            var1 = 3 & 5;
            var10000 = this;
         } else if (var1 == --3) {
            var1 = 5 >> 1;
            var10000 = this;
         } else {
            if (var1 == --4) {
               var1 = 95 & 40;
            }

            var10000 = this;
         }

         TextListFile var10001 = var10000.aej.chatBox.getTextListFile(var1);
         this.gv -= 3 >> 1;
         this.yj(var10001, this.gv);
      }

   }

   public void y(int var1) {
      this.dp(var1);
      LinkedList var10 = null;
      if (this.aih.size() != 0) {
         var10 = this.aih;
         this.aih = new LinkedList();
      }

      Class566 var13;
      int var10002;
      int var10004;
      if (this.gc == (60 & 75)) {
         var10002 = 3 & 4;
         var10004 = 3 & 4;
         int var10006 = -4 >> 2;
         this.gv = 3 >> 2;
         this.gw = var10006;
         this.bn = var10004;
         this.br = var10002;
         Class120 var2;
         int var6;
         StringBuffer var4 = (var6 = (var2 = (Class120)this.ve().e(15075 & 17852)).e()) != 0 ? new StringBuffer() : null;
         int var5 = var6 != 0 ? 5 >> 3 : 9999;

         for(int var10000 = var5; var10000 < 8; var10000 = var5) {
            int var3 = 0;
            if (var5 == 0) {
               var3 = --5;
               var13 = this;
            } else if (var5 == 5 >> 2) {
               var3 = 62 & 71;
               var13 = this;
            } else if (var5 == 5 >> 1) {
               var3 = 39 & 95;
               var13 = this;
            } else if (var5 == --3) {
               var3 = 3 & 4;
               var13 = this;
            } else if (var5 == --4) {
               var3 = 5 >> 1;
               var13 = this;
            } else if (var5 == --5) {
               var3 = --1;
               var13 = this;
            } else if (var5 == (102 & 31)) {
               var3 = --4;
               var13 = this;
            } else {
               if (var5 == (7 & 127)) {
                  var3 = --3;
               }

               var13 = this;
            }

            TextListFile var7;
            if ((var7 = var13.aej.chatBox.getTextListFile(var3)) != null) {
               int var8 = 0;
               int var9 = var7.points.size();

               for(var10000 = var8; var10000 <= var9; var10000 = var8) {
                  this.yg(var2, var4, var3, var7, var8++);
               }
            }

            ++var5;
         }

         var13 = this;
         this.d();
      } else {
         int var11;
         if ((var11 = this.gc) == (3 & 5)) {
            var11 = --3;
            var13 = this;
         } else if (var11 == --2) {
            var11 = 3 & 5;
            var13 = this;
         } else if (var11 == --3) {
            var11 = 5 >> 1;
            var13 = this;
         } else if (var11 == --4) {
            var11 = 15 & 119;
            var13 = this;
         } else {
            if (var11 == (23 & 111)) {
               var11 = --4;
            }

            var13 = this;
         }

         var13.gv = 0;
         var10002 = 3 ^ 3;
         var10004 = 5 >> 3;
         this.gw = -4 >> 2;
         this.bn = var10004;
         this.br = var10002;
         TextListFile var12;
         if ((var12 = this.aej.chatBox.getTextListFile(var11)) != null) {
            this.gv = var12.points.size();
            this.yj(var12, this.gv);
         }

         if (var12 != null && this.gv > 0 && this.bn < this.yz.getHeight()) {
            this.gv -= 5 >> 2;
            this.yj(var12, this.gv);
         }

         var13 = this;
      }

      var13.yl(var10);
   }
}
