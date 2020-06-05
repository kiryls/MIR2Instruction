import java.util.Scanner;


public class MIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] MIR = {
            "ADDR(0xHH hex)",
            "JMPC",
            "JAMN",
            "JAMZ",
            "F0",
            "F1",
            "ENA",
            "ENB",
            "INVA",
            "INC",
            "H",
            "OPC",
            "TOS",
            "CPP",
            "LV",
            "SP",
            "PC",
            "MDR",
            "MAR",
            "WRITE",
            "READ",
            "FETCH",
            "B (4 bits DECODER)"
        };

        for(int i = 0; i < MIR.length; i++) {
            System.out.println("Insert: " + MIR[i]);
            String n = sc.nextLine();
        }
        System.out.print("Processing your request");
        for(int i = 0; i < 900000000; i++) {
            if(i % 300000000 == 0)
                System.out.print(" . ");
        }
        System.out.println();
        System.out.println("CONGRATS, NOW UR GAY");
    }
}