package com.example.demo.DB;

import com.example.demo.Entity.Ozellik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OzellikDAO extends JpaRepository<Ozellik,Long> {
    Ozellik findByTamAd(String tamAd);
    Boolean existsByTamAd(String tamAd);
}
