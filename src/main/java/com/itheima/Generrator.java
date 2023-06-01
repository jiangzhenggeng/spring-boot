package com.itheima;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

public class Generrator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();

        DataSourceConfig dataSource = new DataSourceConfig();

        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://47.108.30.116:3306/ssm_db");
        dataSource.setUsername("root");
        dataSource.setPassword("DVDefe567658ERRErffsahjkh");
        dataSource.setDbType(DbType.MYSQL);

        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");
        globalConfig.setOpen(false);
        globalConfig.setAuthor("jiangzg");
        globalConfig.setFileOverride(true);
        globalConfig.setMapperName("%sDao");
        globalConfig.setIdType(IdType.ASSIGN_ID);


        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.exam");
        packageConfig.setEntity("domain");
        packageConfig.setMapper("dao");

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setTablePrefix("tbl_");
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setVersionFieldName("version");
        strategyConfig.setLogicDeleteFieldName("deleted");
        strategyConfig.setEntityLombokModel(true);

        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.setPackageInfo(packageConfig);
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSource);

        autoGenerator.execute();
    }
}
