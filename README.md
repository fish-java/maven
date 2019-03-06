# Maven
Maven 就是Java的包管理工具，鉴于网上已经有很多关于Maven的教程了，所以这篇文章的侧重点的把Maven和npm做对比。

- 依赖的jar包在`mvn compile` 阶段下载，而且是下载到本地的中央仓库`~/.m2/reposity`这也太不符合直觉了吧就很懵逼。

- 使用mvn运行程序还是比较复杂的，-cp后面要接一大堆路径

- 我不太明白 mvn test的原理，为什么就能测试了？ 可能是和mocha一样吧

- 引用的外部资源需要通过`./target/classes` 来引用