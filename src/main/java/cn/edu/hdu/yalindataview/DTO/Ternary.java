package cn.edu.hdu.yalindataview.DTO;

import lombok.Data;

/**
 * 三元组，可用于图表
 */
@Data
public class Ternary {
    public String x;
    public String y;
    public String s;
    public Ternary(String x, String y, String s){
        this.x=x;
        this.y=y;
        this.s=s;
    }
}
