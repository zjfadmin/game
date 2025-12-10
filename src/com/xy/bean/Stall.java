/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.Commodity
 *  com.xy.bean.StallNeedBean
 */
package com.xy.bean;

import com.xy.bean.Commodity;
import com.xy.bean.StallNeedBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Stall {
    private BigDecimal roleid;
    private int mapid;
    private String role;
    private String stall;
    private List<String> msg2;
    private List<StallNeedBean> needs;
    private Commodity[] goodstables = new Commodity[24];
    private List<String> msg;
    private int state;
    private int x;
    private Commodity[] pets = new Commodity[5];
    private int id;
    private int y;

    public String getRole() {
        return this.role;
    }

    public void setStall(String stall) {
        this.stall = stall;
    }

    public void setGoodstables(Commodity[] goodstables) {
        this.goodstables = goodstables;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMapid() {
        return this.mapid;
    }

    public List<String> getMsg() {
        return this.msg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMapid(int mapid) {
        this.mapid = mapid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public boolean iIiIiiiiIIiii(int buyId) {
        StallNeedBean IiiiiiiiIIIII = this.getStallNeedBean(buyId);
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        this.needs.remove(IiiiiiiiIIIII);
        if (this.needs.size() != 0) return true;
        this.needs = null;
        return true;
    }

    public String iIiIiiiiIIiIi() {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.pets.length) {
            if (this.pets[IiiiiiiiIIIII2] != null && this.pets[IiiiiiiiIIIII2].getPet() != null) {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(this.pets[IiiiiiiiIIIII2].getPet().getSid());
                IiiiiiiiIIIII.append(",");
                IiiiiiiiIIIII.append(1);
                IiiiiiiiIIIII.append(",");
                IiiiiiiiIIIII.append(this.pets[IiiiiiiiIIIII2].getMoney());
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII.toString();
    }

    public String iiiIiiiiiiIIi() {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (this.needs == null) {
            return IiiiiiiiIIIII.toString();
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.needs.size()) {
            StallNeedBean IiiiiiiiIIIII3 = this.needs.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3.getTotal() - IiiiiiiiIIIII3.getNum() > 0) {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII3.getId());
                IiiiiiiiIIIII.append(",");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII3.getTotal() - IiiiiiiiIIIII3.getNum());
                IiiiiiiiIIIII.append(",");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII3.getMoney());
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII.toString();
    }

    public boolean ALLATORIxDEMO(Commodity commodity) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goodstables.length) {
            if (this.goodstables[IiiiiiiiIIIII] != null && this.goodstables[IiiiiiiiIIIII] == commodity) {
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.pets.length) {
            if (this.pets[IiiiiiiiIIIII] != null && this.pets[IiiiiiiiIIIII] == commodity) {
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public int getId() {
        return this.id;
    }

    public int getY() {
        return this.y;
    }

    public String iIiIiiiiIIiii() {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.goodstables.length) {
            if (this.goodstables[IiiiiiiiIIIII2] != null && this.goodstables[IiiiiiiiIIIII2].getGood() != null) {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(this.goodstables[IiiiiiiiIIIII2].getGood().getRgid());
                IiiiiiiiIIIII.append(",");
                IiiiiiiiIIIII.append(this.goodstables[IiiiiiiiIIIII2].getGood().getUsetime());
                IiiiiiiiIIIII.append(",");
                IiiiiiiiIIIII.append(this.goodstables[IiiiiiiiIIIII2].getMoney());
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII.toString();
    }

    public String ALLATORIxDEMO() {
        return new StringBuffer().toString();
    }

    public void setPets(Commodity[] pets) {
        this.pets = pets;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<StallNeedBean> getNeeds() {
        return this.needs;
    }

    public int getNeedNum() {
        if (this.needs == null) {
            return 0;
        }
        int IiiiiiiiIIIII = 0;
        for (StallNeedBean IiiiiiiiIIIII2 : this.needs) {
            if (IiiiiiiiIIIII2.getNum() >= IiiiiiiiIIIII2.getTotal()) continue;
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }

    public int ALLATORIxDEMO(Commodity commodity) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goodstables.length) {
            if (this.goodstables[IiiiiiiiIIIII] != null && this.goodstables[IiiiiiiiIIIII] == commodity) {
                this.goodstables[IiiiiiiiIIIII] = null;
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.pets.length) {
            if (this.pets[IiiiiiiiIIIII] != null && this.pets[IiiiiiiiIIIII] == commodity) {
                this.pets[IiiiiiiiIIIII] = null;
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    public int getPath(int type) {
        block5: {
            block4: {
                if (type != 0) break block4;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl12
            }
            if (type != 1) return -1;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl18
            do {
                if (this.goodstables[IiiiiiiiIIIII] == null) {
                    return IiiiiiiiIIIII;
                }
                ++IiiiiiiiIIIII;
lbl12:
                // 2 sources

            } while (IiiiiiiiIIIII < this.goodstables.length);
            break block5;
            do {
                if (this.pets[IiiiiiiiIIIII] == null) {
                    return IiiiiiiiIIIII;
                }
                ++IiiiiiiiIIIII;
lbl18:
                // 2 sources

            } while (IiiiiiiiIIIII < this.pets.length);
        }
        return -1;
    }

    public boolean ALLATORIxDEMO(StallNeedBean needBean) {
        if (this.needs == null) {
            this.needs = new ArrayList<StallNeedBean>();
        } else {
            if (this.needs.size() >= 24) {
                return false;
            }
            if (this.getStallNeedBean(needBean.getId()) != null) {
                return false;
            }
        }
        this.needs.add(needBean);
        return true;
    }

    public String getStall() {
        return this.stall;
    }

    public Commodity[] getGoodstables() {
        return this.goodstables;
    }

    public Commodity[] getPets() {
        return this.pets;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public int getX() {
        return this.x;
    }

    public List<String> getMsg2() {
        return this.msg2;
    }

    /*
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(int type) {
        block9: {
            block8: {
                block7: {
                    if (type != 0) break block7;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl19
                }
                if (type != 1) break block8;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl25
            }
            if (type == 2) return false;
            if (type != 3) return false;
            if (this.needs == null) {
                return false;
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl31
            do {
                if (this.goodstables[IiiiiiiiIIIII] != null) {
                    return true;
                }
                ++IiiiiiiiIIIII;
lbl19:
                // 2 sources

            } while (IiiiiiiiIIIII < this.goodstables.length);
            break block9;
            do {
                if (this.pets[IiiiiiiiIIIII] != null) {
                    return true;
                }
                ++IiiiiiiiIIIII;
lbl25:
                // 2 sources

            } while (IiiiiiiiIIIII < this.pets.length);
            break block9;
            do {
                if ((IiiiiiiiIIIII = this.needs.get(IiiiiiiiIIIII)).getNum() < IiiiiiiiIIIII.getTotal()) {
                    return true;
                }
                ++IiiiiiiiIIIII;
lbl31:
                // 2 sources

            } while (IiiiiiiiIIIII < this.needs.size());
        }
        return false;
    }

    public void setMsg(List<String> msg) {
        this.msg = msg;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Commodity getGood(BigDecimal rgid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goodstables.length) {
            if (this.goodstables[IiiiiiiiIIIII] != null && this.goodstables[IiiiiiiiIIIII].getGood().getRgid().compareTo(rgid) == 0) {
                return this.goodstables[IiiiiiiiIIIII];
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public int getState() {
        return this.state;
    }

    public StallNeedBean getStallNeedBean(int buyId) {
        if (this.needs == null) {
            return null;
        }
        for (StallNeedBean IiiiiiiiIIIII : this.needs) {
            if (IiiiiiiiIIIII.getId() != buyId) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public void setMsg2(List<String> msg2) {
        this.msg2 = msg2;
    }

    public Commodity getCommodity(int type, int index) {
        if (type == 0) {
            return this.goodstables[index];
        }
        if (type != 1) return null;
        return this.pets[index];
    }

    public Commodity getPet(BigDecimal rgid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.pets.length) {
            if (this.pets[IiiiiiiiIIIII] != null && this.pets[IiiiiiiiIIIII].getPet().getSid().compareTo(rgid) == 0) {
                return this.pets[IiiiiiiiIIIII];
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }
}
