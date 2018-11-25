### SpringBoot + Mycat + Mysql 测试用例

### 一、 分布式数据库环境搭建

##### 1. mysql部署 

共包含3个数据库实例，采用docker的方式部署，配置文件为 deploy/docker-compose.yaml

数据卷挂载的文件已给出，分别为 deploy/mysql-1/mysqld.cnf 和 deploy/mysql-2/mysqld.cnf

##### 2. 导入数据库

sql文件为 sql/CreateTables.sql，分别在3台mysql实例上执行此文件即可

##### 3. 配置主从同步

- mysql-1为主，mysql-2为从，实现db_sync数据库的主从同步

- 在mysql-1上执行

```
> grant replication slave on *.* to slave@<mysql-2-ip> identified by '123456';
> flush privileges;
> show master status;
```

- 在mysql-2上执行

```
> show master status;
> change master to master_host = '<mysql-1-ip>', master_user = 'slave',
> master_password = '123456', master_log_file = 'mysql-bin.<>', master_log_pos = <>;
> start slave;
> show slave status;

# stop slave;
# reset slave;
```

### 二、Mycat部署

采用docker的方式，运行命令为(确保端口为被占用)

```
$ sudo docker run -d \
    -p 9066:9066 \
    -p 8066:8066 \
    -p 8082:8082 \
    mycat:v3 \
    /home/mycat/start.sh
```

### 三、 SpringBoot

启动运行即可