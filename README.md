 Address Lookup Application BlackListed 

This Spring Boot application provides an address lookup feature based on a given postcode.
A new enhancement was implemented to handle blacklisted postcodes, where deliveries cannot be made due to poor road conditions.

 Feature Implemented (Task 1):-

Introduced BlackListService to identify and manage blacklisted postcodes.Modified the address lookup flow to make blacklist filtering configurable per request.
When a request is made with filteredBlackList = true, and the given postcode is blacklisted, the service returns an empty list ([]).
If filteredBlackList = false, all addresses are returned even if the postcode is blacklisted.

The user sends a POST request to /lookUp with a JSON body:

{
  "postcode": "ABC209",
  "filteredBlackList": true
}


The controller checks if filtering is enabled and whether the postcode is blacklisted.
Based on the flag:
true → Filters blacklisted postcodes → returns []
false → Returns all addresses (ignores blacklist)

Addresses are retrieved from a mock data source in AddressServiceImpl.example responses :-
Postcode	filteredBlackList	Result
ABC209 (blacklisted)	true	[]
ABC209 (blacklisted)	false	[ prints all the addresses]
HYD500 (normal)	true/false	[ prints the all addresses]

Tech Stack
Java 17
Spring Boot
Maven -build
PostMan-test

REST API (JSON)

Maven
