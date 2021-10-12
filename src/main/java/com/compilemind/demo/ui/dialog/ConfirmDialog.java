package com.compilemind.demo.ui.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ConfirmDialog extends DialogWrapper {

    private final String content;

    public ConfirmDialog(String title, String content) {
        super(false);
        setTitle(title);
        this.content = content;
        // init方法需要在所有的值设置到位的时候才进行调用
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return new JLabel(this.content);
    }

}
