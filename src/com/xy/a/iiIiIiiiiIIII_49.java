/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiIiiiIiIIi
 *  com.xy.a.iIiiiiiiIiiii
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Assist
 *  com.xy.script.ScriptTask
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.a;

import com.xy.a.IIiiIiiiIiIIi;
import com.xy.a.iIiiiiiiIiiii;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.readbean.Assist;
import com.xy.script.ScriptTask;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iiIiiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIIII
extends com.xy.q.IiiiIiiiiIiIi {
    private Point iiiIiiiiiiiIi;
    private IIiiIiiiIiIIi iIiiIiiiiiiII;
    private IIIIIiiiIIIiI IIiiIiiiIIiIi;
    private Border iIiIiiiiIiIii;
    private IIIIIiiiIIIiI IiIIIiiiiIiiI;
    private IIIIIiiiIIIiI iiIiiiiiiiIii;
    private IIIIIiiiIIIiI IiiiiiiiIIIII;
    private IIIIIiiiIIIiI ALLATORIxDEMO;

    public void iIiIiiiiIIiIi(int type) {
        if (IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII) == null) {
            return;
        }
        int IiiiiiiiIIIII = IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = type == 0 ? IiiiiiiiIIIII - 1 : (type == 1 ? IiiiiiiiIIIII + 1 : (type == 2 ? 1 : IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).getComponentCount()));
        if (IiiiiiiiIIIII2 < 1) return;
        if (IiiiiiiiIIIII2 > IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).getComponentCount()) {
            return;
        }
        iIiiiiiiIiiii IiiiiiiiIIIII3 = (iIiiiiiiIiiii)IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).get(IiiiiiiiIIIII2 - 1);
        boolean IiiiiiiiIIIII4 = IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).ALLATORIxDEMO();
        int IiiiiiiiIIIII5 = IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).ALLATORIxDEMO();
        Assist IiiiiiiiIIIII6 = IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).ALLATORIxDEMO();
        IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).ALLATORIxDEMO(IiiiiiiiIIIII3.ALLATORIxDEMO(), IiiiiiiiIIIII3.ALLATORIxDEMO(), IiiiiiiiIIIII3.ALLATORIxDEMO());
        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII5, IiiiiiiiIIIII6);
        this.ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void iIiIiiiiIIiii() {
        if (!this.iIiIiiiiIIiii()) {
            return;
        }
        super.iIiIiiiiIIiii();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void iiiIiiiiiiIIi(int id) {
        block16: {
            if (id != 251) break block16;
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            if (IiiiiiiiIIIII.getLimit("\u6708\u5361") == null && IiiiiiiiIIIII.getLimit("\u5b63\u5361") == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u529f\u80fd\u89e3\u9501\u9700\u8981\u6708\u5361\u6216\u5b63\u5361");
                return;
            }
            if (!this.iiIIiiiiIiIIi.roleUnit.iiiIiiiiiiIIi()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8fd8\u5728\u6446\u644a");
                return;
            }
            if (IiiiiiiiIIIII.getRoleSystem().getIsPk() == 1 || IiiiiiiiIIIII.getRoleSystem().getIsGood() == 1) {
                this.iiiIiiiiiiiIi = new Point(IiiiiiiiIIIII.getRoleSystem().getIsPk(), IiiiiiiiIIIII.getRoleSystem().getIsGood());
                IiiiiiiiIIIII = false;
                if (IiiiiiiiIIIII.getRoleSystem().getIsPk() == 1) {
                    IiiiiiiiIIIII.getRoleSystem().setIsPk(Integer.valueOf(0));
                    IiiiiiiiIIIII = true;
                }
                if (IiiiiiiiIIIII.getRoleSystem().getIsGood() == 1) {
                    IiiiiiiiIIIII.getRoleSystem().setIsGood(Integer.valueOf(0));
                    IiiiiiiiIIIII = true;
                }
                if (IiiiiiiiIIIII) {
                    IiiiiiiiIIIII /* !! */  = Agreement.getSendTextAES((String)"roleSystem", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII.getRoleSystem()));
                    this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII /* !! */ );
                }
            }
            IiiiiiiiIIIII = new StringBuffer();
            var5_9 = IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).iterator();
            if (true) ** GOTO lbl68
        }
        if (id == 252) {
            this.iiIIiiiiIiIIi.automation.ALLATORIxDEMO(false, 0);
            if (this.iiiIiiiiiiiIi != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO();
                IiiiiiiiIIIII = false;
                if (this.iiiIiiiiiiiIi.x != IiiiiiiiIIIII.getRoleSystem().getIsPk()) {
                    IiiiiiiiIIIII.getRoleSystem().setIsPk(Integer.valueOf(this.iiiIiiiiiiiIi.x == 0 ? 1 : 0));
                    IiiiiiiiIIIII = true;
                }
                if (this.iiiIiiiiiiiIi.y != IiiiiiiiIIIII.getRoleSystem().getIsGood()) {
                    IiiiiiiiIIIII.getRoleSystem().setIsGood(Integer.valueOf(this.iiiIiiiiiiiIi.y == 0 ? 1 : 0));
                    IiiiiiiiIIIII = true;
                }
                if (IiiiiiiiIIIII) {
                    IiiiiiiiIIIII = Agreement.getSendTextAES((String)"roleSystem", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII.getRoleSystem()));
                    this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                }
                this.iiiIiiiiiiiIi = null;
            }
            this.iiiIiiiiiiIIi(false);
            return;
        }
        if (id == 253) {
            this.iIiIiiiiIIiIi(0);
            return;
        }
        if (id == 254) {
            this.iIiIiiiiIIiIi(1);
            return;
        }
        if (id == 255) {
            this.iIiIiiiiIIiIi(2);
            return;
        }
        if (id != 256) return;
        this.iIiIiiiiIIiIi(3);
        return;
        do {
            IiiiiiiiIIIII /* !! */  = (iIiiiiiiIiiii)var5_9.next();
            IiiiiiiiIIIII /* !! */ .iIiIiiiiIIiii(true);
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("\r\n");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII /* !! */ .ALLATORIxDEMO() != false ? "ON" : "OFF");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII /* !! */ .ALLATORIxDEMO().getId());
            IiiiiiiiIIIII.append("=");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII /* !! */ .ALLATORIxDEMO());
