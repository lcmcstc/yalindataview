package cn.edu.hdu.yalindataview.DTO;

import lombok.Data;

@Data
public class TransportationSingleValueDTO {
    /**
     * 今日运营里程数
     */
    BinaryDTO TodayOperatingMileage;
    /**
     * 运营状态
     */
    SingleDTO OperationalStatus;
    /**
     * 今日运营人次
     */
    BinaryDTO TodayOperatingPeople;
    /**
     * 运营总里程数
     */
    BinaryDTO TotalOperatingMileage;
    /**
     * 总运营人次
     */
    BinaryDTO TotalOperatingPeople;
    /**
     * 停车数据统计
     */
    TernaryDTO ParkingStatistics;
    /**
     * 停车数据图表
     */
    TernaryDTO ParkingInfographics;

    public static TransportationSingleValueDTO mock(){
        TransportationSingleValueDTO mockDTO=new TransportationSingleValueDTO();
        mockDTO.setTodayOperatingMileage(new BinaryDTO("5"));
        mockDTO.setTodayOperatingPeople(new BinaryDTO("11"));
        mockDTO.setOperationalStatus(new SingleDTO("正常运营中"));
        mockDTO.setTotalOperatingMileage(new BinaryDTO("155"));
        mockDTO.setTotalOperatingPeople(new BinaryDTO("1635"));
        mockDTO.setParkingStatistics(new TernaryDTO("2118","1732","总数"));
        return mockDTO;
    }
}
