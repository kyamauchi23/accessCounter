package com.ffg.accesscounter.controller;

import com.ffg.accesscounter.service.CountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AccessCounterController {

    private final CountServiceImpl countService;

    public AccessCounterController(CountServiceImpl countService){
        this.countService=countService;
    }

    @GetMapping
    private ModelAndView returnAccessCounter(ModelAndView mav){
        int accessCount = countService.returnAccessCounter(1);
        countService.addAccessCounter(1);

        mav.addObject("accessCount",accessCount);
        mav.setViewName("/counter");
        return mav;
    }
}
