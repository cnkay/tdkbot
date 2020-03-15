package com.example.demo.DB;

import com.example.demo.Entity.Anlam;
import com.example.demo.Entity.Kelime;
import com.example.demo.Entity.Yazar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KelimeDAO extends JpaRepository<Kelime,Long> {

}
