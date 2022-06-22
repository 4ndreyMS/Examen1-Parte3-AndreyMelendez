package MainApp;

import ConverterBeans.MySpringWriterBeanWithDependency;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ApplicationContext context = new ClassPathXmlApplicationContext("file:Converter-xmls/beans.xml");
        BeanFactory factory = context;
        MySpringWriterBeanWithDependency test = (MySpringWriterBeanWithDependency)
                factory.getBean("MySpringWriterBeanWithDependency");

        System.out.println("** Welcome ** ");
        System.out.print("\nInsert a decimal number to convert: ");
        test.readDecimal(Integer.parseInt(in.readLine()));
        System.out.print("\nInsert a value to convert to decimal: ");
        test.readNoDecimal(in.readLine());

        System.out.print("\n** End of the program **");
    }
}