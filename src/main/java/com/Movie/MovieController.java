package com.Movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/movies")
public class MovieController {

	private final MovieService movieService;
	
	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping
	public List<Movie> getMovies(){
		return movieService.getMovies();
	}

	@PostMapping
	public Map storeMovie(@RequestBody Movie movieRequest){
		Map returnMap = new HashMap();
		returnMap = movieService.saveMovie(movieRequest);
		return returnMap;
	}
}
