package ac.ks.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "helloworld";
    }
}
