//package com.example.TravelWeb.Valid;
//
//import com.example.TravelWeb.Models.Users;
//import com.example.TravelWeb.Servers.UserServer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//
//@Component
//public class UserValidator implements Validator {
//    private final UserServer server;
//
//    @Autowired
//    public UserValidator(UserServer userRepository) {
//        this.server = userRepository;
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return Users.class.equals(aClass);
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//        Users models= (Users) o;
//        try {
//            server.loadUserByUsername(models.getNameuser());
//        }catch (UsernameNotFoundException ignor){
//            return;
//        }
//        errors.rejectValue("username","","Такой пользователь уже существует");
//
//    }
//
///*
//    @Override
//    public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
//        return null;
//    }
//
//    @Override
//    public <T> Set<ConstraintViolation<T>> validateProperty(T object, String propertyName, Class<?>... groups) {
//        return null;
//    }
//
//    @Override
//    public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
//        return null;
//    }
//
//    @Override
//    public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
//        return null;
//    }
//
//    @Override
//    public <T> T unwrap(Class<T> type) {
//        return null;
//    }
//
//    @Override
//    public ExecutableValidator forExecutables() {
//        return null;
//    }*/
//
//
//}
