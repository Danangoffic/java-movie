package com.Movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	private final MovieRepository movieRepository;
	
	@Autowired
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	public List<Movie> getMovies(){
		return movieRepository.findAll();
	}

	public Map saveMovie(Movie movie){
		Map serviceMap = new HashMap();
		if(movieRepository.findMovieByTitle(movie.getTitle()).isPresent()){
			serviceMap.put("status", 400);
			serviceMap.put("message", "Title is Existed");
		}
		movieRepository.save(movie);
		serviceMap.put("status", 200);
		serviceMap.put("message", "success");
		serviceMap.put("movie", movie);
		return serviceMap;
	}
}
