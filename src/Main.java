public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("initial state > " + a);

        a = a + 10; // update
        System.out.println("adding 10 > " + a);

        System.out.println(a + 10); // 20 + 10 = 30

        System.out.println(a);

        a++; // a = a + 1
        ++a; // a = a + 1

        // a++ => (a = a + 1)
        // aの変更した値は、2回目呼ぶ時に反映される
        System.out.println(a++);

        // ++a => (a = a + 1)
        // 先にaを更新して、すぐ更新値が反映する
        System.out.println(++a);

        // 下の出力結果に想像してくだざい
        int c = 5;
        int b = (++c) + 10 + (++c) + (c++);
        System.out.println(b);
    }
}