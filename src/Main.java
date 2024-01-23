import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        String firstName = "Karel";
        String surname = "Novák";
        LocalDate birthdate = LocalDate.of(1970,3,12) ;
        long numberOfContracts = 90;
        long tunOfSeldCarot = 400;
        String city = "Brno";
        String licensePlate = "5B5 5555";
        double consumptionPer100km = 5.6;
        String IPAdress = "56.145.91.188";
        long amountPerContract = tunOfSeldCarot/numberOfContracts;
        System.out.println("Průměrné množství mrkve prodané na jednu smlouvu je "+amountPerContract+"t.");
    }
}