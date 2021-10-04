package pl.com.mcsystems.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.com.mcsystems.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}