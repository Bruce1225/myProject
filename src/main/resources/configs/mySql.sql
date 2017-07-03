

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



