package com.dlq.hearthstone.Cards;

import com.dlq.hearthstone.Field;

public interface Card {
    // 只针对打场上怪的牌设计
    void use(Field field);
}
