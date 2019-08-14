package cn.com.collection;

import java.util.*;

public class TestStoreData {
    public static void main(String[] args) {
        //测试表格数据的存储，ORM的思想 对象关系映射
        Map<String,Object> map1 = new HashMap<>();
        map1.put("id",100);
        map1.put("姓名","小红");
        map1.put("年龄",18);
        map1.put("薪水",2000);
        map1.put("入职日期","2018.9.1");

        Map<String,Object> map2 =new HashMap<>();
        map2.put("id",200);
        map2.put("姓名","小亮");
        map2.put("年龄",16);
        map2.put("薪水",1500);
        map2.put("入职日期","2016.3.3");

        Map<String,Object> map3 = new HashMap<>();
        map3.put("id",300);
        map3.put("姓名","小军");
        map3.put("年龄",17);
        map3.put("薪水",3500);
        map3.put("入职日期","2008.5.1");

        Map<String,Object> map4 = new HashMap<>();
        map4.put("id",400);
        map4.put("姓名","小琪");
        map4.put("年龄",20);
        map4.put("薪水",2000);
        map4.put("入职日期","2008.6.1");

        Map<String,Object> map5 = new HashMap<>();
        map5.put("id",500);
        map5.put("姓名","小明");
        map5.put("年龄",19);
        map5.put("薪水",1000);
        map5.put("入职日期","2019.10.1");

        List<Map<String,Object>> list = new LinkedList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
//        Iterator()遍历
        for (Map<String,Object> aa:list) {
            Set<Map.Entry<String,Object>> a = aa.entrySet();
            for (Iterator<Map.Entry<String,Object>> iter = a.iterator(); iter.hasNext(); ) {
                Map.Entry<String,Object> tmp = iter.next();
                System.out.print(tmp+"\t");
            }
            System.out.println();
        }
//        for (Map<String,Object> bb: list) {
//            Set<String> a = bb.keySet();
//            for (Iterator<String> c = a.iterator();c.hasNext() ;) {
//                String tmp = c.next();
//                System.out.print(tmp+":"+bb.get(tmp)+"\t");
//            }
//            System.out.println();
//        }
    }
}
