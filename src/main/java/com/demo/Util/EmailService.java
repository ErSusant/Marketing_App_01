package com.demo.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendEmail(String to,String subject,String message) {
	    SimpleMailMessage smm=new SimpleMailMessage();
	    smm.setTo(to);
	    smm.setSubject(subject);
	    smm.setText(message);
	    javaMailSender.send(smm);
	}
}
