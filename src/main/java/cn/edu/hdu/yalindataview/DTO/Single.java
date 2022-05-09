package cn.edu.hdu.yalindataview.DTO;

import lombok.Data;

/**
 * 单值，可用于标题
 */
@Data
public class Single {
    public String x;
    public Single(String x){
        this.x=x;
    }
}
