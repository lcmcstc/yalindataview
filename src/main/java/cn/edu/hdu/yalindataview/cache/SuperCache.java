package cn.edu.hdu.yalindataview.cache;

import cn.edu.hdu.yalindataview.DTO.DTO;
import lombok.Data;
//import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 一个页面的规定一个容器，容器用单例
 */
//@Log4j2
@Data
@EnableScheduling
public abstract class SuperCache {
    /**
     * 版本号，一般来说，每个缓存的版本号是一致的
     */
    protected int version;

    /**
     * 容器名字
     */
    public String name;

    /**
     * 用于缓存
     */
    private DTO cache;

    /**
     * 更新缓存
     */
    protected abstract void updateCache();

    /**
     * 定时更新，每过一分钟更新一次
     */
    @Scheduled(cron = "* * * * * ?")
    protected void doTask() {
        updateCache();

        //错峰，一分钟更新一个页面的数据
        //log.error("sasad");
        try {
            Thread.sleep(60 * 1000);
        }catch (InterruptedException interruptedException){
            //log.error(interruptedException.getMessage());
        }
    }
}
