package com.java.springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	MobileProcessor cpu;
	
	public void config() {
		System.out.println("octa core 8gbram 20mp camera");
		cpu.process();
	}
}
