package com.example.TP1.APP1.respository;

import com.example.TP1.APP1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User , Long> {}


