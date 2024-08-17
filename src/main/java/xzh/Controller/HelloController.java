package xzh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("1")
    public String hello(){
        System.out.println("helloWorld");
        return "Hello";
    }


}
