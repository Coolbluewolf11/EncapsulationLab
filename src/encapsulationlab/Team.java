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
public class Team {
    private String[] members;

    public Team(String[] team) {
        this.members = team;
    }

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    @Override
    public String toString() {
        String a;
        a = members[0];
        for(int i=1; i<(members.length - 1);i++){
            a+= ", " + members[i];
        }
        a+= ", and " + members[members.length];
        return a;
    }
}
