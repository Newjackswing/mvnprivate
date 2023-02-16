package com.example.mvnprivate.main.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/api/main")
public class RestControllerTest {

    @RequestMapping(value = "/test.do")
    @ResponseBody
    public ResponseEntity test(
            HttpServletRequest request,
            Model model,
            @RequestParam HashMap<String,Object> params
    ){
        List<String> list = new ArrayList<>();
        HashMap<String,Object> resultMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            list.add(i, "VAL : "+ i);
//            System.out.println(list.get(i));
            resultMap.put("VAL"+i, i+1);
        }
        model.addAttribute("list", list);
        return ResponseRest.getRestVoOKSuccess(request, "success", list) ;
//        return ResponseRest.getRestVoServerError(request, "fail") ;
//        return ResponseRest.getRestVoBadRequestError(request, "fail", list) ;
    }
}
