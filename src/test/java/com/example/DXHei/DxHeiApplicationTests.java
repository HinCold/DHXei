package com.example.DXHei;


import com.example.DXHei.controller.PrompotionController;
import com.example.DXHei.dao.UserDOMapper;
import com.example.DXHei.service.PrompotionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

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
		Date date = new Date();
//		System.out.println(prompotionService.listPrompotions());
		System.out.println(prompotionController.create("qiangliwu", date, date, 1, "000000"));
	}

}
