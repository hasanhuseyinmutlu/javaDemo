public class UserManager {
    public void signIn (User user) {
        System.out.println("Kayıt olundu :" + user);
    }
    public void logIn(User user) {
        System.out.println("giriş yapıldı " +user.lastName);
    }
    public void logOut(User user) {
        System.out.println("çıkış yapıldı " +user.lastName);
    }
    public void delete(User user) {
        System.out.println("Hesap silindi" +user.Id);
    }
}
