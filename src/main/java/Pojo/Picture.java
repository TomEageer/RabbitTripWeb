package Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Picture {
    /**
     * 注意sid和nid是String类型的，因为默认存放null值
     * 旅游服务id和资讯id皆默认为null，为null时代表无关联，可以同时使用也可以单独查询
     */
    private int pid ;  //图片id，主键
    private String sid ;
    private String nid;   // 游记id
    private int type;
    private String src;   //图片地址

}
