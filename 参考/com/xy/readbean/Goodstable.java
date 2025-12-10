package com.xy.readbean;

import com.xy.bk;
import com.xy.hd;
import com.xy.formula.BaseFly;
import com.xy.formula.BaseXuanBao;
import com.xy.formula.GoodExchange;
import com.xy.formula.GoodType;
import java.awt.Point;
import java.math.BigDecimal;

public class Goodstable implements Cloneable {
   private transient GoodExchange[] exchanges;
   private Long type;
   private String instruction;
   private BigDecimal goodsid;
   private Integer qhv;
   private String skin;
   private BigDecimal role_id;
   private transient BaseXuanBao baseXuanBao;
   private Integer status;
   private String goodsname;
   private Long quality;
   private String author;
   private Integer usetime;
   private String value;
   private Integer qht;
   private BigDecimal rgid;
   private transient BaseFly baseFly;
   private int goodlock;
   private transient GoodFight fight;

   public GoodExchange[] getExchanges() {
      return this.exchanges;
   }

   public void setRole_id(BigDecimal var1) {
      this.role_id = var1;
   }

   public Goodstable() {
   }

   public BigDecimal getRgid() {
      return this.rgid;
   }

   public void setQht(Integer var1) {
      this.qht = var1;
   }

   public void setQhv(Integer var1) {
      this.qhv = var1;
   }

   public Point nd() {
      int var1 = this.value.indexOf("|");
      return new Point(hd.b(this.value, 2 & 5, var1), hd.b(this.value, var1 + (3 >> 1), this.value.length()));
   }

   public String getGoodsname() {
      return this.goodsname;
   }

   public void setGoodlock(int var1) {
      this.goodlock = var1;
   }

   public BigDecimal getGoodsid() {
      return this.goodsid;
   }

   public Integer getQht() {
      return this.qht;
   }

   public void setGoodsname(String var1) {
      this.goodsname = var1 == null ? null : var1.trim();
   }

   public String getInstruction() {
      return this.instruction;
   }

   public String getSkin() {
      return this.skin;
   }

   public Integer getStatus() {
      if (this.status == null) {
         this.status = 3 ^ 3;
      }

      return this.status;
   }

   public void setInstruction(String var1) {
      this.instruction = var1 == null ? null : var1.trim();
   }

   public void setType(Long var1) {
      this.type = var1;
   }

   public Integer getQhv() {
      return this.qhv;
   }

   public Long getType() {
      if (this.type == null) {
         this.type = -1L;
      }

      return this.type;
   }

   public void setRgid(BigDecimal var1) {
      this.rgid = var1;
   }

   public void setUsetime(Integer var1) {
      this.usetime = (int)bk.a((long)var1);
   }

   public void ab(int var1) {
      if (var1 != 0) {
         this.setUsetime(this.getUsetime() - var1);
         if (this.rgid != null && GoodType.ag(this.getType())) {
            this.rgid = new BigDecimal(this.rgid.longValue());
         }

      }
   }

   public BaseXuanBao getBaseXuanBao() {
      if (this.baseXuanBao == null && this.value != null && !this.value.equals("")) {
         this.baseXuanBao = new BaseXuanBao(this.value);
      }

      return this.baseXuanBao;
   }

   public void setAuthor(String var1) {
      this.author = var1;
   }

   public String getAuthor() {
      return this.author;
   }

   public void setValueTwo(String var1) {
      this.value = var1 == null ? null : var1.trim();
   }

   public void setGoodsid(BigDecimal var1) {
      this.goodsid = var1;
   }

   public Goodstable(BigDecimal var1, BigDecimal var2, BigDecimal var3, String var4, String var5, Long var6, Long var7, String var8, String var9, Integer var10, Integer var11) {
      this.rgid = var1;
      this.role_id = var2;
      this.goodsid = var3;
      this.goodsname = var4;
      this.skin = var5;
      this.type = var6;
      this.quality = var7;
      this.value = var8;
      this.instruction = var9;
      this.status = var10;
      this.setUsetime(var11);
   }

   public void setExchanges(GoodExchange[] var1) {
      this.exchanges = var1;
   }

   public void setQuality(Long var1) {
      this.quality = var1;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public void setStatus(Integer var1) {
      this.status = var1;
   }

   public int getGoodlock() {
      return this.goodlock;
   }

   public Long getQuality() {
      if (this.quality == null) {
         this.quality = new Long(0L);
      }

      return this.quality;
   }

   public Object clone() {
      Goodstable var1 = null;

      try {
         var1 = (Goodstable)super.clone();
         return var1;
      } catch (CloneNotSupportedException var3) {
         var3.printStackTrace();
         return var1;
      }
   }

   public void ax(Goodstable var1) {
      this.rgid = var1.rgid;
      this.role_id = var1.role_id;
      this.goodsid = var1.goodsid;
      this.goodsname = var1.goodsname;
      this.skin = var1.skin;
      this.type = var1.type;
      this.quality = var1.quality;
      this.value = var1.value;
      this.instruction = var1.instruction;
      this.status = var1.status;
      this.usetime = var1.usetime;
      this.goodlock = var1.goodlock;
   }

   public BigDecimal getRole_id() {
      return this.role_id;
   }

   public GoodFight getFight() {
      if (this.fight == null && (this.type == 2010L || this.type == 2011L || this.type == 2012L)) {
         this.fight = new GoodFight(this.value);
      }

      return this.fight;
   }

   public Integer getUsetime() {
      if (this.usetime == null) {
         this.setUsetime(4 ^ 5);
      }

      return (int)bk.b((long)this.usetime);
   }

   public void setValue(String var1) {
      this.value = var1 == null ? null : var1.trim();
      if (this.fight != null) {
         this.fight = null;
      }

      if (this.baseFly != null) {
         this.baseFly = null;
      }

      if (this.baseXuanBao != null) {
         this.baseXuanBao = null;
      }

   }

   public String getValue() {
      return this.value;
   }

   public BaseFly getBaseFly() {
      if (this.baseFly == null && this.type == 8901L) {
         this.baseFly = new BaseFly(this.value);
      }

      return this.baseFly;
   }
}
