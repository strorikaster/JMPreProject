import java.util.Scanner;
/**
 * Created by A.Zotov on 14.04.2017.
 */
public class CargoCars {

    public static void main(String[] args) {
        final int MAX_QUANTITY_OF_BOX_PER_CONTAINER = 27;
        final int MAX_QUANTITY_OF_CONTAINERS_PER_CARGOCAR = 12;
        int n = 1;

        Scanner s = new Scanner(System.in);

        System.out.println("Введите оличество ящиков, которые Вы хотите перевезти");
        int qtyOfBox = s.nextInt();
        int qtyOfContainers = qtyOfBox / MAX_QUANTITY_OF_BOX_PER_CONTAINER;
        int qtyOfCargoCars = qtyOfContainers / MAX_QUANTITY_OF_CONTAINERS_PER_CARGOCAR;

        if (qtyOfBox % MAX_QUANTITY_OF_BOX_PER_CONTAINER != 0) {
            qtyOfContainers++;
        }

        if (qtyOfContainers % MAX_QUANTITY_OF_CONTAINERS_PER_CARGOCAR != 0) {
            qtyOfCargoCars++;
        }

        System.out.println("Количество контейнеров необходимых для погрузки " + qtyOfBox + " ящиков равно " + qtyOfContainers );
        System.out.println("Количество грузовиков необходимых для погрузки " + qtyOfContainers + " контейнеров равно " + qtyOfCargoCars );

        for (int i = 1; i <= qtyOfCargoCars; i++) {


            System.out.println("Грузовик №" + i + "\n");


            for (int j = 1; j <= MAX_QUANTITY_OF_CONTAINERS_PER_CARGOCAR; j++) {
                qtyOfContainers--;
                if (qtyOfContainers >= 0) {
                    System.out.print("Контейнер №" + j + "\n");

                    for (int k = 1; k <= MAX_QUANTITY_OF_BOX_PER_CONTAINER; k++) {

                        if (n <= qtyOfBox) {
                            System.out.print("Ящик № " + n + "\n");
                            n++;
                        }else{
                            break;
                        }
                    }
                }else{
                    break;
                }
            }
        }
    }
}