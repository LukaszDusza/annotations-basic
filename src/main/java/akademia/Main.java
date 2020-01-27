package akademia;

public class Main {

  public static void main(String[] args) {
    Movie movie = new Movie();
    movie.setTitle("Matrix");
    movie.setAuthor("Lana & Lilly Wachowski");
    movie.setYearOfProduction("31-03-1999");
    movie.setTags(new String[] {"wachowski", "neo", "trinity", "scifi movie"});

    ClassToJsonConverter jsonConverter = new ClassToJsonConverter();
    String jsonString = jsonConverter.convertToJson(movie);

    System.out.println(jsonString);

  }
}
