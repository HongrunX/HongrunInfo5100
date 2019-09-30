package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.transform.Templates;

//Note:
//1.Complete All Questions
//2.Deadline : 30th September 2019, 12:00pm
//
//Q1. Write a Java class named 'Course'
//It should have following members
//courseId
//courseName
//maxCapacity
//professorId
//credits
//int[] studentIds
//
//Function: registerStudent(int studentId)
//
//There should be 3 ways to create Course Object (Hint : Use Constructor)
//courseId
//courseId, professorId
//courseId, professorId, credits
//
//Class should provide getters/setters for all members
//registerStudent method should store all ids in studentIds array.

//------

//Q2. In the above example, add following validations to setters/constructors
//courseId - should not be negative or 0
//courseName- should be a string with minimum length 10 and maximum 60
//maxCapacity - should not be less than 10 greater than 100
//professorId - should be a six digit integer
//credits - should be a single digit but greater than 0
//
public class Assignment3{
	public static void main(String[] args) {
		
	}
}
class Course{
	private int courseId;
	private String courseName;
	private int maxCapacity;
	private int professorId;
	private int credits;
	private int[] studentIds;
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		if (courseId>0)
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		if(courseName.length()>=10&&courseName.length()<=60)
		this.courseName = courseName;
	}

	public int getMaxCapacity() {
		if(maxCapacity>=10&&maxCapacity<=100)
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		int count=0;
		while(professorId>=1){
			professorId/=10;
			count++;
		}
		if (count=6)
		this.professorId = professorId;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		if(credits>0&&credits<10)
		this.credits = credits;
	}

	public int[] getStudentIds() {
		return studentIds;
	}

	public void setStudentIds(int[] studentIds) {
		this.studentIds = studentIds;
	}
	public void registerStudent(int studentId,int courseId){
		
	}
	public void registerStudent(int studentId,int courseId, int credits){
		
	}
	public void registerStudent(int studentId){
	
	}
}
//------
//
//Q3. Add a function called removeDuplicates in Course class
//This function should be called if course has reached the maximum capacity and
//remove all duplicate student Ids and return the new ids
//
//Ex: Input :[1,6,2,3,2,4,5,6]
//Output: [1,6,2,3,4,5]

public int[] removeDuplicates(int[] studentIds) {
	int j=0;
	for(int i=0;i<99;i++){
		if(studentIds[i]!=studentIds[i+1]){
			studentIds[j++]=studentIds[i];
		}
	}
	studentIds[j++]=studentIds[99];
}

//------
//
//Q4. Implement the following method in Course class.
//
public int groupsOfStudents(int[] studentIds) {
	int odd =0, even =0;
	
	for(int i=0;i<studentIds.length;i++){
		if(studentIds[i]%2 == 1){
			odd++;
		}else{
			even++;
		}
	}
	int pairs= odd*(odd-1)/2+even*(even-1);
	return pairs;
}
//
//The above method takes an array of studentIds as an argument. Find number of pairs of studentsIds whose sum is even
//Example:
//Input : [1,2,3,4,5,6]
//Output : 6
//Explanation: (1 + 3), (1 + 5), (3 + 5), (2 + 4), (2 + 6), (4 + 6)
//
//------

//Q5.
//The count-and-say sequence is a sequence of integers with the first five terms as following:
//
//1. 1
//2. 11
//3. 21
//4. 1211
//5. 111221
//
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
//Note: Each term of the sequence of integers will be represented as a string.
//
//Example 1:
//Input: 1
//Output: "1"
//
//Example 2:
//Input: 4
//Output: "1211"
public String countAndSay(int n) {
	StringBuilder s1=new StringBuilder("1");
    StringBuilder s2=new StringBuilder("");
    for(int i=0;i<n;i++)
    {
        int j=0;
        int len=s1.length();
        while(j<len)
        {
            int count=1;
            char c= s1.charAt(j);
            while(j<len-1&&s1.charAt(j)==s1.charAt(j+1))
            {
                count++;
                j++;
            }
            s2.append(count+"");
            s2.append(c);
            if(j==len-1)
            {
                break;
            }
            j++;
        }
        s1=s2;
        s2=new StringBuilder();
    }
    return s1.toString();
}

//------
//
//Q6. Given an input string , reverse the string word by word.
//Example:
//Input : “the sky is blue”
//Output : “blue is sky the”
//Assumptions:
//A word is defined as a sequence of non-space characters.
//The input string does not contain leading or trailing spaces.
//The words are always separated by a single space.
//
//------
public String reverseWords(String s){
	if(s.equals("")){
		return "";
	}
	String[] strArr = s.split("\\s{1,}");
	int len = strArr.length;
	if (len == 0) {
		return "";
	}
	StringBuilder sb = new StringBuilder("");

	for (int i = len - 1; i >= 0; i--) {
		if (!strArr[i].equals("")) {
			sb.append(strArr[i]);
			sb.append(" ");
		}
	}
	sb.deleteCharAt(sb.lastIndexOf(" "));
	return sb.toString();
}	

//Q7.
//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//Example 1:
//Input:
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//Output: [1,2,3,6,9,8,7,4,5]
//
//Example 2:
//Input:
//[
//  [1, 2, 3, 4],
//  [5, 6, 7, 8],
//  [9,10,11,12]
//]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]

public List<Integer> spiralOrder(int[][] matrix) {
	List<Integer> list = new ArrayList<>();
	
	if(null==matrix||matrix.length==0){
		return list;
	}
	int rowUp=0;
	int rowDown = matrix.length-1;
	int colLeft=0;
	int colRight= matrix[0].length-1;
	while(rowUp<=rowDown&&colLeft<=colRight){
		for(int i = colLeft; i<=colRight;i++){
			list.add(matrix[rowUp][i]);
		}
		rowUp++;
		for(int i=rowUp; i<=rowDown;i++){
			list.add(matrix[i][colRight]);
		}
		colRight--;
		if(rowUp>rowDown|| colLeft>colRight)
			break;
		for(int i = colRight; i>=colLeft;i--){
			list.add(matrix[rowDown][i]);
		}
		rowDown--;
		for(int i= rowDown;i>=rowUp;i--){
			list.add(matrix[i][colLeft]);
		}
		colLeft++;
	}
	return list;
}

//------
//
//Q8.
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//String convert(string s, int numRows);
//Example 1:
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//
//Example 2:
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//
//------

public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) 
                sb[idx].append(c[i++]);
            for (int idx = numRows-2; idx >= 1 && i < len; idx--) 
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
}
//Q9. Explain Encapsulation with an example. (Write at least 30-40 words).
 Encapsulation is a process of wrapping code and data together into a single unit. For example, for a student, he has a name. The data is private and has getter and setter methods.We can make the class read-only or write-only. The data name can be hidden. It is easy to test.
//------

//Q10. What is the difference between Encapsulation and Abstraction
Abstraction hides details at the design level, while Encapsulation hides details at the implementation level.