lbl68:
            // 2 sources

        } while (var5_9.hasNext());
        if (this.ALLATORIxDEMO(0) == false) return;
        IiiiIiiiiIiIi.iiiIiiiiiiIIi((String)"map/assist.txt", (String)IiiiiiiiIIIII.toString());
    }

    public void iIiIiiiiIIiii(int sid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).size()) {
            iIiiiiiiIiiii IiiiiiiiIIIII2 = (iIiiiiiiIiiii)IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).get(IiiiiiiiIIIII);
            Assist IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO();
            if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getSid() == sid) {
                IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII + 1, IiiiiiiiIIIII3);
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
    }

    public iiIiIiiiiIIII(GameView gameView) {
        super(145, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 862, 411, com.xy.q.IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iIiIiiiiIIiii("sc/b/S341.png");
        this.ALLATORIxDEMO = new IIIIIiiiIIIiI("sc/b/B458.png", 1, 251, (com.xy.q.IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(592, 352, 101, 30);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI("sc/b/B42.png", 1, 253, (com.xy.q.IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(500, 358, 17, 17);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI("sc/b/B43.png", 1, 254, (com.xy.q.IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(520, 358, 17, 17);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new IIIIIiiiIIIiI("sc/e/40.png", 1, 255, "\u9876", (com.xy.q.IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(540, 358, 18, 18);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IIiiIiiiIIiIi = new IIIIIiiiIIIiI("sc/e/40.png", 1, 256, "\u5e95", (com.xy.q.IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(560, 358, 18, 18);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiiIiiiiiiII = new IIiiIiiiIiIIi(this);
        this.iIiiIiiiiiiII.setBounds(213, 60, 490, 288);
        this.add((Component)this.iIiiIiiiiiiII);
    }

    public void ALLATORIxDEMO(iIiiiiiiIiiii assistModelJPanel) {
        IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII, (iIiiiiiiIiiii)assistModelJPanel);
        if (this.iIiIiiiiIiIii == null && assistModelJPanel != null) {
            this.iIiIiiiiIiIii = BorderFactory.createLineBorder(Color.YELLOW, 2);
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iIiiiiiiIiiii IiiiiiiiIIIII3;
            iIiiiiiiIiiii iIiiiiiiIiiii2 = IiiiiiiiIIIII3 = IiiiiiiiIIIII < IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).size() ? (iIiiiiiiIiiii)IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).get(IiiiiiiiIIIII) : null;
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII3.setBorder(IiiiiiiiIIIII3 == assistModelJPanel ? this.iIiIiiiiIiIii : null);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public void iiiIiiiiiiIIi(boolean type) {
        if (type) {
            if (this.ALLATORIxDEMO.ALLATORIxDEMO() == 252) {
                return;
            }
            this.ALLATORIxDEMO.ALLATORIxDEMO(252);
            this.ALLATORIxDEMO.setImage("sc/b/B459.png");
            IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).setVisible(true);
            return;
        }
        if (this.ALLATORIxDEMO.ALLATORIxDEMO() == 251) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(251);
        this.ALLATORIxDEMO.setImage("sc/b/B458.png");
        IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).setVisible(false);
    }

    public void ALLATORIxDEMO(List<Assist> assistList) {
        if (assistList == null) {
            return;
        }
        IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII, null);
        IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).removeAll();
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = assistList.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iIiiiiiiIiiii IiiiiiiiIIIII3;
            Assist IiiiiiiiIIIII4 = assistList.get(IiiiiiiiIIIII);
            iIiiiiiiIiiii iIiiiiiiIiiii2 = IiiiiiiiIIIII3 = IiiiiiiiIIIII < IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).size() ? (iIiiiiiiIiiii)IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).get(IiiiiiiiIIIII) : null;
            if (IiiiiiiiIIIII3 == null) {
                IiiiiiiiIIIII3 = new iIiiiiiiIiiii(this);
                IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).add(IiiiiiiiIIIII3);
            }
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII + 1, IiiiiiiiIIIII4);
            IiiiiiiiIIIII3.setBounds(0, 53 * IiiiiiiiIIIII, 468, 53);
            ++IiiiiiiiIIIII;
            IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).add((Component)IiiiiiiiIIIII3);
        }
        IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).setPreferredSize(new Dimension(468, 53 * IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).getComponentCount()));
        IiiiiiiiIIIII = assistList.size();
        while (IiiiiiiiIIIII < IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).size()) {
            iIiiiiiiIiiii iIiiiiiiIiiii3 = (iIiiiiiiIiiii)IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            iIiiiiiiIiiii3.ALLATORIxDEMO(0, null);
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean iIiIiiiiIIiii() {
        block9: {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO().getAssistList();
            if (IiiiiiiiIIIII == null) {
                return false;
            }
            try {
                IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((String)"map/assist.txt");
                if (IiiiiiiiIIIII == null || IiiiiiiiIIIII.size() == 0) break block9;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl35
            }
            catch (Exception IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                break block9;
            }
            do {
                if (!(IiiiiiiiIIIII = ((String)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).trim()).equals("")) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("=");
                    IiiiiiiiIIIII = IiiiiiiiIIIII.startsWith("ON");
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.substring(IiiiiiiiIIIII != false ? 2 : 3, IiiiiiiiIIIII));
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1));
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
                        IiiiiiiiIIIII = (Assist)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII.getId() != IiiiiiiiIIIII) {
                            ++IiiiiiiiIIIII;
                            continue;
                        }
                        IiiiiiiiIIIII.setOn(IiiiiiiiIIIII);
                        IiiiiiiiIIIII.setNum(IiiiiiiiIIIII);
                        IiiiiiiiIIIII.setId(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII != IiiiiiiiIIIII) {
                            IiiiiiiiIIIII.remove(IiiiiiiiIIIII);
                            IiiiiiiiIIIII.add(IiiiiiiiIIIII, IiiiiiiiIIIII);
                        }
                        ++IiiiiiiiIIIII;
                        break;
                    }
                }
                ++IiiiiiiiIIIII;
