/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.iiiIiiiiIiiiI
 */
package com.xy.v;

import com.xy.v.iiiIiiiiIiiiI;

public class IiIiIiiiiiIiI {
    /*
     * Unable to fully structure code
     */
    public static long iIiIiiiiIIiii(long V) {
        block24: {
            block23: {
                block22: {
                    if (V == 0L) {
                        return 0L;
                    }
                    v0 = IiiiiiiiIIIII = V < 0L;
                    if (IiiiiiiiIIIII) {
                        V = -V;
                    }
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = V;
                    while (IiiiiiiiIIIII >= 10L) {
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII /= 10L;
                    }
                    IiiiiiiiIIIII = 1L;
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII *= 10L;
                    }
                    IiiiiiiiIIIII = (int)(V / IiiiiiiiIIIII);
                    IiiiiiiiIIIII = 0L;
                    if (IiiiiiiiIIIII >> 2 != 0) break block22;
                    if ((IiiiiiiiIIIII += 3) == 3) {
                        IiiiiiiiIIIII = 1;
                        IiiiiiiiIIIII -= 2;
                    } else if (IiiiiiiiIIIII == 10) {
                        IiiiiiiiIIIII = 5;
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII != 0 ? (IiiiiiiiIIIII %= IiiiiiiiIIIII) : 0;
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl77
                }
                if (IiiiiiiiIIIII >> 2 != 1) break block23;
                if ((IiiiiiiiIIIII += 3) == 3) {
                    IiiiiiiiIIIII = 1;
                } else if (IiiiiiiiIIIII == 10) {
                    IiiiiiiiIIIII = 5;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII != 0 ? (IiiiiiiiIIIII %= IiiiiiiiIIIII) : 0;
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl108
            }
            if (IiiiiiiiIIIII >> 2 != 2) break block24;
            if ((IiiiiiiiIIIII += 3) == 3) {
                IiiiiiiiIIIII = 1;
            } else if (IiiiiiiiIIIII == 10) {
                IiiiiiiiIIIII = 5;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII != 0 ? (IiiiiiiiIIIII %= IiiiiiiiIIIII) : 0;
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl130
            do {
                block27: {
                    block26: {
                        block25: {
                            if (IiiiiiiiIIIII != IiiiiiiiIIIII) break block25;
                            IiiiiiiiIIIII = (int)(V % 10L);
                            if ((IiiiiiiiIIIII -= 4) >= 0) break block26;
                            v1 = V;
                            IiiiiiiiIIIII += 10;
                            break block27;
                        }
                        if (IiiiiiiiIIIII == IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (int)(V % 10L);
                        }
                        IiiiiiiiIIIII *= 10L;
                        IiiiiiiiIIIII += V % 10L;
                    }
                    v1 = V;
                }
                ++IiiiiiiiIIIII;
                V = v1 / 10L;
lbl77:
                // 2 sources

            } while (IiiiiiiiIIIII <= IiiiiiiiIIIII);
            if (IiiiiiiiIIIII != IiiiiiiiIIIII) {
                IiIiIiiiiiIiI.ALLATORIxDEMO();
                return 0L;
            }
            break block24;
            do {
                block30: {
                    block29: {
                        block33: {
                            block32: {
                                block31: {
                                    block28: {
                                        if (IiiiiiiiIIIII != IiiiiiiiIIIII) break block28;
                                        IiiiiiiiIIIII = (int)(V % 10L);
                                        if ((IiiiiiiiIIIII -= 2) >= 0) break block29;
                                        v2 = V;
                                        IiiiiiiiIIIII += 10;
                                        break block30;
                                    }
                                    if (IiiiiiiiIIIII < 2) break block31;
                                    if (IiiiiiiiIIIII != IiiiiiiiIIIII - 1) break block32;
                                    IiiiiiiiIIIII = (int)(V % 10L);
                                    v3 = IiiiiiiiIIIII;
                                    break block33;
                                }
                                if (IiiiiiiiIIIII == IiiiiiiiIIIII) {
                                    IiiiiiiiIIIII = (int)(V % 10L);
                                }
                            }
                            v3 = IiiiiiiiIIIII;
                        }
                        IiiiiiiiIIIII = v3 * 10L;
                        IiiiiiiiIIIII += V % 10L;
                    }
                    v2 = V;
                }
                ++IiiiiiiiIIIII;
                V = v2 / 10L;
lbl108:
                // 2 sources

            } while (IiiiiiiiIIIII <= IiiiiiiiIIIII);
            if (IiiiiiiiIIIII != IiiiiiiiIIIII) {
                IiIiIiiiiiIiI.ALLATORIxDEMO();
                return 0L;
            }
            break block24;
            do {
                block36: {
                    block35: {
                        block34: {
                            if (IiiiiiiiIIIII != IiiiiiiiIIIII) break block34;
                            IiiiiiiiIIIII = (int)(V % 10L);
                            if (--IiiiiiiiIIIII >= 0) break block35;
                            v4 = V;
                            IiiiiiiiIIIII += 10;
                            break block36;
                        }
                        if (IiiiiiiiIIIII == IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (int)(V % 10L);
                        }
                        IiiiiiiiIIIII *= 10L;
                        IiiiiiiiIIIII += V % 10L;
                    }
                    v4 = V;
                }
                ++IiiiiiiiIIIII;
                V = v4 / 10L;
lbl130:
                // 2 sources

            } while (IiiiiiiiIIIII <= IiiiiiiiIIIII);
            if (IiiiiiiiIIIII != IiiiiiiiIIIII) {
                IiIiIiiiiiIiI.ALLATORIxDEMO();
                return 0L;
            }
        }
        if (IiiiiiiiIIIII == false) return IiiiiiiiIIIII -= 1341L;
        IiiiiiiiIIIII = -IiiiiiiiIIIII;
        return IiiiiiiiIIIII -= 1341L;
    }

    public static void ALLATORIxDEMO() {
        new Thread((Runnable)new iiiIiiiiIiiiI()).start();
    }

    public static long ALLATORIxDEMO(long V) {
        boolean IiiiiiiiIIIII;
        boolean bl = IiiiiiiiIIIII = (V += 1341L) < 0L;
        if (IiiiiiiiIIIII) {
            V = -V;
        }
        int IiiiiiiiIIIII2 = 0;
        long IiiiiiiiIIIII3 = V;
        while (IiiiiiiiIIIII3 >= 10L) {
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII3 /= 10L;
        }
        IiiiiiiiIIIII3 = 2L;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2 != 0 ? 5 % IiiiiiiiIIIII2 : 0;
        long IiiiiiiiIIIII5 = (V + 4L) % 10L;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII2;
        while (IiiiiiiiIIIII6 >= 0) {
            IiiiiiiiIIIII3 *= 10L;
            IiiiiiiiIIIII3 += V % 10L;
            if (IiiiiiiiIIIII4 == IiiiiiiiIIIII6) {
                IiiiiiiiIIIII3 *= 10L;
                IiiiiiiiIIIII3 += IiiiiiiiIIIII5;
            }
            --IiiiiiiiIIIII6;
            V /= 10L;
        }
        if (!IiiiiiiiIIIII) return IiiiiiiiIIIII3;
        return -IiiiiiiiIIIII3;
    }
}
