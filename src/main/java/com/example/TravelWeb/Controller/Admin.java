package com.example.TravelWeb.Controller;

import com.example.TravelWeb.Servers.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class Admin {
    private final TourService service;

    @Autowired
    public Admin(TourService service) {
        this.service = service;
    }

    @GetMapping()
    public String adminMain(Model model){
        model.addAttribute("keyAdmin",service.findAll());
        return "Ed/index";
    }

    @GetMapping("/{id}")
    public String Showid(@PathVariable("id") int id, Model model) {
        model.addAttribute("keyid",service.findId(id));
        return "";
    }

    @RequestMapping(value="/admin/{id}", method= RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/admin";
    }
}
