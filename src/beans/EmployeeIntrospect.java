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
public class EmployeeIntrospect {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        Class emp = Class.forName("beans.Employee");
        BeanInfo bean = Introspector.getBeanInfo(emp);
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
