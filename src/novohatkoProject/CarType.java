package novohatkoProject;

public enum CarType {
    Sedan(1500, 3000, "Lada Granta", "Volvo V60", "Renault Logan", "Lifan Solano"),
    Limousine(4600, 7680, "ЗИЛ-41047", "Mercedes-Benz W100", "Lincoln Town Car"),
    SportCar(2000, 7993, "Mazda", "Mclaren 570GT", "Bugatti Vision Gran Turismo", "Acura NSX"),
    CrossOver(1500, 2400, "Renault Duster", "Chevrolet Niva", "Nissan Terrano"),
    HatchBack(900, 2000, "Skoda Fabia", "KIA Ceed", "Renault Sandero");

    private String[] cars;
    private int minV;
    private int maxV;

    CarType(int minV, int maxV, String... cars) {
        this.cars = cars;
        this.minV = minV;
        this.maxV = maxV;
    }

    public String[] getCars() {
        return cars;
    }

    public int getMinV() {
        return minV;
    }

    public int getMaxV() {
        return maxV;
    }
}
