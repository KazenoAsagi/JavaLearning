package com.dlq.designPattern.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author KznAsg
 * @version 2022/11/16  下午 9:36
 * @description 用户界面（使用仲裁者模式）
 * @page 189
 * @link
 */

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;
    
    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        // 使用布局管理器生成4*2窗格
        setLayout(new GridLayout(4, 2));
        
        createColleagues();
        
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        
        colleagueChanged();
        
        // 显示界面
        pack();
        setVisible(true);
        
        
    }
    
    @Override
    public void createColleagues() {
        // 初始化变量
        CheckboxGroup group = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, false);
        this.textUser = new ColleagueTextField("", 10);
        this.textPass = new ColleagueTextField("", 10);
        this.textPass.setEchoChar('*');
        this.buttonOk = new ColleagueButton("OK");
        this.buttonCancel = new ColleagueButton("Cancel");
        
        // 设置mediator
        this.checkGuest.setMediator(this);
        this.checkLogin.setMediator(this);
        this.textUser.setMediator(this);
        this.textPass.setMediator(this);
        this.buttonOk.setMediator(this);
        this.buttonCancel.setMediator(this);
        
        // 设置listener
        this.checkGuest.addItemListener(checkGuest);
        this.checkLogin.addItemListener(checkLogin);
        this.textUser.addTextListener(textUser);
        this.textPass.addTextListener(textPass);
        this.buttonOk.addActionListener(this);
        this.buttonCancel.addActionListener(this);
    }
    
    /**
     * 改变登录模式
     */
    @Override
    public void colleagueChanged() {
        // 在guest模式下
        if (checkGuest.getState()) {
            // user变成不可输入状态
            textUser.setColleagueEnabled(false);
            // password变成不可输入状态
            textPass.setColleagueEnabled(false);
            // ok变为可点击状态
            buttonOk.setColleagueEnabled(true);
        }
        // 在login模式下
        if (checkLogin.getState()) {
            // user变成可输入状态
            textUser.setColleagueEnabled(true);
            // 检查密码输入框与登录按钮的状态
            userpassChanged();
        }
        
    }
    
    /**
     * 检查密码输入框与登录按钮的状态 <br/>
     * 每次进入login模式时都会触发
     */
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            // 在输入了用户名的情况下，才可输入密码
            textPass.setColleagueEnabled(true);
            
            if (textPass.getText().length() > 0) {
                // 在输入用户名的情况下，输入了密码，才可以点击登录按钮
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
            
        } else {
            // 没有输入用户名时，不能输入密码、点击登录按钮
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
