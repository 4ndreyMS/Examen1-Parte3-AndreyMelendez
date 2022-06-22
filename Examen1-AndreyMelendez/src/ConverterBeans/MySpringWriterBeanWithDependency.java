package ConverterBeans;

import Converter.ConvertInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class MySpringWriterBeanWithDependency {
    //objeto de la interfaz
    ConvertInterface convertInterface;

    @Autowired
    public void setConverter(ConvertInterface iConvert){
        this.convertInterface = iConvert;
    }

    public void readDecimal(int pDecimal){
        System.out.println("Your decimal decimal number converted is: "+convertInterface.fromDecimal(pDecimal));
    }

    public void readNoDecimal(String pNoDecimal){
        System.out.println("Your number converted to decimal is: "+convertInterface.toDecimal(pNoDecimal));
    }
}
