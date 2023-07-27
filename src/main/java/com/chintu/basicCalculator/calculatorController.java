package com.chintu.basicCalculator;

import com.chintu.Evaluation.ExpEvaluate;
import com.chintu.Evaluation.inpStringEvaluate;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class calculatorController {

    @Autowired
    ExpEvaluate eval;
    @RequestMapping(value="/startPage", method = RequestMethod.GET)
    public String startPage(){
        return "Calculator";
    }
    @RequestMapping(value="/calculate",method = RequestMethod.POST)
    public ResponseEntity<String> calculate(@RequestBody Map<String,String> reqBody){
        eval.setExpression(reqBody.get("expression"));
        String response = eval.evaluate();
        System.out.println(response);

        return ResponseEntity.ok(response);
    }
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String errorPage(){
        return "error";
    }
}
