/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.RoleShow
 *  com.xy.scene.BWDHRuleBattleRecord
 *  com.xy.scene.BWDHTeam
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.scene;

import com.xy.bean.RoleShow;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import com.xy.v.IIiiIiiiiIIiI;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BWDHRuleBattle {
    private int win;
    private Point point;
    private int type;
    private BWDHTeam bwdhTeam1;
    private BWDHTeam bwdhTeam2;

    public void setBwdhTeam2(BWDHTeam bwdhTeam2) {
        this.bwdhTeam2 = bwdhTeam2;
    }

    public BWDHTeam ALLATORIxDEMO(int flag, String data, int index, int indexFlag) {
        BWDHTeam IiiiiiiiIIIII = new BWDHTeam();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < indexFlag) {
            IiiiiiiiIIIII3 = data.indexOf("&", index + 1);
            if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > indexFlag) {
                IiiiiiiiIIIII3 = indexFlag;
            }
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII2 == 1) {
                IiiiiiiiIIIII.setName(data.substring(index, IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII2 == 2) {
                if (flag == 1) {
                    this.point.x = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII3);
                } else {
                    this.point.y = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII3);
                }
            }
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII3 + 1;
        }
        if (IiiiiiiiIIIII.getId() != 0) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setName("&\u8f6e\u7a7a&");
        return IiiiiiiiIIIII;
    }

    public int getType() {
        return this.type;
    }

    public BWDHTeam ALLATORIxDEMO(String data, int index, int indexFlag) {
        BWDHTeam IiiiiiiiIIIII = new BWDHTeam();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < indexFlag) {
            IiiiiiiiIIIII3 = data.indexOf("&", index + 1);
            if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > indexFlag) {
                IiiiiiiiIIIII3 = indexFlag;
            }
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII2 == 1) {
                IiiiiiiiIIIII.setName(data.substring(index, IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII2 == 2 || IiiiiiiiIIIII2 == 3) {
                if (IiiiiiiiIIIII.getRoleShows() == null) {
                    IiiiiiiiIIIII.setRoleShows(new RoleShow[1]);
                    IiiiiiiiIIIII.getRoleShows()[0] = new RoleShow();
                }
                if (IiiiiiiiIIIII2 == 2) {
                    IiiiiiiiIIIII.getRoleShows()[0].setSpecies_id(new BigDecimal(data.substring(index, IiiiiiiiIIIII3)));
                } else if (IiiiiiiiIIIII2 == 3) {
                    IiiiiiiiIIIII.getRoleShows()[0].setRolename(data.substring(index, IiiiiiiiIIIII3));
                }
            }
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII3 + 1;
        }
        if (IiiiiiiiIIIII.getId() != 0) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setName("&\u8f6e\u7a7a&");
        return IiiiiiiiIIIII;
    }

    public BWDHTeam getBwdhTeam2() {
        return this.bwdhTeam2;
    }

    /*
     * WARNING - void declaration
     */
    public BWDHRuleBattle(String string, int n, int n2) {
        void indexFlag;
        this.point = new Point();
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            int index;
            void data;
            IiiiiiiiIIIII2 = data.indexOf("#", (int)(index + true));
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (IiiiiiiiIIIII == 0) {
                this.win = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 1) {
                this.bwdhTeam1 = this.ALLATORIxDEMO(IiiiiiiiIIIII, (String)data, index, IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 2) {
                this.bwdhTeam2 = this.ALLATORIxDEMO(IiiiiiiiIIIII, (String)data, index, IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string, int n, int n2, List<BWDHRuleBattleRecord> list) {
        void indexFlag;
        this.point = new Point();
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            int index;
            void data;
            IiiiiiiiIIIII2 = data.indexOf("#", (int)(index + true));
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (IiiiiiiiIIIII == 0) {
                this.type = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 1) {
                this.win = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 2) {
                this.bwdhTeam1 = this.ALLATORIxDEMO(0, (String)data, index, IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 3) {
                this.bwdhTeam2 = this.ALLATORIxDEMO(0, (String)data, index, IiiiiiiiIIIII2);
            } else {
                void list2;
                list2.add(new BWDHRuleBattleRecord(IiiiiiiiIIIII - 3, (String)data, index, IiiiiiiiIIIII2, this));
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public void setBwdhTeam1(BWDHTeam bwdhTeam1) {
        this.bwdhTeam1 = bwdhTeam1;
    }

    public Point getPoint() {
        return this.point;
    }

    public BWDHRuleBattle() {
    }

    public BWDHTeam getBwdhTeam1() {
        return this.bwdhTeam1;
    }

    public int getWin() {
        return this.win;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string, int n, int n2) {
        void indexFlag;
        this.point = new Point();
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            int index;
            void data;
            IiiiiiiiIIIII2 = data.indexOf("#", (int)(index + true));
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (IiiiiiiiIIIII == 0) {
                this.type = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 1) {
                this.win = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 2) {
                this.bwdhTeam1 = this.ALLATORIxDEMO((String)data, index, IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 3) {
                this.bwdhTeam2 = this.ALLATORIxDEMO((String)data, index, IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }
}
