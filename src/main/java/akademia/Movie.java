package akademia;

@ModelToJson
public class Movie {

  @JsonElement
  private String title;

  @JsonElement
  private String author;

  @JsonElement(key = "production")
  private String yearOfProduction;

  @ArrayToString
  @JsonElement
  private String[] tags;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getYearOfProduction() {
    return yearOfProduction;
  }

  public void setYearOfProduction(String yearOfProduction) {
    this.yearOfProduction = yearOfProduction;
  }

  public String[] getTags() {
    return tags;
  }

  public void setTags(String[] tags) {
    this.tags = tags;
  }
}
