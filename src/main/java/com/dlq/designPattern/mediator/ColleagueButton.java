package com.dlq.designPattern.mediator;

import java.awt.*;

/**
 * @author KznAsg
 * @version 2022/11/16  下午 9:26
 * @description 按钮
 * @page 187
 * @link
 */

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    
    public ColleagueButton(String caption) throws HeadlessException {
        super(caption);
    }
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
