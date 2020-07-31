package com.yanzhaoyl.bug.demo.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yanzhaoyl.bug.demo.service.TaobaoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaobaoServiceImplTest {

	@Autowired
	private TaobaoService taobaoService;

	@Test
	public void queryByAllTest() {

		taobaoService.queryByAll();
		
	}
}
