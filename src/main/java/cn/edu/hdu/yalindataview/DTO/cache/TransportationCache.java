package cn.edu.hdu.yalindataview.DTO.cache;

import cn.edu.hdu.yalindataview.DTO.Binary;
import cn.edu.hdu.yalindataview.DTO.TransportationSingleValueDTO;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 交通场景缓存更新
 */
@Component
public class TransportationCache extends SuperCache implements InitializingBean {

    @Override
    protected void updateCache() {
        System.out.println("【"+this.name+"】更新完成");
        TransportationSingleValueDTO ret=new TransportationSingleValueDTO();
        ret.setTodayOperatingMileage(new Binary("5"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name="交通场景";
        this.version=0;
    }
}
