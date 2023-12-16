package org.zerock.b01.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CustomServletConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:static/fonts/");
        registry.addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:static/fonts/");
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:static/css/");
        registry.addResourceHandler("/assets/**")
                .addResourceLocations("classpath:static/assets/");

        //SwaggerUi가 적용되면서 정적 파일의 경로가 달라졌기 때문에
        //CustomServletConfig로 Web-MvcConfigurer 인터페이스를 구현하도록 하고 addRe-sourceHandlers를 재정의해서 수정한다.
    }
}
