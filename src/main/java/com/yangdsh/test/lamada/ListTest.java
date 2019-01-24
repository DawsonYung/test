package com.yangdsh.test.lamada;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> </p>
 *
 * @Author yangdesheng
 * @Date 2019/1/9 16:10
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {

        List<TestListObject> list = new ArrayList();
        TestListObject t = new TestListObject();
        t.setId(1);
        t.setName("丈母娘1");
        list.add(t);

        TestListObject t2 = new TestListObject();
        t2.setId(2);
        t2.setName("丈母娘2");
        list.add(t2);

        TestListObject t3 = new TestListObject();
        t3.setId(3);
        t3.setName("丈母娘3");
        list.add(t3);

        List<TestListObject> list2 = new ArrayList();
        list2.add(t3);

//        Map<Integer, List<TestListObject>> collect = list.stream().collect(Collectors.groupingBy(TestListObject::getId));
//
//        for (List<TestListObject> value : collect.values()) {
//            for (TestListObject testListObject : value) {
//                System.out.println(testListObject.getId()+testListObject.getName());
//            }
//
//        }
        List<TestListObject> returnList = new ArrayList();
        for (TestListObject tt1 : list) {
            for (TestListObject tt2 : list2) {
                if (!tt1.getId().equals(tt2.getId())) {
                    returnList.add(tt2);
                }
            }
        }

        System.out.println(returnList.size());

    }


}
