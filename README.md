# example-java-spring-cloud
spring-cloud 微服务案例

# 环境版本说明

JAVA 8

Maven 3.3 

Spring Boot 2.0.0.BUILD-SNAPSHOT

Mac 系统

IDEA 2017.2.x

# host 设置

```shell
127.0.0.1 peer1
127.0.0.1 peer2
```

# fox-hello 简单RESTful Api 构建
使用 http://start.spring.io 构建

依次选择`Maven Project` ,`Java`,Sprint Boot `2.0.0(SNAPSHOT)`

依次入，Group`com.foxwho`,Artifact`fox-hello`,Dependencies 中填写并选中2个`Web`和`Actuator`

# server 设置
在当前项目目录下执行

打包命令
```SHELL
mvn package
或
mvn package skip test
```


进入target 目录下执行 2条命令（请把原来启动本测试项目的Server 关闭，否则造成端口冲突），
```SHELL
java -jar fox-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1

java -jar fox-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

```