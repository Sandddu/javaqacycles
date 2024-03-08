import ru.netology.javaqa.javaqacycles.services.RestService;

public class Main {

        public static void main(String[] args) {

            RestService service = new RestService();

            System.out.println(service.calcMonth(10_000, 3000, 20_000));
            System.out.println(service.calcMonth(100_000, 60_000, 150_000));
        }
    }

