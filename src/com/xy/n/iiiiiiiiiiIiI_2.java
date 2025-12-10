/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.FormulaNum
 *  com.xy.n.IIIIIiiiIiIii
 *  com.xy.readbean.Door
 *  com.xy.readbean.MapModel
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.n;

import com.xy.formula.FormulaNum;
import com.xy.n.IIIIIiiiIiIii;
import com.xy.readbean.Door;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import java.util.ArrayList;
import java.util.List;

public class iiiiiiiiiiIiI {
    private List<IIIIIiiiIiIii> IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(NpcInfoBean npcInfoBean, String way, IiiiiiiiiIIII objectArea) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 != way.length()) {
            IiiiiiiiIIIII3 = way.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = way.length();
            }
            FormulaNum IiiiiiiiIIIII4 = new FormulaNum(way.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            int IiiiiiiiIIIII5 = 0;
            int IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getSize();
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII6) {
                long IiiiiiiiIIIII7 = IiiiiiiiIIIII4.getZhi(IiiiiiiiIIIII5);
                Door IiiiiiiiIIIII8 = objectArea.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII7));
                if (IiiiiiiiIIIII8 != null) {
                    void IiiiiiiiIIIII9;
                    IIIIIiiiIiIii iIIIIiiiIiIii = new IIIIIiiiIiIii(1, Long.parseLong(npcInfoBean.getNpctable().getNpcid()), IiiiiiiiIIIII8);
                    IiiiiiiiIIIII9.IIiiIiiiIIiIi = this.ALLATORIxDEMO;
                    IiiiiiiiIIIII9.IiiiiiiiIIIII = Integer.parseInt(npcInfoBean.getNpctable().getTx());
                    iIIIIiiiIiIii.iiiiIiiiIiiII = Integer.parseInt(npcInfoBean.getNpctable().getTy());
                    if (this.IiiiiiiiIIIII == null) {
                        this.IiiiiiiiIIIII = new ArrayList<IIIIIiiiIiIii>();
                    }
                    this.IiiiiiiiIIIII.add((IIIIIiiiIiIii)IiiiiiiiIIIII9);
                }
                ++IiiiiiiiIIIII5;
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
    }

    public List<IIIIIiiiIiIii> ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public iiiiiiiiiiIiI(int mapId, IiiiiiiiiIIII objectArea) {
        NpcInfoBean IiiiiiiiIIIII;
        long IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3;
        int IiiiiiiiIIIII4;
        FormulaNum IiiiiiiiIIIII5;
        int IiiiiiiiIIIII6;
        int IiiiiiiiIIIII7;
        FormulaNum[] IiiiiiiiIIIII8;
        this.ALLATORIxDEMO = mapId;
        MapModel IiiiiiiiIIIII9 = objectArea.ALLATORIxDEMO(String.valueOf(mapId));
        if (IiiiiiiiIIIII9 == null) {
            return;
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII9.getMapDoor())) {
            IiiiiiiiIIIII8 = IiiiiiiiIIIII9.getMapDoor();
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII6 != IiiiiiiiIIIII8.length()) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII8.indexOf("|", IiiiiiiiIIIII7 + 1);
                if (IiiiiiiiIIIII6 == -1) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII8.length();
                }
                IiiiiiiiIIIII5 = new FormulaNum(IiiiiiiiIIIII8.substring(IiiiiiiiIIIII7, IiiiiiiiIIIII6));
                IiiiiiiiIIIII4 = 0;
                IiiiiiiiIIIII3 = IiiiiiiiIIIII5.getSize();
                while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3) {
                    int[] IiiiiiiiIIIII10;
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII5.getZhi(IiiiiiiiIIIII4);
                    IiiiiiiiIIIII = objectArea.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII2));
                    if (IiiiiiiiIIIII != null && (IiiiiiiiIIIII10 = IiiiiiiiIIIII.getRects()) != null) {
                        void IiiiiiiiIIIII11;
                        IIIIIiiiIiIii iIIIIiiiIiIii = new IIIIIiiiIiIii(0, IiiiiiiiIIIII2, (Door)IiiiiiiiIIIII);
                        IiiiiiiiIIIII11.IIiiIiiiIIiIi = mapId;
                        IiiiiiiiIIIII11.IiiiiiiiIIIII = (IiiiiiiiIIIII10[0] + IiiiiiiiIIIII10[1]) / 2;
                        iIIIIiiiIiIii.iiiiIiiiIiiII = (IiiiiiiiIIIII10[2] + IiiiiiiiIIIII10[3]) / 2;
                        if (this.IiiiiiiiIIIII == null) {
                            this.IiiiiiiiIIIII = new ArrayList<IIIIIiiiIiIii>();
                        }
                        this.IiiiiiiiIIIII.add((IIIIIiiiIiIii)IiiiiiiiIIIII11);
                    }
                    ++IiiiiiiiIIIII4;
                }
                IiiiiiiiIIIII7 = IiiiiiiiIIIII6 + 1;
            }
        }
        IiiiiiiiIIIII8 = IiiiiiiiIIIII9.getNpcs();
        IiiiiiiiIIIII7 = 0;
        IiiiiiiiIIIII6 = IiiiiiiiIIIII8 != null ? IiiiiiiiIIIII8.length : 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6) {
            IiiiiiiiIIIII5 = IiiiiiiiIIIII8[IiiiiiiiIIIII7];
            IiiiiiiiIIIII4 = 0;
            IiiiiiiiIIIII3 = IiiiiiiiIIIII5.getSize();
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII5.getZhi(IiiiiiiiIIIII4);
                IiiiiiiiIIIII = objectArea.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII2));
                if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getNpctable().getNpctype().equals("2")) {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII.getNpctable().getNpcway(), objectArea);
                }
                ++IiiiiiiiIIIII4;
            }
            ++IiiiiiiiIIIII7;
        }
    }
}
