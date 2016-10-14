import java.util.Scanner;

public class MainTestFSM {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter data");

            HandleData handle = new HandleData();
            Scanner sc = new Scanner(System.in);
            InData data = new InData(sc.nextLine());
            StateMachine sm = new StateMachine();
            sm.accept(handle.handleData(data));

            System.out.println("Current state is " + sm.getState());
        }
    }
}
