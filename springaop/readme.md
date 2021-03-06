# SpringBoot AOP  Practice
## 基本概念
### 连接点(JoinPoint)
    程序中执行的某个特定位置： 如类的某个方法调用前,调用后方法抛出异常后.
### 切点(Pointcut)
    AOP通过(#"切点")定位特定的连接点.切点和连接点不是一对一的关系,一个  
     可以匹配多个连接点
### 通知(advice)
    切面的工作被称为通知.是织入目标类连接点的一段代码
    通知的类型
  1. 前置通知 `before`
  2. 后置通知 `after`
  3. 返回通知 `After-Return`
  4. 异常通知 `After-throwing`
  5. 环绕通知 `Around`

### 引介(Introduction)
    引入允许我们向现有的类添加新方法或属性，是一种特殊的通知.
  
### 切面(Aspect)
    切面由切点和通知构成
 
### 织入(Weaving)
    织入就是就是把切面应用的目标对象并创建新的代理对象的过程
	织入的三种方式
	a. 编译期的织入：切面在目标类编译时织入，这种方式一般需要特殊的编译器.AspectJ  
	                                就是以这种方式 织入切面的编译器
	b. 类加载器的织入：切面在目标类加载到JVM时织入,这种方式需要特殊的类加载器  
	c. 运行时的织入：切面在程序运行到某个时刻织入 一般情况下，在织入切面时,  
	                AOP容器会为目标对象动态地创建一个代理对象。Spring AOP就是以这种方式织入切面的
	                
### Pointcut expression
    Pointcut 可以通过&& || ！的方式进行组合  
    这里介绍最常用的方式execution()
	execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern)throws-pattern?)  
    returning type pattern,name pattern, and parameters pattern是必须的.  
    ret-type-pattern:可以为*表示任何返回值,全路径的类名等.  
    name-pattern:指定方法名,*代表所以,set*,代表以set开头的所有方法.  
    modifiers-pattern? 访问权限 例如 Public,private
    parameters pattern:指定方法参数(声明的类型),(..)代表所有参数,(*)代表一个参数,(*,String)代表第一个参数为任何值,第二个为String类型.
    
    
## Around advice 与其他advice的区别
    around advice能够决定是否调用目标方法(切点),并且能返回自定义的result    




