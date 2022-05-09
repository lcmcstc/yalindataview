package cn.edu.hdu.yalindataview.DTO;

import lombok.Data;

/**
 * 二元组，可用于数字翻牌器
 */
@Data
public class Binary {
    public String x;
    public String y;
    public Binary(String x, String y){
        this.x=x;
        this.y=y;
    }
    public Binary(String y){
        this.x="";
        this.y=y;
    }
}
