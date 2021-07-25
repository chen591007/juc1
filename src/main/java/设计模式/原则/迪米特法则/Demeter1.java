package 设计模式.原则.迪米特法则;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
//创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
//输出学院的员工 id  和	学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工
class Employee {
    private String id;

    public void setId(String id) { this.id = id;
    }


    public String getId() { return id;
    }
}





//学院员工
class CollegeEmployee {
    private String id;

    public void setId(String id) { this.id = id;
    }
    public String getId() { return id;
    }
}


//管理学院员工的类
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee()
    { List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { //这里我们增加了 10 个员工到 list
            CollegeEmployee emp = new CollegeEmployee(); emp.setId("学院员工 id= " + i);
            list.add(emp);
        }
        return list;
    }
}





//学校的管理类
class SchoolManager {
    //返回学校总部的员工
    public List<Employee> getAllEmployee()

    {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) { //这里我们增加了 5 个员工到 list
            Employee     emp  = new Employee();
            emp.setId("学校总部员工 id= " + i);
            list.add(emp);
        }
        return list;
    }



    //该方法完成输出学校总部和学院员工信息的方法
    void printAllEmployee(CollegeManager sub) {
//3. 违反了 迪米特法则
//获取到学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee(); System.out.println("------------学院员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
//获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}



















