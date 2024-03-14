
public class VersionFind {
    public static void main(String[] args) {

        String a = "0.0.0.0.0.0.0.0.0.0.0.0.1.0.0";
        String b = "0.0.0.0.0.0.0.0.0.0.0.0.1";

        int minLength = Math.min(a.length(), b.length());
        // int maxLength = Math.max(a.length(), b.length());

        int count = 0;
        // int counta = 0;
        // int countb = 0;

        for (int i = 0; i < minLength;) {
            if (a.charAt(i) < b.charAt(i)) {
                System.out.println("B is higher version");
                break;
            } else if (a.charAt(i) > b.charAt(i)) {
                System.out.println("A is higher version");
                break;
            } else {
                count++;
                if (count < minLength)
                 {
                    // System.out.println(count);
                    i++;

                }
                 else {

                    if (a.length() > b.length()) {
                        System.out.println("A is higher version");
                        break;
                    } else {
                        System.out.println("B is higher version");
                        break;
                    }
                }

            }

        }

        // count++;
        //
        // System.out.println(count);
        // i++;
        // }
        // else{
        // System.out.println("A is higher version");
        // break;
        // }
        // if (a.charAt(i) == b.charAt(i)){
        // i++;

        // }

        // for (int i = 0; i < minLength; i++) {

        // // System.out.println(a.charAt(i));
        // // System.out.println(b.charAt(i));

        // if (a.charAt(i) == b.charAt(i)) {
        // System.out.println("A is higher version");
        // counta++;

        // }
        // else if (a.charAt(i) < b.charAt(i))
        // {
        // System.out.println("B is higher version");
        // countb++;
        // }
        // else{
        // counta++;
        // }
        // // System.out.println(a.charAt(i));

        // }

        // for (int i = 0; i <= minLength; i++) {

        // System.out.println(a.charAt(i));
        // if (a.charAt(i) == b.charAt(i)) {
        // System.out.println("A is higher version");

        // } else {
        // System.out.println("B is higher version");
        // }

        // }

        // if (a.length() < b.length()) {

        // int len = a.length();
        // // System.out.println(len);

        // for (int i = 1; i <= len; i++) {

        // if (a.charAt(i) == b.charAt(i)) {
        // System.out.println("A is higher version");

        // } else {
        // System.out.println("B is higher version");
        // }
        // }
        // } else {
        // int len = b.length();

        // // System.out.println(len);

        // for (int i = 1; i <= len; i++) {

        // if (a.charAt(i) == b.charAt(i)) {
        // System.out.println("A is higher version");

        // } else {
        // System.out.println("B is higher version");
        // }
        // }
        // }

    }

}
