package senac.java.Domain;
import java.util.Scanner;
public class Users {



    static public int id = 0;
    static public String name = "";
    static public String lastName = "";
    static public int age = 0;
    static  public String address = "";
    static  public int phoneNumber = 0;
    static  public String email = "";
    static   public String password = "";
    static  public int cpf = 0;

    public Users(){

    }

    public Users(String name, String lastName, int age, String address, int phoneNumber,
                 String email, String password, int cpf){

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.cpf = cpf;
        this.email = email;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
       // forçar o programa a pegar o id de referência e atribuir esse valor sem sobrescrever o outro valor
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(){
        this.address = address;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(){
        this.cpf = cpf;
    }

}
