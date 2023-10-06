package com.example.DXHei;


import com.example.DXHei.dao.UserDOMapper;
import com.example.DXHei.entity.DO.UserDOExample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DxHeiApplicationTests {
	@Autowired
	UserDOMapper userDOMapper;
	@Test
	void contextLoads() {
		UserDOExample userDOExample = null;
		long cnt = userDOMapper.countByExample(userDOExample);
		System.out.println(cnt);
	}

}
