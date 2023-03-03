# yikes-srb
yikes是一个网络借贷信息中介服务平台

server-common：是用于放置统一返回接口与断言等工具类，是整个项目的公共依赖。

server-base：继承于server-common依赖，将一些server-core模块中的一些公共代码拉取到此模块，如登录。

server-core：实体整体的业务逻辑代码模块。
