package com.xy.readbean;

import com.xy.hd;
import com.xy.formula.Formula;
import com.xy.formula.Formula0;
import com.xy.formula.Formula1;
import com.xy.formula.Formula2;

public class Skill {
   private String skillname;
   private String camp;
   private String skilltype;
   private String dielectric;
   private String formula;
   private transient Formula[] formulas;
   private Integer Skilled;
   private String skillid;
   private String grow;
   private String skilllevel;
   private String skillralation;
   private String remark;
   private String value;

   public String getSkilllevel() {
      return this.skilllevel;
   }

   public String getFormula() {
      return this.formula;
   }

   public void setDielectric(String var1) {
      this.dielectric = var1;
   }

   public void setFormulas(Formula[] var1) {
      this.formulas = var1;
   }

   public String getValue() {
      return this.value;
   }

   public void setSkillname(String var1) {
      this.skillname = var1;
   }

   public Formula[] getFormulas() {
      return this.formulas;
   }

   public String getSkillname() {
      return this.skillname;
   }

   public String getSkillid() {
      return this.skillid;
   }

   public String getSkillralation() {
      return this.skillralation;
   }

   public void setSkilllevel(String var1) {
      this.skilllevel = var1;
   }

   public Formula getFormulaByIndex(int var1) {
      return this.formulas != null && var1 < this.formulas.length ? this.formulas[var1] : null;
   }

   public void setSkilltype(String var1) {
      this.skilltype = var1;
   }

   public void setGrow(String var1) {
      this.grow = var1;
   }

   public void setSkilled(Integer var1) {
      this.Skilled = var1;
   }

   public void setRemark(String var1) {
      this.remark = var1;
   }

   public String getGrow() {
      return this.grow;
   }

   public String getSkilltype() {
      return this.skilltype;
   }

   public void setSkillid(String var1) {
      this.skillid = var1;
   }

   public void setCamp(String var1) {
      this.camp = var1;
   }

   public void a() {
      if (this.formula != null && !this.formula.equals("")) {
         Formula[] var10001 = new Formula[--1 + hd.f((char)('|' & '\u007f'), this.formula)];
         boolean var10003 = true;
         this.formulas = var10001;
         int var1 = 3 ^ 3;
         int var2 = 3 ^ 3;

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < this.formula.length(); var10000 = var3) {
            if ((var3 = this.formula.indexOf("|", var2 + (2 ^ 3))) == -4 >> 2) {
               var3 = this.formula.length();
            }

            char var4;
            if ((var4 = this.formula.charAt(var2)) == (79 & 113)) {
               var10000 = var3;
               this.formulas[var1] = new Formula1(this.formula, var2 + (3 >> 1), var3);
            } else if (var4 == (119 & 74)) {
               var10000 = var3;
               this.formulas[var1] = new Formula2(this.formula, var2 + --1, var3);
            } else {
               this.formulas[var1] = new Formula0(this.formula, var2, var3);
               var10000 = var3;
            }

            ++var1;
            var2 = var10000 + 1;
         }

         this.formula = null;
      } else {
         this.formula = null;
      }
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public String getDielectric() {
      return this.dielectric;
   }

   public void setFormula(String var1) {
      this.formula = var1;
   }

   public void setSkillralation(String var1) {
      this.skillralation = var1;
   }

   public Integer getSkilled() {
      return this.Skilled;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getCamp() {
      return this.camp;
   }
}
