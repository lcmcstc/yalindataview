package cn.edu.hdu.yalindataview.controller;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/chuxing", method = RequestMethod.GET)
    public JSONArray test() {
        JSONArray ret = new JSONArray();
        ret.add(new TO("业主车位", 2118, "1"));
        ret.add(new TO("共享车位", 908, "1"));
        ret.add(new TO("可用车位", 121, "1"));
        ret.add(new TO("在库车辆", 1732, "1"));
        ret.add(new TO("今日入库车辆", 291, "1"));
        ret.add(new TO("今日出库车辆", 198, "1"));
        ret.add(new TO("今日出入人员", 488, "1"));
        ret.add(new TO("今日访客人数", 126, "1"));
        return ret;
    }

}
@Data
class TO{
    public String x;
    public int y;
    public String s;
    public TO(String x,int y,String s){
        this.x=x;
        this.y=y;
        this.s=s;
    }
}
