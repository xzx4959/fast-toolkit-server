package com.toolkit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/16 6:40
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.toolkit.web") //扫描com.toolkit.web包下带有@Controller注解的组件作为候选bean
public class ToolkitWebConfig extends WebMvcConfigurerAdapter {
    //配置html视图解析器
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views");
        resolver.setSuffix(".html");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    //配置静态资源的处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        //对静态资源的处理转发到Servlet容器中默认的servlet上而不使用DispatcherServlet本身来进行处理
        configurer.enable();
    }
    @Bean
    public MultipartResolver multipartResolver() throws IOException{
        return new StandardServletMultipartResolver();
    }
}
