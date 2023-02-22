package Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//游记类
@Getter
@Setter
@ToString
//@AllArgsConstructor
public class Note {

    private int note_id;     //游记的id
    private String note_title;   //游记标题
    private int user_id;   //用户id
    private String note_date;    //游记发表日期
    private String note_img;     //游记推荐图片
    private int comment_like;     //喜欢该篇游记的数量
    private String playdays;     //游记的游玩天数
    private String recommend;   //游记的推荐内容


    public Note() {

    }



    public Note(int note_id, String note_title, int user_id, String note_date, String note_img, int comment_like, String playdays, String recommend) {
        this.note_id = note_id;
        this.note_title = note_title;
        this.user_id = user_id;
        this.note_date = note_date;
        this.note_img = note_img;
        this.comment_like = comment_like;
        this.playdays = playdays;
        this.recommend = recommend;
    }

    public Note(String note_title, int user_id, String note_date, String note_img, String playdays, String recommend) {
        this.note_title = note_title;
        this.user_id = user_id;
        this.note_date = note_date;
        this.note_img = note_img;
        this.playdays = playdays;
        this.recommend = recommend;
    }


}

