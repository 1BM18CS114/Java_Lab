// Create a package CIE which has two classes- Student and Internals. 
// The class Student has members like usn, name, sem. 
// The class Internals has an array that stores the internal marks scored 
// in five courses of the current semester of the student. 
// Create another package SEE which has the class External which is a derived class of Internals. 
// This class has an array that stores the SEE marks scored in 
// five courses of the current semester of the student. 
// Import the two packages in a file that declares the final marks of n students in all five courses.

import java.util.*;
import cie.*;
import see.*;

class Main{
    public static void main(String[] args) {
        External list[] = new External[2];
        for(int i = 0; i < 2; i++){
            list[i] = new External();
            list[i].getdata();
            list[i].putdata();
        }
    }
}

