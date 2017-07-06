
--查询数据库所在磁盘的相关空间数据----------------------------
	--1、查询各个磁盘分区的剩余空间：
	Exec master.dbo.xp_fixeddrives
	--2、查询数据库的数据文件及日志文件的相关信息（包括文件组、当前文件大小、文件最大值、文件增长设置、文件逻辑名、文件路径等）
	select * from [EPS_Statistical].[dbo].[sysfiles]
	--转换文件大小单位为MB：
	select name, convert(float,size) * (8192.0/1024.0)/1024, size* (8192.0/1024.0)/1024,convert(float,size)  from [EPS_Statistical].dbo.sysfiles
	--3、查询当前数据库的磁盘使用情况：
	Exec sp_spaceused
	--４、查询数据库服务器各数据库日志文件的大小及利用率
	DBCC SQLPERF(LOGSPACE)


--测试sql语句速率----------------------------------
	--1、清除缓存
	DBCC DROPCLEANBUFFERS
	DBCC FREEPROCCACHE
	--2、开启统计IO次数、时间
	SET STATISTICS IO ON 
	SET STATISTICS TIME ON
	--3、sql查询语句
	SELECT  COUNT(*)
	FROM    vwr_projectReport 
	WHERE   1 = 1
	--4、关闭统计IO次数、时间
	SET STATISTICS TIME OFF
	SET STATISTICS IO OFF


--删除当前库中所有表的数据
sp_MSforeachtable @command1='Delete from ?'	
sp_MSforeachtable @command1 = 'TRUNCATE TABLE ?'


--20170704-----------------------------
	--eps导出优化中，发现connectionPool，原因为分页中orderBy createTime。 通过执行计划分析，数据假造的，createTime大多一致，导致查询速率极慢，将其去掉速度很快！
		--结论，sql语句中分页的排序选择要慎重。

