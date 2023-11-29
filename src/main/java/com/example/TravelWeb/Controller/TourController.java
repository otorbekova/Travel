package com.example.TravelWeb.Controller;

import com.example.TravelWeb.Models.tour;
import com.example.TravelWeb.Servers.TourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;

@Controller
@RequestMapping("/indexmain")
public class TourController {
    private final TourService service;

    @Autowired
    public TourController(TourService service) {
        this.service = service;
    }

    @GetMapping()
    public String OLP(@RequestParam(defaultValue = "0") int page,
                      @RequestParam(defaultValue = "2") int size,
                      Model model){
    //model.addAttribute("keyMain",service.findPagination(page,size));
        Page<tour> yourEntityPage = service.findPagination(page, size);
        model.addAttribute("keyMain", yourEntityPage);
        return "Main/mainPage";
    }


    @GetMapping("/{id}")
    public String showid(@PathVariable("id") int id,Model model) {
        model.addAttribute("keyid",service.findId(id));
        return "Main/showId";
    }


//    @GetMapping("/admin")
////    public String adminMain(Model model){
////        model.addAttribute("keyAdmin",service.findAll());
////        return "Ed/index";
////    }
}
//    @GetMapping("/{filename}/update")
//    public String findOne(@PathVariable("filename")String filename, Model model){
//        model.addAttribute("key",service.findname(filename));
//        return "one";