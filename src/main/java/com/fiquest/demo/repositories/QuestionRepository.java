package com.fiquest.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiquest.demo.models.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
