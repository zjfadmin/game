/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iIIiiiiiIIIIi
 *  com.xy.bean.ChongjipackBean
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.XXGDBean
 *  com.xy.formula.GoodType
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBuy
 *  com.xy.readbean.ActivityFCRecord
 *  com.xy.readbean.ActivityFCTarget
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.v;

import com.xy.a.v.iIIiiiiiIIIIi;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.XXGDBean;
import com.xy.formula.GoodType;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.ActivityFCRecord;
import com.xy.readbean.ActivityFCTarget;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Component;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;

public class IiIiiiiiIIIiI
extends iIiIIiiiIiiiI {
    private Activity iIiiIiiiIiIIi;
    private IIIiiiiiIiIiI iiiiIiiiIIiii;
    private int iIIiIiiiiiiIi;
    private ActivityFC IIIIiiiiiiiII;
    private RichLabel iiIIIiiiiiiiI;
    private List<XXGDBean> IiIiiiiiIIIII;
    private iIIiiiiiIIIIi[] iiIiIiiiiIIIi;
    private IIIiiiiiIiIiI iiiiIiiiIiiII;
    private iiIiIiiiIIIiI iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private iiIiIiiiIIIiI IIiiIiiiIIiIi;
    private iiIiIiiiIIIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private IiiiIiiiiIiIi iiIiiiiiiiIii;
    private ChongjipackBean IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int n, ChongjipackBean chongjipackBean, boolean bl, boolean bl2, int n2) {
        void style;
        void bean;
        this.iIiiIiiiIiIIi = null;
        this.IIIIiiiiiiiII = null;
        this.IiiiiiiiIIIII = bean;
        List<XXGDBean> list = this.IiIiiiiiIIIII = bean != null ? ChongjipackBean.getGoodsImpactGrade((String)bean.getPackgoods()) : null;
        if (this.iIiiIiiiiiiII != style) {
            this.iiiIiiiiiiIIi((int)style);
        }
        if (style == true) {
            void isGet;
            this.ALLATORIxDEMO.setTextSize("#c560202" + bean.getPackgrade(), 104);
            this.ALLATORIxDEMO.setBounds(1 + (104 - this.ALLATORIxDEMO.getWidth()) / 2, 14, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
            if (isGet != false) {
                this.iiIIIiiiiiiiI.setTextSize("#Z#c523425\u5df2\u9886\u53d6", 88);
                this.iiIIIiiiiiiiI.setBounds(385 + (88 - this.iiIIIiiiiiiiI.getWidth()) / 2, 14, this.iiIIIiiiiiiiI.getWidth(), this.iiIIIiiiiiiiI.getHeight());
                this.iiiiIiiiIIiii.iIiIiiiiIIiii();
                this.iiiIiiiiiiiIi.setVisible(false);
            } else {
                void isLvl;
                IiIiiiiiIIIiI iiIiiiiiIIIiI = this;
                if (isLvl != false) {
                    iiIiiiiiIIIiI.iiIIIiiiiiiiI.setTextSize("", 88);
                    this.iiIIIiiiiiiiI.setBounds(0, 0, 0, 0);
                    this.iiiiIiiiIIiii.iIiIiiiiIIiii();
                    this.iiiIiiiiiiiIi.setVisible(true);
                } else {
                    iiIiiiiiIIIiI.iiIIIiiiiiiiI.setTextSize("#Z#c523425\u7b49\u7ea7\u672a\u8fbe\u5230", 88);
                    this.iiIIIiiiiiiiI.setBounds(385 + (88 - this.iiIIIiiiiiiiI.getWidth()) / 2, 28, this.iiIIIiiiiiiiI.getWidth(), this.iiIIIiiiiiiiI.getHeight());
                    this.iiiiIiiiIIiii.iIiIiiiiIIiii("sc/d/99.png");
                    this.iiiIiiiiiiiIi.setVisible(false);
                }
            }
        } else if (style == 2) {
            void buyNum;
            StringBuffer IiiiiiiiIIIII = new StringBuffer(this.iiIIIiiiiiiiI.getText() != null ? this.iiIIIiiiiiiiI.getText().length() : 32);
            IiiiiiiiIIIII.append("#Z#c523425\u6d88\u8d39");
            IiiiiiiiIIIII.append(bean.getCanpaymoney());
            IiiiiiiiIIIII.append("\u79ef\u5206\u53ef\u8d2d\u4e70\u4ee5\u4e0b\u5956\u52b1:");
            this.iiIIIiiiiiiiI.setTextSize(IiiiiiiiIIIII.toString(), 430);
            this.iiIIIiiiiiiiI.setBounds(22, 0, this.iiIIIiiiiiiiI.getWidth(), this.iiIIIiiiiiiiI.getHeight());
            this.ALLATORIxDEMO.setTextSize("#Z#c523425\u9650\u8d2d:" + (int)buyNum + "/" + bean.getPointLvl().y, 115);
            if (buyNum < bean.getPointLvl().y) {
                this.ALLATORIxDEMO.setBounds(370 + (115 - this.ALLATORIxDEMO.getWidth()) / 2, 46, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
                this.iiiIiiiiiiiIi.setText("\uffe5" + bean.getCanpaymoney());
                this.iiiIiiiiiiiIi.setVisible(true);
            } else {
                this.ALLATORIxDEMO.setBounds(370 + (115 - this.ALLATORIxDEMO.getWidth()) / 2, 24, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
                this.iiiIiiiiiiiIi.setVisible(false);
            }
        }
        this.iIiIiiiiIIiIi(0);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int style, Activity activity, ActivityFC activityFC, boolean isGet, long num) {
        block27: {
            block26: {
                this.iIiiIiiiIiIIi = activity;
                this.IIIIiiiiiiiII = activityFC;
                this.IiiiiiiiIIIII = null;
                this.IiIiiiiiIIIII = null;
                if (this.iIiiIiiiiiiII != style) {
                    this.iiiIiiiiiiIIi(style);
                }
                if (activityFC.getType() != 1) break block26;
                IiiiiiiiIIIII = 0L;
                IiiiiiiiIIIII = (ActivityFCBuy)activityFC.getData();
                IiiiiiiiIIIII = new StringBuffer(this.iiIIIiiiiiiiI.getText() != null ? this.iiIIIiiiiiiiI.getText().length() : 32);
                IiiiiiiiIIIII.append("#Z#c523425\u6d88\u8d39");
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl119
            }
            if (activityFC.getType() == 2) {
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("#Z#c523425");
                IiiiiiiiIIIII = (ActivityFCTarget)activityFC.getData();
                IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII.getT1());
                if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
                    if (IiiiiiiiIIIII.getTarget().getType() == 1) {
                        IiiiiiiiIIIII = activity.getActivityKey(IiiiiiiiIIIII.getTarget().getId());
                        if (IiiiiiiiIIIII instanceof iiIiIiiiiIiii) {
                            IiiiiiiiIIIII = (iiIiIiiiiIiii)IiiiiiiiIIIII;
                            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getTarget().getId() > 0 ? "\u83b7\u53d6" : "\u6d88\u8017");
                            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getTarget().getNum());
                            IiiiiiiiIIIII.append(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.IiiiiiiiIIIII : "\u672a\u77e5\u79ef\u5206");
                        } else if (IiiiiiiiIIIII instanceof ActivityFCRecord) {
                            IiiiiiiiIIIII = (ActivityFCRecord)IiiiiiiiIIIII;
                            if (IiiiiiiiIIIII.getType() == 1 || IiiiiiiiIIIII.getType() == 2) {
                                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getType() == 1 ? "\u83b7\u53d6" : "\u6d88\u8017");
                                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getTarget().getNum());
                                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getKey2());
                            } else if (IiiiiiiiIIIII.getType() == 3) {
                                IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII.getKey1());
                                IiiiiiiiIIIII.append("\u5b8c\u6210");
                                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getTarget().getNum());
                                IiiiiiiiIIIII.append("\u6b21");
                                IiiiiiiiIIIII.append(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getTaskType() : "\u672a\u77e5\u4efb\u52a1");
                            }
                        }
                    } else if (IiiiiiiiIIIII.getTarget().getType() == 2) {
                        IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII.getTarget().getId());
                        IiiiiiiiIIIII.append("\u5b8c\u6210");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getTarget().getNum());
                        IiiiiiiiIIIII.append("\u6b21");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getTaskType() : "\u672a\u77e5\u4efb\u52a1");
                    }
                } else {
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                }
                IiiiiiiiIIIII.append("(");
                IiiiiiiiIIIII.append(num);
                IiiiiiiiIIIII.append("/");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getTarget().getNum());
                IiiiiiiiIIIII.append(")");
                this.ALLATORIxDEMO.setTextSize(IiiiiiiiIIIII.toString(), 430);
                this.ALLATORIxDEMO.setBounds(22, 0, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
                if (isGet) {
                    this.iiIIIiiiiiiiI.setTextSize("#Z#c523425\u5df2\u9886\u53d6", 88);
                    this.iiIIIiiiiiiiI.setBounds(385 + (88 - this.iiIIIiiiiiiiI.getWidth()) / 2, 20, this.iiIIIiiiiiiiI.getWidth(), this.iiIIIiiiiiiiI.getHeight());
                    this.iiiiIiiiIIiii.iIiIiiiiIIiii();
                    this.iiiIiiiiiiiIi.setVisible(false);
                } else if (num >= IiiiiiiiIIIII.getTarget().getNum()) {
                    this.iiIIIiiiiiiiI.setTextSize("", 88);
                    this.iiIIIiiiiiiiI.setBounds(0, 0, 0, 0);
                    this.iiiiIiiiIIiii.iIiIiiiiIIiii();
                    this.iiiIiiiiiiiIi.setVisible(true);
                } else {
                    this.iiIIIiiiiiiiI.setTextSize("#Z#c523425\u672a\u8fbe\u6210\u6761\u4ef6", 88);
                    this.iiIIIiiiiiiiI.setBounds(385 + (88 - this.iiIIIiiiiiiiI.getWidth()) / 2, 34, this.iiIIIiiiiiiiI.getWidth(), this.iiIIIiiiiiiiI.getHeight());
                    this.iiiiIiiiIIiii.iIiIiiiiIIiii("sc/d/99.png");
                    this.iiiIiiiiiiiIi.setVisible(false);
                }
            }
            break block27;
            do {
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII.getUses()[IiiiiiiiIIIII]).getType() == 1) {
                    IiiiiiiiIIIII = Math.max(IiiiiiiiIIIII.getNum(), 0L);
                    IiiiiiiiIIIII = activity.getPointKey(IiiiiiiiIIIII.getId());
                    if (IiiiiiiiIIIII != 0) {
                        IiiiiiiiIIIII.append("\u548c");
                    }
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII.getNum());
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.IiiiiiiiIIIII : "\u672a\u77e5\u79ef\u5206");
                } else if (IiiiiiiiIIIII.getType() == 4) {
                    IiiiiiiiIIIII = Math.max(IiiiiiiiIIIII.getNum(), 0L);
                    if (IiiiiiiiIIIII != 0) {
                        IiiiiiiiIIIII.append("\u548c");
                    }
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII.getNum());
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII.getKey());
                }
                ++IiiiiiiiIIIII;
