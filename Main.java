public class Main {
    public static void main(String[] args) {
        printAreaResults();
        String grade = "D";

        switch (grade) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("You got an Asian F!");
                break;
            case "C":
                System.out.println("You passed. Barely.");
                break;
            case "D":
                System.out.println("You should work harder.");
                break;
            case "F":
                System.out.println("You didnt pass this time. Work hard stay consistent.");
                break;
            default:
                System.out.println("Invalid grade entered.");
        
    }

    public static void rectangleArea(){
        int length = 5;
        int width = 10;
        System.out.println(length*width);
    }
    public static void triangleArea(){
        System.out.println();
        int sideOne = 3;
        int sideTwo = 6;
        int sideThree = 2;
        System.out.println((sideOne * sideTwo) / sideThree);
    }
    public static void printAreaResults(){
        rectangleArea();
        triangleArea();

    }

}

