/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

/**
 *
 * @author c3
 */
public class StudentIntrospect {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        Class stud = Class.forName("beans.Student");
        BeanInfo bean = Introspector.getBeanInfo(stud);
        PropertyDescriptor[] propertyDescriptors = bean.getPropertyDescriptors();
        System.out.println("Properties : ");
        for (PropertyDescriptor pd : propertyDescriptors) {
            System.out.println(pd.getName());
        }
        MethodDescriptor[] methodDescriptors = bean.getMethodDescriptors();
        System.out.println("\n\n\nMethods : ");
        for (MethodDescriptor md : methodDescriptors) {
            System.out.println(md.getName());
        }
    }
}
