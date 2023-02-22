package Pojo;

import lombok.*;

@Data
@AllArgsConstructor  //全参构造函数
public class Order {
    private int uid;                //用户id（主键）
    private int sid;                //旅游服务id
    private String orderDate;        // 出行日期
    private int amount;              //订单数量
    private float total;             //总价
    private String service_name;     //对应服务名称
    private float price;

    public Order(int uid, int sid, String orderDate, int amount, float total) {
        this.uid = uid;
        this.sid = sid;
        this.orderDate = orderDate;
        this.amount = amount;
        this.total = total;
    }

    public Order() {
    }
}
