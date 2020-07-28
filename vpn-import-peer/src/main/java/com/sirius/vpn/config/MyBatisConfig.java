package com.sirius.vpn.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.sirius.vpn.mapper","com.sirius.vpn.dao"})
public class MyBatisConfig {
}
