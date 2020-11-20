# AP Computer Science 2020-2021 Projects
This is a repository (essentially an online storage like Google Drive) that hosts the code for projects and assignments. It's connected to my computer so as I finish projects they'll be uploaded here, you can see when it was last modified on the right side of the file.

## Ground Rules
 - Let me know before you share this repository, I don't need to know who you're sharing it to, just let me know that you are. 

 - If you are planning to use my code make a few changes to variable names, method names, or logic (where applicable) for obvious reasons.
 
 - If you have questions about my code let me know. I try to explain my logic through comments and if it's not clear I'll work towards making it more understandable.

 ## Naming Procedures
 ### File Naming
 - As of Unit 5 projects should be named (ProjectName)Project.java
 
 - Some projects are named as (ProjectName)ProjectSimple.java or (ProjectName)ProjectComplex.java. While it should be self-explanatory the complex files are where I have found a shorter and faster way to acomplish the goal using methods/functions that haven't or will not be taught in this class.

 ### Variable/Method Naming
 - Generally I follow [Oracle's Naming Convention](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html) for projects. However, I do primarly program in Python and so I may naturally lean over into [PEP 8](https://www.python.org/dev/peps/pep-0008/) styling. Both are fairly similar so it shouldn't be too obvious.

 - Functions/Methods will be arranged with same line opening bracket rather than Mr. Swanson's preference of seperate line opening bracket.
    - ```java
        public static void main(String args[]){
            // This is how I do it, because it's just nicer.
            if (x == y){
                // Code
            }
            else{
                // Code
            }
        }
        ```
    - ```java
        public static void main(String args[])
        {
            // This is how Swanson does it. Room for error
            if (x == y)
                // Code
            else
                // Code
        }
        ```
- Variables will be named in Camel Case and Constants will be fully capitalized.
    - ```java
        // CamelCase
        int VariableName = 5;
        ```
    - ```java
        //Constants
        final int VARIABLENAME = 5;
        ```

*Last updated 11/19/2020 9:08 PM CDT*