package me.erudev.deliveryman.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import me.erudev.deliveryman.enums.DeliverymanStatus;

import java.util.Date;

/**
 * @author pengfei.zhao
 * @date 2021/2/12 9:49
 */
@Getter
@Setter
@ToString
public class DeliverymanPO {
    private Integer id;
    private String name;
    private String district;
    private DeliverymanStatus status;
    private Date date;
}
