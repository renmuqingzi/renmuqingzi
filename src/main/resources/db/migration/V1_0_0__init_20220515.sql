DROP TABLE if exists test1;
CREATE TABLE test1
(
    `id`   bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `name` char(100) NOT NULL COMMENT '姓名',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
