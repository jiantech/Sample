package jsonhandling;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonMapping {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonFile = new JsonMapping().getClass().getClassLoader().getResource("Sample.json").getPath();
        try {
            Profile profile = mapper.readValue(new File(jsonFile), Profile.class);
            //System.out.println(profile.toString());
            System.out.println(profile.getAddress().toString());

            BasicProfile basicProfile = new BasicProfile(profile.getName(), profile.getDob());
            System.out.println(basicProfile.toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Address address = new Address();
        address.setDoor("24");
        address.setStreet("jdfskdf");
        address.setArea("Pilankalai");
        address.setCity("Thuckalay");
        address.setState("TN");

        try {
            System.out.println(mapper.writeValueAsString(address));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
