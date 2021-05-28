package designPattern.Singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化。
 * 缺点：将一个类搞成了枚举，不容易区分
 */
public enum Singleton_enum {
    INSTANCE;

    public void m() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton_enum.INSTANCE.hashCode());
            }).start();
        }
    }
}