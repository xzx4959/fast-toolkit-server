package com.toolkit.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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
}
