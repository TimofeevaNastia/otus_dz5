package dz5.configSpring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.DirtiesContext;

@Configuration
@ComponentScan("dz5.Pages")
@PropertySource("classpath:config.properties")
@DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
public class Cfg {
}