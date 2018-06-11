module slalom.example.controller.spring {
	exports com.slalom.example.spring.controller;
	exports com.slalom.example.spring.model;

	requires slalom.example.usecase;
	requires slalom.example.domain;
	requires spring.beans;
	requires spring.web;
	requires jackson.annotations;
}
