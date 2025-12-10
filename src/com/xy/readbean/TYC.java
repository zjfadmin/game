/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

import java.util.ArrayList;
import java.util.List;

public class TYC {
    private int v1;
    private int v2;
    private int[] vs;
    public static final int TYC2 = 2;
    private List<TYC> list;
    public static final int TYC0 = 0;
    public static final int TYC1 = 1;
    public static final int TYC4 = 4;
    public static final int TYC5 = 5;
    public static final int TYC7 = 7;
    private int type;
    public static final int TYC6 = 6;
    public static final int TYC3 = 3;

    public int getV2() {
        return this.v2;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getType() {
        return this.type;
    }

    public TYC() {
    }

    public int getV1() {
        return this.v1;
    }

    public void setVs(int[] vs) {
        this.vs = vs;
    }

    /*
     * Unable to fully structure code
     */
    public TYC(String value) {
        super();
        IiiiiiiiIIIII = value.split("#");
        this.type = 0;
        this.v1 = Integer.parseInt(IiiiiiiiIIIII[0]);
        this.v2 = Integer.parseInt(IiiiiiiiIIIII[1]);
        if (IiiiiiiiIIIII.length == 2) {
            return;
        }
        this.list = new ArrayList<TYC>();
        IiiiiiiiIIIII = 2;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block12: {
                block6: {
                    block11: {
                        block10: {
                            block9: {
                                block8: {
                                    block7: {
                                        block5: {
                                            IiiiiiiiIIIII = new TYC();
                                            if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("D")) break block5;
                                            IiiiiiiiIIIII.type = 1;
                                            IiiiiiiiIIIII.v1 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1));
                                            break block6;
                                        }
                                        if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("Z")) break block7;
                                        IiiiiiiiIIIII.type = 2;
                                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1).split("-");
                                        IiiiiiiiIIIII.vs = new int[IiiiiiiiIIIII.length];
                                        IiiiiiiiIIIII = 0;
                                        if (true) ** GOTO lbl62
                                    }
                                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("Q")) break block8;
                                    IiiiiiiiIIIII.type = 3;
                                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("-");
                                    IiiiiiiiIIIII.v1 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1, IiiiiiiiIIIII));
                                    IiiiiiiiIIIII.v2 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                                    break block6;
                                }
                                if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("L")) break block9;
                                IiiiiiiiIIIII.type = 4;
                                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("-");
                                IiiiiiiiIIIII.v1 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1, IiiiiiiiIIIII));
                                IiiiiiiiIIIII.v2 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                                break block6;
                            }
                            if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("C")) break block10;
                            IiiiiiiiIIIII.type = 5;
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1).split("-");
                            IiiiiiiiIIIII.vs = new int[IiiiiiiiIIIII.length];
                            IiiiiiiiIIIII = 0;
                            if (true) ** GOTO lbl69
                        }
                        if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("G")) break block11;
                        IiiiiiiiIIIII.type = 6;
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1).split("-");
                        IiiiiiiiIIIII.vs = new int[IiiiiiiiIIIII.length - 1];
                        IiiiiiiiIIIII.v1 = Integer.parseInt(IiiiiiiiIIIII[0]);
                        IiiiiiiiIIIII = 1;
                        if (true) ** GOTO lbl76
                    }
                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("J")) break block12;
                    IiiiiiiiIIIII.type = 7;
                    IiiiiiiiIIIII.v1 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1));
                    break block6;
                    do {
                        v0 = IiiiiiiiIIIII;
                        v1 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.vs[v0] = v1;
lbl62:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    break block6;
                    do {
                        v2 = IiiiiiiiIIIII;
                        v3 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.vs[v2] = v3;
lbl69:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    break block6;
                    do {
                        v4 = IiiiiiiiIIIII - 1;
                        v5 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.vs[v4] = v5;
lbl76:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                }
                this.list.add(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void setList(List<TYC> list) {
        this.list = list;
    }

    public List<TYC> getList() {
        return this.list;
    }

    public int[] getVs() {
        return this.vs;
    }
}
