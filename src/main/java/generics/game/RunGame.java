package generics.game;

public class RunGame {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Иван", 13);
        Schoolar schoolar2 = new Schoolar("Мария", 15);

        Student student1 = new Student("Николай", 20);
        Student student2 = new Student("Ксения", 18);

        Employee employee1 = new Employee("Заур", 32);
        Employee employee2 = new Employee("Денис", 52);

        Team<Schoolar> schoolarTeam = new Team<>("Драконы");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        schoolarTeam.addNewParticipant(student1);
//        schoolarTeam.addNewParticipant(employee1);

        Team<Student> studentTeam = new Team<>("Вперед!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Работяги");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> anotherTeam  = new Team<>("Непонятные челы");
//        anotherTeam.addNewParticipant("мутный");

        Team<Schoolar> schoolarTeam2 = new Team<>("Мудрецы");
        Schoolar schoolar3 = new Schoolar("Сергей", 12);
        Schoolar schoolar4 = new Schoolar("Оля", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

//        schoolarTeam.playWith(studentTeam);
        schoolarTeam.playWith(schoolarTeam2);
    }
}
