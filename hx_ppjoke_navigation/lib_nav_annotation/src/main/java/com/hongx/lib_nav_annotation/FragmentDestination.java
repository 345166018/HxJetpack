package com.hongx.lib_nav_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface FragmentDestination {
    String pageUrl();

    boolean needLogin() default false;

    boolean asStarter() default false;
}
