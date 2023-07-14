import java.util.*;
import java.util.Scanner;

public class Index {

    public static void AddStudent(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String id =sc.next();
        System.out.println("请输入姓名：");
        String name =sc.next();
        System.out.println("请输入年龄：");
        int age =sc.nextInt();
        System.out.println("请输入性别：");
        char gender =sc.next().charAt(0);
        System.out.println("请输入专业：");
        String major =sc.next();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setMajor(major);

        try{
            list.add(student);
            System.out.println("添加成功!");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void RemoveStudent(List<Student> list){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("删除第几条信息？");
		int rem = sc.nextInt()-1;
		list.remove(rem);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的学号：");
        String id =sc.next();

        boolean flag =true;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                list.remove(i);
                System.out.println("删除成功！");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("未匹配到学号的学生！");
        }

    }

    public static void ModifyStudent(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生信息：");
        String id =sc.next();
        System.out.println("请输入姓名：");
        String name =sc.next();
        System.out.println("请输入年龄：");
        int age =sc.nextInt();
        System.out.println("请输入性别：");
        char gender =sc.next().charAt(0);
        System.out.println("请输入专业：");
        String major =sc.next();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setMajor(major);

        boolean flag =true;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                list.set(i,student);
                System.out.println("修改成功！");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("未匹配到学号的学生！");
        }

    }

    public static void QueryStudent(List<Student> list){
        System.out.println("学号\t姓名\t年龄\t性别\t专业");
        for(int i =0;i<list.size();i++){
            System.out.println(
                    list.get(i).getId()     +"\t"+
                            list.get(i).getName()   +"\t"+
                            list.get(i).getAge()    +"\t"+
                            list.get(i).getGender() +"\t"+
                            list.get(i).getMajor()
            );
        }
    }

    public static void main(String[] args) {

        List<Student> class225 = new ArrayList<>();

        boolean flag = true;
        while(flag){
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查询学生信息");
            System.out.println("5.退出学生信息");
            System.out.println("请选择使用的功能:");

            Scanner sc = new Scanner(System.in);
            String choice = sc.next();

            switch(choice){
                case"1":AddStudent(class225);break;
                case"2":RemoveStudent(class225);break;
                case"3":ModifyStudent(class225);break;
                case"4":QueryStudent(class225);break;
                case"5":System.out.println("谢谢使用!");flag=false;break;
                default:System.out.println("请选择正确选项！");break;
            }
        }

    }
}
