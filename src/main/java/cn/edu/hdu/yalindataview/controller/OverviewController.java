package cn.edu.hdu.yalindataview.controller;

import cn.edu.hdu.yalindataview.DTO.TernaryDTO;
import com.alibaba.fastjson.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//社区总览
@RequestMapping("/Overview")
public class OverviewController {
    //社区出行数据
    @RequestMapping(value = "/travel", method = RequestMethod.GET)
    public JSONArray travel() {
        JSONArray ret = new JSONArray();
        ret.add(new TernaryDTO("业主车位", "2118", "1"));
        ret.add(new TernaryDTO("共享车位", "908", "1"));
        ret.add(new TernaryDTO("可用车位", "121", "1"));
        ret.add(new TernaryDTO("在库车辆", "1732", "1"));
        ret.add(new TernaryDTO("今日入库车辆", "291", "1"));
        ret.add(new TernaryDTO("今日出库车辆", "198", "1"));
        ret.add(new TernaryDTO("今日出入人员", "488", "1"));
        ret.add(new TernaryDTO("今日访客人数", "126", "1"));
        return ret;
    }

}
