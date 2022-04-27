package cn.edu.hdu.yalindataview.DTO;

import lombok.Data;

/**
 * 二元组，可用于数字翻牌器
 */
@Data
public class BinaryDTO {
    public String x;
    public String y;
    public BinaryDTO(String x, String y){
        this.x=x;
        this.y=y;
    }
    public BinaryDTO(String y){
        this.x="";
        this.y=y;
    }
}
