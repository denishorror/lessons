package generics.game;

public class RunGame {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("����", 13);
        Schoolar schoolar2 = new Schoolar("�����", 15);

        Student student1 = new Student("�������", 20);
        Student student2 = new Student("������", 18);

        Employee employee1 = new Employee("����", 32);
        Employee employee2 = new Employee("�����", 52);

        Team<Schoolar> schoolarTeam = new Team<>("�������");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        schoolarTeam.addNewParticipant(student1);
//        schoolarTeam.addNewParticipant(employee1);

        Team<Student> studentTeam = new Team<>("������!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("��������");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> anotherTeam  = new Team<>("���������� ����");
//        anotherTeam.addNewParticipant("������");

        Team<Schoolar> schoolarTeam2 = new Team<>("�������");
        Schoolar schoolar3 = new Schoolar("������", 12);
        Schoolar schoolar4 = new Schoolar("���", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

//        schoolarTeam.playWith(studentTeam);
        schoolarTeam.playWith(schoolarTeam2);
    }
}
