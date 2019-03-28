package com.robin.test;

import com.robin.test.model.TestModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class MainApplicationRobinTest {
    public static void main(String[] args) {
        SpringApplication.run(MainApplicationRobinTest.class,args);

        List<TestModel> list = new ArrayList<>();
//        List<TestModel> rmList = new ArrayList<>();

        list.add(new TestModel("name1"));
        list.add(new TestModel("name2"));
        list.add(new TestModel("name3"));
        list.add(new TestModel("name2*2"));
        list.add(new TestModel("name5"));
        list.add(new TestModel("name6"));
//        for (TestModel model : list){
//            if (model.getName().contains("2")) rmList.add(model);
//        }
//        list.removeAll(rmList);
//
//        list.forEach(s-> s.setName(s.getName().replace("name","robin")));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            TestModel model = (TestModel)iterator.next();
            if (model.getName().contains("2")){
                iterator.remove();
            }
            model.setName(model.getName().replace("name","robin"));
        }
        list.forEach(m-> System.out.println(m.getName()));
    }

}
