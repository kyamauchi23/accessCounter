package com.ffg.accessCounter.controller;

import com.ffg.accessCounter.service.CountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AccessCounterController {

    @Autowired
    CountServiceImpl countService;

    @GetMapping
    private ModelAndView returnAccessCounter(ModelAndView mav){
        int accessCount = countService.returnAccessCounter(1);
        countService.addAccessCounter(1);

        mav.addObject("accessCount",accessCount);
        mav.setViewName("/counter.html");
        return mav;
    }
}
