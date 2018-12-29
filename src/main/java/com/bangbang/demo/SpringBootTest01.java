package com.bangbang.demo;

import com.bangbang.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class SpringBootTest01 {
    @RequestMapping("/showName")
    public String showName(){
        return "测试一下";
    }

    @RequestMapping("/showMap")
    public Map<String,String> showMap(){
        Map<String,String> map = new HashMap();
        map.put("王健林","男");
        map.put("董明珠","女");
        map.put("马云","男");
        map.put("雷军","男");
        return map;
    }

    @RequestMapping("/showList")
    public List showList(){
        List<String> list = new ArrayList<>();
        list.add("赵");
        list.add("钱");
        list.add("孙");
        list.add("李");
        list.add("周");
        return list;
    }

    @RequestMapping("/showPojo")
    public List<Student> showPojo(){
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setStudentname("潘金莲");
        student1.setAge(18);
        student1.setSex("女");
        student1.setAddress("山东济南");
        studentList.add(student1);

        Student student2 = new Student();
        student2.setId(2);
        student2.setStudentname("西门庆");
        student2.setAge(66);
        student2.setSex("男");
        student2.setAddress("台湾台北");
        studentList.add(student2);

        return studentList;
    }
}
