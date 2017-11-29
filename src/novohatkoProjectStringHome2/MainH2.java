package novohatkoProjectStringHome2;

public class MainH2 {
    public static void main(String[] args) {
        /*
        Дан String. Нужно вернуть true, если она заканчивается на - "ly".
*/
        System.out.println(isLy("asdbbnly"));
    }
    static boolean isLy(String s){
        boolean isLy = false;
        if(s.endsWith("ly")){
            isLy = true;
        }
        return isLy;
    }
}
