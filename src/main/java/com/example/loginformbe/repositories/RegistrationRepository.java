package com.example.loginformbe.repositories;

import com.example.loginformbe.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationRepository extends CrudRepository<Users, Long> {

}
