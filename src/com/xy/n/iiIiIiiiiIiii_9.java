/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.PathPoint
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.n.iiIIiiiiIiiII
 */
package com.xy.n;

import com.xy.bean.PathPoint;
import com.xy.n.IIIIIiiiIiiII;
import com.xy.n.iiIIiiiiIiiII;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iiIiIiiiiIiii {
    private static byte[] IiIiiiiiIIIII;
    private static byte iiIiIiiiiIIIi;
    private static final int[][] iiiiIiiiIiiII;
    private static byte iiiIiiiiiiiIi;
    private static byte iIiiIiiiiiiII;
    private static byte IIiiIiiiIIiIi;
    private static List<iiIIiiiiIiiII> iIiIiiiiIiIii;
    private static IIIIIiiiIiiII IiIIIiiiiIiiI;
    public static int iiIiiiiiiiIii;
    private static byte IiiiiiiiIIIII;
    private static byte ALLATORIxDEMO;

    public static int ALLATORIxDEMO(iiIIiiiiIiiII qishi, iiIIiiiiIiiII zhongdian, iiIIiiiiIiiII danqian) {
        int IiiiiiiiIIIII = qishi.ALLATORIxDEMO * (zhongdian.IIiiIiiiIIiIi - danqian.IIiiIiiiIIiIi);
        int IiiiiiiiIIIII2 = zhongdian.ALLATORIxDEMO * (danqian.IIiiIiiiIIiIi - qishi.IIiiIiiiIIiIi);
        return Math.abs(danqian.ALLATORIxDEMO * (qishi.IIiiIiiiIIiIi - zhongdian.IIiiIiiiIIiIi) + IiiiiiiiIIIII + IiiiiiiiIIIII2);
    }

    private static /* synthetic */ int ALLATORIxDEMO(int x, int y, int tx, int ty) {
        return (Math.abs(x - tx) + Math.abs(y - ty)) * 10;
    }

    public static synchronized List<PathPoint> ALLATORIxDEMO(int x1, int y1, int z1, int x2, int y2, int z2, com.xy.d.iiIiIiiiiIiii roleUnit, IIIIIiiiIiiII mapDecoder) {
        iiIIiiiiIiiII IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        Object IiiiiiiiIIIII3;
        if (mapDecoder.iiiIiiiiiiIIi(x2, y2, z2)) {
            IiIIIiiiiIiiI = null;
            iIiIiiiiIiIii.clear();
            return null;
        }
        iiIiIiiiiIiii.ALLATORIxDEMO(mapDecoder);
        boolean IiiiiiiiIIIII4 = false;
        boolean IiiiiiiiIIIII5 = z2 > 0;
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        boolean IiiiiiiiIIIII10 = false;
        iiIIiiiiIiiII IiiiiiiiIIIII11 = null;
        iiIIiiiiIiiII IiiiiiiiIIIII12 = new iiIIiiiiIiiII(x1, y1, z1 > 0, iiIiIiiiiIiii.ALLATORIxDEMO(x1, y1, x2, y2));
        int n = mapDecoder.IIIIiiiiiiiII * y1 + x1;
        IiIiiiiiIIIII[n] = (byte)(IiIiiiiiIIIII[n] | iiIiIiiiiIiii.IiiiiiiiIIIII);
        iIiIiiiiIiIii.add(IiiiiiiiIIIII12);
        block0: do {
            IiiiiiiiIIIII3 = iIiIiiiiIiIii.get(0);
            IiiiiiiiIIIII2 = iIiIiiiiIiIii.size() - 1;
            while (IiiiiiiiIIIII2 >= iIiIiiiiIiIii.size() - 9 && IiiiiiiiIIIII2 >= 0) {
                if (((iiIIiiiiIiiII)IiiiiiiiIIIII3).iiIiiiiiiiIii > iiIiIiiiiIiii.iIiIiiiiIiIii.get((int)IiiiiiiiIIIII2).iiIiiiiiiiIii) {
                    IiiiiiiiIIIII3 = iIiIiiiiIiIii.get(IiiiiiiiIIIII2);
                }
                --IiiiiiiiIIIII2;
            }
            int n2 = mapDecoder.IIIIiiiiiiiII * ((iiIIiiiiIiiII)IiiiiiiiIIIII3).IIiiIiiiIIiIi + ((iiIIiiiiIiiII)IiiiiiiiIIIII3).ALLATORIxDEMO;
            IiIiiiiiIIIII[n2] = (byte)(IiIiiiiiIIIII[n2] | (((iiIIiiiiIiiII)IiiiiiiiIIIII3).IiiiiiiiIIIII ? iiIiIiiiiIIIi : ALLATORIxDEMO));
            iIiIiiiiIiIii.remove(IiiiiiiiIIIII3);
            IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < iiiiIiiiIiiII.length) {
                IiiiiiiiIIIII6 = ((iiIIiiiiIiiII)IiiiiiiiIIIII3).ALLATORIxDEMO + iiiiIiiiIiiII[IiiiiiiiIIIII2][0];
                IiiiiiiiIIIII7 = ((iiIIiiiiIiiII)IiiiiiiiIIIII3).IIiiIiiiIIiIi + iiiiIiiiIiiII[IiiiiiiiIIIII2][1];
                if (IiiiiiiiIIIII6 >= 0 && IiiiiiiiIIIII7 >= 0 && IiiiiiiiIIIII6 < mapDecoder.IIIIiiiiiiiII && IiiiiiiiIIIII7 < mapDecoder.IiIIIiiiiIiiI) {
                    IiiiiiiiIIIII8 = IiiiiiiiIIIII2 == 8 ? (((iiIIiiiiIiiII)IiiiiiiiIIIII3).IiiiiiiiIIIII ? 0 : 1) : (((iiIIiiiiIiiII)IiiiiiiiIIIII3).IiiiiiiiIIIII ? 1 : 0);
                    IiiiiiiiIIIII10 = IiiiiiiiIIIII8 > 0;
                    IiiiiiiiIIIII9 = IiIiiiiiIIIII[mapDecoder.IIIIiiiiiiiII * IiiiiiiiIIIII7 + IiiiiiiiIIIII6] >> IiiiiiiiIIIII8 * 2 & IIiiIiiiIIiIi;
                    if (!mapDecoder.iiiIiiiiiiIIi(IiiiiiiiIIIII6, IiiiiiiiIIIII7, IiiiiiiiIIIII8) && IiiiiiiiIIIII9 != ALLATORIxDEMO && !iiIiIiiiiIiii.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII6, IiiiiiiiIIIII7, IiiiiiiiIIIII8)) {
                        IiiiiiiiIIIII = new iiIIiiiiIiiII(IiiiiiiiIIIII6, IiiiiiiiIIIII7, IiiiiiiiIIIII10, iiIiIiiiiIiii.ALLATORIxDEMO(IiiiiiiiIIIII6, IiiiiiiiIIIII7, x2, y2), (iiIIiiiiIiiII)IiiiiiiiIIIII3);
                        if (IiiiiiiiIIIII9 != iiIiIiiiiIiii.IiiiiiiiIIIII) {
                            int n3 = mapDecoder.IIIIiiiiiiiII * IiiiiiiiIIIII7 + IiiiiiiiIIIII6;
                            IiIiiiiiIIIII[n3] = (byte)(IiIiiiiiIIIII[n3] | (IiiiiiiiIIIII10 ? iIiiIiiiiiiII : iiIiIiiiiIiii.IiiiiiiiIIIII));
                            iIiIiiiiIiIii.add(IiiiiiiiIIIII);
                        }
                    }
                }
                ++IiiiiiiiIIIII2;
            }
            IiiiiiiiIIIII2 = iIiIiiiiIiIii.size() - 1;
            while (IiiiiiiiIIIII2 >= 0 && IiiiiiiiIIIII2 >= iIiIiiiiIiIii.size() - 9) {
                IiiiiiiiIIIII = iIiIiiiiIiIii.get(IiiiiiiiIIIII2);
                if (IiiiiiiiIIIII.ALLATORIxDEMO == x2 && IiiiiiiiIIIII.IIiiIiiiIIiIi == y2 && IiiiiiiiIIIII.IiiiiiiiIIIII == IiiiiiiiIIIII5) {
                    IiiiiiiiIIIII11 = iIiIiiiiIiIii.get(IiiiiiiiIIIII2);
                    IiiiiiiiIIIII4 = true;
                    continue block0;
                }
                --IiiiiiiiIIIII2;
            }
        } while (!IiiiiiiiIIIII4 && iIiIiiiiIiIii.size() != 0);
        if (!IiiiiiiiIIIII4) {
            IiIIIiiiiIiiI = null;
            iIiIiiiiIiIii.clear();
            return null;
        }
        iIiIiiiiIiIii.clear();
        while (IiiiiiiiIIIII11 != null) {
            IiiiiiiiIIIII11.ALLATORIxDEMO = IiiiiiiiIIIII11.ALLATORIxDEMO * 20 + 10;
            IiiiiiiiIIIII11.IIiiIiiiIIiIi = IiiiiiiiIIIII11.IIiiIiiiIIiIi * 20 + 10;
            iIiIiiiiIiIii.add(IiiiiiiiIIIII11);
            IiiiiiiiIIIII3 = IiiiiiiiIIIII11;
            IiiiiiiiIIIII11 = ((iiIIiiiiIiiII)IiiiiiiiIIIII3).iIiIiiiiIiIii;
            ((iiIIiiiiIiiII)IiiiiiiiIIIII3).iIiIiiiiIiIii = null;
        }
        if (roleUnit != null) {
            IiiiiiiiIIIII3 = new iiIIiiiiIiiII();
            ((iiIIiiiiIiiII)IiiiiiiiIIIII3).ALLATORIxDEMO = roleUnit.iiIiIiiiiIIIi;
            ((iiIIiiiiIiiII)IiiiiiiiIIIII3).IIiiIiiiIIiIi = roleUnit.IIiiiiiiiIIIi;
            ((iiIIiiiiIiiII)IiiiiiiiIIIII3).IiiiiiiiIIIII = z1 > 0;
            iIiIiiiiIiIii.set(iIiIiiiiIiIii.size() - 1, (iiIIiiiiIiiII)IiiiiiiiIIIII3);
        }
        iIiIiiiiIiIii = iiIiIiiiiIiii.ALLATORIxDEMO(iIiIiiiiIiIii);
        IiiiiiiiIIIII3 = new ArrayList(iIiIiiiiIiIii.size());
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < iIiIiiiiIiIii.size()) {
            IiiiiiiiIIIII = iIiIiiiiIiIii.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII3.add(new PathPoint(IiiiiiiiIIIII.ALLATORIxDEMO, IiiiiiiiIIIII.IIiiIiiiIIiIi));
        }
        IiIIIiiiiIiiI = null;
        iIiIiiiiIiIii.clear();
        return IiiiiiiiIIIII3;
    }

    public static List<iiIIiiiiIiiII> ALLATORIxDEMO(List<iiIIiiiiIiiII> list) {
        ArrayList<iiIIiiiiIiiII> IiiiiiiiIIIII = new ArrayList<iiIIiiiiIiiII>();
        int IiiiiiiiIIIII2 = list.size() - 1;
        IiiiiiiiIIIII.add(list.get(IiiiiiiiIIIII2));
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2;
        while (IiiiiiiiIIIII3 >= 0) {
            iiIIiiiiIiiII IiiiiiiiIIIII4 = list.get(IiiiiiiiIIIII3);
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3) {
                iiIIiiiiIiiII IiiiiiiiIIIII6 = list.get(IiiiiiiiIIIII5);
                if (IiiiiiiiIIIII4.IiiiiiiiIIIII != IiiiiiiiIIIII6.IiiiiiiiIIIII) {
                    if (IiiiiiiiIIIII4.ALLATORIxDEMO == IiiiiiiiIIIII6.ALLATORIxDEMO && IiiiiiiiIIIII4.IIiiIiiiIIiIi == IiiiiiiiIIIII6.IIiiIiiiIIiIi) {
                        IiiiiiiiIIIII3 = IiiiiiiiIIIII5 + 1;
                        IiiiiiiiIIIII.remove(IiiiiiiiIIIII4);
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII6);
                    }
                } else if (iiIiIiiiiIiii.ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII6)) {
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII5 + 1;
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII6);
                    break;
                }
                ++IiiiiiiiIIIII5;
            }
            --IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    static {
        int[][] nArrayArray = new int[8][];
        int[] nArray = new int[2];
        nArray[1] = -1;
        nArrayArray[0] = nArray;
        nArrayArray[1] = new int[]{1, -1};
        int[] nArray2 = new int[2];
        nArray2[0] = 1;
        nArrayArray[2] = nArray2;
        nArrayArray[3] = new int[]{1, 1};
        int[] nArray3 = new int[2];
        nArray3[1] = 1;
        nArrayArray[4] = nArray3;
        nArrayArray[5] = new int[]{-1, 1};
        int[] nArray4 = new int[2];
        nArray4[0] = -1;
        nArrayArray[6] = nArray4;
        nArrayArray[7] = new int[]{-1, -1};
        iiiiIiiiIiiII = nArrayArray;
        iIiIiiiiIiIii = new ArrayList<iiIIiiiiIiiII>(128);
        iiIiiiiiiiIii = 65535;
        IIiiIiiiIIiIi = (byte)3;
        iiiIiiiiiiiIi = 0;
        IiiiiiiiIIIII = 1;
        ALLATORIxDEMO = (byte)3;
        iIiiIiiiiiiII = (byte)4;
        iiIiIiiiiIIIi = (byte)12;
    }

    public static byte[] ALLATORIxDEMO(IIIIIiiiIiiII mapDecoder) {
        IiIIIiiiiIiiI = mapDecoder;
        if (IiIiiiiiIIIII == null || IiIiiiiiIIIII.length < mapDecoder.IIIiiiiiIIiII.length) {
            IiIiiiiiIIIII = new byte[mapDecoder.IIIiiiiiIIiII.length];
        } else {
            Arrays.fill(IiIiiiiiIIIII, iiiIiiiiiiiIi);
        }
        return IiIiiiiiIIIII;
    }

    public static boolean ALLATORIxDEMO(int dir, int tmpx, int tmpy, int tmpz) {
        if (dir == 0) return false;
        if (dir == 2) return false;
        if (dir == 4) return false;
        if (dir == 6) {
            return false;
        }
        if (dir == 1) {
            if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(tmpx + iiiiIiiiIiiII[6][0], tmpy + iiiiIiiiIiiII[6][1], tmpz)) return false;
            if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(tmpx + iiiiIiiiIiiII[4][0], tmpy + iiiiIiiiIiiII[4][1], tmpz)) return false;
            return true;
        }
        if (dir == 3) {
            if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(tmpx + iiiiIiiiIiiII[0][0], tmpy + iiiiIiiiIiiII[0][1], tmpz)) return false;
            if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(tmpx + iiiiIiiiIiiII[6][0], tmpy + iiiiIiiiIiiII[6][1], tmpz)) return false;
            return true;
        }
        if (dir == 5) {
            if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(tmpx + iiiiIiiiIiiII[0][0], tmpy + iiiiIiiiIiiII[0][1], tmpz)) return false;
            if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(tmpx + iiiiIiiiIiiII[2][0], tmpy + iiiiIiiiIiiII[2][1], tmpz)) return false;
            return true;
        }
        if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(tmpx + iiiiIiiiIiiII[2][0], tmpy + iiiiIiiiIiiII[2][1], tmpz)) return false;
        if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(tmpx + iiiiIiiiIiiII[4][0], tmpy + iiiiIiiiIiiII[4][1], tmpz)) return false;
        return true;
    }

    public static iiIIiiiiIiiII ALLATORIxDEMO(int dir, iiIIiiiiIiiII pathPoint, iiIIiiiiIiiII qishi, iiIIiiiiIiiII zhongdian) {
        int IiiiiiiiIIIII = pathPoint.ALLATORIxDEMO;
        int IiiiiiiiIIIII2 = pathPoint.IIiiIiiiIIiIi;
        if (dir == 0) {
            return new iiIIiiiiIiiII(IiiiiiiiIIIII, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII);
        }
        if (dir == 1) {
            return new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII);
        }
        if (dir == 2) {
            return new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2, pathPoint.IiiiiiiiIIIII);
        }
        if (dir == 3) {
            return new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII);
        }
        if (dir == 4) {
            return new iiIIiiiiIiiII(IiiiiiiiIIIII, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII);
        }
        if (dir == 5) {
            return new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII);
        }
        if (dir == 6) {
            return new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2, pathPoint.IiiiiiiiIIIII);
        }
        if (dir == 7) {
            return new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII);
        }
        if (dir == 12) {
            return iiIiIiiiiIiii.ALLATORIxDEMO(new iiIIiiiiIiiII(IiiiiiiiIIIII, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII), new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII), qishi, zhongdian);
        }
        if (dir == 11) {
            return iiIiIiiiiIiii.ALLATORIxDEMO(new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII), new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2, pathPoint.IiiiiiiiIIIII), qishi, zhongdian);
        }
        if (dir == 31) {
            return iiIiIiiiiIiii.ALLATORIxDEMO(new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2, pathPoint.IiiiiiiiIIIII), new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII), qishi, zhongdian);
        }
        if (dir == 32) {
            return iiIiIiiiiIiii.ALLATORIxDEMO(new iiIIiiiiIiiII(IiiiiiiiIIIII + 1, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII), new iiIIiiiiIiiII(IiiiiiiiIIIII, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII), qishi, zhongdian);
        }
        if (dir == 52) {
            return iiIiIiiiiIiii.ALLATORIxDEMO(new iiIIiiiiIiiII(IiiiiiiiIIIII, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII), new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII), qishi, zhongdian);
        }
        if (dir == 51) {
            return iiIiIiiiiIiii.ALLATORIxDEMO(new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2 + 1, pathPoint.IiiiiiiiIIIII), new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2, pathPoint.IiiiiiiiIIIII), qishi, zhongdian);
        }
        if (dir == 71) {
            return iiIiIiiiiIiii.ALLATORIxDEMO(new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2, pathPoint.IiiiiiiiIIIII), new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII), qishi, zhongdian);
        }
        if (dir != 72) return pathPoint;
        return iiIiIiiiiIiii.ALLATORIxDEMO(new iiIIiiiiIiiII(IiiiiiiiIIIII - 1, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII), new iiIIiiiiIiiII(IiiiiiiiIIIII, IiiiiiiiIIIII2 - 1, pathPoint.IiiiiiiiIIIII), qishi, zhongdian);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(iiIIiiiiIiiII iiIIiiiiIiiII2, iiIIiiiiIiiII iiIIiiiiIiiII3) {
        iiIIiiiiIiiII qishi;
        void zhongdian;
        int IiiiiiiiIIIII = iiIiIiiiiIiii.ALLATORIxDEMO(iiIiIiiiiIiii.ALLATORIxDEMO(iiIIiiiiIiiII3.ALLATORIxDEMO - iiIIiiiiIiiII2.ALLATORIxDEMO, zhongdian.IIiiIiiiIIiIi - qishi.IIiiIiiiIIiIi));
        iiIIiiiiIiiII IiiiiiiiIIIII2 = qishi;
        while (zhongdian.ALLATORIxDEMO != IiiiiiiiIIIII2.ALLATORIxDEMO || zhongdian.IIiiIiiiIIiIi != IiiiiiiiIIIII2.IIiiIiiiIIiIi) {
            IiiiiiiiIIIII2 = iiIiIiiiiIiii.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2, qishi, (iiIIiiiiIiiII)zhongdian);
            if (!IiIIIiiiiIiiI.iiiIiiiiiiIIi(IiiiiiiiIIIII2.ALLATORIxDEMO / 20, IiiiiiiiIIIII2.IIiiIiiiIIiIi / 20, IiiiiiiiIIIII2.IiiiiiiiIIIII ? 1 : 0)) continue;
            return false;
        }
        return true;
    }

    public static int ALLATORIxDEMO(int dir) {
        if (dir <= 7) {
            return dir;
        }
        switch (dir) {
            case 11: {
                return 11;
            }
            case 12: {
                return 11;
            }
            case 13: {
                return 12;
            }
            case 14: {
                return 12;
            }
            case 31: {
                return 31;
            }
            case 32: {
                return 31;
            }
            case 33: {
                return 32;
            }
            case 34: {
                return 32;
            }
            case 51: {
                return 51;
            }
            case 52: {
                return 51;
            }
            case 53: {
                return 52;
            }
            case 54: {
                return 52;
            }
            case 71: {
                return 71;
            }
            case 72: {
                return 71;
            }
            case 73: {
                return 72;
            }
            case 74: {
                return 72;
            }
        }
        return dir;
    }

    public static int ALLATORIxDEMO(int dx, int dy) {
        int IiiiiiiiIIIII = 8;
        if (dx == 0 && dy == 0) {
            IiiiiiiiIIIII = 8;
            return IiiiiiiiIIIII;
        }
        if (dx == 0) {
            if (dy > 0) {
                IiiiiiiiIIIII = 4;
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 0;
            return IiiiiiiiIIIII;
        }
        if (dy == 0) {
            if (dx > 0) {
                IiiiiiiiIIIII = 2;
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 6;
            return IiiiiiiiIIIII;
        }
        int IiiiiiiiIIIII2 = Math.abs(dx);
        int IiiiiiiiIIIII3 = Math.abs(dy);
        int IiiiiiiiIIIII4 = 0;
        IiiiiiiiIIIII4 = IiiiiiiiIIIII2 == IiiiiiiiIIIII3 ? 0 : (IiiiiiiiIIIII2 > IiiiiiiiIIIII3 * 3 ? 1 : (IiiiiiiiIIIII3 > IiiiiiiiIIIII2 * 3 ? 4 : (IiiiiiiiIIIII2 > IiiiiiiiIIIII3 ? 2 : 3)));
        if (dy > 0 && dx > 0) {
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII = 3;
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 30 + IiiiiiiiIIIII4;
            return IiiiiiiiIIIII;
        }
        if (dy < 0 && dx < 0) {
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII = 7;
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 70 + IiiiiiiiIIIII4;
            return IiiiiiiiIIIII;
        }
        if (dy > 0 && dx < 0) {
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII = 5;
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 50 + IiiiiiiiIIIII4;
            return IiiiiiiiIIIII;
        }
        if (IiiiiiiiIIIII4 == 0) {
            IiiiiiiiIIIII = 1;
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 10 + IiiiiiiiIIIII4;
        return IiiiiiiiIIIII;
    }

    public static iiIIiiiiIiiII ALLATORIxDEMO(iiIIiiiiIiiII dian1, iiIIiiiiIiiII dian2, iiIIiiiiIiiII qishi, iiIIiiiiIiiII zhongdian) {
        if (iiIiIiiiiIiii.ALLATORIxDEMO(dian1, qishi, zhongdian) > iiIiIiiiiIiii.ALLATORIxDEMO(dian2, qishi, zhongdian)) return dian2;
        return dian1;
    }
}
