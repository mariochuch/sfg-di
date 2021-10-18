package pl.com.mcsystems.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18mService")
public class I18nSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
