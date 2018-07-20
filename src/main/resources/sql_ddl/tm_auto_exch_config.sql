use test;

--
-- Table structure for table `tm_auto_exch_config`
--
DROP TABLE IF EXISTS `tm_auto_exch_config`;
CREATE TABLE `tm_auto_exch_config` (
  `ID` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '自动换汇配置ID',
  `MEMBER_ID` varchar(32) NOT NULL COMMENT '会员ID',
  `EXCH_CURRENCY` varchar(3) NOT NULL DEFAULT 'USD' COMMENT '换汇币种',
  `TARG_CURRENCY` varchar(3) NOT NULL COMMENT '目标币种',
  `RESERVE_AMOUNT` decimal(18,4) NOT NULL DEFAULT '0.0000' COMMENT '预留金额',
  `EXTENSION` varchar(2048) DEFAULT NULL COMMENT '扩展信息',
  `CREATOR` varchar(36) DEFAULT NULL COMMENT '初始创建人',
  `UPDATOR` varchar(36) DEFAULT NULL COMMENT '最后修改人',
  `GMT_CREATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `GMT_UPDATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `MEMO` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `UDX_AEC__MEMBER_CURRENCY` (`MEMBER_ID`,`EXCH_CURRENCY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='算费策略';

alter table tm_auto_exch_config drop column GMT_CREATE;
alter table tm_auto_exch_config drop column GMT_UPDATE;