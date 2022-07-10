public class SumDigits {
    public static void main(String args[]){
        if (args.length != 4) {
            System.err.println("Program accepts only 4 arguments");
            return;
        }
        int w = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int z = Integer.parseInt(args[3]);
        int sum = w+ x + y + z;
        System.out.println("The sum of "+w+""+x+""+y+""+z+" is: "+sum);
    }
}
