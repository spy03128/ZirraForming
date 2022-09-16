package com.ssafy.server.config;

import com.ssafy.server.config.properties.AppProperties;
import com.ssafy.server.config.properties.CorsProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@EnableConfigurationProperties({
        CorsProperties.class,
        AppProperties.class
})
@Configuration
public class JpaConfig {
}
