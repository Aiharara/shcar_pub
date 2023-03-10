package com.shcar.demob.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer seller;

    private Integer buyer;

    private Integer car;
}
