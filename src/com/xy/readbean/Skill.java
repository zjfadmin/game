/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.Formula
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.formula.Formula;
import com.xy.v.IIiiIiiiiIIiI;

public class Skill {
    private String camp;
    private String skillname;
    private String formula;
    private String grow;
    private String skilllevel;
    private String remark;
    private Integer Skilled;
    private String value;
    private String skillralation;
    private String skilltype;
    private String dielectric;
    private String skillid;
    private transient Formula[] formulas;

    public void setSkilltype(String skilltype) {
        this.skilltype = skilltype;
    }

    public String getValue() {
        return this.value;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setDielectric(String dielectric) {
        this.dielectric = dielectric;
    }

    public void setSkillid(String skillid) {
        this.skillid = skillid;
    }

    public void setSkillralation(String skillralation) {
        this.skillralation = skillralation;
    }

    public String getSkillid() {
        return this.skillid;
    }

    public Integer getSkilled() {
        return this.Skilled;
    }

    public void ALLATORIxDEMO() {
        if (this.formula == null || this.formula.equals("")) {
            this.formula = null;
            return;
        }
        this.formulas = new Formula[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)this.formula)];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.formula.length()) {
            IiiiiiiiIIIII3 = this.formula.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = this.formula.length();
            }
            this.formulas[IiiiiiiiIIIII] = new Formula(this.formula, IiiiiiiiIIIII2, IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
        this.formula = null;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getFormula() {
        return this.formula;
    }

    public Formula[] getFormulas() {
        return this.formulas;
    }

    public String getCamp() {
        return this.camp;
    }

    public String getSkillralation() {
        return this.skillralation;
    }

    public Formula getFormulaByIndex(int index) {
        if (this.formulas == null) return null;
        if (index >= this.formulas.length) return null;
        return this.formulas[index];
    }

    public void setSkilllevel(String skilllevel) {
        this.skilllevel = skilllevel;
    }

    public String getSkilllevel() {
        return this.skilllevel;
    }

    public void setFormulas(Formula[] formulas) {
        this.formulas = formulas;
    }

    public void setGrow(String grow) {
        this.grow = grow;
    }

    public String getGrow() {
        return this.grow;
    }

    public void setSkilled(Integer skilled) {
        this.Skilled = skilled;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSkilltype() {
        return this.skilltype;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSkillname() {
        return this.skillname;
    }

    public String getDielectric() {
        return this.dielectric;
    }
}
