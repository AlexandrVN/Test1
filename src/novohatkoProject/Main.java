package novohatkoProject;

public class Main {

    public static void main(String[] args) {
    /*Реализовать перечисление типов автомобилей (CarType):
    Sedan (Lada Granta, Volvo V60, Renault Logan, Lifan Solano)
    Limousine (ЗИЛ-41047, Mercedes-Benz W100, Lincoln Town Car)
    SportCar (Mazda, Mclaren 570GT, Bugatti Vision Gran Turismo, Acura NSX)
    CrossOver (Renault Duster, Chevrolet Niva, Nissan Terrano)
    HatchBack (Skoda Fabia, KIA Ceed, Renault Sandero)
    Реализовать методы:
    получения марок конкретного типа авто.
    получения макс-го/мин-го объема двигателя для конкретного типа авто.
    Вывести все модели, всех типов.*/

        //получения марок по типу авто "SportCar"
        CarType sportCar = CarType.SportCar;
        System.out.printf("Марки авто по типу \"%s\":\n", sportCar.name());
        for (String cars : sportCar.getCars()) {
            System.out.println(cars);
        }

        //получения макс-го/мин-го объема двигателя по типу авто "HatchBack"
        CarType hatchBack = CarType.HatchBack;
        System.out.printf("Объем двигателя по типу авто \"%s\" от %d см\u00B3 до %d см\u00B3\n", hatchBack.name(), hatchBack.getMinV(), hatchBack.getMaxV());

        //вывод всех моделей всех типов
        for (CarType carType : CarType.values()) {
            System.out.print(carType.name() + ": ");
            for (String cart : carType.getCars()) {
                System.out.print(cart + ", ");
            }
            System.out.println();
        }
    }
}
