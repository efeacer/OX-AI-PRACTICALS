package tour;

import java.util.*;

public class City {
	protected final String name;
	protected final Set<Road> outgoingRoads;
	protected final Map<City,Integer> shortestDistanceByCity;

	public City(String name) {
		this.name = name;
		this.outgoingRoads = new LinkedHashSet<>();
		this.shortestDistanceByCity = new LinkedHashMap<>();
       	}
	public String getName() {
		return name;
	}
	public Set<Road> getOutgoingRoads() {
		return outgoingRoads;
	}
	public int getShortestDistanceTo(City city) {
		Integer distance = shortestDistanceByCity.get(city);
		if (distance == null)
			return Integer.MAX_VALUE;
		else
			return distance.intValue();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		City city = (City) o;
		return Objects.equals(name, city.name) &&
				Objects.equals(outgoingRoads, city.outgoingRoads) &&
				Objects.equals(shortestDistanceByCity, city.shortestDistanceByCity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, outgoingRoads, shortestDistanceByCity);
	}
}
