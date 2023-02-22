package Pojo;

import lombok.*;
import lombok.experimental.Tolerate;

@Data
@AllArgsConstructor  //全参构造函数
public class Comment {
    private int cid;    //评论id(主键)s
    private int uid;    //用户id (外键)
    private int sid;    //旅游服务id
    private int nid;    //游记id
    private int type;   //评论类型（1为旅游服务下的评论，2为资讯\攻略下的评论）
    private String content;   //评论内容
    private String date;      //评论日期 例.2020-5-15

    //    @Builder注解之后会默认把无参构造方法忽略掉，通过@Tolerate注解可以防止覆盖
    @Tolerate
    public Comment(){
    }
}
