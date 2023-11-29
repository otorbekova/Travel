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
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//
//@Configuration
//@EnableWebSecurity
//public class Config {//extends WebSecurityConfigurerAdapter {
//    private final UserServer providor;
//
//    @Autowired
//    public Config(UserServer providor) {
//        this.providor = providor;
//    }
//
//    //    @Bean
////    public Config(UserServer providor) {
////        this.providor = providor;
////    }
////    public BCryptPasswordEncoder userServer() {
////        return new BCryptPasswordEncoder();
////    }
//   @Bean
//    public SecurityFilterChain filterChain(ServerHttpSecurity http)  {
//       http  .authorizeExchange(exchanges ->
//               exchanges
//                       .pathMatchers("/blog/**").permitAll()
//                       .anyExchange().authenticated()
//       )    .httpBasic(withDefaults())
//               .formLogin(formLogin ->
//                       formLogin
//                               .loginPage("/login")
//               );
//   return (SecurityFilterChain) http.build();
//
//    }
//
//  @Bean
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(providor)
//                .passwordEncoder(getPasswordEncoder());
//    }
////@Bean
////protected WebSecurityCustomizer webSecurityCustomizer() throws Exception {
////        return (web) web.ignoring(); userDetailsService(providor)
////                .passwordEncoder(getPasswordEncoder());
////    }
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
