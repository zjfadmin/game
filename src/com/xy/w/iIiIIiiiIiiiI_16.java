/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.w;

import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.iiiiiiiiiiIiI;
import java.lang.ref.SoftReference;

public class iIiIIiiiIiiiI
extends Thread {
    public static String iiiiIiiiIiiII;
    public static String iiiIiiiiiiiIi;
    public static String iIiiIiiiiiiII;
    boolean IIiiIiiiIIiIi = true;
    public static String iIiIiiiiIiIii;
    private static String IiIIIiiiiIiiI;
    public static String iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    public static String ALLATORIxDEMO;

    public iIiIIiiiIiiiI() {
        this.setDaemon(true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO() {
        iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
        synchronized (iIiIIiiiIiiiI2) {
            if (this.IIiiIiiiIIiIi) {
                return;
            }
            this.IIiiIiiiIIiIi = true;
            this.notifyAll();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    @Override
    public void run() {
        while (true) {
            iIiIIiiiIiiiI iIiIIiiiIiiiI2;
            try {
                while (true) {
                    Object IiiiiiiiIIIII;
                    block25: {
                        long IiiiiiiiIIIII2;
                        String IiiiiiiiIIIII3;
                        block27: {
                            IIIIIiiiIiIii IiiiiiiiIIIII4;
                            short[] IiiiiiiiIIIII5;
                            block26: {
                                block24: {
                                    if ((IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO()) == null) {
                                        iIiIIiiiIiiiI2 = this;
                                        synchronized (iIiIIiiiIiiiI2) {
                                            this.IIiiIiiiIIiIi = false;
                                            this.wait();
                                        }
                                    }
                                    if (!(IiiiiiiiIIIII instanceof IIIIIiiiIiIii)) break block24;
                                    if (this.IiiiiiiiIIIII++ % 4 == 0) {
                                        Thread.sleep(1L);
                                    }
                                    iiiiiiiiiiIiI.ALLATORIxDEMO((IIIIIiiiIiIii)((IIIIIiiiIiIii)IiiiiiiiIIIII));
                                    break block25;
                                }
                                if (!(IiiiiiiiIIIII instanceof String)) break block25;
                                IiiiiiiiIIIII3 = (String)IiiiiiiiIIIII;
                                if (!IiiiiiiiIIIII3.startsWith(ALLATORIxDEMO)) break block26;
                                long IiiiiiiiIIIII6 = Long.parseLong(IiiiiiiiIIIII3.substring(2));
                                SoftReference IiiiiiiiIIIII7 = (SoftReference)iiiiiiiiiiIiI.IIIIiiiiiiiII.get(IiiiiiiiIIIII6);
                                if (IiiiiiiiIIIII7 != null && IiiiiiiiIIIII7.get() != null) break block25;
                                IiiiiiiiIIIII2 = IiiiiiiiIIIII6 >> 40;
                                IiiiiiiiIIIII5 = iiiiiiiiiiIiI.ALLATORIxDEMO((long)IiiiiiiiIIIII2);
                                IiiiiiiiIIIII4 = iiiiiiiiiiIiI.ALLATORIxDEMO((long)(IiiiiiiiIIIII6 & 0x7FFFFFFFFFL), (boolean)IiiiiiiiIIIII3.startsWith(iiIiiiiiiiIii), (short[])IiiiiiiiIIIII5);
                                if (IiiiiiiiIIIII4 != null) {
                                    iiiiiiiiiiIiI.IIIIiiiiiiiII.put(IiiiiiiiIIIII6, new SoftReference<IIIIIiiiIiIii>(IiiiiiiiIIIII4));
                                    if (IiiiiiiiIIIII4.ALLATORIxDEMO() == 1) {
                                        IiiiiiiiIIIII4.iIiIiiiiIIiii(0);
                                        iiiiiiiiiiIiI.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4);
                                    }
                                }
                                break block25;
                            }
                            if (!IiiiiiiiIIIII3.startsWith(iiiiIiiiIiiII)) break block27;
                            long IiiiiiiiIIIII8 = Long.parseLong(IiiiiiiiIIIII3.substring(2));
                            SoftReference IiiiiiiiIIIII9 = (SoftReference)iiiiiiiiiiIiI.IIIIiiiiiiiII.get(-IiiiiiiiIIIII8);
                            if (IiiiiiiiIIIII9 != null && IiiiiiiiIIIII9.get() != null) break block25;
                            IiiiiiiiIIIII2 = IiiiiiiiIIIII8 >> 40;
                            IiiiiiiiIIIII5 = iiiiiiiiiiIiI.ALLATORIxDEMO((long)IiiiiiiiIIIII2);
                            IiiiiiiiIIIII4 = iiiiiiiiiiIiI.iIiIiiiiIIiii((long)(IiiiiiiiIIIII8 & 0x7FFFFFFFFFL), (boolean)IiiiiiiiIIIII3.startsWith(iIiIiiiiIiIii), (short[])IiiiiiiiIIIII5);
                            if (IiiiiiiiIIIII4 != null) {
                                iiiiiiiiiiIiI.IIIIiiiiiiiII.put(-IiiiiiiiIIIII8, new SoftReference<IIIIIiiiIiIii>(IiiiiiiiIIIII4));
                                if (IiiiiiiiIIIII4.ALLATORIxDEMO() == 1) {
                                    IiiiiiiiIIIII4.iIiIiiiiIIiii(0);
                                    iiiiiiiiiiIiI.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4);
                                }
                            }
                            break block25;
                        }
                        SoftReference IiiiiiiiIIIII10 = (SoftReference)iiiiiiiiiiIiI.iIiiIiiiIiIIi.get(IiiiiiiiIIIII3);
                        if (IiiiiiiiIIIII10 == null || IiiiiiiiIIIII10.get() == null) {
                            IIIIIiiiIiIii IiiiiiiiIIIII11 = null;
                            int IiiiiiiiIIIII12 = IiiiiiiiIIIII3.indexOf(IiIIIiiiiIiiI);
                            if (IiiiiiiiIIIII12 == -1) {
                                IiiiiiiiIIIII11 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII3, null);
                            } else {
                                IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII3, (int)(IiiiiiiiIIIII12 + 1), (int)IiiiiiiiIIIII3.length());
                                IiiiiiiiIIIII11 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII3.substring(0, IiiiiiiiIIIII12), (short[])iiiiiiiiiiIiI.ALLATORIxDEMO((long)IiiiiiiiIIIII2));
                            }
                            if (IiiiiiiiIIIII11 != null) {
                                iiiiiiiiiiIiI.iIiiIiiiIiIIi.put(IiiiiiiiIIIII3, new SoftReference<IIIIIiiiIiIii>(IiiiiiiiIIIII11));
                                if (IiiiiiiiIIIII11.ALLATORIxDEMO() == 1) {
                                    IiiiiiiiIIIII11.iIiIiiiiIIiii(0);
                                    iiiiiiiiiiIiI.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII11);
                                }
                            }
                        }
                    }
                    iiiiiiiiiiIiI.iIiIiiiiIIiii((Object)IiiiiiiiIIIII);
                }
            }
            catch (Exception IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                iIiIIiiiIiiiI2 = this;
                synchronized (iIiIIiiiIiiiI2) {
                    try {
                        Thread.sleep(2000L);
                        this.IIiiIiiiIIiIi = true;
                        this.notifyAll();
                    }
                    catch (Exception IiiiiiiiIIIII13) {
                        IiiiiiiiIIIII13.printStackTrace();
                    }
                }
            }
        }
    }

    static {
        ALLATORIxDEMO = "N";
        iIiiIiiiiiiII = "N0";
        iiIiiiiiiiIii = "N1";
        iiiiIiiiIiiII = "M";
        iiiIiiiiiiiIi = "M0";
        iIiIiiiiIiIii = "M1";
        IiIIIiiiiIiiI = "_";
    }
}
