/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.GoodTrans2
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.readbean.Goodstable
 */
package com.xy.bean;

import com.xy.bean.GoodTrans2;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodTrans {
    private List<Goodstable> goods;
    private BigDecimal money;
    private List<Lingbao> lingbaos;
    private List<RoleSummoning> pets;

    public List<Lingbao> getLingbaos() {
        return this.lingbaos;
    }

    public void setPet(RoleSummoning pet, boolean is) {
        if (pet == null) {
            return;
        }
        if (this.pets == null) {
            this.pets = new ArrayList<RoleSummoning>();
        }
        if (is) {
            this.pets.add(pet);
            return;
        }
        int IiiiiiiiIIIII = this.pets.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.pets.get(IiiiiiiiIIIII).getSid().compareTo(pet.getSid()) == 0) {
                this.pets.remove(IiiiiiiiIIIII);
                return;
            }
            --IiiiiiiiIIIII;
        }
    }

    public Goodstable getGood(BigDecimal rgid) {
        if (this.goods == null) {
            return null;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goods.size()) {
            if (this.goods.get(IiiiiiiiIIIII).getRgid().compareTo(rgid) == 0) {
                return this.goods.get(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public boolean setPet(RoleSummoning pet) {
        if (pet == null) {
            return false;
        }
        if (this.pets == null) {
            this.pets = new ArrayList<RoleSummoning>();
        }
        int IiiiiiiiIIIII = this.pets.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.pets.get(IiiiiiiiIIIII).getSid().compareTo(pet.getSid()) == 0) {
                this.pets.remove(IiiiiiiiIIIII);
                return false;
            }
            --IiiiiiiiIIIII;
        }
        if (this.pets.size() >= 2) {
            return false;
        }
        this.pets.add(pet);
        return true;
    }

    public void setLingbao(Lingbao lingbao, boolean is) {
        if (lingbao == null) {
            return;
        }
        if (this.lingbaos == null) {
            this.lingbaos = new ArrayList<Lingbao>();
        }
        if (is) {
            this.lingbaos.add(lingbao);
            return;
        }
        int IiiiiiiiIIIII = this.lingbaos.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.lingbaos.get(IiiiiiiiIIIII).getBaoid().compareTo(lingbao.getBaoid()) == 0) {
                this.lingbaos.remove(IiiiiiiiIIIII);
                return;
            }
            --IiiiiiiiIIIII;
        }
    }

    public Goodstable getGood(int p) {
        if (this.goods == null) return null;
        if (this.goods.size() > p) return this.goods.get(p);
        return null;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

    public List<RoleSummoning> getPets() {
        return this.pets;
    }

    public void setGoods(List<Goodstable> goods) {
        this.goods = goods;
    }

    public Lingbao getLingbao(int p) {
        if (this.lingbaos == null) return null;
        if (this.lingbaos.size() > p) return this.lingbaos.get(p);
        return null;
    }

    public List<Goodstable> getGoods() {
        return this.goods;
    }

    public boolean setLingbao(Lingbao lingbao) {
        if (lingbao == null) {
            return false;
        }
        if (this.lingbaos == null) {
            this.lingbaos = new ArrayList<Lingbao>();
        }
        int IiiiiiiiIIIII = this.lingbaos.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.lingbaos.get(IiiiiiiiIIIII).getBaoid().compareTo(lingbao.getBaoid()) == 0) {
                this.lingbaos.remove(IiiiiiiiIIIII);
                return false;
            }
            --IiiiiiiiIIIII;
        }
        if (this.lingbaos.size() >= 2) {
            return false;
        }
        this.lingbaos.add(lingbao);
        return true;
    }

    public void setGood(Goodstable good) {
        if (good == null) {
            return;
        }
        if (this.goods == null) {
            this.goods = new ArrayList<Goodstable>();
        }
        int IiiiiiiiIIIII = this.goods.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.goods.get(IiiiiiiiIIIII).getRgid().compareTo(good.getRgid()) == 0) {
                if (good.getUsetime() <= 0) {
                    this.goods.remove(IiiiiiiiIIIII);
                    return;
                }
                this.goods.set(IiiiiiiiIIIII, good);
                return;
            }
            --IiiiiiiiIIIII;
        }
        if (good.getUsetime() <= 0) return;
        this.goods.add(good);
    }

    public void setLingbaos(List<Lingbao> lingbaos) {
        this.lingbaos = lingbaos;
    }

    public RoleSummoning getPet(int p) {
        if (this.pets == null) return null;
        if (this.pets.size() > p) return this.pets.get(p);
        return null;
    }

    public void ALLATORIxDEMO(Graphics g, int type) {
        g.setColor(Color.white);
        if (this.goods == null) return;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goods.size()) {
            int IiiiiiiiIIIII2 = 20 + IiiiiiiiIIIII % 4 * 51;
            int IiiiiiiiIIIII3 = 357 + IiiiiiiiIIIII / 4 * 51;
            if (type == 1) {
                IiiiiiiiIIIII2 += 270;
            }
            String string = this.goods.get(IiiiiiiiIIIII).getUsetime().toString();
            ++IiiiiiiiIIIII;
            g.drawString(string, IiiiiiiiIIIII2 + 4 + 23, IiiiiiiiIIIII3 + 13 - 13);
        }
    }

    public void ALLATORIxDEMO(GoodTrans2 goodTrans2) {
        this.setGood(goodTrans2.getGoods());
        this.setPet(goodTrans2.getPet(), goodTrans2.ALLATORIxDEMO());
        this.setLingbao(goodTrans2.getLingbao(), goodTrans2.ALLATORIxDEMO());
        if (goodTrans2.getMoney() == null) return;
        this.money = goodTrans2.getMoney();
    }

    public void setPets(List<RoleSummoning> pets) {
        this.pets = pets;
    }
}
