package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MpConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mpIntance = new MybatisPlusInterceptor();
        mpIntance.addInnerInterceptor(new PaginationInnerInterceptor());
        mpIntance.addInnerInterceptor(new OptimisticLockerInnerInterceptor());

        return mpIntance;
    }

}
