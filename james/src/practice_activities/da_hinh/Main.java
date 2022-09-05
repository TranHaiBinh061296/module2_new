package practice_activities.da_hinh;

public class Main {
    public static void main(String[] args) {
        //1.Đa hình
//        Employee emp = new Employee();
//
//        Person p = new Employee(); // kiểu dữ liệu của cha,
//        emp.setName("Bình");
//        emp.setSalary(4.5);
//
//        p.setName("Lộc");
////        p.setSalary(4.5); //Không nằm trong chuỗi kế thừa
//
//        emp.information();
        //gọi hàm trong đối tượng Employee chứ k gọi trong hàm Person,
//                          nên chỉ lấy gtr đc từ đt Employee
//        p.information();
//
//        Person person = new Person();
//        person.information();

//        //2.instanceof
//        //check kiểu đối tượng đang trỏ đến thuộc lớp cha hay lớp con nào
//        //để từ đó ép kiểu đối tượng
//
//        Person per = new Person();
//        if (per instanceof Worker) { //false
//            ((Worker) per).salary();
//        } else {
//            System.out.println("not worker");
//        }
//
//        Person per2 = new Worker();
//        if (per2 instanceof Worker) { //true
//            ((Worker) per2).salary();
//        }
//        Person per3 = new Employee();
//        if (per3 instanceof Employee) { //true
//            ((Worker) per3).salary();
//        }
        //3.ép kiểu đối tượng
        // ép kiểu dữ liệu cha về con
        long x = 10;
        int i = (int) x;

        Worker worker = new Worker();
        Employee employee = new Worker(); //ép kiểu ngầm định, từ con lên cha
        Person person = new Worker();
        Object obj = new Worker(); //Object là class cha của mọi class

        worker.salary();
        if (employee instanceof Worker) {
            Worker ep = (Worker) employee; //ép kiểu tường minh, employee (cha) về worker(con)
            ep.salary();
        }
    }
}
