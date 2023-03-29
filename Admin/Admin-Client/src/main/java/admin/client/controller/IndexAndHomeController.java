package admin.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Late-en
 */

@RestController
public class IndexAndHomeController {
    @GetMapping("/index")
    public String index(){
        return "this is index page";
    }

    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }
}
