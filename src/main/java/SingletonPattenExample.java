public class SingletonPattenExample {

    private static SingletonPattenExample instance = new SingletonPattenExample();

    private SingletonPattenExample(){

    }

    public static SingletonPattenExample getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World....this is Singleton");
    }
}

