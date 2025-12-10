package com.xy.richtext;

import com.xy.br;
import com.xy.dx;
import com.xy.hd;
import com.xy.ho;
import com.xy.iA;
import com.xy.lz;
import com.xy.mi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.border.Border;

public class RichLabel extends JComponent {
   private InputBean lastBean;
   static Graphics tempG;
   public static String PATH;
   private Font font;
   private static final long serialVersionUID = 4898130145332371300L;
   private String lastStr;
   static Graphics2D tempG2d;
   private long currTime;
   private static Pattern pattern;
   public ArrayList<Object> sectionList;
   private String text;
   private static HashMap<String, iA> faceAnimations = new HashMap(127 & 100);
   public boolean isInteractive;
   private long startTime;
   private Point point;

   public RichLabel(String var1, Font var2, int var3) {
      int var10011 = 3 >> 2;
      int var10015 = 3 >> 1;
      super();
      this.point = new Point(3 & 4, 3 & 4);
      this.sectionList = new ArrayList();
      this.setBackground(Color.RED);
      this.setForeground(Color.BLUE);
      this.setIgnoreRepaint((boolean)var10015);
      this.setBorder((Border)null);
      this.setOpaque((boolean)var10011);
      this.text = var1;
      this.font = var2;
      this.parseText(var1);
      Dimension var4;
      this.setSize(var4 = this.computeSize(var3));
      this.setPreferredSize(var4);
   }

   public RichLabel() {
      this((String)null, (Font)null);
   }

   public void addList(Object var1) {
      this.sectionList.add(var1);
   }

