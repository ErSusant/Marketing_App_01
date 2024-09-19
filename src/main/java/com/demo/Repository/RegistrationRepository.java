package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long>{

}
