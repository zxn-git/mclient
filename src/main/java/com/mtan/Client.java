package com.mtan;

import com.mtan.interf.FooService;
import com.mtan.interf.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Client {
    public static long count = 0;
    public static Logger logger = LoggerFactory.getLogger(Client.class);
    public static String aaa = "那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒" +
            "酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯" +
            "洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛" +
            "伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐" +
            "克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克" +
            "就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就" +
            "拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉" +
            "开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发" +
            "垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾" +
            "那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方" +
            "了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒" +
            "疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒" +
            "娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克" +
            "伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上" +
            "开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地" +
            "方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来" +
            "看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克" +
            "就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开" +
            "发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾" +
            "那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方" +
            "了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒" +
            "疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看" +
            "撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放" +
            "辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯" +
            "洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克" +
            "就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上" +
            "开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃" +
            "圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地" +
            "方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒" +
            "酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来" +
            "看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇" +
            "放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐" +
            "克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉" +
            "上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发" +
            "垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那" +
            "地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了" +
            "撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯" +
            "来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒" +
            "娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛" +
            "伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上" +
            "开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那" +
            "地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒" +
            "疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇" +
            "放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐" +
            "克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开" +
            "发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地" +
            "方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯" +
            "来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放" +
            "辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐" +
            "克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开" +
            "发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地" +
            "方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯" +
            "来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇" +
            "放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯" +
            "洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就" +
            "拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发" +
            "垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地" +
            "方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒" +
            "疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒" +
            "娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉" +
            "上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来" +
            "看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾";

    public static String bbb = "那地方了撒酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒" +
            "酒疯来看撒娇放辣椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣椒" +
            "斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣" +
            "椒斯洛伐克就拉上开发垃圾那地方了撒酒疯来看撒娇放辣";


    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        FooService service = (FooService) ctx.getBean("remoteService");
        TestService testService = (TestService) ctx.getBean("testService");
        ExecutorService executorService1 = Executors.newFixedThreadPool(20);
        ExecutorService executorService2 = Executors.newFixedThreadPool(1000);
        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            new Thread(() -> {

                for (int i = 0; i < 400; i++) {
//                    executorService2.execute(() -> {
//                        long l = System.currentTimeMillis();
//                        Long response = testService.test(l);
//                        long l1 = System.currentTimeMillis();
//                        logger.info("testService总时间:{} ，响应开始到接收消息时间:{}", l1 - l, l1 - response);
//                    });

//                    executorService1.execute(() -> {
//                        service.hello(bbb + (Math.random() + ""));
//                    });
//                    executorService1.execute(() -> {
//                        testService.hello(bbb + (Math.random() + ""));
//                    });
                }


            }).start();


            new Thread(() -> {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 0; i < 1; i++) {
                    executorService1.execute(() -> {
                        long l = System.currentTimeMillis();
                        service.hello(bbb + (Math.random() + ""));
                        long l1 = System.currentTimeMillis();
                        long l2 = l1 - l;

                        count += l2;
                        logger.info("fooservice:{}ms", l2);
                    });
//                    executorService1.execute(() -> {
//                        long l = System.currentTimeMillis();
//                        testService.hello(bbb + (Math.random() + ""));
//                        long l1 = System.currentTimeMillis();
//                        long l2 = l1 - l;
//
//                        count += l2;
//                        logger.info("testService:{}ms", l2);
//                    });

                }

                try {
                    Thread.sleep(18000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.info("输出总时间：{}", count);

                logger.info("平均耗时：{}", count/600);


            }).start();

//            new Thread(() -> {
//
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                for (int i = 0; i < 1000; i++) {
//                    executorService2.execute(() -> {
//                        long l = System.currentTimeMillis();
//                        Long response = testService.test(l);
//                        long l1 = System.currentTimeMillis();
//                        logger.info("testService总时间:{} ，响应开始到接收消息时间:{}", l1 - l, l1 - response);
//                    });
//                }
//
//
//            }).start();

        }).start();


    }
}