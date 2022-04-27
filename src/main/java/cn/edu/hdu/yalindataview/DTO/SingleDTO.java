package cn.edu.hdu.yalindataview.DTO;

import lombok.Data;

/**
 * 单值，可用于标题
 */
@Data
public class SingleDTO {
    public String x;
    public SingleDTO(String x){
        this.x=x;
    }
}
