package IOC.IOC_Annotated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import IOC.IOC_Annotated.Captain.ODI;
import IOC.IOC_Annotated.Captain.T20;
import IOC.IOC_Annotated.Captain.Test;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		ODI o =(ODI)ac.getBean("ODI");
		T20 t20 = (T20)ac.getBean("t20");
		Test t = (Test)ac.getBean("test");
		
		o.disp();
		t20.disp();
		t.disp();
		
		
		
	}
}
