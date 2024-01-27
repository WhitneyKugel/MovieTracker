package com.whitneykugel.movietracker.service.config;/*
    Author: Whitney Kugel
    Date:     Purpose:
*/

import com.whitneykugel.movietracker.data.dao.MovieRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan(
		basePackageClasses = MovieRepository.class
)
public class ServiceModuleConfiguration {
}
