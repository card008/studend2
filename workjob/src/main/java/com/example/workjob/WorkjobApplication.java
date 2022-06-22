package com.example.workjob;

import com.alibaba.fastjson.JSON;
import com.example.workjob.utils.HttpUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class WorkjobApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WorkjobApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //1、初始化Spring容器，加载配置文件
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(context.getBean("user1"));

        // 远程调用controller方法
        String result = HttpUtil.postRequest("","http://127.0.0.1:8182/api/request/getUser");
        System.out.println("请求返回内容"+ JSON.toJSON(result));
    }
}
