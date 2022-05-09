package cn.edu.hdu.yalindataview.DTO.cache;

import cn.edu.hdu.yalindataview.DTO.DTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 一个页面的规定一个容器，容器用单例
 */
@Slf4j
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
    protected DTO cache;

    /**
     * 更新缓存
     */
    protected abstract void updateCache();

    /**
     * 定时更新，每过一分钟更新一次
     */
    @Scheduled(cron = "* * * * * ?")
    protected void doTask() {
        try {
            updateCache();
            this.version++;
        }catch(Exception ex){
            //更新失败不加版本，updateCache方法内不可以直接处理业务性异常
        }
        //错峰，一分钟更新一个页面的数据
        try {
            Thread.sleep(60 * 1000);
        }catch (InterruptedException interruptedException){
            log.error(interruptedException.getMessage());
        }
    }
}
