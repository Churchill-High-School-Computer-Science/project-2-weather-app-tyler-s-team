public class Main {
    public static void main(String[] args) {

        WeatherAPI weather = new WeatherAPI();
        GUI g = new GUI(weather);
        g.createWindow();
        g.cyanBackground();
        g.setUpButton();
    }
}
