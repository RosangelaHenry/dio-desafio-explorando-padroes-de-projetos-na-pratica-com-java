package com.desafio_dio_springboot.userdepto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.desafio_dio_springboot.userdepto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
