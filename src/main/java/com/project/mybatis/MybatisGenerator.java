package com.project.mybatis;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
 
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

//导入逆向工程依赖包
public class MybatisGenerator {
	  public static void main(String[] args) throws Exception {
	        List<String> warnings = new ArrayList<String>();
	        boolean overwrite = true;
	        InputStream is= MybatisGenerator.class.getClassLoader().getResource("config/generatorConfig.xml").openStream();
	        ConfigurationParser cp = new ConfigurationParser(warnings);
	        Configuration config = cp.parseConfiguration(is);
	        is.close();
	        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
	        myBatisGenerator.generate(null);
	        System.out.println("生成代码成功，刷新项目，查看文件,然后执行TestMybatis.java");
	         
	    }
}
