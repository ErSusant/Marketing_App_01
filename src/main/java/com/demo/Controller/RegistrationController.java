      package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.Dto.RegistrationDto;
import com.demo.Entity.Registration;
import com.demo.Service.RegistrationService;
import com.demo.Util.EmailService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService regService;
	
	@Autowired
	private EmailService emailService;
	
	//http://localhost:8080/ViewPage
     @RequestMapping("/ViewPage")
	public String viewRegistration() {
		return "addReg";
	}     
//     @RequestMapping("/SaveReg")
//     public String addRegistrtion(Registration registration,ModelMap model) {
//    	 regService.addRegistration(registration);
//    	 model.addAttribute("msg","Record is Saved");
//    	 return"addReg";
//     }
//     @RequestMapping("/SaveReg")
//     public String addRegistration(
//    		 @RequestParam("name")String Name,
//    		 @RequestParam("email")String Email,
//    		 @RequestParam("mobile")long Mobile,
//    		 Model model
//    		 ) {
//    	 Registration reg=new Registration();
//    	 reg.setName(Name);
//    	 reg.setEmail(Email);
//    	 reg.setMobile(Mobile);
//    	 regService.addRegistration(reg);
//    	 model.addAttribute("msg","Record is Saved !!");
//    	 return"addReg";
//     }
     //http://localhost:8080/getAll
     @RequestMapping("/SaveReg")
     public String addRegistrtion(@ModelAttribute RegistrationDto registrationDto,ModelMap model) {
    	  Registration registration=new Registration();
    	  registration.setName(registrationDto.getName());
    	  registration.setEmail(registrationDto.getEmail());
    	  registration.setMobile(registrationDto.getMobile());
       	  regService.addRegistration(registration);
       	  emailService.sendEmail(registration.getEmail(), "Text Message", "	Welcome to goa & enjoy !!");
    	  model.addAttribute("msg","Record Is Saved");
    	  return"addReg";
     }
     @RequestMapping("/getAll")
     public String getRegistrtions(ModelMap model) {
    	 List<Registration>registrations=regService.getRegistrations();
    	 model.addAttribute("registrations",registrations);
    	 return"getRegistrations";
     }
     @RequestMapping("/delete")
     public String deleteRecord(long id,ModelMap model) {
    	  regService.deleteRecord(id);
    	 List<Registration>registrations=regService.getRegistrations();   	 
    	 model.addAttribute("registrations",registrations);
    	 return"getRegistrations"; 
     }
     @RequestMapping("/getRecord")
     public String getRecord(@RequestParam long id,ModelMap model) {
    	 Registration registration = regService.getRecord(id);
    	 model.addAttribute("registration",registration);
    	 return "Update";
     }
     @RequestMapping("/update")
     public String updateRecord(RegistrationDto dto,ModelMap model) {
    	 Registration registration =new Registration();
    	 registration.setId(dto.getId());
    	 registration.setName(dto.getName());
    	 registration.setEmail(dto.getEmail());
    	 registration.setMobile(dto.getMobile());
    	 regService.updateRecord(registration);
    	 List<Registration>registrations=regService.getRegistrations();   	 
    	 model.addAttribute("registrations",registrations);
    	 return"getRegistrations"; 
     }
}
