package cn.edu.hdu.yalindataview.controller;

import cn.edu.hdu.yalindataview.DTO.BinaryDTO;
import cn.edu.hdu.yalindataview.DTO.SingleDTO;
import cn.edu.hdu.yalindataview.DTO.TernaryDTO;
import com.alibaba.fastjson.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 交通场景
 */
@RestController
@RequestMapping("/transportation")
public class TransportationController {
    /**
     * 今日运营里程数
     * @return 二元组
     */
    @RequestMapping(value = "/TodayOperatingMileage", method = RequestMethod.GET)
    public JSONArray TodayOperatingMileage() {
        JSONArray ret = new JSONArray();
        ret.add(new BinaryDTO("5"));
        return ret;
    }
    /**
     * 运营状态
     * @return 一元组
     */
    @RequestMapping(value = "/OperationalStatus", method = RequestMethod.GET)
    public JSONArray OperationalStatus() {
        JSONArray ret = new JSONArray();
        ret.add(new SingleDTO("正常运营中"));
        return ret;
    }
    /**
     * 今日运营人次
     * @return 二元组
     */
    @RequestMapping(value = "/TodayOperatingPeople", method = RequestMethod.GET)
    public JSONArray TodayOperatingPeople() {
        JSONArray ret = new JSONArray();
        ret.add(new BinaryDTO("11"));
        return ret;
    }
    /**
     * 运营总里程数
     * @return 二元组
     */
    @RequestMapping(value = "/TotalOperatingMileage", method = RequestMethod.GET)
    public JSONArray TotalOperatingMileage() {
        JSONArray ret = new JSONArray();
        ret.add(new BinaryDTO("155"));
        return ret;
    }
    /**
     * 总运营人次
     * @return 二元组
     */
    @RequestMapping(value = "/TotalOperatingPeople", method = RequestMethod.GET)
    public JSONArray TotalOperatingPeople() {
        JSONArray ret = new JSONArray();
        ret.add(new BinaryDTO("1635"));
        return ret;
    }
    /**
     * 停车数据统计
     * @return 三元组
     */
    @RequestMapping(value = "/ParkingStatistics", method = RequestMethod.GET)
    public JSONArray ParkingStatistics() {
        JSONArray ret = new JSONArray();
        ret.add(new TernaryDTO("2118","1732","总数"));
        return ret;
    }
    /**
     * 停车数据图表
     * @return 三元组
     */
    @RequestMapping(value = "/ParkingInfographics", method = RequestMethod.GET)
    public JSONArray ParkingInfographics() {
        JSONArray ret = new JSONArray();
        ret.add(new TernaryDTO("A地块","600","车位数"));
        ret.add(new TernaryDTO("B地块","700","车位数"));
        ret.add(new TernaryDTO("C地块","400","车位数"));
        ret.add(new TernaryDTO("D地块","418","车位数"));
        ret.add(new TernaryDTO("A地块","482","业主车辆数"));
        ret.add(new TernaryDTO("B地块","500","业主车辆数"));
        ret.add(new TernaryDTO("C地块","350","业主车辆数"));
        ret.add(new TernaryDTO("D地块","400","业主车辆数"));
        return ret;
    }
}
