package com.xy.bean;

import java.math.BigDecimal;

public class ApplyPayBean {
   private String msg;
   private BigDecimal addM;
   private BigDecimal Dayandpayorno;
   private String activity;
   private BigDecimal addC;
   private UseCardBean useCardBean;
   private BigDecimal addX;
   private UseCardBean VIPBean;
   private BigDecimal LowOrHihtpack;

   public void setDayandpayorno(BigDecimal var1) {
      this.Dayandpayorno = var1;
   }

   public void setActivity(String var1) {
      this.activity = var1;
   }

   public String getActivity() {
      return this.activity;
   }

   public void setUseCardBean(UseCardBean var1) {
      this.useCardBean = var1;
   }

   public String getMsg() {
      return this.msg;
   }

   public BigDecimal getAddC() {
      return this.addC;
   }

   public UseCardBean getUseCardBean() {
      return this.useCardBean;
   }

   public BigDecimal getAddM() {
      return this.addM;
   }

   public void setVIPBean(UseCardBean var1) {
      this.VIPBean = var1;
   }

   public BigDecimal getAddX() {
      return this.addX;
   }

   public BigDecimal getDayandpayorno() {
      return this.Dayandpayorno;
   }

   public void setAddX(BigDecimal var1) {
      this.addX = var1;
   }

   public void setLowOrHihtpack(BigDecimal var1) {
      this.LowOrHihtpack = var1;
   }

   public void setAddM(BigDecimal var1) {
      this.addM = var1;
   }

   public UseCardBean getVIPBean() {
      return this.VIPBean;
   }

   public void setAddC(BigDecimal var1) {
      this.addC = var1;
   }

   public void setMsg(String var1) {
      this.msg = var1;
   }

   public BigDecimal getLowOrHihtpack() {
      return this.LowOrHihtpack;
   }
}
