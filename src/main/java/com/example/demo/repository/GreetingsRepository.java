package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Greetings;

@Repository
public interface GreetingsRepository extends JpaRepository<Greetings, Integer>,  QueryDslPredicateExecutor<Greetings>{

	List<Greetings> findByText(String string);

	List<Greetings> findByTextstyle(String text);
	
	

}
