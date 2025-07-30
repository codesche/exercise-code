package solution.jun29_2025;

public class Test12 {
    // equals() 는 문자열 내용 비교, 그러므로 true
    // '==', 동일한 객체일 때만 true
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "Programming";
        String str3 = new String("Programming");
        System.out.println(str1==str2);          // true
        System.out.println(str1==str3);          // false
        System.out.println(str1.equals(str3));   // true
        System.out.println(str2.equals(str3));   // true
    }
}
