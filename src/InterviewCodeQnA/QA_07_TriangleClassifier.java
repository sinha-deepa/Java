/*
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal).
Use an if-else statement to classify the triangle.
 */

package InterviewCodeQnA;

public class QA_07_TriangleClassifier {
    public void triangleClassifier(){
        int a = 5, b=4, c=4;
        if(a==b && b==c){
            System.out.println("Triangle is equilateral");
        }else if(a==b || b==c || a==c){
            System.out.println("Triangle is isosceles");
        }else {
            System.out.println("Triangle is scalene");
        }
    }
    public static void main(String[] args){
        QA_07_TriangleClassifier tc = new QA_07_TriangleClassifier();
        tc. triangleClassifier();
    }
}
