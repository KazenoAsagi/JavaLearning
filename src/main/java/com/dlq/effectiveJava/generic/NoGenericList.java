package com.dlq.effectiveJava.generic;

import com.dlq.effectiveJava.generic.utils.Coin;
import com.dlq.effectiveJava.generic.utils.Stamp;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author KznAsg
 * @version 2022/9/6  22:02
 * @page 102
 */
public class NoGenericList {
    // 如果不写泛型，插入元素的时候不会报错，一旦想拿出元素的时候就会报错
    private final Collection stamps = new ArrayList();
    
    /*
    报错信息：coin没法转换成stamp
    * java.lang.ClassCastException: class com.dlq.effectiveJava.generic.NoGenericList$Coin cannot be cast to class com.dlq.effectiveJava.generic.NoGenericList$Stamp (com.dlq.effectiveJava.generic.NoGenericList$Coin and com.dlq.effectiveJava.generic.NoGenericList$Stamp are in unnamed module of loader 'app')
	at com.dlq.effectiveJava.generic.NoGenericList.getSomeElements(NoGenericList.java:39)
	
    因为当初没有给 ArrayList 写泛型，编译器并不知道 stamps 里面只能放 stamp，所以 coin 也成功放了进去，
    可是当我们想要使用 stamps 里面的数据的时候，我们以为里面一定保存的是 stamp，于是就调用 stamp 的方法，
    结果就报错了
	*/
    /*
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(
    Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
	at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
	at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
 */
    @Test
    public void getSomeElements() {
        // 放 coin 进这个 list 的时候并不会报错
        stamps.add(new Coin());
        
        for (Iterator i = stamps.iterator(); i.hasNext(); ) {
            Stamp stamp = (Stamp) i.next();
            // 一旦想调用 stamp 的方法的时候，就会发现里面居然放的不是 stamp 而是 coin
            stamp.cancel();
            
        }
    }
}
