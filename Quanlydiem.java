import java.util.Scanner;

public class Quanlydiem
{
    private String[] names;
    private double[] scores;
    private int n;
    public Quanlydiem()
    {
        System.out.print("bao nhieu hoc sinh: ");
        Scanner sc1 = new Scanner(System.in);
        n = sc1.nextInt();
        sc1.nextLine();
        System.out.println();
        

        names = new String[n];
        scores = new double[n];    

        for(int i = 0; i < n; i++)
        {
            System.out.print("ten hoc sinh " + (i + 1) +": ");
            names[i] = sc1.nextLine();
           // System.out.println();

            System.out.print("diem hoc sinh " + (i + 1) +": ");
            scores[i] = sc1.nextDouble();
            sc1.nextLine();
            System.out.println();
        }
    }

    public void danhsach()
    {
        System.out.println();
        System.out.println("Danh sach sinh vien");
        for(int i = 0; i < n; i++)
        {
            System.out.print(names[i] + " - ");
            System.out.print(scores[i] + " - ");
            if(scores[i] >= 5) System.out.println("dat");
            else System.out.println("rot");
        }
    }

    public void avgn()
    {
        System.out.println();
        System.out.print("Diem trung binh: ");
        double avg = 0;
        for(int i = 0; i < n; i++)
        {
            avg += scores[i];
        }
        System.out.println((avg / n));
    }

    public void maxn()
    {
        System.out.println();
        System.out.print("Diem lon nhat: ");
        double max = scores[0];
        for(int i = 0; i < n; i++)
        {
            if(max < scores[i]) max = scores[i];
        }
        System.out.println(max);
    }

    
    public static void main(String[] args)
    {
        Quanlydiem qld = new Quanlydiem();
        qld.danhsach();
        qld.avgn();
        qld.maxn();
    }
}