package software.testing.java.collection;

public class Arrays {
    public static void main(String[] args) {

        String[] strArr=new String[4];

        int[] numbers={1,2,3,4,5};

        String[] herbs={"Thymes","Rosemary","Basil","Coriander"};
        String[] months=new String[12];
        //for loop
        for(int i=0; i< herbs.length; i++){

            if(i==1){
                herbs[i]=null;
            }
            System.out.println(herbs[i]);
        }

        System.out.println("---------------------------");
        for(String str:herbs){
            System.out.println(str);
        }

        for(String str:herbs){
            System.out.println(str);
            if(str.equals("Mint")){
                System.out.println("Mint is good");
            }
        }
        for(int i:numbers){
            System.out.println(i*10);
        }
        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
      // herbs[5]="Rosemary";


    }
}