lbl119:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getUses().length);
            IiiiiiiiIIIII.append("\u53ef\u8d2d\u4e70\u4ee5\u4e0b\u5956\u52b1:");
            this.iiIIIiiiiiiiI.setTextSize(IiiiiiiiIIIII.toString(), 430);
            this.iiIIIiiiiiiiI.setBounds(22, 0, this.iiIIIiiiiiiiI.getWidth(), this.iiIIIiiiiiiiI.getHeight());
            if (IiiiiiiiIIIII.getBuyMax() > 0) {
                this.ALLATORIxDEMO.setTextSize(IiiiiiiiIIIII.getBuyMax() > 0 ? "#Z#c523425\u9650\u8d2d:" + num + "/" + IiiiiiiiIIIII.getBuyMax() : "", 115);
            }
            if (IiiiiiiiIIIII.getBuyMax() > 0 && (long)IiiiiiiiIIIII.getBuyMax() > num) {
                this.ALLATORIxDEMO.setBounds(370 + (115 - this.ALLATORIxDEMO.getWidth()) / 2, 46, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
                this.iiiIiiiiiiiIi.setText("\uffe5" + IiiiiiiiIIIII);
                this.iiiIiiiiiiiIi.setVisible(true);
            } else {
                this.ALLATORIxDEMO.setBounds(370 + (115 - this.ALLATORIxDEMO.getWidth()) / 2, 24, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
                this.iiiIiiiiiiiIi.setVisible(false);
            }
        }
        this.iIiIiiiiIIiIi(0);
    }

    public Component add(Component comp) {
        if (comp.isVisible()) return super.add(comp);
        comp.setVisible(true);
        return super.add(comp);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi(int page) {
        block17: {
            if (this.IIIIiiiiiiiII == null) break block17;
            IiiiiiiiIIIII = null;
            if (this.IIIIiiiiiiiII.getType() == 1) {
                IiiiiiiiIIIII = ((ActivityFCBuy)this.IIIIiiiiiiiII.getData()).getGains();
            } else if (this.IIIIiiiiiiiII.getType() == 2) {
                IiiiiiiiIIIII = ((ActivityFCTarget)this.IIIIiiiiiiiII.getData()).getGains();
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII == null ? 0 : (IiiiiiiiIIIII.length > this.iIIiIiiiiiiIi ? IiiiiiiiIIIII.length - this.iIIiIiiiiiiIi : 0);
            this.IiIIIiiiiIiiI = Math.max(0, Math.min(page, IiiiiiiiIIIII));
            IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
            IiiiiiiiIIIII = this.IiIIIiiiiIiiI;
            IiiiiiiiIIIII = this.iIIiIiiiiiiIi + this.IiIIIiiiiIiiI;
            if (true) ** GOTO lbl47
        }
        IiiiiiiiIIIII = this.IiIiiiiiIIIII == null ? 0 : (this.IiIiiiiiIIIII.size() > this.iIIiIiiiiiiIi ? this.IiIiiiiiIIIII.size() - this.iIIiIiiiiiiIi : 0);
        this.IiIIIiiiiIiiI = Math.max(0, Math.min(page, IiiiiiiiIIIII));
        IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        IiiiiiiiIIIII = this.IiIIIiiiiIiiI;
        IiiiiiiiIIIII = this.iIIiIiiiiiiIi + this.IiIIIiiiiIiiI;
        if (true) ** GOTO lbl60
        do {
            IiiiiiiiIIIII = null;
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII];
            }
            if (IiiiiiiiIIIII == null) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(0, null, 1);
            } else if (IiiiiiiiIIIII.getType() == 1) {
                IiiiiiiiIIIII = this.iIiiIiiiIiIIi.getPointKey(IiiiiiiiIIIII.getId());
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(22, (Object)(String.valueOf(IiiiiiiiIIIII.getNum()) + (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.IiiiiiiiIIIII : "\u672a\u77e5\u79ef\u5206")), 1);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
            } else if (IiiiiiiiIIIII.getType() == 2) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII.getId()));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(IiiiiiiiIIIII != null ? 1 : 0, (Object)IiiiiiiiIIIII, (int)IiiiiiiiIIIII.getNum());
            } else if (IiiiiiiiIIIII.getType() == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(22, (Object)"\u968f\u673a\u5956\u52b1", 1);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
            } else if (IiiiiiiiIIIII.getType() == 4) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(22, (Object)(String.valueOf(IiiiiiiiIIIII.getNum()) + IiiiiiiiIIIII.getKey()), 1);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
            } else {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI].ALLATORIxDEMO(0, null, 1);
            }
            ++IiiiiiiiIIIII;
