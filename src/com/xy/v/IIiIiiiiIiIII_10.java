/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleConnection
 *  com.xy.battle.BattleScene
 *  com.xy.formula.Ql
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameEDTRunnable
 *  com.xy.v.IIIIIiiiIiiII
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.v;

import com.xy.battle.BattleConnection;
import com.xy.battle.BattleScene;
import com.xy.formula.Ql;
import com.xy.richtext.RichLabel;
import com.xy.text.GameEDTRunnable;
import com.xy.v.IIIIIiiiIiiII;
import com.xy.v.IiiiiiiiiIIII;
import java.awt.Font;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiiIiIII {
    private static long iiIiIiiiiIIIi;
    private static IIIIIiiiIiiII<Map<String, Double>> iiiiIiiiIiiII;
    private static IIIIIiiiIiiII<Ql> iiiIiiiiiiiIi;
    private static IIIIIiiiIiiII<GameEDTRunnable> iIiiIiiiiiiII;
    private static LinkedList<BattleScene> IIiiIiiiIIiIi;
    private static ConcurrentHashMap<Integer, IiiiiiiiiIIII> iIiIiiiiIiIii;
    private static long IiIIIiiiiIiiI;
    private static IIIIIiiiIiiII<RichLabel> iiIiiiiiiiIii;
    private static BattleScene IiiiiiiiIIIII;
    private static long ALLATORIxDEMO;

    public static Ql ALLATORIxDEMO() {
        Ql IiiiiiiiIIIII = (Ql)iiiIiiiiiiiIi.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) return new Ql();
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static BattleScene ALLATORIxDEMO(BattleConnection connection) {
        LinkedList<BattleScene> linkedList = IIiiIiiiIIiIi;
        synchronized (linkedList) {
            BattleScene IiiiiiiiIIIII = IIiIiiiiIiIII.IiiiiiiiIIIII;
            IIiIiiiiIiIII.IiiiiiiiIIIII = null;
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new BattleScene();
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(connection);
            IIiiIiiiIIiIi.add(IiiiiiiiIIIII);
            return IiiiiiiiIIIII;
        }
    }

    public static LinkedList<BattleScene> ALLATORIxDEMO() {
        return IIiiIiiiIIiIi;
    }

    public static Map<String, Double> ALLATORIxDEMO() {
        Map IiiiiiiiIIIII = (Map)iiiiIiiiIiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) return new HashMap<String, Double>();
        return IiiiiiiiIIIII;
    }

    public static BattleScene ALLATORIxDEMO(long id) {
        if (id == 0L) {
            return null;
        }
        for (BattleScene IiiiiiiiIIIII : IIiiIiiiIIiIi) {
            if (IiiiiiiiIIIII.getBattleId() != id) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    static {
        ALLATORIxDEMO = 0x1000000000000L;
        IiIIIiiiiIiiI = 0x2000000000000L;
        iiIiIiiiiIIIi = 0x3000000000000L;
        iiIiiiiiiiIii = new IIIIIiiiIiiII();
        iIiiIiiiiiiII = new IIIIIiiiIiiII();
        iIiIiiiiIiIii = new ConcurrentHashMap();
        IIiiIiiiIIiIi = new LinkedList();
        iiiIiiiiiiiIi = new IIIIIiiiIiiII();
        iiiiIiiiIiiII = new IIIIIiiiIiiII();
    }

    public static void ALLATORIxDEMO(RichLabel richLabel) {
        if (richLabel == null) {
            return;
        }
        richLabel.clear();
        iiIiiiiiiiIii.ALLATORIxDEMO((Object)richLabel);
    }

    public static void ALLATORIxDEMO(GameEDTRunnable runnable) {
        runnable.ALLATORIxDEMO();
        iIiiIiiiiiiII.ALLATORIxDEMO((Object)runnable);
    }

    public static IiiiiiiiiIIII ALLATORIxDEMO(int areaId) {
        return iIiIiiiiIiIii.get(areaId);
    }

    public static GameEDTRunnable ALLATORIxDEMO() {
        GameEDTRunnable IiiiiiiiIIIII = (GameEDTRunnable)iIiiIiiiiiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new GameEDTRunnable();
        return IiiiiiiiIIIII;
    }

    public static RichLabel ALLATORIxDEMO(String text, Font font, int size) {
        RichLabel IiiiiiiiIIIII = (RichLabel)iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            if (size != 0) return new RichLabel(text, font, size);
            return new RichLabel(text, font);
        }
        IiiiiiiiIIIII.setFont(font);
        RichLabel richLabel = IiiiiiiiIIIII;
        if (size == 0) {
            richLabel.setText(text);
            return IiiiiiiiIIIII;
        }
        richLabel.setTextSize(text, size);
        return IiiiiiiiIIIII;
    }

    public static void ALLATORIxDEMO(Map<String, Double> map) {
        map.clear();
        iiiiIiiiIiiII.ALLATORIxDEMO(map);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static IiiiiiiiiIIII ALLATORIxDEMO(int areaId, String ip, int portWeb) {
        ConcurrentHashMap<Integer, IiiiiiiiiIIII> concurrentHashMap = iIiIiiiiIiIii;
        synchronized (concurrentHashMap) {
            IiiiiiiiiIIII IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO(areaId);
            if (IiiiiiiiIIIII != null) {
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = new IiiiiiiiiIIII(areaId, ip, portWeb);
            iIiIiiiiIiIii.put(areaId, IiiiiiiiIIIII);
            return IiiiiiiiIIIII;
        }
    }

    public static void ALLATORIxDEMO(Ql ql) {
        ql.ALLATORIxDEMO();
        iiiIiiiiiiiIi.ALLATORIxDEMO((Object)ql);
    }
}
