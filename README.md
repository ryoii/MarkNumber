# Mark Number

IDEA 插件

配合多行选择，为选择行首插入顺序数字

## 使用案例

```text
# before

line
line
line
line

# after

1line
2line
3line
4line
```

1. 通过多行选择方式选中多行
2. 通过快捷键 `Shift+Alt+N` 插入标号

> 当多行选择内容为空时，为插入模式，标号会插入到光标位置
> 当多行选择内容不为空时，为追加模式，标号会追加到行首位置

## 编译

```shell
$ git clone https://github.com/ryoii/MarkNumber.git
$ cd MarkNumber
$ ./gradlew buildPlugin
```

在 IDEA 中安装 `./build/libs/MarkNumber-{version}.jar`

## ~~鸽子计划~~

+ [ ] 上传 Marketplace
+ [ ] 可配置标号样式
+ [ ] 非多行模式逻辑