lbl47:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        this.iIiIiiiiIiIii.setVisible(IiiiiiiiIIIII > 0);
        this.IIiiIiiiIIiIi.setVisible(IiiiiiiiIIIII > 0);
        return;
        do {
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = null;
            if (this.IiIiiiiiIIIII != null && IiiiiiiiIIIII < this.IiIiiiiiIIIII.size()) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(this.IiIiiiiiIIIII.get(IiiiiiiiIIIII).getId());
                IiiiiiiiIIIII = this.IiIiiiiiIIIII.get(IiiiiiiiIIIII).getSum();
            }
            v0 = this.iiIiIiiiiIIIi[IiiiiiiiIIIII - this.IiIIIiiiiIiiI];
            ++IiiiiiiiIIIII;
            v0.ALLATORIxDEMO(IiiiiiiiIIIII != null ? 1 : 0, (Object)IiiiiiiiIIIII, IiiiiiiiIIIII);
lbl60:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        this.iIiIiiiiIiIii.setVisible(IiiiiiiiIIIII > 0);
        this.IIiiIiiiIIiIi.setVisible(IiiiiiiiIIIII > 0);
    }

    public void iiiIiiiiiiIIi(int style) {
        this.iIiiIiiiiiiII = style;
        if (style == 1) {
            if (this.iiiiIiiiIiiII == null) {
                this.iiiiIiiiIiiII = new IIIiiiiiIiIiI();
            }
            if (this.iiiiIiiiIIiii == null) {
                this.iiiiIiiiIIiii = new IIIiiiiiIiIiI();
            }
            this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/100.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
            this.iiiiIiiiIiiII.setBounds(0, 0, 477, 57);
            this.iiiiIiiiIIiii.setBounds(422, 9, 13, 18);
            if (this.ALLATORIxDEMO == null) {
                this.ALLATORIxDEMO = new RichLabel();
            }
            if (this.iiIIIiiiiiiiI == null) {
                this.iiIIIiiiiiiiI = new RichLabel();
            }
            this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            if (this.iiiIiiiiiiiIi == null) {
                this.iiiIiiiiiiiIi = new iiIiIiiiIIIiI("sc/e/154.png", 1, 101, this.iiIiiiiiiiIii, (JComponent)((Object)this));
            }
            this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiiIiiiiiiiIi.setText("\u9886\u53d6");
            this.iiiIiiiiiiiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c523425"));
            this.iiiIiiiiiiiIi.setBounds(396, 10, 75, 35);
            this.ALLATORIxDEMO(6);
            this.add((Component)this.ALLATORIxDEMO);
            this.add((Component)this.iiIIIiiiiiiiI);
            this.add((Component)this.iiiIiiiiiiiIi);
            this.add((Component)this.iiiiIiiiIIiii);
            this.add((Component)this.iiiiIiiiIiiII);
            return;
        }
        if (style == 2) {
            if (this.iiiiIiiiIIiii != null) {
                this.iiiiIiiiIIiii.setVisible(false);
            }
            if (this.iiiiIiiiIiiII == null) {
                this.iiiiIiiiIiiII = new IIIiiiiiIiIiI();
            }
            this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/100.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
            this.iiiiIiiiIiiII.setBounds(0, 0, 477, 70);
            if (this.ALLATORIxDEMO == null) {
                this.ALLATORIxDEMO = new RichLabel();
            }
            if (this.iiIIIiiiiiiiI == null) {
                this.iiIIIiiiiiiiI = new RichLabel();
            }
            this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            if (this.iiiIiiiiiiiIi == null) {
                this.iiiIiiiiiiiIi = new iiIiIiiiIIIiI("sc/e/154.png", 1, 101, this.iiIiiiiiiiIii, (JComponent)((Object)this));
            }
            this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiiIiiiiiiiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c523425"));
            this.iiiIiiiiiiiIi.setBounds(396, 15, 75, 35);
            this.ALLATORIxDEMO(8);
            this.add((Component)this.ALLATORIxDEMO);
            this.add((Component)this.iiIIIiiiiiiiI);
            this.add((Component)this.iiiIiiiiiiiIi);
            this.add((Component)this.iiiiIiiiIiiII);
            return;
        }
        if (style != 3) return;
        if (this.iiiiIiiiIiiII == null) {
            this.iiiiIiiiIiiII = new IIIiiiiiIiIiI();
        }
        if (this.iiiiIiiiIIiii == null) {
            this.iiiiIiiiIIiii = new IIIiiiiiIiIiI();
        }
        this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/100.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
        this.iiiiIiiiIiiII.setBounds(0, 0, 477, 70);
        this.iiiiIiiiIIiii.setBounds(422, 15, 13, 18);
        if (this.ALLATORIxDEMO == null) {
            this.ALLATORIxDEMO = new RichLabel();
        }
        if (this.iiIIIiiiiiiiI == null) {
            this.iiIIIiiiiiiiI = new RichLabel();
        }
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
        if (this.iiiIiiiiiiiIi == null) {
            this.iiiIiiiiiiiIi = new iiIiIiiiIIIiI("sc/e/154.png", 1, 101, this.iiIiiiiiiiIii, (JComponent)((Object)this));
        }
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iiiIiiiiiiiIi.setText("\u9886\u53d6");
        this.iiiIiiiiiiiIi.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c523425"));
        this.iiiIiiiiiiiIi.setBounds(396, 16, 75, 35);
        this.ALLATORIxDEMO(8);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.iiIIIiiiiiiiI);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.iiiiIiiiIIiii);
        this.add((Component)this.iiiiIiiiIiiII);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int id) {
        block30: {
            block31: {
                if (id != 101) break block30;
                if (this.IiiiiiiiIIIII == null) break block31;
                if (this.iIiiIiiiiiiII == 2) {
                    IiiiiiiiIIIII = new StringBuffer();
                    IiiiiiiiIIIII.append("\u4f60\u786e\u5b9a\u82b1\u8d39#G");
                    IiiiiiiiIIIII.append(this.IiiiiiiiIIIII.getCanpaymoney());
                    IiiiiiiiIIIII.append("#W\u79ef\u5206\u8d2d\u4e70#Y");
                    IiiiiiiiIIIII.append(this.IiiiiiiiIIIII.getPackname());
                    IiiiiiiiIIIII.append("#W\u3002\u4f60\u5f53\u524d\u62e5\u6709#G");
                    IiiiiiiiIIIII.append(this.iiIiiiiiiiIii.ALLATORIxDEMO().getLoginResult().getMoney());
                    IiiiiiiiIIIII.append("#W\u79ef\u5206");
                    this.iiIiiiiiiiIii.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(87, this.IiiiiiiiIIIII.getPacktype() + "|" + this.IiiiiiiiIIIII.getPackgradetype(), IiiiiiiiIIIII.toString()));
                    return;
                }
                IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = this.IiIiiiiiIIIII != null ? this.IiIiiiiiIIIII.size() : 0;
                if (true) ** GOTO lbl65
            }
            if (this.IIIIiiiiiiiII == null) return;
            IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
            IiiiiiiiIIIII = null;
            if (this.IIIIiiiiiiiII.getType() == 1) {
                IiiiiiiiIIIII = ((ActivityFCBuy)this.IIIIiiiiiiiII.getData()).getGains();
            } else if (this.IIIIiiiiiiiII.getType() == 2) {
                IiiiiiiiIIIII = ((ActivityFCTarget)this.IIIIiiiiiiiII.getData()).getGains();
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl85
        }
        if (id == 102) {
            if (this.IiIIIiiiiIiiI <= 0) {
                return;
            }
            this.iIiIiiiiIIiIi(this.IiIIIiiiiIiiI - 1);
            return;
        }
        if (id != 103) return;
        IiiiiiiiIIIII = 0;
        if (this.IIIIiiiiiiiII != null) {
            IiiiiiiiIIIII = null;
            if (this.IIIIiiiiiiiII.getType() == 1) {
                IiiiiiiiIIIII = ((ActivityFCBuy)this.IIIIiiiiiiiII.getData()).getGains();
            } else if (this.IIIIiiiiiiiII.getType() == 2) {
                IiiiiiiiIIIII = ((ActivityFCTarget)this.IIIIiiiiiiiII.getData()).getGains();
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII == null ? 0 : (IiiiiiiiIIIII.length > this.iIIiIiiiiiiIi ? IiiiiiiiIIIII.length - this.iIIiIiiiiiiIi : 0);
        } else {
            v0 = this.IiIiiiiiIIIII == null ? 0 : (IiiiiiiiIIIII = this.IiIiiiiiIIIII.size() > this.iIIiIiiiiiiIi ? this.IiIiiiiiIIIII.size() - this.iIIiIiiiiiiIi : 0);
        }
        if (this.IiIIIiiiiIiiI >= IiiiiiiiIIIII) {
            return;
        }
        this.iIiIiiiiIIiIi(this.IiIIIiiiiIiiI + 1);
        return;
        do {
            v1 = (IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(this.IiIiiiiiIIIII.get(IiiiiiiiIIIII).getId())) == null || GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII.getType()) == false ? this.IiIiiiiiIIIII.get(IiiiiiiiIIIII).getSum() : 1;
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII += v1;
lbl65:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII) < IiiiiiiiIIIII) {
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
            return;
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"Chongjipacksure", (String)(this.IiiiiiiiIIIII.getPacktype() + "|" + this.IiiiiiiiIIIII.getPackgradetype()));
        this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        return;
        do {
            if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII]).getType() != 1) {
                if (IiiiiiiiIIIII.getType() == 2) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII.getId()));
                    IiiiiiiiIIIII = (int)((long)IiiiiiiiIIIII + (IiiiiiiiIIIII == null || GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII.getType()) == false ? IiiiiiiiIIIII.getNum() : 1L));
                } else if (IiiiiiiiIIIII.getType() == 3) {
                    ++IiiiiiiiIIIII;
                } else {
                    IiiiiiiiIIIII.getType();
                }
            }
            ++IiiiiiiiIIIII;
