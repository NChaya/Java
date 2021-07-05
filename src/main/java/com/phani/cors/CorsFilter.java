package com.phani.cors;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsFilter {

//	@Bean
//	public FilterRegistrationBean<Filter> corsFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
//		config.setAllowCredentials(true);
//		config.addAllowedOrigin("http://localhost:4200");
//		config.addAllowedHeader("*");
//		config.addAllowedMethod("*");
//		source.registerCorsConfiguration("/**", config);
//		CorsConfigurationSource source2 = (CorsConfigurationSource) source;
//		FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<Filter>(new org.springframework.web.filter.CorsFilter(source2));
//		bean.setOrder(0);
//		return bean;
//	}
}
