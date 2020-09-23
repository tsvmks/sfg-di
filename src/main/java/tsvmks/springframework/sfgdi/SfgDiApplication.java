package tsvmks.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tsvmks.springframework.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		String s = controller.sayHello();

		System.out.println("------Property");

		I18nController i18nController = (I18nController)context.getBean("i18nController");
		i18nController.sayHello();

		System.out.println(s);

		System.out.println("------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
