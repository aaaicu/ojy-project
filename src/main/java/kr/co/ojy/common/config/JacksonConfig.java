package kr.co.ojy.common.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.ojy.common.jackson.LocalDateModule;
import kr.co.ojy.common.jackson.LocalDateTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper objectMapper() {
        Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder();
        jackson2ObjectMapperBuilder.modules(new LocalDateTimeModule(), new LocalDateModule()).serializationInclusion(JsonInclude.Include.NON_NULL).build();

        return jackson2ObjectMapperBuilder.build();

    }
}
