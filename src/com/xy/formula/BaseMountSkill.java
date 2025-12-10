/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Mount
 *  com.xy.formula.BaseQl
 *  com.xy.formula.PropertyUtil
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.formula;

import com.xy.entity.Mount;
import com.xy.formula.BaseQl;
import com.xy.formula.PropertyUtil;
import com.xy.readbean.Goodstable;
import com.xy.v.IIiiIiiiiIIiI;

public class BaseMountSkill {
    private int b2;
    private int bt;
    private int b3;
    private double bx;
    private int b1;
    private String name;
    private BaseQl[] bases;

    public void setBt(int bt) {
        this.bt = bt;
    }

    public int getBt() {
        return this.bt;
    }

    public void setBx(double bx) {
        this.bx = bx;
    }

    public BaseMountSkill() {
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public BaseQl[] getBases() {
        return this.bases;
    }

    public int getB1() {
        return this.b1;
    }

    public void setBases(BaseQl[] bases) {
        this.bases = bases;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        if (this.name.equals("\u593a\u547d\u8ffd\u9b42")) {
            return "#W\u589e\u52a0\u81f4\u547d\u3001\u8fde\u51fb\u548cSP#r\u3010\u9002\u5408\u3011\u529b\u91cf\u3001\u7075\u6027\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0SP#R{\u6570\u503c}%#G,\u589e\u52a0\u547d\u4e2d\u7387#R{\u6570\u503c2}%#G,\u589e\u52a0\u8fde\u51fb\u7387#R{\u6570\u503c3}%#G,\u589e\u52a0\u81f4\u547d\u51e0\u7387#R{\u6570\u503c4}%#G";
        }
        if (this.name.equals("\u7834\u91dc\u6c89\u821f")) {
            return "#W\u589e\u52a0\u72c2\u66b4\u3001AP\u548c\u5ffd\u89c6\u7269\u7406\u7a0b\u5ea6#r\u3010\u9002\u5408\u3011\u529b\u91cf\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0AP#R{\u6570\u503c}%#G,\u589e\u52a0\u72c2\u66b4\u51e0\u7387#R{\u6570\u503c2}%#G,\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6#R{\u6570\u503c3}%#G,\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387#R{\u6570\u503c4}%#G";
        }
        if (this.name.equals("\u540e\u53d1\u5236\u4eba")) {
            return "#W\u589e\u52a0\u72c2\u66b4\u3001\u81f4\u547d\u548cHP\u5ea6#r\u3010\u9002\u5408\u3011\u529b\u91cf\u3001\u6839\u9aa8\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0HP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u589e\u52a0\u72c2\u66b4\u51e0\u7387#R{\u6570\u503c2}%#G,\u589e\u52a0\u81f4\u547d\u51e0\u7387#R{\u6570\u503c3}%#G";
        }
        if (this.name.equals("\u5929\u96f7\u6012\u706b")) {
            return "#W\u589e\u52a0\u96f7\u3001\u706b\u3001\u9b3c\u706b\u6cd5\u672f\u5a01\u529b\u548c\u96f7\u3001\u706b\u3001\u9b3c\u706b\u6297\u6027\u548cMP#r\u3010\u9002\u5408\u3011\u7075\u6027\u3001\u6839\u9aa8\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0MP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u52a0\u5f3a\u96f7#R{\u6570\u503c2}%#G,\u52a0\u5f3a\u706b#R{\u6570\u503c2}%#G,\u52a0\u5f3a\u9b3c\u706b#R{\u6570\u503c2}%#G,\u6297\u96f7#R{\u6570\u503c5}%#G,\u6297\u706b#R{\u6570\u503c5}%#G,\u6297\u9b3c\u706b#R{\u6570\u503c5}%#G";
        }
        if (this.name.equals("\u5174\u98ce\u4f5c\u6d6a")) {
            return "#W\u589e\u52a0\u98ce\u3001\u6c34\u3001\u9b3c\u706b\u6cd5\u672f\u5a01\u529b\u548c\u98ce\u3001\u6c34\u3001\u9b3c\u706b\u6297\u6027\u548cMP#r\u3010\u9002\u5408\u3011\u7075\u6027\u3001\u6839\u9aa8\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0MP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u52a0\u5f3a\u98ce#R{\u6570\u503c2}%#G,\u52a0\u5f3a\u6c34#R{\u6570\u503c2}%#G,\u52a0\u5f3a\u9b3c\u706b#R{\u6570\u503c2}%#G,\u6297\u98ce#R{\u6570\u503c5}%#G,\u6297\u6c34#R{\u6570\u503c5}%#G,\u6297\u9b3c\u706b#R{\u6570\u503c5}%#G";
        }
        if (this.name.equals("\u4e07\u52ab\u4e0d\u590d")) {
            return "#W\u589e\u52a0\u4ed9\u65cf\u56db\u7cfb\u6cd5\u672f\u3001\u9b3c\u706b\u6cd5\u672f\u5a01\u529b\u548cMP\u5ea6#r\u3010\u9002\u5408\u3011\u7075\u6027\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0MP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u52a0\u5f3a\u706b#R{\u6570\u503c2}%#G,\u52a0\u5f3a\u98ce#R{\u6570\u503c2}%#G,\u52a0\u5f3a\u96f7#R{\u6570\u503c2}%#G,\u52a0\u5f3a\u6c34#R{\u6570\u503c2}%#G,\u52a0\u5f3a\u9b3c\u706b#R{\u6570\u503c3}%#G";
        }
        if (this.name.equals("\u91d1\u8eab\u4e0d\u574f")) {
            return "#W\u589e\u52a0\u7269\u7406\u3001\u9707\u6151\u3001\u6bd2\u3001\u4e09\u5c38\u866b\u6297\u6027\u548cHP#r\u3010\u9002\u5408\u3011\u6839\u9aa8\u3001\u529b\u91cf\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0HP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u6297\u7269\u7406#R{\u6570\u503c2}%#G,\u6297\u9707\u6151#R{\u6570\u503c3}%#G,\u6297\u6bd2#R{\u6570\u503c4}%#G,\u6297\u4e09\u5c38\u866b#R{\u6570\u503c5}#G";
        }
        if (this.name.equals("\u5929\u795e\u62a4\u4f53")) {
            return "#W\u589e\u52a0\u4ed9\u65cf\u56db\u7cfb\u6cd5\u672f\u3001\u9b3c\u706b\u6297\u6027\u548cSP#r\u3010\u9002\u5408\u3011\u6839\u9aa8\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0SP#R{\u6570\u503c}%#G,\u6297\u706b#R{\u6570\u503c2}%#G,\u6297\u6c34#R{\u6570\u503c2}%#G,\u6297\u96f7#R{\u6570\u503c2}%#G,\u6297\u98ce#R{\u6570\u503c2}%#G,\u6297\u9b3c\u706b#R{\u6570\u503c3}%#G";
        }
        if (this.name.equals("\u5fc3\u5982\u6b62\u6c34")) {
            return "#W\u589e\u52a0\u6df7\u4e71\u3001\u660f\u7761\u3001\u5c01\u5370\u3001\u9057\u5fd8\u6297\u6027\u548cHP#r\u3010\u9002\u5408\u3011\u6839\u9aa8\u3001\u7075\u6027\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0HP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u6297\u6df7\u4e71#R{\u6570\u503c2}%#G,\u6297\u660f\u7761#R{\u6570\u503c2}%#G,\u6297\u5c01\u5370#R{\u6570\u503c2}%#G,\u6297\u9057\u5fd8#R{\u6570\u503c3}%#G";
        }
        if (this.name.equals("\u53cd\u5ba2\u4e3a\u4e3b")) {
            return "#W\u589e\u52a0\u53cd\u51fb\u7387,\u89e6\u53d1\u53cd\u51fb\u65f6\u589e\u52a0\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387\u53ca\u7a0b\u5ea6\u548cAP#r\u3010\u9002\u5408\u3011\u529b\u91cf\u3001\u7075\u6027\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0AP#R{\u6570\u503c}%#G,\u589e\u52a0\u53cd\u51fb\u7387#R{\u6570\u503c2}%#G,\u89e6\u53d1\u53cd\u51fb\u65f6\u589e\u52a0\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387#R{\u6570\u503c3}%#G,\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6#R{\u6570\u503c4}%";
        }
        if (this.name.equals("\u53cd\u6cbb\u5176\u8eab")) {
            return "#W\u589e\u52a0\u8eb2\u95ea\u7387\u3001\u53cd\u9707\u7387\u3001\u53cd\u9707\u7a0b\u5ea6\u548cHP#r\u3010\u9002\u5408\u3011\u529b\u91cf\u3001\u6839\u9aa8\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0HP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u589e\u52a0\u8eb2\u95ea\u7387#R{\u6570\u503c2}%#G,\u589e\u52a0\u53cd\u9707\u7387#R{\u6570\u503c3}%#G,\u589e\u52a0\u53cd\u9707\u7a0b\u5ea6#R{\u6570\u503c4}%#G";
        }
        if (this.name.equals("\u5f97\u5fc3\u5e94\u624b")) {
            return "#W\u589e\u52a0\u5ffd\u89c6\u4ed9\u6cd5\u9b3c\u706b\u6297\u6027\u3001\u4ed9\u6cd5\u9b3c\u706b\u72c2\u66b4\u51e0\u7387\u53ca\u7a0b\u5ea6\u548cMP#r\u3010\u9002\u5408\u3011\u7075\u6027\u3001\u6839\u9aa8\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0MP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u589e\u52a0\u5ffd\u89c6\u4ed9\u6cd5\u9b3c\u706b#R{\u6570\u503c2}%#G,\u589e\u52a0\u4ed9\u6cd5\u9b3c\u706b\u72c2\u66b4#R{\u6570\u503c4}%#G,\u52a0\u4ed9\u6cd5\u9b3c\u706b\u72c2\u66b4\u7a0b\u5ea6#R{\u6570\u503c6}%#G";
        }
        if (this.name.equals("\u5c71\u5916\u9752\u5c71")) {
            return "#W\u589e\u52a0\u5f3a\u514b\u6548\u679c\u548cSP#r\u3010\u9002\u5408\u3011\u7075\u6027\u3001\u529b\u91cf\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0SP#R{\u6570\u503c}%#G,\u589e\u52a0\u5f3a\u514b\u6548\u679c#R{\u6570\u503c2}%#G";
        }
        if (this.name.equals("\u89c6\u9669\u5982\u5937")) {
            return "#W\u589e\u52a0\u62b5\u5fa1\u5f3a\u514b\u6548\u679c\u548cHP#r\u3010\u9002\u5408\u3011\u6839\u9aa8\u3001\u7075\u6027\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0HP\u6700\u5927\u503c#R{\u6570\u503c}%#G,\u589e\u52a0\u62b5\u5fa1\u5f3a\u514b\u6548\u679c#R{\u6570\u503c2}%#G";
        }
        if (!this.name.equals("\u6e38\u5203\u6709\u4f59")) return null;
        return "#W\u589e\u52a0\u6cd5\u672f\u8eb2\u95ea\u7387\u3001\u968f\u673a\u6297\u7075\u5b9d\u4f24\u5bb3\u548cSP#r\u3010\u9002\u5408\u3011\u6839\u9aa8\u3001\u529b\u91cf\u9ad8\u7684\u5750\u9a91\u5b66\u4e60#r\u3010\u719f\u7ec3\u5ea6\u3011{\u719f\u7ec3\u5ea6}#r#G\u589e\u52a0SP#R{\u6570\u503c}%#G,\u589e\u52a0\u6cd5\u672f\u8eb2\u95ea\u7387#R{\u6570\u503c2}%#G,\u589e\u52a0\u968f\u673a\u6297\u7075\u5b9d\u4f24\u5bb3#R{\u6570\u503c3}#G";
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getB2() {
        return this.b2;
    }

    public void ALLATORIxDEMO(String data) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)data)) {
            this.b2 = 0;
            this.b3 = 0;
            this.bases = null;
            return;
        }
        this.b2 = 0;
        this.b3 = 0;
        this.bases = new BaseQl[IIiiIiiiiIIiI.ALLATORIxDEMO((char)',', (String)data) - 1];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII3 < data.length()) {
            IiiiiiiiIIIII3 = data.indexOf(",", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = data.length();
            }
            if (IiiiiiiiIIIII == 0) {
                this.b2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII3);
                if (this.b2 < 0) {
                    this.b2 = -this.b2;
                    this.bt = 1;
                }
            } else if (IiiiiiiiIIIII == 1) {
                this.b3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII3);
            } else {
                IiiiiiiiIIIII4 = data.indexOf("#", IiiiiiiiIIIII2 + 1);
                BaseQl IiiiiiiiIIIII5 = null;
                String IiiiiiiiIIIII6 = data.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII4);
                if (IiiiiiiiIIIII6.equals("\u6280\u80fd")) {
                    IiiiiiiiIIIII5 = new BaseQl(IiiiiiiiIIIII6, 0.0);
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII4 + 1;
                    IiiiiiiiIIIII4 = data.indexOf("#", IiiiiiiiIIIII2 + 1);
                    IiiiiiiiIIIII5.setValue(Double.parseDouble(data.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII4)));
                    IiiiiiiiIIIII5.setValue2(Double.parseDouble(data.substring(IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII3)));
                } else {
                    IiiiiiiiIIIII5 = new BaseQl(IiiiiiiiIIIII6, Double.parseDouble(data.substring(IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII3)));
                }
                this.bases[IiiiiiiiIIIII - 2] = IiiiiiiiIIIII5;
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
    }

    public String ALLATORIxDEMO(String key, String text, double mountSkillXs, int sld) {
        String IiiiiiiiIIIII = null;
        if (key.equals("\u719f\u7ec3\u5ea6")) {
            IiiiiiiiIIIII = String.valueOf(String.valueOf(sld) + "/100000");
        } else if (key.startsWith("\u6570\u503c")) {
            int IiiiiiiiIIIII2 = key.length() > 2 ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)key, (int)2, (int)key.length()) - 1 : 0;
            double IiiiiiiiIIIII3 = 0.0;
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII3 = mountSkillXs / this.getBx();
            } else if (IiiiiiiiIIIII2 >= 1 && IiiiiiiiIIIII2 - 1 < this.bases.length) {
                IiiiiiiiIIIII3 = mountSkillXs / this.bases[IiiiiiiiIIIII2 - 1].getValue();
            }
            IiiiiiiiIIIII3 = PropertyUtil.ALLATORIxDEMO((Double)IiiiiiiiIIIII3);
            IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII3, (int)2);
        }
        if (IiiiiiiiIIIII != null) return text.replace("{" + key + "}", IiiiiiiiIIIII);
        return text;
    }

    public double getMountSHByZTPercentage(int id, int lvl) {
        if (lvl <= 0) {
            return 0.0;
        }
        double IiiiiiiiIIIII = 0.0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = Math.min(--lvl / 4 + (1 + lvl % 4 >= id ? 1 : 0), this.bases.length);
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII3) {
            BaseQl baseQl = this.bases[IiiiiiiiIIIII2];
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII += baseQl.getValue();
        }
        return IiiiiiiiIIIII;
    }

    public double getXs(int mlx, int mll, int mgg, int sld, int mountId) {
        double IiiiiiiiIIIII = (double)(mlx * this.b1 + mll * this.b2 + mgg * this.b3) / 100.0 * (mountId == 2 || mountId == 4 ? 1.2 : 1.0);
        return IiiiiiiiIIIII += (double)sld * 3.6 / 10000.0;
    }

    public int getB3() {
        return this.b3;
    }

    public BaseMountSkill(String name, BaseQl[] bases) {
        this.name = name;
        this.bases = bases;
    }

    public BaseMountSkill(String name, int[] bs, int bt, double bx, BaseQl[] bases) {
        this.name = name;
        this.b1 = bs[0];
        this.b2 = bs[1];
        this.b3 = bs[2];
        this.bt = bt;
        this.bx = bx;
        this.bases = bases;
    }

    public void setB3(int b3) {
        this.b3 = b3;
    }

    public double getBx() {
        return this.bx;
    }

    /*
     * WARNING - void declaration
     */
    public String getText(Mount mount) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = mount.getMountlvl();
        if (IiiiiiiiIIIII2 > 100) {
            IiiiiiiiIIIII2 -= 100;
        }
        int n = (int)Math.floor((float)mount.getSpri().intValue() + (float)IiiiiiiiIIIII2 / 10.0f * (float)mount.getSpri().intValue() / 2.0f);
        int IiiiiiiiIIIII3 = (int)Math.floor((float)mount.getPower().intValue() + (float)IiiiiiiiIIIII2 / 10.0f * (float)mount.getPower().intValue() / 2.0f);
        int IiiiiiiiIIIII4 = (int)Math.floor((float)mount.getBone().intValue() + (float)IiiiiiiiIIIII2 / 10.0f * (float)mount.getBone().intValue() / 2.0f);
        int IiiiiiiiIIIII5 = mount.getMountCZ();
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII5 >> 6;
        if (IiiiiiiiIIIII6 <= 0) return this.getText((int)IiiiiiiiIIIII, IiiiiiiiIIIII3, IiiiiiiiIIIII4, mount.getProficiency(), mount.getMountid());
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < 3) {
            if ((IiiiiiiiIIIII5 >> 2 * IiiiiiiiIIIII7 & 1) != 0) {
                boolean IiiiiiiiIIIII8;
                boolean bl = IiiiiiiiIIIII8 = (IiiiiiiiIIIII5 >> 2 * IiiiiiiiIIIII7 + 1 & 1) == 1;
                if (IiiiiiiiIIIII7 == 0) {
                    IiiiiiiiIIIII += IiiiiiiiIIIII8 ? IiiiiiiiIIIII6 : -IiiiiiiiIIIII6;
                } else if (IiiiiiiiIIIII7 == 1) {
                    IiiiiiiiIIIII3 += IiiiiiiiIIIII8 ? IiiiiiiiIIIII6 : -IiiiiiiiIIIII6;
                } else if (IiiiiiiiIIIII7 == 2) {
                    IiiiiiiiIIIII4 += IiiiiiiiIIIII8 ? IiiiiiiiIIIII6 : -IiiiiiiiIIIII6;
                }
            }
            ++IiiiiiiiIIIII7;
        }
        return this.getText((int)IiiiiiiiIIIII, IiiiiiiiIIIII3, IiiiiiiiIIIII4, mount.getProficiency(), mount.getMountid());
    }

    public String getName() {
        return this.name;
    }

    public double getMountSHByZT(int id, int lvl) {
        if (lvl <= 0) {
            return 1.0;
        }
        double IiiiiiiiIIIII = 0.0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = Math.min(--lvl / 4 + (1 + lvl % 4 >= id ? 1 : 0), this.bases.length);
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII3) {
            BaseQl baseQl = this.bases[IiiiiiiiIIIII2];
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII += baseQl.getValue();
        }
        return 1.0 + IiiiiiiiIIIII / 100.0;
    }

    public String getText(int mlx, int mll, int mgg, int sld, int mountId) {
        String IiiiiiiiIIIII = this.getText();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            return this.name;
        }
        double IiiiiiiiIIIII2 = this.getXs(mlx, mll, mgg, sld, mountId);
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while ((IiiiiiiiIIIII4 = IiiiiiiiIIIII.indexOf("{", IiiiiiiiIIIII5)) != -1 && (IiiiiiiiIIIII5 = IiiiiiiiIIIII.indexOf("}", IiiiiiiiIIIII4 + 1)) != -1) {
            String IiiiiiiiIIIII6 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII5);
            if (IiiiiiiiIIIII6.indexOf("{") != -1) {
                ++IiiiiiiiIIIII4;
                continue;
            }
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII.length();
            IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII6, IiiiiiiiIIIII, IiiiiiiiIIIII2, sld);
            IiiiiiiiIIIII5 += IiiiiiiiIIIII.length() - IiiiiiiiIIIII7;
        }
        IiiiiiiiIIIII3.append(IiiiiiiiIIIII);
        return IiiiiiiiIIIII3.toString();
    }

    public void ALLATORIxDEMO(Goodstable good) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("\u7b49\u7ea7=");
        IiiiiiiiIIIII.append(this.b2);
        IiiiiiiiIIIII.append("|\u8010\u4e45=");
        IiiiiiiiIIIII.append(this.b3);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.bases.length) {
            IiiiiiiiIIIII.append("|");
            IiiiiiiiIIIII.append(this.bases[IiiiiiiiIIIII2].getKey());
            IiiiiiiiIIIII.append("=");
            IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)this.bases[IiiiiiiiIIIII2].getValue(), (int)1));
            if (this.bases[IiiiiiiiIIIII2].getKey().equals("\u6280\u80fd")) {
                IiiiiiiiIIIII.append("#");
                IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)this.bases[IiiiiiiiIIIII2].getValue2(), (int)1));
            }
            ++IiiiiiiiIIIII2;
        }
        good.setQuality(Long.valueOf(this.bt == 0 ? 0L : 1L));
        good.setValue(IiiiiiiiIIIII.toString());
    }
}
