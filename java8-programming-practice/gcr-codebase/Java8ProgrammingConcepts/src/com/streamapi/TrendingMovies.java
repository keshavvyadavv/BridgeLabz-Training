package com.streamapi;

import java.util.*;

public class TrendingMovies {
	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			    new Movie("Inception", 2010, 8.8),
			    new Movie("Avengers: Endgame", 2019, 8.4),
			    new Movie("The Dark Knight", 2008, 9.0),
			    new Movie("Interstellar", 2014, 8.6),
			    new Movie("Parasite", 2019, 8.6),
			    new Movie("Joker", 2019, 8.5),
			    new Movie("Dune", 2021, 8.1),
			    new Movie("Oppenheimer", 2023, 8.9),
			    new Movie("Spider-Man: No Way Home", 2021, 8.3),
			    new Movie("Top Gun: Maverick", 2022, 8.4),
			    new Movie("Everything Everywhere All At Once", 2022, 8.2),
			    new Movie("The Batman", 2022, 7.9)
			);

		movies.stream()
				.filter(m -> m.getReleaseYear() >= 2019)
				.sorted(Comparator.comparingDouble(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear, Comparator.reverseOrder()))
				.limit(5)
				.forEach(m -> System.out.println(
			              m.getName() + " | " + m.getReleaseYear() + " | " + m.getRating()
					      ));;
	}
}
