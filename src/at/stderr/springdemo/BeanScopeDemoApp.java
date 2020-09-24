package at.stderr.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
			
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if this are the same  beans
		boolean result = (theCoach == alphaCoach);
		
		//print out result
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		context.close();
	}
}
