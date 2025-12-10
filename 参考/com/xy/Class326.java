package com.xy;

import com.xy.text.GameView;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class326 {
   private Class79 a;
   private List<Class345> b;
   private Map<Integer, Integer> c;
   private GameView d;

   public void a(int var1) {
      Class345 var2;
      if ((var2 = this.e(var1)) != null) {
         var2.q();
         if (var2.isVisible()) {
            if (var2.tp() == --3 || var2.tp() == (15 & 118)) {
               this.j();
            }

            this.h(var1);
         }
      }
   }

   public void b() {
      if (this.d.isVisible() && this.d.gameFrame.isFocused()) {
         if (this.d.getBaseView().jj().isFocusOwner()) {
            return;
         }

         Class494 var1;
         if ((var1 = (Class494)this.m(56 & 127)) != null && var1.ajf().isFocusOwner()) {
            return;
         }

         this.d.getBaseView().jj().requestFocus();
      }

   }

   public Class345 c(int var1) {
      Class372 var2 = null;
      switch(var1) {
      case 0:
         return new Class145(this.d);
      case 1:
         return new Class237(this.d);
      case 2:
         return new Class433(this.d);
      case 3:
         return new Class624(this.d);
      case 4:
         return new Class637(this.d);
      case 6:
         return new Class264(this.d);
      case 7:
         return new Class199(this.d);
      case 8:
         return new Class207(this.d);
      case 9:
         return new Class62(this.d);
      case 10:
         return new Class410(this.d);
      case 11:
         return new Class53(this.d);
      case 12:
         return new Class381(this.d);
      case 13:
         return new Class520(this.d);
      case 14:
         return new Class674(this.d);
      case 17:
         return new Class429(this.d);
      case 18:
         return new Class683(this.d);
      case 20:
         return new Class287(this.d);
      case 22:
         return new Class49(this.d);
      case 23:
         return new Class684(this.d);
      case 25:
         return new Class200(this.d);
      case 26:
         return new Class108(this.d);
      case 27:
         return new Class472(this.d);
      case 28:
         return new Class15(this.d);
      case 29:
         return new Class242(this.d);
      case 30:
         return new Class26(this.d);
      case 32:
         return new Class289(this.d);
      case 34:
         return new Class35(this.d);
      case 36:
         return new Class474(this.d);
      case 37:
         return new Class432(this.d);
      case 38:
         return new Class131(this.d);
      case 39:
         return new Class174(this.d);
      case 40:
         return new Class665(this.d);
      case 41:
         return new Class688(this.d);
      case 42:
         return new Class106(this.d);
      case 43:
         return new Class31(this.d);
      case 44:
         return new Class570(this.d);
      case 45:
         return new Class73(this.d);
      case 46:
         return new Class270(this.d);
      case 47:
         return new Class45(this.d);
      case 48:
         return new Class490(this.d);
      case 50:
         return new Class328(this.d);
      case 51:
         return new Class359(this.d);
      case 52:
         return new Class314(this.d);
      case 54:
         return new Class313(this.d);
      case 55:
         return new Class164(this.d);
      case 56:
         return new Class494(this.d);
      case 59:
         return new Class483(this.d);
      case 60:
         return new Class1(this.d);
      case 61:
         return new Class595(this.d);
      case 62:
         return new Class84(this.d);
      case 63:
         return new Class407(this.d);
      case 64:
         return new Class263(this.d);
      case 65:
         return new Class218(this.d);
      case 66:
         return new Class0(this.d);
      case 67:
         return new Class47(this.d);
      case 68:
         return new Class81(this.d);
      case 70:
         return new Class583(this.d);
      case 71:
         return new Class40(this.d);
      case 74:
         return new Class86(this.d);
      case 75:
         return new Class83(this.d);
      case 76:
         return new Class304(this.d);
      case 77:
         return new Class212(this.d);
      case 81:
         return new Class564(this.d);
      case 82:
         return new Class371(this.d);
      case 83:
         return new Class85(this.d);
      case 84:
         return new Class312(this.d);
      case 85:
         return new Class347(this.d);
      case 87:
         return new Class657(this.d);
      case 88:
         return new Class423(this.d);
      case 89:
         return new Class21(this.d);
      case 91:
         return new Class185(this.d);
      case 92:
         return new Class110(this.d);
      case 94:
         return new Class229(this.d);
      case 95:
         return new Class95(this.d);
      case 96:
         return new Class545(this.d);
      case 97:
         return new Class649(this.d);
      case 98:
         return new Class645(this.d);
      case 100:
         return new Class376(this.d);
      case 101:
         return new Class620(this.d);
      case 102:
         return new Class476(this.d);
      case 103:
         return new Class420(this.d);
      case 104:
         return new Class573(this.d);
      case 105:
         return new Class135(this.d);
      case 106:
         return new Class544(this.d);
      case 108:
         return new Class484(this.d);
      case 112:
         return new Class559(this.d);
      case 113:
         return new Class675(this.d);
      case 114:
         return new Class439(this.d);
      case 115:
         return new Class466(this.d);
      case 116:
         return new Class54(this.d);
      case 117:
         return new Class622(this.d);
      case 118:
         return new Class208(this.d);
      case 119:
         return new Class309(this.d);
      case 120:
         return new Class419(this.d);
      case 121:
         return new Class605(this.d);
      case 122:
         return new Class204(this.d);
      case 123:
         return new Class473(this.d);
      case 124:
         return new Class392(this.d);
      case 125:
         return new Class147(this.d);
      case 126:
         return new Class669(this.d);
      case 127:
         return new Class144(this.d);
      case 128:
         return new Class508(this.d);
      case 129:
         return new Class599(this.d);
      case 130:
         return new Class273(this.d);
      case 131:
         return new Class258(this.d);
      case 132:
         return new Class259(this.d);
      case 133:
         return new Class138(this.d);
      case 134:
         return new Class284(this.d);
      case 135:
         return new Class653(this.d);
      case 136:
         return new Class234(this.d);
      case 137:
         return new Class551(this.d);
      case 138:
         return new Class247(this.d);
      case 139:
         return new Class588(this.d);
      case 140:
         return new Class391(this.d);
      case 141:
         return new Class459(this.d);
      case 142:
         return new Class181(this.d);
      case 143:
         return new Class538(this.d);
      case 144:
         return new Class67(this.d);
      case 145:
         return new Class107(this.d);
      case 146:
         return new Class301(this.d);
      case 147:
         return new Class621(this.d);
      case 150:
         return new Class535(this.d);
      case 151:
         return new Class77(this.d);
      case 152:
         return new Class130(this.d);
      case 153:
         return new Class9(this.d);
      case 154:
         return new Class119(this.d);
      case 155:
         return new Class426(this.d);
      case 156:
         return new Class418(this.d);
      case 157:
         return new Class4(this.d);
      case 158:
         return new Class632(this.d);
      case 159:
         return new Class566(this.d);
      case 160:
         return new Class120(this.d);
      case 161:
         return new Class458(this.d);
      case 162:
         return new Class670(this.d);
      case 163:
         return new Class680(this.d);
      case 164:
         return new Class65(this.d);
      case 165:
         return new Class232(this.d);
      case 166:
         return new Class660(this.d);
      case 167:
         return new Class316(this.d);
      case 168:
         return new Class694(this.d);
      case 169:
         return new Class503(this.d);
      case 170:
         return new Class166(this.d);
      case 171:
         return new Class567(this.d);
      case 172:
         return new Class329(this.d);
      case 173:
         return new Class99(this.d);
      case 174:
         return new Class172(this.d);
      case 175:
         return new Class428(this.d);
      case 176:
         return new Class94(this.d);
      case 177:
         return new Class257(this.d);
      case 178:
         return new Class667(this.d);
      case 179:
         return new Class525(this.d);
      case 180:
         return new Class518(this.d);
      case 181:
         return new Class682(this.d);
      case 182:
         return new Class448(this.d);
      case 183:
         return new Class225(this.d);
      case 184:
         return new Class627(this.d);
      case 185:
         return new Class451(this.d);
      case 186:
         return new Class214(this.d);
      case 187:
         return new Class395(this.d);
      case 188:
         return new Class687(this.d);
      case 189:
         return new Class118(this.d);
      case 190:
         return new Class300(this.d);
      case 191:
         return new Class134(this.d);
      case 192:
         return new Class275(this.d);
      case 193:
         var2 = new Class372(this.d);
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

   public Class326(GameView var1) {
      this.d = var1;
      this.b = new ArrayList();
      this.c = new HashMap();
   }

   public Class345 d(int var1) {
      Integer var2;
      return (var2 = (Integer)this.c.get(var1)) != null ? (Class345)this.b.get(var2) : null;
   }

   public Class345 e(int var1) {
      Integer var2;
      if ((var2 = (Integer)this.c.get(var1)) != null) {
         return (Class345)this.b.get(var2);
      } else {
         Class345 var3;
         if ((var3 = this.c(var1)) == null) {
            return null;
         } else {
            this.b.add(var3);
            this.c.put(var3.ae(), this.b.size() - (2 ^ 3));
            return var3;
         }
      }
   }


   private Class79 f() {
      if (this.a == null) {
         this.a = new Class79(this.d);
      }

      return this.a;
   }

   public void g(int var1) {
      if (this.d.isDraw) {
         if (var1 == (78 & 55) || this.m(86 & 47) == null) {
            if (var1 == (122 & 23) || this.m(94 & 51) == null) {
               if (var1 == (111 & 63) || this.m(111 & 63) == null) {
                  if (var1 == (67 & 127) || this.m(111 & 83) == null) {
                     this.d.s();
                  }
               }
            }
         }
      }
   }

   public void h(int var1) {
      Class345 var4;
      if ((var4 = this.d(var1)) != null) {
         this.b();
         if (var4.tp() == --3 || var4.tp() == (62 & 71)) {
            this.d.add(this.f(), 3 ^ 3);
         }

         this.d.add(var4, 5 >> 3);
         int var5 = 3 & 4;
         int var2 = this.d.getComponentCount() - (5 >> 2);

         for(int var10000 = var2; var10000 > var5; var10000 = var2) {
            Component var3;
            Class345 var7;
            if ((var3 = this.d.getComponent(var2)) instanceof Class345 && (var7 = (Class345)var3).tp() > var4.tp()) {
               ++var2;
               ++var5;
               this.d.add(var7, 2 & 5);
            }

            --var2;
         }

         Class345 var6 = var1 != (121 & 127) ? this.m(123 & 125) : null;
         if (var6 != null) {
            this.d.add(var6, 3 >> 1);
         }
      }

   }

   public void i(int var1) {
      this.e(var1).ab(22 & 111);
      this.a(var1);
   }

   public void j() {
      Class79 var10000 = this.f();
      var10000.cf(this.d.screenData.getScreen_x(), this.d.screenData.getScreen_y());
      var10000.q();
   }

   public void k() {
      Class79 var10001 = this.f();
      var10001.cf(this.d.screenData.getScreen_x(), this.d.screenData.getScreen_y());
      var10001.q();
      this.d.remove(this.f());
      this.d.add(this.f(), 3 ^ 3);
   }

   public void l() {
      this.f().t();
   }

   public Class345 m(int var1) {
      Class345 var2;
      return (var2 = this.d(var1)) != null && var2.isVisible() ? var2 : null;
   }

   public void n(int var1) {
      Class345 var2;
      if ((var2 = this.d(var1)) != null) {
         this.b();
         if (var2.t()) {
            this.l();
         }

         if (var1 == (7 & 126) || var1 == (59 & 86) || var1 == (111 & 63) || var1 == (87 & 107)) {
            this.g(var1);
         }

      }
   }
}
