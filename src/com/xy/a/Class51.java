package com.xy.a;

import com.xy.richtext.ChatBox;
import com.xy.richtext.ChatFileRandom;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.richtext.TextListFile;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class51 extends com.xy.q.Class30 {
   private JLabel da;
   private int ia;
   private LinkedList<RichLabel> xm;
   private int gz = -1;
   private int z;
   private com.xy.i.Class18[] jj;
   private com.xy.w.Class18[] sk;
   String[] xn;
   private int cb;
   private int ae;
   private InputBean xo;
   private com.xy.i.Class18[] qh;
   private JComponent xp;

   @Override
   public boolean ah() {
      this.si(this.xm);
      return super.ah();
   }

   public synchronized void sf(TextListFile var1, int var2) {
      if (var1 != null) {
         if (var1.points.size() != var2) {
            try {
               com.xy.v.Class24 var3 = var1.points.get(var2);
               ChatFileRandom var11 = ChatBox.getChatFileRandom(var1.id, this.afx.roleData.getRoleId(), false);
               byte[] var12;
               byte[] var16 = var12 = new byte[(int)var3.a];
               var11.read(var3.b, var12);
               var12 = com.xy.v.Class15.b(var16);
               String var6;
               if (!com.xy.v.Class12.h(var6 = new String(var12, com.xy.v.Class23.c))) {
                  int var7 = 0;
                  String var17 = var6;

                  int var8;
                  for (var8 = var6.length(); (var7 = var17.lastIndexOf("\n", var8 - 1)) != -1; var17 = var6) {
                     int var18;
                     if (var7 + 1 == var8) {
                        var18 = var7;
                     } else {
                        RichLabel var9 = ChatBox.getTextList(var6.substring(var7 + 1, var8), com.xy.q.Class49.w, 328);
                        var18 = var7;
                        this.xm.addFirst(var9);
                     }

                     var8 = var18;
                  }

                  RichLabel var15 = ChatBox.getTextList(var6.substring(0, var8), com.xy.q.Class49.w, 328);
                  this.xm.addFirst(var15);
                  this.h();
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         } else {
            Iterator var4;
            Iterator var10000 = var4 = var1.fileList.iterator();

            while (var10000.hasNext()) {
               RichLabel var5 = ChatBox.getTextList((String)var4.next(), com.xy.q.Class49.w, 328);
               var10000 = var4;
               this.xm.addLast(var5);
            }

            this.h();
         }
      }
   }

   public void cc(int var1, int var2) {
      if (this.ia == -1 && var2 > 0) {
         this.ia = this.sn(var2, this.ae, this.cb);
      }

      this.ia = Math.max(Math.min(this.ia + var1, this.ae), 0);
      if (this.ia >= this.ae && this.z > 0) {
         int var3 = this.gz;
         Class51 var10000;
         if (this.gz == 1) {
            var3 = 3;
            var10000 = this;
         } else if (var3 == 2) {
            var3 = 1;
            var10000 = this;
         } else if (var3 == 3) {
            var3 = 2;
            var10000 = this;
         } else {
            if (var3 == 4) {
               var3 = 8;
            }

            var10000 = this;
         }

         TextListFile var10001 = var10000.afx.chatBox.getTextListFile(var3);
         this.z--;
         this.sf(var10001, this.z);
      }
   }

   // $VF: synthetic method
   static InputBean sg(Class51 var0, int var1, int var2) {
      return var0.sh(var1, var2);
   }

   public Class51(GameView var1) {
      super(159, 2, com.xy.q.Class30.afz, var1);
      String[] var10001 = new String[8];
      String var10004 = "弄剘";
      var10001[0] = "当前";
      var10004 = "阐伛";
      var10001[1] = "队伍";
      var10004 = "幹洫";
      var10001[2] = "帮派";
      var10004 = "丙畚";
      var10001[3] = "世界";
      var10004 = "佷韦";
      var10001[4] = "传音";
      var10004 = "糴绉";
      var10001[5] = "系统";
      var10004 = "淟恺";
      var10001[6] = "消息";
      var10004 = "戗斁";
      var10001[7] = "战斗";
      this.xn = var10001;
      String var10009 = "$vxqx$ye9r";
      this.yy(-1, 0, 482, 485, com.xy.q.Class30.agh);
      com.xy.w.Class9 var37 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "聅夿访彃";
      this.yu(var37, "聊天记录");
      this.xm = new LinkedList<>();
      this.xp = new Class109(this);
      this.xp.setBounds(51, 46, 326, 392);
      this.xp.addMouseWheelListener(new Class67(this));
      this.xp.addMouseListener(new Class21(this));
      this.add(this.xp);
      String var10012 = "tv\u0011S\u0011S\u0011S";
      this.da = com.xy.q.Class1.f(47, 25, 350, 21, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
      String var10006 = "聅夿访彃柪说";
      this.da.setText("聊天记录查询");
      this.add(this.da);
      this.jj = new com.xy.i.Class18[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.jj.length; var10000 = var2) {
         if (var2 != 0 && var2 != 1) {
            com.xy.i.Class18[] var7 = this.jj;
            if (var2 == 2) {
               var10004 = "f4:2:c\"ye9r";
               var10004 = "sc/e/47.png";
            } else {
               var10004 = "el9j9;.!faq";
               var10004 = "sc/e/48.png";
            }

            com.xy.i.Class18 var14 = new com.xy.i.Class18(var10004, 1, 314 + var2, this);
            var7[var2] = var14;
            var10000 = var2;
         } else {
            com.xy.i.Class18[] var5 = this.jj;
            if (var2 == 0) {
               var10004 = "$vxpx#ye9r";
               var10004 = "sc/e/6.png";
            } else {
               var10004 = "el9j99/!faq";
               var10004 = "sc/e/69.png";
            }

            int var35 = 314 + var2;
            Class51 var51;
            if (var2 == 0) {
               var10009 = "剠斥";
               var10009 = "刷新";
               var51 = this;
            } else if (var2 == 1) {
               var10009 = "入锡诛搓紴";
               var10009 = "关键词搜索";
               var51 = this;
            } else {
               var10009 = "";
               var51 = this;
            }

            com.xy.i.Class18 var13 = new com.xy.i.Class18(var10004, 1, var35, com.xy.q.Class49.bz, null, var10009, var51);
            var5[var2] = var13;
            var10000 = var2;
         }

         Class51 var8;
         if (var10000 == 0) {
            var8 = this;
            this.jj[var2].setBounds(350, 27, 34, 18);
            this.jj[var2].setOffsetTexts(com.xy.q.Class49.ag);
         } else if (var2 == 1) {
            var8 = this;
            this.jj[var2].setBounds(310, 447, 85, 18);
            this.jj[var2].setOffsetTexts(com.xy.q.Class49.ag);
         } else if (var2 == 2) {
            var8 = this;
            this.jj[var2].setBounds(378, 45, 18, 18);
         } else {
            if (var2 == 3) {
               this.jj[var2].setBounds(378, 421, 18, 18);
            }

            var8 = this;
         }

         var8.add(this.jj[var2++]);
      }

      this.sk = new com.xy.w.Class18[2];

      for (int var9 = var2 = 0; var9 < this.sk.length; var9 = ++var2) {
         this.sk[var2] = new com.xy.w.Class18();
         this.add(this.sk[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var15 = this.sk[var2];
            String var17 = "f4:3:e ye9r";
            var15.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.sk[var2].setBounds(47, 25, 350, 21);
         } else if (var2 == 1) {
            com.xy.w.Class18 var16 = this.sk[var2];
            String var18 = "el9k9=\"!faq";
            var16.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.sk[var2].setBounds(47, 25, 350, 415);
         }
      }

      this.qh = new com.xy.i.Class18[9];

      for (int var10 = var2 = 0; var10 < this.qh.length; var10 = var2) {
         com.xy.i.Class18[] var11 = this.qh;
         var10004 = "$vxpx\"ye9r";
         int var36 = 320 + var2;
         Class51 var52;
         if (var2 == 0) {
            var10009 = "彜剛";
            var10009 = "当前";
            var52 = this;
         } else if (var2 == 1) {
            var10009 = "乁留";
            var10009 = "世界";
            var52 = this;
         } else if (var2 == 2) {
            var10009 = "阐伛";
            var10009 = "队伍";
            var52 = this;
         } else if (var2 == 3) {
            var10009 = "幹洫";
            var10009 = "帮派";
            var52 = this;
         } else if (var2 == 4) {
            var10009 = "戗斁";
            var10009 = "战斗";
            var52 = this;
         } else if (var2 == 5) {
            var10009 = "粬绊";
            var10009 = "系统";
            var52 = this;
         } else if (var2 == 6) {
            var10009 = "修恹";
            var10009 = "信息";
            var52 = this;
         } else if (var2 == 7) {
            var10009 = "佷韦";
            var10009 = "传音";
            var52 = this;
         } else if (var2 == 8) {
            var10009 = "搓紴";
            var10009 = "搜索";
            var52 = this;
         } else {
            var10009 = "";
            var52 = this;
         }

         com.xy.i.Class18 var19 = new com.xy.i.Class18("sc/e/7.png", 1, var36, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var10009, var52);
         var11[var2] = var19;
         Class51 var12;
         if (var2 <= 6) {
            var12 = this;
            this.qh[var2].setBounds(393, 38 + var2 * 30, 64, 25);
         } else if (var2 == 7) {
            var12 = this;
            this.qh[var2].setBounds(393, 368, 64, 25);
         } else {
            if (var2 == 8) {
               this.qh[var2].setBounds(393, 398, 64, 25);
            }

            var12 = this;
         }

         var12.add(this.qh[var2++]);
      }
   }

   // $VF: synthetic method
   private void h() {
      int var1 = 0;
      int var2 = 0;

      Iterator var4;
      for (Iterator var10000 = var4 = this.xm.iterator(); var10000.hasNext(); var10000 = var4) {
         var2++;
         RichLabel var3 = (RichLabel)var4.next();
         if (var2 != this.xm.size()) {
            var1 += var3.getHeight();
         }
      }

      this.ae = var1;
      this.cb = this.xm.size() > 0 ? this.xm.getLast().getHeight() : 0;
   }

   public void lm(int var1) {
      this.g(var1);
      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      } else {
         this.bi(var1 != -1 ? var1 : 0);
      }
   }

   protected void dn(Graphics var1) {
      int var2 = this.ia;
      if (this.ia == -1) {
         var2 = Math.min(Math.max(this.xp.getHeight() - this.cb, 0), this.ae);
      }

      var2 -= this.ae;
      int var3 = 0;
      var1.translate(0, var2);

      Iterator var5;
      for (Iterator var10000 = var5 = this.xm.iterator(); var10000.hasNext(); var10000 = var5) {
         RichLabel var4;
         RichLabel var7 = var4 = (RichLabel)var5.next();
         var1.translate(0, var3);
         var3 = var7.getHeight();
         if ((var2 += var3) >= 0) {
            var4.paint(var1);
         }

         if (var2 > this.ae) {
            return;
         }
      }
   }

   // $VF: synthetic method
   private InputBean sh(int var1, int var2) {
      int var3 = this.ia;
      if (this.ia == -1) {
         var3 = Math.min(Math.max(this.xp.getHeight() - this.cb, 0), this.ae);
      }

      var3 -= this.ae;
      int var4 = 0;

      RichLabel var5;
      Iterator var6;
      for (Iterator var10000 = var6 = this.xm.iterator(); var10000.hasNext() && (var5 = (RichLabel)var6.next()) != null; var10000 = var6) {
         var4 = var5.getHeight();
         if ((var3 += var4) >= 0 && var3 >= var2) {
            return var5.isMonitor(var1, var2 - (var3 - var4));
         }

         if (var3 > this.ae) {
            break;
         }
      }

      return null;
   }

   public void si(LinkedList<RichLabel> var1) {
      if (var1 != null) {
         Iterator var3;
         for (Iterator var10000 = var3 = var1.iterator(); var10000.hasNext(); var10000 = var3) {
            ChatBox.removeTextList((RichLabel)var3.next());
         }

         var1.clear();
      }
   }

   public synchronized void sj(Class56 var1, StringBuffer var2, int var3, TextListFile var4, int var5) {
      if (var4 != null) {
         int var6 = var1.dx();
         if (var4.points.size() == var5) {
            Iterator var17;
            Iterator var33 = var17 = var4.fileList.iterator();

            label88:
            while (var33.hasNext()) {
               String var34 = (String)var17.next();
               var2.setLength(0);
               RichLabel var19 = ChatBox.getTextList(var34, com.xy.q.Class49.w, 328);

               int var20;
               for (int var35 = var20 = 0; var35 < var19.sectionList.size(); var35 = ++var20) {
                  Object var23;
                  if ((var23 = var19.sectionList.get(var20)) instanceof String) {
                     var2.append(var23);
                  } else if (var23 instanceof InputBean) {
                     var2.append(((InputBean)var23).getName());
                  }
               }

               for (int var36 = var20 = 0; var36 < var6; var36 = ++var20) {
                  String var24 = var1.ua(var20);
                  if (this.xn[var3].equals(var24)) {
                     var33 = var17;
                     this.xm.addLast(var19);
                     continue label88;
                  }

                  if (var2.indexOf(var24) != -1) {
                     this.xm.addLast(var19);
                     var33 = var17;
                     continue label88;
                  }
               }

               var33 = var17;
               ChatBox.removeTextList(var19);
            }
         } else {
            try {
               com.xy.v.Class24 var7 = var4.points.get(var5);
               ChatFileRandom var8 = ChatBox.getChatFileRandom(var4.id, this.afx.roleData.getRoleId(), false);
               byte[] var9;
               byte[] var10000 = var9 = new byte[(int)var7.a];
               var8.read(var7.b, var9);
               var9 = com.xy.v.Class15.b(var10000);
               String var10;
               if (!com.xy.v.Class12.h(var10 = new String(var9, com.xy.v.Class23.c))) {
                  int var11 = 0;
                  int var12 = 0;
                  int var28 = var11;

                  while (var28 != -1) {
                     int var30;
                     label122: {
                        var11 = var10.indexOf("\n", var12);
                        Object var13 = null;
                        StringBuffer var29;
                        if (var11 != -1) {
                           if (var12 + 1 == var11) {
                              var30 = var11;
                              break label122;
                           }

                           var13 = ChatBox.getTextList(var10.substring(var12, var11), com.xy.q.Class49.w, 328);
                           var29 = var2;
                        } else {
                           var13 = ChatBox.getTextList(var10.substring(var12), com.xy.q.Class49.w, 328);
                           var29 = var2;
                        }

                        var29.setLength(0);

                        int var14;
                        for (int var31 = var14 = 0; var31 < ((RichLabel)var13).sectionList.size(); var31 = ++var14) {
                           Object var15;
                           if ((var15 = ((RichLabel)var13).sectionList.get(var14)) instanceof String) {
                              var2.append(var15);
                           } else if (var15 instanceof InputBean) {
                              var2.append(((InputBean)var15).getName());
                           }
                        }

                        int var32 = var14 = 0;

                        while (true) {
                           if (var32 >= var6) {
                              var30 = var11;
                              ChatBox.removeTextList((RichLabel)var13);
                              break;
                           }

                           String var27 = var1.ua(var14);
                           if (this.xn[var3].equals(var27)) {
                              var30 = var11;
                              this.xm.addLast((RichLabel)var13);
                              break;
                           }

                           if (var2.indexOf(var27) != -1) {
                              this.xm.addLast((RichLabel)var13);
                              var30 = var11;
                              break;
                           }

                           var32 = ++var14;
                        }
                     }

                     var12 = var30 + 1;
                     var28 = var11;
                  }
               }
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }
      }
   }

   // $VF: synthetic method
   static void sk(Class51 var0, InputBean var1) {
      var0.xo = var1;
   }

   public void bi(int var1) {
      this.g(var1);
      LinkedList var2 = null;
      if (this.xm.size() != 0) {
         var2 = this.xm;
         this.xm = new LinkedList<>();
      }

      Class51 var15;
      if (this.gz == 8) {
         this.z = 0;
         this.ia = -1;
         this.ae = 0;
         this.cb = 0;
         Class56 var3;
         int var4;
         StringBuffer var5 = (var4 = (var3 = (Class56)this.zc().j(160)).dx()) != 0 ? new StringBuffer() : null;
         int var6 = var4 != 0 ? 0 : 9999;

         for (int var10000 = var6; var10000 < 8; var10000 = ++var6) {
            byte var7 = 0;
            if (var6 == 0) {
               var7 = 5;
               var15 = this;
            } else if (var6 == 1) {
               var7 = 6;
               var15 = this;
            } else if (var6 == 2) {
               var7 = 7;
               var15 = this;
            } else if (var6 == 3) {
               var7 = 0;
               var15 = this;
            } else if (var6 == 4) {
               var7 = 2;
               var15 = this;
            } else if (var6 == 5) {
               var7 = 1;
               var15 = this;
            } else if (var6 == 6) {
               var7 = 4;
               var15 = this;
            } else {
               if (var6 == 7) {
                  var7 = 3;
               }

               var15 = this;
            }

            TextListFile var8;
            if ((var8 = var15.afx.chatBox.getTextListFile(var7)) != null) {
               int var9 = 0;
               int var10 = var8.points.size();

               for (int var14 = var9; var14 <= var10; var14 = var9) {
                  this.sj(var3, var5, var7, var8, var9++);
               }
            }
         }

         var15 = this;
         this.h();
      } else {
         int var11 = this.gz;
         if (this.gz == 1) {
            var11 = 3;
            var15 = this;
         } else if (var11 == 2) {
            var11 = 1;
            var15 = this;
         } else if (var11 == 3) {
            var11 = 2;
            var15 = this;
         } else if (var11 == 4) {
            var11 = 7;
            var15 = this;
         } else {
            if (var11 == 7) {
               var11 = 4;
            }

            var15 = this;
         }

         var15.z = 0;
         this.ia = -1;
         this.ae = 0;
         this.cb = 0;
         TextListFile var12;
         if ((var12 = this.afx.chatBox.getTextListFile(var11)) != null) {
            this.z = var12.points.size();
            this.sf(var12, this.z);
         }

         if (var12 != null && this.z > 0 && this.ae < this.xp.getHeight()) {
            this.z--;
            this.sf(var12, this.z);
         }

         var15 = this;
      }

      var15.si(var2);
   }

   // $VF: synthetic method
   static InputBean sl(Class51 var0) {
      return var0.xo;
   }

   @Override
   public void l() {
      this.bi(this.gz != -1 ? this.gz : 0);
      super.l();
   }

   // $VF: synthetic method
   static JComponent sm(Class51 var0) {
      return var0.xp;
   }

   public void y(int var1) {
      if (var1 == 314) {
         this.bi(this.gz != -1 ? this.gz : 0);
      } else if (var1 == 315) {
         com.xy.i.Class0.ff(160, this.afx);
      } else if (var1 == 316) {
         this.cc(150, this.xp.getHeight());
      } else {
         if (var1 == 317) {
            this.cc(-150, this.xp.getHeight());
         }
      }
   }

   // $VF: synthetic method
   private int sn(int var1, int var2, int var3) {
      return Math.min(Math.max(var1 - var3, 0), var2);
   }

   public void g(int var1) {
      if (this.gz != var1) {
         if (this.gz != -1) {
            this.qh[this.gz].setBounds(this.qh[this.gz].getX() - 6, this.qh[this.gz].getY(), 64, 25);
         }

         this.gz = var1;
         this.qh[this.gz].setBounds(this.qh[this.gz].getX() + 6, this.qh[this.gz].getY(), 64, 25);
      }
   }
}
