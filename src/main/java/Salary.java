public class Salary {

    double getSum(Employee[] employeeArray) {
        double sum = 0;
        for (Employee employee : employeeArray) {
            sum = employee.getSalary() + sum;
        }
        return  sum;
    }
}


