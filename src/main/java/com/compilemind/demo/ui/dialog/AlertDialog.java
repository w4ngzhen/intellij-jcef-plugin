package com.compilemind.demo.ui.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AlertDialog extends DialogWrapper {

    private final String content;

    public AlertDialog(String title, String content) {
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

    @Override
    protected Action @NotNull [] createActions() {
        // 返回我们自己的Action
        return new Action[] {
                new OkAction()
        };
    }

    /**
     * 确定按钮
     * DialogWrapperAction只能是DialogWrapper内部类才能继承
     */
    protected class OkAction extends DialogWrapperAction {

        public OkAction() {
            super("确定");
        }

        @Override
        protected void doAction(ActionEvent e) {
            close(OK_EXIT_CODE);
        }
    }

}
