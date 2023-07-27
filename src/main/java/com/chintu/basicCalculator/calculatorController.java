package com.chintu.basicCalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class calculatorController {

    @RequestMapping(value="/startpage", method = RequestMethod.GET)
    public String startPage(){
        return "Calculator";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String errorPage(){
        return "error";
    }
}
