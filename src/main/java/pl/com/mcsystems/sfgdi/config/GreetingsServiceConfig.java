package pl.com.mcsystems.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.com.mcsystems.sfgdi.services.ConstructorGreetingService;
import pl.com.mcsystems.sfgdi.services.PropertyInjectedGreetingService;
import pl.com.mcsystems.sfgdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetingsServiceConfig {
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
