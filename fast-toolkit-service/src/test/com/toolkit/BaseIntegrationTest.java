package com.toolkit;

import com.toolkit.config.ToolkitWebAppInitializer;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xzx on 17/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ToolkitWebAppInitializer.class})
public interface BaseIntegrationTest {
}
