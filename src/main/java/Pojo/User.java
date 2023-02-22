package Pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {
    private int uid;
    private String username;
    private String password;
    private String realName;
    private String phone;   // 限制为11位
    private String sex;   // 男 或 女
    private String userImg;  //用户头像
    private String details;
    private String newPass;
    public User(){}
}


