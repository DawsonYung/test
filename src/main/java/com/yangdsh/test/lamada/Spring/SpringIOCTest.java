package com.yangdsh.test.lamada.Spring;

/**
 * Spring框架管理Bean的时候,非常精确.Bean的生成过程中有11个步骤.11个步骤才构成了Bean的完整的生命周期.

 1.instantiate bean对象实例化
 2.populate properties 封装属性
 3.如果Bean实现BeanNameAware 执行 setBeanName
 4.如果Bean实现BeanFactoryAware 或者 ApplicationContextAware 设置工厂 setBeanFactory 或者上下文对象 setApplicationContext
 5.如果存在类实现 BeanPostProcessor（后处理Bean） ，执行postProcessBeforeInitialization
 6.如果Bean实现InitializingBean 执行 afterPropertiesSet
 7.调用<bean init-method="init"> 指定初始化方法 init
 8.如果存在类实现 BeanPostProcessor（处理Bean） ，执行postProcessAfterInitialization
 9.执行业务处理
 10.如果Bean实现 DisposableBean 执行 destroy
 11.调用<bean destroy-method="customerDestroy"> 指定销毁方法 customerDestroy

 * 第三步和第四部为了让Bean了解Spring的环境的..
 * 第五步和第八部是实现了一个接口BeanPostProcessor.

 */
public class SpringIOCTest {
    //@Component   让Spring容器管理当前的Bean

}