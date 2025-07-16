# TCS IPA Java Programming Questions

## Question 1: Anagrams

Given two strings `s` and `t`, give a boolean answer (`true` or `false`) wether `s` is an anagram of `t`.

## [Answer](_1_anagrams.java)

## Question 2: TravelAgencies

Create a class named TravelAgencies with the following attributes:
- regNo (int)
- agencyName (String)
- packageType (String)
- price (int)
- flightFacility (boolean)

Requirements:
- Create a constructor to initialize all attributes in the above order.
- Write getter and setter methods for each attribute.

Create another class called Solution with the main method.

Implement the following two static methods in the Solution class:

1. findAgencyWithHighestPackagePrice
   - Input: Array of TravelAgencies objects
   - Output: Returns the highest price among all objects

2. agencyDetailsForGivenIdAndType
   - Input: Array of TravelAgencies objects, int regNo, String packageType
   - Output: Returns the matching TravelAgencies object if:
     * flightFacility is true
     * regNo and packageType match (case-insensitive)
   - If conditions are not met, return null

## [Answer](_2_TravelAgencies.java)