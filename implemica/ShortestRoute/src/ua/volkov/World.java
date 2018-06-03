package ua.volkov;

import java.util.ArrayList;
import java.util.List;


public class World {

    private List<City> cities = new ArrayList<City>();
    private int [][] worldMap;

    /**
     * Adds new city to the world
     * @param city - new city to adding
     */
    public void addCity(City city){
        cities.add(city);
    }

    /**
     * Finds City by his id
     * @param id city id
     * @return City or null if city does not exist
     */
    public City findById(int id){
        for(City c: cities)
            if(c.getId() == id)
                return c;

        return null;
    }

    /**
            * Finds City by his name
     * @param name city name
     * @return City or null if city does not exist
     */
    public City findByName(String name){
        for(City c: cities)
            if(c.getName().contains(name) || name.contains(c.getName()))
                return c;

        return null;
    }

    /**
     * calculates the best way from one city to another
     * @param source - start city
     * @param destination - end city
     * @return integer - the best way
     */
    public int shortestWayFromTo(City source , City destination){
        configureWorldMap();
        return Graph.shortestRoute(worldMap, source.getId()-1, destination.getId()-1);
    }

    //converts wold to a graph array
    private void configureWorldMap(){
        int [][]worldMap = new int[cities.size()][cities.size()];
        for(int i=0;i<cities.size();i++)
           worldMap[i]=
                   this.getCityNeighborsMap(this.findById(i+1));

        this.worldMap = worldMap;
    }

    //converts city to the vertex array
    private int[] getCityNeighborsMap(City city){
        int [] cityMap = new int[cities.size()];
        for(int i=0; i<cityMap.length; i++){ //set all elements to -1 (path doesnt exist)
            cityMap[i] = -1;
        }
        cityMap[city.getId()-1]=0; // set city path to himself to 1

        for(int[] route: city.getRoutes()){ // set all routes to the map
            cityMap[route[0]-1] = route[1];
        }

        return cityMap;
    }

}