   public static ChatBox.TextList getTextList(String var0) {
      ChatBox.TextList var6 = new ChatBox.TextList();
      var6.list = new ArrayList();
      if (hd.o(var0)) {
         return var6;
      } else {
         Matcher var3;
         Matcher var10000 = var3 = pattern.matcher(var0);

         while(true) {
            while(var10000.find()) {
               label214: {
                  label213: {
                     label236: {
                        String var2;
                        if (!(var2 = var3.group()).startsWith("#")) {
                           var6.list.add(var2);
                        } else {
                           iA var4;
                           String var5;
                           iA var13;
                           label241: {
                              if ((var4 = (iA)faceAnimations.get(var2)) == null && var2.charAt(4 ^ 5) >= (49 & 126) && var2.charAt(4 ^ 5) <= (127 & 57)) {
                                 if (((var5 = var2.substring(3 >> 1)).equals("880") ? (var4 = new iA(ho.a("sc/b/S190.png"))) : (var5.equals("881") ? (var4 = new iA(ho.a("sc/b/S189.png"))) : (var4 = dx.i(PATH + var5 + ".was")))) != null) {
                                    faceAnimations.put(var2, var4);
                                    var13 = var4;
                                    break label241;
                                 }
                              } else if ((var2.equals("#T") || var2.equals("#X") || var2.equals("#J") || var2.equals("#Q") || var2.equals("#D") || var2.equals("#P") || var2.equals("#F") || var2.equals("#H")) && (var4 = (iA)faceAnimations.get(var2)) == null && (var4 = dx.i(PATH + gethead(var2.substring(4 ^ 5)) + ".was")) != null) {
                                 faceAnimations.put(var2, var4);
                              }

                              var13 = var4;
                           }

                           if (var13 != null) {
                              var10000 = var3;
                              var6.list.add(var4);
                              continue;
                           }

                           if (var2.startsWith("#c")) {
                              if (var2.length() == (108 & 27)) {
                                 var10000 = var3;
                                 var6.list.add(lz.c(var2));
                                 continue;
                              }
                           } else {
                              if (var2.equals("#R")) {
                                 var10000 = var3;
                                 var6.list.add(Color.RED);
                                 continue;
                              }

                              if (var2.equals("#G")) {
                                 var10000 = var3;
                                 var6.list.add(Color.GREEN);
                                 continue;
                              }

                              if (var2.equals("#B")) {
                                 var10000 = var3;
                                 var6.list.add(Color.BLUE);
                                 continue;
                              }

                              if (var2.equals("#W")) {
                                 var10000 = var3;
                                 var6.list.add(Color.WHITE);
                                 continue;
                              }

                              if (var2.equals("#K")) {
                                 var10000 = var3;
                                 var6.list.add(Color.BLACK);
                                 continue;
                              }

                              if (var2.equals("#Y")) {
                                 var10000 = var3;
                                 var6.list.add(Color.YELLOW);
                                 continue;
                              }

                              if (var2.equals("#r")) {
                                 var10000 = var3;
                                 var6.list.add(new Integer(-4 >> 2));
                                 continue;
                              }

                              if (var2.equals("#n")) {
                                 var10000 = var3;
                                 var6.list.add(Color.WHITE);
                                 continue;
                              }

                              if (var2.equals("#Z")) {
                                 var10000 = var3;
                                 var6.list.add(new Integer(-2 & -1));
                                 continue;
                              }

                              if (var2.equals("#V")) {
                                 label234: {
                                    try {
                                       if (!var3.find()) {
                                          break label234;
                                       }

                                       if ((var5 = var3.group()).startsWith("c4f0f0f")) {
                                          var6.list.add(new InputBean(-4 >> 2));
                                          break label214;
                                       }

                                       int var11;
                                       int var15;
                                       if (var5.startsWith("BEAU")) {
                                          RichBeau var9;
                                          if ((var9 = new RichBeau(var5, --4, var5.length())).init()) {
                                             var15 = var11 = 5 >> 3;

                                             while(true) {
                                                if (var15 >= var9.getUnits().length) {
                                                   break label236;
                                                }

                                                var6.list.add(var9.getUnits()[var11++]);
                                                var15 = var11;
                                             }
                                          }
                                          break label234;
                                       }

                                       if (!var5.startsWith("IMG")) {
                                          InputBean var1;
                                          if ((var1 = (InputBean)mi.b().fromJson(var5, InputBean.class)).getColor() != null && !var1.getColor().equals("")) {
                                             Color var7;
                                             InputBean var14;
                                             label175: {
                                                var7 = null;
                                                if (var1.getColor().startsWith("c")) {
                                                   String var10;
                                                   if (!(var10 = var2.substring(1 ^ 3)).equals("")) {
                                                      var7 = Color.decode("0x" + var10);
                                                      var14 = var1;
                                                      break label175;
                                                   }
                                                } else {
                                                   if (var1.getColor().equals("R")) {
                                                      var7 = Color.RED;
                                                      var14 = var1;
                                                      break label175;
                                                   }

                                                   if (var1.getColor().equals("G")) {
                                                      var7 = Color.GREEN;
                                                      var14 = var1;
                                                      break label175;
                                                   }

                                                   if (var1.getColor().equals("B")) {
                                                      var7 = Color.BLUE;
                                                      var14 = var1;
                                                      break label175;
                                                   }

                                                   if (var1.getColor().equals("W")) {
                                                      var7 = Color.WHITE;
                                                      var14 = var1;
                                                      break label175;
                                                   }

                                                   if (var1.getColor().equals("K")) {
                                                      var7 = Color.BLACK;
                                                      var14 = var1;
                                                      break label175;
                                                   }

                                                   if (var1.getColor().equals("Y")) {
                                                      var7 = Color.YELLOW;
                                                   }
                                                }

                                                var14 = var1;
                                             }

                                             var14.setColor2(var7);
                                          }

                                          var1.setColor((String)null);
                                          var1.setText(var1.getName());
                                          var6.list.add(var1);
                                          var6.isInteractive = (boolean)(3 & 5);
                                          if (var1.getRichBeau() == null) {
                                             break label234;
                                          }

                                          var1.getRichBeau().init();
                                          var11 = 2 & 5;

                                          for(var15 = var11; var15 < var1.getRichBeau().getUnits().length; var15 = var11) {
                                             var6.list.add(var1.getRichBeau().getUnits()[var11++]);
                                          }

                                          if (var1.getName().endsWith("]")) {
                                             InputBean var12 = var1.clone();
                                             var6.list.add(var12);
                                             var1.setText(var1.getName().substring(3 & 4, var1.getName().length() - --1));
                                             var12.setText("]");
                                             var1.setInputBean(var12);
                                             var12.setRichBeau(var1.getRichBeau());
                                             var12.setInputBean(var1);
                                             break label213;
                                          }
                                          break label234;
                                       }

                                       var4 = new iA(var5, --3, var5.length());
                                       var6.list.add(var4);
                                    } catch (Exception var8) {
                                       var10000 = var3;
                                       var8.printStackTrace();
                                       continue;
                                    }

                                    var10000 = var3;
                                    continue;
                                 }
                              }
                           }
                        }

                        var10000 = var3;
                        continue;
                     }

                     var10000 = var3;
                     continue;
                  }

                  var10000 = var3;
                  continue;
               }

               var10000 = var3;
            }

            return var6;
         }
      }
   }

   public void addText(String var1) {
      this.text = this.text + var1;
      this.parseText(var1);
   }

   public void setTextSize(String var1, int var2) {
      int var10007 = 5 >> 3;
      this.text = var1;
      this.sectionList.clear();
      this.isInteractive = (boolean)var10007;
      this.parseText(var1);
      Dimension var3;
      this.setSize(var3 = this.computeSize(var2));
      this.setPreferredSize(var3);
   }

   public void clear() {
      int var10001 = 3 ^ 3;
      this.text = null;
      this.sectionList.clear();
      this.isInteractive = (boolean)var10001;
   }

