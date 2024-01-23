# spring mvc 在 tomcat 中运行

## 目录结构

```text
|----
|----src
|----|----main
|----|----|----java
|----|----|----|----vip.openpark.mvc.controller
|----|----|----|----|----JsonController
|----|----|----|----|----PageController
|----|----|----resources
|----|----|----|----spring-context.xml
|----|----|----|----spring-mvc.xml
|----|----|----webapp
|----|----|----|----WEB-INF
|----|----|----|----|----static
|----|----|----|----|----|----poem.txt
|----|----|----|----|----views
|----|----|----|----|----|----index.jsp
|----|----|----|----|----|----login.jsp
|----|----|----|----web.xml
|----.gitignore
|----pom.xml
|----readme.md
```

## 运行步骤

1. 点击 `Run/Debug Configurations` 面板上的 `+` 号，选择 `Tomcat Server` 下 `Local`  ；
2. 然后点击右下角 `Fix` ，进入 `Project Structure` 面板；
3. 点击 `Arifacts` 后，再点击面板上的 `+` 号，选择 `Web Application: Exploded` ，再选择 `From Modules...` ，选择需要使用 Tomcat 运行的 Mudule，然后点击 `OK` ，`OK` ，`OK` ；
4. 最后启动配置好的 Tomcat；

