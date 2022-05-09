package cn.edu.hdu.yalindataview.cache;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class TransportationCache extends SuperCache implements InitializingBean {

    @Override
    protected void updateCache() {
        System.out.println("hello word");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name="交通场景";
        this.version=0;
    }
}
