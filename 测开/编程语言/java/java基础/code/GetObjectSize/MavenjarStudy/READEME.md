# 目标
学习Maven打包资源成jar包

# 重要知识点
要想jar包能直接通过java -jar xxx.jar运行，需要满足：  
> 1.在jar包中的META-INF/MANIFEST.MF中指定Main-Class，这样才能确定程序的入口在哪里；  
> 2.要能加载到依赖包。
```
文件：META-INF/MANIFEST.MF
内容：
Manifest-Version: 1.0
Created-By: Apache Maven 3.6.3
Built-By: hucheng
Build-Jdk: 11.0.21
Class-Path: lib/hutool-all-5.3.7.jar
Main-Class: com.example.Main
解释：
Class-Path指明了依赖包的位置
Main-Class指明了程序的入口在那里，这样JVM就能知道需要加载的入口
```



# 参考博客
[学习Maven打包资源成jar包](https://www.cnblogs.com/h--d/p/13060299.html)  
[maven阿里云代理配置](https://developer.aliyun.com/mirror/maven/)  
[VsCode Maven设置](https://blog.csdn.net/jzlswc_7620255/article/details/94590020)  