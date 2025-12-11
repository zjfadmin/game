package com.xy.q;

import com.xy.a.Class100;
import com.xy.a.Class103;
import com.xy.a.Class106;
import com.xy.a.Class107;
import com.xy.a.Class110;
import com.xy.a.Class112;
import com.xy.a.Class113;
import com.xy.a.Class116;
import com.xy.a.Class121;
import com.xy.a.Class123;
import com.xy.a.Class127;
import com.xy.a.Class128;
import com.xy.a.Class132;
import com.xy.a.Class134;
import com.xy.a.Class138;
import com.xy.a.Class142;
import com.xy.a.Class63;
import com.xy.a.Class65;
import com.xy.a.Class68;
import com.xy.a.Class78;
import com.xy.a.Class83;
import com.xy.a.Class89;
import com.xy.a.Class91;
import com.xy.a.Class92;
import com.xy.a.Class93;
import com.xy.a.Class98;
import com.xy.a.a.Class62;
import com.xy.a.q.Class101;
import com.xy.a.q.Class104;
import com.xy.a.q.Class105;
import com.xy.a.q.Class108;
import com.xy.a.q.Class111;
import com.xy.a.q.Class117;
import com.xy.a.q.Class67;
import com.xy.a.q.Class70;
import com.xy.a.q.Class73;
import com.xy.a.q.Class80;
import com.xy.a.q.Class81;
import com.xy.a.q.Class82;
import com.xy.a.q.Class85;
import com.xy.a.q.Class86;
import com.xy.a.q.Class87;
import com.xy.a.q.Class88;
import com.xy.a.q.Class90;
import com.xy.a.q.Class94;
import com.xy.a.q.Class97;
import com.xy.text.GameView;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class57 {
   private GameView a;
   private List<Class30> b;
   private Map<Integer, Integer> c;
   private Class48 d;

   public void a(int var1) {
      Class30 var2;
      if ((var2 = this.n(var1)) != null) {
         this.i();
         if (var2.il() == 3 || var2.il() == 6) {
            this.a.add(this.d(), 0);
         }

         this.a.add(var2, 0);
         int var3 = 0;
         int var5 = this.a.getComponentCount() - 1;

         for (int var10000 = var5; var10000 > var3; var10000 = --var5) {
            Component var6;
            Class30 var7;
            if ((var6 = this.a.getComponent(var5)) instanceof Class30 && (var7 = (Class30)var6).il() > var2.il()) {
               var5++;
               var3++;
               this.a.add(var7, 0);
            }
         }

         Class30 var8 = var1 != 121 ? this.l(121) : null;
         if (var8 != null) {
            this.a.add(var8, 1);
         }
      }
   }

   public void b(int var1) {
      Class30 var2;
      if ((var2 = this.j(var1)) != null) {
         var2.l();
         if (var2.isVisible()) {
            if (var2.il() == 3 || var2.il() == 6) {
               this.o();
            }

            this.a(var1);
         }
      }
   }

   public void c() {
      Class48 var10001 = this.d();
      var10001.cc(this.a.screenData.getScreen_x(), this.a.screenData.getScreen_y());
      var10001.l();
      this.a.remove(this.d());
      this.a.add(this.d(), 0);
   }

   // $VF: synthetic method
   private Class48 d() {
      if (this.d == null) {
         this.d = new Class48(this.a);
      }

      return this.d;
   }

   public Class57(GameView var1) {
      this.a = var1;
      this.b = new ArrayList<>();
      this.c = new HashMap<>();
   }

   public void e() {
      this.d().ah();
   }

   public void f(int var1) {
      Class30 var2;
      if ((var2 = this.n(var1)) != null) {
         this.i();
         if (var2.ah()) {
            this.e();
         }

         if (var1 == 6 || var1 == 18 || var1 == 47 || var1 == 67) {
            this.k(var1);
         }
      }
   }

   public Class30 g(int var1) {
      com.xy.a.v.Class24 var2 = null;
      switch (var1) {
         case 0:
            return new com.xy.a.w.Class30(this.a);
         case 1:
            return new com.xy.a.a.Class4(this.a);
         case 2:
            return new com.xy.a.a.Class35(this.a);
         case 3:
            return new com.xy.a.Class50(this.a);
         case 4:
            return new Class128(this.a);
         case 6:
            return new com.xy.a.a.Class16(this.a);
         case 7:
            return new com.xy.a.a.Class31(this.a);
         case 8:
            return new com.xy.a.w.Class25(this.a);
         case 9:
            return new Class110(this.a);
         case 10:
            return new com.xy.a.w.Class10(this.a);
         case 11:
            return new com.xy.a.q.Class30(this.a);
         case 12:
            return new com.xy.a.q.Class17(this.a);
         case 13:
            return new com.xy.a.Class25(this.a);
         case 14:
            return new Class108(this.a);
         case 17:
            return new com.xy.a.q.Class34(this.a);
         case 18:
            return new com.xy.a.a.Class9(this.a);
         case 20:
            return new com.xy.a.a.Class1(this.a);
         case 22:
            return new Class121(this.a);
         case 23:
            return new com.xy.a.q.Class18(this.a);
         case 25:
            return new Class68(this.a);
         case 26:
            return new com.xy.a.q.Class16(this.a);
         case 27:
            return new com.xy.a.Class6(this.a);
         case 28:
            return new com.xy.a.Class59(this.a);
         case 29:
            return new com.xy.a.q.Class12(this.a);
         case 30:
            return new com.xy.a.Class46(this.a);
         case 32:
            return new Class113(this.a);
         case 34:
            return new Class123(this.a);
         case 36:
            return new com.xy.a.q.Class40(this.a);
         case 37:
            return new Class91(this.a);
         case 38:
            return new com.xy.a.w.Class26(this.a);
         case 39:
            return new com.xy.a.q.Class6(this.a);
         case 40:
            return new com.xy.a.Class19(this.a);
         case 41:
            return new com.xy.a.w.Class19(this.a);
         case 42:
            return new com.xy.a.Class1(this.a);
         case 43:
            return new com.xy.a.a.Class33(this.a);
         case 44:
            return new Class90(this.a);
         case 45:
            return new com.xy.a.Class7(this.a);
         case 46:
            return new com.xy.a.Class48(this.a);
         case 47:
            return new com.xy.a.a.Class6(this.a);
         case 48:
            return new Class98(this.a);
         case 50:
            return new Class63(this.a);
         case 51:
            return new com.xy.a.q.Class23(this.a);
         case 52:
            return new Class116(this.a);
         case 54:
            return new com.xy.a.w.Class0(this.a);
         case 55:
            return new com.xy.a.q.Class63(this.a);
         case 56:
            return new com.xy.a.Class52(this.a);
         case 59:
            return new Class83(this.a);
         case 60:
            return new Class134(this.a);
         case 61:
            return new com.xy.a.q.Class57(this.a);
         case 62:
            return new Class88(this.a);
         case 63:
            return new com.xy.a.i.Class5(this.a);
         case 64:
            return new com.xy.a.i.Class14(this.a);
         case 65:
            return new com.xy.a.i.Class15(this.a);
         case 66:
            return new Class106(this.a);
         case 67:
            return new Class62(this.a);
         case 68:
            return new Class112(this.a);
         case 70:
            return new Class117(this.a);
         case 71:
            return new com.xy.a.q.Class59(this.a);
         case 74:
            return new com.xy.a.i.Class1(this.a);
         case 75:
            return new Class78(this.a);
         case 76:
            return new Class65(this.a);
         case 77:
            return new Class103(this.a);
         case 81:
            return new com.xy.a.w.Class11(this.a);
         case 82:
            return new com.xy.a.w.Class4(this.a);
         case 83:
            return new com.xy.a.w.Class18(this.a);
         case 84:
            return new Class105(this.a);
         case 85:
            return new com.xy.a.q.Class41(this.a);
         case 87:
            return new Class101(this.a);
         case 88:
            return new Class82(this.a);
         case 89:
            return new com.xy.a.q.Class103(this.a);
         case 91:
            return new Class97(this.a);
         case 92:
            return new com.xy.a.q.Class45(this.a);
         case 94:
            return new Class94(this.a);
         case 95:
            return new com.xy.a.a.Class19(this.a);
         case 96:
            return new com.xy.a.a.Class25(this.a);
         case 97:
            return new com.xy.a.a.Class43(this.a);
         case 98:
            return new Class111(this.a);
         case 100:
            return new com.xy.a.q.Class8(this.a);
         case 101:
            return new com.xy.a.q.Class55(this.a);
         case 102:
            return new com.xy.a.q.Class47(this.a);
         case 103:
            return new com.xy.a.q.Class35(this.a);
         case 104:
            return new com.xy.a.Class23(this.a);
         case 105:
            return new com.xy.a.a.Class38(this.a);
         case 106:
            return new com.xy.a.w.Class28(this.a);
         case 108:
            return new com.xy.a.q.Class11(this.a);
         case 112:
            return new com.xy.a.q.Class43(this.a);
         case 113:
            return new com.xy.a.Class47(this.a);
         case 114:
            return new com.xy.a.Class44(this.a);
         case 115:
            return new com.xy.a.a.Class12(this.a);
         case 116:
            return new com.xy.a.a.Class5(this.a);
         case 117:
            return new Class93(this.a);
         case 118:
            return new com.xy.a.q.Class42(this.a);
         case 119:
            return new com.xy.a.q.Class44(this.a);
         case 120:
            return new com.xy.a.Class28(this.a);
         case 121:
            return new Class142(this.a);
         case 122:
            return new Class67(this.a);
         case 123:
            return new com.xy.a.w.Class3(this.a);
         case 124:
            return new Class104(this.a);
         case 125:
            return new Class70(this.a);
         case 126:
            return new Class86(this.a);
         case 127:
            return new Class87(this.a);
         case 128:
            return new com.xy.a.q.Class98(this.a);
         case 129:
            return new Class92(this.a);
         case 130:
            return new com.xy.a.Class27(this.a);
         case 131:
            return new Class85(this.a);
         case 132:
            return new com.xy.a.w.Class17(this.a);
         case 133:
            return new com.xy.a.q.Class49(this.a);
         case 134:
            return new com.xy.a.q.Class39(this.a);
         case 135:
            return new com.xy.a.q.Class19(this.a);
         case 136:
            return new Class81(this.a);
         case 137:
            return new com.xy.a.i.Class22(this.a);
         case 138:
            return new com.xy.a.i.Class42(this.a);
         case 139:
            return new com.xy.a.i.Class38(this.a);
         case 140:
            return new com.xy.a.i.Class24(this.a);
         case 141:
            return new com.xy.a.i.Class3(this.a);
         case 142:
            return new com.xy.a.i.Class28(this.a);
         case 143:
            return new com.xy.a.i.Class9(this.a);
         case 144:
            return new com.xy.a.i.Class47(this.a);
         case 145:
            return new com.xy.a.Class41(this.a);
         case 146:
            return new com.xy.a.a.Class42(this.a);
         case 147:
            return new com.xy.a.a.Class30(this.a);
         case 150:
            return new Class89(this.a);
         case 151:
            return new com.xy.a.Class97(this.a);
         case 152:
            return new Class127(this.a);
         case 153:
            return new Class107(this.a);
         case 154:
            return new com.xy.a.Class26(this.a);
         case 155:
            return new Class100(this.a);
         case 156:
            return new com.xy.a.Class29(this.a);
         case 157:
            return new Class132(this.a);
         case 158:
            return new Class138(this.a);
         case 159:
            return new com.xy.a.Class51(this.a);
         case 160:
            return new com.xy.a.Class56(this.a);
         case 161:
            return new com.xy.a.Class40(this.a);
         case 162:
            return new com.xy.a.a.Class44(this.a);
         case 163:
            return new com.xy.a.a.Class50(this.a);
         case 164:
            return new com.xy.a.i.Class10(this.a);
         case 165:
            return new com.xy.a.i.Class6(this.a);
         case 166:
            return new com.xy.a.i.Class11(this.a);
         case 167:
            return new com.xy.a.v.Class39(this.a);
         case 168:
            return new com.xy.a.v.Class30(this.a);
         case 169:
            return new com.xy.a.v.Class46(this.a);
         case 170:
            return new Class73(this.a);
         case 171:
            return new com.xy.a.a.Class34(this.a);
         case 172:
            return new com.xy.a.a.Class53(this.a);
         case 173:
            return new com.xy.a.a.Class18(this.a);
         case 174:
            return new com.xy.a.a.Class22(this.a);
         case 175:
            return new com.xy.a.q.Class13(this.a);
         case 176:
            return new com.xy.a.v.Class27(this.a);
         case 177:
            return new com.xy.a.v.Class8(this.a);
         case 178:
            return new com.xy.a.v.Class34(this.a);
         case 179:
            return new com.xy.a.v.Class7(this.a);
         case 180:
            return new com.xy.a.Class17(this.a);
         case 181:
            return new com.xy.a.Class117(this.a);
         case 182:
            return new Class80(this.a);
         case 183:
            return new com.xy.a.w.Class22(this.a);
         case 184:
            return new com.xy.a.w.Class13(this.a);
         case 185:
            return new com.xy.a.w.Class6(this.a);
         case 186:
            var2 = new com.xy.a.v.Class24(this.a);
         case 5:
         case 15:
         case 16:
         case 19:
         case 21:
         case 24:
         case 31:
         case 33:
         case 35:
         case 49:
         case 53:
         case 57:
         case 58:
         case 69:
         case 72:
         case 73:
         case 78:
         case 79:
         case 80:
         case 86:
         case 90:
         case 93:
         case 99:
         case 107:
         case 109:
         case 110:
         case 111:
         case 148:
         case 149:
         default:
            return var2;
      }
   }

   public void h(int var1) {
      this.j(var1).n(6);
      this.b(var1);
   }

   public void i() {
      if (this.a.isVisible() && this.a.gameFrame.isFocused()) {
         if (this.a.getBaseView().ty().isFocusOwner()) {
            return;
         }

         com.xy.a.Class52 var1;
         if ((var1 = (com.xy.a.Class52)this.l(56)) != null && var1.su().isFocusOwner()) {
            return;
         }

         this.a.getBaseView().ty().requestFocus();
      }
   }

   public Class30 j(int var1) {
      Integer var2;
      if ((var2 = this.c.get(var1)) != null) {
         return this.b.get(var2);
      } else {
         Class30 var3;
         if ((var3 = this.g(var1)) == null) {
            return null;
         } else {
            this.b.add(var3);
            this.c.put(var3.lj(), this.b.size() - 1);
            return var3;
         }
      }
   }

   public void k(int var1) {
      if (this.a.isDraw) {
         if (var1 == 6 || this.l(6) == null) {
            if (var1 == 18 || this.l(18) == null) {
               if (var1 == 47 || this.l(47) == null) {
                  if (var1 == 67 || this.l(67) == null) {
                     this.a.e();
                  }
               }
            }
         }
      }
   }

   public Class30 l(int var1) {
      Class30 var2;
      return (var2 = this.n(var1)) != null && var2.isVisible() ? var2 : null;
   }

   public static String m(String var0) {
      int var10000 = (2 ^ 5) << 4 ^ 3;
      int var10001 = (2 ^ 5) << 4 ^ 2 ^ 5;
      int var10002 = 5 << 4 ^ 5;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var3;
      int var10 = var3 = var10003 - 1;
      char[] var1 = var10005;
      int var4 = var10002;
      var10000 = var10;

      for (int var2 = var10000; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         int var11 = var5.charAt(var3);
         var3--;
         var1[var10001] = (char)(var11 ^ var2);
         if (var3 < 0) {
            break;
         }

         var11 = var3--;
         var1[var11] = (char)(var5.charAt(var11) ^ var4);
      }

      return new String(var1);
   }

   public Class30 n(int var1) {
      Integer var2;
      return (var2 = this.c.get(var1)) != null ? this.b.get(var2) : null;
   }

   public void o() {
      Class48 var10000 = this.d();
      var10000.cc(this.a.screenData.getScreen_x(), this.a.screenData.getScreen_y());
      var10000.l();
   }
}
