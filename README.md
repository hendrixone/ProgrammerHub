# 程序员小屋

## Programmer Hub

为项目峰会所准备的Java项目
项目方向是提供一个在线学习系统，提供代码共享，在线考试，提问回答和班级学员管理
### 项目简介
后台应用使用Maven进行依赖管理，SpringMVC框架构建服务，使用SpringCloud实现服务拆分与分布式高可用，SpringBoot自动配置。
数据库采用mysql并搭配mycat实现高可用集群，Redis高可用集群提供更为快速的数据访问，使用elasticsearch构建站内索引

### 项目贡献须知
请克隆主分支到本地创建个人分支（自己名字命名），修改请直接提交到个人分支，注意不要与其他人工作重复。仓库已经设置排除所有项目本地配置文件：.setting(Eclipse), .idea(Intellj Idea)，克隆至本地应使用ide导入，忽略规则请见[.gitignore](https://github.com/hendrixone/ProgrammerHub/blob/master/.gitignore)。项目及小组说明文档请见[说明文档](https://github.com/hendrixone/ProgrammerHub/blob/master/说明文档.md)

### 网站访问IP地址
[144.202.109.57](http://144.202.109.57)

## 计划中的功能（以优先度排序）

### [用户系统](#网页用户系统)

### [班级系统](#班级和学员管理系统)（核心）

### [文件共享系统](#在线文件共享)

### [考试系统](#在线考试系统)

### [论坛系统](#简易论坛)

### [在线工具](#在线小工具)

## 技术架构

### ElasticSearch

### Nginx

### Mycat + Mysql后台数据库

### Redis

### SpringMVC cloud boot

# 详细信息

## [网页文件结构](https://github.com/hendrixone/ProgrammerHub/页面结构.md)

## 网站功能

### 网页用户系统

***

注册账号后可以在论坛将显示个人信息，可以加入班级，可保存考试记录

#### 注册功能

用户需使用邮箱注册并通过电子邮件激活账户，个人信息将被存储在数据库中

#### 登陆功能

使用Redis维持登陆状态，同时存储用户显示信息

#### 游客登陆

可根据IP地址创建临时游客账户，由系统生成用户信息

#### 权限系统

给予特定用户管理其他用户的权限

#### 用户信息管理

可以修改用户信息，查看他人信息

不同用户有不同身份和权限

### 在线文件共享

***

#### 文件上传下载

用户可通过网页上传与下载文件

#### 访问权限

用户对特定文件有不同访问权限

#### 在线文本文件预览，编辑和管理

可以在线修改文本类文件

### 简易论坛

***

网站内论坛，可以发表干货，通知和提问

#### 用户发表主题贴和回复

可以发表主题贴，并在其下回复，楼主拥有该帖所有编辑权限

#### 在线编辑内容

可以在线重新编辑贴主题和回复内容

#### 管理员系统

论坛管理员可以修改内容并对用户进行禁言

#### 搜索系统

论坛内搜索

### 班级和学员管理系统

***

班级用户组，可以在班级内发表主题贴和分享文件，

#### 班级内成员文件共享

只对本班同学开放的文件

#### 学员作业和上传

班级管理可以发布作业，学员需上传作业到服务器

#### 班级内论坛

只对同班同学开放，对外隐藏并拒绝访问

#### 学员表现记录

班级管理员可以修改学员表现记录

#### 班主任

班级管理员可以拥有以上内容所有权限

### 在线考试系统

***

登陆后可以访问在线题库并进行考试

#### 题海

在线题库，可以测试，不会保存记录

#### 班级内在线发布考试

班级管理员可以为班级学员自定义并发布考试，成绩将被记录

#### 成绩统计

班级管理员可以访问学员考试成绩

### 在线小工具

***

提供一些有趣的小工具

#### 在线代码编译运行

可运行基础java代码

#### 网页小助手

配合图灵机器人网站的API可以实现聊天机器人
