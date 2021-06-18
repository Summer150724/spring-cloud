## Spring Cloud-Gateway
> 使用的Webflux中的reactor-netty响应式编程组件,底层使用了Netty通讯框架
### 一.特性
1. 动态路由: 能够匹配任何请求属性
2. 可以对路由指定Predicate(断言)和Filter(过滤器)
3. 集成Hystrix的断路器功能
4. 集成Spring Cloud服务发现功能
5. 易于编写的Predicate(断言)和Filter(过滤器)
6. 请求限流功能
7. 支持路径重写

### 二.三大核心概念

- Route-路由

  > 构建网关的基本模块,它由ID,目标URL,一系列的断言和过滤器组成,如果断言为TRUE则匹配该路由

- Predicate-断言

  > 参考的是Java8的java.util.function.Predicate,开发人员可以匹配HTTP请求中的所有内容(例如请求头和请求参数), 如果请求与断言相匹配则进行路由

- Filter-过滤器

  > 指的是Spring框架中GatewayFilter的实例,使用过滤器,可以在请求被路由前或者之后对请求进行修改
