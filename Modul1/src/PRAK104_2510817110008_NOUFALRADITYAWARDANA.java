import java.util.Scanner;

public class PRAK104_2510817110008_NOUFALRADITYAWARDANA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abuInput = input.nextLine();

        System.out.print("Tangan Bagas: ");
        String bagasInput = input.nextLine();

        String[] abu = abuInput.split(" ");
        String[] bagas = bagasInput.split(" ");

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            char pAbu = abu[i].charAt(0);
            char pBagas = bagas[i].charAt(0);

            if (pAbu == pBagas) {
                continue;
            }

            if ((pAbu == 'B' && pBagas == 'G') ||
                    (pAbu == 'G' && pBagas == 'K') ||
                    (pAbu == 'K' && pBagas == 'B')) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}