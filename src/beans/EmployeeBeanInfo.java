/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c3
 */
public class EmployeeBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor pd1 = new PropertyDescriptor("empId", Employee.class);
            PropertyDescriptor pd2 = new PropertyDescriptor("name", Employee.class);
            PropertyDescriptor pd3 = new PropertyDescriptor("address", Employee.class);
            PropertyDescriptor pd4 = new PropertyDescriptor("salary", Employee.class);
            return new PropertyDescriptor[]{pd1, pd2, pd3, pd4};
        } catch (IntrospectionException e) {
            Logger.getLogger(EmployeeBeanInfo.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        try {
            MethodDescriptor md1 = new MethodDescriptor(Employee.class.getMethod("getEmpId"));
            MethodDescriptor md2 = new MethodDescriptor(Employee.class.getMethod("setName", String.class));
            MethodDescriptor md3 = new MethodDescriptor(Employee.class.getMethod("getAddress"));
            MethodDescriptor md4 = new MethodDescriptor(Employee.class.getMethod("setSalary", float.class));
            MethodDescriptor md5 = new MethodDescriptor(Employee.class.getMethod("abc", int.class, int.class, int.class));
            return new MethodDescriptor[]{md1, md2, md3, md4, md5};
        } catch (NoSuchMethodException e) {
            Logger.getLogger(EmployeeBeanInfo.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
