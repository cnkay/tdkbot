package com.example.demo.DB;

import com.example.demo.Entity.Yazar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YazarDAO extends JpaRepository<Yazar,Long> {
    Yazar findByTamAd(String tamAd);
    Boolean existsYazarByTamAd(String tamAd);
}
