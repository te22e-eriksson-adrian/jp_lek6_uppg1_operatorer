import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("Skriv ett heltal: ");
        int tal1 = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Skriv ett till heltal: ");
        int tal2 = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.println("Är tal1 och tal2 samma tal?: "+(tal1==tal2));
        System.out.println("Är tal1 mindre än tal2?: "+(tal1<=tal2));
        System.out.println("Är tal1 större än tal2?: "+(tal1>=tal2));

        //b
        System.out.println("           ");
        int[] talen = {4,5,2};
        System.out.println("1:a elementet är större än 2:a elemnetet: "+(talen[0]>talen[1])+" ELLER större än 3:e elementet: "+(talen[0]>talen[2]));
        System.out.println("1:a elementet är mindre än 2:a elemnetet: "+(talen[0]<talen[1])+" ELLER större än 3:e elementet: "+(talen[0]<talen[2]));
        System.out.println("1:a elementet är lika med än 2:a elemnetet: "+(talen[0]==talen[1])+" ELLER större än 3:e elementet: "+(talen[0]==talen[2]));

        //c
        System.out.println("      ");
        System.out.print("Inmata valfritt heltal här: ");
        int tal_x = tangentbord.nextInt();
        tangentbord.nextLine();
        int ursp_tal = tal_x;
        tal_x+=7;
        tal_x*=2;
        tal_x-=6;
        tal_x/=2;
        tal_x+=3;
        tal_x-=ursp_tal;
        System.out.println("Talet du skrev in: "+ursp_tal);
        System.out.println("Svar: "+tal_x);
        tangentbord.close();
    }
}