   public void parseText(String var1) {
      if (var1 != null) {
         Matcher var5;
         Matcher var10000 = var5 = pattern.matcher(var1);

         while(true) {
            while(var10000.find()) {
               label219: {
                  label218: {
                     label217: {
                        label242: {
                           if (!(var1 = var5.group()).startsWith("#")) {
                              this.sectionList.add(var1);
                           } else {
                              String var4;
                              iA var6;
                              iA var13;
                              label247: {
                                 if ((var6 = (iA)faceAnimations.get(var1)) == null && var1.charAt(5 >> 2) >= (122 & 53) && var1.charAt(4 ^ 5) <= (125 & 59)) {
                                    if (((var4 = var1.substring(--1)).equals("880") ? (var6 = new iA(ho.a("sc/b/S190.png"))) : (var4.equals("881") ? (var6 = new iA(ho.a("sc/b/S189.png"))) : (var6 = dx.i(PATH + var4 + ".was")))) != null) {
                                       faceAnimations.put(var1, var6);
                                       var13 = var6;
                                       break label247;
                                    }
                                 } else if ((var1.equals("#T") || var1.equals("#X") || var1.equals("#J") || var1.equals("#Q") || var1.equals("#D") || var1.equals("#P") || var1.equals("#F") || var1.equals("#H")) && (var6 = (iA)faceAnimations.get(var1)) == null && (var6 = dx.i(PATH + gethead(var1.substring(3 & 5)) + ".was")) != null) {
                                    faceAnimations.put(var1, var6);
                                 }

                                 var13 = var6;
                              }

                              if (var13 != null) {
                                 var10000 = var5;
                                 this.sectionList.add(var6);
                                 continue;
                              }

                              if (var1.startsWith("#c")) {
                                 if (var1.length() == (13 & 122)) {
                                    Color var9 = lz.c(var1);
                                    var10000 = var5;
                                    this.sectionList.add(var9);
                                    continue;
                                 }
                              } else {
                                 if (var1.equals("#R")) {
                                    var10000 = var5;
                                    this.sectionList.add(Color.RED);
                                    continue;
                                 }

                                 if (var1.equals("#G")) {
                                    var10000 = var5;
                                    this.sectionList.add(Color.GREEN);
                                    continue;
                                 }

                                 if (var1.equals("#B")) {
                                    var10000 = var5;
                                    this.sectionList.add(Color.BLUE);
                                    continue;
                                 }

                                 if (var1.equals("#W")) {
                                    var10000 = var5;
                                    this.sectionList.add(Color.WHITE);
                                    continue;
                                 }

                                 if (var1.equals("#K")) {
                                    var10000 = var5;
                                    this.sectionList.add(Color.BLACK);
                                    continue;
                                 }

                                 if (var1.equals("#Y")) {
                                    var10000 = var5;
                                    this.sectionList.add(Color.YELLOW);
                                    continue;
                                 }

                                 if (var1.equals("#r")) {
                                    var10000 = var5;
                                    this.sectionList.add(new Integer(-4 >> 2));
                                    continue;
                                 }

                                 if (var1.equals("#n")) {
                                    var10000 = var5;
                                    this.sectionList.add(Color.WHITE);
                                    continue;
                                 }

                                 if (var1.equals("#Z")) {
                                    var10000 = var5;
                                    this.sectionList.add(new Integer(-2 & -1));
                                    continue;
                                 }

                                 if (var1.equals("#V")) {
                                    try {
                                       if (var5.find()) {
                                          if ((var4 = var5.group()).startsWith("c4f0f0f")) {
                                             this.sectionList.add(new InputBean(-4 >> 2));
                                             break label219;
                                          }

                                          int var10;
                                          int var15;
                                          if (var4.startsWith("BEAU")) {
                                             RichBeau var8;
                                             if ((var8 = new RichBeau(var4, --4, var4.length())).init()) {
                                                var15 = var10 = 3 ^ 3;

                                                while(true) {
                                                   if (var15 >= var8.getUnits().length) {
                                                      break label218;
                                                   }

                                                   this.sectionList.add(var8.getUnits()[var10++]);
                                                   var15 = var10;
                                                }
                                             }
                                          } else {
                                             if (var4.startsWith("IMG")) {
                                                var6 = new iA(var4, --3, var4.length());
                                                this.sectionList.add(var6);
                                                break label242;
                                             }

                                             InputBean var2;
                                             if ((var2 = (InputBean)mi.b().fromJson(var4, InputBean.class)).getColor() != null && !var2.getColor().equals("")) {
                                                Color var3;
                                                InputBean var14;
                                                label181: {
                                                   var3 = null;
                                                   if (var2.getColor().startsWith("c")) {
                                                      String var12;
                                                      if (!(var12 = var1.substring(5 >> 1)).equals("")) {
                                                         var3 = Color.decode("0x" + var12);
                                                         var14 = var2;
                                                         break label181;
                                                      }
                                                   } else {
                                                      if (var2.getColor().equals("R")) {
                                                         var3 = Color.RED;
                                                         var14 = var2;
                                                         break label181;
                                                      }

                                                      if (var2.getColor().equals("G")) {
                                                         var3 = Color.GREEN;
                                                         var14 = var2;
                                                         break label181;
                                                      }

                                                      if (var2.getColor().equals("B")) {
                                                         var3 = Color.BLUE;
                                                         var14 = var2;
                                                         break label181;
                                                      }

                                                      if (var2.getColor().equals("W")) {
                                                         var3 = Color.WHITE;
                                                         var14 = var2;
                                                         break label181;
                                                      }

                                                      if (var2.getColor().equals("K")) {
                                                         var3 = Color.BLACK;
                                                         var14 = var2;
                                                         break label181;
                                                      }

                                                      if (var2.getColor().equals("Y")) {
                                                         var3 = Color.YELLOW;
                                                      }
                                                   }

                                                   var14 = var2;
                                                }

                                                var14.setColor2(var3);
                                             }

                                             var2.setColor((String)null);
                                             var2.setText(var2.getName());
                                             if (var2.getRichBeau() != null && !var2.getRichBeau().isDraw()) {
                                                var2.setRichBeau((RichBeau)null);
                                             }

                                             this.sectionList.add(var2);
                                             this.isInteractive = (boolean)(--1);
                                             if (var2.getRichBeau() != null) {
                                                var2.getRichBeau().init();
                                                var10 = 3 ^ 3;
                                                var15 = var10;

                                                while(true) {
                                                   if (var15 >= var2.getRichBeau().getUnits().length) {
                                                      if (var2.getName().endsWith("]")) {
                                                         InputBean var11 = var2.clone();
                                                         this.sectionList.add(var11);
                                                         var2.setText(var2.getName().substring(3 ^ 3, var2.getName().length() - (4 ^ 5)));
                                                         var11.setText("]");
                                                         var2.setInputBean(var11);
                                                         var11.setRichBeau(var2.getRichBeau());
                                                         var11.setInputBean(var2);
                                                         break label217;
                                                      }
                                                      break;
                                                   }

                                                   this.sectionList.add(var2.getRichBeau().getUnits()[var10++]);
                                                   var15 = var10;
                                                }
                                             }
                                          }
                                       }
                                    } catch (Exception var7) {
                                       var10000 = var5;
                                       var7.printStackTrace();
                                       continue;
                                    }
                                 }
                              }
                           }

                           var10000 = var5;
                           continue;
                        }

                        var10000 = var5;
                        continue;
                     }

                     var10000 = var5;
                     continue;
                  }

                  var10000 = var5;
                  continue;
               }

               var10000 = var5;
            }

            return;
         }
      }
   }

