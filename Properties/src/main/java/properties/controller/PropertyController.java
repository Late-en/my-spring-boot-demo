package properties.controller;

import cn.hutool.core.lang.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import properties.property.ApplicationProperty;
import properties.property.DeveloperProperty;

/**
 * @author Late-en
 */

@RestController
public class PropertyController {
    private ApplicationProperty appProperty;
    private DeveloperProperty devProperty;

    @Autowired
    public PropertyController(ApplicationProperty appProperty, DeveloperProperty devProperty){
        this.appProperty = appProperty;
        this.devProperty = devProperty;
    }

    @GetMapping("/property")
    public Dict getProperty(){
        return Dict.create().set("appProperty",appProperty).set("devProperty",devProperty);
    }
}
