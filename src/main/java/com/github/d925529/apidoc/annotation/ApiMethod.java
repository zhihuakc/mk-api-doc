package com.github.d925529.apidoc.annotation;

/*-
 * #%L
 * ul-tron-api
 * %%
 * Copyright (C) 2017 mk
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 * #L%
 */

import com.github.d925529.apidoc.ApiHttpMethod;

import java.lang.annotation.*;

/**
 * 方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ApiMethod {
    /**
     * 名称
     *
     *
     */
    String title();

    /**
     * 详细描述
     *
     */
    String[] description() default "";

    /**
     * 路径
     *
     *
     */
    String path();

    /**
     * 方法
     *
     */
    ApiHttpMethod method();

    boolean disabled() default false;

    /**
     * 正常返回格式，即 {status : '',data :'',message}
     */
    boolean common() default true;

    /**
     * 版本号
     * @return
     */
    String version() default "";

    /**
     * 概要设计id
     * @return
     */
    String profile() default "";
}
