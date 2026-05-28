package Nik.learning.__May;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Movie {
    private Integer id;
    private String name;
    private Integer year;
    private String genre;
    private List<String> cast;
    private Map<String, Integer> castSalary;

    public  void postInit(){
        System.out.println("Opening  a delivery stream");
    }

    public void destroy(){
        System.out.println("Closing a delivery stream");
    }
}
