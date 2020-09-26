package exam.ocpjp.v1.q002;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Student {
    String course, name, city;
    public Student (String name, String course, String city) {
    this.course = course; this.name = name; this.city = city;
    }
    public String toString() {
    return course + ":" + name + ":" + city;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
}
public class Test {
    
       
        
    public static void main(String[] args) {
        List<Student> stds = Arrays.asList(
                new Student ("Jessy", "Java ME", "Chicago"),
                new Student ("Helen", "Java EE", "Houston"),
                new Student ("Mark", "Java ME", "Chicago"));
        stds.forEach(System.out::println);
        System.out.println();
        
        Map<String,List<Student>> map = stds.stream().collect(Collectors.groupingBy(Student::getCourse));
        map.forEach((a,b)->System.out.println(a));

    }

}
