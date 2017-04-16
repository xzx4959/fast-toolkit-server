package com.toolkit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <p></p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/16 6:40
 */
@Configuration
@ComponentScan(basePackages = {"com.toolkit"},excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class ToolkitRootConfig {
}
