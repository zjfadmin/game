/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class GoodFight {
    private String mapName;
    private GoodFight nextFight;
    private int map;
    private int num;
    private int y;
    private int x;

    public GoodFight(int map, int x, int y, String mapName) {
        this.map = map;
        this.x = x;
        this.y = y;
        this.mapName = mapName;
    }

    public int getX() {
        return this.x;
    }

    public GoodFight(String value) {
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        String[] IiiiiiiiIIIII = value.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith("\u4f20\u9001=")) {
                this.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(3).split(","));
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith("\u53ef\u7528\u6b21\u6570=")) {
                this.num = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(5));
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public String ALLATORIxDEMO(GoodFight fight, boolean isNum) {
        boolean IiiiiiiiIIIII = fight != null;
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        GoodFight IiiiiiiiIIIII3 = this;
        while (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.map != 0) {
            if (IiiiiiiiIIIII2.length() != 0) {
                IiiiiiiiIIIII2.append("|");
            }
            IiiiiiiiIIIII2.append("\u4f20\u9001=");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3.map);
            IiiiiiiiIIIII2.append(",");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3.mapName);
            IiiiiiiiIIIII2.append(",");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3.x);
            IiiiiiiiIIIII2.append(",");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3.y);
            if (IiiiiiiiIIIII && fight.map == IiiiiiiiIIIII3.map && fight.x == IiiiiiiiIIIII3.x && fight.y == IiiiiiiiIIIII3.y) {
                IiiiiiiiIIIII = false;
            }
            IiiiiiiiIIIII3 = IiiiiiiiIIIII3.nextFight;
        }
        if (IiiiiiiiIIIII) {
            return null;
        }
        if (isNum) {
            --this.num;
        }
        if (IiiiiiiiIIIII2.length() != 0) {
            IiiiiiiiIIIII2.append("|");
        }
        IiiiiiiiIIIII2.append("\u53ef\u7528\u6b21\u6570=");
        IiiiiiiiIIIII2.append(this.num);
        return IiiiiiiiIIIII2.toString();
    }

    public String ALLATORIxDEMO(int map, int x, int y, String mapName) {
        GoodFight IiiiiiiiIIIII = this;
        while (IiiiiiiiIIIII.map != 0) {
            GoodFight IiiiiiiiIIIII2 = IiiiiiiiIIIII.nextFight;
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII.nextFight = IiiiiiiiIIIII2 = new GoodFight(map, x, y, mapName);
                return this.ALLATORIxDEMO(null, false);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2;
        }
        this.map = map;
        this.mapName = mapName;
        this.x = x;
        this.y = y;
        return this.ALLATORIxDEMO(null, false);
    }

    public GoodFight getFight(int map, int x, int y) {
        if (this.map == map && this.x == x && this.y == y) {
            return this;
        }
        if (this.nextFight == null) return null;
        return this.nextFight.getFight(map, x, y);
    }

    public int getMap() {
        return this.map;
    }

    public String getMenu() {
        return String.valueOf(this.mapName) + "(" + this.x / 20 + "," + this.y / 20 + ")";
    }

    public String ALLATORIxDEMO(GoodFight fight, int map, int x, int y, String mapName) {
        if (fight.map == 0) {
            return null;
        }
        GoodFight IiiiiiiiIIIII = null;
        GoodFight IiiiiiiiIIIII2 = this;
        while (IiiiiiiiIIIII2 != null) {
            if (fight.map == IiiiiiiiIIIII2.map && fight.x == IiiiiiiiIIIII2.x && fight.y == IiiiiiiiIIIII2.y) {
                if (map != 0) {
                    IiiiiiiiIIIII2.map = map;
                    IiiiiiiiIIIII2.mapName = mapName;
                    IiiiiiiiIIIII2.x = x;
                    IiiiiiiiIIIII2.y = y;
                    break;
                }
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII.nextFight = IiiiiiiiIIIII2.nextFight;
                    break;
                }
                if (IiiiiiiiIIIII2.nextFight == null) {
                    IiiiiiiiIIIII2.map = 0;
                    IiiiiiiiIIIII2.mapName = null;
                    IiiiiiiiIIIII2.x = 0;
                    IiiiiiiiIIIII2.y = 0;
                    break;
                }
                IiiiiiiiIIIII2.map = IiiiiiiiIIIII2.nextFight.map;
                IiiiiiiiIIIII2.mapName = IiiiiiiiIIIII2.nextFight.mapName;
                IiiiiiiiIIIII2.x = IiiiiiiiIIIII2.nextFight.x;
                IiiiiiiiIIIII2.y = IiiiiiiiIIIII2.nextFight.y;
                IiiiiiiiIIIII2.nextFight = IiiiiiiiIIIII2.nextFight.nextFight;
                break;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.nextFight;
        }
        if (IiiiiiiiIIIII2 != null) return this.ALLATORIxDEMO(null, false);
        return null;
    }

    public void iIiIiiiiIIiii(String[] vss) {
        GoodFight IiiiiiiiIIIII = this;
        while (IiiiiiiiIIIII.map != 0) {
            GoodFight IiiiiiiiIIIII2 = IiiiiiiiIIIII.nextFight;
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII.nextFight = IiiiiiiiIIIII2 = new GoodFight(vss);
                return;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2;
        }
        this.ALLATORIxDEMO(vss);
    }

    public GoodFight getNextFight() {
        return this.nextFight;
    }

    public int getNum() {
        return this.num;
    }

    public void ALLATORIxDEMO(String[] vss) {
        this.map = Integer.parseInt(vss[0]);
        this.mapName = vss[1];
        this.x = Integer.parseInt(vss[2]);
        this.y = Integer.parseInt(vss[3]);
    }

    public int getY() {
        return this.y;
    }

    public GoodFight(String[] vss) {
        this.ALLATORIxDEMO(vss);
    }

    public String getMapName() {
        return this.mapName;
    }
}
