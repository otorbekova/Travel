//package com.example.TravelWeb.Servers;
//
//import com.example.TravelWeb.Models.Users;
//import com.example.TravelWeb.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UsuallyUserServer {
//private final UserRepository repository;
//    private final PasswordEncoder encoder;
//@Autowired
//    public UsuallyUserServer(UserRepository repository, PasswordEncoder encoder) {
//        this.repository = repository;
//    this.encoder = encoder;
//}
//
//    public List<Users>findAll(){
//    return repository.findAll();
//    }
//
//    public void save(Users users){
//        users.setPassword(encoder.encode(users.getPassword()));
//        users.setRole("ROLE_USER");
//    repository.save(users);
//    }
//}
