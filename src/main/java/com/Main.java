package com;

import com.Movie.Movie;
import com.Movie.MovieRepository;
import com.Movie.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Movie PlaneMovie = new Movie(
                "Plane",
                "A pilot finds himself caught in a war zone after he's forced to land his commercial aircraft during a terrible storm.",
                "Brodie Torrance saves his passengers from a lightning strike by making a risky landing on a war-torn island - only to find that surviving the landing was just the beginning. When most of the passengers are taken hostage by dangerous rebels, the only person Torrance can count on for help is Louis Gaspare, an accused murderer who was being transported by the FBI. In order to rescue the passengers, Torrance will need Gaspare's help, and will learn there's more to Gaspare than meets the eye.",
                "https://www.youtube.com/watch?v=M25zXBIUVr0",
                "https://drive.google.com/file/d/1wX_lNgFTmZnjylFNwfuwbuhqps0Q5RV1/view?usp=share_link",
                "Gerard Butler, Mike Colter, Tony Goldwyn, Evan Dane Taylor",
                "Action, Adventure, Thriller", LocalDate.of(2023, Month.JANUARY, 30),
                "1h 47m 28s",
                0
        );

    }
}
