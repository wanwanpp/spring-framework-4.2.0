package com.wp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 王萍 on 2017/11/2 0002.
 */

@Controller
public class IndexCrol {

    @RequestMapping("index")
    public String getIndex(){
        return "index";
    }

}
