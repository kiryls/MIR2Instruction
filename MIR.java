import java.util.Scanner;
import java.util.StringTokenizer;


public class MIR {
    public static void main(String[] args) {
        String objref = "43 4f 4e 47 52 41 54 53 2c 20 4e 4f 57 20 55 52 20 47 41 59";
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(objref);
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < 20; i++) 
            output.append((char) Integer.parseInt(st.nextToken(" "), 16));

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

        sc.close();

        System.out.print("Processing your request");

            for(int i = 0; i < 5; i++) {
                System.out.print(" . ");
                try {
                    Thread.sleep(2000);
                }
                catch (Exception e) {
                System.err.println("boh");
            }
            
        }

        System.out.println("\n\n");
  
        Out.show(output.toString());

    }
}