package com.dly.explain.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dly.explain.base.Result;
import com.dly.explain.service.ExperienceService;

@RestController
@RequestMapping("api/experience")
public class ExperienceController {
	@Resource
	ExperienceService experienceService;
		@GetMapping
		public Result getExperienceCode() {
			return experienceService.getExperienceCode();
		}
}
