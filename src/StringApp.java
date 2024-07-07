public class StringApp{
    public void CheckSubString(String mainString, String subString) {     
       
        if (mainString.contains(subString)) { // Sd pthuc contains() của lớp String để ktra sub có trong main kh
            System.out.println("Chuoi con '" + subString + "' co trong chuoi chinh.");
        } else {
            System.out.println("Chuoi con '" + subString + "' khong co trong chuoi chinh.");
        }
    }

    public int CountCharInString(String mainString, char searchChar) {
        int count = 0;  

        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;  
    }

    public String UpperCaseToString(String mainString) {
        return mainString.toUpperCase();
    }

    public void isPalindrome(String mainString) {
        int leftIndex = 0;
        int rightIndex = mainString.length() - 1;

        // Kra các ktự ở 2 chỉ số có giống nhau hay ko
        while (leftIndex < rightIndex) {
            if (mainString.charAt(leftIndex) != mainString.charAt(rightIndex)) {
                System.out.println("Chuoi: " + mainString + " khong phai chuoi doi xung");
                return;
            }
            leftIndex++;
            rightIndex--;
        }
        System.out.println("Chuoi: " + mainString + " la chuoi doi xung");
    }
}