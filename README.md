# SpringMVCStudydemo1
该仓库会以分支的形式展示各个阶段的springMVC练习代码
1.master
  a.使用的handlermapping为BeanNameUrlHandlerMapping
  b.handlerAdapter为SimpleControllerHandlerAdapter
  c.viewResolver为InternalResourceViewResolver
  
  它们的限制如下：
  a.处理器Controller在IOC时，必须将id设置为URL，即注解方式的requestMapping
  b.限制controller必须实现org.springframework.web.servlet.mvc.Controller接口
  c.配置了param：viewClass,为org.springframework.web.servlet.view.JstlView，表示jsp页面要使用jstl标签
  
  坑：
  1.dispatcher的配置文件默认是在WEB-INF下加载，如果要更换路径，必须在web.xml中配置servlet时加入contextConfigLocation参数配置
  2.applicationContext.xml是spring的默认加载配置文件，默认也是在WEB-INF下加载，需要更改就要在web.xml中配置
    Listener:contextLoaderListener
    context-param:contextConfigLocation
    
  3.一定要将jsp页面设置为isELIgnored=false才能用${}显示model数据
  
