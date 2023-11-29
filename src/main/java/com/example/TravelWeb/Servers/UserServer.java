//package com.example.TravelWeb.Servers;
//
//import com.example.TravelWeb.Models.Users;
//import com.example.TravelWeb.Repository.UserRepository;
//import com.example.TravelWeb.Security.UserDetailsS;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserServer implements UserDetailsService {
//    private final UserRepository myuser;
//    @Autowired
//    public UserServer(UserRepository myuser) {
//        this.myuser = myuser;
//    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<Users> optionalUserModels =myuser.findUsersByNameuser(username);
//        if(optionalUserModels.isEmpty()) {
//            throw new UsernameNotFoundException(
//                    "User not found!");
//        }
//        return new UserDetailsS(optionalUserModels.get()) {
//        };
//    }
//}
