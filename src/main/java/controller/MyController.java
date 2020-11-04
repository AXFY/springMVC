package controller;

import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;

/**
 * @author AXFY
 * @date 2020/11/4 16:01
 */
@Controller
public class MyController {

    @Autowired()
    @Qualifier("student")
    private Student test;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/ridict", method = RequestMethod.GET)
    public String ridict(){
        return "ridict";
    }

    @RequestMapping(value = "/text")
    public ModelAndView text(){
        return new ModelAndView((new RedirectView("../hello.jsp")));
    }
}
