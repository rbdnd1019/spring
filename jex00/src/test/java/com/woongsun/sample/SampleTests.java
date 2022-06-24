package com.woongsun.sample;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.woongsun.config.RootConfig;

import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})
//@Log4j
@Log
public class SampleTests {
//	private static final Logger log = Logger.getLogger(SampleTests.class);
	@Setter @Autowired
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		assertNotNull(restaurant);
		log.warning(restaurant.toString());
		log.info("====================");
		log.info(restaurant.getChef().toString());
		
	}
}
