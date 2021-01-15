transaction-propagation:
```
Propagation.REQUIRED     # 没有就创建,有就加入;多用于增删改
Propagation.SUPPORTS     # 当前操作存在事务就使用事务,没有就不使用事务;多用于查询
Propagation.MANDATORY    # 必须要存在事务,没有抛出异常
Propagation.REQUIRES_NEW # 产生新的事务[如果产生异常,事务回滚,异常未捕获就上抛],挂起当前事务(如果存在)
Propagation.NOT_SUPPORTS # 以无事务状态运行,有事务就挂起
Propagation.NEVER        # 以无事务状态运行,当前如果存在事务就抛出异常
Propagation.NESTED       # 如果当前存在事务开启一个子事务(嵌套事务),嵌套事务是独立提交或者回滚
                         # 如果当前没有事务,同REQUIRED一样
                         # 但是主事务提交, 则会携带子事务一起提交
                         # 如果主事务异常回滚, 则子事务会一起回滚。相反,子事务异常主事务可以选择回滚或者不回滚(try catch 子事务异常)
```

@EnableTransactionManagement 可以不加在启动类上,springboot 自动配置已经启动;

cookie大小不能超过4KB,不能跨域,当前及其父级域名可以取值,可以设置有效期
