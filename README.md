# 图书销售系统后端骨架

本项目根据《图书销售系统需求规格说明书》《概要设计说明书》《详细设计说明书》生成，当前只包含三层架构代码框架和后端接口占位，不含核心业务逻辑。

## 技术栈

- JDK 17
- Maven
- Servlet 4.0 + JSP
- MySQL 8.4.11（本机 MySQL 版本）
- mysql-connector-j 8.0.33（兼容 MySQL 8.4）
- Jackson（JSON 序列化）

## 数据表（13 张）

- `user`：会员
- `book_category`：图书分类
- `book`：图书
- `cart_item`：购物车条目
- `orders`：订单
- `order_item`：订单明细
- `point_record`：积分记录
- `admin`：管理员
- `receiver_address`：会员收货地址
- `book_comment`：图书评论
- `book_favorite`：图书收藏
- `coupon`：优惠券
- `user_coupon`：会员已领取优惠券

## 功能点（18 项）

1. 会员注册
2. 会员登录/退出
3. 个人资料维护
4. 收货地址管理
5. 图书分类管理
6. 图书信息管理
7. 图书检索与分页
8. 图书收藏
9. 图书评论
10. 购物车管理
11. 优惠券领取与使用
12. 提交订单
13. 模拟支付
14. 取消订单
15. 订单查询
16. 订单发货与完成
17. 积分累计与查询
18. 管理员后台管理

## 三层架构

| 层次 | 作用 | 位置 |
| --- | --- | --- |
| 表示层/接口层 | 接收前端请求，返回 JSON 占位结果 | `com.book.controller` |
| 业务逻辑层 | 接口 + 实现，后续在此写业务规则 | `com.book.service` + `com.book.service.impl` |
| 数据访问层 | 接口 + 实现，后续在此写 JDBC 操作 | `com.book.dao` + `com.book.dao.impl` |

实体类位于 `com.book.entity`，公共类和工具类位于 `com.book.common`、`com.book.util`。

## 目录结构

```text
book-sales-system/
├── pom.xml
├── sql/schema.sql
└── src/main/
    ├── java/com/book/
    │   ├── common/       # Result、PageResult、状态常量
    │   ├── controller/   # 后端接口占位
    │   ├── dao/          # 数据访问层
    │   ├── entity/       # 实体类
    │   ├── service/      # 业务逻辑层
    │   ├── filter/       # 编码、登录过滤器占位
    │   └── util/         # DBUtil、JsonUtil
    ├── resources/        # 数据库配置
    └── webapp/           # 前端资源预留
```

## 如何与 IDEA 协作

1. 在 IDEA 中选择 `File -> Open`，打开本目录下的 `pom.xml`。
2. IDEA 会自动识别 Maven 项目并导入依赖；如未自动导入，点击右侧 Maven 面板的刷新按钮。
3. 后续我通过终端直接修改本项目文件，你只需在 IDEA 中按需点击 Reload 或等待自动同步。
4. 本机可直接执行的命令由我通过终端完成，包括 Git、Maven 等。
5. 如果需要 Codex 直接操作 IDEA 界面，可安装 JetBrains 官方 Codex/AI Assistant 集成，或启用 Codex 的 Computer Use 能力；本项目开发不依赖该方式。

## IDEA 操作步骤

1. `File -> Open`，选择本目录下的 `pom.xml`，IDEA 会按 Maven 项目导入。
2. 等待依赖下载完成；如未自动刷新，点击右侧 Maven 面板的刷新按钮。
3. 在 `File -> Project Structure -> Project` 中确认 SDK 和 Language level 均为 17。
4. 先执行 `sql/schema.sql` 创建数据库和表，并把 `src/main/resources/db.properties.example` 复制为 `db.properties`，修改为本机数据库账号密码。
5. 配置 Tomcat：`Run -> Edit Configurations -> + -> Tomcat Server -> Local`，在 `Deployment` 中添加 `book-sales-system:war exploded`。
6. 启动 Tomcat 后访问 `http://localhost:8080/book-sales-system/`，接口返回占位 JSON。

## 本机 Maven 校验

当前环境默认 Maven 仓库在 Z 盘且无写权限，可使用项目外临时仓库编译：

```bash
mvn -f pom.xml -Dmaven.repo.local=%TEMP%\m2repo -Dmaven.compiler.fork=true -Dmaven.compiler.executable=你的JDK17目录\bin\javac.exe compile
```

在 IDEA 内不需要额外参数，直接使用 IDEA 自带的 Maven 和编译器即可。

## Git 协作约定

- 主分支：`main`
- 开发分支：按模块建立 `feature/book`、`feature/cart`、`feature/order`、`feature/member`、`feature/address`、`feature/favorite`、`feature/comment`、`feature/coupon`
- 每次修改前我会先说明要改哪些文件，获得你同意后再执行；新建项目文件除外

## 已预留的接口

- `GET/POST /api/books` 图书查询与新增
- `GET/POST /api/cart` 购物车查询与操作
- `GET/POST /api/orders` 订单查询与操作
- `GET/POST /api/member` 会员注册、登录、资料与积分
- `GET/POST /api/address` 收货地址管理
- `GET/POST /api/favorites` 图书收藏
- `GET/POST /api/comments` 图书评论
- `GET/POST /api/coupons` 优惠券领取与使用
- `GET/POST /api/admin` 管理员后台接口占位

当前所有接口返回 `Result` 结构：`{"code":200,"message":"...","data":null}`，业务逻辑待后续实现。
