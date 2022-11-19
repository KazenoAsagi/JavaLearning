package com.dlq.designPattern.mediator;

/**
 * @author KznAsg
 * @version 2022/11/16  下午 9:24
 * @description 组员接口
 * @page 186
 * @link
 */

public interface Colleague {
    void setMediator(Mediator mediator);
    
    void setColleagueEnabled(boolean enabled);
}
