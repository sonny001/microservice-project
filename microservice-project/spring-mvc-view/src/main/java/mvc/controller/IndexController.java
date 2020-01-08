package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program microservice-project
 * @description: ceshi
 * @author: sonny
 * @create: 2019/12/29 18:50
 */
@Controller
public class IndexController {

    @GetMapping({"/",""})
    public String index(Model model){
        return "index";
    }
}
