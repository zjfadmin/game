/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.Coordinates
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.n.IIIIIiiiIiIii
 *  com.xy.n.IiiiIiiiiIiIi
 *  com.xy.n.iiiiiiiiiiIiI
 *  com.xy.readbean.MapModel
 *  com.xy.richtext.InputBean
 *  com.xy.script.ScriptEnd
 *  com.xy.script.ScriptOpen
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.n;

import com.xy.bean.Coordinates;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.n.IIIIIiiiIiIii;
import com.xy.n.IiiiIiiiiIiIi;
import com.xy.n.iiiiiiiiiiIiI;
import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.script.ScriptEnd;
import com.xy.script.ScriptOpen;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IIIiiiiiIiIiI {
    List<String> iIiiIiiiiiiII;
    List<IIIIIiiiIiIii> IIiiIiiiIIiIi;
    List<Integer> iIiIiiiiIiIii;
    List<IiiiIiiiiIiIi> IiIIIiiiiIiiI;
    List<Integer> iiIiiiiiiiIii;
    IiiiiiiiiIIII IiiiiiiiIIIII;
    Map<Integer, iiiiiiiiiiIiI> ALLATORIxDEMO = new HashMap<Integer, iiiiiiiiiiIiI>();

    public IIIiiiiiIiIiI(IiiiiiiiiIIII objectArea) {
        this.IiIIIiiiiIiiI = new ArrayList<IiiiIiiiiIiIi>();
        this.iIiIiiiiIiIii = new ArrayList<Integer>();
        this.IIiiIiiiIIiIi = new ArrayList<IIIIIiiiIiIii>();
        this.iiIiiiiiiiIii = new ArrayList<Integer>();
        this.iIiiIiiiiiiII = new ArrayList<String>();
        this.IiiiiiiiIIIII = objectArea;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public List<Object> ALLATORIxDEMO(int mapId, int x, int y, int z, int mapIdNew, int xNew, int yNew, int zNew, int access, RoleData roleData) {
        var11_11 = this;
        synchronized (var11_11) {
            block30: {
                block29: {
                    if (access == 1) {
                        IiiiiiiiIIIII = new ArrayList<Object>();
                        IiiiiiiiIIIII = new ScriptOpen(4, 0L, mapIdNew, xNew, yNew, zNew);
                        var14_16 = new ScriptEnd(mapIdNew, xNew, yNew, zNew);
                        IiiiiiiiIIIII.add(var14_16);
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                        return IiiiiiiiIIIII;
                    }
                    this.iIiIiiiiIiIii.clear();
                    this.IiIIIiiiiIiiI.clear();
                    this.ALLATORIxDEMO(mapId, x, y, z, roleData);
                    IiiiiiiiIIIII = null;
                    if (mapId == mapIdNew) break block29;
                    this.IiIIIiiiiIiiI.add(new IiiiIiiiiIiIi(mapId, x, y, z));
                    while (true) {
                        IiiiiiiiIIIII = this.IiIIIiiiiIiiI.get(0);
                        IiiiiiiiIIIII = this.IiIIIiiiiIiiI.size() - 1;
                        if (true) ** GOTO lbl30
                        break;
                    }
                    do {
                        if (IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)IiiiiiiiIIIII) > IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII))) {
                            IiiiiiiiIIIII = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII);
                        }
                        --IiiiiiiiIIIII;
lbl30:
                        // 2 sources

                    } while (IiiiiiiiIIIII >= 0);
                    this.IiIIIiiiiIiiI.remove(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII));
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                        IiiiiiiiIIIII = true;
                        IiiiiiiiIIIII = (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0) - 1;
                        while (IiiiiiiiIIIII >= 0) {
                            IiiiiiiiIIIII = (IIIIIiiiIiIii)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                            if (IiiiiiiiIIIII.IIIiiiiiiIIiI() != IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII)) {
                                if (IiiiiiiiIIIII && IiiiiiiiIIIII.IIIiiiiiiIIiI() == mapIdNew) {
                                    IiiiiiiiIIIII = false;
                                }
                                if (!(IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.IiiIiiiiiiIiI()) || IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.IIIiiiiiiIIiI()) || this.iIiIiiiiIiIii.contains(IiiiiiiiIIIII.IIIiiiiiiIIiI()))) {
                                    IiiiiiiiIIIII = new IiiiIiiiiIiIi(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                    this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII);
                                }
                            }
                            --IiiiiiiiIIIII;
                        }
                        if (IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII) == mapId) {
                            IiiiiiiiIIIII = this.IIiiIiiiIIiIi.size() - 1;
                            while (IiiiiiiiIIIII >= 0) {
                                IiiiiiiiIIIII = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
                                if (IiiiiiiiIIIII.IIIiiiiiiIIiI() != IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII)) {
                                    if (IiiiiiiiIIIII && IiiiiiiiIIIII.IIIiiiiiiIIiI() == mapIdNew) {
                                        IiiiiiiiIIIII = false;
                                    }
                                    if (!(IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.IiiIiiiiiiIiI()) || IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.IIIiiiiiiIIiI()) || this.iIiIiiiiIiIii.contains(IiiiiiiiIIIII.IIIiiiiiiIIiI()))) {
                                        IiiiiiiiIIIII = new IiiiIiiiiIiIi(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                        this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII);
                                    }
                                }
                                --IiiiiiiiIIIII;
                            }
                        }
                        if (IiiiiiiiIIIII) {
                            this.iIiIiiiiIiIii.add(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII));
                        }
                        IiiiiiiiIIIII = this.IiIIIiiiiIiiI.size() - 1;
                        while (IiiiiiiiIIIII >= 0) {
                            if (IiiiiiiiIIIII != null && IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)IiiiiiiiIIIII) <= IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII))) {
                                this.IiIIIiiiiIiiI.remove(IiiiiiiiIIIII);
                            } else if (IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII)) == mapIdNew) {
                                v1 = this;
                                IiiiiiiiIIIII = IiiiiiiiIIIII == null ? v1.IiIIIiiiiIiiI.get(IiiiiiiiIIIII) : v1.IiIIIiiiiIiiI.get(IiiiiiiiIIIII);
                            }
                            --IiiiiiiiIIIII;
                        }
                    }
                    if (this.IiIIIiiiiIiiI.size() != 0) ** continue;
                    break block30;
                }
                IiiiiiiiIIIII = new IiiiIiiiiIiIi(mapId, x, y, z);
            }
            if (IiiiiiiiIIIII == null) {
                return null;
            }
            IiiiiiiiIIIII = new ArrayList();
            IiiiiiiiIIIII = new ScriptOpen(xNew, yNew, zNew);
            IiiiiiiiIIIII = new ScriptEnd(mapIdNew, xNew, yNew, zNew);
            IiiiiiiiIIIII.add(IiiiiiiiIIIII);
            IiiiiiiiIIIII.add(IiiiiiiiIIIII);
            IiiiiiiiIIIII = new IiiiIiiiiIiIi(mapIdNew, xNew, yNew, zNew);
            IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII, (IiiiIiiiiIiIi)IiiiiiiiIIIII);
            while (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII) != null) {
                if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII) == null) {
                    if (IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII) == IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII))) {
                        IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII), IiiiiiiiIIIII);
                        IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, (List<Object>)IiiiiiiiIIIII);
                    }
                } else if (IiiiiiiiIIIII.ALLATORIxDEMO() == IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII).ALLATORIxDEMO()) {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII).ALLATORIxDEMO(), IiiiiiiiIIIII.ALLATORIxDEMO());
                    IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, (List<Object>)IiiiiiiiIIIII);
                }
                if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)(IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII))) == null) continue;
                IIIiiiiiIiIiI.ALLATORIxDEMO((List<Object>)IiiiiiiiIIIII, IiiiiiiiIIIII);
            }
            this.iIiIiiiiIiIii.clear();
            this.IiIIIiiiiIiiI.clear();
            return IiiiiiiiIIIII;
        }
    }

    /*
     * WARNING - void declaration
     */
    public IiiiIiiiiIiIi ALLATORIxDEMO(IiiiIiiiiIiIi one, IiiiIiiiiIiIi two) {
        this.IiIIIiiiiIiiI.clear();
        IiiiIiiiiIiIi IiiiiiiiIIIII = null;
        this.IiIIIiiiiIiiI.add(new IiiiIiiiiIiIi(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)one), IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)one), IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)one), IiiiIiiiiIiIi.iIiIiiiiIIiii((IiiiIiiiiIiIi)one)));
        iiiiiiiiiiIiI IiiiiiiiIIIII2 = this.ALLATORIxDEMO(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)one));
        if (IiiiiiiiIIIII2 == null) {
            return this.IiIIIiiiiIiiI.get(0);
        }
        List IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO();
        do {
            IiiiIiiiiIiIi IiiiiiiiIIIII4 = this.IiIIIiiiiIiiI.get(0);
            int IiiiiiiiIIIII5 = this.IiIIIiiiiIiiI.size() - 1;
            while (IiiiiiiiIIIII5 >= 0) {
                if (IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)IiiiiiiiIIIII4) > IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5))) {
                    IiiiiiiiIIIII4 = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5);
                }
                --IiiiiiiiIIIII5;
            }
            this.IiIIIiiiiIiiI.remove(IiiiiiiiIIIII4);
            if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII4) != IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)two) || IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)IiiiiiiiIIIII4) != IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)two) || IiiiIiiiiIiIi.iIiIiiiiIIiii((IiiiIiiiiIiIi)IiiiiiiiIIIII4) != IiiiIiiiiIiIi.iIiIiiiiIIiii((IiiiIiiiiIiIi)two)) {
                IiiiiiiiIIIII5 = (IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.size() : 0) - 1;
                while (IiiiiiiiIIIII5 >= 0) {
                    IIIIIiiiIiIii IiiiiiiiIIIII6 = (IIIIIiiiIiIii)IiiiiiiiIIIII3.get(IiiiiiiiIIIII5);
                    if (IiiiiiiiIIIII6.IIIiiiiiiIIiI() == IiiiiiiiIIIII6.iIiIiiiiIIiIi() && !IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII6.IiiIiiiiiiIiI())) {
                        void IiiiiiiiIIIII7;
                        IiiiIiiiiIiIi iiiiIiiiiIiIi = new IiiiIiiiiIiIi(IiiiiiiiIIIII6, IiiiiiiiIIIII4);
                        IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII7, (int)(IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)IiiiiiiiIIIII7) + 10000));
                        this.IiIIIiiiiIiiI.add((IiiiIiiiiIiIi)IiiiiiiiIIIII7);
                    }
                    --IiiiiiiiIIIII5;
                }
                this.IiIIIiiiiIiiI.add(new IiiiIiiiiIiIi(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)two), IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)two), IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)two), IiiiIiiiiIiIi.iIiIiiiiIIiii((IiiiIiiiiIiIi)two), IiiiiiiiIIIII4));
            }
            IiiiiiiiIIIII5 = this.IiIIIiiiiIiiI.size() - 1;
            while (IiiiiiiiIIIII5 >= 0) {
                if (IiiiiiiiIIIII != null && IiiiIiiiiIiIi.IiiIiiiiiiIiI(IiiiiiiiIIIII) <= IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5))) {
                    this.IiIIIiiiiIiiI.remove(IiiiiiiiIIIII5);
                } else if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5)) == IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)two) && IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5)) == IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)two)) {
                    IIIiiiiiIiIiI iIIiiiiiIiIiI = this;
                    IiiiiiiiIIIII = IiiiiiiiIIIII == null ? iIIiiiiiIiIiI.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5) : iIIiiiiiIiIiI.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5);
                }
                --IiiiiiiiIIIII5;
            }
        } while (this.IiIIIiiiiIiiI.size() != 0);
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public String ALLATORIxDEMO(MapModel mapModel1, MapModel mapModel2, RoleData roleData) {
        var4_4 = this;
        synchronized (var4_4) {
            IiiiiiiiIIIII = (int)mapModel1.getMapId();
            IiiiiiiiIIIII = (int)mapModel2.getMapId();
            if (IiiiiiiiIIIII == IiiiiiiiIIIII) {
                return "";
            }
            IiiiiiiiIIIII = roleData.getObjectArea();
            this.iiIiiiiiiiIii.clear();
            this.iIiiIiiiiiiII.clear();
            IiiiiiiiIIIII = 0;
            ** GOTO lbl19
            while ((IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII)) != null) {
                ++IiiiiiiiIIIII;
                this.iIiiIiiiiiiII.add(IiiiiiiiIIIII);
lbl19:
                // 2 sources

                if (IiiiiiiiIIIII < 100) continue;
            }
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII.append("\u4ece");
            IiiiiiiiIIIII.append(mapModel1.getMapName());
            IiiiiiiiIIIII.append("\u5230");
            IiiiiiiiIIIII.append(mapModel2.getMapName());
            IiiiiiiiIIIII.append("\u5171\u6709");
            IiiiiiiiIIIII.append(this.iIiiIiiiiiiII.size());
            IiiiiiiiIIIII.append("\u6761\u8def\u5f84:#r\u3000");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.size()) {
                IiiiiiiiIIIII.append(IiiiiiiiIIIII == 0 ? "#r\u8def\u5f84" : "#r\u3000#r\u8def\u5f84");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII + 1);
                IiiiiiiiIIIII.append(":");
                IiiiiiiiIIIII.append(this.iIiiIiiiiiiII.get(IiiiiiiiIIIII++));
            }
            this.iiIiiiiiiiIii.clear();
            this.iIiiIiiiiiiII.clear();
            return IiiiiiiiIIIII.toString();
        }
    }

    static /* synthetic */ int iIiIiiiiIIiii(int arg0, int arg1, int arg2, int arg3) {
        return IIIiiiiiIiIiI.ALLATORIxDEMO(arg0, arg1, arg2, arg3);
    }

    public iiiiiiiiiiIiI ALLATORIxDEMO(int mapId) {
        iiiiiiiiiiIiI IiiiiiiiIIIII = this.ALLATORIxDEMO.get(mapId);
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new iiiiiiiiiiIiI(mapId, this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO.put(mapId, IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    private static /* synthetic */ int ALLATORIxDEMO(int x, int y, int tx, int ty) {
        x -= tx;
        y -= ty;
        x *= x;
        y *= y;
        return x + y;
    }

    public static void ALLATORIxDEMO(IiiiIiiiiIiIi node, List<Object> list) {
        if (node == null) {
            return;
        }
        node = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node);
        while (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node) != null) {
            IIIiiiiiIiIiI.ALLATORIxDEMO(list, node);
            node = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node);
        }
    }

    public static void ALLATORIxDEMO(List<Object> list, IiiiIiiiiIiIi node) {
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iiiiiiiiIIiii() == 2) {
            ScriptEnd IiiiiiiiIIIII = new ScriptEnd(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.iIiIiiiiIIiii((IiiiIiiiiIiIi)node));
            list.add(IiiiiiiiIIIII);
            ScriptOpen IiiiiiiiIIIII2 = new ScriptOpen(3, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).ALLATORIxDEMO(), IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.iIiIiiiiIIiii((IiiiIiiiiIiIi)node));
            list.add(IiiiiiiiIIIII2);
            IiiiiiiiIIIII2 = new ScriptOpen(10, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).ALLATORIxDEMO());
            list.add(IiiiiiiiIIIII2);
            return;
        }
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iiiiiiiiIIiii() == 1) {
            ScriptEnd IiiiiiiiIIIII = new ScriptEnd(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.iIiIiiiiIIiii((IiiiIiiiiIiIi)node));
            list.add(IiiiiiiiIIIII);
            ScriptOpen IiiiiiiiIIIII3 = new ScriptOpen(2, (long)IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).IiiIiiiiiiIiI());
            list.add(IiiiiiiiIIIII3);
            IiiiiiiiIIIII3 = new ScriptOpen(11, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).ALLATORIxDEMO());
            list.add(IiiiiiiiIIIII3);
            IiiiiiiiIIIII = new ScriptEnd(IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).IIiiIiiiIIiIi, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).IiiiiiiiIIIII, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iiiiIiiiIiiII, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iIiiIiiiiiiII);
            list.add(IiiiiiiiIIIII);
            IiiiiiiiIIIII3 = new ScriptOpen(IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).IiiiiiiiIIIII, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iiiiIiiiIiiII, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iIiiIiiiiiiII);
            list.add(IiiiiiiiIIIII3);
            return;
        }
        ScriptEnd IiiiiiiiIIIII = new ScriptEnd(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.iiiIiiiiiiIIi((IiiiIiiiiIiIi)node), IiiiIiiiiIiIi.iIiIiiiiIIiii((IiiiIiiiiIiIi)node));
        list.add(IiiiiiiiIIIII);
        ScriptOpen IiiiiiiiIIIII4 = new ScriptOpen(1, (long)IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).IiiIiiiiiiIiI());
        list.add(IiiiiiiiIIIII4);
        IiiiiiiiIIIII = new ScriptEnd(IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).IIiiIiiiIIiIi, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).IiiiiiiiIIIII, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iiiiIiiiIiiII, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iIiiIiiiiiiII);
        list.add(IiiiiiiiIIIII);
        IiiiiiiiIIIII4 = new ScriptOpen(IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).IiiiiiiiIIIII, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iiiiIiiiIiiII, IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)node).iIiiIiiiiiiII);
        list.add(IiiiiiiiIIIII4);
    }

    private /* synthetic */ String ALLATORIxDEMO(int mapId, int mapIdNew, IiiiiiiiiIIII objectArea) {
        IiiiIiiiiIiIi IiiiiiiiIIIII;
        IIIIIiiiIiIii IiiiiiiiIIIII2;
        Object IiiiiiiiIIIII22;
        Object IiiiiiiiIIIII3;
        IiiiIiiiiIiIi IiiiiiiiIIIII4 = null;
        this.iIiIiiiiIiIii.clear();
        this.IiIIIiiiiIiiI.clear();
        this.IiIIIiiiiIiiI.add(new IiiiIiiiiIiIi(mapId, 0, 0, 0));
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.iiIiiiiiiiIii.size()) {
            this.iIiIiiiiIiIii.add(this.iiIiiiiiiiIii.get(IiiiiiiiIIIII5++));
        }
        do {
            IiiiiiiiIIIII3 = this.IiIIIiiiiIiiI.get(0);
            int IiiiiiiiIIIII6 = this.IiIIIiiiiIiiI.size() - 1;
            while (IiiiiiiiIIIII6 >= 0) {
                if (IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)IiiiiiiiIIIII3) > IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII6))) {
                    IiiiiiiiIIIII3 = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII6);
                }
                --IiiiiiiiIIIII6;
            }
            this.IiIIIiiiiIiiI.remove(IiiiiiiiIIIII3);
            IiiiiiiiIIIII22 = this.ALLATORIxDEMO(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII3));
            if (IiiiiiiiIIIII22 == null) continue;
            List IiiiiiiiIIIII7 = IiiiiiiiIIIII22.ALLATORIxDEMO();
            boolean IiiiiiiiIIIII8 = true;
            int IiiiiiiiIIIII9 = (IiiiiiiiIIIII7 != null ? IiiiiiiiIIIII7.size() : 0) - 1;
            while (IiiiiiiiIIIII9 >= 0) {
                IiiiiiiiIIIII2 = (IIIIIiiiIiIii)IiiiiiiiIIIII7.get(IiiiiiiiIIIII9);
                if (IiiiiiiiIIIII2.IIIiiiiiiIIiI() != IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII3)) {
                    if (IiiiiiiiIIIII8 && IiiiiiiiIIIII2.IIIiiiiiiIIiI() == mapIdNew) {
                        IiiiiiiiIIIII8 = false;
                    }
                    if (!(IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII2.IiiIiiiiiiIiI()) || IiiiiiiiIIIII3.iIiIiiiiIIiii(IiiiiiiiIIIII2.IIIiiiiiiIIiI()) || this.iIiIiiiiIiIii.contains(IiiiiiiiIIIII2.IIIiiiiiiIIiI()))) {
                        IiiiiiiiIIIII = new IiiiIiiiiIiIi(IiiiiiiiIIIII2, (IiiiIiiiiIiIi)IiiiiiiiIIIII3);
                        this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII);
                    }
                }
                --IiiiiiiiIIIII9;
            }
            if (IiiiiiiiIIIII8) {
                this.iIiIiiiiIiIii.add(IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)IiiiiiiiIIIII3));
            }
            IiiiiiiiIIIII9 = this.IiIIIiiiiIiiI.size() - 1;
            while (IiiiiiiiIIIII9 >= 0) {
                if (IiiiiiiiIIIII4 != null && IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)IiiiiiiiIIIII4) <= IiiiIiiiiIiIi.IiiIiiiiiiIiI((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII9))) {
                    this.IiIIIiiiiIiiI.remove(IiiiiiiiIIIII9);
                } else if (IiiiIiiiiIiIi.iIiIiiiiIIiIi((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII9)) == mapIdNew) {
                    IIIiiiiiIiIiI iIIiiiiiIiIiI = this;
                    IiiiiiiiIIIII4 = IiiiiiiiIIIII4 == null ? iIIiiiiiIiIiI.IiIIIiiiiIiiI.get(IiiiiiiiIIIII9) : iIIiiiiiIiIiI.IiIIIiiiiIiiI.get(IiiiiiiiIIIII9);
                }
                --IiiiiiiiIIIII9;
            }
        } while (this.IiIIIiiiiIiiI.size() != 0);
        if (IiiiiiiiIIIII4 == null) {
            return null;
        }
        IiiiiiiiIIIII3 = new ArrayList();
        while (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII3.add(IiiiiiiiIIIII4);
            IiiiiiiiIIIII4 = IiiiIiiiiIiIi.ALLATORIxDEMO(IiiiiiiiIIIII4);
        }
        IiiiiiiiIIIII22 = new StringBuffer();
        int IiiiiiiiIIIII10 = IiiiiiiiIIIII3.size() - 1;
        while (IiiiiiiiIIIII10 >= 0) {
            IiiiIiiiiIiIi IiiiiiiiIIIII11 = (IiiiIiiiiIiIi)IiiiiiiiIIIII3.get(IiiiiiiiIIIII10);
            IIIIIiiiIiIii IiiiiiiiIIIII12 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII11);
            if (IiiiiiiiIIIII12 != null) {
                InputBean IiiiiiiiIIIII13;
                this.iiIiiiiiiiIii.add(IiiiiiiiIIIII12.IIIiiiiiiIIiI());
                IiiiiiiiIIIII2 = objectArea.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII12.iIiIiiiiIIiIi()));
                IiiiiiiiIIIII = new Coordinates(IiiiiiiiIIIII12.iIiIiiiiIIiIi(), IiiiiiiiIIIII12.IIiIIiiiIiIIi(), IiiiiiiiIIIII12.IIIIIiiiiIIii());
                InputBean inputBean = new InputBean(10, String.valueOf(IiiiiiiiIIIII2.getMapName()) + "(" + IiiiiiiiIIIII.getX() / 20 + "," + IiiiiiiiIIIII.getY() / 20 + ")", (Coordinates)IiiiiiiiIIIII);
                IiiiiiiiIIIII13.setColor("G");
                ((StringBuffer)IiiiiiiiIIIII22).append("#r#Y\u2299#W");
                ((StringBuffer)IiiiiiiiIIIII22).append("\u8d70\u5230");
                ((StringBuffer)IiiiiiiiIIIII22).append("#V");
                ((StringBuffer)IiiiiiiiIIIII22).append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII13));
                ((StringBuffer)IiiiiiiiIIIII22).append("#L\u5904");
                if (IiiiiiiiIIIII12.iiiiiiiiIIiii() == 0) {
                    ((StringBuffer)IiiiiiiiIIIII22).append("\u89e6\u53d1\u5730\u56fe\u4f20\u9001\u5230");
                } else if (IiiiiiiiIIIII12.iiiiiiiiIIiii() == 1) {
                    ((StringBuffer)IiiiiiiiIIIII22).append("\u70b9\u51fb\u9a7f\u7ad9\u8001\u677f\u4f20\u9001\u5230");
                }
                IiiiiiiiIIIII2 = objectArea.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII12.IIIiiiiiiIIiI()));
                IiiiiiiiIIIII = new Coordinates(IiiiiiiiIIIII12.IIIiiiiiiIIiI(), IiiiiiiiIIIII12.ALLATORIxDEMO(), IiiiiiiiIIIII12.IIiiIiiiiIiII());
                IiiiiiiiIIIII13 = new InputBean(10, IiiiiiiiIIIII2.getMapName(), (Coordinates)IiiiiiiiIIIII);
                IiiiiiiiIIIII13.setColor("Y");
                ((StringBuffer)IiiiiiiiIIIII22).append("#V");
                ((StringBuffer)IiiiiiiiIIIII22).append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII13));
                ((StringBuffer)IiiiiiiiIIIII22).append("#L");
            }
            --IiiiiiiiIIIII10;
        }
        if (((StringBuffer)IiiiiiiiIIIII22).length() == 0) return null;
        return ((StringBuffer)IiiiiiiiIIIII22).toString();
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int mapId, int x, int y, int z, RoleData roleData) {
        this.IIiiIiiiIIiIi.clear();
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < roleData.goodPacks.length) {
            block2: {
                IiiiiiiiIIIII = roleData.getGood(roleData.goodPacks[IiiiiiiiIIIII]);
                if (IiiiiiiiIIIII != null && GoodType.IIiIIiiiIiIIi((long)IiiiiiiiIIIII.getType()) && (IiiiiiiiIIIII = IiiiiiiiIIIII.getFight()) != null) ** GOTO lbl15
                break block2;
lbl-1000:
                // 1 sources

                {
                    var9_9 = new IIIIIiiiIiIii(IiiiiiiiIIIII.getRgid().longValue(), IiiiiiiiIIIII);
                    IiiiiiiiIIIII.IIiiIiiiIIiIi = mapId;
                    IiiiiiiiIIIII.IiiiiiiiIIIII = x;
                    IiiiiiiiIIIII.iiiiIiiiIiiII = y;
                    var9_9.iIiiIiiiiiiII = z;
                    this.IIiiIiiiIIiIi.add((IIIIIiiiIiIii)IiiiiiiiIIIII);
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getNextFight();
lbl15:
                    // 2 sources

                    ** while (IiiiiiiiIIIII != null)
                }
            }
            ++IiiiiiiiIIIII;
        }
    }
}
