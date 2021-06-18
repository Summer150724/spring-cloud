# Config
> spring cloud 2020 版本问题 不搞了

## application.yml&bootstrap.yml
- application.yml 用户级的资源配置项
- bootstrap.yml   系统级,优先级更高

***Spring Cloud会创建一个"Bootstrap Context", 
作为Spring应用的`Application Context`的`父上下文`.
 初始化的时候, Bootstrap Context负责从`外部源`加载配置属性
 并解析配置. 这两个上下文共享一个从外部获取的`Environment`***
 
 ***Bootstrap 属性有高优先级,默认情况下,它们不会被本地配置覆盖.
 `Bootstrap***
 
 
 