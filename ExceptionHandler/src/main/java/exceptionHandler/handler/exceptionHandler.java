package exceptionHandler.handler;

import exceptionHandler.exception.JsonException;
import exceptionHandler.exception.PageException;
import exceptionHandler.model.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Late-en
 */

//aop思想 全局异常处理
@ControllerAdvice
@Slf4j
public class exceptionHandler {
    private final String ERROR_PAGE_NAME = "error";

    @ExceptionHandler(value = JsonException.class)
    @ResponseBody
    public ApiResponse JsonErrorException(JsonException exception){
        log.error("【JsonException】:{}", exception.getMessage());
        return ApiResponse.ofException(exception);
    }

    @ExceptionHandler(value = PageException.class)
    public ModelAndView PageErrorException(PageException exception){
        log.error("【PageException】:{}", exception.getMessage());
        ModelAndView view = new ModelAndView();
        view.addObject("message", exception.getMessage());
        view.setViewName(ERROR_PAGE_NAME);
        return view;
    }
}
