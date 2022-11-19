package com.ydlclass.annotation;

public class DeprecatedTest {
    private void useDeprecatedMethod() {
        User user = new User();
        // tnnd 为什么不加删除线
        String name = user.getName();
    }
    
    private class User {
        private String name;
        
        @Deprecated
        public String getName() {
            return name;
        }
    }
}
