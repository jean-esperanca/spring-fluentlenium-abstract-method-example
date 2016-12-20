package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StaticController {

    @RequestMapping({
            "/{path:[^\\.]*}",
            "/{path:[^\\.]*}/{path:[^\\.]*}",
            "/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}",
            "/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}",
            "/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}",
            "/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}",
            "/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}/{path:[^\\.]*}",
    })
    public String redirect(HttpServletRequest request) {
        System.out.println(request.getAttribute( HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE ));
        System.out.println("This route hit");
        return "forward:/";
    }

}
