package com.xiaomeng;

import org.junit.Test;
import org.junit.Assert;

public class DemoTest{
         public String testSay(){
                                 Demo d =new Demo();
                                 String ret = d.say("maven");
                                // Assert.assertEquals(预计值，真实值);断言
                                Assert.assertEquals("hello maven",ret);
                                     
                 }
}