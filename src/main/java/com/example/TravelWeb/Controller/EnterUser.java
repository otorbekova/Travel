//package com.example.TravelWeb.Controller;
//
//import com.example.TravelWeb.Models.Users;
//import com.example.TravelWeb.Servers.UsuallyUserServer;
//import com.example.TravelWeb.Valid.UserValidator;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/aut")
//public class EnterUser {
//    private final UsuallyUserServer server;
//    private final UserValidator valid;
//
//    @Autowired
//    public EnterUser(UsuallyUserServer server, UserValidator valid) {
//        this.server = server;
//        this.valid = valid;
//    }
//    @GetMapping("/login")
//    public String loginPage() {
//
//        return "Reg/login";
//    }
//
//    @GetMapping("/reg")
//    public String registrationPage(@ModelAttribute("keyPostReg") Users userModels) {
//        return "Reg/Regis";
//    }
//
//    @PostMapping("/reg")
//    public String enter(@ModelAttribute("keyPostReg") @Valid Users userModels,
//                        BindingResult bindingResult) {
//        valid.validate(userModels,bindingResult);
//        if (bindingResult.hasErrors()) {
//return "redirect:/aut/reg";
//        }
//      server.save(userModels);
//        return "redirect:/aut/login";
//    }
//}
////    @GetMapping("/regist")
////    public String registrationPage(@ModelAttribute("keyReg") UserModels userModels) {
////        return "aut/reg";
////    }
////
////    @PostMapping("/regist")
////    public String performRegistration(@ModelAttribute("keyReg") @Valid UserModels userModels,
////                                      BindingResult bindingResult) {
////        valid.validate(userModels,bindingResult);
////        if (bindingResult.hasErrors()) {
////            return "redirect:/auto/regist";
////        }
////        serverStandartUser.saveUser(userModels);
////        return "redirect:/aut/login";
////    }