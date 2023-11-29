//package com.example.TravelWeb.Security;
//
//import com.example.TravelWeb.Models.Users;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Collections;
//
//public class UserDetailsS implements UserDetails {
//    private final Users myuser;
//
//    public UserDetailsS(Users myuser) {
//        this.myuser = myuser;
//    }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.singletonList(new SimpleGrantedAuthority(myuser.getRole()));
//
//    }
//
//    @Override
//    public String getPassword() {
//        return myuser.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return myuser.getNameuser();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    public Users getUser() {
//        return this.myuser;
//    }
//}
