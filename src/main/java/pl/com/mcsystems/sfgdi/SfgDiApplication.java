package pl.com.mcsystems.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.com.mcsystems.sfgdi.controllers.ConstructorInjectedController;
import pl.com.mcsystems.sfgdi.controllers.MyController;
import pl.com.mcsystems.sfgdi.controllers.PropertyInjectedController;
import pl.com.mcsystems.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-------------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-------------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreetings());

		System.out.println("-------------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreetings());

		System.out.println("-------------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreetings());
	}

}
