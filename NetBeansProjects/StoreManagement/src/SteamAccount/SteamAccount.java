package SteamAccount;

public class SteamAccount {
    public int videoGames = 0;
    public int AAAvideoGames = 0;
    public static int videoGameCost = 30;
    public static int AAAvideoGameCost = 60;
    public static int totalGamesBought = 0;
    public double taxes = 0;
    private double accountBalance;
    private int password;
    public String username; 
 
    public SteamAccount() {
        this.accountBalance = 0;
        this.password = 11111;
    }
    public SteamAccount(String username, int password, double accountBalance){
        this.password = password;
        this.accountBalance = accountBalance;
        this.username = username;
    }
    public void changePassword(int newPassword){
        if(newPassword >= 10000 && newPassword <= 999999){
            password = newPassword;
        }
    }
    public void buyGame(int newPassword, int videoGameNum, int AAAvideoGameNum){
        if(newPassword == password){
            if(accountBalance - ((videoGameCost * videoGameNum) + (AAAvideoGameCost * AAAvideoGameNum)) < 0){
                System.out.println("Not enough funds!");
            }
            else{
               taxes = ((videoGameCost * videoGameNum) + (AAAvideoGameCost * AAAvideoGameNum)) * 0.09;
               accountBalance = accountBalance - (((videoGameCost * videoGameNum) + (AAAvideoGameCost * AAAvideoGameNum)) + taxes);
               totalGamesBought += (videoGameNum + AAAvideoGameNum);    
            }
        }
        else{
            System.out.println("Incorrect Password");
        } 
    }
    public void buyGame(int newPassword){
        buyGame(newPassword, 1, 0);
    }
    public double accountBalance() {
        return accountBalance;    
    }
    public String getUserame() {
        return username; 
    }
}
 