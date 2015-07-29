### FocusSNS 完整的配置文件如下 ###
```
jdbc.driver=${jdbc.driver}
jdbc.url=${jdbc.url}
jdbc.username=${jdbc.username}
jdbc.password=${jdbc.password}
jpa.dialect=${jpa.dialect}

#dbcp settings
dbcp.maxIdle=5
dbcp.maxActive=40

#mail
mail.host=smtp.163.com
mail.port=25
mail.username=enterpriseconnect@163.com
mail.password=123456

#sina
social.sina.apiKey=1925786187
social.sina.apiSecret=608ef03b66fd0e3ab304977662773b12
#tencent
social.tencent.apiKey=ef745e81ba594d1dbd8b2fc4c0f11acd
social.tencent.apiSecret=fe901cbd71ba3a9a48789ea839229e90
social.tencent.clientip=127.0.0.1
```

### 数据库及方言配置 ###
```
jdbc.driver=${jdbc.driver}
jdbc.url=${jdbc.url}
jdbc.username=${jdbc.username}
jdbc.password=${jdbc.password}
jpa.dialect=${jpa.dialect}

#dbcp settings
dbcp.maxIdle=5
dbcp.maxActive=40
```

如果你是自己用 Maven 从源代码编译，那么上面的 ${} 部分的参数会自动帮你填充，看下面的例子：
```
MySql数据库: mvn package -Pmysql -Djdbc.username=xxx -Djdbc.password=xxx
Postgresql数据库: mvn package -Ppostgresql -Djdbc.username=xxx -Djdbc.password=xxx
```

### 邮件配置 ###
```
#mail
mail.host=smtp.163.com
mail.port=25
mail.username=enterpriseconnect@163.com
mail.password=123456
```

Note: 如果你只是用于体验，该部分不需要修改

### 新浪及腾讯 OAuth 配置 ###
```
#sina
social.sina.apiKey=1925786187
social.sina.apiSecret=608ef03b66fd0e3ab304977662773b12
#tencent
social.tencent.apiKey=ef745e81ba594d1dbd8b2fc4c0f11acd
social.tencent.apiSecret=fe901cbd71ba3a9a48789ea839229e90
social.tencent.clientip=127.0.0.1
```

Note: 如果你只是用于体验，该部分不需要修改