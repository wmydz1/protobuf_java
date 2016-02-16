## Protocol Buffers（简称protobuf）是谷歌的一项技术，
用于将结构化的数据序列化、反序列化，经常用于网络传输。

这货实际上类似于XML生成和解析，但protobuf的效率高于XML，不过protobuf生成的是字节码，可读性比XML差。类似的还有json、Java的Serializable等。

protobuf支持各种语言。本文以Java为例，简单介绍protobuf如何使用。其他语言使用方法类似。

首先需要下载：

http://download.csdn.net/download/xiao__gui/7586617

解压后有两个文件：protobuf-java-2.5.0.jar和protoc.exe。

protobuf-java-2.5.0.jar即protobuf所需要的jar包，如果用maven的话可以无视这个文件；

protoc.exe是protobuf代码生成工具。

第一步：定义数据结构

首先要定义protobuf的数据结构，这里要写一个.proto文件。这个文件有点类似于定义一个类。
例如定义一个Person，保存文件PersonMsg.proto（注意文件名和里面的message名不要一样）

```
message Person {
	
	// ID（必需）
	required int32 id = 1;
	
	// 姓名（必需）
	required string name = 2;
	
	// email（可选）
	optional string email = 3;

	// 朋友（集合）
	repeated string friends = 4;
}

```

执行 生成Java代码

```
 protoc --java_out=. *.proto

```

第三步：序列化
第四步：反序列化
一般来说，序列化和反序列化是分开的。
例如网络传输，由一方将数据序列化后发送给另一方来接收并解析，序列化发送和接收反序列化并不在一起。但是下面为了例子简单将二者写在同一程序中