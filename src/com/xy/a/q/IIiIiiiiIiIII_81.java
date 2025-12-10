/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIIIiiiIiiII
 *  com.xy.a.q.IiIiIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.readbean.AlchemySet
 *  com.xy.readbean.AlchemyUnit
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Skill
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIIIIiiiIiiII;
import com.xy.a.q.IiIiIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.readbean.AlchemySet;
import com.xy.readbean.AlchemyUnit;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.util.LinkedList;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiIII
extends iIiIIiiiIiiiI {
    private int iIiIiiiiIiIii;
    final /* synthetic */ IiIiIiiiiIIiI IiIIIiiiiIiiI;
    private IIIIIiiiIiiII[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(Goodstable good, AlchemySet alchemySetSHS) {
        if (good == null) {
            this.ALLATORIxDEMO(0, 0);
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        String IiiiiiiiIIIII4 = good.getValue();
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4.length()) {
            int IiiiiiiiIIIII7;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4.indexOf("|", IiiiiiiiIIIII5 + 1);
            if (IiiiiiiiIIIII6 == -1) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII4.length();
            }
            if ((IiiiiiiiIIIII7 = IiiiiiiiIIIII4.indexOf("=", IiiiiiiiIIIII5 + 1)) != -1 && IiiiiiiiIIIII7 <= IiiiiiiiIIIII6) {
                String IiiiiiiiIIIII8 = IiiiiiiiIIIII4.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII7);
                if (IiiiiiiiIIIII8.equals("\u7b49\u7ea7")) {
                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII4, (int)(IiiiiiiiIIIII7 + 1), (int)IiiiiiiiIIIII6);
                } else if (!IiiiiiiiIIIII8.equals("\u8010\u4e45")) {
                    if (IiiiiiiiIIIII8.equals("\u6280\u80fd")) {
                        if (IiiiiiiiIIIII3 < 2) {
                            IiiiiiiiIIIII5 = IiiiiiiiIIIII7 + 1;
                            IiiiiiiiIIIII7 = IiiiiiiiIIIII4.indexOf("#", IiiiiiiiIIIII5 + 1);
                            int IiiiiiiiIIIII9 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII7);
                            int IiiiiiiiIIIII10 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII4, (int)(IiiiiiiiIIIII7 + 1), (int)IiiiiiiiIIIII6);
                            this.iiIiiiiiiiIii[5 + IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII9, IiiiiiiiIIIII10, this.IiIIIiiiiIiiI.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII9)));
                        }
                        ++IiiiiiiiIIIII3;
                    } else {
                        if (IiiiiiiiIIIII2 < 5) {
                            double IiiiiiiiIIIII11 = Double.parseDouble(IiiiiiiiIIIII4.substring(IiiiiiiiIIIII7 + 1, IiiiiiiiIIIII6));
                            this.iiIiiiiiiiIii[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII8, IiiiiiiiIIIII11, alchemySetSHS.getAlchemyUnit(IiiiiiiiIIIII8));
                        }
                        ++IiiiiiiiIIIII2;
                    }
                }
            }
            IiiiiiiiIIIII5 = IiiiiiiiIIIII6 + 1;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
        this.iIiIiiiiIiIii = IiiiiiiiIIIII;
        if (this.ALLATORIxDEMO == 0) {
            IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI)[2].setText(String.valueOf(IiiiiiiiIIIII));
        } else {
            IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI)[3].setText(String.valueOf(IiiiiiiiIIIII));
        }
        IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI)[4].setText(IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).iIiIiiiiIiIii > 0 && IiIiIiiiiIIiI.iIiIiiiiIIiii((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).iIiIiiiiIiIii > 0 ? String.valueOf(Math.max(0, IiIiIiiiiIIiI.iIiIiiiiIIiii((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).iIiIiiiiIiIii - IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).iIiIiiiiIiIii + 2)) : "");
    }

    public void ALLATORIxDEMO(int value) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.iiIiiiiiiiIii[IiiiiiiiIIIII], ((value >> IiiiiiiiIIIII & 1) == 1 ? 1 : 0) != 0);
            ++IiiiiiiiIIIII;
        }
    }

    public int ALLATORIxDEMO(int index, String key1, int key2) {
        int IiiiiiiiIIIII = index < 5 ? 0 : 5;
        int IiiiiiiiIIIII2 = index < 5 ? 5 : this.iiIiiiiiiiIii.length;
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2) {
            if (index < 5 && IIiiIiiiiIIiI.ALLATORIxDEMO((String)IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.iiIiiiiiiiIii[IiiiiiiiIIIII3]), (String)key1)) {
                return IiiiiiiiIIIII3;
            }
            if (index >= 5 && IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.iiIiiiiiiiIii[IiiiiiiiIIIII3]) == key2) {
                return IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII3;
        }
        return -1;
    }

    static /* synthetic */ IIIIIiiiIiiII[] ALLATORIxDEMO(IIiIiiiiIiIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ int ALLATORIxDEMO(IIiIiiiiIiIII arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    public void iIiIiiiiIIiii() {
        int IiiiiiiiIIIII;
        AlchemySet IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        int IiiiiiiiIIIII3 = IiIiIiiiiIIiI.iiiiiiiiIIiii();
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII3 + (IiiiiiiiIIIII = IiIiIiiiiIIiI.iIiIiiiiIIiIi()) * 2;
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII4 <= 4 ? 1 : (IiiiiiiiIIIII4 <= 8 ? 2 : 3);
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        LinkedList<String> IiiiiiiiIIIII8 = new LinkedList<String>();
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII3 > 0 && IiiiiiiiIIIII9 < 2999) {
            AlchemyUnit IiiiiiiiIIIII10 = IiiiiiiiIIIII2.ALLATORIxDEMO();
            if (!IiiiiiiiIIIII8.contains(IiiiiiiiIIIII10.getKey())) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII6].ALLATORIxDEMO(IiiiiiiiIIIII10.getKey(), IiiiiiiiIIIII10.getDoubleByMax(5, 20), IiiiiiiiIIIII10);
                --IiiiiiiiIIIII3;
                IiiiiiiiIIIII8.add(IiiiiiiiIIIII10.getKey());
                ++IiiiiiiiIIIII6;
            }
            ++IiiiiiiiIIIII9;
        }
        IiiiiiiiIIIII8.clear();
        IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII > 0 && IiiiiiiiIIIII9 < 2999) {
            int IiiiiiiiIIIII11 = 2101 + IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(46);
            String IiiiiiiiIIIII12 = String.valueOf(IiiiiiiiIIIII11);
            Skill IiiiiiiiIIIII13 = this.IiIIIiiiiIiiI.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII12);
            if (IiiiiiiiIIIII13 != null && !IiiiiiiiIIIII8.contains(IiiiiiiiIIIII12)) {
                int IiiiiiiiIIIII14 = IiIiIiiiiIIiI.iiiIiiiiiiIIi();
                --IiiiiiiiIIIII;
                this.iiIiiiiiiiIii[5 + IiiiiiiiIIIII7].ALLATORIxDEMO(IiiiiiiiIIIII11, IiiiiiiiIIIII14, IiiiiiiiIIIII13);
                ++IiiiiiiiIIIII7;
            }
            ++IiiiiiiiIIIII9;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII6, IiiiiiiiIIIII7);
    }

    public void ALLATORIxDEMO() {
        int IiiiiiiiIIIII = Math.max(0, IiIiIiiiiIIiI.iIiIiiiiIIiii((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).iIiIiiiiIiIii - IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).iIiIiiiiIiIii + 2);
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < 2999 && IiiiiiiiIIIII > 0) {
            int IiiiiiiiIIIII4 = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(7);
            if ((IiiiiiiiIIIII2 >> IiiiiiiiIIIII4 & 1) != 1) {
                --IiiiiiiiIIIII;
                IiiiiiiiIIIII2 |= 1 << IiiiiiiiIIIII4;
            }
            ++IiiiiiiiIIIII3;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(String value, AlchemySet alchemySetSHS) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < value.length()) {
            String IiiiiiiiIIIII5;
            int IiiiiiiiIIIII6;
            IiiiiiiiIIIII4 = value.indexOf("|", IiiiiiiiIIIII3 + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = value.length();
            }
            if ((IiiiiiiiIIIII6 = value.indexOf("=", IiiiiiiiIIIII3 + 1)) != -1 && IiiiiiiiIIIII6 <= IiiiiiiiIIIII4 && !(IiiiiiiiIIIII5 = value.substring(IiiiiiiiIIIII3, IiiiiiiiIIIII6)).equals("\u7b49\u7ea7") && !IiiiiiiiIIIII5.equals("\u8010\u4e45")) {
                if (IiiiiiiiIIIII5.equals("\u6280\u80fd")) {
                    if (IiiiiiiiIIIII2 < 2) {
                        IiiiiiiiIIIII3 = IiiiiiiiIIIII6 + 1;
                        IiiiiiiiIIIII6 = value.indexOf("#", IiiiiiiiIIIII3 + 1);
                        int IiiiiiiiIIIII7 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)IiiiiiiiIIIII3, (int)IiiiiiiiIIIII6);
                        int IiiiiiiiIIIII8 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII6 + 1), (int)IiiiiiiiIIIII4);
                        this.iiIiiiiiiiIii[5 + IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII7, IiiiiiiiIIIII8, this.IiIIIiiiiIiiI.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII7)));
                    }
                    ++IiiiiiiiIIIII2;
                } else {
                    if (IiiiiiiiIIIII < 5) {
                        double IiiiiiiiIIIII9 = Double.parseDouble(value.substring(IiiiiiiiIIIII6 + 1, IiiiiiiiIIIII4));
                        this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII9, alchemySetSHS.getAlchemyUnit(IiiiiiiiIIIII5));
                    }
                    ++IiiiiiiiIIIII;
                }
            }
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4 + 1;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2);
    }

    public IIiIiiiiIiIII(IiIiIiiiiIIiI iiIiIiiiiIIiI, int index) {
        this.IiIIIiiiiIiiI = iiIiIiiiiIIiI;
        this.ALLATORIxDEMO = index;
        this.iiIiiiiiiiIii = new IIIIIiiiIiiII[7];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIIIiiiIiiII(iiIiIiiiiIIiI, IiiiiiiiIIIII);
            if (IiiiiiiiIIIII < 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(0, 15 + 27 * IiiiiiiiIIIII, 257, 35);
            } else {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(0, 163 + 27 * (IiiiiiiiIIIII - 5), 257, 35);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI("sc/d/179.png");
        this.IiiiiiiiIIIII.setBounds(0, 0, 257, 248);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(int v1, int v2) {
        this.iIiIiiiiIiIii = 0;
        int IiiiiiiiIIIII = v1;
        while (IiiiiiiiIIIII < 5) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII++].ALLATORIxDEMO();
        }
        IiiiiiiiIIIII = v2;
        while (IiiiiiiiIIIII < 2) {
            int n = 5 + IiiiiiiiIIIII;
            ++IiiiiiiiIIIII;
            this.iiIiiiiiiiIii[n].ALLATORIxDEMO();
        }
    }
}
