package com.dm.config.mybatis;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by 淡漠Vip on 2018/7/18.
 * Email: itdreamlmc@163.com
 */
@Configuration
public class MybatisConfig {

    @Autowired
    private DataSource dataSource;


    /**
     * 创建sqlSessionFactory实例
     *
     * @return
     */
    @Bean(name = "singleSqlSessionFactory")
    @Primary
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //设置mybatis configuration 扫描路径
        //sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("spring"));
        sqlSessionFactoryBean.setDataSource(dataSource);

        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources("mappers"));
        return sqlSessionFactoryBean;
    }


}
