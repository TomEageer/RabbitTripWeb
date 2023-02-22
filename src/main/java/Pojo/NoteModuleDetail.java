package Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class NoteModuleDetail {

    private int note_id;     //游记的id
    private String note_title;   //游记标题
    private int user_id;   //用户id
    private String note_date;    //游记发表日期
    private String note_img;     //游记推荐图片
    private int comment_like;     //喜欢该篇游记的数量
    private String playdays;     //游记的游玩天数
    private String recommend;   //游记的推荐内容

    private String username;
    private String userImg;  //用户头像

}