   public void paintComponent(Graphics var1) {
      Graphics2D var11 = null;
      Object var9 = null;
      Object var4 = null;
      Object var5 = null;
      Object var6 = null;
      Object var7 = null;
      var1.setFont(this.font != null ? this.font : lz.bm);
      var1.setColor(Color.WHITE);
      if (this.startTime == 0L) {
         this.startTime = System.currentTimeMillis();
      }

      this.currTime = System.currentTimeMillis();
      int var8 = this.getWidth();
      int var3 = 3 >> 2;
      int var10 = 3 >> 2;
      int var2 = 2 & 5;
      int var12 = this.sectionList.size();
      int var13 = 3 & 4;
      int var14 = 3 >> 2;
      if (var8 != 5 >> 2) {
         int var15;
         for(int var10000 = var15 = 0; var10000 < var12; var10000 = var15) {
            Object var16;
            if ((var16 = this.sectionList.get(var15)) instanceof String) {
               String var17 = (String)var16;
               FontMetrics var18 = var1.getFontMetrics();
               var2 = Math.max(var2, var18.getHeight());
               int var19 = var18.stringWidth(var17);
               if (var3 + var19 <= var8) {
                  var3 += var19;
               } else {
                  Point var20 = this.paintRichText(var1, var14, var10, var8, var2, var13, var15 + (3 & 5));
                  var13 = var15 + (5 >> 2);
                  var3 = var20.x;
                  var2 = var18.getHeight();
                  var14 = var20.x;
                  var10 = var20.y;
               }
            } else if (var16 instanceof iA) {
               iA var23;
               if ((var23 = (iA)var16).b() + var3 > var8) {
                  this.paintRichText(var1, var14, var10, var8, var2, var13, var15);
                  var13 = var15;
                  var14 = 3 >> 2;
                  var10 += var2;
                  var3 = var23.b();
                  var2 = var23.c();
               } else {
                  var2 = Math.max(var2, var23.c());
                  var3 += var23.b();
               }
            } else if (var16 instanceof Integer) {
               int var24;
               if ((var24 = (Integer)var16) == -4 >> 2) {
                  this.paintRichText(var1, var14, var10, var8, var2, var13, var15 + --1);
                  var13 = var15;
                  var14 = 3 & 4;
                  var10 += var2;
                  var3 = 5 >> 3;
                  var2 = 3 >> 2;
               } else if (var24 == (-2 & -1) && var15 == 0) {
                  Graphics2D var21 = var11 = (Graphics2D)var1;
                  var9 = var21.getRenderingHint(RenderingHints.KEY_RENDERING);
                  var4 = var21.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
                  var5 = var21.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
                  var6 = var21.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
                  var7 = var21.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
                  Object var22;
                  if (var9 != RenderingHints.VALUE_RENDER_QUALITY) {
                     var22 = var4;
                     var11.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                  } else {
                     var9 = null;
                     var22 = var4;
                  }

                  if (var22 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
                     var22 = var5;
                     var11.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
                  } else {
                     var4 = null;
                     var22 = var5;
                  }

                  if (var22 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
                     var22 = var6;
                     var11.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                  } else {
                     var5 = null;
                     var22 = var6;
                  }

                  if (var22 != RenderingHints.VALUE_STROKE_DEFAULT) {
                     var22 = var7;
                     var11.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
                  } else {
                     var6 = null;
                     var22 = var7;
                  }

                  if (var22 != RenderingHints.VALUE_ANTIALIAS_ON) {
                     var11.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                  } else {
                     var7 = null;
                  }
               }
            } else if (var16 instanceof InputBean) {
               InputBean var25;
               if ((var25 = (InputBean)var16).getType() != -4 >> 2) {
                  String var26 = var25.getText();
                  FontMetrics var29 = var1.getFontMetrics();
                  var2 = Math.max(var2, var29.getHeight());
                  int var30 = var29.stringWidth(var26);
                  if (var3 + var30 <= var8) {
                     var3 += var30;
                  } else {
                     Point var28 = this.paintRichText(var1, var14, var10, var8, var2, var13, var15 + (2 ^ 3));
                     var13 = var15 + --1;
                     var3 = var28.x;
                     var2 = var29.getHeight();
                     var14 = var28.x;
                     var10 = var28.y;
                  }
               }
            } else if (var16 instanceof RichBeauUnit) {
               RichBeauUnit var27;
               if ((var27 = (RichBeauUnit)var16).getWidth() + var3 > var8) {
                  this.paintRichText(var1, var14, var10, var8, var2, var13, var15);
                  var13 = var15;
                  var14 = 3 ^ 3;
                  var10 += var2;
                  var3 = var27.getWidth();
                  var2 = var27.getHeight();
               } else {
                  var2 = Math.max(var2, 127 & 18);
                  var3 += var27.getWidth();
               }
            }

            ++var15;
         }

         this.paintRichText(var1, var14, var10, var8, var2, var13, var12);
         if (var11 != null) {
            if (var9 != null) {
               var11.setRenderingHint(RenderingHints.KEY_RENDERING, var9);
            }

            if (var4 != null) {
               var11.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var4);
            }

            if (var5 != null) {
               var11.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var5);
            }

            if (var6 != null) {
               var11.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var6);
            }

