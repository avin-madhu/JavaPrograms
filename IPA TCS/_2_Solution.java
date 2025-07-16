import java.util.Scanner;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    // Constructor
    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    // Getters
    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    // Setters
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

public class _2_Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] agencies = new TravelAgencies[4];

        // Input data
        for (int i = 0; i < agencies.length; i++) {
            int regNo = Integer.parseInt(sc.nextLine());
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            boolean flightFacility = Boolean.parseBoolean(sc.nextLine());

            agencies[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }

        int highestPrice = findAgencyWithHighestPackagePrice(agencies);
        System.out.println(highestPrice);

        int inputRegNo = Integer.parseInt(sc.nextLine());
        String inputPackageType = sc.nextLine();

        TravelAgencies result = agencyDetailsForGivenIdAndType(agencies, inputRegNo, inputPackageType);
        if (result != null) {
            System.out.println(result.getRegNo());
            System.out.println(result.getAgencyName());
            System.out.println(result.getPrice());
        } else {
            System.out.println("No matching agency found");
        }

        sc.close();
    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int max = 0;
        for (TravelAgencies agency : agencies) {
            if (agency.getPrice() > max) {
                max = agency.getPrice();
            }
        }
        return max;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
        for (TravelAgencies agency : agencies) {
            if (agency.isFlightFacility() &&
                agency.getRegNo() == regNo &&
                agency.getPackageType().equalsIgnoreCase(packageType)) {
                return agency;
            }
        }
        return null;
    }
}
