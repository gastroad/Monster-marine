package com.monstermarine.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonService {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	protected CommonDAO commonDAO;
	
}