package com.wp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 王萍 on 2017/11/2 0002.
 */

@Controller
public class IndexCrol {

    @RequestMapping("/index/")
//    @ResponseBody
    public String getIndex(ModelAndView modelAndView) {
        System.out.println("in");
        return "index";
    }

    @RequestMapping("/param")
    @ResponseBody
    public String getParam(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        String result = "name is " + name + " and age is " + age;
        System.out.println(result);
        return result;
    }

    @RequestMapping("/header")
    public String getHeaderParams(@RequestHeader(value = "Accept") String[] accepts) {
        return null;
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    /**
     * @ModelAttribute修饰的方法先于其他方法前调用，该方法用于接收前台JSP页面传入的参数
     */
//    @ModelAttribute
//    public void userModel(String name, String password, ModelAndView mv) {
//        User user = new User();
//        user.setName(name);
//        user.setPassword(password);
//        mv.addObject("user", user);
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ModelAndView login(ModelAndView mv) {
//        User user = (User) mv.getModel().get("user");
//        return null;
//    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable("id") Integer id) {
        System.out.println("get" + id);
        return "/hello" + id;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String post(@PathVariable("id") Integer id) {
        System.out.println("post" + id);
        return "/hello";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String put(@PathVariable("id") Integer id) {
        System.out.println("put" + id);
        return "/hello";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") Integer id) {
        System.out.println("delete" + id);
        return "/hello";
    }
}
