package exceptionHandler.controller;

import exceptionHandler.constant.Status;
import exceptionHandler.exception.JsonException;
import exceptionHandler.exception.PageException;
import exceptionHandler.model.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Late-en
 */

@Controller
public class TestController {
    @GetMapping("/json")
    public ApiResponse JsonException(){
        throw new JsonException(Status.UNKNOWN_ERROR);
    }

    @GetMapping("/page")
    public ModelAndView PageException(){
        throw new PageException(Status.UNKNOWN_ERROR);
    }
}
