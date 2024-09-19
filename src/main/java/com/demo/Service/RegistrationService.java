    package com.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.Entity.Registration;
import com.demo.Repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository regReppopsitory;
	
	public void addRegistration(Registration registration) {
		regReppopsitory.save(registration);
	}
	
	public List<Registration> getRegistrations() {
		List<Registration> registrations = regReppopsitory.findAll();
		return registrations;
	}
	
	public void deleteRecord(@RequestParam("id") long id) {
		regReppopsitory.deleteById(id);
	}
	public Registration getRecord(long id) {
		Optional<Registration> byId = regReppopsitory.findById(id);
		if (byId.isPresent()) {
			Registration registration = byId.get();
			return registration;
		}
		 return null;		
	}
	public void updateRecord(Registration registration) {
		regReppopsitory.save(registration);
	}
}
