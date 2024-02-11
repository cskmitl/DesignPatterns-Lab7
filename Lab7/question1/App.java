public class App {
    public static void main(String[] args) {
        IImage myImage = new LazyImageProxy("test.jpg");

        myImage.display();
    }
}
