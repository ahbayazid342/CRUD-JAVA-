import java.sql.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws SQLException {
        Function function = new Function();
        function.function();

        Scanner scanner = new Scanner(System.in);


        int choice = scanner.nextInt();

        switch (choice){

            case 1:
                Add add = new Add();
                add.addStudent();
                break;

            case 2:
                Update update = new Update();
                update.updateStudent();
                break;

            case 3:
                Delete delete = new Delete();
                delete.deleteStudent();
                break;

            case 4:
                Show show = new Show();
                show.showStudent();
                break;
        }

    }
}
