package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greetings;
import com.example.demo.model.QGreetings;
import com.example.demo.repository.GreetingsRepository;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {
	@Autowired
	GreetingsRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Greetings> findAll() {
		return repository.findAll();
	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public List<Greetings> findGreetings(@RequestParam String text) {
		return repository.findByTextstyle(text);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Greetings findGreetings(@PathVariable Integer id) {
		return repository.findOne(id);
	}

	@RequestMapping(value = "/newsearch", method = RequestMethod.GET)
	public Iterable<Greetings> getBuildPipelineBySearchCriteria(
			@QuerydslPredicate(root = Greetings.class) Predicate predicate) {
		BooleanExpression exp = QGreetings.greetings.fontsize.eq(new Integer(10));
		predicate = exp.and(predicate);
		return repository.findAll(predicate);
	}

}
