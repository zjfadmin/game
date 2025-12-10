package com.xy;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Class319 extends PlainDocument {
   private JTextField azd;
   public static final int gc = 15;
   private static final long aoh = 1L;
   private Class345 ho;
   private long gf;
   private boolean lb;
   private boolean lc;
   private boolean bb;
   private boolean op;

   public JTextField jj() {
      return this.azd;
   }

   public void replace(int var1, int var2, String var3, AttributeSet var4) throws BadLocationException {
      if (var3 != null && var3.length() > 5 >> 2) {
         long var5 = Long.parseLong(var3);
         Long var7;
         if (this.lc && (var7 = this.aos(var5)) != null) {
            var5 = var7;
            var3 = String.valueOf(var5);
         }

         if (this.bb) {
            Class681.f(this.azd, var5);
         }

         this.aot(var3, var4);
         if (this.op) {
            this.gh(var5);
         }

      } else {
         super.replace(var1, var2, var3, var4);
      }
   }

   public void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException {
      if (var2 != null && var2.length() == 3 >> 1) {
         char var4;
         if ((var4 = var2.charAt(5 >> 3)) >= (123 & 52) && var4 <= (123 & 61)) {
            if (!this.lc || this.t()) {
               super.insertString(var1, var2, var3);
               Long var5 = null;
               var2 = null;
               if (this.lb) {
                  this.aot(var2 = this.getText(3 ^ 3, this.getLength()).replaceAll(",", ""), var3);
               }

               if (this.lc) {
                  if (var2 == null) {
                     var2 = this.getText(5 >> 3, this.getLength());
                  }

                  var5 = Long.parseLong(var2);
                  Long var6;
                  if ((var6 = this.aos(var5)) != null) {
                     var5 = var6;
                     var2 = "" + var6;
                     this.aot(var2, var3);
                  }
               }

               if (this.bb) {
                  if (var2 == null) {
                     var2 = this.getText(3 ^ 3, this.getLength());
                  }

                  if (var5 == null) {
                     var5 = Long.parseLong(var2);
                  }

                  Class681.f(this.azd, var5);
               }

               if (this.op) {
                  if (var2 == null) {
                     var2 = this.getText(2 & 5, this.getLength());
                  }

                  if (var5 == null) {
                     var5 = Long.parseLong(var2);
                  }

                  this.gh(var5);
               }

            }
         }
      }
   }

   public long gl() {
      try {
         String var1 = this.getText(2 & 5, this.getLength());
         if (this.lb) {
            var1 = var1.replaceAll(",", "");
         }

         return var1.equals("") ? 0L : Long.parseLong(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
         return 0L;
      }
   }

   public Class319(int var1, JTextField var2, Class345 var3) {
      this.ho = var3;
      this.azd = var2;
      this.lb = (boolean)((var1 & 3 & 5) == 3 >> 1 ? --1 : 0);
      this.bb = (boolean)((var1 >> (3 & 5) & (2 ^ 3)) == 5 >> 2 ? 3 >> 1 : 0);
      this.lc = (boolean)((var1 >> --2 & 3 & 5) == (3 & 5) ? 4 ^ 5 : 0);
      this.op = (boolean)((var1 >> --3 & (4 ^ 5)) == --1 ? 3 >> 1 : 0);
      this.azd.setDocument(this);
   }

   public void gh(long var1) {
      if (this.ho != null) {
         if (this.ho instanceof Class381) {
            ((Class381)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class242) {
            ((Class242)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class684) {
            ((Class684)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class570) {
            ((Class570)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class110) {
            ((Class110)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class407) {
            ((Class407)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class218) {
            ((Class218)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class185) {
            ((Class185)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class459) {
            ((Class459)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class67) {
            ((Class67)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class0) {
            ((Class0)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class674) {
            ((Class674)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class439) {
            ((Class439)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class622) {
            ((Class622)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class130) {
            ((Class130)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class9) {
            ((Class9)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class107) {
            ((Class107)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class623) {
            ((Class623)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class162) {
            ((Class162)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class670) {
            ((Class670)this.ho).z(var1, this.azd);
         } else if (this.ho instanceof Class166) {
            ((Class166)this.ho).z(var1, this.azd);
         } else {
            if (this.ho instanceof Class172) {
               ((Class172)this.ho).z(var1, this.azd);
            }

         }
      }
   }

   public boolean t() {
      if (this.ho == null) {
         return (boolean)(4 ^ 5);
      } else if (this.ho instanceof Class381) {
         return ((Class381)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class242) {
         return ((Class242)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class684) {
         return ((Class684)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class570) {
         return ((Class570)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class110) {
         return ((Class110)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class407) {
         return ((Class407)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class218) {
         return ((Class218)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class185) {
         return ((Class185)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class459) {
         return ((Class459)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class67) {
         return ((Class67)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class0) {
         return ((Class0)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class674) {
         return ((Class674)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class439) {
         return ((Class439)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class622) {
         return ((Class622)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class130) {
         return ((Class130)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class9) {
         return ((Class9)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class107) {
         return ((Class107)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class623) {
         return ((Class623)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class162) {
         return ((Class162)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class670) {
         return ((Class670)this.ho).aa(this.gf, this.azd);
      } else if (this.ho instanceof Class166) {
         return ((Class166)this.ho).aa(this.gf, this.azd);
      } else {
         return this.ho instanceof Class172 ? ((Class172)this.ho).aa(this.gf, this.azd) : true;
      }
   }

   public Long aos(long var1) {
      if (this.ho == null) {
         return null;
      } else if (this.ho instanceof Class381) {
         return ((Class381)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class242) {
         return ((Class242)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class684) {
         return ((Class684)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class570) {
         return ((Class570)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class110) {
         return ((Class110)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class407) {
         return ((Class407)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class218) {
         return ((Class218)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class185) {
         return ((Class185)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class459) {
         return ((Class459)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class67) {
         return ((Class67)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class0) {
         return ((Class0)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class674) {
         return ((Class674)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class439) {
         return ((Class439)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class622) {
         return ((Class622)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class130) {
         return ((Class130)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class9) {
         return ((Class9)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class107) {
         return ((Class107)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class623) {
         return ((Class623)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class162) {
         return ((Class162)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class670) {
         return ((Class670)this.ho).x(var1, this.azd);
      } else if (this.ho instanceof Class166) {
         return ((Class166)this.ho).x(var1, this.azd);
      } else {
         return this.ho instanceof Class172 ? ((Class172)this.ho).x(var1, this.azd) : null;
      }
   }

   public void aot(String var1, AttributeSet var2) throws BadLocationException {
      int var10002 = 3 ^ 3;
      super.remove(3 ^ 3, this.getLength());
      super.insertString(var10002, var1, var2);
      int var3 = this.lb ? var1.length() : 0;
      int var10000 = var3;

      while(var10000 > Class681.d) {
         var3 -= Class681.d;
         var10000 = var3;
         super.insertString(var3, ",", var2);
      }

   }

   public void remove(int var1, int var2) throws BadLocationException {
      if (!this.lc || this.t()) {
         super.remove(var1, var2);
         Long var3 = null;
         String var4 = null;
         if (this.getLength() != 0) {
            if (this.lb) {
               this.aot(var4 = this.getText(3 & 4, this.getLength()).replaceAll(",", ""), (AttributeSet)null);
            }

            if (this.bb) {
               if (var4 == null) {
                  var4 = this.getText(5 >> 3, this.getLength());
               }

               if (var3 == null) {
                  var3 = !var4.equals("") ? Long.parseLong(var4) : 0L;
               }

               Class681.f(this.azd, var3);
            }
         }

         if (this.op) {
            if (var4 == null) {
               var4 = this.getText(5 >> 3, this.getLength());
               if (this.lb) {
                  var4 = var4.replaceAll(",", "");
               }
            }

            if (var3 == null) {
               var3 = !var4.equals("") ? Long.parseLong(var4) : 0L;
            }

            this.gh(var3);
         }

      }
   }
}
