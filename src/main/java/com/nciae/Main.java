package com.nciae;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class Main {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator generator = new AutoGenerator();


        // 全局配置
        GlobalConfig config =  new GlobalConfig();
        config.setAuthor("YangChen");   //作者
        config.setOutputDir("D:/开发项目/jave/zhoujinhuahang/src/main/java");  //逆向生成路径
        config.setFileOverride(false);  //覆盖同名文件
        config.setActiveRecord(false);  // 不需要ActiveRecord特性的请改为false
        config.setEnableCache(false);   // XML 二级缓存
        config.setBaseResultMap(true);  // XML ResultMap
        config.setBaseColumnList(true);// XML columList

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl("jdbc:mysql://39.97.109.154:3306/nciae?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true")
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUsername("root")
                .setPassword("root");
        generator.setDataSource(dataSourceConfig);


        //包配置
        PackageConfig pc =new PackageConfig();
        pc.setEntity("po");
        pc.setMapper("dao");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setParent("com.nciae");

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);

        // 设置模板引擎
        generator.setTemplateEngine(new FreemarkerTemplateEngine());
        // 设置全局配置
        generator.setGlobalConfig(config);
        // 设置数据源
        generator.setDataSource(dataSourceConfig);
        // 设置包配置
        generator.setPackageInfo(pc);
        // 设置策略
        generator.setStrategy(strategyConfig);
        generator.execute();
    }
}