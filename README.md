## Objective
As a counter-intelligence agency, we have found the locations of 150 double-agent spies. The problem is, we need a way to visualize them on a map. Your mission (if you are willing to accept it) is to visualize this data on a map for each of the double-agents.  This interface will be used by our team to assist in removing these double-agents. 
## How to Run
View the web application by saving the contents of the project and launching 'index.html' in browser. Import the project into an IDE of your choice to view how Java reads the CSV file of agents, parses file entries into Agent objects, and then  writes those objects to a Javascript/ HTML file for the web. If you want to run a different CSV, you will have to change the final string value in the Parser class.
## Lessons Learned
- Javascript refresher (still consider myself a beginner)
- Using Mapbox API (JS)
- Reading a CSV file and using the split function
## Architecture 
#### Model
- Agent: objects that store information about agent's name, latitude, longitude, age and gender; getter methods
- Database: static object that stores all agents; add and getter method
- Gender: enum MALE or FEMALE
#### View
- Draw: writes index.html JavaScript file using PrintWriter; handles using Mapbox API for geographical view
#### Controller
- Main
- Parser: Parses CSV file
- ParserTest: showing I can do test cases; two boundary cases for first and last objects
## Hightlights
- Males are color coded red, females are blue. Final strings and integers hard coded in Java to allow ease of change. No encryption was used so my code could be easily viewable despite best practices Classes are written with a strong separation of concerns!
