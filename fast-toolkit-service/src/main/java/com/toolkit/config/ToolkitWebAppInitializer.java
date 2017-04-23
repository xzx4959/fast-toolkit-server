package com.toolkit.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.MultipartConfig;

/**
 * <p>配置DispatcherServlet</p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/16 6:37
 */
public class ToolkitWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ToolkitRootConfig.class};
    }

    /**
     * 指定配置类
     *
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ToolkitWebConfig.class};
    }

    /**
     * 将DispatcherServlet映射到"/"
     *
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 处理文件上传，设置默认的上传目录
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("upload_file"));
    }
}
