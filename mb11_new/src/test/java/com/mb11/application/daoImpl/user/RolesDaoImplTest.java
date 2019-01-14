package com.mb11.application.daoImpl.user;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RolesDaoImplTest {

	@Autowired
	private RolesDaoImpl rdi;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

}