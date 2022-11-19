package com.dlq.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BreadthFirstSearchTest {
    
    public BreadthFirstSearch instance;
    
    @BeforeEach
    void setUp() {
        instance = new BreadthFirstSearch(18, 3);
        instance.initialization();
    }
    
    @Test
    void doSearch() {
        System.out.println(instance.queue);
        instance.doBreadthFirstSearch();
        System.out.println(instance.queue);
        
    }
}