package com.toolkit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

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
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        return resolver;
    }

    //配置静态资源的处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        //对静态资源的处理转发到Servlet容器中默认的servlet上而不使用DispatcherServlet本身来进行处理
        configurer.enable();
    }

    //配置上传文件
    @Bean
    public MultipartResolver multipartResolver() throws IOException {
        return new StandardServletMultipartResolver();
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(MediaType.APPLICATION_JSON);
    }

    @Bean
    public ViewResolver cnViewResolver(ContentNegotiationManager cnm) {
        ContentNegotiatingViewResolver cnvr =
                new ContentNegotiatingViewResolver();
        cnvr.setContentNegotiationManager(cnm);
        return cnvr;
    }

    @Bean
    public ViewResolver beanNameViewResolver() {
        return new BeanNameViewResolver();
    }


}
