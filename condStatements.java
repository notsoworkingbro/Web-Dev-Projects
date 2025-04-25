public class condStatements {
    // Practice Conditional Statements in java

    public static void main(String[] args){
        boolean isTrue = true;
        boolean isFalse = false;
        int number = 2;

        if(isTrue){
            System.out.println("it is true");
        }

        if(isFalse){
            
        } else {
            System.out.println("it is false");
        }

        if(isFalse){

        } else if(isTrue) {
            System.out.println("second else if statement is true");
        } else {

        }

        switch (number){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
