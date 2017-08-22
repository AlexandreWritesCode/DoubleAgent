## Objective
You are a part of a spy agency of 150 agents with a code name, age, gender and location. You have been tasked to visualize these agents geographically on a world map. A CSV file contains all of the agent's data, interpreted by Java and visualized via web.
## How to Run
View the final product at https://alexandrewritescode.github.io/DoubleAgent/. Alternatively, run the web application by saving the contents of the project and launching 'index.html' in browser. Import the project into an IDE of your choice to view how Java is used. If you want to run a different CSV, you will have to change the final string value in the Parser class.
## Lessons Learned
- JavaScript refresher (still consider myself a beginner)
- Using Mapbox API (JavaScript)
- Learning how to use JQuery (little prior knowledge)
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
Males are color coded red, females are blue. Final strings and integers hard coded in Java to allow ease of change. No encryption was used so my code could be easily viewable despite best practices. Classes are written with a strong separation of concerns!
