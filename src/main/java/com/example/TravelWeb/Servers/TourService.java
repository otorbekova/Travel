package com.example.TravelWeb.Servers;


import com.example.TravelWeb.Admin.models.Test;
import com.example.TravelWeb.Repository.TourRepository;

import com.example.TravelWeb.Models.tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TourService {

    private final TourRepository repository;

    @Autowired
    public TourService(TourRepository repository) {
        this.repository = repository;
    }

    public List<tour> findAll() {
        return repository.findAll();
    }

    public tour findId(int id){
        Optional<tour> optional=repository.findById(id);
        return optional.orElse(null);
    }



//   public List<tour> findPagination(Integer page, Integer pepage){
//        return repository.findAll(PageRequest.of(page,pepage)).getContent();
//    }
    public Page<tour> findPagination(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }
//    public void save(Person person) {
//        peopleRepository.save(person);
//    }

    public void save(tour t,MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        String filepath = "C:\\Users\\MMF\\IdeaProjects\\TravelWeb\\src\\main\\resources\\static\\images\\" + filename;
//C:\Users\MMF\IdeaProjects\TravelWeb\src\main\resources\static\images\club.jpg
        // Сохраняем в базу данных
       // tour tNew = new tour();
        t.setPhotoName(filename);
        t.setPath(filepath);
        repository.save(t);

        Path filePath = Paths.get(filepath);
        Files.write(filePath, file.getBytes());
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