            if (var7 != null) {
               var11.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var7);
            }
         }

      }
   }

   public void paintImmediately(int var1, int var2, int var3, int var4) {
   }

   public static int gethead(String var0) {
      if (var0.equals("T")) {
         return 2014 & 31153;
      } else if (var0.equals("X")) {
         return 15807 & 17361;
      } else if (var0.equals("J")) {
         return 6642 & 26527;
      } else if (var0.equals("Q")) {
         return 11731 & 21439;
      } else if (var0.equals("D")) {
         return 13310 & 19861;
      } else if (var0.equals("F")) {
         return 15351 & 17822;
      } else {
         return var0.equals("H") ? 23455 & 9719 : 405;
      }
   }

   public void setText(String var1) {
      int var10003 = 2 & 5;
      this.text = var1;
      this.sectionList.clear();
      this.isInteractive = (boolean)var10003;
      this.parseText(var1);
   }

   public RichLabel(String var1, Font var2) {
      int var10009 = 3 ^ 3;
      int var10013 = 4 ^ 5;
      super();
      this.point = new Point(3 ^ 3, 3 ^ 3);
      this.sectionList = new ArrayList();
      this.setBackground(Color.RED);
      this.setForeground(Color.BLUE);
      this.setIgnoreRepaint((boolean)var10013);
      this.setBorder((Border)null);
      this.setOpaque((boolean)var10009);
      this.text = var1;
      this.font = var2;
      this.parseText(var1);
      Dimension var3;
      this.setSize(var3 = new Dimension(107 & 118, 127 & 16));
      this.setPreferredSize(var3);
   }

   public void remove() {
      int var10002 = 2 & 5;
      this.sectionList.clear();
      this.isInteractive = (boolean)var10002;
      this.disable();
   }

   public boolean isTextSize(String var1, int var2) {
      if (hd.r(this.text, var1)) {
         return (boolean)(3 >> 2);
      } else {
         this.setTextSize(var1, var2);
         return (boolean)(5 >> 2);
      }
   }

   static {
      String var0 = "#([RGBKYWTXJQDPVZFHLnbur#]|[1][0-5][0-9]|[1][6][0-8]|[8][8][0-1]|[1-9]\\d|[0-9]|c[0-9A-Fa-f]?[0-9A-Fa-f]?[0-9A-Fa-f]?[0-9A-Fa-f]?[0-9A-Fa-f]?[0-9A-Fa-f]?)|[^#]+";
      pattern = Pattern.compile(var0);
      PATH = "sc/emoticons/";
      tempG = (new BufferedImage(3 & 5, 3 & 5, 44 & 91)).getGraphics();
   }

   public InputBean isMonitor(int var1, int var2) {
      if (this.isInteractive) {
         int var5 = this.sectionList.size();

         int var4;
         for(int var10000 = var4 = 3 & 4; var10000 < var5; var10000 = var4) {
            Object var3;
            InputBean var6;
            if ((var3 = this.sectionList.get(var4)) instanceof InputBean && (var6 = (InputBean)var3).getType() != -4 >> 2 && var6.isMonitor(var1, var2)) {
               return var6;
            }

            ++var4;
         }
      }

      return null;
   }

   public void setFont(Font var1) {
      this.font = var1;
   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }

   }

   public String getText() {
      return this.text;
   }

   public void addText(String var1, int var2) {
      this.text = this.text + var1;
      this.parseText(var1);
      Dimension var3;
      this.setSize(var3 = this.computeSize(var2));
      this.setPreferredSize(var3);
   }

   public Dimension computeSize(int var1) {
      if (this.sectionList.size() == 0) {
         return new Dimension(3 & 5, 3 & 5);
      } else {
         synchronized(tempG) {
            int var3 = 0;
            int var4 = 3 >> 2;
            int var2 = 3 & 4;
            int var6 = this.sectionList.size();
            int var7 = 3 ^ 3;
            int var8 = 3 ^ 3;
            Graphics2D var9 = null;
            Object var10 = null;
            Object var11 = null;
            Object var12 = null;
            Object var13 = null;
            Object var14 = null;
            Graphics var15;
            (var15 = tempG).setFont(this.font != null ? this.font : lz.bm);
            int var16 = 3 >> 2;

            int var17;
            for(int var10000 = var17 = 3 >> 2; var10000 < var6; var10000 = var17) {
               Object var18;
               if ((var18 = this.sectionList.get(var17)) instanceof String) {
                  String var19 = (String)var18;
                  FontMetrics var20 = var15.getFontMetrics();
                  var2 = Math.max(var2, var20.getHeight());
                  int var21 = var20.stringWidth(var19);
                  if (var3 + var21 <= var1) {
                     var3 += var21;
                  } else {
                     Point var22 = this.paintRichText(var15, var8, var4, var1, var2, var7, var17 + (4 ^ 5));
                     var7 = var17 + (5 >> 2);
                     var3 = var22.x;
                     var2 = var20.getHeight();
                     var8 = var22.x;
                     var4 = var22.y;
                  }
               } else if (var18 instanceof iA) {
                  iA var27;
                  if ((var27 = (iA)var18).b() + var3 > var1) {
                     this.paintRichText(var15, var8, var4, var1, var2, var7, var17);
                     var7 = var17;
                     var8 = 3 ^ 3;
                     var4 += var2;
                     var3 = var27.b();
                     var2 = var27.c();
                  } else {
                     var2 = Math.max(var2, var27.c());
                     var3 += var27.b();
                  }
               } else if (var18 instanceof Integer) {
                  int var28;
                  if ((var28 = (Integer)var18) == -4 >> 2) {
                     this.paintRichText(var15, var8, var4, var1, var2, var7, var17 + --1);
                     var7 = var17;
                     var8 = 5 >> 3;
                     var4 += var2;
                     var3 = 5 >> 3;
                     var2 = 5 >> 3;
                  } else if (var28 == (-1 & -2) && var17 == 0) {
                     Graphics2D var24 = var9 = (Graphics2D)var15;
                     var10 = var24.getRenderingHint(RenderingHints.KEY_RENDERING);
                     var11 = var24.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
                     var12 = var24.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
                     var13 = var24.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
                     var14 = var24.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
                     Object var25;
                     if (var10 != RenderingHints.VALUE_RENDER_QUALITY) {
                        var25 = var11;
                        var9.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                     } else {
                        var10 = null;
                        var25 = var11;
                     }

                     if (var25 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
                        var25 = var12;
                        var9.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
                     } else {
                        var11 = null;
                        var25 = var12;
                     }

                     if (var25 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
                        var25 = var13;
                        var9.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                     } else {
                        var12 = null;
                        var25 = var13;
                     }

                     if (var25 != RenderingHints.VALUE_STROKE_DEFAULT) {
                        var25 = var14;
                        var9.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
                     } else {
                        var13 = null;
                        var25 = var14;
                     }

                     if (var25 != RenderingHints.VALUE_ANTIALIAS_ON) {
                        var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                     } else {
                        var14 = null;
                     }
                  }
               } else if (var18 instanceof InputBean) {
                  InputBean var29;
                  if ((var29 = (InputBean)var18).getType() == -4 >> 2) {
                     var16 = --1;
                  } else {
                     String var30 = var29.getText();
                     FontMetrics var33 = var15.getFontMetrics();
                     var2 = Math.max(var2, var33.getHeight());
                     int var34 = var33.stringWidth(var30);
                     if (var3 + var34 <= var1) {
                        var3 += var34;
                     } else {
                        Point var32 = this.paintRichText(var15, var8, var4, var1, var2, var7, var17 + --1);
                        var7 = var17 + --1;
                        var3 = var32.x;
                        var2 = var33.getHeight();
                        var8 = var32.x;
                        var4 = var32.y;
                     }
                  }
               } else if (var18 instanceof RichBeauUnit) {
                  RichBeauUnit var31;
                  if ((var31 = (RichBeauUnit)var18).getWidth() + var3 > var1) {
                     this.paintRichText(var15, var8, var4, var1, var2, var7, var17);
                     var7 = var17;
                     var8 = 2 & 5;
                     var4 += var2;
                     var2 = 87 & 58;
                     var3 = var31.getWidth();
                  } else {
                     var2 = Math.max(var2, 91 & 54);
                     var3 += var31.getWidth();
                  }
               }

               ++var17;
            }

            if (var9 != null) {
               if (var10 != null) {
                  var9.setRenderingHint(RenderingHints.KEY_RENDERING, var10);
               }

               if (var11 != null) {
                  var9.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var11);
               }

               if (var12 != null) {
                  var9.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var12);
               }

               if (var13 != null) {
                  var9.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var13);
               }

               if (var14 != null) {
                  var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var14);
               }
            }

            Point var26 = this.paintRichText(var15, var8, var4, var1, var2, var7, var6);
            if (var16 != 0) {
               var1 = 3 ^ 3;
            } else if (var4 == 0 && var26.x != 0) {
               var1 = var26.x;
            }

            return new Dimension(var1, var4 + var2 + --4);
         }
      }
   }


   private Point paintRichText(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.lastStr != null) {
         RichLabel var10000;
         if (this.lastBean != null) {
            Color var8 = var1.getColor();
            FontMetrics var9 = var1.getFontMetrics();
            if (this.lastBean.getColor2() != null) {
               var1.setColor(this.lastBean.getColor2());
            }

            var1.drawString(this.lastStr, 2 & 5, var3 + var5);
            if (this.lastBean.getType() != 5 >> 2) {
               int var10001;
               int var10002;
               if (this.lastBean.isM()) {
                  var10001 = --1;
                  var10002 = var3;
               } else {
                  var10001 = 0;
                  var10002 = var3;
               }

               var1.drawLine(var10001, var10002 + 3 + var5 + (this.lastBean.isM() ? --1 : 0), var9.stringWidth(this.lastStr) + (this.lastBean.isM() ? 5 >> 2 : 0), var3 + --3 + var5 + (this.lastBean.isM() ? --1 : 0));
            }

            var1.setColor(var8);
            var10000 = this;
         } else {
            var1.drawString(this.lastStr, 2 & 5, var3 + var5);
            var10000 = this;
         }

         var10000.lastStr = null;
         this.lastBean = null;
      }

      int var23;
      for(int var30 = var23 = var6; var30 < var7; var30 = var23) {
         int var13;
         int var14;
         Object var24;
         int var26;
         int var28;
         String var32;
         if ((var24 = this.sectionList.get(var23)) instanceof String) {
            String var22 = (String)var24;
            FontMetrics var27 = var1.getFontMetrics();
            var26 = var22.length();
            var28 = 3 >> 2;
            var14 = 3 ^ 3;
            var30 = var13 = 3 >> 2;

            label246:
            while(true) {
               while(true) {
                  if (var30 >= var26) {
                     break label246;
                  }

                  var14 = var27.charWidth(var22.charAt(var13));

                  label220: {
                     for(var30 = var2; var30 + var14 <= var4; var30 = var2) {
                        ++var13;
                        if (var13 >= var26) {
                           var32 = var22;
                           break label220;
                        }

                        var14 += var27.charWidth(var22.charAt(var13));
                     }

                     var32 = var22;
                  }

                  String var29;
                  label339: {
                     var29 = var32.substring(var28, var13);
                     if (var23 == var7 - (3 >> 1) && var13 >= var26 && var2 + var14 < var4 && this.sectionList.size() > var7) {
                        this.lastStr = var29;
                        Object var31;
                        if ((var31 = this.sectionList.get(var7)) instanceof iA && ((iA)var31).b() + var2 + var14 > var4 || var31 instanceof RichBeauUnit && ((RichBeauUnit)var31).getWidth() + var2 + var14 > var4) {
                           var1.drawString(var29, var2, var3 + var5);
                           var30 = var13;
                           this.lastStr = null;
                           break label339;
                        }
                     } else {
                        var1.drawString(var29, var2, var3 + var5);
                     }

                     var30 = var13;
                  }

                  if (var30 >= var26 && var2 + var14 != var4) {
                     var2 += var27.stringWidth(var29);
                     var30 = var13;
                  } else {
                     var28 = var13;
                     var2 = 3 >> 2;
                     var3 += var5;
                     var5 = var27.getHeight();
                     var30 = var13;
                  }
               }
            }
         } else if (var24 instanceof Color) {
            var1.setColor((Color)var24);
         } else if (var24 instanceof iA) {
            iA var21;
            br var25;
            if ((var21 = (iA)var24).d() == 0) {
               var25 = var21.a(this.currTime - this.startTime);
               Image var33 = var25.g();
               var30 = var2;
               var1.drawImage(var33, var2, var3 + --4 + var5 - var21.c(), (ImageObserver)null);
            } else if (var21.d() == 5 >> 2) {
               var25 = var21.a(0L);
               var1.drawImage(var25.g(), var2, var3 + --4 + var5 - var21.c(), var21.b(), var21.c(), (ImageObserver)null);
               var25 = var21.a(120L);
               var1.drawImage(var25.g(), var2 + (4 ^ 5), var3 + --5 + var5 - var21.c(), var21.b() - (1 ^ 3), var21.c() - (5 >> 1), (ImageObserver)null);
               var30 = var2;
            } else {
               if (var21.d() == (1 ^ 3)) {
                  var25 = var21.a(0L);
                  var1.drawImage(var25.g(), var2, var3 + (5 >> 1) + var5 - var21.c(), var21.b(), var21.c(), (ImageObserver)null);
               }

               var30 = var2;
            }

            var2 = var30 + var21.b();
         } else if (!(var24 instanceof InputBean)) {
            if (var24 instanceof RichBeauUnit) {
               RichBeauUnit var20 = (RichBeauUnit)var24;
               var26 = var1.getFontMetrics().getHeight();
               var28 = (var28 = --2) - var20.getHeight() + (var26 - (114 & 31)) / (1 ^ 3);
               if (var20.isM()) {
                  var1.drawImage(var20.getImage(), 1 + var2, 1 + var3 + var5 + var28, (ImageObserver)null);
                  var30 = var2;
               } else {
                  var1.drawImage(var20.getImage(), var2, var3 + var5 + var28, (ImageObserver)null);
                  var30 = var2;
               }

               var2 = var30 + var20.getWidth();
            }
         } else {
            InputBean var19;
            if ((var19 = (InputBean)var24).getType() != -4 >> 2) {
               Color var10 = var1.getColor();
               if (var19.getColor2() != null) {
                  var1.setColor(var19.getColor2());
               }

               String var11 = var19.getText();
               FontMetrics var12 = var1.getFontMetrics();
               if (var19.getHeight() == null) {
                  var19.setS_x(var2);
                  var19.setS_y(var3 - var12.getHeight() + var5);
               }

               var13 = var11.length();
               var14 = 2 & 5;
               int var16 = 5 >> 3;
               int var15;
               var30 = var15 = 5 >> 3;

               while(true) {
                  while(var30 < var13) {
                     var16 = var12.charWidth(var11.charAt(var15));

                     label258: {
                        for(var30 = var2; var30 + var16 <= var4; var30 = var2) {
                           ++var15;
                           if (var15 >= var13) {
                              var32 = var11;
                              break label258;
                           }

                           var16 += var12.charWidth(var11.charAt(var15));
                        }

                        var32 = var11;
                     }

                     String var17;
                     label340: {
                        var17 = var32.substring(var14, var15);
                        if (var23 == var7 - --1 && var15 >= var13 && var2 + var16 < var4 && this.sectionList.size() > var7) {
                           this.lastStr = var17;
                           this.lastBean = var19;
                           Object var18;
                           if ((var18 = this.sectionList.get(var7)) instanceof iA && ((iA)var18).b() + var2 + var16 > var4 || var18 instanceof RichBeauUnit && ((RichBeauUnit)var18).getWidth() + var2 + var16 > var4) {
                              var1.drawString(var17, var2 + (var19.isM() ? --1 : 0), var3 + var5 + (var19.isM() ? 2 ^ 3 : 0));
                              if (var19.getType() != 1) {
                                 var1.drawLine(var2 + (var19.isM() ? 1 : 0), var3 + --3 + var5 + (var19.isM() ? 1 : 0), var2 + var12.stringWidth(var17) + (var19.isM() ? 1 : 0), var3 + --3 + var5 + (var19.isM() ? 1 : 0));
                              }

                              this.lastBean = this.lastStr = null;
                              var30 = var15;
                              break label340;
                           }
                        } else {
                           var1.drawString(var17, var2 + (var19.isM() ? 1 : 0), var3 + var5 + (var19.isM() ? 1 : 0));
                           if (var19.getType() != 1) {
                              var1.drawLine(var2 + (var19.isM() ? 1 : 0), var3 + --3 + var5 + (var19.isM() ? 1 : 0), var2 + var12.stringWidth(var17) + (var19.isM() ? 1 : 0), var3 + --3 + var5 + (var19.isM() ? 1 : 0));
                           }
                        }

                        var30 = var15;
                     }

                     if (var30 >= var13 && var2 + var16 != var4) {
                        var2 += var12.stringWidth(var17);
                        var30 = var15;
                     } else {
                        var14 = var15;
                        var2 = 0;
                        var3 += var5;
                        var5 = var12.getHeight();
                        var30 = var15;
                     }
                  }

                  if (var19.getHeight() == null) {
                     var19.setHeight(var12.getHeight());
                     var19.setE_x(var2);
                     var19.setE_y(var3 - var12.getHeight() + var5);
                  }

                  var1.setColor(var10);
                  break;
               }
            }
         }

         ++var23;
      }

      this.point.move(var2, var3);
      return this.point;
   }

   public RichLabel(String var1, ArrayList<Object> var2, boolean var3, Font var4, int var5) {
      int var10005 = 3 ^ 3;
      int var10009 = --1;
      super();
      this.point = new Point(5 >> 3, 5 >> 3);
      this.text = var1;
      this.font = var4;
      this.sectionList = var2;
      this.isInteractive = var3;
      this.setBackground(Color.RED);
      this.setForeground(Color.BLUE);
      this.setIgnoreRepaint((boolean)var10009);
      this.setBorder((Border)null);
      this.setOpaque((boolean)var10005);
      Dimension var6;
      this.setSize(var6 = this.computeSize(var5));
      this.setPreferredSize(var6);
   }
}
