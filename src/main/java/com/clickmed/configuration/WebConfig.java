package com.clickmed.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.clickmed.filter.AutenticacaoPorSessaoFilter;
import com.clickmed.filter.AutenticacaoPorSessaoInterceptor;

@Configuration
@ComponentScan("com.clickmed")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	@Bean
	public AutenticacaoPorSessaoFilter getAutenticacaoPorSessaoFilter() {
		return new AutenticacaoPorSessaoFilter();
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");

		registry.viewResolver(resolver);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("/");
//		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//		registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/");
//		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
//		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
//		registry.addResourceHandler("/vendors/**").addResourceLocations("/vendors/");
		
	}
}
