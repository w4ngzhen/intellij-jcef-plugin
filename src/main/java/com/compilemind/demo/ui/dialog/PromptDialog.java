package com.compilemind.demo.ui.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class PromptDialog extends DialogWrapper {

    /**
     * 显示信息
     */
    private final String content;

    /**
     * 文本输入框
     */
    private final JTextField jTextField;

    public PromptDialog(String title, String content) {
        super(false);

        this.jTextField = new JTextField(10);
        this.content = content;

        setTitle(title);
        // init方法需要在所有的值设置到位的时候才进行调用
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        // 2行1列
        JPanel jPanel = new JPanel(new GridLayout(2, 1));
        jPanel.add(new JLabel(this.content));
        jPanel.add(this.jTextField);
        return jPanel;
    }

    public String getText() {
        return this.jTextField.getText();
    }
}
