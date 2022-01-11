public class SealedClasses {
    public static void main(String[] args) {
//        if (person instanceof Employee) {
//            return ((Employee) person).getEmployeeId();
//        }
//        else if (person instanceof Manager) {
//            return ((Manager) person).getSupervisorId();
//        }
    }
}

final class Employee extends Person {
}

non-sealed class Manager extends Person {
}

abstract sealed class Person
        permits Employee, Manager {

    //...
}