package log.aop.controller;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Late-en
 */

@Slf4j
@RestController
public class TestController {
    @GetMapping("/getTest")
    public Dict getTest(String who){
        return Dict.create().set("who", StrUtil.isBlank(who) ? "me" : who);
    }

    @PostMapping("/postTest")
    public Dict postTest(@RequestBody Map<String, Object> map){
        final String jsonStr = JSONUtil.toJsonStr(map);
        log.info(jsonStr);
        return Dict.create().set("json", map);
    }
}
