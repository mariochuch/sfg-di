package pl.com.mcsystems.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.com.mcsystems.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}