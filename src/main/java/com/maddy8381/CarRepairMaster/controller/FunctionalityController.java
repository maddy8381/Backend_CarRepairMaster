package com.maddy8381.CarRepairMaster.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maddy8381.CarRepairMaster.model.SampleClass;
 
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FunctionalityController {
  SampleClass objSample;
  
  @RequestMapping("/contact-us")
  public SampleClass getString() {
    objSample = new SampleClass();
    objSample.setStr("This is from Backend");
    objSample.setNo(1);
    return objSample;
    
  }
}