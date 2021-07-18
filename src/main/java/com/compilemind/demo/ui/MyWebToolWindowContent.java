package com.compilemind.demo.ui;

import com.intellij.ui.jcef.JBCefApp;
import com.intellij.ui.jcef.JBCefBrowser;

import javax.swing.*;
import java.awt.*;

public class MyWebToolWindowContent {

    private final JPanel content;

    /**
     * 构造函数
     */
    public MyWebToolWindowContent() {
        this.content = new JPanel(new BorderLayout());
        // 判断所处的IDEA环境是否支持JCEF
        if (!JBCefApp.isSupported()) {
            this.content.add(new JLabel("当前环境不支持JCEF", SwingConstants.CENTER));
            return;
        }
        // 创建 JBCefBrowser
        JBCefBrowser jbCefBrowser = new JBCefBrowser();
        // 将 JBCefBrowser 的UI控件设置到Panel中
        this.content.add(jbCefBrowser.getComponent(), BorderLayout.CENTER);
        // 加载URL
        jbCefBrowser.loadURL("https://cnblogs.com/w4ngzhen");
    }

    /**
     * 返回创建的JPanel
     * @return JPanel
     */
    public JPanel getContent() {
        return content;
    }
}
