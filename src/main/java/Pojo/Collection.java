package Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Collection {
    private int user_id;     //用户id
    private int serviceId;   //收藏id
    private String serviceName;    //旅游服务名称
    private float price;
    private String description;    //简介
    private String date;   //当前收藏建立时间

    public Collection() {
    }
}
