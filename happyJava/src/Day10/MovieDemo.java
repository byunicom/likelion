package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class RatingComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o2.getRating(),o1.getRating());

    }
}

public class MovieDemo {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("get out",2017,4.3));
        movies.add(new Movie("라라랜드",2016,4.0));
        movies.add(new Movie("The Dark Knight",2008,4.1));

        //title 기준 정렬을 하고 싶다.
        Collections.sort(movies);
        System.out.println("Sorted by title:");
        for(Movie movie:movies){
            System.out.println(movie);
        }

        System.out.println("--------------------");

        //평점기준 정렬을 하고 싶다.
        Collections.sort(movies, new RatingComparator());
        System.out.println("Sorted by rating:");
        for(Movie movie:movies){
            System.out.println(movie);
        }

        //평점기준 정렬2
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Double.compare(o2.getRating(),o1.getRating());
            }
        });
        System.out.println("Sorted by rating2:");
        for(Movie movie:movies){
            System.out.println(movie);
        }

        //출시연도 기준 정렬
        System.out.println("Sorted by release Year:");
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Double.compare(o1.getReleaseYear(),o2.getReleaseYear());
            }
        });
        for(Movie movie:movies){
            System.out.println(movie);
        }

    }
}
