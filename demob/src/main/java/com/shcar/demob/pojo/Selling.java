package com.shcar.demob.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Selling {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String model;

    private Character grade;

    private String auctionSite;

    private String location;

    private Integer lotNo;

    private Integer year;

    private String type;

    private Integer cc;

    private String inspect;

    private Integer odo;

    private String color;

    private Character tm;

    private String ac;

    private Integer score;

    private String extInt;

    private Integer startPrice;

    private String startDate;

    private String startTime;

    private Integer seller;

    private Integer method;

    private Integer state;
}
