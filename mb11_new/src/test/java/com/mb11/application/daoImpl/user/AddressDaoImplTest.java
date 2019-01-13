package com.mb11.application.daoImpl.user;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mb11.application.model.user.Address;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressDaoImplTest {

	@Autowired
	private AddressDaoImpl adi;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
//@Test	
//public void addAddress()
//{
//	adi.addAddress(new Address("test1","test","test","test","test","test"));
//}
	
	

}
