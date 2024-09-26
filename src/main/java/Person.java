public class Person {
  private   String name;
   private int age;
  private   String gender;

 private String setPrefixWithGender(){
     return switch (gender){
         case "male" -> "Mr. ";
         case "female" -> "Ms. ";
         default -> throw new IllegalStateException("Unexpected value: " + gender);
     };
 }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return setPrefixWithGender() + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
