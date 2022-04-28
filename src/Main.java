public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        float index1 = service.calculate(1.88F, 70);

        System.out.printf("Индекс массы тела: %.2f", index1);
        if (index1 < 16)
            System.out.println(" - Выраженный дефицит массы тела");
        if (index1 >= 16 && index1 < 18.5)
            System.out.println(" - Недостаточная масса тела");
        if (index1 >= 18.5 && index1 < 25)
            System.out.println(" - Нормальная масса тела");
        if (index1 >= 25 && index1 < 30)
            System.out.println(" - Избыточная масса тела (предожирение)");
        if (index1 >= 30 && index1 < 35)
            System.out.println(" - Ожирение 1-ой степени");
        if (index1 >= 35 && index1 < 40)
            System.out.println(" - Ожирение 2-ой степени");
        if (index1 >= 40)
            System.out.println(" - Ожирение 3-ой степени");

    }
}
