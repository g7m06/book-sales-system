# 图书销售系统后端骨架

本项目根据《图书销售系统需求规格说明书》《概要设计说明书》《详细设计说明书》生成，当前只包含三层架构代码框架和后端接口占位，不含核心业务逻辑。

## 技术栈

- JDK 8
- Maven
- Servlet 4.0 + JSP
- MySQL 8.0
- Jackson（JSON 序列化）

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

## Git 协作约定

- 主分支：`main`
- 开发分支：按模块建立 `feature/book`、`feature/cart`、`feature/order`、`feature/member`
- 每次修改前我会先说明要改哪些文件，获得你同意后再执行

## 已预留的接口

- `GET/POST /api/books` 图书查询与新增
- `GET/POST /api/cart` 购物车查询与操作
- `GET/POST /api/orders` 订单查询与操作
- `GET/POST /api/member` 会员注册、登录、资料与积分
- `GET/POST /api/admin` 管理员后台接口占位

当前所有接口返回 `Result` 结构：`{"code":200,"message":"...","data":null}`，业务逻辑待后续实现。
