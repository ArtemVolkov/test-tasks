package ua.volkov;

import java.util.Scanner;

public class Main {

    private int numberOfPaths;
    private String[] paths;
    private  World world;

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    public void init(){
        Scanner scanner = new Scanner(System.in);
        inputTests(scanner);
    }

    private void inputCities(Scanner scanner){
       // System.out.println("numbof cities");
        int numberOfCities = scanner.nextInt();
        //read each city and add to the world
        for(int i=0; i<numberOfCities; i++){
          //  System.out.println("cityname");
            scanner.nextLine();
            String cityName = scanner.nextLine();
          //  System.out.println("numbof neighbors ");
            int numberOfNeighbors = scanner.nextInt();
            int [][]cityNeighbors = new int[numberOfNeighbors][2];
            for(int j=0; j<numberOfNeighbors; j++){
                cityNeighbors[j][0] = scanner.nextInt();
                cityNeighbors[j][1] = scanner.nextInt();
            }
            City newCity= new City(i+1, cityName, cityNeighbors );
            world.addCity(newCity);
        }
    }

    private void inputPaths(Scanner scanner){
        //System.out.println("numbof Paths");
        numberOfPaths = scanner.nextInt();
        scanner.nextLine();
        paths = new String[numberOfPaths];
        for(int i=0; i<numberOfPaths;i++){
            paths[i]= scanner.nextLine();
        }
    }
    private void inputTests(Scanner scanner){
        //System.out.println("numbof test");
        int numberOfTests = scanner.nextInt();

        for(int i=0;i<numberOfTests;i++){
            this.world = new World();
            //cities
            inputCities(scanner);
            //tests
            inputPaths(scanner);

            this.startTests();
        }


    }


    private void startTests(){
        for(String cities: paths){
           /* System.out.println("TEST "+ cities);
            System.out.println(cities.substring(0, cities.indexOf(" ")));
            System.out.println(cities.substring(cities.indexOf(" ")+1));*/
            int way= world.shortestWayFromTo(
                    world.findByName(cities.substring(0, cities.indexOf(" "))),
                    world.findByName(cities.substring(cities.indexOf(" ")+1)));
            System.out.println(way);
        }
    }
}
