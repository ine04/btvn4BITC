public class App {
    public static void main(String[] args) throws Exception {
        StringApp stringApp = new StringApp();
        
        //Bai1
        stringApp.CheckSubString("Hello, welcome to the world of Java!", "Java");
        
        //Bai2
        int count = stringApp.CountCharInString("Hello, welcome to the world of Java!", 'o');
        System.out.println("So lan xuat hien cua ky tu 'o' la: " + count);

        //Bai3
        String upperStr = stringApp.UpperCaseToString("Hello, welcome to the world of Java!");
        System.out.println("Chuoi duoc in hoa: " + upperStr);


        //Bai4
        stringApp.isPalindrome("radar");
        stringApp.isPalindrome("BITC");


    }
}
