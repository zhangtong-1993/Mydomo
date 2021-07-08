package My.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class myController {

    @PostMapping("/My/scc")
    @ResponseBody
    public String MyDemo(){
        return "MyDemo"+"hello Word";
    }
}
