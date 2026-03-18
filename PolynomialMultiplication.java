import java.util.Scanner;

public class PolynomialMultiplication {

    static int[] multiply(int[] p, int[] q) {
        int m = p.length - 1;
        int n = q.length - 1;
        int[] r = new int[m + n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                r[i + j] += p[i] * q[j];
            }
        }
        return r;
    }

    static void printPoly(int[] poly) {
        int deg = poly.length - 1;
        boolean firstTerm = true;

        for (int i = deg; i >= 0; i--) {
            int coef = poly[i];
            if (coef == 0) continue;

            if (!firstTerm) {
                if (coef > 0) System.out.print(" + ");
                else System.out.print(" - ");
            } else {
                if (coef < 0) System.out.print("-");
            }

            int absCoef = Math.abs(coef);

            if (!(absCoef == 1 && i != 0)) {
                System.out.print(absCoef);
            }

            if (i > 0) {
                System.out.print("x");
                if (i > 1) System.out.print("^" + i);
            }

            firstTerm = false;
        }

        if (firstTerm) System.out.print("0");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter degree of polynomial P: ");
        int degP = sc.nextInt();

        int[] P = new int[degP + 1];

        System.out.println("Enter coefficients of P from x^0 to x^" + degP + ":");
        for (int i = 0; i <= degP; i++) {
            P[i] = sc.nextInt();
        }

        System.out.print("Enter degree of polynomial Q: ");
        int degQ = sc.nextInt();

        int[] Q = new int[degQ + 1];

        System.out.println("Enter coefficients of Q from x^0 to x^" + degQ + ":");
        for (int i = 0; i <= degQ; i++) {
            Q[i] = sc.nextInt();
        }

        int[] R = multiply(P, Q);

        System.out.print("\nP(x) = ");
        printPoly(P);

        System.out.print("Q(x) = ");
        printPoly(Q);

        System.out.print("R(x) = P(x) * Q(x) = ");
        printPoly(R);

        sc.close();
    }
}