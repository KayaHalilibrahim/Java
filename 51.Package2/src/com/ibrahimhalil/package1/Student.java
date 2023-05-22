
package com.ibrahimhalil.package1;

import com.ibrahimhalil.package2.CandidateStudent;  


public class Student implements CandidateStudent{
    
    @Override
    public void study(){
        System.out.println("I am studying...");
    }
    
}
