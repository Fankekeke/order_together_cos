### 基于SpringBoot + Vue的微信小程序的商品购买系统.

商品管理小程序、电商小程序系统、零售商品小程序、线上商城小程序。

#### 商铺管理员功能模块介绍：
> 商铺信息：编辑和维护店铺名称、简介、营业状态等基本信息。我的商品：管理本店上架的商品，包括新增、修改或下架操作。商铺订单：查看并处理本店所有用户下单及发货状态。订单评价：查看顾客对商品和服务的评分与文字反馈。消息回复：及时响应用户咨询或平台发送的站内消息。商铺审核：提交资质材料，配合平台完成店铺入驻审核流程。用户沟通：与顾客在线交流，解答疑问或处理售后问题。

#### 系统管理员功能模块介绍：
> 收货地址管理：监管用户收货地址数据，保障配送信息合规。商铺审核管理：审核新入驻商铺资质，决定是否通过上线。公告信息：发布全平台通知，如活动、规则变更等重要消息。商品管理：监督所有商品内容，处理违规或侵权商品。用户评价：查看、筛选或处置用户对商品/商铺的评论内容。消息管理：统一管理平台与用户、商铺之间的通信记录。订单管理：监控全平台订单状态，协调异常订单处理。贴子管理：审核和管理论坛中用户发布的帖子与互动内容。商铺管理：维护所有商铺资料，支持冻结、推荐等操作。用户管理：管理用户账号，处理举报、封禁等安全事务。商品类型：配置和维护商品分类体系，如食品、服饰等类目。

#### 用户功能模块介绍：
> 商铺详情：浏览店铺介绍、主营商品、评分及联系方式。查看公告：阅读平台或商铺发布的最新通知与活动信息。搜索商品：通过关键词快速查找所需商品或相关店铺。系统论坛：参与社区讨论，分享购物经验或提问交流。发帖回复：在论坛中发表观点或回复他人帖子内容。用户订单：查看个人历史订单、物流状态及售后服务。加入购物车：将心仪商品暂存购物车，便于批量结算。收货地址管理：添加、编辑或删除常用收货地址信息。订单评价：对已完成的订单进行打分和文字评价。联系客服：通过在线方式向商铺或平台客服发起咨询。

#### 安装环境

JAVA 环境 

Node.js环境 [https://nodejs.org/en/] 选择14.17

Yarn 打开cmd， 输入npm install -g yarn !!!必须安装完毕nodejs

Mysql 数据库 [https://blog.csdn.net/qq_40303031/article/details/88935262] 一定要把账户和密码记住

redis

Idea 编译器 [https://blog.csdn.net/weixin_44505194/article/details/104452880]

WebStorm OR VScode 编译器 [https://www.jianshu.com/p/d63b5bae9dff]

#### 采用技术及功能

后端：SpringBoot、MybatisPlus、MySQL、Redis、
前端：Vue、Apex、Antd、Axios
报表：Spread.js

平台前端：vue(框架) + vuex(全局缓存) + rue-router(路由) + axios(请求插件) + apex(图表)  + antd-ui(ui组件)

平台后台：springboot(框架) + redis(缓存中间件) + shiro(权限中间件) + mybatisplus(orm) + restful风格接口 + mysql(数据库)

开发环境：windows10 or windows7 ， vscode or webstorm ， idea + lambok

#### 商铺管理员
商铺信息、我的商品、商铺订单、订单评价、消息回复、商铺审核、用户沟通

#### 系统管理员
收货地址管理、商铺审核管理、公告信息、商品管理、用户评价、消息管理、订单管理、贴子管理、商铺管理、用户管理、商品类型

#### 用户
商铺详情、查看公告、搜索商品、系统论坛、发帖回复、用户订单、加入购物车、收货地址管理、订单评价、联系客服


#### 前台启动方式
安装所需文件 yarn install 
运行 yarn run dev

#### 默认后台账户密码
[管理员]
admin
1234qwer

[配送员]
peisong
1234qwer

[用户]
fank
1234qwer

#### 项目截图

|  |  |
|---------------------|---------------------|
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709524875703.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525198162.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709524847522.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525186348.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709523881765.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525173545.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709523869912.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525157487.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709523815244.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525137717.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709523787799.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525118751.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709524886865.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525044436.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525252181.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525023326.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525238258.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525011621.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525221898.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709524999125.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1709525210792.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/work/936e9baf53eb9a217af4f89c616dc19.png) |


#### 演示视频

暂无

#### 获取方式

Email: fan1ke2ke@gmail.com

WeChat: `Storm_Berserker`

`附带部署与讲解服务，因为要恰饭资源非免费，伸手党勿扰，谢谢理解😭`

> 1.项目纯原创，不做二手贩子 2.一次购买终身有效 3.项目讲解持续到答辩结束 4.非常负责的答辩指导 5.**黑奴价格**

> 项目部署调试不好包退！功能逻辑没讲明白包退！

#### 其它资源

[2025年-答辩顺利通过-客户评价🍜](https://berserker287.github.io/2025/06/18/2025%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2024年-答辩顺利通过-客户评价👻](https://berserker287.github.io/2024/06/06/2024%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2023年-答辩顺利通过-客户评价🐢](https://berserker287.github.io/2023/06/14/2023%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2022年-答辩通过率100%-客户评价🐣](https://berserker287.github.io/2022/05/25/%E9%A1%B9%E7%9B%AE%E4%BA%A4%E6%98%93%E8%AE%B0%E5%BD%95/)

[毕业答辩导师提问的高频问题](https://berserker287.github.io/2023/06/13/%E6%AF%95%E4%B8%9A%E7%AD%94%E8%BE%A9%E5%AF%BC%E5%B8%88%E6%8F%90%E9%97%AE%E7%9A%84%E9%AB%98%E9%A2%91%E9%97%AE%E9%A2%98/)

[50个高频答辩问题-技术篇](https://berserker287.github.io/2023/06/13/50%E4%B8%AA%E9%AB%98%E9%A2%91%E7%AD%94%E8%BE%A9%E9%97%AE%E9%A2%98-%E6%8A%80%E6%9C%AF%E7%AF%87/)

[计算机毕设答辩时都会问到哪些问题？](https://www.zhihu.com/question/31020988)

[计算机专业毕业答辩小tips](https://zhuanlan.zhihu.com/p/145911029)

#### 接JAVAWEB毕设，纯原创，价格公道，诚信第一

`网站建设、小程序、H5、APP、各种系统 选题+开题报告+任务书+程序定制+安装调试+项目讲解+论文+答辩PPT`

More info: [悲伤的橘子树](https://berserker287.github.io/)

<p><img align="center" src="https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/%E5%90%88%E4%BD%9C%E7%89%A9%E6%96%99%E6%A0%B7%E5%BC%8F%20(3).png" alt="fankekeke" /></p>
