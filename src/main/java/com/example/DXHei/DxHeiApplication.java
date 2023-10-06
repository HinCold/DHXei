package com.example.DXHei;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import javax.annotation.ManagedBean;


@SpringBootApplication
@MapperScan("com.example.DXHei.dao")
public class DxHeiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxHeiApplication.class, args);
	}

}
