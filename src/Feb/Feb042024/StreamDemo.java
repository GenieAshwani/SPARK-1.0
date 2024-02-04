package Feb.Feb042024;

import java.util.*;
import java.util.stream.Collectors;


class Student
{
    String name;
    Integer id;

    Integer marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }

    public Student(String name, Integer id, Integer marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(400);
        list.add(50);
        list.add(600);
        list.add(87870);
        list.add(830);

        //config  --> filter map
        //processing

        list.stream().filter(i->i>100)
                .forEach(System.out::println);

        List<Integer> collect = list.stream().filter(i -> i > 400)
                .collect(Collectors.toList());
        System.out.println(collect);

        list.stream().map(i->i+1000)
                .forEach(System.out::println);

        Optional<Integer> max = list.stream().max(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(max);



        //list of students
        List<Student> listOfStudents= Arrays.asList(
                new Student("raj",533,0),
                new Student("Eshan",32,344),
                new Student("Deep",212,432),
                new Student("rishab",43,544),
                new Student("Nikhil",1,4567),
                new Student("kirtidas",4,765),
                new Student("Genie",2333,34343)
        );

        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        List<Student> collect1 = listOfStudents.stream()
                .sorted(Comparator.comparingInt(Student::getId)).collect(Collectors.toList());

        System.out.println(collect1);

        //HW
        // toMap, count,min marks,course
        //raj--->math
        //kirti--->eng
        //nikhil--->math
        //math--->2
        //eng--->3

    }
}
