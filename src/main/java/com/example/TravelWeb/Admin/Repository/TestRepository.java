package com.example.TravelWeb.Admin.Repository;

import com.example.TravelWeb.Admin.models.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test,Integer> {

    Optional<Test> findByFilename(String filename);
}
