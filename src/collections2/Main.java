package collections2;
import java.io.*;

import java.util.*;

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	public int compareTo(Movie m)
	{
		return this.year-m.year;
	}
public Movie(String nm,double rt,int yr)
{
	this.name=nm;
	this.rating=rt;
	this.year=yr;
}
public double getRating()
{
	return rating;
}
public String getName()
{
	return name;
}
public int getYear()
{
	return year;
}


}

public class Main
{

	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("Force AWakens",8.3,2015));
		list.add(new Movie("Star Wars",8.7,1977));
		Collections.sort(list);
		System.out.println("Movies after sorting");
		for(Movie movie:list)
		{
			System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
		}

	}

}
