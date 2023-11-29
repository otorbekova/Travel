package com.example.TravelWeb.Servers;

import com.example.TravelWeb.Repository.LevelRepository;
import com.example.TravelWeb.Models.LevelServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class LevelService {

    private final LevelRepository repository;

    @Autowired
    public LevelService(LevelRepository repository) {
        this.repository = repository;
    }

    public List<LevelServer> findAll() {
        return repository.findAll();
    }

    public LevelServer findOne(int id) {
        Optional<LevelServer> foundPerson = repository.findById(id);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void save(LevelServer person) {
        repository.save(person);
    }

    @Transactional
    public void update(int id, LevelServer updatedPerson) {
        updatedPerson.setIdLevel(id);
        repository.save(updatedPerson);
    }

    @Transactional
    public void delete(int id) {
        repository.deleteById(id);
    }

//    public Optional<LevelServer> getPersonByFullName(String fullName) {
//        return repository.findByFullName(fullName);
//    }

}
