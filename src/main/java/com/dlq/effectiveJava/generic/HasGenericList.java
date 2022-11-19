package com.dlq.effectiveJava.generic;

import com.dlq.effectiveJava.generic.utils.Stamp;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author KznAsg
 * @version 2022/9/6  22:20
 * @page
 */
public class HasGenericList {
    private final Collection<Stamp> stamps = new ArrayList<>();
    
    @Test
    public void addSomeElements() {
        /* 这里就会直接报错：
        java: 不兼容的类型: com.dlq.effectiveJava.generic.utils.Coin无法转换为com.dlq.effectiveJava.generic.utils.Stamp
         */
        // stamps.add(new Coin());
    }
}
