-- 支付表结构
CREATE TABLE `payment`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `serial` VARCHAR(200) DEFAULT '' COMMENT '支付流水号',
  PRIMARY KEY(id)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
-- 初始化数据
INSERT INTO `payment` (`serial`) VALUES ('测试使用1'), ('测试使用2');

