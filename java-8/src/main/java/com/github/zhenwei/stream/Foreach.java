package com.github.zhenwei.stream;

import com.github.zhenwei.stream.entity.Student;
import java.util.ArrayList;
import lombok.Data;

/**
 * @author: zhangzhenwei
 * @description:
 * @date: 2023/7/3  13:43
 * @since: 1.0.0
 */
public class Foreach {

  /**
   * @author zhangzhenwei
   * @description you can update obj in stream of foreach 
   * @date 2023/7/3  13:56
   * @since: 1.0.0 
   */
  public static void main(String[] args) {
    Student one = new Student("张三", 18);
    Student two = new Student("李四", 20);

    ArrayList<Student> students = new ArrayList<>(2);
    students.add(one);
    students.add(two);

    students.stream().forEach(student -> {
      if (student.getAge()==18){
        student.setAge(99);
      }
    });

    students.forEach(System.out::println);

  }







}
