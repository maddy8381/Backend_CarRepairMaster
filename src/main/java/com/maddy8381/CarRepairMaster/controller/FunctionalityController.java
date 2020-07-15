package com.maddy8381.CarRepairMaster.controller;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maddy8381.CarRepairMaster.dao.ContactUsRepo;
import com.maddy8381.CarRepairMaster.dao.UsersRepo;
import com.maddy8381.CarRepairMaster.model.ContactUs;
import com.maddy8381.CarRepairMaster.model.Users;

 
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FunctionalityController {
  
  @Autowired
  UsersRepo uRepo;
  @Autowired
  ContactUsRepo contactUsRepoObj;
  
  Users uObj;
  
  @RequestMapping("/contact-us")
  public Users getUser() {
	  uObj = uRepo.findByUserId(1);
	  return uObj;
  }
  
  @PostMapping(path = "/save_contact_us_form_details", headers = {"content-type=application/json"}, consumes = "application/json", produces = "application/json")
	public void saveContactUSFromDetails(@RequestBody ContactUs contactUs) {
		System.out.println("In Save ContactUSForm***********");
		// if(ob != null)
		System.out.println(contactUs.getUserName() + " ---- " + contactUs.getUserEmail());
		//contactUsRepoObj.save(contactUs);
	}
}