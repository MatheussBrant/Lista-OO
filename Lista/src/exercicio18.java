 class Ponto {
    int x;
    int y;
}

public class exercicio18 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        p1.x = 5;
        p1.y = 10;

        Ponto p2 = new Ponto();
        p2.x = 20;
        p2.y = 30;

        trocarValores(p1, p2);

        System.out.println("Ponto 1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Ponto 2: (" + p2.x + ", " + p2.y + ")");
    }

    public static void trocarValores(Ponto p1, Ponto p2) {
        int tempX = p1.x;
        int tempY = p1.y;

        p1.x = p2.x;
        p1.y = p2.y;

        p2.x = tempX;
        p2.y = tempY;
    }
}
