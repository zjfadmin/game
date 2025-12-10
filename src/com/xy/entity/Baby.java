/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.BaseEquip
 *  com.xy.formula.BaseQl
 *  com.xy.formula.BaseValue
 *  com.xy.formula.PropertyUtil
 *  com.xy.game.RoleData
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.entity;

import com.xy.formula.BaseEquip;
import com.xy.formula.BaseQl;
import com.xy.formula.BaseValue;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IIiiIiiiiIIiI;
import java.math.BigDecimal;
import java.util.Map;

public class Baby {
    private Integer mingqi;
    private String parts;
    private Integer babyage;
    private Integer naili;
    private Integer yangyujin;
    private Integer wanxing;
    private Integer wenbao;
    private BigDecimal babyid;
    private Integer childSex;
    private Integer xiaoxin;
    private BigDecimal roleid;
    private Integer neili;
    private Integer qingmi;
    private Integer zhili;
    private Integer qizhi;
    private Integer panni;
    private String babyname;
    private String outcome;
    private Integer pilao;
    private String Talents;
    private Integer daode;

    public Integer getQingmi() {
        return this.qingmi;
    }

    public void setNaili(Integer naili) {
        this.naili = naili;
    }

    public Integer getDaode() {
        return this.daode;
    }

    public void setBabyid(BigDecimal babyid) {
        this.babyid = babyid;
    }

    public void setZhili(Integer zhili) {
        this.zhili = zhili;
    }

    public void setPilao(Integer pilao) {
        this.pilao = pilao;
    }

    public void setPanni(Integer panni) {
        this.panni = panni;
    }

    public Integer getPilao() {
        return this.pilao;
    }

    public void setYangyujin(Integer yangyujin) {
        this.yangyujin = yangyujin;
    }

    public Integer getNaili() {
        return this.naili;
    }

    public Integer getWanxing() {
        return this.wanxing;
    }

    public void setNeili(Integer neili) {
        this.neili = neili;
    }

    public Integer getXiaoxin() {
        return this.xiaoxin;
    }

    public void setBabyage(Integer babyage) {
        this.babyage = babyage;
    }

    public Integer getYangyujin() {
        return this.yangyujin;
    }

    public void setQingmi(Integer qingmi) {
        this.qingmi = qingmi;
    }

