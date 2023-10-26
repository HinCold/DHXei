package com.example.DXHei;


import com.example.DXHei.controller.PrompotionController;
import com.example.DXHei.dao.UserDOMapper;
import com.example.DXHei.entity.DO.Prompotion;
import com.example.DXHei.entity.DO.UserDOExample;

import com.example.DXHei.service.PrompotionService;
import com.example.DXHei.service.impl.PrompotionServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DxHeiApplicationTests {
	@Autowired
	UserDOMapper userDOMapper;

	@Autowired
	PrompotionService prompotionService;

	@Autowired
	PrompotionController prompotionController;

	@Test
	void contextLoads() {

		System.out.println(prompotionController.listAll().getData());
	}

}