lbl85:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        if (IiiiiiiiIIIII.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII) < IiiiiiiiIIIII) {
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
            return;
        }
        if (this.IIIIiiiiiiiII.getType() != 1) {
            if (this.IIIIiiiiiiiII.getType() != 2) return;
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(this.iIiiIiiiIiIIi.getId()) + "|" + this.IIIIiiiiiiiII.getId()));
            this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = (ActivityFCBuy)this.IIIIiiiiiiiII.getData();
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("\u4f60\u786e\u5b9a\u82b1\u8d39");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.getUses().length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII.getUses()[IiiiiiiiIIIII];
            if (IiiiiiiiIIIII.getType() == 1) {
                IiiiiiiiIIIII = this.iIiiIiiiIiIIi.getPointKey(IiiiiiiiIIIII.getId());
                if (IiiiiiiiIIIII != 0) {
                    IiiiiiiiIIIII.append("\u548c");
                }
                IiiiiiiiIIIII.append("#G");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getNum());
                IiiiiiiiIIIII.append("#W");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.IiiiiiiiIIIII : "\u672a\u77e5\u79ef\u5206");
            } else if (IiiiiiiiIIIII.getType() == 4) {
                if (IiiiiiiiIIIII != 0) {
                    IiiiiiiiIIIII.append("\u548c");
                }
                IiiiiiiiIIIII.append("#G");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getNum());
                IiiiiiiiIIIII.append("#W");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getKey());
                if (IiiiiiiiIIIII.getId() == 4) {
                    IiiiiiiiIIIII = 1;
                }
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII.append("\u8d2d\u4e70\u8be5\u793c\u5305\u3002");
        if (IiiiiiiiIIIII != 0) {
            IiiiiiiiIIIII.append("#W\u4f60\u5f53\u524d\u62e5\u6709#G");
            IiiiiiiiIIIII.append(this.iiIiiiiiiiIii.ALLATORIxDEMO().getLoginResult().getMoney());
            IiiiiiiiIIIII.append("#W\u79ef\u5206");
        }
        this.iiIiiiiiiiIii.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(88, String.valueOf(this.iIiiIiiiIiIIi.getId()) + "|" + this.IIIIiiiiiiiII.getId(), IiiiiiiiIIIII.toString()));
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int num) {
        block11: {
            this.iIIiIiiiiiiIi = num;
            this.IiIIIiiiiIiiI = 0;
            if (this.iiIiIiiiiIIIi == null || num > this.iiIiIiiiiIIIi.length) {
                IiiiiiiiIIIII = new iIIiiiiiIIIIi[num];
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = this.iiIiIiiiiIIIi != null && IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length ? this.iiIiIiiiiIIIi[IiiiiiiiIIIII] : new iIIiiiiiIIIIi(this, this.iiIiiiiiiiIii);
                    ++IiiiiiiiIIIII;
                }
                this.iiIiIiiiiIIIi = IiiiiiiiIIIII;
            }
            if (this.iIiIiiiiIiIii == null) {
                this.iIiIiiiiIiIii = new iiIiIiiiIIIiI("sc/e/156.png", 1, 102, this.iiIiiiiiiiIii, (JComponent)this);
            }
            if (this.IIiiIiiiIIiIi == null) {
                this.IIiiIiiiIIiIi = new iiIiIiiiIIIiI("sc/e/155.png", 1, 103, this.iiIiiiiiiiIii, (JComponent)this);
            }
            if (this.iIiiIiiiiiiII != 1) break block11;
            this.iIiIiiiiIiIii.setBounds(105, 18, 18, 25);
            this.IIiiIiiiIIiIi.setBounds(375, 18, 18, 25);
            this.iIiIiiiiIiIii.setVisible(false);
            this.IIiiIiiiIIiIi.setVisible(false);
            this.add((Component)this.iIiIiiiiIiIii);
            this.add((Component)this.IIiiIiiiIIiIi);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl50
        }
        if (this.iIiiIiiiiiiII != 2) {
            if (this.iIiiIiiiiiiII != 3) return;
        }
        this.iIiIiiiiIiIii.setBounds(23, 31, 18, 25);
        this.IIiiIiiiIIiIi.setBounds(377, 31, 18, 25);
        this.iIiIiiiiIiIii.setVisible(false);
        this.IIiiIiiiIIiIi.setVisible(false);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.IIiiIiiiIIiIi);
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl63
        do {
            if (IiiiiiiiIIIII < num) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIiiiiiiIIiI);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/104.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(124 + IiiiiiiiIIIII * 42, 8, 40, 40);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII]);
            } else {
                this.remove((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
lbl50:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length);
        return;
        do {
            if (IiiiiiiiIIIII < num) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIiiiiiiIIiI);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/104.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(42 + IiiiiiiiIIIII * 42, 23, 40, 40);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII]);
            } else {
                this.remove((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
lbl63:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length);
    }

    public IiIiiiiiIIIiI(IiiiIiiiiIiIi form) {
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiIiiiiiiiIii = form;
    }
}
