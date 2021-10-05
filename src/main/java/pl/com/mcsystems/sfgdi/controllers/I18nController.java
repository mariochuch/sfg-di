package pl.com.mcsystems.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.com.mcsystems.sfgdi.services.GreetingService;

@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18mService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
