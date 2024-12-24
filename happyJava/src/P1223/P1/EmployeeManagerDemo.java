package P1223.P1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee{
    private String name;
    private String id;
    private String department;

    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee(String name, String id, String department){
        this.name=name;
        this.id=id;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
class EmployeeManager{
    private String name;
    private String id;
    private String department;

    List<Employee> employeeList = new ArrayList<>();

    public EmployeeManager(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void addEmployee(Employee employee){

        employeeList.add(employee);
    }

    public void findEmployee(String id){
        Employee result=null;
        for(Employee e : employeeList){
            if(e.getId().equals(id)) {
                result = e;
                System.out.println(result);
            }
        }
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EmployeeManager that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(id, that.id) && Objects.equals(department, that.department) && Objects.equals(employeeList, that.employeeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, department, employeeList);
    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee("홍길동", "E01", "HR"));
        manager.addEmployee(new Employee("김철수", "E02", "Marketing"));
        manager.addEmployee(new Employee("홍길동", "E01", "HR")); // 중복 추가 시도

        manager.findEmployee("E01");
        System.out.println("--------------------");

        manager.removeEmployee(new Employee("홍길동", "E01", "HR"));
        System.out.println("--------------------");
        manager.findEmployee("E01");
    }
}

