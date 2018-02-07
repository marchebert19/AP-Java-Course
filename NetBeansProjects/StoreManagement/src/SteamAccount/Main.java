package SteamAccount;

public class Main {
    public static void main(String[] args) {
       String username = "User";
       changeUsername(username);
       System.out.println(username);
        
       SteamAccount myAccount = new SteamAccount("SlinkLink", 12345, 600.00);
       SteamAccount myAccount2 = new SteamAccount("Mrs.Dbb", 67890, 250.00);
       SteamAccount objectPassing = new SteamAccount("Obj", 13579, 1000.00);
       changeUsername(objectPassing);
       System.out.println(objectPassing.username);
       myAccount.buyGame(12345, 5, 3);
       myAccount2.buyGame(67890); 
       
       System.out.println(myAccount.accountBalance());
       System.out.println(SteamAccount.totalGamesBought);
    }
    public static void changeUsername(String username){
        username = "newUsername"; 
    }
    public static void changeUsername(SteamAccount uhOh){
        uhOh.username = "Error";
    }   
}
