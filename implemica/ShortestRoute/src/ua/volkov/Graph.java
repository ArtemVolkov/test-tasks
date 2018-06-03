package ua.volkov;

/**
 * Class provides standard graph algorithm
 */
public class Graph {

    /**
     * Computes shortest way from one vertex to another by dijkstra algorithm
     * @param map graph array
     * @param startId start vertex
     * @param finishId finish vertex
     * @return shortest way from start vertext to finish vertex
     */
    public static int shortestRoute(int [][]map, int startId, int finishId){
        final int INF = Integer.MAX_VALUE;
        boolean[] visited = new boolean[map.length];
        int []dist = new int[map.length];

        fill(dist, INF);

        dist[startId]=0;

        //dijkstra
        while(true){
            int currentV=-1;
            for(int newV=0; newV<map.length; newV++)
                if(!visited[newV] && dist[newV]<INF && (currentV == -1 || dist[currentV] > dist[newV]))
                    currentV=newV;
            if(currentV == -1) break;
            visited[currentV]= true;

            for(int newV=0; newV<map.length; newV++)
                if(!visited[newV] && map[currentV][newV]>=0)
                    dist[newV]= Integer.min(dist[newV], dist[currentV] + map[currentV][newV]);
            if(currentV == finishId) return dist[currentV];
        }

        return dist[finishId];
    }

     private static void fill(int[] array, int value){
        for(int i=0; i<array.length; i++){
            array[i]=value;
        }
    }

}
