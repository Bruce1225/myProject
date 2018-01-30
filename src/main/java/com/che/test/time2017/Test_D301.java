package com.che.test.time2017;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import org.junit.Test;

import com.che.demo.time2017.D301_Person;

public class Test_D301 {
	
	//Javabean
	@Test
	public void test1() throws IntrospectionException{
		BeanInfo info = Introspector.getBeanInfo(D301_Person.class); //Introspector.getBeanInfo(D301_Person.class,Object.class) 去除Object的属性getClass()
		PropertyDescriptor[]  pds = info.getPropertyDescriptors();
		for(PropertyDescriptor pd : pds){
			System.out.println(pd.getName());
		}
	}

}
