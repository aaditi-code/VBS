package com.vbs.demo.repositories;

import com.vbs.demo.models.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController

public interface HistoryRepo extends JpaRepository<History,Integer> {
}