    public Map<String, Double> getBabyMap(RoleData roleData) {
        Double IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        Map IiiiiiiiIIIII3 = IIiIiiiiIiIII.ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = 1;
        while (IiiiiiiiIIIII4 <= 10) {
            double IiiiiiiiIIIII5 = 0.0;
            if (IiiiiiiiIIIII4 == 1) {
                IiiiiiiiIIIII5 = this.getQizhi().intValue();
            } else if (IiiiiiiiIIIII4 == 2) {
                IiiiiiiiIIIII5 = this.getNeili().intValue();
            } else if (IiiiiiiiIIIII4 == 3) {
                IiiiiiiiIIIII5 = this.getZhili().intValue();
            } else if (IiiiiiiiIIIII4 == 4) {
                IiiiiiiiIIIII5 = this.getNaili().intValue();
            } else if (IiiiiiiiIIIII4 == 5) {
                IiiiiiiiIIIII5 = this.getMingqi().intValue();
            } else if (IiiiiiiiIIIII4 == 6) {
                IiiiiiiiIIIII5 = this.getDaode().intValue();
            } else if (IiiiiiiiIIIII4 == 7) {
                IiiiiiiiIIIII5 = this.getPanni().intValue();
            } else if (IiiiiiiiIIIII4 == 8) {
                IiiiiiiiIIIII5 = this.getWanxing().intValue();
            } else if (IiiiiiiiIIIII4 == 9) {
                IiiiiiiiIIIII5 = this.getQingmi().intValue();
            } else if (IiiiiiiiIIIII4 == 10) {
                IiiiiiiiIIIII5 = this.getXiaoxin().intValue();
            }
            if (IiiiiiiiIIIII5 != 0.0) {
                IiiiiiiiIIIII3.put(BaseValue.babyKeys[IiiiiiiiIIIII4], IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII4;
        }
        IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < this.parts.length()) {
            long IiiiiiiiIIIII8;
            Goodstable IiiiiiiiIIIII9;
            IiiiiiiiIIIII7 = this.parts.indexOf("|", IiiiiiiiIIIII6 + 1);
            if (IiiiiiiiIIIII7 == -1) {
                IiiiiiiiIIIII7 = this.parts.length();
            }
            Goodstable goodstable = IiiiiiiiIIIII9 = (IiiiiiiiIIIII8 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.parts, (int)IiiiiiiiIIIII6, (int)IiiiiiiiIIIII7)) > 0L ? roleData.getGoodEquip(new BigDecimal(IiiiiiiiIIIII8)) : null;
            if (IiiiiiiiIIIII9 != null) {
                BaseEquip IiiiiiiiIIIII10 = new BaseEquip(IiiiiiiiIIIII9.getValue(), IiiiiiiiIIIII9.getType().longValue(), roleData.getObjectArea(), roleData);
                IiiiiiiiIIIII2 = IiiiiiiiIIIII10.getQls() != null ? IiiiiiiiIIIII10.getQls().size() - 1 : -1;
                while (IiiiiiiiIIIII2 >= 0) {
                    IiiiiiiiIIIII = (BaseQl)IiiiiiiiIIIII10.getQls().get(IiiiiiiiIIIII2);
                    --IiiiiiiiIIIII2;
                    PropertyUtil.ALLATORIxDEMO((Map)IiiiiiiiIIIII3, (String)IiiiiiiiIIIII.getKey(), (double)IiiiiiiiIIIII.getValue());
                }
                IiiiiiiiIIIII2 = IiiiiiiiIIIII10.getQlews() != null ? IiiiiiiiIIIII10.getQlews().size() - 1 : -1;
                while (IiiiiiiiIIIII2 >= 0) {
                    IiiiiiiiIIIII = (BaseQl)IiiiiiiiIIIII10.getQlews().get(IiiiiiiiIIIII2);
                    --IiiiiiiiIIIII2;
                    PropertyUtil.ALLATORIxDEMO((Map)IiiiiiiiIIIII3, (String)IiiiiiiiIIIII.getKey(), (double)IiiiiiiiIIIII.getValue());
                }
            }
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII7 + 1;
        }
        double IiiiiiiiIIIII22 = 0.0;
        double IiiiiiiiIIIII32 = 0.0;
        double IiiiiiiiIIIII11 = 0.0;
        int IiiiiiiiIIIII12 = 0;
        IiiiiiiiIIIII2 = 1;
        while (IiiiiiiiIIIII2 <= 8) {
            IiiiiiiiIIIII = (Double)IiiiiiiiIIIII3.get(BaseValue.babyKeys[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII != null) {
                if (IiiiiiiiIIIII2 >= 1 && IiiiiiiiIIIII2 <= 7) {
                    IiiiiiiiIIIII22 += IiiiiiiiIIIII.doubleValue();
                    IiiiiiiiIIIII11 += 1.0;
                    IiiiiiiiIIIII12 |= 1 << IiiiiiiiIIIII2;
                } else if (IiiiiiiiIIIII2 == 8) {
                    IiiiiiiiIIIII32 -= IiiiiiiiIIIII * 20.0;
                }
            }
            ++IiiiiiiiIIIII2;
        }
        IiiiiiiiIIIII2 = 0;
        while ((double)IiiiiiiiIIIII2 < IiiiiiiiIIIII11) {
            int IiiiiiiiIIIII13 = 0;
            double IiiiiiiiIIIII14 = 0.0;
            int IiiiiiiiIIIII15 = 1;
            while (IiiiiiiiIIIII15 <= 7) {
                if ((IiiiiiiiIIIII12 >> IiiiiiiiIIIII15 & 1) == 1) {
                    double IiiiiiiiIIIII16 = (Double)IiiiiiiiIIIII3.get(BaseValue.babyKeys[IiiiiiiiIIIII15]);
                    if (IiiiiiiiIIIII13 == 0 || IiiiiiiiIIIII16 > IiiiiiiiIIIII14) {
                        IiiiiiiiIIIII13 = IiiiiiiiIIIII15;
                        IiiiiiiiIIIII14 = IiiiiiiiIIIII16;
                    }
                }
                ++IiiiiiiiIIIII15;
            }
            IiiiiiiiIIIII12 &= ~(1 << IiiiiiiiIIIII13);
            double d = BaseValue.babyTotal3XS[IiiiiiiiIIIII2];
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII32 += Math.pow(IiiiiiiiIIIII14, 0.2) * d;
        }
        IiiiiiiiIIIII3.put(BaseValue.babyTotal1, IiiiiiiiIIIII22);
        IiiiiiiiIIIII3.put(BaseValue.babyTotal3, Math.max(IiiiiiiiIIIII32, 0.0));
        return IiiiiiiiIIIII3;
    }

    public Integer getQizhi() {
        return this.qizhi;
    }

    public Integer getMingqi() {
        return this.mingqi;
    }

    public void setChildSex(Integer childSex) {
        this.childSex = childSex;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public BigDecimal ALLATORIxDEMO(BigDecimal id, int type) {
        BigDecimal[] IiiiiiiiIIIII = this.getpartAll();
        BigDecimal IiiiiiiiIIIII2 = IiiiiiiiIIIII[type];
        IiiiiiiiIIIII[type] = id;
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII4 != 0) {
                IiiiiiiiIIIII3.append("|");
            }
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII[IiiiiiiiIIIII4++]);
        }
        this.parts = IiiiiiiiIIIII3.toString();
        return IiiiiiiiIIIII2;
    }

    public void setWanxing(Integer wanxing) {
        this.wanxing = wanxing;
    }

    public void setMingqi(Integer mingqi) {
        this.mingqi = mingqi;
    }

    public void setBabyname(String babyname) {
        this.babyname = babyname;
    }

    public void setQizhi(Integer qizhi) {
        this.qizhi = qizhi;
    }

    public String getOutcome() {
        return this.outcome;
    }

    public Integer getWenbao() {
        return this.wenbao;
    }

    public String getParts() {
        if (this.parts != null) {
            if (!this.parts.equals("")) return this.parts;
        }
        this.parts = "-1|-1|-1|-1";
        return this.parts;
    }

    public BigDecimal getpart(int type) {
        String[] IiiiiiiiIIIII = this.getParts().split("\\|");
        if (type >= IiiiiiiiIIIII.length) return new BigDecimal(-1);
        return new BigDecimal(IiiiiiiiIIIII[type]);
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public BigDecimal[] getpartAll() {
        BigDecimal[] IiiiiiiiIIIII = new BigDecimal[4];
        String[] IiiiiiiiIIIII2 = this.getParts().split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < 4) {
            IiiiiiiiIIIII[IiiiiiiiIIIII3] = IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length ? new BigDecimal(IiiiiiiiIIIII2[IiiiiiiiIIIII3]) : new BigDecimal(-1);
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO(int type, String talent) {
        String[] IiiiiiiiIIIII = this.getTalents().split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].split("=")[0].equals(talent)) {
                return false;
            }
            ++IiiiiiiiIIIII2;
        }
        IiiiiiiiIIIII[type] = String.valueOf(talent) + "=1";
        StringBuffer IiiiiiiiIIIII22 = new StringBuffer();
        IiiiiiiiIIIII22.append(IiiiiiiiIIIII[0]);
        IiiiiiiiIIIII22.append("|");
        IiiiiiiiIIIII22.append(IiiiiiiiIIIII[1]);
        IiiiiiiiIIIII22.append("|");
        IiiiiiiiIIIII22.append(IiiiiiiiIIIII[2]);
        this.Talents = IiiiiiiiIIIII22.toString();
        return true;
    }

    public void setXiaoxin(Integer xiaoxin) {
        this.xiaoxin = xiaoxin;
    }

    public Integer getNeili() {
        return this.neili;
    }

    public void setDaode(Integer daode) {
        this.daode = daode;
    }

    public void setWenbao(Integer wenbao) {
        this.wenbao = wenbao;
    }

    public BigDecimal getBabyid() {
        return this.babyid;
    }

    public Integer getChildSex() {
        return this.childSex;
    }

    public String getTalents() {
        if (this.Talents == null) return "1=1|2=1|3=1";
        if (!this.Talents.equals("")) return this.Talents;
        return "1=1|2=1|3=1";
    }

    public Integer getPanni() {
        return this.panni;
    }

    public Integer getBabyage() {
        return this.babyage;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public String getBabyname() {
        return this.babyname;
    }

    public void setTalents(String talents) {
        this.Talents = talents;
    }

    public Integer getZhili() {
        return this.zhili;
    }
}
