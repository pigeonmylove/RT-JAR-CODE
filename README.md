## 说明

由于代码是反编译得到的，所以有一些行注释，影响阅读。没有选项可以去掉，我使用的工具是jd-gui.exe，另外还有一些class反编译失败，暂时不知道原因。

那么对于注释的去除，使用`ctrl+f`打开查询，输入`/\* {1,3}\d* *\*/`, 选择是正则匹配，然后用空字符串替换，直接点击替换所有。这样不干净的注释就会被替换掉。
但是代码比较乱，可以使用`ctrl+shift+f`快捷键格式化代码！