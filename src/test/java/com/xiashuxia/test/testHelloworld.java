package com.xiashuxia.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xiashuxia.hello.Helloworld;

public class testHelloworld {

	@Test
	public void testGetPara() {
		Helloworld helloworld = new Helloworld();
		assertEquals(0, helloworld.getPara());
	}
	
	

}
