package com.ydlclass.deepcopy;

import lombok.AllArgsConstructor;
import lombok.Data;

public class CopyLearning {
    
    public void getUserCloned() {
    
    }
    
    @Data
    @AllArgsConstructor
    private class User implements Cloneable {
        private int gender;
        private Dog pet;
        
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new User(getGender(), getPet());
        }
    }
    
    @Data
    private class Dog {
        private int age;
    }
    
    
}
