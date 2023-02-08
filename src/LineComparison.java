import java.util.Scanner;
//Java program to get cartesian line lengths
public class LineComparison {
    public int lengthCalculate(int x1,int y1, int x2, int y2){ // Calculate length and return
        int length = (int)Math.pow((x2-x1),2) + (int)Math.pow((y2-y1),2);
        return (int)Math.sqrt(length);
    }
    public void checkEqual(int line1, int line2){       // Check quality and display
        String firstLine = new String();
        String secondLine = new String();
        firstLine = (line1 + "0");
        secondLine = (line2 + "0");
        if(firstLine.equals(secondLine)==true){
            System.out.println("Both lines are equal");
        }else {
            System.out.println("Both lines are not equal");
        }
    }
    public static void main(String[] args) {

        System.out.println("HWelcome to Line Comparison Computation Program on Master Branch");
        Scanner input = new Scanner(System.in);
        LineComparison length = new LineComparison();
        int x1,y1,x2,y2;
        int x3,y3,x4,y4;
        System.out.println("Enter coordinates of first line\nKindly enter first coordinates x1 and y1: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println("Kindly enter second coordinates x2 and y2: ");
        x2 = input.nextInt();
        y2 = input.nextInt();
        System.out.println("Enter coordinates of second line\nKindly enter first coordinates x3 and y3: ");
        x3 = input.nextInt();
        y3 = input.nextInt();
        System.out.println("Kindly enter second coordinates x4 and y4: ");
        x4 = input.nextInt();
        y4 = input.nextInt();
        Integer line1 =  length.lengthCalculate(x1,y1,x2,y2);
        Integer line2 =  length.lengthCalculate(x3,y3,x4,y4);
        length.checkEqual(line1,line2);
    }
}