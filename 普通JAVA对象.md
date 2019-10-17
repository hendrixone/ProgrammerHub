# User

| 字段     | 类型   | 注释                            |
| -------- | ------ | ------------------------------- |
| id       | int    | ID                              |
| email    | String | 邮箱(学生和老师的账号)          |
| password | String | 密码                            |
| type     | int    | 权限等级(1.管理员,2学生,3.老师) |

# 用户信息

| 字段  | 类型   | 注释           |
| ----- | ------ | -------------- |
| id    | int    | ID             |
| name  | String | 姓名           |
| sex   | String | 性别           |
| phone | String | 电话           |
| email | Sting  | 邮箱           |
| photo | String | 照片(路径形式) |
| class | class  | 年级           |

# 班级信息

| 字段        | 类型          | 注释           |
| ----------- | ------------- | -------------- |
| id          | int           | ID             |
| name        | String        | 班级名称       |
| teacher     | String        | 班主任         |
| studentList | List<Student> | 班级学生的集合 |

