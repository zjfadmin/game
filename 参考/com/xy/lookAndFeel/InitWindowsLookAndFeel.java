package com.xy.lookAndFeel;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIDefaults;

public class InitWindowsLookAndFeel {
   public static WindowsLookAndFeel initWindowsLookAndFeel() {
      return new WindowsLookAndFeel() {
         protected void initClassDefaults(UIDefaults var1) {
            String var10000 = "com.sun.java.swing.plaf.windows.";
            super.initClassDefaults(var1);
            Object[] var3 = new Object[101 & 94];
            boolean var10002 = true;
            var3[2 & 5] = "ButtonUI";
            var3[2 ^ 3] = "com.sun.java.swing.plaf.windows.WindowsButtonUI";
            var3[5 >> 1] = "CheckBoxUI";
            var3[--3] = "com.sun.java.swing.plaf.windows.WindowsCheckBoxUI";
            var3[--4] = "CheckBoxMenuItemUI";
            var3[--5] = "com.sun.java.swing.plaf.windows.WindowsCheckBoxMenuItemUI";
            var3[126 & 7] = "LabelUI";
            var3[103 & 31] = "com.xy.lookAndFeel.MyWindowsLabelUI";
            var3[91 & 44] = "RadioButtonUI";
            var3[31 & 105] = "com.sun.java.swing.plaf.windows.WindowsRadioButtonUI";
            var3[14 & 123] = "RadioButtonMenuItemUI";
            var3[43 & 95] = "com.sun.java.swing.plaf.windows.WindowsRadioButtonMenuItemUI";
            var3[93 & 46] = "ToggleButtonUI";
            var3[47 & 93] = "com.sun.java.swing.plaf.windows.WindowsToggleButtonUI";
            var3[62 & 79] = "ProgressBarUI";
            var3[63 & 79] = "com.sun.java.swing.plaf.windows.WindowsProgressBarUI";
            var3[59 & 84] = "SliderUI";
            var3[119 & 25] = "com.sun.java.swing.plaf.windows.WindowsSliderUI";
            var3[23 & 122] = "SeparatorUI";
            var3[27 & 119] = "com.sun.java.swing.plaf.windows.WindowsSeparatorUI";
            var3[87 & 60] = "SplitPaneUI";
            var3[21] = "com.sun.java.swing.plaf.windows.WindowsSplitPaneUI";
            var3[22] = "SpinnerUI";
            var3[23] = "com.sun.java.swing.plaf.windows.WindowsSpinnerUI";
            var3[24] = "TabbedPaneUI";
            var3[25] = "com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI";
            var3[26] = "TextAreaUI";
            var3[27] = "com.sun.java.swing.plaf.windows.WindowsTextAreaUI";
            var3[28] = "TextFieldUI";
            var3[29] = "com.sun.java.swing.plaf.windows.WindowsTextFieldUI";
            var3[30] = "PasswordFieldUI";
            var3[31] = "com.sun.java.swing.plaf.windows.WindowsPasswordFieldUI";
            var3[32] = "TextPaneUI";
            var3[33] = "com.sun.java.swing.plaf.windows.WindowsTextPaneUI";
            var3[34] = "EditorPaneUI";
            var3[35] = "com.sun.java.swing.plaf.windows.WindowsEditorPaneUI";
            var3[36] = "TreeUI";
            var3[37] = "com.sun.java.swing.plaf.windows.WindowsTreeUI";
            var3[38] = "ToolBarUI";
            var3[39] = "com.sun.java.swing.plaf.windows.WindowsToolBarUI";
            var3[40] = "ToolBarSeparatorUI";
            var3[41] = "com.sun.java.swing.plaf.windows.WindowsToolBarSeparatorUI";
            var3[42] = "ComboBoxUI";
            var3[43] = "com.sun.java.swing.plaf.windows.WindowsComboBoxUI";
            var3[44] = "TableHeaderUI";
            var3[45] = "com.sun.java.swing.plaf.windows.WindowsTableHeaderUI";
            var3[46] = "InternalFrameUI";
            var3[47] = "com.sun.java.swing.plaf.windows.WindowsInternalFrameUI";
            var3[48] = "DesktopPaneUI";
            var3[49] = "com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI";
            var3[50] = "DesktopIconUI";
            var3[51] = "com.sun.java.swing.plaf.windows.WindowsDesktopIconUI";
            var3[52] = "FileChooserUI";
            var3[53] = "com.sun.java.swing.plaf.windows.WindowsFileChooserUI";
            var3[54] = "MenuUI";
            var3[55] = "com.sun.java.swing.plaf.windows.WindowsMenuUI";
            var3[56] = "MenuItemUI";
            var3[57] = "com.sun.java.swing.plaf.windows.WindowsMenuItemUI";
            var3[58] = "MenuBarUI";
            var3[59] = "com.sun.java.swing.plaf.windows.WindowsMenuBarUI";
            var3[60] = "PopupMenuUI";
            var3[61] = "com.sun.java.swing.plaf.windows.WindowsPopupMenuUI";
            var3[62] = "PopupMenuSeparatorUI";
            var3[63] = "com.sun.java.swing.plaf.windows.WindowsPopupMenuSeparatorUI";
            var3[64] = "ScrollBarUI";
            var3[65] = "com.sun.java.swing.plaf.windows.WindowsScrollBarUI";
            var3[66] = "RootPaneUI";
            var3[67] = "com.sun.java.swing.plaf.windows.WindowsRootPaneUI";
            Object[] var2 = var3;
            var1.putDefaults(var2);
         }
      };
   }
}
