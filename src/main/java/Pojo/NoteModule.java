package Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@AllArgsConstructor
public class NoteModule {

    private int module_id;
    private String module_name;
    private String content;
    private int note_id;
    private String module_img;

    public NoteModule(int module_id, String module_name, String content, int note_id, String module_img) {
        this.module_id = module_id;
        this.module_name = module_name;
        this.content = content;
        this.note_id = note_id;
        this.module_img = module_img;
    }

    public NoteModule(String module_name, String content, int note_id, String module_img) {
        this.module_name = module_name;
        this.content = content;
        this.note_id = note_id;
        this.module_img = module_img;
    }
}