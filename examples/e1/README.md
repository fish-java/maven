https://stackoverflow.com/questions/54916788/maven-compile-can-not-find-package-when-they-are-installed-in-m2

哎，傻逼Java 傻逼google，真你妈坑

``` bash
mvn compile
java -cp ~/.m2/repository:./target/classes Hello
# 手动这样写也很难受啊，好要指明mvn库的目录以及target的目录。。。
```
感谢sof上的contruibuteer

idea 的 extranl librea 也不知道是设么原理

就是提前预定一些jar包，然后在写代码的时候自动导入，编译阶段自添加吧

点击播放 。。。自动能运行。。。
真的智能，main方法所在的类是idea自动推断的把。。。

自动解析jar包

好了，java解释idea了，
vscode这种语言你拿他没办法，自能上ide

和npm不一样的
- 版本命名比较复杂，后还有他妈的 莫民奇妙的后缀
- compile阶段下载的，我是懵逼的，当时我脑子没转过来，就在想怎么下载这些jar包呢？
- 需要IDE来解析jar包，才能提升效率
- 编译执行还是比较复杂的。需要ide

Maven 的java启动目录时 pom.xml所在的目录
放在`resource`目录的资源要通过相对路径`./target/classes`来引用

