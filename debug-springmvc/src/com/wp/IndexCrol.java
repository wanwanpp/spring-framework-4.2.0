package com.wp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 王萍 on 2017/11/2 0002.
 */

@Controller
public class IndexCrol {

    @RequestMapping("")
//    @ResponseBody
    public String getIndex(ModelAndView modelAndView) {
        System.out.println("in");
        return "index";
    }

}
