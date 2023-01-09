package com.fiquest.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiquest.demo.models.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {

}
