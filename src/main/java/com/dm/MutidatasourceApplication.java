package com.dm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.dm.mapper")
@SpringBootApplication
public class MutidatasourceApplication {

	public static void main(String[] args) {

		SpringApplication.run(MutidatasourceApplication.class, args);
	}
}
