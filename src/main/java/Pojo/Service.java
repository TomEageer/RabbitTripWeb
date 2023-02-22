package Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
//@AllArgsConstructor
public class Service {
    private int service_id;
    private int user_id;
    private String service_name;
    private int service_type;
    private Float price;
    private String description;    //旅游服务的简介
    private int status;
    private int collect_count;
    private String service_address;
    private String service_img;
    private String service_content;
    private String ad;

    private ArrayList<String> serviceImgs;/*图片集合*/



    /*创建无参构造方法*/
    public Service() {
    }

    /*创建一个不含集合的构造方法*/
    public Service(int service_id, String service_name, int service_type, Float price, String description, int status, int collect_count, String service_address, String service_img, String service_content, String ad) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.service_type = service_type;
        this.price = price;
        this.description = description;
        this.status = status;
        this.collect_count = collect_count;
        this.service_address = service_address;
        this.service_img = service_img;
        this.service_content = service_content;
        this.ad = ad;
    }


    /*创建一个不含集合的构造方法*/

    public Service(int service_id, String service_name, int service_type, Float price, String description, int status, int collect_count, String service_address, String service_img, String service_content, String ad, ArrayList<String> serviceImgs) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.service_type = service_type;
        this.price = price;
        this.description = description;
        this.status = status;
        this.collect_count = collect_count;
        this.service_address = service_address;
        this.service_img = service_img;
        this.service_content = service_content;
        this.ad = ad;
        this.serviceImgs = serviceImgs;
    }
}
