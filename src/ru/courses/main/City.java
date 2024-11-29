package ru.courses.main;
import java.util.ArrayList;

public class City {
    String name;
    Path[] path;
    ArrayList<Path> paths;

    public City(String name) {
        this.name = name;
    }

    public City(String name, Path[] path) {
        this.name = name;
        this.path = path;
    }

    public City(String name, ArrayList<Path> paths) {
        this.name = name;
        this.paths = paths;
    }

    public String getStringName() {
        String res = "";
        for (int i = 0; i < path.length; i++) {
            res += path[i].city + ":" + path[i].value;
            res += " ";
        }
        System.out.print(name + ": ");
        return res;
    }

    public void addPathList(Path path) {
        paths.add(path);
    }

    public void addPathList(String city, int value) {
        paths.add(new Path(city, value));
    }
    //метод добавления пути к городу
    public void /*Path[]*/ addPathArr(String city, int value) {
        Path[] res = new Path[path.length + 1];
        int count = 0;
        for (int i = 0; i < path.length; i++) {
            res[i] = path[i];
            count++;
        }
        res[count] = new Path(city, value);
        path = res;
    }

    public void addPathArr(Path path) {
        Path[] res = new Path[this.path.length+1];
        int count = 0;
        for (int i = 0; i < this.path.length; i++){
            res[i]=this.path[i];
            count++;
        }
        res[count]=path;
        this.path=res;
    }
//    public String travelBy(int x) {
//        String res=this;
//        while(x>0){
//            if(path==null||path.length<1) return null;
//            res=
//        }
//    }
    public String journey(int x, City[] cities){
        String city=name;
        while(x>0){
            if(path==null||path.length<1) return null;
            for(int i=0; i<cities.length;i++){
                if(cities[i].name==city){
                    city=cities[i].path[0].city;
                    x--;
                    break;
                }
            }
        }
        return city;
    }
}

class Path {
    String city;
    int value;

    public Path(String city, int value){
        this.city=city;
        this.value=value;
    }
}


