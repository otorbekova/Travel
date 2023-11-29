package com.example.TravelWeb.Admin.Service;

import com.example.TravelWeb.Admin.Repository.TestRepository;
import com.example.TravelWeb.Admin.models.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Service
public class TestService {
  //@Data("${file.upload.directory}")
 // @Data(staticConstructor = "${file.upload.directory}")
    private String uploadDirectory;
    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
    public List<Test> getAllImages() {
        // Реализация получения всех изображений из базы данных
        return testRepository.findAll();
    }

//    public void save(Person person) {
//        peopleRepository.save(person);
//    }
    public void saveImage(MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        String filepath = "C:\\Users\\MMF\\IdeaProjects\\TravelWeb\\src\\main\\resources\\static\\images\\" + filename;
//C:\Users\MMF\IdeaProjects\TravelWeb\src\main\resources\static\images\club.jpg
        // Сохраняем в базу данных
        Test imageEntity = new Test();
        imageEntity.setFilename(filename);
        imageEntity.setFilepath(filepath);
        testRepository.save(imageEntity);

        // Сохраняем файл на диск
        Path filePath = Paths.get(filepath);
        Files.write(filePath, file.getBytes());
    }


public Test findname(String name){
        return testRepository.findByFilename(name).orElse(null);
}
    public void updateImage(String existingFilename, MultipartFile newFile) throws IOException {
        String filepath = "C:\\Users\\MMF\\IdeaProjects\\TravelWeb\\src\\main\\resources\\static\\images\\";
        String existingFilePath = filepath + existingFilename;


        Path existingPath = Paths.get(existingFilePath);
        if (Files.exists(existingPath)) {
            String newFilePath = filepath + newFile.getOriginalFilename();
            Path newFilePathObject = Paths.get(newFilePath);
            Files.write(newFilePathObject, newFile.getBytes());
           Files.deleteIfExists(existingPath);

            Files.move(newFilePathObject, existingPath, StandardCopyOption.REPLACE_EXISTING);
        } else {
            throw new FileNotFoundException("Файл не найден: " + existingFilename);
        }
    }
}
