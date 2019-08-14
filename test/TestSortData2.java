package cn.com.collection;

import java.util.*;

public class TestSortData2 {
    public static void main(String[] args) {
        Persion p1 = new Persion(100,"小红",18,2000,"2019.8.12");
        Persion p2 = new Persion(200,"小明",19,1500,"2016.5.20");
        Persion p3 = new Persion(300,"小花",16,3600,"2020.1.1");
        Persion p4 =new Persion(400,"小军",20,4500,"2018.9.9");
//        List<Persion> list = new LinkedList<>();
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        list.add(p4);
//        for (Persion p : list) {
//            System.out.println(p);
//        }
        Map<Integer,Persion> m = new HashMap<>();
        m.put(100,p1);
        m.put(200,p2);
        m.put(300,p3);
        m.put(400,p4);
//        Set<Map.Entry<Integer,Persion>> a = m.entrySet();
//        for (Iterator<Map.Entry<Integer,Persion>> b =  a.iterator();b.hasNext() ; ) {
//            Map.Entry<Integer,Persion> tmp= b.next();
//            System.out.println(tmp);
//        }
        Set<Integer> xx = m.keySet();
        for (Iterator<Integer> z = xx.iterator();z.hasNext();) {
            Integer tmp = z.next();
            System.out.println(tmp+"======"+m.get(tmp));
        }
    }
}
class Persion {
    private int id;
    private String name;
    private int age;
    private int salary;
    private String indate;

    //要有默认的无参构造器
    public Persion() {

    }
    public int getId() {
        return id;
    }

    public Persion(int id, String name, int age, int salary, String indate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.indate = indate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    @Override
    public String toString() {
        return "id:"+id+",姓名："+name+",年龄："+age+",薪水："+salary+",入职日期："+indate;
    }
}
