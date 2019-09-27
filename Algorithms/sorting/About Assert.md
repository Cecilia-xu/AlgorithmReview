# assert 在Java的使用
## 简述
在一个具有自我保护能力的程序中，如果要确保某个属性符合要求，且代码执行依赖于这个属性。例如字符串操作int len = str.length();str是一个字符串的引用，但是还是如果还是希望检查一下，避免调用了null引用的方法。首先我们可以考虑直接抛出异常。虽然可以直接抛出异常，但是这段代码会一直保留在程序中，即使测试完毕也不会自动删除。如果程序中含有大量这样子的检查代码，程序的性能就会下降。断言（assert）机制允许在测试期间向代码插入一些检查语句。当代码发布时，我们可以选择让这些代码是否有效。
## 语法形式
1. assert 条件;
2. assert 条件 : 表达式;<br>
这两种形式都会对条件进行检测，如果结果为false，则抛出一个AssertionError。在第二种形式中，表达式的值将会被传入AssertionError的构造器中，并转换成一个消息字符串。
## 举例说明
1. 代码示例
``` java
public class AssertDemo {

    public static void main(String[] args) {
        int x = 23;
        assert x < 0;
    }
}
```
在这段程序中，运行时并不会抛出Assertion Error  
<br />
2. 启用断言
- eclipse下运行：在“Run Configurations”–>“Arguments”–>“VM Arguments”中添加-ea或-enableassertions
- 在命令行中运行的话只需要java -ea AssertDemo 
启用后会显示Assertion error  
<br />
3.  禁用断言
<br />
同启用，参数改为-da和-disableassertions
