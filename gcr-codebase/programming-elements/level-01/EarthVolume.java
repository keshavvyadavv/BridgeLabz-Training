// Create EarthVolume Class to compute the volume of earth
public class EarthVolume {
    public static void main(String[] args) {
		// Create variable radiusKm for Radius of Earth in kilometers 
        double radiusKm = 6378.0; 
		
		// Create a variable kmToMiles for conversion
        double kmToMiles = 0.621371; 
		
		// Create variable radiusMiles for Radius of Earth in miles
        double radiusMiles = radiusKm * kmToMiles;
		
		// Create variable volumeKm3 for calculate volume in kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
		// Create variable volumeMiles3 for calculate volume in miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
		
		// Print volume of earth in kilometer and in mile
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3 + " in java");
    }
}
