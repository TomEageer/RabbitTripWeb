package Service;


import Pojo.Note;
import Pojo.NoteModule;
import Pojo.Service;
import Pojo.User;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.Map;

public class Test {
    NoteService noteService = new NoteService();
    UserService userService = new UserService();
    ServiceService serviceService = new ServiceService();
    CollectionService collectionService = new CollectionService();

    /*
     * 该测试方法用于根据当前用户id增添游记头到数据库里面
     * */
    @org.junit.Test
    public void addNoteTitle() {
        Note note = new Note("游记标题天山真美丽", 1, "2022-02-22", "这里是图片", "3天", "推荐信息1111111111111111");
        int count = noteService.addNoteTitle(note);
        if (count == 1) {
            System.out.println("添加成功");
        }
    }


    /*
     * 该测试方法用于查询当前游记表里面的最后一个id
     * */
    @org.junit.Test
    public void selectLastNoteId() {
        int Noteid = noteService.selectLastNoteId();
        System.out.println(Noteid);
    }


    /*
     * 该测试方法用于测试 根据当前用户id查询游记id的集合
     * */
    @org.junit.Test
    public void NoteIds() {
        ArrayList<Integer> arrayList = noteService.NoteIds(1);
        System.out.println(arrayList);
    }


    /*
     * -----遍历------上面查询出来的游记id集合
     * 根据游记id  在游记表里面来查找出对应的游记对象
     * */
    @org.junit.Test
    public void NoteDetails() {
        /*根据当前用户id，查询出游记id的集合*/
        ArrayList<Integer> arrayList = noteService.NoteIds(1);
        System.out.println("----------------------------------------------------------------");
        System.out.println(arrayList);
        System.out.println("----------------------------------------------------------------------");
        /*循环遍历游记id*/
        for (int nid : arrayList) {
            /*根据游记id,在游记表里面查找出对应的游记对象*/
            Note note = noteService.NoteDetails(nid);
            System.out.println(note);
            System.out.println("----------------------------------------------------------------");
        }

    }


    /*
     * 用户id从浏览器里面获取
     * 根据用户id获取用户名，用户图片
     * */
    @org.junit.Test
    public void selectUserByUid() {
        User user = userService.selectUserByUid(2);
        String username = user.getUsername();
        String userImg = user.getUserImg();
        System.out.println(username);
        System.out.println(userImg);

    }


    /*
     * 给正在发布的游记添加模块的方法
     * 找到当前游记表里面的最后一个id     selectLastNoteId()
     * 根据游记id添加对应的游记模块
     * */
    @org.junit.Test
    public void addNoteModule() {
        byte[] b = new byte[1];
        /*创建一个模块参数*/
        int LastNoteId = noteService.selectLastNoteId();
        NoteModule noteModule1 = new NoteModule("第一个模块名", "第一个模块的相关内容", LastNoteId, "模块的相关图片");

        int count = noteService.addNoteModule(noteModule1);
        if (count == 1) {
            System.out.println("添加成功~");
        }
    }


    /*
     * 游记详情页面的相关展示
     * 根据
     * ArrayList<Integer> NoteIds(@Param("uid") int uid);方法查询出游记id的集合
     * 遍历游记id
     * 根据游记id在游记模块表里面查询出模块对象集合
     *
     * 在页面上点开某个模块的时候，要传过去两个参数( 用户id,游记id ),进行相关页面展示
     *
     * */
    @org.junit.Test
    public void NoteModuleDetails() {
        /*根据用户id查询出游记id的集合*/
        ArrayList<Integer> NoteIdsList = noteService.NoteIds(2);
        System.out.println(NoteIdsList);
        /*遍历游记id,根据游记id在游记模块表里面查询出游记模块的集合*/
        for (int NoteId : NoteIdsList) {
            ArrayList<NoteModule> noteModules = noteService.NoteModuleDetails(NoteId);
            if (noteModules.size() != 0) {
                /*如果noteModules不为空，说明该游记有模块，遍历出每一个模块*/
                for (NoteModule noteModule : noteModules) {
//                    System.out.println(noteModule);
                    // 转换为JSON字符串
                    String jsonStr = JSON.toJSONString(noteModule);
                    System.out.println("-----------------------------------------------");
                    System.out.println(jsonStr);
                    System.out.println("-----------------------------------------------");
                }
            }

        }
    }

    @org.junit.Test
    public void UserMessage() {
        User user = noteService.UserMessage(1);
        System.out.println(user);
    }


    /*--------------------删除游记模块--------------------------------*/


    /*查询游记表里面的所有id集合*/
    @org.junit.Test
    public void NoteIdsList() {
        ArrayList<Integer> arrayList = noteService.NoteIdList();
        System.out.println(arrayList);
    }


    /*根据游记id在游记表里面查询对应的用户id*/
//    @org.junit.Test
//    public void UserId(int note_id){
//        int userId = noteService.UserId(1);
//        System.out.println(userId);
//    }


    /*根据游记id获取游记模块表里面的所有游记模块的id集合*/
    @org.junit.Test
    public void ModuleIds() {
        ArrayList<Integer> moduleIds = noteService.ModuleIds(1);
        System.out.println(moduleIds);
    }


    /*根据模块id查询出模块对象*/
    @org.junit.Test
    public void Module() {
        NoteModule module = noteService.Module(1);
        System.out.println(module);
    }


    @org.junit.Test
    /*获取游记表里面的id总数*/
    public void findTotalCount() {
        int totalCount = noteService.findTotalCount("古城");
        System.out.println(totalCount);
    }

    /*获取当前页面的id集合*/
    @org.junit.Test
    public void PageNoteIds() {
        ArrayList<Integer> pageNoteIds = noteService.PageNoteIds("古城", 0, 1);
        System.out.println(pageNoteIds);
    }


    /*测试游记删除*/
    @org.junit.Test
    public void deleteModule() {
        noteService.deleteModule(3);
    }


    //    #1.根据service 的id查询出所有的对应图片id
    @org.junit.Test
    public void imgsList() {
        ArrayList<Integer> imgsList = serviceService.imgsList(1);
        System.out.println(imgsList);
    }

    //#2.根据图片id查询出对应的图片路径
    @org.junit.Test
    public void imgSrc() {
        String imgSrc = serviceService.imgSrc(1);
        System.out.println(imgSrc);
    }

    //#3.将图片路径存到集合里面
    //#4.查询出所有的service_id
    @org.junit.Test
    public void serviceIds() {
        ArrayList<Integer> serviceIds = serviceService.serviceIds();
        System.out.println(serviceIds);
    }

    //#5.根据service_id查询出对应的service详细信息
    @org.junit.Test
    public void serviceDetail() {
        Service serviceDetail = serviceService.serviceDetail(1);
        System.out.println(serviceDetail);
    }


    @org.junit.Test
    public void findTotalCoun() {
        int count = serviceService.findTotalCount("苏州");
        System.out.println(count);
    }

    @org.junit.Test
    public void getSecretByPhone(){
        ArrayList<Map<String, String>> secrets = userService.getSecretByPhone("18273470277");
        System.out.println(secrets);
    }

    @org.junit.Test
    public void FindUserByPhone(){
        Object i = userService.CountUserByPhone("18273470279");
        System.out.println(i);
        int i1 = userService.SetNewPassword(1, "123456");
        System.out.println(i1);
    }

    @org.junit.Test
    public void insertCollection(){
        int i = collectionService.insertCollection(2, 2, "2022-05-05");
        System.out.println(i);
    }


}