lbl35:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        return true;
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number < 0L) {
            return 0L;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iIiiiiiiIiiii IiiiiiiiIIIII3 = (iIiiiiiiIiiii)IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII).get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII3.ALLATORIxDEMO() != textField) {
                ++IiiiiiiiIIIII;
                continue;
            }
            Assist IiiiiiiiIIIII4 = IiiiiiiiIIIII3.ALLATORIxDEMO();
            if (IiiiiiiiIIIII4 == null) {
                return 0L;
            }
            long IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getMax();
            if (number <= IiiiiiiiIIIII5) return null;
            return IiiiiiiiIIIII5;
        }
        return 0L;
    }

    public boolean ALLATORIxDEMO(int sid) {
        ScriptTask IiiiiiiiIIIII = null;
        for (iIiiiiiiIiiii IiiiiiiiIIIII2 : IIiiIiiiIiIIi.ALLATORIxDEMO((IIiiIiiiIiIIi)this.iIiiIiiiiiiII)) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.iIiIiiiiIIiii();
            if (IiiiiiiiIIIII3 <= 0) continue;
            Assist IiiiiiiiIIIII4 = IiiiiiiiIIIII2.ALLATORIxDEMO();
            if (IiiiiiiiIIIII4.getSid() == sid) {
                IiiiiiiiIIIII2.iIiIiiiiIIiii(false);
                continue;
            }
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getValue().split("\\|");
            IiiiiiiiIIIII = new ScriptTask(IiiiiiiiIIIII5, IiiiiiiiIIIII3, IiiiiiiiIIIII4.getSid());
            break;
        }
        if (IiiiiiiiIIIII == null) {
            this.iiiIiiiiiiIIi(false);
            return false;
        }
        this.iiIIiiiiIiIIi.automation.ALLATORIxDEMO(IiiiiiiiIIIII, true, 1);
        this.iiiIiiiiiiIIi(true);
        return true;
    }
}
