package aimToOffer.test02;

/**
 * Created by yyh on 2020/6/17 上午11:07
 * 实现 SingleTon：懒汉式、饿汉式。所谓“懒汉式”与“饿汉式”的区别，是在与建立单例对象的时间不同
 */
public class SingletonYh {

//    /**
//     * 懒汉式：真正用到的时候才去创建单例对象
//     * 优点：第一次调用才初始化，避免内存浪费。
//     * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
//     */
//    private static SingletonYh instance;
//
//    private SingletonYh(){};
//
//    public static synchronized SingletonYh getInstance() {
//        if (instance == null) {
//            instance = new SingletonYh();
//        }
//
//        return instance;
//    }

    /**
     * 饿汉式：不管用不用，一开始就创建单例对象
     * 优点：没有加锁，执行效率会提高。
     * 缺点：类加载时就初始化，浪费内存。
     */
    private static SingletonYh instance = new SingletonYh();
    private SingletonYh() {};
    public static SingletonYh getInstance() {
        return instance;
    }

}
