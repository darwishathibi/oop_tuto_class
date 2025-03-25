package com.university;

public class TestStudent {
    public static void main(String[] args) {
        Student st = new Student("Ali", 12345, "KICT", 3.5);

        //call public method
        st.displayPublicStudentInfo();

        //call protected method
        st.displayProtectedStudentInfo();

        //call default method
        st.displayDefaultStudentInfo();

        //call private method
//        st.displayPrivateStudentInfo(); => error

        //call public method that can access private method
        st.showAllInfo();
    }
}
