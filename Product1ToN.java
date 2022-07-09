public class Product1ToN {
    public static void main(String[] args){
        int product= 1;
        int product1= 1;
        int product2= 1;
        int product3= 1;
        int lowerbound= 1;
        int upperbound =11;

        for(int number =lowerbound; number<=upperbound; number++){
            product=product*number;
        }
        upperbound++;
        for (int number= lowerbound; number<upperbound;number++){
            product1=product1*number;
        }
        upperbound++;
        for (int number= lowerbound; number<upperbound;number++){
            product2=product2*number;
        }
        upperbound++;
        for (int number= lowerbound; number<upperbound;number++){
            product3=product3*number;
        }
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

    }
}
