# 1. Lambda
### 什么是Lambda
代替匿名内部类的一种方式
```
//老式代码
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("do something.");      
    }
}

//Lambda写法
Runnable r = () -> System.out.println("do something.");
```
1. 定义：Lambda是一个对象，是一个函数式接口的实例。
2. 语法：() -> {}  
示例：
```
    Runnable r = () -> System.out.println("123");
    r.run();
```
当参数只有一个时，()可以省略
```
    Consumer<String> c = c1 -> System.out.println(c1);
    c.accept("asdf");
```
### 函数式接口
只有一个抽象方法的接口  
java.util.function包
![image](http://incdn1.b0.upaiyun.com/2017/08/7a34cef4b0d56132aab24f78bc68921e.png)

