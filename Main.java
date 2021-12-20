import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println(RequestSender.sendCityIdRequest("Novosibirsk"));
        System.out.println(RequestSender.getTempRequest("Novosibirsk"));


    }

}
