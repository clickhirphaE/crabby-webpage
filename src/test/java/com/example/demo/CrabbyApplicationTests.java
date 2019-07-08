package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class CrabbyApplicationTests {

	@RequestMapping("/")
	public String contextLoads() {
		return "index";
	}

}
