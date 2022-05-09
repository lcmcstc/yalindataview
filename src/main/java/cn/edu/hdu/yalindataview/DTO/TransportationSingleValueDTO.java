package cn.edu.hdu.yalindataview.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TransportationSingleValueDTO extends DTO{
    /**
     * 今日运营里程数
     */
    Binary TodayOperatingMileage;
    /**
     * 运营状态
     */
    Single OperationalStatus;
    /**
     * 今日运营人次
     */
    Binary TodayOperatingPeople;
    /**
     * 运营总里程数
     */
    Binary TotalOperatingMileage;
    /**
     * 总运营人次
     */
    Binary TotalOperatingPeople;
    /**
     * 停车数据统计
     */
    Ternary ParkingStatistics;
    /**
     * 停车数据图表
     */
    Ternary ParkingInfographics;

    public static TransportationSingleValueDTO mock(){
        TransportationSingleValueDTO mockDTO=new TransportationSingleValueDTO();
        mockDTO.setTodayOperatingMileage(new Binary("5"));
        mockDTO.setTodayOperatingPeople(new Binary("11"));
        mockDTO.setOperationalStatus(new Single("正常运营中"));
        mockDTO.setTotalOperatingMileage(new Binary("155"));
        mockDTO.setTotalOperatingPeople(new Binary("1635"));
        mockDTO.setParkingStatistics(new Ternary("2118","1732","总数"));
        return mockDTO;
    }
}
