package cn.edu.hdu.yalindataview.DTO;

import lombok.Data;

/**
 * 三元组，可用于图表
 */
@Data
public class TernaryDTO {
    public String x;
    public String y;
    public String s;
    public TernaryDTO(String x, String y, String s){
        this.x=x;
        this.y=y;
        this.s=s;
    }
}
