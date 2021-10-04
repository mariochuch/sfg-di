package pl.com.mcsystems.sfgdi.controllers;

import pl.com.mcsystems.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreetings() {
        return greetingService.sayGreeting();
    }
}
