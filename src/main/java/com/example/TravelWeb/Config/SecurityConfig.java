//package com.example.TravelWeb.Config;
//
//import com.example.TravelWeb.Servers.UserServer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration //extends WebSecurityConfigurerAdapter
//@EnableWebSecurity
//public class SecurityConfig {//extends WebSecurityConfigurerAdapter {//extends WebSecurityConfigurerAdapter  {
//    private final UserServer server;
//
//    @Autowired
//    public SecurityConfig(UserServer server) {
//        this.server = server;
//    }
//
//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        return http
//                .authorizeExchange(exchanges ->
//                        exchanges
//                                .pathMatchers("/aut/login/","/aut/reg").permitAll()
//                                .anyExchange().authenticated()
//                )
//                .build();
//    }
//
////@Override
//protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(server)
//            .passwordEncoder(getPasswordEncoder());
//}
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//}
//
