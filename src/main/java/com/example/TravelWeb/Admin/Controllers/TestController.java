package com.example.TravelWeb.Admin.Controllers;


import com.example.TravelWeb.Admin.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class TestController {

    private final TestService service;

    @Autowired
    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping("/mainin")
    public String ma(){
        return "Admin/main";
    }

    @GetMapping("/out")
    public String out(){
        return "Admin/ts";
    }

    @GetMapping("/")
    public String home(Model model) {
        // Получение списка изображений из базы данных
        model.addAttribute("images", service.getAllImages());
        return "index";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            // Сохранение изображения
            service.saveImage(file);
        } catch (IOException e) {
            // Обработка ошибки, если не удается сохранить изображение
            e.printStackTrace();
        }
        // Перенаправление на главную страницу
        return "redirect:/";
    }
    @GetMapping("/{filename}/update")
public String findOne(@PathVariable ("filename")String filename,Model model){
        model.addAttribute("key",service.findname(filename));
        return "one";
}
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id) {
//        model.addAttribute("book", booksService.findOne(id));
//        return "books/edit";
//    }


    @PostMapping("/{filename}")
    public String updateImage(@PathVariable String filename, @RequestParam("file") MultipartFile file) {
        try {
            // Обновление изображения
            service.updateImage(filename, file);
            return "redirect:/";
        } catch (IOException e) {
            // Обработка ошибки, если не удается обновить изображение
            e.printStackTrace();
        }
        // Перенаправление на главную страницу
        return "redirect:/";
    }
}
