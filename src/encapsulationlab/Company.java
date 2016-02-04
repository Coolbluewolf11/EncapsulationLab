/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationlab;

/**
 *
 * @author Tim
 */
public class Company {
    private String[] employees;
    
    public Company() {
        employees[0]="Jim";
        employees[1]="Katie";
        employees[2]="Matt";
        employees[3]="George";
        employees[4]="Zach";
        employees[5]="Sarah";
        
    }
    private Team makeTeam(){
        String[] teammembers= new String[3];
        for(int i=0; i<3; i++){
            teammembers[i]= employees[Math.round((float) Math.random())];
        }
        Team group = new Team(teammembers);
        return group;
    }
    public void makeGame(String genre, char rating, char name){
        Team b = makeTeam();
        String a = "Our team (" + b + ") is working on " + name + 
                ". It will have a " + rating + " and a be of the genre " + genre
                + " It will come out three days before Half Life 3";
        CompanyReporter c = new CompanyReporter(a);
    }
}
