package com.example.TravelWeb.Repository;

import com.example.TravelWeb.Models.tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourRepository extends JpaRepository<tour,Integer> {
    Optional<tour>findByPhotoName(String photoName);

}
