/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.iiiiiiiiiiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameFrame
 *  com.xy.text.GamePanel$TabComponent
 *  com.xy.text.GameView
 *  com.xy.text.ScreenData
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.text;

import com.xy.i.iiiiiiiiiiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameFrame;
import com.xy.text.GamePanel;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class GamePanel
extends JPanel
implements MouseListener,
MouseMotionListener {
    private Color color3;
    private JLabel titleLab;
    private GameFrame gameFrame;
    public long repaintIndex;
    private int moveX;
    private int moveY;
    private boolean showLable = true;
    private iiiiiiiiiiIiI[] gameBtns;
    private GradientPaint grad1;
    private IIIiiiiiIiIiI img;
    public long repaintCount;
    private JComponent componentTab;
    private Color color2;
    private Color color1 = Color.decode("0xDDDDDD");

    public boolean ALLATORIxDEMO() {
        return this.showLable;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void paintComponent(Graphics g) {
        void IiiiiiiiIIIII;
        super.paintComponent(g);
        if (this.gameFrame.gameView == null) return;
        Graphics2D IiiiiiiiIIIII2 = (Graphics2D)g;
        ScreenData IiiiiiiiIIIII3 = this.gameFrame.gameView.screenData;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII3.Screen_x + 12;
        int n = IiiiiiiiIIIII3.Screen_y + 12 + 25 + (this.ALLATORIxDEMO() ? 25 : 0);
        IiiiiiiiIIIII2.setPaint(this.grad1);
        IiiiiiiiIIIII2.fillRect(1, 1, IiiiiiiiIIIII4 - 2, (int)(IiiiiiiiIIIII - 2));
        if (this.showLable) {
            IiiiiiiiIIIII2.setColor(this.color1);
            IiiiiiiiIIIII2.fillRect(6, 52, IiiiiiiiIIIII3.Screen_x, 4);
            IiiiiiiiIIIII2.setColor(this.color2);
            IiiiiiiiIIIII2.drawLine(5, 53, 7, 51);
            IiiiiiiiIIIII2.drawLine(7, 51, --IiiiiiiiIIIII4 - 7, 51);
            IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 7, 51, IiiiiiiiIIIII4 - 5, 53);
            IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 5, 53, IiiiiiiiIIIII4 - 5, (int)(--IiiiiiiiIIIII - 5));
            IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 5, (int)(IiiiiiiiIIIII - 5), 5, (int)(IiiiiiiiIIIII - 5));
            IiiiiiiiIIIII2.drawLine(5, (int)(IiiiiiiiIIIII - 5), 5, 53);
            IiiiiiiiIIIII2.drawLine(0, 2, 2, 0);
            IiiiiiiiIIIII2.drawLine(2, 0, IiiiiiiiIIIII4 - 2, 0);
            IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 2, 0, IiiiiiiiIIIII4, 2);
            IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4, 2, IiiiiiiiIIIII4, (int)(IiiiiiiiIIIII - 2));
            IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4, (int)(IiiiiiiiIIIII - 2), IiiiiiiiIIIII4 - 2, (int)IiiiiiiiIIIII);
            IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 2, (int)IiiiiiiiIIIII, 2, (int)IiiiiiiiIIIII);
            IiiiiiiiIIIII2.drawLine(2, (int)IiiiiiiiIIIII, 0, (int)(IiiiiiiiIIIII - 2));
            IiiiiiiiIIIII2.drawLine(0, (int)(IiiiiiiiIIIII - 2), 0, 2);
            IiiiiiiiIIIII2.setColor(this.color3);
            IiiiiiiiIIIII2.drawLine(2, 1, IiiiiiiiIIIII4 - 2, 1);
            return;
        }
        IiiiiiiiIIIII2.setColor(this.color2);
        IiiiiiiiIIIII2.drawLine(5, 30, --IiiiiiiiIIIII4 - 5, 30);
        IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 5, 30, IiiiiiiiIIIII4 - 5, (int)(--IiiiiiiiIIIII - 5));
        IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 5, (int)(IiiiiiiiIIIII - 5), 5, (int)(IiiiiiiiIIIII - 5));
        IiiiiiiiIIIII2.drawLine(5, (int)(IiiiiiiiIIIII - 5), 5, 30);
        IiiiiiiiIIIII2.drawLine(0, 2, 2, 0);
        IiiiiiiiIIIII2.drawLine(2, 0, IiiiiiiiIIIII4 - 2, 0);
        IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 2, 0, IiiiiiiiIIIII4, 2);
        IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4, 2, IiiiiiiiIIIII4, (int)(IiiiiiiiIIIII - 2));
        IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4, (int)(IiiiiiiiIIIII - 2), IiiiiiiiIIIII4 - 2, (int)IiiiiiiiIIIII);
        IiiiiiiiIIIII2.drawLine(IiiiiiiiIIIII4 - 2, (int)IiiiiiiiIIIII, 2, (int)IiiiiiiiIIIII);
        IiiiiiiiIIIII2.drawLine(2, (int)IiiiiiiiIIIII, 0, (int)(IiiiiiiiIIIII - 2));
        IiiiiiiiIIIII2.drawLine(0, (int)(IiiiiiiiIIIII - 2), 0, 2);
        IiiiiiiiIIIII2.setColor(this.color3);
        IiiiiiiiIIIII2.drawLine(2, 1, IiiiiiiiIIIII4 - 2, 1);
    }

    public GameFrame getGameFrame() {
        return this.gameFrame;
    }

    @Override
    public void paint(Graphics g) {
        ++this.repaintCount;
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        super.paint(g);
    }

    public JLabel getTitleLab() {
        return this.titleLab;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.moveX = e.getX();
        this.moveY = e.getY();
    }

    public void setShowLable() {
        this.showLable = !this.showLable;
        this.gameBtns[0].setBtnPath(this.showLable ? "sc/b/98.png" : "sc/b/97.png");
        this.gameBtns[3].setVisible(this.showLable);
        this.gameBtns[4].setVisible(this.showLable);
        this.gameFrame.setShowLable();
    }

    static /* synthetic */ GameFrame ALLATORIxDEMO(GamePanel arg0) {
        return arg0.gameFrame;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public GamePanel(GameFrame gameFrame) {
        this.color2 = iiIIiiiiIiiII.ALLATORIxDEMO((String)"0x324147");
        this.color3 = iiIIiiiiIiiII.ALLATORIxDEMO((String)"0x97A5B5");
        this.gameFrame = gameFrame;
        this.setLayout(null);
        this.setBounds(0, 0, 1, 1);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.grad1 = new GradientPaint(0.0f, 0.0f, Color.decode("0x5E7B9D"), 0.0f, 60.0f, Color.decode("0x789CC0"));
        this.img = new IIIiiiiiIiIiI("sc/b/SZ1.png");
        this.img.setBounds(5, 7, 16, 16);
        this.titleLab = IiIIIiiiiIIiI.ALLATORIxDEMO((int)24, (int)5, (int)800, (int)20, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.add((Component)this.img);
        this.add(this.titleLab);
        this.componentTab = new /* Unavailable Anonymous Inner Class!! */;
        this.componentTab.setVisible(false);
        this.add(this.componentTab);
        this.gameBtns = new iiiiiiiiiiIiI[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.gameBtns.length) {
            if (IiiiiiiiIIIII == 3) {
                this.gameBtns[IiiiiiiiIIIII] = new iiiiiiiiiiIiI("sc/e/76.png", 1, IiiiiiiiIIIII + 1, (Object)this);
                this.gameBtns[IiiiiiiiIIIII].setBounds(0, 0, 12, 16);
            } else if (IiiiiiiiIIIII == 4) {
                this.gameBtns[IiiiiiiiIIIII] = new iiiiiiiiiiIiI("sc/e/77.png", 1, IiiiiiiiIIIII + 1, (Object)this);
                this.gameBtns[IiiiiiiiIIIII].setBounds(0, 0, 16, 16);
            } else {
                this.gameBtns[IiiiiiiiIIIII] = new iiiiiiiiiiIiI("sc/b/" + (98 + IiiiiiiiIIIII) + ".png", 1, IiiiiiiiIIIII + 1, (Object)this);
                this.gameBtns[IiiiiiiiIIIII].setBounds(0, 0, 17, 17);
            }
            this.add((Component)this.gameBtns[IiiiiiiiIIIII++]);
        }
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void ALLATORIxDEMO() {
        if (this.gameFrame.gameView == null) return;
        ScreenData screenData = this.gameFrame.gameView.screenData;
        int IiiiiiiiIIIII = screenData.Screen_x + 12;
        int IiiiiiiiIIIII2 = screenData.Screen_y + 12 + 25 + (this.ALLATORIxDEMO() ? 25 : 0);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < 3) {
            iiiiiiiiiiIiI iiiiiiiiiiIiI2 = this.gameBtns[IiiiiiiiIIIII3];
            int n = IiiiiiiiIIIII - 17 * (3 - IiiiiiiiIIIII3) - 1;
            ++IiiiiiiiIIIII3;
            iiiiiiiiiiIiI2.setBounds(n, 1, 17, 17);
        }
    }

    public void setShowTab() {
        if (this.componentTab.isVisible()) {
            this.componentTab.setVisible(false);
            return;
        }
        int IiiiiiiiIIIII = this.gameFrame.gameList.indexOf(this.gameFrame.gameView);
        int IiiiiiiiIIIII2 = this.componentTab.getComponentCount();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.gameFrame.gameList.size()) {
            GameView IiiiiiiiIIIII4 = (GameView)this.gameFrame.gameList.get(IiiiiiiiIIIII3);
            TabComponent IiiiiiiiIIIII5 = (TabComponent)(IiiiiiiiIIIII3 < IiiiiiiiIIIII2 ? this.componentTab.getComponent(IiiiiiiiIIIII3) : null);
            if (IiiiiiiiIIIII5 == null) {
                IiiiiiiiIIIII5 = new TabComponent(this, IiiiiiiiIIIII3);
                this.componentTab.add((Component)IiiiiiiiIIIII5);
            }
            TabComponent.iIiIiiiiIIiii((TabComponent)IiiiiiiiIIIII5).setText(IiiiiiiiIIIII == IiiiiiiiIIIII3 ? "\u221a" : "");
            TabComponent.ALLATORIxDEMO((TabComponent)IiiiiiiiIIIII5).setText(IiiiiiiiIIIII4.isDraw ? IiiiiiiiIIIII4.roleUnit.ALLATORIxDEMO() : null);
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII5.setVisible(true);
        }
        IiiiiiiiIIIII3 = this.gameFrame.gameList.size();
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2) {
            this.componentTab.getComponent(IiiiiiiiIIIII3++).setVisible(false);
        }
        this.componentTab.setBounds(20, 50, 160, 1 + this.gameFrame.gameList.size() * 19);
        this.componentTab.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int IiiiiiiiIIIII = e.getX() - this.moveX;
        int IiiiiiiiIIIII2 = e.getY() - this.moveY;
        this.gameFrame.setBounds(IiiiiiiiIIIII + this.gameFrame.getX(), IiiiiiiiIIIII2 + this.gameFrame.getY(), this.gameFrame.getWidth(), this.gameFrame.getHeight());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public iiiiiiiiiiIiI[] getGameBtns() {
        return this.gameBtns;
    }
}
