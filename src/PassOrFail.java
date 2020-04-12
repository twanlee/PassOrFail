import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        int size;
        int[] listStudent;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number of students: ");
            size = sc.nextInt();
            if (size > 30) System.out.println("Cannot process more higher number of students!");
        } while (size > 30);
        listStudent = new int[size];
        int i = 0;
        while (i<listStudent.length){
            System.out.println("Enter a mark of student: ");
            listStudent[i] = sc.nextInt();
            i++;
        }
        for(int x: listStudent){
            System.out.print(" " + x);
        }
        int count=0;
        for(i=0; i<listStudent.length; i++){
            if(listStudent[i]>=5 && listStudent[i]<=10){
                count++;
            }
        }
        System.out.println("Number of students pass are: " + count);
    }
}
