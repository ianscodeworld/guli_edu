package com.example.service.EduService.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.service.EduService.mapper")
public class EduConfig {
}
