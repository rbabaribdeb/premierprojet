package Revision;

public class ExempleRandom {
    public static void main(String[] args) {
        double d = Math.random() * 5;
System.exit(5);
        int val = (int)d;
        System.out.println(val);
        // 0,1,2,3,4,5,6,7,8,9
        String message[] =
                        {
                        "Heyyy toi",
                        "Allo ca va",
                                "Bonjour toi",
                                "Comment ca va",
                        "Yooo ... "
                        };
        System.out.println(message[val]);



    }
}
