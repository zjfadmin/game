package com.xy.v;

import com.xy.battle.BattleConnection;
import com.xy.battle.BattleScene;
import com.xy.formula.Ql;
import com.xy.richtext.RichLabel;
import com.xy.text.GameEDTRunnable;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Class27 {
   private static long a = 844424930131968L;
   private static Class19<Map<String, Double>> b = new Class19<>();
   private static Class19<Ql> c = new Class19<>();
   private static Class19<GameEDTRunnable> d = new Class19<>();
   private static LinkedList<BattleScene> e = new LinkedList<>();
   private static ConcurrentHashMap<Integer, Class8> f = new ConcurrentHashMap<>();
   private static long g = 562949953421312L;
   private static Class19<RichLabel> h = new Class19<>();
   private static BattleScene i;
   private static long j = 281474976710656L;

   public static Ql a() {
      Ql var0;
      return (var0 = c.a()) != null ? var0 : new Ql();
   }

   public static BattleScene b(BattleConnection var0) {
      synchronized (e) {
         BattleScene var2 = i;
         i = null;
         if (var2 == null) {
            var2 = new BattleScene();
         }

         var2.ac(var0);
         e.add(var2);
         return var2;
      }
   }

   public static LinkedList<BattleScene> c() {
      return e;
   }

   public static Map<String, Double> d() {
      Map var0;
      return (Map<String, Double>)((var0 = b.a()) != null ? var0 : new HashMap<>());
   }

   public static BattleScene e(long var0) {
      if (var0 == 0L) {
         return null;
      } else {
         Iterator var3;
         for (Iterator var10000 = var3 = e.iterator(); var10000.hasNext(); var10000 = var3) {
            BattleScene var2;
            if ((var2 = (BattleScene)var3.next()).getBattleId() == var0) {
               return var2;
            }
         }

         return null;
      }
   }

   public static void f(RichLabel var0) {
      if (var0 != null) {
         var0.clear();
         h.b(var0);
      }
   }

   public static void g(GameEDTRunnable var0) {
      var0.g();
      d.b(var0);
   }

   public static Class8 h(int var0) {
      return f.get(var0);
   }

   public static GameEDTRunnable i() {
      GameEDTRunnable var0;
      if ((var0 = d.a()) == null) {
         var0 = new GameEDTRunnable();
      }

      return var0;
   }

   public static RichLabel j(String var0, Font var1, int var2) {
      RichLabel var3;
      if ((var3 = h.a()) == null) {
         return var2 == 0 ? new RichLabel(var0, var1) : new RichLabel(var0, var1, var2);
      } else {
         var3.setFont(var1);
         if (var2 == 0) {
            var3.setText(var0);
            return var3;
         } else {
            var3.setTextSize(var0, var2);
            return var3;
         }
      }
   }

   public static void k(Map<String, Double> var0) {
      var0.clear();
      b.b(var0);
   }

   public static Class8 l(int var0, String var1, int var2) {
      synchronized (f) {
         Class8 var4;
         if ((var4 = h(var0)) != null) {
            return var4;
         } else {
            f.put(var0, var4 = new Class8(var0, var1, var2));
            return var4;
         }
      }
   }

   public static void m(Ql var0) {
      var0.f();
      c.b(var0);
   }
}
